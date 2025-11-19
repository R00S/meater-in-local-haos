package T5;

import P5.Q;
import android.content.Context;
import android.view.Y;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;

/* compiled from: DetailFragmentModel.java */
/* loaded from: classes2.dex */
public class e extends Y {

    /* renamed from: b, reason: collision with root package name */
    private float f16050b = 0.5f;

    /* renamed from: c, reason: collision with root package name */
    private float f16051c = 0.5f;

    /* renamed from: d, reason: collision with root package name */
    private Integer f16052d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16053e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16054f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16055g;

    /* renamed from: h, reason: collision with root package name */
    private String f16056h;

    /* renamed from: i, reason: collision with root package name */
    private int f16057i;

    /* renamed from: j, reason: collision with root package name */
    private String f16058j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16059k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16060l;

    private void B(Probe probe) {
        if (probe.getCookState() == DeviceCookState.COOK_STATE_COOK_CONFIGURED || probe.getCookState() == DeviceCookState.COOK_STATE_STARTED) {
            x(probe.getInternalTemperature() < probe.getTargetInternalTemperature());
        } else {
            x(false);
        }
    }

    public void A(Probe probe, Context context) {
        if (context == null) {
            return;
        }
        s(probe);
        q(probe.getShouldShowAsConnected() ? 1.0f : 0.5f);
        r(probe.appearsToHaveCookInProgress());
        t(probe.shouldEnableAlertsButton() ? 1.0f : 0.5f);
        p(probe.getCookState() == DeviceCookState.COOK_STATE_STARTED || probe.getCookState() == DeviceCookState.COOK_STATE_COOK_CONFIGURED);
        if (probe.appearsToHaveCookInProgress()) {
            s(probe);
        }
        u(probe.shouldEnableAlertsButton());
        v(probe.getAlerts().isEmpty() ? "+" : String.valueOf(probe.getAlerts().size()));
        w(probe.getAlerts().isEmpty());
        B(probe);
    }

    public float h() {
        return this.f16051c;
    }

    public String i() {
        return this.f16056h;
    }

    public float j() {
        return this.f16050b;
    }

    public int k() {
        return this.f16057i;
    }

    public String l() {
        return this.f16058j;
    }

    public boolean m() {
        return this.f16054f;
    }

    public boolean n() {
        return this.f16060l;
    }

    public boolean o() {
        return this.f16053e;
    }

    public void p(boolean z10) {
        if (this.f16054f == z10) {
            return;
        }
        this.f16054f = z10;
    }

    public void q(float f10) {
        if (this.f16051c != f10) {
            this.f16051c = f10;
        }
    }

    public void r(boolean z10) {
        if (this.f16060l != z10) {
            this.f16060l = z10;
        }
    }

    public void s(Probe probe) {
        String strCookNameForDisplay = probe.appearsToHaveCookInProgress() ? probe.cookNameForDisplay() : "";
        String str = this.f16056h;
        if (str == null || !str.equalsIgnoreCase(strCookNameForDisplay)) {
            this.f16056h = strCookNameForDisplay;
        }
    }

    public void t(float f10) {
        if (this.f16050b != f10) {
            this.f16050b = f10;
        }
    }

    public void u(boolean z10) {
        int i10 = Q.i(z10 ? R.color.primary_color : R.color.primary_color_faded);
        if (this.f16057i == i10) {
            return;
        }
        this.f16057i = i10;
    }

    public void v(String str) {
        String str2 = this.f16058j;
        if (str2 == null || !str2.equals(str)) {
            this.f16058j = str;
        }
    }

    public void w(boolean z10) {
        if (this.f16059k != z10) {
            this.f16059k = z10;
        }
    }

    public void x(boolean z10) {
        if (this.f16053e == z10) {
            return;
        }
        this.f16053e = z10;
    }

    public void y(int i10) {
        Integer numValueOf = Integer.valueOf(i10 > 0 ? R.drawable.icon_volume_low : R.drawable.icon_volume_mute);
        if (this.f16052d.equals(numValueOf)) {
            return;
        }
        this.f16052d = numValueOf;
    }

    public void z(boolean z10) {
        if (this.f16055g != z10) {
            this.f16055g = z10;
        }
    }
}
