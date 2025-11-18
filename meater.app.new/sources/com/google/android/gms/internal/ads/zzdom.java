package com.google.android.gms.internal.ads;

import okhttp3.HttpUrl;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzdom {

    /* renamed from: f */
    public static final zzdom f25778f;

    /* renamed from: g */
    public static final zzdom f25779g;

    /* renamed from: h */
    public static final zzdom f25780h;

    /* renamed from: i */
    public static final zzdom f25781i;

    /* renamed from: j */
    public static final zzdom f25782j;

    /* renamed from: k */
    public static final zzdom f25783k;

    /* renamed from: l */
    public static final zzdom f25784l;

    /* renamed from: m */
    public static final zzdom f25785m;

    /* renamed from: n */
    public static final zzdom f25786n;

    /* renamed from: o */
    public static final zzdom f25787o;

    /* renamed from: p */
    private static final /* synthetic */ zzdom[] f25788p;

    /* renamed from: q */
    private final Class<?> f25789q;

    /* renamed from: r */
    private final Class<?> f25790r;

    /* renamed from: s */
    private final Object f25791s;

    static {
        zzdom zzdomVar = new zzdom("VOID", 0, Void.class, Void.class, null);
        f25778f = zzdomVar;
        Class cls = Integer.TYPE;
        zzdom zzdomVar2 = new zzdom("INT", 1, cls, Integer.class, 0);
        f25779g = zzdomVar2;
        zzdom zzdomVar3 = new zzdom("LONG", 2, Long.TYPE, Long.class, 0L);
        f25780h = zzdomVar3;
        zzdom zzdomVar4 = new zzdom("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f25781i = zzdomVar4;
        zzdom zzdomVar5 = new zzdom("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f25782j = zzdomVar5;
        zzdom zzdomVar6 = new zzdom("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f25783k = zzdomVar6;
        zzdom zzdomVar7 = new zzdom("STRING", 6, String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET);
        f25784l = zzdomVar7;
        zzdom zzdomVar8 = new zzdom("BYTE_STRING", 7, zzdmr.class, zzdmr.class, zzdmr.f25661f);
        f25785m = zzdomVar8;
        zzdom zzdomVar9 = new zzdom("ENUM", 8, cls, Integer.class, null);
        f25786n = zzdomVar9;
        zzdom zzdomVar10 = new zzdom("MESSAGE", 9, Object.class, Object.class, null);
        f25787o = zzdomVar10;
        f25788p = new zzdom[]{zzdomVar, zzdomVar2, zzdomVar3, zzdomVar4, zzdomVar5, zzdomVar6, zzdomVar7, zzdomVar8, zzdomVar9, zzdomVar10};
    }

    private zzdom(String str, int i2, Class cls, Class cls2, Object obj) {
        this.f25789q = cls;
        this.f25790r = cls2;
        this.f25791s = obj;
    }

    public static zzdom[] values() {
        return (zzdom[]) f25788p.clone();
    }

    /* renamed from: g */
    public final Class<?> m19759g() {
        return this.f25790r;
    }
}
