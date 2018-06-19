package me.notanullpointer.xc2editor.save;

public enum PouchEffect {

    EFFECT_1(1, "+8% max HP to dmg barrier", "", ""),
    EFFECT_2(2, "+10% max HP to dmg barrier", "", ""),
    EFFECT_3(3, "+20% max HP to dmg barrier", "", ""),
    EFFECT_4(4, "+15% max HP to dmg barrier", "", ""),
    EFFECT_5(5, "+15% max HP to dmg barrier", "+5% HP recovery", ""),
    EFFECT_6(6, "+25% max HP to dmg barrier", "+20% Party Gauge gain", "+8% HP recovery"),
    EFFECT_7(7, "-3% ether dmg taken", "", ""),
    EFFECT_8(8, "-4% ether dmg taken", "", ""),
    EFFECT_9(9, "-4% ether dmg taken", "+5% HP recovery", "+8% Party Gauge gain"),
    EFFECT_10(10, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_11(11, "Recharges Arts by 0.2 each second.", "", ""),
    EFFECT_12(12, "Recharges Arts by 0.3 each second.", "", ""),
    EFFECT_13(13, "Recharges Arts by 0.3 each second.", "-2% physical dmg taken", ""),
    EFFECT_14(14, "Recharges Arts by 0.4 each second.", "-4% physical dmg taken", "-3% ether dmg taken"),
    EFFECT_15(15, "+8% Party Gauge gain", "", ""),
    EFFECT_16(16, "+10% Party Gauge gain", "", ""),
    EFFECT_17(17, "+15% Party Gauge gain", "", ""),
    EFFECT_18(18, "+25% Party Gauge gain", "+8% HP recovery", ""),
    EFFECT_19(19, "+25% Party Gauge gain", "-5% ether dmg taken", ""),
    EFFECT_20(20, "+30% Party Gauge gain", "+25% max HP to dmg barrier", ""),
    EFFECT_21(21, "Specials recharge 0.3 each second.", "", ""),
    EFFECT_22(22, "Specials recharge 0.5 each second.", "", ""),
    EFFECT_23(23, "Specials recharge 0.8 each second.", "", ""),
    EFFECT_24(24, "Specials recharge 1 each second.", "", ""),
    EFFECT_25(25, "Specials recharge 0.8 each second.", "+6% Affinity gain", ""),
    EFFECT_26(26, "Specials recharge 2 each second.", "-13% Affinity loss", ""),
    EFFECT_27(27, "+6% dmg dealt by Specials", "", ""),
    EFFECT_28(28, "+8% dmg dealt by Specials", "", ""),
    EFFECT_29(29, "+12% dmg dealt by Specials", "", ""),
    EFFECT_30(30, "+12% dmg dealt by Specials", "Specials recharge 0.3 each second.", ""),
    EFFECT_31(31, "+16% dmg dealt by Specials", "+10% Affinity gain", ""),
    EFFECT_32(32, "+4% Blade Arts effect", "", ""),
    EFFECT_33(33, "+8% Blade Arts effect", "", ""),
    EFFECT_34(34, "+14% Blade Arts effect", "", ""),
    EFFECT_35(35, "+20% Blade Arts effect", "", ""),
    EFFECT_36(36, "+14% Blade Arts effect", "Specials recharge 0.5 each second.", ""),
    EFFECT_37(37, "+20% Blade Arts effect", "+6% Affinity gain", "Specials recharge 0.5 each second."),
    EFFECT_38(38, "+50 base Affinity", "", ""),
    EFFECT_39(39, "+75 base Affinity", "", ""),
    EFFECT_40(40, "+100 base Affinity", "", ""),
    EFFECT_41(41, "+125 base Affinity", "", ""),
    EFFECT_42(42, "+100 base Affinity", "+5% Affinity gain", ""),
    EFFECT_43(43, "+125 base Affinity", "+12% dmg dealt by Specials", "-5% Affinity loss"),
    EFFECT_44(44, "+8% max HP to dmg barrier", "", ""),
    EFFECT_45(45, "+10% max HP to dmg barrier", "", ""),
    EFFECT_46(46, "+15% max HP to dmg barrier", "", ""),
    EFFECT_47(47, "+15% max HP to dmg barrier", "-2% physical dmg taken", ""),
    EFFECT_48(48, "+20% max HP to dmg barrier", "-5% ether dmg taken", ""),
    EFFECT_49(49, "+4% HP recovery", "", ""),
    EFFECT_50(50, "+5% HP recovery", "", ""),
    EFFECT_51(51, "+8% HP recovery", "", ""),
    EFFECT_52(52, "+8% HP recovery", "+8% max HP to dmg barrier", ""),
    EFFECT_53(53, "+13% HP recovery", "+20% Party Gauge gain", "+15% max HP to dmg barrier"),
    EFFECT_54(54, "-3% physical dmg taken", "", ""),
    EFFECT_55(55, "-2% physical dmg taken", "", ""),
    EFFECT_56(56, "-4% physical dmg taken", "+10% Party Gauge gain", ""),
    EFFECT_57(57, "-7% physical dmg taken", "-5% ether dmg taken", "+15% Party Gauge gain"),
    EFFECT_58(58, "-3% ether dmg taken", "", ""),
    EFFECT_59(59, "-4% ether dmg taken", "", ""),
    EFFECT_60(60, "-5% ether dmg taken", "+15% max HP to dmg barrier", "Recharges Arts by 0.2 each second."),
    EFFECT_61(61, "+8% Party Gauge gain", "", ""),
    EFFECT_62(62, "+10% Party Gauge gain", "", ""),
    EFFECT_63(63, "+15% Party Gauge gain", "", ""),
    EFFECT_64(64, "+15% Party Gauge gain", "-3% ether dmg taken", ""),
    EFFECT_65(65, "+20% Party Gauge gain", "Recharges Arts by 0.3 each second.", "+5% HP recovery"),
    EFFECT_66(66, "Specials recharge 0.3 each second.", "", ""),
    EFFECT_67(67, "Specials recharge 0.5 each second.", "", ""),
    EFFECT_68(68, "Specials recharge 0.8 each second.", "", ""),
    EFFECT_69(69, "Specials recharge 0.8 each second.", "+8% Blade Arts effect", ""),
    EFFECT_70(70, "Specials recharge 1 each second.", "+12% dmg dealt by Specials", "+5% Affinity gain"),
    EFFECT_71(71, "+4% Affinity gain", "", ""),
    EFFECT_72(72, "+5% Affinity gain", "", ""),
    EFFECT_73(73, "+6% Affinity gain", "+4% Blade Arts effect", ""),
    EFFECT_74(74, "+10% Affinity gain", "+14% Blade Arts effect", "-5% Affinity loss"),
    EFFECT_75(75, "+50 base Affinity", "", ""),
    EFFECT_76(76, "+75 base Affinity", "", ""),
    EFFECT_77(77, "+100 base Affinity", "", ""),
    EFFECT_78(78, "+100 base Affinity", "-6% Affinity loss", ""),
    EFFECT_79(79, "+175 base Affinity", "Specials recharge 1.5 each second.", ""),
    EFFECT_80(80, "-4% Affinity loss", "", ""),
    EFFECT_81(81, "-5% Affinity loss", "", ""),
    EFFECT_82(82, "-6% Affinity loss", "", ""),
    EFFECT_83(83, "-10% Affinity loss", "", ""),
    EFFECT_84(84, "-6% Affinity loss", "Specials recharge 0.8 each second.", ""),
    EFFECT_85(85, "-13% Affinity loss", "+10% Affinity gain", "+100 base Affinity"),
    EFFECT_86(86, "+10% max HP to dmg barrier", "", ""),
    EFFECT_87(87, "+15% max HP to dmg barrier", "", ""),
    EFFECT_88(88, "+15% max HP to dmg barrier", "Recharges Arts by 0.1 each second.", ""),
    EFFECT_89(89, "+20% max HP to dmg barrier", "Recharges Arts by 0.3 each second.", "-3% physical dmg taken"),
    EFFECT_90(90, "+5% HP recovery", "", ""),
    EFFECT_91(91, "+8% HP recovery", "", ""),
    EFFECT_92(92, "+8% HP recovery", "-3% physical dmg taken", ""),
    EFFECT_93(93, "+10% HP recovery", "Recharges Arts by 0.3 each second.", "-3% ether dmg taken"),
    EFFECT_94(94, "-3% physical dmg taken", "", ""),
    EFFECT_95(95, "-4% physical dmg taken", "", ""),
    EFFECT_96(96, "-4% physical dmg taken", "Recharges Arts by 0.2 each second.", ""),
    EFFECT_97(97, "-7% physical dmg taken", "Recharges Arts by 0.4 each second.", "+8% HP recovery"),
    EFFECT_98(98, "-3% ether dmg taken", "", ""),
    EFFECT_99(99, "-4% ether dmg taken", "", ""),
    EFFECT_100(100, "-4% ether dmg taken", "-2% physical dmg taken", ""),
    EFFECT_101(101, "-5% ether dmg taken", "+15% Party Gauge gain", "-3% physical dmg taken"),
    EFFECT_102(102, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_103(103, "Recharges Arts by 0.3 each second.", "", ""),
    EFFECT_104(104, "Recharges Arts by 0.3 each second.", "+8% HP recovery", ""),
    EFFECT_105(105, "Recharges Arts by 0.2 each second.", "", ""),
    EFFECT_106(106, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_107(107, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_108(108, "Recharges Arts by 0.3 each second.", "", ""),
    EFFECT_109(109, "Recharges Arts by 0.3 each second.", "-3% physical dmg taken", ""),
    EFFECT_110(110, "Recharges Arts by 0.3 each second.", "-4% ether dmg taken", ""),
    EFFECT_111(111, "+10% Party Gauge gain", "", ""),
    EFFECT_112(112, "+15% Party Gauge gain", "", ""),
    EFFECT_113(113, "+15% Party Gauge gain", "Recharges Arts by 0.1 each second.", ""),
    EFFECT_114(114, "+25% Party Gauge gain", "+10% HP recovery", "+15% max HP to dmg barrier"),
    EFFECT_115(115, "Specials recharge 0.3 each second.", "", ""),
    EFFECT_116(116, "Specials recharge 0.5 each second.", "", ""),
    EFFECT_117(117, "Specials recharge 0.8 each second.", "", ""),
    EFFECT_118(118, "Specials recharge 0.8 each second.", "+6% dmg dealt by Specials", ""),
    EFFECT_119(119, "Specials recharge 1 each second.", "+125 base Affinity", ""),
    EFFECT_120(120, "+5% Affinity gain", "", ""),
    EFFECT_121(121, "+6% Affinity gain", "", ""),
    EFFECT_122(122, "+6% Affinity gain", "+12% dmg dealt by Specials", ""),
    EFFECT_123(123, "+13% Affinity gain", "+125 base Affinity", "+14% Blade Arts effect"),
    EFFECT_124(124, "+8% dmg dealt by Specials", "", ""),
    EFFECT_125(125, "+12% dmg dealt by Specials", "", ""),
    EFFECT_126(126, "+12% dmg dealt by Specials", "-5% Affinity loss", ""),
    EFFECT_127(127, "+16% dmg dealt by Specials", "+14% Blade Arts effect", "-5% Affinity loss"),
    EFFECT_128(128, "+4% Blade Arts effect", "", ""),
    EFFECT_129(129, "+8% Blade Arts effect", "", ""),
    EFFECT_130(130, "+14% Blade Arts effect", "", ""),
    EFFECT_131(131, "+20% Blade Arts effect", "", ""),
    EFFECT_132(132, "+14% Blade Arts effect", "Specials recharge 0.3 each second.", ""),
    EFFECT_133(133, "+26% Blade Arts effect", "-10% Affinity loss", "+100 base Affinity"),
    EFFECT_134(134, "+75 base Affinity", "", ""),
    EFFECT_135(135, "+100 base Affinity", "", ""),
    EFFECT_136(136, "+125 base Affinity", "", ""),
    EFFECT_137(137, "+100 base Affinity", "Specials recharge 0.3 each second.", ""),
    EFFECT_138(138, "+125 base Affinity", "+20% Blade Arts effect", ""),
    EFFECT_139(139, "-4% Affinity loss", "", ""),
    EFFECT_140(140, "-5% Affinity loss", "", ""),
    EFFECT_141(141, "-6% Affinity loss", "", ""),
    EFFECT_142(142, "-10% Affinity loss", "", ""),
    EFFECT_143(143, "-6% Affinity loss", "+8% dmg dealt by Specials", ""),
    EFFECT_144(144, "-10% Affinity loss", "+14% Blade Arts effect", "+5% Affinity gain"),
    EFFECT_145(145, "+5% HP recovery", "", ""),
    EFFECT_146(146, "+8% HP recovery", "", ""),
    EFFECT_147(147, "+8% HP recovery", "-2% ether dmg taken", ""),
    EFFECT_148(148, "+10% HP recovery", "-4% ether dmg taken", "-3% physical dmg taken"),
    EFFECT_149(149, "-3% physical dmg taken", "", ""),
    EFFECT_150(150, "-4% physical dmg taken", "", ""),
    EFFECT_151(151, "-5% physical dmg taken", "", ""),
    EFFECT_152(152, "-4% physical dmg taken", "-2% ether dmg taken", ""),
    EFFECT_153(153, "-5% physical dmg taken", "+10% HP recovery", ""),
    EFFECT_154(154, "-4% ether dmg taken", "", ""),
    EFFECT_155(155, "-5% ether dmg taken", "", ""),
    EFFECT_156(156, "-4% ether dmg taken", "Recharges Arts by 0.2 each second.", ""),
    EFFECT_157(157, "-7% ether dmg taken", "Recharges Arts by 0.4 each second.", "+8% HP recovery"),
    EFFECT_158(158, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_159(159, "Recharges Arts by 0.2 each second.", "", ""),
    EFFECT_160(160, "Recharges Arts by 0.3 each second.", "", ""),
    EFFECT_161(161, "Recharges Arts by 0.3 each second.", "", ""),
    EFFECT_162(162, "Recharges Arts by 0.3 each second.", "+15% max HP to dmg barrier", ""),
    EFFECT_163(163, "Recharges Arts by 0.4 each second.", "+15% Party Gauge gain", "-3% physical dmg taken"),
    EFFECT_164(164, "Specials recharge 0.5 each second.", "", ""),
    EFFECT_165(165, "Specials recharge 0.8 each second.", "", ""),
    EFFECT_166(166, "Specials recharge 1 each second.", "", ""),
    EFFECT_167(167, "Specials recharge 1.5 each second.", "", ""),
    EFFECT_168(168, "Specials recharge 0.8 each second.", "-4% Affinity loss", ""),
    EFFECT_169(169, "Specials recharge 1 each second.", "+14% Blade Arts effect", "-5% Affinity loss"),
    EFFECT_170(170, "+5% Affinity gain", "", ""),
    EFFECT_171(171, "+6% Affinity gain", "", ""),
    EFFECT_172(172, "+6% Affinity gain", "-4% Affinity loss", ""),
    EFFECT_173(173, "+10% Affinity gain", "+125 base Affinity", ""),
    EFFECT_174(174, "+8% dmg dealt by Specials", "", ""),
    EFFECT_175(175, "+12% dmg dealt by Specials", "", ""),
    EFFECT_176(176, "+16% dmg dealt by Specials", "", ""),
    EFFECT_177(177, "+16% dmg dealt by Specials", "", ""),
    EFFECT_178(178, "+12% dmg dealt by Specials", "+75 base Affinity", ""),
    EFFECT_179(179, "+16% dmg dealt by Specials", "+100 base Affinity", "Specials recharge 0.5 each second."),
    EFFECT_180(180, "+8% Blade Arts effect", "", ""),
    EFFECT_181(181, "+14% Blade Arts effect", "", ""),
    EFFECT_182(182, "+20% Blade Arts effect", "", ""),
    EFFECT_183(183, "+26% Blade Arts effect", "", ""),
    EFFECT_184(184, "+14% Blade Arts effect", "+75 base Affinity", ""),
    EFFECT_185(185, "+32% Blade Arts effect", "+20% dmg dealt by Specials", ""),
    EFFECT_186(186, "+5% HP recovery", "", ""),
    EFFECT_187(187, "+8% HP recovery", "", ""),
    EFFECT_188(188, "+10% HP recovery", "", ""),
    EFFECT_189(189, "+8% HP recovery", "Recharges Arts by 0.1 each second.", ""),
    EFFECT_190(190, "+13% HP recovery", "-5% physical dmg taken", "+15% Party Gauge gain"),
    EFFECT_191(191, "-2% physical dmg taken", "", ""),
    EFFECT_192(192, "-3% physical dmg taken", "", ""),
    EFFECT_193(193, "-4% physical dmg taken", "", ""),
    EFFECT_194(194, "-5% physical dmg taken", "", ""),
    EFFECT_195(195, "-4% physical dmg taken", "+8% max HP to dmg barrier", ""),
    EFFECT_196(196, "-5% physical dmg taken", "Recharges Arts by 0.4 each second.", ""),
    EFFECT_197(197, "-4% ether dmg taken", "", ""),
    EFFECT_198(198, "-5% ether dmg taken", "", ""),
    EFFECT_199(199, "-5% ether dmg taken", "-5% physical dmg taken", ""),
    EFFECT_200(200, "-4% ether dmg taken", "+10% Party Gauge gain", ""),
    EFFECT_201(201, "-7% ether dmg taken", "-5% physical dmg taken", "+15% max HP to dmg barrier"),
    EFFECT_202(202, "+10% Party Gauge gain", "", ""),
    EFFECT_203(203, "+15% Party Gauge gain", "", ""),
    EFFECT_204(204, "+20% Party Gauge gain", "", ""),
    EFFECT_205(205, "+15% Party Gauge gain", "-3% physical dmg taken", ""),
    EFFECT_206(206, "+20% Party Gauge gain", "-4% ether dmg taken", "-3% physical dmg taken"),
    EFFECT_207(207, "+6% Affinity gain", "", ""),
    EFFECT_208(208, "+10% Affinity gain", "", ""),
    EFFECT_209(209, "+6% Affinity gain", "+8% Blade Arts effect", ""),
    EFFECT_210(210, "+10% Affinity gain", "Specials recharge 0.8 each second.", "+8% dmg dealt by Specials"),
    EFFECT_211(211, "-5% Affinity loss", "", ""),
    EFFECT_212(212, "-6% Affinity loss", "", ""),
    EFFECT_213(213, "-10% Affinity loss", "", ""),
    EFFECT_214(214, "-13% Affinity loss", "", ""),
    EFFECT_215(215, "-6% Affinity loss", "+50 base Affinity", ""),
    EFFECT_216(216, "-10% Affinity loss", "+20% Blade Arts effect", ""),
    EFFECT_217(217, "+15% max HP to dmg barrier", "", ""),
    EFFECT_218(218, "+20% max HP to dmg barrier", "", ""),
    EFFECT_219(219, "+15% max HP to dmg barrier", "+8% Party Gauge gain", ""),
    EFFECT_220(220, "+20% max HP to dmg barrier", "-4% ether dmg taken", "Recharges Arts by 0.2 each second."),
    EFFECT_221(221, "+10% HP recovery", "", ""),
    EFFECT_222(222, "+13% HP recovery", "", ""),
    EFFECT_223(223, "+8% HP recovery", "+10% Party Gauge gain", ""),
    EFFECT_224(224, "+15% HP recovery", "+25% max HP to dmg barrier", ""),
    EFFECT_225(225, "-5% ether dmg taken", "", ""),
    EFFECT_226(226, "-7% ether dmg taken", "", ""),
    EFFECT_227(227, "-4% ether dmg taken", "+8% max HP to dmg barrier", ""),
    EFFECT_228(228, "-5% ether dmg taken", "+10% HP recovery", ""),
    EFFECT_229(229, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_230(230, "Recharges Arts by 0.2 each second.", "", ""),
    EFFECT_231(231, "Recharges Arts by 0.3 each second.", "", ""),
    EFFECT_232(232, "Recharges Arts by 0.4 each second.", "", ""),
    EFFECT_233(233, "Recharges Arts by 0.2 each second.", "+8% Party Gauge gain", ""),
    EFFECT_234(234, "Recharges Arts by 0.3 each second.", "+5% HP recovery", "+8% max HP to dmg barrier"),
    EFFECT_235(235, "+6% Affinity gain", "", ""),
    EFFECT_236(236, "+10% Affinity gain", "", ""),
    EFFECT_237(237, "+13% Affinity gain", "", ""),
    EFFECT_238(238, "+8% dmg dealt by Specials", "", ""),
    EFFECT_239(239, "+12% dmg dealt by Specials", "", ""),
    EFFECT_240(240, "+16% dmg dealt by Specials", "", ""),
    EFFECT_241(241, "+20% dmg dealt by Specials", "", ""),
    EFFECT_242(242, "+12% dmg dealt by Specials", "+8% Blade Arts effect", ""),
    EFFECT_243(243, "+24% dmg dealt by Specials", "+13% Affinity gain", ""),
    EFFECT_244(244, "+14% Blade Arts effect", "", ""),
    EFFECT_245(245, "+20% Blade Arts effect", "", ""),
    EFFECT_246(246, "+26% Blade Arts effect", "", ""),
    EFFECT_247(247, "+14% Blade Arts effect", "Specials recharge 0.3 each second.", ""),
    EFFECT_248(248, "+20% Blade Arts effect", "+10% Affinity gain", "-0% Affinity loss"),
    EFFECT_249(249, "+100 base Affinity", "", ""),
    EFFECT_250(250, "+125 base Affinity", "", ""),
    EFFECT_251(251, "+150 base Affinity", "", ""),
    EFFECT_252(252, "+100 base Affinity", "+4% Blade Arts effect", ""),
    EFFECT_253(253, "+125 base Affinity", "+6% Affinity gain", "+8% dmg dealt by Specials"),
    EFFECT_254(254, "-5% Affinity loss", "", ""),
    EFFECT_255(255, "-6% Affinity loss", "", ""),
    EFFECT_256(256, "-10% Affinity loss", "", ""),
    EFFECT_257(257, "-13% Affinity loss", "", ""),
    EFFECT_258(258, "-6% Affinity loss", "+6% Affinity gain", ""),
    EFFECT_259(259, "-13% Affinity loss", "Specials recharge 1 each second.", "+12% dmg dealt by Specials"),
    EFFECT_260(260, "+15% max HP to dmg barrier", "", ""),
    EFFECT_261(261, "+25% max HP to dmg barrier", "+8% HP recovery", ""),
    EFFECT_262(262, "+8% HP recovery", "", ""),
    EFFECT_263(263, "+13% HP recovery", "+20% max HP to dmg barrier", ""),
    EFFECT_264(264, "-4% physical dmg taken", "", ""),
    EFFECT_265(265, "-7% physical dmg taken", "-7% ether dmg taken", ""),
    EFFECT_266(266, "-7% physical dmg taken", "+20% Party Gauge gain", "+8% HP recovery"),
    EFFECT_267(267, "-9% physical dmg taken", "+13% HP recovery", ""),
    EFFECT_268(268, "-9% ether dmg taken", "-7% physical dmg taken", ""),
    EFFECT_269(269, "+15% max HP to dmg barrier", "", ""),
    EFFECT_270(270, "+15% max HP to dmg barrier", "-2% ether dmg taken", ""),
    EFFECT_271(271, "+20% max HP to dmg barrier", "Recharges Arts by 0.3 each second.", ""),
    EFFECT_272(272, "+25% max HP to dmg barrier", "-7% physical dmg taken", ""),
    EFFECT_273(273, "-7% physical dmg taken", "", ""),
    EFFECT_274(274, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_275(275, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_276(276, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_277(277, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_278(278, "Recharges Arts by 0.5 each second.", "+25% max HP to dmg barrier", ""),
    EFFECT_279(279, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_280(280, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_281(281, "Recharges Arts by 0.4 each second.", "-4% ether dmg taken", "+5% HP recovery"),
    EFFECT_282(282, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_283(283, "Recharges Arts by 0.2 each second.", "", ""),
    EFFECT_284(284, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_285(285, "Recharges Arts by 0.1 each second.", "", ""),
    EFFECT_286(286, "+8% Party Gauge gain", "", ""),
    EFFECT_287(287, "+8% Party Gauge gain", "", ""),
    EFFECT_288(288, "+8% Party Gauge gain", "", ""),
    EFFECT_289(289, "+8% Party Gauge gain", "", ""),
    EFFECT_290(290, "+5% Affinity gain", "+50 base Affinity", ""),
    EFFECT_291(291, "+10% Affinity gain", "+12% dmg dealt by Specials", ""),
    EFFECT_292(292, "+10% Affinity gain", "-6% Affinity loss", ""),
    EFFECT_293(293, "+13% Affinity gain", "Specials recharge 1.5 each second.", ""),
    EFFECT_294(294, "+17% Affinity gain", "Specials recharge 1.5 each second.", ""),
    EFFECT_295(295, "-5% physical dmg taken", "+15% Party Gauge gain", ""),
    EFFECT_296(296, "Recharges Arts by 0.3 each second.", "", ""),
    EFFECT_297(297, "+12% dmg dealt by Specials", "", ""),
    EFFECT_298(298, "+24% dmg dealt by Specials", "", ""),
    EFFECT_299(299, "-5% physical dmg taken", "", ""),
    EFFECT_300(300, "+8% Blade Arts effect", "", ""),
    EFFECT_301(301, "+20% max HP to dmg barrier", "", ""),
    EFFECT_302(302, "+10% Affinity gain", "", ""),
    EFFECT_303(303, "+25% max HP to dmg barrier", "", ""),
    EFFECT_304(304, "+20% max HP to dmg barrier", "", ""),
    EFFECT_305(305, "+30% max HP to dmg barrier", "-7% physical dmg taken", ""),
    EFFECT_306(306, "Recharges Arts by 0.2 each second.", "", ""),
    EFFECT_307(307, "-5% Affinity loss", "Specials recharge 0.3 each second.", ""),
    EFFECT_308(308, "-6% Affinity loss", "+8% dmg dealt by Specials", ""),
    EFFECT_309(309, "-10% Affinity loss", "Specials recharge 0.8 each second.", ""),
    EFFECT_310(310, "-13% Affinity loss", "+16% dmg dealt by Specials", ""),
    EFFECT_311(311, "-17% Affinity loss", "Specials recharge 1.5 each second.", ""),
    EFFECT_312(312, "-9% ether dmg taken", "-7% physical dmg taken", "+20% max HP to dmg barrier"),
    EFFECT_313(313, "-17% Affinity loss", "Specials recharge 1.5 each second.", "+10% Affinity gain"),
    EFFECT_314(314, "+15% Party Gauge gain", "", "");

    private int id;
    private String buff1, buff2, buff3;

    PouchEffect(int id, String buff1, String buff2, String buff3) {
        this.id = id;
        this.buff1 = buff1;
        this.buff2 = buff2;
        this.buff3 = buff3;
    }

    public static PouchEffect fromId(int id) {
        for (PouchEffect pouchEffect:values()) {
            if(id == pouchEffect.id)
                return pouchEffect;
        }
        return null;
    }

    public String getEffect1() {
        return buff1;
    }

    public String getEffect2() {
        return buff2;
    }

    public String getEffect3() {
        return buff3;
    }
}
