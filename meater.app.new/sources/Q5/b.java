package Q5;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoTutorialProgress.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"LQ5/b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "B", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "C", "a", "D", "E", "F", "G", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: D, reason: collision with root package name */
    public static final b f14344D = new b("COOK_SETUP", 0, "qsg_video_tutorial_cook_setup");

    /* renamed from: E, reason: collision with root package name */
    public static final b f14345E = new b("RESTING", 1, "qsg_video_tutorial_resting");

    /* renamed from: F, reason: collision with root package name */
    public static final b f14346F = new b("SEARING", 2, "qsg_video_tutorial_reverse_searing");

    /* renamed from: G, reason: collision with root package name */
    public static final b f14347G = new b("STANDALONE_MODE", 3, "qsg_video_tutorial_standalone_mode");

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ b[] f14348H;

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f14349I;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String value;

    static {
        b[] bVarArrC = c();
        f14348H = bVarArrC;
        f14349I = C4929b.a(bVarArrC);
        INSTANCE = new Companion(null);
    }

    private b(String str, int i10, String str2) {
        this.value = str2;
    }

    private static final /* synthetic */ b[] c() {
        return new b[]{f14344D, f14345E, f14346F, f14347G};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f14348H.clone();
    }

    /* renamed from: j, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
