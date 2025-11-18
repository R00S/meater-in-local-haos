package O4;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceConnectivityState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LO4/c;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: B, reason: collision with root package name */
    public static final c f13242B = new c("Unknown", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final c f13243C = new c("AvailableOverLink", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final c f13244D = new c("UnavailableOverLink", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ c[] f13245E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f13246F;

    static {
        c[] cVarArrC = c();
        f13245E = cVarArrC;
        f13246F = C4929b.a(cVarArrC);
    }

    private c(String str, int i10) {
    }

    private static final /* synthetic */ c[] c() {
        return new c[]{f13242B, f13243C, f13244D};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f13245E.clone();
    }
}
