package p241e.p254e.p256b.p257a.p258i.p260b0.p261j;

import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8884d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: EventStoreModule_DbNameFactory.java */
/* renamed from: e.e.b.a.i.b0.j.m0 */
/* loaded from: classes2.dex */
public final class C8831m0 implements InterfaceC8882b<String> {

    /* compiled from: EventStoreModule_DbNameFactory.java */
    /* renamed from: e.e.b.a.i.b0.j.m0$a */
    private static final class a {

        /* renamed from: a */
        private static final C8831m0 f33502a = new C8831m0();
    }

    /* renamed from: a */
    public static C8831m0 m28008a() {
        return a.f33502a;
    }

    /* renamed from: b */
    public static String m28009b() {
        return (String) C8884d.m28189c(AbstractC8829l0.m28004a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m28009b();
    }
}
