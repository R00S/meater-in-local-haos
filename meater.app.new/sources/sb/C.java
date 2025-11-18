package sb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes3.dex */
public final class C {

    /* renamed from: B, reason: collision with root package name */
    public static final C f49549B = new C("RENDER_OVERRIDE", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final C f49550C = new C("RENDER_OPEN", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final C f49551D = new C("RENDER_OPEN_OVERRIDE", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ C[] f49552E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f49553F;

    static {
        C[] cArrC = c();
        f49552E = cArrC;
        f49553F = C4929b.a(cArrC);
    }

    private C(String str, int i10) {
    }

    private static final /* synthetic */ C[] c() {
        return new C[]{f49549B, f49550C, f49551D};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f49552E.clone();
    }
}
