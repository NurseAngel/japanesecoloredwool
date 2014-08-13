package com.github.nurseangel.japanesecoloredwool;


import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config {

	/**
	 * コンストラクタ
	 *
	 * @param cfg
	 * @return
	 */
	public Config(FMLPreInitializationEvent event) {
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		readConfig(cfg);
	}

	public static boolean isTest = false;


	/**
	 * コンフィグファイルから読み込み
	 *
	 * @param cfg
	 */
	private void readConfig(Configuration cfg) {

		try {
			cfg.load();
			isTest = cfg.get(Configuration.CATEGORY_GENERAL, "isTest", false, "Always false").getBoolean(false);

		} catch (Exception e) {
			FMLLog.log(Level.INFO, Reference.MOD_NAME + " configuration loadding failed");
		} finally {
			cfg.save();
		}
	}


	/**
	 * 各ブロック名
	 * registerBlockで使っているだけで、表示名はlangから取ってくる
	 */
	public static final String[][] colorListListEn = {
			{ "SakuraIro", "UsuZakura", "SakuraNezu", "TokiNezu", "NijiIro", "SangoIro", "IkkonZome", "ShishiIro", "KoubaiIro", "Usubeni", "Jinzamomi",
					"MomoIro", "TokiIro", "NadeshikoIro", "Haiume", "Haizakura" },
			{ "AwabeniFuji", "SekichikuIro", "UsuKoubai", "MomoHanaIro", "Mizugaki", "TokigaraCha", "Arazome", "Usugaki", "Choushun-Iro", "UmeNezu",
					"TokiAsagi", "Umezome", "SuouKou", "AsaSuou", "Masoo", "AkaMurasaki" },
			{ "TsutsujiIro", "BotanIro", "ImayouIro", "NakaBeni", "BaraIro", "KaraKurenai", "Ginsyu", "AkaBeni", "BeniHi", "Aka", "ShoujouHi", "Kurenai",
					"Kokihi", "HiIro", "AkaNi", "BeniAka" },
			{ "Enji", "Ake", "AkaneIro", "BeniEbiCha", "Suou", "Shinku", "ZougeIro", "NeriIro", "KaiHakuShoku", "MushiGuriIro", "Ominaeshi", "KarekusaIro",
					"Tankou", "ShiraCha", "AkashiroTsurubami", "AraiGaki" },
			{ "TorinokoIro", "Hachimitsu", "HadaIro", "UsuTamagoIro", "YuuOu", "ShareGaki", "Akakou", "TonokoIro", "HitoIro", "KouIro", "Usukou", "Usuki",
					"KareIro", "Usukou", "AnzuIro", "ShinonomeIro" },
			{ "SangoShuIro", "KokiKuchinashi", "Hiso", "Usukihi", "Masoho", "AraiShu", "EnshuuCha", "BeniKabaIro", "Soho", "AzukiIro", "KaraCha", "AmeIro",
					"RakudaIro", "TsuchiIro", "KigaraCha", "KuwaZome" },
			{ "HajiIro", "Kitsurubami", "KouZome", "BiwaCha", "ShikanCha", "KogareKou", "KurumiIro", "ShibukamiIro", "KuchibaIro", "KuwaCha", "Rokoucha",
					"Kokuboshoku", "KyaraIro", "EdoCha", "KabaIro", "BeniUkon" },
			{ "KawarakeIro", "KitsuneIro", "OudoIro", "KohakuIro", "AkaCha", "Taisha", "RengaIro", "SuzumeCha", "DanjurouCha", "BeniTobi", "HaiTobi", "ChaIro",
					"HiwadaIro", "TobiIro", "KakiCha", "BengaraIro" },
			{ "AkasabiIro", "Kachiiro", "KuriUme", "BeniHihada", "EbiCha", "Karacha", "KuriIro", "ShakudouIro", "SabiIro", "Sekkasshoku", "Chakasshaku",
					"KurikawaCha", "KuroCha", "EbiCha", "KanzouIro", "KoujiIro" },
			{ "KinCha", "MikanIro", "EntanIro", "Ouni", "KakiIro", "KiAka", "DaidaiIro", "TeriGaki", "AkaDaidai", "ShuIro", "KomugiIro", "NiIro", "KiCha",
					"NikkeiIro", "AkaKuchibaIro", "KouroZen" },
			{ "TanpopoIro", "ChuuKi", "NanohanaIro", "KihadaIro", "TamagoIro", "HanabaIro", "KariyasuIro", "ToumorokoshiIro", "KanariaIro", "KiKuchinashiIro",
					"KuchinashiIro", "HimawariIro", "YamabukiIro", "UkonIro", "Touou", "Konjiki" },
			{ "Hajizome", "KiKuchinaIro", "YamabukiCha", "KarashiIro", "MamegaraCha", "Kikujin", "YamabatoIro", "RikyuNezumi", "MiruCha", "AiMiruCha",
					"AiKobiCha", "SensaiCha", "IwaiCha", "SensaiCha", "KuroMidori", "YanagiSusutake" },
			{ "KabaChaIro", "UtsubushiIro", "NamaKabeIro", "HigoSusutake", "KobiCha", "ShiroTsurubami", "AmaIro", "HashibamiIro", "AkuIro", "RikyuCha",
					"UguisuCha", "MokuranJiki", "SunaIro", "AburaIro", "RikyuIro", "BaikouCha" },
			{ "RikanCha", "KimiruCha", "NataneyuIro", "AoKuchiba", "NegishiIro", "HiwaCha", "YanagiCha", "MiruIro", "UguisuIro", "RyokuouShoku", "HiwaIro",
					"MacchaIro", "WakakusaIro", "Kimidori", "WakameIro", "WakanaIro" },
			{ "WakanaeIro", "Aoni", "KusaIro", "KokeIro", "Moegi", "NaeIro", "WakabaIro", "MatsubaIro", "NatsumushiIro", "HiwaMoegi", "YanagiIro",
					"AoShiroTsurubami", "YanagiNezu", "UrabaYanagi", "WasabiIro", "OitakeIro" },
			{ "Byakuroku", "UsuMoegi", "YanagiZome", "UsuMoegi", "FukagawaNezumi", "WakaMidori", "AsaMidori", "UsuMidori", "AoNibi", "SeijiNezu", "UsuAo",
					"SabiSeiji", "RokushouIro", "ChitoseMidori", "WakatakeIro", "Midori" },
			{ "TokiwaIro", "ChigusaNezu", "ChigusaIro", "SeijiIro", "AotakeIro", "TokiwaMidori", "TokusaIro", "Biroudo", "MushiAo", "KawaIro", "FukaMidori",
					"TetsuIro", "MoegiIro", "HanaRokushou", "HisuiIro", "AoMidori" },
			{ "MizuAsagi", "SabiAsagi", "SeiHeki", "OmeshiCha", "MinatoNezumi", "KouraiNando", "MomoshioCha", "SabiNezu", "SabitetsuOnando", "AiNezu",
					"SabiOnando", "MasuHanaIro", "NoshimeHanaIro", "OmeshiOnando", "TetsuOnando", "KonNezu" },
			{ "AiTetsu", "AoKachi", "KachiKaeshi", "Kasshoku", "Geppaku", "ShiroSumireIro", "ShiraHanaIro", "AiJiro", "ShiraAi", "MizuIro", "KameNozoki",
					"HisokuIro", "SoraIro", "WasurenagusaIro", "AoFujiIro", "ByakuGun" },
			{ "AsaHanada", "UsuHanaIro", "NandoIro", "AsagiIro", "HanaAsagi", "ShinbashiIro", "AmaIro", "TsuyuKusa", "Ao", "UsuAi", "HanadaIro", "Konpeki",
					"UsuGunjou", "KakitsubataIro", "RuriIro", "UsuHanada" },
			{ "RuriKon", "KonRuri", "AiIro", "SeiRan", "KokiHanada", "KonIro", "Konjou", "TomeKon", "KoiAi", "TetsuKon", "Shikkoku", "AwaFujiIro", "FujiIro",
					"BeniMidori", "KonKikyou", "KonAi" },
			{ "BeniKikyou", "KikyouIro", "FujiNando", "BeniKakeHanaIro", "ShionIro", "ShiraFujiIro", "FujiMurasaki", "SumireIro", "AoMurasaki", "ShoubuIro",
					"RindouIro", "EdoMurasaki", "HonMurasaki", "BudouIro", "FukaMurasaki", "Shikoku" },
			{ "Murasaki", "UsuBudou", "Shikon", "AnkouShoku", "KuwanomiIro", "KodaiMurasaki", "NasuKon", "FutaAi", "KyouMurasaki", "EbiZome", "WakaMurasaki",
					"BeniMurasaki", "UmeMurasaki", "AyameIro", "BeniFujiIro", "AsaMurasaki" },
			{ "MurasakiSuishou", "UsuUmeNezu", "AkatsukiNezu", "BotanNezu", "KasumiIro", "FujiNezu", "HashitaIro", "UsuIro", "UsuNezu", "HatobaNezumi",
					"HatobaIro", "KikyouNezu", "MurasakiNezu", "BudouNezumi", "KokiIro", "MurasakiTobi" },
			{ "KoiNezu", "FujiSusutake", "KeshiMurasaki", "BeniKeshiNezumi", "NiseMurasaki", "HaiKimidori", "SobakiriIro", "UsuKumoNezu", "KarenoIro",
					"UrumiIro", "RikyuShiroCha", "ChaNezumi", "KurumiZome", "EdoNezu", "SusuIro", "ChoujiCha" },
			{ "FushiZome", "SoudenKaraCha", "TonoCha", "SenChaIro", "GinSusudake", "KiGaraCha", "SusuTakeIro", "KogeCha", "KuroTsurubami", "KenpouIro",
					"KuriIro", "BinroujiZome", "KuroTobi", "AkaSumi", "KuroBeni", "Shiro" },
			{ "GofunIro", "UnohanaIro", "Hakuji", "KinariIro", "NyuHakuShoku", "ShiroNeri", "SoShoku", "ShiraUmeNezu", "ShiroNezu", "KinuNezu", "HaiAo",
					"GinNezu", "UsuNibi", "UsuZumiIro", "SuzuIro", "SuNezumi" },
			{ "NezumiIro", "GenjiNezu", "HaiIro", "NamariIro", "NibiIro", "Sumi", "DobuNezumi", "KeshiZumiIro", "AiSumiCha", "YoukanIro", "Kuro",
					"KarasubaIro", "TetsuGuro", "NurebaIro", "Kokutan", "KenpouKuroCha" }, { "AnkokuShoku" } };

}
