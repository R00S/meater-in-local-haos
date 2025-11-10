package com.apptionlabs.meater_app.activities;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import b6.c0;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.activities.CustomSettingActivity;
import com.apptionlabs.meater_app.activities.RingToneActivity;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.qsg.ui.base.QSGActivity;
import com.apptionlabs.meater_app.views.b1;
import f8.l0;
import f8.w;
import lm.b;
import rk.C0451c;
import rk.C0549q;

/* loaded from: /tmp/meat/meat/classes.dex */
public class CustomSettingActivity extends j {

    /* renamed from: l0, reason: collision with root package name */
    private static boolean f9345l0 = false;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f9346a0;

    /* renamed from: c0, reason: collision with root package name */
    c0 f9348c0;

    /* renamed from: e0, reason: collision with root package name */
    private C0549q f9350e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f9351f0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f9347b0 = false;

    /* renamed from: d0, reason: collision with root package name */
    private ih.g<C0451c> f9349d0 = zm.a.c(C0451c.class);

    /* renamed from: g0, reason: collision with root package name */
    boolean f9352g0 = false;

    /* renamed from: h0, reason: collision with root package name */
    android.view.result.c<Intent> f9353h0 = f0(new e.d(), new android.view.result.b() { // from class: p5.z0
        @Override // android.view.result.b
        public final void a(Object obj) {
            CustomSettingActivity.this.y2((android.view.result.a) obj);
        }
    });

    /* renamed from: i0, reason: collision with root package name */
    android.view.result.c<Intent> f9354i0 = f0(new e.d(), new android.view.result.b() { // from class: p5.a1
        @Override // android.view.result.b
        public final void a(Object obj) {
            CustomSettingActivity.this.z2((android.view.result.a) obj);
        }
    });

    /* renamed from: j0, reason: collision with root package name */
    android.view.result.c<Intent> f9355j0 = f0(new e.d(), new android.view.result.b() { // from class: p5.b1
        @Override // android.view.result.b
        public final void a(Object obj) {
            CustomSettingActivity.this.A2((android.view.result.a) obj);
        }
    });

    /* renamed from: k0, reason: collision with root package name */
    android.view.o f9356k0 = new b(true);

