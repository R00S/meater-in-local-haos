package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class zzczb implements zzdti<ThreadFactory> {

    /* renamed from: a */
    private static final zzczb f25361a = new zzczb();

    /* renamed from: a */
    public static zzczb m19091a() {
        return f25361a;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (ThreadFactory) zzdto.m19874b(new ThreadFactoryC6534bq(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
