package T5;

import P5.Q;
import android.view.Y;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.views.RoundedImageWithLabel;

/* compiled from: RoundedImageWithLabelModel.java */
/* loaded from: classes2.dex */
public class p extends Y {

    /* renamed from: b, reason: collision with root package name */
    private int f16141b;

    /* renamed from: c, reason: collision with root package name */
    private float f16142c;

    /* renamed from: d, reason: collision with root package name */
    private String f16143d;

    /* renamed from: e, reason: collision with root package name */
    boolean f16144e;

    private float h(Probe probe) {
        return probe.shouldEnableAlertsButton() ? 1.0f : 0.5f;
    }

    private int i(Probe probe) {
        return Q.i(R.color.primary_color);
    }

    private int j(Probe probe) {
        return Q.i(R.color.primary_color);
    }

    private float k(Probe probe) {
        return (probe.getShouldShowAsConnected() && probe.appearsToHaveCookInProgress()) ? 1.0f : 0.5f;
    }

    private float o(Probe probe) {
        return (probe.getShouldShowAsConnected() && probe.appearsToHaveCookInProgress()) ? 1.0f : 0.5f;
    }

    private int p(Probe probe) {
        return Q.i(R.color.meater_orange);
    }

    private String u(Probe probe) {
        int size = probe.getAlerts().size();
        return size == 0 ? x4.g.h().getString(R.string.title_activity_alert) : size == 1 ? x4.g.h().getString(R.string.one_alert_text) : x4.g.h().getString(R.string.no_of_alerts_text, Integer.valueOf(size));
    }

    public float l() {
        return this.f16142c;
    }

    public int m() {
        return this.f16141b;
    }

    public String n() {
        return this.f16143d;
    }

    public void q(float f10) {
        if (this.f16142c != f10) {
            this.f16142c = f10;
        }
    }

    public void r(String str) {
        String str2 = this.f16143d;
        if (str2 == null || !str2.equals(str)) {
            this.f16143d = str;
        }
    }

    public void s(boolean z10) {
        if (this.f16144e != z10) {
            this.f16144e = z10;
        }
    }

    public void t(int i10) {
        if (this.f16141b == i10) {
            return;
        }
        this.f16141b = i10;
    }

    public void v(Probe probe, RoundedImageWithLabel.a aVar) {
        s(probe.getShouldShowAsConnected());
        if (aVar == RoundedImageWithLabel.a.AlertView) {
            t(i(probe));
            q(h(probe));
            r(u(probe));
        } else if (aVar == RoundedImageWithLabel.a.GraphView) {
            t(p(probe));
            q(o(probe));
            r(x4.g.h().getString(R.string.graph_label));
        } else if (aVar == RoundedImageWithLabel.a.CancelCookView) {
            t(j(probe));
            q(k(probe));
            r(x4.g.h().getString(R.string.end_cook_title));
        }
    }
}
