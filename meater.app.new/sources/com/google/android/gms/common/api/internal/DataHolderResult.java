package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@KeepForSdk
/* loaded from: classes2.dex */
public class DataHolderResult implements Releasable, Result {

    /* renamed from: f */
    @KeepForSdk
    protected final Status f17328f;

    /* renamed from: g */
    @KeepForSdk
    protected final DataHolder f17329g;

    @Override // com.google.android.gms.common.api.Releasable
    @KeepForSdk
    /* renamed from: c */
    public void mo13849c() {
        DataHolder dataHolder = this.f17329g;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.api.Result
    @KeepForSdk
    public Status getStatus() {
        return this.f17328f;
    }
}
