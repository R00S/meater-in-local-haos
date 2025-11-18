package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public class zzbjb extends C7111rb implements zzbje {

    /* renamed from: f */
    private final zzbiz f23104f;

    /* renamed from: g */
    private boolean f23105g;

    /* renamed from: h */
    private boolean f23106h;

    public zzbjb(Context context, zzbiz zzbizVar) {
        super(context);
        zzk.zzlk().m17058o();
        this.f23104f = zzbizVar;
        super.setWebViewClient(zzbizVar);
    }

    /* renamed from: A0 */
    private final synchronized void m17769A0() {
        if (!this.f23106h) {
            this.f23106h = true;
            zzk.zzlk().m17059p();
        }
    }

    @Override // com.google.android.gms.internal.ads.C7111rb, android.webkit.WebView
    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    @Override // android.webkit.WebView
    public synchronized void destroy() {
        if (this.f23105g) {
            return;
        }
        this.f23105g = true;
        this.f23104f.m17768q(this);
        mo15686z0(false);
        zzawz.m17082m("Initiating WebView self destruct sequence in 3...");
        zzawz.m17082m("Loading blank page in WebView, 2...");
        try {
            super.loadUrl("about:blank");
        } catch (UnsatisfiedLinkError e2) {
            zzk.zzlk().m17052e(e2, "AdWebViewImpl.loadUrlUnsafe");
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!m17770l()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzbad.m17353i("#004 The webview is destroyed. Ignoring action.");
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!m17770l()) {
                    mo15686z0(true);
                }
                m17769A0();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.C7111rb, com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzakg
    /* renamed from: k */
    public /* bridge */ /* synthetic */ void mo14917k(String str) {
        super.mo14917k(str);
    }

    /* renamed from: l */
    public final synchronized boolean m17770l() {
        return this.f23105g;
    }

    @Override // android.webkit.WebView
    public synchronized void loadData(String str, String str2, String str3) {
        if (m17770l()) {
            zzbad.m17353i("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView
    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (m17770l()) {
            zzbad.m17353i("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.google.android.gms.internal.ads.C7111rb, android.webkit.WebView
    public synchronized void loadUrl(String str) {
        if (m17770l()) {
            zzbad.m17353i("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: n0 */
    public synchronized void mo14924n0() {
        zzawz.m17082m("Destroying WebView!");
        m17769A0();
        zzbbm.f22757a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.tb

            /* renamed from: f */
            private final zzbjb f20564f;

            {
                this.f20564f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20564f.m17772y0();
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected void onDraw(Canvas canvas) {
        if (m17770l()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public void onPause() {
        if (m17770l()) {
            return;
        }
        super.onPause();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbgz
    public void onResume() {
        if (m17770l()) {
            return;
        }
        super.onResume();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !m17770l() && super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (m17770l()) {
            return;
        }
        super.stopLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzbje
    /* renamed from: u */
    public final synchronized void mo17771u(zzbja zzbjaVar) {
        zzawz.m17082m("Blank page loaded, 1...");
        mo14924n0();
    }

    /* renamed from: y0 */
    final /* synthetic */ void m17772y0() {
        super.destroy();
    }

    /* renamed from: z0 */
    protected void mo15686z0(boolean z) {
    }
}
