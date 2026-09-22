package dev.syfe.auditory.sound;

import dev.syfe.auditory.platform.ModLoaderAccess;
import net.minecraft.sounds.SoundEvent;

public class AuditoryItemSoundEvents extends AuditoryBaseSoundEvents {
    public AuditoryItemSoundEvents() {
        super("Items");
    }

    public static final SoundEvent ITEM_BOW_PULLING = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.bow.pulling");
    public static final SoundEvent ITEM_TRIDENT_PULLING = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.trident.pulling");
    public static final SoundEvent ITEM_TRIDENT_SWING = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.trident.swing");
    public static final SoundEvent ITEM_SWORD_SWING = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.sword.swing");
    public static final SoundEvent ITEM_AXE_SWING = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.axe.swing");
    public static final SoundEvent ITEM_PICKAXE_SWING = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.pickaxe.swing");
    public static final SoundEvent ITEM_SHOVEL_SWING = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.shovel.swing");
    public static final SoundEvent ITEM_HOE_SWING = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.hoe.swing");
    public static final SoundEvent ITEM_SHEARS_SWING = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.shears.swing");
    public static final SoundEvent ITEM_SPAWN_EGG_USE = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.spawn_egg.use");
    public static final SoundEvent ITEM_SHIELD_RAISE = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.shield.raise");
    public static final SoundEvent ITEM_SHIELD_EQUIP = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.shield.equip");
    public static final SoundEvent DRIED_KELP_EAT = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.dried_kelp.eat");
    public static final SoundEvent SOFT_FRUIT_EAT = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.soft_fruit.eat");
    public static final SoundEvent CRUNCHY_FRUIT_EAT = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.crunchy_fruit.eat");
    public static final SoundEvent STEW_EAT = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.stew.eat");
    public static final SoundEvent VEGETABLE_EAT = ModLoaderAccess.INSTANCE.registerSoundEventFromId("item.vegetable.eat");
}
