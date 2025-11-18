package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8854a;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: CreationContextFactory_Factory.java */
/* renamed from: com.google.android.datatransport.runtime.backends.j */
/* loaded from: classes2.dex */
public final class C6267j implements InterfaceC8882b<C6266i> {

    /* renamed from: a */
    private final Provider<Context> f16777a;

    /* renamed from: b */
    private final Provider<InterfaceC8854a> f16778b;

    /* renamed from: c */
    private final Provider<InterfaceC8854a> f16779c;

    public C6267j(Provider<Context> provider, Provider<InterfaceC8854a> provider2, Provider<InterfaceC8854a> provider3) {
        this.f16777a = provider;
        this.f16778b = provider2;
        this.f16779c = provider3;
    }

    /* renamed from: a */
    public static C6267j m13527a(Provider<Context> provider, Provider<InterfaceC8854a> provider2, Provider<InterfaceC8854a> provider3) {
        return new C6267j(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C6266i m13528c(Context context, InterfaceC8854a interfaceC8854a, InterfaceC8854a interfaceC8854a2) {
        return new C6266i(context, interfaceC8854a, interfaceC8854a2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6266i get() {
        return m13528c(this.f16777a.get(), this.f16778b.get(), this.f16779c.get());
    }
}
