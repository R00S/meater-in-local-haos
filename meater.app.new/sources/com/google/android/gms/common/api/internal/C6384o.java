package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: com.google.android.gms.common.api.internal.o */
/* loaded from: classes2.dex */
final class C6384o implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: f */
    private final /* synthetic */ zaak f17433f;

    private C6384o(zaak zaakVar) {
        this.f17433f = zaakVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    /* renamed from: E0 */
    public final void mo13895E0(ConnectionResult connectionResult) {
        this.f17433f.f17486b.lock();
        try {
            if (this.f17433f.m14153w(connectionResult)) {
                this.f17433f.m14142l();
                this.f17433f.m14140j();
            } else {
                this.f17433f.m14154x(connectionResult);
            }
        } finally {
            this.f17433f.f17486b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    /* renamed from: H */
    public final void mo13893H(int i2) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    /* renamed from: P */
    public final void mo13894P(Bundle bundle) {
        if (!this.f17433f.f17502r.m14299m()) {
            this.f17433f.f17495k.mo23617d(new BinderC6380m(this.f17433f));
            return;
        }
        this.f17433f.f17486b.lock();
        try {
            if (this.f17433f.f17495k == null) {
                return;
            }
            this.f17433f.f17495k.mo23617d(new BinderC6380m(this.f17433f));
        } finally {
            this.f17433f.f17486b.unlock();
        }
    }

    /* synthetic */ C6384o(zaak zaakVar, RunnableC6368g runnableC6368g) {
        this(zaakVar);
    }
}
