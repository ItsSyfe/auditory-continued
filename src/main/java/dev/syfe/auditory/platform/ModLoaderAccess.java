package dev.syfe.auditory.platform;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public sealed interface ModLoaderAccess
        permits
        //? if fabric
        FabricLoaderAccess
        //? if neoforge
        //NeoForgeLoaderAccess
        {
    ModLoaderAccess INSTANCE =
            /*? if fabric{*/new FabricLoaderAccess();
            /*?} elif neoforge *///new NeoForgeLoaderAccess();

    boolean isClient();
    boolean isServer();

    boolean isModLoaded(String id);

    ResourceLocation auditoryResourceLocationFromId(String id);

    SoundEvent registerSoundEventFromResource(ResourceLocation rl);
    SoundEvent registerSoundEventFromId(String id);
}
