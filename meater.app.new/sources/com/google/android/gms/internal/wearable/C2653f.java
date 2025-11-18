package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2653f extends AbstractC2672l0 implements O0 {
    private static final C2653f zzb;
    private int zzd;
    private C2650e zzf;
    private byte zzg = 2;
    private int zze = 1;

    static {
        C2653f c2653f = new C2653f();
        zzb = c2653f;
        AbstractC2672l0.w(C2653f.class, c2653f);
    }

    private C2653f() {
    }

    public static R1 C() {
        return (R1) zzb.i();
    }

    static /* synthetic */ void E(C2653f c2653f, C2650e c2650e) {
        c2650e.getClass();
        c2653f.zzf = c2650e;
        c2653f.zzd |= 2;
    }

    static /* synthetic */ void G(C2653f c2653f, int i10) {
        c2653f.zze = i10;
        c2653f.zzd |= 1;
    }

    public final int F() {
        int iA = C2644c.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC2672l0
    protected final Object g(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC2672l0.t(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᐉ\u0001", new Object[]{"zzd", "zze", C2641b.f34553a, "zzf"});
        }
        if (i11 == 3) {
            return new C2653f();
        }
        C2659h c2659h = null;
        if (i11 == 4) {
            return new R1(c2659h);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
