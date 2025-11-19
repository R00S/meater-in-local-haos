package nb;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import lb.C3937q;
import lb.C3940t;

/* compiled from: TypeTable.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final List<C3937q> f45845a;

    public g(C3940t typeTable) {
        C3862t.g(typeTable, "typeTable");
        List<C3937q> listB = typeTable.B();
        if (typeTable.C()) {
            int iY = typeTable.y();
            List<C3937q> listB2 = typeTable.B();
            C3862t.f(listB2, "getTypeList(...)");
            List<C3937q> list = listB2;
            ArrayList arrayList = new ArrayList(r.x(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    r.w();
                }
                C3937q c3937qV = (C3937q) obj;
                if (i10 >= iY) {
                    c3937qV = c3937qV.d().P(true).e();
                }
                arrayList.add(c3937qV);
                i10 = i11;
            }
            listB = arrayList;
        }
        C3862t.f(listB, "run(...)");
        this.f45845a = listB;
    }

    public final C3937q a(int i10) {
        return this.f45845a.get(i10);
    }
}
