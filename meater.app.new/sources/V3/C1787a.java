package V3;

import W3.c;
import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* renamed from: V3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1787a {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f18029a = c.a.a("k", "x", "y");

    public static R3.e a(W3.c cVar, L3.i iVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.o() == c.b.BEGIN_ARRAY) {
            cVar.b();
            while (cVar.f()) {
                arrayList.add(z.a(cVar, iVar));
            }
            cVar.d();
            u.b(arrayList);
        } else {
            arrayList.add(new Y3.a(s.e(cVar, X3.j.e())));
        }
        return new R3.e(arrayList);
    }

    static R3.m<PointF, PointF> b(W3.c cVar, L3.i iVar) {
        cVar.c();
        R3.e eVarA = null;
        R3.b bVarE = null;
        boolean z10 = false;
        R3.b bVarE2 = null;
        while (cVar.o() != c.b.END_OBJECT) {
            int iQ = cVar.q(f18029a);
            if (iQ == 0) {
                eVarA = a(cVar, iVar);
            } else if (iQ != 1) {
                if (iQ != 2) {
                    cVar.s();
                    cVar.t();
                } else if (cVar.o() == c.b.STRING) {
                    cVar.t();
                    z10 = true;
                } else {
                    bVarE = C1790d.e(cVar, iVar);
                }
            } else if (cVar.o() == c.b.STRING) {
                cVar.t();
                z10 = true;
            } else {
                bVarE2 = C1790d.e(cVar, iVar);
            }
        }
        cVar.e();
        if (z10) {
            iVar.a("Lottie doesn't support expressions.");
        }
        return eVarA != null ? eVarA : new R3.i(bVarE2, bVarE);
    }
}
