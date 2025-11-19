package com.google.android.gms.internal.measurement;

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
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.d6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class EnumC2461d6 {

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC2461d6 f34075D;

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC2461d6 f34076E;

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC2461d6 f34077F;

    /* renamed from: G, reason: collision with root package name */
    public static final EnumC2461d6 f34078G;

    /* renamed from: H, reason: collision with root package name */
    public static final EnumC2461d6 f34079H;

    /* renamed from: I, reason: collision with root package name */
    public static final EnumC2461d6 f34080I;

    /* renamed from: J, reason: collision with root package name */
    public static final EnumC2461d6 f34081J;

    /* renamed from: K, reason: collision with root package name */
    public static final EnumC2461d6 f34082K;

    /* renamed from: L, reason: collision with root package name */
    public static final EnumC2461d6 f34083L;

    /* renamed from: M, reason: collision with root package name */
    public static final EnumC2461d6 f34084M;

    /* renamed from: N, reason: collision with root package name */
    public static final EnumC2461d6 f34085N;

    /* renamed from: O, reason: collision with root package name */
    public static final EnumC2461d6 f34086O;

    /* renamed from: P, reason: collision with root package name */
    public static final EnumC2461d6 f34087P;

    /* renamed from: Q, reason: collision with root package name */
    public static final EnumC2461d6 f34088Q;

    /* renamed from: R, reason: collision with root package name */
    public static final EnumC2461d6 f34089R;

    /* renamed from: S, reason: collision with root package name */
    public static final EnumC2461d6 f34090S;

    /* renamed from: T, reason: collision with root package name */
    public static final EnumC2461d6 f34091T;

    /* renamed from: U, reason: collision with root package name */
    public static final EnumC2461d6 f34092U;

    /* renamed from: V, reason: collision with root package name */
    private static final /* synthetic */ EnumC2461d6[] f34093V;

    /* renamed from: B, reason: collision with root package name */
    private final EnumC2486g6 f34094B;

    /* renamed from: C, reason: collision with root package name */
    private final int f34095C;

    static {
        EnumC2461d6 enumC2461d6 = new EnumC2461d6("DOUBLE", 0, EnumC2486g6.DOUBLE, 1);
        f34075D = enumC2461d6;
        EnumC2461d6 enumC2461d62 = new EnumC2461d6("FLOAT", 1, EnumC2486g6.FLOAT, 5);
        f34076E = enumC2461d62;
        EnumC2486g6 enumC2486g6 = EnumC2486g6.LONG;
        EnumC2461d6 enumC2461d63 = new EnumC2461d6("INT64", 2, enumC2486g6, 0);
        f34077F = enumC2461d63;
        EnumC2461d6 enumC2461d64 = new EnumC2461d6("UINT64", 3, enumC2486g6, 0);
        f34078G = enumC2461d64;
        EnumC2486g6 enumC2486g62 = EnumC2486g6.INT;
        EnumC2461d6 enumC2461d65 = new EnumC2461d6("INT32", 4, enumC2486g62, 0);
        f34079H = enumC2461d65;
        EnumC2461d6 enumC2461d66 = new EnumC2461d6("FIXED64", 5, enumC2486g6, 1);
        f34080I = enumC2461d66;
        EnumC2461d6 enumC2461d67 = new EnumC2461d6("FIXED32", 6, enumC2486g62, 5);
        f34081J = enumC2461d67;
        EnumC2461d6 enumC2461d68 = new EnumC2461d6("BOOL", 7, EnumC2486g6.BOOLEAN, 0);
        f34082K = enumC2461d68;
        int i10 = 2;
        C2510j6 c2510j6 = null;
        C2452c6 c2452c6 = new C2452c6("STRING", EnumC2486g6.STRING);
        f34083L = c2452c6;
        EnumC2486g6 enumC2486g63 = EnumC2486g6.MESSAGE;
        C2478f6 c2478f6 = new C2478f6("GROUP", enumC2486g63);
        f34084M = c2478f6;
        C2470e6 c2470e6 = new C2470e6("MESSAGE", enumC2486g63);
        f34085N = c2470e6;
        C2494h6 c2494h6 = new C2494h6("BYTES", EnumC2486g6.BYTE_STRING);
        f34086O = c2494h6;
        EnumC2461d6 enumC2461d69 = new EnumC2461d6("UINT32", 12, enumC2486g62, 0);
        f34087P = enumC2461d69;
        EnumC2461d6 enumC2461d610 = new EnumC2461d6("ENUM", 13, EnumC2486g6.ENUM, 0);
        f34088Q = enumC2461d610;
        EnumC2461d6 enumC2461d611 = new EnumC2461d6("SFIXED32", 14, enumC2486g62, 5);
        f34089R = enumC2461d611;
        EnumC2461d6 enumC2461d612 = new EnumC2461d6("SFIXED64", 15, enumC2486g6, 1);
        f34090S = enumC2461d612;
        EnumC2461d6 enumC2461d613 = new EnumC2461d6("SINT32", 16, enumC2486g62, 0);
        f34091T = enumC2461d613;
        EnumC2461d6 enumC2461d614 = new EnumC2461d6("SINT64", 17, enumC2486g6, 0);
        f34092U = enumC2461d614;
        f34093V = new EnumC2461d6[]{enumC2461d6, enumC2461d62, enumC2461d63, enumC2461d64, enumC2461d65, enumC2461d66, enumC2461d67, enumC2461d68, c2452c6, c2478f6, c2470e6, c2494h6, enumC2461d69, enumC2461d610, enumC2461d611, enumC2461d612, enumC2461d613, enumC2461d614};
    }

    public static EnumC2461d6[] values() {
        return (EnumC2461d6[]) f34093V.clone();
    }

    public final EnumC2486g6 c() {
        return this.f34094B;
    }

    private EnumC2461d6(String str, int i10, EnumC2486g6 enumC2486g6, int i11) {
        this.f34094B = enumC2486g6;
        this.f34095C = i11;
    }
}
