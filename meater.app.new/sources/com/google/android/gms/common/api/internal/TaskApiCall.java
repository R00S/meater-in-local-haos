package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    /* renamed from: a */
    private final Feature[] f17387a = null;

    /* renamed from: b */
    private final boolean f17388b = false;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {

        /* renamed from: a */
        private boolean f17389a = true;

        private Builder() {
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
    }

    @KeepForSdk
    /* renamed from: a */
    protected abstract void m14052a(A a, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    /* renamed from: b */
    public boolean m14053b() {
        return this.f17388b;
    }

    /* renamed from: c */
    public final Feature[] m14054c() {
        return this.f17387a;
    }
}
