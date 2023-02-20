package bettermobs.bettermobs.core;

import bettermobs.bettermobs.Bettermobs;
import bettermobs.bettermobs.common.items.hold_the_phone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Bettermobs.MODID);

    public static final RegistryObject<Item> MOD_BLOCK = ITEMS.register("haines_block", () -> new BlockItem(ModBlocks.Haines_Block.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOD_ITEM = ITEMS.register("haines_gem", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOLD_THE_PHONE = ITEMS.register("hold_the_phone", () -> new hold_the_phone(new Item.Properties().fireResistant()));
}
