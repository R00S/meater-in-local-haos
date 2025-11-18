package p241e.p254e.p256b.p257a.p258i.p260b0.p261j;

import android.content.Context;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8884d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: EventStoreModule_PackageNameFactory.java */
/* renamed from: e.e.b.a.i.b0.j.n0 */
/* loaded from: classes2.dex */
public final class C8833n0 implements InterfaceC8882b<String> {

    /* renamed from: a */
    private final Provider<Context> f33507a;

    public C8833n0(Provider<Context> provider) {
        this.f33507a = provider;
    }

    /* renamed from: a */
    public static C8833n0 m28012a(Provider<Context> provider) {
        return new C8833n0(provider);
    }

    /* renamed from: c */
    public static String m28013c(Context context) {
        return (String) C8884d.m28189c(AbstractC8829l0.m28005b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m28013c(this.f33507a.get());
    }
}
