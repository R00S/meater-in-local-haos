package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
/* loaded from: classes2.dex */
final class RunnableC6365e0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ ConnectionResult f17404f;

    /* renamed from: g */
    private final /* synthetic */ GoogleApiManager.C6355b f17405g;

    RunnableC6365e0(GoogleApiManager.C6355b c6355b, ConnectionResult connectionResult) {
        this.f17405g = c6355b;
        this.f17404f = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f17404f.m13795e0()) {
            ((GoogleApiManager.zaa) GoogleApiManager.this.f17342r.get(this.f17405g.f17350b)).mo13895E0(this.f17404f);
            return;
        }
        GoogleApiManager.C6355b.m13976e(this.f17405g, true);
        if (this.f17405g.f17349a.requiresSignIn()) {
            this.f17405g.m13978g();
            return;
        }
        try {
            this.f17405g.f17349a.getRemoteService(null, Collections.emptySet());
        } catch (SecurityException e2) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
            ((GoogleApiManager.zaa) GoogleApiManager.this.f17342r.get(this.f17405g.f17350b)).mo13895E0(new ConnectionResult(10));
        }
    }
}
