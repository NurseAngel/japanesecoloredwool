package com.github.nurseangel.japanesecoloredwool;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabJCWool extends CreativeTabs {

	public CreativeTabJCWool(String label) {
		super(label);
	}


	/**
	 *クリエイティブタブのラベル
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel() {
		return Reference.MOD_NAME;
	}

	/**
	 * 使用するアイコンのItem
	 * @return Item
	 */
	@Override
    @SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
        return Item.getItemFromBlock(Blocks.wool);
        //TODO JCedWoolBlockのどれかにする
	}
}
