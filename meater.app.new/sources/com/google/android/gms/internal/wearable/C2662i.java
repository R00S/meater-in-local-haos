package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2662i extends AbstractC2672l0 implements O0 {
    private static final C2662i zzb;
    private byte zze = 2;
    private InterfaceC2687q0 zzd = AbstractC2672l0.q();

    static {
        C2662i c2662i = new C2662i();
        zzb = c2662i;
        AbstractC2672l0.w(C2662i.class, c2662i);
    }

    private C2662i() {
    }

    public static P1 C() {
        return (P1) zzb.i();
    }

    static /* synthetic */ void E(C2662i c2662i, Iterable iterable) {
        InterfaceC2687q0 interfaceC2687q0 = c2662i.zzd;
        if (!interfaceC2687q0.d()) {
            c2662i.zzd = AbstractC2672l0.r(interfaceC2687q0);
        }
        C.e(iterable, c2662i.zzd);
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC2672l0
    protected final Object g(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i11 == 2) {
            return AbstractC2672l0.t(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", C2656g.class});
        }
        if (i11 == 3) {
            return new C2662i();
        }
        C2659h c2659h = null;
        if (i11 == 4) {
            return new P1(c2659h);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
