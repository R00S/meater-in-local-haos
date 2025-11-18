package androidx.media3.exoplayer;

import X1.C1804a;
import X1.InterfaceC1807d;
import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* compiled from: PlayerMessage.java */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    private final b f27466a;

    /* renamed from: b, reason: collision with root package name */
    private final a f27467b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1807d f27468c;

    /* renamed from: d, reason: collision with root package name */
    private final U1.G f27469d;

    /* renamed from: e, reason: collision with root package name */
    private int f27470e;

    /* renamed from: f, reason: collision with root package name */
    private Object f27471f;

    /* renamed from: g, reason: collision with root package name */
    private Looper f27472g;

    /* renamed from: h, reason: collision with root package name */
    private int f27473h;

    /* renamed from: i, reason: collision with root package name */
    private long f27474i = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private boolean f27475j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27476k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f27477l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f27478m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f27479n;

    /* compiled from: PlayerMessage.java */
    public interface a {
        void d(r0 r0Var);
    }

    /* compiled from: PlayerMessage.java */
    public interface b {
        void J(int i10, Object obj);
    }

    public r0(a aVar, b bVar, U1.G g10, int i10, InterfaceC1807d interfaceC1807d, Looper looper) {
        this.f27467b = aVar;
        this.f27466a = bVar;
        this.f27469d = g10;
        this.f27472g = looper;
        this.f27468c = interfaceC1807d;
        this.f27473h = i10;
    }

    public synchronized boolean a(long j10) {
        boolean z10;
        try {
            C1804a.g(this.f27476k);
            C1804a.g(this.f27472g.getThread() != Thread.currentThread());
            long jC = this.f27468c.c() + j10;
            while (true) {
                z10 = this.f27478m;
                if (z10 || j10 <= 0) {
                    break;
                }
                this.f27468c.f();
                wait(j10);
                j10 = jC - this.f27468c.c();
            }
            if (!z10) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f27477l;
    }

    public boolean b() {
        return this.f27475j;
    }

    public Looper c() {
        return this.f27472g;
    }

    public int d() {
        return this.f27473h;
    }

    public Object e() {
        return this.f27471f;
    }

    public long f() {
        return this.f27474i;
    }

    public b g() {
        return this.f27466a;
    }

    public U1.G h() {
        return this.f27469d;
    }

    public int i() {
        return this.f27470e;
    }

    public synchronized boolean j() {
        return this.f27479n;
    }

    public synchronized void k(boolean z10) {
        this.f27477l = z10 | this.f27477l;
        this.f27478m = true;
        notifyAll();
    }

    public r0 l() {
        C1804a.g(!this.f27476k);
        if (this.f27474i == -9223372036854775807L) {
            C1804a.a(this.f27475j);
        }
        this.f27476k = true;
        this.f27467b.d(this);
        return this;
    }

    public r0 m(Object obj) {
        C1804a.g(!this.f27476k);
        this.f27471f = obj;
        return this;
    }

    public r0 n(int i10) {
        C1804a.g(!this.f27476k);
        this.f27470e = i10;
        return this;
    }
}
