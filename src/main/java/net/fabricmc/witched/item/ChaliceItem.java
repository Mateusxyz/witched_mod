package net.fabricmc.witched.item;


import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.HoneyBottleItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class ChaliceItem extends HoneyBottleItem {

    public ChaliceItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        //super.finishUsing(stack, world, user);
        if (user instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)user;
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
            user.sendMessage(Text.of("You feel stronger."));
            if (this.isFood()) {
                user.eatFood(world, stack);
            }
            ItemStack itemStack = new ItemStack(Mod_items.empty_chalice_item);
            PlayerEntity playerEntity = (PlayerEntity)user;
            if (!playerEntity.getInventory().insertStack(itemStack)) {
                playerEntity.dropItem(itemStack, false);
            }
            return stack;
        }
        return stack;
    }
    
}
