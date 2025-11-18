package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vz */
/* loaded from: classes2.dex */
class C7283vz {

    /* renamed from: a0 */
    public final int f20816a0;

    /* renamed from: a */
    private static final int f20790a = zzkq.m20160f("ftyp");

    /* renamed from: b */
    public static final int f20791b = zzkq.m20160f("avc1");

    /* renamed from: c */
    public static final int f20792c = zzkq.m20160f("avc3");

    /* renamed from: d */
    public static final int f20793d = zzkq.m20160f("esds");

    /* renamed from: e */
    private static final int f20794e = zzkq.m20160f("mdat");

    /* renamed from: f */
    public static final int f20795f = zzkq.m20160f("mp4a");

    /* renamed from: g */
    public static final int f20796g = zzkq.m20160f("ac-3");

    /* renamed from: h */
    public static final int f20797h = zzkq.m20160f("dac3");

    /* renamed from: i */
    public static final int f20798i = zzkq.m20160f("ec-3");

    /* renamed from: j */
    public static final int f20799j = zzkq.m20160f("dec3");

    /* renamed from: k */
    private static final int f20800k = zzkq.m20160f("tfdt");

    /* renamed from: l */
    private static final int f20801l = zzkq.m20160f("tfhd");

    /* renamed from: m */
    private static final int f20802m = zzkq.m20160f("trex");

    /* renamed from: n */
    private static final int f20803n = zzkq.m20160f("trun");

    /* renamed from: o */
    private static final int f20804o = zzkq.m20160f("sidx");

    /* renamed from: p */
    public static final int f20805p = zzkq.m20160f("moov");

    /* renamed from: q */
    public static final int f20806q = zzkq.m20160f("mvhd");

    /* renamed from: r */
    public static final int f20807r = zzkq.m20160f("trak");

    /* renamed from: s */
    public static final int f20808s = zzkq.m20160f("mdia");

    /* renamed from: t */
    public static final int f20809t = zzkq.m20160f("minf");

    /* renamed from: u */
    public static final int f20810u = zzkq.m20160f("stbl");

    /* renamed from: v */
    public static final int f20811v = zzkq.m20160f("avcC");

    /* renamed from: w */
    private static final int f20812w = zzkq.m20160f("moof");

    /* renamed from: x */
    private static final int f20813x = zzkq.m20160f("traf");

    /* renamed from: y */
    private static final int f20814y = zzkq.m20160f("mvex");

    /* renamed from: z */
    public static final int f20815z = zzkq.m20160f("tkhd");

    /* renamed from: A */
    public static final int f20764A = zzkq.m20160f("mdhd");

    /* renamed from: B */
    public static final int f20765B = zzkq.m20160f("hdlr");

    /* renamed from: C */
    public static final int f20766C = zzkq.m20160f("stsd");

    /* renamed from: D */
    private static final int f20767D = zzkq.m20160f("pssh");

    /* renamed from: E */
    public static final int f20768E = zzkq.m20160f("sinf");

    /* renamed from: F */
    public static final int f20769F = zzkq.m20160f("schm");

    /* renamed from: G */
    public static final int f20770G = zzkq.m20160f("schi");

    /* renamed from: H */
    public static final int f20771H = zzkq.m20160f("tenc");

    /* renamed from: I */
    public static final int f20772I = zzkq.m20160f("encv");

    /* renamed from: J */
    public static final int f20773J = zzkq.m20160f("enca");

    /* renamed from: K */
    public static final int f20774K = zzkq.m20160f("frma");

    /* renamed from: L */
    private static final int f20775L = zzkq.m20160f("saiz");

    /* renamed from: M */
    private static final int f20776M = zzkq.m20160f("uuid");

    /* renamed from: N */
    private static final int f20777N = zzkq.m20160f("senc");

    /* renamed from: O */
    public static final int f20778O = zzkq.m20160f("pasp");

    /* renamed from: P */
    public static final int f20779P = zzkq.m20160f("TTML");

    /* renamed from: Q */
    public static final int f20780Q = zzkq.m20160f("vmhd");

    /* renamed from: R */
    public static final int f20781R = zzkq.m20160f("smhd");

    /* renamed from: S */
    public static final int f20782S = zzkq.m20160f("mp4v");

    /* renamed from: T */
    public static final int f20783T = zzkq.m20160f("stts");

    /* renamed from: U */
    public static final int f20784U = zzkq.m20160f("stss");

    /* renamed from: V */
    public static final int f20785V = zzkq.m20160f("ctts");

    /* renamed from: W */
    public static final int f20786W = zzkq.m20160f("stsc");

    /* renamed from: X */
    public static final int f20787X = zzkq.m20160f("stsz");

    /* renamed from: Y */
    public static final int f20788Y = zzkq.m20160f("stco");

    /* renamed from: Z */
    public static final int f20789Z = zzkq.m20160f("co64");

    C7283vz(int i2) {
        this.f20816a0 = i2;
    }

    /* renamed from: a */
    public static int m15972a(int i2) {
        return (i2 >> 24) & 255;
    }

    /* renamed from: b */
    public static String m15973b(int i2) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) (i2 >> 24));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }

    public String toString() {
        return m15973b(this.f20816a0);
    }
}
