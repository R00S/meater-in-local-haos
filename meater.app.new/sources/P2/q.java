package P2;

import X1.y;
import com.apptionlabs.meater_app.model.TemperatureLog;

/* compiled from: SmtaAtomUtil.java */
/* loaded from: classes.dex */
public final class q {
    private static int a(int i10, y yVar, int i11) {
        if (i10 == 12) {
            return 240;
        }
        if (i10 == 13) {
            return TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES;
        }
        if (i10 == 21 && yVar.a() >= 8 && yVar.f() + 8 <= i11) {
            int iQ = yVar.q();
            int iQ2 = yVar.q();
            if (iQ >= 12 && iQ2 == 1936877170) {
                return yVar.I();
            }
        }
        return -2147483647;
    }

    public static U1.y b(y yVar, int i10) {
        yVar.X(12);
        while (yVar.f() < i10) {
            int iF = yVar.f();
            int iQ = yVar.q();
            if (yVar.q() == 1935766900) {
                if (iQ < 16) {
                    return null;
                }
                yVar.X(4);
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < 2; i13++) {
                    int iH = yVar.H();
                    int iH2 = yVar.H();
                    if (iH == 0) {
                        i11 = iH2;
                    } else if (iH == 1) {
                        i12 = iH2;
                    }
                }
                int iA = a(i11, yVar, i10);
                if (iA == -2147483647) {
                    return null;
                }
                return new U1.y(new K2.d(iA, i12));
            }
            yVar.W(iF + iQ);
        }
        return null;
    }
}
