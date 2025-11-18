package S8;

import Q8.C1622j;
import T8.F;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C4734X;

/* compiled from: UserMetadata.java */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final g f15580a;

    /* renamed from: b, reason: collision with root package name */
    private final R8.f f15581b;

    /* renamed from: c, reason: collision with root package name */
    private String f15582c;

    /* renamed from: d, reason: collision with root package name */
    private final a f15583d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    private final a f15584e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    private final k f15585f = new k(128);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference<String> f15586g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UserMetadata.java */
    class a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference<e> f15587a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<Runnable> f15588b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        private final boolean f15589c;

        public a(boolean z10) {
            this.f15589c = z10;
            this.f15587a = new AtomicMarkableReference<>(new e(64, z10 ? 8192 : 1024), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() throws Throwable {
            this.f15588b.set(null);
            e();
        }

        private void d() {
            Runnable runnable = new Runnable() { // from class: S8.o
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f15579B.c();
                }
            };
            if (C4734X.a(this.f15588b, null, runnable)) {
                p.this.f15581b.diskWrite.g(runnable);
            }
        }

        private void e() throws Throwable {
            Map<String, String> mapA;
            synchronized (this) {
                try {
                    if (this.f15587a.isMarked()) {
                        mapA = this.f15587a.getReference().a();
                        AtomicMarkableReference<e> atomicMarkableReference = this.f15587a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (mapA != null) {
                p.this.f15580a.r(p.this.f15582c, mapA, this.f15589c);
            }
        }

        public Map<String, String> b() {
            return this.f15587a.getReference().a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.f15587a.getReference().d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<e> atomicMarkableReference = this.f15587a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public p(String str, W8.g gVar, R8.f fVar) {
        this.f15582c = str;
        this.f15580a = new g(gVar);
        this.f15581b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(String str, Map map, List list) throws Throwable {
        if (j() != null) {
            this.f15580a.t(str, j());
        }
        if (!map.isEmpty()) {
            this.f15580a.q(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.f15580a.s(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(List list) throws Throwable {
        this.f15580a.s(this.f15582c, list);
    }

    public static p m(String str, W8.g gVar, R8.f fVar) {
        g gVar2 = new g(gVar);
        p pVar = new p(str, gVar, fVar);
        pVar.f15583d.f15587a.getReference().e(gVar2.i(str, false));
        pVar.f15584e.f15587a.getReference().e(gVar2.i(str, true));
        pVar.f15586g.set(gVar2.k(str), false);
        pVar.f15585f.c(gVar2.j(str));
        return pVar;
    }

    public static String n(String str, W8.g gVar) {
        return new g(gVar).k(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() throws Throwable {
        boolean z10;
        String strJ;
        synchronized (this.f15586g) {
            try {
                z10 = false;
                if (this.f15586g.isMarked()) {
                    strJ = j();
                    this.f15586g.set(strJ, false);
                    z10 = true;
                } else {
                    strJ = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            this.f15580a.t(this.f15582c, strJ);
        }
    }

    public Map<String, String> g(Map<String, String> map) {
        if (map.isEmpty()) {
            return this.f15583d.b();
        }
        HashMap map2 = new HashMap(this.f15583d.b());
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strC = e.c(entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strC)) {
                map2.put(strC, e.c(entry.getValue(), 1024));
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            N8.g.f().k("Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map<String, String> h() {
        return this.f15584e.b();
    }

    public List<F.e.d.AbstractC0251e> i() {
        return this.f15585f.a();
    }

    public String j() {
        return this.f15586g.getReference();
    }

    public boolean p(String str, String str2) {
        return this.f15584e.f(str, str2);
    }

    public void q(final String str) {
        synchronized (this.f15582c) {
            this.f15582c = str;
            final Map<String, String> mapB = this.f15583d.b();
            final List<j> listB = this.f15585f.b();
            this.f15581b.diskWrite.g(new Runnable() { // from class: S8.l
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f15572B.k(str, mapB, listB);
                }
            });
        }
    }

    public void r(String str) {
        String strC = e.c(str, 1024);
        synchronized (this.f15586g) {
            try {
                if (C1622j.y(strC, this.f15586g.getReference())) {
                    return;
                }
                this.f15586g.set(strC, true);
                this.f15581b.diskWrite.g(new Runnable() { // from class: S8.n
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f15578B.o();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean s(List<j> list) {
        synchronized (this.f15585f) {
            try {
                if (!this.f15585f.c(list)) {
                    return false;
                }
                final List<j> listB = this.f15585f.b();
                this.f15581b.diskWrite.g(new Runnable() { // from class: S8.m
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f15576B.l(listB);
                    }
                });
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
