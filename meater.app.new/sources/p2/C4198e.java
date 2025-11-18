package p2;

import X1.C1804a;
import java.util.ArrayList;
import java.util.List;
import l8.InterfaceC3914g;
import m8.AbstractC4009y;
import m8.U;

/* compiled from: MergingCuesResolver.java */
/* renamed from: p2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4198e implements InterfaceC4194a {

    /* renamed from: b, reason: collision with root package name */
    private static final U<S2.e> f47390b = U.d().f(new InterfaceC3914g() { // from class: p2.c
        @Override // l8.InterfaceC3914g
        public final Object apply(Object obj) {
            return C4198e.h((S2.e) obj);
        }
    }).a(U.d().g().f(new InterfaceC3914g() { // from class: p2.d
        @Override // l8.InterfaceC3914g
        public final Object apply(Object obj) {
            return C4198e.i((S2.e) obj);
        }
    }));

    /* renamed from: a, reason: collision with root package name */
    private final List<S2.e> f47391a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long h(S2.e eVar) {
        return Long.valueOf(eVar.f15266b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long i(S2.e eVar) {
        return Long.valueOf(eVar.f15267c);
    }

    @Override // p2.InterfaceC4194a
    public boolean a(S2.e eVar, long j10) {
        C1804a.a(eVar.f15266b != -9223372036854775807L);
        C1804a.a(eVar.f15267c != -9223372036854775807L);
        boolean z10 = eVar.f15266b <= j10 && j10 < eVar.f15268d;
        for (int size = this.f47391a.size() - 1; size >= 0; size--) {
            if (eVar.f15266b >= this.f47391a.get(size).f15266b) {
                this.f47391a.add(size + 1, eVar);
                return z10;
            }
        }
        this.f47391a.add(0, eVar);
        return z10;
    }

    @Override // p2.InterfaceC4194a
    public long b(long j10) {
        int i10 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i10 >= this.f47391a.size()) {
                break;
            }
            long j11 = this.f47391a.get(i10).f15266b;
            long j12 = this.f47391a.get(i10).f15268d;
            if (j10 < j11) {
                jMin = jMin == -9223372036854775807L ? j11 : Math.min(jMin, j11);
            } else {
                if (j10 < j12) {
                    jMin = jMin == -9223372036854775807L ? j12 : Math.min(jMin, j12);
                }
                i10++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p2.InterfaceC4194a
    public AbstractC4009y<W1.a> c(long j10) {
        if (!this.f47391a.isEmpty()) {
            if (j10 >= this.f47391a.get(0).f15266b) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f47391a.size(); i10++) {
                    S2.e eVar = this.f47391a.get(i10);
                    if (j10 >= eVar.f15266b && j10 < eVar.f15268d) {
                        arrayList.add(eVar);
                    }
                    if (j10 < eVar.f15266b) {
                        break;
                    }
                }
                AbstractC4009y abstractC4009yQ = AbstractC4009y.Q(f47390b, arrayList);
                AbstractC4009y.a aVarY = AbstractC4009y.y();
                for (int i11 = 0; i11 < abstractC4009yQ.size(); i11++) {
                    aVarY.j(((S2.e) abstractC4009yQ.get(i11)).f15265a);
                }
                return aVarY.k();
            }
        }
        return AbstractC4009y.G();
    }

    @Override // p2.InterfaceC4194a
    public void clear() {
        this.f47391a.clear();
    }

    @Override // p2.InterfaceC4194a
    public long d(long j10) {
        if (this.f47391a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < this.f47391a.get(0).f15266b) {
            return -9223372036854775807L;
        }
        long jMax = this.f47391a.get(0).f15266b;
        for (int i10 = 0; i10 < this.f47391a.size(); i10++) {
            long j11 = this.f47391a.get(i10).f15266b;
            long j12 = this.f47391a.get(i10).f15268d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }

    @Override // p2.InterfaceC4194a
    public void e(long j10) {
        int i10 = 0;
        while (i10 < this.f47391a.size()) {
            long j11 = this.f47391a.get(i10).f15266b;
            if (j10 > j11 && j10 > this.f47391a.get(i10).f15268d) {
                this.f47391a.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }
}
