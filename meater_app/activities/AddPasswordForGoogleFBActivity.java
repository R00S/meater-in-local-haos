package com.apptionlabs.meater_app.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import b6.p0;
import bn.s;
import com.apptionlabs.meater_app.activities.AddPasswordForGoogleFBActivity;
import com.apptionlabs.meater_app.cloud.responses.MeaterCloudAccountResponse;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.views.PasswordEditText;
import com.apptionlabs.meater_app.views.b1;
import com.apptionlabs.meater_app.views.m0;
import com.apptionlabs.meater_app.views.r;
import f8.l0;
import f8.t;
import j6.r;
import java.util.ArrayList;
import java.util.Iterator;
import rk.C0461m;

/* loaded from: /tmp/meat/meat/classes.dex */
public class AddPasswordForGoogleFBActivity extends j implements r, View.OnClickListener {

    /* renamed from: a0, reason: collision with root package name */
    p0 f9212a0;

    /* renamed from: b0, reason: collision with root package name */
    j6.n f9213b0;

    /* renamed from: c0, reason: collision with root package name */
    String f9214c0 = "";

    /* renamed from: d0, reason: collision with root package name */
    private final C0461m f9215d0 = new C0461m();

    /* renamed from: e0, reason: collision with root package name */
    private boolean f9216e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f9217f0 = false;

    /* renamed from: g0, reason: collision with root package name */
    ArrayList<String> f9218g0 = new ArrayList<>();

    /* renamed from: h0, reason: collision with root package name */
    boolean f9219h0 = false;

    /* renamed from: i0, reason: collision with root package name */
    boolean f9220i0 = false;

    /* renamed from: j0, reason: collision with root package name */
    android.view.result.c<Intent> f9221j0 = f0(new e.d(), new android.view.result.b() { // from class: p5.g
        @Override // android.view.result.b
        public final void a(Object obj) {
            AddPasswordForGoogleFBActivity.this.o2((android.view.result.a) obj);
        }
    });

    private void B2() {
        I2("Enhanced Custom support", "file:///android_asset/cloud-customer-support.html");
    }

    private void C2() {
        if (this.f9220i0) {
            return;
        }
        this.f9220i0 = true;
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtra("title", "Cloud Login Update");
        intent.putExtra("url", "file:///android_asset/cloud-add-password-help.html");
        startActivity(intent);
    }

    private void D2() {
        I2("Using MEATER Cloud", "file:///android_asset/meater-cloud-help.html");
    }

    private void E2() {
        finish();
    }

    private void F2() {
        I2("Sharing your Cooks", "file:///android_asset/cook-sharing-help.html");
    }

