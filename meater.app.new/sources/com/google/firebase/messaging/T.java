package com.google.firebase.messaging;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import s.C4391a;
import z7.AbstractC5208j;
import z7.InterfaceC5201c;

/* compiled from: RequestDeduplicator.java */
/* loaded from: classes2.dex */
class T {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f38299a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, AbstractC5208j<String>> f38300b = new C4391a();

    /* compiled from: RequestDeduplicator.java */
    interface a {
        AbstractC5208j<String> start();
    }

    T(Executor executor) {
        this.f38299a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC5208j c(String str, AbstractC5208j abstractC5208j) {
        synchronized (this) {
            this.f38300b.remove(str);
        }
        return abstractC5208j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized AbstractC5208j<String> b(final String str, a aVar) {
        AbstractC5208j<String> abstractC5208j = this.f38300b.get(str);
        if (abstractC5208j != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return abstractC5208j;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        AbstractC5208j abstractC5208jI = aVar.start().i(this.f38299a, new InterfaceC5201c() { // from class: com.google.firebase.messaging.S
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j2) {
                return this.f38296a.c(str, abstractC5208j2);
            }
        });
        this.f38300b.put(str, abstractC5208jI);
        return abstractC5208jI;
    }
}
