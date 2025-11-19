package com.google.firebase.perf.application;

import A9.k;
import B9.g;
import B9.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;
import v9.C4925a;
import w9.f;

/* compiled from: FragmentStateMonitor.java */
/* loaded from: classes2.dex */
public class c extends v.l {

    /* renamed from: f, reason: collision with root package name */
    private static final C4925a f38457f = C4925a.e();

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Fragment, Trace> f38458a = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final B9.a f38459b;

    /* renamed from: c, reason: collision with root package name */
    private final k f38460c;

    /* renamed from: d, reason: collision with root package name */
    private final a f38461d;

    /* renamed from: e, reason: collision with root package name */
    private final d f38462e;

    public c(B9.a aVar, k kVar, a aVar2, d dVar) {
        this.f38459b = aVar;
        this.f38460c = kVar;
        this.f38461d = aVar2;
        this.f38462e = dVar;
    }

    @Override // androidx.fragment.app.v.l
    public void f(v vVar, Fragment fragment) {
        super.f(vVar, fragment);
        C4925a c4925a = f38457f;
        c4925a.b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f38458a.containsKey(fragment)) {
            c4925a.k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f38458a.get(fragment);
        this.f38458a.remove(fragment);
        g<f.a> gVarF = this.f38462e.f(fragment);
        if (!gVarF.d()) {
            c4925a.k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            j.a(trace, gVarF.c());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.v.l
    public void i(v vVar, Fragment fragment) {
        super.i(vVar, fragment);
        f38457f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(o(fragment), this.f38460c, this.f38459b, this.f38461d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.n0() == null ? "No parent" : fragment.n0().getClass().getSimpleName());
        if (fragment.T() != null) {
            trace.putAttribute("Hosting_activity", fragment.T().getClass().getSimpleName());
        }
        this.f38458a.put(fragment, trace);
        this.f38462e.d(fragment);
    }

    public String o(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }
}
