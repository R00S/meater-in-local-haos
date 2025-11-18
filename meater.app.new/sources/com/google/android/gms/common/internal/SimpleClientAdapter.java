package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public class SimpleClientAdapter<T extends IInterface> extends GmsClient<T> {

    /* renamed from: d */
    private final Api.SimpleClient<T> f17798d;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected T createServiceInterface(IBinder iBinder) {
        return (T) this.f17798d.createServiceInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected String getServiceDescriptor() {
        return this.f17798d.getServiceDescriptor();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected String getStartServiceAction() {
        return this.f17798d.getStartServiceAction();
    }

    /* renamed from: j */
    public Api.SimpleClient<T> m14400j() {
        return this.f17798d;
    }
}
