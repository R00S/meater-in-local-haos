package Fb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeserializedContainerSource.kt */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: B, reason: collision with root package name */
    public static final r f4676B = new r("STABLE", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final r f4677C = new r("UNSTABLE", 1);

    /* renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ r[] f4678D;

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f4679E;

    static {
        r[] rVarArrC = c();
        f4678D = rVarArrC;
        f4679E = C4929b.a(rVarArrC);
    }

    private r(String str, int i10) {
    }

    private static final /* synthetic */ r[] c() {
        return new r[]{f4676B, f4677C};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f4678D.clone();
    }
}
