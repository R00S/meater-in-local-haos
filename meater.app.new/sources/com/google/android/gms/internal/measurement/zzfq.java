package com.google.android.gms.internal.measurement;

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
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzfq {

    /* renamed from: f */
    public static final zzfq f28143f;

    /* renamed from: g */
    public static final zzfq f28144g;

    /* renamed from: h */
    public static final zzfq f28145h;

    /* renamed from: i */
    public static final zzfq f28146i;

    /* renamed from: j */
    public static final zzfq f28147j;

    /* renamed from: k */
    public static final zzfq f28148k;

    /* renamed from: l */
    public static final zzfq f28149l;

    /* renamed from: m */
    public static final zzfq f28150m;

    /* renamed from: n */
    public static final zzfq f28151n;

    /* renamed from: o */
    public static final zzfq f28152o;

    /* renamed from: p */
    private static final /* synthetic */ zzfq[] f28153p;

    /* renamed from: q */
    private final Class<?> f28154q;

    /* renamed from: r */
    private final Class<?> f28155r;

    /* renamed from: s */
    private final Object f28156s;

    static {
        zzfq zzfqVar = new zzfq("VOID", 0, Void.class, Void.class, null);
        f28143f = zzfqVar;
        Class cls = Integer.TYPE;
        zzfq zzfqVar2 = new zzfq("INT", 1, cls, Integer.class, 0);
        f28144g = zzfqVar2;
        zzfq zzfqVar3 = new zzfq("LONG", 2, Long.TYPE, Long.class, 0L);
        f28145h = zzfqVar3;
        zzfq zzfqVar4 = new zzfq("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f28146i = zzfqVar4;
        zzfq zzfqVar5 = new zzfq("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f28147j = zzfqVar5;
        zzfq zzfqVar6 = new zzfq("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f28148k = zzfqVar6;
        zzfq zzfqVar7 = new zzfq("STRING", 6, String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET);
        f28149l = zzfqVar7;
        zzfq zzfqVar8 = new zzfq("BYTE_STRING", 7, zzdu.class, zzdu.class, zzdu.f28037f);
        f28150m = zzfqVar8;
        zzfq zzfqVar9 = new zzfq("ENUM", 8, cls, Integer.class, null);
        f28151n = zzfqVar9;
        zzfq zzfqVar10 = new zzfq("MESSAGE", 9, Object.class, Object.class, null);
        f28152o = zzfqVar10;
        f28153p = new zzfq[]{zzfqVar, zzfqVar2, zzfqVar3, zzfqVar4, zzfqVar5, zzfqVar6, zzfqVar7, zzfqVar8, zzfqVar9, zzfqVar10};
    }

    private zzfq(String str, int i2, Class cls, Class cls2, Object obj) {
        this.f28154q = cls;
        this.f28155r = cls2;
        this.f28156s = obj;
    }

    public static zzfq[] values() {
        return (zzfq[]) f28153p.clone();
    }

    /* renamed from: g */
    public final Class<?> m22305g() {
        return this.f28155r;
    }
}
