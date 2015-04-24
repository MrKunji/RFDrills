package goldenapple.rfdrills;

import goldenapple.rfdrills.init.ModItems;
import goldenapple.rfdrills.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagByte;

public class RFDrillsCreativeTab {
    public static final CreativeTabs OmniDrillsTab = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public ItemStack getIconItemStack() {
            ItemStack itemStack = new ItemStack(ModItems.redstoneDrill);
            itemStack.setTagInfo("isCreativeTabIcon", new NBTTagByte((byte)1));
            return itemStack;
        }

        @Override
        public Item getTabIconItem() {
            return ModItems.redstoneDrill;
        }
    };
}