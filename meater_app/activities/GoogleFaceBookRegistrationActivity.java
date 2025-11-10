package com.apptionlabs.meater_app.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import bn.s;
import com.apptionlabs.meater_app.activities.GoogleFaceBookRegistrationActivity;
import com.apptionlabs.meater_app.cloud.responses.MeaterCloudAccountResponse;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.v3protobuf.MEATERCloudState;
import com.apptionlabs.meater_app.views.e0;
import com.apptionlabs.meater_app.views.m0;
import com.apptionlabs.meater_app.views.r;
import f8.l0;
import f8.t;
import j6.r;
import java.util.ArrayList;

/* loaded from: /tmp/meat/meat/classes.dex */
public class GoogleFaceBookRegistrationActivity extends j implements r {

    /* renamed from: a0, reason: collision with root package name */
    String f9365a0;

    /* renamed from: b0, reason: collision with root package name */
    String f9366b0;

    /* renamed from: f0, reason: collision with root package name */
    b6.m f9370f0;

    /* renamed from: g0, reason: collision with root package name */
    j6.n f9371g0;

    /* renamed from: c0, reason: collision with root package name */
    String f9367c0 = "";

    /* renamed from: d0, reason: collision with root package name */
    private boolean f9368d0 = false;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f9369e0 = false;

    /* renamed from: h0, reason: collision with root package name */
    private final boolean f9372h0 = true;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f9373i0 = false;

    /* renamed from: j0, reason: collision with root package name */
    android.view.o f9374j0 = new a(true);

    /* renamed from: k0, reason: collision with root package name */
    android.view.result.c<Intent> f9375k0 = f0(new e.d(), new android.view.result.b() { // from class: p5.r1
        @Override // android.view.result.b
        public final void a(Object obj) {
            GoogleFaceBookRegistrationActivity.this.z1((android.view.result.a) obj);
        }
    });

    /* renamed from: l0, reason: collision with root package name */
    boolean f9376l0 = false;

    /* renamed from: m0, reason: collision with root package name */
    boolean f9377m0 = true;

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a extends android.view.o {
        a(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            GoogleFaceBookRegistrationActivity googleFaceBookRegistrationActivity = GoogleFaceBookRegistrationActivity.this;
            if (googleFaceBookRegistrationActivity.f9377m0) {
                googleFaceBookRegistrationActivity.n2();
            } else {
                googleFaceBookRegistrationActivity.u2();
            }
        }
    }

    @SuppressLint({"NewApi", "RestrictedApi"})
    private void l2() {
        this.f9370f0.f7987f0.setTextSize(0, m0.d() * 1.14f);
        this.f9370f0.f7995n0.setTextSize(0, m0.d() * 1.2f);
        this.f9370f0.Q.setTextSize(0, m0.d() * 1.2f);
        this.f9370f0.f8006y0.setTextSize(0, m0.d() * 1.2f);
        this.f9370f0.f7988g0.setTextSize(0, m0.d() * 1.12f);
        this.f9370f0.f7982a0.setTextSize(0, m0.d() * 1.12f);
        this.f9370f0.f7991j0.setTextSize(0, m0.d() * 1.15f);
        this.f9370f0.f7985d0.setTextSize(0, m0.d());
        this.f9370f0.f8005x0.setTextSize(0, m0.d() * 1.15f);
        this.f9370f0.V.setTextSize(0, m0.d() * 0.92f);
        this.f9370f0.W.setTextSize(0, m0.d() * 0.9f);
        this.f9370f0.f8003v0.setTextSize(0, m0.d() * 1.2f);
        this.f9370f0.f8001t0.setTextSize(0, m0.d());
        this.f9370f0.f8002u0.setTextSize(0, m0.d());
        this.f9370f0.S.setTextSize(0, m0.d() * 1.2f);
        this.f9370f0.f7996o0.setTextSize(0, m0.d() * 1.2f);
        this.f9370f0.Z.setAutoSizeTextTypeUniformWithConfiguration((int) (m0.d() * 0.4f), (int) (m0.d() * 1.1f), 2, 0);
    }

