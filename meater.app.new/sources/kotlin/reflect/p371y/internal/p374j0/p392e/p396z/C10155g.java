package kotlin.reflect.p371y.internal.p374j0.p392e.p396z;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10141t;

/* compiled from: TypeTable.kt */
/* renamed from: kotlin.f0.y.e.j0.e.z.g */
/* loaded from: classes3.dex */
public final class C10155g {

    /* renamed from: a */
    private final List<C10138q> f39236a;

    public C10155g(C10141t c10141t) {
        C9801m.m32346f(c10141t, "typeTable");
        List<C10138q> listM35226A = c10141t.m35226A();
        if (c10141t.m35227B()) {
            int iM35230x = c10141t.m35230x();
            List<C10138q> listM35226A2 = c10141t.m35226A();
            C9801m.m32345e(listM35226A2, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(C10819v.m38911u(listM35226A2, 10));
            int i2 = 0;
            for (Object obj : listM35226A2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C10817u.m38898t();
                }
                C10138q c10138qM35109t = (C10138q) obj;
                if (i2 >= iM35230x) {
                    c10138qM35109t = c10138qM35109t.mo34077d().m35104M(true).mo34093c();
                }
                arrayList.add(c10138qM35109t);
                i2 = i3;
            }
            listM35226A = arrayList;
        }
        C9801m.m32345e(listM35226A, "run {\n        val origin… else originalTypes\n    }");
        this.f39236a = listM35226A;
    }

    /* renamed from: a */
    public final C10138q m35399a(int i2) {
        return this.f39236a.get(i2);
    }
}
