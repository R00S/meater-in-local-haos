package com.google.firebase.perf.application;

import B9.g;
import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import f1.i;
import java.util.HashMap;
import java.util.Map;
import v9.C4925a;
import w9.f;

/* compiled from: FrameMetricsRecorder.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    private static final C4925a f38463e = C4925a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Activity f38464a;

    /* renamed from: b, reason: collision with root package name */
    private final i f38465b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Fragment, f.a> f38466c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f38467d;

    public d(Activity activity) {
        this(activity, new i(), new HashMap());
    }

    static boolean a() {
        return true;
    }

    private g<f.a> b() {
        if (!this.f38467d) {
            f38463e.a("No recording has been started.");
            return g.a();
        }
        SparseIntArray[] sparseIntArrayArrB = this.f38465b.b();
        if (sparseIntArrayArrB == null) {
            f38463e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return g.a();
        }
        if (sparseIntArrayArrB[0] != null) {
            return g.e(f.a(sparseIntArrayArrB));
        }
        f38463e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return g.a();
    }

    public void c() {
        if (this.f38467d) {
            f38463e.b("FrameMetricsAggregator is already recording %s", this.f38464a.getClass().getSimpleName());
        } else {
            this.f38465b.a(this.f38464a);
            this.f38467d = true;
        }
    }

    public void d(Fragment fragment) {
        if (!this.f38467d) {
            f38463e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.f38466c.containsKey(fragment)) {
            f38463e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        g<f.a> gVarB = b();
        if (gVarB.d()) {
            this.f38466c.put(fragment, gVarB.c());
        } else {
            f38463e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    public g<f.a> e() {
        if (!this.f38467d) {
            f38463e.a("Cannot stop because no recording was started");
            return g.a();
        }
        if (!this.f38466c.isEmpty()) {
            f38463e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f38466c.clear();
        }
        g<f.a> gVarB = b();
        try {
            this.f38465b.c(this.f38464a);
        } catch (IllegalArgumentException | NullPointerException e10) {
            if ((e10 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e10;
            }
            f38463e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
            gVarB = g.a();
        }
        this.f38465b.d();
        this.f38467d = false;
        return gVarB;
    }

    public g<f.a> f(Fragment fragment) {
        if (!this.f38467d) {
            f38463e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return g.a();
        }
        if (!this.f38466c.containsKey(fragment)) {
            f38463e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return g.a();
        }
        f.a aVarRemove = this.f38466c.remove(fragment);
        g<f.a> gVarB = b();
        if (gVarB.d()) {
            return g.e(gVarB.c().a(aVarRemove));
        }
        f38463e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        return g.a();
    }

    d(Activity activity, i iVar, Map<Fragment, f.a> map) {
        this.f38467d = false;
        this.f38464a = activity;
        this.f38465b = iVar;
        this.f38466c = map;
    }
}
