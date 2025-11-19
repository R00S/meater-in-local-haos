package c5;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.ReviewReasonType;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.data.TemperatureSelection;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.DeviceChargingMethod;
import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.DeviceConnectionWarningLevel;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.model.UserReviews;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.apptionlabs.meater_app.v3protobuf.MCNotificationType;
import com.apptionlabs.meater_app.views.X;
import java.util.Locale;
import x4.b;

/* compiled from: MEATERNotification.java */
/* renamed from: c5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2316d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f31021a = false;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f31022b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f31023c = false;

    /* renamed from: d, reason: collision with root package name */
    static long f31024d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f31025e = false;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f31026f;

    /* compiled from: MEATERNotification.java */
    /* renamed from: c5.d$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31027a;

        static {
            int[] iArr = new int[ReviewReasonType.values().length];
            f31027a = iArr;
            try {
                iArr[ReviewReasonType.DEVICE_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31027a[ReviewReasonType.COOK_FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void A(Probe probe) {
        s(probe, MCNotificationType.NOTIFICATION_TYPE_READY_FOR_RESTING, String.format(Locale.US, "%s : %s", probe.cookNameForDisplay(), x4.g.h().getString(R.string.remove_from_heat_label)));
    }

    public static void B(String str) {
        androidx.appcompat.app.c cVarK = x4.g.k();
        if (cVarK == null) {
            return;
        }
        try {
            cVarK.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(cVarK, cVarK.getString(R.string.no_browser_found), 1).show();
        }
    }

    public static void C() {
        Context contextH = x4.g.h();
        Intent intent = new Intent(MEATERIntent.SHOW_NOTIFICATION_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_TITLE, contextH.getString(R.string.high_temp_warning_screen_label_1));
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, contextH.getString(R.string.enable_to_provide_estimate));
        intent.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.ESTIMATOR_NOT_AVAIL_ABLE);
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.ic_yikes);
        intent.setPackage(x4.g.h().getPackageName());
        contextH.sendBroadcast(intent);
    }

    public static void D(Probe probe) {
        if (p(probe)) {
            E4.i.D().k0(probe, MCNotificationType.NOTIFICATION_TYPE_PUT_PROBE_BACK_IN_CHARGER, 0);
        }
        if (o()) {
            C2315c.h(probe, null, MCNotificationType.NOTIFICATION_TYPE_PUT_PROBE_BACK_IN_CHARGER, x4.g.h().getString(R.string.put_back_in_charger_alert_text), 0);
            return;
        }
        Intent intent = new Intent(MEATERIntent.SHOW_NOTIFICATION_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
        intent.putExtra(MEATERIntent.EXTRA_TITLE, probe.displayName());
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, x4.g.h().getString(R.string.put_back_in_charger_alert_text));
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.ic_yikes);
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    public static void E(MEATERDevice mEATERDevice, DeviceChargingMethod deviceChargingMethod) {
        if (f31026f) {
            return;
        }
        f31026f = true;
        Context contextH = x4.g.h();
        DeviceChargingMethod deviceChargingMethod2 = DeviceChargingMethod.DeviceChargingMethodWrongProbe;
        String string = contextH.getString(deviceChargingMethod == deviceChargingMethod2 ? R.string.wrong_probe_message : R.string.probe_charging_failed_message);
        if (o()) {
            C2315c.h(mEATERDevice, null, MCNotificationType.NOTIFICATION_TYPE_WARNING, string, 0);
            return;
        }
        Intent intent = new Intent(MEATERIntent.SHOW_NOTIFICATION_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_TITLE, contextH.getString(deviceChargingMethod == deviceChargingMethod2 ? R.string.meater_label : R.string.probe_charging_failed_title));
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, string);
        intent.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.SHOW_NOTIFICATION_MESSAGE_FOR_BLOCK_BATTERY);
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.ic_yikes);
        intent.setPackage(x4.g.h().getPackageName());
        contextH.sendBroadcast(intent);
    }

    public static void F() {
        if (f31022b) {
            return;
        }
        f31022b = true;
        Context contextH = x4.g.h();
        Intent intent = new Intent(MEATERIntent.SHOW_DIALOG_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_TITLE, contextH.getString(R.string.greater_ml_version_alert_title));
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, String.format(Locale.US, "%s\n%s\n%s", contextH.getString(R.string.greater_ml_version_alert_text), contextH.getString(R.string.greater_ml_version_alert_text2), contextH.getString(R.string.greater_ml_version_alert_text3)));
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.ic_yikes);
        intent.setPackage(x4.g.h().getPackageName());
        contextH.sendBroadcast(intent);
    }

    public static void G() {
        if (f31021a) {
            return;
        }
        f31021a = true;
        Context contextH = x4.g.h();
        Intent intent = new Intent(MEATERIntent.SHOW_NOTIFICATION_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_TITLE, contextH.getString(R.string.probe_not_compatible_with_meater_plus_title));
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, contextH.getString(R.string.probe_not_compatible_with_meater_plus_text));
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.ic_yikes);
        intent.setPackage(x4.g.h().getPackageName());
        contextH.sendBroadcast(intent);
    }

    public static void H() {
        x4.b.h(b.EnumC0768b.f52687X, b.a.f52616N, b.c.f52761M);
        Context contextH = x4.g.h();
        String string = contextH.getString(R.string.ble_restart_notification_text);
        MEATERDevice mEATERDevice = new MEATERDevice();
        mEATERDevice.setDeviceID(-1L);
        C2315c.h(mEATERDevice, null, MCNotificationType.NOTIFICATION_TYPE_INFO, string, 0);
        Intent intent = new Intent(MEATERIntent.EXTRA_RESTART_PHONE);
        intent.putExtra(MEATERIntent.EXTRA_TITLE, contextH.getString(R.string.high_temp_warning_screen_label_1));
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, string);
        intent.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.SHOW_NOTIFICATION_MESSAGE_FOR_PHONE_RESTART);
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.ic_yikes);
        intent.setPackage(x4.g.h().getPackageName());
        contextH.sendBroadcast(intent);
    }

    public static void I() {
        Context contextH = x4.g.h();
        Intent intent = new Intent(MEATERIntent.SHOW_NOTIFICATION_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_TITLE, contextH.getString(R.string.bluetooth_off_alert_text));
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, contextH.getString(R.string.bluetooth_off_alert_detail_text));
        intent.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.BLE_DISABLED_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.ic_yikes);
        intent.setPackage(x4.g.h().getPackageName());
        contextH.sendBroadcast(intent);
    }

    public static void J(MEATERDevice mEATERDevice) {
        Intent intent = new Intent(MEATERIntent.NEED_HELP_MANY_DISCONNECTS);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    public static void K() {
        Context contextH = x4.g.h();
        Intent intent = new Intent(MEATERIntent.SHOW_DIALOG_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_TITLE, contextH.getString(R.string.failed_to_connect_to_meater_cloud_title));
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, contextH.getString(R.string.failed_to_connect_to_meater_cloud_text));
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.ic_yikes);
        intent.setPackage(x4.g.h().getPackageName());
        contextH.sendBroadcast(intent);
    }

    public static void L(Probe probe) {
        Intent intent = new Intent(MEATERIntent.NEED_HELP_PROBE_LOW_BATTERY);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    public static void a(MEATERDevice mEATERDevice, ReviewReasonType reviewReasonType) {
        if (x4.g.y() && mEATERDevice.getShouldShowAsConnected() && mEATERDevice.getDeviceID() != 0) {
            int i10 = a.f31027a[reviewReasonType.ordinal()];
            if (i10 == 1) {
                UserReviews.INSTANCE.askUserToReviewMEATERIfNeededOnDeviceConnection();
            } else if (i10 == 2 && mEATERDevice.isMEATERProbe()) {
                UserReviews.INSTANCE.askUserToReviewMEATERIfNeededOnCookFinished(((Probe) mEATERDevice).getCookID());
            }
        }
    }

    public static void b() {
        x4.g.h().sendBroadcast(new Intent(MEATERIntent.CLOUD_CONNECTION_STATE_CHANGED).setPackage(x4.g.h().getPackageName()));
    }

    public static void c(MEATERDevice mEATERDevice) {
        E4.i.D().C0();
        LocalStorage.sharedStorage().deviceDAO().h(mEATERDevice);
    }

    public static void d(Probe probe) {
        x4.g.h().sendBroadcast(new Intent(MEATERIntent.ENABLE_OR_DISABLE_SCREEN_DIMMING).setPackage(x4.g.h().getPackageName()));
    }

    public static void e(Probe probe) {
        int i10;
        Context contextH = x4.g.h();
        String string = contextH.getString(R.string.device_disconnected_label);
        String string2 = contextH.getString(R.string.connection_problem_alert_text);
        MEATERDevice parentDevice = (probe.getParentDevice() == null || probe.getParentDevice().getMEATERDeviceType() != MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK) ? null : probe.getParentDevice();
        String string3 = parentDevice != null ? contextH.getString(R.string.connection_problem_with_device_or_ml_alert_text, contextH.getString(parentDevice.getMEATERDeviceType().getDeviceName())) : contextH.getString(R.string.connection_problem_with_block_or_ml_alert_text);
        if (probe.getConnectionWarningLevel() == DeviceConnectionWarningLevel.ONCE) {
            i10 = 1;
            string = probe.getConnectionMethod().isBluetoothConnectionMethod() ? string2 : string3;
        } else {
            i10 = 0;
        }
        if (p(probe)) {
            E4.i.D().k0(probe, MCNotificationType.NOTIFICATION_TYPE_CONNECTION_LOST, i10);
        }
        if (o()) {
            C2315c.h(probe, null, MCNotificationType.NOTIFICATION_TYPE_CONNECTION_LOST, string, i10);
            return;
        }
        Intent intent = new Intent(MEATERIntent.SHOW_NOTIFICATION_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
        intent.putExtra(MEATERIntent.EXTRA_TITLE, probe.displayName());
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, string);
        intent.putExtra(MEATERIntent.EXTRA_TYPE, MCNotificationType.NOTIFICATION_TYPE_CONNECTION_LOST.getValue());
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.ic_yikes);
        intent.setPackage(x4.g.h().getPackageName());
        contextH.sendBroadcast(intent);
    }

    public static void f(Probe probe) {
        Context contextH = x4.g.h();
        String string = contextH.getString(R.string.meater_label);
        String string2 = contextH.getString(R.string.generic_device_disconnected);
        if (p(probe)) {
            E4.i.D().k0(probe, MCNotificationType.NOTIFICATION_TYPE_CONNECTION_LOST, 2);
        }
        if (o()) {
            C2315c.h(probe, null, MCNotificationType.NOTIFICATION_TYPE_CONNECTION_LOST, string2, 2);
            return;
        }
        Intent intent = new Intent(MEATERIntent.SHOW_NOTIFICATION_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
        intent.putExtra(MEATERIntent.EXTRA_TITLE, string);
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, string2);
        intent.putExtra(MEATERIntent.EXTRA_TYPE, MCNotificationType.NOTIFICATION_TYPE_CONNECTION_LOST.getValue());
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.ic_yikes);
        intent.setPackage(x4.g.h().getPackageName());
        contextH.sendBroadcast(intent);
    }

    public static void g(MEATERDevice mEATERDevice, boolean z10) {
        if (f31025e || !mEATERDevice.isPaired() || x4.g.t().i1() || !x4.g.b()) {
            return;
        }
        boolean zMustFirmwareUpdate = mEATERDevice.mustFirmwareUpdate();
        if (!zMustFirmwareUpdate) {
            f31025e = true;
        }
        Intent intent = new Intent(MEATERIntent.DEVICE_FIRMWARE_UPDATE_AVAILABLE);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
        intent.putExtra(MEATERIntent.EXTRA_MUST_UPDATE, zMustFirmwareUpdate);
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    public static void h(Alert alert) {
        Intent intent = new Intent(MEATERIntent.HIDE_ALERT);
        intent.putExtra(MEATERIntent.EXTRA_ALERT_ID, alert.getId().toString());
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    public static void i() {
        Context contextH = x4.g.h();
        Intent intent = new Intent(MEATERIntent.HIDE_NOTIFICATION_MESSAGE_WITH_TAG);
        intent.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.BLE_DISABLED_MESSAGE);
        intent.setPackage(x4.g.h().getPackageName());
        contextH.sendBroadcast(intent);
    }

    public static void j(Probe probe) {
        Intent intent = new Intent(MEATERIntent.HIDE_CONNECTION_WARNINGS_FOR_PROBE);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    public static void k(Probe probe) {
        Intent intent = new Intent(MEATERIntent.HIDE_COOK_STATE_NOTIFICATIONS_FOR_PROBE);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    public static void l(MEATERDevice mEATERDevice) {
        if (x4.g.y()) {
            f31024d = 0L;
            Intent intent = new Intent(MEATERIntent.HIDE_HIGH_TEMPERATURE_WARNING);
            intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
            intent.setPackage(x4.g.h().getPackageName());
            x4.g.h().sendBroadcast(intent);
        }
    }

    private static int m(MEATERDevice mEATERDevice) {
        if (!mEATERDevice.isMEATERProbe()) {
            return 0;
        }
        Probe probe = (Probe) mEATERDevice;
        Temperature.Temperatures_t temperatures = probe.getTemperatures();
        return (temperatures == null || temperatures.internalTemperatures.length <= 1) ? probe.getInternalTemperature() : TemperatureSelection.HighestTemperatureFromSet(temperatures);
    }

    public static void n(String str, String str2) {
        Context contextH = x4.g.h();
        Intent intent = new Intent(MEATERIntent.EXTRA_PREVIOUS_COOK_RELATED);
        intent.putExtra(MEATERIntent.EXTRA_TITLE, str);
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, str2);
        intent.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.SHOW_NOTIFICATION_MESSAGE_FOR_PREVIOUS_COOK_RELATED);
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.ic_yikes);
        intent.setPackage(x4.g.h().getPackageName());
        contextH.sendBroadcast(intent);
    }

    private static boolean o() {
        return !x4.g.y();
    }

    private static boolean p(Probe probe) {
        return (probe.getConnectionMethod().isBluetoothConnectionMethod() || probe.getConnectionMethod() == DeviceConnectionMethod.PROBE_SIM) && E4.i.D().X();
    }

    public static void q(Alert alert, Probe probe) {
        int iIndexOf = probe.getAlerts().indexOf(alert);
        if (p(probe)) {
            E4.i.D().k0(probe, MCNotificationType.NOTIFICATION_TYPE_ALERT, iIndexOf);
        }
        if (o()) {
            C2315c.h(probe, alert, MCNotificationType.NOTIFICATION_TYPE_ALERT, alert.descriptionForProbe(), iIndexOf);
            if (alert.getType() == AlarmType.ALARM_TYPE_REPEAT_DURATION) {
                alert.setState(AlarmState.ALARM_STATE_FIRED);
                return;
            }
            return;
        }
        Intent intent = new Intent(MEATERIntent.SHOW_NOTIFICATION_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
        intent.putExtra(MEATERIntent.EXTRA_TITLE, probe.displayName());
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, alert.descriptionForProbe());
        intent.putExtra(MEATERIntent.EXTRA_ALERT_ID, alert.getId().toString());
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.bell);
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    public static void r(Probe probe, boolean z10) {
        if (p(probe)) {
            E4.i.D().k0(probe, MCNotificationType.NOTIFICATION_TYPE_AMBIENT_OUTSIDE_RANGE, 0);
        }
        boolean zO = o();
        int i10 = R.string.ambient_temperature_too_high;
        if (zO) {
            MCNotificationType mCNotificationType = MCNotificationType.NOTIFICATION_TYPE_AMBIENT_OUTSIDE_RANGE;
            Context contextH = x4.g.h();
            if (z10) {
                i10 = R.string.ambient_temperature_too_low;
            }
            C2315c.h(probe, null, mCNotificationType, contextH.getString(i10), 0);
            return;
        }
        Intent intent = new Intent(MEATERIntent.SHOW_NOTIFICATION_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
        intent.putExtra(MEATERIntent.EXTRA_TITLE, probe.displayName());
        Context contextH2 = x4.g.h();
        if (z10) {
            i10 = R.string.ambient_temperature_too_low;
        }
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, contextH2.getString(i10));
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.ic_yikes);
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    private static void s(Probe probe, MCNotificationType mCNotificationType, String str) {
        if (p(probe)) {
            E4.i.D().k0(probe, mCNotificationType, 0);
        }
        if (o()) {
            C2315c.h(probe, null, mCNotificationType, str, 0);
            return;
        }
        Intent intent = new Intent(MEATERIntent.SHOW_NOTIFICATION_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
        intent.putExtra(MEATERIntent.EXTRA_TITLE, probe.displayName());
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, str);
        intent.putExtra(MEATERIntent.EXTRA_TYPE, mCNotificationType.getValue());
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    public static void t(Probe probe) {
        if (!x4.g.y()) {
            X.f32791a.add(probe);
            return;
        }
        Intent intent = new Intent(MEATERIntent.SHOW_COOK_SUMMARY);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
        intent.putExtra(MEATERIntent.EXTRA_SAVED_COOK_ID, SavedCook.savedCookFromProbe(probe).getCookID());
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    public static void u(MEATERDevice mEATERDevice, boolean z10) {
        Context contextH = x4.g.h();
        String string = z10 ? mEATERDevice.getMEATERDeviceType() == MEATERDeviceType.BLOCK ? contextH.getString(R.string.block_empty_battery_alert) : contextH.getString(R.string.device_empty_battery_alert, contextH.getString(mEATERDevice.getMEATERDeviceType().getDeviceName())) : mEATERDevice.getMEATERDeviceType() == MEATERDeviceType.BLOCK ? contextH.getString(R.string.block_low_battery_alert) : contextH.getString(R.string.pro_low_power_usb, contextH.getString(mEATERDevice.getMEATERDeviceType().getDeviceName()));
        C2315c.h(mEATERDevice, null, MCNotificationType.NOTIFICATION_TYPE_INFO, string, 0);
        Intent intent = new Intent(MEATERIntent.SHOW_NOTIFICATION_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_TITLE, contextH.getString(R.string.high_temp_warning_screen_label_1));
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, string);
        intent.putExtra(MEATERIntent.EXTRA_TAG, MEATERIntent.SHOW_NOTIFICATION_MESSAGE_FOR_BLOCK_BATTERY);
        intent.putExtra(MEATERIntent.EXTRA_IMAGE_ID, R.drawable.ic_yikes);
        intent.setPackage(x4.g.h().getPackageName());
        contextH.sendBroadcast(intent);
    }

    public static void v(Probe probe) {
        if (f31023c) {
            return;
        }
        f31023c = true;
        Context contextH = x4.g.h();
        Intent intent = new Intent(MEATERIntent.SHOW_DIALOG_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_TITLE, contextH.getString(R.string.low_temperature_detected_title));
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, String.format(Locale.US, "%s\n%s", contextH.getString(R.string.low_temperature_detected_text), contextH.getString(R.string.low_temperature_detected_text_1)));
        intent.setPackage(x4.g.h().getPackageName());
        contextH.sendBroadcast(intent);
    }

    public static void w(Probe probe) {
        s(probe, MCNotificationType.NOTIFICATION_TYPE_COOK_READY, String.format(Locale.US, "%s : %s", probe.cookNameForDisplay(), x4.g.h().getString(R.string.resting_complete_label)));
    }

    public static void x(Probe probe) {
        s(probe, MCNotificationType.NOTIFICATION_TYPE_COOK_READY, String.format(Locale.US, "%s : %s", probe.cookNameForDisplay(), x4.g.h().getString(R.string.cook_complete_label)));
    }

    public static void y(MEATERDevice mEATERDevice) {
        MCNotificationType mCNotificationType = MCNotificationType.NOTIFICATION_TYPE_HIGH_TEMPERATURE_WARNING;
        if (o()) {
            C2315c.h(mEATERDevice, null, mCNotificationType, "The ambient temperature is close to the maximum limit. Be careful not to damage your probe.", 0);
            return;
        }
        Intent intent = new Intent(MEATERIntent.SHOW_NOTIFICATION_MESSAGE);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
        intent.putExtra(MEATERIntent.EXTRA_TITLE, mEATERDevice.displayName());
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, "The ambient temperature is close to the maximum limit. Be careful not to damage your probe.");
        intent.putExtra(MEATERIntent.EXTRA_TYPE, mCNotificationType.getValue());
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    public static void z(MEATERDevice mEATERDevice) {
        String str;
        if ((!Config.getInstance().DEBUG_UI_ENABLED || x4.g.t().d()) && mEATERDevice.isOnline()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = f31024d;
            if (j10 == 0 || (jCurrentTimeMillis - j10) / 1000 >= 30) {
                f31024d = jCurrentTimeMillis;
                Context contextH = x4.g.h();
                int iM = m(mEATERDevice);
                int i10 = 0;
                if (mEATERDevice.getMEATERDeviceType().isG2Probe() && mEATERDevice.getAmbientTemperature() >= mEATERDevice.getMEATERDeviceType().minimumFlareUpTemperatureForDevice()) {
                    str = String.format(Locale.US, contextH.getString(R.string.flare_up_label) + " : %s is %s", mEATERDevice.displayName(), Temperature.displayTemperature(mEATERDevice.getAmbientTemperature()));
                } else if (mEATERDevice.isMEATERProbe() && iM >= mEATERDevice.getMEATERDeviceType().maximumInternalTemperatureForDevice()) {
                    str = String.format(Locale.US, "%s", contextH.getString(R.string.internal_temperature_above_notification_text, Temperature.displayTemperature(iM)));
                } else if (mEATERDevice.getAmbientTemperature() < mEATERDevice.getMEATERDeviceType().maximumAmbientTemperatureForDevice(mEATERDevice.getFirmwareRevision())) {
                    l(mEATERDevice);
                    return;
                } else {
                    str = String.format(Locale.US, "%s", contextH.getString(R.string.ambient_temperature_above_notification_text, Temperature.displayTemperature(mEATERDevice.getAmbientTemperature())));
                    i10 = 1;
                }
                if (mEATERDevice.isMEATERProbe()) {
                    Probe probe = (Probe) mEATERDevice;
                    if (p(probe)) {
                        E4.i.D().k0(probe, MCNotificationType.NOTIFICATION_TYPE_HIGH_TEMPERATURE_WARNING, i10);
                    }
                }
                if (o()) {
                    C2315c.h(mEATERDevice, null, MCNotificationType.NOTIFICATION_TYPE_HIGH_TEMPERATURE_WARNING, str, i10);
                    return;
                }
                Intent intent = new Intent(MEATERIntent.SHOW_HIGH_TEMPERATURE_WARNING);
                intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
                intent.setPackage(x4.g.h().getPackageName());
                contextH.sendBroadcast(intent);
            }
        }
    }
}
