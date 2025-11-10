package com.apptionlabs.meater_app.views;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.util.Log;
import android.widget.Button;
import com.apptionlabs.meater_app.activities.BlockFirmwareUpdateActivity;
import com.apptionlabs.meater_app.activities.MEATERPlusFirmwareUpdateActivity;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.views.e0;
import kotlin.Metadata;

/* compiled from: SingleProbeDialogs.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0004¨\u0006\f"}, d2 = {"Lcom/apptionlabs/meater_app/views/p1;", "", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "Landroid/app/Activity;", "appCompatActivity", "Lih/u;", "g", "activity", "d", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f10583a = new p1();

    private p1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MEATERDevice mEATERDevice, Activity activity) {
        wh.m.f(mEATERDevice, "$device");
        if (mEATERDevice.batteryLevelTooLowForFirmwareUpdate()) {
            f10583a.g(mEATERDevice, activity);
            return;
        }
        if (mEATERDevice.isMEATERBlock()) {
            Intent intent = new Intent(activity, (Class<?>) BlockFirmwareUpdateActivity.class);
            intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
            activity.startActivity(intent);
        } else {
            Intent intent2 = new Intent(activity, (Class<?>) MEATERPlusFirmwareUpdateActivity.class);
            intent2.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
            activity.startActivity(intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        Log.d("info ", "now MEATERNotification.haveAskedAboutFirmwareUpdate = true");
        s6.d.f17849e = true;
    }

    private final void g(MEATERDevice mEATERDevice, Activity activity) {
        String string;
        String string2;
        if (activity.isFinishing()) {
            return;
        }
        if (mEATERDevice.isMEATERBlock()) {
            string = activity.getString(2132017348);
            wh.m.e(string, "getString(...)");
            string2 = activity.getString(2132017347);
            wh.m.e(string2, "getString(...)");
        } else {
            string = activity.getString(2132018123);
            wh.m.e(string, "getString(...)");
            string2 = activity.getString(2132018122);
            wh.m.e(string2, "getString(...)");
        }
        String str = string;
        String str2 = string2;
        e0.Companion companion = e0.INSTANCE;
        String string3 = activity.getString(2132018340);
        wh.m.e(string3, "getString(...)");
        companion.e(activity, str, str2, true, new e0.AlertPair(string3, new j6.e() { // from class: com.apptionlabs.meater_app.views.o1
            @Override // j6.e
            public final void a() {
                p1.h();
            }
        }), null, null).show();
    }

    public final void d(final MEATERDevice mEATERDevice, final Activity activity) {
        String string;
        String string2;
        Button button;
        wh.m.f(mEATERDevice, "device");
        if (activity != null && !activity.isFinishing()) {
            if (!mEATERDevice.isMEATERBlock() && !mEATERDevice.isMEATERPlus()) {
                return;
            }
            int deviceName = mEATERDevice.getMEATERDeviceType().getDeviceName();
            boolean mustFirmwareUpdate = mEATERDevice.mustFirmwareUpdate();
            if (mustFirmwareUpdate) {
                string = activity.getString(2132018735);
            } else {
                string = activity.getString(2132018899, activity.getString(deviceName));
            }
            String str = string;
            wh.m.c(str);
            if (mustFirmwareUpdate) {
                string2 = activity.getString(2132018734, activity.getString(deviceName));
            } else {
                string2 = activity.getString(2132018900);
            }
            String str2 = string2;
            wh.m.c(str2);
            e0.Companion companion = e0.INSTANCE;
            String string3 = activity.getString(2132018893);
            wh.m.e(string3, "getString(...)");
            e0.AlertPair alertPair = new e0.AlertPair(string3, new j6.e() { // from class: com.apptionlabs.meater_app.views.m1
                @Override // j6.e
                public final void a() {
                    p1.e(MEATERDevice.this, activity);
                }
            });
            String string4 = activity.getString(2132017977);
            wh.m.e(string4, "getString(...)");
            AlertDialog f10 = e0.Companion.f(companion, activity, str, str2, false, alertPair, new e0.AlertPair(string4, new j6.e() { // from class: com.apptionlabs.meater_app.views.n1
                @Override // j6.e
                public final void a() {
                    p1.f();
                }
            }), null, 64, null);
            if (mEATERDevice.mustFirmwareUpdate() && (button = f10.getButton(-2)) != null) {
                button.setVisibility(8);
            }
            f10.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h() {
    }
}
