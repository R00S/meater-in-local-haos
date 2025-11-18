package p355k.p357b.p360g;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p355k.p357b.InterfaceC9731a;
import p355k.p357b.InterfaceC9732b;

/* compiled from: SimpleLoggerFactory.java */
/* renamed from: k.b.g.b */
/* loaded from: classes3.dex */
public class C9749b implements InterfaceC9731a {

    /* renamed from: a */
    ConcurrentMap<String, InterfaceC9732b> f37160a = new ConcurrentHashMap();

    public C9749b() throws IOException {
        C9748a.m32254r();
    }

    @Override // p355k.p357b.InterfaceC9731a
    /* renamed from: a */
    public InterfaceC9732b mo32171a(String str) {
        InterfaceC9732b interfaceC9732b = this.f37160a.get(str);
        if (interfaceC9732b != null) {
            return interfaceC9732b;
        }
        C9748a c9748a = new C9748a(str);
        InterfaceC9732b interfaceC9732bPutIfAbsent = this.f37160a.putIfAbsent(str, c9748a);
        return interfaceC9732bPutIfAbsent == null ? c9748a : interfaceC9732bPutIfAbsent;
    }
}
