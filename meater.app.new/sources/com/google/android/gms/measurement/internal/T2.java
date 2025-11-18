package com.google.android.gms.measurement.internal;

import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class T2 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ E5 f35172B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ S2 f35173C;

    T2(S2 s22, E5 e52) {
        this.f35172B = e52;
        this.f35173C = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35173C.f35164B.N0();
        C2880y5 c2880y5 = this.f35173C.f35164B;
        E5 e52 = this.f35172B;
        c2880y5.o().n();
        c2880y5.O0();
        C3445p.e(e52.f34806B);
        c2880y5.i(e52);
    }
}
