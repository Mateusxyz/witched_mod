package net.fabricmc.witched.item.custom;

import net.minecraft.item.GoatHornItem;
import net.minecraft.item.Instrument;
import net.minecraft.tag.TagKey;

public class WolfFlute extends GoatHornItem {

    public WolfFlute(Settings settings, TagKey<Instrument> instrumentTag) {
        super(settings, instrumentTag);
    }

    /* @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        super.useOnBlock(context);
        return ActionResult.FAIL;
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user instanceof ServerPlayerEntity) {
            //user.sendMessage(Text.translatable("text.witched.chalice"));
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
    ///////VEJA GOAT HORN
    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.TOOT_HORN;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.swingHand(user.getActiveHand());
        user.sendMessage(Text.translatable("text.witched.chalice"));
        return stack;//super.finishUsing(stack, world, user);
    } */

}
