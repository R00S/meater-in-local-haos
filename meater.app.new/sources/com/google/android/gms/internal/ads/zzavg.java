package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzavg {

    /* renamed from: a */
    private final AtomicReference<ThreadPoolExecutor> f22557a = new AtomicReference<>(null);

    /* renamed from: b */
    private final Object f22558b = new Object();

    /* renamed from: c */
    private String f22559c = null;

    /* renamed from: d */
    private String f22560d = null;

    /* renamed from: e */
    @VisibleForTesting
    private final AtomicBoolean f22561e = new AtomicBoolean(false);

    /* renamed from: f */
    @VisibleForTesting
    private final AtomicInteger f22562f = new AtomicInteger(-1);

    /* renamed from: g */
    private final AtomicReference<Object> f22563g = new AtomicReference<>(null);

    /* renamed from: h */
    private final AtomicReference<Object> f22564h = new AtomicReference<>(null);

    /* renamed from: i */
    private final ConcurrentMap<String, Method> f22565i = new ConcurrentHashMap(9);

    /* renamed from: j */
    private final AtomicReference<zzbjf> f22566j = new AtomicReference<>(null);

    /* renamed from: k */
    private final List<FutureTask> f22567k = new ArrayList();

    /* renamed from: A */
    private final Method m16987A(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = this.f22565i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f22565i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            m16996i(e2, str, false);
            return null;
        }
    }

    /* renamed from: B */
    private final Method m16988B(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = this.f22565i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, Activity.class, String.class, String.class);
            this.f22565i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            m16996i(e2, str, false);
            return null;
        }
    }

    /* renamed from: C */
    private final ThreadPoolExecutor m16989C() {
        if (this.f22557a.get() == null) {
            AtomicReference<ThreadPoolExecutor> atomicReference = this.f22557a;
            zzacj<Integer> zzacjVar = zzacu.f21623F0;
            atomicReference.compareAndSet(null, new ThreadPoolExecutor(((Integer) zzyt.m20848e().m16421c(zzacjVar)).intValue(), ((Integer) zzyt.m20848e().m16421c(zzacjVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC7067q4(this)));
        }
        return this.f22557a.get();
    }

    @VisibleForTesting
    /* renamed from: E */
    private static boolean m16990E(Context context) throws ClassNotFoundException {
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21629G0)).booleanValue()) {
            if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21635H0)).booleanValue()) {
                return false;
            }
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21641I0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    /* renamed from: b */
    private final Object m16991b(String str, Context context) throws NoSuchMethodException, SecurityException {
        if (!m16998k(context, "com.google.android.gms.measurement.AppMeasurement", this.f22563g, true)) {
            return null;
        }
        try {
            return m16987A(context, str).invoke(this.f22563g.get(), new Object[0]);
        } catch (Exception e2) {
            m16996i(e2, str, true);
            return null;
        }
    }

    /* renamed from: c */
    private final <T> T m16992c(String str, T t, InterfaceC7104r4<T> interfaceC7104r4) {
        synchronized (this.f22566j) {
            if (this.f22566j.get() != null) {
                try {
                    return interfaceC7104r4.mo15334a(this.f22566j.get());
                } catch (Exception e2) {
                    m16996i(e2, str, false);
                }
            }
            return t;
        }
    }

    /* renamed from: d */
    private final <T> Future<T> m16993d(final String str, final InterfaceC7104r4<T> interfaceC7104r4) {
        FutureTask futureTask;
        synchronized (this.f22566j) {
            futureTask = new FutureTask(new Callable(this, interfaceC7104r4, str) { // from class: com.google.android.gms.internal.ads.h4

                /* renamed from: f */
                private final zzavg f19054f;

                /* renamed from: g */
                private final InterfaceC7104r4 f19055g;

                /* renamed from: h */
                private final String f19056h;

                {
                    this.f19054f = this;
                    this.f19055g = interfaceC7104r4;
                    this.f19056h = str;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f19054f.m17004a(this.f19055g, this.f19056h);
                }
            });
            if (this.f22566j.get() != null) {
                m16989C().submit(futureTask);
            } else {
                this.f22567k.add(futureTask);
            }
        }
        return futureTask;
    }

    /* renamed from: e */
    private final void m16994e(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (m16998k(context, "com.google.android.gms.measurement.AppMeasurement", this.f22563g, true)) {
            try {
                m17001z(context, str2).invoke(this.f22563g.get(), str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                zzawz.m17082m(sb.toString());
            } catch (Exception e2) {
                m16996i(e2, str2, false);
            }
        }
    }

    /* renamed from: f */
    private final void m16995f(Context context, final String str, String str2, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (m17002D(context)) {
            final Bundle bundleM17000x = m17000x(str2, str);
            if (bundle != null) {
                bundleM17000x.putAll(bundle);
            }
            if (m16990E(context)) {
                m16997j("logEventInternal", new InterfaceC7141s4(str, bundleM17000x) { // from class: com.google.android.gms.internal.ads.f4

                    /* renamed from: a */
                    private final String f18858a;

                    /* renamed from: b */
                    private final Bundle f18859b;

                    {
                        this.f18858a = str;
                        this.f18859b = bundleM17000x;
                    }

                    @Override // com.google.android.gms.internal.ads.InterfaceC7141s4
                    /* renamed from: a */
                    public final void mo15027a(zzbjf zzbjfVar) throws RemoteException {
                        zzbjfVar.mo16685m0("am", this.f18858a, this.f18859b);
                    }
                });
                return;
            }
            if (m16998k(context, "com.google.android.gms.measurement.AppMeasurement", this.f22563g, true)) {
                try {
                    m16999p(context).invoke(this.f22563g.get(), "am", str, bundleM17000x);
                } catch (Exception e2) {
                    m16996i(e2, "logEventInternal", true);
                }
            }
        }
    }

    /* renamed from: i */
    private final void m16996i(Exception exc, String str, boolean z) {
        if (this.f22561e.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        zzbad.m17353i(sb.toString());
        if (z) {
            zzbad.m17353i("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f22561e.set(true);
        }
    }

    /* renamed from: j */
    private final void m16997j(final String str, final InterfaceC7141s4 interfaceC7141s4) {
        synchronized (this.f22566j) {
            FutureTask futureTask = new FutureTask(new Runnable(this, interfaceC7141s4, str) { // from class: com.google.android.gms.internal.ads.g4

                /* renamed from: f */
                private final zzavg f18942f;

                /* renamed from: g */
                private final InterfaceC7141s4 f18943g;

                /* renamed from: h */
                private final String f18944h;

                {
                    this.f18942f = this;
                    this.f18943g = interfaceC7141s4;
                    this.f18944h = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f18942f.m17006h(this.f18943g, this.f18944h);
                }
            }, null);
            if (this.f22566j.get() != null) {
                futureTask.run();
            } else {
                this.f22567k.add(futureTask);
            }
        }
    }

    /* renamed from: k */
    private final boolean m16998k(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception e2) {
                m16996i(e2, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    private final Method m16999p(Context context) throws NoSuchMethodException, SecurityException {
        Method method = this.f22565i.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
            this.f22565i.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            m16996i(e2, "logEventInternal", true);
            return null;
        }
    }

    /* renamed from: x */
    private static Bundle m17000x(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e2) {
            String strValueOf = String.valueOf(str);
            zzbad.m17347c(strValueOf.length() != 0 ? "Invalid event ID: ".concat(strValueOf) : new String("Invalid event ID: "), e2);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    /* renamed from: z */
    private final Method m17001z(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = this.f22565i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, String.class);
            this.f22565i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            m16996i(e2, str, false);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m17002D(android.content.Context r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f21905z0
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m20848e()
            java.lang.Object r0 = r1.m16421c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f22561e
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L67
        L1c:
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f21647J0
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.m20848e()
            java.lang.Object r0 = r2.m16421c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f22562f
            int r0 = r0.get()
            r3 = -1
            if (r0 != r3) goto L5e
            com.google.android.gms.internal.ads.zzyt.m20844a()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r0 = com.google.android.gms.internal.ads.zzazt.m17314s(r5, r0)
            if (r0 != 0) goto L59
            com.google.android.gms.internal.ads.zzyt.m20844a()
            boolean r5 = com.google.android.gms.internal.ads.zzazt.m17309n(r5)
            if (r5 == 0) goto L59
            java.lang.String r5 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            com.google.android.gms.internal.ads.zzbad.m17353i(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f22562f
            r5.set(r1)
            goto L5e
        L59:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f22562f
            r5.set(r2)
        L5e:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f22562f
            int r5 = r5.get()
            if (r5 != r2) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavg.m17002D(android.content.Context):boolean");
    }

    /* renamed from: F */
    public final String m17003F(Context context) {
        if (!m17002D(context)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (m16990E(context)) {
            return (String) m16992c("getCurrentScreenNameOrScreenClass", HttpUrl.FRAGMENT_ENCODE_SET, C6771i4.f19290a);
        }
        if (!m16998k(context, "com.google.android.gms.measurement.AppMeasurement", this.f22563g, true)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            String str = (String) m16987A(context, "getCurrentScreenName").invoke(this.f22563g.get(), new Object[0]);
            if (str == null) {
                str = (String) m16987A(context, "getCurrentScreenClass").invoke(this.f22563g.get(), new Object[0]);
            }
            return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Exception e2) {
            m16996i(e2, "getCurrentScreenName", false);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: a */
    final /* synthetic */ Object m17004a(InterfaceC7104r4 interfaceC7104r4, String str) throws Exception {
        try {
            return interfaceC7104r4.mo15334a(this.f22566j.get());
        } catch (Exception e2) {
            m16996i(e2, str, false);
            throw e2;
        }
    }

    /* renamed from: g */
    public final void m17005g(Context context, String str, String str2, String str3, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (m17002D(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("type", str3);
            bundle.putInt("value", i2);
            m16995f(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i2);
            zzawz.m17082m(sb.toString());
        }
    }

    /* renamed from: h */
    final /* synthetic */ void m17006h(InterfaceC7141s4 interfaceC7141s4, String str) {
        if (this.f22566j.get() != null) {
            try {
                interfaceC7141s4.mo15027a(this.f22566j.get());
            } catch (Exception e2) {
                m16996i(e2, str, false);
            }
        }
    }

    /* renamed from: l */
    public final String m17007l(Context context) {
        if (!m17002D(context)) {
            return null;
        }
        synchronized (this.f22558b) {
            String str = this.f22559c;
            if (str != null) {
                return str;
            }
            if (m16990E(context)) {
                this.f22559c = (String) m16992c("getGmpAppId", this.f22559c, C6845k4.f19519a);
            } else {
                this.f22559c = (String) m16991b("getGmpAppId", context);
            }
            return this.f22559c;
        }
    }

    /* renamed from: m */
    public final String m17008m(final Context context) {
        if (!m17002D(context)) {
            return null;
        }
        long jLongValue = ((Long) zzyt.m20848e().m16421c(zzacu.f21617E0)).longValue();
        if (m16990E(context)) {
            try {
                return jLongValue < 0 ? (String) m16993d("getAppInstanceId", C6882l4.f19747a).get() : (String) m16993d("getAppInstanceId", C6919m4.f19871a).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                if (e2 instanceof TimeoutException) {
                    return "TIME_OUT";
                }
                return null;
            }
        }
        if (jLongValue < 0) {
            return (String) m16991b("getAppInstanceId", context);
        }
        Future futureSubmit = m16989C().submit(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.n4

            /* renamed from: f */
            private final zzavg f19983f;

            /* renamed from: g */
            private final Context f19984g;

            {
                this.f19983f = this;
                this.f19984g = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19983f.m17011q(this.f19984g);
            }
        });
        try {
            return (String) futureSubmit.get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (Exception e3) {
            futureSubmit.cancel(true);
            if (e3 instanceof TimeoutException) {
                return "TIME_OUT";
            }
            return null;
        }
    }

    /* renamed from: n */
    public final String m17009n(Context context) throws NoSuchMethodException, SecurityException {
        if (!m17002D(context)) {
            return null;
        }
        if (m16990E(context)) {
            Long l = (Long) m16992c("getAdEventId", null, C6993o4.f20134a);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object objM16991b = m16991b("generateEventId", context);
        if (objM16991b != null) {
            return objM16991b.toString();
        }
        return null;
    }

    /* renamed from: o */
    public final String m17010o(Context context) {
        if (!m17002D(context)) {
            return null;
        }
        synchronized (this.f22558b) {
            String str = this.f22560d;
            if (str != null) {
                return str;
            }
            if (m16990E(context)) {
                this.f22560d = (String) m16992c("getAppIdOrigin", this.f22560d, C7030p4.f20273a);
            } else {
                this.f22560d = "fa";
            }
            return this.f22560d;
        }
    }

    /* renamed from: q */
    final /* synthetic */ String m17011q(Context context) throws Exception {
        return (String) m16991b("getAppInstanceId", context);
    }

    /* renamed from: r */
    public final void m17012r(Context context, final String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (m17002D(context)) {
            if (m16990E(context)) {
                m16997j("beginAdUnitExposure", new InterfaceC7141s4(str) { // from class: com.google.android.gms.internal.ads.d4

                    /* renamed from: a */
                    private final String f18487a;

                    {
                        this.f18487a = str;
                    }

                    @Override // com.google.android.gms.internal.ads.InterfaceC7141s4
                    /* renamed from: a */
                    public final void mo15027a(zzbjf zzbjfVar) throws RemoteException {
                        zzbjfVar.mo16678O5(this.f18487a);
                    }
                });
            } else {
                m16994e(context, str, "beginAdUnitExposure");
            }
        }
    }

    /* renamed from: s */
    public final void m17013s(Context context, final String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (m17002D(context)) {
            if (m16990E(context)) {
                m16997j("endAdUnitExposure", new InterfaceC7141s4(str) { // from class: com.google.android.gms.internal.ads.e4

                    /* renamed from: a */
                    private final String f18727a;

                    {
                        this.f18727a = str;
                    }

                    @Override // com.google.android.gms.internal.ads.InterfaceC7141s4
                    /* renamed from: a */
                    public final void mo15027a(zzbjf zzbjfVar) throws RemoteException {
                        zzbjfVar.mo16680V6(this.f18727a);
                    }
                });
            } else {
                m16994e(context, str, "endAdUnitExposure");
            }
        }
    }

    /* renamed from: t */
    public final void m17014t(final Context context, final String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (m17002D(context) && (context instanceof Activity)) {
            if (m16990E(context)) {
                m16997j("setScreenName", new InterfaceC7141s4(context, str) { // from class: com.google.android.gms.internal.ads.j4

                    /* renamed from: a */
                    private final Context f19455a;

                    /* renamed from: b */
                    private final String f19456b;

                    {
                        this.f19455a = context;
                        this.f19456b = str;
                    }

                    @Override // com.google.android.gms.internal.ads.InterfaceC7141s4
                    /* renamed from: a */
                    public final void mo15027a(zzbjf zzbjfVar) throws RemoteException {
                        Context context2 = this.f19455a;
                        zzbjfVar.mo16688z4(ObjectWrapper.m14708E0(context2), this.f19456b, context2.getPackageName());
                    }
                });
                return;
            }
            if (m16998k(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f22564h, false)) {
                try {
                    m16988B(context, "setCurrentScreen").invoke(this.f22564h.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception e2) {
                    m16996i(e2, "setCurrentScreen", false);
                }
            }
        }
    }

    /* renamed from: u */
    public final void m17015u(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m16995f(context, "_ac", str, null);
    }

    /* renamed from: v */
    public final void m17016v(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m16995f(context, "_ai", str, null);
    }

    /* renamed from: w */
    public final void m17017w(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m16995f(context, "_aq", str, null);
    }

    /* renamed from: y */
    public final void m17018y(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m16995f(context, "_aa", str, null);
    }
}
