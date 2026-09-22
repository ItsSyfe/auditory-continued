package dev.syfe.auditory.platform;
//? if fabric {

import dev.syfe.auditory.AuditoryCommon;import net.fabricmc.api.EnvType;import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;import net.minecraft.core.registries.BuiltInRegistries;import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import static dev.syfe.auditory.AuditoryCommon.LOGGER;

public final class FabricLoaderAccess implements ModLoaderAccess {
    private FabricLoader loader = FabricLoader.getInstance();

    /**
     * @return whether the current {@link EnvType environment type} is of CLIENT
     */
    @Override
    public boolean isClient() {
        return loader.getEnvironmentType().equals(EnvType.CLIENT);
    }

    /**
     * @return whether the current {@link EnvType environment type} is of SERVER
     */
    @Override
    public boolean isServer() {
        return loader.getEnvironmentType().equals(EnvType.SERVER);
    }

    /**
     * @param id the ID of the mod, as defined in {@code fabric.mod.json}
     * @return whether the mod is present
     */
    @Override
    public boolean isModLoaded(String id) {
        return loader.isModLoaded(id);
    }

    /**
     * @param name
     * @return
     */
    @Override
    public ResourceLocation auditoryResourceLocationFromId(String name) {
        return ResourceLocation.fromNamespaceAndPath(AuditoryCommon.MOD_ID, name);
    }

    /**
     * @param name the name of the {@link ResourceLocation} to be registered.
     * @return registered SoundEvent.
     */
    @Override
    public SoundEvent registerSoundEventFromId(String name) {
        ResourceLocation resourceLocation = this.auditoryResourceLocationFromId(name);
        return this.registerSoundEventFromResource(resourceLocation);
    }

    /**
     * @param rl the {@link ResourceLocation} to register the sound event for.
     * @return registered SoundEvent.
     */
    @Override
    public SoundEvent registerSoundEventFromResource(ResourceLocation rl) {
        LOGGER.info("Registering sound {}", rl.getPath());
        SoundEvent soundEvent = SoundEvent.createVariableRangeEvent(rl);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, rl, soundEvent);
    }


}
//?}