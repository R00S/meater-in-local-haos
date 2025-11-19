package sb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes3.dex */
public final class D {

    /* renamed from: B, reason: collision with root package name */
    public static final D f49554B = new D("ALL", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final D f49555C = new D("ONLY_NON_SYNTHESIZED", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final D f49556D = new D("NONE", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ D[] f49557E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f49558F;

    static {
        D[] dArrC = c();
        f49557E = dArrC;
        f49558F = C4929b.a(dArrC);
    }

    private D(String str, int i10) {
    }

    private static final /* synthetic */ D[] c() {
        return new D[]{f49554B, f49555C, f49556D};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f49557E.clone();
    }
}
