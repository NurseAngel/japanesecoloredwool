package mods.nurseangel.japanesecoloredwool;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class JCedWoolBlock extends Block {

	/** メタデータ使用数 */
	private int colorListLength;
	/** テクスチャファイル名1文字目 */
	private int textureIndex;
	/** アイコン */
	Icon[] icon = new Icon[17];

	public JCedWoolBlock(int i, Material material, int textureIndex, int colorListLength) {
		super(i, material);
		setStepSound(Block.soundClothFootstep);
		setHardness(0.8F);

		this.textureIndex = textureIndex;

		this.colorListLength = colorListLength;
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * 使用するアイコンを返す
	 * @param 取得する方角
	 * @param メタデータ
	 */
	public Icon getIcon(int par1, int par2) {
		return icon[par2];
	}

	/**
	 * 使用するアイコンをセット
	 *
	 * @param iconRegister
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		int loop = 0;
		for (int i = 0; i <= colorListLength; i++) {
			// 素材名からアイコンファイル名を作成
			String texturePath = Reference.TEXTURE_PATH + textureIndex + "-" + i;
			icon[i] = iconRegister.registerIcon(texturePath);
		}
	}

	/**
	 * ドロップアイテムのメタデータを有効に
	 */
	@Override
	public int damageDropped(int par1) {
		return par1;
	}

	/**
	 * クリエイティブタブに表示
	 *
	 * @param int ブロックID
	 * @param タブ
	 * @param 追加するリスト
	 */
	@Override
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int var4 = 0; var4 < colorListLength; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

}
