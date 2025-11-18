package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.f0 */
/* loaded from: classes2.dex */
final class RunnableC6367f0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zace f17407f;

    RunnableC6367f0(zace zaceVar) {
        this.f17407f = zaceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17407f.f17566m.mo13982c(new ConnectionResult(4));
    }
}
