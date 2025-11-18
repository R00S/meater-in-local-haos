package g5;

import com.apptionlabs.meater_app.model.TemperatureLog;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QSGScreenProgress.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0007j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lg5/c;", "", "", "progress", "<init>", "(Ljava/lang/String;II)V", "B", "I", "j", "()I", "C", "a", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: g5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3427c {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC3427c f41899D = new EnumC3427c("NO_PROGRESS", 0, 0);

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC3427c f41900E = new EnumC3427c("LOGIN_SCREEN", 1, 10);

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC3427c f41901F = new EnumC3427c("CHOOSE_PRODUCT_SCREEN", 2, 20);

    /* renamed from: G, reason: collision with root package name */
    public static final EnumC3427c f41902G = new EnumC3427c("PRODUCT_SELECTION_SCREEN", 3, 21);

    /* renamed from: H, reason: collision with root package name */
    public static final EnumC3427c f41903H = new EnumC3427c("MANUAL_SCREEN", 4, 30);

    /* renamed from: I, reason: collision with root package name */
    public static final EnumC3427c f41904I = new EnumC3427c("TEMPERATURE_INTERNAL_SCREEN", 5, 40);

    /* renamed from: J, reason: collision with root package name */
    public static final EnumC3427c f41905J = new EnumC3427c("TEMPERATURE_AMBIENT_SCREEN", 6, 50);

    /* renamed from: K, reason: collision with root package name */
    public static final EnumC3427c f41906K = new EnumC3427c("BATTERY_TAB_SCREEN", 7, 60);

    /* renamed from: L, reason: collision with root package name */
    public static final EnumC3427c f41907L = new EnumC3427c("POWER_UP_SCREEN", 8, 70);

    /* renamed from: M, reason: collision with root package name */
    public static final EnumC3427c f41908M = new EnumC3427c("TEMPERATURE_SCALE_SCREEN", 9, 80);

    /* renamed from: N, reason: collision with root package name */
    public static final EnumC3427c f41909N = new EnumC3427c("PROBE_CHARGING_SCREEN", 10, 90);

    /* renamed from: O, reason: collision with root package name */
    public static final EnumC3427c f41910O = new EnumC3427c("BLUETOOTH_PERMISSION_SCREEN", 11, 100);

    /* renamed from: P, reason: collision with root package name */
    public static final EnumC3427c f41911P = new EnumC3427c("BLUETOOTH_PERMISSION_DISABLED_SCREEN", 12, 110);

    /* renamed from: Q, reason: collision with root package name */
    public static final EnumC3427c f41912Q = new EnumC3427c("NOTIFICATION_PERMISSION_SCREEN", 13, TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES);

    /* renamed from: R, reason: collision with root package name */
    public static final EnumC3427c f41913R = new EnumC3427c("NOTIFICATION_PERMISSION_DISABLED_SCREEN", 14, 130);

    /* renamed from: S, reason: collision with root package name */
    public static final EnumC3427c f41914S = new EnumC3427c("IMPORTANT_ALERT_PERMISSION_SCREEN", 15, 140);

    /* renamed from: T, reason: collision with root package name */
    public static final EnumC3427c f41915T = new EnumC3427c("IMPORTANT_ALERT_PERMISSION_DISABLED_SCREEN", 16, 150);

    /* renamed from: U, reason: collision with root package name */
    public static final EnumC3427c f41916U = new EnumC3427c("MEATER_PROBE_PAIRING_SCREEN", 17, 160);

    /* renamed from: V, reason: collision with root package name */
    public static final EnumC3427c f41917V = new EnumC3427c("NEAR_BY_DEVICES_SCREEN", 18, 170);

    /* renamed from: W, reason: collision with root package name */
    public static final EnumC3427c f41918W = new EnumC3427c("MEATER_PROBE_PAIRING_COMPLETE_SCREEN", 19, 180);

    /* renamed from: X, reason: collision with root package name */
    public static final EnumC3427c f41919X = new EnumC3427c("CONTINUOUS_CHARGING_SCREEN", 20, 190);

    /* renamed from: Y, reason: collision with root package name */
    public static final EnumC3427c f41920Y = new EnumC3427c("SETUP_COMPLETE_SCREEN", 21, 250);

    /* renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumC3427c[] f41921Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f41922a0;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int progress;

    /* compiled from: QSGScreenProgress.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg5/c$a;", "", "<init>", "()V", "", "progress", "Lg5/c;", "a", "(I)Lg5/c;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: g5.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final EnumC3427c a(int progress) {
            for (EnumC3427c enumC3427c : EnumC3427c.values()) {
                if (enumC3427c.getProgress() == progress) {
                    return enumC3427c;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    static {
        EnumC3427c[] enumC3427cArrC = c();
        f41921Z = enumC3427cArrC;
        f41922a0 = C4929b.a(enumC3427cArrC);
        INSTANCE = new Companion(null);
    }

    private EnumC3427c(String str, int i10, int i11) {
        this.progress = i11;
    }

    private static final /* synthetic */ EnumC3427c[] c() {
        return new EnumC3427c[]{f41899D, f41900E, f41901F, f41902G, f41903H, f41904I, f41905J, f41906K, f41907L, f41908M, f41909N, f41910O, f41911P, f41912Q, f41913R, f41914S, f41915T, f41916U, f41917V, f41918W, f41919X, f41920Y};
    }

    public static EnumC3427c valueOf(String str) {
        return (EnumC3427c) Enum.valueOf(EnumC3427c.class, str);
    }

    public static EnumC3427c[] values() {
        return (EnumC3427c[]) f41921Z.clone();
    }

    /* renamed from: j, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }
}
