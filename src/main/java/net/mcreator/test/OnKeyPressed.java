/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.mcreator.test as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package net.mcreator.test;

 
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
 
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerEntity;
 
import net.mcreator.test.gui.ChantGUIGuiWindow;
import net.mcreator.test.CustomPacketHandler;
//import net.mcreator.test.YourMod;
 
 
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OnKeyPressed {
    public OnKeyPressed() {
    }
 
    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        new OnKeyPressed();
    }
    @Mod.EventBusSubscriber
    private static class ForgeBusEvents {
        @OnlyIn(Dist.CLIENT)
        @SubscribeEvent
        public static void keyPressed(InputEvent.KeyInputEvent e) {
            if (Minecraft.getInstance().currentScreen != null) {
                        if (Minecraft.getInstance().currentScreen instanceof ChantGUIGuiWindow) {
                            if (Minecraft.getInstance().currentScreen != null) {
                                ChantGUIGuiWindow win = (ChantGUIGuiWindow)((ContainerScreen)Minecraft.getInstance().currentScreen);
                                String tmpText = (String) (new Object() {
                                    public String getText() {
                                        TextFieldWidget _tf = (TextFieldWidget) win.Number;
                                        if (_tf != null) {
                                            return _tf.getText();
                                        }
                                    return "";
                                    }
                                }.getText());
                                YourMod.PACKET_HANDLER.sendToServer(new CustomPacketHandler.TextFieldDataSyncMessage(tmpText));
                        }
                    }
                }
            }
 
        @OnlyIn(Dist.CLIENT)
        @SubscribeEvent
        public static void onClick(InputEvent.MouseInputEvent e) {
            if (Minecraft.getInstance().currentScreen != null) {
                    if (Minecraft.getInstance().currentScreen instanceof ChantGUIGuiWindow) {
                        if (Minecraft.getInstance().currentScreen != null) {
                            ChantGUIGuiWindow win = (ChantGUIGuiWindow)((ContainerScreen)Minecraft.getInstance().currentScreen);
                            String tmpText = (String) (new Object() {
                                public String getText() {
                                    TextFieldWidget _tf = (TextFieldWidget) win.Number;
                                    if (_tf != null) {
                                        return _tf.getText();
                                    }
                                return "";
                                }
                            }.getText());
                            YourMod.PACKET_HANDLER.sendToServer(new CustomPacketHandler.TextFieldDataSyncMessage(tmpText));
                        }
                    }
                }
            }
        }
    }
 
