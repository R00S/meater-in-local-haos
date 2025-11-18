package Ra;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClassKind.kt */
/* renamed from: Ra.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1693f {

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC1693f f15143C = new EnumC1693f("CLASS", 0, "class");

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC1693f f15144D = new EnumC1693f("INTERFACE", 1, "interface");

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC1693f f15145E = new EnumC1693f("ENUM_CLASS", 2, "enum class");

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC1693f f15146F = new EnumC1693f("ENUM_ENTRY", 3, null);

    /* renamed from: G, reason: collision with root package name */
    public static final EnumC1693f f15147G = new EnumC1693f("ANNOTATION_CLASS", 4, "annotation class");

    /* renamed from: H, reason: collision with root package name */
    public static final EnumC1693f f15148H = new EnumC1693f("OBJECT", 5, "object");

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ EnumC1693f[] f15149I;

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f15150J;

    /* renamed from: B, reason: collision with root package name */
    private final String f15151B;

    static {
        EnumC1693f[] enumC1693fArrC = c();
        f15149I = enumC1693fArrC;
        f15150J = C4929b.a(enumC1693fArrC);
    }

    private EnumC1693f(String str, int i10, String str2) {
        this.f15151B = str2;
    }

    private static final /* synthetic */ EnumC1693f[] c() {
        return new EnumC1693f[]{f15143C, f15144D, f15145E, f15146F, f15147G, f15148H};
    }

    public static EnumC1693f valueOf(String str) {
        return (EnumC1693f) Enum.valueOf(EnumC1693f.class, str);
    }

    public static EnumC1693f[] values() {
        return (EnumC1693f[]) f15149I.clone();
    }

    public final boolean j() {
        return this == f15148H || this == f15146F;
    }
}
