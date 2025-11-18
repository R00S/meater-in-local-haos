package x5;

import com.apptionlabs.meater_app.data.Temperature;
import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NextStepActionType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0007j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lx5/b;", "", "", "diff", "<init>", "(Ljava/lang/String;II)V", "B", "I", "getDiff", "()I", "C", "a", "D", "E", "F", "G", "H", "J", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: x5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5057b {

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC5057b f52809D = new EnumC5057b("NEXT_SCREEN", 0, 100);

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC5057b f52810E = new EnumC5057b("SELECT_DEVICES", 1, 200);

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC5057b f52811F = new EnumC5057b("WAIT_FOR_JOB_DONE", 2, 300);

    /* renamed from: G, reason: collision with root package name */
    public static final EnumC5057b f52812G = new EnumC5057b("REMOVE_FROM_HEAT", 3, 400);

    /* renamed from: H, reason: collision with root package name */
    public static final EnumC5057b f52813H = new EnumC5057b("RESTING", 4, Temperature.MAX_AMBIENT_SECOND_GEN_PROBE);

    /* renamed from: I, reason: collision with root package name */
    public static final EnumC5057b f52814I = new EnumC5057b("READY", 5, 600);

    /* renamed from: J, reason: collision with root package name */
    public static final EnumC5057b f52815J = new EnumC5057b("FINISH", 6, 700);

    /* renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ EnumC5057b[] f52816K;

    /* renamed from: L, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f52817L;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int diff;

    static {
        EnumC5057b[] enumC5057bArrC = c();
        f52816K = enumC5057bArrC;
        f52817L = C4929b.a(enumC5057bArrC);
        INSTANCE = new Companion(null);
    }

    private EnumC5057b(String str, int i10, int i11) {
        this.diff = i11;
    }

    private static final /* synthetic */ EnumC5057b[] c() {
        return new EnumC5057b[]{f52809D, f52810E, f52811F, f52812G, f52813H, f52814I, f52815J};
    }

    public static EnumC5057b valueOf(String str) {
        return (EnumC5057b) Enum.valueOf(EnumC5057b.class, str);
    }

    public static EnumC5057b[] values() {
        return (EnumC5057b[]) f52816K.clone();
    }
}
