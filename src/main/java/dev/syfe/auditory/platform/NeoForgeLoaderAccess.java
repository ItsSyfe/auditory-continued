package dev.syfe.auditory.platform;
//? if neoforge {
/*import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public final class NeoForgeLoaderAccess implements ModLoaderAccess {
    /^*
     * @return
     ^/
    @Override
    public boolean isClient() {
        return false;
    }

    /^*
     * @return
     ^/
    @Override
    public boolean isServer() {
        return false;
    }

    /^*
     * @param id
     * @return
     ^/
    @Override
    public boolean isModLoaded(String id) {
        return false;
    }

    /^*
     * @param id
     * @return
     ^/
    @Override
    public ResourceLocation auditoryResourceLocationFromId(String id) {
        return null;
    }

    /^*
     * @param rl
     * @return
     ^/
    @Override
    public SoundEvent registerSoundEventFromResource(ResourceLocation rl) {
        return null;
    }
}
*///?}