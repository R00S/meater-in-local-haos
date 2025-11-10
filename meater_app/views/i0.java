package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import b6.l9;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MEATERDial.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class i0 extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    private float f10537q;

    /* renamed from: r, reason: collision with root package name */
    public l9 f10538r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f10539s;

    /* renamed from: t, reason: collision with root package name */
    Probe f10540t;

    /* renamed from: u, reason: collision with root package name */
    ArrayList<ImageView> f10541u;

    /* renamed from: v, reason: collision with root package name */
    private a f10542v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10543w;

    /* compiled from: MEATERDial.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum a {
        G2Probe,
        G1Probe
    }

    public i0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10539s = true;
        this.f10542v = a.G1Probe;
        this.f10543w = false;
        f(context);
    }

    private float d(float f10) {
        return Math.min(4800.0f, Math.max(0.0f, f10));
    }

    private a e(Probe probe) {
        if (probe.getMEATERDeviceType().isG2Probe()) {
            return a.G2Probe;
        }
        return a.G1Probe;
    }

    private void f(Context context) {
        l9 l9Var = (l9) androidx.databinding.g.h(LayoutInflater.from(context), 2131558722, this, true);
        this.f10538r = l9Var;
        l9Var.V.getDrawable().mutate().setAlpha(127);
        ArrayList<ImageView> arrayList = new ArrayList<>();
        this.f10541u = arrayList;
        arrayList.add(this.f10538r.Q);
        this.f10541u.add(this.f10538r.R);
        this.f10541u.add(this.f10538r.S);
        this.f10541u.add(this.f10538r.T);
    }

    public float a(float f10) {
        float f11;
        float f12;
        float f13;
        Probe probe = this.f10540t;
        if (probe != null) {
            f11 = Temperature.toCelsius(probe.maximumAmbientTemperature());
            f12 = (f11 / 3.0f) * 2.0f;
        } else {
            f11 = 300.0f;
            f12 = 200.0f;
        }
        float d10 = d(f10);
        if (getProbe() != null && getProbe().getCookState() != DeviceCookState.COOK_STATE_NOT_STARTED) {
            f13 = Temperature.toCelsiusFloat(getProbe().getTargetInternalTemperature());
        } else {
            f13 = 60.0f;
        }
        float celsiusFloat = Temperature.toCelsiusFloat((int) d10);
        float f14 = 0.0f;
        if (celsiusFloat != 0.0f) {
            if (f13 <= 20.0f && celsiusFloat < f13) {
                f14 = (celsiusFloat / f13) * 0.5f;
            } else if (celsiusFloat < f13 && celsiusFloat < 20.0f) {
                f14 = (celsiusFloat / 20.0f) * 0.05f;
            } else if (celsiusFloat < f13) {
                f14 = (((celsiusFloat - 20.0f) / (f13 - 20.0f)) * 0.45f) + 0.05f;
            } else if (celsiusFloat < f12) {
                f14 = (((celsiusFloat - f13) / (f12 - f13)) * 0.45f) + 0.5f;
            } else {
                f14 = (((celsiusFloat - f12) / (f11 - f12)) * 0.05f) + 0.95f;
            }
        }
        return (237.8f + (244.4f * f14)) % 360.0f;
    }

    public void b(Probe probe) {
        a e10 = e(probe);
        if (this.f10542v != e10) {
            this.f10543w = true;
        }
        this.f10542v = e10;
    }

    public void g(List<Alert> list, boolean z10) {
        int i10 = 0;
        if (z10) {
            int i11 = 0;
            for (Alert alert : list) {
                if (alert.isTemperatureAlarm()) {
                    ImageView imageView = this.f10541u.get(i11);
                    int limit = alert.getLimit();
                    if (limit > 0) {
                        imageView.setRotation(a(limit));
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(4);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < 4) {
            this.f10541u.get(i10).setVisibility(4);
            i10++;
        }
    }

    public float getInternalTempAngleToRotate() {
        return this.f10537q;
    }

    public Probe getProbe() {
        return this.f10540t;
    }

    void h(Probe probe) {
        float a10 = a(probe.getAmbientTemperature());
        float a11 = a(probe.getInternalTemperature());
        this.f10538r.U.setRotation(a10);
        this.f10538r.W.setRotation(a11);
        if (probe.getShouldShowAsConnected()) {
            this.f10538r.U.setImageResource(2131231071);
            this.f10538r.W.setImageResource(2131231215);
        } else {
            this.f10538r.U.setImageResource(2131231072);
            this.f10538r.W.setImageResource(2131231216);
        }
    }

    public void setInternalTempAngleToRotate(float f10) {
        this.f10537q = f10;
    }

    public void setProbe(Probe probe) {
        int i10;
        if (probe != null) {
            this.f10540t = probe;
            this.f10538r.T(probe);
            h(probe);
            g(probe.getAlerts(), probe.appearsToHaveCookInProgress());
            b(probe);
            if (this.f10543w) {
                this.f10543w = false;
                MeaterArcMask meaterArcMask = this.f10538r.V;
                if (this.f10542v == a.G2Probe) {
                    i10 = 2131231210;
                } else {
                    i10 = 2131231400;
                }
                meaterArcMask.setImageResource(i10);
            }
        }
    }
}
