package W5;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0007¨\u0006\u0011"}, d2 = {"LW5/c;", "", "", "type", "<init>", "(Ljava/lang/String;II)V", "B", "I", "getType", "()I", "C", "a", "D", "E", "F", "G", "H", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: D, reason: collision with root package name */
    public static final c f18432D = new c("BETA", 0, 1);

    /* renamed from: E, reason: collision with root package name */
    public static final c f18433E = new c("DUCK", 1, 2);

    /* renamed from: F, reason: collision with root package name */
    public static final c f18434F = new c("PSY_DUCK", 2, 3);

    /* renamed from: G, reason: collision with root package name */
    public static final c f18435G = new c("GAMMON", 3, 4);

    /* renamed from: H, reason: collision with root package name */
    public static final c f18436H = new c("DEVELOPMENT", 4, 5);

    /* renamed from: I, reason: collision with root package name */
    public static final c f18437I = new c("PRODUCTION", 5, 6);

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ c[] f18438J;

    /* renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f18439K;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int type;

    static {
        c[] cVarArrC = c();
        f18438J = cVarArrC;
        f18439K = C4929b.a(cVarArrC);
        INSTANCE = new Companion(null);
    }

    private c(String str, int i10, int i11) {
        this.type = i11;
    }

    private static final /* synthetic */ c[] c() {
        return new c[]{f18432D, f18433E, f18434F, f18435G, f18436H, f18437I};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f18438J.clone();
    }
}
