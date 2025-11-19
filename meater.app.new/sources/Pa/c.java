package Pa;

import Pa.f;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FunctionClassKind.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: B, reason: collision with root package name */
    public static final a f14152B;

    /* renamed from: C, reason: collision with root package name */
    public static final c f14153C = new c("Function", 0);

    /* renamed from: D, reason: collision with root package name */
    public static final c f14154D = new c("SuspendFunction", 1);

    /* renamed from: E, reason: collision with root package name */
    public static final c f14155E = new c("KFunction", 2);

    /* renamed from: F, reason: collision with root package name */
    public static final c f14156F = new c("KSuspendFunction", 3);

    /* renamed from: G, reason: collision with root package name */
    public static final c f14157G = new c("UNKNOWN", 4);

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ c[] f14158H;

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f14159I;

    /* compiled from: FunctionClassKind.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final c a(f functionTypeKind) {
            C3862t.g(functionTypeKind, "functionTypeKind");
            return C3862t.b(functionTypeKind, f.a.f14165e) ? c.f14153C : C3862t.b(functionTypeKind, f.d.f14168e) ? c.f14154D : C3862t.b(functionTypeKind, f.b.f14166e) ? c.f14155E : C3862t.b(functionTypeKind, f.c.f14167e) ? c.f14156F : c.f14157G;
        }

        private a() {
        }
    }

    static {
        c[] cVarArrC = c();
        f14158H = cVarArrC;
        f14159I = C4929b.a(cVarArrC);
        f14152B = new a(null);
    }

    private c(String str, int i10) {
    }

    private static final /* synthetic */ c[] c() {
        return new c[]{f14153C, f14154D, f14155E, f14156F, f14157G};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f14158H.clone();
    }
}
