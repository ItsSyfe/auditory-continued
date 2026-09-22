package dev.syfe.auditory.mixin.items;

import dev.syfe.auditory.AuditoryCommon;
import dev.syfe.auditory.sound.AuditoryMiscSoundEvents;
import dev.syfe.auditory.sound.AuditoryItemSoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// Weapon Swinging Sounds

@Mixin(LivingEntity.class)
public abstract class WeaponSwingMixin extends Entity {

    @Shadow public abstract ItemStack getItemInHand(InteractionHand interactionHand);

    public WeaponSwingMixin(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(
        at = @At(value = "NEW",
            target = "(Lnet/minecraft/world/entity/Entity;I)Lnet/minecraft/network/protocol/game/ClientboundAnimatePacket;"),
        method = "swing(Lnet/minecraft/world/InteractionHand;Z)V"
    )
    private void auditory_swingSounds(InteractionHand interactionHand, boolean bl, CallbackInfo ci) {

        ItemStack itemStack = this.getItemInHand(interactionHand);
        // Sword Sounds

        if ((itemStack.getItem() instanceof SwordItem || itemStack.is(ItemTags.SWORDS)) && AuditoryCommon.getConfig().weapon_sounds.sword_swinging_sounds) {
            level().playSound(null, this.getX(), this.getY(), this.getZ(), AuditoryItemSoundEvents.ITEM_SWORD_SWING, SoundSource.PLAYERS, 0.1F, 0.8f + this.level().random.nextFloat() * 0.4F);
        }

        // Axe Sounds

        else if ((itemStack.getItem() instanceof AxeItem || itemStack.is(ItemTags.AXES)) && AuditoryCommon.getConfig().weapon_sounds.axe_swinging_sounds) {
            level().playSound(null, this.getX(), this.getY(), this.getZ(), AuditoryItemSoundEvents.ITEM_AXE_SWING, SoundSource.PLAYERS, 0.1F, 0.8f + this.level().random.nextFloat() * 0.4F);
        }

        // Trident Sounds

        else if (itemStack.getItem() instanceof TridentItem && AuditoryCommon.getConfig().weapon_sounds.trident_swinging_sounds) {
            level().playSound(null, this.getX(), this.getY(), this.getZ(), AuditoryItemSoundEvents.ITEM_TRIDENT_SWING, SoundSource.PLAYERS, 0.1F, 0.8f + this.level().random.nextFloat() * 0.4F);
        }

        // Pickaxe Sounds

        else if ((itemStack.getItem() instanceof PickaxeItem || itemStack.is(ItemTags.PICKAXES)) && AuditoryCommon.getConfig().weapon_sounds.pickaxe_swinging_sounds) {
            level().playSound(null, this.getX(), this.getY(), this.getZ(), AuditoryItemSoundEvents.ITEM_PICKAXE_SWING, SoundSource.PLAYERS, 0.1F, 0.8f + this.level().random.nextFloat() * 0.4F);
        }

        // Shovel Sounds

        else if ((itemStack.getItem() instanceof ShovelItem || itemStack.is(ItemTags.SHOVELS)) && AuditoryCommon.getConfig().weapon_sounds.shovel_swinging_sounds) {
            level().playSound(null, this.getX(), this.getY(), this.getZ(), AuditoryItemSoundEvents.ITEM_SHOVEL_SWING, SoundSource.PLAYERS, 0.1F, 0.8f + this.level().random.nextFloat() * 0.4F);
        }

        // Hoe Sounds

        else if ((itemStack.getItem() instanceof HoeItem || itemStack.is(ItemTags.HOES)) && AuditoryCommon.getConfig().weapon_sounds.hoe_swinging_sounds) {
            level().playSound(null, this.getX(), this.getY(), this.getZ(), AuditoryItemSoundEvents.ITEM_HOE_SWING, SoundSource.PLAYERS, 0.1F, 0.8f + this.level().random.nextFloat() * 0.4F);
        }

        // Shear Sounds

        else if (itemStack.getItem() instanceof ShearsItem && AuditoryCommon.getConfig().weapon_sounds.shear_swinging_sounds) {
            level().playSound(null, this.getX(), this.getY(), this.getZ(), AuditoryItemSoundEvents.ITEM_SHEARS_SWING, SoundSource.PLAYERS, 0.1F, 0.8f + this.level().random.nextFloat() * 0.4F);
        }

        // Empty Hand Sounds

        else if (itemStack.isEmpty() && AuditoryCommon.getConfig().weapon_sounds.fist_swinging_sounds) {
            level().playSound(null, this.getX(), this.getY(), this.getZ(), AuditoryMiscSoundEvents.ENTITY_PLAYER_EMPTY_HAND_SWING, SoundSource.PLAYERS, 0.1F, 0.8f + this.level().random.nextFloat() * 0.4F);
        }
    }
}
