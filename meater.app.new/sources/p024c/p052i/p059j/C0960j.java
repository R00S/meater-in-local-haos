package p024c.p052i.p059j;

import java.io.PrintWriter;

/* compiled from: TimeUtils.java */
/* renamed from: c.i.j.j */
/* loaded from: classes.dex */
public final class C0960j {

    /* renamed from: a */
    private static final Object f6410a = new Object();

    /* renamed from: b */
    private static char[] f6411b = new char[24];

    /* renamed from: a */
    private static int m6067a(int i2, int i3, boolean z, int i4) {
        if (i2 > 99 || (z && i4 >= 3)) {
            return i3 + 3;
        }
        if (i2 > 9 || (z && i4 >= 2)) {
            return i3 + 2;
        }
        if (z || i2 > 0) {
            return i3 + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m6068b(long j2, long j3, PrintWriter printWriter) {
        if (j2 == 0) {
            printWriter.print("--");
        } else {
            m6070d(j2 - j3, printWriter, 0);
        }
    }

    /* renamed from: c */
    public static void m6069c(long j2, PrintWriter printWriter) {
        m6070d(j2, printWriter, 0);
    }

    /* renamed from: d */
    public static void m6070d(long j2, PrintWriter printWriter, int i2) {
        synchronized (f6410a) {
            printWriter.print(new String(f6411b, 0, m6071e(j2, i2)));
        }
    }

    /* renamed from: e */
    private static int m6071e(long j2, int i2) {
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j3 = j2;
        if (f6411b.length < i2) {
            f6411b = new char[i2];
        }
        char[] cArr = f6411b;
        if (j3 == 0) {
            int i8 = i2 - 1;
            while (i8 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j3 > 0) {
            c2 = '+';
        } else {
            c2 = '-';
            j3 = -j3;
        }
        int i9 = (int) (j3 % 1000);
        int iFloor = (int) Math.floor(j3 / 1000);
        if (iFloor > 86400) {
            i3 = iFloor / 86400;
            iFloor -= 86400 * i3;
        } else {
            i3 = 0;
        }
        if (iFloor > 3600) {
            i4 = iFloor / 3600;
            iFloor -= i4 * 3600;
        } else {
            i4 = 0;
        }
        if (iFloor > 60) {
            int i10 = iFloor / 60;
            i5 = iFloor - (i10 * 60);
            i6 = i10;
        } else {
            i5 = iFloor;
            i6 = 0;
        }
        if (i2 != 0) {
            int iM6067a = m6067a(i3, 1, false, 0);
            int iM6067a2 = iM6067a + m6067a(i4, 1, iM6067a > 0, 2);
            int iM6067a3 = iM6067a2 + m6067a(i6, 1, iM6067a2 > 0, 2);
            int iM6067a4 = iM6067a3 + m6067a(i5, 1, iM6067a3 > 0, 2);
            i7 = 0;
            for (int iM6067a5 = iM6067a4 + m6067a(i9, 2, true, iM6067a4 > 0 ? 3 : 0) + 1; iM6067a5 < i2; iM6067a5++) {
                cArr[i7] = ' ';
                i7++;
            }
        } else {
            i7 = 0;
        }
        cArr[i7] = c2;
        int i11 = i7 + 1;
        boolean z = i2 != 0;
        int iM6072f = m6072f(cArr, i3, 'd', i11, false, 0);
        int iM6072f2 = m6072f(cArr, i4, 'h', iM6072f, iM6072f != i11, z ? 2 : 0);
        int iM6072f3 = m6072f(cArr, i6, 'm', iM6072f2, iM6072f2 != i11, z ? 2 : 0);
        int iM6072f4 = m6072f(cArr, i5, 's', iM6072f3, iM6072f3 != i11, z ? 2 : 0);
        int iM6072f5 = m6072f(cArr, i9, 'm', iM6072f4, true, (!z || iM6072f4 == i11) ? 0 : 3);
        cArr[iM6072f5] = 's';
        return iM6072f5 + 1;
    }

    /* renamed from: f */
    private static int m6072f(char[] cArr, int i2, char c2, int i3, boolean z, int i4) {
        int i5;
        if (!z && i2 <= 0) {
            return i3;
        }
        if ((!z || i4 < 3) && i2 <= 99) {
            i5 = i3;
        } else {
            int i6 = i2 / 100;
            cArr[i3] = (char) (i6 + 48);
            i5 = i3 + 1;
            i2 -= i6 * 100;
        }
        if ((z && i4 >= 2) || i2 > 9 || i3 != i5) {
            int i7 = i2 / 10;
            cArr[i5] = (char) (i7 + 48);
            i5++;
            i2 -= i7 * 10;
        }
        cArr[i5] = (char) (i2 + 48);
        int i8 = i5 + 1;
        cArr[i8] = c2;
        return i8 + 1;
    }
}
