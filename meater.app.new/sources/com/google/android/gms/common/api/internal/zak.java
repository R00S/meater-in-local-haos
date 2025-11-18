package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p024c.p041e.C0867a;

/* loaded from: classes2.dex */
public final class zak {

    /* renamed from: d */
    private int f17598d;

    /* renamed from: b */
    private final C0867a<zai<?>, String> f17596b = new C0867a<>();

    /* renamed from: c */
    private final TaskCompletionSource<Map<zai<?>, String>> f17597c = new TaskCompletionSource<>();

    /* renamed from: e */
    private boolean f17599e = false;

    /* renamed from: a */
    private final C0867a<zai<?>, ConnectionResult> f17595a = new C0867a<>();

    public zak(Iterable<? extends GoogleApi<?>> iterable) {
        Iterator<? extends GoogleApi<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.f17595a.put(it.next().m13861l(), null);
        }
        this.f17598d = this.f17595a.keySet().size();
    }

    /* renamed from: a */
    public final Task<Map<zai<?>, String>> m14213a() {
        return this.f17597c.m23654a();
    }

    /* renamed from: b */
    public final void m14214b(zai<?> zaiVar, ConnectionResult connectionResult, String str) {
        this.f17595a.put(zaiVar, connectionResult);
        this.f17596b.put(zaiVar, str);
        this.f17598d--;
        if (!connectionResult.m13795e0()) {
            this.f17599e = true;
        }
        if (this.f17598d == 0) {
            if (!this.f17599e) {
                this.f17597c.m23656c(this.f17596b);
            } else {
                this.f17597c.m23655b(new AvailabilityException(this.f17595a));
            }
        }
    }

    /* renamed from: c */
    public final Set<zai<?>> m14215c() {
        return this.f17595a.keySet();
    }
}
