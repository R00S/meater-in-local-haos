package androidx.work.impl.p013m.p014e;

import androidx.work.impl.p013m.InterfaceC0741a;
import androidx.work.impl.p013m.p015f.AbstractC0756d;
import androidx.work.impl.p016n.C0775p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ConstraintController.java */
/* renamed from: androidx.work.impl.m.e.c */
/* loaded from: classes.dex */
public abstract class AbstractC0747c<T> implements InterfaceC0741a<T> {

    /* renamed from: a */
    private final List<String> f4735a = new ArrayList();

    /* renamed from: b */
    private T f4736b;

    /* renamed from: c */
    private AbstractC0756d<T> f4737c;

    /* renamed from: d */
    private a f4738d;

    /* compiled from: ConstraintController.java */
    /* renamed from: androidx.work.impl.m.e.c$a */
    public interface a {
        /* renamed from: a */
        void mo5031a(List<String> list);

        /* renamed from: b */
        void mo5032b(List<String> list);
    }

    AbstractC0747c(AbstractC0756d<T> abstractC0756d) {
        this.f4737c = abstractC0756d;
    }

    /* renamed from: h */
    private void m5040h(a aVar, T t) {
        if (this.f4735a.isEmpty() || aVar == null) {
            return;
        }
        if (t == null || mo5037c(t)) {
            aVar.mo5032b(this.f4735a);
        } else {
            aVar.mo5031a(this.f4735a);
        }
    }

    @Override // androidx.work.impl.p013m.InterfaceC0741a
    /* renamed from: a */
    public void mo5026a(T t) {
        this.f4736b = t;
        m5040h(this.f4738d, t);
    }

    /* renamed from: b */
    abstract boolean mo5036b(C0775p c0775p);

    /* renamed from: c */
    abstract boolean mo5037c(T t);

    /* renamed from: d */
    public boolean m5041d(String str) {
        T t = this.f4736b;
        return t != null && mo5037c(t) && this.f4735a.contains(str);
    }

    /* renamed from: e */
    public void m5042e(Iterable<C0775p> iterable) {
        this.f4735a.clear();
        for (C0775p c0775p : iterable) {
            if (mo5036b(c0775p)) {
                this.f4735a.add(c0775p.f4799c);
            }
        }
        if (this.f4735a.isEmpty()) {
            this.f4737c.m5059c(this);
        } else {
            this.f4737c.m5058a(this);
        }
        m5040h(this.f4738d, this.f4736b);
    }

    /* renamed from: f */
    public void m5043f() {
        if (this.f4735a.isEmpty()) {
            return;
        }
        this.f4735a.clear();
        this.f4737c.m5059c(this);
    }

    /* renamed from: g */
    public void m5044g(a aVar) {
        if (this.f4738d != aVar) {
            this.f4738d = aVar;
            m5040h(aVar, this.f4736b);
        }
    }
}
