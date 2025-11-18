package N8;

import S8.p;
import j9.InterfaceC3754a;
import j9.InterfaceC3755b;

/* compiled from: RemoteConfigDeferredProxy.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3754a<G9.a> f12583a;

    public l(InterfaceC3754a<G9.a> interfaceC3754a) {
        this.f12583a = interfaceC3754a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(e eVar, InterfaceC3755b interfaceC3755b) {
        ((G9.a) interfaceC3755b.get()).a("firebase", eVar);
        g.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void c(p pVar) {
        if (pVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final e eVar = new e(pVar);
            this.f12583a.a(new InterfaceC3754a.InterfaceC0558a() { // from class: N8.k
                @Override // j9.InterfaceC3754a.InterfaceC0558a
                public final void a(InterfaceC3755b interfaceC3755b) {
                    l.b(eVar, interfaceC3755b);
                }
            });
        }
    }
}
