package O4;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TemperatureViewType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LO4/g;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: B, reason: collision with root package name */
    public static final g f13259B = new g("INTERNAL", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final g f13260C = new g("TARGET", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final g f13261D = new g("AMBIENT", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ g[] f13262E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f13263F;

    static {
        g[] gVarArrC = c();
        f13262E = gVarArrC;
        f13263F = C4929b.a(gVarArrC);
    }

    private g(String str, int i10) {
    }

    private static final /* synthetic */ g[] c() {
        return new g[]{f13259B, f13260C, f13261D};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f13262E.clone();
    }
}
