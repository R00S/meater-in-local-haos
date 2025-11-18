package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: MetadataBackendRegistry_Factory.java */
/* renamed from: com.google.android.datatransport.runtime.backends.l */
/* loaded from: classes2.dex */
public final class C6269l implements InterfaceC8882b<C6268k> {

    /* renamed from: a */
    private final Provider<Context> f16785a;

    /* renamed from: b */
    private final Provider<C6266i> f16786b;

    public C6269l(Provider<Context> provider, Provider<C6266i> provider2) {
        this.f16785a = provider;
        this.f16786b = provider2;
    }

    /* renamed from: a */
    public static C6269l m13534a(Provider<Context> provider, Provider<C6266i> provider2) {
        return new C6269l(provider, provider2);
    }

    /* renamed from: c */
    public static C6268k m13535c(Context context, Object obj) {
        return new C6268k(context, (C6266i) obj);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6268k get() {
        return m13535c(this.f16785a.get(), this.f16786b.get());
    }
}
