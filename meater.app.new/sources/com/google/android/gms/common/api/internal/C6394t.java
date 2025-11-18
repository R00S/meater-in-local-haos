package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.t */
/* loaded from: classes2.dex */
final class C6394t implements ResultCallback<Status> {

    /* renamed from: a */
    private final /* synthetic */ StatusPendingResult f17459a;

    /* renamed from: b */
    private final /* synthetic */ boolean f17460b;

    /* renamed from: c */
    private final /* synthetic */ GoogleApiClient f17461c;

    /* renamed from: d */
    private final /* synthetic */ zaaw f17462d;

    C6394t(zaaw zaawVar, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.f17462d = zaawVar;
        this.f17459a = statusPendingResult;
        this.f17460b = z;
        this.f17461c = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    /* renamed from: a */
    public final /* synthetic */ void mo13908a(Result result) {
        Status status = (Status) result;
        Storage.m13705b(this.f17462d.f17512g).m13717l();
        if (status.m13915e0() && this.f17462d.mo13879p()) {
            this.f17462d.mo13882s();
        }
        this.f17459a.m13940k(status);
        if (this.f17460b) {
            this.f17461c.mo13872h();
        }
    }
}
