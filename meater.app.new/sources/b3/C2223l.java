package b3;

import U1.s;
import X1.C1804a;
import b3.L;
import java.util.Collections;
import java.util.List;
import v2.O;

/* compiled from: DvbSubtitleReader.java */
/* renamed from: b3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2223l implements InterfaceC2224m {

    /* renamed from: a, reason: collision with root package name */
    private final List<L.a> f30298a;

    /* renamed from: b, reason: collision with root package name */
    private final O[] f30299b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30300c;

    /* renamed from: d, reason: collision with root package name */
    private int f30301d;

    /* renamed from: e, reason: collision with root package name */
    private int f30302e;

    /* renamed from: f, reason: collision with root package name */
    private long f30303f = -9223372036854775807L;

    public C2223l(List<L.a> list) {
        this.f30298a = list;
        this.f30299b = new O[list.size()];
    }

    private boolean f(X1.y yVar, int i10) {
        if (yVar.a() == 0) {
            return false;
        }
        if (yVar.H() != i10) {
            this.f30300c = false;
        }
        this.f30301d--;
        return this.f30300c;
    }

    @Override // b3.InterfaceC2224m
    public void a() {
        this.f30300c = false;
        this.f30303f = -9223372036854775807L;
    }

    @Override // b3.InterfaceC2224m
    public void b(X1.y yVar) {
        if (this.f30300c) {
            if (this.f30301d != 2 || f(yVar, 32)) {
                if (this.f30301d != 1 || f(yVar, 0)) {
                    int iF = yVar.f();
                    int iA = yVar.a();
                    for (O o10 : this.f30299b) {
                        yVar.W(iF);
                        o10.d(yVar, iA);
                    }
                    this.f30302e += iA;
                }
            }
        }
    }

    @Override // b3.InterfaceC2224m
    public void c(boolean z10) {
        if (this.f30300c) {
            C1804a.g(this.f30303f != -9223372036854775807L);
            for (O o10 : this.f30299b) {
                o10.e(this.f30303f, 1, this.f30302e, 0, null);
            }
            this.f30300c = false;
        }
    }

    @Override // b3.InterfaceC2224m
    public void d(v2.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f30299b.length; i10++) {
            L.a aVar = this.f30298a.get(i10);
            dVar.a();
            O oA = rVar.a(dVar.c(), 3);
            oA.f(new s.b().e0(dVar.b()).s0("application/dvbsubs").f0(Collections.singletonList(aVar.f30196c)).i0(aVar.f30194a).M());
            this.f30299b[i10] = oA;
        }
    }

    @Override // b3.InterfaceC2224m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f30300c = true;
        this.f30303f = j10;
        this.f30302e = 0;
        this.f30301d = 2;
    }
}
