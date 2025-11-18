package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.e1 */
/* loaded from: classes2.dex */
final class C7499e1 extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f27718a;

    public C7499e1(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f27718a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C7499e1.class) {
            if (this == obj) {
                return true;
            }
            C7499e1 c7499e1 = (C7499e1) obj;
            if (this.f27718a == c7499e1.f27718a && get() == c7499e1.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27718a;
    }
}
