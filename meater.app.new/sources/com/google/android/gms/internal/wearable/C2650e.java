package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2650e extends AbstractC2672l0 implements O0 {
    private static final C2650e zzb;
    private int zzd;
    private double zzg;
    private float zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private long zzr;
    private byte zzs = 2;
    private P zze = P.f34503C;
    private String zzf = "";
    private InterfaceC2687q0 zzm = AbstractC2672l0.q();
    private InterfaceC2687q0 zzn = AbstractC2672l0.q();
    private InterfaceC2687q0 zzo = AbstractC2672l0.q();
    private InterfaceC2684p0 zzp = AbstractC2672l0.p();
    private InterfaceC2681o0 zzq = AbstractC2672l0.o();

    static {
        C2650e c2650e = new C2650e();
        zzb = c2650e;
        AbstractC2672l0.w(C2650e.class, c2650e);
    }

    private C2650e() {
    }

    static /* synthetic */ void C(C2650e c2650e, double d10) {
        c2650e.zzd |= 4;
        c2650e.zzg = d10;
    }

    static /* synthetic */ void D(C2650e c2650e, float f10) {
        c2650e.zzd |= 8;
        c2650e.zzh = f10;
    }

    static /* synthetic */ void E(C2650e c2650e, int i10) {
        c2650e.zzd |= 32;
        c2650e.zzj = i10;
    }

    static /* synthetic */ void F(C2650e c2650e, long j10) {
        c2650e.zzd |= 16;
        c2650e.zzi = j10;
    }

    static /* synthetic */ void G(C2650e c2650e, String str) {
        c2650e.zzd |= 2;
        c2650e.zzf = str;
    }

    public static C2647d H() {
        return (C2647d) zzb.i();
    }

    static /* synthetic */ void J(C2650e c2650e, Iterable iterable) {
        InterfaceC2687q0 interfaceC2687q0 = c2650e.zzm;
        if (!interfaceC2687q0.d()) {
            c2650e.zzm = AbstractC2672l0.r(interfaceC2687q0);
        }
        C.e(iterable, c2650e.zzm);
    }

    static /* synthetic */ void K(C2650e c2650e, Iterable iterable) {
        InterfaceC2681o0 interfaceC2681o0 = c2650e.zzq;
        if (!interfaceC2681o0.d()) {
            int size = interfaceC2681o0.size();
            c2650e.zzq = interfaceC2681o0.C(size + size);
        }
        C.e(iterable, c2650e.zzq);
    }

    static /* synthetic */ void L(C2650e c2650e, Iterable iterable) {
        InterfaceC2684p0 interfaceC2684p0 = c2650e.zzp;
        if (!interfaceC2684p0.d()) {
            int size = interfaceC2684p0.size();
            c2650e.zzp = interfaceC2684p0.C(size + size);
        }
        C.e(iterable, c2650e.zzp);
    }

    static /* synthetic */ void M(C2650e c2650e, Iterable iterable) {
        InterfaceC2687q0 interfaceC2687q0 = c2650e.zzo;
        if (!interfaceC2687q0.d()) {
            c2650e.zzo = AbstractC2672l0.r(interfaceC2687q0);
        }
        C.e(iterable, c2650e.zzo);
    }

    static /* synthetic */ void N(C2650e c2650e, C2653f c2653f) {
        c2653f.getClass();
        InterfaceC2687q0 interfaceC2687q0 = c2650e.zzn;
        if (!interfaceC2687q0.d()) {
            c2650e.zzn = AbstractC2672l0.r(interfaceC2687q0);
        }
        c2650e.zzn.add(c2653f);
    }

    static /* synthetic */ void O(C2650e c2650e, long j10) {
        c2650e.zzd |= 256;
        c2650e.zzr = j10;
    }

    static /* synthetic */ void P(C2650e c2650e, boolean z10) {
        c2650e.zzd |= 128;
        c2650e.zzl = z10;
    }

    static /* synthetic */ void Q(C2650e c2650e, int i10) {
        c2650e.zzd |= 64;
        c2650e.zzk = i10;
    }

    static /* synthetic */ void R(C2650e c2650e, P p10) {
        c2650e.zzd |= 1;
        c2650e.zze = p10;
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC2672l0
    protected final Object g(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzs);
        }
        if (i11 == 2) {
            return AbstractC2672l0.t(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", C2656g.class, "zzn", C2653f.class, "zzo", "zzp", "zzr", "zzq"});
        }
        if (i11 == 3) {
            return new C2650e();
        }
        C2659h c2659h = null;
        if (i11 == 4) {
            return new C2647d(c2659h);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzs = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
