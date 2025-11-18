package androidx.media3.exoplayer.dash;

import S2.r;
import U1.E;
import U1.G;
import U1.v;
import U1.w;
import X1.C1804a;
import X1.L;
import a2.n;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import androidx.media3.exoplayer.dash.f;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.source.AbstractC2137a;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.source.t;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import androidx.media3.exoplayer.upstream.c;
import com.apptionlabs.meater_app.data.Config;
import g2.C3382b;
import h2.C3485a;
import h2.j;
import h2.o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n2.C4058f;
import n2.InterfaceC4057e;
import o8.C4145e;
import r2.e;
import r2.k;
import s2.C4473b;

/* loaded from: classes.dex */
public final class DashMediaSource extends AbstractC2137a {

    /* renamed from: A, reason: collision with root package name */
    private Loader f26883A;

    /* renamed from: B, reason: collision with root package name */
    private n f26884B;

    /* renamed from: C, reason: collision with root package name */
    private IOException f26885C;

    /* renamed from: D, reason: collision with root package name */
    private Handler f26886D;

    /* renamed from: E, reason: collision with root package name */
    private v.g f26887E;

    /* renamed from: F, reason: collision with root package name */
    private Uri f26888F;

    /* renamed from: G, reason: collision with root package name */
    private Uri f26889G;

    /* renamed from: H, reason: collision with root package name */
    private h2.c f26890H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f26891I;

    /* renamed from: J, reason: collision with root package name */
    private long f26892J;

    /* renamed from: K, reason: collision with root package name */
    private long f26893K;

    /* renamed from: L, reason: collision with root package name */
    private long f26894L;

    /* renamed from: M, reason: collision with root package name */
    private int f26895M;

    /* renamed from: N, reason: collision with root package name */
    private long f26896N;

    /* renamed from: O, reason: collision with root package name */
    private int f26897O;

    /* renamed from: P, reason: collision with root package name */
    private v f26898P;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f26899h;

    /* renamed from: i, reason: collision with root package name */
    private final a.InterfaceC0371a f26900i;

    /* renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0377a f26901j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC4057e f26902k;

    /* renamed from: l, reason: collision with root package name */
    private final i f26903l;

    /* renamed from: m, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f26904m;

    /* renamed from: n, reason: collision with root package name */
    private final C3382b f26905n;

    /* renamed from: o, reason: collision with root package name */
    private final long f26906o;

    /* renamed from: p, reason: collision with root package name */
    private final long f26907p;

    /* renamed from: q, reason: collision with root package name */
    private final s.a f26908q;

    /* renamed from: r, reason: collision with root package name */
    private final c.a<? extends h2.c> f26909r;

    /* renamed from: s, reason: collision with root package name */
    private final e f26910s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f26911t;

    /* renamed from: u, reason: collision with root package name */
    private final SparseArray<androidx.media3.exoplayer.dash.c> f26912u;

    /* renamed from: v, reason: collision with root package name */
    private final Runnable f26913v;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f26914w;

    /* renamed from: x, reason: collision with root package name */
    private final f.b f26915x;

    /* renamed from: y, reason: collision with root package name */
    private final k f26916y;

    /* renamed from: z, reason: collision with root package name */
    private androidx.media3.datasource.a f26917z;

    public static final class Factory implements t {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f26918l = 0;

        /* renamed from: c, reason: collision with root package name */
        private final a.InterfaceC0377a f26919c;

        /* renamed from: d, reason: collision with root package name */
        private final a.InterfaceC0371a f26920d;

        /* renamed from: e, reason: collision with root package name */
        private e.a f26921e;

        /* renamed from: f, reason: collision with root package name */
        private i2.k f26922f;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC4057e f26923g;

        /* renamed from: h, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f26924h;

        /* renamed from: i, reason: collision with root package name */
        private long f26925i;

        /* renamed from: j, reason: collision with root package name */
        private long f26926j;

        /* renamed from: k, reason: collision with root package name */
        private c.a<? extends h2.c> f26927k;

