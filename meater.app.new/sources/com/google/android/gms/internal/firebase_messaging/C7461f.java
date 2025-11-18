package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase_messaging.f */
/* loaded from: classes2.dex */
final class C7461f extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f27616a;

    public C7461f(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f27616a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C7461f.class) {
            if (this == obj) {
                return true;
            }
            C7461f c7461f = (C7461f) obj;
            if (this.f27616a == c7461f.f27616a && get() == c7461f.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27616a;
    }
}
