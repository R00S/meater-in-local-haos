package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;

/* renamed from: com.google.android.gms.common.api.internal.b0 */
/* loaded from: classes2.dex */
final class RunnableC6359b0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ ConnectionResult f17395f;

    /* renamed from: g */
    private final /* synthetic */ GoogleApiManager.zaa f17396g;

    RunnableC6359b0(GoogleApiManager.zaa zaaVar, ConnectionResult connectionResult) {
        this.f17396g = zaaVar;
        this.f17395f = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17396g.mo13895E0(this.f17395f);
    }
}
