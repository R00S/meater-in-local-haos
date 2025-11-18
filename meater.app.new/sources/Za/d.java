package Za;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LookupLocation.kt */
/* loaded from: classes3.dex */
public final class d implements b {

    /* renamed from: B, reason: collision with root package name */
    public static final d f19625B = new d("FROM_IDE", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final d f19626C = new d("FROM_BACKEND", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final d f19627D = new d("FROM_TEST", 2);

    /* renamed from: E, reason: collision with root package name */
    public static final d f19628E = new d("FROM_BUILTINS", 3);

    /* renamed from: F, reason: collision with root package name */
    public static final d f19629F = new d("WHEN_CHECK_DECLARATION_CONFLICTS", 4);

    /* renamed from: G, reason: collision with root package name */
    public static final d f19630G = new d("WHEN_CHECK_OVERRIDES", 5);

    /* renamed from: H, reason: collision with root package name */
    public static final d f19631H = new d("FOR_SCRIPT", 6);

    /* renamed from: I, reason: collision with root package name */
    public static final d f19632I = new d("FROM_REFLECTION", 7);

    /* renamed from: J, reason: collision with root package name */
    public static final d f19633J = new d("WHEN_RESOLVE_DECLARATION", 8);

    /* renamed from: K, reason: collision with root package name */
    public static final d f19634K = new d("WHEN_GET_DECLARATION_SCOPE", 9);

    /* renamed from: L, reason: collision with root package name */
    public static final d f19635L = new d("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);

    /* renamed from: M, reason: collision with root package name */
    public static final d f19636M = new d("FOR_ALREADY_TRACKED", 11);

    /* renamed from: N, reason: collision with root package name */
    public static final d f19637N = new d("WHEN_GET_ALL_DESCRIPTORS", 12);

    /* renamed from: O, reason: collision with root package name */
    public static final d f19638O = new d("WHEN_TYPING", 13);

    /* renamed from: P, reason: collision with root package name */
    public static final d f19639P = new d("WHEN_GET_SUPER_MEMBERS", 14);

    /* renamed from: Q, reason: collision with root package name */
    public static final d f19640Q = new d("FOR_NON_TRACKED_SCOPE", 15);

    /* renamed from: R, reason: collision with root package name */
    public static final d f19641R = new d("FROM_SYNTHETIC_SCOPE", 16);

    /* renamed from: S, reason: collision with root package name */
    public static final d f19642S = new d("FROM_DESERIALIZATION", 17);

    /* renamed from: T, reason: collision with root package name */
    public static final d f19643T = new d("FROM_JAVA_LOADER", 18);

    /* renamed from: U, reason: collision with root package name */
    public static final d f19644U = new d("WHEN_GET_LOCAL_VARIABLE", 19);

    /* renamed from: V, reason: collision with root package name */
    public static final d f19645V = new d("WHEN_FIND_BY_FQNAME", 20);

    /* renamed from: W, reason: collision with root package name */
    public static final d f19646W = new d("WHEN_GET_COMPANION_OBJECT", 21);

    /* renamed from: X, reason: collision with root package name */
    public static final d f19647X = new d("FOR_DEFAULT_IMPORTS", 22);

    /* renamed from: Y, reason: collision with root package name */
    private static final /* synthetic */ d[] f19648Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f19649Z;

    static {
        d[] dVarArrC = c();
        f19648Y = dVarArrC;
        f19649Z = C4929b.a(dVarArrC);
    }

    private d(String str, int i10) {
    }

    private static final /* synthetic */ d[] c() {
        return new d[]{f19625B, f19626C, f19627D, f19628E, f19629F, f19630G, f19631H, f19632I, f19633J, f19634K, f19635L, f19636M, f19637N, f19638O, f19639P, f19640Q, f19641R, f19642S, f19643T, f19644U, f19645V, f19646W, f19647X};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f19648Y.clone();
    }

    @Override // Za.b
    public a j() {
        return null;
    }
}
