package D9;

import K8.q;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: classes2.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f3582a;

    /* renamed from: b, reason: collision with root package name */
    private final d f3583b;

    c(Set<f> set, d dVar) {
        this.f3582a = e(set);
        this.f3583b = dVar;
    }

    public static K8.c<i> c() {
        return K8.c.e(i.class).b(q.o(f.class)).f(new K8.g() { // from class: D9.b
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return c.d(dVar);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(K8.d dVar) {
        return new c(dVar.e(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // D9.i
    public String a() {
        if (this.f3583b.b().isEmpty()) {
            return this.f3582a;
        }
        return this.f3582a + ' ' + e(this.f3583b.b());
    }
}
