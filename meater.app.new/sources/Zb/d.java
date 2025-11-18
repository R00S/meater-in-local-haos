package Zb;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BufferOverflow.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LZb/d;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: B, reason: collision with root package name */
    public static final d f19650B = new d("SUSPEND", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final d f19651C = new d("DROP_OLDEST", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final d f19652D = new d("DROP_LATEST", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ d[] f19653E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f19654F;

    static {
        d[] dVarArrC = c();
        f19653E = dVarArrC;
        f19654F = C4929b.a(dVarArrC);
    }

    private d(String str, int i10) {
    }

    private static final /* synthetic */ d[] c() {
        return new d[]{f19650B, f19651C, f19652D};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f19653E.clone();
    }
}
