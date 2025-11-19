package com.google.android.gms.internal.wearable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'E' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class v1 {

    /* renamed from: C, reason: collision with root package name */
    public static final v1 f34687C;

    /* renamed from: D, reason: collision with root package name */
    public static final v1 f34688D;

    /* renamed from: E, reason: collision with root package name */
    public static final v1 f34689E;

    /* renamed from: F, reason: collision with root package name */
    public static final v1 f34690F;

    /* renamed from: G, reason: collision with root package name */
    public static final v1 f34691G;

    /* renamed from: H, reason: collision with root package name */
    public static final v1 f34692H;

    /* renamed from: I, reason: collision with root package name */
    public static final v1 f34693I;

    /* renamed from: J, reason: collision with root package name */
    public static final v1 f34694J;

    /* renamed from: K, reason: collision with root package name */
    public static final v1 f34695K;

    /* renamed from: L, reason: collision with root package name */
    public static final v1 f34696L;

    /* renamed from: M, reason: collision with root package name */
    public static final v1 f34697M;

    /* renamed from: N, reason: collision with root package name */
    public static final v1 f34698N;

    /* renamed from: O, reason: collision with root package name */
    public static final v1 f34699O;

    /* renamed from: P, reason: collision with root package name */
    public static final v1 f34700P;

    /* renamed from: Q, reason: collision with root package name */
    public static final v1 f34701Q;

    /* renamed from: R, reason: collision with root package name */
    public static final v1 f34702R;

    /* renamed from: S, reason: collision with root package name */
    public static final v1 f34703S;

    /* renamed from: T, reason: collision with root package name */
    public static final v1 f34704T;

    /* renamed from: U, reason: collision with root package name */
    private static final /* synthetic */ v1[] f34705U;

    /* renamed from: B, reason: collision with root package name */
    private final w1 f34706B;

    static {
        v1 v1Var = new v1("DOUBLE", 0, w1.DOUBLE, 1);
        f34687C = v1Var;
        v1 v1Var2 = new v1("FLOAT", 1, w1.FLOAT, 5);
        f34688D = v1Var2;
        w1 w1Var = w1.LONG;
        v1 v1Var3 = new v1("INT64", 2, w1Var, 0);
        f34689E = v1Var3;
        v1 v1Var4 = new v1("UINT64", 3, w1Var, 0);
        f34690F = v1Var4;
        w1 w1Var2 = w1.INT;
        v1 v1Var5 = new v1("INT32", 4, w1Var2, 0);
        f34691G = v1Var5;
        v1 v1Var6 = new v1("FIXED64", 5, w1Var, 1);
        f34692H = v1Var6;
        v1 v1Var7 = new v1("FIXED32", 6, w1Var2, 5);
        f34693I = v1Var7;
        v1 v1Var8 = new v1("BOOL", 7, w1.BOOLEAN, 0);
        f34694J = v1Var8;
        v1 v1Var9 = new v1("STRING", 8, w1.STRING, 2);
        f34695K = v1Var9;
        w1 w1Var3 = w1.MESSAGE;
        v1 v1Var10 = new v1("GROUP", 9, w1Var3, 3);
        f34696L = v1Var10;
        v1 v1Var11 = new v1("MESSAGE", 10, w1Var3, 2);
        f34697M = v1Var11;
        v1 v1Var12 = new v1("BYTES", 11, w1.BYTE_STRING, 2);
        f34698N = v1Var12;
        v1 v1Var13 = new v1("UINT32", 12, w1Var2, 0);
        f34699O = v1Var13;
        v1 v1Var14 = new v1("ENUM", 13, w1.ENUM, 0);
        f34700P = v1Var14;
        v1 v1Var15 = new v1("SFIXED32", 14, w1Var2, 5);
        f34701Q = v1Var15;
        v1 v1Var16 = new v1("SFIXED64", 15, w1Var, 1);
        f34702R = v1Var16;
        v1 v1Var17 = new v1("SINT32", 16, w1Var2, 0);
        f34703S = v1Var17;
        v1 v1Var18 = new v1("SINT64", 17, w1Var, 0);
        f34704T = v1Var18;
        f34705U = new v1[]{v1Var, v1Var2, v1Var3, v1Var4, v1Var5, v1Var6, v1Var7, v1Var8, v1Var9, v1Var10, v1Var11, v1Var12, v1Var13, v1Var14, v1Var15, v1Var16, v1Var17, v1Var18};
    }

    private v1(String str, int i10, w1 w1Var, int i11) {
        this.f34706B = w1Var;
    }

    public static v1[] values() {
        return (v1[]) f34705U.clone();
    }

    public final w1 c() {
        return this.f34706B;
    }
}
