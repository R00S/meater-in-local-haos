package androidx.media3.exoplayer.video;

import U1.C;
import U1.C1733i;
import U1.F;
import U1.InterfaceC1736l;
import U1.L;
import U1.M;
import U1.N;
import U1.s;
import U1.t;
import X1.A;
import X1.C1804a;
import X1.InterfaceC1807d;
import X1.InterfaceC1813j;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.c;
import androidx.media3.exoplayer.video.h;
import androidx.media3.exoplayer.video.i;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import m8.AbstractC4009y;

/* compiled from: PlaybackVideoGraphWrapper.java */
/* loaded from: classes.dex */
public final class c implements M.a {

    /* renamed from: r, reason: collision with root package name */
    private static final Executor f27943r = new Executor() { // from class: t2.d
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            androidx.media3.exoplayer.video.c.G(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Context f27944a;

    /* renamed from: b, reason: collision with root package name */
    private final d f27945b;

    /* renamed from: c, reason: collision with root package name */
    private final h f27946c;

    /* renamed from: d, reason: collision with root package name */
    private final i f27947d;

    /* renamed from: e, reason: collision with root package name */
    private final C.a f27948e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Object> f27949f;

    /* renamed from: g, reason: collision with root package name */
    private final VideoSink f27950g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1807d f27951h;

    /* renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArraySet<e> f27952i;

    /* renamed from: j, reason: collision with root package name */
    private s f27953j;

    /* renamed from: k, reason: collision with root package name */
    private t2.h f27954k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC1813j f27955l;

    /* renamed from: m, reason: collision with root package name */
    private C f27956m;

    /* renamed from: n, reason: collision with root package name */
    private Pair<Surface, A> f27957n;

    /* renamed from: o, reason: collision with root package name */
    private int f27958o;

    /* renamed from: p, reason: collision with root package name */
    private int f27959p;

    /* renamed from: q, reason: collision with root package name */
    private long f27960q;

    /* compiled from: PlaybackVideoGraphWrapper.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f27961a;

        /* renamed from: b, reason: collision with root package name */
        private final h f27962b;

        /* renamed from: c, reason: collision with root package name */
        private L.a f27963c;

        /* renamed from: d, reason: collision with root package name */
        private C.a f27964d;

        /* renamed from: e, reason: collision with root package name */
        private List<Object> f27965e = AbstractC4009y.G();

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC1807d f27966f = InterfaceC1807d.f18647a;

        /* renamed from: g, reason: collision with root package name */
        private boolean f27967g;

        public b(Context context, h hVar) {
            this.f27961a = context.getApplicationContext();
            this.f27962b = hVar;
        }

        public c f() {
            C1804a.g(!this.f27967g);
            if (this.f27964d == null) {
                if (this.f27963c == null) {
                    this.f27963c = new f();
                }
                this.f27964d = new g(this.f27963c);
            }
            c cVar = new c(this);
            this.f27967g = true;
            return cVar;
        }

        public b g(InterfaceC1807d interfaceC1807d) {
            this.f27966f = interfaceC1807d;
            return this;
        }
    }

    /* compiled from: PlaybackVideoGraphWrapper.java */
    /* renamed from: androidx.media3.exoplayer.video.c$c, reason: collision with other inner class name */
    private final class C0384c implements i.a {
        private C0384c() {
        }

        @Override // androidx.media3.exoplayer.video.i.a
        public void a(long j10, long j11, long j12, boolean z10) {
            if (z10 && c.this.f27957n != null) {
                Iterator it = c.this.f27952i.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).s(c.this);
                }
            }
            if (c.this.f27954k != null) {
                c.this.f27954k.h(j11, c.this.f27951h.b(), c.this.f27953j == null ? new s.b().M() : c.this.f27953j, null);
            }
            ((C) C1804a.i(c.this.f27956m)).e(j10);
        }

        @Override // androidx.media3.exoplayer.video.i.a
        public void b() {
            Iterator it = c.this.f27952i.iterator();
            while (it.hasNext()) {
                ((e) it.next()).t(c.this);
            }
            ((C) C1804a.i(c.this.f27956m)).e(-2L);
        }

