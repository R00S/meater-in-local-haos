package Ia;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVisibility.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LIa/u;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "E", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: B, reason: collision with root package name */
    public static final u f6951B = new u("PUBLIC", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final u f6952C = new u("PROTECTED", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final u f6953D = new u("INTERNAL", 2);

    /* renamed from: E, reason: collision with root package name */
    public static final u f6954E = new u("PRIVATE", 3);

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ u[] f6955F;

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f6956G;

    static {
        u[] uVarArrC = c();
        f6955F = uVarArrC;
        f6956G = C4929b.a(uVarArrC);
    }

    private u(String str, int i10) {
    }

    private static final /* synthetic */ u[] c() {
        return new u[]{f6951B, f6952C, f6953D, f6954E};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f6955F.clone();
    }
}
