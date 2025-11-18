package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.l */
/* loaded from: classes2.dex */
final class C6338l {

    /* renamed from: a */
    private final Messenger f17168a;

    /* renamed from: b */
    private final zza f17169b;

    C6338l(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f17168a = new Messenger(iBinder);
            this.f17169b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f17169b = new zza(iBinder);
            this.f17168a = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    final void m13774a(Message message) throws RemoteException {
        Messenger messenger = this.f17168a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zza zzaVar = this.f17169b;
        if (zzaVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        zzaVar.m13780b(message);
    }
}
