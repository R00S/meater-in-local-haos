package p241e.p254e.p256b.p257a.p258i.p260b0.p261j;

import android.content.Context;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: SchemaManager_Factory.java */
/* renamed from: e.e.b.a.i.b0.j.u0 */
/* loaded from: classes2.dex */
public final class C8847u0 implements InterfaceC8882b<C8845t0> {

    /* renamed from: a */
    private final Provider<Context> f33548a;

    /* renamed from: b */
    private final Provider<String> f33549b;

    /* renamed from: c */
    private final Provider<Integer> f33550c;

    public C8847u0(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f33548a = provider;
        this.f33549b = provider2;
        this.f33550c = provider3;
    }

    /* renamed from: a */
    public static C8847u0 m28093a(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new C8847u0(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C8845t0 m28094c(Context context, String str, int i2) {
        return new C8845t0(context, str, i2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8845t0 get() {
        return m28094c(this.f33548a.get(), this.f33549b.get(), this.f33550c.get().intValue());
    }
}
