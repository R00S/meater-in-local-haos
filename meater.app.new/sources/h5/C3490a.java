package h5;

import android.os.Build;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.V;
import p4.DeviceInput;
import x4.g;
import z4.C5194y;

/* compiled from: Device.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lh5/a;", "", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3490a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static String f42338b;

    /* renamed from: c, reason: collision with root package name */
    private static String f42339c;

    /* renamed from: d, reason: collision with root package name */
    private static String f42340d;

    /* renamed from: e, reason: collision with root package name */
    private static String f42341e;

    /* renamed from: f, reason: collision with root package name */
    private static String f42342f;

    /* renamed from: g, reason: collision with root package name */
    private static String f42343g;

    /* renamed from: h, reason: collision with root package name */
    private static String f42344h;

    /* renamed from: i, reason: collision with root package name */
    private static Boolean f42345i;

    /* renamed from: j, reason: collision with root package name */
    private static Boolean f42346j;

    /* renamed from: k, reason: collision with root package name */
    private static Boolean f42347k;

    /* compiled from: Device.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\"\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\"\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\"\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR*\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010%\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R*\u0010(\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$¨\u0006+"}, d2 = {"Lh5/a$a;", "", "<init>", "()V", "Lp4/e;", "a", "()Lp4/e;", "", "id", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "app_version", "b", "setApp_version", "os_name", "f", "setOs_name", "os_version", "g", "setOs_version", "model", "e", "setModel", "locale", "d", "setLocale", "", "kotlin.jvm.PlatformType", "supports_ble5_2mbit_connections", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "setSupports_ble5_2mbit_connections", "(Ljava/lang/Boolean;)V", "supports_ble5_long_distance_connections", "j", "setSupports_ble5_long_distance_connections", "supports_ble5_advertising", "i", "setSupports_ble5_advertising", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: h5.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final DeviceInput a() {
            String strC = c();
            String strB = b();
            String strF = f();
            return new DeviceInput(strC, strB, e(), g(), strF, d(), h(), j(), i());
        }

        public final String b() {
            return C3490a.f42339c;
        }

        public final String c() {
            return C3490a.f42338b;
        }

        public final String d() {
            return C3490a.f42344h;
        }

        public final String e() {
            return C3490a.f42343g;
        }

        public final String f() {
            return C3490a.f42341e;
        }

        public final String g() {
            return C3490a.f42342f;
        }

        public final Boolean h() {
            return C3490a.f42345i;
        }

        public final Boolean i() {
            return C3490a.f42347k;
        }

        public final Boolean j() {
            return C3490a.f42346j;
        }

        private Companion() {
        }
    }

    static {
        V v10 = V.f43983a;
        String str = String.format(Locale.US, "Android-%s", Arrays.copyOf(new Object[]{g.t().r()}, 1));
        C3862t.f(str, "format(...)");
        f42338b = str;
        int length = "4.6.3".length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = C3862t.i("4.6.3".charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        f42339c = "4.6.3".subSequence(i10, length + 1).toString();
        f42340d = "460";
        f42341e = "Android";
        int i11 = Build.VERSION.SDK_INT;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        f42342f = sb2.toString();
        String strN = g.n();
        C3862t.f(strN, "getDeviceInfo(...)");
        f42343g = strN;
        String strS = g.s();
        C3862t.f(strS, "getLocale(...)");
        f42344h = strS;
        f42345i = C5194y.t();
        f42346j = C5194y.v();
        f42347k = C5194y.u();
    }
}
