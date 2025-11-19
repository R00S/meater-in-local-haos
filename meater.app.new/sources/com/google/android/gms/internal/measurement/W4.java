package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class W4 implements T4 {
    W4() {
    }

    private static <E> L4<E> c(Object obj, long j10) {
        return (L4) V5.B(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.T4
    public final void a(Object obj, long j10) {
        c(obj, j10).b();
    }

    @Override // com.google.android.gms.internal.measurement.T4
    public final <E> void b(Object obj, Object obj2, long j10) {
        L4 l4C = c(obj, j10);
        L4 l4C2 = c(obj2, j10);
        int size = l4C.size();
        int size2 = l4C2.size();
        if (size > 0 && size2 > 0) {
            if (!l4C.d()) {
                l4C = l4C.g(size2 + size);
            }
            l4C.addAll(l4C2);
        }
        if (size > 0) {
            l4C2 = l4C;
        }
        V5.j(obj, j10, l4C2);
    }
}
