package com.apptionlabs.meater_app.versions;

import android.os.Build;
import java.util.Locale;
import t5.x;

/* loaded from: /tmp/meat/meat/classes.dex */
public class DeviceJson {
    public String id = String.format(Locale.US, "Android-%s", com.apptionlabs.meater_app.app.a.u().q());
    public String app_version = "4.3.1";
    public String app_build = "394";
    public String os_name = "Android";
    public String os_version = "" + Build.VERSION.SDK_INT;
    public String model = com.apptionlabs.meater_app.app.a.o();
    public String locale = com.apptionlabs.meater_app.app.a.t();
    public Boolean supports_ble5_2mbit_connections = x.t();
    public Boolean supports_ble5_long_distance_connections = x.v();
    public Boolean supports_ble5_advertising = x.u();
}
