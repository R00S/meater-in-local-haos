package p241e.p307h.p308a.p311g0;

import android.database.sqlite.SQLiteFullException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.message.C8694b;
import com.liulishuo.filedownloader.message.C8695c;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.services.C8706f;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;
import p241e.p307h.p308a.p310f0.InterfaceC9005a;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9035e;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: DownloadStatusCallback.java */
/* renamed from: e.h.a.g0.f */
/* loaded from: classes2.dex */
public class C9016f implements Handler.Callback {

    /* renamed from: f */
    private final FileDownloadModel f34739f;

    /* renamed from: h */
    private final a f34741h;

    /* renamed from: i */
    private final int f34742i;

    /* renamed from: j */
    private final int f34743j;

    /* renamed from: k */
    private final int f34744k;

    /* renamed from: l */
    private long f34745l;

    /* renamed from: m */
    private Handler f34746m;

    /* renamed from: n */
    private HandlerThread f34747n;

    /* renamed from: p */
    private volatile Thread f34749p;

    /* renamed from: o */
    private volatile boolean f34748o = false;

    /* renamed from: q */
    private volatile long f34750q = 0;

    /* renamed from: r */
    private final AtomicLong f34751r = new AtomicLong();

    /* renamed from: s */
    private final AtomicBoolean f34752s = new AtomicBoolean(false);

    /* renamed from: t */
    private final AtomicBoolean f34753t = new AtomicBoolean(false);

    /* renamed from: u */
    private final AtomicBoolean f34754u = new AtomicBoolean(true);

    /* renamed from: g */
    private final InterfaceC9005a f34740g = C9013c.m28789j().m28795f();

    /* compiled from: DownloadStatusCallback.java */
    /* renamed from: e.h.a.g0.f$a */
    public static class a {

        /* renamed from: a */
        private boolean f34755a;

        /* renamed from: b */
        private Exception f34756b;

        /* renamed from: c */
        private int f34757c;

        /* renamed from: a */
        public Exception m28871a() {
            return this.f34756b;
        }

        /* renamed from: b */
        public int m28872b() {
            return this.f34757c;
        }

        /* renamed from: c */
        public boolean m28873c() {
            return this.f34755a;
        }

        /* renamed from: d */
        void m28874d(Exception exc) {
            this.f34756b = exc;
        }

        /* renamed from: e */
        void m28875e(boolean z) {
            this.f34755a = z;
        }

        /* renamed from: f */
        void m28876f(int i2) {
            this.f34757c = i2;
        }
    }

    C9016f(FileDownloadModel fileDownloadModel, int i2, int i3, int i4) {
        this.f34739f = fileDownloadModel;
        this.f34743j = i3 < 5 ? 5 : i3;
        this.f34744k = i4;
        this.f34741h = new a();
        this.f34742i = i2;
    }

    /* renamed from: a */
    private static long m28847a(long j2, long j3) {
        if (j3 <= 0) {
            return -1L;
        }
        if (j2 == -1) {
            return 1L;
        }
        long j4 = j2 / j3;
        if (j4 <= 0) {
            return 1L;
        }
        return j4;
    }

    /* renamed from: c */
    private Exception m28848c(Exception exc) {
        long length;
        String strM27566j = this.f34739f.m27566j();
        if ((!this.f34739f.m27570n() && !C9035e.m28971a().f34825f) || !(exc instanceof IOException) || !new File(strM27566j).exists()) {
            return exc;
        }
        long jM29018x = C9036f.m29018x(strM27566j);
        if (jM29018x > 4096) {
            return exc;
        }
        File file = new File(strM27566j);
        if (file.exists()) {
            length = file.length();
        } else {
            C9034d.m28964c(this, exc, "Exception with: free space isn't enough, and the target file not exist.", new Object[0]);
            length = 0;
        }
        return Build.VERSION.SDK_INT >= 9 ? new FileDownloadOutOfSpaceException(jM29018x, 4096L, length, exc) : new FileDownloadOutOfSpaceException(jM29018x, 4096L, length);
    }

    /* renamed from: d */
    private void m28849d() throws Throwable {
        m28858w();
        this.f34739f.m27581y((byte) -3);
        this.f34740g.mo28729d(this.f34739f.m27561e(), this.f34739f.m27567k());
        this.f34740g.mo28733h(this.f34739f.m27561e());
        m28857v((byte) -3);
        if (C9035e.m28971a().f34826g) {
            C8706f.m27648a(this.f34739f);
        }
    }

    /* renamed from: e */
    private void m28850e(Exception exc) {
        Exception exc2;
        Exception excM28848c = m28848c(exc);
        if (excM28848c instanceof SQLiteFullException) {
            m28854i((SQLiteFullException) excM28848c);
            exc2 = excM28848c;
        } else {
            try {
                this.f34739f.m27581y((byte) -1);
                this.f34739f.m27576t(exc.toString());
                this.f34740g.mo28736k(this.f34739f.m27561e(), excM28848c, this.f34739f.m27563g());
                exc2 = excM28848c;
            } catch (SQLiteFullException e2) {
                SQLiteFullException sQLiteFullException = e2;
                m28854i(sQLiteFullException);
                exc2 = sQLiteFullException;
            }
        }
        this.f34741h.m28874d(exc2);
        m28857v((byte) -1);
    }

