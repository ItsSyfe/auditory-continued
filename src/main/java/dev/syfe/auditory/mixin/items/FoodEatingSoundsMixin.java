package dev.syfe.auditory.mixin.items;

import dev.syfe.auditory.sound.AuditoryItemSoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import dev.syfe.auditory.misc.AuditoryTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class FoodEatingSoundsMixin {

    @Shadow public abstract Item getItem();
    @Shadow public abstract boolean is(TagKey<Item> tagKey);

    @Inject(method = "getEatingSound", at = @At("HEAD"), cancellable = true)
    public void auditory_changeItemEatingSound(CallbackInfoReturnable<SoundEvent> cir) {
        if (this.is(AuditoryTags.DRIED_KELP_SOUNDS)) {
            cir.setReturnValue(AuditoryItemSoundEvents.DRIED_KELP_EAT);
        }
        else if (this.is(AuditoryTags.SOFT_FRUIT_SOUNDS)) {
            cir.setReturnValue(AuditoryItemSoundEvents.SOFT_FRUIT_EAT);
        }
        else if (this.is(AuditoryTags.CRUNCHY_FRUIT_SOUNDS)) {
            cir.setReturnValue(AuditoryItemSoundEvents.CRUNCHY_FRUIT_EAT);
        }
        else if (this.is(AuditoryTags.STEW_SOUNDS)) {
            cir.setReturnValue(AuditoryItemSoundEvents.STEW_EAT);
        }
        else if (this.is(AuditoryTags.VEGETABLE_SOUNDS)) {
            cir.setReturnValue(AuditoryItemSoundEvents.VEGETABLE_EAT);
        }
    }
}
