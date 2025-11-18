package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.ServiceConnectionC8424b1;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.y0 */
/* loaded from: classes2.dex */
class BinderC8470y0 extends Binder {

    /* renamed from: f */
    private final a f32090f;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.y0$a */
    interface a {
        /* renamed from: a */
        Task<Void> mo26539a(Intent intent);
    }

    BinderC8470y0(a aVar) {
        this.f32090f = aVar;
    }

    /* renamed from: b */
    void m26672b(final ServiceConnectionC8424b1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f32090f.mo26539a(aVar.f31974a).mo23640c(ExecutorC8466w0.f32084f, new OnCompleteListener(aVar) { // from class: com.google.firebase.messaging.x0

            /* renamed from: a */
            private final ServiceConnectionC8424b1.a f32086a;

            {
                this.f32086a = aVar;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            /* renamed from: a */
            public void mo7019a(Task task) {
                this.f32086a.m26498b();
            }
        });
    }
}
