package b1;

import java.util.ArrayList;

/* compiled from: RunGroup.java */
/* renamed from: b1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2208m {

    /* renamed from: h, reason: collision with root package name */
    public static int f30048h;

    /* renamed from: c, reason: collision with root package name */
    p f30051c;

    /* renamed from: d, reason: collision with root package name */
    p f30052d;

    /* renamed from: f, reason: collision with root package name */
    int f30054f;

    /* renamed from: g, reason: collision with root package name */
    int f30055g;

    /* renamed from: a, reason: collision with root package name */
    public int f30049a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30050b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<p> f30053e = new ArrayList<>();

    C2208m(p pVar, int i10) {
        this.f30051c = null;
        this.f30052d = null;
        int i11 = f30048h;
        this.f30054f = i11;
        f30048h = i11 + 1;
        this.f30051c = pVar;
        this.f30052d = pVar;
        this.f30055g = i10;
    }

    private long c(C2201f c2201f, long j10) {
        p pVar = c2201f.f30024d;
        if (pVar instanceof C2206k) {
            return j10;
        }
        int size = c2201f.f30031k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC2199d interfaceC2199d = c2201f.f30031k.get(i10);
            if (interfaceC2199d instanceof C2201f) {
                C2201f c2201f2 = (C2201f) interfaceC2199d;
                if (c2201f2.f30024d != pVar) {
                    jMin = Math.min(jMin, c(c2201f2, c2201f2.f30026f + j10));
                }
            }
        }
        if (c2201f != pVar.f30081i) {
            return jMin;
        }
        long j11 = j10 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f30080h, j11)), j11 - pVar.f30080h.f30026f);
    }

    private long d(C2201f c2201f, long j10) {
        p pVar = c2201f.f30024d;
        if (pVar instanceof C2206k) {
            return j10;
        }
        int size = c2201f.f30031k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC2199d interfaceC2199d = c2201f.f30031k.get(i10);
            if (interfaceC2199d instanceof C2201f) {
                C2201f c2201f2 = (C2201f) interfaceC2199d;
                if (c2201f2.f30024d != pVar) {
                    jMax = Math.max(jMax, d(c2201f2, c2201f2.f30026f + j10));
                }
            }
        }
        if (c2201f != pVar.f30080h) {
            return jMax;
        }
        long j11 = j10 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f30081i, j11)), j11 - pVar.f30081i.f30026f);
    }

    public void a(p pVar) {
        this.f30053e.add(pVar);
        this.f30052d = pVar;
    }

    public long b(a1.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f30051c;
        if (pVar instanceof C2198c) {
            if (((C2198c) pVar).f30078f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof C2207l)) {
                return 0L;
            }
        } else if (!(pVar instanceof C2209n)) {
            return 0L;
        }
        C2201f c2201f = (i10 == 0 ? fVar.f19820e : fVar.f19822f).f30080h;
        C2201f c2201f2 = (i10 == 0 ? fVar.f19820e : fVar.f19822f).f30081i;
        boolean zContains = pVar.f30080h.f30032l.contains(c2201f);
        boolean zContains2 = this.f30051c.f30081i.f30032l.contains(c2201f2);
        long j11 = this.f30051c.j();
        if (zContains && zContains2) {
            long jD = d(this.f30051c.f30080h, 0L);
            long jC = c(this.f30051c.f30081i, 0L);
            long j12 = jD - j11;
            p pVar2 = this.f30051c;
            int i12 = pVar2.f30081i.f30026f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = pVar2.f30080h.f30026f;
            long j13 = ((-jC) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float fQ = pVar2.f30074b.q(i10);
            float f10 = fQ > 0.0f ? (long) ((j13 / fQ) + (j12 / (1.0f - fQ))) : 0L;
            long j14 = ((long) ((f10 * fQ) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fQ)) + 0.5f));
            j10 = r12.f30080h.f30026f + j14;
            i11 = this.f30051c.f30081i.f30026f;
        } else {
            if (zContains) {
                return Math.max(d(this.f30051c.f30080h, r12.f30026f), this.f30051c.f30080h.f30026f + j11);
            }
            if (zContains2) {
                return Math.max(-c(this.f30051c.f30081i, r12.f30026f), (-this.f30051c.f30081i.f30026f) + j11);
            }
            j10 = r12.f30080h.f30026f + this.f30051c.j();
            i11 = this.f30051c.f30081i.f30026f;
        }
        return j10 - i11;
    }
}
