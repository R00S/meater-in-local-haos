package ac;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lac/B;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class B {

    /* renamed from: B, reason: collision with root package name */
    public static final B f20289B = new B("START", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final B f20290C = new B("STOP", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final B f20291D = new B("STOP_AND_RESET_REPLAY_CACHE", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ B[] f20292E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f20293F;

    static {
        B[] bArrC = c();
        f20292E = bArrC;
        f20293F = C4929b.a(bArrC);
    }

    private B(String str, int i10) {
    }

    private static final /* synthetic */ B[] c() {
        return new B[]{f20289B, f20290C, f20291D};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f20292E.clone();
    }
}
