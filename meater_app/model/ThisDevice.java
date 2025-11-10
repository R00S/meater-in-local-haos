package com.apptionlabs.meater_app.model;

import android.os.BatteryManager;
import com.apptionlabs.meater_app.v3protobuf.CloudDisconnectedState;
import com.apptionlabs.meater_app.v3protobuf.MasterStatus;
import com.apptionlabs.meater_app.v3protobuf.MasterSubType;
import com.apptionlabs.meater_app.v3protobuf.MasterType;
import f8.a;
import f8.l0;
import j6.c;
import j6.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import wh.h0;
import wh.m;

/* compiled from: ThisDevice.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\bI\u0010JR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0014\u0010+\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u000eR\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102R\u0014\u00107\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\"R\u0014\u00109\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\"R\u0014\u0010;\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\"R\u0014\u0010=\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\"R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020?0>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u000eR\u0011\u0010H\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/apptionlabs/meater_app/model/ThisDevice;", "Lj6/o;", "Lj6/g;", "Lj6/c;", "Lcom/apptionlabs/meater_app/v3protobuf/MasterType;", "masterType", "Lcom/apptionlabs/meater_app/v3protobuf/MasterType;", "getMasterType", "()Lcom/apptionlabs/meater_app/v3protobuf/MasterType;", "Lcom/apptionlabs/meater_app/v3protobuf/MasterSubType;", "masterSubType", "Lcom/apptionlabs/meater_app/v3protobuf/MasterSubType;", "", "getAppVersion", "()Ljava/lang/String;", "appVersion", "Lcom/apptionlabs/meater_app/v3protobuf/CloudDisconnectedState;", "getCloudDisconnectedState", "()Lcom/apptionlabs/meater_app/v3protobuf/CloudDisconnectedState;", "cloudDisconnectedState", "getCloudEmail", "cloudEmail", "", "getHasReceivedMasterStatus", "()Z", "hasReceivedMasterStatus", "", "getDeviceID", "()J", "deviceID", "getDeviceIDString", "deviceIDString", "", "getBatteryLevel", "()I", "batteryLevel", "", "getNormalizedBatteryLevel", "()F", "normalizedBatteryLevel", "getShouldShowAsConnected", "shouldShowAsConnected", "getDeviceName", "deviceName", "Lcom/apptionlabs/meater_app/model/DeviceType;", "getDeviceType", "()Lcom/apptionlabs/meater_app/model/DeviceType;", "deviceType", "Lcom/apptionlabs/meater_app/model/DeviceConnectionMethod;", "getConnectionMethod", "()Lcom/apptionlabs/meater_app/model/DeviceConnectionMethod;", "connectionMethod", "getDefaultConnectionMethod", "defaultConnectionMethod", "getMediumImage", "mediumImage", "getSmallImage", "smallImage", "getMiniImageDisconnected", "miniImageDisconnected", "getMiniImageConnected", "miniImageConnected", "", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "getDeviceProgeny", "()Ljava/util/List;", "deviceProgeny", "getDebugLogDescription", "debugLogDescription", "Lcom/apptionlabs/meater_app/v3protobuf/MasterStatus;", "getMasterStatus", "()Lcom/apptionlabs/meater_app/v3protobuf/MasterStatus;", "masterStatus", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class ThisDevice implements o, j6.g, j6.c {
    private static final MasterSubType masterSubType;
    public static final ThisDevice INSTANCE = new ThisDevice();
    private static final MasterType masterType = MasterType.MASTER_TYPE_ANDROID;

    static {
        MasterSubType masterSubType2;
        if (com.apptionlabs.meater_app.app.a.f()) {
            masterSubType2 = MasterSubType.MASTER_SUBTYPE_TABLET;
        } else {
            masterSubType2 = MasterSubType.MASTER_SUBTYPE_PHONE;
        }
        masterSubType = masterSubType2;
    }

    private ThisDevice() {
    }

    @Override // j6.c
    public String getAppVersion() {
        return "4.3.1";
    }

    @Override // j6.o
    public int getBatteryLevel() {
        Object systemService = com.apptionlabs.meater_app.app.a.i().getSystemService("batterymanager");
        m.d(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        BatteryManager batteryManager = (BatteryManager) systemService;
        int b10 = ci.g.b(0, batteryManager.getIntProperty(4));
        if (batteryManager.isCharging()) {
            return a.b.POWERED.f12459q;
        }
        return b10;
    }

    @Override // j6.g
    public CloudDisconnectedState getCloudDisconnectedState() {
        CloudDisconnectedState O = y5.g.E().O();
        m.e(O, "getCloudDisconnectedState(...)");
        return O;
    }

    @Override // j6.g
    public String getCloudEmail() {
        MEATERCloudAccount k10;
        if (!y5.g.U() || (k10 = com.apptionlabs.meater_app.app.a.u().k()) == null) {
            return null;
        }
        return k10.email;
    }

    @Override // j6.o
    public DeviceConnectionMethod getConnectionMethod() {
        return DeviceConnectionMethod.NONE;
    }

    @Override // j6.o
    public String getDebugLogDescription() {
        h0 h0Var = h0.a;
        String format = String.format("<ThisDevice %s>", Arrays.copyOf(new Object[]{getDeviceIDString()}, 1));
        m.e(format, "format(format, *args)");
        return format;
    }

    public DeviceConnectionMethod getDefaultConnectionMethod() {
        return getConnectionMethod();
    }

    @Override // j6.o
    public long getDeviceID() {
        return l0.K(getDeviceIDString());
    }

    @Override // j6.o
    public String getDeviceIDString() {
        String q10 = com.apptionlabs.meater_app.app.a.u().q();
        m.e(q10, "getDeviceId(...)");
        Locale locale = Locale.getDefault();
        m.e(locale, "getDefault(...)");
        String upperCase = q10.toUpperCase(locale);
        m.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @Override // j6.o
    public String getDeviceName() {
        String string = com.apptionlabs.meater_app.app.a.i().getString(2132018270, com.apptionlabs.meater_app.app.a.i().getString(g6.c.a(masterType, masterSubType)));
        m.e(string, "getString(...)");
        return string;
    }

    public List<MEATERDevice> getDeviceProgeny() {
        return new ArrayList();
    }

    @Override // j6.o
    public DeviceType getDeviceType() {
        return DeviceType.THIS_DEVICE;
    }

    public boolean getHasAppInstalled() {
        return c.a.a(this);
    }

    @Override // j6.g
    public boolean getHasReceivedMasterStatus() {
        return true;
    }

    public final MasterStatus getMasterStatus() {
        return new MasterStatus(Long.valueOf(getDeviceID()), masterType, masterSubType, Integer.valueOf(getBatteryLevel()), getCloudEmail(), getAppVersion(), getCloudDisconnectedState());
    }

    public final MasterType getMasterType() {
        return masterType;
    }

    @Override // j6.o
    public int getMediumImage() {
        return 2131231242;
    }

    @Override // j6.o
    public int getMiniImageConnected() {
        return 2131231258;
    }

    @Override // j6.o
    public int getMiniImageDisconnected() {
        return 2131231259;
    }

    @Override // j6.o
    public float getNormalizedBatteryLevel() {
        return getBatteryLevel() / 100.0f;
    }

    @Override // j6.o
    public boolean getShouldShowAsConnected() {
        return true;
    }

    @Override // j6.o
    public int getSmallImage() {
        return 2131231312;
    }
}
