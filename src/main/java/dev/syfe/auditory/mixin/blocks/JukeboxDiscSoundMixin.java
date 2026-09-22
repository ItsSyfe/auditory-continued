package dev.syfe.auditory.mixin.blocks;

import dev.syfe.auditory.AuditoryCommon;
import dev.syfe.auditory.sound.AuditoryMiscSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.JukeboxBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Optional;

// Plays a sound when a disc is inserted or ejected from a jukebox

@Mixin(JukeboxBlockEntity.class)
public abstract class JukeboxDiscSoundMixin extends BlockEntity {

    public JukeboxDiscSoundMixin(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    @Inject(method = "setTheItem",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/world/level/block/entity/JukeboxBlockEntity;notifyItemChangedInJukebox(Z)V",
                    shift = At.Shift.AFTER
            )
    )
    private void auditory_ejectDiscSound(ItemStack itemStack, CallbackInfo ci) {
        if (AuditoryCommon.getConfig().block_sounds.jukebox_sounds) {
            if (this.level != null) {
                this.level.playSound(null, this.getBlockPos(), AuditoryMiscSoundEvents.BLOCK_JUKEBOX_EJECT, SoundSource.BLOCKS, 1.0F, 0.8f + level.random.nextFloat() * 0.4F);
            }
        }
    }


    @Inject(method = "setTheItem", at = @At("HEAD"))
    private void auditory_insertDiscSound(ItemStack itemStack, CallbackInfo ci) {
        if (AuditoryCommon.getConfig().block_sounds.jukebox_sounds) {
            boolean bl = !itemStack.isEmpty();
            assert this.level != null;
            Optional<Holder<JukeboxSong>> optional = JukeboxSong.fromStack(this.level.registryAccess(), itemStack);
            if (bl && optional.isPresent()) {
                this.level.playSound(null, this.getBlockPos(), AuditoryMiscSoundEvents.BLOCK_JUKEBOX_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
            }
        }
    }
}
