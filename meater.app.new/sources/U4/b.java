package U4;

import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Log;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.V;

/* compiled from: Debug.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\rJ/\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\rJ/\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\rJ1\u0010\u0011\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\rJ/\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\rJ/\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\rJ/\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\rJ/\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\rJ/\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\rJ/\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\rJ/\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\rJ/\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\rJ/\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\rJ/\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\rJ/\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\rJ/\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\rJ/\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\rJ/\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u001e\u0010\rJ/\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u001f\u0010\rJ/\u0010 \u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b \u0010\rJ1\u0010!\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b!\u0010\rJ/\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\"\u0010\r¨\u0006#"}, d2 = {"LU4/b;", "", "<init>", "()V", "", "category", "s", "", "args", "Loa/F;", "l", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "q", "(Ljava/lang/String;[Ljava/lang/Object;)V", "p", "v", "a", "e", "n", "f", "g", "x", "u", "k", "h", "j", "o", "d", "b", "c", "r", "m", "w", "i", "t", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f17547a = new b();

    private b() {
    }

    public static final void a(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_BLE_STATE) {
            f17547a.l("BLE", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void b(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_BLOCK_FIRMWARE_UPDATE_STATE) {
            f17547a.l("BLOCK-OTA", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void c(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        Config.Companion companion = Config.INSTANCE;
        if (companion.getInstance().EXTRA_LOGGING_ENABLE && companion.getInstance().LOG_BLOCK_OTA_TRACES) {
            f17547a.l("BLOCK-OTA", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void d(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_BLOCK_WIFI_SETUP_STATE) {
            f17547a.l("BLOCK-WIFI-SETUP", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void e(String s10, Object... args) {
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_API) {
            f17547a.l("CLOUD", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void f(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_CONNECTIVITY_TEST_STATE) {
            f17547a.l("CONN-TEST", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void g(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_COOK_SETUP_CHANGES) {
            f17547a.l("COOK-SETUP", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void h(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_DATA_MIGRATION) {
            f17547a.l("DATA-MIGRATION", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void i(String s10, Object... args) {
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_COOK_ESTIMATOR_STATE) {
            V v10 = V.f43983a;
            C3862t.d(s10);
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(s10, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            C3862t.f(str, "format(...)");
            Log.debug("[ESTIMATOR]", str);
        }
    }

    public static final void j(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_FIREBASE) {
            f17547a.l("FIREBASE", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void k(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_HELP_EVENT) {
            f17547a.l("HELP-EVENT", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void m(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_MEATER_PLUS_OTA_STATE) {
            f17547a.l("M+OTA", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void n(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_MEATER_LINK_SOCKET_STATE) {
            f17547a.l("ML", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void o(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_PAIRING) {
            f17547a.l("PAIRING", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void p(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_PERMISSIONS) {
            f17547a.l("PERMISSIONS", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void q(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_POWER_STATE) {
            f17547a.l("POWER_STATE", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void r(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_PROBE_INFO) {
            f17547a.l("PROBE-INFO", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void s(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_PROBE_SIMULATOR_SOCKET_STATE) {
            f17547a.l("PROBE-SIM", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void t(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_RECIPE) {
            f17547a.l("RECIPE", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void u(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_SERVICE) {
            f17547a.l("SERVICE", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void v(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_SYNCING) {
            f17547a.l("SYNC", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void w(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_COOK_TEMPERATURE_LOG_STATE) {
            f17547a.l("TEMP-LOG", s10, Arrays.copyOf(args, args.length));
        }
    }

    public static final void x(String s10, Object... args) {
        C3862t.g(s10, "s");
        C3862t.g(args, "args");
        if (Config.INSTANCE.getInstance().LOG_VERSION_CHECK) {
            f17547a.l("VERSIONS", s10, Arrays.copyOf(args, args.length));
        }
    }

    private final void l(String category, String s10, Object... args) {
    }
}
