package dev.syfe.auditory;

import dev.syfe.auditory.sound.AuditoryBlockSoundEvents;
import dev.syfe.auditory.sound.AuditoryItemSoundEvents;
import dev.syfe.auditory.sound.AuditoryMiscSoundEvents;
import dev.syfe.auditory.sound.AuditorySoundGroups;
import net.fabricmc.api.ModInitializer;

import static dev.syfe.auditory.AuditoryCommon.*;

public class AuditoryFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		new AuditoryItemSoundEvents();
		new AuditoryBlockSoundEvents();
		new AuditoryMiscSoundEvents();
		new AuditorySoundGroups();

		LOGGER.info("Initialised");
	}
}