package p323h.p324a.p327x;

import io.reactivex.exceptions.C9240a;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import p323h.p324a.p329z.p330a.InterfaceC9102b;
import p323h.p324a.p329z.p331b.C9108b;
import p323h.p324a.p329z.p344j.C9178c;
import p323h.p324a.p329z.p344j.C9180e;

/* compiled from: CompositeDisposable.java */
/* renamed from: h.a.x.b */
/* loaded from: classes2.dex */
public final class C9088b implements InterfaceC9089c, InterfaceC9102b {

    /* renamed from: f */
    C9180e<InterfaceC9089c> f34937f;

    /* renamed from: g */
    volatile boolean f34938g;

    @Override // p323h.p324a.p329z.p330a.InterfaceC9102b
    /* renamed from: a */
    public boolean mo29238a(InterfaceC9089c interfaceC9089c) {
        if (!mo29240c(interfaceC9089c)) {
            return false;
        }
        interfaceC9089c.mo29115k();
        return true;
    }

    @Override // p323h.p324a.p329z.p330a.InterfaceC9102b
    /* renamed from: b */
    public boolean mo29239b(InterfaceC9089c interfaceC9089c) {
        C9108b.m29271c(interfaceC9089c, "disposable is null");
        if (!this.f34938g) {
            synchronized (this) {
                if (!this.f34938g) {
                    C9180e<InterfaceC9089c> c9180e = this.f34937f;
                    if (c9180e == null) {
                        c9180e = new C9180e<>();
                        this.f34937f = c9180e;
                    }
                    c9180e.m29396a(interfaceC9089c);
                    return true;
                }
            }
        }
        interfaceC9089c.mo29115k();
        return false;
    }

    @Override // p323h.p324a.p329z.p330a.InterfaceC9102b
    /* renamed from: c */
    public boolean mo29240c(InterfaceC9089c interfaceC9089c) {
        C9108b.m29271c(interfaceC9089c, "disposables is null");
        if (this.f34938g) {
            return false;
        }
        synchronized (this) {
            if (this.f34938g) {
                return false;
            }
            C9180e<InterfaceC9089c> c9180e = this.f34937f;
            if (c9180e != null && c9180e.m29399e(interfaceC9089c)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    void m29241d(C9180e<InterfaceC9089c> c9180e) {
        if (c9180e == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c9180e.m29397b()) {
            if (obj instanceof InterfaceC9089c) {
                try {
                    ((InterfaceC9089c) obj).mo29115k();
                } catch (Throwable th) {
                    C9240a.m30000a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw C9178c.m29391c((Throwable) arrayList.get(0));
        }
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: k */
    public void mo29115k() {
        if (this.f34938g) {
            return;
        }
        synchronized (this) {
            if (this.f34938g) {
                return;
            }
            this.f34938g = true;
            C9180e<InterfaceC9089c> c9180e = this.f34937f;
            this.f34937f = null;
            m29241d(c9180e);
        }
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: q */
    public boolean mo29116q() {
        return this.f34938g;
    }
}
