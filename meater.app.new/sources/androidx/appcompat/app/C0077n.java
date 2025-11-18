package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0257c;
import cm.aptoide.p092pt.notification.PullingContentService;
import java.util.Calendar;

/* compiled from: TwilightManager.java */
/* renamed from: androidx.appcompat.app.n */
/* loaded from: classes.dex */
class C0077n {

    /* renamed from: a */
    private static C0077n f406a;

    /* renamed from: b */
    private final Context f407b;

    /* renamed from: c */
    private final LocationManager f408c;

    /* renamed from: d */
    private final a f409d = new a();

    /* compiled from: TwilightManager.java */
    /* renamed from: androidx.appcompat.app.n$a */
    private static class a {

        /* renamed from: a */
        boolean f410a;

        /* renamed from: b */
        long f411b;

        /* renamed from: c */
        long f412c;

        /* renamed from: d */
        long f413d;

        /* renamed from: e */
        long f414e;

        /* renamed from: f */
        long f415f;

        a() {
        }
    }

    C0077n(Context context, LocationManager locationManager) {
        this.f407b = context;
        this.f408c = locationManager;
    }

    /* renamed from: a */
    static C0077n m424a(Context context) {
        if (f406a == null) {
            Context applicationContext = context.getApplicationContext();
            f406a = new C0077n(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f406a;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m425b() {
        Location locationM426c = C0257c.m1701b(this.f407b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m426c("network") : null;
        Location locationM426c2 = C0257c.m1701b(this.f407b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m426c("gps") : null;
        return (locationM426c2 == null || locationM426c == null) ? locationM426c2 != null ? locationM426c2 : locationM426c : locationM426c2.getTime() > locationM426c.getTime() ? locationM426c2 : locationM426c;
    }

    /* renamed from: c */
    private Location m426c(String str) {
        try {
            if (this.f408c.isProviderEnabled(str)) {
                return this.f408c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m427e() {
        return this.f409d.f415f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m428f(Location location) {
        long j2;
        a aVar = this.f409d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0076m c0076mM422b = C0076m.m422b();
        c0076mM422b.m423a(jCurrentTimeMillis - PullingContentService.UPDATES_INTERVAL, location.getLatitude(), location.getLongitude());
        long j3 = c0076mM422b.f403b;
        c0076mM422b.m423a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = c0076mM422b.f405d == 1;
        long j4 = c0076mM422b.f404c;
        long j5 = c0076mM422b.f403b;
        boolean z2 = z;
        c0076mM422b.m423a(PullingContentService.UPDATES_INTERVAL + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = c0076mM422b.f404c;
        if (j4 == -1 || j5 == -1) {
            j2 = 43200000 + jCurrentTimeMillis;
        } else {
            j2 = (jCurrentTimeMillis > j5 ? 0 + j6 : jCurrentTimeMillis > j4 ? 0 + j5 : 0 + j4) + 60000;
        }
        aVar.f410a = z2;
        aVar.f411b = j3;
        aVar.f412c = j4;
        aVar.f413d = j5;
        aVar.f414e = j6;
        aVar.f415f = j2;
    }

    /* renamed from: d */
    boolean m429d() {
        a aVar = this.f409d;
        if (m427e()) {
            return aVar.f410a;
        }
        Location locationM425b = m425b();
        if (locationM425b != null) {
            m428f(locationM425b);
            return aVar.f410a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }
}