        public Factory(a.InterfaceC0371a interfaceC0371a) {
            this(new d.a(interfaceC0371a), interfaceC0371a);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public DashMediaSource c(v vVar) {
            C1804a.e(vVar.f17234b);
            c.a dVar = this.f26927k;
            if (dVar == null) {
                dVar = new h2.d();
            }
            List<E> list = vVar.f17234b.f17329d;
            c.a bVar = !list.isEmpty() ? new m2.b(dVar, list) : dVar;
            e.a aVar = this.f26921e;
            if (aVar != null) {
                aVar.a(vVar);
            }
            return new DashMediaSource(vVar, null, this.f26920d, bVar, this.f26919c, this.f26923g, null, this.f26922f.a(vVar), this.f26924h, this.f26925i, this.f26926j, null);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        @Deprecated
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z10) {
            this.f26919c.b(z10);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory f(e.a aVar) {
            this.f26921e = (e.a) C1804a.e(aVar);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory e(i2.k kVar) {
            this.f26922f = (i2.k) C1804a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory d(androidx.media3.exoplayer.upstream.b bVar) {
            this.f26924h = (androidx.media3.exoplayer.upstream.b) C1804a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory a(r.a aVar) {
            this.f26919c.a((r.a) C1804a.e(aVar));
            return this;
        }

        public Factory(a.InterfaceC0377a interfaceC0377a, a.InterfaceC0371a interfaceC0371a) {
            this.f26919c = (a.InterfaceC0377a) C1804a.e(interfaceC0377a);
            this.f26920d = interfaceC0371a;
            this.f26922f = new androidx.media3.exoplayer.drm.g();
            this.f26924h = new androidx.media3.exoplayer.upstream.a();
            this.f26925i = Config.MC_STATS_INTERVAL;
            this.f26926j = 5000000L;
            this.f26923g = new C4058f();
            b(true);
        }
    }

    class a implements C4473b.InterfaceC0693b {
        a() {
        }

        @Override // s2.C4473b.InterfaceC0693b
        public void a(IOException iOException) {
            DashMediaSource.this.W(iOException);
        }

        @Override // s2.C4473b.InterfaceC0693b
        public void b() {
            DashMediaSource.this.X(C4473b.i());
        }
    }

    private static final class b extends G {

        /* renamed from: e, reason: collision with root package name */
        private final long f26929e;

        /* renamed from: f, reason: collision with root package name */
        private final long f26930f;

        /* renamed from: g, reason: collision with root package name */
        private final long f26931g;

        /* renamed from: h, reason: collision with root package name */
        private final int f26932h;

        /* renamed from: i, reason: collision with root package name */
        private final long f26933i;

        /* renamed from: j, reason: collision with root package name */
        private final long f26934j;

        /* renamed from: k, reason: collision with root package name */
        private final long f26935k;

        /* renamed from: l, reason: collision with root package name */
        private final h2.c f26936l;

        /* renamed from: m, reason: collision with root package name */
        private final v f26937m;

        /* renamed from: n, reason: collision with root package name */
        private final v.g f26938n;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, h2.c cVar, v vVar, v.g gVar) {
            C1804a.g(cVar.f42220d == (gVar != null));
            this.f26929e = j10;
            this.f26930f = j11;
            this.f26931g = j12;
            this.f26932h = i10;
            this.f26933i = j13;
            this.f26934j = j14;
            this.f26935k = j15;
            this.f26936l = cVar;
            this.f26937m = vVar;
            this.f26938n = gVar;
        }

        private long s(long j10) {
            g2.e eVarL;
            long j11 = this.f26935k;
            if (!t(this.f26936l)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.f26934j) {
                    return -9223372036854775807L;
                }
            }
            long j12 = this.f26933i + j11;
            long jG = this.f26936l.g(0);
            int i10 = 0;
            while (i10 < this.f26936l.e() - 1 && j12 >= jG) {
                j12 -= jG;
                i10++;
                jG = this.f26936l.g(i10);
            }
            h2.g gVarD = this.f26936l.d(i10);
            int iA = gVarD.a(2);
            return (iA == -1 || (eVarL = gVarD.f42254c.get(iA).f42209c.get(0).l()) == null || eVarL.i(jG) == 0) ? j11 : (j11 + eVarL.a(eVarL.f(j12, jG))) - j12;
        }

        private static boolean t(h2.c cVar) {
            return cVar.f42220d && cVar.f42221e != -9223372036854775807L && cVar.f42218b == -9223372036854775807L;
        }

        @Override // U1.G
        public int b(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f26932h) >= 0 && iIntValue < i()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // U1.G
        public G.b g(int i10, G.b bVar, boolean z10) {
            C1804a.c(i10, 0, i());
            return bVar.s(z10 ? this.f26936l.d(i10).f42252a : null, z10 ? Integer.valueOf(this.f26932h + i10) : null, 0, this.f26936l.g(i10), L.Q0(this.f26936l.d(i10).f42253b - this.f26936l.d(0).f42253b) - this.f26933i);
        }

        @Override // U1.G
        public int i() {
            return this.f26936l.e();
        }

        @Override // U1.G
        public Object m(int i10) {
            C1804a.c(i10, 0, i());
            return Integer.valueOf(this.f26932h + i10);
        }

        @Override // U1.G
        public G.c o(int i10, G.c cVar, long j10) {
            C1804a.c(i10, 0, 1);
            long jS = s(j10);
            Object obj = G.c.f16834q;
            v vVar = this.f26937m;
            h2.c cVar2 = this.f26936l;
            return cVar.g(obj, vVar, cVar2, this.f26929e, this.f26930f, this.f26931g, true, t(cVar2), this.f26938n, jS, this.f26934j, 0, i() - 1, this.f26933i);
        }

        @Override // U1.G
        public int p() {
            return 1;
        }
    }

    private final class c implements f.b {
        private c() {
        }

        @Override // androidx.media3.exoplayer.dash.f.b
        public void a() {
            DashMediaSource.this.Q();
        }

        @Override // androidx.media3.exoplayer.dash.f.b
        public void b(long j10) {
            DashMediaSource.this.P(j10);
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    static final class d implements c.a<Long> {

        /* renamed from: a, reason: collision with root package name */
        private static final Pattern f26940a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // androidx.media3.exoplayer.upstream.c.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException, NumberFormatException {
            String line = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).readLine();
            try {
                Matcher matcher = f26940a.matcher(line);
                if (!matcher.matches()) {
                    throw ParserException.c("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j11 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j10 * (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw ParserException.c(null, e10);
            }
        }
    }

    private final class e implements Loader.b<androidx.media3.exoplayer.upstream.c<h2.c>> {
        private e() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void v(androidx.media3.exoplayer.upstream.c<h2.c> cVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.R(cVar, j10, j11);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void t(androidx.media3.exoplayer.upstream.c<h2.c> cVar, long j10, long j11) {
            DashMediaSource.this.S(cVar, j10, j11);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c k(androidx.media3.exoplayer.upstream.c<h2.c> cVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.T(cVar, j10, j11, iOException, i10);
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    final class f implements k {
        f() {
        }

        private void b() throws IOException {
            if (DashMediaSource.this.f26885C != null) {
                throw DashMediaSource.this.f26885C;
            }
        }

        @Override // r2.k
        public void a() throws IOException {
            DashMediaSource.this.f26883A.a();
            b();
        }
    }

    private final class g implements Loader.b<androidx.media3.exoplayer.upstream.c<Long>> {
        private g() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void v(androidx.media3.exoplayer.upstream.c<Long> cVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.R(cVar, j10, j11);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void t(androidx.media3.exoplayer.upstream.c<Long> cVar, long j10, long j11) {
            DashMediaSource.this.U(cVar, j10, j11);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c k(androidx.media3.exoplayer.upstream.c<Long> cVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.V(cVar, j10, j11, iOException);
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    private static final class h implements c.a<Long> {
        private h() {
        }

        @Override // androidx.media3.exoplayer.upstream.c.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(L.X0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        w.a("media3.exoplayer.dash");
    }

    /* synthetic */ DashMediaSource(v vVar, h2.c cVar, a.InterfaceC0371a interfaceC0371a, c.a aVar, a.InterfaceC0377a interfaceC0377a, InterfaceC4057e interfaceC4057e, r2.e eVar, i iVar, androidx.media3.exoplayer.upstream.b bVar, long j10, long j11, a aVar2) {
        this(vVar, cVar, interfaceC0371a, aVar, interfaceC0377a, interfaceC4057e, eVar, iVar, bVar, j10, j11);
    }

    private static long H(h2.g gVar, long j10, long j11) {
        long jQ0 = L.Q0(gVar.f42253b);
        boolean zL = L(gVar);
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar.f42254c.size(); i10++) {
            C3485a c3485a = gVar.f42254c.get(i10);
            List<j> list = c3485a.f42209c;
            int i11 = c3485a.f42208b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zL || !z10) && !list.isEmpty()) {
                g2.e eVarL = list.get(0).l();
                if (eVarL == null) {
                    return jQ0 + j10;
                }
                long j12 = eVarL.j(j10, j11);
                if (j12 == 0) {
                    return jQ0;
                }
                long jC = (eVarL.c(j10, j11) + j12) - 1;
                jMin = Math.min(jMin, eVarL.b(jC, j10) + eVarL.a(jC) + jQ0);
            }
        }
        return jMin;
    }

    private static long I(h2.g gVar, long j10, long j11) {
        long jQ0 = L.Q0(gVar.f42253b);
        boolean zL = L(gVar);
        long jMax = jQ0;
        for (int i10 = 0; i10 < gVar.f42254c.size(); i10++) {
            C3485a c3485a = gVar.f42254c.get(i10);
            List<j> list = c3485a.f42209c;
            int i11 = c3485a.f42208b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zL || !z10) && !list.isEmpty()) {
                g2.e eVarL = list.get(0).l();
                if (eVarL == null) {
                    return jQ0;
                }
                if (eVarL.j(j10, j11) == 0) {
                    return jQ0;
                }
                jMax = Math.max(jMax, eVarL.a(eVarL.c(j10, j11)) + jQ0);
            }
        }
        return jMax;
    }

    private static long J(h2.c cVar, long j10) {
        g2.e eVarL;
        int iE = cVar.e() - 1;
        h2.g gVarD = cVar.d(iE);
        long jQ0 = L.Q0(gVarD.f42253b);
        long jG = cVar.g(iE);
        long jQ02 = L.Q0(j10);
        long jQ03 = L.Q0(cVar.f42217a);
        long jQ04 = L.Q0(Config.MC_BROADCAST_INTERVAL_WIFI);
        for (int i10 = 0; i10 < gVarD.f42254c.size(); i10++) {
            List<j> list = gVarD.f42254c.get(i10).f42209c;
            if (!list.isEmpty() && (eVarL = list.get(0).l()) != null) {
                long jD = ((jQ03 + jQ0) + eVarL.d(jG, jQ02)) - jQ02;
                if (jD < jQ04 - 100000 || (jD > jQ04 && jD < jQ04 + 100000)) {
                    jQ04 = jD;
                }
            }
        }
        return C4145e.b(jQ04, 1000L, RoundingMode.CEILING);
    }

    private long K() {
        return Math.min((this.f26895M - 1) * 1000, 5000);
    }

    private static boolean L(h2.g gVar) {
        for (int i10 = 0; i10 < gVar.f42254c.size(); i10++) {
            int i11 = gVar.f42254c.get(i10).f42208b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean M(h2.g gVar) {
        for (int i10 = 0; i10 < gVar.f42254c.size(); i10++) {
            g2.e eVarL = gVar.f42254c.get(i10).f42209c.get(0).l();
            if (eVarL == null || eVarL.g()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        Y(false);
    }

    private void O() {
        C4473b.l(this.f26883A, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(IOException iOException) {
        X1.n.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f26894L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        Y(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(long j10) {
        this.f26894L = j10;
        Y(true);
    }

    private void Y(boolean z10) {
        h2.g gVar;
        long j10;
        long j11;
        for (int i10 = 0; i10 < this.f26912u.size(); i10++) {
            int iKeyAt = this.f26912u.keyAt(i10);
            if (iKeyAt >= this.f26897O) {
                this.f26912u.valueAt(i10).N(this.f26890H, iKeyAt - this.f26897O);
            }
        }
        h2.g gVarD = this.f26890H.d(0);
        int iE = this.f26890H.e() - 1;
        h2.g gVarD2 = this.f26890H.d(iE);
        long jG = this.f26890H.g(iE);
        long jQ0 = L.Q0(L.f0(this.f26894L));
        long jI = I(gVarD, this.f26890H.g(0), jQ0);
        long jH = H(gVarD2, jG, jQ0);
        boolean z11 = this.f26890H.f42220d && !M(gVarD2);
        if (z11) {
            long j12 = this.f26890H.f42222f;
            if (j12 != -9223372036854775807L) {
                jI = Math.max(jI, jH - L.Q0(j12));
            }
        }
        long j13 = jH - jI;
        h2.c cVar = this.f26890H;
        if (cVar.f42220d) {
            C1804a.g(cVar.f42217a != -9223372036854775807L);
            long jQ02 = (jQ0 - L.Q0(this.f26890H.f42217a)) - jI;
            f0(jQ02, j13);
            long jU1 = this.f26890H.f42217a + L.u1(jI);
            long jQ03 = jQ02 - L.Q0(this.f26887E.f17308a);
            long jMin = Math.min(this.f26907p, j13 / 2);
            j10 = jU1;
            j11 = jQ03 < jMin ? jMin : jQ03;
            gVar = gVarD;
        } else {
            gVar = gVarD;
            j10 = -9223372036854775807L;
            j11 = 0;
        }
        long jQ04 = jI - L.Q0(gVar.f42253b);
        h2.c cVar2 = this.f26890H;
        z(new b(cVar2.f42217a, j10, this.f26894L, this.f26897O, jQ04, j13, j11, cVar2, h(), this.f26890H.f42220d ? this.f26887E : null));
        if (this.f26899h) {
            return;
        }
        this.f26886D.removeCallbacks(this.f26914w);
        if (z11) {
            this.f26886D.postDelayed(this.f26914w, J(this.f26890H, L.f0(this.f26894L)));
        }
        if (this.f26891I) {
            e0();
            return;
        }
        if (z10) {
            h2.c cVar3 = this.f26890H;
            if (cVar3.f42220d) {
                long j14 = cVar3.f42221e;
                if (j14 != -9223372036854775807L) {
                    if (j14 == 0) {
                        j14 = Config.MC_BROADCAST_INTERVAL_WIFI;
                    }
                    c0(Math.max(0L, (this.f26892J + j14) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void Z(o oVar) {
        String str = oVar.f42306a;
        if (L.d(str, "urn:mpeg:dash:utc:direct:2014") || L.d(str, "urn:mpeg:dash:utc:direct:2012")) {
            a0(oVar);
            return;
        }
        if (L.d(str, "urn:mpeg:dash:utc:http-iso:2014") || L.d(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            b0(oVar, new d());
            return;
        }
        if (L.d(str, "urn:mpeg:dash:utc:http-xsdate:2014") || L.d(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            b0(oVar, new h(null));
        } else if (L.d(str, "urn:mpeg:dash:utc:ntp:2014") || L.d(str, "urn:mpeg:dash:utc:ntp:2012")) {
            O();
        } else {
            W(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void a0(o oVar) {
        try {
            X(L.X0(oVar.f42307b) - this.f26893K);
        } catch (ParserException e10) {
            W(e10);
        }
    }

    private void b0(o oVar, c.a<Long> aVar) {
        d0(new androidx.media3.exoplayer.upstream.c(this.f26917z, Uri.parse(oVar.f42307b), 5, aVar), new g(this, null), 1);
    }

    private void c0(long j10) {
        this.f26886D.postDelayed(this.f26913v, j10);
    }

    private <T> void d0(androidx.media3.exoplayer.upstream.c<T> cVar, Loader.b<androidx.media3.exoplayer.upstream.c<T>> bVar, int i10) {
        this.f26908q.B(new n2.i(cVar.f27870a, cVar.f27871b, this.f26883A.n(cVar, bVar, i10)), cVar.f27872c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        Uri uri;
        this.f26886D.removeCallbacks(this.f26913v);
        if (this.f26883A.i()) {
            return;
        }
        if (this.f26883A.j()) {
            this.f26891I = true;
            return;
        }
        synchronized (this.f26911t) {
            uri = this.f26888F;
        }
        this.f26891I = false;
        d0(new androidx.media3.exoplayer.upstream.c(this.f26917z, uri, 4, this.f26909r), this.f26910s, this.f26904m.c(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f0(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.f0(long, long):void");
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2137a
    protected void A() {
        this.f26891I = false;
        this.f26917z = null;
        Loader loader = this.f26883A;
        if (loader != null) {
            loader.l();
            this.f26883A = null;
        }
        this.f26892J = 0L;
        this.f26893K = 0L;
        this.f26888F = this.f26889G;
        this.f26885C = null;
        Handler handler = this.f26886D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f26886D = null;
        }
        this.f26894L = -9223372036854775807L;
        this.f26895M = 0;
        this.f26896N = -9223372036854775807L;
        this.f26912u.clear();
        this.f26905n.i();
        this.f26903l.c();
    }

    void P(long j10) {
        long j11 = this.f26896N;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.f26896N = j10;
        }
    }

    void Q() {
        this.f26886D.removeCallbacks(this.f26914w);
        e0();
    }

    void R(androidx.media3.exoplayer.upstream.c<?> cVar, long j10, long j11) {
        n2.i iVar = new n2.i(cVar.f27870a, cVar.f27871b, cVar.f(), cVar.d(), j10, j11, cVar.c());
        this.f26904m.b(cVar.f27870a);
        this.f26908q.s(iVar, cVar.f27872c);
    }

    void S(androidx.media3.exoplayer.upstream.c<h2.c> cVar, long j10, long j11) {
        n2.i iVar = new n2.i(cVar.f27870a, cVar.f27871b, cVar.f(), cVar.d(), j10, j11, cVar.c());
        this.f26904m.b(cVar.f27870a);
        this.f26908q.v(iVar, cVar.f27872c);
        h2.c cVarE = cVar.e();
        h2.c cVar2 = this.f26890H;
        int iE = cVar2 == null ? 0 : cVar2.e();
        long j12 = cVarE.d(0).f42253b;
        int i10 = 0;
        while (i10 < iE && this.f26890H.d(i10).f42253b < j12) {
            i10++;
        }
        if (cVarE.f42220d) {
            if (iE - i10 > cVarE.e()) {
                X1.n.h("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = this.f26896N;
                if (j13 == -9223372036854775807L || cVarE.f42224h * 1000 > j13) {
                    this.f26895M = 0;
                } else {
                    X1.n.h("DashMediaSource", "Loaded stale dynamic manifest: " + cVarE.f42224h + ", " + this.f26896N);
                }
            }
            int i11 = this.f26895M;
            this.f26895M = i11 + 1;
            if (i11 < this.f26904m.c(cVar.f27872c)) {
                c0(K());
                return;
            } else {
                this.f26885C = new DashManifestStaleException();
                return;
            }
        }
        this.f26890H = cVarE;
        this.f26891I = cVarE.f42220d & this.f26891I;
        this.f26892J = j10 - j11;
        this.f26893K = j10;
        this.f26897O += i10;
        synchronized (this.f26911t) {
            try {
                if (cVar.f27871b.f19983a == this.f26888F) {
                    Uri uriF = this.f26890H.f42227k;
                    if (uriF == null) {
                        uriF = cVar.f();
                    }
                    this.f26888F = uriF;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h2.c cVar3 = this.f26890H;
        if (!cVar3.f42220d || this.f26894L != -9223372036854775807L) {
            Y(true);
            return;
        }
        o oVar = cVar3.f42225i;
        if (oVar != null) {
            Z(oVar);
        } else {
            O();
        }
    }

    Loader.c T(androidx.media3.exoplayer.upstream.c<h2.c> cVar, long j10, long j11, IOException iOException, int i10) {
        n2.i iVar = new n2.i(cVar.f27870a, cVar.f27871b, cVar.f(), cVar.d(), j10, j11, cVar.c());
        long jA = this.f26904m.a(new b.c(iVar, new n2.j(cVar.f27872c), iOException, i10));
        Loader.c cVarH = jA == -9223372036854775807L ? Loader.f27842g : Loader.h(false, jA);
        boolean zC = cVarH.c();
        this.f26908q.z(iVar, cVar.f27872c, iOException, !zC);
        if (!zC) {
            this.f26904m.b(cVar.f27870a);
        }
        return cVarH;
    }

    void U(androidx.media3.exoplayer.upstream.c<Long> cVar, long j10, long j11) {
        n2.i iVar = new n2.i(cVar.f27870a, cVar.f27871b, cVar.f(), cVar.d(), j10, j11, cVar.c());
        this.f26904m.b(cVar.f27870a);
        this.f26908q.v(iVar, cVar.f27872c);
        X(cVar.e().longValue() - j10);
    }

    Loader.c V(androidx.media3.exoplayer.upstream.c<Long> cVar, long j10, long j11, IOException iOException) {
        this.f26908q.z(new n2.i(cVar.f27870a, cVar.f27871b, cVar.f(), cVar.d(), j10, j11, cVar.c()), cVar.f27872c, iOException, true);
        this.f26904m.b(cVar.f27870a);
        W(iOException);
        return Loader.f27841f;
    }

    @Override // androidx.media3.exoplayer.source.r
    public q a(r.b bVar, r2.b bVar2, long j10) {
        int iIntValue = ((Integer) bVar.f27812a).intValue() - this.f26897O;
        s.a aVarT = t(bVar);
        androidx.media3.exoplayer.dash.c cVar = new androidx.media3.exoplayer.dash.c(iIntValue + this.f26897O, this.f26890H, this.f26905n, iIntValue, this.f26901j, this.f26884B, null, this.f26903l, r(bVar), this.f26904m, aVarT, this.f26894L, this.f26916y, bVar2, this.f26902k, this.f26915x, w());
        this.f26912u.put(cVar.f26946B, cVar);
        return cVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized v h() {
        return this.f26898P;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void i() {
        this.f26916y.a();
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void j(v vVar) {
        this.f26898P = vVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void p(q qVar) {
        androidx.media3.exoplayer.dash.c cVar = (androidx.media3.exoplayer.dash.c) qVar;
        cVar.J();
        this.f26912u.remove(cVar.f26946B);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2137a
    protected void y(n nVar) {
        this.f26884B = nVar;
        this.f26903l.e(Looper.myLooper(), w());
        this.f26903l.i();
        if (this.f26899h) {
            Y(false);
            return;
        }
        this.f26917z = this.f26900i.a();
        this.f26883A = new Loader("DashMediaSource");
        this.f26886D = L.A();
        e0();
    }

    private DashMediaSource(v vVar, h2.c cVar, a.InterfaceC0371a interfaceC0371a, c.a<? extends h2.c> aVar, a.InterfaceC0377a interfaceC0377a, InterfaceC4057e interfaceC4057e, r2.e eVar, i iVar, androidx.media3.exoplayer.upstream.b bVar, long j10, long j11) {
        this.f26898P = vVar;
        this.f26887E = vVar.f17236d;
        this.f26888F = ((v.h) C1804a.e(vVar.f17234b)).f17326a;
        this.f26889G = vVar.f17234b.f17326a;
        this.f26890H = cVar;
        this.f26900i = interfaceC0371a;
        this.f26909r = aVar;
        this.f26901j = interfaceC0377a;
        this.f26903l = iVar;
        this.f26904m = bVar;
        this.f26906o = j10;
        this.f26907p = j11;
        this.f26902k = interfaceC4057e;
        this.f26905n = new C3382b();
        boolean z10 = cVar != null;
        this.f26899h = z10;
        a aVar2 = null;
        this.f26908q = t(null);
        this.f26911t = new Object();
        this.f26912u = new SparseArray<>();
        this.f26915x = new c(this, aVar2);
        this.f26896N = -9223372036854775807L;
        this.f26894L = -9223372036854775807L;
        if (!z10) {
            this.f26910s = new e(this, aVar2);
            this.f26916y = new f();
            this.f26913v = new Runnable() { // from class: g2.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41549B.e0();
                }
            };
            this.f26914w = new Runnable() { // from class: g2.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41550B.N();
                }
            };
            return;
        }
        C1804a.g(true ^ cVar.f42220d);
        this.f26910s = null;
        this.f26913v = null;
        this.f26914w = null;
        this.f26916y = new k.a();
    }
}
