package dev.syfe.auditory.client;

import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public class AuditoryClient {

    // Keybindings:

    private static final KeyMapping reloadKey;

    static {
        reloadKey = new KeyMapping("auditory.sound_reload_key", GLFW.GLFW_KEY_UNKNOWN, "auditory.category");
    }
}