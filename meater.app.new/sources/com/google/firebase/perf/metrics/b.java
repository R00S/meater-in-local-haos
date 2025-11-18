package com.google.firebase.perf.metrics;

import C9.k;
import C9.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import z9.C5219a;

/* compiled from: TraceMetricBuilder.java */
/* loaded from: classes2.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final Trace f38549a;

    b(Trace trace) {
        this.f38549a = trace;
    }

    m a() {
        m.b bVarU = m.G0().V(this.f38549a.e()).T(this.f38549a.g().e()).U(this.f38549a.g().d(this.f38549a.d()));
        for (a aVar : this.f38549a.c().values()) {
            bVarU.R(aVar.b(), aVar.a());
        }
        List<Trace> listH = this.f38549a.h();
        if (!listH.isEmpty()) {
            Iterator<Trace> it = listH.iterator();
            while (it.hasNext()) {
                bVarU.O(new b(it.next()).a());
            }
        }
        bVarU.Q(this.f38549a.getAttributes());
        k[] kVarArrB = C5219a.b(this.f38549a.f());
        if (kVarArrB != null) {
            bVarU.L(Arrays.asList(kVarArrB));
        }
        return bVarU.e();
    }
}
