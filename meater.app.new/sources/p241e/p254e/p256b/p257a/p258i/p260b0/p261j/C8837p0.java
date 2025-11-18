package p241e.p254e.p256b.p257a.p258i.p260b0.p261j;

import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8884d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: EventStoreModule_StoreConfigFactory.java */
/* renamed from: e.e.b.a.i.b0.j.p0 */
/* loaded from: classes2.dex */
public final class C8837p0 implements InterfaceC8882b<AbstractC8827k0> {

    /* compiled from: EventStoreModule_StoreConfigFactory.java */
    /* renamed from: e.e.b.a.i.b0.j.p0$a */
    private static final class a {

        /* renamed from: a */
        private static final C8837p0 f33513a = new C8837p0();
    }

    /* renamed from: a */
    public static C8837p0 m28019a() {
        return a.f33513a;
    }

    /* renamed from: c */
    public static AbstractC8827k0 m28020c() {
        return (AbstractC8827k0) C8884d.m28189c(AbstractC8829l0.m28007d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC8827k0 get() {
        return m28020c();
    }
}
