package T5;

import android.view.Y;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import java.util.Locale;

/* compiled from: ProbeListViewModel.java */
/* loaded from: classes2.dex */
public class o extends Y {

    /* renamed from: b, reason: collision with root package name */
    private String f16135b;

    /* renamed from: c, reason: collision with root package name */
    private String f16136c;

    /* renamed from: d, reason: collision with root package name */
    private float f16137d = 0.5f;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16138e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16139f;

    /* renamed from: g, reason: collision with root package name */
    private String f16140g;

    private String h(MEATERDevice mEATERDevice) {
        String str;
        MEATERDevice parentDevice = mEATERDevice.getParentDevice();
        if (parentDevice == null || !parentDevice.isMEATERPlus()) {
            parentDevice = mEATERDevice;
        }
        String str2 = parentDevice.getSignalLevel() != -127 ? String.format(Locale.US, " RSSI:%d", Integer.valueOf(parentDevice.getSignalLevel())) : "";
        if (mEATERDevice.getFirmwareRevision() != null) {
            String firmwareRevision = mEATERDevice.getFirmwareRevision();
            str = (firmwareRevision == null || firmwareRevision.isEmpty()) ? "" : String.format(" (%s)", firmwareRevision);
        } else {
            str = "";
        }
        String str3 = mEATERDevice.isBlockProbe() ? String.format(Locale.US, " [%d]", Integer.valueOf(mEATERDevice.getProbeNumber())) : "";
        String str4 = mEATERDevice.getParentDevice() != null ? String.format("%s -> ", mEATERDevice.getParentDevice().shortDeviceIDString()) : "";
        String str5 = mEATERDevice.getBatteryLevel() > 0 ? String.format(Locale.US, " B:%d%%", Integer.valueOf(mEATERDevice.getBatteryLevel())) : "";
        return String.format(Locale.US, "%s%s%s%s%s%s", str4, mEATERDevice.shortDeviceIDString(), str3, str, str2, (mEATERDevice.getParentDevice() == null || mEATERDevice.getParentDevice().getBatteryLevel() <= 0) ? str5 : String.format(Locale.US, "%s RB:%d%%", str5, Integer.valueOf(mEATERDevice.getParentDevice().getBatteryLevel())));
    }

    private void m(Probe probe) {
        if (probe.getShouldShowAsConnected() || probe.getLoadingState() != O4.d.DeviceLoadingStateLoading) {
            o(probe.appearsToHaveCookInProgress() ? probe.cookNameForDisplay() : x4.g.h().getString(R.string.no_cook_setup_label));
        } else {
            o(x4.g.h().getString(R.string.loading));
        }
    }

    private void t(Probe probe) {
        if (probe.getCookState() == DeviceCookState.COOK_STATE_COOK_CONFIGURED || probe.getCookState() == DeviceCookState.COOK_STATE_STARTED) {
            q(probe.getInternalTemperature() < probe.getTargetInternalTemperature());
        } else {
            q(false);
        }
    }

    public float i() {
        return this.f16137d;
    }

    public String j() {
        return this.f16135b;
    }

    public String k() {
        return this.f16136c;
    }

    public String l() {
        return this.f16140g;
    }

    public void n(float f10) {
        if (this.f16137d != f10) {
            this.f16137d = f10;
        }
    }

    public void o(String str) {
        String str2 = this.f16135b;
        if (str2 == null || !str2.equalsIgnoreCase(str)) {
            this.f16135b = str;
        }
    }

    public void p(String str) {
        this.f16136c = str;
    }

    public void q(boolean z10) {
        if (this.f16138e == z10) {
            return;
        }
        this.f16138e = z10;
    }

    public void r(boolean z10) {
        if (this.f16139f == z10) {
            return;
        }
        this.f16139f = z10;
    }

    public void s(String str) {
        String str2 = this.f16140g;
        if (str2 == null || !str2.equalsIgnoreCase(str)) {
            this.f16140g = str;
        }
    }

    public void u(Probe probe) {
        if (probe.getShouldShowAsConnected()) {
            n(1.0f);
        } else {
            n(0.5f);
        }
        m(probe);
        s(probe.getOnGoingRecipeStepTitle());
        if (Config.getInstance().DEBUG_UI_ENABLED) {
            p(h(probe));
        }
        r(probe.getOngoingRecipeID() != -1);
        t(probe);
    }
}
