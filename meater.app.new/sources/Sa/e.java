package Sa;

import kotlin.jvm.internal.C3854k;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnnotationUseSiteTarget.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: C, reason: collision with root package name */
    public static final e f15612C = new e("FIELD", 0, null, 1, null);

    /* renamed from: D, reason: collision with root package name */
    public static final e f15613D = new e("FILE", 1, null, 1, null);

    /* renamed from: E, reason: collision with root package name */
    public static final e f15614E = new e("PROPERTY", 2, null, 1, null);

    /* renamed from: F, reason: collision with root package name */
    public static final e f15615F = new e("PROPERTY_GETTER", 3, "get");

    /* renamed from: G, reason: collision with root package name */
    public static final e f15616G = new e("PROPERTY_SETTER", 4, "set");

    /* renamed from: H, reason: collision with root package name */
    public static final e f15617H = new e("RECEIVER", 5, null, 1, null);

    /* renamed from: I, reason: collision with root package name */
    public static final e f15618I = new e("CONSTRUCTOR_PARAMETER", 6, "param");

    /* renamed from: J, reason: collision with root package name */
    public static final e f15619J = new e("SETTER_PARAMETER", 7, "setparam");

    /* renamed from: K, reason: collision with root package name */
    public static final e f15620K = new e("PROPERTY_DELEGATE_FIELD", 8, "delegate");

    /* renamed from: L, reason: collision with root package name */
    private static final /* synthetic */ e[] f15621L;

    /* renamed from: M, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f15622M;

    /* renamed from: B, reason: collision with root package name */
    private final String f15623B;

    static {
        e[] eVarArrC = c();
        f15621L = eVarArrC;
        f15622M = C4929b.a(eVarArrC);
    }

    private e(String str, int i10, String str2) {
        this.f15623B = str2 == null ? Pb.a.f(name()) : str2;
    }

    private static final /* synthetic */ e[] c() {
        return new e[]{f15612C, f15613D, f15614E, f15615F, f15616G, f15617H, f15618I, f15619J, f15620K};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f15621L.clone();
    }

    public final String j() {
        return this.f15623B;
    }

    /* synthetic */ e(String str, int i10, String str2, int i11, C3854k c3854k) {
        this(str, i10, (i11 & 1) != 0 ? null : str2);
    }
}
