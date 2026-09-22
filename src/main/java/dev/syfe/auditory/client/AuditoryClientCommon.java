package dev.syfe.auditory.client;

import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public class AuditoryClientCommon {
    public static final KeyMapping reloadKey = new KeyMapping("auditory.sound_reload_key", GLFW.GLFW_KEY_UNKNOWN, "auditory.category");
}