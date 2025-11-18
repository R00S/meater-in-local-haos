package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.GoogleApiManager;

/* loaded from: classes2.dex */
public final class zae<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>> extends zab {

    /* renamed from: b */
    private final A f17579b;

    public zae(int i2, A a) {
        super(i2);
        this.f17579b = a;
    }

    @Override // com.google.android.gms.common.api.internal.zab
    /* renamed from: b */
    public final void mo14066b(Status status) {
        this.f17579b.m13934y(status);
    }

    @Override // com.google.android.gms.common.api.internal.zab
    /* renamed from: c */
    public final void mo14067c(GoogleApiManager.zaa<?> zaaVar) throws DeadObjectException {
        try {
            this.f17579b.m13933w(zaaVar.m14013l());
        } catch (RuntimeException e2) {
            mo14068e(e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zab
    /* renamed from: d */
    public final void mo14173d(zaab zaabVar, boolean z) {
        zaabVar.m14109b(this.f17579b, z);
    }

    @Override // com.google.android.gms.common.api.internal.zab
    /* renamed from: e */
    public final void mo14068e(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f17579b.m13934y(new Status(10, sb.toString()));
    }
}
