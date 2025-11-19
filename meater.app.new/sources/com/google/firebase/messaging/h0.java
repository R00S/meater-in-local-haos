package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.k0;
import o3.ExecutorC4121m;
import z7.AbstractC5208j;
import z7.InterfaceC5203e;

/* compiled from: WithinAppServiceBinder.java */
/* loaded from: classes2.dex */
class h0 extends Binder {

    /* renamed from: B, reason: collision with root package name */
    private final a f38402B;

    /* compiled from: WithinAppServiceBinder.java */
    interface a {
        AbstractC5208j<Void> a(Intent intent);
    }

    h0(a aVar) {
        this.f38402B = aVar;
    }

    void c(final k0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f38402B.a(aVar.f38416a).b(new ExecutorC4121m(), new InterfaceC5203e() { // from class: com.google.firebase.messaging.g0
            @Override // z7.InterfaceC5203e
            public final void a(AbstractC5208j abstractC5208j) {
                aVar.d();
            }
        });
    }
}
