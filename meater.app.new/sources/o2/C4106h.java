package o2;

import U1.z;
import X1.C1804a;
import X1.L;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.W;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.F;
import androidx.media3.exoplayer.source.G;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import d2.C3025C;
import d2.I;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n2.s;
import o2.InterfaceC4107i;
import s2.InterfaceExecutorC4472a;

/* compiled from: ChunkSampleStream.java */
/* renamed from: o2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4106h<T extends InterfaceC4107i> implements s, G, Loader.b<AbstractC4103e>, Loader.f {

    /* renamed from: B, reason: collision with root package name */
    public final int f46357B;

    /* renamed from: C, reason: collision with root package name */
    private final int[] f46358C;

    /* renamed from: D, reason: collision with root package name */
    private final U1.s[] f46359D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean[] f46360E;

    /* renamed from: F, reason: collision with root package name */
    private final T f46361F;

    /* renamed from: G, reason: collision with root package name */
    private final G.a<C4106h<T>> f46362G;

    /* renamed from: H, reason: collision with root package name */
    private final s.a f46363H;

    /* renamed from: I, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f46364I;

    /* renamed from: J, reason: collision with root package name */
    private final Loader f46365J;

    /* renamed from: K, reason: collision with root package name */
    private final C4105g f46366K;

    /* renamed from: L, reason: collision with root package name */
    private final ArrayList<AbstractC4099a> f46367L;

    /* renamed from: M, reason: collision with root package name */
    private final List<AbstractC4099a> f46368M;

    /* renamed from: N, reason: collision with root package name */
    private final F f46369N;

    /* renamed from: O, reason: collision with root package name */
    private final F[] f46370O;

    /* renamed from: P, reason: collision with root package name */
    private final C4101c f46371P;

    /* renamed from: Q, reason: collision with root package name */
    private AbstractC4103e f46372Q;

    /* renamed from: R, reason: collision with root package name */
    private U1.s f46373R;

    /* renamed from: S, reason: collision with root package name */
    private b<T> f46374S;

    /* renamed from: T, reason: collision with root package name */
    private long f46375T;

    /* renamed from: U, reason: collision with root package name */
    private long f46376U;

    /* renamed from: V, reason: collision with root package name */
    private int f46377V;

    /* renamed from: W, reason: collision with root package name */
    private AbstractC4099a f46378W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f46379X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f46380Y;

    /* renamed from: Z, reason: collision with root package name */
    boolean f46381Z;

    /* compiled from: ChunkSampleStream.java */
    /* renamed from: o2.h$b */
    public interface b<T extends InterfaceC4107i> {
        void a(C4106h<T> c4106h);
    }

    public C4106h(int i10, int[] iArr, U1.s[] sVarArr, T t10, G.a<C4106h<T>> aVar, r2.b bVar, long j10, androidx.media3.exoplayer.drm.i iVar, h.a aVar2, androidx.media3.exoplayer.upstream.b bVar2, s.a aVar3, boolean z10, InterfaceExecutorC4472a interfaceExecutorC4472a) {
        this.f46357B = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f46358C = iArr;
        this.f46359D = sVarArr == null ? new U1.s[0] : sVarArr;
        this.f46361F = t10;
        this.f46362G = aVar;
        this.f46363H = aVar3;
        this.f46364I = bVar2;
        this.f46379X = z10;
        this.f46365J = interfaceExecutorC4472a != null ? new Loader(interfaceExecutorC4472a) : new Loader("ChunkSampleStream");
        this.f46366K = new C4105g();
        ArrayList<AbstractC4099a> arrayList = new ArrayList<>();
        this.f46367L = arrayList;
        this.f46368M = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f46370O = new F[length];
        this.f46360E = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        F[] fArr = new F[i12];
        F fK = F.k(bVar, iVar, aVar2);
        this.f46369N = fK;
        iArr2[0] = i10;
        fArr[0] = fK;
        while (i11 < length) {
            F fL = F.l(bVar);
            this.f46370O[i11] = fL;
            int i13 = i11 + 1;
            fArr[i13] = fL;
            iArr2[i13] = this.f46358C[i11];
            i11 = i13;
        }
        this.f46371P = new C4101c(iArr2, fArr);
        this.f46375T = j10;
        this.f46376U = j10;
    }

    private void D(int i10) {
        int iMin = Math.min(Q(i10, 0), this.f46377V);
        if (iMin > 0) {
            L.b1(this.f46367L, 0, iMin);
            this.f46377V -= iMin;
        }
    }

    private void E(int i10) {
        C1804a.g(!this.f46365J.j());
        int size = this.f46367L.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!I(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = H().f46353h;
        AbstractC4099a abstractC4099aF = F(i10);
        if (this.f46367L.isEmpty()) {
            this.f46375T = this.f46376U;
        }
        this.f46381Z = false;
        this.f46363H.F(this.f46357B, abstractC4099aF.f46352g, j10);
    }

    private AbstractC4099a F(int i10) {
        AbstractC4099a abstractC4099a = this.f46367L.get(i10);
        ArrayList<AbstractC4099a> arrayList = this.f46367L;
        L.b1(arrayList, i10, arrayList.size());
        this.f46377V = Math.max(this.f46377V, this.f46367L.size());
        int i11 = 0;
        this.f46369N.u(abstractC4099a.h(0));
        while (true) {
            F[] fArr = this.f46370O;
            if (i11 >= fArr.length) {
                return abstractC4099a;
            }
            F f10 = fArr[i11];
            i11++;
            f10.u(abstractC4099a.h(i11));
        }
    }

    private AbstractC4099a H() {
        return this.f46367L.get(r0.size() - 1);
    }

    private boolean I(int i10) {
        int iD;
        AbstractC4099a abstractC4099a = this.f46367L.get(i10);
        if (this.f46369N.D() > abstractC4099a.h(0)) {
            return true;
        }
        int i11 = 0;
        do {
            F[] fArr = this.f46370O;
            if (i11 >= fArr.length) {
                return false;
            }
            iD = fArr[i11].D();
            i11++;
        } while (iD <= abstractC4099a.h(i11));
        return true;
    }

    private boolean J(AbstractC4103e abstractC4103e) {
        return abstractC4103e instanceof AbstractC4099a;
    }

    private void L() {
        int iQ = Q(this.f46369N.D(), this.f46377V - 1);
        while (true) {
            int i10 = this.f46377V;
            if (i10 > iQ) {
                return;
            }
            this.f46377V = i10 + 1;
            M(i10);
        }
    }

    private void M(int i10) {
        AbstractC4099a abstractC4099a = this.f46367L.get(i10);
        U1.s sVar = abstractC4099a.f46349d;
        if (!sVar.equals(this.f46373R)) {
            this.f46363H.j(this.f46357B, sVar, abstractC4099a.f46350e, abstractC4099a.f46351f, abstractC4099a.f46352g);
        }
        this.f46373R = sVar;
    }

    private int Q(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f46367L.size()) {
                return this.f46367L.size() - 1;
            }
        } while (this.f46367L.get(i11).h(0) <= i10);
        return i11 - 1;
    }

    private void S() {
        this.f46369N.V();
        for (F f10 : this.f46370O) {
            f10.V();
        }
    }

    public boolean C() {
        try {
            return this.f46380Y;
        } finally {
            this.f46380Y = false;
        }
    }

    public T G() {
        return this.f46361F;
    }

    boolean K() {
        return this.f46375T != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void v(AbstractC4103e abstractC4103e, long j10, long j11, boolean z10) {
        this.f46372Q = null;
        this.f46378W = null;
        n2.i iVar = new n2.i(abstractC4103e.f46346a, abstractC4103e.f46347b, abstractC4103e.e(), abstractC4103e.d(), j10, j11, abstractC4103e.c());
        this.f46364I.b(abstractC4103e.f46346a);
        this.f46363H.t(iVar, abstractC4103e.f46348c, this.f46357B, abstractC4103e.f46349d, abstractC4103e.f46350e, abstractC4103e.f46351f, abstractC4103e.f46352g, abstractC4103e.f46353h);
        if (z10) {
            return;
        }
        if (K()) {
            S();
        } else if (J(abstractC4103e)) {
            F(this.f46367L.size() - 1);
            if (this.f46367L.isEmpty()) {
                this.f46375T = this.f46376U;
            }
        }
        this.f46362G.i(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void t(AbstractC4103e abstractC4103e, long j10, long j11) {
        this.f46372Q = null;
        this.f46361F.h(abstractC4103e);
        n2.i iVar = new n2.i(abstractC4103e.f46346a, abstractC4103e.f46347b, abstractC4103e.e(), abstractC4103e.d(), j10, j11, abstractC4103e.c());
        this.f46364I.b(abstractC4103e.f46346a);
        this.f46363H.w(iVar, abstractC4103e.f46348c, this.f46357B, abstractC4103e.f46349d, abstractC4103e.f46350e, abstractC4103e.f46351f, abstractC4103e.f46352g, abstractC4103e.f46353h);
        this.f46362G.i(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public Loader.c k(AbstractC4103e abstractC4103e, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarH;
        long jC = abstractC4103e.c();
        boolean zJ = J(abstractC4103e);
        int size = this.f46367L.size() - 1;
        boolean z10 = (jC != 0 && zJ && I(size)) ? false : true;
        n2.i iVar = new n2.i(abstractC4103e.f46346a, abstractC4103e.f46347b, abstractC4103e.e(), abstractC4103e.d(), j10, j11, jC);
        b.c cVar = new b.c(iVar, new n2.j(abstractC4103e.f46348c, this.f46357B, abstractC4103e.f46349d, abstractC4103e.f46350e, abstractC4103e.f46351f, L.u1(abstractC4103e.f46352g), L.u1(abstractC4103e.f46353h)), iOException, i10);
        if (!this.f46361F.e(abstractC4103e, z10, cVar, this.f46364I)) {
            cVarH = null;
        } else if (z10) {
            cVarH = Loader.f27841f;
            if (zJ) {
                C1804a.g(F(size) == abstractC4103e);
                if (this.f46367L.isEmpty()) {
                    this.f46375T = this.f46376U;
                }
            }
        } else {
            X1.n.h("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            cVarH = null;
        }
        if (cVarH == null) {
            long jA = this.f46364I.a(cVar);
            cVarH = jA != -9223372036854775807L ? Loader.h(false, jA) : Loader.f27842g;
        }
        boolean zC = cVarH.c();
        this.f46363H.y(iVar, abstractC4103e.f46348c, this.f46357B, abstractC4103e.f46349d, abstractC4103e.f46350e, abstractC4103e.f46351f, abstractC4103e.f46352g, abstractC4103e.f46353h, iOException, !zC);
        if (!zC) {
            this.f46372Q = null;
            this.f46364I.b(abstractC4103e.f46346a);
            this.f46362G.i(this);
        }
        return cVarH;
    }

    public void R(b<T> bVar) {
        this.f46374S = bVar;
        this.f46369N.R();
        for (F f10 : this.f46370O) {
            f10.R();
        }
        this.f46365J.m(this);
    }

    public void T(long j10) {
        AbstractC4099a abstractC4099a;
        this.f46376U = j10;
        int i10 = 0;
        this.f46379X = false;
        if (K()) {
            this.f46375T = j10;
            return;
        }
        for (int i11 = 0; i11 < this.f46367L.size(); i11++) {
            abstractC4099a = this.f46367L.get(i11);
            long j11 = abstractC4099a.f46352g;
            if (j11 == j10 && abstractC4099a.f46316k == -9223372036854775807L) {
                break;
            } else {
                if (j11 > j10) {
                    break;
                }
            }
        }
        abstractC4099a = null;
        if (abstractC4099a != null ? this.f46369N.Y(abstractC4099a.h(0)) : this.f46369N.Z(j10, j10 < c())) {
            this.f46377V = Q(this.f46369N.D(), 0);
            F[] fArr = this.f46370O;
            int length = fArr.length;
            while (i10 < length) {
                fArr[i10].Z(j10, true);
                i10++;
            }
            return;
        }
        this.f46375T = j10;
        this.f46381Z = false;
        this.f46367L.clear();
        this.f46377V = 0;
        if (!this.f46365J.j()) {
            this.f46365J.g();
            S();
            return;
        }
        this.f46369N.r();
        F[] fArr2 = this.f46370O;
        int length2 = fArr2.length;
        while (i10 < length2) {
            fArr2[i10].r();
            i10++;
        }
        this.f46365J.f();
    }

    public C4106h<T>.a U(long j10, int i10) {
        for (int i11 = 0; i11 < this.f46370O.length; i11++) {
            if (this.f46358C[i11] == i10) {
                C1804a.g(!this.f46360E[i11]);
                this.f46360E[i11] = true;
                this.f46370O[i11].Z(j10, true);
                return new a(this, this.f46370O[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // n2.s
    public void a() throws IOException {
        this.f46365J.a();
        this.f46369N.O();
        if (this.f46365J.j()) {
            return;
        }
        this.f46361F.a();
    }

    @Override // androidx.media3.exoplayer.source.G
    public boolean b(W w10) {
        List<AbstractC4099a> listEmptyList;
        long j10;
        if (this.f46381Z || this.f46365J.j() || this.f46365J.i()) {
            return false;
        }
        boolean zK = K();
        if (zK) {
            listEmptyList = Collections.emptyList();
            j10 = this.f46375T;
        } else {
            listEmptyList = this.f46368M;
            j10 = H().f46353h;
        }
        this.f46361F.i(w10, j10, listEmptyList, this.f46366K);
        C4105g c4105g = this.f46366K;
        boolean z10 = c4105g.f46356b;
        AbstractC4103e abstractC4103e = c4105g.f46355a;
        c4105g.a();
        if (z10) {
            this.f46375T = -9223372036854775807L;
            this.f46381Z = true;
            return true;
        }
        if (abstractC4103e == null) {
            return false;
        }
        this.f46372Q = abstractC4103e;
        if (J(abstractC4103e)) {
            AbstractC4099a abstractC4099a = (AbstractC4099a) abstractC4103e;
            if (zK) {
                long j11 = abstractC4099a.f46352g;
                long j12 = this.f46375T;
                if (j11 < j12) {
                    this.f46369N.b0(j12);
                    for (F f10 : this.f46370O) {
                        f10.b0(this.f46375T);
                    }
                    if (this.f46379X) {
                        U1.s sVar = abstractC4099a.f46349d;
                        this.f46380Y = !z.a(sVar.f17162o, sVar.f17158k);
                    }
                }
                this.f46379X = false;
                this.f46375T = -9223372036854775807L;
            }
            abstractC4099a.j(this.f46371P);
            this.f46367L.add(abstractC4099a);
        } else if (abstractC4103e instanceof k) {
            ((k) abstractC4103e).f(this.f46371P);
        }
        this.f46363H.C(new n2.i(abstractC4103e.f46346a, abstractC4103e.f46347b, this.f46365J.n(abstractC4103e, this, this.f46364I.c(abstractC4103e.f46348c))), abstractC4103e.f46348c, this.f46357B, abstractC4103e.f46349d, abstractC4103e.f46350e, abstractC4103e.f46351f, abstractC4103e.f46352g, abstractC4103e.f46353h);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.G
    public long c() {
        if (K()) {
            return this.f46375T;
        }
        if (this.f46381Z) {
            return Long.MIN_VALUE;
        }
        return H().f46353h;
    }

    public long d(long j10, I i10) {
        return this.f46361F.d(j10, i10);
    }

    @Override // androidx.media3.exoplayer.source.G
    public boolean e() {
        return this.f46365J.j();
    }

    @Override // n2.s
    public boolean f() {
        return !K() && this.f46369N.L(this.f46381Z);
    }

    @Override // androidx.media3.exoplayer.source.G
    public long g() {
        if (this.f46381Z) {
            return Long.MIN_VALUE;
        }
        if (K()) {
            return this.f46375T;
        }
        long jMax = this.f46376U;
        AbstractC4099a abstractC4099aH = H();
        if (!abstractC4099aH.g()) {
            if (this.f46367L.size() > 1) {
                abstractC4099aH = this.f46367L.get(r2.size() - 2);
            } else {
                abstractC4099aH = null;
            }
        }
        if (abstractC4099aH != null) {
            jMax = Math.max(jMax, abstractC4099aH.f46353h);
        }
        return Math.max(jMax, this.f46369N.A());
    }

    @Override // androidx.media3.exoplayer.source.G
    public void h(long j10) {
        if (this.f46365J.i() || K()) {
            return;
        }
        if (!this.f46365J.j()) {
            int iJ = this.f46361F.j(j10, this.f46368M);
            if (iJ < this.f46367L.size()) {
                E(iJ);
                return;
            }
            return;
        }
        AbstractC4103e abstractC4103e = (AbstractC4103e) C1804a.e(this.f46372Q);
        if (!(J(abstractC4103e) && I(this.f46367L.size() - 1)) && this.f46361F.b(j10, abstractC4103e, this.f46368M)) {
            this.f46365J.f();
            if (J(abstractC4103e)) {
                this.f46378W = (AbstractC4099a) abstractC4103e;
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.f
    public void i() {
        this.f46369N.T();
        for (F f10 : this.f46370O) {
            f10.T();
        }
        this.f46361F.c();
        b<T> bVar = this.f46374S;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // n2.s
    public int n(long j10) {
        if (K()) {
            return 0;
        }
        int iF = this.f46369N.F(j10, this.f46381Z);
        AbstractC4099a abstractC4099a = this.f46378W;
        if (abstractC4099a != null) {
            iF = Math.min(iF, abstractC4099a.h(0) - this.f46369N.D());
        }
        this.f46369N.e0(iF);
        L();
        return iF;
    }

    @Override // n2.s
    public int p(C3025C c3025c, DecoderInputBuffer decoderInputBuffer, int i10) {
        if (K()) {
            return -3;
        }
        AbstractC4099a abstractC4099a = this.f46378W;
        if (abstractC4099a != null && abstractC4099a.h(0) <= this.f46369N.D()) {
            return -3;
        }
        L();
        return this.f46369N.S(c3025c, decoderInputBuffer, i10, this.f46381Z);
    }

    public void u(long j10, boolean z10) {
        if (K()) {
            return;
        }
        int iY = this.f46369N.y();
        this.f46369N.q(j10, z10, true);
        int iY2 = this.f46369N.y();
        if (iY2 > iY) {
            long jZ = this.f46369N.z();
            int i10 = 0;
            while (true) {
                F[] fArr = this.f46370O;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10].q(jZ, z10, this.f46360E[i10]);
                i10++;
            }
        }
        D(iY2);
    }

    /* compiled from: ChunkSampleStream.java */
    /* renamed from: o2.h$a */
    public final class a implements n2.s {

        /* renamed from: B, reason: collision with root package name */
        public final C4106h<T> f46382B;

        /* renamed from: C, reason: collision with root package name */
        private final F f46383C;

        /* renamed from: D, reason: collision with root package name */
        private final int f46384D;

        /* renamed from: E, reason: collision with root package name */
        private boolean f46385E;

        public a(C4106h<T> c4106h, F f10, int i10) {
            this.f46382B = c4106h;
            this.f46383C = f10;
            this.f46384D = i10;
        }

        private void b() {
            if (this.f46385E) {
                return;
            }
            C4106h.this.f46363H.j(C4106h.this.f46358C[this.f46384D], C4106h.this.f46359D[this.f46384D], 0, null, C4106h.this.f46376U);
            this.f46385E = true;
        }

        public void c() {
            C1804a.g(C4106h.this.f46360E[this.f46384D]);
            C4106h.this.f46360E[this.f46384D] = false;
        }

        @Override // n2.s
        public boolean f() {
            return !C4106h.this.K() && this.f46383C.L(C4106h.this.f46381Z);
        }

        @Override // n2.s
        public int n(long j10) {
            if (C4106h.this.K()) {
                return 0;
            }
            int iF = this.f46383C.F(j10, C4106h.this.f46381Z);
            if (C4106h.this.f46378W != null) {
                iF = Math.min(iF, C4106h.this.f46378W.h(this.f46384D + 1) - this.f46383C.D());
            }
            this.f46383C.e0(iF);
            if (iF > 0) {
                b();
            }
            return iF;
        }

        @Override // n2.s
        public int p(C3025C c3025c, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (C4106h.this.K()) {
                return -3;
            }
            if (C4106h.this.f46378W != null && C4106h.this.f46378W.h(this.f46384D + 1) <= this.f46383C.D()) {
                return -3;
            }
            b();
            return this.f46383C.S(c3025c, decoderInputBuffer, i10, C4106h.this.f46381Z);
        }

        @Override // n2.s
        public void a() {
        }
    }
}
