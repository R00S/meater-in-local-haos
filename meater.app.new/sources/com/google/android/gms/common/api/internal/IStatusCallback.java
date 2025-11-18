package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public interface IStatusCallback extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.base.zab implements IStatusCallback {

        public static class zaa extends com.google.android.gms.internal.base.zaa implements IStatusCallback {
        }

        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // com.google.android.gms.internal.base.zab
        /* renamed from: E3 */
        protected boolean mo14025E3(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 != 1) {
                return false;
            }
            mo14024p2((Status) com.google.android.gms.internal.base.zac.m20894b(parcel, Status.CREATOR));
            return true;
        }
    }

    /* renamed from: p2 */
    void mo14024p2(Status status) throws RemoteException;
}
