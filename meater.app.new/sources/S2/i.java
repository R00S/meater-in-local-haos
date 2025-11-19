package S2;

import X1.InterfaceC1811h;
import java.util.List;

/* compiled from: LegacySubtitleUtil.java */
/* loaded from: classes.dex */
public class i {
    private static int a(k kVar, long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        int iC = kVar.c(j10);
        if (iC == -1) {
            iC = kVar.p();
        }
        return (iC <= 0 || kVar.j(iC + (-1)) != j10) ? iC : iC - 1;
    }

    private static void b(k kVar, int i10, InterfaceC1811h<e> interfaceC1811h) {
        long j10 = kVar.j(i10);
        List<W1.a> listN = kVar.n(j10);
        if (listN.isEmpty()) {
            return;
        }
        if (i10 == kVar.p() - 1) {
            throw new IllegalStateException();
        }
        long j11 = kVar.j(i10 + 1) - kVar.j(i10);
        if (j11 > 0) {
            interfaceC1811h.accept(new e(listN, j10, j11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(S2.k r11, S2.r.b r12, X1.InterfaceC1811h<S2.e> r13) {
        /*
            long r0 = r12.f15294a
            int r0 = a(r11, r0)
            long r1 = r12.f15294a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L3b
            int r1 = r11.p()
            if (r0 >= r1) goto L3b
            long r3 = r12.f15294a
            java.util.List r6 = r11.n(r3)
            long r3 = r11.j(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L3b
            long r7 = r12.f15294a
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3b
            S2.e r1 = new S2.e
            long r9 = r3 - r7
            r5 = r1
            r5.<init>(r6, r7, r9)
            r13.accept(r1)
            r1 = 1
            goto L3c
        L3b:
            r1 = r2
        L3c:
            r3 = r0
        L3d:
            int r4 = r11.p()
            if (r3 >= r4) goto L49
            b(r11, r3, r13)
            int r3 = r3 + 1
            goto L3d
        L49:
            boolean r3 = r12.f15295b
            if (r3 == 0) goto L76
            if (r1 == 0) goto L51
            int r0 = r0 + (-1)
        L51:
            if (r2 >= r0) goto L59
            b(r11, r2, r13)
            int r2 = r2 + 1
            goto L51
        L59:
            if (r1 == 0) goto L76
            S2.e r1 = new S2.e
            long r2 = r12.f15294a
            java.util.List r4 = r11.n(r2)
            long r5 = r11.j(r0)
            long r2 = r12.f15294a
            long r11 = r11.j(r0)
            long r7 = r2 - r11
            r3 = r1
            r3.<init>(r4, r5, r7)
            r13.accept(r1)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.i.c(S2.k, S2.r$b, X1.h):void");
    }
}
