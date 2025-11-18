package androidx.media3.exoplayer.drm;

import U1.C1732h;
import U1.C1738n;
import U1.s;
import U1.z;
import X1.C1804a;
import X1.L;
import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.drm.m;
import e2.v1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m8.AbstractC3979B;
import m8.AbstractC4009y;
import m8.d0;
import m8.j0;

/* loaded from: classes.dex */
public class DefaultDrmSessionManager implements i {

    /* renamed from: b, reason: collision with root package name */
    private final UUID f27064b;

    /* renamed from: c, reason: collision with root package name */
    private final m.c f27065c;

    /* renamed from: d, reason: collision with root package name */
    private final p f27066d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f27067e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f27068f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f27069g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f27070h;

    /* renamed from: i, reason: collision with root package name */
    private final f f27071i;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f27072j;

    /* renamed from: k, reason: collision with root package name */
    private final g f27073k;

    /* renamed from: l, reason: collision with root package name */
    private final long f27074l;

    /* renamed from: m, reason: collision with root package name */
    private final List<DefaultDrmSession> f27075m;

    /* renamed from: n, reason: collision with root package name */
    private final Set<e> f27076n;

    /* renamed from: o, reason: collision with root package name */
    private final Set<DefaultDrmSession> f27077o;

    /* renamed from: p, reason: collision with root package name */
    private int f27078p;

    /* renamed from: q, reason: collision with root package name */
    private m f27079q;

    /* renamed from: r, reason: collision with root package name */
    private DefaultDrmSession f27080r;

    /* renamed from: s, reason: collision with root package name */
    private DefaultDrmSession f27081s;

    /* renamed from: t, reason: collision with root package name */
    private Looper f27082t;

    /* renamed from: u, reason: collision with root package name */
    private Handler f27083u;

    /* renamed from: v, reason: collision with root package name */
    private int f27084v;

    /* renamed from: w, reason: collision with root package name */
    private byte[] f27085w;

    /* renamed from: x, reason: collision with root package name */
    private v1 f27086x;

    /* renamed from: y, reason: collision with root package name */
    volatile d f27087y;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        private boolean f27091d;

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f27088a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        private UUID f27089b = C1732h.f17050d;

        /* renamed from: c, reason: collision with root package name */
        private m.c f27090c = n.f27137d;

        /* renamed from: e, reason: collision with root package name */
        private int[] f27092e = new int[0];

        /* renamed from: f, reason: collision with root package name */
        private boolean f27093f = true;

        /* renamed from: g, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f27094g = new androidx.media3.exoplayer.upstream.a();

        /* renamed from: h, reason: collision with root package name */
        private long f27095h = 300000;

        public DefaultDrmSessionManager a(p pVar) {
            return new DefaultDrmSessionManager(this.f27089b, this.f27090c, pVar, this.f27088a, this.f27091d, this.f27092e, this.f27093f, this.f27094g, this.f27095h);
        }

        public b b(androidx.media3.exoplayer.upstream.b bVar) {
            this.f27094g = (androidx.media3.exoplayer.upstream.b) C1804a.e(bVar);
            return this;
        }

        public b c(boolean z10) {
            this.f27091d = z10;
            return this;
        }

        public b d(boolean z10) {
            this.f27093f = z10;
            return this;
        }

