package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import p024c.p041e.C0867a;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.k0 */
/* loaded from: classes2.dex */
class C8442k0 {

    /* renamed from: a */
    private final Executor f32006a;

    /* renamed from: b */
    private final Map<String, Task<String>> f32007b = new C0867a();

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.k0$a */
    interface a {
        Task<String> start();
    }

    C8442k0(Executor executor) {
        this.f32006a = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    synchronized Task<String> m26577a(final String str, a aVar) {
        Task<String> task = this.f32007b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String strValueOf = String.valueOf(str);
                Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Joining ongoing request for: ".concat(strValueOf) : new String("Joining ongoing request for: "));
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf2 = String.valueOf(str);
            Log.d("FirebaseMessaging", strValueOf2.length() != 0 ? "Making new request for: ".concat(strValueOf2) : new String("Making new request for: "));
        }
        Task taskMo23645h = aVar.start().mo23645h(this.f32006a, new Continuation(this, str) { // from class: com.google.firebase.messaging.j0

            /* renamed from: a */
            private final C8442k0 f32003a;

            /* renamed from: b */
            private final String f32004b;

            {
                this.f32003a = this;
                this.f32004b = str;
            }

            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: a */
            public Object mo13777a(Task task2) throws Exception {
                this.f32003a.m26578b(this.f32004b, task2);
                return task2;
            }
        });
        this.f32007b.put(str, taskMo23645h);
        return taskMo23645h;
    }

    /* renamed from: b */
    final /* synthetic */ Task m26578b(String str, Task task) throws Exception {
        synchronized (this) {
            this.f32007b.remove(str);
        }
        return task;
    }
}
