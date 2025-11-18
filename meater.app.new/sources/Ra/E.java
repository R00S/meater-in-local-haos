package Ra;

import kotlin.jvm.internal.C3854k;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Modality.kt */
/* loaded from: classes3.dex */
public final class E {

    /* renamed from: B, reason: collision with root package name */
    public static final a f15105B;

    /* renamed from: C, reason: collision with root package name */
    public static final E f15106C = new E("FINAL", 0);

    /* renamed from: D, reason: collision with root package name */
    public static final E f15107D = new E("SEALED", 1);

    /* renamed from: E, reason: collision with root package name */
    public static final E f15108E = new E("OPEN", 2);

    /* renamed from: F, reason: collision with root package name */
    public static final E f15109F = new E("ABSTRACT", 3);

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ E[] f15110G;

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f15111H;

    /* compiled from: Modality.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final E a(boolean z10, boolean z11, boolean z12) {
            return z10 ? E.f15107D : z11 ? E.f15109F : z12 ? E.f15108E : E.f15106C;
        }

        private a() {
        }
    }

    static {
        E[] eArrC = c();
        f15110G = eArrC;
        f15111H = C4929b.a(eArrC);
        f15105B = new a(null);
    }

    private E(String str, int i10) {
    }

    private static final /* synthetic */ E[] c() {
        return new E[]{f15106C, f15107D, f15108E, f15109F};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f15110G.clone();
    }
}
