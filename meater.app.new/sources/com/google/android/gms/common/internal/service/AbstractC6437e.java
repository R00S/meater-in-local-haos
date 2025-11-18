package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.service.e */
/* loaded from: classes2.dex */
abstract class AbstractC6437e extends AbstractC6436d<Status> {
    public AbstractC6437e(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: h */
    public /* synthetic */ Result mo13718h(Status status) {
        return status;
    }
}
