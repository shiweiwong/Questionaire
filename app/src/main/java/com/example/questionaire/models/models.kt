package com.example.questionaire.models

data class Question(val symbol:String, val quesetion:String, val answerA:String, val answerB:String, val answerC:String, var check:Int = 0)
data class Message(val message:String, val answers:Map<String, String>)
fun getQuestions(): ArrayList<Question> {
    var questions = ArrayList<Question>()
    questions.add(
        Question(
            "少气乏力",
            "平常稍微干点活儿就感觉累吗，休息的时候觉不觉累，愿不愿多说话？",
            "中重程度体力活动后感觉气短乏力",
            "一般活动即感气短乏力",
            "休息时亦感气短无力"
        )
    )
    questions.add(
        Question(
            "神疲乏力",
            "平常稍微干点活儿就感觉累吗，休息的时候觉不觉累，愿不愿多说话？",
            "没有精神，程度轻微，不耐劳力，可坚持轻体力劳动",
            "一般活动即感乏力，间歇出现，勉强支持日常活动",
            "休息亦感疲乏无力，持续出现，不能坚持日常活动"
        )
    )
    questions.add(
        Question(
            "易感冒",
            "一年能感冒几次？",
            "每年感冒6次以上",
            "每年感冒10次以上",
            "每年感冒12次以上"
        )
    )
    questions.add(
        Question(
            "头晕耳鸣",
            "经常头晕耳鸣吗？",
            "耳鸣轻微",
            "耳鸣重听，时作时止",
            "耳鸣不止，听力减退"
        )
    )
    questions.add(
        Question(
            "口干咽燥",
            "觉得渴不渴，爱不爱喝水？喝水后口干能好点吗？",
            "咽喉微干，稍饮水即可缓解",
            "咽喉干燥，饮水能解",
            "咽喉干燥难忍，饮水也难缓解"
        )
    )
    questions.add(
        Question(
            "口渴",
            "觉得口渴吗？",
            "轻微口渴，稍饮水可缓解",
            "口渴，饮水可解",
            "口渴难忍，饮水也难缓解"
        )
    )
    questions.add(
        Question(
            "口干不饮",
            "口干想不想喝水？",
            "轻微口干，不欲饮水",
            "口干不欲饮水",
            "十分口干不欲饮水"
        )
    )
    questions.add(
        Question(
            "口干喜饮",
            "口干喜饮水吗？",
            "口干稍喜饮水",
            "口干饮水增加",
            "口干饮水明显增加"
        )
    )
    questions.add(
        Question(
            "口黏口干",
            "觉得口中黏腻难受口干吗？",
            "微感口中粘腻口干，不影响食欲",
            "口中粘腻口干，影响食欲下降",
            "口中粘腻难受口干，不欲饮食"
        )
    )
    questions.add(
        Question(
            "咽痛咽红",
            "觉得咽喉疼痛红肿吗？",
            "微有咽痛咽红",
            "咽痛咽红，声音嘶哑",
            "严重咽痛咽红，难以发声"
        )
    )
    questions.add(
        Question(
            "咽痒咽痛",
            "有咽喉痒、痛吗？",
            "稍有咽痒咽痛",
            "咽痒咽痛明显",
            "咽痒咽痛难忍"
        )
    )
    questions.add(
        Question(
            "咽喉肿痛",
            "有咽喉肿胀疼痛吗？",
            "稍有咽喉肿痛，不影响吞咽进食",
            "咽喉肿痛，影响吞咽进食",
            "咽喉肿痛难忍，影响吞咽饮食发声"
        )
    )
    questions.add(
        Question(
            "自汗盗汗",
            "比别人容易出汗吗？睡着了出汗，醒来汗止吗？",
            "偶有自汗，见于进食时；头部汗出为主，但可以忍受",
            "自汗阵作，身感有汗；胸背潮湿，反复出现",
            "常有自汗，湿衣，动則明显；周身潮湿如水洗，经常出现"
        )
    )
    questions.add(
        Question(
            "五心烦热",
            "觉得手脚心发热吗？经常会感觉心烦吗？",
            "手足心发热，偶有心烦",
            "手足心发热，欲露衣被外，时有心烦",
            "手足心发烫，欲持冷物，终日心烦不宁"
        )
    )
    questions.add(
        Question(
            "腰膝酸软",
            "有没有腰膝酸软？",
            "晨起腰膝酸软，捶打可止",
            "腰酸持续，膝软，下肢沉重",
            "腰酸难忍，膝软不欲行"
        )
    )
    questions.add(
        Question(
            "面色萎黄",
            "面色萎黄",
            "面色微黄少光泽",
            "面色黄少光泽",
            "面色黄无光泽"
        )
    )
    questions.add(
        Question(
            "面色晄白",
            "",
            "面色微发亮，见轻度浮肿",
            "面色发亮，见有浮肿",
            "面色晶亮，浮肿明显"
        )
    )
    questions.add(
        Question(
            "面色无华",
            "",
            "面色少光泽",
            "面色无光泽",
            "面色完全无光泽"
        )
    )
    questions.add(
        Question(
            "面色晦暗",
            "",
            "面色暗黄而少光泽",
            "面色暗黄而无光泽",
            "面色暗黑而无光泽"
        )
    )
    questions.add(
        Question(
            "目睛干涩",
            "眼睛干涩吗？",
            "双目少津，视物易感疲劳",
            "双目滞涩不爽，视物常模糊",
            "双目干燥，昏暗不明"
        )
    )
    questions.add(
        Question(
            "心悸气短",
            "心慌或自觉心脏跳动不适吗？",
            "偶尔发生，不适感轻微，气力不足",
            "时有发生，持续时间较长，不适感较明显，体虚气短",
            "经常发生，惕惕而动，难以平静，甚则影响生活，语声低微、断续，或无力言语"
        )
    )
    questions.add(
        Question(
            "畏寒肢冷",
            "手脚怕冷？跟身边的人比起来穿的多吗？",
            "手足有时怕冷，不影响衣着，遇风出现",
            "经常四肢怕冷，比一般人明显，夜晚出现",
            "全身明显怕冷，着衣常较人差一季节"
        )
    )
    questions.add(
        Question(
            "面浮肢肿",
            "有颜面、下肢浮肿吗？",
            "晨起颜面浮肿",
            "颜面及双下肢水肿",
            "全身水肿"
        )
    )
    questions.add(
        Question(
            "下肢浮肿",
            "双下肢有没有水肿啊",
            "水肿至脚踝",
            "水肿至胫部",
            "全下肢水肿"
        )
    )
    questions.add(
        Question(
            "胫酸腿软",
            "小腿酸吗？",
            "腿微酸，揉按可止",
            "腿酸持续，不欲行走",
            "严重腿酸，影响行走"
        )
    )
    questions.add(
        Question(
            "腰痛",
            "腰痛吗？",
            "腰痛隐隐，偶有发作",
            "腰痛较重，转侧不利",
            "腰部刺痛难忍"
        )
    )
    questions.add(
        Question(
            "心烦失眠",
            "心里烦躁睡觉不好吗",
            "睡眠易醒、或睡而不实、晨醒过早，不影响工作",
            "每日睡眠少于4小时，但能坚持正常工作",
            "彻夜不眠，难以坚持正常工作"
        )
    )
    questions.add(
        Question(
            "纳差腹胀",
            "胃口怎么样？饭后肚子胀吗？",
            "食欲欠佳，口味不香，食量减少不超过1/4，偶有肚子胀",
            "食欲不振，口味不香，食量减少1/4~1/2，时有肚子胀",
            "食欲甚差，无饥饿感，食量减少1/2以上，经常肚子胀"
        )
    )
    questions.add(
        Question(
            "肢体麻木",
            "胳膊腿都麻不麻，身上还有其他地方麻吗？",
            "手足麻木",
            "四肢麻木",
            "全身麻木"
        )
    )
    questions.add(
        Question(
            "四肢倦怠",
            "四肢感觉疲乏吗？",
            "四肢稍倦",
            "四肢倦怠，不欲行动",
            "四肢十分倦怠，难于行动"
        )
    )
    questions.add(
        Question(
            "月经不调",
            "月经规律吗？",
            "偶有不规律",
            "时常不规律",
            "总是不规律"
        )
    )
    questions.add(
        Question(
            "恶心呕吐",
            "平常有没有觉得恶心、想吐？觉得恶心一天能有几次？吐了吗，吐了几次？",
            "每日泛恶呕吐1~2次",
            "每日泛恶呕吐3~4次",
            "频繁泛恶呕吐，每日4次以上"
        )
    )
    questions.add(
        Question(
            "瘀点或瘀斑",
            "身上有瘀点或瘀斑吗？",
            "少许瘀点或瘀斑",
            "部分瘀点或瘀斑",
            "大量瘀点或瘀斑"
        )
    )
    questions.add(
        Question(
            "大便干燥",
            "大便成形吗？一天几次/几天1次？",
            "大便干燥，每日一行",
            "大便秘结，两日一行",
            "大便秘结，数日一行"
        )
    )
    questions.add(
        Question(
            "大便稀溏",
            "大便成形吗？一天几次/几天1次？",
            "大便不成型，1日1次",
            "大便不成型，1日2次",
            "大便不成型，1日3次"
        )
    )
    questions.add(
        Question(
            "纳呆便溏",
            "食欲怎么样？大便成形吗？一天几次/几天1次？",
            "食欲欠佳，口味不香，食量减少不超过1/4，大便不成型，1日1次",
            "食欲不振，口味不香，食量减少1/4~1/2，大便不成型，1日2次",
            "食欲甚差，无饥饿感，食量减少1/2以上，大便不成型，1日3次"
        )
    )
    questions.add(
        Question(
            "肢关疼痛",
            "有四肢关节疼痛吗？",
            "轻微四肢关节疼痛，不影响行动",
            "四肢关节疼痛，不欲行动",
            "四肢关节疼痛明显，严重影响行动"
        )
    )
    questions.add(
        Question(
            "头重如裹",
            "有没有头部沉重有如被包裹感？",
            "轻微头部沉重有如被包裹感",
            "明显头部沉重有如被包裹感",
            "严重头部沉重有如被包裹感"
        )
    )
    questions.add(
        Question(
            "疖肿创疡",
            "身上有没有红肿或者化脓性包块？范围，数目？",
            "有1-2个疖肿",
            "有2-3个疖肿",
            "有3个以上疖肿或者创疡"
        )
    )
    questions.add(
        Question(
            "皮肤瘙痒",
            "身上痒不痒？",
            "能忍受，不影响正常生活",
            "不能忍受，有抓痕",
            "不能忍受，抓破出血"
        )
    )
    questions.add(
        Question(
            "皮肤干燥",
            "皮肤干不干燥啊？",
            "轻度皮肤干燥",
            "皮肤干裂",
            "皮肤干燥褪皮"
        )
    )
    questions.add(
        Question(
            "咳嗽胸闷",
            "有没有咳嗽胸闷啊？",
            "偶有咳嗽，轻微胸闷",
            "时常咳嗽，胸闷明显，有时叹息样呼吸",
            "总是咳嗽，胸闷如窒，叹息不止"
        )
    )
    questions.add(
        Question(
            "小便黄赤",
            "小便黄吗？",
            "小便色微黄",
            "小便色黄",
            "小便色深黄"
        )
    )
    questions.add(
        Question(
            "小便清长",
            "小便颜色深不深？一晚上起夜几次？",
            "夜尿量多色白，每夜2次",
            "夜尿量多色白，每夜3-4次",
            "夜尿量多色白，每夜5次以上"
        )
    )
    questions.add(
        Question(
            "夜尿增多",
            "夜间尿量多少呢？和日间尿量相比？",
            "夜间尿量和日间相等",
            "夜间尿量增加比日间多500ml",
            "夜间尿量增加比日间多1000ml"
        )
    )
    questions.add(
        Question(
            "午后低热",
            "午后觉得低热吗？",
            "偶有低热",
            "时有低热",
            "经常低热"
        )
    )
    questions.add(
        Question(
            "身热无汗",
            "有没有觉得身上发热啊，出汗吗？",
            "微有身热无汗出",
            "身热无汗出",
            "显著身热无汗出"
        )
    )
    questions.add(
        Question(
            "肾区灼热",
            "后腰部灼热感？",
            "后腰部灼热不甚",
            "后腰部灼热",
            "后腰部灼热难忍"
        )
    )
    questions.add(
        Question(
            "发热恶寒",
            "有没有发热怕冷？",
            "微有发热恶寒",
            "发热恶寒",
            "显著发热恶寒"
        )
    )
    return questions;
}