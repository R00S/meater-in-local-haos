package S2;

import S2.r;
import X1.C1804a;
import X1.InterfaceC1811h;
import X1.L;
import X1.y;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v2.E;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.O;

/* compiled from: SubtitleExtractor.java */
/* loaded from: classes.dex */
public class n implements InterfaceC4810p {

    /* renamed from: a, reason: collision with root package name */
    private final r f15275a;

    /* renamed from: c, reason: collision with root package name */
    private final U1.s f15277c;

    /* renamed from: g, reason: collision with root package name */
    private O f15281g;

    /* renamed from: h, reason: collision with root package name */
    private int f15282h;

    /* renamed from: b, reason: collision with root package name */
    private final d f15276b = new d();

    /* renamed from: f, reason: collision with root package name */
    private byte[] f15280f = L.f18631f;

    /* renamed from: e, reason: collision with root package name */
    private final y f15279e = new y();

    /* renamed from: d, reason: collision with root package name */
    private final List<b> f15278d = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private int f15283i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long[] f15284j = L.f18632g;

    /* renamed from: k, reason: collision with root package name */
    private long f15285k = -9223372036854775807L;

    /* compiled from: SubtitleExtractor.java */
    private static class b implements Comparable<b> {

        /* renamed from: B, reason: collision with root package name */
        private final long f15286B;

        /* renamed from: C, reason: collision with root package name */
        private final byte[] f15287C;

        @Override // java.lang.Comparable
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f15286B, bVar.f15286B);
        }

        private b(long j10, byte[] bArr) {
            this.f15286B = j10;
            this.f15287C = bArr;
        }
    }

    public n(r rVar, U1.s sVar) {
        this.f15275a = rVar;
        this.f15277c = sVar.b().s0("application/x-media3-cues").R(sVar.f17162o).V(rVar.d()).M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(e eVar) {
        b bVar = new b(eVar.f15266b, this.f15276b.a(eVar.f15265a, eVar.f15267c));
        this.f15278d.add(bVar);
        long j10 = this.f15285k;
        if (j10 == -9223372036854775807L || eVar.f15266b >= j10) {
            n(bVar);
        }
    }

    private void g() throws ParserException {
        try {
            long j10 = this.f15285k;
            this.f15275a.c(this.f15280f, 0, this.f15282h, j10 != -9223372036854775807L ? r.b.c(j10) : r.b.b(), new InterfaceC1811h() { // from class: S2.m
                @Override // X1.InterfaceC1811h
                public final void accept(Object obj) {
                    this.f15274a.f((e) obj);
                }
            });
            Collections.sort(this.f15278d);
            this.f15284j = new long[this.f15278d.size()];
            for (int i10 = 0; i10 < this.f15278d.size(); i10++) {
                this.f15284j[i10] = this.f15278d.get(i10).f15286B;
            }
            this.f15280f = L.f18631f;
        } catch (RuntimeException e10) {
            throw ParserException.a("SubtitleParser failed.", e10);
        }
    }

    private boolean k(InterfaceC4811q interfaceC4811q) {
        byte[] bArr = this.f15280f;
        if (bArr.length == this.f15282h) {
            this.f15280f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f15280f;
        int i10 = this.f15282h;
        int iE = interfaceC4811q.e(bArr2, i10, bArr2.length - i10);
        if (iE != -1) {
            this.f15282h += iE;
        }
        long jA = interfaceC4811q.a();
        return (jA != -1 && ((long) this.f15282h) == jA) || iE == -1;
    }

    private boolean l(InterfaceC4811q interfaceC4811q) {
        return interfaceC4811q.b((interfaceC4811q.a() > (-1L) ? 1 : (interfaceC4811q.a() == (-1L) ? 0 : -1)) != 0 ? p8.f.d(interfaceC4811q.a()) : 1024) == -1;
    }

    private void m() {
        long j10 = this.f15285k;
        for (int iH = j10 == -9223372036854775807L ? 0 : L.h(this.f15284j, j10, true, true); iH < this.f15278d.size(); iH++) {
            n(this.f15278d.get(iH));
        }
    }

    private void n(b bVar) {
        C1804a.i(this.f15281g);
        int length = bVar.f15287C.length;
        this.f15279e.T(bVar.f15287C);
        this.f15281g.d(this.f15279e, length);
        this.f15281g.e(bVar.f15286B, 1, length, 0, null);
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        int i10 = this.f15283i;
        C1804a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f15285k = j11;
        if (this.f15283i == 2) {
            this.f15283i = 1;
        }
        if (this.f15283i == 4) {
            this.f15283i = 3;
        }
    }

    @Override // v2.InterfaceC4810p
    public void c() {
        if (this.f15283i == 5) {
            return;
        }
        this.f15275a.b();
        this.f15283i = 5;
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        return true;
    }

    @Override // v2.InterfaceC4810p
    public void h(v2.r rVar) {
        C1804a.g(this.f15283i == 0);
        O oA = rVar.a(0, 3);
        this.f15281g = oA;
        oA.f(this.f15277c);
        rVar.n();
        rVar.f(new E(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f15283i = 1;
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) throws ParserException {
        int i11 = this.f15283i;
        C1804a.g((i11 == 0 || i11 == 5) ? false : true);
        if (this.f15283i == 1) {
            int iD = interfaceC4811q.a() != -1 ? p8.f.d(interfaceC4811q.a()) : 1024;
            if (iD > this.f15280f.length) {
                this.f15280f = new byte[iD];
            }
            this.f15282h = 0;
            this.f15283i = 2;
        }
        if (this.f15283i == 2 && k(interfaceC4811q)) {
            g();
            this.f15283i = 4;
        }
        if (this.f15283i == 3 && l(interfaceC4811q)) {
            m();
            this.f15283i = 4;
        }
        return this.f15283i == 4 ? -1 : 0;
    }
}
