package p241e.p307h.p308a;

import com.liulishuo.filedownloader.message.C8695c;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.C8700b;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.io.File;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import p241e.p307h.p308a.InterfaceC8991a;
import p241e.p307h.p308a.InterfaceC9049x;
import p241e.p307h.p308a.p315k0.C9033c;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: DownloadTaskHunter.java */
/* renamed from: e.h.a.d */
/* loaded from: classes2.dex */
public class C8997d implements InterfaceC9049x, InterfaceC9049x.b, InterfaceC9049x.a, InterfaceC8991a.d {

    /* renamed from: a */
    private InterfaceC9045t f34620a;

    /* renamed from: b */
    private final Object f34621b;

    /* renamed from: c */
    private final a f34622c;

    /* renamed from: f */
    private final InterfaceC9044s f34625f;

    /* renamed from: g */
    private final InterfaceC9043r f34626g;

    /* renamed from: h */
    private long f34627h;

    /* renamed from: i */
    private long f34628i;

    /* renamed from: j */
    private int f34629j;

    /* renamed from: k */
    private boolean f34630k;

    /* renamed from: l */
    private boolean f34631l;

    /* renamed from: m */
    private String f34632m;

    /* renamed from: d */
    private volatile byte f34623d = 0;

    /* renamed from: e */
    private Throwable f34624e = null;

    /* renamed from: n */
    private boolean f34633n = false;

    /* compiled from: DownloadTaskHunter.java */
    /* renamed from: e.h.a.d$a */
    interface a {
        /* renamed from: D */
        ArrayList<InterfaceC8991a.a> mo28672D();

        /* renamed from: N */
        FileDownloadHeader mo28673N();

        /* renamed from: a */
        void mo28675a(String str);

        /* renamed from: s */
        InterfaceC8991a.b mo28678s();
    }

    C8997d(a aVar, Object obj) {
        this.f34621b = obj;
        this.f34622c = aVar;
        C8993b c8993b = new C8993b();
        this.f34625f = c8993b;
        this.f34626g = c8993b;
        this.f34620a = new C9030k(aVar.mo28678s(), this);
    }

    /* renamed from: s */
    private int m28696s() {
        return this.f34622c.mo28678s().mo28649v().getId();
    }

