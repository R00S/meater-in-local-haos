package com.google.android.gms.internal.wearable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'D' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2692s0 {

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC2692s0 f34666C;

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC2692s0 f34667D;

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC2692s0 f34668E;

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC2692s0 f34669F;

    /* renamed from: G, reason: collision with root package name */
    public static final EnumC2692s0 f34670G;

    /* renamed from: H, reason: collision with root package name */
    public static final EnumC2692s0 f34671H;

    /* renamed from: I, reason: collision with root package name */
    public static final EnumC2692s0 f34672I;

    /* renamed from: J, reason: collision with root package name */
    public static final EnumC2692s0 f34673J;

    /* renamed from: K, reason: collision with root package name */
    public static final EnumC2692s0 f34674K;

    /* renamed from: L, reason: collision with root package name */
    public static final EnumC2692s0 f34675L;

    /* renamed from: M, reason: collision with root package name */
    private static final /* synthetic */ EnumC2692s0[] f34676M;

    /* renamed from: B, reason: collision with root package name */
    private final Class f34677B;

    static {
        EnumC2692s0 enumC2692s0 = new EnumC2692s0("VOID", 0, Void.class, Void.class, null);
        f34666C = enumC2692s0;
        Class cls = Integer.TYPE;
        EnumC2692s0 enumC2692s02 = new EnumC2692s0("INT", 1, cls, Integer.class, 0);
        f34667D = enumC2692s02;
        EnumC2692s0 enumC2692s03 = new EnumC2692s0("LONG", 2, Long.TYPE, Long.class, 0L);
        f34668E = enumC2692s03;
        EnumC2692s0 enumC2692s04 = new EnumC2692s0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f34669F = enumC2692s04;
        EnumC2692s0 enumC2692s05 = new EnumC2692s0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f34670G = enumC2692s05;
        EnumC2692s0 enumC2692s06 = new EnumC2692s0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f34671H = enumC2692s06;
        EnumC2692s0 enumC2692s07 = new EnumC2692s0("STRING", 6, String.class, String.class, "");
        f34672I = enumC2692s07;
        EnumC2692s0 enumC2692s08 = new EnumC2692s0("BYTE_STRING", 7, P.class, P.class, P.f34503C);
        f34673J = enumC2692s08;
        EnumC2692s0 enumC2692s09 = new EnumC2692s0("ENUM", 8, cls, Integer.class, null);
        f34674K = enumC2692s09;
        EnumC2692s0 enumC2692s010 = new EnumC2692s0("MESSAGE", 9, Object.class, Object.class, null);
        f34675L = enumC2692s010;
        f34676M = new EnumC2692s0[]{enumC2692s0, enumC2692s02, enumC2692s03, enumC2692s04, enumC2692s05, enumC2692s06, enumC2692s07, enumC2692s08, enumC2692s09, enumC2692s010};
    }

    private EnumC2692s0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f34677B = cls2;
    }

    public static EnumC2692s0[] values() {
        return (EnumC2692s0[]) f34676M.clone();
    }

    public final Class c() {
        return this.f34677B;
    }
}
