package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.InterfaceC6262e;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6296a;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8823i0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8825j0;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8854a;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: Uploader_Factory.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.v */
/* loaded from: classes2.dex */
public final class C6292v implements InterfaceC8882b<C6291u> {

    /* renamed from: a */
    private final Provider<Context> f16848a;

    /* renamed from: b */
    private final Provider<InterfaceC6262e> f16849b;

    /* renamed from: c */
    private final Provider<InterfaceC8825j0> f16850c;

    /* renamed from: d */
    private final Provider<InterfaceC6295y> f16851d;

    /* renamed from: e */
    private final Provider<Executor> f16852e;

    /* renamed from: f */
    private final Provider<InterfaceC6296a> f16853f;

    /* renamed from: g */
    private final Provider<InterfaceC8854a> f16854g;

    /* renamed from: h */
    private final Provider<InterfaceC8854a> f16855h;

    /* renamed from: i */
    private final Provider<InterfaceC8823i0> f16856i;

    public C6292v(Provider<Context> provider, Provider<InterfaceC6262e> provider2, Provider<InterfaceC8825j0> provider3, Provider<InterfaceC6295y> provider4, Provider<Executor> provider5, Provider<InterfaceC6296a> provider6, Provider<InterfaceC8854a> provider7, Provider<InterfaceC8854a> provider8, Provider<InterfaceC8823i0> provider9) {
        this.f16848a = provider;
        this.f16849b = provider2;
        this.f16850c = provider3;
        this.f16851d = provider4;
        this.f16852e = provider5;
        this.f16853f = provider6;
        this.f16854g = provider7;
        this.f16855h = provider8;
        this.f16856i = provider9;
    }

    /* renamed from: a */
    public static C6292v m13588a(Provider<Context> provider, Provider<InterfaceC6262e> provider2, Provider<InterfaceC8825j0> provider3, Provider<InterfaceC6295y> provider4, Provider<Executor> provider5, Provider<InterfaceC6296a> provider6, Provider<InterfaceC8854a> provider7, Provider<InterfaceC8854a> provider8, Provider<InterfaceC8823i0> provider9) {
        return new C6292v(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    /* renamed from: c */
    public static C6291u m13589c(Context context, InterfaceC6262e interfaceC6262e, InterfaceC8825j0 interfaceC8825j0, InterfaceC6295y interfaceC6295y, Executor executor, InterfaceC6296a interfaceC6296a, InterfaceC8854a interfaceC8854a, InterfaceC8854a interfaceC8854a2, InterfaceC8823i0 interfaceC8823i0) {
        return new C6291u(context, interfaceC6262e, interfaceC8825j0, interfaceC6295y, executor, interfaceC6296a, interfaceC8854a, interfaceC8854a2, interfaceC8823i0);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6291u get() {
        return m13589c(this.f16848a.get(), this.f16849b.get(), this.f16850c.get(), this.f16851d.get(), this.f16852e.get(), this.f16853f.get(), this.f16854g.get(), this.f16855h.get(), this.f16856i.get());
    }
}
