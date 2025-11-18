package T5;

import B4.l;
import P5.B;
import P5.C1608p;
import P5.Q;
import P5.T;
import android.content.Context;
import android.view.Y;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.InfoPair;
import com.apptionlabs.meater_app.data.WebLink;
import com.apptionlabs.meater_app.model.DeviceChargingMethod;
import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.DeviceType;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.MasterDevice;
import com.apptionlabs.meater_app.model.OptionDeviceInfo;
import com.apptionlabs.meater_app.model.ThisDevice;
import com.apptionlabs.meater_app.qsg.ui.firmware.FirmwareActivity;
import com.apptionlabs.meater_app.versions.AppVersion;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import com.apptionlabs.meater_app.versions.Versions;
import g1.C3377a;
import java.util.ArrayList;
import java.util.List;
import z4.C5177g;
import z4.C5194y;

/* compiled from: ConnectionsControllerViewModel.java */
/* loaded from: classes2.dex */
public class c extends Y {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f16028f = new String[0];

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f16029g = new String[0];

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f16030h = {x4.g.h().getString(R.string.changing_block_cloud_account)};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f16031i = {"https://support.meater.com/block-cloud-account"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f16032j = {x4.g.h().getString(R.string.changing_pro_xl_cloud_account)};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f16033k = {x4.g.h().getString(R.string.changing_pro_duo_cloud_account)};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f16034l = {"https://support.meater.com/block-cloud-account"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f16035m = {"https://support.meater.com/block-cloud-account"};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f16036n = new String[0];

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f16037o = new String[0];

    /* renamed from: b, reason: collision with root package name */
    private T4.p f16038b;

    /* renamed from: c, reason: collision with root package name */
    private MEATERDeviceType f16039c;

    /* renamed from: d, reason: collision with root package name */
    private MasterDevice f16040d;

    /* renamed from: e, reason: collision with root package name */
    private Versions f16041e;

    /* compiled from: ConnectionsControllerViewModel.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16042a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f16043b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f16044c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f16045d;

        static {
            int[] iArr = new int[DeviceConnectionMethod.values().length];
            f16045d = iArr;
            try {
                iArr[DeviceConnectionMethod.PROBE_SIM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16045d[DeviceConnectionMethod.BLUETOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16045d[DeviceConnectionMethod.MEATER_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16045d[DeviceConnectionMethod.MEATER_CLOUD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16045d[DeviceConnectionMethod.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[DeviceType.values().length];
            f16044c = iArr2;
            try {
                iArr2[DeviceType.MEATER_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16044c[DeviceType.MASTER_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16044c[DeviceType.THIS_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[OptionDeviceInfo.values().length];
            f16043b = iArr3;
            try {
                iArr3[OptionDeviceInfo.APP_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16043b[OptionDeviceInfo.APP_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16043b[OptionDeviceInfo.PROBE_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16043b[OptionDeviceInfo.WIFI_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16043b[OptionDeviceInfo.FIRMWARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16043b[OptionDeviceInfo.FIRMWARE_UPDATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16043b[OptionDeviceInfo.REASON.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16043b[OptionDeviceInfo.WIFI_CONNECTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16043b[OptionDeviceInfo.CALIBRATION_CELL.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr4 = new int[MEATERDeviceType.values().length];
            f16042a = iArr4;
            try {
                iArr4[MEATERDeviceType.BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f16042a[MEATERDeviceType.BLOCK_PROBE_ONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f16042a[MEATERDeviceType.BLOCK_PROBE_TWO.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f16042a[MEATERDeviceType.BLOCK_PROBE_THREE.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f16042a[MEATERDeviceType.BLOCK_PROBE_FOUR.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f16042a[MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f16042a[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_ONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f16042a[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_TWO.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f16042a[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_THREE.ordinal()] = 9;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f16042a[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_FOUR.ordinal()] = 10;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f16042a[MEATERDeviceType.PLUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f16042a[MEATERDeviceType.PLUS_SE.ordinal()] = 12;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f16042a[MEATERDeviceType.PROBE.ordinal()] = 13;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f16042a[MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK.ordinal()] = 14;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f16042a[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 15;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f16042a[MEATERDeviceType.SECOND_GENERATION_PLUS_PRO.ordinal()] = 16;
            } catch (NoSuchFieldError unused33) {
            }
        }
    }

    private String h(MEATERDevice mEATERDevice) {
        MEATERBlock mEATERBlock = (MEATERBlock) mEATERDevice;
        if (mEATERBlock == null || !mEATERBlock.isSupportsBLEKeepAlive()) {
            return (mEATERBlock == null || mEATERBlock.getFirmwareRevision() != null) ? "Not supported" : "Need version";
        }
        if (mEATERBlock.isInWiFiSetupMode()) {
            return "WiFi Setup";
        }
        if (mEATERBlock.getBleConnection() != null && C5194y.l()) {
            l.e eVarN0 = ((C5177g) mEATERBlock.getBleConnection()).n0();
            if (eVarN0 == l.e.eBlockStatusModeWifiClient) {
                return "Wi-Fi Client";
            }
            if (eVarN0 == l.e.eBlockStatusModeBooting) {
                return "Booting";
            }
            if (eVarN0 == l.e.eBlockStatusModeSelecting) {
                return "Select Mode";
            }
            if (eVarN0 == l.e.eBlockStatusModeStandalone) {
                return "Standalone";
            }
            if (eVarN0 == l.e.eBlockStatusModeConfiguring) {
                return "Wi-Fi Setup";
            }
            if (eVarN0 == l.e.eBlockStatusModeBattEmpty) {
                return "Empty Battery";
            }
            if (eVarN0 == l.e.eBlockStatusModeBattEmptyUsb) {
                return "Empty Battery usb Connected";
            }
            if (eVarN0 == l.e.eBlockStatusModeWifiClientOta) {
                return "OTA InProgress";
            }
        }
        return "Not Connected";
    }

    public static List<T4.p> m(T4.p pVar) {
        ArrayList arrayList = new ArrayList();
        if (pVar.getDeviceType() == DeviceType.THIS_DEVICE) {
            return arrayList;
        }
        arrayList.add(ThisDevice.INSTANCE);
        if (pVar.getDeviceType() == DeviceType.MEATER_DEVICE) {
            MEATERDevice mEATERDevice = (MEATERDevice) pVar;
            MasterDevice masterDeviceS = V4.l.g0().s(mEATERDevice);
            if (masterDeviceS != null) {
                arrayList.add(masterDeviceS);
            }
            if (mEATERDevice.getParentDevice() != null) {
                arrayList.add(mEATERDevice.getParentDevice());
            }
        }
        arrayList.add(pVar);
        return arrayList;
    }

    public static int t(T4.p pVar) {
        return (pVar == null || pVar.getDeviceType() != DeviceType.MEATER_DEVICE) ? B.a.UNKNOWN.p() : pVar instanceof MEATERBlock ? T.c((MEATERDevice) pVar) : B.b((MEATERDevice) pVar);
    }

    public static int u(Context context, Object obj) {
        return ((obj instanceof OptionDeviceInfo) && context != null && ((OptionDeviceInfo) obj).isClickable()) ? C3377a.c(context, R.color.primary_color) : Q.v(context) ? -1 : -16777216;
    }

    public static boolean x(T4.p pVar) {
        if (pVar != null && a.f16044c[pVar.getDeviceType().ordinal()] == 1) {
            return y(((MEATERDevice) pVar).getMEATERDeviceType());
        }
        return false;
    }

    public static boolean y(MEATERDeviceType mEATERDeviceType) {
        if (mEATERDeviceType == null) {
            return false;
        }
        switch (a.f16042a[mEATERDeviceType.ordinal()]) {
        }
        return false;
    }

    public boolean A() {
        return (this.f16039c == null && this.f16040d == null) ? false : true;
    }

    public boolean B() {
        int i10;
        MEATERDeviceType mEATERDeviceType = this.f16039c;
        if (mEATERDeviceType != null && (i10 = a.f16042a[mEATERDeviceType.ordinal()]) != 1 && i10 != 6 && i10 != 11 && i10 != 12) {
            switch (i10) {
            }
            return true;
        }
        return true;
    }

    public String i(Context context) {
        return context.getString(R.string.connection_details_connection_header, this.f16038b.getDeviceName());
    }

    public int j(T4.p pVar, boolean z10, boolean z11) {
        if (z10 && !z11) {
            if (a.f16044c[pVar.getDeviceType().ordinal()] != 1) {
                return pVar.getConnectionMethod() == DeviceConnectionMethod.MEATER_CLOUD ? 2131231405 : 2131231406;
            }
            MEATERDevice mEATERDevice = (MEATERDevice) pVar;
            if (mEATERDevice.isMEATERPlus() || mEATERDevice.isMEATERProbe()) {
                return l(z10, z11);
            }
            return k(mEATERDevice.getParentDevice() != null ? mEATERDevice.getDefaultConnectionMethod() : mEATERDevice.getConnectionMethod(), z10, z11);
        }
        if (pVar.getDeviceType() == DeviceType.MEATER_DEVICE) {
            MEATERDevice mEATERDevice2 = (MEATERDevice) pVar;
            if (mEATERDevice2.getParentDevice() != null && ((mEATERDevice2.getParentDevice().getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK || mEATERDevice2.getParentDevice().getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK) && mEATERDevice2.getParentDevice().getConnectionState() == DeviceConnectionState.CONNECTED && mEATERDevice2.getChargingMethod() != null)) {
                if (mEATERDevice2.getChargingMethod().getValue() >= DeviceChargingMethod.DeviceChargingMethodFast.getValue()) {
                    return R.drawable.ic_probe_charging;
                }
                if (mEATERDevice2.getChargingMethod().getValue() >= DeviceChargingMethod.DeviceChargingMethodFailure.getValue()) {
                    return R.drawable.ic_charging_failed;
                }
            }
        }
        if (z11) {
            return 2131231402;
        }
        return R.drawable.img_connection_status_times;
    }

    public int k(DeviceConnectionMethod deviceConnectionMethod, boolean z10, boolean z11) {
        if (!z10) {
            if (z11) {
                return 2131231402;
            }
            return R.drawable.img_connection_status_times;
        }
        int i10 = a.f16045d[deviceConnectionMethod.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 2131231404;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 2131231405;
        }
        return 2131231406;
    }

    public int l(boolean z10, boolean z11) {
        if (z10) {
            return 2131231404;
        }
        if (z11) {
            return 2131231402;
        }
        return R.drawable.img_connection_status_times;
    }

    public Class<?> n() {
        int i10 = a.f16042a[((MEATERDevice) this.f16038b).getMEATERDeviceType().ordinal()];
        if (i10 == 1 || i10 == 6 || i10 == 11 || i10 == 12) {
            return FirmwareActivity.class;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
                return FirmwareActivity.class;
            default:
                return null;
        }
    }

    public String o(Context context) {
        return context.getString(R.string.connection_details_info_header, this.f16038b.getDeviceName()).toUpperCase();
    }

    public List<InfoPair> p(Context context, boolean z10, boolean z11) {
        String appVersion;
        T4.p pVar = this.f16038b;
        String strNumberStringForDisplay = null;
        MEATERDevice mEATERDevice = (pVar == null || pVar.getDeviceType() != DeviceType.MEATER_DEVICE) ? null : (MEATERDevice) this.f16038b;
        String firmwareRevision = mEATERDevice == null ? null : mEATERDevice.getFirmwareRevision();
        MEATERDeviceType mEATERDeviceType = this.f16039c;
        if (mEATERDeviceType != null && mEATERDeviceType.isBlockProbe()) {
            strNumberStringForDisplay = mEATERDevice.numberStringForDisplay();
        }
        Versions versions = this.f16041e;
        boolean z12 = (versions == null || versions.app == null) ? false : this.f16038b.getDeviceType() == DeviceType.THIS_DEVICE && AppVersion.hasAppUpdate(this.f16041e.app.version);
        boolean z13 = mEATERDevice != null && mEATERDevice.isOnline();
        ArrayList arrayList = new ArrayList();
        for (OptionDeviceInfo optionDeviceInfo : OptionDeviceInfo.getOptionsForDevice(this.f16039c, Config.getInstance().DEBUG_UI_ENABLED || (mEATERDevice != null && mEATERDevice.needsFirmwareUpdate()), z12, z10, z13, null, z11, mEATERDevice != null && FirmwareVersion.sharedInstance().needForceUpdate(this.f16039c, mEATERDevice.getFirmwareRevision()) && mEATERDevice.isOnline())) {
            String string = context.getString(optionDeviceInfo.getTitle());
            switch (a.f16043b[optionDeviceInfo.ordinal()]) {
                case 1:
                    T4.p pVar2 = this.f16038b;
                    if (!(pVar2 instanceof T4.c) || (appVersion = ((T4.c) pVar2).getAppVersion()) == null) {
                        break;
                    } else {
                        arrayList.add(new InfoPair(string, appVersion, optionDeviceInfo));
                        break;
                    }
                    break;
                case 2:
                    arrayList.add(new InfoPair(string, context.getString(R.string.update_app), optionDeviceInfo));
                    break;
                case 3:
                    arrayList.add(new InfoPair(string, strNumberStringForDisplay, optionDeviceInfo));
                    break;
                case 4:
                    arrayList.add(new InfoPair(string, "", optionDeviceInfo));
                    break;
                case 5:
                    arrayList.add(new InfoPair(string, firmwareRevision, optionDeviceInfo));
                    break;
                case 6:
                    arrayList.add(new InfoPair(string, context.getString(R.string.connection_details_info_firmware_version_update), optionDeviceInfo));
                    break;
                case 7:
                    if (this.f16038b instanceof MEATERDevice) {
                        arrayList.add(new InfoPair(string, null, optionDeviceInfo));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (Config.getInstance().DEBUG_UI_ENABLED) {
                        arrayList.add(new InfoPair("BLE Connection", h(mEATERDevice), optionDeviceInfo));
                        break;
                    } else {
                        break;
                    }
                case 9:
                    arrayList.add(new InfoPair(string, "", optionDeviceInfo));
                    break;
            }
        }
        return arrayList;
    }

    public List<WebLink> q() {
        MEATERDeviceType mEATERDeviceType = this.f16039c;
        if (mEATERDeviceType == null) {
            return WebLink.makeList(f16036n, f16037o);
        }
        int i10 = a.f16042a[mEATERDeviceType.ordinal()];
        if (i10 == 1) {
            return WebLink.makeList(f16030h, f16031i);
        }
        if (i10 == 6) {
            return WebLink.makeList(f16032j, f16034l);
        }
        switch (i10) {
        }
        return WebLink.makeList(f16036n, f16037o);
    }

    public String r() {
        Context contextH = x4.g.h();
        MEATERDeviceType mEATERDeviceType = this.f16039c;
        if (mEATERDeviceType == null) {
            return contextH.getString(R.string.connection_details_instructions_phone);
        }
        switch (a.f16042a[mEATERDeviceType.ordinal()]) {
        }
        return contextH.getString(R.string.connection_details_instructions_phone);
    }

    public int s() {
        return t(this.f16038b);
    }

    public int v() {
        return this.f16038b.getDeviceType() == DeviceType.THIS_DEVICE ? R.string.my_devices : R.string.device_details;
    }

    public void w(T4.p pVar) {
        this.f16038b = pVar;
        if (pVar.getDeviceType() == DeviceType.MEATER_DEVICE) {
            this.f16039c = ((MEATERDevice) this.f16038b).getMEATERDeviceType();
        } else {
            T4.p pVar2 = this.f16038b;
            if (pVar2 instanceof MasterDevice) {
                this.f16040d = (MasterDevice) pVar2;
            }
        }
        this.f16041e = C1608p.c(x4.g.h());
    }

    public boolean z() {
        return this.f16039c != null;
    }
}
