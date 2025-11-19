package androidx.media3.datasource.cache;

import X1.C1804a;
import X1.n;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* compiled from: CachedContent.java */
/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f26246a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26247b;

    /* renamed from: c, reason: collision with root package name */
    private final TreeSet<i> f26248c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<a> f26249d;

    /* renamed from: e, reason: collision with root package name */
    private b2.g f26250e;

    /* compiled from: CachedContent.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f26251a;

        /* renamed from: b, reason: collision with root package name */
        public final long f26252b;

        public a(long j10, long j11) {
            this.f26251a = j10;
            this.f26252b = j11;
        }

        public boolean a(long j10, long j11) {
            long j12 = this.f26252b;
            if (j12 == -1) {
                return j10 >= this.f26251a;
            }
            if (j11 == -1) {
                return false;
            }
            long j13 = this.f26251a;
            return j13 <= j10 && j10 + j11 <= j13 + j12;
        }

        public boolean b(long j10, long j11) {
            long j12 = this.f26251a;
            if (j12 > j10) {
                return j11 == -1 || j10 + j11 > j12;
            }
            long j13 = this.f26252b;
            return j13 == -1 || j12 + j13 > j10;
        }
    }

    public e(int i10, String str) {
        this(i10, str, b2.g.f30108c);
    }

    public void a(i iVar) {
        this.f26248c.add(iVar);
    }

    public boolean b(b2.f fVar) {
        this.f26250e = this.f26250e.g(fVar);
        return !r2.equals(r0);
    }

    public long c(long j10, long j11) {
        C1804a.a(j10 >= 0);
        C1804a.a(j11 >= 0);
        i iVarE = e(j10, j11);
        if (iVarE.j()) {
            return -Math.min(iVarE.n() ? Long.MAX_VALUE : iVarE.f30092D, j11);
        }
        long j12 = j10 + j11;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        long jMax = iVarE.f30091C + iVarE.f30092D;
        if (jMax < j13) {
            for (i iVar : this.f26248c.tailSet(iVarE, false)) {
                long j14 = iVar.f30091C;
                if (j14 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j14 + iVar.f30092D);
                if (jMax >= j13) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public b2.g d() {
        return this.f26250e;
    }

    public i e(long j10, long j11) {
        i iVarV = i.v(this.f26247b, j10);
        i iVarFloor = this.f26248c.floor(iVarV);
        if (iVarFloor != null && iVarFloor.f30091C + iVarFloor.f30092D > j10) {
            return iVarFloor;
        }
        i iVarCeiling = this.f26248c.ceiling(iVarV);
        if (iVarCeiling != null) {
            long j12 = iVarCeiling.f30091C - j10;
            j11 = j11 == -1 ? j12 : Math.min(j12, j11);
        }
        return i.u(this.f26247b, j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f26246a == eVar.f26246a && this.f26247b.equals(eVar.f26247b) && this.f26248c.equals(eVar.f26248c) && this.f26250e.equals(eVar.f26250e);
    }

    public TreeSet<i> f() {
        return this.f26248c;
    }

    public boolean g() {
        return this.f26248c.isEmpty();
    }

    public boolean h(long j10, long j11) {
        for (int i10 = 0; i10 < this.f26249d.size(); i10++) {
            if (this.f26249d.get(i10).a(j10, j11)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f26246a * 31) + this.f26247b.hashCode()) * 31) + this.f26250e.hashCode();
    }

    public boolean i() {
        return this.f26249d.isEmpty();
    }

    public boolean j(long j10, long j11) {
        for (int i10 = 0; i10 < this.f26249d.size(); i10++) {
            if (this.f26249d.get(i10).b(j10, j11)) {
                return false;
            }
        }
        this.f26249d.add(new a(j10, j11));
        return true;
    }

    public boolean k(b2.c cVar) {
        if (!this.f26248c.remove(cVar)) {
            return false;
        }
        File file = cVar.f30094F;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public i l(i iVar, long j10, boolean z10) {
        C1804a.g(this.f26248c.remove(iVar));
        File file = (File) C1804a.e(iVar.f30094F);
        if (z10) {
            File fileW = i.w((File) C1804a.e(file.getParentFile()), this.f26246a, iVar.f30091C, j10);
            if (file.renameTo(fileW)) {
                file = fileW;
            } else {
                n.h("CachedContent", "Failed to rename " + file + " to " + fileW);
            }
        }
        i iVarP = iVar.p(file, j10);
        this.f26248c.add(iVarP);
        return iVarP;
    }

    public void m(long j10) {
        for (int i10 = 0; i10 < this.f26249d.size(); i10++) {
            if (this.f26249d.get(i10).f26251a == j10) {
                this.f26249d.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public e(int i10, String str, b2.g gVar) {
        this.f26246a = i10;
        this.f26247b = str;
        this.f26250e = gVar;
        this.f26248c = new TreeSet<>();
        this.f26249d = new ArrayList<>();
    }
}
