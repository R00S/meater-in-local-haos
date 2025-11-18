package R4;

import L4.x1;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

/* compiled from: WebFragment.java */
/* loaded from: classes2.dex */
public class Y0 extends Fragment {

    /* renamed from: G0, reason: collision with root package name */
    private b f14919G0;

    /* renamed from: H0, reason: collision with root package name */
    x1 f14920H0;

    /* renamed from: I0, reason: collision with root package name */
    private FrameLayout f14921I0;

    /* compiled from: WebFragment.java */
    public interface b {
        void A(Y0 y02, String str);

        void F();
    }

    private void A2(String str) throws IOException {
        try {
            String[] strArrSplit = str.split("#");
            if (strArrSplit.length == 0) {
                return;
            }
            InputStream inputStreamOpen = T().getAssets().open(strArrSplit[0].replace("file:///android_asset/", "").trim());
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            this.f14920H0.f10775c.loadDataWithBaseURL(str, new String(bArr).replace("{VERSION}", "4.6.3").replace("{YEAR}", String.valueOf(Calendar.getInstance().get(1))), "text/html", "UTF-8", null);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    private void z2(View view) throws IOException {
        A2(X().getString("url"));
        WebSettings settings = this.f14920H0.f10775c.getSettings();
        settings.setBuiltInZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        this.f14920H0.f10775c.setWebViewClient(new a());
        this.f14921I0.addView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void X0(Context context) {
        super.X0(context);
        if (n0() instanceof b) {
            this.f14919G0 = (b) n0();
        } else if (context instanceof b) {
            this.f14919G0 = (b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IOException {
        FrameLayout frameLayout = new FrameLayout(Z());
        this.f14921I0 = frameLayout;
        x1 x1VarD = x1.d(layoutInflater, frameLayout, false);
        this.f14920H0 = x1VarD;
        z2(x1VarD.b());
        return this.f14921I0;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws IOException {
        super.onConfigurationChanged(configuration);
        if (T() == null) {
            return;
        }
        this.f14921I0.removeAllViews();
        x1 x1VarD = x1.d((LayoutInflater) T().getSystemService("layout_inflater"), null, false);
        this.f14920H0 = x1VarD;
        z2(x1VarD.b());
    }

    public boolean y2() {
        return this.f14920H0.f10775c.canGoBack();
    }

    /* compiled from: WebFragment.java */
    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (Y0.this.T() != null) {
                Y0.this.f14919G0.F();
                String title = Y0.this.f14920H0.f10775c.getTitle();
                if (x4.g.t().n1()) {
                    Y0.this.f14920H0.f10775c.loadUrl("javascript:setTemperatureScale('fahrenheit')");
                } else {
                    Y0.this.f14920H0.f10775c.loadUrl("javascript:setTemperatureScale('celsius')");
                }
                Y0.this.T().setTitle(title);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Y0.this.f14919G0.A(Y0.this, Uri.parse(str).toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Y0.this.f14919G0.A(Y0.this, webResourceRequest.getUrl().toString());
            return true;
        }
    }
}
