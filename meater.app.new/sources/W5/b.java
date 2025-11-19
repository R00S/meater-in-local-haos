package W5;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LW5/b;", "", "", "url", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "B", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "C", "D", "E", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: C, reason: collision with root package name */
    public static final b f18425C = new b("MEATER_CLOUD", 0, "cloud.meater.com");

    /* renamed from: D, reason: collision with root package name */
    public static final b f18426D = new b("RECIPE_CLOUD", 1, "meater.cloud");

    /* renamed from: E, reason: collision with root package name */
    public static final b f18427E = new b("DYNAMIC_URL", 2, "");

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ b[] f18428F;

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f18429G;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String url;

    static {
        b[] bVarArrC = c();
        f18428F = bVarArrC;
        f18429G = C4929b.a(bVarArrC);
    }

    private b(String str, int i10, String str2) {
        this.url = str2;
    }

    private static final /* synthetic */ b[] c() {
        return new b[]{f18425C, f18426D, f18427E};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f18428F.clone();
    }

    /* renamed from: j, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
