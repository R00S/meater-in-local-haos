package Jb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorScopeKind.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: C, reason: collision with root package name */
    public static final h f7680C = new h("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");

    /* renamed from: D, reason: collision with root package name */
    public static final h f7681D = new h("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");

    /* renamed from: E, reason: collision with root package name */
    public static final h f7682E = new h("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");

    /* renamed from: F, reason: collision with root package name */
    public static final h f7683F = new h("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");

    /* renamed from: G, reason: collision with root package name */
    public static final h f7684G = new h("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");

    /* renamed from: H, reason: collision with root package name */
    public static final h f7685H = new h("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");

    /* renamed from: I, reason: collision with root package name */
    public static final h f7686I = new h("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");

    /* renamed from: J, reason: collision with root package name */
    public static final h f7687J = new h("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");

    /* renamed from: K, reason: collision with root package name */
    public static final h f7688K = new h("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");

    /* renamed from: L, reason: collision with root package name */
    public static final h f7689L = new h("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");

    /* renamed from: M, reason: collision with root package name */
    private static final /* synthetic */ h[] f7690M;

    /* renamed from: N, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f7691N;

    /* renamed from: B, reason: collision with root package name */
    private final String f7692B;

    static {
        h[] hVarArrC = c();
        f7690M = hVarArrC;
        f7691N = C4929b.a(hVarArrC);
    }

    private h(String str, int i10, String str2) {
        this.f7692B = str2;
    }

    private static final /* synthetic */ h[] c() {
        return new h[]{f7680C, f7681D, f7682E, f7683F, f7684G, f7685H, f7686I, f7687J, f7688K, f7689L};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f7690M.clone();
    }

    public final String j() {
        return this.f7692B;
    }
}
