package p241e.p307h.p308a;

import android.text.TextUtils;
import android.util.SparseArray;
import com.liulishuo.filedownloader.model.C8700b;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.io.File;
import java.util.ArrayList;
import p241e.p307h.p308a.C8997d;
import p241e.p307h.p308a.InterfaceC8991a;
import p241e.p307h.p308a.InterfaceC9049x;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: DownloadTask.java */
/* renamed from: e.h.a.c */
/* loaded from: classes2.dex */
public class C8995c implements InterfaceC8991a, InterfaceC8991a.b, C8997d.a {

    /* renamed from: a */
    private final InterfaceC9049x f34588a;

    /* renamed from: b */
    private final InterfaceC9049x.a f34589b;

    /* renamed from: c */
    private int f34590c;

    /* renamed from: d */
    private ArrayList<InterfaceC8991a.a> f34591d;

    /* renamed from: e */
    private final String f34592e;

    /* renamed from: f */
    private String f34593f;

    /* renamed from: g */
    private String f34594g;

    /* renamed from: h */
    private boolean f34595h;

    /* renamed from: i */
    private FileDownloadHeader f34596i;

    /* renamed from: j */
    private AbstractC9024i f34597j;

    /* renamed from: k */
    private SparseArray<Object> f34598k;

    /* renamed from: l */
    private Object f34599l;

    /* renamed from: u */
    private final Object f34608u;

    /* renamed from: m */
    private int f34600m = 0;

    /* renamed from: n */
    private boolean f34601n = false;

    /* renamed from: o */
    private boolean f34602o = false;

    /* renamed from: p */
    private int f34603p = 100;

    /* renamed from: q */
    private int f34604q = 10;

    /* renamed from: r */
    private boolean f34605r = false;

    /* renamed from: s */
    volatile int f34606s = 0;

    /* renamed from: t */
    private boolean f34607t = false;

    /* renamed from: v */
    private final Object f34609v = new Object();

    /* renamed from: w */
    private volatile boolean f34610w = false;

    /* compiled from: DownloadTask.java */
    /* renamed from: e.h.a.c$b */
    private static final class b implements InterfaceC8991a.c {

        /* renamed from: a */
        private final C8995c f34611a;

