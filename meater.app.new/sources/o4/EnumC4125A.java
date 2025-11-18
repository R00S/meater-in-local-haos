package o4;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StepContentType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lo4/A;", "", "", "diff", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "B", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "C", "a", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4125A {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC4125A f46407D = new EnumC4125A("UNKNOWN", 0, "");

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC4125A f46408E = new EnumC4125A("TITLE", 1, "title");

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC4125A f46409F = new EnumC4125A("TEXT", 2, "text");

    /* renamed from: G, reason: collision with root package name */
    public static final EnumC4125A f46410G = new EnumC4125A("FLAVOUR_TEXT", 3, "flavour_text");

    /* renamed from: H, reason: collision with root package name */
    public static final EnumC4125A f46411H = new EnumC4125A("HTML", 4, "html");

    /* renamed from: I, reason: collision with root package name */
    public static final EnumC4125A f46412I = new EnumC4125A("TIMER_NOTIFICATION", 5, "timer_notification");

    /* renamed from: J, reason: collision with root package name */
    public static final EnumC4125A f46413J = new EnumC4125A("VIDEO_OVERLAYS", 6, "video_overlays");

    /* renamed from: K, reason: collision with root package name */
    public static final EnumC4125A f46414K = new EnumC4125A("DEVICE_INSTRUCTIONAL_VIDEO", 7, "device_instructional_video");

    /* renamed from: L, reason: collision with root package name */
    public static final EnumC4125A f46415L = new EnumC4125A("IMAGE", 8, "image");

    /* renamed from: M, reason: collision with root package name */
    public static final EnumC4125A f46416M = new EnumC4125A("SELECT_DEVICES", 9, "select_devices");

    /* renamed from: N, reason: collision with root package name */
    public static final EnumC4125A f46417N = new EnumC4125A("SETUP_COOK", 10, "setup_cook");

    /* renamed from: O, reason: collision with root package name */
    public static final EnumC4125A f46418O = new EnumC4125A("MONITOR_DEVICES", 11, "monitor_devices");

    /* renamed from: P, reason: collision with root package name */
    private static final /* synthetic */ EnumC4125A[] f46419P;

    /* renamed from: Q, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f46420Q;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String diff;

    /* compiled from: StepContentType.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo4/A$a;", "", "<init>", "()V", "", "diff", "Lo4/A;", "a", "(Ljava/lang/String;)Lo4/A;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: o4.A$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final EnumC4125A a(String diff) {
            C3862t.g(diff, "diff");
            for (EnumC4125A enumC4125A : EnumC4125A.values()) {
                if (C3862t.b(enumC4125A.getDiff(), diff)) {
                    return enumC4125A;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    static {
        EnumC4125A[] enumC4125AArrC = c();
        f46419P = enumC4125AArrC;
        f46420Q = C4929b.a(enumC4125AArrC);
        INSTANCE = new Companion(null);
    }

    private EnumC4125A(String str, int i10, String str2) {
        this.diff = str2;
    }

    private static final /* synthetic */ EnumC4125A[] c() {
        return new EnumC4125A[]{f46407D, f46408E, f46409F, f46410G, f46411H, f46412I, f46413J, f46414K, f46415L, f46416M, f46417N, f46418O};
    }

    public static EnumC4125A valueOf(String str) {
        return (EnumC4125A) Enum.valueOf(EnumC4125A.class, str);
    }

    public static EnumC4125A[] values() {
        return (EnumC4125A[]) f46419P.clone();
    }

    /* renamed from: j, reason: from getter */
    public final String getDiff() {
        return this.diff;
    }
}
