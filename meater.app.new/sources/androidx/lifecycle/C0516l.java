package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC0511g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p024c.p033b.p034a.p035a.C0850a;
import p024c.p033b.p034a.p036b.C0853a;
import p024c.p033b.p034a.p036b.C0854b;

/* compiled from: LifecycleRegistry.java */
/* renamed from: androidx.lifecycle.l */
/* loaded from: classes.dex */
public class C0516l extends AbstractC0511g {

    /* renamed from: b */
    private C0853a<InterfaceC0514j, a> f3480b;

    /* renamed from: c */
    private AbstractC0511g.c f3481c;

    /* renamed from: d */
    private final WeakReference<InterfaceC0515k> f3482d;

    /* renamed from: e */
    private int f3483e;

    /* renamed from: f */
    private boolean f3484f;

    /* renamed from: g */
    private boolean f3485g;

    /* renamed from: h */
    private ArrayList<AbstractC0511g.c> f3486h;

    /* renamed from: i */
    private final boolean f3487i;

    /* compiled from: LifecycleRegistry.java */
    /* renamed from: androidx.lifecycle.l$a */
    static class a {

        /* renamed from: a */
        AbstractC0511g.c f3488a;

        /* renamed from: b */
        InterfaceC0513i f3489b;

        a(InterfaceC0514j interfaceC0514j, AbstractC0511g.c cVar) {
            this.f3489b = C0519o.m3888f(interfaceC0514j);
            this.f3488a = cVar;
        }

