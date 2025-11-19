package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'F' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: JavaType.java */
/* loaded from: classes2.dex */
public final class A {

    /* renamed from: E, reason: collision with root package name */
    public static final A f37700E;

    /* renamed from: F, reason: collision with root package name */
    public static final A f37701F;

    /* renamed from: G, reason: collision with root package name */
    public static final A f37702G;

    /* renamed from: H, reason: collision with root package name */
    public static final A f37703H;

    /* renamed from: I, reason: collision with root package name */
    public static final A f37704I;

    /* renamed from: J, reason: collision with root package name */
    public static final A f37705J;

    /* renamed from: K, reason: collision with root package name */
    public static final A f37706K;

    /* renamed from: L, reason: collision with root package name */
    public static final A f37707L;

    /* renamed from: M, reason: collision with root package name */
    public static final A f37708M;

    /* renamed from: N, reason: collision with root package name */
    public static final A f37709N;

    /* renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ A[] f37710O;

    /* renamed from: B, reason: collision with root package name */
    private final Class<?> f37711B;

    /* renamed from: C, reason: collision with root package name */
    private final Class<?> f37712C;

    /* renamed from: D, reason: collision with root package name */
    private final Object f37713D;

    static {
        A a10 = new A("VOID", 0, Void.class, Void.class, null);
        f37700E = a10;
        Class cls = Integer.TYPE;
        A a11 = new A("INT", 1, cls, Integer.class, 0);
        f37701F = a11;
        A a12 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        f37702G = a12;
        A a13 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f37703H = a13;
        A a14 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f37704I = a14;
        A a15 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f37705J = a15;
        A a16 = new A("STRING", 6, String.class, String.class, "");
        f37706K = a16;
        A a17 = new A("BYTE_STRING", 7, AbstractC2898h.class, AbstractC2898h.class, AbstractC2898h.f37801C);
        f37707L = a17;
        A a18 = new A("ENUM", 8, cls, Integer.class, null);
        f37708M = a18;
        A a19 = new A("MESSAGE", 9, Object.class, Object.class, null);
        f37709N = a19;
        f37710O = new A[]{a10, a11, a12, a13, a14, a15, a16, a17, a18, a19};
    }

    private A(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f37711B = cls;
        this.f37712C = cls2;
        this.f37713D = obj;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f37710O.clone();
    }

    public Class<?> c() {
        return this.f37712C;
    }
}
