package mods.nurseangel.japanesecoloredwool;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabJCWool extends CreativeTabs {

	public CreativeTabJCWool(String label) {
		super(label);
	}

	/**
	 * 使用するアイコンのBlockID
	 * @return int
	 */
	public int getTabIconItemIndex() {
		return Config.BlockIdStart + 1;
	}

	/**
	 *クリエイティブタブのラベル
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel() {
		return Reference.MOD_NAME;
	}
}
