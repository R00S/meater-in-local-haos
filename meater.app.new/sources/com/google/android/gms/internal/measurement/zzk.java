package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzk extends zzq {

    /* renamed from: f */
    private final AtomicReference<Bundle> f28283f = new AtomicReference<>();

    /* renamed from: g */
    private boolean f28284g;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r4 = r4.get("r");
     */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T m22442P(android.os.Bundle r4, java.lang.Class<T> r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L38
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L38
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received"
            java.lang.String r2 = ": %s, %s"
            java.lang.String r1 = r1.concat(r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = java.lang.String.format(r1, r2)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzk.m22442P(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    /* renamed from: E0 */
    public final Bundle m22443E0(long j2) {
        Bundle bundle;
        synchronized (this.f28283f) {
            if (!this.f28284g) {
                try {
                    this.f28283f.wait(j2);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f28283f.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzn
    /* renamed from: J */
    public final void mo22444J(Bundle bundle) {
        synchronized (this.f28283f) {
            try {
                this.f28283f.set(bundle);
                this.f28284g = true;
            } finally {
                this.f28283f.notify();
            }
        }
    }

    /* renamed from: k0 */
    public final String m22445k0(long j2) {
        return (String) m22442P(m22443E0(j2), String.class);
    }
}
