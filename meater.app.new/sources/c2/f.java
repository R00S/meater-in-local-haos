package c2;

import X1.C1804a;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import c2.e;
import java.util.ArrayDeque;

/* compiled from: SimpleDecoder.java */
/* loaded from: classes.dex */
public abstract class f<I extends DecoderInputBuffer, O extends e, E extends DecoderException> implements d<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f30932a;

    /* renamed from: e, reason: collision with root package name */
    private final I[] f30936e;

    /* renamed from: f, reason: collision with root package name */
    private final O[] f30937f;

    /* renamed from: g, reason: collision with root package name */
    private int f30938g;

    /* renamed from: h, reason: collision with root package name */
    private int f30939h;

    /* renamed from: i, reason: collision with root package name */
    private I f30940i;

    /* renamed from: j, reason: collision with root package name */
    private E f30941j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f30942k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30943l;

    /* renamed from: m, reason: collision with root package name */
    private int f30944m;

    /* renamed from: b, reason: collision with root package name */
    private final Object f30933b = new Object();

    /* renamed from: n, reason: collision with root package name */
    private long f30945n = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f30934c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f30935d = new ArrayDeque<>();

    /* compiled from: SimpleDecoder.java */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            f.this.w();
        }
    }

    protected f(I[] iArr, O[] oArr) {
        this.f30936e = iArr;
        this.f30938g = iArr.length;
        for (int i10 = 0; i10 < this.f30938g; i10++) {
            ((I[]) this.f30936e)[i10] = j();
        }
        this.f30937f = oArr;
        this.f30939h = oArr.length;
        for (int i11 = 0; i11 < this.f30939h; i11++) {
            ((O[]) this.f30937f)[i11] = k();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f30932a = aVar;
        aVar.start();
    }

    private boolean i() {
        return !this.f30934c.isEmpty() && this.f30939h > 0;
    }

    private boolean n() {
        E e10;
        synchronized (this.f30933b) {
            while (!this.f30943l && !i()) {
                try {
                    this.f30933b.wait();
                } finally {
                }
            }
            if (this.f30943l) {
                return false;
            }
            I iRemoveFirst = this.f30934c.removeFirst();
            O[] oArr = this.f30937f;
            int i10 = this.f30939h - 1;
            this.f30939h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f30942k;
            this.f30942k = false;
            if (iRemoveFirst.w()) {
                o10.s(4);
            } else {
                o10.f30929C = iRemoveFirst.f26295G;
                if (iRemoveFirst.x()) {
                    o10.s(134217728);
                }
                if (!q(iRemoveFirst.f26295G)) {
                    o10.f30931E = true;
                }
                try {
                    e10 = (E) m(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) l(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) l(e12);
                }
                if (e10 != null) {
                    synchronized (this.f30933b) {
                        this.f30941j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f30933b) {
                try {
                    if (this.f30942k) {
                        o10.C();
                    } else if (o10.f30931E) {
                        this.f30944m++;
                        o10.C();
                    } else {
                        o10.f30930D = this.f30944m;
                        this.f30944m = 0;
                        this.f30935d.addLast(o10);
                    }
                    t(iRemoveFirst);
                } finally {
                }
            }
            return true;
        }
    }

    private void r() {
        if (i()) {
            this.f30933b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends androidx.media3.decoder.DecoderException */
    private void s() throws E {
        E e10 = this.f30941j;
        if (e10 != null) {
            throw e10;
        }
    }

    private void t(I i10) {
        i10.t();
        I[] iArr = this.f30936e;
        int i11 = this.f30938g;
        this.f30938g = i11 + 1;
        iArr[i11] = i10;
    }

    private void v(O o10) {
        o10.t();
        O[] oArr = this.f30937f;
        int i10 = this.f30939h;
        this.f30939h = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (n());
    }

    @Override // c2.d
    public final void b(long j10) {
        synchronized (this.f30933b) {
            try {
                C1804a.g(this.f30938g == this.f30936e.length || this.f30942k);
                this.f30945n = j10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c2.d
    public void c() throws InterruptedException {
        synchronized (this.f30933b) {
            this.f30943l = true;
            this.f30933b.notify();
        }
        try {
            this.f30932a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // c2.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void g(I i10) {
        synchronized (this.f30933b) {
            s();
            C1804a.a(i10 == this.f30940i);
            this.f30934c.addLast(i10);
            r();
            this.f30940i = null;
        }
    }

    @Override // c2.d
    public final void flush() {
        synchronized (this.f30933b) {
            try {
                this.f30942k = true;
                this.f30944m = 0;
                I i10 = this.f30940i;
                if (i10 != null) {
                    t(i10);
                    this.f30940i = null;
                }
                while (!this.f30934c.isEmpty()) {
                    t(this.f30934c.removeFirst());
                }
                while (!this.f30935d.isEmpty()) {
                    this.f30935d.removeFirst().C();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract I j();

    protected abstract O k();

    protected abstract E l(Throwable th);

    protected abstract E m(I i10, O o10, boolean z10);

    @Override // c2.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final I e() {
        I i10;
        synchronized (this.f30933b) {
            s();
            C1804a.g(this.f30940i == null);
            int i11 = this.f30938g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f30936e;
                int i12 = i11 - 1;
                this.f30938g = i12;
                i10 = iArr[i12];
            }
            this.f30940i = i10;
        }
        return i10;
    }

    @Override // c2.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final O a() {
        synchronized (this.f30933b) {
            try {
                s();
                if (this.f30935d.isEmpty()) {
                    return null;
                }
                return this.f30935d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final boolean q(long j10) {
        boolean z10;
        synchronized (this.f30933b) {
            long j11 = this.f30945n;
            z10 = j11 == -9223372036854775807L || j10 >= j11;
        }
        return z10;
    }

    protected void u(O o10) {
        synchronized (this.f30933b) {
            v(o10);
            r();
        }
    }

    protected final void x(int i10) {
        C1804a.g(this.f30938g == this.f30936e.length);
        for (I i11 : this.f30936e) {
            i11.D(i10);
        }
    }
}
