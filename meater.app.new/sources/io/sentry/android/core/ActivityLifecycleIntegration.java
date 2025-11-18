package io.sentry.android.core;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.sentry.AbstractC9435f4;
import io.sentry.C9420d3;
import io.sentry.C9471i2;
import io.sentry.C9510m1;
import io.sentry.C9517n1;
import io.sentry.C9581r5;
import io.sentry.C9586s3;
import io.sentry.C9595t5;
import io.sentry.C9657v0;
import io.sentry.C9680x4;
import io.sentry.EnumC9447h2;
import io.sentry.EnumC9493j5;
import io.sentry.EnumC9587s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9419d2;
import io.sentry.InterfaceC9426e2;
import io.sentry.InterfaceC9588s5;
import io.sentry.InterfaceC9593t3;
import io.sentry.InterfaceC9658v1;
import io.sentry.InterfaceC9659v2;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.internal.util.C9313j;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC9319p;
import io.sentry.protocol.EnumC9567z;
import io.sentry.util.C9646q;
import io.sentry.util.C9655v;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.VisibleForTesting;

/* loaded from: classes2.dex */
public final class ActivityLifecycleIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final Application f35751f;

    /* renamed from: g */
    private final C9344s0 f35752g;

    /* renamed from: h */
    private InterfaceC9658v1 f35753h;

    /* renamed from: i */
    private SentryAndroidOptions f35754i;

    /* renamed from: l */
    private boolean f35757l;

    /* renamed from: n */
    private final boolean f35759n;

    /* renamed from: p */
    private InterfaceC9419d2 f35761p;

    /* renamed from: w */
    private final C9278f0 f35768w;

    /* renamed from: j */
    private boolean f35755j = false;

    /* renamed from: k */
    private boolean f35756k = false;

    /* renamed from: m */
    private boolean f35758m = false;

    /* renamed from: o */
    private C9510m1 f35760o = null;

    /* renamed from: q */
    private final WeakHashMap<Activity, InterfaceC9419d2> f35762q = new WeakHashMap<>();

    /* renamed from: r */
    private final WeakHashMap<Activity, InterfaceC9419d2> f35763r = new WeakHashMap<>();

    /* renamed from: s */
    private AbstractC9435f4 f35764s = C9284h0.m30209a();

    /* renamed from: t */
    private final Handler f35765t = new Handler(Looper.getMainLooper());

    /* renamed from: u */
    private Future<?> f35766u = null;

    /* renamed from: v */
    private final WeakHashMap<Activity, InterfaceC9426e2> f35767v = new WeakHashMap<>();

    public ActivityLifecycleIntegration(Application application, C9344s0 c9344s0, C9278f0 c9278f0) {
        Application application2 = (Application) C9646q.m31802c(application, "Application is required");
        this.f35751f = application2;
        this.f35752g = (C9344s0) C9646q.m31802c(c9344s0, "BuildInfoProvider is required");
        this.f35768w = (C9278f0) C9646q.m31802c(c9278f0, "ActivityFramesTracker is required");
        if (c9344s0.m30406d() >= 29) {
            this.f35757l = true;
        }
        this.f35759n = C9346t0.m30421m(application2);
    }

    /* renamed from: A */
    private String m30056A(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    /* renamed from: B */
    private String m30057B(boolean z) {
        return z ? "Cold Start" : "Warm Start";
    }

    /* renamed from: D */
    private String m30058D(boolean z) {
        return z ? "app.start.cold" : "app.start.warm";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m30093m0(InterfaceC9419d2 interfaceC9419d2, InterfaceC9419d2 interfaceC9419d22) {
        SentryAndroidOptions sentryAndroidOptions = this.f35754i;
        if (sentryAndroidOptions == null || interfaceC9419d22 == null) {
            m30080m(interfaceC9419d22);
            return;
        }
        AbstractC9435f4 abstractC9435f4Mo30210a = sentryAndroidOptions.getDateProvider().mo30210a();
        long millis = TimeUnit.NANOSECONDS.toMillis(abstractC9435f4Mo30210a.mo30788k(interfaceC9419d22.mo30531q()));
        Long lValueOf = Long.valueOf(millis);
        InterfaceC9659v2.a aVar = InterfaceC9659v2.a.MILLISECOND;
        interfaceC9419d22.mo30522h("time_to_initial_display", lValueOf, aVar);
        if (interfaceC9419d2 != null && interfaceC9419d2.mo30516b()) {
            interfaceC9419d2.mo30517c(abstractC9435f4Mo30210a);
            interfaceC9419d22.mo30522h("time_to_full_display", Long.valueOf(millis), aVar);
        }
        m30082p(interfaceC9419d22, abstractC9435f4Mo30210a);
    }

    /* renamed from: F0 */
    private void m30060F0(Bundle bundle) {
        if (this.f35758m) {
            return;
        }
        C9340q0.m30389e().m30398j(bundle == null);
    }

    /* renamed from: G0 */
    private void m30061G0(InterfaceC9419d2 interfaceC9419d2) {
        if (interfaceC9419d2 != null) {
            interfaceC9419d2.mo30527m().m30805m("auto.ui.activity");
        }
    }

    /* renamed from: H */
    private String m30062H(InterfaceC9419d2 interfaceC9419d2) {
        String description = interfaceC9419d2.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return interfaceC9419d2.getDescription() + " - Deadline Exceeded";
    }

    /* renamed from: I */
    private String m30063I(String str) {
        return str + " full display";
    }

    /* renamed from: J */
    private String m30064J(String str) {
        return str + " initial display";
    }

    /* renamed from: J0 */
    private void m30065J0(Activity activity) {
        final WeakReference weakReference = new WeakReference(activity);
        if (this.f35753h == null || m30069N(activity)) {
            return;
        }
        boolean z = this.f35755j;
        if (!z) {
            this.f35767v.put(activity, C9420d3.m30717r());
            C9655v.m31827e(this.f35753h);
            return;
        }
        if (z) {
            m30067K0();
            final String strM30056A = m30056A(activity);
            AbstractC9435f4 abstractC9435f4M30393d = this.f35759n ? C9340q0.m30389e().m30393d() : null;
            Boolean boolM30394f = C9340q0.m30389e().m30394f();
            C9595t5 c9595t5 = new C9595t5();
            if (this.f35754i.isEnableActivityLifecycleTracingAutoFinish()) {
                c9595t5.m31656k(this.f35754i.getIdleTimeout());
                c9595t5.m30858d(true);
            }
            c9595t5.m31659n(true);
            c9595t5.m31658m(new InterfaceC9588s5() { // from class: io.sentry.android.core.p
                @Override // io.sentry.InterfaceC9588s5
                /* renamed from: a */
                public final void mo30354a(InterfaceC9426e2 interfaceC9426e2) {
                    this.f36083a.m30094p0(weakReference, strM30056A, interfaceC9426e2);
                }
            });
            AbstractC9435f4 abstractC9435f4 = (this.f35758m || abstractC9435f4M30393d == null || boolM30394f == null) ? this.f35764s : abstractC9435f4M30393d;
            c9595t5.m31657l(abstractC9435f4);
            final InterfaceC9426e2 interfaceC9426e2Mo31151l = this.f35753h.mo31151l(new C9581r5(strM30056A, EnumC9567z.COMPONENT, "ui.load"), c9595t5);
            m30061G0(interfaceC9426e2Mo31151l);
            if (!this.f35758m && abstractC9435f4M30393d != null && boolM30394f != null) {
                InterfaceC9419d2 interfaceC9419d2Mo30520f = interfaceC9426e2Mo31151l.mo30520f(m30058D(boolM30394f.booleanValue()), m30057B(boolM30394f.booleanValue()), abstractC9435f4M30393d, EnumC9447h2.SENTRY);
                this.f35761p = interfaceC9419d2Mo30520f;
                m30061G0(interfaceC9419d2Mo30520f);
                m30078k();
            }
            String strM30064J = m30064J(strM30056A);
            EnumC9447h2 enumC9447h2 = EnumC9447h2.SENTRY;
            final InterfaceC9419d2 interfaceC9419d2Mo30520f2 = interfaceC9426e2Mo31151l.mo30520f("ui.load.initial_display", strM30064J, abstractC9435f4, enumC9447h2);
            this.f35762q.put(activity, interfaceC9419d2Mo30520f2);
            m30061G0(interfaceC9419d2Mo30520f2);
            if (this.f35756k && this.f35760o != null && this.f35754i != null) {
                final InterfaceC9419d2 interfaceC9419d2Mo30520f3 = interfaceC9426e2Mo31151l.mo30520f("ui.load.full_display", m30063I(strM30056A), abstractC9435f4, enumC9447h2);
                m30061G0(interfaceC9419d2Mo30520f3);
                try {
                    this.f35763r.put(activity, interfaceC9419d2Mo30520f3);
                    this.f35766u = this.f35754i.getExecutorService().mo30030b(new Runnable() { // from class: io.sentry.android.core.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f36075f.m30095t0(interfaceC9419d2Mo30520f3, interfaceC9419d2Mo30520f2);
                        }
                    }, 30000L);
                } catch (RejectedExecutionException e2) {
                    this.f35754i.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e2);
                }
            }
            this.f35753h.mo31154o(new InterfaceC9593t3() { // from class: io.sentry.android.core.j
                @Override // io.sentry.InterfaceC9593t3
                /* renamed from: a */
                public final void mo30217a(C9586s3 c9586s3) {
                    this.f36028a.m30096y0(interfaceC9426e2Mo31151l, c9586s3);
                }
            });
            this.f35767v.put(activity, interfaceC9426e2Mo31151l);
        }
    }

    /* renamed from: K */
    private boolean m30066K(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    /* renamed from: K0 */
    private void m30067K0() {
        for (Map.Entry<Activity, InterfaceC9426e2> entry : this.f35767v.entrySet()) {
            m30087z(entry.getValue(), this.f35762q.get(entry.getKey()), this.f35763r.get(entry.getKey()));
        }
    }

    /* renamed from: M0 */
    private void m30068M0(Activity activity, boolean z) {
        if (this.f35755j && z) {
            m30087z(this.f35767v.get(activity), null, null);
        }
    }

    /* renamed from: N */
    private boolean m30069N(Activity activity) {
        return this.f35767v.containsKey(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30088T(C9586s3 c9586s3, InterfaceC9426e2 interfaceC9426e2, InterfaceC9426e2 interfaceC9426e22) {
        if (interfaceC9426e22 == null) {
            c9586s3.m31613z(interfaceC9426e2);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f35754i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC9426e2.getName());
        }
    }

    /* renamed from: W */
    static /* synthetic */ void m30071W(InterfaceC9426e2 interfaceC9426e2, C9586s3 c9586s3, InterfaceC9426e2 interfaceC9426e22) {
        if (interfaceC9426e22 == interfaceC9426e2) {
            c9586s3.m31594e();
        }
    }

    /* renamed from: b */
    private void m30074b(Activity activity, String str) {
        SentryAndroidOptions sentryAndroidOptions = this.f35754i;
        if (sentryAndroidOptions == null || this.f35753h == null || !sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()) {
            return;
        }
        C9657v0 c9657v0 = new C9657v0();
        c9657v0.m31844p("navigation");
        c9657v0.m31841m("state", str);
        c9657v0.m31841m("screen", m30056A(activity));
        c9657v0.m31840l("ui.lifecycle");
        c9657v0.m31842n(EnumC9587s4.INFO);
        C9517n1 c9517n1 = new C9517n1();
        c9517n1.m31079j("android:activity", activity);
        this.f35753h.mo31153n(c9657v0, c9517n1);
    }

    /* renamed from: f */
    private void m30076f() {
        Future<?> future = this.f35766u;
        if (future != null) {
            future.cancel(false);
            this.f35766u = null;
        }
    }

    /* renamed from: k */
    private void m30078k() {
        AbstractC9435f4 abstractC9435f4M30390a = C9340q0.m30389e().m30390a();
        if (!this.f35755j || abstractC9435f4M30390a == null) {
            return;
        }
        m30082p(this.f35761p, abstractC9435f4M30390a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m30095t0(InterfaceC9419d2 interfaceC9419d2, InterfaceC9419d2 interfaceC9419d22) {
        if (interfaceC9419d2 == null || interfaceC9419d2.mo30516b()) {
            return;
        }
        interfaceC9419d2.mo30524j(m30062H(interfaceC9419d2));
        AbstractC9435f4 abstractC9435f4Mo30528n = interfaceC9419d22 != null ? interfaceC9419d22.mo30528n() : null;
        if (abstractC9435f4Mo30528n == null) {
            abstractC9435f4Mo30528n = interfaceC9419d2.mo30531q();
        }
        m30084x(interfaceC9419d2, abstractC9435f4Mo30528n, EnumC9493j5.DEADLINE_EXCEEDED);
    }

    /* renamed from: m */
    private void m30080m(InterfaceC9419d2 interfaceC9419d2) {
        if (interfaceC9419d2 == null || interfaceC9419d2.mo30516b()) {
            return;
        }
        interfaceC9419d2.mo30521g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30094p0(WeakReference weakReference, String str, InterfaceC9426e2 interfaceC9426e2) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            this.f35768w.m30194n(activity, interfaceC9426e2.mo30525k());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f35754i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    /* renamed from: p */
    private void m30082p(InterfaceC9419d2 interfaceC9419d2, AbstractC9435f4 abstractC9435f4) {
        m30084x(interfaceC9419d2, abstractC9435f4, null);
    }

    /* renamed from: x */
    private void m30084x(InterfaceC9419d2 interfaceC9419d2, AbstractC9435f4 abstractC9435f4, EnumC9493j5 enumC9493j5) {
        if (interfaceC9419d2 == null || interfaceC9419d2.mo30516b()) {
            return;
        }
        if (enumC9493j5 == null) {
            enumC9493j5 = interfaceC9419d2.getStatus() != null ? interfaceC9419d2.getStatus() : EnumC9493j5.OK;
        }
        interfaceC9419d2.mo30529o(enumC9493j5, abstractC9435f4);
    }

    /* renamed from: y */
    private void m30086y(InterfaceC9419d2 interfaceC9419d2, EnumC9493j5 enumC9493j5) {
        if (interfaceC9419d2 == null || interfaceC9419d2.mo30516b()) {
            return;
        }
        interfaceC9419d2.mo30518d(enumC9493j5);
    }

    /* renamed from: z */
    private void m30087z(final InterfaceC9426e2 interfaceC9426e2, InterfaceC9419d2 interfaceC9419d2, InterfaceC9419d2 interfaceC9419d22) {
        if (interfaceC9426e2 == null || interfaceC9426e2.mo30516b()) {
            return;
        }
        m30086y(interfaceC9419d2, EnumC9493j5.DEADLINE_EXCEEDED);
        m30083q0(interfaceC9419d22, interfaceC9419d2);
        m30076f();
        EnumC9493j5 status = interfaceC9426e2.getStatus();
        if (status == null) {
            status = EnumC9493j5.OK;
        }
        interfaceC9426e2.mo30518d(status);
        InterfaceC9658v1 interfaceC9658v1 = this.f35753h;
        if (interfaceC9658v1 != null) {
            interfaceC9658v1.mo31154o(new InterfaceC9593t3() { // from class: io.sentry.android.core.o
                @Override // io.sentry.InterfaceC9593t3
                /* renamed from: a */
                public final void mo30217a(C9586s3 c9586s3) {
                    this.f36081a.m30089Z(interfaceC9426e2, c9586s3);
                }
            });
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9471i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public void mo30001c(InterfaceC9658v1 interfaceC9658v1, C9680x4 c9680x4) {
        this.f35754i = (SentryAndroidOptions) C9646q.m31802c(c9680x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9680x4 : null, "SentryAndroidOptions is required");
        this.f35753h = (InterfaceC9658v1) C9646q.m31802c(interfaceC9658v1, "Hub is required");
        InterfaceC9670w1 logger = this.f35754i.getLogger();
        EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
        logger.mo30214c(enumC9587s4, "ActivityLifecycleIntegration enabled: %s", Boolean.valueOf(this.f35754i.isEnableActivityLifecycleBreadcrumbs()));
        this.f35755j = m30066K(this.f35754i);
        this.f35760o = this.f35754i.getFullyDisplayedReporter();
        this.f35756k = this.f35754i.isEnableTimeToFullDisplayTracing();
        this.f35751f.registerActivityLifecycleCallbacks(this);
        this.f35754i.getLogger().mo30214c(enumC9587s4, "ActivityLifecycleIntegration installed.", new Object[0]);
        mo30003a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f35751f.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f35754i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f35768w.m30195p();
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m30096y0(final C9586s3 c9586s3, final InterfaceC9426e2 interfaceC9426e2) {
        c9586s3.m31589D(new C9586s3.c() { // from class: io.sentry.android.core.g
            @Override // io.sentry.C9586s3.c
            /* renamed from: a */
            public final void mo30201a(InterfaceC9426e2 interfaceC9426e22) {
                this.f35905a.m30088T(c9586s3, interfaceC9426e2, interfaceC9426e22);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m30089Z(final C9586s3 c9586s3, final InterfaceC9426e2 interfaceC9426e2) {
        c9586s3.m31589D(new C9586s3.c() { // from class: io.sentry.android.core.i
            @Override // io.sentry.C9586s3.c
            /* renamed from: a */
            public final void mo30201a(InterfaceC9426e2 interfaceC9426e22) {
                ActivityLifecycleIntegration.m30071W(interfaceC9426e2, c9586s3, interfaceC9426e22);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        m30060F0(bundle);
        m30074b(activity, "created");
        if (this.f35753h != null) {
            final String strM30279a = C9313j.m30279a(activity);
            this.f35753h.mo31154o(new InterfaceC9593t3() { // from class: io.sentry.android.core.m
                @Override // io.sentry.InterfaceC9593t3
                /* renamed from: a */
                public final void mo30217a(C9586s3 c9586s3) {
                    c9586s3.m31612y(strM30279a);
                }
            });
        }
        m30065J0(activity);
        final InterfaceC9419d2 interfaceC9419d2 = this.f35763r.get(activity);
        this.f35758m = true;
        C9510m1 c9510m1 = this.f35760o;
        if (c9510m1 != null) {
            c9510m1.m31015b(new C9510m1.a() { // from class: io.sentry.android.core.l
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(Activity activity) {
        if (this.f35755j || this.f35754i.isEnableActivityLifecycleBreadcrumbs()) {
            m30074b(activity, "destroyed");
            m30086y(this.f35761p, EnumC9493j5.CANCELLED);
            InterfaceC9419d2 interfaceC9419d2 = this.f35762q.get(activity);
            InterfaceC9419d2 interfaceC9419d22 = this.f35763r.get(activity);
            m30086y(interfaceC9419d2, EnumC9493j5.DEADLINE_EXCEEDED);
            m30083q0(interfaceC9419d22, interfaceC9419d2);
            m30076f();
            m30068M0(activity, true);
            this.f35761p = null;
            this.f35762q.remove(activity);
            this.f35763r.remove(activity);
        }
        this.f35767v.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        if (!this.f35757l) {
            InterfaceC9658v1 interfaceC9658v1 = this.f35753h;
            if (interfaceC9658v1 == null) {
                this.f35764s = C9284h0.m30209a();
            } else {
                this.f35764s = interfaceC9658v1.mo31156q().getDateProvider().mo30210a();
            }
        }
        m30074b(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        if (this.f35757l) {
            InterfaceC9658v1 interfaceC9658v1 = this.f35753h;
            if (interfaceC9658v1 == null) {
                this.f35764s = C9284h0.m30209a();
            } else {
                this.f35764s = interfaceC9658v1.mo31156q().getDateProvider().mo30210a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"NewApi"})
    public synchronized void onActivityResumed(Activity activity) {
        if (this.f35755j) {
            AbstractC9435f4 abstractC9435f4M30393d = C9340q0.m30389e().m30393d();
            AbstractC9435f4 abstractC9435f4M30390a = C9340q0.m30389e().m30390a();
            if (abstractC9435f4M30393d != null && abstractC9435f4M30390a == null) {
                C9340q0.m30389e().m30395g();
            }
            m30078k();
            final InterfaceC9419d2 interfaceC9419d2 = this.f35762q.get(activity);
            final InterfaceC9419d2 interfaceC9419d22 = this.f35763r.get(activity);
            View viewFindViewById = activity.findViewById(R.id.content);
            if (this.f35752g.m30406d() < 16 || viewFindViewById == null) {
                this.f35765t.post(new Runnable() { // from class: io.sentry.android.core.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36030f.m30093m0(interfaceC9419d22, interfaceC9419d2);
                    }
                });
            } else {
                ViewTreeObserverOnDrawListenerC9319p.m30296e(viewFindViewById, new Runnable() { // from class: io.sentry.android.core.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f35920f.m30091f0(interfaceC9419d22, interfaceC9419d2);
                    }
                }, this.f35752g);
            }
        }
        m30074b(activity, "resumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m30074b(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (this.f35755j) {
            this.f35768w.m30188a(activity);
        }
        m30074b(activity, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        m30074b(activity, "stopped");
    }
}
