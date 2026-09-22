package dev.syfe.auditory.sound;

import dev.syfe.auditory.platform.ModLoaderAccess;
import net.minecraft.sounds.SoundEvent;

public class AuditoryMiscSoundEvents extends AuditoryBaseSoundEvents {
    public AuditoryMiscSoundEvents() {
        super("Misc");
    }
    public static final SoundEvent ENTITY_PLAYER_EMPTY_HAND_SWING = ModLoaderAccess.INSTANCE.registerSoundEventFromId("entity.player.empty_hand_swing");
    public static final SoundEvent ENTITY_PLAYER_DROP_ITEM = ModLoaderAccess.INSTANCE.registerSoundEventFromId("entity.player.drop_item");
    public static final SoundEvent BLOCK_JUKEBOX_USE = ModLoaderAccess.INSTANCE.registerSoundEventFromId("block.jukebox.use");
    public static final SoundEvent BLOCK_JUKEBOX_EJECT = ModLoaderAccess.INSTANCE.registerSoundEventFromId("block.jukebox.eject");
}
