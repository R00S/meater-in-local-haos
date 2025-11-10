package com.apptionlabs.meater_app.activities;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import b6.v9;
import com.apptionlabs.meater_app.activities.WebViewActivity;
import com.apptionlabs.meater_app.cloud.requests.SafetyInfoRequest;
import com.apptionlabs.meater_app.views.e0;
import com.google.gson.Gson;
import f8.l0;
import f8.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import lm.b;
import v5.l;

/* loaded from: /tmp/meat/meat/classes.dex */
public class WebViewActivity extends j {

    /* renamed from: h0, reason: collision with root package name */
    private static final String[] f9532h0 = {"en", "de"};

    /* renamed from: a0, reason: collision with root package name */
    v9 f9533a0;

    /* renamed from: c0, reason: collision with root package name */
    private String f9535c0;

    /* renamed from: d0, reason: collision with root package name */
    private String f9536d0;

    /* renamed from: b0, reason: collision with root package name */
    boolean f9534b0 = false;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f9537e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    android.view.o f9538f0 = new b(true);

    /* renamed from: g0, reason: collision with root package name */
    private boolean f9539g0 = false;

    /* loaded from: /tmp/meat/meat/classes.dex */
    class b extends android.view.o {
        b(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            if (WebViewActivity.this.f9533a0.R.canGoBack()) {
                WebViewActivity.this.f9533a0.R.goBack();
            } else {
                WebViewActivity.this.finish();
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum c {
        BODY,
        IS_POST_METHOD,
        OFFER_REQUEST,
        SAFETY_INSTRUCTION,
        URL_ONLY
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A2() {
        if (isFinishing()) {
            return;
        }
        e0.INSTANCE.e(this, getString(2132017899), getString(2132017459), false, new e0.AlertPair(getString(2132018850), new j6.e() { // from class: p5.q4
            @Override // j6.e
            public final void a() {
                WebViewActivity.this.y2();
            }
        }), new e0.AlertPair(getString(2132017405), new j6.e() { // from class: p5.r4
            @Override // j6.e
            public final void a() {
                WebViewActivity.this.finish();
            }
        }), null).show();
    }

    private void B2() {
        String str;
        try {
            this.f9539g0 = true;
            String z22 = z2();
            String t10 = com.apptionlabs.meater_app.app.a.t();
            if (t10.length() < 2) {
                str = "";
            } else {
                str = t10.substring(0, 2);
            }
            String str2 = ("file:///android_asset/" + q2(str) + "/") + z22 + ".html";
            String[] split = str2.split("#");
            if (split.length == 0) {
                return;
            }
            InputStream open = getAssets().open(split[0].replace("file:///android_asset/", "").trim());
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            this.f9533a0.R.loadDataWithBaseURL(str2, new String(bArr).replace("{VERSION}", "4.3.1").replace("{YEAR}", String.valueOf(Calendar.getInstance().get(1))), "text/html", "UTF-8", null);
        } catch (IOException e10) {
            A2();
            e10.printStackTrace();
        }
    }

    public static void C2(Activity activity, String str, String str2) {
        D2(activity, str, str2, null, null, null, null);
    }

    public static void D2(Activity activity, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3) {
        Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
        if (str != null) {
            intent.putExtra("title", str);
        }
        if (str2 != null) {
            intent.putExtra("url", str2);
        }
        if (bool != null) {
            intent.putExtra("isNewsItem", bool);
        }
        if (bool3 != null) {
            intent.putExtra(c.OFFER_REQUEST.name(), bool3);
        }
        if (str3 != null) {
            intent.putExtra(c.IS_POST_METHOD.name(), true);
            intent.putExtra(c.BODY.name(), str3);
        }
        if (bool2 != null && bool2.booleanValue()) {
            activity.startActivityForResult(intent, lm.a.HELP_SCREEN.i());
        } else {
            activity.startActivity(intent);
        }
    }

    private void n2() {
        if (!t.f12516a.b()) {
            B2();
            return;
        }
        this.f9533a0.Q.setVisibility(0);
        final y5.i iVar = new y5.i();
        final String t10 = new Gson().t(new SafetyInfoRequest());
        iVar.a(this.f9535c0, t10, new y5.h() { // from class: p5.k4
            @Override // y5.h
            public final void a(String str) {
                WebViewActivity.this.s2(iVar, t10, str);
            }
        });
    }

    private void o2() {
        this.f9533a0.Q.setVisibility(0);
        final y5.i iVar = new y5.i();
        iVar.a(this.f9535c0, this.f9536d0, new y5.h() { // from class: p5.n4
            @Override // y5.h
            public final void a(String str) {
                WebViewActivity.this.u2(iVar, str);
            }
        });
    }

    private void p2() {
        this.f9533a0.Q.setVisibility(0);
        final y5.i iVar = new y5.i();
        iVar.a(this.f9535c0, this.f9536d0, new y5.h() { // from class: p5.m4
            @Override // y5.h
            public final void a(String str) {
                WebViewActivity.this.w2(iVar, str);
            }
        });
    }

    private String q2(String str) {
        for (String str2 : f9532h0) {
            if (str2.equals(str)) {
                return str;
            }
        }
        return f9532h0[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r2(String str) {
        if (!isFinishing()) {
            this.f9533a0.Q.setVisibility(8);
            if (str != null) {
                this.f9533a0.R.loadDataWithBaseURL("https://meater.com", str, "text/html", null, null);
            } else {
                B2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s2(y5.i iVar, String str, String str2) {
        if (!isFinishing()) {
            if (str2 != null) {
                this.f9533a0.Q.setVisibility(8);
                this.f9533a0.R.loadDataWithBaseURL("https://meater.com", str2, "text/html", null, null);
            } else {
                iVar.a(this.f9535c0, str, new y5.h() { // from class: p5.s4
                    @Override // y5.h
                    public final void a(String str3) {
                        WebViewActivity.this.r2(str3);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t2(String str) {
        if (!isFinishing()) {
            this.f9533a0.Q.setVisibility(8);
            if (str != null) {
                this.f9533a0.R.loadDataWithBaseURL(this.f9535c0, str, "text/html", null, null);
            } else {
                A2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u2(y5.i iVar, String str) {
        if (!isFinishing()) {
            if (str != null) {
                this.f9533a0.Q.setVisibility(8);
                this.f9533a0.R.loadDataWithBaseURL(this.f9535c0, str, "text/html", null, null);
            } else {
                iVar.a(this.f9535c0, this.f9536d0, new y5.h() { // from class: p5.o4
                    @Override // y5.h
                    public final void a(String str2) {
                        WebViewActivity.this.t2(str2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v2(String str) {
        if (!isFinishing()) {
            this.f9533a0.Q.setVisibility(8);
            if (str != null) {
                this.f9533a0.R.loadDataWithBaseURL("https://support.meater.com/contact-us", str, "text/html", null, null);
            } else {
                A2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w2(y5.i iVar, String str) {
        if (!isFinishing()) {
            if (str != null) {
                this.f9533a0.Q.setVisibility(8);
                this.f9533a0.R.loadDataWithBaseURL("https://support.meater.com/contact-us", str, "text/html", null, null);
            } else {
                iVar.a(this.f9535c0, this.f9536d0, new y5.h() { // from class: p5.p4
                    @Override // y5.h
                    public final void a(String str2) {
                        WebViewActivity.this.v2(str2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x2(View view) {
        setResult(-1, new Intent());
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y2() {
        if (getIntent().getBooleanExtra(c.URL_ONLY.name(), false)) {
            this.f9533a0.R.loadUrl(this.f9535c0);
        } else if (this.f9537e0) {
            o2();
        } else {
            p2();
        }
    }

    private String z2() {
        if (this.f9535c0.equals("https://meater.com/safety-info/meater-block?download=false")) {
            return "safety-information-meater-block";
        }
        if (this.f9535c0.equals("https://meater.com/safety-info/meater-plus?download=false")) {
            return "safety-information-meater-plus";
        }
        if (this.f9535c0.equals("https://meater.com/safety-info/meater-se?download=false")) {
            return "safety-information-meater-plus-se";
        }
        if (this.f9535c0.equals("https://meater.com/new-safety-info/meater-plus2?download=false")) {
            return "safety-information-meater-plus2";
        }
        return "safety-information-meater";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j
    public void a2(l.f fVar, long j10) {
        String str = this.f9535c0;
        if (str != null && str.contains(i6.c.S.getPage())) {
            super.a2(fVar, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v9 v9Var = (v9) androidx.databinding.g.j(this, 2131558728);
        this.f9533a0 = v9Var;
        v9Var.R.getSettings().setJavaScriptEnabled(true);
        this.f9533a0.Q.setVisibility(8);
        this.f9534b0 = getIntent().getBooleanExtra("isNewsItem", false);
        this.f9535c0 = getIntent().getStringExtra("url");
        this.f9536d0 = getIntent().getStringExtra(c.BODY.name());
        if (getIntent().getBooleanExtra(c.IS_POST_METHOD.name(), false)) {
            boolean booleanExtra = getIntent().getBooleanExtra(c.OFFER_REQUEST.name(), false);
            this.f9537e0 = booleanExtra;
            if (booleanExtra) {
                o2();
            } else {
                p2();
            }
        } else if (getIntent().getBooleanExtra(c.SAFETY_INSTRUCTION.name(), false)) {
            n2();
        } else {
            this.f9533a0.R.loadUrl(this.f9535c0);
        }
        setTitle(getIntent().getStringExtra("title"));
        WebSettings settings = this.f9533a0.R.getSettings();
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        this.f9533a0.R.setWebViewClient(new a());
        getOnBackPressedDispatcher().h(this, this.f9538f0);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689472, menu);
        View inflate = getLayoutInflater().inflate(2131558434, (ViewGroup) null);
        menu.findItem(2131361863).setActionView(inflate);
        TextView textView = (TextView) inflate.findViewById(2131361903);
        textView.setText(getString(2132018166));
        textView.setOnClickListener(new View.OnClickListener() { // from class: p5.l4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewActivity.this.x2(view);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        String str;
        super.onResume();
        if (this.f9534b0) {
            str = "MEATERNewsActivity";
        } else {
            str = this.f9535c0;
        }
        lm.b.m(this, str);
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            int P;
            if (str.contains("newsletter-thanks")) {
                com.apptionlabs.meater_app.app.a.u().B1(true);
            }
            String title = WebViewActivity.this.f9533a0.R.getTitle();
            if (com.apptionlabs.meater_app.app.a.u().T1()) {
                WebViewActivity.this.f9533a0.R.loadUrl("javascript:setTemperatureScale('fahrenheit')");
            } else {
                WebViewActivity.this.f9533a0.R.loadUrl("javascript:setTemperatureScale('celsius')");
            }
            WebViewActivity.this.setTitle(title);
            if (WebViewActivity.this.getIntent().getBooleanExtra(c.SAFETY_INSTRUCTION.name(), false)) {
                if (WebViewActivity.this.f9539g0) {
                    P = f8.l.b();
                } else {
                    P = com.apptionlabs.meater_app.app.a.u().P();
                }
                if (com.apptionlabs.meater_app.app.a.u().Q() <= P) {
                    com.apptionlabs.meater_app.app.a.u().z1(P);
                }
                lm.b.g(b.EnumC0292b.D1.title, b.a.f17298r.title, "" + P);
                lm.b.d("safety_compliance_viewed", "" + P);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            if (WebViewActivity.this.getIntent().getBooleanExtra(c.URL_ONLY.name(), false)) {
                WebViewActivity.this.A2();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (WebViewActivity.this.f9534b0) {
                l0.H(WebViewActivity.this, Uri.parse(str).toString());
                WebViewActivity.this.finish();
                return true;
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }
}
