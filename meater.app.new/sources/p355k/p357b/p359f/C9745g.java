package p355k.p357b.p359f;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import p355k.p357b.InterfaceC9732b;
import p355k.p357b.p358e.C9735a;
import p355k.p357b.p358e.C9738d;
import p355k.p357b.p358e.InterfaceC9737c;

/* compiled from: SubstituteLogger.java */
/* renamed from: k.b.f.g */
/* loaded from: classes3.dex */
public class C9745g implements InterfaceC9732b {

    /* renamed from: f */
    private final String f37134f;

    /* renamed from: g */
    private volatile InterfaceC9732b f37135g;

    /* renamed from: h */
    private Boolean f37136h;

    /* renamed from: i */
    private Method f37137i;

    /* renamed from: j */
    private C9735a f37138j;

    /* renamed from: k */
    private Queue<C9738d> f37139k;

    /* renamed from: l */
    private final boolean f37140l;

    public C9745g(String str, Queue<C9738d> queue, boolean z) {
        this.f37134f = str;
        this.f37139k = queue;
        this.f37140l = z;
    }

    /* renamed from: k */
    private InterfaceC9732b m32231k() {
        if (this.f37138j == null) {
            this.f37138j = new C9735a(this, this.f37139k);
        }
        return this.f37138j;
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: a */
    public void mo32172a(String str, Object obj, Object obj2) {
        m32232j().mo32172a(str, obj, obj2);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: b */
    public boolean mo32173b() {
        return m32232j().mo32173b();
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: c */
    public void mo32174c(String str) {
        m32232j().mo32174c(str);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: d */
    public boolean mo32175d() {
        return m32232j().mo32175d();
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: e */
    public void mo32176e(String str, Throwable th) {
        m32232j().mo32176e(str, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C9745g.class == obj.getClass() && this.f37134f.equals(((C9745g) obj).f37134f);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: f */
    public void mo32177f(String str, Throwable th) {
        m32232j().mo32177f(str, th);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: g */
    public void mo32178g(String str, Throwable th) {
        m32232j().mo32178g(str, th);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: h */
    public void mo32179h(String str) {
        m32232j().mo32179h(str);
    }

    public int hashCode() {
        return this.f37134f.hashCode();
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: i */
    public void mo32180i(String str) {
        m32232j().mo32180i(str);
    }

    /* renamed from: j */
    InterfaceC9732b m32232j() {
        return this.f37135g != null ? this.f37135g : this.f37140l ? C9742d.f37132g : m32231k();
    }

    /* renamed from: l */
    public String m32233l() {
        return this.f37134f;
    }

    /* renamed from: m */
    public boolean m32234m() {
        Boolean bool = this.f37136h;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f37137i = this.f37135g.getClass().getMethod("log", InterfaceC9737c.class);
            this.f37136h = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f37136h = Boolean.FALSE;
        }
        return this.f37136h.booleanValue();
    }

    /* renamed from: n */
    public boolean m32235n() {
        return this.f37135g instanceof C9742d;
    }

    /* renamed from: o */
    public boolean m32236o() {
        return this.f37135g == null;
    }

    /* renamed from: p */
    public void m32237p(InterfaceC9737c interfaceC9737c) {
        if (m32234m()) {
            try {
                this.f37137i.invoke(this.f37135g, interfaceC9737c);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: q */
    public void m32238q(InterfaceC9732b interfaceC9732b) {
        this.f37135g = interfaceC9732b;
    }
}
