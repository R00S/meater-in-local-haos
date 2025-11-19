package D4;

import android.app.Activity;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.views.C2421z;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import z4.C5194y;
import z4.K;

/* compiled from: LocationServicesHandler.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LD4/b;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "isScanning", "", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "deviceList", "Loa/F;", "a", "(Landroid/app/Activity;ZLjava/util/List;)V", "value", "Z", "b", "()Z", "haveWarnedUserAboutLocationServicesDisabled", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean haveWarnedUserAboutLocationServicesDisabled;

    public final void a(Activity activity, boolean isScanning, List<? extends MEATERDevice> deviceList) {
        C3862t.g(activity, "activity");
        C3862t.g(deviceList, "deviceList");
        if (K5.a.f8696a.b()) {
            return;
        }
        boolean zIsEmpty = deviceList.isEmpty();
        boolean z10 = false;
        boolean z11 = zIsEmpty && isScanning;
        if (!zIsEmpty) {
            List<? extends MEATERDevice> list = deviceList;
            if ((list instanceof Collection) && list.isEmpty()) {
                z10 = true;
            } else {
                for (MEATERDevice mEATERDevice : list) {
                    if (mEATERDevice.getConnectionMethod() == DeviceConnectionMethod.BLUETOOTH && mEATERDevice.isOnline()) {
                        break;
                    }
                }
                z10 = true;
            }
        }
        if (activity.getResources().getBoolean(R.bool.amazon_device) || this.haveWarnedUserAboutLocationServicesDisabled || !C5194y.l() || K.INSTANCE.a(activity) || activity.isFinishing()) {
            return;
        }
        if (z11 || z10) {
            this.haveWarnedUserAboutLocationServicesDisabled = true;
            C2421z.Companion companion = C2421z.INSTANCE;
            String string = activity.getString(R.string.location_is_not_enabled_alert_title);
            C3862t.f(string, "getString(...)");
            String string2 = activity.getString(R.string.location_is_not_enabled_alert_detail);
            C3862t.f(string2, "getString(...)");
            String string3 = activity.getString(R.string.ok_label);
            C3862t.f(string3, "getString(...)");
            C2421z.Companion.f(companion, activity, string, string2, false, new C2421z.AlertPair(string3, null, 2, null), null, null, 104, null).show();
        }
    }

    /* renamed from: b, reason: from getter */
    public final boolean getHaveWarnedUserAboutLocationServicesDisabled() {
        return this.haveWarnedUserAboutLocationServicesDisabled;
    }
}
