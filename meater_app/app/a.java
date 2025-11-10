package com.apptionlabs.meater_app.app;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c6.h;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.activities.BlockFirmwareUpdateActivity;
import com.apptionlabs.meater_app.activities.ConnectionsControllerActivity;
import com.apptionlabs.meater_app.activities.MEATERPlusFirmwareUpdateActivity;
import com.apptionlabs.meater_app.activities.MeaterDetailsActivity;
import com.apptionlabs.meater_app.activities.MeaterDevicesListActivity;
import com.apptionlabs.meater_app.activities.WifiSettingsActivity;
import com.apptionlabs.meater_app.activities.j;
import com.apptionlabs.meater_app.app.MEATERAPPLifeCycleObserver;
import com.apptionlabs.meater_app.app.a;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.singletons.cloudpolling.CloudPollingManager;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import com.apptionlabs.meater_app.views.b1;
import e6.d;
import f8.f;
import f8.u;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import lm.b;
import lm.g;

/* compiled from: MeaterApp.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class a extends Application implements MEATERAPPLifeCycleObserver.a {

    /* renamed from: r, reason: collision with root package name */
    private static Context f9596r;

    /* renamed from: s, reason: collision with root package name */
    private static w7.a f9597s;

    /* renamed from: t, reason: collision with root package name */
    private static j f9598t;

    /* renamed from: u, reason: collision with root package name */
    private static boolean f9599u;

    /* renamed from: q, reason: collision with root package name */
    private g f9600q;

    /* compiled from: MeaterApp.java */
    /* renamed from: com.apptionlabs.meater_app.app.a$a, reason: collision with other inner class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum EnumC0135a {
        PHONE_DEVICE,
        TABLET_DEVICE,
        HIGH_RES_DEVICE
    }

    public static void A(j jVar) {
        f9598t = jVar;
    }

    public static boolean B() {
        Iterator<MEATERDevice> it = h.f8879a.L().iterator();
        while (it.hasNext()) {
            if (it.next().appearsToHaveCookInProgress()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D() {
        boolean z10;
        if (w() && z()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C();
        }
        return z10;
    }

    public static boolean b() {
        j jVar = f9598t;
        if (jVar != null && (jVar.getClass() == MeaterDetailsActivity.class || f9598t.getClass() == MeaterDevicesListActivity.class || f9598t.getClass() == ConnectionsControllerActivity.class || f9598t.getClass() == MeaterTargetSetupActivity.class)) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        j jVar = f9598t;
        if (jVar != null && (jVar.getClass() == MainActivity.class || f9598t.getClass() == MeaterDetailsActivity.class || f9598t.getClass() == MeaterDevicesListActivity.class)) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        j jVar = f9598t;
        if (jVar != null && (jVar.getClass() == MainActivity.class || f9598t.getClass() == MeaterDetailsActivity.class || f9598t.getClass() == MeaterDevicesListActivity.class || f9598t.getClass() == ConnectionsControllerActivity.class || f9598t.getClass() == WifiSettingsActivity.class)) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        return Arrays.asList("BE", "EL", "LT", "PT", "BG", "ES", "LU", "RO", "CZ", "FR", "HU", "SI", "DK", "HR", "MT", "SK", "DE", "IT", "NL", "FI", "EE", "CY", "AT", "SE", "IE", "LV", "PL", "UK", "GB", "CH", "NO", "IS", "LI").contains(Locale.getDefault().getCountry().toUpperCase());
    }

    public static boolean f() {
        return q().equals(EnumC0135a.TABLET_DEVICE);
    }

    private void g() {
        u().c1(true);
        u().b1(true);
    }

    public static String h() {
        return Build.VERSION.RELEASE;
    }

    public static Context i() {
        return f9596r;
    }

    public static String j() {
        return "4.3.1";
    }

    public static String k() {
        return Locale.getDefault().getCountry();
    }

    public static j l() {
        return f9598t;
    }

    private static String m(Locale locale) {
        String country = locale.getCountry();
        if (country.isEmpty()) {
            return "US";
        }
        return country;
    }

    private static String n(Locale locale) {
        String language = locale.getLanguage();
        if (language.isEmpty()) {
            return "en";
        }
        return language;
    }

    public static String o() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static String p() {
        return Build.MANUFACTURER;
    }

    public static EnumC0135a q() {
        int i10 = i().getResources().getConfiguration().smallestScreenWidthDp;
        if (i10 < 400) {
            return EnumC0135a.PHONE_DEVICE;
        }
        if (i10 < 600) {
            return EnumC0135a.HIGH_RES_DEVICE;
        }
        return EnumC0135a.TABLET_DEVICE;
    }

    public static String r() {
        return String.format(Locale.US, "Android-%s", UUID.nameUUIDFromBytes(f9597s.q().getBytes(StandardCharsets.UTF_8)));
    }

    public static String t() {
        Locale locale = Locale.getDefault();
        return n(locale) + "_" + m(locale);
    }

    public static w7.a u() {
        return f9597s;
    }

    public static boolean v() {
        j jVar = f9598t;
        if (jVar != null && jVar.getClass() == BlockFirmwareUpdateActivity.class) {
            return true;
        }
        return false;
    }

    private boolean w() {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (MeaterLinkService.class.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean x() {
        j jVar = f9598t;
        if (jVar != null && jVar.getClass() == MEATERPlusFirmwareUpdateActivity.class) {
            return true;
        }
        return false;
    }

    public static boolean y() {
        if (!v() && !x()) {
            return false;
        }
        return true;
    }

    public static boolean z() {
        return !f9599u;
    }

    public void C() {
        if (!u().H1() || u().V()) {
            this.f9600q.b();
        }
    }

    public void E() {
        this.f9600q.c();
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f9596r = getApplicationContext();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(new f(defaultUncaughtExceptionHandler));
        }
        f9597s = new w7.a(this);
        this.f9600q = new g(this);
        new MEATERAPPLifeCycleObserver(new WeakReference(this));
        u.c(f9596r);
        if (Config.getInstance().FIREBASE_ENABLED) {
            b.e();
        }
        g();
        int i10 = d.i(f9597s.r());
        if (f9597s.i0()) {
            if (i10 != d.AUTO.n()) {
                androidx.appcompat.app.f.M(i10);
            } else {
                androidx.appcompat.app.f.M(-1);
            }
        } else {
            androidx.appcompat.app.f.M(-1);
        }
        b1.f10483w = f9597s.r();
        MeatCutsHelper.getInstance().init(this);
        m6.a.b(this);
        FirmwareVersion.sharedInstance().initFromCache(this);
        f8.d.c().b();
    }

    @Override // com.apptionlabs.meater_app.app.MEATERAPPLifeCycleObserver.a
    public void s(boolean z10) {
        f9599u = z10;
        boolean w10 = w();
        boolean B = B();
        CloudPollingManager cloudPollingManager = CloudPollingManager.INSTANCE;
        if (z10) {
            if (cloudPollingManager != null) {
                cloudPollingManager.stop();
            }
            if (B && w10 && !b1.f10481u) {
                E();
                return;
            }
            for (Probe probe : h.f8879a.M()) {
                if (probe.appearsToHaveCookInProgress()) {
                    probe.showOrHideCookNotification(true);
                }
            }
            return;
        }
        if (w10) {
            for (Probe probe2 : h.f8879a.M()) {
                if (probe2.appearsToHaveCookInProgress()) {
                    probe2.showOrHideCookNotification(false);
                }
            }
        }
        if (D()) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: r5.e
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.D();
                }
            }, 3000L);
        }
        if (cloudPollingManager != null) {
            cloudPollingManager.start();
        }
    }
}
