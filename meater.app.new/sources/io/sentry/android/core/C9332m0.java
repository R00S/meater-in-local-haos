package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C9498k3;
import io.sentry.C9512m3;
import io.sentry.C9519n3;
import io.sentry.C9570q1;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9426e2;
import io.sentry.InterfaceC9433f2;
import io.sentry.InterfaceC9658v1;
import io.sentry.android.core.C9330l0;
import io.sentry.android.core.internal.util.C9316m;
import io.sentry.android.core.internal.util.C9323t;
import io.sentry.util.C9646q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* compiled from: AndroidTransactionProfiler.java */
/* renamed from: io.sentry.android.core.m0 */
/* loaded from: classes2.dex */
final class C9332m0 implements InterfaceC9433f2 {

    /* renamed from: a */
    private final Context f36063a;

    /* renamed from: b */
    private final SentryAndroidOptions f36064b;

    /* renamed from: c */
    private final InterfaceC9658v1 f36065c;

    /* renamed from: d */
    private final C9344s0 f36066d;

    /* renamed from: e */
    private boolean f36067e;

    /* renamed from: f */
    private int f36068f;

    /* renamed from: g */
    private final C9323t f36069g;

    /* renamed from: h */
    private C9519n3 f36070h;

    /* renamed from: i */
    private InterfaceC9426e2 f36071i;

    /* renamed from: j */
    private C9330l0 f36072j;

    /* renamed from: k */
    private long f36073k;

    /* renamed from: l */
    private long f36074l;

    public C9332m0(Context context, SentryAndroidOptions sentryAndroidOptions, C9344s0 c9344s0, C9323t c9323t) {
        this(context, sentryAndroidOptions, c9344s0, c9323t, C9570q1.m31548a());
    }

