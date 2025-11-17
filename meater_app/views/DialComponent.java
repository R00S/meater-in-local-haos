package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import b6.n2;
import b6.o7;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import java.util.Objects;
import rk.C0452d;

/* loaded from: /tmp/meat/meat/classes.dex */
public class DialComponent extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    n2 f10280q;

    /* renamed from: r, reason: collision with root package name */
    o7 f10281r;

    /* renamed from: s, reason: collision with root package name */
    private C0452d f10282s;

    /* renamed from: t, reason: collision with root package name */
    boolean f10283t;

    /* renamed from: u, reason: collision with root package name */
    private Handler f10284u;

    /* renamed from: v, reason: collision with root package name */
    private Runnable f10285v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10286w;

    /* renamed from: x, reason: collision with root package name */
    private int f10287x;

    /* renamed from: y, reason: collision with root package name */
    Probe f10288y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10289a;

        static {
            int[] iArr = new int[DeviceCookState.values().length];
            f10289a = iArr;
            try {
                iArr[DeviceCookState.COOK_STATE_NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10289a[DeviceCookState.COOK_STATE_COOK_CONFIGURED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10289a[DeviceCookState.COOK_STATE_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10289a[DeviceCookState.COOK_STATE_READY_FOR_RESTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10289a[DeviceCookState.COOK_STATE_RESTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10289a[DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10289a[DeviceCookState.COOK_STATE_FINISHED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10289a[DeviceCookState.COOK_STATE_SLIGHTLY_OVERDONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10289a[DeviceCookState.COOK_STATE_OVERCOOK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public DialComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10283t = false;
        this.f10287x = -1;
        g(context, attributeSet);
    }

    private void e() {
        if (getTag() != null && ((Integer) getTag()).intValue() > 4) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.apptionlabs.meater_app.views.t
                @Override // java.lang.Runnable
                public final void run() {
                    DialComponent.this.h();
                }
            }, 100L);
        }
        this.f10280q.R.getLayoutParams().width = this.f10287x;
        this.f10280q.R.getLayoutParams().height = this.f10287x;
        this.f10280q.S.getLayoutParams().width = this.f10287x;
        this.f10280q.S.getLayoutParams().height = this.f10287x;
        this.f10280q.R.setLayerType(2, null);
        this.f10280q.T.l(new ViewStub.OnInflateListener() { // from class: com.apptionlabs.meater_app.views.u
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                DialComponent.this.i(viewStub, view);
            }
        });
        this.f10280q.Q.c(this.f10287x / 3.2f, 5000, 7, 1.85f);
    }

    private void g(Context context, AttributeSet attributeSet) {
        this.f10280q = (n2) androidx.databinding.g.h(LayoutInflater.from(context), 2131558505, this, true);
        this.f10280q.R.setIsSmallViews(context.getTheme().obtainStyledAttributes(attributeSet, o5.c0.f15911g, 0, 0).getBoolean(4, false));
        C0452d c0452d = new C0452d();
        this.f10282s = c0452d;
        this.f10280q.U(c0452d);
        this.f10280q.Q.e();
        this.f10280q.Q.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.f10280q.Q.requestLayout();
        this.f10280q.R.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(ViewStub viewStub, View view) {
        this.f10281r = (o7) androidx.databinding.g.a(view);
        p();
        if (!this.f10280q.T.j()) {
            ViewStub i10 = this.f10280q.T.i();
            Objects.requireNonNull(i10);
            i10.inflate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        switch (a.f10289a[this.f10288y.getCookState().ordinal()]) {
            case 2:
            case 3:
                if (this.f10280q.T.h() == null) {
                    return;
                }
                this.f10280q.T.h().requestLayout();
                this.f10281r.Q.setAnimationRunning(false);
                this.f10281r.Q.b();
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (this.f10280q.Q.getVisibility() != 0) {
                    this.f10280q.Q.setVisibility(0);
                    break;
                }
                break;
        }
        this.f10280q.R.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        Runnable runnable;
        try {
            this.f10280q.R.m();
        } finally {
            Handler handler = this.f10284u;
            if (handler != null && (runnable = this.f10285v) != null) {
                handler.postDelayed(runnable, 1000L);
            }
        }
    }

    private void l() {
        this.f10283t = true;
        this.f10284u = new Handler(Looper.getMainLooper());
        Runnable runnable = new Runnable() { // from class: com.apptionlabs.meater_app.views.w
            @Override // java.lang.Runnable
            public final void run() {
                DialComponent.this.k();
            }
        };
        this.f10285v = runnable;
        runnable.run();
    }

    private void m() {
        Runnable runnable;
        if (this.f10283t) {
            this.f10283t = false;
            Handler handler = this.f10284u;
            if (handler != null && (runnable = this.f10285v) != null) {
                handler.removeCallbacks(runnable);
                this.f10284u = null;
                this.f10285v = null;
            }
        }
    }

    private void n(Probe probe) {
        if (probe == null) {
            return;
        }
        DeviceCookState cookState = probe.getCookState();
        DeviceCookState deviceCookState = DeviceCookState.COOK_STATE_STARTED;
        if ((cookState == deviceCookState || probe.getCookState() == DeviceCookState.COOK_STATE_COOK_CONFIGURED) && !this.f10283t) {
            l();
        } else if (probe.getCookState() != DeviceCookState.COOK_STATE_COOK_CONFIGURED && probe.getCookState() != deviceCookState) {
            m();
        }
    }

    private void o(Probe probe) {
        float f10;
        boolean z10;
        boolean z11;
        if (probe == null) {
            return;
        }
        this.f10280q.S.a(probe);
        C0452d c0452d = this.f10282s;
        if (probe.getShouldShowAsConnected()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        c0452d.n(f10);
        C0452d c0452d2 = this.f10282s;
        DeviceCookState cookState = probe.getCookState();
        DeviceCookState deviceCookState = DeviceCookState.COOK_STATE_STARTED;
        boolean z12 = true;
        if (cookState != deviceCookState && probe.getCookState() != DeviceCookState.COOK_STATE_COOK_CONFIGURED) {
            z10 = false;
        } else {
            z10 = true;
        }
        c0452d2.m(z10);
        if (probe.appearsToHaveCookInProgress()) {
            this.f10282s.p(probe);
        }
        this.f10282s.r(getContext(), probe.shouldEnableAlertsButton());
        this.f10282s.s(String.valueOf(probe.getAlerts().size()));
        C0452d c0452d3 = this.f10282s;
        if (probe.getAlerts().size() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        c0452d3.t(z11);
        switch (a.f10289a[probe.getCookState().ordinal()]) {
            case 2:
            case 3:
                if (!this.f10280q.T.j()) {
                    ViewStub i10 = this.f10280q.T.i();
                    Objects.requireNonNull(i10);
                    i10.setLayoutResource(2131558677);
                    this.f10280q.T.i().inflate();
                    f();
                }
                if (this.f10286w) {
                    n(probe);
                    break;
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (this.f10280q.Q.getVisibility() != 0) {
                    this.f10280q.Q.setVisibility(0);
                    break;
                }
                break;
        }
        C0452d c0452d4 = this.f10282s;
        if ((probe.getCookState() != DeviceCookState.COOK_STATE_COOK_CONFIGURED && probe.getCookState() != deviceCookState) || probe.getInternalTemperature() >= probe.getTargetInternalTemperature()) {
            z12 = false;
        }
        c0452d4.u(z12);
        o7 o7Var = this.f10281r;
        if (o7Var != null) {
            o7Var.Q.d(probe);
        }
        if (this.f10280q.Q.getVisibility() == 0) {
            this.f10280q.Q.f(probe);
        }
    }

    private void p() {
        o7 o7Var = this.f10281r;
        if (o7Var == null) {
            return;
        }
        o7Var.Q.getLayoutParams().width = (int) (this.f10287x * 0.94f);
        this.f10281r.Q.getLayoutParams().height = (int) (this.f10287x * 0.94f);
        this.f10281r.T(this.f10282s);
        this.f10281r.Q.requestLayout();
    }

    public void f() {
        if (this.f10288y == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.apptionlabs.meater_app.views.v
            @Override // java.lang.Runnable
            public final void run() {
                DialComponent.this.j();
            }
        }, 150L);
    }

    public DialViews getDialView() {
        return this.f10280q.R;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            this.f10287x = Math.min(i10, i11);
            e();
            p();
            o(this.f10288y);
        }
    }

    public void q(Probe probe) {
        this.f10288y = probe;
        if (this.f10287x != -1) {
            o(probe);
            this.f10280q.T().x(probe, getContext());
            if (this.f10280q.Q.getVisibility() == 0) {
                this.f10280q.Q.f(probe);
            }
            o7 o7Var = this.f10281r;
            if (o7Var != null) {
                o7Var.Q.d(probe);
            }
        }
        this.f10280q.R.setProbe(probe);
    }

    public void setUpdateTimeViewEverySecond(boolean z10) {
        this.f10286w = z10;
    }
}