    private void G2() {
        boolean b10 = t.f12516a.b();
        ArrayList<Integer> r10 = this.f9215d0.r();
        if (r10.size() == 0) {
            if (!this.f9216e0) {
                if (b10) {
                    this.f9216e0 = true;
                    this.f9212a0.f8115o0.setVisibility(0);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            AddPasswordForGoogleFBActivity.this.y2();
                        }
                    }, 1000L);
                    return;
                }
                H2(getString(2132018873));
                return;
            }
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<Integer> it = r10.iterator();
        while (it.hasNext()) {
            arrayList.add(getString(it.next().intValue()));
        }
        this.f9212a0.Q.c(this, arrayList);
        this.f9215d0.m(this);
    }

    private void H2(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f9218g0 = arrayList;
        arrayList.add(str);
        this.f9212a0.Q.c(this, this.f9218g0);
    }

    private void I2(String str, String str2) {
        if (this.f9220i0) {
            return;
        }
        this.f9220i0 = true;
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        startActivity(intent);
    }

    @SuppressLint({"RestrictedApi"})
    private void J2() {
        float d10 = m0.d() * 0.97f;
        this.f9212a0.H0.setTextSize(0, 1.2f * d10);
        this.f9212a0.I0.setTextSize(0, d10);
        this.f9212a0.J0.setTextSize(0, d10);
        float f10 = 1.05f * d10;
        this.f9212a0.f8108h0.setTextSize(0, f10);
        this.f9212a0.K0.setTextSize(0, d10);
        this.f9212a0.K0.setTextSize(0, d10);
        this.f9212a0.f8124x0.setTextSize(0, d10);
        this.f9212a0.f8123w0.setTextSize(0, f10);
        this.f9212a0.f8125y0.setTextSize(0, d10);
        this.f9212a0.f8119s0.setTextSize(0, 0.95f * d10);
        int i10 = (int) (b1.f10467g / 9.0f);
        this.f9212a0.Y.getLayoutParams().width = i10;
        this.f9212a0.Y.getLayoutParams().height = i10;
        this.f9212a0.Y.requestLayout();
        int i11 = (int) (b1.f10467g / 15.3f);
        this.f9212a0.P0.getLayoutParams().width = i11;
        this.f9212a0.P0.getLayoutParams().height = i11;
        this.f9212a0.P0.requestLayout();
        this.f9212a0.R0.getLayoutParams().width = i11;
        this.f9212a0.R0.getLayoutParams().height = i11;
        this.f9212a0.R0.requestLayout();
        this.f9212a0.Q0.setTextSize(0, 0.85f * d10);
        this.f9212a0.X.setTextSize(0, f10);
        this.f9212a0.G0.setTextSize(0, f10);
        int i12 = ((int) (b1.f10467g / 15.3f)) * 2;
        this.f9212a0.f8110j0.getLayoutParams().width = i12;
        this.f9212a0.f8110j0.getLayoutParams().height = i12;
        this.f9212a0.U.getLayoutParams().width = i12;
        this.f9212a0.U.getLayoutParams().height = i12;
        this.f9212a0.C0.getLayoutParams().width = i12;
        this.f9212a0.C0.getLayoutParams().height = i12;
        this.f9212a0.f8102b0.getLayoutParams().width = i12;
        this.f9212a0.f8102b0.getLayoutParams().height = i12;
        this.f9212a0.f8109i0.setTextSize(0, 1.35f * d10);
        this.f9212a0.f8104d0.setTextSize(0, f10);
        this.f9212a0.f8105e0.setTextSize(0, f10);
        this.f9212a0.f8114n0.setTextSize(0, d10);
        this.f9212a0.f8111k0.setTextSize(0, d10);
        this.f9212a0.V.setTextSize(0, m0.d());
        this.f9212a0.S.setTextSize(0, d10);
        this.f9212a0.D0.setTextSize(0, m0.d());
        this.f9212a0.f8126z0.setTextSize(0, d10);
        this.f9212a0.f8103c0.setTextSize(0, d10);
        this.f9212a0.Z.setTextSize(0, d10);
        this.f9212a0.f8120t0.setAutoSizeTextTypeUniformWithConfiguration((int) (0.75f * d10), (int) (d10 * 1.15f), 2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o2(android.view.result.a aVar) {
        if (aVar.b() == -1) {
            Intent intent = new Intent();
            intent.setPackage(com.apptionlabs.meater_app.app.a.i().getPackageName());
            setResult(-1, intent);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p2(View view) {
        if (this.f9219h0) {
            this.f9219h0 = false;
            this.f9212a0.E0.setImageResource(2131231283);
        } else {
            this.f9219h0 = true;
            this.f9212a0.E0.setImageResource(2131231284);
        }
        PasswordEditText passwordEditText = this.f9212a0.f8119s0;
        passwordEditText.j(this.f9219h0, passwordEditText.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q2(View view) {
        E2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r2(View view) {
        A2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s2(View view) {
        G2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t2(View view) {
        D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u2(View view) {
        z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v2(View view) {
        F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w2(View view) {
        B2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x2(View view) {
        C2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y2() {
        MeaterCloudAccountResponse meaterCloudAccountResponse = new MeaterCloudAccountResponse();
        if (this.f9217f0) {
            meaterCloudAccountResponse.setFacebook_token(this.f9214c0);
        } else {
            meaterCloudAccountResponse.setGoogle_token(this.f9214c0);
        }
        meaterCloudAccountResponse.setPassword(this.f9212a0.f8117q0.getPasswordField());
        this.f9213b0.i(meaterCloudAccountResponse);
    }

    private void z2() {
        I2("Using Amazon Alexa with MEATER", "file:///android_asset/alexa-help.html");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        MEATERCloudAccount k10;
        super.onCreate(bundle);
        this.f9212a0 = (p0) androidx.databinding.g.j(this, 2131558460);
        this.f9213b0 = new v7.b(this);
        this.f9212a0.T(this.f9215d0);
        this.f9212a0.f8117q0.setModel(this.f9215d0);
        new com.apptionlabs.meater_app.views.r(this, x0(), r.c.GUIDE_ACTIVITY);
        if (getIntent() != null) {
            this.f9214c0 = getIntent().getExtras().getString("token");
            this.f9217f0 = getIntent().getExtras().getBoolean("fb_account");
            String string = getIntent().getExtras().getString("email");
            this.f9212a0.f8107g0.setVisibility(8);
            this.f9212a0.f8106f0.setVisibility(0);
            if (string == null && ((k10 = com.apptionlabs.meater_app.app.a.u().k()) == null || (string = k10.email) == null)) {
                finish();
                return;
            }
            this.f9212a0.f8123w0.setText(getString(2132017215) + "\n" + string);
            this.f9212a0.f8125y0.setText(l0.p(getString(2132017217) + "\n" + getString(2132017218) + " " + getString(2132018768)));
            MeaterCloudAccountResponse meaterCloudAccountResponse = new MeaterCloudAccountResponse();
            meaterCloudAccountResponse.setEmail(string);
            this.f9213b0.h(meaterCloudAccountResponse);
            this.f9212a0.E0.setOnClickListener(new View.OnClickListener() { // from class: p5.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddPasswordForGoogleFBActivity.this.p2(view);
                }
            });
            J2();
            if (!l0.I()) {
                this.f9212a0.R.setVisibility(8);
                this.f9212a0.T.setVisibility(8);
            }
            this.f9212a0.f8116p0.setOnClickListener(new View.OnClickListener() { // from class: p5.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddPasswordForGoogleFBActivity.this.q2(view);
                }
            });
            this.f9212a0.X.setOnClickListener(new View.OnClickListener() { // from class: p5.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddPasswordForGoogleFBActivity.this.r2(view);
                }
            });
            this.f9212a0.G0.setOnClickListener(new View.OnClickListener() { // from class: p5.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddPasswordForGoogleFBActivity.this.s2(view);
                }
            });
            this.f9212a0.f8111k0.setOnClickListener(new View.OnClickListener() { // from class: p5.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddPasswordForGoogleFBActivity.this.t2(view);
                }
            });
            this.f9212a0.S.setOnClickListener(new View.OnClickListener() { // from class: p5.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddPasswordForGoogleFBActivity.this.u2(view);
                }
            });
            this.f9212a0.f8126z0.setOnClickListener(new View.OnClickListener() { // from class: p5.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddPasswordForGoogleFBActivity.this.v2(view);
                }
            });
            this.f9212a0.Z.setOnClickListener(new View.OnClickListener() { // from class: p5.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddPasswordForGoogleFBActivity.this.w2(view);
                }
            });
            this.f9212a0.f8108h0.setOnClickListener(new View.OnClickListener() { // from class: p5.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddPasswordForGoogleFBActivity.this.x2(view);
                }
            });
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f9220i0 = false;
    }

    @Override // j6.r
    public void u() {
        this.f9212a0.f8115o0.setVisibility(8);
    }

    private void A2() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // j6.r
    public void x(s<MeaterCloudAccountResponse> sVar, MeaterCloudAccountResponse meaterCloudAccountResponse) {
    }
}
