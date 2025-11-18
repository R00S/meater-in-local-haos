package com.flurry.sdk;

import android.location.Location;
import android.os.Build;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.y5 */
/* loaded from: classes2.dex */
public final class C6208y5 extends AbstractC6144q6 {

    /* renamed from: b */
    public final int f16526b;

    /* renamed from: c */
    public boolean f16527c;

    /* renamed from: d */
    public boolean f16528d;

    /* renamed from: e */
    public final Location f16529e;

    public C6208y5(int i2, boolean z, boolean z2, Location location) {
        this.f16526b = i2;
        this.f16527c = z;
        this.f16528d = z2;
        this.f16529e = location;
    }

    @Override // com.flurry.sdk.AbstractC6144q6, com.flurry.sdk.InterfaceC6169t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        Location location;
        double d2;
        double d3;
        boolean zHasSpeedAccuracy;
        JSONObject jSONObjectMo12963a = super.mo12963a();
        jSONObjectMo12963a.put("fl.report.location.enabled", this.f16527c);
        if (this.f16527c) {
            jSONObjectMo12963a.put("fl.location.permission.status", this.f16528d);
            if (this.f16528d && (location = this.f16529e) != null) {
                int i2 = Build.VERSION.SDK_INT;
                boolean z = false;
                double verticalAccuracyMeters = 0.0d;
                if (i2 >= 26) {
                    verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                    double bearingAccuracyDegrees = this.f16529e.getBearingAccuracyDegrees();
                    double speedAccuracyMetersPerSecond = this.f16529e.getSpeedAccuracyMetersPerSecond();
                    boolean zHasBearingAccuracy = this.f16529e.hasBearingAccuracy();
                    zHasSpeedAccuracy = this.f16529e.hasSpeedAccuracy();
                    d3 = speedAccuracyMetersPerSecond;
                    d2 = bearingAccuracyDegrees;
                    z = zHasBearingAccuracy;
                } else {
                    d2 = 0.0d;
                    d3 = 0.0d;
                    zHasSpeedAccuracy = false;
                }
                jSONObjectMo12963a.put("fl.precision.value", this.f16526b);
                jSONObjectMo12963a.put("fl.latitude.value", this.f16529e.getLatitude());
                jSONObjectMo12963a.put("fl.longitude.value", this.f16529e.getLongitude());
                jSONObjectMo12963a.put("fl.horizontal.accuracy.value", this.f16529e.getAccuracy());
                jSONObjectMo12963a.put("fl.time.epoch.value", this.f16529e.getTime());
                if (i2 >= 17) {
                    jSONObjectMo12963a.put("fl.time.uptime.value", TimeUnit.NANOSECONDS.toMillis(this.f16529e.getElapsedRealtimeNanos()));
                }
                jSONObjectMo12963a.put("fl.altitude.value", this.f16529e.getAltitude());
                jSONObjectMo12963a.put("fl.vertical.accuracy.value", verticalAccuracyMeters);
                jSONObjectMo12963a.put("fl.bearing.value", this.f16529e.getBearing());
                jSONObjectMo12963a.put("fl.speed.value", this.f16529e.getSpeed());
                jSONObjectMo12963a.put("fl.bearing.accuracy.available", z);
                jSONObjectMo12963a.put("fl.speed.accuracy.available", zHasSpeedAccuracy);
                jSONObjectMo12963a.put("fl.bearing.accuracy.degrees", d2);
                jSONObjectMo12963a.put("fl.speed.accuracy.meters.per.sec", d3);
            }
        }
        return jSONObjectMo12963a;
    }
}
