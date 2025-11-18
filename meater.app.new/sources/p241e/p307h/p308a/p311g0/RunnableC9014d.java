package p241e.p307h.p308a.p311g0;

import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadHttpException;
import com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.exception.FileDownloadSecurityException;
import com.liulishuo.filedownloader.model.C8699a;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import p241e.p307h.p308a.InterfaceC9050y;
import p241e.p307h.p308a.p309e0.InterfaceC9001b;
import p241e.p307h.p308a.p310f0.InterfaceC9005a;
import p241e.p307h.p308a.p311g0.C9011a;
import p241e.p307h.p308a.p311g0.C9012b;
import p241e.p307h.p308a.p311g0.RunnableC9015e;
import p241e.p307h.p308a.p314j0.InterfaceC9028a;
import p241e.p307h.p308a.p315k0.C9032b;
import p241e.p307h.p308a.p315k0.C9033c;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9035e;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: DownloadLaunchRunnable.java */
/* renamed from: e.h.a.g0.d */
/* loaded from: classes2.dex */
public class RunnableC9014d implements Runnable, InterfaceC9018h {

    /* renamed from: f */
    private static final ThreadPoolExecutor f34688f = C9032b.m28955c("ConnectionBlock");

    /* renamed from: A */
    private volatile boolean f34689A;

    /* renamed from: B */
    private volatile Exception f34690B;

    /* renamed from: C */
    private String f34691C;

    /* renamed from: D */
    private long f34692D;

    /* renamed from: E */
    private long f34693E;

    /* renamed from: F */
    private long f34694F;

    /* renamed from: G */
    private long f34695G;

    /* renamed from: g */
    private final C9016f f34696g;

    /* renamed from: h */
    private final int f34697h;

    /* renamed from: i */
    private final FileDownloadModel f34698i;

    /* renamed from: j */
    private final FileDownloadHeader f34699j;

    /* renamed from: k */
    private final boolean f34700k;

    /* renamed from: l */
    private final boolean f34701l;

    /* renamed from: m */
    private final InterfaceC9005a f34702m;

    /* renamed from: n */
    private final InterfaceC9050y f34703n;

    /* renamed from: o */
    private boolean f34704o;

    /* renamed from: p */
    int f34705p;

    /* renamed from: q */
    private boolean f34706q;

    /* renamed from: r */
    private final boolean f34707r;

    /* renamed from: s */
    private final ArrayList<RunnableC9015e> f34708s;

    /* renamed from: t */
    private RunnableC9015e f34709t;

    /* renamed from: u */
    private boolean f34710u;

    /* renamed from: v */
    private boolean f34711v;

    /* renamed from: w */
    private boolean f34712w;

    /* renamed from: x */
    private boolean f34713x;

    /* renamed from: y */
    private final AtomicBoolean f34714y;

    /* renamed from: z */
    private volatile boolean f34715z;

    /* compiled from: DownloadLaunchRunnable.java */
    /* renamed from: e.h.a.g0.d$b */
    public static class b {

        /* renamed from: a */
        private FileDownloadModel f34716a;

        /* renamed from: b */
        private FileDownloadHeader f34717b;

        /* renamed from: c */
        private InterfaceC9050y f34718c;

        /* renamed from: d */
        private Integer f34719d;

        /* renamed from: e */
        private Integer f34720e;

        /* renamed from: f */
        private Boolean f34721f;

        /* renamed from: g */
        private Boolean f34722g;

        /* renamed from: h */
        private Integer f34723h;

        /* renamed from: a */
        public RunnableC9014d m28825a() {
            if (this.f34716a == null || this.f34718c == null || this.f34719d == null || this.f34720e == null || this.f34721f == null || this.f34722g == null || this.f34723h == null) {
                throw new IllegalArgumentException();
            }
            return new RunnableC9014d(this.f34716a, this.f34717b, this.f34718c, this.f34719d.intValue(), this.f34720e.intValue(), this.f34721f.booleanValue(), this.f34722g.booleanValue(), this.f34723h.intValue());
        }

        /* renamed from: b */
        public b m28826b(Integer num) {
            this.f34720e = num;
            return this;
        }

        /* renamed from: c */
        public b m28827c(Boolean bool) {
            this.f34721f = bool;
            return this;
        }

