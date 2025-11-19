package com.google.android.gms.internal.wearable;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class R0 implements Z0 {

    /* renamed from: a, reason: collision with root package name */
    private final N0 f34522a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2670k1 f34523b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34524c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2639a0 f34525d;

    private R0(AbstractC2670k1 abstractC2670k1, AbstractC2639a0 abstractC2639a0, N0 n02) {
        this.f34523b = abstractC2670k1;
        this.f34524c = n02 instanceof AbstractC2666j0;
        this.f34525d = abstractC2639a0;
        this.f34522a = n02;
    }

    static R0 i(AbstractC2670k1 abstractC2670k1, AbstractC2639a0 abstractC2639a0, N0 n02) {
        return new R0(abstractC2670k1, abstractC2639a0, n02);
    }

    @Override // com.google.android.gms.internal.wearable.Z0
    public final void a(Object obj, x1 x1Var) {
        Iterator itE = ((AbstractC2666j0) obj).zzb.e();
        while (itE.hasNext()) {
            Map.Entry entry = (Map.Entry) itE.next();
            InterfaceC2648d0 interfaceC2648d0 = (InterfaceC2648d0) entry.getKey();
            if (interfaceC2648d0.d() != w1.MESSAGE || interfaceC2648d0.h() || interfaceC2648d0.f()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C2694t0) {
                x1Var.A(interfaceC2648d0.a(), ((C2694t0) entry).a().b());
            } else {
                x1Var.A(interfaceC2648d0.a(), entry.getValue());
            }
        }
        ((AbstractC2672l0) obj).zzc.i(x1Var);
    }

    @Override // com.google.android.gms.internal.wearable.Z0
    public final int b(Object obj) {
        int iB = ((AbstractC2672l0) obj).zzc.b();
        return this.f34524c ? iB + ((AbstractC2666j0) obj).zzb.c() : iB;
    }

    @Override // com.google.android.gms.internal.wearable.Z0
    public final int c(Object obj) {
        int iHashCode = ((AbstractC2672l0) obj).zzc.hashCode();
        return this.f34524c ? (iHashCode * 53) + ((AbstractC2666j0) obj).zzb.f34561a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.wearable.Z0
    public final void d(Object obj) {
        this.f34523b.a(obj);
        this.f34525d.a(obj);
    }

    @Override // com.google.android.gms.internal.wearable.Z0
    public final boolean e(Object obj) {
        return ((AbstractC2666j0) obj).zzb.h();
    }

    @Override // com.google.android.gms.internal.wearable.Z0
    public final void f(Object obj, Object obj2) {
        C2643b1.t(this.f34523b, obj, obj2);
        if (this.f34524c) {
            C2643b1.s(this.f34525d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.wearable.Z0
    public final boolean g(Object obj, Object obj2) {
        if (!((AbstractC2672l0) obj).zzc.equals(((AbstractC2672l0) obj2).zzc)) {
            return false;
        }
        if (this.f34524c) {
            return ((AbstractC2666j0) obj).zzb.equals(((AbstractC2666j0) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.wearable.Z0
    public final Object h() {
        N0 n02 = this.f34522a;
        return n02 instanceof AbstractC2672l0 ? ((AbstractC2672l0) n02).k() : n02.m().z();
    }
}
