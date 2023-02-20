package bettermobs.bettermobs.core;

import bettermobs.bettermobs.Bettermobs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Bettermobs.MODID);

    public static final RegistryObject<Block> Haines_Block = BLOCKS.register("haines_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
}
