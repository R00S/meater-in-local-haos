package Hb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Variance.kt */
/* loaded from: classes3.dex */
public final class Q0 {

    /* renamed from: F, reason: collision with root package name */
    public static final Q0 f5693F = new Q0("INVARIANT", 0, "", true, true, 0);

    /* renamed from: G, reason: collision with root package name */
    public static final Q0 f5694G = new Q0("IN_VARIANCE", 1, "in", true, false, -1);

    /* renamed from: H, reason: collision with root package name */
    public static final Q0 f5695H = new Q0("OUT_VARIANCE", 2, "out", false, true, 1);

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ Q0[] f5696I;

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f5697J;

    /* renamed from: B, reason: collision with root package name */
    private final String f5698B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f5699C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f5700D;

    /* renamed from: E, reason: collision with root package name */
    private final int f5701E;

    static {
        Q0[] q0ArrC = c();
        f5696I = q0ArrC;
        f5697J = C4929b.a(q0ArrC);
    }

    private Q0(String str, int i10, String str2, boolean z10, boolean z11, int i11) {
        this.f5698B = str2;
        this.f5699C = z10;
        this.f5700D = z11;
        this.f5701E = i11;
    }

    private static final /* synthetic */ Q0[] c() {
        return new Q0[]{f5693F, f5694G, f5695H};
    }

    public static Q0 valueOf(String str) {
        return (Q0) Enum.valueOf(Q0.class, str);
    }

    public static Q0[] values() {
        return (Q0[]) f5696I.clone();
    }

    public final boolean j() {
        return this.f5700D;
    }

    public final String n() {
        return this.f5698B;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f5698B;
    }
}
