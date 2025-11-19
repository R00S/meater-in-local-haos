package com.google.android.gms.internal.measurement;

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
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public final class O4 {

    /* renamed from: C, reason: collision with root package name */
    public static final O4 f33828C;

    /* renamed from: D, reason: collision with root package name */
    public static final O4 f33829D;

    /* renamed from: E, reason: collision with root package name */
    public static final O4 f33830E;

    /* renamed from: F, reason: collision with root package name */
    public static final O4 f33831F;

    /* renamed from: G, reason: collision with root package name */
    public static final O4 f33832G;

    /* renamed from: H, reason: collision with root package name */
    public static final O4 f33833H;

    /* renamed from: I, reason: collision with root package name */
    public static final O4 f33834I;

    /* renamed from: J, reason: collision with root package name */
    public static final O4 f33835J;

    /* renamed from: K, reason: collision with root package name */
    public static final O4 f33836K;

    /* renamed from: L, reason: collision with root package name */
    public static final O4 f33837L;

    /* renamed from: M, reason: collision with root package name */
    private static final /* synthetic */ O4[] f33838M;

    /* renamed from: B, reason: collision with root package name */
    private final Class<?> f33839B;

    static {
        O4 o42 = new O4("VOID", 0, Void.class, Void.class, null);
        f33828C = o42;
        Class cls = Integer.TYPE;
        O4 o43 = new O4("INT", 1, cls, Integer.class, 0);
        f33829D = o43;
        O4 o44 = new O4("LONG", 2, Long.TYPE, Long.class, 0L);
        f33830E = o44;
        O4 o45 = new O4("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f33831F = o45;
        O4 o46 = new O4("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f33832G = o46;
        O4 o47 = new O4("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f33833H = o47;
        O4 o48 = new O4("STRING", 6, String.class, String.class, "");
        f33834I = o48;
        O4 o49 = new O4("BYTE_STRING", 7, Y3.class, Y3.class, Y3.f33948C);
        f33835J = o49;
        O4 o410 = new O4("ENUM", 8, cls, Integer.class, null);
        f33836K = o410;
        O4 o411 = new O4("MESSAGE", 9, Object.class, Object.class, null);
        f33837L = o411;
        f33838M = new O4[]{o42, o43, o44, o45, o46, o47, o48, o49, o410, o411};
    }

    private O4(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f33839B = cls2;
    }

    public static O4[] values() {
        return (O4[]) f33838M.clone();
    }

    public final Class<?> c() {
        return this.f33839B;
    }
}
