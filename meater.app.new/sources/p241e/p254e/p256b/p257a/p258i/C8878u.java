package p241e.p254e.p256b.p257a.p258i;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6291u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6293w;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import p241e.p254e.p256b.p257a.C8785b;
import p241e.p254e.p256b.p257a.InterfaceC8790g;
import p241e.p254e.p256b.p257a.InterfaceC8791h;
import p241e.p254e.p256b.p257a.p258i.p260b0.InterfaceC8801e;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8854a;

/* compiled from: TransportRuntime.java */
@Singleton
/* renamed from: e.e.b.a.i.u */
/* loaded from: classes2.dex */
public class C8878u implements InterfaceC8877t {

    /* renamed from: a */
    private static volatile AbstractC8879v f33617a;

    /* renamed from: b */
    private final InterfaceC8854a f33618b;

    /* renamed from: c */
    private final InterfaceC8854a f33619c;

    /* renamed from: d */
    private final InterfaceC8801e f33620d;

    /* renamed from: e */
    private final C6291u f33621e;

    @Inject
    C8878u(InterfaceC8854a interfaceC8854a, InterfaceC8854a interfaceC8854a2, InterfaceC8801e interfaceC8801e, C6291u c6291u, C6293w c6293w) {
        this.f33618b = interfaceC8854a;
        this.f33619c = interfaceC8854a2;
        this.f33620d = interfaceC8801e;
        this.f33621e = c6291u;
        c6293w.m13593a();
    }

    /* renamed from: b */
    private AbstractC8867j m28175b(AbstractC8873p abstractC8873p) {
        return AbstractC8867j.m28150a().mo28107i(this.f33618b.mo28110a()).mo28109k(this.f33619c.mo28110a()).mo28108j(abstractC8873p.mo28125g()).mo28106h(new C8866i(abstractC8873p.mo28121b(), abstractC8873p.m28168d())).mo28105g(abstractC8873p.mo28122c().mo27942a()).mo28102d();
    }

    /* renamed from: c */
    public static C8878u m28176c() {
        AbstractC8879v abstractC8879v = f33617a;
        if (abstractC8879v != null) {
            return abstractC8879v.mo28144b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C8785b> m28177d(InterfaceC8864g interfaceC8864g) {
        return interfaceC8864g instanceof InterfaceC8865h ? Collections.unmodifiableSet(((InterfaceC8865h) interfaceC8864g).mo13398a()) : Collections.singleton(C8785b.m27945b("proto"));
    }

    /* renamed from: f */
    public static void m28178f(Context context) {
        if (f33617a == null) {
            synchronized (C8878u.class) {
                if (f33617a == null) {
                    f33617a = C8863f.m28141c().mo28145a(context).mo28147c();
                }
            }
        }
    }

    @Override // p241e.p254e.p256b.p257a.p258i.InterfaceC8877t
    /* renamed from: a */
    public void mo28174a(AbstractC8873p abstractC8873p, InterfaceC8791h interfaceC8791h) {
        this.f33620d.mo27960a(abstractC8873p.mo28124f().m28171f(abstractC8873p.mo28122c().mo27944c()), m28175b(abstractC8873p), interfaceC8791h);
    }

    /* renamed from: e */
    public C6291u m28179e() {
        return this.f33621e;
    }

    /* renamed from: g */
    public InterfaceC8790g m28180g(InterfaceC8864g interfaceC8864g) {
        return new C8875r(m28177d(interfaceC8864g), AbstractC8874q.m28169a().mo28138b(interfaceC8864g.getName()).mo28139c(interfaceC8864g.getExtras()).mo28137a(), this);
    }
}
