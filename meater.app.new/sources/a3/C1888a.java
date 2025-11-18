package a3;

import S2.r;
import W1.a;
import X1.C1804a;
import X1.InterfaceC1811h;
import X1.L;
import X1.y;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: Mp4WebvttParser.java */
/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1888a implements r {

    /* renamed from: a, reason: collision with root package name */
    private final y f20019a = new y();

    private static W1.a e(y yVar, int i10) {
        CharSequence charSequenceR = null;
        a.b bVarP = null;
        while (i10 > 0) {
            C1804a.b(i10 >= 8, "Incomplete vtt cue box header found.");
            int iQ = yVar.q();
            int iQ2 = yVar.q();
            int i11 = iQ - 8;
            String strI = L.I(yVar.e(), yVar.f(), i11);
            yVar.X(i11);
            i10 = (i10 - 8) - i11;
            if (iQ2 == 1937011815) {
                bVarP = e.p(strI);
            } else if (iQ2 == 1885436268) {
                charSequenceR = e.r(null, strI.trim(), Collections.emptyList());
            }
        }
        if (charSequenceR == null) {
            charSequenceR = "";
        }
        return bVarP != null ? bVarP.o(charSequenceR).a() : e.m(charSequenceR);
    }

    @Override // S2.r
    public void c(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC1811h<S2.e> interfaceC1811h) {
        this.f20019a.U(bArr, i11 + i10);
        this.f20019a.W(i10);
        ArrayList arrayList = new ArrayList();
        while (this.f20019a.a() > 0) {
            C1804a.b(this.f20019a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iQ = this.f20019a.q();
            if (this.f20019a.q() == 1987343459) {
                arrayList.add(e(this.f20019a, iQ - 8));
            } else {
                this.f20019a.X(iQ - 8);
            }
        }
        interfaceC1811h.accept(new S2.e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // S2.r
    public int d() {
        return 2;
    }
}
