package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import com.apptionlabs.meater_app.data.Config;
import g1.C3380d;
import java.util.Calendar;

/* compiled from: TwilightManager.java */
/* loaded from: classes.dex */
class x {

    /* renamed from: d, reason: collision with root package name */
    private static x f20797d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f20798a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f20799b;

    /* renamed from: c, reason: collision with root package name */
    private final a f20800c = new a();

    /* compiled from: TwilightManager.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f20801a;

        /* renamed from: b, reason: collision with root package name */
        long f20802b;

        a() {
        }
    }

    x(Context context, LocationManager locationManager) {
        this.f20798a = context;
        this.f20799b = locationManager;
    }

    static x a(Context context) {
        if (f20797d == null) {
            Context applicationContext = context.getApplicationContext();
            f20797d = new x(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f20797d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationC = C3380d.b(this.f20798a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = C3380d.b(this.f20798a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f20799b.isProviderEnabled(str)) {
                return this.f20799b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f20800c.f20802b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f20800c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        w wVarB = w.b();
        wVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        wVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = wVarB.f20796c == 1;
        long j11 = wVarB.f20795b;
        long j12 = wVarB.f20794a;
        wVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = wVarB.f20795b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j12) {
                j13 = jCurrentTimeMillis > j11 ? j12 : j11;
            }
            j10 = j13 + Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX;
        }
        aVar.f20801a = z10;
        aVar.f20802b = j10;
    }

    boolean d() {
        a aVar = this.f20800c;
        if (e()) {
            return aVar.f20801a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f20801a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
