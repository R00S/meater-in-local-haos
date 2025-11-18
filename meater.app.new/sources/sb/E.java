package sb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes3.dex */
public final class E {

    /* renamed from: B, reason: collision with root package name */
    public static final E f49559B = new E("PRETTY", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final E f49560C = new E("DEBUG", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final E f49561D = new E("NONE", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ E[] f49562E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f49563F;

    static {
        E[] eArrC = c();
        f49562E = eArrC;
        f49563F = C4929b.a(eArrC);
    }

    private E(String str, int i10) {
    }

    private static final /* synthetic */ E[] c() {
        return new E[]{f49559B, f49560C, f49561D};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f49562E.clone();
    }
}