    /* renamed from: t */
    private void m28697t() throws IOException {
        File file;
        InterfaceC8991a interfaceC8991aMo28649v = this.f34622c.mo28678s().mo28649v();
        if (interfaceC8991aMo28649v.mo28624g() == null) {
            interfaceC8991aMo28649v.mo28628k(C9036f.m29016v(interfaceC8991aMo28649v.mo28631n()));
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "save Path is null to %s", interfaceC8991aMo28649v.mo28624g());
            }
        }
        if (interfaceC8991aMo28649v.mo28615Q()) {
            file = new File(interfaceC8991aMo28649v.mo28624g());
        } else {
            String strM28974A = C9036f.m28974A(interfaceC8991aMo28649v.mo28624g());
            if (strM28974A == null) {
                throw new InvalidParameterException(C9036f.m29009o("the provided mPath[%s] is invalid, can't find its directory", interfaceC8991aMo28649v.mo28624g()));
            }
            file = new File(strM28974A);
        }
        if (!file.exists() && !file.mkdirs() && !file.exists()) {
            throw new IOException(C9036f.m29009o("Create parent directory failed, please make sure you have permission to create file or directory on the path: %s", file.getAbsolutePath()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private void m28698u(MessageSnapshot messageSnapshot) {
        InterfaceC8991a interfaceC8991aMo28649v = this.f34622c.mo28678s().mo28649v();
        byte bMo27519k = messageSnapshot.mo27519k();
        this.f34623d = bMo27519k;
        this.f34630k = messageSnapshot.m27532m();
        if (bMo27519k == -4) {
            this.f34625f.mo28659a();
            int iM28895e = C9019h.m28890i().m28895e(interfaceC8991aMo28649v.getId());
            if (iM28895e + ((iM28895e > 1 || !interfaceC8991aMo28649v.mo28615Q()) ? 0 : C9019h.m28890i().m28895e(C9036f.m29012r(interfaceC8991aMo28649v.mo28631n(), interfaceC8991aMo28649v.mo28629l()))) <= 1) {
                byte bMo29030Q = C9038m.m29029b().mo29030Q(interfaceC8991aMo28649v.getId());
                C9034d.m28970i(this, "warn, but no mListener to receive, switch to pending %d %d", Integer.valueOf(interfaceC8991aMo28649v.getId()), Integer.valueOf(bMo29030Q));
                if (C8700b.m27597a(bMo29030Q)) {
                    this.f34623d = (byte) 1;
                    this.f34628i = messageSnapshot.mo27522g();
                    long jMo27527f = messageSnapshot.mo27527f();
                    this.f34627h = jMo27527f;
                    this.f34625f.mo28662g(jMo27527f);
                    this.f34620a.mo28934b(((MessageSnapshot.InterfaceC8692b) messageSnapshot).mo27530a());
                    return;
                }
            }
            C9019h.m28890i().m28901l(this.f34622c.mo28678s(), messageSnapshot);
            return;
        }
        if (bMo27519k == -3) {
            this.f34633n = messageSnapshot.mo27523o();
            this.f34627h = messageSnapshot.mo27522g();
            this.f34628i = messageSnapshot.mo27522g();
            C9019h.m28890i().m28901l(this.f34622c.mo28678s(), messageSnapshot);
            return;
        }
        if (bMo27519k == -1) {
            this.f34624e = messageSnapshot.mo27528l();
            this.f34627h = messageSnapshot.mo27527f();
            C9019h.m28890i().m28901l(this.f34622c.mo28678s(), messageSnapshot);
            return;
        }
        if (bMo27519k == 1) {
            this.f34627h = messageSnapshot.mo27527f();
            this.f34628i = messageSnapshot.mo27522g();
            this.f34620a.mo28934b(messageSnapshot);
            return;
        }
        if (bMo27519k == 2) {
            this.f34628i = messageSnapshot.mo27522g();
            this.f34631l = messageSnapshot.mo27526n();
            this.f34632m = messageSnapshot.mo27524c();
            String strMo27525d = messageSnapshot.mo27525d();
            if (strMo27525d != null) {
                if (interfaceC8991aMo28649v.mo28618V() != null) {
                    C9034d.m28970i(this, "already has mFilename[%s], but assign mFilename[%s] again", interfaceC8991aMo28649v.mo28618V(), strMo27525d);
                }
                this.f34622c.mo28675a(strMo27525d);
            }
            this.f34625f.mo28662g(this.f34627h);
            this.f34620a.mo28940h(messageSnapshot);
            return;
        }
        if (bMo27519k == 3) {
            this.f34627h = messageSnapshot.mo27527f();
            this.f34625f.mo28663i(messageSnapshot.mo27527f());
            this.f34620a.mo28938f(messageSnapshot);
        } else if (bMo27519k != 5) {
            if (bMo27519k != 6) {
                return;
            }
            this.f34620a.mo28944l(messageSnapshot);
        } else {
            this.f34627h = messageSnapshot.mo27527f();
            this.f34624e = messageSnapshot.mo27528l();
            this.f34629j = messageSnapshot.mo27529h();
            this.f34625f.mo28659a();
            this.f34620a.mo28937e(messageSnapshot);
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x.a
    /* renamed from: a */
    public boolean mo28699a(MessageSnapshot messageSnapshot) {
        if (!this.f34622c.mo28678s().mo28649v().mo28615Q() || messageSnapshot.mo27519k() != -4 || getStatus() != 2) {
            return false;
        }
        m28698u(messageSnapshot);
        return true;
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x
    /* renamed from: b */
    public void mo28700b() {
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "free the task %d, when the status is %d", Integer.valueOf(m28696s()), Byte.valueOf(this.f34623d));
        }
        this.f34623d = (byte) 0;
    }

    @Override // p241e.p307h.p308a.InterfaceC9043r
    /* renamed from: c */
    public int mo28660c() {
        return this.f34626g.mo28660c();
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x
    /* renamed from: d */
    public int mo28701d() {
        return this.f34629j;
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x
    /* renamed from: e */
    public Throwable mo28702e() {
        return this.f34624e;
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x.a
    /* renamed from: f */
    public InterfaceC9045t mo28703f() {
        return this.f34620a;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.d
    /* renamed from: g */
    public void mo28655g() {
        InterfaceC8991a interfaceC8991aMo28649v = this.f34622c.mo28678s().mo28649v();
        if (C9037l.m29022b()) {
            C9037l.m29021a().m29025c(interfaceC8991aMo28649v);
        }
        if (C9034d.f34819a) {
            C9034d.m28969h(this, "filedownloader:lifecycle:over %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
        this.f34625f.mo28661f(this.f34627h);
        if (this.f34622c.mo28672D() != null) {
            ArrayList arrayList = (ArrayList) this.f34622c.mo28672D().clone();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC8991a.a) arrayList.get(i2)).mo28638a(interfaceC8991aMo28649v);
            }
        }
        C9042q.m29052e().m29058f().mo29069c(this.f34622c.mo28678s());
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x
    public byte getStatus() {
        return this.f34623d;
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x
    /* renamed from: h */
    public boolean mo28704h() {
        return this.f34630k;
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x.a
    /* renamed from: i */
    public boolean mo28705i(MessageSnapshot messageSnapshot) {
        if (C8700b.m27598b(getStatus(), messageSnapshot.mo27519k())) {
            m28698u(messageSnapshot);
            return true;
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "can't update mStatus change by keep ahead, %d, but the current mStatus is %d, %d", Byte.valueOf(this.f34623d), Byte.valueOf(getStatus()), Integer.valueOf(m28696s()));
        }
        return false;
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x
    /* renamed from: j */
    public void mo28706j() {
        boolean z;
        synchronized (this.f34621b) {
            if (this.f34623d != 0) {
                C9034d.m28970i(this, "High concurrent cause, this task %d will not input to launch pool, because of the status isn't idle : %d", Integer.valueOf(m28696s()), Byte.valueOf(this.f34623d));
                return;
            }
            this.f34623d = (byte) 10;
            InterfaceC8991a.b bVarMo28678s = this.f34622c.mo28678s();
            InterfaceC8991a interfaceC8991aMo28649v = bVarMo28678s.mo28649v();
            if (C9037l.m29022b()) {
                C9037l.m29021a().m29024b(interfaceC8991aMo28649v);
            }
            if (C9034d.f34819a) {
                C9034d.m28969h(this, "call start Url[%s], Path[%s] Listener[%s], Tag[%s]", interfaceC8991aMo28649v.mo28631n(), interfaceC8991aMo28649v.mo28624g(), interfaceC8991aMo28649v.mo28610G(), interfaceC8991aMo28649v.getTag());
            }
            try {
                m28697t();
                z = true;
            } catch (Throwable th) {
                C9019h.m28890i().m28891a(bVarMo28678s);
                C9019h.m28890i().m28901l(bVarMo28678s, mo28708l(th));
                z = false;
            }
            if (z) {
                C9041p.m29041c().m29044d(this);
            }
            if (C9034d.f34819a) {
                C9034d.m28969h(this, "the task[%d] has been into the launch pool.", Integer.valueOf(m28696s()));
            }
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x
    /* renamed from: k */
    public long mo28707k() {
        return this.f34627h;
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x.a
    /* renamed from: l */
    public MessageSnapshot mo28708l(Throwable th) {
        this.f34623d = (byte) -1;
        this.f34624e = th;
        return C8695c.m27541b(m28696s(), mo28707k(), th);
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x
    /* renamed from: m */
    public long mo28709m() {
        return this.f34628i;
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x.a
    /* renamed from: n */
    public boolean mo28710n(MessageSnapshot messageSnapshot) {
        if (!C8700b.m27600d(this.f34622c.mo28678s().mo28649v())) {
            return false;
        }
        m28698u(messageSnapshot);
        return true;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.d
    /* renamed from: o */
    public void mo28656o() {
        if (C9037l.m29022b() && getStatus() == 6) {
            C9037l.m29021a().m29027e(this.f34622c.mo28678s().mo28649v());
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x.a
    /* renamed from: p */
    public boolean mo28711p(MessageSnapshot messageSnapshot) {
        byte status = getStatus();
        byte bMo27519k = messageSnapshot.mo27519k();
        if (-2 == status && C8700b.m27597a(bMo27519k)) {
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "High concurrent cause, callback pending, but has already be paused %d", Integer.valueOf(m28696s()));
            }
            return true;
        }
        if (C8700b.m27599c(status, bMo27519k)) {
            m28698u(messageSnapshot);
            return true;
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "can't update mStatus change by keep flow, %d, but the current mStatus is %d, %d", Byte.valueOf(this.f34623d), Byte.valueOf(getStatus()), Integer.valueOf(m28696s()));
        }
        return false;
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x
    public boolean pause() {
        if (C8700b.m27601e(getStatus())) {
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "High concurrent cause, Already is over, can't pause again, %d %d", Byte.valueOf(getStatus()), Integer.valueOf(this.f34622c.mo28678s().mo28649v().getId()));
            }
            return false;
        }
        this.f34623d = (byte) -2;
        InterfaceC8991a.b bVarMo28678s = this.f34622c.mo28678s();
        InterfaceC8991a interfaceC8991aMo28649v = bVarMo28678s.mo28649v();
        C9041p.m29041c().m29043b(this);
        if (C9034d.f34819a) {
            C9034d.m28969h(this, "the task[%d] has been expired from the launch pool.", Integer.valueOf(m28696s()));
        }
        if (C9042q.m29052e().m29060i()) {
            C9038m.m29029b().mo29032a0(interfaceC8991aMo28649v.getId());
        } else if (C9034d.f34819a) {
            C9034d.m28962a(this, "request pause the task[%d] to the download service, but the download service isn't connected yet.", Integer.valueOf(interfaceC8991aMo28649v.getId()));
        }
        C9019h.m28890i().m28891a(bVarMo28678s);
        C9019h.m28890i().m28901l(bVarMo28678s, C8695c.m27542c(interfaceC8991aMo28649v));
        C9042q.m29052e().m29058f().mo29069c(bVarMo28678s);
        return true;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.d
    /* renamed from: q */
    public void mo28657q() {
        if (C9037l.m29022b()) {
            C9037l.m29021a().m29026d(this.f34622c.mo28678s().mo28649v());
        }
        if (C9034d.f34819a) {
            C9034d.m28969h(this, "filedownloader:lifecycle:start %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x.b
    /* renamed from: r */
    public boolean mo28712r(AbstractC9024i abstractC9024i) {
        return this.f34622c.mo28678s().mo28649v().mo28610G() == abstractC9024i;
    }

    @Override // p241e.p307h.p308a.InterfaceC9049x.b
    public void start() {
        if (this.f34623d != 10) {
            C9034d.m28970i(this, "High concurrent cause, this task %d will not start, because the of status isn't toLaunchPool: %d", Integer.valueOf(m28696s()), Byte.valueOf(this.f34623d));
            return;
        }
        InterfaceC8991a.b bVarMo28678s = this.f34622c.mo28678s();
        InterfaceC8991a interfaceC8991aMo28649v = bVarMo28678s.mo28649v();
        InterfaceC9047v interfaceC9047vM29058f = C9042q.m29052e().m29058f();
        try {
            if (interfaceC9047vM29058f.mo29068b(bVarMo28678s)) {
                return;
            }
            synchronized (this.f34621b) {
                if (this.f34623d != 10) {
                    C9034d.m28970i(this, "High concurrent cause, this task %d will not start, the status can't assign to toFileDownloadService, because the status isn't toLaunchPool: %d", Integer.valueOf(m28696s()), Byte.valueOf(this.f34623d));
                    return;
                }
                this.f34623d = (byte) 11;
                C9019h.m28890i().m28891a(bVarMo28678s);
                if (C9033c.m28959d(interfaceC8991aMo28649v.getId(), interfaceC8991aMo28649v.mo28629l(), interfaceC8991aMo28649v.mo28613M(), true)) {
                    return;
                }
                boolean zMo29031S = C9038m.m29029b().mo29031S(interfaceC8991aMo28649v.mo28631n(), interfaceC8991aMo28649v.mo28624g(), interfaceC8991aMo28649v.mo28615Q(), interfaceC8991aMo28649v.mo28612K(), interfaceC8991aMo28649v.mo28634q(), interfaceC8991aMo28649v.mo28636t(), interfaceC8991aMo28649v.mo28613M(), this.f34622c.mo28673N(), interfaceC8991aMo28649v.mo28635r());
                if (this.f34623d == -2) {
                    C9034d.m28970i(this, "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied", Integer.valueOf(m28696s()));
                    if (zMo29031S) {
                        C9038m.m29029b().mo29032a0(m28696s());
                        return;
                    }
                    return;
                }
                if (zMo29031S) {
                    interfaceC9047vM29058f.mo29069c(bVarMo28678s);
                    return;
                }
                if (interfaceC9047vM29058f.mo29068b(bVarMo28678s)) {
                    return;
                }
                MessageSnapshot messageSnapshotMo28708l = mo28708l(new RuntimeException("Occur Unknown Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected."));
                if (C9019h.m28890i().m28900k(bVarMo28678s)) {
                    interfaceC9047vM29058f.mo29069c(bVarMo28678s);
                    C9019h.m28890i().m28891a(bVarMo28678s);
                }
                C9019h.m28890i().m28901l(bVarMo28678s, messageSnapshotMo28708l);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            C9019h.m28890i().m28901l(bVarMo28678s, mo28708l(th));
        }
    }
}