    /* renamed from: c */
    private ActivityManager.MemoryInfo m30345c() {
        try {
            ActivityManager activityManager = (ActivityManager) this.f36063a.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            this.f36064b.getLogger().mo30214c(EnumC9587s4.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            this.f36064b.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    /* renamed from: d */
    private void m30346d() {
        if (this.f36067e) {
            return;
        }
        this.f36067e = true;
        String profilingTracesDirPath = this.f36064b.getProfilingTracesDirPath();
        if (!this.f36064b.isProfilingEnabled()) {
            this.f36064b.getLogger().mo30214c(EnumC9587s4.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        if (profilingTracesDirPath == null) {
            this.f36064b.getLogger().mo30214c(EnumC9587s4.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int profilingTracesHz = this.f36064b.getProfilingTracesHz();
        if (profilingTracesHz <= 0) {
            this.f36064b.getLogger().mo30214c(EnumC9587s4.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(profilingTracesHz));
        } else {
            this.f36072j = new C9330l0(profilingTracesDirPath, ((int) TimeUnit.SECONDS.toMicros(1L)) / profilingTracesHz, this.f36069g, this.f36064b.getExecutorService(), this.f36064b.getLogger(), this.f36066d);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    private boolean m30348f(InterfaceC9426e2 interfaceC9426e2) {
        C9330l0.c cVarM30344j;
        C9330l0 c9330l0 = this.f36072j;
        if (c9330l0 == null || (cVarM30344j = c9330l0.m30344j()) == null) {
            return false;
        }
        long j2 = cVarM30344j.f36060a;
        this.f36073k = j2;
        this.f36074l = cVarM30344j.f36061b;
        this.f36071i = interfaceC9426e2;
        this.f36070h = new C9519n3(interfaceC9426e2, Long.valueOf(j2), Long.valueOf(this.f36074l));
        return true;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    private synchronized C9512m3 m30349g(InterfaceC9426e2 interfaceC9426e2, boolean z, List<C9498k3> list) {
        if (this.f36072j == null) {
            return null;
        }
        if (this.f36066d.m30406d() < 21) {
            return null;
        }
        C9519n3 c9519n3 = this.f36070h;
        if (c9519n3 != null && c9519n3.m31105h().equals(interfaceC9426e2.mo30525k().toString())) {
            int i2 = this.f36068f;
            if (i2 > 0) {
                this.f36068f = i2 - 1;
            }
            this.f36064b.getLogger().mo30214c(EnumC9587s4.DEBUG, "Transaction %s (%s) finished.", interfaceC9426e2.getName(), interfaceC9426e2.mo30527m().m30803k().toString());
            if (this.f36068f != 0) {
                C9519n3 c9519n32 = this.f36070h;
                if (c9519n32 != null) {
                    c9519n32.m31106i(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.f36073k), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.f36074l));
                }
                return null;
            }
            C9330l0.b bVarM30342f = this.f36072j.m30342f(false, list);
            if (bVarM30342f == null) {
                return null;
            }
            long j2 = bVarM30342f.f36055a - this.f36073k;
            ArrayList arrayList = new ArrayList(1);
            C9519n3 c9519n33 = this.f36070h;
            if (c9519n33 != null) {
                arrayList.add(c9519n33);
            }
            this.f36070h = null;
            this.f36068f = 0;
            this.f36071i = null;
            ActivityManager.MemoryInfo memoryInfoM30345c = m30345c();
            String string = memoryInfoM30345c != null ? Long.toString(memoryInfoM30345c.totalMem) : "0";
            String[] strArr = Build.SUPPORTED_ABIS;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C9519n3) it.next()).m31106i(Long.valueOf(bVarM30342f.f36055a), Long.valueOf(this.f36073k), Long.valueOf(bVarM30342f.f36056b), Long.valueOf(this.f36074l));
            }
            return new C9512m3(bVarM30342f.f36057c, arrayList, interfaceC9426e2, Long.toString(j2), this.f36066d.m30406d(), (strArr == null || strArr.length <= 0) ? HttpUrl.FRAGMENT_ENCODE_SET : strArr[0], new Callable() { // from class: io.sentry.android.core.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C9316m.m30288a().m30290c();
                }
            }, this.f36066d.m30404b(), this.f36066d.m30405c(), this.f36066d.m30407e(), this.f36066d.m30408f(), string, this.f36064b.getProguardUuid(), this.f36064b.getRelease(), this.f36064b.getEnvironment(), (bVarM30342f.f36059e || z) ? "timeout" : "normal", bVarM30342f.f36058d);
        }
        this.f36064b.getLogger().mo30214c(EnumC9587s4.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", interfaceC9426e2.getName(), interfaceC9426e2.mo30527m().m30803k().toString());
        return null;
    }

    @Override // io.sentry.InterfaceC9433f2
    /* renamed from: a */
    public synchronized C9512m3 mo30350a(InterfaceC9426e2 interfaceC9426e2, List<C9498k3> list) {
        return m30349g(interfaceC9426e2, false, list);
    }

    @Override // io.sentry.InterfaceC9433f2
    /* renamed from: b */
    public synchronized void mo30351b(InterfaceC9426e2 interfaceC9426e2) {
        if (this.f36066d.m30406d() < 21) {
            return;
        }
        m30346d();
        int i2 = this.f36068f + 1;
        this.f36068f = i2;
        if (i2 != 1) {
            this.f36068f = i2 - 1;
            this.f36064b.getLogger().mo30214c(EnumC9587s4.WARNING, "A transaction is already being profiled. Transaction %s (%s) will be ignored.", interfaceC9426e2.getName(), interfaceC9426e2.mo30527m().m30803k().toString());
        } else if (m30348f(interfaceC9426e2)) {
            this.f36064b.getLogger().mo30214c(EnumC9587s4.DEBUG, "Transaction %s (%s) started and being profiled.", interfaceC9426e2.getName(), interfaceC9426e2.mo30527m().m30803k().toString());
        }
    }

    @Override // io.sentry.InterfaceC9433f2
    public void close() {
        InterfaceC9426e2 interfaceC9426e2 = this.f36071i;
        if (interfaceC9426e2 != null) {
            m30349g(interfaceC9426e2, true, null);
        }
        C9330l0 c9330l0 = this.f36072j;
        if (c9330l0 != null) {
            c9330l0.m30341e();
        }
    }

    public C9332m0(Context context, SentryAndroidOptions sentryAndroidOptions, C9344s0 c9344s0, C9323t c9323t, InterfaceC9658v1 interfaceC9658v1) {
        this.f36067e = false;
        this.f36068f = 0;
        this.f36071i = null;
        this.f36072j = null;
        this.f36063a = (Context) C9646q.m31802c(context, "The application context is required");
        this.f36064b = (SentryAndroidOptions) C9646q.m31802c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f36065c = (InterfaceC9658v1) C9646q.m31802c(interfaceC9658v1, "Hub is required");
        this.f36069g = (C9323t) C9646q.m31802c(c9323t, "SentryFrameMetricsCollector is required");
        this.f36066d = (C9344s0) C9646q.m31802c(c9344s0, "The BuildInfoProvider is required.");
    }
}
