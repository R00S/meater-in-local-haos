package com.apptionlabs.meater_app.views.connectionwarning;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import androidx.databinding.g;
import b6.q1;
import com.apptionlabs.meater_app.model.DeviceType;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.views.DeviceConnectionView;
import com.apptionlabs.meater_app.views.MarchingAntsView;
import com.apptionlabs.meater_app.views.connectionwarning.ConnectionLostImageOverlay;
import f8.i;
import f8.l0;
import j6.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import rk.C0450b;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ConnectionLostImageOverlay extends LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    private final View f10490q;

    /* renamed from: r, reason: collision with root package name */
    private final q1 f10491r;

    /* renamed from: s, reason: collision with root package name */
    private final List<WeakReference<MarchingAntsView>> f10492s;

    /* renamed from: t, reason: collision with root package name */
    private final Handler f10493t;

    /* renamed from: u, reason: collision with root package name */
    boolean f10494u;

    /* renamed from: v, reason: collision with root package name */
    TranslateAnimation f10495v;

    /* renamed from: w, reason: collision with root package name */
    boolean f10496w;

    public ConnectionLostImageOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10492s = new ArrayList();
        this.f10493t = new Handler(Looper.getMainLooper());
        this.f10494u = false;
        this.f10496w = false;
        setOrientation(1);
        setGravity(17);
        setWeightSum(1.0f);
        q1 q1Var = (q1) g.h(LayoutInflater.from(context), 2131558479, this, true);
        this.f10491r = q1Var;
        this.f10490q = q1Var.v();
        TranslateAnimation translateAnimation = new TranslateAnimation(-100.0f, 100.0f, 0.0f, 0.0f);
        this.f10495v = translateAnimation;
        translateAnimation.setDuration(3000L);
        this.f10495v.setRepeatCount(-1);
        this.f10495v.setRepeatMode(2);
        this.f10495v.setFillAfter(true);
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            Drawable background = q1Var.R.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(androidx.core.graphics.a.k(-12303292, 204));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        e();
        f();
    }

    private void d(int i10) {
        if (this.f10492s.size() > i10) {
            g();
            int i11 = i10 - 1;
            if (i10 > 1) {
                i11 = i10 + 1;
            }
            this.f10492s.get(i10).get().setForceStop(true);
            this.f10492s.get(i11).get().setForceStop(true);
            if (!this.f10494u) {
                this.f10494u = true;
                f();
            }
        }
    }

    private void f() {
        this.f10493t.postDelayed(new Runnable() { // from class: k8.a
            @Override // java.lang.Runnable
            public final void run() {
                ConnectionLostImageOverlay.this.c();
            }
        }, 135L);
    }

    private void g() {
        for (WeakReference<MarchingAntsView> weakReference : this.f10492s) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().setForceStop(false);
            }
        }
    }

    private void h(DeviceConnectionView deviceConnectionView, a aVar) {
        int i10;
        boolean z10;
        List<o> n10 = C0450b.n(aVar.d());
        deviceConnectionView.N(n10.size());
        deviceConnectionView.setSelectedDevice(-1);
        deviceConnectionView.setGraphStyle(DeviceConnectionView.b.WARNING);
        Context context = getContext();
        if (l0.w(getContext())) {
            i10 = 2131099682;
        } else {
            i10 = 2131100532;
        }
        deviceConnectionView.setSelectionColour(androidx.core.content.a.c(context, i10));
        int i11 = 0;
        boolean z11 = false;
        for (o oVar : n10) {
            if (deviceConnectionView.getGraphStyle() == DeviceConnectionView.b.BASIC) {
                z10 = true;
            } else {
                z10 = false;
            }
            deviceConnectionView.Q(i11, i.c(oVar, z10), oVar);
            if (oVar.equals(aVar.d())) {
                deviceConnectionView.setSelectedDevice(i11);
            }
            if (deviceConnectionView.P(i11, aVar.a().l(oVar, oVar.getShouldShowAsConnected(), z11), true) && !oVar.getShouldShowAsConnected() && !z11) {
                d(i11);
                z11 = true;
            }
            int i12 = i11 * 2;
            deviceConnectionView.S(C0450b.z(oVar), i12 - 1, i12 - 2);
            if (oVar.getDeviceType() == DeviceType.MEATER_DEVICE) {
                MEATERDevice mEATERDevice = (MEATERDevice) oVar;
                if (mEATERDevice.isBlockProbe()) {
                    deviceConnectionView.T(mEATERDevice.displayProbeNumber(), -1, 2131231538);
                    i11++;
                }
            }
            deviceConnectionView.I();
            i11++;
        }
        deviceConnectionView.G(false, false);
    }

    public void b(a aVar) {
        this.f10491r.W.setText(aVar.c());
        this.f10491r.V.setText(aVar.b());
        if (this.f10492s.isEmpty()) {
            this.f10492s.addAll(this.f10491r.T.getMarchingAnts());
        } else if (!this.f10494u) {
            this.f10494u = true;
            f();
        }
        if (!this.f10496w) {
            this.f10496w = true;
            this.f10491r.T.startAnimation(this.f10495v);
        }
        h(this.f10491r.T, aVar);
    }

    public void e() {
        for (WeakReference<MarchingAntsView> weakReference : this.f10492s) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().b();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10492s.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10494u = false;
        this.f10493t.removeCallbacksAndMessages(null);
        if (this.f10496w) {
            this.f10491r.T.clearAnimation();
            this.f10495v.cancel();
            this.f10496w = false;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = i10 / 24;
        ((LinearLayout.LayoutParams) this.f10490q.getLayoutParams()).setMargins(i14, 0, i14, 0);
        int i15 = i10 / 20;
        this.f10490q.setPadding(i15, i15, i15, i15);
    }
}
