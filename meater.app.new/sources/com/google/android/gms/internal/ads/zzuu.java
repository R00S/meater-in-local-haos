package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.root.execution.Command;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
@TargetApi(14)
/* loaded from: classes2.dex */
public final class zzuu extends Thread {

    /* renamed from: f */
    private boolean f27169f;

    /* renamed from: g */
    private boolean f27170g;

    /* renamed from: h */
    private boolean f27171h;

    /* renamed from: i */
    private final Object f27172i;

    /* renamed from: j */
    private final zzup f27173j;

    /* renamed from: k */
    private final int f27174k;

    /* renamed from: l */
    private final int f27175l;

    /* renamed from: m */
    private final int f27176m;

    /* renamed from: n */
    private final int f27177n;

    /* renamed from: o */
    private final int f27178o;

    /* renamed from: p */
    private final int f27179p;

    /* renamed from: q */
    private final int f27180q;

    /* renamed from: r */
    private final int f27181r;

    /* renamed from: s */
    private final String f27182s;

    /* renamed from: t */
    private final boolean f27183t;

    /* renamed from: u */
    private final boolean f27184u;

    /* renamed from: v */
    private final boolean f27185v;

    public zzuu() {
        this(new zzup());
    }

    @VisibleForTesting
    /* renamed from: b */
    private final r40 m20631b(View view, zzuo zzuoVar) {
        boolean z;
        if (view == null) {
            return new r40(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new r40(this, 0, 0);
            }
            zzuoVar.m20611d(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new r40(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzbgz)) {
            WebView webView = (WebView) view;
            if (PlatformVersion.m14642f()) {
                zzuoVar.m20619n();
                webView.post(new p40(this, zzuoVar, webView, globalVisibleRect));
                z = true;
            } else {
                z = false;
            }
            return z ? new r40(this, 0, 1) : new r40(this, 0, 0);
        }
        if (!(view instanceof ViewGroup)) {
            return new r40(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            r40 r40VarM20631b = m20631b(viewGroup.getChildAt(i4), zzuoVar);
            i2 += r40VarM20631b.f20433a;
            i3 += r40VarM20631b.f20434b;
        }
        return new r40(this, i2, i3);
    }

    @VisibleForTesting
    /* renamed from: f */
    private static boolean m20632f() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Context contextM20628b = zzk.zzlj().m20628b();
            if (contextM20628b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) contextM20628b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) contextM20628b.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) contextM20628b.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            zzk.zzlk().m17052e(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    /* renamed from: h */
    private final void m20633h() {
        synchronized (this.f27172i) {
            this.f27170g = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            zzbad.m17349e(sb.toString());
        }
    }

    /* renamed from: a */
    public final void m20634a() {
        synchronized (this.f27172i) {
            this.f27170g = false;
            this.f27172i.notifyAll();
            zzbad.m17349e("ContentFetchThread: wakeup");
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    final void m20635c(zzuo zzuoVar, WebView webView, String str, boolean z) {
        zzuoVar.m20618m();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString(Command.CommandHandler.TEXT);
                if (this.f27183t || TextUtils.isEmpty(webView.getTitle())) {
                    zzuoVar.m20610c(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    zzuoVar.m20610c(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzuoVar.m20613h()) {
                this.f27173j.m20624b(zzuoVar);
            }
        } catch (JSONException unused) {
            zzbad.m17349e("Json string may be malformed.");
        } catch (Throwable th) {
            zzbad.m17346b("Failed to get webview content.", th);
            zzk.zzlk().m17052e(th, "ContentFetchTask.processWebViewContent");
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    final void m20636d(View view) {
        try {
            zzuo zzuoVar = new zzuo(this.f27175l, this.f27176m, this.f27177n, this.f27178o, this.f27179p, this.f27180q, this.f27181r, this.f27184u);
            Context contextM20628b = zzk.zzlj().m20628b();
            if (contextM20628b != null && !TextUtils.isEmpty(this.f27182s)) {
                String str = (String) view.getTag(contextM20628b.getResources().getIdentifier((String) zzyt.m20848e().m16421c(zzacu.f21851q0), DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, contextM20628b.getPackageName()));
                if (str != null && str.equals(this.f27182s)) {
                    return;
                }
            }
            r40 r40VarM20631b = m20631b(view, zzuoVar);
            zzuoVar.m20621p();
            if (r40VarM20631b.f20433a == 0 && r40VarM20631b.f20434b == 0) {
                return;
            }
            if (r40VarM20631b.f20434b == 0 && zzuoVar.m20622q() == 0) {
                return;
            }
            if (r40VarM20631b.f20434b == 0 && this.f27173j.m20623a(zzuoVar)) {
                return;
            }
            this.f27173j.m20625c(zzuoVar);
        } catch (Exception e2) {
            zzbad.m17347c("Exception in fetchContentOnUIThread", e2);
            zzk.zzlk().m17052e(e2, "ContentFetchTask.fetchContent");
        }
    }

    /* renamed from: e */
    public final void m20637e() {
        synchronized (this.f27172i) {
            if (this.f27169f) {
                zzbad.m17349e("Content hash thread already started, quiting...");
            } else {
                this.f27169f = true;
                start();
            }
        }
    }

    /* renamed from: g */
    public final zzuo m20638g() {
        return this.f27173j.m20626d(this.f27185v);
    }

    /* renamed from: i */
    public final boolean m20639i() {
        return this.f27170g;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        while (true) {
            try {
                if (m20632f()) {
                    Activity activityM20627a = zzk.zzlj().m20627a();
                    if (activityM20627a == null) {
                        zzbad.m17349e("ContentFetchThread: no activity. Sleeping.");
                        m20633h();
                    } else {
                        View viewFindViewById = null;
                        try {
                            if (activityM20627a.getWindow() != null && activityM20627a.getWindow().getDecorView() != null) {
                                viewFindViewById = activityM20627a.getWindow().getDecorView().findViewById(R.id.content);
                            }
                        } catch (Exception e2) {
                            zzk.zzlk().m17052e(e2, "ContentFetchTask.extractContent");
                            zzbad.m17349e("Failed getting root view of activity. Content not extracted.");
                        }
                        if (viewFindViewById != null) {
                            viewFindViewById.post(new o40(this, viewFindViewById));
                        }
                    }
                } else {
                    zzbad.m17349e("ContentFetchTask: sleeping");
                    m20633h();
                }
                Thread.sleep(this.f27174k * 1000);
            } catch (InterruptedException e3) {
                zzbad.m17347c("Error in ContentFetchTask", e3);
            } catch (Exception e4) {
                zzbad.m17347c("Error in ContentFetchTask", e4);
                zzk.zzlk().m17052e(e4, "ContentFetchTask.run");
            }
            synchronized (this.f27172i) {
                while (this.f27170g) {
                    try {
                        zzbad.m17349e("ContentFetchTask: waiting");
                        this.f27172i.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    @VisibleForTesting
    private zzuu(zzup zzupVar) {
        this.f27169f = false;
        this.f27170g = false;
        this.f27171h = false;
        this.f27173j = zzupVar;
        this.f27172i = new Object();
        this.f27175l = ((Integer) zzyt.m20848e().m16421c(zzacu.f21803i0)).intValue();
        this.f27176m = ((Integer) zzyt.m20848e().m16421c(zzacu.f21809j0)).intValue();
        this.f27177n = ((Integer) zzyt.m20848e().m16421c(zzacu.f21815k0)).intValue();
        this.f27178o = ((Integer) zzyt.m20848e().m16421c(zzacu.f21821l0)).intValue();
        this.f27179p = ((Integer) zzyt.m20848e().m16421c(zzacu.f21833n0)).intValue();
        this.f27180q = ((Integer) zzyt.m20848e().m16421c(zzacu.f21839o0)).intValue();
        this.f27181r = ((Integer) zzyt.m20848e().m16421c(zzacu.f21845p0)).intValue();
        this.f27174k = ((Integer) zzyt.m20848e().m16421c(zzacu.f21827m0)).intValue();
        this.f27182s = (String) zzyt.m20848e().m16421c(zzacu.f21857r0);
        this.f27183t = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21863s0)).booleanValue();
        this.f27184u = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21887w0)).booleanValue();
        this.f27185v = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21893x0)).booleanValue();
        setName("ContentFetchTask");
    }
}