    /* loaded from: /tmp/meat/meat/classes.dex */
    class b extends android.view.o {
        b(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            CustomSettingActivity.this.setResult(-1, new Intent());
            if (CustomSettingActivity.f9345l0 || b1.f10483w != com.apptionlabs.meater_app.app.a.u().r()) {
                CustomSettingActivity.this.M2();
                b1.f10483w = com.apptionlabs.meater_app.app.a.u().r();
                return;
            }
            if (!CustomSettingActivity.this.f9347b0 && CustomSettingActivity.this.f9346a0) {
                Intent intent = new Intent(CustomSettingActivity.this, (Class<?>) MainActivity.class);
                intent.addFlags(67108864);
                CustomSettingActivity.this.startActivity(intent);
            }
            CustomSettingActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A2(android.view.result.a aVar) {
        com.apptionlabs.meater_app.app.a.u().J0(l0.y());
        this.f9352g0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B2(String str) {
        R2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C2(w7.a aVar, CompoundButton compoundButton, boolean z10) {
        b.EnumC0292b enumC0292b;
        aVar.F0(z10);
        if (z10) {
            enumC0292b = b.EnumC0292b.f17326j0;
        } else {
            enumC0292b = b.EnumC0292b.f17328k0;
        }
        lm.b.g(enumC0292b.title, "", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D2(w7.a aVar, CompoundButton compoundButton, boolean z10) {
        b.EnumC0292b enumC0292b;
        if (z10) {
            enumC0292b = b.EnumC0292b.Z;
        } else {
            enumC0292b = b.EnumC0292b.f17308a0;
        }
        lm.b.g(enumC0292b.title, "", "");
        aVar.p1(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E2(w7.a aVar, CompoundButton compoundButton, boolean z10) {
        b.EnumC0292b enumC0292b;
        if (z10) {
            enumC0292b = b.EnumC0292b.f17310b0;
        } else {
            enumC0292b = b.EnumC0292b.f17312c0;
        }
        lm.b.g(enumC0292b.title, "", "");
        aVar.K0(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F2(w7.a aVar, CompoundButton compoundButton, boolean z10) {
        b.EnumC0292b enumC0292b;
        if (z10) {
            enumC0292b = b.EnumC0292b.X;
        } else {
            enumC0292b = b.EnumC0292b.Y;
        }
        lm.b.g(enumC0292b.title, "", "");
        aVar.Y0(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G2(w7.a aVar, CompoundButton compoundButton, boolean z10) {
        b.EnumC0292b enumC0292b;
        aVar.d1(z10);
        if (z10) {
            enumC0292b = b.EnumC0292b.f17330l0;
        } else {
            enumC0292b = b.EnumC0292b.f17332m0;
        }
        lm.b.g(enumC0292b.title, "", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I2(w7.a aVar, CompoundButton compoundButton, boolean z10) {
        if (w2()) {
            aVar.J0(z10);
        } else if (this.f9351f0) {
            this.f9355j0.a(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
        }
        if (!z10) {
            this.f9348c0.f7594e1.setVisibility(8);
        } else {
            this.f9348c0.f7594e1.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K2(w7.a aVar, CompoundButton compoundButton, boolean z10) {
        aVar.D1(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L2(w7.a aVar, CompoundButton compoundButton, boolean z10) {
        aVar.x1(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M2() {
        z5.h.f20309a.c();
        startActivity(Intent.makeRestartActivityTask(getPackageManager().getLaunchIntentForPackage(getPackageName()).getComponent()));
        Runtime.getRuntime().exit(0);
    }

    private void N2() {
        this.f9348c0.f7605k0.setBackgroundResource(2131230963);
        this.f9348c0.Q0.setBackgroundResource(0);
    }

    private void O2() {
        this.f9348c0.f7619r0.setBackgroundResource(2131230963);
        this.f9348c0.G0.setBackgroundResource(0);
    }

    private void P2() {
        this.f9348c0.G0.setBackgroundResource(2131230963);
        this.f9348c0.f7619r0.setBackgroundResource(0);
    }

    private void Q2() {
        this.f9348c0.Q0.setBackgroundResource(2131230963);
        this.f9348c0.f7605k0.setBackgroundResource(0);
    }

    private void R2() {
        String i10 = ((C0451c) this.f9349d0.getValue()).i();
        if (i10.isEmpty()) {
            i10 = n7.f.f15779s.name();
        }
        this.f9348c0.Z0.setText(i10);
    }

    private void S2() {
        final w7.a u10 = com.apptionlabs.meater_app.app.a.u();
        this.f9348c0.f7609m0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p5.y0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                CustomSettingActivity.C2(w7.a.this, compoundButton, z10);
            }
        });
        this.f9348c0.P0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p5.d1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                CustomSettingActivity.D2(w7.a.this, compoundButton, z10);
            }
        });
        this.f9348c0.Z.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p5.e1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                CustomSettingActivity.E2(w7.a.this, compoundButton, z10);
            }
        });
        this.f9348c0.f7625u0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p5.f1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                CustomSettingActivity.F2(w7.a.this, compoundButton, z10);
            }
        });
        this.f9348c0.I0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p5.g1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                CustomSettingActivity.G2(w7.a.this, compoundButton, z10);
            }
        });
        this.f9348c0.f7633y0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p5.h1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                w7.a.this.a1(z10);
            }
        });
        this.f9348c0.f7589c0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p5.i1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                CustomSettingActivity.this.I2(u10, compoundButton, z10);
            }
        });
        this.f9348c0.f7617q0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p5.j1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                w7.a.this.R0(z10);
            }
        });
        this.f9348c0.f7626u1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p5.k1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                CustomSettingActivity.K2(w7.a.this, compoundButton, z10);
            }
        });
        this.f9348c0.f7618q1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p5.l1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                CustomSettingActivity.L2(w7.a.this, compoundButton, z10);
            }
        });
    }

    private void T2() {
        w7.a u10 = com.apptionlabs.meater_app.app.a.u();
        if (u10.r() == e6.d.AUTO.n()) {
            this.f9348c0.V.setBackgroundResource(2131230963);
            this.f9348c0.f7631x0.setBackgroundResource(0);
            this.f9348c0.f7593e0.setBackgroundResource(0);
        } else if (u10.r() == e6.d.DARK_MODE.n()) {
            this.f9348c0.f7593e0.setBackgroundResource(2131230963);
            this.f9348c0.f7631x0.setBackgroundResource(0);
            this.f9348c0.V.setBackgroundResource(0);
        } else {
            this.f9348c0.f7631x0.setBackgroundResource(2131230963);
            this.f9348c0.V.setBackgroundResource(0);
            this.f9348c0.f7593e0.setBackgroundResource(0);
        }
    }

    private void v2() {
        this.f9348c0.f7607l0.setBackgroundResource(0);
        this.f9348c0.Y.setBackgroundResource(2131230963);
    }

    private boolean w2() {
        return ((NotificationManager) com.apptionlabs.meater_app.app.a.i().getSystemService("notification")).isNotificationPolicyAccessGranted();
    }

    private void x2() {
        this.f9348c0.f7607l0.setBackgroundResource(2131230963);
        this.f9348c0.Y.setBackgroundResource(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y2(android.view.result.a aVar) {
        if (aVar.b() == -1 && aVar.a() != null) {
            this.f9346a0 = aVar.a().getBooleanExtra("list_change", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(android.view.result.a aVar) {
        if (aVar.b() == -1 && aVar.a() != null) {
            finish();
        }
    }

    protected void U2() {
        int i10;
        int i11;
        int i12 = 0;
        this.f9351f0 = false;
        w7.a u10 = com.apptionlabs.meater_app.app.a.u();
        if (u10.T1()) {
            x2();
        } else {
            v2();
        }
        T2();
        this.f9348c0.I0.setChecked(u10.k0());
        this.f9348c0.f7633y0.setChecked(u10.c0());
        this.f9348c0.f7625u0.setChecked(u10.j0());
        this.f9348c0.P0.setChecked(u10.h0());
        this.f9348c0.Z.setChecked(u10.Y());
        this.f9348c0.f7609m0.setChecked(u10.a());
        this.f9348c0.f7589c0.setChecked(u10.b());
        this.f9348c0.f7617q0.setChecked(u10.d());
        this.f9348c0.f7626u1.setChecked(u10.S().booleanValue());
        this.f9348c0.f7618q1.setChecked(u10.O().booleanValue());
        if (ih.a.f268a.d(this)) {
            this.f9348c0.A0.Q.setVisibility(8);
            this.f9348c0.B0.setVisibility(8);
        } else {
            this.f9348c0.A0.Q.setVisibility(0);
            this.f9348c0.B0.setVisibility(0);
        }
        MEATERCloudAccount k10 = com.apptionlabs.meater_app.app.a.u().k();
        LinearLayout linearLayout = this.f9348c0.f7585a0;
        if (k10 == null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        TextView textView = this.f9348c0.R;
        if (k10 != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        this.f9348c0.K0.setText(com.apptionlabs.meater_app.app.a.u().F().i());
        this.f9348c0.W0.setText(com.apptionlabs.meater_app.app.a.u().M().i());
        this.f9348c0.U.setText(com.apptionlabs.meater_app.app.a.u().f().i());
        this.f9348c0.S0.setText(com.apptionlabs.meater_app.app.a.u().L().i());
        this.f9351f0 = true;
        this.f9348c0.f7622s1.S.setText(2132018588);
        this.f9348c0.f7620r1.S.setText(2132018633);
        this.f9348c0.H0.S.setText(2132018634);
        this.f9348c0.N0.S.setText(2132018635);
        this.f9348c0.f7587b0.S.setText(2132017913);
        this.f9348c0.A0.S.setText(2132018638);
        this.f9348c0.O0.S.setText(2132018639);
        this.f9348c0.f7621s0.S.setText(2132017932);
        this.f9348c0.f7597g0.S.setText(2132018632);
        this.f9348c0.f7627v0.S.setText(2132018045);
        RelativeLayout relativeLayout = this.f9348c0.f7594e1;
        if (!u10.b()) {
            i12 = 8;
        }
        relativeLayout.setVisibility(i12);
        this.f9348c0.f7592d1.setMax(10);
        this.f9348c0.f7592d1.setProgress(com.apptionlabs.meater_app.app.a.u().n());
        this.f9348c0.f7592d1.setOnSeekBarChangeListener(new a());
        if (u10.S1()) {
            N2();
        } else {
            Q2();
        }
        if (u10.b0()) {
            O2();
        } else {
            P2();
        }
        R2();
    }

    public void onAccountSettingClick(View view) {
        startActivity(new Intent(this, (Class<?>) AccountDetailActivity.class));
    }

    public void onAlertToneClick(View view) {
        Intent intent = new Intent(this, (Class<?>) RingToneActivity.class);
        intent.putExtra("RT", RingToneActivity.c.f9510t);
        startActivity(intent);
    }

    public void onAutoButtonClick(View view) {
        b1.f10482v = false;
        com.apptionlabs.meater_app.app.a.u().S0(e6.d.AUTO.n());
        T2();
        f9345l0 = true;
        androidx.appcompat.app.f.M(-1);
    }

    public void onCelciusButtonClick(View view) {
        v2();
        com.apptionlabs.meater_app.app.a.u().F1(false);
        ((C0451c) this.f9349d0.getValue()).j();
        lm.b.g(b.EnumC0292b.f17314d0.title, "", "");
    }

    public void onCloudSignInClick(View view) {
        lm.b.g(b.EnumC0292b.f17355v0.title, "", "");
        startActivity(new Intent(this, (Class<?>) CloudAccountActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9348c0 = (c0) androidx.databinding.g.j(this, 2131558453);
        if (!Config.getInstance().DEBUG_UI_ENABLED) {
            this.f9348c0.f7588b1.setVisibility(8);
            this.f9348c0.f7597g0.Q.setVisibility(8);
            this.f9348c0.f7617q0.setVisibility(8);
            this.f9348c0.f7627v0.Q.setVisibility(8);
            this.f9348c0.f7629w0.setVisibility(8);
            this.f9348c0.Y0.setVisibility(8);
            this.f9348c0.f7626u1.setVisibility(8);
            this.f9348c0.f7618q1.setVisibility(8);
            this.f9348c0.f7614o1.setVisibility(8);
            this.f9348c0.N0.v().setVisibility(8);
        }
        if (getIntent() != null) {
            this.f9347b0 = getIntent().getBooleanExtra("MA", false);
        }
        setTitle(getString(2132018628));
        U2();
        S2();
        if (l0.w(this)) {
            this.f9348c0.F0.setColorFilter(l0.i(this, 2131099682));
        }
        if (getIntent().getBooleanExtra("reset_password", false)) {
            Intent intent = new Intent(this, (Class<?>) CloudAccountActivity.class);
            intent.putExtra("reset_password", true);
            this.f9354i0.a(intent);
        }
        if (!Config.getInstance().SHOULD_SHOW_RECIPE) {
            this.f9348c0.f7627v0.Q.setVisibility(8);
            this.f9348c0.f7629w0.setVisibility(8);
            this.f9348c0.Y0.setVisibility(8);
            this.f9348c0.f7626u1.setVisibility(8);
            this.f9348c0.f7618q1.setVisibility(8);
            this.f9348c0.D0.setVisibility(8);
        }
        getOnBackPressedDispatcher().h(this, this.f9356k0);
    }

    public void onDarkButtonClick(View view) {
        b1.f10482v = false;
        com.apptionlabs.meater_app.app.a.u().S0(e6.d.DARK_MODE.n());
        T2();
        if (l0.w(this)) {
            return;
        }
        f9345l0 = true;
        androidx.appcompat.app.f.M(2);
    }

    public void onFahrenheitButtonClick(View view) {
        x2();
        com.apptionlabs.meater_app.app.a.u().F1(true);
        ((C0451c) this.f9349d0.getValue()).j();
        lm.b.g(b.EnumC0292b.f17314d0.title, "", "");
    }

    public void onHelpButtonClick(View view) {
        if (!l0.L()) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) MEATERHelpActivity.class));
    }

    public void onImperialButtonClick(View view) {
        O2();
        com.apptionlabs.meater_app.app.a.u().W0(true);
    }

    public void onLightButtonClick(View view) {
        b1.f10482v = false;
        com.apptionlabs.meater_app.app.a.u().S0(e6.d.LIGHT_MODE.n());
        T2();
        if (!l0.w(this)) {
            return;
        }
        f9345l0 = true;
        androidx.appcompat.app.f.M(1);
    }

    public void onLocationAccessClick(View view) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivity(intent);
    }

    public void onManageDeviceClick(View view) {
        lm.b.g(b.EnumC0292b.f17324i0.title, "", "");
        int I = com.apptionlabs.meater_app.app.a.u().I();
        w6.d dVar = w6.d.N;
        if (I != dVar.getProgress()) {
            com.apptionlabs.meater_app.app.a.u().A0(dVar.getProgress());
        }
        b1.f10486z = true;
        Intent intent = new Intent(this, (Class<?>) QSGActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_QSG_FROM_INSIDE_APP, true);
        this.f9353h0.a(intent);
    }

    public void onMetricButtonClick(View view) {
        P2();
        com.apptionlabs.meater_app.app.a.u().W0(false);
    }

    public void onOverCookToneClick(View view) {
        Intent intent = new Intent(this, (Class<?>) RingToneActivity.class);
        intent.putExtra("RT", RingToneActivity.c.f9511u);
        startActivity(intent);
    }

    public void onReadyToRestToneClick(View view) {
        Intent intent = new Intent(this, (Class<?>) RingToneActivity.class);
        intent.putExtra("RT", RingToneActivity.c.f9508r);
        startActivity(intent);
    }

    public void onReadyToneClick(View view) {
        Intent intent = new Intent(this, (Class<?>) RingToneActivity.class);
        intent.putExtra("RT", RingToneActivity.c.f9509s);
        startActivity(intent);
    }

    public void onRecipeDraftButtonClick(View view) {
        N2();
        if (!com.apptionlabs.meater_app.app.a.u().S1()) {
            com.apptionlabs.meater_app.app.a.u().E1(true);
            n7.g.f15786a.h().clear();
            com.apptionlabs.meater_app.app.a.u().e();
            k6.b.t("(CustomSettingActivity) Draft Recipes selected.", new Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.fragment.app.m, r7.q] */
    public void onRecipeLocaleButtonClick(View view) {
        C0549q c0549q = this.f9350e0;
        if (c0549q != null) {
            c0549q.A2();
            this.f9350e0 = null;
        }
        ?? a10 = C0549q.INSTANCE.a((C0451c) this.f9349d0.getValue(), new m7.e() { // from class: p5.c1
            @Override // m7.e
            public final void w(String str) {
                CustomSettingActivity.this.B2(str);
            }
        });
        this.f9350e0 = a10;
        a10.L2(true);
        this.f9350e0.N2(m0(), "recipeLocale");
    }

    public void onRecipePublishedButtonClick(View view) {
        Q2();
        if (com.apptionlabs.meater_app.app.a.u().S1()) {
            com.apptionlabs.meater_app.app.a.u().E1(false);
            n7.g.f15786a.h().clear();
            com.apptionlabs.meater_app.app.a.u().e();
            k6.b.t("(CustomSettingActivity) Published Recipes selected.", new Object[0]);
        }
    }

    public void onResetAppClick(View view) {
        w.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    @TargetApi(23)
    public void onResume() {
        super.onResume();
        U2();
        if (!w2()) {
            com.apptionlabs.meater_app.app.a.u().J0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (CustomSettingActivity.this.f9348c0.f7592d1.getProgress() < 2) {
                CustomSettingActivity.this.f9348c0.f7592d1.setProgress(2);
            }
            com.apptionlabs.meater_app.app.a.u().N0(i10);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
