package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.EnumC9587s4;
import io.sentry.android.core.internal.util.C9311h;
import io.sentry.protocol.C9549h;
import io.sentry.protocol.C9558q;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.VisibleForTesting;

/* compiled from: ActivityFramesTracker.java */
/* renamed from: io.sentry.android.core.f0 */
/* loaded from: classes2.dex */
public final class C9278f0 {

    /* renamed from: a */
    private FrameMetricsAggregator f35894a;

    /* renamed from: b */
    private final SentryAndroidOptions f35895b;

    /* renamed from: c */
    private final Map<C9558q, Map<String, C9549h>> f35896c;

    /* renamed from: d */
    private final Map<Activity, b> f35897d;

    /* renamed from: e */
    private final C9268c1 f35898e;

    /* compiled from: ActivityFramesTracker.java */
    /* renamed from: io.sentry.android.core.f0$b */
    private static final class b {

        /* renamed from: a */
        private final int f35899a;

        /* renamed from: b */
        private final int f35900b;

        /* renamed from: c */
        private final int f35901c;

        private b(int i2, int i3, int i4) {
            this.f35899a = i2;
            this.f35900b = i3;
            this.f35901c = i4;
        }
    }

    public C9278f0(C9265b1 c9265b1, SentryAndroidOptions sentryAndroidOptions, C9268c1 c9268c1) {
        this.f35894a = null;
        this.f35896c = new ConcurrentHashMap();
        this.f35897d = new WeakHashMap();
        if (c9265b1.m30151a("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger())) {
            this.f35894a = new FrameMetricsAggregator();
        }
        this.f35895b = sentryAndroidOptions;
        this.f35898e = c9268c1;
    }

    /* renamed from: b */
    private b m30180b() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i2;
        int i3;
        SparseIntArray sparseIntArray;
        if (!m30189d() || (frameMetricsAggregator = this.f35894a) == null) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrM1511b = frameMetricsAggregator.m1511b();
        int i4 = 0;
        if (sparseIntArrayArrM1511b == null || sparseIntArrayArrM1511b.length <= 0 || (sparseIntArray = sparseIntArrayArrM1511b[0]) == null) {
            i2 = 0;
            i3 = 0;
        } else {
            int i5 = 0;
            i2 = 0;
            i3 = 0;
            while (i4 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i4);
                int iValueAt = sparseIntArray.valueAt(i4);
                i5 += iValueAt;
                if (iKeyAt > 700) {
                    i3 += iValueAt;
                } else if (iKeyAt > 16) {
                    i2 += iValueAt;
                }
                i4++;
            }
            i4 = i5;
        }
        return new b(i4, i2, i3);
    }

    /* renamed from: c */
    private b m30181c(Activity activity) {
        b bVarM30180b;
        b bVarRemove = this.f35897d.remove(activity);
        if (bVarRemove == null || (bVarM30180b = m30180b()) == null) {
            return null;
        }
        return new b(bVarM30180b.f35899a - bVarRemove.f35899a, bVarM30180b.f35900b - bVarRemove.f35900b, bVarM30180b.f35901c - bVarRemove.f35901c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30190f(Activity activity) {
        this.f35894a.m1510a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30191h(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                this.f35895b.getLogger().mo30214c(EnumC9587s4.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30192j(Activity activity) {
        this.f35894a.m1512c(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30193l() {
        this.f35894a.m1514e();
    }

    /* renamed from: m */
    private void m30186m(final Runnable runnable, final String str) {
        try {
            if (C9311h.m30273e().mo30277d()) {
                runnable.run();
            } else {
                this.f35898e.m30155b(new Runnable() { // from class: io.sentry.android.core.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f35877f.m30191h(runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f35895b.getLogger().mo30214c(EnumC9587s4.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    /* renamed from: o */
    private void m30187o(Activity activity) {
        b bVarM30180b = m30180b();
        if (bVarM30180b != null) {
            this.f35897d.put(activity, bVarM30180b);
        }
    }

    /* renamed from: a */
    public synchronized void m30188a(final Activity activity) {
        if (m30189d()) {
            m30186m(new Runnable() { // from class: io.sentry.android.core.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35892f.m30190f(activity);
                }
            }, "FrameMetricsAggregator.add");
            m30187o(activity);
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    public boolean m30189d() {
        return this.f35894a != null && this.f35895b.isEnableFramesTracking();
    }

    /* renamed from: n */
    public synchronized void m30194n(final Activity activity, C9558q c9558q) {
        if (m30189d()) {
            m30186m(new Runnable() { // from class: io.sentry.android.core.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35864f.m30192j(activity);
                }
            }, null);
            b bVarM30181c = m30181c(activity);
            if (bVarM30181c != null && (bVarM30181c.f35899a != 0 || bVarM30181c.f35900b != 0 || bVarM30181c.f35901c != 0)) {
                C9549h c9549h = new C9549h(Integer.valueOf(bVarM30181c.f35899a), "none");
                C9549h c9549h2 = new C9549h(Integer.valueOf(bVarM30181c.f35900b), "none");
                C9549h c9549h3 = new C9549h(Integer.valueOf(bVarM30181c.f35901c), "none");
                HashMap map = new HashMap();
                map.put("frames_total", c9549h);
                map.put("frames_slow", c9549h2);
                map.put("frames_frozen", c9549h3);
                this.f35896c.put(c9558q, map);
            }
        }
    }

    /* renamed from: p */
    public synchronized void m30195p() {
        if (m30189d()) {
            m30186m(new Runnable() { // from class: io.sentry.android.core.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35871f.m30193l();
                }
            }, "FrameMetricsAggregator.stop");
            this.f35894a.m1513d();
        }
        this.f35896c.clear();
    }

    /* renamed from: q */
    public synchronized Map<String, C9549h> m30196q(C9558q c9558q) {
        if (!m30189d()) {
            return null;
        }
        Map<String, C9549h> map = this.f35896c.get(c9558q);
        this.f35896c.remove(c9558q);
        return map;
    }

    public C9278f0(C9265b1 c9265b1, SentryAndroidOptions sentryAndroidOptions) {
        this(c9265b1, sentryAndroidOptions, new C9268c1());
    }
}
