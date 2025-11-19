package Sa;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KotlinRetention.kt */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: B, reason: collision with root package name */
    public static final q f15646B = new q("RUNTIME", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final q f15647C = new q("BINARY", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final q f15648D = new q("SOURCE", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ q[] f15649E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f15650F;

    static {
        q[] qVarArrC = c();
        f15649E = qVarArrC;
        f15650F = C4929b.a(qVarArrC);
    }

    private q(String str, int i10) {
    }

    private static final /* synthetic */ q[] c() {
        return new q[]{f15646B, f15647C, f15648D};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f15649E.clone();
    }
}
