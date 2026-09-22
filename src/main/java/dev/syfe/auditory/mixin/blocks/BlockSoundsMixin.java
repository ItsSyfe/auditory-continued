package dev.syfe.auditory.mixin.blocks;


import dev.syfe.auditory.AuditoryCommon;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import dev.syfe.auditory.misc.AuditoryTags;
import dev.syfe.auditory.sound.AuditorySoundGroups;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// Any blocks in the respective tags will use the respective sound group.
// This is entirely data-driven and can be controlled by adding the block's ID to the respective tag through a datapack or mod.

@Mixin(BlockBehaviour.class)
abstract class BlockSoundsMixin {

    @Inject(at = @At("HEAD"), method = "getSoundType", cancellable = true)
    private void auditory_alterSoundType(BlockState state, CallbackInfoReturnable<SoundType> info) {

        if (state.is(AuditoryTags.BASALT_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.overworldStoneVariantSounds)) {
            info.setReturnValue(SoundType.BASALT);
        }
        else if (state.is(AuditoryTags.CLAY_BRICK_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.clayBrickSounds)) {
            info.setReturnValue(AuditorySoundGroups.CLAY_BRICKS);
        }
        else if (state.is(AuditoryTags.DIRT_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.dirtSounds)) {
            info.setReturnValue(SoundType.ROOTED_DIRT);
        }
        else if (state.is(AuditoryTags.GOLD_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.goldSounds)) {
            info.setReturnValue(AuditorySoundGroups.GOLD);
        }
        else if (state.is(AuditoryTags.LEAF_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.leafSounds)) {
            info.setReturnValue(SoundType.AZALEA_LEAVES);
        }
        else if (state.is(AuditoryTags.LILY_PAD_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.lilyPadSounds)) {
            info.setReturnValue(AuditorySoundGroups.LILY_PAD);
        }
        else if (state.is(AuditoryTags.METAL_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.metalSounds)) {
            info.setReturnValue(AuditorySoundGroups.METAL);
        }
        else if (state.is(AuditoryTags.NETHERRACK_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.magmaSounds)) {
            info.setReturnValue(SoundType.NETHERRACK);
        }
        else if (state.is(AuditoryTags.OBSIDIAN_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.obsidianSounds)) {
            info.setReturnValue(AuditorySoundGroups.OBSIDIAN);
        }
        else if (state.is(AuditoryTags.PLANT_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.plantSounds)) {
            info.setReturnValue(SoundType.HANGING_ROOTS);
        }
        else if (state.is(AuditoryTags.RAW_ORE_BLOCK_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.rawOreBlockSounds)) {
            info.setReturnValue(SoundType.NETHER_GOLD_ORE);
        }
        else if (state.is(AuditoryTags.SAND_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.redstoneWireSounds)) {
            info.setReturnValue(SoundType.SAND);
        }
        else if (state.is(AuditoryTags.SHULKER_BOX_SOUNDS) && (!FabricLoader.getInstance().isModLoaded("endlessencore")) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.shulkerBoxSounds)) {
            info.setReturnValue(AuditorySoundGroups.SHULKER_BOX);
        }
        else if (state.is(AuditoryTags.SMALL_OBJECT_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.smallObjectSounds)) {
            info.setReturnValue(AuditorySoundGroups.SMALL_OBJECT);
        }
        else if (state.is(AuditoryTags.SPAWNER_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.spawnerSounds)) {
            info.setReturnValue(AuditorySoundGroups.SPAWNER);
        }
        else if (state.is(AuditoryTags.STONE_BRICK_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.stoneBrickSounds)) {
            info.setReturnValue(AuditorySoundGroups.STONE_BRICKS);
        }
        else if (state.is(AuditoryTags.STONE_ORE_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.stoneOreSounds)) {
            info.setReturnValue(AuditorySoundGroups.STONE_ORE);
        }
        else if (state.is(AuditoryTags.STRING_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.stringSounds)) {
            info.setReturnValue(SoundType.VINE);
        }
        else if (state.is(AuditoryTags.TERRACOTTA_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.terracottaSounds)) {
            info.setReturnValue(AuditorySoundGroups.TERRACOTTA);
        }
        else if (state.is(AuditoryTags.WOOD_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.jukeboxWoodSounds)) {
            info.setReturnValue(SoundType.WOOD);
        }
        else if (state.is(AuditoryTags.MUSHROOM_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.mushroomSounds)) {
            info.setReturnValue(SoundType.WART_BLOCK);
        }
        else if (state.is(AuditoryTags.MUSHROOM_STEM_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.mushroomSounds)) {
            info.setReturnValue(SoundType.STEM);
        }
        else if (state.is(AuditoryTags.PURPUR_SOUNDS) && (!FabricLoader.getInstance().isModLoaded("endlessencore")) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.purpurSounds)) {
            info.setReturnValue(AuditorySoundGroups.PURPUR);
        }
        else if (state.is(AuditoryTags.CHORUS_PLANT_SOUNDS) && (!FabricLoader.getInstance().isModLoaded("endlessencore")) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.chorusPlantSounds)) {
            info.setReturnValue(AuditorySoundGroups.CHORUS_PLANT);
        }
        else if (state.is(AuditoryTags.ICE_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.iceSounds)) {
            info.setReturnValue(AuditorySoundGroups.ICE);
        }
        else if (state.is(AuditoryTags.GOURD_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.gourdSounds)) {
            info.setReturnValue(AuditorySoundGroups.GOURD);
        }
        else if (state.is(AuditoryTags.POT_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.pot_sounds)) {
            info.setReturnValue(AuditorySoundGroups.SMALL_POT);
        }
        else if (state.is(AuditoryTags.BOOKSHELF_SOUNDS) && (AuditoryCommon.getConfig().block_sounds.blockSoundsConfig.bookshelf_sounds)) {
            info.setReturnValue(SoundType.CHISELED_BOOKSHELF);
        }
    }
}