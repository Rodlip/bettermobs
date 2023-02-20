package bettermobs.bettermobs.sound;

import bettermobs.bettermobs.Bettermobs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

    public static SoundEvent createVariableRangeEvent(ResourceLocation p_262973_) {
        return new SoundEvent(EDDYSOUND, 16.0F, false);
    }

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Bettermobs.MODID);
    public static final RegistryObject<SoundEvent> EDDYSOUND = registerSoundEvent("eddysound");
    public static RegistryObject<SoundEvent> registerSoundEvent(String Eddy) {
        return new SoundEvent(EDDYSOUND, 16.0F, false);
    }
    public static void register(IEventBus modEventBus) {
        SOUND_EVENTS.register(modEventBus);
    }
}