        @Override // androidx.media3.exoplayer.video.i.a
        public void d(N n10) {
            c.this.f27953j = new s.b().z0(n10.f16986a).c0(n10.f16987b).s0("video/raw").M();
            Iterator it = c.this.f27952i.iterator();
            while (it.hasNext()) {
                ((e) it.next()).l(c.this, n10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlaybackVideoGraphWrapper.java */
    final class d implements VideoSink, e {

        /* renamed from: a, reason: collision with root package name */
        private final int f27969a;

        /* renamed from: d, reason: collision with root package name */
        private L f27972d;

        /* renamed from: e, reason: collision with root package name */
        private s f27973e;

        /* renamed from: f, reason: collision with root package name */
        private int f27974f;

        /* renamed from: g, reason: collision with root package name */
        private long f27975g;

        /* renamed from: h, reason: collision with root package name */
        private long f27976h;

        /* renamed from: i, reason: collision with root package name */
        private long f27977i;

        /* renamed from: j, reason: collision with root package name */
        private long f27978j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f27979k;

        /* renamed from: n, reason: collision with root package name */
        private boolean f27982n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f27983o;

        /* renamed from: p, reason: collision with root package name */
        private long f27984p;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<Object> f27970b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        private final h.a f27971c = new h.a();

        /* renamed from: l, reason: collision with root package name */
        private long f27980l = -9223372036854775807L;

        /* renamed from: m, reason: collision with root package name */
        private long f27981m = -9223372036854775807L;

        /* renamed from: q, reason: collision with root package name */
        private VideoSink.a f27985q = VideoSink.a.f27890a;

        /* renamed from: r, reason: collision with root package name */
        private Executor f27986r = c.f27943r;

        public d(Context context) {
            this.f27969a = X1.L.d0(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void E(VideoSink.a aVar) {
            aVar.a(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void F(VideoSink.a aVar) {
            aVar.c((VideoSink) C1804a.i(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void G(VideoSink.a aVar, N n10) {
            aVar.b(this, n10);
        }

        private void H() {
            if (this.f27973e == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f27970b);
            s sVar = (s) C1804a.e(this.f27973e);
            ((L) C1804a.i(this.f27972d)).b(this.f27974f, arrayList, new t.b(c.z(sVar.f17136C), sVar.f17169v, sVar.f17170w).b(sVar.f17173z).a());
            this.f27980l = -9223372036854775807L;
        }

        private void I(long j10) {
            if (this.f27979k) {
                c.this.I(this.f27977i, j10, this.f27976h);
                this.f27979k = false;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void A(Surface surface, A a10) {
            c.this.L(surface, a10);
        }

        public void J(List<Object> list) {
            this.f27970b.clear();
            this.f27970b.addAll(list);
            this.f27970b.addAll(c.this.f27949f);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface a() {
            C1804a.g(b());
            return ((L) C1804a.i(this.f27972d)).a();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean b() {
            return this.f27972d != null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void c() {
            c.this.J();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean d() {
            if (b()) {
                long j10 = this.f27980l;
                if (j10 != -9223372036854775807L && c.this.B(j10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void e(s sVar) {
            C1804a.g(!b());
            this.f27972d = c.this.C(sVar);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void f() {
            c.this.f27950g.f();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void g() {
            c.this.f27950g.g();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void h(int i10) {
            c.this.f27950g.h(i10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void i() {
            c.this.f27950g.i();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void j(long j10, long j11) throws VideoSink.VideoSinkException {
            try {
                c.this.K(j10, j11);
            } catch (ExoPlaybackException e10) {
                s sVarM = this.f27973e;
                if (sVarM == null) {
                    sVarM = new s.b().M();
                }
                throw new VideoSink.VideoSinkException(e10, sVarM);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void k(float f10) {
            c.this.M(f10);
        }

        @Override // androidx.media3.exoplayer.video.c.e
        public void l(c cVar, final N n10) {
            final VideoSink.a aVar = this.f27985q;
            this.f27986r.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27990B.G(aVar, n10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void m(long j10, long j11, long j12, long j13) {
            this.f27979k |= (this.f27976h == j11 && this.f27977i == j12) ? false : true;
            this.f27975g = j10;
            this.f27976h = j11;
            this.f27977i = j12;
            this.f27978j = j13;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void n() {
            c.this.x();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void o(int i10, s sVar) {
            C1804a.g(b());
            if (i10 != 1 && i10 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i10);
            }
            c.this.f27946c.p(sVar.f17171x);
            this.f27974f = i10;
            this.f27973e = sVar;
            if (this.f27982n) {
                C1804a.g(this.f27981m != -9223372036854775807L);
                this.f27983o = true;
                this.f27984p = this.f27981m;
            } else {
                H();
                this.f27982n = true;
                this.f27983o = false;
                this.f27984p = -9223372036854775807L;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void p(boolean z10) {
            if (b()) {
                this.f27972d.flush();
            }
            this.f27982n = false;
            this.f27980l = -9223372036854775807L;
            this.f27981m = -9223372036854775807L;
            c.this.y(z10);
            this.f27984p = -9223372036854775807L;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void q() {
            c.this.f27950g.q();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void r(List<Object> list) {
            if (this.f27970b.equals(list)) {
                return;
            }
            J(list);
            H();
        }

        @Override // androidx.media3.exoplayer.video.c.e
        public void s(c cVar) {
            final VideoSink.a aVar = this.f27985q;
            this.f27986r.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27993B.E(aVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.c.e
        public void t(c cVar) {
            final VideoSink.a aVar = this.f27985q;
            this.f27986r.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27995B.F(aVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void u(boolean z10) {
            c.this.f27950g.u(z10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean v(boolean z10) {
            return c.this.E(z10 && b());
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void w(t2.h hVar) {
            c.this.N(hVar);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean x(long j10, boolean z10, long j11, long j12, VideoSink.b bVar) throws VideoSink.VideoSinkException {
            C1804a.g(b());
            long j13 = j10 - this.f27977i;
            try {
                if (c.this.f27946c.c(j13, j11, j12, this.f27975g, z10, this.f27971c) == 4) {
                    return false;
                }
                if (j13 < this.f27978j && !z10) {
                    bVar.b();
                    return true;
                }
                j(j11, j12);
                if (this.f27983o) {
                    long j14 = this.f27984p;
                    if (j14 != -9223372036854775807L && !c.this.B(j14)) {
                        return false;
                    }
                    H();
                    this.f27983o = false;
                    this.f27984p = -9223372036854775807L;
                }
                if (((L) C1804a.i(this.f27972d)).d() >= this.f27969a || !((L) C1804a.i(this.f27972d)).c()) {
                    return false;
                }
                I(j13);
                this.f27981m = j13;
                if (z10) {
                    this.f27980l = j13;
                }
                bVar.a(1000 * j10);
                return true;
            } catch (ExoPlaybackException e10) {
                throw new VideoSink.VideoSinkException(e10, (s) C1804a.i(this.f27973e));
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void y(VideoSink.a aVar, Executor executor) {
            this.f27985q = aVar;
            this.f27986r = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void z(boolean z10) {
            c.this.f27950g.z(z10);
        }
    }

    /* compiled from: PlaybackVideoGraphWrapper.java */
    public interface e {
        void l(c cVar, N n10);

        void s(c cVar);

        void t(c cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlaybackVideoGraphWrapper.java */
    static final class f implements L.a {

        /* renamed from: a, reason: collision with root package name */
        private static final l8.s<L.a> f27988a = l8.t.a(new l8.s() { // from class: androidx.media3.exoplayer.video.g
            @Override // l8.s
            public final Object get() {
                return c.f.b();
            }
        });

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ L.a b() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (L.a) C1804a.e(cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null));
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* compiled from: PlaybackVideoGraphWrapper.java */
    private static final class g implements C.a {

        /* renamed from: a, reason: collision with root package name */
        private final L.a f27989a;

        public g(L.a aVar) {
            this.f27989a = aVar;
        }

        @Override // U1.C.a
        public C a(Context context, C1733i c1733i, InterfaceC1736l interfaceC1736l, M.a aVar, Executor executor, List<Object> list, long j10) throws VideoFrameProcessingException, NoSuchMethodException, SecurityException {
            try {
                try {
                    return ((C.a) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(L.a.class).newInstance(this.f27989a)).a(context, c1733i, interfaceC1736l, aVar, executor, list, j10);
                } catch (Exception e10) {
                    e = e10;
                    throw VideoFrameProcessingException.a(e);
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B(long j10) {
        return this.f27958o == 0 && this.f27947d.d(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public L C(s sVar) throws VideoSink.VideoSinkException {
        C1804a.g(this.f27959p == 0);
        C1733i c1733iZ = z(sVar.f17136C);
        if (c1733iZ.f17062c == 7 && X1.L.f18626a < 34) {
            c1733iZ = c1733iZ.a().e(6).a();
        }
        C1733i c1733i = c1733iZ;
        final InterfaceC1813j interfaceC1813jE = this.f27951h.e((Looper) C1804a.i(Looper.myLooper()), null);
        this.f27955l = interfaceC1813jE;
        try {
            C.a aVar = this.f27948e;
            Context context = this.f27944a;
            InterfaceC1736l interfaceC1736l = InterfaceC1736l.f17073a;
            Objects.requireNonNull(interfaceC1813jE);
            this.f27956m = aVar.a(context, c1733i, interfaceC1736l, this, new Executor() { // from class: t2.e
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    interfaceC1813jE.c(runnable);
                }
            }, AbstractC4009y.G(), 0L);
            Pair<Surface, A> pair = this.f27957n;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                A a10 = (A) pair.second;
                H(surface, a10.b(), a10.a());
            }
            this.f27956m.d(0);
            this.f27950g.e(sVar);
            this.f27959p = 1;
            return this.f27956m.b(0);
        } catch (VideoFrameProcessingException e10) {
            throw new VideoSink.VideoSinkException(e10, sVar);
        }
    }

    private boolean D() {
        return this.f27959p == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E(boolean z10) {
        return this.f27950g.v(z10 && this.f27958o == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.f27958o--;
    }

    private void H(Surface surface, int i10, int i11) {
        C c10 = this.f27956m;
        if (c10 == null) {
            return;
        }
        if (surface != null) {
            c10.a(new F(surface, i10, i11));
            this.f27950g.A(surface, new A(i10, i11));
        } else {
            c10.a(null);
            this.f27950g.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(long j10, long j11, long j12) {
        this.f27960q = j10;
        this.f27947d.h(j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(long j10, long j11) {
        this.f27947d.i(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(float f10) {
        this.f27950g.k(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(t2.h hVar) {
        this.f27954k = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(boolean z10) {
        if (D()) {
            this.f27958o++;
            this.f27950g.p(z10);
            ((InterfaceC1813j) C1804a.i(this.f27955l)).c(new Runnable() { // from class: t2.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49834B.F();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C1733i z(C1733i c1733i) {
        return (c1733i == null || !c1733i.g()) ? C1733i.f17052h : c1733i;
    }

    public VideoSink A() {
        return this.f27945b;
    }

    public void J() {
        if (this.f27959p == 2) {
            return;
        }
        InterfaceC1813j interfaceC1813j = this.f27955l;
        if (interfaceC1813j != null) {
            interfaceC1813j.j(null);
        }
        C c10 = this.f27956m;
        if (c10 != null) {
            c10.c();
        }
        this.f27957n = null;
        this.f27959p = 2;
    }

    public void L(Surface surface, A a10) {
        Pair<Surface, A> pair = this.f27957n;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((A) this.f27957n.second).equals(a10)) {
            return;
        }
        this.f27957n = Pair.create(surface, a10);
        H(surface, a10.b(), a10.a());
    }

    public void w(e eVar) {
        this.f27952i.add(eVar);
    }

    public void x() {
        A a10 = A.f18608c;
        H(null, a10.b(), a10.a());
        this.f27957n = null;
    }

    private c(b bVar) {
        Context context = bVar.f27961a;
        this.f27944a = context;
        d dVar = new d(context);
        this.f27945b = dVar;
        InterfaceC1807d interfaceC1807d = bVar.f27966f;
        this.f27951h = interfaceC1807d;
        h hVar = bVar.f27962b;
        this.f27946c = hVar;
        hVar.o(interfaceC1807d);
        i iVar = new i(new C0384c(), hVar);
        this.f27947d = iVar;
        this.f27948e = (C.a) C1804a.i(bVar.f27964d);
        this.f27949f = bVar.f27965e;
        this.f27950g = new androidx.media3.exoplayer.video.a(hVar, iVar);
        this.f27952i = new CopyOnWriteArraySet<>();
        this.f27959p = 0;
        w(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(Runnable runnable) {
    }
}
