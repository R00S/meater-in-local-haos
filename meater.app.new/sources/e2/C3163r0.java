package e2;

import U1.G;
import X1.C1804a;
import android.util.Base64;
import androidx.media3.exoplayer.source.r;
import e2.InterfaceC3131b;
import e2.u1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: DefaultPlaybackSessionManager.java */
/* renamed from: e2.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3163r0 implements u1 {

    /* renamed from: i, reason: collision with root package name */
    public static final l8.s<String> f40227i = new l8.s() { // from class: e2.q0
        @Override // l8.s
        public final Object get() {
            return C3163r0.m();
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private static final Random f40228j = new Random();

    /* renamed from: a, reason: collision with root package name */
    private final G.c f40229a;

    /* renamed from: b, reason: collision with root package name */
    private final G.b f40230b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f40231c;

    /* renamed from: d, reason: collision with root package name */
    private final l8.s<String> f40232d;

    /* renamed from: e, reason: collision with root package name */
    private u1.a f40233e;

    /* renamed from: f, reason: collision with root package name */
    private U1.G f40234f;

    /* renamed from: g, reason: collision with root package name */
    private String f40235g;

    /* renamed from: h, reason: collision with root package name */
    private long f40236h;

    /* compiled from: DefaultPlaybackSessionManager.java */
    /* renamed from: e2.r0$a */
    private final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f40237a;

        /* renamed from: b, reason: collision with root package name */
        private int f40238b;

        /* renamed from: c, reason: collision with root package name */
        private long f40239c;

        /* renamed from: d, reason: collision with root package name */
        private r.b f40240d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f40241e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f40242f;

        public a(String str, int i10, r.b bVar) {
            this.f40237a = str;
            this.f40238b = i10;
            this.f40239c = bVar == null ? -1L : bVar.f27815d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f40240d = bVar;
        }

        private int l(U1.G g10, U1.G g11, int i10) {
            if (i10 >= g10.p()) {
                if (i10 < g11.p()) {
                    return i10;
                }
                return -1;
            }
            g10.n(i10, C3163r0.this.f40229a);
            for (int i11 = C3163r0.this.f40229a.f16857n; i11 <= C3163r0.this.f40229a.f16858o; i11++) {
                int iB = g11.b(g10.m(i11));
                if (iB != -1) {
                    return g11.f(iB, C3163r0.this.f40230b).f16823c;
                }
            }
            return -1;
        }

        public boolean i(int i10, r.b bVar) {
            if (bVar == null) {
                return i10 == this.f40238b;
            }
            r.b bVar2 = this.f40240d;
            return bVar2 == null ? !bVar.b() && bVar.f27815d == this.f40239c : bVar.f27815d == bVar2.f27815d && bVar.f27813b == bVar2.f27813b && bVar.f27814c == bVar2.f27814c;
        }

        public boolean j(InterfaceC3131b.a aVar) {
            r.b bVar = aVar.f40136d;
            if (bVar == null) {
                return this.f40238b != aVar.f40135c;
            }
            long j10 = this.f40239c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f27815d > j10) {
                return true;
            }
            if (this.f40240d == null) {
                return false;
            }
            int iB = aVar.f40134b.b(bVar.f27812a);
            int iB2 = aVar.f40134b.b(this.f40240d.f27812a);
            r.b bVar2 = aVar.f40136d;
            if (bVar2.f27815d < this.f40240d.f27815d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            if (!bVar2.b()) {
                int i10 = aVar.f40136d.f27816e;
                return i10 == -1 || i10 > this.f40240d.f27813b;
            }
            r.b bVar3 = aVar.f40136d;
            int i11 = bVar3.f27813b;
            int i12 = bVar3.f27814c;
            r.b bVar4 = this.f40240d;
            int i13 = bVar4.f27813b;
            if (i11 <= i13) {
                return i11 == i13 && i12 > bVar4.f27814c;
            }
            return true;
        }

        public void k(int i10, r.b bVar) {
            if (this.f40239c != -1 || i10 != this.f40238b || bVar == null || bVar.f27815d < C3163r0.this.n()) {
                return;
            }
            this.f40239c = bVar.f27815d;
        }

        public boolean m(U1.G g10, U1.G g11) {
            int iL = l(g10, g11, this.f40238b);
            this.f40238b = iL;
            if (iL == -1) {
                return false;
            }
            r.b bVar = this.f40240d;
            return bVar == null || g11.b(bVar.f27812a) != -1;
        }
    }

    public C3163r0() {
        this(f40227i);
    }

    private void l(a aVar) {
        if (aVar.f40239c != -1) {
            this.f40236h = aVar.f40239c;
        }
        this.f40235g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f40228j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        a aVar = this.f40231c.get(this.f40235g);
        return (aVar == null || aVar.f40239c == -1) ? this.f40236h + 1 : aVar.f40239c;
    }

    private a o(int i10, r.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f40231c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f40239c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) X1.L.i(aVar)).f40240d != null && aVar2.f40240d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f40232d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f40231c.put(str, aVar3);
        return aVar3;
    }

    private void p(InterfaceC3131b.a aVar) {
        if (aVar.f40134b.q()) {
            String str = this.f40235g;
            if (str != null) {
                l((a) C1804a.e(this.f40231c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = this.f40231c.get(this.f40235g);
        a aVarO = o(aVar.f40135c, aVar.f40136d);
        this.f40235g = aVarO.f40237a;
        e(aVar);
        r.b bVar = aVar.f40136d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f40239c == aVar.f40136d.f27815d && aVar2.f40240d != null && aVar2.f40240d.f27813b == aVar.f40136d.f27813b && aVar2.f40240d.f27814c == aVar.f40136d.f27814c) {
            return;
        }
        r.b bVar2 = aVar.f40136d;
        this.f40233e.s0(aVar, o(aVar.f40135c, new r.b(bVar2.f27812a, bVar2.f27815d)).f40237a, aVarO.f40237a);
    }

    @Override // e2.u1
    public synchronized String a() {
        return this.f40235g;
    }

    @Override // e2.u1
    public synchronized void b(InterfaceC3131b.a aVar) {
        try {
            C1804a.e(this.f40233e);
            U1.G g10 = this.f40234f;
            this.f40234f = aVar.f40134b;
            Iterator<a> it = this.f40231c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (!next.m(g10, this.f40234f) || next.j(aVar)) {
                    it.remove();
                    if (next.f40241e) {
                        if (next.f40237a.equals(this.f40235g)) {
                            l(next);
                        }
                        this.f40233e.I(aVar, next.f40237a, false);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e2.u1
    public synchronized void c(InterfaceC3131b.a aVar, int i10) {
        try {
            C1804a.e(this.f40233e);
            boolean z10 = i10 == 0;
            Iterator<a> it = this.f40231c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.j(aVar)) {
                    it.remove();
                    if (next.f40241e) {
                        boolean zEquals = next.f40237a.equals(this.f40235g);
                        boolean z11 = z10 && zEquals && next.f40242f;
                        if (zEquals) {
                            l(next);
                        }
                        this.f40233e.I(aVar, next.f40237a, z11);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e2.u1
    public void d(u1.a aVar) {
        this.f40233e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[Catch: all -> 0x0044, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:10:0x0018, B:15:0x0024, B:17:0x0030, B:19:0x003a, B:25:0x0047, B:27:0x0053, B:28:0x0059, B:30:0x005e, B:32:0x0064, B:34:0x007d, B:36:0x00d8, B:38:0x00de, B:40:0x00f4, B:42:0x0100, B:44:0x0106), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    @Override // e2.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void e(e2.InterfaceC3131b.a r25) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.C3163r0.e(e2.b$a):void");
    }

    @Override // e2.u1
    public synchronized String f(U1.G g10, r.b bVar) {
        return o(g10.h(bVar.f27812a, this.f40230b).f16823c, bVar).f40237a;
    }

    @Override // e2.u1
    public synchronized void g(InterfaceC3131b.a aVar) {
        u1.a aVar2;
        try {
            String str = this.f40235g;
            if (str != null) {
                l((a) C1804a.e(this.f40231c.get(str)));
            }
            Iterator<a> it = this.f40231c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                it.remove();
                if (next.f40241e && (aVar2 = this.f40233e) != null) {
                    aVar2.I(aVar, next.f40237a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C3163r0(l8.s<String> sVar) {
        this.f40232d = sVar;
        this.f40229a = new G.c();
        this.f40230b = new G.b();
        this.f40231c = new HashMap<>();
        this.f40234f = U1.G.f16812a;
        this.f40236h = -1L;
    }
}
