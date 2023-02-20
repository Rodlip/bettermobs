package bettermobs.bettermobs.events;


import bettermobs.bettermobs.Bettermobs;
import bettermobs.bettermobs.common.entities.Djew;
import bettermobs.bettermobs.common.entities.Eddy;
import bettermobs.bettermobs.core.ModEntities;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static bettermobs.bettermobs.sound.ModSounds.EDDYSOUND;

@Mod.EventBusSubscriber(modid = Bettermobs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonEvents {

    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.DJEW.get(), Djew.getDjewAttributes().build());
        event.put(ModEntities.EDDY.get(), Eddy.getEddyAttributes().build());
    }

}
