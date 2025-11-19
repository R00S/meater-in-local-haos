package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2656g extends AbstractC2672l0 implements O0 {
    private static final C2656g zzb;
    private int zzd;
    private C2653f zzf;
    private byte zzg = 2;
    private String zze = "";

    static {
        C2656g c2656g = new C2656g();
        zzb = c2656g;
        AbstractC2672l0.w(C2656g.class, c2656g);
    }

    private C2656g() {
    }

    public static Q1 C() {
        return (Q1) zzb.i();
    }

    static /* synthetic */ void E(C2656g c2656g, String str) {
        str.getClass();
        c2656g.zzd |= 1;
        c2656g.zze = str;
    }

    static /* synthetic */ void F(C2656g c2656g, C2653f c2653f) {
        c2653f.getClass();
        c2656g.zzf = c2653f;
        c2656g.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC2672l0
    protected final Object g(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC2672l0.t(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2656g();
        }
        C2659h c2659h = null;
        if (i11 == 4) {
            return new Q1(c2659h);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
