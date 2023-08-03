package net.mcreator.test.procedures;

 
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.MinecraftForge;
 
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OnInit {
    public OnInit() {
        CustomPacketHandler.addNetworkMessage((int) 6554/* Random number :P */, CustomPacketHandler.TextFieldDataSyncMessage.class,
                CustomPacketHandler.TextFieldDataSyncMessage::buffer, CustomPacketHandler.TextFieldDataSyncMessage::new,
                CustomPacketHandler.TextFieldDataSyncMessage::handler);
        MinecraftForge.EVENT_BUS.register(this);
    }
 
    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        new OnInit();
    }
}
 