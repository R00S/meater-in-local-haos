package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class U2 {

    /* renamed from: a, reason: collision with root package name */
    private static X2 f33901a;

    public static synchronized X2 a() {
        try {
            if (f33901a == null) {
                b(new W2());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f33901a;
    }

    private static synchronized void b(X2 x22) {
        if (f33901a != null) {
            throw new IllegalStateException("init() already called");
        }
        f33901a = x22;
    }
}
