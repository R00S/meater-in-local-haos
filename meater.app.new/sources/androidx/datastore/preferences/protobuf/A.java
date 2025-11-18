package androidx.datastore.preferences.protobuf;

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
/* loaded from: classes.dex */
public final class A {

    /* renamed from: E, reason: collision with root package name */
    public static final A f24810E;

    /* renamed from: F, reason: collision with root package name */
    public static final A f24811F;

    /* renamed from: G, reason: collision with root package name */
    public static final A f24812G;

    /* renamed from: H, reason: collision with root package name */
    public static final A f24813H;

    /* renamed from: I, reason: collision with root package name */
    public static final A f24814I;

    /* renamed from: J, reason: collision with root package name */
    public static final A f24815J;

    /* renamed from: K, reason: collision with root package name */
    public static final A f24816K;

    /* renamed from: L, reason: collision with root package name */
    public static final A f24817L;

    /* renamed from: M, reason: collision with root package name */
    public static final A f24818M;

    /* renamed from: N, reason: collision with root package name */
    public static final A f24819N;

    /* renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ A[] f24820O;

    /* renamed from: B, reason: collision with root package name */
    private final Class<?> f24821B;

    /* renamed from: C, reason: collision with root package name */
    private final Class<?> f24822C;

    /* renamed from: D, reason: collision with root package name */
    private final Object f24823D;

    static {
        A a10 = new A("VOID", 0, Void.class, Void.class, null);
        f24810E = a10;
        Class cls = Integer.TYPE;
        A a11 = new A("INT", 1, cls, Integer.class, 0);
        f24811F = a11;
        A a12 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        f24812G = a12;
        A a13 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f24813H = a13;
        A a14 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f24814I = a14;
        A a15 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f24815J = a15;
        A a16 = new A("STRING", 6, String.class, String.class, "");
        f24816K = a16;
        A a17 = new A("BYTE_STRING", 7, AbstractC2062h.class, AbstractC2062h.class, AbstractC2062h.f24923C);
        f24817L = a17;
        A a18 = new A("ENUM", 8, cls, Integer.class, null);
        f24818M = a18;
        A a19 = new A("MESSAGE", 9, Object.class, Object.class, null);
        f24819N = a19;
        f24820O = new A[]{a10, a11, a12, a13, a14, a15, a16, a17, a18, a19};
    }

    private A(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f24821B = cls;
        this.f24822C = cls2;
        this.f24823D = obj;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f24820O.clone();
    }

    public Class<?> c() {
        return this.f24822C;
    }
}
