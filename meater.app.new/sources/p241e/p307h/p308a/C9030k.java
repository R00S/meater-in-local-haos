package p241e.p307h.p308a;

import com.liulishuo.filedownloader.message.BlockCompleteMessage;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.C8700b;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import p241e.p307h.p308a.InterfaceC8991a;
import p241e.p307h.p308a.InterfaceC9049x;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: FileDownloadMessenger.java */
/* renamed from: e.h.a.k */
/* loaded from: classes2.dex */
class C9030k implements InterfaceC9045t {

    /* renamed from: a */
    private InterfaceC8991a.b f34810a;

    /* renamed from: b */
    private InterfaceC8991a.d f34811b;

    /* renamed from: c */
    private Queue<MessageSnapshot> f34812c;

    /* renamed from: d */
    private boolean f34813d = false;

    C9030k(InterfaceC8991a.b bVar, InterfaceC8991a.d dVar) {
        m28930n(bVar, dVar);
    }

    /* renamed from: n */
    private void m28930n(InterfaceC8991a.b bVar, InterfaceC8991a.d dVar) {
        this.f34810a = bVar;
        this.f34811b = dVar;
        this.f34812c = new LinkedBlockingQueue();
    }

    /* renamed from: o */
    private void m28931o(int i2) {
        if (C8700b.m27601e(i2)) {
            if (!this.f34812c.isEmpty()) {
                MessageSnapshot messageSnapshotPeek = this.f34812c.peek();
                C9034d.m28970i(this, "the messenger[%s](with id[%d]) has already accomplished all his job, but there still are some messages in parcel queue[%d] queue-top-status[%d]", this, Integer.valueOf(messageSnapshotPeek.m27531e()), Integer.valueOf(this.f34812c.size()), Byte.valueOf(messageSnapshotPeek.mo27519k()));
            }
            this.f34810a = null;
        }
    }