        /* renamed from: d */
        public b m28828d(FileDownloadHeader fileDownloadHeader) {
            this.f34717b = fileDownloadHeader;
            return this;
        }

        /* renamed from: e */
        public b m28829e(Integer num) {
            this.f34723h = num;
            return this;
        }

        /* renamed from: f */
        public b m28830f(Integer num) {
            this.f34719d = num;
            return this;
        }

        /* renamed from: g */
        public b m28831g(FileDownloadModel fileDownloadModel) {
            this.f34716a = fileDownloadModel;
            return this;
        }

        /* renamed from: h */
        public b m28832h(InterfaceC9050y interfaceC9050y) {
            this.f34718c = interfaceC9050y;
            return this;
        }

        /* renamed from: i */
        public b m28833i(Boolean bool) {
            this.f34722g = bool;
            return this;
        }
    }

    /* compiled from: DownloadLaunchRunnable.java */
    /* renamed from: e.h.a.g0.d$c */
    class c extends Throwable {
        c() {
        }
    }

    /* compiled from: DownloadLaunchRunnable.java */
    /* renamed from: e.h.a.g0.d$d */
    class d extends Throwable {
        d() {
        }
    }

    /* renamed from: g */
    private int m28802g(long j2) {
        if (m28808q()) {
            return this.f34711v ? this.f34698i.m27557a() : C9013c.m28789j().m28794c(this.f34698i.m27561e(), this.f34698i.m27568l(), this.f34698i.m27562f(), j2);
        }
        return 1;
    }

    /* renamed from: h */
    private void m28803h() throws c, d {
        int iM27561e = this.f34698i.m27561e();
        if (this.f34698i.m27572p()) {
            String strM27565i = this.f34698i.m27565i();
            int iM29012r = C9036f.m29012r(this.f34698i.m27568l(), strM27565i);
            if (C9033c.m28959d(iM27561e, strM27565i, this.f34700k, false)) {
                this.f34702m.remove(iM27561e);
                this.f34702m.mo28733h(iM27561e);
                throw new c();
            }
            FileDownloadModel fileDownloadModelMo28740o = this.f34702m.mo28740o(iM29012r);
            if (fileDownloadModelMo28740o != null) {
                if (C9033c.m28960e(iM27561e, fileDownloadModelMo28740o, this.f34703n, false)) {
                    this.f34702m.remove(iM27561e);
                    this.f34702m.mo28733h(iM27561e);
                    throw new c();
                }
                List<C8699a> listMo28739n = this.f34702m.mo28739n(iM29012r);
                this.f34702m.remove(iM29012r);
                this.f34702m.mo28733h(iM29012r);
                C9036f.m28999e(this.f34698i.m27565i());
                if (C9036f.m28980G(iM29012r, fileDownloadModelMo28740o)) {
                    this.f34698i.m27580x(fileDownloadModelMo28740o.m27563g());
                    this.f34698i.m27582z(fileDownloadModelMo28740o.m27567k());
                    this.f34698i.m27575s(fileDownloadModelMo28740o.m27558b());
                    this.f34698i.m27574r(fileDownloadModelMo28740o.m27557a());
                    this.f34702m.mo28735j(this.f34698i);
                    if (listMo28739n != null) {
                        for (C8699a c8699a : listMo28739n) {
                            c8699a.m27593i(iM27561e);
                            this.f34702m.mo28732g(c8699a);
                        }
                    }
                    throw new d();
                }
            }
            if (C9033c.m28958c(iM27561e, this.f34698i.m27563g(), this.f34698i.m27566j(), strM27565i, this.f34703n)) {
                this.f34702m.remove(iM27561e);
                this.f34702m.mo28733h(iM27561e);
                throw new c();
            }
        }
    }

    /* renamed from: i */
    private void m28804i() throws FileDownloadGiveUpRetryException {
        if (this.f34701l && !C9036f.m28995a("android.permission.ACCESS_NETWORK_STATE")) {
            throw new FileDownloadGiveUpRetryException(C9036f.m29009o("Task[%d] can't start the download runnable, because this task require wifi, but user application nor current process has %s, so we can't check whether the network type connection.", Integer.valueOf(this.f34698i.m27561e()), "android.permission.ACCESS_NETWORK_STATE"));
        }
        if (this.f34701l && C9036f.m28986M()) {
            throw new FileDownloadNetworkPolicyException();
        }
    }

