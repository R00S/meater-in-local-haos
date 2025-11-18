package p456rx.p457l.p459c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11243h;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p457l.p458b.C11248a;
import p456rx.p457l.p458b.C11249b;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p471q.C11412f;
import p456rx.p474t.C11429e;

/* compiled from: LooperScheduler.java */
/* renamed from: rx.l.c.b */
/* loaded from: classes3.dex */
class C11251b extends AbstractC11243h {

    /* renamed from: a */
    private final Handler f42144a;

    /* compiled from: LooperScheduler.java */
    /* renamed from: rx.l.c.b$a */
    static class a extends AbstractC11243h.a {

        /* renamed from: f */
        private final Handler f42145f;

        /* renamed from: g */
        private final C11249b f42146g = C11248a.m40150a().m40151b();

        /* renamed from: h */
        private volatile boolean f42147h;

        a(Handler handler) {
            this.f42145f = handler;
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: c */
        public InterfaceC11246k mo40146c(InterfaceC11252a interfaceC11252a) {
            return mo40147d(interfaceC11252a, 0L, TimeUnit.MILLISECONDS);
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: d */
        public InterfaceC11246k mo40147d(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit) {
            if (this.f42147h) {
                return C11429e.m40676c();
            }
            b bVar = new b(this.f42146g.m40154c(interfaceC11252a), this.f42145f);
            Message messageObtain = Message.obtain(this.f42145f, bVar);
            messageObtain.obj = this;
            this.f42145f.sendMessageDelayed(messageObtain, timeUnit.toMillis(j2));
            if (!this.f42147h) {
                return bVar;
            }
            this.f42145f.removeCallbacks(bVar);
            return C11429e.m40676c();
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f42147h;
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            this.f42147h = true;
            this.f42145f.removeCallbacksAndMessages(this);
        }
    }

    /* compiled from: LooperScheduler.java */
    /* renamed from: rx.l.c.b$b */
    static final class b implements Runnable, InterfaceC11246k {

        /* renamed from: f */
        private final InterfaceC11252a f42148f;

        /* renamed from: g */
        private final Handler f42149g;

        /* renamed from: h */
        private volatile boolean f42150h;

        b(InterfaceC11252a interfaceC11252a, Handler handler) {
            this.f42148f = interfaceC11252a;
            this.f42149g = handler;
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f42150h;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f42148f.call();
            } catch (Throwable th) {
                IllegalStateException illegalStateException = th instanceof OnErrorNotImplementedException ? new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th) : new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th);
                C11412f.m40607c().m40611b().m40566a(illegalStateException);
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, illegalStateException);
            }
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            this.f42150h = true;
            this.f42149g.removeCallbacks(this);
        }
    }

    C11251b(Looper looper) {
        this.f42144a = new Handler(looper);
    }

    @Override // p456rx.AbstractC11243h
    public AbstractC11243h.a createWorker() {
        return new a(this.f42144a);
    }
}
