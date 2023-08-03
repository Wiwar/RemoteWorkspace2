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

import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.common.MinecraftForge;
 
import net.minecraft.network.PacketBuffer;
import net.minecraft.entity.player.ServerPlayerEntity;
 
import net.mcreator.test.MushokuMod; 
import net.mcreator.test.MushokuModVariables;
 
import java.util.function.Supplier;
import java.util.function.BiConsumer;
import java.util.function.Function;
 
 
public class CustomPacketHandler {
    public CustomPacketHandler() {
    }
 
    public static <T> void addNetworkMessage(int id, Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
            BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        MushokuMod.PACKET_HANDLER.registerMessage(id, messageType, encoder, decoder, messageConsumer);
    }
 
 
    public static class TextFieldDataSyncMessage {
        public String data;
        public TextFieldDataSyncMessage(PacketBuffer buffer) {
            this.data = "";
            this.data = (buffer.readString());
        }
 
        public TextFieldDataSyncMessage(String data) {
            this.data = data;
        }
 
        public static void buffer(TextFieldDataSyncMessage message, PacketBuffer buffer) {
            buffer.writeString(message.data);
        }
 
        public static void handler(TextFieldDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
            NetworkEvent.Context context = contextSupplier.get();
            context.enqueueWork(new Runnable() {
                @Override
                public void run() {
                    if (context.getDirection().getReceptionSide().isServer()) {
                        ServerPlayerEntity sender = context.getSender();
                        if (sender != null) {
                            String _setval = (String) message.data;
                            MushokuModVariables.tmpInputList.add(sender.getUniqueID().toString());  // here i'm adding the player uuid to an ArrayList global variable (added with a plugin)
                            MushokuModVariables.tmpInputList.add(_setval);  // here i'm adding to the same list the content of the packet send to server, here it's the TextField content.
                        }
                    }
                }
            });
            context.setPacketHandled(true);
        }
    }
}
 
