package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zaab {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f17478a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<TaskCompletionSource<?>, Boolean> f17479b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: d */
    private final void m14107d(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f17478a) {
            map = new HashMap(this.f17478a);
        }
        synchronized (this.f17479b) {
            map2 = new HashMap(this.f17479b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m13942p(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).m23657d(new ApiException(status));
            }
        }
    }

    /* renamed from: b */
    final void m14109b(BasePendingResult<? extends Result> basePendingResult, boolean z) {
        this.f17478a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo13896b(new C6358b(this, basePendingResult));
    }

    /* renamed from: c */
    final <TResult> void m14110c(TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        this.f17479b.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.m23654a().mo23639b(new C6360c(this, taskCompletionSource));
    }

    /* renamed from: e */
    final boolean m14111e() {
        return (this.f17478a.isEmpty() && this.f17479b.isEmpty()) ? false : true;
    }

    /* renamed from: f */
    public final void m14112f() {
        m14107d(false, GoogleApiManager.f17330f);
    }

    /* renamed from: g */
    public final void m14113g() {
        m14107d(true, zacp.f17574a);
    }
}