    /* renamed from: j */
    private void m28805j(List<C8699a> list, long j2) throws InterruptedException {
        int iM27561e = this.f34698i.m27561e();
        String strM27558b = this.f34698i.m27558b();
        String strM27568l = this.f34691C;
        if (strM27568l == null) {
            strM27568l = this.f34698i.m27568l();
        }
        String strM27566j = this.f34698i.m27566j();
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "fetch data with multiple connection(count: [%d]) for task[%d] totalLength[%d]", Integer.valueOf(list.size()), Integer.valueOf(iM27561e), Long.valueOf(j2));
        }
        boolean z = this.f34711v;
        long j3 = 0;
        long jM27586a = 0;
        for (C8699a c8699a : list) {
            long jM27586a2 = c8699a.m27587b() == -1 ? j2 - c8699a.m27586a() : (c8699a.m27587b() - c8699a.m27586a()) + 1;
            jM27586a += c8699a.m27586a() - c8699a.m27590e();
            if (jM27586a2 != j3) {
                RunnableC9015e runnableC9015eM28837a = new RunnableC9015e.b().m28843g(iM27561e).m28839c(Integer.valueOf(c8699a.m27589d())).m28838b(this).m28845i(strM27568l).m28841e(z ? strM27558b : null).m28842f(this.f34699j).m28846j(this.f34701l).m28840d(C9012b.b.m28782b(c8699a.m27590e(), c8699a.m27586a(), c8699a.m27587b(), jM27586a2)).m28844h(strM27566j).m28837a();
                if (C9034d.f34819a) {
                    C9034d.m28962a(this, "enable multiple connection: %s", c8699a);
                }
                if (runnableC9015eM28837a == null) {
                    throw new IllegalArgumentException("the download runnable must not be null!");
                }
                this.f34708s.add(runnableC9015eM28837a);
            } else if (C9034d.f34819a) {
                C9034d.m28962a(this, "pass connection[%d-%d], because it has been completed", Integer.valueOf(c8699a.m27588c()), Integer.valueOf(c8699a.m27589d()));
            }
            j3 = 0;
        }
        if (jM27586a != this.f34698i.m27563g()) {
            C9034d.m28970i(this, "correct the sofar[%d] from connection table[%d]", Long.valueOf(this.f34698i.m27563g()), Long.valueOf(jM27586a));
            this.f34698i.m27580x(jM27586a);
        }
        ArrayList arrayList = new ArrayList(this.f34708s.size());
        Iterator<RunnableC9015e> it = this.f34708s.iterator();
        while (it.hasNext()) {
            RunnableC9015e next = it.next();
            if (this.f34715z) {
                next.m28836c();
            } else {
                arrayList.add(Executors.callable(next));
            }
        }
        if (this.f34715z) {
            this.f34698i.m27581y((byte) -2);
            return;
        }
        List<Future> listInvokeAll = f34688f.invokeAll(arrayList);
        if (C9034d.f34819a) {
            for (Future future : listInvokeAll) {
                C9034d.m28962a(this, "finish sub-task for [%d] %B %B", Integer.valueOf(iM27561e), Boolean.valueOf(future.isDone()), Boolean.valueOf(future.isCancelled()));
            }
        }
    }

    /* renamed from: m */
    private void m28806m(long j2, String str) throws IllegalAccessException, IOException {
        InterfaceC9028a interfaceC9028aM28997c = null;
        if (j2 != -1) {
            try {
                interfaceC9028aM28997c = C9036f.m28997c(this.f34698i.m27566j());
                long length = new File(str).length();
                long j3 = j2 - length;
                long jM29018x = C9036f.m29018x(str);
                if (jM29018x < j3) {
                    throw new FileDownloadOutOfSpaceException(jM29018x, j3, length);
                }
                if (!C9035e.m28971a().f34825f) {
                    interfaceC9028aM28997c.mo28925a(j2);
                }
            } finally {
                if (0 != 0) {
                    interfaceC9028aM28997c.close();
                }
            }
        }
    }

    /* renamed from: n */
    private void m28807n(Map<String, List<String>> map, C9011a c9011a, InterfaceC9001b interfaceC9001b) throws d, FileDownloadSecurityException, IOException, IllegalArgumentException {
        boolean z;
        int iM27561e = this.f34698i.m27561e();
        int iMo27913d = interfaceC9001b.mo27913d();
        this.f34712w = C9036f.m28978E(iMo27913d, interfaceC9001b);
        boolean z2 = iMo27913d == 200 || iMo27913d == 201 || iMo27913d == 0;
        long jM29007m = C9036f.m29007m(interfaceC9001b);
        String strM27558b = this.f34698i.m27558b();
        String strM29004j = C9036f.m29004j(iM27561e, interfaceC9001b);
        if (iMo27913d != 412 && ((strM27558b == null || strM27558b.equals(strM29004j) || !(z2 || this.f34712w)) && !(iMo27913d == 201 && c9011a.m28772h()))) {
            if (iMo27913d == 416) {
                if (!this.f34712w || jM29007m < 0) {
                    if (this.f34698i.m27563g() > 0) {
                        C9034d.m28970i(this, "get 416, precondition failed and just retry", new Object[0]);
                    } else if (!this.f34706q) {
                        this.f34706q = true;
                        C9034d.m28970i(this, "get 416, precondition failed and need to retry with discarding range", new Object[0]);
                    }
                    z = true;
                } else {
                    C9034d.m28970i(this, "get 416 but the Content-Range is returned, no need to retry", new Object[0]);
                }
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            this.f34691C = c9011a.m28769e();
            if (!this.f34712w && !z2) {
                throw new FileDownloadHttpException(iMo27913d, map, interfaceC9001b.mo27911b());
            }
            String strM29006l = this.f34698i.m27572p() ? C9036f.m29006l(interfaceC9001b, this.f34698i.m27568l()) : null;
            this.f34713x = jM29007m == -1;
            this.f34696g.m28863n(this.f34711v && this.f34712w, jM29007m, strM29004j, strM29006l);
            return;
        }
        if (this.f34711v) {
            C9034d.m28970i(this, "there is precondition failed on this request[%d] with old etag[%s]、new etag[%s]、response code is %d", Integer.valueOf(iM27561e), strM27558b, strM29004j, Integer.valueOf(iMo27913d));
        }
        this.f34702m.mo28733h(this.f34698i.m27561e());
        C9036f.m29000f(this.f34698i.m27565i(), this.f34698i.m27566j());
        this.f34711v = false;
        if (strM27558b != null && strM27558b.equals(strM29004j)) {
            C9034d.m28970i(this, "the old etag[%s] is the same to the new etag[%s], but the response status code is %d not Partial(206), so wo have to start this task from very beginning for task[%d]!", strM27558b, strM29004j, Integer.valueOf(iMo27913d), Integer.valueOf(iM27561e));
            strM29004j = null;
        }
        this.f34698i.m27580x(0L);
        this.f34698i.m27582z(0L);
        this.f34698i.m27575s(strM29004j);
        this.f34698i.m27573q();
        this.f34702m.mo28730e(iM27561e, this.f34698i.m27558b(), this.f34698i.m27563g(), this.f34698i.m27567k(), this.f34698i.m27557a());
        throw new d();
    }

    /* renamed from: q */
    private boolean m28808q() {
        return (!this.f34711v || this.f34698i.m27557a() > 1) && this.f34712w && this.f34707r && !this.f34713x;
    }

    /* renamed from: t */
    private void m28809t(long j2, int i2) throws InterruptedException {
        long j3 = j2 / i2;
        int iM27561e = this.f34698i.m27561e();
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        int i3 = 0;
        while (i3 < i2) {
            long j5 = i3 == i2 + (-1) ? -1L : (j4 + j3) - 1;
            C8699a c8699a = new C8699a();
            c8699a.m27593i(iM27561e);
            c8699a.m27594j(i3);
            c8699a.m27595k(j4);
            c8699a.m27591g(j4);
            c8699a.m27592h(j5);
            arrayList.add(c8699a);
            this.f34702m.mo28732g(c8699a);
            j4 += j3;
            i3++;
        }
        this.f34698i.m27574r(i2);
        this.f34702m.mo28741p(iM27561e, i2);
        m28805j(arrayList, j2);
    }

    /* renamed from: u */
    private void m28810u(int i2, List<C8699a> list) throws InterruptedException {
        if (i2 <= 1 || list.size() != i2) {
            throw new IllegalArgumentException();
        }
        m28805j(list, this.f34698i.m27567k());
    }

    /* renamed from: v */
    private void m28811v(long j2) throws IllegalAccessException, SecurityException, IOException, IllegalArgumentException {
        C9012b c9012bM28783c;
        if (this.f34712w) {
            c9012bM28783c = C9012b.b.m28783c(this.f34698i.m27563g(), this.f34698i.m27563g(), j2 - this.f34698i.m27563g());
        } else {
            this.f34698i.m27580x(0L);
            c9012bM28783c = C9012b.b.m28781a(j2);
        }
        this.f34709t = new RunnableC9015e.b().m28843g(this.f34698i.m27561e()).m28839c(-1).m28838b(this).m28845i(this.f34698i.m27568l()).m28841e(this.f34698i.m27558b()).m28842f(this.f34699j).m28846j(this.f34701l).m28840d(c9012bM28783c).m28844h(this.f34698i.m27566j()).m28837a();
        this.f34698i.m27574r(1);
        this.f34702m.mo28741p(this.f34698i.m27561e(), 1);
        if (!this.f34715z) {
            this.f34709t.run();
        } else {
            this.f34698i.m27581y((byte) -2);
            this.f34709t.m28836c();
        }
    }

    /* renamed from: w */
    private void m28812w() throws IllegalAccessException, d, FileDownloadSecurityException, IOException {
        InterfaceC9001b interfaceC9001bM28768c = null;
        try {
            C9011a c9011aM28774a = new C9011a.b().m28776c(this.f34698i.m27561e()).m28779f(this.f34698i.m27568l()).m28777d(this.f34698i.m27558b()).m28778e(this.f34699j).m28775b(this.f34706q ? C9012b.b.m28785e() : C9012b.b.m28784d()).m28774a();
            interfaceC9001bM28768c = c9011aM28774a.m28768c();
            m28807n(c9011aM28774a.m28771g(), c9011aM28774a, interfaceC9001bM28768c);
        } finally {
            if (interfaceC9001bM28768c != null) {
                interfaceC9001bM28768c.mo27916g();
            }
        }
    }

    @Override // p241e.p307h.p308a.p311g0.InterfaceC9018h
    /* renamed from: a */
    public void mo28813a(RunnableC9015e runnableC9015e, long j2, long j3) {
        if (this.f34715z) {
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "the task[%d] has already been paused, so pass the completed callback", Integer.valueOf(this.f34698i.m27561e()));
                return;
            }
            return;
        }
        int i2 = runnableC9015e.f34733m;
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "the connection has been completed(%d): [%d, %d)  %d", Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(this.f34698i.m27567k()));
        }
        if (!this.f34710u) {
            synchronized (this.f34708s) {
                this.f34708s.remove(runnableC9015e);
            }
        } else {
            if (j2 == 0 || j3 == this.f34698i.m27567k()) {
                return;
            }
            C9034d.m28963b(this, "the single task not completed corrected(%d, %d != %d) for task(%d)", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(this.f34698i.m27567k()), Integer.valueOf(this.f34698i.m27561e()));
        }
    }

    @Override // p241e.p307h.p308a.p311g0.InterfaceC9018h
    /* renamed from: b */
    public void mo28814b(Exception exc) {
        this.f34689A = true;
        this.f34690B = exc;
        if (this.f34715z) {
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "the task[%d] has already been paused, so pass the error callback", Integer.valueOf(this.f34698i.m27561e()));
            }
        } else {
            Iterator it = ((ArrayList) this.f34708s.clone()).iterator();
            while (it.hasNext()) {
                RunnableC9015e runnableC9015e = (RunnableC9015e) it.next();
                if (runnableC9015e != null) {
                    runnableC9015e.m28835a();
                }
            }
        }
    }

    @Override // p241e.p307h.p308a.p311g0.InterfaceC9018h
    /* renamed from: c */
    public void mo28815c(Exception exc) {
        if (this.f34715z) {
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "the task[%d] has already been paused, so pass the retry callback", Integer.valueOf(this.f34698i.m27561e()));
            }
        } else {
            int i2 = this.f34705p;
            int i3 = i2 - 1;
            this.f34705p = i3;
            if (i2 < 0) {
                C9034d.m28963b(this, "valid retry times is less than 0(%d) for download task(%d)", Integer.valueOf(i3), Integer.valueOf(this.f34698i.m27561e()));
            }
            this.f34696g.m28869t(exc, this.f34705p);
        }
    }

    @Override // p241e.p307h.p308a.p311g0.InterfaceC9018h
    /* renamed from: d */
    public void mo28816d(long j2) {
        if (this.f34715z) {
            return;
        }
        this.f34696g.m28868s(j2);
    }

    @Override // p241e.p307h.p308a.p311g0.InterfaceC9018h
    /* renamed from: e */
    public boolean mo28817e(Exception exc) {
        if (exc instanceof FileDownloadHttpException) {
            int iM27516b = ((FileDownloadHttpException) exc).m27516b();
            if (this.f34710u && iM27516b == 416 && !this.f34704o) {
                C9036f.m29000f(this.f34698i.m27565i(), this.f34698i.m27566j());
                this.f34704o = true;
                return true;
            }
        }
        return this.f34705p > 0 && !(exc instanceof FileDownloadGiveUpRetryException);
    }

    @Override // p241e.p307h.p308a.p311g0.InterfaceC9018h
    /* renamed from: f */
    public void mo28818f() {
        this.f34702m.mo28737l(this.f34698i.m27561e(), this.f34698i.m27563g());
    }

    /* renamed from: k */
    public int m28819k() {
        return this.f34698i.m27561e();
    }

    /* renamed from: l */
    public String m28820l() {
        return this.f34698i.m27566j();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m28821o(java.util.List<com.liulishuo.filedownloader.model.C8699a> r11) {
        /*
            r10 = this;
            com.liulishuo.filedownloader.model.FileDownloadModel r0 = r10.f34698i
            int r0 = r0.m27557a()
            com.liulishuo.filedownloader.model.FileDownloadModel r1 = r10.f34698i
            java.lang.String r1 = r1.m27566j()
            com.liulishuo.filedownloader.model.FileDownloadModel r2 = r10.f34698i
            java.lang.String r2 = r2.m27565i()
            r3 = 0
            r4 = 1
            if (r0 <= r4) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            boolean r6 = r10.f34706q
            r7 = 0
            if (r6 == 0) goto L21
        L1f:
            r5 = r7
            goto L58
        L21:
            if (r5 == 0) goto L28
            boolean r6 = r10.f34707r
            if (r6 != 0) goto L28
            goto L1f
        L28:
            com.liulishuo.filedownloader.model.FileDownloadModel r6 = r10.f34698i
            int r6 = r6.m27561e()
            com.liulishuo.filedownloader.model.FileDownloadModel r9 = r10.f34698i
            boolean r6 = p241e.p307h.p308a.p315k0.C9036f.m28980G(r6, r9)
            if (r6 == 0) goto L1f
            boolean r6 = r10.f34707r
            if (r6 != 0) goto L44
            java.io.File r11 = new java.io.File
            r11.<init>(r1)
            long r5 = r11.length()
            goto L58
        L44:
            if (r5 == 0) goto L52
            int r5 = r11.size()
            if (r0 == r5) goto L4d
            goto L1f
        L4d:
            long r5 = com.liulishuo.filedownloader.model.C8699a.m27585f(r11)
            goto L58
        L52:
            com.liulishuo.filedownloader.model.FileDownloadModel r11 = r10.f34698i
            long r5 = r11.m27563g()
        L58:
            com.liulishuo.filedownloader.model.FileDownloadModel r11 = r10.f34698i
            r11.m27580x(r5)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 <= 0) goto L62
            r3 = 1
        L62:
            r10.f34711v = r3
            if (r3 != 0) goto L74
            e.h.a.f0.a r11 = r10.f34702m
            com.liulishuo.filedownloader.model.FileDownloadModel r0 = r10.f34698i
            int r0 = r0.m27561e()
            r11.mo28733h(r0)
            p241e.p307h.p308a.p315k0.C9036f.m29000f(r2, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p241e.p307h.p308a.p311g0.RunnableC9014d.m28821o(java.util.List):void");
    }

    /* renamed from: p */
    public boolean m28822p() {
        return this.f34714y.get() || this.f34696g.m28861l();
    }

    /* renamed from: r */
    public void m28823r() {
        this.f34715z = true;
        RunnableC9015e runnableC9015e = this.f34709t;
        if (runnableC9015e != null) {
            runnableC9015e.m28836c();
        }
        Iterator it = ((ArrayList) this.f34708s.clone()).iterator();
        while (it.hasNext()) {
            RunnableC9015e runnableC9015e2 = (RunnableC9015e) it.next();
            if (runnableC9015e2 != null) {
                runnableC9015e2.m28836c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (p241e.p307h.p308a.p315k0.C9034d.f34819a == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        p241e.p307h.p308a.p315k0.C9034d.m28962a(r11, "High concurrent cause, start runnable but already paused %d", java.lang.Integer.valueOf(r11.f34698i.m27561e()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        r11.f34696g.m28860b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        if (r11.f34715z == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
    
        if (r11.f34689A == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        r11.f34696g.m28862m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        if (r11.f34715z == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e2, code lost:
    
        r11.f34698i.m27581y((byte) -2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
    
        r11.f34696g.m28860b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (r11.f34715z == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f4, code lost:
    
        if (r11.f34689A == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        r11.f34696g.m28862m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        r5 = r11.f34698i.m27567k();
        m28806m(r5, r11.f34698i.m27566j());
        r7 = m28802g(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0113, code lost:
    
        if (r7 <= 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0119, code lost:
    
        if (r5 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        r11.f34696g.m28860b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        if (r11.f34715z == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0128, code lost:
    
        if (r11.f34689A == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012c, code lost:
    
        r11.f34696g.m28862m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0133, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0138, code lost:
    
        if (r11.f34715z == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013a, code lost:
    
        r11.f34698i.m27581y((byte) -2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013f, code lost:
    
        r11.f34696g.m28860b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0146, code lost:
    
        if (r11.f34715z == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014c, code lost:
    
        if (r11.f34689A == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
    
        r11.f34696g.m28862m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0157, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015a, code lost:
    
        if (r7 != 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015c, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015e, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015f, code lost:
    
        r11.f34710u = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0161, code lost:
    
        if (r8 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0163, code lost:
    
        m28811v(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0167, code lost:
    
        r11.f34696g.m28865p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016e, code lost:
    
        if (r11.f34711v == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0170, code lost:
    
        m28810u(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0174, code lost:
    
        m28809t(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
    
        throw new java.lang.IllegalAccessException(p241e.p307h.p308a.p315k0.C9036f.m29009o("invalid connection count %d, the connection count must be larger than 0", java.lang.Integer.valueOf(r7)));
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c1 A[Catch: all -> 0x01f6, TryCatch #12 {all -> 0x01f6, blocks: (B:3:0x0003, B:6:0x0012, B:8:0x001a, B:10:0x001e, B:11:0x0030, B:24:0x008d, B:26:0x0091, B:27:0x0096, B:29:0x009a, B:31:0x009e, B:42:0x00c6, B:44:0x00e2, B:55:0x0100, B:69:0x0136, B:71:0x013a, B:85:0x015f, B:87:0x0163, B:88:0x0167, B:90:0x0170, B:91:0x0174, B:92:0x0178, B:93:0x018b, B:94:0x018c, B:117:0x01bb, B:119:0x01c1, B:120:0x01c6), top: B:157:0x0003, inners: #15, #12, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c6 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p241e.p307h.p308a.p311g0.RunnableC9014d.run():void");
    }

    /* renamed from: s */
    public void m28824s() {
        m28821o(this.f34702m.mo28739n(this.f34698i.m27561e()));
        this.f34696g.m28867r();
    }

    private RunnableC9014d(FileDownloadModel fileDownloadModel, FileDownloadHeader fileDownloadHeader, InterfaceC9050y interfaceC9050y, int i2, int i3, boolean z, boolean z2, int i4) {
        this.f34697h = 5;
        this.f34706q = false;
        this.f34708s = new ArrayList<>(5);
        this.f34692D = 0L;
        this.f34693E = 0L;
        this.f34694F = 0L;
        this.f34695G = 0L;
        this.f34714y = new AtomicBoolean(true);
        this.f34715z = false;
        this.f34704o = false;
        this.f34698i = fileDownloadModel;
        this.f34699j = fileDownloadHeader;
        this.f34700k = z;
        this.f34701l = z2;
        this.f34702m = C9013c.m28789j().m28795f();
        this.f34707r = C9013c.m28789j().m28799m();
        this.f34703n = interfaceC9050y;
        this.f34705p = i4;
        this.f34696g = new C9016f(fileDownloadModel, i4, i2, i3);
    }
}