        @Override // p241e.p307h.p308a.InterfaceC8991a.c
        /* renamed from: a */
        public int mo28654a() {
            int id = this.f34611a.getId();
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "add the task[%d] to the queue", Integer.valueOf(id));
            }
            C9019h.m28890i().m28892b(this.f34611a);
            return id;
        }

        private b(C8995c c8995c) {
            this.f34611a = c8995c;
            c8995c.f34607t = true;
        }
    }

    C8995c(String str) {
        this.f34592e = str;
        Object obj = new Object();
        this.f34608u = obj;
        C8997d c8997d = new C8997d(this, obj);
        this.f34588a = c8997d;
        this.f34589b = c8997d;
    }

    /* renamed from: Y */
    private void m28670Y() {
        if (this.f34596i == null) {
            synchronized (this.f34609v) {
                if (this.f34596i == null) {
                    this.f34596i = new FileDownloadHeader();
                }
            }
        }
    }

    /* renamed from: c0 */
    private int m28671c0() {
        if (!m28676a0()) {
            if (!mo28633p()) {
                mo28641F();
            }
            this.f34588a.mo28706j();
            return getId();
        }
        if (m28674Z()) {
            throw new IllegalStateException(C9036f.m29009o("This task is running %d, if you want to start the same task, please create a new one by FileDownloader.create", Integer.valueOf(getId())));
        }
        throw new IllegalStateException("This task is dirty to restart, If you want to reuse this task, please invoke #reuse method manually and retry to restart again." + this.f34588a.toString());
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: A */
    public boolean mo28639A(int i2) {
        return getId() == i2;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: B */
    public int mo28608B() {
        if (this.f34588a.mo28707k() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.f34588a.mo28707k();
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: C */
    public void mo28640C(int i2) {
        this.f34606s = i2;
    }

    @Override // p241e.p307h.p308a.C8997d.a
    /* renamed from: D */
    public ArrayList<InterfaceC8991a.a> mo28672D() {
        return this.f34591d;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: E */
    public long mo28609E() {
        return this.f34588a.mo28709m();
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: F */
    public void mo28641F() {
        this.f34606s = mo28610G() != null ? mo28610G().hashCode() : hashCode();
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: G */
    public AbstractC9024i mo28610G() {
        return this.f34597j;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: H */
    public boolean mo28642H() {
        return this.f34610w;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: I */
    public Object mo28643I() {
        return this.f34608u;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: J */
    public boolean mo28611J(InterfaceC8991a.a aVar) {
        ArrayList<InterfaceC8991a.a> arrayList = this.f34591d;
        return arrayList != null && arrayList.remove(aVar);
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: K */
    public int mo28612K() {
        return this.f34603p;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: L */
    public void mo28644L() {
        m28671c0();
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: M */
    public boolean mo28613M() {
        return this.f34605r;
    }

    @Override // p241e.p307h.p308a.C8997d.a
    /* renamed from: N */
    public FileDownloadHeader mo28673N() {
        return this.f34596i;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: O */
    public InterfaceC8991a mo28614O(int i2) {
        this.f34600m = i2;
        return this;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: P */
    public boolean mo28645P() {
        return C8700b.m27601e(getStatus());
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: Q */
    public boolean mo28615Q() {
        return this.f34595h;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: R */
    public InterfaceC8991a mo28616R(int i2) {
        this.f34603p = i2;
        return this;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: S */
    public boolean mo28646S() {
        ArrayList<InterfaceC8991a.a> arrayList = this.f34591d;
        return arrayList != null && arrayList.size() > 0;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: T */
    public void mo28647T() {
        this.f34610w = true;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: U */
    public boolean mo28617U() {
        return this.f34601n;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: V */
    public String mo28618V() {
        return this.f34594g;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: W */
    public InterfaceC8991a mo28619W(AbstractC9024i abstractC9024i) {
        this.f34597j = abstractC9024i;
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "setListener %s", abstractC9024i);
        }
        return this;
    }

    /* renamed from: Z */
    public boolean m28674Z() {
        if (C9042q.m29052e().m29058f().mo29067a(this)) {
            return true;
        }
        return C8700b.m27597a(getStatus());
    }

    @Override // p241e.p307h.p308a.C8997d.a
    /* renamed from: a */
    public void mo28675a(String str) {
        this.f34594g = str;
    }

    /* renamed from: a0 */
    public boolean m28676a0() {
        return this.f34588a.getStatus() != 0;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: b */
    public void mo28648b() {
        this.f34588a.mo28700b();
        if (C9019h.m28890i().m28900k(this)) {
            this.f34610w = false;
        }
    }

    /* renamed from: b0 */
    public InterfaceC8991a m28677b0(String str, boolean z) {
        this.f34593f = str;
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "setPath %s", str);
        }
        this.f34595h = z;
        if (z) {
            this.f34594g = null;
        } else {
            this.f34594g = new File(str).getName();
        }
        return this;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: c */
    public int mo28620c() {
        return this.f34588a.mo28660c();
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: d */
    public int mo28621d() {
        return this.f34588a.mo28701d();
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: e */
    public Throwable mo28622e() {
        return this.f34588a.mo28702e();
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: f */
    public InterfaceC8991a mo28623f(String str, String str2) {
        m28670Y();
        this.f34596i.m27551a(str, str2);
        return this;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: g */
    public String mo28624g() {
        return this.f34593f;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    public int getId() {
        int i2 = this.f34590c;
        if (i2 != 0) {
            return i2;
        }
        if (TextUtils.isEmpty(this.f34593f) || TextUtils.isEmpty(this.f34592e)) {
            return 0;
        }
        int iM29013s = C9036f.m29013s(this.f34592e, this.f34593f, this.f34595h);
        this.f34590c = iM29013s;
        return iM29013s;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    public byte getStatus() {
        return this.f34588a.getStatus();
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    public Object getTag() {
        return this.f34599l;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: h */
    public boolean mo28625h() {
        return this.f34588a.mo28704h();
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: i */
    public int mo28626i() {
        if (this.f34588a.mo28709m() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.f34588a.mo28709m();
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: j */
    public InterfaceC8991a mo28627j(int i2, Object obj) {
        if (this.f34598k == null) {
            this.f34598k = new SparseArray<>(2);
        }
        this.f34598k.put(i2, obj);
        return this;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: k */
    public InterfaceC8991a mo28628k(String str) {
        return m28677b0(str, false);
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: l */
    public String mo28629l() {
        return C9036f.m28975B(mo28624g(), mo28615Q(), mo28618V());
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: m */
    public InterfaceC8991a.c mo28630m() {
        return new b();
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: n */
    public String mo28631n() {
        return this.f34592e;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: o */
    public long mo28632o() {
        return this.f34588a.mo28707k();
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: p */
    public boolean mo28633p() {
        return this.f34606s != 0;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    public boolean pause() {
        boolean zPause;
        synchronized (this.f34608u) {
            zPause = this.f34588a.pause();
        }
        return zPause;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: q */
    public int mo28634q() {
        return this.f34604q;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: r */
    public boolean mo28635r() {
        return this.f34602o;
    }

    @Override // p241e.p307h.p308a.C8997d.a
    /* renamed from: s */
    public InterfaceC8991a.b mo28678s() {
        return this;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: t */
    public int mo28636t() {
        return this.f34600m;
    }

    public String toString() {
        return C9036f.m29009o("%d@%s", Integer.valueOf(getId()), super.toString());
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a
    /* renamed from: u */
    public InterfaceC8991a mo28637u(InterfaceC8991a.a aVar) {
        if (this.f34591d == null) {
            this.f34591d = new ArrayList<>();
        }
        if (!this.f34591d.contains(aVar)) {
            this.f34591d.add(aVar);
        }
        return this;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: v */
    public InterfaceC8991a mo28649v() {
        return this;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: w */
    public void mo28650w() {
        m28671c0();
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: x */
    public int mo28651x() {
        return this.f34606s;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: y */
    public InterfaceC9049x.a mo28652y() {
        return this.f34589b;
    }

    @Override // p241e.p307h.p308a.InterfaceC8991a.b
    /* renamed from: z */
    public boolean mo28653z(AbstractC9024i abstractC9024i) {
        return mo28610G() == abstractC9024i;
    }
}
