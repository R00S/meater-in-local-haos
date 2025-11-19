package ib;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypeComponentPosition.kt */
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: B, reason: collision with root package name */
    public static final h0 f43266B = new h0("FLEXIBLE_LOWER", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final h0 f43267C = new h0("FLEXIBLE_UPPER", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final h0 f43268D = new h0("INFLEXIBLE", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ h0[] f43269E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f43270F;

    static {
        h0[] h0VarArrC = c();
        f43269E = h0VarArrC;
        f43270F = C4929b.a(h0VarArrC);
    }

    private h0(String str, int i10) {
    }

    private static final /* synthetic */ h0[] c() {
        return new h0[]{f43266B, f43267C, f43268D};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f43269E.clone();
    }
}
