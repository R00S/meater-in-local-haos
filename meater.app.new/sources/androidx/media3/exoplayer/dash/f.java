package androidx.media3.exoplayer.dash;

import U1.InterfaceC1734j;
import U1.s;
import U1.y;
import X1.L;
import android.os.Handler;
import android.os.Message;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.source.F;
import d2.C3025C;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import o2.AbstractC4103e;
import v2.O;

/* compiled from: PlayerEmsgHandler.java */
/* loaded from: classes.dex */
public final class f implements Handler.Callback {

    /* renamed from: B, reason: collision with root package name */
    private final r2.b f27014B;

    /* renamed from: C, reason: collision with root package name */
    private final b f27015C;

    /* renamed from: G, reason: collision with root package name */
    private h2.c f27019G;

    /* renamed from: H, reason: collision with root package name */
    private long f27020H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f27021I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f27022J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f27023K;

    /* renamed from: F, reason: collision with root package name */
    private final TreeMap<Long, Long> f27018F = new TreeMap<>();

    /* renamed from: E, reason: collision with root package name */
    private final Handler f27017E = L.B(this);

    /* renamed from: D, reason: collision with root package name */
    private final G2.b f27016D = new G2.b();

    /* compiled from: PlayerEmsgHandler.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f27024a;

        /* renamed from: b, reason: collision with root package name */
        public final long f27025b;

        public a(long j10, long j11) {
            this.f27024a = j10;
            this.f27025b = j11;
        }
    }

    /* compiled from: PlayerEmsgHandler.java */
    public interface b {
        void a();

        void b(long j10);
    }

    /* compiled from: PlayerEmsgHandler.java */
    public final class c implements O {

        /* renamed from: a, reason: collision with root package name */
        private final F f27026a;

        /* renamed from: b, reason: collision with root package name */
        private final C3025C f27027b = new C3025C();

        /* renamed from: c, reason: collision with root package name */
        private final E2.b f27028c = new E2.b();

        /* renamed from: d, reason: collision with root package name */
        private long f27029d = -9223372036854775807L;

        c(r2.b bVar) {
            this.f27026a = F.l(bVar);
        }

        private E2.b g() {
            this.f27028c.t();
            if (this.f27026a.S(this.f27027b, this.f27028c, 0, false) != -4) {
                return null;
            }
            this.f27028c.E();
            return this.f27028c;
        }

        private void k(long j10, long j11) {
            f.this.f27017E.sendMessage(f.this.f27017E.obtainMessage(1, new a(j10, j11)));
        }

        private void l() {
            while (this.f27026a.L(false)) {
                E2.b bVarG = g();
                if (bVarG != null) {
                    long j10 = bVarG.f26295G;
                    y yVarA = f.this.f27016D.a(bVarG);
                    if (yVarA != null) {
                        G2.a aVar = (G2.a) yVarA.d(0);
                        if (f.h(aVar.f4859B, aVar.f4860C)) {
                            m(j10, aVar);
                        }
                    }
                }
            }
            this.f27026a.s();
        }

        private void m(long j10, G2.a aVar) {
            long jF = f.f(aVar);
            if (jF == -9223372036854775807L) {
                return;
            }
            k(j10, jF);
        }

        @Override // v2.O
        public int a(InterfaceC1734j interfaceC1734j, int i10, boolean z10, int i11) {
            return this.f27026a.c(interfaceC1734j, i10, z10);
        }

        @Override // v2.O
        public void b(X1.y yVar, int i10, int i11) {
            this.f27026a.d(yVar, i10);
        }

        @Override // v2.O
        public void e(long j10, int i10, int i11, int i12, O.a aVar) {
            this.f27026a.e(j10, i10, i11, i12, aVar);
            l();
        }

        @Override // v2.O
        public void f(s sVar) {
            this.f27026a.f(sVar);
        }

        public boolean h(long j10) {
            return f.this.j(j10);
        }

        public void i(AbstractC4103e abstractC4103e) {
            long j10 = this.f27029d;
            if (j10 == -9223372036854775807L || abstractC4103e.f46353h > j10) {
                this.f27029d = abstractC4103e.f46353h;
            }
            f.this.m(abstractC4103e);
        }

        public boolean j(AbstractC4103e abstractC4103e) {
            long j10 = this.f27029d;
            return f.this.n(j10 != -9223372036854775807L && j10 < abstractC4103e.f46352g);
        }

        public void n() {
            this.f27026a.T();
        }
    }

    public f(h2.c cVar, b bVar, r2.b bVar2) {
        this.f27019G = cVar;
        this.f27015C = bVar;
        this.f27014B = bVar2;
    }

    private Map.Entry<Long, Long> e(long j10) {
        return this.f27018F.ceilingEntry(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(G2.a aVar) {
        try {
            return L.X0(L.H(aVar.f4863F));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = this.f27018F.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f27018F.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f27018F.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    private void i() {
        if (this.f27021I) {
            this.f27022J = true;
            this.f27021I = false;
            this.f27015C.a();
        }
    }

    private void l() {
        this.f27015C.b(this.f27020H);
    }

    private void p() {
        Iterator<Map.Entry<Long, Long>> it = this.f27018F.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f27019G.f42224h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f27023K) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f27024a, aVar.f27025b);
        return true;
    }

    boolean j(long j10) {
        h2.c cVar = this.f27019G;
        boolean z10 = false;
        if (!cVar.f42220d) {
            return false;
        }
        if (this.f27022J) {
            return true;
        }
        Map.Entry<Long, Long> entryE = e(cVar.f42224h);
        if (entryE != null && entryE.getValue().longValue() < j10) {
            this.f27020H = entryE.getKey().longValue();
            l();
            z10 = true;
        }
        if (z10) {
            i();
        }
        return z10;
    }

    public c k() {
        return new c(this.f27014B);
    }

    void m(AbstractC4103e abstractC4103e) {
        this.f27021I = true;
    }

    boolean n(boolean z10) {
        if (!this.f27019G.f42220d) {
            return false;
        }
        if (this.f27022J) {
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f27023K = true;
        this.f27017E.removeCallbacksAndMessages(null);
    }

    public void q(h2.c cVar) {
        this.f27022J = false;
        this.f27020H = -9223372036854775807L;
        this.f27019G = cVar;
        p();
    }
}
