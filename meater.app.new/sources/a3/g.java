package a3;

import S2.r;
import X1.InterfaceC1811h;
import X1.y;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.util.ArrayList;

/* compiled from: WebvttParser.java */
/* loaded from: classes.dex */
public final class g implements r {

    /* renamed from: a, reason: collision with root package name */
    private final y f20068a = new y();

    /* renamed from: b, reason: collision with root package name */
    private final b f20069b = new b();

    private static int e(y yVar) {
        int i10 = -1;
        int iF = 0;
        while (i10 == -1) {
            iF = yVar.f();
            String strS = yVar.s();
            i10 = strS == null ? 0 : "STYLE".equals(strS) ? 2 : strS.startsWith("NOTE") ? 1 : 3;
        }
        yVar.W(iF);
        return i10;
    }

    private static void f(y yVar) {
        while (!TextUtils.isEmpty(yVar.s())) {
        }
    }

    @Override // S2.r
    public void c(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC1811h<S2.e> interfaceC1811h) {
        d dVarN;
        this.f20068a.U(bArr, i11 + i10);
        this.f20068a.W(i10);
        ArrayList arrayList = new ArrayList();
        try {
            h.d(this.f20068a);
            while (!TextUtils.isEmpty(this.f20068a.s())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iE = e(this.f20068a);
                if (iE == 0) {
                    S2.i.c(new j(arrayList2), bVar, interfaceC1811h);
                    return;
                }
                if (iE == 1) {
                    f(this.f20068a);
                } else if (iE == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f20068a.s();
                    arrayList.addAll(this.f20069b.d(this.f20068a));
                } else if (iE == 3 && (dVarN = e.n(this.f20068a, arrayList)) != null) {
                    arrayList2.add(dVarN);
                }
            }
        } catch (ParserException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // S2.r
    public int d() {
        return 1;
    }
}
