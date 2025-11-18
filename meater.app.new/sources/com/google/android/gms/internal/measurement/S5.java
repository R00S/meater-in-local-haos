package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class S5 extends R5<T5, T5> {
    S5() {
    }

    private static void m(Object obj, T5 t52) {
        ((F4) obj).zzb = t52;
    }

    @Override // com.google.android.gms.internal.measurement.R5
    final /* synthetic */ int a(T5 t52) {
        return t52.a();
    }

    @Override // com.google.android.gms.internal.measurement.R5
    final /* synthetic */ T5 b(T5 t52, T5 t53) {
        T5 t54 = t52;
        T5 t55 = t53;
        return T5.k().equals(t55) ? t54 : T5.k().equals(t54) ? T5.c(t54, t55) : t54.b(t55);
    }

    @Override // com.google.android.gms.internal.measurement.R5
    final /* synthetic */ void c(T5 t52, int i10, Y3 y32) {
        t52.e((i10 << 3) | 2, y32);
    }

    @Override // com.google.android.gms.internal.measurement.R5
    final /* synthetic */ void d(T5 t52, InterfaceC2502i6 interfaceC2502i6) {
        t52.g(interfaceC2502i6);
    }

    @Override // com.google.android.gms.internal.measurement.R5
    final /* synthetic */ int e(T5 t52) {
        return t52.i();
    }

    @Override // com.google.android.gms.internal.measurement.R5
    final /* synthetic */ void f(T5 t52, int i10, long j10) {
        t52.e(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.measurement.R5
    final /* synthetic */ void g(T5 t52, InterfaceC2502i6 interfaceC2502i6) {
        t52.j(interfaceC2502i6);
    }

    @Override // com.google.android.gms.internal.measurement.R5
    final /* synthetic */ void h(Object obj, T5 t52) {
        m(obj, t52);
    }

    @Override // com.google.android.gms.internal.measurement.R5
    final /* synthetic */ T5 i(Object obj) {
        T5 t52 = ((F4) obj).zzb;
        if (t52 != T5.k()) {
            return t52;
        }
        T5 t5L = T5.l();
        m(obj, t5L);
        return t5L;
    }

    @Override // com.google.android.gms.internal.measurement.R5
    final /* synthetic */ void j(Object obj, T5 t52) {
        m(obj, t52);
    }

    @Override // com.google.android.gms.internal.measurement.R5
    final /* synthetic */ T5 k(Object obj) {
        return ((F4) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.R5
    final void l(Object obj) {
        ((F4) obj).zzb.m();
    }
}
