package sb;

import kotlin.jvm.internal.C3854k;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* renamed from: sb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC4522a {

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC4522a f49568D = new EnumC4522a("NO_ARGUMENTS", 0, false, false, 3, null);

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC4522a f49569E = new EnumC4522a("UNLESS_EMPTY", 1, true, false, 2, null);

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC4522a f49570F = new EnumC4522a("ALWAYS_PARENTHESIZED", 2, true, true);

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ EnumC4522a[] f49571G;

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f49572H;

    /* renamed from: B, reason: collision with root package name */
    private final boolean f49573B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f49574C;

    static {
        EnumC4522a[] enumC4522aArrC = c();
        f49571G = enumC4522aArrC;
        f49572H = C4929b.a(enumC4522aArrC);
    }

    private EnumC4522a(String str, int i10, boolean z10, boolean z11) {
        this.f49573B = z10;
        this.f49574C = z11;
    }

    private static final /* synthetic */ EnumC4522a[] c() {
        return new EnumC4522a[]{f49568D, f49569E, f49570F};
    }

    public static EnumC4522a valueOf(String str) {
        return (EnumC4522a) Enum.valueOf(EnumC4522a.class, str);
    }

    public static EnumC4522a[] values() {
        return (EnumC4522a[]) f49571G.clone();
    }

    public final boolean j() {
        return this.f49573B;
    }

    public final boolean n() {
        return this.f49574C;
    }

    /* synthetic */ EnumC4522a(String str, int i10, boolean z10, boolean z11, int i11, C3854k c3854k) {
        this(str, i10, (i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11);
    }
}