    /* renamed from: f */
    private void m28851f() {
        this.f34739f.m27581y((byte) -2);
        this.f34740g.mo28742q(this.f34739f.m27561e(), this.f34739f.m27563g());
        m28857v((byte) -2);
    }

    /* renamed from: g */
    private void m28852g() {
        if (this.f34739f.m27563g() == this.f34739f.m27567k()) {
            this.f34740g.mo28737l(this.f34739f.m27561e(), this.f34739f.m27563g());
            return;
        }
        if (this.f34753t.compareAndSet(true, false)) {
            if (C9034d.f34819a) {
                C9034d.m28966e(this, "handleProgress update model's status with progress", new Object[0]);
            }
            this.f34739f.m27581y((byte) 3);
        }
        if (this.f34752s.compareAndSet(true, false)) {
            if (C9034d.f34819a) {
                C9034d.m28966e(this, "handleProgress notify user progress status", new Object[0]);
            }
            m28857v((byte) 3);
        }
    }

    /* renamed from: h */
    private void m28853h(Exception exc, int i2) {
        Exception excM28848c = m28848c(exc);
        this.f34741h.m28874d(excM28848c);
        this.f34741h.m28876f(this.f34742i - i2);
        this.f34739f.m27581y((byte) 5);
        this.f34739f.m27576t(excM28848c.toString());
        this.f34740g.mo28728c(this.f34739f.m27561e(), excM28848c);
        m28857v((byte) 5);
    }

