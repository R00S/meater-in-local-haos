package p355k.p357b.p358e;

import java.util.Queue;
import p355k.p357b.InterfaceC9732b;
import p355k.p357b.InterfaceC9734d;
import p355k.p357b.p359f.C9745g;

/* compiled from: EventRecodingLogger.java */
/* renamed from: k.b.e.a */
/* loaded from: classes3.dex */
public class C9735a implements InterfaceC9732b {

    /* renamed from: f */
    String f37109f;

    /* renamed from: g */
    C9745g f37110g;

    /* renamed from: h */
    Queue<C9738d> f37111h;

    public C9735a(C9745g c9745g, Queue<C9738d> queue) {
        this.f37110g = c9745g;
        this.f37109f = c9745g.m32233l();
        this.f37111h = queue;
    }

    /* renamed from: j */
    private void m32199j(EnumC9736b enumC9736b, String str, Object[] objArr, Throwable th) {
        m32200k(enumC9736b, null, str, objArr, th);
    }

    /* renamed from: k */
    private void m32200k(EnumC9736b enumC9736b, InterfaceC9734d interfaceC9734d, String str, Object[] objArr, Throwable th) {
        C9738d c9738d = new C9738d();
        c9738d.m32209i(System.currentTimeMillis());
        c9738d.m32203c(enumC9736b);
        c9738d.m32204d(this.f37110g);
        c9738d.m32205e(this.f37109f);
        c9738d.m32206f(str);
        c9738d.m32202b(objArr);
        c9738d.m32208h(th);
        c9738d.m32207g(Thread.currentThread().getName());
        this.f37111h.add(c9738d);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: a */
    public void mo32172a(String str, Object obj, Object obj2) {
        m32199j(EnumC9736b.DEBUG, str, new Object[]{obj, obj2}, null);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: b */
    public boolean mo32173b() {
        return true;
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: c */
    public void mo32174c(String str) {
        m32199j(EnumC9736b.TRACE, str, null, null);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: d */
    public boolean mo32175d() {
        return true;
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: e */
    public void mo32176e(String str, Throwable th) {
        m32199j(EnumC9736b.INFO, str, null, th);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: f */
    public void mo32177f(String str, Throwable th) {
        m32199j(EnumC9736b.WARN, str, null, th);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: g */
    public void mo32178g(String str, Throwable th) {
        m32199j(EnumC9736b.DEBUG, str, null, th);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: h */
    public void mo32179h(String str) {
        m32199j(EnumC9736b.WARN, str, null, null);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: i */
    public void mo32180i(String str) {
        m32199j(EnumC9736b.TRACE, str, null, null);
    }
}
