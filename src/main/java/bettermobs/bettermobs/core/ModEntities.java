package bettermobs.bettermobs.core;

import bettermobs.bettermobs.Bettermobs;
import bettermobs.bettermobs.common.entities.Djew;
import bettermobs.bettermobs.common.entities.Eddy;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Bettermobs.MODID);

    public static final RegistryObject<EntityType<Djew>> DJEW = ENTITIES.register("djew", () -> EntityType.Builder.of(Djew::new, MobCategory.CREATURE).sized(1,1).build(Bettermobs.MODID + ":djew"));
    public static final RegistryObject<EntityType<Eddy>> EDDY = ENTITIES.register("eddy", () -> EntityType.Builder.of(Eddy::new, MobCategory.CREATURE).sized(0.5F,0.5F).build(Bettermobs.MODID + ":eddy"));

}
