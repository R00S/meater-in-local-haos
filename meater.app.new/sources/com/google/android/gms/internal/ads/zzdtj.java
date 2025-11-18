package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdtj<T> implements zzdte<T>, zzdti<T> {

    /* renamed from: a */
    private static final zzdtj<Object> f25987a = new zzdtj<>(null);

    /* renamed from: b */
    private final T f25988b;

    private zzdtj(T t) {
        this.f25988b = t;
    }

    /* renamed from: a */
    public static <T> zzdti<T> m19869a(T t) {
        return new zzdtj(zzdto.m19874b(t, "instance cannot be null"));
    }

    @Override // com.google.android.gms.internal.ads.zzdte, com.google.android.gms.internal.ads.zzdtu
    public final T get() {
        return this.f25988b;
    }
}