        /* renamed from: a */
        void m3882a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) {
            AbstractC0511g.c cVarM3866k = bVar.m3866k();
            this.f3488a = C0516l.m3874k(this.f3488a, cVarM3866k);
            this.f3489b.mo124a(interfaceC0515k, bVar);
            this.f3488a = cVarM3866k;
        }
    }

    public C0516l(InterfaceC0515k interfaceC0515k) {
        this(interfaceC0515k, true);
    }

    /* renamed from: d */
    private void m3869d(InterfaceC0515k interfaceC0515k) {
        Iterator<Map.Entry<InterfaceC0514j, a>> itM5381c = this.f3480b.m5381c();
        while (itM5381c.hasNext() && !this.f3485g) {
            Map.Entry<InterfaceC0514j, a> next = itM5381c.next();
            a value = next.getValue();
            while (value.f3488a.compareTo(this.f3481c) > 0 && !this.f3485g && this.f3480b.contains(next.getKey())) {
                AbstractC0511g.b bVarM3864g = AbstractC0511g.b.m3864g(value.f3488a);
                if (bVarM3864g == null) {
                    throw new IllegalStateException("no event down from " + value.f3488a);
                }
                m3877n(bVarM3864g.m3866k());
                value.m3882a(interfaceC0515k, bVarM3864g);
                m3876m();
            }
        }
    }

    /* renamed from: e */
    private AbstractC0511g.c m3870e(InterfaceC0514j interfaceC0514j) {
        Map.Entry<InterfaceC0514j, a> entryM5380r = this.f3480b.m5380r(interfaceC0514j);
        AbstractC0511g.c cVar = null;
        AbstractC0511g.c cVar2 = entryM5380r != null ? entryM5380r.getValue().f3488a : null;
        if (!this.f3486h.isEmpty()) {
            cVar = this.f3486h.get(r0.size() - 1);
        }
        return m3874k(m3874k(this.f3481c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    private void m3871f(String str) {
        if (!this.f3487i || C0850a.m5372e().mo5374b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private void m3872g(InterfaceC0515k interfaceC0515k) {
        C0854b<InterfaceC0514j, a>.d dVarM5383h = this.f3480b.m5383h();
        while (dVarM5383h.hasNext() && !this.f3485g) {
            Map.Entry next = dVarM5383h.next();
            a aVar = (a) next.getValue();
            while (aVar.f3488a.compareTo(this.f3481c) < 0 && !this.f3485g && this.f3480b.contains(next.getKey())) {
                m3877n(aVar.f3488a);
                AbstractC0511g.b bVarM3865q = AbstractC0511g.b.m3865q(aVar.f3488a);
                if (bVarM3865q == null) {
                    throw new IllegalStateException("no event up from " + aVar.f3488a);
                }
                aVar.m3882a(interfaceC0515k, bVarM3865q);
                m3876m();
            }
        }
    }

    /* renamed from: i */
    private boolean m3873i() {
        if (this.f3480b.size() == 0) {
            return true;
        }
        AbstractC0511g.c cVar = this.f3480b.m5382f().getValue().f3488a;
        AbstractC0511g.c cVar2 = this.f3480b.m5384i().getValue().f3488a;
        return cVar == cVar2 && this.f3481c == cVar2;
    }

    /* renamed from: k */
    static AbstractC0511g.c m3874k(AbstractC0511g.c cVar, AbstractC0511g.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    /* renamed from: l */
    private void m3875l(AbstractC0511g.c cVar) {
        if (this.f3481c == cVar) {
            return;
        }
        this.f3481c = cVar;
        if (this.f3484f || this.f3483e != 0) {
            this.f3485g = true;
            return;
        }
        this.f3484f = true;
        m3878p();
        this.f3484f = false;
    }

    /* renamed from: m */
    private void m3876m() {
        this.f3486h.remove(r0.size() - 1);
    }

    /* renamed from: n */
    private void m3877n(AbstractC0511g.c cVar) {
        this.f3486h.add(cVar);
    }

    /* renamed from: p */
    private void m3878p() {
        InterfaceC0515k interfaceC0515k = this.f3482d.get();
        if (interfaceC0515k == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (!m3873i()) {
            this.f3485g = false;
            if (this.f3481c.compareTo(this.f3480b.m5382f().getValue().f3488a) < 0) {
                m3869d(interfaceC0515k);
            }
            Map.Entry<InterfaceC0514j, a> entryM5384i = this.f3480b.m5384i();
            if (!this.f3485g && entryM5384i != null && this.f3481c.compareTo(entryM5384i.getValue().f3488a) > 0) {
                m3872g(interfaceC0515k);
            }
        }
        this.f3485g = false;
    }

    @Override // androidx.lifecycle.AbstractC0511g
    /* renamed from: a */
    public void mo3861a(InterfaceC0514j interfaceC0514j) {
        InterfaceC0515k interfaceC0515k;
        m3871f("addObserver");
        AbstractC0511g.c cVar = this.f3481c;
        AbstractC0511g.c cVar2 = AbstractC0511g.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = AbstractC0511g.c.INITIALIZED;
        }
        a aVar = new a(interfaceC0514j, cVar2);
        if (this.f3480b.mo5378o(interfaceC0514j, aVar) == null && (interfaceC0515k = this.f3482d.get()) != null) {
            boolean z = this.f3483e != 0 || this.f3484f;
            AbstractC0511g.c cVarM3870e = m3870e(interfaceC0514j);
            this.f3483e++;
            while (aVar.f3488a.compareTo(cVarM3870e) < 0 && this.f3480b.contains(interfaceC0514j)) {
                m3877n(aVar.f3488a);
                AbstractC0511g.b bVarM3865q = AbstractC0511g.b.m3865q(aVar.f3488a);
                if (bVarM3865q == null) {
                    throw new IllegalStateException("no event up from " + aVar.f3488a);
                }
                aVar.m3882a(interfaceC0515k, bVarM3865q);
                m3876m();
                cVarM3870e = m3870e(interfaceC0514j);
            }
            if (!z) {
                m3878p();
            }
            this.f3483e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0511g
    /* renamed from: b */
    public AbstractC0511g.c mo3862b() {
        return this.f3481c;
    }

    @Override // androidx.lifecycle.AbstractC0511g
    /* renamed from: c */
    public void mo3863c(InterfaceC0514j interfaceC0514j) {
        m3871f("removeObserver");
        this.f3480b.mo5379q(interfaceC0514j);
    }

    /* renamed from: h */
    public void m3879h(AbstractC0511g.b bVar) {
        m3871f("handleLifecycleEvent");
        m3875l(bVar.m3866k());
    }

    @Deprecated
    /* renamed from: j */
    public void m3880j(AbstractC0511g.c cVar) {
        m3871f("markState");
        m3881o(cVar);
    }

    /* renamed from: o */
    public void m3881o(AbstractC0511g.c cVar) {
        m3871f("setCurrentState");
        m3875l(cVar);
    }

    private C0516l(InterfaceC0515k interfaceC0515k, boolean z) {
        this.f3480b = new C0853a<>();
        this.f3483e = 0;
        this.f3484f = false;
        this.f3485g = false;
        this.f3486h = new ArrayList<>();
        this.f3482d = new WeakReference<>(interfaceC0515k);
        this.f3481c = AbstractC0511g.c.INITIALIZED;
        this.f3487i = z;
    }
}
