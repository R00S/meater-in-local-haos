package S2;

import X1.C1804a;
import X1.L;
import l8.InterfaceC3914g;
import m8.AbstractC4009y;
import m8.U;

/* compiled from: CuesWithTimingSubtitle.java */
/* loaded from: classes.dex */
public final class g implements k {

    /* renamed from: D, reason: collision with root package name */
    private static final U<e> f15269D = U.d().f(new InterfaceC3914g() { // from class: S2.f
        @Override // l8.InterfaceC3914g
        public final Object apply(Object obj) {
            return g.d((e) obj);
        }
    });

    /* renamed from: B, reason: collision with root package name */
    private final AbstractC4009y<AbstractC4009y<W1.a>> f15270B;

    /* renamed from: C, reason: collision with root package name */
    private final long[] f15271C;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(java.util.List<S2.e> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 0
            r17.<init>()
            int r3 = r18.size()
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != r4) goto L4c
            java.lang.Object r3 = m8.C3982E.g(r18)
            S2.e r3 = (S2.e) r3
            long r7 = r3.f15266b
            long r7 = e(r7)
            long r9 = r3.f15267c
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L34
            m8.y<W1.a> r1 = r3.f15265a
            m8.y r1 = m8.AbstractC4009y.H(r1)
            r0.f15270B = r1
            long[] r1 = new long[r4]
            r1[r2] = r7
            r0.f15271C = r1
            goto L4b
        L34:
            m8.y<W1.a> r5 = r3.f15265a
            m8.y r6 = m8.AbstractC4009y.G()
            m8.y r5 = m8.AbstractC4009y.I(r5, r6)
            r0.f15270B = r5
            long r5 = r3.f15267c
            long r5 = r5 + r7
            long[] r1 = new long[r1]
            r1[r2] = r7
            r1[r4] = r5
            r0.f15271C = r1
        L4b:
            return
        L4c:
            int r3 = r18.size()
            int r3 = r3 * r1
            long[] r1 = new long[r3]
            r0.f15271C = r1
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            m8.U<S2.e> r3 = S2.g.f15269D
            r7 = r18
            m8.y r3 = m8.AbstractC4009y.Q(r3, r7)
            r7 = r2
        L6b:
            int r8 = r3.size()
            if (r2 >= r8) goto Ld6
            java.lang.Object r8 = r3.get(r2)
            S2.e r8 = (S2.e) r8
            long r9 = r8.f15266b
            long r9 = e(r9)
            long r11 = r8.f15267c
            long r11 = r11 + r9
            if (r7 == 0) goto Lb4
            long[] r13 = r0.f15271C
            int r14 = r7 + (-1)
            r15 = r13[r14]
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 >= 0) goto L8d
            goto Lb4
        L8d:
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 != 0) goto La3
            java.lang.Object r13 = r1.get(r14)
            m8.y r13 = (m8.AbstractC4009y) r13
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto La3
            m8.y<W1.a> r9 = r8.f15265a
            r1.set(r14, r9)
            goto Lc0
        La3:
            java.lang.String r13 = "CuesWithTimingSubtitle"
            java.lang.String r15 = "Truncating unsupported overlapping cues."
            X1.n.h(r13, r15)
            long[] r13 = r0.f15271C
            r13[r14] = r9
            m8.y<W1.a> r9 = r8.f15265a
            r1.set(r14, r9)
            goto Lc0
        Lb4:
            long[] r13 = r0.f15271C
            int r14 = r7 + 1
            r13[r7] = r9
            m8.y<W1.a> r7 = r8.f15265a
            r1.add(r7)
            r7 = r14
        Lc0:
            long r8 = r8.f15267c
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto Ld4
            long[] r8 = r0.f15271C
            int r9 = r7 + 1
            r8[r7] = r11
            m8.y r7 = m8.AbstractC4009y.G()
            r1.add(r7)
            r7 = r9
        Ld4:
            int r2 = r2 + r4
            goto L6b
        Ld6:
            m8.y r1 = m8.AbstractC4009y.B(r1)
            r0.f15270B = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.g.<init>(java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable d(e eVar) {
        return Long.valueOf(e(eVar.f15266b));
    }

    private static long e(long j10) {
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10;
    }

    @Override // S2.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC4009y<W1.a> n(long j10) {
        int iH = L.h(this.f15271C, j10, true, false);
        return iH == -1 ? AbstractC4009y.G() : this.f15270B.get(iH);
    }

    @Override // S2.k
    public int c(long j10) {
        int iE = L.e(this.f15271C, j10, false, false);
        if (iE < this.f15270B.size()) {
            return iE;
        }
        return -1;
    }

    @Override // S2.k
    public long j(int i10) {
        C1804a.a(i10 < this.f15270B.size());
        return this.f15271C[i10];
    }

    @Override // S2.k
    public int p() {
        return this.f15270B.size();
    }
}
