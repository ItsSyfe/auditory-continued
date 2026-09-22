package dev.syfe.auditory.sound;

import static dev.syfe.auditory.AuditoryCommon.LOGGER;

abstract class AuditoryBaseSoundEvents {
    private final String name;

    AuditoryBaseSoundEvents(String name) {
        this.name = name;
        this.registerSounds();
    }

    public void registerSounds() {
        LOGGER.info("Registering sound events for {}", this.name);
    }
}
