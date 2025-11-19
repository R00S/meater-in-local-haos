package T2;

import S2.k;
import S2.l;
import S2.o;
import S2.p;
import T2.e;
import X1.C1804a;
import X1.L;
import c2.e;
import java.util.ArrayDeque;

/* compiled from: CeaDecoder.java */
/* loaded from: classes.dex */
abstract class e implements l {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<b> f15861a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<p> f15862b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f15863c;

    /* renamed from: d, reason: collision with root package name */
    private b f15864d;

    /* renamed from: e, reason: collision with root package name */
    private long f15865e;

    /* renamed from: f, reason: collision with root package name */
    private long f15866f;

    /* renamed from: g, reason: collision with root package name */
    private long f15867g;

    /* compiled from: CeaDecoder.java */
    private static final class b extends o implements Comparable<b> {

        /* renamed from: L, reason: collision with root package name */
        private long f15868L;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (w() != bVar.w()) {
                return w() ? 1 : -1;
            }
            long j10 = this.f26295G - bVar.f26295G;
            if (j10 == 0) {
                j10 = this.f15868L - bVar.f15868L;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CeaDecoder.java */
    static final class c extends p {

        /* renamed from: H, reason: collision with root package name */
        private e.a<c> f15869H;

        public c(e.a<c> aVar) {
            this.f15869H = aVar;
        }

        @Override // c2.e
        public final void C() {
            this.f15869H.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f15861a.add(new b());
        }
        this.f15862b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f15862b.add(new c(new e.a() { // from class: T2.d
                @Override // c2.e.a
                public final void a(c2.e eVar) {
                    this.f15860a.q((e.c) eVar);
                }
            }));
        }
        this.f15863c = new ArrayDeque<>();
        this.f15867g = -9223372036854775807L;
    }

    private void p(b bVar) {
        bVar.t();
        this.f15861a.add(bVar);
    }

    @Override // c2.d
    public final void b(long j10) {
        this.f15867g = j10;
    }

    @Override // S2.l
    public void d(long j10) {
        this.f15865e = j10;
    }

    @Override // c2.d
    public void flush() {
        this.f15866f = 0L;
        this.f15865e = 0L;
        while (!this.f15863c.isEmpty()) {
            p((b) L.i(this.f15863c.poll()));
        }
        b bVar = this.f15864d;
        if (bVar != null) {
            p(bVar);
            this.f15864d = null;
        }
    }

    protected abstract k h();

    protected abstract void i(o oVar);

    @Override // c2.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public o e() {
        C1804a.g(this.f15864d == null);
        if (this.f15861a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f15861a.pollFirst();
        this.f15864d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // c2.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public p a() {
        if (this.f15862b.isEmpty()) {
            return null;
        }
        while (!this.f15863c.isEmpty() && ((b) L.i(this.f15863c.peek())).f26295G <= this.f15865e) {
            b bVar = (b) L.i(this.f15863c.poll());
            if (bVar.w()) {
                p pVar = (p) L.i(this.f15862b.pollFirst());
                pVar.s(4);
                p(bVar);
                return pVar;
            }
            i(bVar);
            if (n()) {
                k kVarH = h();
                p pVar2 = (p) L.i(this.f15862b.pollFirst());
                pVar2.D(bVar.f26295G, kVarH, Long.MAX_VALUE);
                p(bVar);
                return pVar2;
            }
            p(bVar);
        }
        return null;
    }

    protected final p l() {
        return this.f15862b.pollFirst();
    }

    protected final long m() {
        return this.f15865e;
    }

    protected abstract boolean n();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // c2.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(S2.o r7) {
        /*
            r6 = this;
            T2.e$b r0 = r6.f15864d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            X1.C1804a.a(r0)
            T2.e$b r7 = (T2.e.b) r7
            long r0 = r7.f26295G
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L27
            long r2 = r6.f15867g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L27
            r6.p(r7)
            goto L36
        L27:
            long r0 = r6.f15866f
            r2 = 1
            long r2 = r2 + r0
            r6.f15866f = r2
            T2.e.b.I(r7, r0)
            java.util.ArrayDeque<T2.e$b> r0 = r6.f15863c
            r0.add(r7)
        L36:
            r7 = 0
            r6.f15864d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.e.g(S2.o):void");
    }

    protected void q(p pVar) {
        pVar.t();
        this.f15862b.add(pVar);
    }

    @Override // c2.d
    public void c() {
    }
}
