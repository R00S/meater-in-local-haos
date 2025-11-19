package x4;

import P5.A;
import P5.C1597e;
import P5.C1599g;
import P5.C1607o;
import android.content.Context;
import android.os.Build;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.activities.ConnectionsControllerActivity;
import com.apptionlabs.meater_app.activities.MeaterDetailsActivity;
import com.apptionlabs.meater_app.activities.MeaterDevicesListActivity;
import com.apptionlabs.meater_app.activities.WifiSettingsActivity;
import com.apptionlabs.meater_app.app.MeaterLinkService;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.qsg.ui.firmware.FirmwareActivity;
import com.apptionlabs.meater_app.singletons.cloudpolling.CloudPollingManager;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import com.apptionlabs.meater_app.views.X;
import f3.ApplicationC3328b;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import x4.e;

/* compiled from: MeaterApp.java */
/* loaded from: classes.dex */
public class g extends ApplicationC3328b implements e.a {

    /* renamed from: C, reason: collision with root package name */
    private static Context f52790C;

    /* renamed from: D, reason: collision with root package name */
    private static G5.a f52791D;

    /* renamed from: E, reason: collision with root package name */
    private static androidx.appcompat.app.c f52792E;

    /* renamed from: F, reason: collision with root package name */
    private static boolean f52793F;

    /* renamed from: B, reason: collision with root package name */
    private i f52794B;

    /* compiled from: MeaterApp.java */
    public enum a {
        PHONE_DEVICE,
        TABLET_DEVICE,
        HIGH_RES_DEVICE
    }

    public static boolean A() {
        Iterator<Probe> it = M4.h.f11978a.L().iterator();
        while (it.hasNext()) {
            if (it.next().appearsToHaveCookInProgress()) {
                return false;
            }
        }
        return true;
    }

    private void C() {
        if (v()) {
            return;
        }
        B();
    }

    public static boolean a() {
        androidx.appcompat.app.c cVar = f52792E;
        return cVar != null && (cVar.getClass() == MeaterDetailsActivity.class || f52792E.getClass() == MeaterDevicesListActivity.class || f52792E.getClass() == ConnectionsControllerActivity.class || f52792E.getClass() == MeaterTargetSetupActivity.class);
    }

    public static boolean b() {
        androidx.appcompat.app.c cVar = f52792E;
        return cVar != null && (cVar.getClass() == MainActivity.class || f52792E.getClass() == MeaterDetailsActivity.class || f52792E.getClass() == MeaterDevicesListActivity.class);
    }

    public static boolean c() {
        androidx.appcompat.app.c cVar = f52792E;
        return cVar != null && (cVar.getClass() == MainActivity.class || f52792E.getClass() == MeaterDetailsActivity.class || f52792E.getClass() == MeaterDevicesListActivity.class || f52792E.getClass() == ConnectionsControllerActivity.class || f52792E.getClass() == WifiSettingsActivity.class);
    }

    public static boolean d() {
        return Arrays.asList("BE", "EL", "LT", "PT", "BG", "ES", "LU", "RO", "CZ", "FR", "HU", "SI", "DK", "HR", "MT", "SK", "DE", "IT", "NL", "FI", "EE", "CY", "AT", "SE", "IE", "LV", "PL", "UK", "GB", "CH", "NO", "IS", "LI").contains(Locale.getDefault().getCountry().toUpperCase());
    }

    public static boolean e() {
        return p().equals(a.TABLET_DEVICE);
    }

    private void f() {
        t().L0(true);
        t().K0(true);
    }

    public static String g() {
        return Build.VERSION.RELEASE;
    }

    public static Context h() {
        return f52790C;
    }

    public static String i() {
        return "4.6.3";
    }

    public static String j() {
        return Locale.getDefault().getCountry();
    }

    public static androidx.appcompat.app.c k() {
        return f52792E;
    }

    private static String l(Locale locale) {
        String country = locale.getCountry();
        return !country.isEmpty() ? country : "US";
    }

    public static String m(Locale locale) {
        String language = locale.getLanguage();
        return !language.isEmpty() ? language : "en";
    }

    public static String n() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static String o() {
        return Build.MANUFACTURER;
    }

    public static a p() {
        int i10 = h().getResources().getConfiguration().smallestScreenWidthDp;
        return i10 < 400 ? a.PHONE_DEVICE : i10 < 600 ? a.HIGH_RES_DEVICE : a.TABLET_DEVICE;
    }

    public static String r() {
        return String.format(Locale.US, "Android-%s", UUID.nameUUIDFromBytes(f52791D.r().getBytes(StandardCharsets.UTF_8)));
    }

    public static String s() {
        Locale locale = Locale.getDefault();
        return m(locale) + "_" + l(locale);
    }

    public static G5.a t() {
        return f52791D;
    }

    public static boolean u() {
        androidx.appcompat.app.c cVar = f52792E;
        return cVar != null && cVar.getClass() == FirmwareActivity.class;
    }

    private boolean v() {
        return MeaterLinkService.f();
    }

    public static boolean w() {
        androidx.appcompat.app.c cVar = f52792E;
        return cVar != null && cVar.getClass() == FirmwareActivity.class;
    }

    public static boolean x() {
        return u() || w();
    }

    public static boolean y() {
        return !f52793F;
    }

    public static void z(com.apptionlabs.meater_app.activities.d dVar) {
        f52792E = dVar;
    }

    public void B() {
        if (t().K() || t().K()) {
            this.f52794B.a();
        }
    }

    public void D() {
        this.f52794B.b();
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f52790C = getApplicationContext();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(new C1599g(defaultUncaughtExceptionHandler));
        }
        f52791D = new G5.a(this);
        this.f52794B = new i(this);
        new e(new WeakReference(this));
        A.c(f52790C);
        if (Config.getInstance().FIREBASE_ENABLED) {
            b.d();
        }
        f();
        int iJ = O4.e.j(f52791D.s());
        if (!f52791D.W() || iJ == O4.e.AUTO.n()) {
            androidx.appcompat.app.f.M(-1);
        } else {
            androidx.appcompat.app.f.M(iJ);
        }
        X.f32813w = f52791D.s();
        MeatCutsHelper.getInstance().init();
        W4.a.b(this);
        FirmwareVersion.sharedInstance().initFromCache(this);
        C1597e.c().b();
    }

    @Override // x4.e.a
    public void q(boolean z10) {
        f52793F = z10;
        boolean zV = v();
        boolean zA = A();
        CloudPollingManager cloudPollingManager = CloudPollingManager.INSTANCE;
        if (!z10) {
            if (zV) {
                for (Probe probe : M4.h.f11978a.L()) {
                    if (probe.appearsToHaveCookInProgress()) {
                        probe.showOrHideCookNotification(false);
                    }
                }
            }
            C();
            if (cloudPollingManager != null) {
                cloudPollingManager.start();
                return;
            }
            return;
        }
        if (cloudPollingManager != null) {
            cloudPollingManager.stop();
        }
        if (zA && zV && !X.f32811u && !C1607o.f14055a.c()) {
            D();
            return;
        }
        for (Probe probe2 : M4.h.f11978a.L()) {
            if (probe2.appearsToHaveCookInProgress()) {
                probe2.showOrHideCookNotification(true);
            }
        }
    }
}
