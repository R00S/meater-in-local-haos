package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public final class Q0 extends T0 {

    /* renamed from: B, reason: collision with root package name */
    private final AtomicReference<Bundle> f33843B = new AtomicReference<>();

    /* renamed from: C, reason: collision with root package name */
    private boolean f33844C;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T k(android.os.Bundle r3, java.lang.Class<T> r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L3e
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected object type. Expected, Received"
            r1.append(r2)
            java.lang.String r2 = ": %s, %s"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3}
            java.lang.String r3 = java.lang.String.format(r1, r3)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Q0.k(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle g(long j10) {
        Bundle bundle;
        synchronized (this.f33843B) {
            if (!this.f33844C) {
                try {
                    this.f33843B.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f33843B.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.U0
    public final void h(Bundle bundle) {
        synchronized (this.f33843B) {
            try {
                try {
                    this.f33843B.set(bundle);
                    this.f33844C = true;
                } finally {
                    this.f33843B.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Long u1(long j10) {
        return (Long) k(g(j10), Long.class);
    }

    public final String v1(long j10) {
        return (String) k(g(j10), String.class);
    }
}
