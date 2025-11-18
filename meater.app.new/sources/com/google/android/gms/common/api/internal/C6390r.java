package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.r */
/* loaded from: classes2.dex */
final class C6390r implements GoogleApiClient.ConnectionCallbacks {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f17440f;

    /* renamed from: g */
    private final /* synthetic */ StatusPendingResult f17441g;

    /* renamed from: h */
    private final /* synthetic */ zaaw f17442h;

    C6390r(zaaw zaawVar, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.f17442h = zaawVar;
        this.f17440f = atomicReference;
        this.f17441g = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    /* renamed from: H */
    public final void mo13893H(int i2) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    /* renamed from: P */
    public final void mo13894P(Bundle bundle) {
        this.f17442h.m14167z((GoogleApiClient) this.f17440f.get(), this.f17441g, true);
    }
}
