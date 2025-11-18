package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzy<T> {

    /* renamed from: a */
    public final T f27423a;

    /* renamed from: b */
    public final zzc f27424b;

    /* renamed from: c */
    public final zzaf f27425c;

    /* renamed from: d */
    public boolean f27426d;

    private zzy(T t, zzc zzcVar) {
        this.f27426d = false;
        this.f27423a = t;
        this.f27424b = zzcVar;
        this.f27425c = null;
    }

    /* renamed from: a */
    public static <T> zzy<T> m20817a(T t, zzc zzcVar) {
        return new zzy<>(t, zzcVar);
    }

    /* renamed from: b */
    public static <T> zzy<T> m20818b(zzaf zzafVar) {
        return new zzy<>(zzafVar);
    }

    private zzy(zzaf zzafVar) {
        this.f27426d = false;
        this.f27423a = null;
        this.f27424b = null;
        this.f27425c = zzafVar;
    }
}
