package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase_messaging.g */
/* loaded from: classes2.dex */
final class C7462g {

    /* renamed from: a */
    private final ConcurrentHashMap<C7461f, List<Throwable>> f27617a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f27618b = new ReferenceQueue<>();

    C7462g() {
    }

    /* renamed from: a */
    public final List<Throwable> m20936a(Throwable th, boolean z) {
        ReferenceQueue<Throwable> referenceQueue = this.f27618b;
        while (true) {
            Reference<? extends Throwable> referencePoll = referenceQueue.poll();
            if (referencePoll == null) {
                break;
            }
            this.f27617a.remove(referencePoll);
            referenceQueue = this.f27618b;
        }
        List<Throwable> list = this.f27617a.get(new C7461f(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.f27617a.putIfAbsent(new C7461f(th, this.f27618b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
