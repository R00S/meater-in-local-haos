package p241e.p307h.p308a;

import com.liulishuo.filedownloader.message.C8695c;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.InterfaceC8991a;
import p241e.p307h.p308a.p315k0.C9034d;

/* compiled from: FileDownloadList.java */
/* renamed from: e.h.a.h */
/* loaded from: classes2.dex */
public class C9019h {

    /* renamed from: a */
    private final ArrayList<InterfaceC8991a.b> f34782a;

    /* compiled from: FileDownloadList.java */
    /* renamed from: e.h.a.h$b */
    private static final class b {

        /* renamed from: a */
        private static final C9019h f34783a = new C9019h();
    }

    /* renamed from: i */
    public static C9019h m28890i() {
        return b.f34783a;
    }

    /* renamed from: a */
    void m28891a(InterfaceC8991a.b bVar) {
        if (!bVar.mo28649v().mo28633p()) {
            bVar.mo28641F();
        }
        if (bVar.mo28652y().mo28703f().mo28941i()) {
            m28892b(bVar);
        }
    }

    /* renamed from: b */
    void m28892b(InterfaceC8991a.b bVar) {
        if (bVar.mo28642H()) {
            return;
        }
        synchronized (this.f34782a) {
            if (this.f34782a.contains(bVar)) {
                C9034d.m28970i(this, "already has %s", bVar);
            } else {
                bVar.mo28647T();
                this.f34782a.add(bVar);
                if (C9034d.f34819a) {
                    C9034d.m28969h(this, "add list in all %s %d %d", bVar, Byte.valueOf(bVar.mo28649v().getStatus()), Integer.valueOf(this.f34782a.size()));
                }
            }
        }
    }

    /* renamed from: c */
    List<InterfaceC8991a.b> m28893c(int i2, AbstractC9024i abstractC9024i) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f34782a) {
            Iterator<InterfaceC8991a.b> it = this.f34782a.iterator();
            while (it.hasNext()) {
                InterfaceC8991a.b next = it.next();
                if (next.mo28649v().mo28610G() == abstractC9024i && !next.mo28649v().mo28633p()) {
                    next.mo28640C(i2);
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    List<InterfaceC8991a.b> m28894d(AbstractC9024i abstractC9024i) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f34782a) {
            Iterator<InterfaceC8991a.b> it = this.f34782a.iterator();
            while (it.hasNext()) {
                InterfaceC8991a.b next = it.next();
                if (next.mo28653z(abstractC9024i)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    int m28895e(int i2) {
        int i3;
        synchronized (this.f34782a) {
            Iterator<InterfaceC8991a.b> it = this.f34782a.iterator();
            i3 = 0;
            while (it.hasNext()) {
                if (it.next().mo28639A(i2)) {
                    i3++;
                }
            }
        }
        return i3;
    }

    /* renamed from: f */
    void m28896f(List<InterfaceC8991a.b> list) {
        synchronized (this.f34782a) {
            Iterator<InterfaceC8991a.b> it = this.f34782a.iterator();
            while (it.hasNext()) {
                InterfaceC8991a.b next = it.next();
                if (!list.contains(next)) {
                    list.add(next);
                }
            }
            this.f34782a.clear();
        }
    }

    /* renamed from: g */
    public InterfaceC8991a.b m28897g(int i2) {
        synchronized (this.f34782a) {
            Iterator<InterfaceC8991a.b> it = this.f34782a.iterator();
            while (it.hasNext()) {
                InterfaceC8991a.b next = it.next();
                if (next.mo28639A(i2)) {
                    return next;
                }
            }
            return null;
        }
    }

    /* renamed from: h */
    List<InterfaceC8991a.b> m28898h(int i2) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f34782a) {
            Iterator<InterfaceC8991a.b> it = this.f34782a.iterator();
            while (it.hasNext()) {
                InterfaceC8991a.b next = it.next();
                if (next.mo28639A(i2) && !next.mo28645P()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    List<InterfaceC8991a.b> m28899j(int i2) {
        byte status;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f34782a) {
            Iterator<InterfaceC8991a.b> it = this.f34782a.iterator();
            while (it.hasNext()) {
                InterfaceC8991a.b next = it.next();
                if (next.mo28639A(i2) && !next.mo28645P() && (status = next.mo28649v().getStatus()) != 0 && status != 10) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    boolean m28900k(InterfaceC8991a.b bVar) {
        return this.f34782a.isEmpty() || !this.f34782a.contains(bVar);
    }

    /* renamed from: l */
    public boolean m28901l(InterfaceC8991a.b bVar, MessageSnapshot messageSnapshot) {
        boolean zRemove;
        byte bMo27519k = messageSnapshot.mo27519k();
        synchronized (this.f34782a) {
            zRemove = this.f34782a.remove(bVar);
            if (zRemove && this.f34782a.size() == 0 && C9038m.m29029b().mo27611v0()) {
                C9042q.m29052e().m29065n(true);
            }
        }
        if (C9034d.f34819a && this.f34782a.size() == 0) {
            C9034d.m28969h(this, "remove %s left %d %d", bVar, Byte.valueOf(bMo27519k), Integer.valueOf(this.f34782a.size()));
        }
        if (zRemove) {
            InterfaceC9045t interfaceC9045tMo28703f = bVar.mo28652y().mo28703f();
            if (bMo27519k == -4) {
                interfaceC9045tMo28703f.mo28939g(messageSnapshot);
            } else if (bMo27519k == -3) {
                interfaceC9045tMo28703f.mo28943k(C8695c.m27545f(messageSnapshot));
            } else if (bMo27519k == -2) {
                interfaceC9045tMo28703f.mo28935c(messageSnapshot);
            } else if (bMo27519k == -1) {
                interfaceC9045tMo28703f.mo28936d(messageSnapshot);
            }
        } else {
            C9034d.m28963b(this, "remove error, not exist: %s %d", bVar, Byte.valueOf(bMo27519k));
        }
        return zRemove;
    }

    /* renamed from: m */
    int m28902m() {
        return this.f34782a.size();
    }

    private C9019h() {
        this.f34782a = new ArrayList<>();
    }
}
