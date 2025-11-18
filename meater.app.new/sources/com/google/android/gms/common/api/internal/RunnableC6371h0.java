package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
/* loaded from: classes2.dex */
final class RunnableC6371h0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Result f17414f;

    /* renamed from: g */
    private final /* synthetic */ zacm f17415g;

    RunnableC6371h0(zacm zacmVar, Result result) {
        this.f17415g = zacmVar;
        this.f17414f = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                BasePendingResult.f17311a.set(Boolean.TRUE);
                this.f17415g.f17567a.m13911b(this.f17414f);
                HandlerC6373i0 unused = this.f17415g.f17573g;
                HandlerC6373i0 unused2 = this.f17415g.f17573g;
                throw null;
            } catch (RuntimeException unused3) {
                HandlerC6373i0 unused4 = this.f17415g.f17573g;
                HandlerC6373i0 unused5 = this.f17415g.f17573g;
                throw null;
            }
        } catch (Throwable th) {
            BasePendingResult.f17311a.set(Boolean.FALSE);
            zacm zacmVar = this.f17415g;
            zacm.m14195c(this.f17414f);
            GoogleApiClient googleApiClient = (GoogleApiClient) this.f17415g.f17572f.get();
            if (googleApiClient != null) {
                googleApiClient.mo13885v(this.f17415g);
            }
            throw th;
        }
    }
}
