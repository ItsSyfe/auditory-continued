package dev.syfe.auditory;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import dev.syfe.auditory.misc.config.ModConfig;
import dev.syfe.auditory.sound.ModSoundEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Auditory implements ModInitializer {
	public static final String MOD_ID = /*$ mod_id*/ "auditory";
	public static final String VERSION = /*$ mod_version*/ "2.0.0";
	public static final String MINECRAFT = /*$ minecraft*/ "1.21.1";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	private static final ModConfig CONFIG = AutoConfig.register(ModConfig.class, GsonConfigSerializer::new).getConfig();

	@Override
	public void onInitialize() {

		// Registry:

		ModSoundEvents.registerSounds();

		LOGGER.info("Initialised");
	}

	public static ModConfig getConfig () {
		return CONFIG;
	}
}