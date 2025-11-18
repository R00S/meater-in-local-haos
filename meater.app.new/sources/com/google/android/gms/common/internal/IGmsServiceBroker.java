package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public interface IGmsServiceBroker extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class Stub extends Binder implements IGmsServiceBroker {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        @KeepForSdk
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
        @Override // android.os.Binder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.IGmsServiceBroker.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    @KeepForSdk
    /* renamed from: U1 */
    void mo14352U1(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) throws RemoteException;
}
