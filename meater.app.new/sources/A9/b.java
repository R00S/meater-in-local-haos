package A9;

import j9.InterfaceC3755b;
import v9.C4925a;

/* compiled from: FlgTransport.java */
/* loaded from: classes2.dex */
final class b {

    /* renamed from: d, reason: collision with root package name */
    private static final C4925a f1047d = C4925a.e();

    /* renamed from: a, reason: collision with root package name */
    private final String f1048a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3755b<K6.j> f1049b;

    /* renamed from: c, reason: collision with root package name */
    private K6.i<C9.i> f1050c;

    b(InterfaceC3755b<K6.j> interfaceC3755b, String str) {
        this.f1048a = str;
        this.f1049b = interfaceC3755b;
    }

    private boolean a() {
        if (this.f1050c == null) {
            K6.j jVar = this.f1049b.get();
            if (jVar != null) {
                this.f1050c = jVar.a(this.f1048a, C9.i.class, K6.c.b("proto"), new K6.h() { // from class: A9.a
                    @Override // K6.h
                    public final Object apply(Object obj) {
                        return ((C9.i) obj).w();
                    }
                });
            } else {
                f1047d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f1050c != null;
    }

    public void b(C9.i iVar) {
        if (a()) {
            this.f1050c.b(K6.d.f(iVar));
        } else {
            f1047d.j("Unable to dispatch event because Flg Transport is not available");
        }
    }
}
