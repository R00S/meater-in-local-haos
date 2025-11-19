package p2;

import java.util.ArrayList;
import m8.AbstractC4009y;
import m8.C3982E;

/* compiled from: ReplacingCuesResolver.java */
/* renamed from: p2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4199f implements InterfaceC4194a {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<S2.e> f47392a = new ArrayList<>();

    private int f(long j10) {
        for (int i10 = 0; i10 < this.f47392a.size(); i10++) {
            if (j10 < this.f47392a.get(i10).f15266b) {
                return i10;
            }
        }
        return this.f47392a.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // p2.InterfaceC4194a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(S2.e r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f15266b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r1
        L10:
            X1.C1804a.a(r0)
            long r5 = r10.f15266b
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.f15268d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r4
            goto L26
        L25:
            r0 = r1
        L26:
            java.util.ArrayList<S2.e> r2 = r9.f47392a
            int r2 = r2.size()
            int r2 = r2 - r4
        L2d:
            if (r2 < 0) goto L58
            long r5 = r10.f15266b
            java.util.ArrayList<S2.e> r3 = r9.f47392a
            java.lang.Object r3 = r3.get(r2)
            S2.e r3 = (S2.e) r3
            long r7 = r3.f15266b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            java.util.ArrayList<S2.e> r11 = r9.f47392a
            int r2 = r2 + r4
            r11.add(r2, r10)
            return r0
        L46:
            java.util.ArrayList<S2.e> r3 = r9.f47392a
            java.lang.Object r3 = r3.get(r2)
            S2.e r3 = (S2.e) r3
            long r5 = r3.f15266b
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L55
            r0 = r1
        L55:
            int r2 = r2 + (-1)
            goto L2d
        L58:
            java.util.ArrayList<S2.e> r11 = r9.f47392a
            r11.add(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.C4199f.a(S2.e, long):boolean");
    }

    @Override // p2.InterfaceC4194a
    public long b(long j10) {
        if (this.f47392a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < this.f47392a.get(0).f15266b) {
            return this.f47392a.get(0).f15266b;
        }
        for (int i10 = 1; i10 < this.f47392a.size(); i10++) {
            S2.e eVar = this.f47392a.get(i10);
            if (j10 < eVar.f15266b) {
                long j11 = this.f47392a.get(i10 - 1).f15268d;
                return (j11 == -9223372036854775807L || j11 <= j10 || j11 >= eVar.f15266b) ? eVar.f15266b : j11;
            }
        }
        long j12 = ((S2.e) C3982E.e(this.f47392a)).f15268d;
        if (j12 == -9223372036854775807L || j10 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    @Override // p2.InterfaceC4194a
    public AbstractC4009y<W1.a> c(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return AbstractC4009y.G();
        }
        S2.e eVar = this.f47392a.get(iF - 1);
        long j11 = eVar.f15268d;
        return (j11 == -9223372036854775807L || j10 < j11) ? eVar.f15265a : AbstractC4009y.G();
    }

    @Override // p2.InterfaceC4194a
    public void clear() {
        this.f47392a.clear();
    }

    @Override // p2.InterfaceC4194a
    public long d(long j10) {
        if (this.f47392a.isEmpty() || j10 < this.f47392a.get(0).f15266b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < this.f47392a.size(); i10++) {
            long j11 = this.f47392a.get(i10).f15266b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                S2.e eVar = this.f47392a.get(i10 - 1);
                long j12 = eVar.f15268d;
                return (j12 == -9223372036854775807L || j12 > j10) ? eVar.f15266b : j12;
            }
        }
        S2.e eVar2 = (S2.e) C3982E.e(this.f47392a);
        long j13 = eVar2.f15268d;
        return (j13 == -9223372036854775807L || j10 < j13) ? eVar2.f15266b : j13;
    }

    @Override // p2.InterfaceC4194a
    public void e(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return;
        }
        long j11 = this.f47392a.get(iF - 1).f15268d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            iF--;
        }
        this.f47392a.subList(0, iF).clear();
    }
}