    private void m2() {
        com.apptionlabs.meater_app.app.a.u().c();
        y5.g.E().M();
        c6.h.f8879a.e(MEATERCloudState.MEATER_CLOUD_STATE_DISABLED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n2() {
        Intent intent = new Intent();
        intent.putExtra("error", true);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o2() {
        MeaterCloudAccountResponse meaterCloudAccountResponse = new MeaterCloudAccountResponse();
        meaterCloudAccountResponse.setName(this.f9370f0.f7987f0.getText().toString());
        meaterCloudAccountResponse.setFirstName(this.f9370f0.f7987f0.getText().toString());
        meaterCloudAccountResponse.setEmail(this.f9370f0.Z.getText().toString());
        meaterCloudAccountResponse.setToken(this.f9367c0);
        meaterCloudAccountResponse.setLocale(com.apptionlabs.meater_app.app.a.t());
        meaterCloudAccountResponse.setEmailClubOptIn(this.f9370f0.W.isChecked());
        meaterCloudAccountResponse.setAgree_to_terms_and_conditions(true);
        if (this.f9368d0) {
            this.f9371g0.a(meaterCloudAccountResponse);
        } else {
            this.f9371g0.g(meaterCloudAccountResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p2(View view) {
        this.f9370f0.T.setBackgroundColor(l0.h(2131100532));
        if (t.f12516a.b()) {
            if (this.f9370f0.V.isChecked()) {
                this.f9370f0.f7986e0.setVisibility(0);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        GoogleFaceBookRegistrationActivity.this.o2();
                    }
                }, 1000L);
                return;
            } else {
                if (this.f9369e0) {
                    v2(getString(2132018508));
                    this.f9370f0.T.setBackgroundColor(l0.h(2131100509));
                    return;
                }
                return;
            }
        }
        if (this.f9369e0) {
            v2(getString(2132018873));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q2() {
        m2();
        n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s2(MeaterCloudAccountResponse meaterCloudAccountResponse) {
        this.f9371g0.c(meaterCloudAccountResponse);
    }

    private void t2(boolean z10) {
        if (z10) {
            this.f9370f0.f8007z0.setVisibility(8);
            this.f9370f0.f7994m0.setVisibility(8);
            this.f9370f0.f7989h0.setVisibility(8);
            this.f9370f0.f7983b0.setVisibility(8);
            this.f9370f0.f7997p0.setVisibility(8);
            this.f9370f0.f7999r0.setVisibility(8);
            return;
        }
        this.f9370f0.f8004w0.setVisibility(8);
        this.f9370f0.f7993l0.setVisibility(8);
        this.f9370f0.S.setVisibility(8);
        this.f9370f0.f7996o0.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u2() {
        e0.INSTANCE.e(this, getString(2132017259), getString(2132018985), false, new e0.AlertPair(getString(2132018720), new j6.e() { // from class: p5.p1
            @Override // j6.e
            public final void a() {
                GoogleFaceBookRegistrationActivity.this.q2();
            }
        }), new e0.AlertPair(getString(2132018306), new j6.e() { // from class: p5.q1
            @Override // j6.e
            public final void a() {
                GoogleFaceBookRegistrationActivity.r2();
            }
        }), null).show();
    }

    private void v2(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        this.f9370f0.R.c(this, arrayList);
    }

    private void x2() {
        final MeaterCloudAccountResponse meaterCloudAccountResponse = new MeaterCloudAccountResponse();
        MEATERCloudAccount k10 = com.apptionlabs.meater_app.app.a.u().k();
        if (k10 == null) {
            return;
        }
        MEATERCloudAccount.AccountType accountType = k10.type;
        if (accountType == MEATERCloudAccount.AccountType.Google) {
            meaterCloudAccountResponse.setGoogle_token(k10.password);
            meaterCloudAccountResponse.setAgree_to_terms_and_conditions(true);
            meaterCloudAccountResponse.setLocale(com.apptionlabs.meater_app.app.a.t());
            meaterCloudAccountResponse.setEmailClubOptIn(this.f9370f0.W.isChecked());
        } else if (accountType == MEATERCloudAccount.AccountType.Facebook) {
            meaterCloudAccountResponse.setFacebook_token(k10.password);
            meaterCloudAccountResponse.setAgree_to_terms_and_conditions(true);
            meaterCloudAccountResponse.setLocale(com.apptionlabs.meater_app.app.a.t());
            meaterCloudAccountResponse.setEmailClubOptIn(this.f9370f0.W.isChecked());
        } else {
            meaterCloudAccountResponse.setEmail(k10.email);
            meaterCloudAccountResponse.setPassword(k10.password);
            meaterCloudAccountResponse.setAgree_to_terms_and_conditions(true);
            meaterCloudAccountResponse.setLocale(com.apptionlabs.meater_app.app.a.t());
            meaterCloudAccountResponse.setEmailClubOptIn(this.f9370f0.W.isChecked());
        }
        this.f9370f0.f7986e0.setVisibility(0);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.s1
            @Override // java.lang.Runnable
            public final void run() {
                GoogleFaceBookRegistrationActivity.this.s2(meaterCloudAccountResponse);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z1(android.view.result.a aVar) {
        if (aVar.b() == -1) {
            setResult(-1, new Intent());
            finish();
        }
    }

    public void onCancelButtonClick(View view) {
        u2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9370f0 = (b6.m) androidx.databinding.g.j(this, 2131558442);
        this.f9371g0 = new v7.b(this);
        if (com.apptionlabs.meater_app.app.a.e()) {
            this.f9370f0.X.setVisibility(0);
            this.f9370f0.Y.setVisibility(0);
        } else {
            this.f9370f0.X.setVisibility(8);
            this.f9370f0.Y.setVisibility(8);
        }
        if (getIntent() != null) {
            this.f9365a0 = getIntent().getExtras().getString("name");
            this.f9366b0 = getIntent().getExtras().getString("email");
            this.f9367c0 = getIntent().getExtras().getString("token");
            this.f9368d0 = getIntent().getExtras().getBoolean("fb_account");
            this.f9373i0 = getIntent().getExtras().getBoolean("add_psw");
            if (this.f9366b0 != null) {
                this.f9370f0.f7987f0.setText(this.f9365a0);
                this.f9370f0.Z.setText(this.f9366b0);
            }
            t2(true);
            this.f9377m0 = false;
            setTitle("");
            new com.apptionlabs.meater_app.views.r(this, x0(), r.c.GUIDE_ACTIVITY);
            l2();
            getOnBackPressedDispatcher().h(this, this.f9374j0);
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131689482, menu);
        TextView textView = (TextView) menu.findItem(2131362859).getActionView();
        textView.setText("");
        textView.setOnClickListener(new View.OnClickListener() { // from class: p5.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleFaceBookRegistrationActivity.this.p2(view);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f9376l0) {
            m2();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f9369e0 = false;
    }

    public void onPrivacyLinkClick(View view) {
        w2("Privacy Policy", "file:///android_asset/privacy-policy.html");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f9369e0 = true;
    }

    public void onSubmitClicked(View view) {
        if (t.f12516a.b()) {
            if (this.f9370f0.V.isChecked()) {
                x2();
                return;
            } else {
                this.f9370f0.T.setBackgroundColor(l0.h(2131100509));
                v2(getString(2132018508));
                return;
            }
        }
        if (this.f9369e0) {
            v2(getString(2132018873));
        }
    }

    public void onTermsConditionClick(View view) {
        w2("Terms and Conditions", "file:///android_asset/terms-and-conditions.html");
    }

    @Override // j6.r
    public void u() {
        v2(getString(2132017459));
    }

    void w2(String str, String str2) {
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        startActivity(intent);
    }

    @Override // j6.r
    public void x(s<MeaterCloudAccountResponse> sVar, MeaterCloudAccountResponse meaterCloudAccountResponse) {
        this.f9370f0.f7986e0.setVisibility(8);
        if (sVar.f()) {
            this.f9376l0 = true;
            Intent intent = new Intent();
            intent.putExtra("error", false);
            setResult(-1, intent);
            finish();
            return;
        }
        v2(MeaterCloudAccountResponse.parseError(sVar).message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r2() {
    }
}
