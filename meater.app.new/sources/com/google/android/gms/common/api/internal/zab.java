package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.util.PlatformVersion;

/* loaded from: classes2.dex */
public abstract class zab {

    /* renamed from: a */
    private final int f17532a;

    public zab(int i2) {
        this.f17532a = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static Status m14171a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (PlatformVersion.m14638b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: b */
    public abstract void mo14066b(Status status);

    /* renamed from: c */
    public abstract void mo14067c(GoogleApiManager.zaa<?> zaaVar) throws DeadObjectException;

    /* renamed from: d */
    public abstract void mo14173d(zaab zaabVar, boolean z);

    /* renamed from: e */
    public abstract void mo14068e(RuntimeException runtimeException);
}
