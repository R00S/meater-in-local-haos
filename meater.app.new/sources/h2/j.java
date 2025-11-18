package h2;

import U1.s;
import X1.C1804a;
import android.net.Uri;
import h2.k;
import java.util.Collections;
import java.util.List;
import m8.AbstractC4009y;

/* compiled from: Representation.java */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f42266a;

    /* renamed from: b, reason: collision with root package name */
    public final s f42267b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4009y<C3486b> f42268c;

    /* renamed from: d, reason: collision with root package name */
    public final long f42269d;

    /* renamed from: e, reason: collision with root package name */
    public final List<e> f42270e;

    /* renamed from: f, reason: collision with root package name */
    public final List<e> f42271f;

    /* renamed from: g, reason: collision with root package name */
    public final List<e> f42272g;

    /* renamed from: h, reason: collision with root package name */
    private final i f42273h;

    /* compiled from: Representation.java */
    public static class c extends j {

        /* renamed from: i, reason: collision with root package name */
        public final Uri f42275i;

        /* renamed from: j, reason: collision with root package name */
        public final long f42276j;

        /* renamed from: k, reason: collision with root package name */
        private final String f42277k;

        /* renamed from: l, reason: collision with root package name */
        private final i f42278l;

        /* renamed from: m, reason: collision with root package name */
        private final m f42279m;

        public c(long j10, s sVar, List<C3486b> list, k.e eVar, List<e> list2, List<e> list3, List<e> list4, String str, long j11) {
            super(j10, sVar, list, eVar, list2, list3, list4);
            this.f42275i = Uri.parse(list.get(0).f42213a);
            i iVarC = eVar.c();
            this.f42278l = iVarC;
            this.f42277k = str;
            this.f42276j = j11;
            this.f42279m = iVarC != null ? null : new m(new i(null, 0L, j11));
        }

        @Override // h2.j
        public String k() {
            return this.f42277k;
        }

        @Override // h2.j
        public g2.e l() {
            return this.f42279m;
        }

        @Override // h2.j
        public i m() {
            return this.f42278l;
        }
    }

    public static j o(long j10, s sVar, List<C3486b> list, k kVar, List<e> list2, List<e> list3, List<e> list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j10, sVar, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, sVar, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract g2.e l();

    public abstract i m();

    public i n() {
        return this.f42273h;
    }

    private j(long j10, s sVar, List<C3486b> list, k kVar, List<e> list2, List<e> list3, List<e> list4) {
        C1804a.a(!list.isEmpty());
        this.f42266a = j10;
        this.f42267b = sVar;
        this.f42268c = AbstractC4009y.B(list);
        this.f42270e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f42271f = list3;
        this.f42272g = list4;
        this.f42273h = kVar.a(this);
        this.f42269d = kVar.b();
    }

    /* compiled from: Representation.java */
    public static class b extends j implements g2.e {

        /* renamed from: i, reason: collision with root package name */
        final k.a f42274i;

        public b(long j10, s sVar, List<C3486b> list, k.a aVar, List<e> list2, List<e> list3, List<e> list4) {
            super(j10, sVar, list, aVar, list2, list3, list4);
            this.f42274i = aVar;
        }

        @Override // g2.e
        public long a(long j10) {
            return this.f42274i.j(j10);
        }

        @Override // g2.e
        public long b(long j10, long j11) {
            return this.f42274i.h(j10, j11);
        }

        @Override // g2.e
        public long c(long j10, long j11) {
            return this.f42274i.d(j10, j11);
        }

        @Override // g2.e
        public long d(long j10, long j11) {
            return this.f42274i.f(j10, j11);
        }

        @Override // g2.e
        public i e(long j10) {
            return this.f42274i.k(this, j10);
        }

        @Override // g2.e
        public long f(long j10, long j11) {
            return this.f42274i.i(j10, j11);
        }

        @Override // g2.e
        public boolean g() {
            return this.f42274i.l();
        }

        @Override // g2.e
        public long h() {
            return this.f42274i.e();
        }

        @Override // g2.e
        public long i(long j10) {
            return this.f42274i.g(j10);
        }

        @Override // g2.e
        public long j(long j10, long j11) {
            return this.f42274i.c(j10, j11);
        }

        @Override // h2.j
        public String k() {
            return null;
        }

        @Override // h2.j
        public i m() {
            return null;
        }

        @Override // h2.j
        public g2.e l() {
            return this;
        }
    }
}
