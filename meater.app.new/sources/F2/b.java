package F2;

import E2.c;
import U1.y;
import X1.x;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: AppInfoTableDecoder.java */
/* loaded from: classes.dex */
public final class b extends c {
    private static y c(x xVar) {
        xVar.r(12);
        int iD = (xVar.d() + xVar.h(12)) - 4;
        xVar.r(44);
        xVar.s(xVar.h(12));
        xVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (xVar.d() >= iD) {
                break;
            }
            xVar.r(48);
            int iH = xVar.h(8);
            xVar.r(4);
            int iD2 = xVar.d() + xVar.h(12);
            String strL2 = null;
            while (xVar.d() < iD2) {
                int iH2 = xVar.h(8);
                int iH3 = xVar.h(8);
                int iD3 = xVar.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = xVar.h(16);
                    xVar.r(8);
                    if (iH4 == 3) {
                        while (xVar.d() < iD3) {
                            strL = xVar.l(xVar.h(8), StandardCharsets.US_ASCII);
                            int iH5 = xVar.h(8);
                            for (int i10 = 0; i10 < iH5; i10++) {
                                xVar.s(xVar.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = xVar.l(iH3, StandardCharsets.US_ASCII);
                }
                xVar.p(iD3 * 8);
            }
            xVar.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new a(iH, strL + strL2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new y(arrayList);
    }

    @Override // E2.c
    protected y b(E2.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new x(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
