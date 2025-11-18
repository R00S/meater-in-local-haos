package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.IStatusCallback;

@KeepForSdk
/* loaded from: classes2.dex */
public class StatusCallback extends IStatusCallback.Stub {

    /* renamed from: f */
    @KeepForSdk
    private final BaseImplementation.ResultHolder<Status> f17386f;

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    @KeepForSdk
    /* renamed from: p2 */
    public void mo14024p2(Status status) {
        this.f17386f.mo13929a(status);
    }
}
