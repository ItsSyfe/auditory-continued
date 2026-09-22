package dev.syfe.auditory.sound;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;

public class AuditorySoundGroups extends AuditoryBaseSoundEvents {
    public AuditorySoundGroups() {
        super("groups");
    }
    public static final SoundType ICE = new SoundType(1f, 1f,
            AuditoryBlockSoundEvents.BLOCK_ICE_BREAK, AuditoryBlockSoundEvents.BLOCK_ICE_STEP,
            AuditoryBlockSoundEvents.BLOCK_ICE_PLACE, AuditoryBlockSoundEvents.BLOCK_ICE_HIT,
            AuditoryBlockSoundEvents.BLOCK_ICE_FALL);

    public static final SoundType GOURD = new SoundType(1f, 1f,
            AuditoryBlockSoundEvents.BLOCK_GOURD_BREAK, AuditoryBlockSoundEvents.BLOCK_GOURD_STEP,
            AuditoryBlockSoundEvents.BLOCK_GOURD_PLACE, AuditoryBlockSoundEvents.BLOCK_GOURD_HIT,
            AuditoryBlockSoundEvents.BLOCK_GOURD_FALL);

    public static final SoundType SHULKER_BOX = new SoundType(1f, 1f,
            AuditoryBlockSoundEvents.BLOCK_SHULKER_BOX_BREAK, AuditoryBlockSoundEvents.BLOCK_SHULKER_BOX_STEP,
            AuditoryBlockSoundEvents.BLOCK_SHULKER_BOX_PLACE, AuditoryBlockSoundEvents.BLOCK_SHULKER_BOX_HIT,
            AuditoryBlockSoundEvents.BLOCK_SHULKER_BOX_FALL);

    public static final SoundType SPAWNER = new SoundType(1f, 1f,
            AuditoryBlockSoundEvents.BLOCK_SPAWNER_BREAK, SoundEvents.NETHERITE_BLOCK_STEP,
            SoundEvents.NETHERITE_BLOCK_PLACE, SoundEvents.NETHERITE_BLOCK_HIT,
            SoundEvents.NETHERITE_BLOCK_FALL);

    public static final SoundType PURPUR = new SoundType(1f, 1f,
            AuditoryBlockSoundEvents.BLOCK_PURPUR_BREAK, AuditoryBlockSoundEvents.BLOCK_PURPUR_STEP,
            AuditoryBlockSoundEvents.BLOCK_PURPUR_PLACE, AuditoryBlockSoundEvents.BLOCK_PURPUR_HIT,
            AuditoryBlockSoundEvents.BLOCK_PURPUR_FALL);

    public static final SoundType CHORUS_PLANT = new SoundType(1f, 1f,
            AuditoryBlockSoundEvents.BLOCK_CHORUS_PLANT_BREAK, AuditoryBlockSoundEvents.BLOCK_CHORUS_PLANT_STEP,
            AuditoryBlockSoundEvents.BLOCK_CHORUS_PLANT_PLACE, AuditoryBlockSoundEvents.BLOCK_CHORUS_PLANT_HIT,
            AuditoryBlockSoundEvents.BLOCK_CHORUS_PLANT_FALL);

    public static final SoundType STONE_ORE = new SoundType(1f, 0.9f,
            SoundEvents.NETHER_ORE_BREAK, SoundEvents.NETHER_ORE_STEP,
            SoundEvents.NETHER_ORE_PLACE, SoundEvents.NETHER_ORE_HIT,
            SoundEvents.NETHER_ORE_FALL);

    public static final SoundType OBSIDIAN = new SoundType(1f, 0.7f,
            SoundEvents.DEEPSLATE_BREAK, SoundEvents.DEEPSLATE_STEP,
            SoundEvents.DEEPSLATE_PLACE, SoundEvents.DEEPSLATE_HIT,
            SoundEvents.DEEPSLATE_FALL);

    public static final SoundType TERRACOTTA = new SoundType(1f, 0.6f,
            SoundEvents.CALCITE_BREAK, SoundEvents.CALCITE_STEP,
            SoundEvents.CALCITE_PLACE, SoundEvents.CALCITE_HIT,
            SoundEvents.CALCITE_FALL);

    public static final SoundType STONE_BRICKS = new SoundType(1f, 0.6f,
            SoundEvents.DEEPSLATE_TILES_BREAK, SoundEvents.DEEPSLATE_TILES_STEP,
            SoundEvents.DEEPSLATE_TILES_PLACE, SoundEvents.DEEPSLATE_TILES_HIT,
            SoundEvents.DEEPSLATE_TILES_FALL);

    public static final SoundType CLAY_BRICKS = new SoundType(1f, 1.3f,
            SoundEvents.NETHER_BRICKS_BREAK, SoundEvents.NETHER_BRICKS_STEP,
            SoundEvents.NETHER_BRICKS_PLACE, SoundEvents.NETHER_BRICKS_HIT,
            SoundEvents.NETHER_BRICKS_FALL);

    public static final SoundType METAL = new SoundType(1f, 1.2f,
            SoundEvents.NETHERITE_BLOCK_BREAK, SoundEvents.NETHERITE_BLOCK_STEP,
            SoundEvents.NETHERITE_BLOCK_PLACE, SoundEvents.NETHERITE_BLOCK_HIT,
            SoundEvents.NETHERITE_BLOCK_FALL);

    public static final SoundType GOLD = new SoundType(1f, 1.6f,
            SoundEvents.NETHERITE_BLOCK_BREAK, SoundEvents.NETHERITE_BLOCK_STEP,
            SoundEvents.NETHERITE_BLOCK_PLACE, SoundEvents.NETHERITE_BLOCK_HIT,
            SoundEvents.NETHERITE_BLOCK_FALL);

    public static final SoundType LILY_PAD = new SoundType(1f, 1f,
            SoundEvents.BIG_DRIPLEAF_BREAK, SoundEvents.BIG_DRIPLEAF_STEP,
            SoundEvents.LILY_PAD_PLACE, SoundEvents.BIG_DRIPLEAF_HIT,
            SoundEvents.BIG_DRIPLEAF_FALL);

    public static final SoundType SMALL_OBJECT = new SoundType(1f, 0.8f,
            SoundEvents.CANDLE_BREAK, SoundEvents.CANDLE_STEP,
            SoundEvents.CANDLE_PLACE, SoundEvents.CANDLE_HIT,
            SoundEvents.CANDLE_FALL);

    public static final SoundType SMALL_POT = new SoundType(1f, 1.3f,
            SoundEvents.DECORATED_POT_BREAK, SoundEvents.DECORATED_POT_STEP,
            SoundEvents.DECORATED_POT_PLACE, SoundEvents.DECORATED_POT_HIT,
            SoundEvents.DECORATED_POT_FALL);
}
