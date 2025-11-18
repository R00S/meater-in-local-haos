package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@zzard
/* loaded from: classes2.dex */
public final class zzaqx implements zzarb {

    /* renamed from: a */
    private static final Object f22283a = new Object();

    /* renamed from: b */
    @VisibleForTesting
    private static zzarb f22284b;

    /* renamed from: c */
    @VisibleForTesting
    private static zzarb f22285c;

    /* renamed from: d */
    private final Object f22286d;

    /* renamed from: e */
    private final Context f22287e;

    /* renamed from: f */
    private final WeakHashMap<Thread, Boolean> f22288f;

    /* renamed from: g */
    private final ExecutorService f22289g;

    /* renamed from: h */
    private final zzbai f22290h;

    private zzaqx(Context context) {
        this(context, zzbai.m17359y());
    }

    @VisibleForTesting
    /* renamed from: c */
    private final Uri.Builder m16881c(String str, String str2, String str3, int i2) {
        boolean zM14672f;
        String packageName;
        try {
            zM14672f = Wrappers.m14674a(this.f22287e).m14672f();
        } catch (Throwable th) {
            zzbad.m17347c("Error fetching instant app info", th);
            zM14672f = false;
        }
        try {
            packageName = this.f22287e.getPackageName();
        } catch (Throwable unused) {
            zzbad.m17353i("Cannot obtain package name, proceeding.");
            packageName = "unknown";
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zM14672f)).appendQueryParameter(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str4 = Build.MANUFACTURER;
        String string = Build.MODEL;
        if (!string.startsWith(str4)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + string.length());
            sb.append(str4);
            sb.append(" ");
            sb.append(string);
            string = sb.toString();
        }
        return builderAppendQueryParameter.appendQueryParameter("device", string).appendQueryParameter("js", this.f22290h.f22750f).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", zzacu.m16425c())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "248613007").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", zzyt.m20849f()).appendQueryParameter("sampling_rate", Integer.toString(i2)).appendQueryParameter("pb_tm", String.valueOf(zzyt.m20848e().m16421c(zzacu.f21669M4)));
    }

    /* renamed from: e */
    public static zzarb m16882e(Context context, zzbai zzbaiVar) {
        synchronized (f22283a) {
            if (f22285c == null) {
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21820l)).booleanValue()) {
                    zzaqx zzaqxVar = new zzaqx(context, zzbaiVar);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (zzaqxVar.f22286d) {
                            zzaqxVar.f22288f.put(thread, Boolean.TRUE);
                        }
                        thread.setUncaughtExceptionHandler(new C7029p3(zzaqxVar, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new C6992o3(zzaqxVar, Thread.getDefaultUncaughtExceptionHandler()));
                    f22285c = zzaqxVar;
                } else {
                    f22285c = new zzarc();
                }
            }
        }
        return f22285c;
    }

    /* renamed from: f */
    public static zzarb m16883f(Context context) {
        synchronized (f22283a) {
            if (f22284b == null) {
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21820l)).booleanValue()) {
                    f22284b = new zzaqx(context);
                } else {
                    f22284b = new zzarc();
                }
            }
        }
        return f22284b;
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    /* renamed from: a */
    public final void mo16884a(Throwable th, String str) {
        mo16885b(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    /* renamed from: b */
    public final void mo16885b(Throwable th, String str, float f2) {
        if (zzazt.m17313r(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        zzdmb.m19579a(th, new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        int i2 = 0;
        boolean z = Math.random() < ((double) f2);
        int i3 = f2 > 0.0f ? (int) (1.0f / f2) : 1;
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(m16881c(name, string, str, i3).toString());
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                this.f22289g.submit(new RunnableC7066q3(this, new zzbah(), (String) obj));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void m16886d(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L3c
            r1 = r11
            r2 = 0
            r3 = 0
        L7:
            if (r1 == 0) goto L37
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = 0
        Lf:
            if (r6 >= r5) goto L32
            r7 = r4[r6]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.zzazt.m17316u(r8)
            if (r8 == 0) goto L1e
            r2 = 1
        L1e:
            java.lang.Class<com.google.android.gms.internal.ads.zzaqx> r8 = com.google.android.gms.internal.ads.zzaqx.class
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L2f
            r3 = 1
        L2f:
            int r6 = r6 + 1
            goto Lf
        L32:
            java.lang.Throwable r1 = r1.getCause()
            goto L7
        L37:
            if (r2 == 0) goto L3c
            if (r3 != 0) goto L3c
            goto L3d
        L3c:
            r10 = 0
        L3d:
            if (r10 == 0) goto L46
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.mo16885b(r11, r0, r10)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqx.m16886d(java.lang.Thread, java.lang.Throwable):void");
    }

    private zzaqx(Context context, zzbai zzbaiVar) {
        this.f22286d = new Object();
        this.f22288f = new WeakHashMap<>();
        this.f22289g = Executors.newCachedThreadPool();
        this.f22287e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f22290h = zzbaiVar;
    }
}
