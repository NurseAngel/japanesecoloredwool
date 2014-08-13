package com.github.nurseangel.japanesecoloredwool;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class JCWoolItemBlock extends ItemBlockWithMetadata {
	/**
	 * コンストラクタ
	 *
	 * @param Blockをそのまま渡す
	 */
	public JCWoolItemBlock(Block block) {
		// 何故か引数が二つ
		super(block, block);
	}

	/**
	 * ブロック設置時のメタデータ。指定しないと0
	 *
	 * @param int アイテムのダメージ値
	 * @return int メタデータ
	 */
	@Override
	public int getMetadata(int i) {
		return i;
	}

	/**
	 * 内部的ブロックの名前を返す<br />
	 * オーバーライドしないと同じBlockIDのアイテムが全部同名になる。
	 *
	 * @param ItenStack
	 * @return String
	 */
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		return (new StringBuilder(getUnlocalizedName())).append(i).toString();
	}
}
