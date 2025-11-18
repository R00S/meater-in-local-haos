package p323h.p324a.p329z.p334e.p336b;

import io.reactivex.exceptions.C9240a;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import p323h.p324a.AbstractC9071h;
import p323h.p324a.InterfaceC9072i;
import p323h.p324a.p328y.InterfaceC9093a;
import p323h.p324a.p329z.p332c.InterfaceC9113e;
import p323h.p324a.p329z.p340f.C9158b;
import p323h.p324a.p329z.p340f.C9159c;
import p323h.p324a.p329z.p343i.AbstractC9174a;
import p323h.p324a.p329z.p343i.EnumC9175b;
import p323h.p324a.p329z.p344j.C9177b;
import p355k.p356a.InterfaceC9729b;
import p355k.p356a.InterfaceC9730c;

/* compiled from: FlowableOnBackpressureBuffer.java */
/* renamed from: h.a.z.e.b.c */
/* loaded from: classes2.dex */
public final class C9124c<T> extends AbstractC9122a<T, T> {

    /* renamed from: c */
    final int f34977c;

    /* renamed from: d */
    final boolean f34978d;

    /* renamed from: e */
    final boolean f34979e;

    /* renamed from: f */
    final InterfaceC9093a f34980f;

    /* compiled from: FlowableOnBackpressureBuffer.java */
    /* renamed from: h.a.z.e.b.c$a */
    static final class a<T> extends AbstractC9174a<T> implements InterfaceC9072i<T> {

        /* renamed from: f */
        final InterfaceC9729b<? super T> f34981f;

        /* renamed from: g */
        final InterfaceC9113e<T> f34982g;

        /* renamed from: h */
        final boolean f34983h;

        /* renamed from: i */
        final InterfaceC9093a f34984i;

        /* renamed from: j */
        InterfaceC9730c f34985j;

        /* renamed from: k */
        volatile boolean f34986k;

        /* renamed from: l */
        volatile boolean f34987l;

        /* renamed from: m */
        Throwable f34988m;

        /* renamed from: n */
        final AtomicLong f34989n = new AtomicLong();

        /* renamed from: o */
        boolean f34990o;

        a(InterfaceC9729b<? super T> interfaceC9729b, int i2, boolean z, boolean z2, InterfaceC9093a interfaceC9093a) {
            this.f34981f = interfaceC9729b;
            this.f34984i = interfaceC9093a;
            this.f34983h = z2;
            this.f34982g = z ? new C9159c<>(i2) : new C9158b<>(i2);
        }

        @Override // p355k.p356a.InterfaceC9729b
        /* renamed from: a */
        public void mo29121a() {
            this.f34987l = true;
            if (this.f34990o) {
                this.f34981f.mo29121a();
            } else {
                m29278d();
            }
        }

        @Override // p355k.p356a.InterfaceC9729b
        /* renamed from: b */
        public void mo29122b(InterfaceC9730c interfaceC9730c) {
            if (EnumC9175b.m29383y(this.f34985j, interfaceC9730c)) {
                this.f34985j = interfaceC9730c;
                this.f34981f.mo29122b(this);
                interfaceC9730c.request(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        boolean m29277c(boolean z, boolean z2, InterfaceC9729b<? super T> interfaceC9729b) {
            if (this.f34986k) {
                this.f34982g.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f34983h) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f34988m;
                if (th != null) {
                    interfaceC9729b.onError(th);
                } else {
                    interfaceC9729b.mo29121a();
                }
                return true;
            }
            Throwable th2 = this.f34988m;
            if (th2 != null) {
                this.f34982g.clear();
                interfaceC9729b.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            interfaceC9729b.mo29121a();
            return true;
        }

        @Override // p355k.p356a.InterfaceC9730c
        public void cancel() {
            if (this.f34986k) {
                return;
            }
            this.f34986k = true;
            this.f34985j.cancel();
            if (this.f34990o || getAndIncrement() != 0) {
                return;
            }
            this.f34982g.clear();
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
        public void clear() {
            this.f34982g.clear();
        }

        /* renamed from: d */
        void m29278d() {
            if (getAndIncrement() == 0) {
                InterfaceC9113e<T> interfaceC9113e = this.f34982g;
                InterfaceC9729b<? super T> interfaceC9729b = this.f34981f;
                int iAddAndGet = 1;
                while (!m29277c(this.f34987l, interfaceC9113e.isEmpty(), interfaceC9729b)) {
                    long j2 = this.f34989n.get();
                    long j3 = 0;
                    while (j3 != j2) {
                        boolean z = this.f34987l;
                        T tPoll = interfaceC9113e.poll();
                        boolean z2 = tPoll == null;
                        if (m29277c(z, z2, interfaceC9729b)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        interfaceC9729b.onNext(tPoll);
                        j3++;
                    }
                    if (j3 == j2 && m29277c(this.f34987l, interfaceC9113e.isEmpty(), interfaceC9729b)) {
                        return;
                    }
                    if (j3 != 0 && j2 != Long.MAX_VALUE) {
                        this.f34989n.addAndGet(-j3);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
        public boolean isEmpty() {
            return this.f34982g.isEmpty();
        }

        @Override // p355k.p356a.InterfaceC9729b
        public void onError(Throwable th) {
            this.f34988m = th;
            this.f34987l = true;
            if (this.f34990o) {
                this.f34981f.onError(th);
            } else {
                m29278d();
            }
        }

        @Override // p355k.p356a.InterfaceC9729b
        public void onNext(T t) {
            if (this.f34982g.offer(t)) {
                if (this.f34990o) {
                    this.f34981f.onNext(null);
                    return;
                } else {
                    m29278d();
                    return;
                }
            }
            this.f34985j.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f34984i.run();
            } catch (Throwable th) {
                C9240a.m30000a(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
        public T poll() throws Exception {
            return this.f34982g.poll();
        }

        @Override // p355k.p356a.InterfaceC9730c
        public void request(long j2) {
            if (this.f34990o || !EnumC9175b.m29382x(j2)) {
                return;
            }
            C9177b.m29386a(this.f34989n, j2);
            m29278d();
        }
    }

    public C9124c(AbstractC9071h<T> abstractC9071h, int i2, boolean z, boolean z2, InterfaceC9093a interfaceC9093a) {
        super(abstractC9071h);
        this.f34977c = i2;
        this.f34978d = z;
        this.f34979e = z2;
        this.f34980f = interfaceC9093a;
    }

    @Override // p323h.p324a.AbstractC9071h
    /* renamed from: i */
    protected void mo29179i(InterfaceC9729b<? super T> interfaceC9729b) {
        this.f34973b.m29178h(new a(interfaceC9729b, this.f34977c, this.f34978d, this.f34979e, this.f34980f));
    }
}
