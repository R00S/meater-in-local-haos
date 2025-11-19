package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import b7.C2262l;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes2.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Messenger f33437a;

    /* renamed from: b, reason: collision with root package name */
    private final C2262l f33438b;

    h(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f33437a = new Messenger(iBinder);
            this.f33438b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f33438b = new C2262l(iBinder);
            this.f33437a = null;
        }
    }

    final void a(Message message) throws RemoteException {
        Messenger messenger = this.f33437a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C2262l c2262l = this.f33438b;
        if (c2262l == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        c2262l.b(message);
    }
}
