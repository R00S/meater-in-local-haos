package Xc;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeanDefinition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LXc/d;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: B, reason: collision with root package name */
    public static final d f19127B = new d("Singleton", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final d f19128C = new d("Factory", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final d f19129D = new d("Scoped", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ d[] f19130E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f19131F;

    static {
        d[] dVarArrC = c();
        f19130E = dVarArrC;
        f19131F = C4929b.a(dVarArrC);
    }

    private d(String str, int i10) {
    }

    private static final /* synthetic */ d[] c() {
        return new d[]{f19127B, f19128C, f19129D};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f19130E.clone();
    }
}
