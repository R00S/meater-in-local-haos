package p241e.p307h.p308a;

import p241e.p307h.p308a.p312h0.AbstractC9022c;
import p241e.p307h.p308a.p312h0.AbstractC9023d;
import p241e.p307h.p308a.p312h0.C9021b;

/* compiled from: FileDownloadConnectListener.java */
/* renamed from: e.h.a.e */
/* loaded from: classes2.dex */
public abstract class AbstractC8999e extends AbstractC9023d {

    /* renamed from: a */
    private C9021b.a f34636a;

    @Override // p241e.p307h.p308a.p312h0.AbstractC9023d
    /* renamed from: d */
    public boolean mo28713d(AbstractC9022c abstractC9022c) {
        if (!(abstractC9022c instanceof C9021b)) {
            return false;
        }
        C9021b.a aVarM28908b = ((C9021b) abstractC9022c).m28908b();
        this.f34636a = aVarM28908b;
        if (aVarM28908b == C9021b.a.connected) {
            mo28714e();
            return false;
        }
        mo28715f();
        return false;
    }

    /* renamed from: e */
    public abstract void mo28714e();

    /* renamed from: f */
    public abstract void mo28715f();

    /* renamed from: g */
    public C9021b.a m28716g() {
        return this.f34636a;
    }
}
