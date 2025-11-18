package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: classes2.dex */
final class C6370h implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* renamed from: a */
    private final WeakReference<zaak> f17411a;

    /* renamed from: b */
    private final Api<?> f17412b;

    /* renamed from: c */
    private final boolean f17413c;

    public C6370h(zaak zaakVar, Api<?> api, boolean z) {
        this.f17411a = new WeakReference<>(zaakVar);
        this.f17412b = api;
        this.f17413c = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    /* renamed from: a */
    public final void mo13980a(ConnectionResult connectionResult) {
        zaak zaakVar = this.f17411a.get();
        if (zaakVar == null) {
            return;
        }
        Preconditions.m14376o(Looper.myLooper() == zaakVar.f17485a.f17546s.mo13878o(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zaakVar.f17486b.lock();
        try {
            if (zaakVar.m14150t(0)) {
                if (!connectionResult.m13795e0()) {
                    zaakVar.m14146p(connectionResult, this.f17412b, this.f17413c);
                }
                if (zaakVar.m14139i()) {
                    zaakVar.m14140j();
                }
            }
        } finally {
            zaakVar.f17486b.unlock();
        }
    }
}
