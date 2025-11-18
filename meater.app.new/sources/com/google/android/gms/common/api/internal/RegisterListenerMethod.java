package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {

    /* renamed from: a */
    private final ListenerHolder<L> f17382a;

    /* renamed from: b */
    private final Feature[] f17383b;

    /* renamed from: c */
    private final boolean f17384c;

    @KeepForSdk
    /* renamed from: a */
    public void m14047a() {
        this.f17382a.m14043a();
    }

    @KeepForSdk
    /* renamed from: b */
    public ListenerHolder.ListenerKey<L> m14048b() {
        return this.f17382a.m14044b();
    }

    @KeepForSdk
    /* renamed from: c */
    public Feature[] m14049c() {
        return this.f17383b;
    }

    @KeepForSdk
    /* renamed from: d */
    protected abstract void m14050d(A a, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    /* renamed from: e */
    public final boolean m14051e() {
        return this.f17384c;
    }
}
