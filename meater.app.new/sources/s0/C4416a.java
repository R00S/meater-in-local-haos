package s0;

import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.TemperatureLog;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: Key.android.kt */
@Aa.b
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Ls0/a;", "", "", "keyCode", "n", "(J)J", "", "r", "(J)Ljava/lang/String;", "", "q", "(J)I", "other", "", "o", "(JLjava/lang/Object;)Z", "a", "J", "getKeyCode", "()J", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4416a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long keyCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f48906c = f.a(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f48912d = f.a(1);

    /* renamed from: e, reason: collision with root package name */
    private static final long f48918e = f.a(2);

    /* renamed from: f, reason: collision with root package name */
    private static final long f48924f = f.a(3);

    /* renamed from: g, reason: collision with root package name */
    private static final long f48930g = f.a(4);

    /* renamed from: h, reason: collision with root package name */
    private static final long f48936h = f.a(259);

    /* renamed from: i, reason: collision with root package name */
    private static final long f48942i = f.a(260);

    /* renamed from: j, reason: collision with root package name */
    private static final long f48948j = f.a(261);

    /* renamed from: k, reason: collision with root package name */
    private static final long f48954k = f.a(262);

    /* renamed from: l, reason: collision with root package name */
    private static final long f48960l = f.a(263);

    /* renamed from: m, reason: collision with root package name */
    private static final long f48966m = f.a(280);

    /* renamed from: n, reason: collision with root package name */
    private static final long f48972n = f.a(281);

    /* renamed from: o, reason: collision with root package name */
    private static final long f48978o = f.a(282);

    /* renamed from: p, reason: collision with root package name */
    private static final long f48984p = f.a(283);

    /* renamed from: q, reason: collision with root package name */
    private static final long f48990q = f.a(5);

    /* renamed from: r, reason: collision with root package name */
    private static final long f48996r = f.a(6);

    /* renamed from: s, reason: collision with root package name */
    private static final long f49002s = f.a(19);

    /* renamed from: t, reason: collision with root package name */
    private static final long f49008t = f.a(20);

    /* renamed from: u, reason: collision with root package name */
    private static final long f49014u = f.a(21);

    /* renamed from: v, reason: collision with root package name */
    private static final long f49020v = f.a(22);

    /* renamed from: w, reason: collision with root package name */
    private static final long f49026w = f.a(23);

    /* renamed from: x, reason: collision with root package name */
    private static final long f49032x = f.a(268);

    /* renamed from: y, reason: collision with root package name */
    private static final long f49038y = f.a(269);

    /* renamed from: z, reason: collision with root package name */
    private static final long f49044z = f.a(270);

    /* renamed from: A, reason: collision with root package name */
    private static final long f48762A = f.a(271);

    /* renamed from: B, reason: collision with root package name */
    private static final long f48768B = f.a(24);

    /* renamed from: C, reason: collision with root package name */
    private static final long f48774C = f.a(25);

    /* renamed from: D, reason: collision with root package name */
    private static final long f48780D = f.a(26);

    /* renamed from: E, reason: collision with root package name */
    private static final long f48785E = f.a(27);

    /* renamed from: F, reason: collision with root package name */
    private static final long f48790F = f.a(28);

    /* renamed from: G, reason: collision with root package name */
    private static final long f48795G = f.a(7);

    /* renamed from: H, reason: collision with root package name */
    private static final long f48800H = f.a(8);

    /* renamed from: I, reason: collision with root package name */
    private static final long f48805I = f.a(9);

    /* renamed from: J, reason: collision with root package name */
    private static final long f48810J = f.a(10);

    /* renamed from: K, reason: collision with root package name */
    private static final long f48815K = f.a(11);

    /* renamed from: L, reason: collision with root package name */
    private static final long f48820L = f.a(12);

    /* renamed from: M, reason: collision with root package name */
    private static final long f48825M = f.a(13);

    /* renamed from: N, reason: collision with root package name */
    private static final long f48830N = f.a(14);

    /* renamed from: O, reason: collision with root package name */
    private static final long f48835O = f.a(15);

    /* renamed from: P, reason: collision with root package name */
    private static final long f48840P = f.a(16);

    /* renamed from: Q, reason: collision with root package name */
    private static final long f48845Q = f.a(81);

    /* renamed from: R, reason: collision with root package name */
    private static final long f48850R = f.a(69);

    /* renamed from: S, reason: collision with root package name */
    private static final long f48855S = f.a(17);

    /* renamed from: T, reason: collision with root package name */
    private static final long f48860T = f.a(70);

    /* renamed from: U, reason: collision with root package name */
    private static final long f48865U = f.a(18);

    /* renamed from: V, reason: collision with root package name */
    private static final long f48870V = f.a(29);

    /* renamed from: W, reason: collision with root package name */
    private static final long f48875W = f.a(30);

    /* renamed from: X, reason: collision with root package name */
    private static final long f48880X = f.a(31);

    /* renamed from: Y, reason: collision with root package name */
    private static final long f48885Y = f.a(32);

    /* renamed from: Z, reason: collision with root package name */
    private static final long f48890Z = f.a(33);

    /* renamed from: a0, reason: collision with root package name */
    private static final long f48895a0 = f.a(34);

    /* renamed from: b0, reason: collision with root package name */
    private static final long f48901b0 = f.a(35);

    /* renamed from: c0, reason: collision with root package name */
    private static final long f48907c0 = f.a(36);

    /* renamed from: d0, reason: collision with root package name */
    private static final long f48913d0 = f.a(37);

    /* renamed from: e0, reason: collision with root package name */
    private static final long f48919e0 = f.a(38);

    /* renamed from: f0, reason: collision with root package name */
    private static final long f48925f0 = f.a(39);

    /* renamed from: g0, reason: collision with root package name */
    private static final long f48931g0 = f.a(40);

    /* renamed from: h0, reason: collision with root package name */
    private static final long f48937h0 = f.a(41);

    /* renamed from: i0, reason: collision with root package name */
    private static final long f48943i0 = f.a(42);

    /* renamed from: j0, reason: collision with root package name */
    private static final long f48949j0 = f.a(43);

    /* renamed from: k0, reason: collision with root package name */
    private static final long f48955k0 = f.a(44);

    /* renamed from: l0, reason: collision with root package name */
    private static final long f48961l0 = f.a(45);

    /* renamed from: m0, reason: collision with root package name */
    private static final long f48967m0 = f.a(46);

    /* renamed from: n0, reason: collision with root package name */
    private static final long f48973n0 = f.a(47);

    /* renamed from: o0, reason: collision with root package name */
    private static final long f48979o0 = f.a(48);

    /* renamed from: p0, reason: collision with root package name */
    private static final long f48985p0 = f.a(49);

    /* renamed from: q0, reason: collision with root package name */
    private static final long f48991q0 = f.a(50);

    /* renamed from: r0, reason: collision with root package name */
    private static final long f48997r0 = f.a(51);

    /* renamed from: s0, reason: collision with root package name */
    private static final long f49003s0 = f.a(52);

    /* renamed from: t0, reason: collision with root package name */
    private static final long f49009t0 = f.a(53);

    /* renamed from: u0, reason: collision with root package name */
    private static final long f49015u0 = f.a(54);

    /* renamed from: v0, reason: collision with root package name */
    private static final long f49021v0 = f.a(55);

    /* renamed from: w0, reason: collision with root package name */
    private static final long f49027w0 = f.a(56);

    /* renamed from: x0, reason: collision with root package name */
    private static final long f49033x0 = f.a(57);

    /* renamed from: y0, reason: collision with root package name */
    private static final long f49039y0 = f.a(58);

    /* renamed from: z0, reason: collision with root package name */
    private static final long f49045z0 = f.a(59);

    /* renamed from: A0, reason: collision with root package name */
    private static final long f48763A0 = f.a(60);

    /* renamed from: B0, reason: collision with root package name */
    private static final long f48769B0 = f.a(61);

    /* renamed from: C0, reason: collision with root package name */
    private static final long f48775C0 = f.a(62);

    /* renamed from: D0, reason: collision with root package name */
    private static final long f48781D0 = f.a(63);

    /* renamed from: E0, reason: collision with root package name */
    private static final long f48786E0 = f.a(64);

    /* renamed from: F0, reason: collision with root package name */
    private static final long f48791F0 = f.a(65);

    /* renamed from: G0, reason: collision with root package name */
    private static final long f48796G0 = f.a(66);

    /* renamed from: H0, reason: collision with root package name */
    private static final long f48801H0 = f.a(67);

    /* renamed from: I0, reason: collision with root package name */
    private static final long f48806I0 = f.a(112);

    /* renamed from: J0, reason: collision with root package name */
    private static final long f48811J0 = f.a(111);

    /* renamed from: K0, reason: collision with root package name */
    private static final long f48816K0 = f.a(113);

    /* renamed from: L0, reason: collision with root package name */
    private static final long f48821L0 = f.a(114);

    /* renamed from: M0, reason: collision with root package name */
    private static final long f48826M0 = f.a(115);

    /* renamed from: N0, reason: collision with root package name */
    private static final long f48831N0 = f.a(116);

    /* renamed from: O0, reason: collision with root package name */
    private static final long f48836O0 = f.a(117);

    /* renamed from: P0, reason: collision with root package name */
    private static final long f48841P0 = f.a(118);

    /* renamed from: Q0, reason: collision with root package name */
    private static final long f48846Q0 = f.a(119);

    /* renamed from: R0, reason: collision with root package name */
    private static final long f48851R0 = f.a(TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES);

    /* renamed from: S0, reason: collision with root package name */
    private static final long f48856S0 = f.a(121);

    /* renamed from: T0, reason: collision with root package name */
    private static final long f48861T0 = f.a(122);

    /* renamed from: U0, reason: collision with root package name */
    private static final long f48866U0 = f.a(123);

    /* renamed from: V0, reason: collision with root package name */
    private static final long f48871V0 = f.a(124);

    /* renamed from: W0, reason: collision with root package name */
    private static final long f48876W0 = f.a(277);

    /* renamed from: X0, reason: collision with root package name */
    private static final long f48881X0 = f.a(278);

    /* renamed from: Y0, reason: collision with root package name */
    private static final long f48886Y0 = f.a(279);

    /* renamed from: Z0, reason: collision with root package name */
    private static final long f48891Z0 = f.a(68);

    /* renamed from: a1, reason: collision with root package name */
    private static final long f48896a1 = f.a(71);

    /* renamed from: b1, reason: collision with root package name */
    private static final long f48902b1 = f.a(72);

    /* renamed from: c1, reason: collision with root package name */
    private static final long f48908c1 = f.a(76);

    /* renamed from: d1, reason: collision with root package name */
    private static final long f48914d1 = f.a(73);

    /* renamed from: e1, reason: collision with root package name */
    private static final long f48920e1 = f.a(74);

    /* renamed from: f1, reason: collision with root package name */
    private static final long f48926f1 = f.a(75);

    /* renamed from: g1, reason: collision with root package name */
    private static final long f48932g1 = f.a(77);

    /* renamed from: h1, reason: collision with root package name */
    private static final long f48938h1 = f.a(78);

    /* renamed from: i1, reason: collision with root package name */
    private static final long f48944i1 = f.a(79);

    /* renamed from: j1, reason: collision with root package name */
    private static final long f48950j1 = f.a(80);

    /* renamed from: k1, reason: collision with root package name */
    private static final long f48956k1 = f.a(82);

    /* renamed from: l1, reason: collision with root package name */
    private static final long f48962l1 = f.a(83);

    /* renamed from: m1, reason: collision with root package name */
    private static final long f48968m1 = f.a(84);

    /* renamed from: n1, reason: collision with root package name */
    private static final long f48974n1 = f.a(92);

    /* renamed from: o1, reason: collision with root package name */
    private static final long f48980o1 = f.a(93);

    /* renamed from: p1, reason: collision with root package name */
    private static final long f48986p1 = f.a(94);

    /* renamed from: q1, reason: collision with root package name */
    private static final long f48992q1 = f.a(95);

    /* renamed from: r1, reason: collision with root package name */
    private static final long f48998r1 = f.a(96);

    /* renamed from: s1, reason: collision with root package name */
    private static final long f49004s1 = f.a(97);

    /* renamed from: t1, reason: collision with root package name */
    private static final long f49010t1 = f.a(98);

    /* renamed from: u1, reason: collision with root package name */
    private static final long f49016u1 = f.a(99);

    /* renamed from: v1, reason: collision with root package name */
    private static final long f49022v1 = f.a(100);

    /* renamed from: w1, reason: collision with root package name */
    private static final long f49028w1 = f.a(101);

    /* renamed from: x1, reason: collision with root package name */
    private static final long f49034x1 = f.a(102);

    /* renamed from: y1, reason: collision with root package name */
    private static final long f49040y1 = f.a(103);

    /* renamed from: z1, reason: collision with root package name */
    private static final long f49046z1 = f.a(104);

    /* renamed from: A1, reason: collision with root package name */
    private static final long f48764A1 = f.a(Temperature.MAX_INTERNAL_SECOND_GEN_PROBE);

    /* renamed from: B1, reason: collision with root package name */
    private static final long f48770B1 = f.a(106);

    /* renamed from: C1, reason: collision with root package name */
    private static final long f48776C1 = f.a(107);

    /* renamed from: D1, reason: collision with root package name */
    private static final long f48782D1 = f.a(108);

    /* renamed from: E1, reason: collision with root package name */
    private static final long f48787E1 = f.a(109);

    /* renamed from: F1, reason: collision with root package name */
    private static final long f48792F1 = f.a(110);

    /* renamed from: G1, reason: collision with root package name */
    private static final long f48797G1 = f.a(188);

    /* renamed from: H1, reason: collision with root package name */
    private static final long f48802H1 = f.a(189);

    /* renamed from: I1, reason: collision with root package name */
    private static final long f48807I1 = f.a(190);

    /* renamed from: J1, reason: collision with root package name */
    private static final long f48812J1 = f.a(191);

    /* renamed from: K1, reason: collision with root package name */
    private static final long f48817K1 = f.a(192);

    /* renamed from: L1, reason: collision with root package name */
    private static final long f48822L1 = f.a(193);

    /* renamed from: M1, reason: collision with root package name */
    private static final long f48827M1 = f.a(194);

    /* renamed from: N1, reason: collision with root package name */
    private static final long f48832N1 = f.a(195);

    /* renamed from: O1, reason: collision with root package name */
    private static final long f48837O1 = f.a(196);

    /* renamed from: P1, reason: collision with root package name */
    private static final long f48842P1 = f.a(197);

    /* renamed from: Q1, reason: collision with root package name */
    private static final long f48847Q1 = f.a(198);

    /* renamed from: R1, reason: collision with root package name */
    private static final long f48852R1 = f.a(199);

    /* renamed from: S1, reason: collision with root package name */
    private static final long f48857S1 = f.a(200);

    /* renamed from: T1, reason: collision with root package name */
    private static final long f48862T1 = f.a(201);

    /* renamed from: U1, reason: collision with root package name */
    private static final long f48867U1 = f.a(202);

    /* renamed from: V1, reason: collision with root package name */
    private static final long f48872V1 = f.a(203);

    /* renamed from: W1, reason: collision with root package name */
    private static final long f48877W1 = f.a(125);

    /* renamed from: X1, reason: collision with root package name */
    private static final long f48882X1 = f.a(131);

    /* renamed from: Y1, reason: collision with root package name */
    private static final long f48887Y1 = f.a(132);

    /* renamed from: Z1, reason: collision with root package name */
    private static final long f48892Z1 = f.a(133);

    /* renamed from: a2, reason: collision with root package name */
    private static final long f48897a2 = f.a(134);

    /* renamed from: b2, reason: collision with root package name */
    private static final long f48903b2 = f.a(135);

    /* renamed from: c2, reason: collision with root package name */
    private static final long f48909c2 = f.a(ModuleDescriptor.MODULE_VERSION);

    /* renamed from: d2, reason: collision with root package name */
    private static final long f48915d2 = f.a(137);

    /* renamed from: e2, reason: collision with root package name */
    private static final long f48921e2 = f.a(138);

    /* renamed from: f2, reason: collision with root package name */
    private static final long f48927f2 = f.a(139);

    /* renamed from: g2, reason: collision with root package name */
    private static final long f48933g2 = f.a(140);

    /* renamed from: h2, reason: collision with root package name */
    private static final long f48939h2 = f.a(141);

    /* renamed from: i2, reason: collision with root package name */
    private static final long f48945i2 = f.a(142);

    /* renamed from: j2, reason: collision with root package name */
    private static final long f48951j2 = f.a(143);

    /* renamed from: k2, reason: collision with root package name */
    private static final long f48957k2 = f.a(144);

    /* renamed from: l2, reason: collision with root package name */
    private static final long f48963l2 = f.a(145);

    /* renamed from: m2, reason: collision with root package name */
    private static final long f48969m2 = f.a(146);

    /* renamed from: n2, reason: collision with root package name */
    private static final long f48975n2 = f.a(147);

    /* renamed from: o2, reason: collision with root package name */
    private static final long f48981o2 = f.a(148);

    /* renamed from: p2, reason: collision with root package name */
    private static final long f48987p2 = f.a(149);

    /* renamed from: q2, reason: collision with root package name */
    private static final long f48993q2 = f.a(150);

    /* renamed from: r2, reason: collision with root package name */
    private static final long f48999r2 = f.a(151);

    /* renamed from: s2, reason: collision with root package name */
    private static final long f49005s2 = f.a(152);

    /* renamed from: t2, reason: collision with root package name */
    private static final long f49011t2 = f.a(153);

    /* renamed from: u2, reason: collision with root package name */
    private static final long f49017u2 = f.a(154);

    /* renamed from: v2, reason: collision with root package name */
    private static final long f49023v2 = f.a(155);

    /* renamed from: w2, reason: collision with root package name */
    private static final long f49029w2 = f.a(156);

    /* renamed from: x2, reason: collision with root package name */
    private static final long f49035x2 = f.a(157);

    /* renamed from: y2, reason: collision with root package name */
    private static final long f49041y2 = f.a(158);

    /* renamed from: z2, reason: collision with root package name */
    private static final long f49047z2 = f.a(159);

    /* renamed from: A2, reason: collision with root package name */
    private static final long f48765A2 = f.a(160);

    /* renamed from: B2, reason: collision with root package name */
    private static final long f48771B2 = f.a(161);

    /* renamed from: C2, reason: collision with root package name */
    private static final long f48777C2 = f.a(162);

    /* renamed from: D2, reason: collision with root package name */
    private static final long f48783D2 = f.a(163);

    /* renamed from: E2, reason: collision with root package name */
    private static final long f48788E2 = f.a(126);

    /* renamed from: F2, reason: collision with root package name */
    private static final long f48793F2 = f.a(127);

    /* renamed from: G2, reason: collision with root package name */
    private static final long f48798G2 = f.a(85);

    /* renamed from: H2, reason: collision with root package name */
    private static final long f48803H2 = f.a(86);

    /* renamed from: I2, reason: collision with root package name */
    private static final long f48808I2 = f.a(130);

    /* renamed from: J2, reason: collision with root package name */
    private static final long f48813J2 = f.a(87);

    /* renamed from: K2, reason: collision with root package name */
    private static final long f48818K2 = f.a(88);

    /* renamed from: L2, reason: collision with root package name */
    private static final long f48823L2 = f.a(89);

    /* renamed from: M2, reason: collision with root package name */
    private static final long f48828M2 = f.a(90);

    /* renamed from: N2, reason: collision with root package name */
    private static final long f48833N2 = f.a(128);

    /* renamed from: O2, reason: collision with root package name */
    private static final long f48838O2 = f.a(222);

    /* renamed from: P2, reason: collision with root package name */
    private static final long f48843P2 = f.a(129);

    /* renamed from: Q2, reason: collision with root package name */
    private static final long f48848Q2 = f.a(226);

    /* renamed from: R2, reason: collision with root package name */
    private static final long f48853R2 = f.a(272);

    /* renamed from: S2, reason: collision with root package name */
    private static final long f48858S2 = f.a(273);

    /* renamed from: T2, reason: collision with root package name */
    private static final long f48863T2 = f.a(274);

    /* renamed from: U2, reason: collision with root package name */
    private static final long f48868U2 = f.a(Temperature.MAX_AMBIENT_PROBE);

    /* renamed from: V2, reason: collision with root package name */
    private static final long f48873V2 = f.a(91);

    /* renamed from: W2, reason: collision with root package name */
    private static final long f48878W2 = f.a(164);

    /* renamed from: X2, reason: collision with root package name */
    private static final long f48883X2 = f.a(165);

    /* renamed from: Y2, reason: collision with root package name */
    private static final long f48888Y2 = f.a(166);

    /* renamed from: Z2, reason: collision with root package name */
    private static final long f48893Z2 = f.a(167);

    /* renamed from: a3, reason: collision with root package name */
    private static final long f48898a3 = f.a(168);

    /* renamed from: b3, reason: collision with root package name */
    private static final long f48904b3 = f.a(169);

    /* renamed from: c3, reason: collision with root package name */
    private static final long f48910c3 = f.a(170);

    /* renamed from: d3, reason: collision with root package name */
    private static final long f48916d3 = f.a(171);

    /* renamed from: e3, reason: collision with root package name */
    private static final long f48922e3 = f.a(172);

    /* renamed from: f3, reason: collision with root package name */
    private static final long f48928f3 = f.a(173);

    /* renamed from: g3, reason: collision with root package name */
    private static final long f48934g3 = f.a(174);

    /* renamed from: h3, reason: collision with root package name */
    private static final long f48940h3 = f.a(175);

    /* renamed from: i3, reason: collision with root package name */
    private static final long f48946i3 = f.a(176);

    /* renamed from: j3, reason: collision with root package name */
    private static final long f48952j3 = f.a(177);

    /* renamed from: k3, reason: collision with root package name */
    private static final long f48958k3 = f.a(178);

    /* renamed from: l3, reason: collision with root package name */
    private static final long f48964l3 = f.a(179);

    /* renamed from: m3, reason: collision with root package name */
    private static final long f48970m3 = f.a(180);

    /* renamed from: n3, reason: collision with root package name */
    private static final long f48976n3 = f.a(181);

    /* renamed from: o3, reason: collision with root package name */
    private static final long f48982o3 = f.a(182);

    /* renamed from: p3, reason: collision with root package name */
    private static final long f48988p3 = f.a(183);

    /* renamed from: q3, reason: collision with root package name */
    private static final long f48994q3 = f.a(184);

    /* renamed from: r3, reason: collision with root package name */
    private static final long f49000r3 = f.a(185);

    /* renamed from: s3, reason: collision with root package name */
    private static final long f49006s3 = f.a(186);

    /* renamed from: t3, reason: collision with root package name */
    private static final long f49012t3 = f.a(187);

    /* renamed from: u3, reason: collision with root package name */
    private static final long f49018u3 = f.a(204);

    /* renamed from: v3, reason: collision with root package name */
    private static final long f49024v3 = f.a(205);

    /* renamed from: w3, reason: collision with root package name */
    private static final long f49030w3 = f.a(206);

    /* renamed from: x3, reason: collision with root package name */
    private static final long f49036x3 = f.a(207);

    /* renamed from: y3, reason: collision with root package name */
    private static final long f49042y3 = f.a(208);

    /* renamed from: z3, reason: collision with root package name */
    private static final long f49048z3 = f.a(209);

    /* renamed from: A3, reason: collision with root package name */
    private static final long f48766A3 = f.a(210);

    /* renamed from: B3, reason: collision with root package name */
    private static final long f48772B3 = f.a(211);

    /* renamed from: C3, reason: collision with root package name */
    private static final long f48778C3 = f.a(212);

    /* renamed from: D3, reason: collision with root package name */
    private static final long f48784D3 = f.a(213);

    /* renamed from: E3, reason: collision with root package name */
    private static final long f48789E3 = f.a(214);

    /* renamed from: F3, reason: collision with root package name */
    private static final long f48794F3 = f.a(215);

    /* renamed from: G3, reason: collision with root package name */
    private static final long f48799G3 = f.a(216);

    /* renamed from: H3, reason: collision with root package name */
    private static final long f48804H3 = f.a(217);

    /* renamed from: I3, reason: collision with root package name */
    private static final long f48809I3 = f.a(218);

    /* renamed from: J3, reason: collision with root package name */
    private static final long f48814J3 = f.a(219);

    /* renamed from: K3, reason: collision with root package name */
    private static final long f48819K3 = f.a(220);

    /* renamed from: L3, reason: collision with root package name */
    private static final long f48824L3 = f.a(221);

    /* renamed from: M3, reason: collision with root package name */
    private static final long f48829M3 = f.a(223);

    /* renamed from: N3, reason: collision with root package name */
    private static final long f48834N3 = f.a(224);

    /* renamed from: O3, reason: collision with root package name */
    private static final long f48839O3 = f.a(276);

    /* renamed from: P3, reason: collision with root package name */
    private static final long f48844P3 = f.a(225);

    /* renamed from: Q3, reason: collision with root package name */
    private static final long f48849Q3 = f.a(229);

    /* renamed from: R3, reason: collision with root package name */
    private static final long f48854R3 = f.a(230);

    /* renamed from: S3, reason: collision with root package name */
    private static final long f48859S3 = f.a(231);

    /* renamed from: T3, reason: collision with root package name */
    private static final long f48864T3 = f.a(232);

    /* renamed from: U3, reason: collision with root package name */
    private static final long f48869U3 = f.a(233);

    /* renamed from: V3, reason: collision with root package name */
    private static final long f48874V3 = f.a(234);

    /* renamed from: W3, reason: collision with root package name */
    private static final long f48879W3 = f.a(235);

    /* renamed from: X3, reason: collision with root package name */
    private static final long f48884X3 = f.a(236);

    /* renamed from: Y3, reason: collision with root package name */
    private static final long f48889Y3 = f.a(237);

    /* renamed from: Z3, reason: collision with root package name */
    private static final long f48894Z3 = f.a(238);

    /* renamed from: a4, reason: collision with root package name */
    private static final long f48899a4 = f.a(239);

    /* renamed from: b4, reason: collision with root package name */
    private static final long f48905b4 = f.a(240);

    /* renamed from: c4, reason: collision with root package name */
    private static final long f48911c4 = f.a(241);

    /* renamed from: d4, reason: collision with root package name */
    private static final long f48917d4 = f.a(242);

    /* renamed from: e4, reason: collision with root package name */
    private static final long f48923e4 = f.a(243);

    /* renamed from: f4, reason: collision with root package name */
    private static final long f48929f4 = f.a(244);

    /* renamed from: g4, reason: collision with root package name */
    private static final long f48935g4 = f.a(245);

    /* renamed from: h4, reason: collision with root package name */
    private static final long f48941h4 = f.a(246);

    /* renamed from: i4, reason: collision with root package name */
    private static final long f48947i4 = f.a(247);

    /* renamed from: j4, reason: collision with root package name */
    private static final long f48953j4 = f.a(248);

    /* renamed from: k4, reason: collision with root package name */
    private static final long f48959k4 = f.a(249);

    /* renamed from: l4, reason: collision with root package name */
    private static final long f48965l4 = f.a(250);

    /* renamed from: m4, reason: collision with root package name */
    private static final long f48971m4 = f.a(251);

    /* renamed from: n4, reason: collision with root package name */
    private static final long f48977n4 = f.a(252);

    /* renamed from: o4, reason: collision with root package name */
    private static final long f48983o4 = f.a(253);

    /* renamed from: p4, reason: collision with root package name */
    private static final long f48989p4 = f.a(254);

    /* renamed from: q4, reason: collision with root package name */
    private static final long f48995q4 = f.a(255);

    /* renamed from: r4, reason: collision with root package name */
    private static final long f49001r4 = f.a(256);

    /* renamed from: s4, reason: collision with root package name */
    private static final long f49007s4 = f.a(257);

    /* renamed from: t4, reason: collision with root package name */
    private static final long f49013t4 = f.a(258);

    /* renamed from: u4, reason: collision with root package name */
    private static final long f49019u4 = f.a(264);

    /* renamed from: v4, reason: collision with root package name */
    private static final long f49025v4 = f.a(265);

    /* renamed from: w4, reason: collision with root package name */
    private static final long f49031w4 = f.a(266);

    /* renamed from: x4, reason: collision with root package name */
    private static final long f49037x4 = f.a(267);

    /* renamed from: y4, reason: collision with root package name */
    private static final long f49043y4 = f.a(284);

    /* renamed from: z4, reason: collision with root package name */
    private static final long f49049z4 = f.a(285);

    /* renamed from: A4, reason: collision with root package name */
    private static final long f48767A4 = f.a(286);

    /* renamed from: B4, reason: collision with root package name */
    private static final long f48773B4 = f.a(287);

    /* renamed from: C4, reason: collision with root package name */
    private static final long f48779C4 = f.a(288);

    /* compiled from: Key.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010\u001d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Ls0/a$a;", "", "<init>", "()V", "Ls0/a;", "Back", "J", "a", "()J", "DirectionUp", "f", "DirectionDown", "c", "DirectionLeft", "d", "DirectionRight", "e", "DirectionCenter", "b", "Tab", "l", "Enter", "g", "Escape", "h", "PageUp", "k", "PageDown", "j", "NumPadEnter", "i", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s0.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final long a() {
            return C4416a.f48930g;
        }

        public final long b() {
            return C4416a.f49026w;
        }

        public final long c() {
            return C4416a.f49008t;
        }

        public final long d() {
            return C4416a.f49014u;
        }

        public final long e() {
            return C4416a.f49020v;
        }

        public final long f() {
            return C4416a.f49002s;
        }

        public final long g() {
            return C4416a.f48796G0;
        }

        public final long h() {
            return C4416a.f48811J0;
        }

        public final long i() {
            return C4416a.f48765A2;
        }

        public final long j() {
            return C4416a.f48980o1;
        }

        public final long k() {
            return C4416a.f48974n1;
        }

        public final long l() {
            return C4416a.f48769B0;
        }

        private Companion() {
        }
    }

    private /* synthetic */ C4416a(long j10) {
        this.keyCode = j10;
    }

    public static final /* synthetic */ C4416a m(long j10) {
        return new C4416a(j10);
    }

    public static boolean o(long j10, Object obj) {
        return (obj instanceof C4416a) && j10 == ((C4416a) obj).getKeyCode();
    }

    public static final boolean p(long j10, long j11) {
        return j10 == j11;
    }

    public static int q(long j10) {
        return Long.hashCode(j10);
    }

    public static String r(long j10) {
        return "Key code: " + j10;
    }

    public boolean equals(Object obj) {
        return o(this.keyCode, obj);
    }

    public int hashCode() {
        return q(this.keyCode);
    }

    /* renamed from: s, reason: from getter */
    public final /* synthetic */ long getKeyCode() {
        return this.keyCode;
    }

    public String toString() {
        return r(this.keyCode);
    }

    public static long n(long j10) {
        return j10;
    }
}
