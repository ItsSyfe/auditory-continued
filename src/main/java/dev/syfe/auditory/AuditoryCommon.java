package dev.syfe.auditory;

import dev.syfe.auditory.misc.config.ModConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuditoryCommon {

    public static final String MOD_ID = /*$ mod_id*/ "auditory";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final String VERSION = /*$ mod_version*/ "2.0.0";
    public static final String MINECRAFT = /*$ minecraft*/ "1.21.1";
    private static final ModConfig CONFIG = AutoConfig.register(ModConfig.class, GsonConfigSerializer::new).getConfig();

    public static ModConfig getConfig () {
        return CONFIG;
    }
}
