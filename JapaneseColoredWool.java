package com.github.nurseangel.japanesecoloredwool;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.github.nurseangel.japanesecoloredwool.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class JapaneseColoredWool {
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@Mod.Instance(Reference.MOD_ID)
	public static JapaneseColoredWool instance;

	public static boolean isTest = false;

	// ブロック
	public static JCedWoolBlock[] jCedWoolBlock = new JCedWoolBlock[30];

	public static Config config;
	/** クリエイティブタブ */
	public static final CreativeTabs creativeTab = new CreativeTabJCWool(Reference.MOD_NAME);

	/**
	 * コンストラクタ的なもの
	 *
	 * @param event
	 */
	@Mod.EventHandler
	public void modPreInit(FMLPreInitializationEvent event) {
		config = new Config(event);
	}

	/**
	 * メイン処理的なもの
	 *
	 * @param event
	 */
	@Mod.EventHandler
	public void modInit(FMLInitializationEvent event) {
		/**
		 * レシピは以下のようにする
		 *
		 * ひとつめ:メタデータ0～7　算出は [i/8]<br />
		 * つまり最大56だが、そんなに埋まらん
		 *
		 * ふたつめ:メタデータ8～15　算出は (i%8) + 8<br />
		 *
		 * これでレシピ重複が防げるはず
		 *
		 * 1.7.10でもメタデータは15までしか使えない模様。残念。
		 */


		// 全ブロックリストでループ
		for (int i = 0; i < config.colorListListEn.length; i++) {
			// ブロックを登録
			jCedWoolBlock[i] = new JCedWoolBlock(Material.cloth, i, config.colorListListEn[i].length);

			jCedWoolBlock[i].setBlockName("japanesecoloredwool_"+i+"_").setCreativeTab(creativeTab);
			GameRegistry.registerBlock(jCedWoolBlock[i], JCWoolItemBlock.class, jCedWoolBlock[i].getUnlocalizedName().replace("tile.", ""));

			// レシピ用
			ItemStack itemStack1 = new ItemStack(Blocks.wool, 1, Math.round(i / 8));
			ItemStack itemStack2 = new ItemStack(Blocks.wool, 1, (i % 8) + 8);

			// メタデータごとの値を登録
			for (int j = 0; j < config.colorListListEn[i].length; j++) {
				// アイテム
				ItemStack itemStack = new ItemStack(jCedWoolBlock[i], 1, j);

				// レシピ
				GameRegistry.addShapelessRecipe(itemStack, new Object[] { new ItemStack(Items.dye, 1, j), itemStack1, itemStack2});
			}
		}

	}



}
