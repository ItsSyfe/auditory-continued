package dev.syfe.auditory.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

import static dev.syfe.auditory.client.AuditoryClientCommon.*;

public class AuditoryClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        KeyBindingHelper.registerKeyBinding(reloadKey);
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (reloadKey.isDown()) {
                assert client.player != null;
                Minecraft.getInstance().getSoundManager().reload();
                Minecraft mc = Minecraft.getInstance();
                mc.gui.getChat().addMessage(Component.translatable("auditory.sound_reload_message"));
            }
        });
    }
}