    /* renamed from: i */
    private void m28854i(SQLiteFullException sQLiteFullException) {
        int iM27561e = this.f34739f.m27561e();
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "the data of the task[%d] is dirty, because the SQLite full exception[%s], so remove it from the database directly.", Integer.valueOf(iM27561e), sQLiteFullException.toString());
        }
        this.f34739f.m27576t(sQLiteFullException.toString());
        this.f34739f.m27581y((byte) -1);
        this.f34740g.remove(iM27561e);
        this.f34740g.mo28733h(iM27561e);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m28855j(long r10) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f34754u
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto Lc
        La:
            r0 = 1
            goto L2d
        Lc:
            long r3 = r9.f34750q
            long r3 = r10 - r3
            long r5 = r9.f34745l
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L2c
            java.util.concurrent.atomic.AtomicLong r0 = r9.f34751r
            long r5 = r0.get()
            long r7 = r9.f34745l
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L2c
            int r0 = r9.f34743j
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L2c
            goto La
        L2c:
            r0 = 0
        L2d:
            if (r0 == 0) goto L4b
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f34752s
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L4b
            boolean r0 = p241e.p307h.p308a.p315k0.C9034d.f34819a
            if (r0 == 0) goto L42
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "inspectNeedCallbackToUser need callback to user"
            p241e.p307h.p308a.p315k0.C9034d.m28966e(r9, r1, r0)
        L42:
            r9.f34750q = r10
            java.util.concurrent.atomic.AtomicLong r10 = r9.f34751r
            r0 = 0
            r10.set(r0)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p241e.p307h.p308a.p311g0.C9016f.m28855j(long):void");
    }

    /* renamed from: k */
    private boolean m28856k() {
        if (this.f34739f.m27570n()) {
            FileDownloadModel fileDownloadModel = this.f34739f;
            fileDownloadModel.m27582z(fileDownloadModel.m27563g());
        } else if (this.f34739f.m27563g() != this.f34739f.m27567k()) {
            m28864o(new FileDownloadGiveUpRetryException(C9036f.m29009o("sofar[%d] not equal total[%d]", Long.valueOf(this.f34739f.m27563g()), Long.valueOf(this.f34739f.m27567k()))));
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private void m28857v(byte b2) {
        if (b2 != -2) {
            C8694b.m27535a().m27536b(C8695c.m27544e(b2, this.f34739f, this.f34741h));
        } else if (C9034d.f34819a) {
            C9034d.m28962a(this, "High concurrent cause, Already paused and we don't need to call-back to Task in here, %d", Integer.valueOf(this.f34739f.m27561e()));
        }
    }

    /* renamed from: w */
    private void m28858w() throws Throwable {
        boolean z;
        String strM27566j = this.f34739f.m27566j();
        String strM27565i = this.f34739f.m27565i();
        File file = new File(strM27566j);
        try {
            File file2 = new File(strM27565i);
            if (file2.exists()) {
                long length = file2.length();
                if (!file2.delete()) {
                    throw new IOException(C9036f.m29009o("Can't delete the old file([%s], [%d]), so can't replace it with the new downloaded one.", strM27565i, Long.valueOf(length)));
                }
                C9034d.m28970i(this, "The target file([%s], [%d]) will be replaced with the new downloaded file[%d]", strM27565i, Long.valueOf(length), Long.valueOf(file.length()));
            }
            z = !file.renameTo(file2);
            if (!z) {
                if (z && file.exists() && !file.delete()) {
                    C9034d.m28970i(this, "delete the temp file(%s) failed, on completed downloading.", strM27566j);
                    return;
                }
                return;
            }
            try {
                throw new IOException(C9036f.m29009o("Can't rename the  temp downloaded file(%s) to the target file(%s)", strM27566j, strM27565i));
            } catch (Throwable th) {
                th = th;
                if (z && file.exists() && !file.delete()) {
                    C9034d.m28970i(this, "delete the temp file(%s) failed, on completed downloading.", strM27566j);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = true;
        }
    }

    /* renamed from: x */
    private synchronized void m28859x(Message message) {
        if (!this.f34747n.isAlive()) {
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.", Integer.valueOf(message.what));
            }
            return;
        }
        try {
            this.f34746m.sendMessage(message);
        } catch (IllegalStateException e2) {
            if (this.f34747n.isAlive()) {
                throw e2;
            }
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.", Integer.valueOf(message.what));
            }
        }
    }

    /* renamed from: b */
    void m28860b() {
        Handler handler = this.f34746m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f34747n.quit();
            this.f34749p = Thread.currentThread();
            while (this.f34748o) {
                LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(100L));
            }
            this.f34749p = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[DONT_GENERATE] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            r0 = 1
            r4.f34748o = r0
            int r1 = r5.what
            r2 = 3
            r3 = 0
            if (r1 == r2) goto L17
            r2 = 5
            if (r1 == r2) goto Ld
            goto L1a
        Ld:
            java.lang.Object r1 = r5.obj     // Catch: java.lang.Throwable -> L26
            java.lang.Exception r1 = (java.lang.Exception) r1     // Catch: java.lang.Throwable -> L26
            int r5 = r5.arg1     // Catch: java.lang.Throwable -> L26
            r4.m28853h(r1, r5)     // Catch: java.lang.Throwable -> L26
            goto L1a
        L17:
            r4.m28852g()     // Catch: java.lang.Throwable -> L26
        L1a:
            r4.f34748o = r3
            java.lang.Thread r5 = r4.f34749p
            if (r5 == 0) goto L25
            java.lang.Thread r5 = r4.f34749p
            java.util.concurrent.locks.LockSupport.unpark(r5)
        L25:
            return r0
        L26:
            r5 = move-exception
            r4.f34748o = r3
            java.lang.Thread r0 = r4.f34749p
            if (r0 == 0) goto L32
            java.lang.Thread r0 = r4.f34749p
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L32:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p241e.p307h.p308a.p311g0.C9016f.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: l */
    public boolean m28861l() {
        HandlerThread handlerThread = this.f34747n;
        return handlerThread != null && handlerThread.isAlive();
    }

    /* renamed from: m */
    void m28862m() throws Throwable {
        if (m28856k()) {
            return;
        }
        m28849d();
    }

    /* renamed from: n */
    void m28863n(boolean z, long j2, String str, String str2) throws IllegalArgumentException {
        String strM27558b = this.f34739f.m27558b();
        if (strM27558b != null && !strM27558b.equals(str)) {
            throw new IllegalArgumentException(C9036f.m29009o("callback onConnected must with precondition succeed, but the etag is changes(%s != %s)", str, strM27558b));
        }
        this.f34741h.m28875e(z);
        this.f34739f.m27581y((byte) 2);
        this.f34739f.m27582z(j2);
        this.f34739f.m27575s(str);
        this.f34739f.m27577u(str2);
        this.f34740g.mo28738m(this.f34739f.m27561e(), j2, str, str2);
        m28857v((byte) 2);
        this.f34745l = m28847a(j2, this.f34744k);
        this.f34753t.compareAndSet(false, true);
    }

    /* renamed from: o */
    void m28864o(Exception exc) {
        m28850e(exc);
    }

    /* renamed from: p */
    void m28865p() {
        HandlerThread handlerThread = new HandlerThread("source-status-callback");
        this.f34747n = handlerThread;
        handlerThread.start();
        this.f34746m = new Handler(this.f34747n.getLooper(), this);
    }

    /* renamed from: q */
    void m28866q() {
        m28851f();
    }

    /* renamed from: r */
    public void m28867r() {
        this.f34739f.m27581y((byte) 1);
        this.f34740g.mo28726a(this.f34739f.m27561e());
        m28857v((byte) 1);
    }

    /* renamed from: s */
    void m28868s(long j2) {
        this.f34751r.addAndGet(j2);
        this.f34739f.m27569m(j2);
        m28855j(SystemClock.elapsedRealtime());
        if (this.f34746m == null) {
            m28852g();
        } else if (this.f34752s.get()) {
            m28859x(this.f34746m.obtainMessage(3));
        }
    }

    /* renamed from: t */
    void m28869t(Exception exc, int i2) {
        this.f34751r.set(0L);
        Handler handler = this.f34746m;
        if (handler == null) {
            m28853h(exc, i2);
        } else {
            m28859x(handler.obtainMessage(5, i2, 0, exc));
        }
    }

    /* renamed from: u */
    void m28870u() {
        this.f34739f.m27581y((byte) 6);
        m28857v((byte) 6);
        this.f34740g.mo28734i(this.f34739f.m27561e());
    }
}
