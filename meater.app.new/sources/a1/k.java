package a1;

import a1.e;

/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f19954a = new boolean[3];

    static void a(f fVar, X0.d dVar, e eVar) {
        eVar.f19850t = -1;
        eVar.f19852u = -1;
        e.b bVar = fVar.f19811Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f19811Z[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.f19800O.f19762g;
            int iW = fVar.W() - eVar.f19802Q.f19762g;
            d dVar2 = eVar.f19800O;
            dVar2.f19764i = dVar.q(dVar2);
            d dVar3 = eVar.f19802Q;
            dVar3.f19764i = dVar.q(dVar3);
            dVar.f(eVar.f19800O.f19764i, i10);
            dVar.f(eVar.f19802Q.f19764i, iW);
            eVar.f19850t = 2;
            eVar.P0(i10, iW);
        }
        if (fVar.f19811Z[1] == bVar2 || eVar.f19811Z[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.f19801P.f19762g;
        int iX = fVar.x() - eVar.f19803R.f19762g;
        d dVar4 = eVar.f19801P;
        dVar4.f19764i = dVar.q(dVar4);
        d dVar5 = eVar.f19803R;
        dVar5.f19764i = dVar.q(dVar5);
        dVar.f(eVar.f19801P.f19764i, i11);
        dVar.f(eVar.f19803R.f19764i, iX);
        if (eVar.f19835l0 > 0 || eVar.V() == 8) {
            d dVar6 = eVar.f19804S;
            dVar6.f19764i = dVar.q(dVar6);
            dVar.f(eVar.f19804S.f19764i, eVar.f19835l0 + i11);
        }
        eVar.f19852u = 2;
        eVar.g1(i11, iX);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
