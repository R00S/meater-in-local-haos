package com.apptionlabs.meater_app.activities;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n0;
import com.apptionlabs.meater_app.activities.CookHistory;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.views.b1;
import com.apptionlabs.meater_app.views.e0;
import com.apptionlabs.meater_app.views.e1;
import f8.a0;
import f8.l0;
import h6.p1;
import h6.w1;
import h6.x2;
import java.util.Locale;

/* loaded from: /tmp/meat/meat/classes.dex */
public class CookHistory extends j implements j6.h {

    /* renamed from: a0, reason: collision with root package name */
    AlertDialog f9325a0;

    /* renamed from: b0, reason: collision with root package name */
    private Probe f9326b0;

    /* renamed from: f0, reason: collision with root package name */
    long f9330f0;

    /* renamed from: h0, reason: collision with root package name */
    public j6.l f9332h0;

    /* renamed from: i0, reason: collision with root package name */
    private b6.i f9333i0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f9327c0 = false;

    /* renamed from: d0, reason: collision with root package name */
    c f9328d0 = c.none;

    /* renamed from: e0, reason: collision with root package name */
    b f9329e0 = b.none;

    /* renamed from: g0, reason: collision with root package name */
    boolean f9331g0 = true;

    /* renamed from: j0, reason: collision with root package name */
    android.view.o f9334j0 = new a(true);

