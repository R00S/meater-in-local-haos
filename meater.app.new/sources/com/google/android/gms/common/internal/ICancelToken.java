package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public interface ICancelToken extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class Stub extends zzb implements ICancelToken {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @Override // com.google.android.gms.internal.common.zzb
        /* renamed from: H */
        protected final boolean mo14348H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel() throws RemoteException;
}
