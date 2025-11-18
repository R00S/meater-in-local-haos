package p241e.p307h.p308a.p310f0;

import android.database.SQLException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.liulishuo.filedownloader.model.C8699a;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import p241e.p307h.p308a.p310f0.InterfaceC9005a;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9035e;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: RemitDatabase.java */
/* renamed from: e.h.a.f0.c */
/* loaded from: classes2.dex */
public class C9007c implements InterfaceC9005a {

    /* renamed from: c */
    private Handler f34646c;

    /* renamed from: g */
    private volatile Thread f34650g;

    /* renamed from: e */
    private final List<Integer> f34648e = new ArrayList();

    /* renamed from: f */
    private AtomicInteger f34649f = new AtomicInteger();

    /* renamed from: a */
    private final C9006b f34644a = new C9006b();

    /* renamed from: b */
    private final C9008d f34645b = new C9008d();

    /* renamed from: d */
    private final long f34647d = C9035e.m28971a().f34821b;

    /* compiled from: RemitDatabase.java */
    /* renamed from: e.h.a.f0.c$a */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                if (C9007c.this.f34650g != null) {
                    LockSupport.unpark(C9007c.this.f34650g);
                    C9007c.this.f34650g = null;
                }
                return false;
            }
            try {
                C9007c.this.f34649f.set(i2);
                C9007c.this.m28756y(i2);
                C9007c.this.f34648e.add(Integer.valueOf(i2));
                return false;
            } finally {
                C9007c.this.f34649f.set(0);
                if (C9007c.this.f34650g != null) {
                    LockSupport.unpark(C9007c.this.f34650g);
                    C9007c.this.f34650g = null;
                }
            }
        }
    }

    public C9007c() {
        HandlerThread handlerThread = new HandlerThread(C9036f.m28977D("RemitHandoverToDB"));
        handlerThread.start();
        this.f34646c = new Handler(handlerThread.getLooper(), new a());
    }

    /* renamed from: w */
    private void m28754w(int i2) throws SQLException {
        this.f34646c.removeMessages(i2);
        if (this.f34649f.get() != i2) {
            m28756y(i2);
            return;
        }
        this.f34650g = Thread.currentThread();
        this.f34646c.sendEmptyMessage(0);
        LockSupport.park();
    }

    /* renamed from: x */
    private boolean m28755x(int i2) {
        return !this.f34648e.contains(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m28756y(int i2) throws SQLException {
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "sync cache to db %d", Integer.valueOf(i2));
        }
        this.f34645b.mo28735j(this.f34644a.mo28740o(i2));
        List<C8699a> listMo28739n = this.f34644a.mo28739n(i2);
        this.f34645b.mo28733h(i2);
        Iterator<C8699a> it = listMo28739n.iterator();
        while (it.hasNext()) {
            this.f34645b.mo28732g(it.next());
        }
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: a */
    public void mo28726a(int i2) {
        this.f34644a.mo28726a(i2);
        if (m28755x(i2)) {
            return;
        }
        this.f34645b.mo28726a(i2);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: b */
    public InterfaceC9005a.a mo28727b() {
        C9008d c9008d = this.f34645b;
        C9006b c9006b = this.f34644a;
        return c9008d.m28762v(c9006b.f34640a, c9006b.f34641b);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: c */
    public void mo28728c(int i2, Throwable th) {
        this.f34644a.mo28728c(i2, th);
        if (m28755x(i2)) {
            return;
        }
        this.f34645b.mo28728c(i2, th);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    public void clear() {
        this.f34644a.clear();
        this.f34645b.clear();
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: d */
    public void mo28729d(int i2, long j2) {
        this.f34644a.mo28729d(i2, j2);
        if (m28755x(i2)) {
            this.f34646c.removeMessages(i2);
            if (this.f34649f.get() == i2) {
                this.f34650g = Thread.currentThread();
                this.f34646c.sendEmptyMessage(0);
                LockSupport.park();
                this.f34645b.mo28729d(i2, j2);
            }
        } else {
            this.f34645b.mo28729d(i2, j2);
        }
        this.f34648e.remove(Integer.valueOf(i2));
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: e */
    public void mo28730e(int i2, String str, long j2, long j3, int i3) {
        this.f34644a.mo28730e(i2, str, j2, j3, i3);
        if (m28755x(i2)) {
            return;
        }
        this.f34645b.mo28730e(i2, str, j2, j3, i3);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: f */
    public void mo28731f(int i2, int i3, long j2) {
        this.f34644a.mo28731f(i2, i3, j2);
        if (m28755x(i2)) {
            return;
        }
        this.f34645b.mo28731f(i2, i3, j2);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: g */
    public void mo28732g(C8699a c8699a) {
        this.f34644a.mo28732g(c8699a);
        if (m28755x(c8699a.m27588c())) {
            return;
        }
        this.f34645b.mo28732g(c8699a);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: h */
    public void mo28733h(int i2) throws SQLException {
        this.f34644a.mo28733h(i2);
        if (m28755x(i2)) {
            return;
        }
        this.f34645b.mo28733h(i2);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: i */
    public void mo28734i(int i2) {
        this.f34646c.sendEmptyMessageDelayed(i2, this.f34647d);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: j */
    public void mo28735j(FileDownloadModel fileDownloadModel) {
        this.f34644a.mo28735j(fileDownloadModel);
        if (m28755x(fileDownloadModel.m27561e())) {
            return;
        }
        this.f34645b.mo28735j(fileDownloadModel);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: k */
    public void mo28736k(int i2, Throwable th, long j2) throws SQLException {
        this.f34644a.mo28736k(i2, th, j2);
        if (m28755x(i2)) {
            m28754w(i2);
        }
        this.f34645b.mo28736k(i2, th, j2);
        this.f34648e.remove(Integer.valueOf(i2));
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: l */
    public void mo28737l(int i2, long j2) {
        this.f34644a.mo28737l(i2, j2);
        if (m28755x(i2)) {
            return;
        }
        this.f34645b.mo28737l(i2, j2);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: m */
    public void mo28738m(int i2, long j2, String str, String str2) {
        this.f34644a.mo28738m(i2, j2, str, str2);
        if (m28755x(i2)) {
            return;
        }
        this.f34645b.mo28738m(i2, j2, str, str2);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: n */
    public List<C8699a> mo28739n(int i2) {
        return this.f34644a.mo28739n(i2);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: o */
    public FileDownloadModel mo28740o(int i2) {
        return this.f34644a.mo28740o(i2);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: p */
    public void mo28741p(int i2, int i3) {
        this.f34644a.mo28741p(i2, i3);
        if (m28755x(i2)) {
            return;
        }
        this.f34645b.mo28741p(i2, i3);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    /* renamed from: q */
    public void mo28742q(int i2, long j2) throws SQLException {
        this.f34644a.mo28742q(i2, j2);
        if (m28755x(i2)) {
            m28754w(i2);
        }
        this.f34645b.mo28742q(i2, j2);
        this.f34648e.remove(Integer.valueOf(i2));
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC9005a
    public boolean remove(int i2) {
        this.f34645b.remove(i2);
        return this.f34644a.remove(i2);
    }
}