        public b e(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                C1804a.a(z10);
            }
            this.f27092e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, m.c cVar) {
            this.f27089b = (UUID) C1804a.e(uuid);
            this.f27090c = (m.c) C1804a.e(cVar);
            return this;
        }
    }

    private class c implements m.b {
        private c() {
        }

        @Override // androidx.media3.exoplayer.drm.m.b
        public void a(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) C1804a.e(DefaultDrmSessionManager.this.f27087y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f27075m) {
                if (defaultDrmSession.u(bArr)) {
                    defaultDrmSession.C(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements i.b {

        /* renamed from: b, reason: collision with root package name */
        private final h.a f27098b;

        /* renamed from: c, reason: collision with root package name */
        private DrmSession f27099c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f27100d;

        public e(h.a aVar) {
            this.f27098b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(s sVar) {
            if (DefaultDrmSessionManager.this.f27078p == 0 || this.f27100d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            this.f27099c = defaultDrmSessionManager.u((Looper) C1804a.e(defaultDrmSessionManager.f27082t), this.f27098b, sVar, false);
            DefaultDrmSessionManager.this.f27076n.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h() {
            if (this.f27100d) {
                return;
            }
            DrmSession drmSession = this.f27099c;
            if (drmSession != null) {
                drmSession.e(this.f27098b);
            }
            DefaultDrmSessionManager.this.f27076n.remove(this);
            this.f27100d = true;
        }

        @Override // androidx.media3.exoplayer.drm.i.b
        public void c() {
            L.Z0((Handler) C1804a.e(DefaultDrmSessionManager.this.f27083u), new Runnable() { // from class: androidx.media3.exoplayer.drm.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27116B.h();
                }
            });
        }

        public void f(final s sVar) {
            ((Handler) C1804a.e(DefaultDrmSessionManager.this.f27083u)).post(new Runnable() { // from class: androidx.media3.exoplayer.drm.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27114B.g(sVar);
                }
            });
        }
    }

    private class f implements DefaultDrmSession.a {

        /* renamed from: a, reason: collision with root package name */
        private final Set<DefaultDrmSession> f27102a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private DefaultDrmSession f27103b;

        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void a(Exception exc, boolean z10) {
            this.f27103b = null;
            AbstractC4009y abstractC4009yB = AbstractC4009y.B(this.f27102a);
            this.f27102a.clear();
            j0 it = abstractC4009yB.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).E(exc, z10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void b() {
            this.f27103b = null;
            AbstractC4009y abstractC4009yB = AbstractC4009y.B(this.f27102a);
            this.f27102a.clear();
            j0 it = abstractC4009yB.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).D();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void c(DefaultDrmSession defaultDrmSession) {
            this.f27102a.add(defaultDrmSession);
            if (this.f27103b != null) {
                return;
            }
            this.f27103b = defaultDrmSession;
            defaultDrmSession.I();
        }

        public void d(DefaultDrmSession defaultDrmSession) {
            this.f27102a.remove(defaultDrmSession);
            if (this.f27103b == defaultDrmSession) {
                this.f27103b = null;
                if (this.f27102a.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.f27102a.iterator().next();
                this.f27103b = next;
                next.I();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class g implements DefaultDrmSession.b {
        private g() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.b
        public void a(DefaultDrmSession defaultDrmSession, int i10) {
            if (DefaultDrmSessionManager.this.f27074l != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f27077o.remove(defaultDrmSession);
                ((Handler) C1804a.e(DefaultDrmSessionManager.this.f27083u)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.b
        public void b(final DefaultDrmSession defaultDrmSession, int i10) {
            if (i10 == 1 && DefaultDrmSessionManager.this.f27078p > 0 && DefaultDrmSessionManager.this.f27074l != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f27077o.add(defaultDrmSession);
                ((Handler) C1804a.e(DefaultDrmSessionManager.this.f27083u)).postAtTime(new Runnable() { // from class: androidx.media3.exoplayer.drm.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.e(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f27074l);
            } else if (i10 == 0) {
                DefaultDrmSessionManager.this.f27075m.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f27080r == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f27080r = null;
                }
                if (DefaultDrmSessionManager.this.f27081s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f27081s = null;
                }
                DefaultDrmSessionManager.this.f27071i.d(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f27074l != -9223372036854775807L) {
                    ((Handler) C1804a.e(DefaultDrmSessionManager.this.f27083u)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f27077o.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.D();
        }
    }

    private synchronized void A(Looper looper) {
        try {
            Looper looper2 = this.f27082t;
            if (looper2 == null) {
                this.f27082t = looper;
                this.f27083u = new Handler(looper);
            } else {
                C1804a.g(looper2 == looper);
                C1804a.e(this.f27083u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private DrmSession B(int i10, boolean z10) {
        m mVar = (m) C1804a.e(this.f27079q);
        if ((mVar.n() == 2 && i2.l.f43054d) || L.N0(this.f27069g, i10) == -1 || mVar.n() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f27080r;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionY = y(AbstractC4009y.G(), true, null, z10);
            this.f27075m.add(defaultDrmSessionY);
            this.f27080r = defaultDrmSessionY;
        } else {
            defaultDrmSession.a(null);
        }
        return this.f27080r;
    }

    private void C(Looper looper) {
        if (this.f27087y == null) {
            this.f27087y = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (this.f27079q != null && this.f27078p == 0 && this.f27075m.isEmpty() && this.f27076n.isEmpty()) {
            ((m) C1804a.e(this.f27079q)).c();
            this.f27079q = null;
        }
    }

    private void E() {
        j0 it = AbstractC3979B.D(this.f27077o).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).e(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void F() {
        j0 it = AbstractC3979B.D(this.f27076n).iterator();
        while (it.hasNext()) {
            ((e) it.next()).c();
        }
    }

    private void H(DrmSession drmSession, h.a aVar) {
        drmSession.e(aVar);
        if (this.f27074l != -9223372036854775807L) {
            drmSession.e(null);
        }
    }

    private void I(boolean z10) {
        if (z10 && this.f27082t == null) {
            X1.n.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) C1804a.e(this.f27082t)).getThread()) {
            X1.n.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f27082t.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DrmSession u(Looper looper, h.a aVar, s sVar, boolean z10) {
        List<C1738n.b> listZ;
        C(looper);
        C1738n c1738n = sVar.f17166s;
        if (c1738n == null) {
            return B(z.k(sVar.f17162o), z10);
        }
        DefaultDrmSession defaultDrmSessionY = null;
        byte b10 = 0;
        if (this.f27085w == null) {
            listZ = z((C1738n) C1804a.e(c1738n), this.f27064b, false);
            if (listZ.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f27064b);
                X1.n.d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new l(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            listZ = null;
        }
        if (this.f27068f) {
            Iterator<DefaultDrmSession> it = this.f27075m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it.next();
                if (L.d(next.f27031a, listZ)) {
                    defaultDrmSessionY = next;
                    break;
                }
            }
        } else {
            defaultDrmSessionY = this.f27081s;
        }
        if (defaultDrmSessionY == null) {
            defaultDrmSessionY = y(listZ, false, aVar, z10);
            if (!this.f27068f) {
                this.f27081s = defaultDrmSessionY;
            }
            this.f27075m.add(defaultDrmSessionY);
        } else {
            defaultDrmSessionY.a(aVar);
        }
        return defaultDrmSessionY;
    }

    private static boolean v(DrmSession drmSession) {
        if (drmSession.getState() != 1) {
            return false;
        }
        Throwable cause = ((DrmSession.DrmSessionException) C1804a.e(drmSession.h())).getCause();
        return (cause instanceof ResourceBusyException) || j.e(cause);
    }

    private boolean w(C1738n c1738n) {
        if (this.f27085w != null) {
            return true;
        }
        if (z(c1738n, this.f27064b, true).isEmpty()) {
            if (c1738n.f17090E != 1 || !c1738n.e(0).d(C1732h.f17048b)) {
                return false;
            }
            X1.n.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f27064b);
        }
        String str = c1738n.f17089D;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? L.f18626a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private DefaultDrmSession x(List<C1738n.b> list, boolean z10, h.a aVar) {
        C1804a.e(this.f27079q);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f27064b, this.f27079q, this.f27071i, this.f27073k, list, this.f27084v, this.f27070h | z10, z10, this.f27085w, this.f27067e, this.f27066d, (Looper) C1804a.e(this.f27082t), this.f27072j, (v1) C1804a.e(this.f27086x));
        defaultDrmSession.a(aVar);
        if (this.f27074l != -9223372036854775807L) {
            defaultDrmSession.a(null);
        }
        return defaultDrmSession;
    }

    private DefaultDrmSession y(List<C1738n.b> list, boolean z10, h.a aVar, boolean z11) {
        DefaultDrmSession defaultDrmSessionX = x(list, z10, aVar);
        if (v(defaultDrmSessionX) && !this.f27077o.isEmpty()) {
            E();
            H(defaultDrmSessionX, aVar);
            defaultDrmSessionX = x(list, z10, aVar);
        }
        if (!v(defaultDrmSessionX) || !z11 || this.f27076n.isEmpty()) {
            return defaultDrmSessionX;
        }
        F();
        if (!this.f27077o.isEmpty()) {
            E();
        }
        H(defaultDrmSessionX, aVar);
        return x(list, z10, aVar);
    }

    private static List<C1738n.b> z(C1738n c1738n, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(c1738n.f17090E);
        for (int i10 = 0; i10 < c1738n.f17090E; i10++) {
            C1738n.b bVarE = c1738n.e(i10);
            if ((bVarE.d(uuid) || (C1732h.f17049c.equals(uuid) && bVarE.d(C1732h.f17048b))) && (bVarE.f17095F != null || z10)) {
                arrayList.add(bVarE);
            }
        }
        return arrayList;
    }

    public void G(int i10, byte[] bArr) {
        C1804a.g(this.f27075m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            C1804a.e(bArr);
        }
        this.f27084v = i10;
        this.f27085w = bArr;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public DrmSession a(h.a aVar, s sVar) {
        I(false);
        C1804a.g(this.f27078p > 0);
        C1804a.i(this.f27082t);
        return u(this.f27082t, aVar, sVar, true);
    }

    @Override // androidx.media3.exoplayer.drm.i
    public i.b b(h.a aVar, s sVar) {
        C1804a.g(this.f27078p > 0);
        C1804a.i(this.f27082t);
        e eVar = new e(aVar);
        eVar.f(sVar);
        return eVar;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public final void c() {
        I(true);
        int i10 = this.f27078p - 1;
        this.f27078p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f27074l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f27075m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((DefaultDrmSession) arrayList.get(i11)).e(null);
            }
        }
        F();
        D();
    }

    @Override // androidx.media3.exoplayer.drm.i
    public int d(s sVar) {
        I(false);
        int iN = ((m) C1804a.e(this.f27079q)).n();
        C1738n c1738n = sVar.f17166s;
        if (c1738n != null) {
            if (w(c1738n)) {
                return iN;
            }
            return 1;
        }
        if (L.N0(this.f27069g, z.k(sVar.f17162o)) != -1) {
            return iN;
        }
        return 0;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public void e(Looper looper, v1 v1Var) {
        A(looper);
        this.f27086x = v1Var;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public final void i() {
        I(true);
        int i10 = this.f27078p;
        this.f27078p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f27079q == null) {
            m mVarA = this.f27065c.a(this.f27064b);
            this.f27079q = mVarA;
            mVarA.j(new c());
        } else if (this.f27074l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f27075m.size(); i11++) {
                this.f27075m.get(i11).a(null);
            }
        }
    }

    private DefaultDrmSessionManager(UUID uuid, m.c cVar, p pVar, HashMap<String, String> map, boolean z10, int[] iArr, boolean z11, androidx.media3.exoplayer.upstream.b bVar, long j10) {
        C1804a.e(uuid);
        C1804a.b(!C1732h.f17048b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f27064b = uuid;
        this.f27065c = cVar;
        this.f27066d = pVar;
        this.f27067e = map;
        this.f27068f = z10;
        this.f27069g = iArr;
        this.f27070h = z11;
        this.f27072j = bVar;
        this.f27071i = new f();
        this.f27073k = new g();
        this.f27084v = 0;
        this.f27075m = new ArrayList();
        this.f27076n = d0.h();
        this.f27077o = d0.h();
        this.f27074l = j10;
    }
}
