package p024c.p073p.p075b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p024c.p052i.p059j.C0960j;

/* compiled from: AsyncTaskLoader.java */
/* renamed from: c.p.b.a */
/* loaded from: classes.dex */
public abstract class AbstractC0994a<D> extends C0995b<D> {

    /* renamed from: j */
    private final Executor f6543j;

    /* renamed from: k */
    volatile AbstractC0994a<D>.a f6544k;

    /* renamed from: l */
    volatile AbstractC0994a<D>.a f6545l;

    /* renamed from: m */
    long f6546m;

    /* renamed from: n */
    long f6547n;

    /* renamed from: o */
    Handler f6548o;

    /* compiled from: AsyncTaskLoader.java */
    /* renamed from: c.p.b.a$a */
    final class a extends AbstractC0996c<Void, Void, D> implements Runnable {

        /* renamed from: p */
        private final CountDownLatch f6549p = new CountDownLatch(1);

        /* renamed from: q */
        boolean f6550q;

        a() {
        }

        @Override // p024c.p073p.p075b.AbstractC0996c
        /* renamed from: h */
        protected void mo6308h(D d2) {
            try {
                AbstractC0994a.this.m6305y(this, d2);
            } finally {
                this.f6549p.countDown();
            }
        }

        @Override // p024c.p073p.p075b.AbstractC0996c
        /* renamed from: i */
        protected void mo6309i(D d2) {
            try {
                AbstractC0994a.this.m6306z(this, d2);
            } finally {
                this.f6549p.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p024c.p073p.p075b.AbstractC0996c
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public D mo6307b(Void... voidArr) {
            try {
                return (D) AbstractC0994a.this.m6300D();
            } catch (OperationCanceledException e2) {
                if (m6335f()) {
                    return null;
                }
                throw e2;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6550q = false;
            AbstractC0994a.this.m6297A();
        }
    }

    public AbstractC0994a(Context context) {
        this(context, AbstractC0996c.f6563h);
    }

    /* renamed from: A */
    void m6297A() {
        if (this.f6545l != null || this.f6544k == null) {
            return;
        }
        if (this.f6544k.f6550q) {
            this.f6544k.f6550q = false;
            this.f6548o.removeCallbacks(this.f6544k);
        }
        if (this.f6546m <= 0 || SystemClock.uptimeMillis() >= this.f6547n + this.f6546m) {
            this.f6544k.m6333c(this.f6543j, null);
        } else {
            this.f6544k.f6550q = true;
            this.f6548o.postAtTime(this.f6544k, this.f6547n + this.f6546m);
        }
    }

    /* renamed from: B */
    public abstract D mo6298B();

    /* renamed from: C */
    public void m6299C(D d2) {
    }

    /* renamed from: D */
    protected D m6300D() {
        return mo6298B();
    }

    @Override // p024c.p073p.p075b.C0995b
    @Deprecated
    /* renamed from: h */
    public void mo6301h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo6301h(str, fileDescriptor, printWriter, strArr);
        if (this.f6544k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f6544k);
            printWriter.print(" waiting=");
            printWriter.println(this.f6544k.f6550q);
        }
        if (this.f6545l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f6545l);
            printWriter.print(" waiting=");
            printWriter.println(this.f6545l.f6550q);
        }
        if (this.f6546m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0960j.m6069c(this.f6546m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0960j.m6068b(this.f6547n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // p024c.p073p.p075b.C0995b
    /* renamed from: l */
    protected boolean mo6302l() {
        if (this.f6544k == null) {
            return false;
        }
        if (!this.f6556e) {
            this.f6559h = true;
        }
        if (this.f6545l != null) {
            if (this.f6544k.f6550q) {
                this.f6544k.f6550q = false;
                this.f6548o.removeCallbacks(this.f6544k);
            }
            this.f6544k = null;
            return false;
        }
        if (this.f6544k.f6550q) {
            this.f6544k.f6550q = false;
            this.f6548o.removeCallbacks(this.f6544k);
            this.f6544k = null;
            return false;
        }
        boolean zM6332a = this.f6544k.m6332a(false);
        if (zM6332a) {
            this.f6545l = this.f6544k;
            m6304x();
        }
        this.f6544k = null;
        return zM6332a;
    }

    @Override // p024c.p073p.p075b.C0995b
    /* renamed from: n */
    protected void mo6303n() {
        super.mo6303n();
        m6312c();
        this.f6544k = new a();
        m6297A();
    }

    /* renamed from: x */
    public void m6304x() {
    }

    /* renamed from: y */
    void m6305y(AbstractC0994a<D>.a aVar, D d2) {
        m6299C(d2);
        if (this.f6545l == aVar) {
            m6326t();
            this.f6547n = SystemClock.uptimeMillis();
            this.f6545l = null;
            m6315f();
            m6297A();
        }
    }

    /* renamed from: z */
    void m6306z(AbstractC0994a<D>.a aVar, D d2) {
        if (this.f6544k != aVar) {
            m6305y(aVar, d2);
            return;
        }
        if (m6318j()) {
            m6299C(d2);
            return;
        }
        m6313d();
        this.f6547n = SystemClock.uptimeMillis();
        this.f6544k = null;
        m6316g(d2);
    }

    private AbstractC0994a(Context context, Executor executor) {
        super(context);
        this.f6547n = -10000L;
        this.f6543j = executor;
    }
}
