package mods.nurseangel.japanesecoloredwool;

import java.util.logging.Level;

import mods.nurseangel.wordblocks.Reference;
import net.minecraftforge.common.Configuration;
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

	public static int BlockIdStart;

	/**
	 * コンフィグファイルから読み込み
	 *
	 * @param cfg
	 */
	private void readConfig(Configuration cfg) {

		int blockIdStart = 1300;

		String comment = "use next 29 BlockID";

		try {
			cfg.load();
			BlockIdStart = cfg.getBlock("startBlockID", blockIdStart, comment).getInt();
			isTest = cfg.get(Configuration.CATEGORY_GENERAL, "isTest", false, "Always false").getBoolean(false);

		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, Reference.MOD_NAME + " configuration loadding failed");
		} finally {
			cfg.save();
		}
	}

	/**
	 * 英名
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

	/**
	 * 和名
	 */
	public static final String[][] colorListListJp = {
			{ "桜色", "薄桜", "桜鼠", "鴇鼠", "虹色", "珊瑚色", "一斤染め", "宍色", "紅梅色", "薄紅", "甚三紅", "桃色", "鴇色", "撫子色", "灰梅", "灰桜" },
			{ "淡紅藤", "石竹色", "薄紅梅", "桃花色", "水柿色", "ときがら茶", "退紅", "薄柿", "長春色", "梅鼠", "鴇浅葱", "梅染", "蘇芳香", "浅蘇芳", "真朱", "赤紫" },
			{ "躑躅色", "牡丹色", "今様色", "中紅", "薔薇色", "韓紅", "銀朱", "赤紅", "紅緋", "赤", "猩々緋", "紅", "深緋", "緋色", "赤丹", "紅赤" },
			{ "臙脂", "朱", "茜色", "紅海老茶", "蘇芳", "真紅", "象牙色", "練色", "灰白色", "蒸栗色", "女郎花", "枯草色", "淡黄", "白茶", "赤白橡", "洗柿" },
			{ "鳥の子色", "蜂蜜色", "肌色", "薄卵色", "雄黄", "洒落柿", "赤香", "砥粉色", "人色", "香色", "薄香", "浅黄", "枯色", "淡香", "杏色", "東雲色" },
			{ "珊瑚朱色", "深支子", "纁", "浅緋", "真赭", "洗朱", "遠州茶", "紅樺色", "赭", "小豆色", "枯茶", "飴色", "駱駝色", "土色", "黄唐茶", "桑染" },
			{ "櫨色", "黄橡", "香染", "枇杷茶", "芝翫茶", "焦香", "胡桃色", "渋紙色", "朽葉色", "桑茶", "路考茶", "国防色", "伽羅色", "江戸茶", "樺色", "紅鬱金" },
			{ "土器色", "狐色", "黄土色", "琥珀色", "赤茶", "代赭", "煉瓦色", "雀茶", "団十郎茶", "紅鳶", "灰茶", "茶色", "檜皮色", "鳶色", "柿茶", "弁柄色" },
			{ "赤錆色", "褐色", "栗梅", "紅檜皮", "海老茶", "唐茶", "栗色", "赤銅色", "錆色", "赤褐色", "茶褐色", "栗皮茶", "黒茶", "葡萄茶", "萱草色", "柑子色" },
			{ "金茶", "蜜柑色", "鉛丹色", "黄丹", "柿色", "黄赤", "橙色", "照柿", "赤橙", "朱色", "小麦色", "丹色", "黄茶", "肉桂色", "赤朽葉色", "黄櫨染" },
			{ "蒲公英色", "中黄", "菜の花色", "黄檗色", "卵色", "花葉色", "刈安色", "玉蜀黍色", "金糸雀色", "黄支子色", "支子色", "向日葵色", "山吹色", "鬱金色", "藤黄", "金色" },
			{ "櫨染", "黄朽葉色", "山吹茶", "芥子色", "豆がら茶", "麹塵", "山鳩色", "利休鼠", "海松茶", "藍海松茶", "藍媚茶", "千歳茶", "岩井茶", "仙斎茶", "黒緑", "柳煤竹" },
			{ "樺茶色", "空五倍子色", "生壁色", "肥後煤竹", "媚茶", "白橡", "亜麻色", "榛色", "灰汁色", "利休茶", "鶯茶", "木蘭色", "砂色", "油色", "利休色", "梅幸茶" },
			{ "璃寛茶", "黄海松茶", "菜種油色", "青朽葉", "根岸色", "鶸茶", "柳茶", "海松色", "鶯色", "緑黄色", "鶸色", "抹茶色", "若草色", "黄緑", "若芽色", "若菜色" },
			{ "若苗色", "青丹", "草色", "苔色", "萌黄", "苗色", "若葉色", "松葉色", "夏虫色", "鶸萌黄", "柳色", "青白橡", "柳鼠", "裏葉柳", "山葵色", "老竹色" },
			{ "白緑", "淡萌黄", "柳染", "薄萌葱", "深川鼠", "若緑", "浅緑", "薄緑", "青鈍", "青磁鼠", "薄青", "錆青磁", "緑青色", "千歳緑", "若竹色", "緑" },
			{ "常磐色", "千草鼠", "千草色", "青磁色", "青竹色", "常磐緑", "木賊色", "天鵞絨", "虫襖", "革色", "深緑", "鉄色", "萌葱色", "花緑青", "翡翠色", "青緑" },
			{ "水浅葱", "錆浅葱", "青碧", "御召茶", "湊鼠", "高麗納戸", "百入茶", "錆鼠", "錆鉄御納戸", "藍鼠", "錆御納戸", "舛花色", "熨斗目花色", "御召御納戸", "鉄御納戸", "紺鼠" },
			{ "藍鉄", "青褐", "褐返", "褐色", "月白", "白菫色", "白花色", "藍白", "白藍", "水色", "瓶覗", "秘色色", "空色", "勿忘草色", "青藤色", "白群" },
			{ "浅縹", "薄花色", "納戸色", "浅葱色", "花浅葱", "新橋色", "天色", "露草色", "青", "薄藍", "縹色", "紺碧", "薄群青", "杜若色", "瑠璃色", "薄縹" },
			{ "瑠璃紺", "紺瑠璃", "藍色", "青藍", "深縹", "紺色", "紺青", "留紺", "濃藍", "鉄紺", "漆黒", "淡藤色", "藤色", "紅碧", "紺桔梗", "紺藍" },
			{ "紅桔梗", "桔梗色", "藤納戸", "紅掛花色", "紫苑色", "白藤色", "藤紫", "菫色", "青紫", "菖蒲色", "竜胆色", "江戸紫", "本紫", "葡萄色", "深紫", "紫黒" },
			{ "紫", "薄葡萄", "紫紺", "暗紅色", "桑の実色", "古代紫", "茄子紺", "二藍", "京紫", "蒲葡", "若紫", "紅紫", "梅紫", "菖蒲色", "紅藤色", "浅紫" },
			{ "紫水晶", "薄梅鼠", "暁鼠", "牡丹鼠", "霞色", "藤鼠", "半色", "薄色", "薄鼠", "鳩羽鼠", "鳩羽色", "桔梗鼠", "紫鼠", "葡萄鼠", "濃色", "紫鳶" },
			{ "濃鼠", "藤煤竹", "滅紫", "紅消鼠", "似せ紫", "灰黄緑", "蕎麦切色", "薄雲鼠", "枯野色", "潤色", "利休白茶", "茶鼠", "胡桃染", "江戸鼠", "煤色", "丁子茶" },
			{ "柴染", "宗伝唐茶", "砺茶", "煎茶色", "銀煤竹", "黄枯茶", "煤竹色", "焦茶", "黒橡", "憲法色", "涅色", "檳榔子染", "黒鳶", "赤墨", "黒紅", "白" },
			{ "胡粉色", "卯の花色", "白磁", "生成り色", "乳白色", "白練", "素色", "白梅鼠", "白鼠", "絹鼠", "灰青", "銀鼠", "薄鈍", "薄墨色", "錫色", "素鼠" },
			{ "鼠色", "源氏鼠", "灰色", "鉛色", "鈍色", "墨", "丼鼠", "消炭色", "藍墨茶", "羊羹色", "黒", "烏羽色", "鉄黒", "濡羽色", "黒檀", "憲法黒茶" }, { "暗黒色" } };

}
