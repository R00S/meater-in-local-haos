package p355k.p357b.p359f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import p355k.p357b.InterfaceC9731a;
import p355k.p357b.InterfaceC9732b;
import p355k.p357b.p358e.C9738d;

/* compiled from: SubstituteLoggerFactory.java */
/* renamed from: k.b.f.h */
/* loaded from: classes3.dex */
public class C9746h implements InterfaceC9731a {

    /* renamed from: a */
    boolean f37141a = false;

    /* renamed from: b */
    final Map<String, C9745g> f37142b = new HashMap();

    /* renamed from: c */
    final LinkedBlockingQueue<C9738d> f37143c = new LinkedBlockingQueue<>();

    @Override // p355k.p357b.InterfaceC9731a
    /* renamed from: a */
    public synchronized InterfaceC9732b mo32171a(String str) {
        C9745g c9745g;
        c9745g = this.f37142b.get(str);
        if (c9745g == null) {
            c9745g = new C9745g(str, this.f37143c, this.f37141a);
            this.f37142b.put(str, c9745g);
        }
        return c9745g;
    }

    /* renamed from: b */
    public void m32239b() {
        this.f37142b.clear();
        this.f37143c.clear();
    }

    /* renamed from: c */
    public LinkedBlockingQueue<C9738d> m32240c() {
        return this.f37143c;
    }

    /* renamed from: d */
    public List<C9745g> m32241d() {
        return new ArrayList(this.f37142b.values());
    }

    /* renamed from: e */
    public void m32242e() {
        this.f37141a = true;
    }
}
