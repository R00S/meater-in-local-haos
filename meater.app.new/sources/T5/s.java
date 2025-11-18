package T5;

import android.view.Y;
import androidx.appcompat.widget.AppCompatTextView;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;

/* compiled from: TemperatureIndicatorModel.java */
/* loaded from: classes2.dex */
public class s extends Y {

    /* renamed from: b, reason: collision with root package name */
    boolean f16155b;

    /* renamed from: c, reason: collision with root package name */
    private String f16156c;

    /* renamed from: d, reason: collision with root package name */
    int f16157d;

    /* renamed from: e, reason: collision with root package name */
    int f16158e;

    /* renamed from: f, reason: collision with root package name */
    boolean f16159f;

    public String h() {
        return this.f16156c;
    }

    public void i(int i10) {
        this.f16158e = i10;
        n(Temperature.displayTemperature(i10));
    }

    public void j(boolean z10) {
        if (this.f16155b != z10) {
            this.f16155b = z10;
        }
    }

    public void k(int i10) {
        n(this.f16159f ? Temperature.displayTemperatureFloatValues(i10) : Temperature.displayTemperature(i10));
    }

    public void l(boolean z10) {
        this.f16159f = z10;
    }

    public void m(int i10) {
        if (i10 != ProtocolParameters.PROBE_DEFAULT_TEMPERATURE) {
            this.f16157d = i10;
            n(Temperature.displayTemperature(i10));
        }
    }

    public void n(String str) {
        String str2 = this.f16156c;
        if (str2 == null || !str2.equalsIgnoreCase(str)) {
            this.f16156c = str;
        }
    }

    public void o(Probe probe, O4.g gVar, AppCompatTextView appCompatTextView) {
        j(probe.getShouldShowAsConnected());
        if (gVar == O4.g.f13259B) {
            if (probe.getInternalTemperature() != ProtocolParameters.PROBE_DEFAULT_TEMPERATURE) {
                k(probe.getInternalTemperature());
            } else {
                n("—");
            }
        } else if (gVar == O4.g.f13260C) {
            if (probe.appearsToHaveCookInProgress()) {
                m(probe.getTargetInternalTemperature());
            } else {
                n("—");
            }
        } else if (gVar == O4.g.f13261D) {
            if (probe.canDisplayAmbientTemperature()) {
                i(probe.getAmbientTemperature());
            } else {
                n("—");
            }
        }
        if (this.f16159f) {
            return;
        }
        appCompatTextView.setText(this.f16156c);
    }

    public void p(SavedCook savedCook, O4.g gVar) {
        if (savedCook == null) {
            return;
        }
        j(true);
        if (gVar == O4.g.f13259B) {
            k(savedCook.getPeakTemperature());
        } else if (gVar == O4.g.f13260C) {
            m(savedCook.getTargetTemperature());
        }
    }
}
