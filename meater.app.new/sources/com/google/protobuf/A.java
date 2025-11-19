package com.google.protobuf;

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
    public static final A f39133E;

    /* renamed from: F, reason: collision with root package name */
    public static final A f39134F;

    /* renamed from: G, reason: collision with root package name */
    public static final A f39135G;

    /* renamed from: H, reason: collision with root package name */
    public static final A f39136H;

    /* renamed from: I, reason: collision with root package name */
    public static final A f39137I;

    /* renamed from: J, reason: collision with root package name */
    public static final A f39138J;

    /* renamed from: K, reason: collision with root package name */
    public static final A f39139K;

    /* renamed from: L, reason: collision with root package name */
    public static final A f39140L;

    /* renamed from: M, reason: collision with root package name */
    public static final A f39141M;

    /* renamed from: N, reason: collision with root package name */
    public static final A f39142N;

    /* renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ A[] f39143O;

    /* renamed from: B, reason: collision with root package name */
    private final Class<?> f39144B;

    /* renamed from: C, reason: collision with root package name */
    private final Class<?> f39145C;

    /* renamed from: D, reason: collision with root package name */
    private final Object f39146D;

    static {
        A a10 = new A("VOID", 0, Void.class, Void.class, null);
        f39133E = a10;
        Class cls = Integer.TYPE;
        A a11 = new A("INT", 1, cls, Integer.class, 0);
        f39134F = a11;
        A a12 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        f39135G = a12;
        A a13 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f39136H = a13;
        A a14 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f39137I = a14;
        A a15 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f39138J = a15;
        A a16 = new A("STRING", 6, String.class, String.class, "");
        f39139K = a16;
        A a17 = new A("BYTE_STRING", 7, AbstractC2947g.class, AbstractC2947g.class, AbstractC2947g.f39238C);
        f39140L = a17;
        A a18 = new A("ENUM", 8, cls, Integer.class, null);
        f39141M = a18;
        A a19 = new A("MESSAGE", 9, Object.class, Object.class, null);
        f39142N = a19;
        f39143O = new A[]{a10, a11, a12, a13, a14, a15, a16, a17, a18, a19};
    }

    private A(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f39144B = cls;
        this.f39145C = cls2;
        this.f39146D = obj;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f39143O.clone();
    }

    public Class<?> c() {
        return this.f39145C;
    }
}