    /* renamed from: q */
    private void m28932q(MessageSnapshot messageSnapshot) {
        InterfaceC8991a.b bVar = this.f34810a;
        if (bVar == null) {
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "occur this case, it would be the host task of this messenger has been over(paused/warn/completed/error) on the other thread before receiving the snapshot(id[%d], status[%d])", Integer.valueOf(messageSnapshot.m27531e()), Byte.valueOf(messageSnapshot.mo27519k()));
            }
        } else {
            if (!this.f34813d && bVar.mo28649v().mo28610G() != null) {
                this.f34812c.offer(messageSnapshot);
                C9027j.m28916d().m28921i(this);
                return;
            }
            if ((C9037l.m29022b() || this.f34810a.mo28646S()) && messageSnapshot.mo27519k() == 4) {
                this.f34811b.mo28655g();
            }
            m28931o(messageSnapshot.mo27519k());
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9045t
    /* renamed from: a */
    public boolean mo28933a() {
        return this.f34810a.mo28649v().mo28617U();
    }

    @Override // p241e.p307h.p308a.InterfaceC9045t
    /* renamed from: b */
    public void mo28934b(MessageSnapshot messageSnapshot) {
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "notify pending %s", this.f34810a);
        }
        this.f34811b.mo28656o();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9045t
    /* renamed from: c */
    public void mo28935c(MessageSnapshot messageSnapshot) {
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "notify paused %s", this.f34810a);
        }
        this.f34811b.mo28655g();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9045t
    /* renamed from: d */
    public void mo28936d(MessageSnapshot messageSnapshot) {
        if (C9034d.f34819a) {
            InterfaceC8991a.b bVar = this.f34810a;
            C9034d.m28962a(this, "notify error %s %s", bVar, bVar.mo28649v().mo28622e());
        }
        this.f34811b.mo28655g();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9045t
    /* renamed from: e */
    public void mo28937e(MessageSnapshot messageSnapshot) {
        if (C9034d.f34819a) {
            InterfaceC8991a interfaceC8991aMo28649v = this.f34810a.mo28649v();
            C9034d.m28962a(this, "notify retry %s %d %d %s", this.f34810a, Integer.valueOf(interfaceC8991aMo28649v.mo28636t()), Integer.valueOf(interfaceC8991aMo28649v.mo28621d()), interfaceC8991aMo28649v.mo28622e());
        }
        this.f34811b.mo28656o();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9045t
    /* renamed from: f */
    public void mo28938f(MessageSnapshot messageSnapshot) {
        InterfaceC8991a interfaceC8991aMo28649v = this.f34810a.mo28649v();
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "notify progress %s %d %d", interfaceC8991aMo28649v, Long.valueOf(interfaceC8991aMo28649v.mo28632o()), Long.valueOf(interfaceC8991aMo28649v.mo28609E()));
        }
        if (interfaceC8991aMo28649v.mo28612K() > 0) {
            this.f34811b.mo28656o();
            m28932q(messageSnapshot);
        } else if (C9034d.f34819a) {
            C9034d.m28962a(this, "notify progress but client not request notify %s", this.f34810a);
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9045t
    /* renamed from: g */
    public void mo28939g(MessageSnapshot messageSnapshot) {
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "notify warn %s", this.f34810a);
        }
        this.f34811b.mo28655g();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9045t
    /* renamed from: h */
    public void mo28940h(MessageSnapshot messageSnapshot) {
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "notify connected %s", this.f34810a);
        }
        this.f34811b.mo28656o();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9045t
    /* renamed from: i */
    public boolean mo28941i() {
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "notify begin %s", this.f34810a);
        }
        if (this.f34810a == null) {
            C9034d.m28970i(this, "can't begin the task, the holder fo the messenger is nil, %d", Integer.valueOf(this.f34812c.size()));
            return false;
        }
        this.f34811b.mo28657q();
        return true;
    }

    @Override // p241e.p307h.p308a.InterfaceC9045t
    /* renamed from: j */
    public boolean mo28942j() {
        return this.f34812c.peek().mo27519k() == 4;
    }

    @Override // p241e.p307h.p308a.InterfaceC9045t
    /* renamed from: k */
    public void mo28943k(MessageSnapshot messageSnapshot) {
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "notify block completed %s %s", this.f34810a, Thread.currentThread().getName());
        }
        this.f34811b.mo28656o();
        m28932q(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.InterfaceC9045t
    /* renamed from: l */
    public void mo28944l(MessageSnapshot messageSnapshot) {
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "notify started %s", this.f34810a);
        }
        this.f34811b.mo28656o();
        m28932q(messageSnapshot);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p241e.p307h.p308a.InterfaceC9045t
    /* renamed from: m */
    public void mo28945m() {
        if (this.f34813d) {
            return;
        }
        MessageSnapshot messageSnapshotPoll = this.f34812c.poll();
        byte bMo27519k = messageSnapshotPoll.mo27519k();
        InterfaceC8991a.b bVar = this.f34810a;
        if (bVar == null) {
            throw new IllegalArgumentException(C9036f.m29009o("can't handover the message, no master to receive this message(status[%d]) size[%d]", Integer.valueOf(bMo27519k), Integer.valueOf(this.f34812c.size())));
        }
        InterfaceC8991a interfaceC8991aMo28649v = bVar.mo28649v();
        AbstractC9024i abstractC9024iMo28610G = interfaceC8991aMo28649v.mo28610G();
        InterfaceC9049x.a aVarMo28652y = bVar.mo28652y();
        m28931o(bMo27519k);
        if (abstractC9024iMo28610G == null || abstractC9024iMo28610G.isInvalid()) {
            return;
        }
        if (bMo27519k == 4) {
            try {
                abstractC9024iMo28610G.blockComplete(interfaceC8991aMo28649v);
                m28946p(((BlockCompleteMessage) messageSnapshotPoll).mo27518b());
                return;
            } catch (Throwable th) {
                mo28936d(aVarMo28652y.mo28708l(th));
                return;
            }
        }
        AbstractC9010g abstractC9010g = abstractC9024iMo28610G instanceof AbstractC9010g ? (AbstractC9010g) abstractC9024iMo28610G : null;
        if (bMo27519k == -4) {
            abstractC9024iMo28610G.warn(interfaceC8991aMo28649v);
            return;
        }
        if (bMo27519k == -3) {
            abstractC9024iMo28610G.completed(interfaceC8991aMo28649v);
            return;
        }
        if (bMo27519k == -2) {
            if (abstractC9010g != null) {
                abstractC9010g.paused(interfaceC8991aMo28649v, messageSnapshotPoll.mo27527f(), messageSnapshotPoll.mo27522g());
                return;
            } else {
                abstractC9024iMo28610G.paused(interfaceC8991aMo28649v, messageSnapshotPoll.mo27520i(), messageSnapshotPoll.mo27521j());
                return;
            }
        }
        if (bMo27519k == -1) {
            abstractC9024iMo28610G.error(interfaceC8991aMo28649v, messageSnapshotPoll.mo27528l());
            return;
        }
        if (bMo27519k == 1) {
            if (abstractC9010g != null) {
                abstractC9010g.pending(interfaceC8991aMo28649v, messageSnapshotPoll.mo27527f(), messageSnapshotPoll.mo27522g());
                return;
            } else {
                abstractC9024iMo28610G.pending(interfaceC8991aMo28649v, messageSnapshotPoll.mo27520i(), messageSnapshotPoll.mo27521j());
                return;
            }
        }
        if (bMo27519k == 2) {
            if (abstractC9010g != null) {
                abstractC9010g.connected(interfaceC8991aMo28649v, messageSnapshotPoll.mo27524c(), messageSnapshotPoll.mo27526n(), interfaceC8991aMo28649v.mo28632o(), messageSnapshotPoll.mo27522g());
                return;
            } else {
                abstractC9024iMo28610G.connected(interfaceC8991aMo28649v, messageSnapshotPoll.mo27524c(), messageSnapshotPoll.mo27526n(), interfaceC8991aMo28649v.mo28608B(), messageSnapshotPoll.mo27521j());
                return;
            }
        }
        if (bMo27519k == 3) {
            if (abstractC9010g != null) {
                abstractC9010g.progress(interfaceC8991aMo28649v, messageSnapshotPoll.mo27527f(), interfaceC8991aMo28649v.mo28609E());
                return;
            } else {
                abstractC9024iMo28610G.progress(interfaceC8991aMo28649v, messageSnapshotPoll.mo27520i(), interfaceC8991aMo28649v.mo28626i());
                return;
            }
        }
        if (bMo27519k != 5) {
            if (bMo27519k != 6) {
                return;
            }
            abstractC9024iMo28610G.started(interfaceC8991aMo28649v);
        } else if (abstractC9010g != null) {
            abstractC9010g.retry(interfaceC8991aMo28649v, messageSnapshotPoll.mo27528l(), messageSnapshotPoll.mo27529h(), messageSnapshotPoll.mo27527f());
        } else {
            abstractC9024iMo28610G.retry(interfaceC8991aMo28649v, messageSnapshotPoll.mo27528l(), messageSnapshotPoll.mo27529h(), messageSnapshotPoll.mo27520i());
        }
    }

    /* renamed from: p */
    public void m28946p(MessageSnapshot messageSnapshot) {
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "notify completed %s", this.f34810a);
        }
        this.f34811b.mo28655g();
        m28932q(messageSnapshot);
    }

    public String toString() {
        Object[] objArr = new Object[2];
        InterfaceC8991a.b bVar = this.f34810a;
        objArr[0] = Integer.valueOf(bVar == null ? -1 : bVar.mo28649v().getId());
        objArr[1] = super.toString();
        return C9036f.m29009o("%d:%s", objArr);
    }
}
