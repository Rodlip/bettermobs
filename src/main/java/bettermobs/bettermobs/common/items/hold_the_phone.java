package bettermobs.bettermobs.common.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class hold_the_phone extends Item {
    public hold_the_phone(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level world, Entity entityIn, int itemSlot, boolean isSelected) {
        if(isSelected && entityIn instanceof Player){
            ((Player) entityIn).addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1, 5));
            ((Player) entityIn).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 100));
            ((Player) entityIn).addEffect(new MobEffectInstance(MobEffects.JUMP, 1, -100));
        }
        super.inventoryTick(stack, world, entityIn, itemSlot, isSelected);
    }
}
