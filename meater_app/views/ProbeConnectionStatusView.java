package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.apptionlabs.meater_app.model.Probe;
import f8.c;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ProbeConnectionStatusView extends AppCompatImageView {

    /* renamed from: u, reason: collision with root package name */
    private static f8.c f10388u;

    /* renamed from: t, reason: collision with root package name */
    private int f10389t;

    public ProbeConnectionStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10389t = -1;
        d();
    }

    private int c(Probe probe) {
        if (probe == null) {
            return 0;
        }
        return f8.i.a(probe.getParentOrMasterOrThisDevice(), probe.getShouldShowAsConnected());
    }

    private void d() {
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (f8.l0.w(getContext())) {
            setColorFilter(f8.l0.i(getContext(), 2131099682));
        }
    }

    public static void e() {
        if (f10388u == null) {
            f8.c cVar = new f8.c(10800000L, 1500L);
            f10388u = cVar;
            cVar.start();
        }
    }

    public static void f() {
        f8.c cVar = f10388u;
        if (cVar != null) {
            cVar.cancel();
            f10388u = null;
        }
    }

    private void h(int i10) {
        if (this.f10389t != i10) {
            try {
                setImageResource(i10);
            } catch (Exception unused) {
            }
            this.f10389t = i10;
        }
    }

    public void g(Probe probe) {
        f8.c cVar;
        int c10 = c(probe);
        if (c10 != 0 && (cVar = f10388u) != null) {
            if (cVar.f12468a == c.a.LowBattery && probe.hasLowBattery()) {
                h(2131231224);
            } else if (f10388u.f12468a == c.a.LowSignal && probe.hasLowSignal()) {
                h(2131231225);
            } else {
                h(c10);
            }
            if (getVisibility() != 0) {
                setVisibility(0);
            }
        }
    }
}
