package ad;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lad/b;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "E", "F", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: B, reason: collision with root package name */
    public static final b f20456B = new b("DEBUG", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final b f20457C = new b("INFO", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final b f20458D = new b("WARNING", 2);

    /* renamed from: E, reason: collision with root package name */
    public static final b f20459E = new b("ERROR", 3);

    /* renamed from: F, reason: collision with root package name */
    public static final b f20460F = new b("NONE", 4);

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ b[] f20461G;

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f20462H;

    static {
        b[] bVarArrC = c();
        f20461G = bVarArrC;
        f20462H = C4929b.a(bVarArrC);
    }

    private b(String str, int i10) {
    }

    private static final /* synthetic */ b[] c() {
        return new b[]{f20456B, f20457C, f20458D, f20459E, f20460F};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f20461G.clone();
    }
}
