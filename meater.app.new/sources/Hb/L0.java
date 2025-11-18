package Hb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypeUsage.kt */
/* loaded from: classes3.dex */
public final class L0 {

    /* renamed from: B, reason: collision with root package name */
    public static final L0 f5677B = new L0("SUPERTYPE", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final L0 f5678C = new L0("COMMON", 1);

    /* renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ L0[] f5679D;

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f5680E;

    static {
        L0[] l0ArrC = c();
        f5679D = l0ArrC;
        f5680E = C4929b.a(l0ArrC);
    }

    private L0(String str, int i10) {
    }

    private static final /* synthetic */ L0[] c() {
        return new L0[]{f5677B, f5678C};
    }

    public static L0 valueOf(String str) {
        return (L0) Enum.valueOf(L0.class, str);
    }

    public static L0[] values() {
        return (L0[]) f5679D.clone();
    }
}
