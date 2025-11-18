package p241e.p254e.p256b.p257a.p258i.p262c0;

import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8884d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: TimeModule_UptimeClockFactory.java */
/* renamed from: e.e.b.a.i.c0.d */
/* loaded from: classes2.dex */
public final class C8857d implements InterfaceC8882b<InterfaceC8854a> {

    /* compiled from: TimeModule_UptimeClockFactory.java */
    /* renamed from: e.e.b.a.i.c0.d$a */
    private static final class a {

        /* renamed from: a */
        private static final C8857d f33570a = new C8857d();
    }

    /* renamed from: a */
    public static C8857d m28117a() {
        return a.f33570a;
    }

    /* renamed from: c */
    public static InterfaceC8854a m28118c() {
        return (InterfaceC8854a) C8884d.m28189c(AbstractC8855b.m28112b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC8854a get() {
        return m28118c();
    }
}
