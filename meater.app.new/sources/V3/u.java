package V3;

import W3.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: KeyframesParser.java */
/* loaded from: classes.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    static c.a f18070a = c.a.a("k");

    static <T> List<Y3.a<T>> a(W3.c cVar, L3.i iVar, float f10, N<T> n10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (cVar.o() == c.b.STRING) {
            iVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.c();
        while (cVar.f()) {
            if (cVar.q(f18070a) != 0) {
                cVar.t();
            } else if (cVar.o() == c.b.BEGIN_ARRAY) {
                cVar.b();
                if (cVar.o() == c.b.NUMBER) {
                    arrayList.add(t.c(cVar, iVar, f10, n10, false, z10));
                } else {
                    while (cVar.f()) {
                        arrayList.add(t.c(cVar, iVar, f10, n10, true, z10));
                    }
                }
                cVar.d();
            } else {
                arrayList.add(t.c(cVar, iVar, f10, n10, false, z10));
            }
        }
        cVar.e();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends Y3.a<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            Y3.a<T> aVar = list.get(i11);
            i11++;
            Y3.a<T> aVar2 = list.get(i11);
            aVar.f19393h = Float.valueOf(aVar2.f19392g);
            if (aVar.f19388c == null && (t10 = aVar2.f19387b) != null) {
                aVar.f19388c = t10;
                if (aVar instanceof O3.i) {
                    ((O3.i) aVar).j();
                }
            }
        }
        Y3.a<T> aVar3 = list.get(i10);
        if ((aVar3.f19387b == null || aVar3.f19388c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