    /* renamed from: k0, reason: collision with root package name */
    public android.view.result.c<Intent> f9335k0 = f0(new e.d(), new android.view.result.b() { // from class: p5.u0
        @Override // android.view.result.b
        public final void a(Object obj) {
            CookHistory.this.m2((android.view.result.a) obj);
        }
    });

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a extends android.view.o {
        a(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            if (CookHistory.this.m0().r0() == 1 || CookHistory.this.getIntent().getBooleanExtra(MEATERIntent.EXTRA_ONLY_FOR_SHARE_COOK, false)) {
                CookHistory.this.s2(false);
            } else {
                CookHistory.this.m0().e1();
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum b {
        setUp,
        history,
        none
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum c {
        PreviousCookFragment,
        TemperatureGraphFragment,
        none
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m2(android.view.result.a aVar) {
        j6.l lVar;
        if (aVar.a() != null && (lVar = this.f9332h0) != null) {
            lVar.f(aVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n2(e1 e1Var, View view) {
        e1Var.b(i6.c.V, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o2() {
        if (this.f9331g0) {
            this.f9333i0.R.setVisibility(0);
            w1 w1Var = new w1();
            n0 p10 = m0().p();
            p10.b(2131363088, w1Var);
            p10.h(null);
            p10.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p2() {
        b1.f10472l = false;
        s2(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q2(a0.b bVar) {
        if (bVar != a0.b.f12463s) {
            t2(bVar);
        } else {
            this.f9326b0.confirmCookSetup();
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r2() {
        this.f9327c0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s2(boolean z10) {
        Intent intent = new Intent();
        intent.putExtra(MEATERIntent.INTENT_COOK_STARTED, z10);
        setResult(-1, intent);
        finish();
    }

    private void t2(a0.b bVar) {
        String string;
        String string2;
        if (bVar == a0.b.f12461q) {
            string = getString(2132018740);
            string2 = getString(2132018739);
        } else {
            string = getString(2132018738);
            string2 = getString(2132018737);
        }
        AlertDialog e10 = e0.INSTANCE.e(this, string, string2, true, new e0.AlertPair(getString(2132018340), new j6.e() { // from class: p5.x0
            @Override // j6.e
            public final void a() {
                CookHistory.this.p2();
            }
        }), null, null);
        this.f9325a0 = e10;
        e10.show();
    }

    private void u2(String str, final a0.b bVar) {
        AlertDialog e10 = e0.INSTANCE.e(this, getString(2132018011), str, false, new e0.AlertPair(getString(2132018978), new j6.e() { // from class: p5.v0
            @Override // j6.e
            public final void a() {
                CookHistory.this.q2(bVar);
            }
        }), new e0.AlertPair(getString(2132018306), new j6.e() { // from class: p5.w0
            @Override // j6.e
            public final void a() {
                CookHistory.this.r2();
            }
        }), null);
        this.f9325a0 = e10;
        e10.show();
    }

    private void v2(Probe probe) {
        boolean z10;
        b1.f10472l = true;
        if (probe.getCookState() != DeviceCookState.COOK_STATE_NOT_STARTED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f9327c0) {
            this.f9326b0 = probe;
            this.f9327c0 = true;
            if (z10) {
                probe.confirmCookSetup();
                b1.f10472l = false;
                s2(true);
                return;
            }
            a0.b b10 = a0.INSTANCE.b(this);
            if (!x2(probe, probe, b10)) {
                probe.confirmCookSetup();
                if (b10 != a0.b.f12463s) {
                    t2(b10);
                } else {
                    b1.f10472l = false;
                    s2(true);
                }
            }
        }
    }

    private void w2(Fragment fragment, String str) {
        if (fragment != null) {
            m0().p().u(2131362016, fragment, str).h("").j();
        }
    }

    private boolean x2(Probe probe, MEATERDevice mEATERDevice, a0.b bVar) {
        while (mEATERDevice != null) {
            if (mEATERDevice.hasLowBattery() && probe != null && probe.getCookState() == DeviceCookState.COOK_STATE_NOT_STARTED) {
                String deviceName = mEATERDevice.getDeviceName();
                Locale locale = Locale.US;
                u2(String.format(locale, getString(2132017601), deviceName) + "\n" + String.format(locale, getString(2132017262), deviceName), bVar);
                return true;
            }
            mEATERDevice = mEATERDevice.getParentDevice();
        }
        return false;
    }

    @Override // j6.h
    public void K(Probe probe, MeaterTargetSetupActivity.c cVar, SavedCook savedCook, int i10) {
        boolean z10;
        if (cVar == MeaterTargetSetupActivity.c.PREVIOUS_COOKS) {
            try {
                Bundle bundle = new Bundle();
                x2 x2Var = new x2();
                if (this.f9329e0 == b.setUp) {
                    bundle.putInt(MEATERIntent.EXTRA_GRAPH_CONTEXT, x2.d.PREVIOUS_COOK.ordinal());
                } else {
                    bundle.putInt(MEATERIntent.EXTRA_GRAPH_CONTEXT, x2.d.COOK_HISTORY.ordinal());
                }
                bundle.putLong(MEATERIntent.EXTRA_SAVED_COOK_ID, savedCook.getCookID());
                if (i10 != 4 && i10 != 5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bundle.putBoolean("haveNote", z10);
                x2Var.k2(bundle);
                w2(x2Var, "TemperatureGraphFragment");
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        if (cVar == MeaterTargetSetupActivity.c.TEMPERATURE_GRAPH) {
            com.apptionlabs.meater_app.targets.n H2 = com.apptionlabs.meater_app.targets.n.H2();
            Bundle bundle2 = new Bundle();
            bundle2.putLong(MEATERIntent.EXTRA_SAVED_COOK_ID, savedCook.getCookID());
            bundle2.putParcelable(MEATERIntent.EXTRA_PROBE, this.f9326b0);
            H2.k2(bundle2);
            w2(H2, "SetUpPreviousCookFragment");
            return;
        }
        if (com.apptionlabs.meater_app.app.a.u().h0() && !probe.appearsToHaveCookInProgress() && cVar == MeaterTargetSetupActivity.c.TEMPERATURE_SELECTION) {
            w2(d8.f.M2(probe), d8.f.INSTANCE.a());
            return;
        }
        if (com.apptionlabs.meater_app.app.a.u().Y() && !probe.appearsToHaveCookInProgress() && (cVar == MeaterTargetSetupActivity.c.TEMPERATURE_SELECTION || cVar == MeaterTargetSetupActivity.c.PROBE_INSTRUCTION)) {
            w2(d8.a.O2(probe), d8.a.INSTANCE.a());
        } else {
            v2(probe);
        }
    }

    @Override // com.apptionlabs.meater_app.activities.j
    protected View i1() {
        return this.f9333i0.U.f7796b;
    }

    public long k2() {
        return this.f9330f0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        super.onCreate(bundle);
        this.f9333i0 = (b6.i) androidx.databinding.g.j(this, 2131558439);
        final e1 e1Var = new e1(getApplicationContext(), h1());
        i1().setOnClickListener(new View.OnClickListener() { // from class: p5.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CookHistory.this.n2(e1Var, view);
            }
        });
        this.f9328d0 = c.values()[getIntent().getIntExtra(MEATERIntent.INTENT_FRAGMENT_TYPE, 0)];
        this.f9329e0 = b.values()[getIntent().getIntExtra(MEATERIntent.INTENT_FRAGMENT_CONTEXT, 0)];
        c cVar = this.f9328d0;
        if (cVar == c.PreviousCookFragment) {
            p1 p1Var = new p1();
            Bundle bundle2 = new Bundle();
            if (this.f9329e0 == b.setUp) {
                Probe probe = (Probe) l0.k(getIntent().getExtras(), MEATERIntent.EXTRA_PROBE, Probe.class);
                this.f9326b0 = probe;
                bundle2.putParcelable(MEATERIntent.EXTRA_PROBE, probe);
            }
            bundle2.putInt(MEATERIntent.INTENT_FRAGMENT_CONTEXT, this.f9329e0.ordinal());
            bundle2.putInt(MEATERIntent.EXTRA_PREVIOUS_COOK_CONTEXT, getIntent().getIntExtra(MEATERIntent.EXTRA_PREVIOUS_COOK_CONTEXT, 0));
            p1Var.k2(bundle2);
            n0 p10 = m0().p();
            p10.b(2131362016, p1Var);
            p10.h(null);
            p10.j();
        } else if (cVar == c.TemperatureGraphFragment) {
            SavedCook f10 = LocalStorage.sharedStorage().savedCookDAO().f(getIntent().getExtras().getLong(MEATERIntent.EXTRA_SAVED_COOK_ID, 0L));
            this.f9330f0 = getIntent().getLongExtra(MEATERIntent.EXTRA_DEVICE_ID, 0L);
            int intExtra = getIntent().getIntExtra(MEATERIntent.EXTRA_GRAPH_CONTEXT, 0);
            Bundle bundle3 = new Bundle();
            x2 x2Var = new x2();
            n0 p11 = m0().p();
            bundle3.putInt(MEATERIntent.EXTRA_GRAPH_CONTEXT, intExtra);
            bundle3.putLong(MEATERIntent.EXTRA_DEVICE_ID, this.f9330f0);
            bundle3.putBoolean(MEATERIntent.EXTRA_ONLY_FOR_SHARE_COOK, getIntent().getBooleanExtra(MEATERIntent.EXTRA_ONLY_FOR_SHARE_COOK, false));
            bundle3.putInt(MEATERIntent.EXTRA_SHARE_COOK_TYPE, getIntent().getIntExtra(MEATERIntent.EXTRA_SHARE_COOK_TYPE, 0));
            Probe probe2 = (Probe) c6.h.f8879a.o(this.f9330f0);
            if (probe2 != null) {
                if (f10 == null) {
                    f10 = SavedCook.savedCookFromProbe(probe2);
                }
                if (f10.getPeakTemperature() >= f10.overcookThresholdTemperature()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (probe2.getPeakTemperature() >= probe2.overcookThresholdTemperature()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (getIntent().getIntExtra(MEATERIntent.EXTRA_GRAPH_CONTEXT, 0) == x2.d.COOK_SUMMARY.ordinal() && (z11 || z10)) {
                    e1Var.c(i1());
                }
            }
            bundle3.putLong(MEATERIntent.EXTRA_SAVED_COOK_ID, f10.getCookID());
            x2Var.k2(bundle3);
            p11.c(2131362016, x2Var, "TemperatureGraphFragment");
            p11.h(null);
            p11.j();
            if (probe2 != null && !probe2.getMEATERDeviceType().isG2Probe() && intExtra == x2.d.COOK_SUMMARY.ordinal() && com.apptionlabs.meater_app.app.a.u().g0()) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CookHistory.this.o2();
                    }
                }, 300L);
            }
        }
        getOnBackPressedDispatcher().h(this, this.f9334j0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f9331g0 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f9331g0 = true;
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onStop() {
        super.onStop();
        AlertDialog alertDialog = this.f9325a0;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    @Override // j6.h
    public void d() {
    }

    public void l2(int i10) {
    }
}
