package u2;

import X1.L;
import X1.x;
import X1.y;
import java.util.ArrayList;
import java.util.zip.Inflater;
import u2.e;

/* compiled from: ProjectionDecoder.java */
/* loaded from: classes.dex */
final class f {
    public static e a(byte[] bArr, int i10) {
        ArrayList<e.a> arrayListF;
        y yVar = new y(bArr);
        try {
            arrayListF = c(yVar) ? f(yVar) : e(yVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        if (size == 1) {
            return new e(arrayListF.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new e(arrayListF.get(0), arrayListF.get(1), i10);
    }

    private static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static boolean c(y yVar) {
        yVar.X(4);
        int iQ = yVar.q();
        yVar.W(0);
        return iQ == 1886547818;
    }

    private static e.a d(y yVar) {
        int iQ = yVar.q();
        if (iQ > 10000) {
            return null;
        }
        float[] fArr = new float[iQ];
        for (int i10 = 0; i10 < iQ; i10++) {
            fArr[i10] = yVar.p();
        }
        int iQ2 = yVar.q();
        if (iQ2 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(iQ * 2.0d) / dLog);
        x xVar = new x(yVar.e());
        int i11 = 8;
        xVar.p(yVar.f() * 8);
        float[] fArr2 = new float[iQ2 * 5];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < iQ2) {
            int i15 = 0;
            while (i15 < i12) {
                int iB = iArr[i15] + b(xVar.h(iCeil));
                if (iB >= iQ || iB < 0) {
                    return null;
                }
                fArr2[i14] = fArr[iB];
                iArr[i15] = iB;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        xVar.p((xVar.e() + 7) & (-8));
        int i16 = 32;
        int iH = xVar.h(32);
        e.b[] bVarArr = new e.b[iH];
        int i17 = 0;
        while (i17 < iH) {
            int iH2 = xVar.h(i11);
            int iH3 = xVar.h(i11);
            int iH4 = xVar.h(i16);
            if (iH4 > 128000) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(iQ2 * d10) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int iB2 = 0;
            for (int i18 = 0; i18 < iH4; i18++) {
                iB2 += b(xVar.h(iCeil2));
                if (iB2 < 0 || iB2 >= iQ2) {
                    return null;
                }
                int i19 = i18 * 3;
                int i20 = iB2 * 5;
                fArr3[i19] = fArr2[i20];
                fArr3[i19 + 1] = fArr2[i20 + 1];
                fArr3[i19 + 2] = fArr2[i20 + 2];
                int i21 = i18 * 2;
                fArr4[i21] = fArr2[i20 + 3];
                fArr4[i21 + 1] = fArr2[i20 + 4];
            }
            bVarArr[i17] = new e.b(iH2, fArr3, fArr4, iH3);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new e.a(bVarArr);
    }

    private static ArrayList<e.a> e(y yVar) {
        if (yVar.H() != 0) {
            return null;
        }
        yVar.X(7);
        int iQ = yVar.q();
        if (iQ == 1684433976) {
            y yVar2 = new y();
            Inflater inflater = new Inflater(true);
            try {
                if (!L.A0(yVar, yVar2, inflater)) {
                    return null;
                }
                inflater.end();
                yVar = yVar2;
            } finally {
                inflater.end();
            }
        } else if (iQ != 1918990112) {
            return null;
        }
        return g(yVar);
    }

    private static ArrayList<e.a> f(y yVar) {
        int iQ;
        yVar.X(8);
        int iF = yVar.f();
        int iG = yVar.g();
        while (iF < iG && (iQ = yVar.q() + iF) > iF && iQ <= iG) {
            int iQ2 = yVar.q();
            if (iQ2 == 2037673328 || iQ2 == 1836279920) {
                yVar.V(iQ);
                return e(yVar);
            }
            yVar.W(iQ);
            iF = iQ;
        }
        return null;
    }

    private static ArrayList<e.a> g(y yVar) {
        ArrayList<e.a> arrayList = new ArrayList<>();
        int iF = yVar.f();
        int iG = yVar.g();
        while (iF < iG) {
            int iQ = yVar.q() + iF;
            if (iQ <= iF || iQ > iG) {
                return null;
            }
            if (yVar.q() == 1835365224) {
                e.a aVarD = d(yVar);
                if (aVarD == null) {
                    return null;
                }
                arrayList.add(aVarD);
            }
            yVar.W(iQ);
            iF = iQ;
        }
        return arrayList;
    }
}
