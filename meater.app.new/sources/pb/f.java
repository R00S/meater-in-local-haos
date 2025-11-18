package pb;

import java.util.List;
import java.util.Set;
import kotlin.collections.V;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import ob.C4176a;

/* compiled from: JvmNameResolver.kt */
/* loaded from: classes3.dex */
public final class f extends g {

    /* renamed from: h, reason: collision with root package name */
    private final C4176a.e f47737h;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(C4176a.e types, String[] strings) {
        Set setB1;
        C3862t.g(types, "types");
        C3862t.g(strings, "strings");
        List<Integer> listY = types.y();
        if (listY.isEmpty()) {
            setB1 = V.d();
        } else {
            C3862t.d(listY);
            setB1 = r.b1(listY);
        }
        List<C4176a.e.c> listZ = types.z();
        C3862t.f(listZ, "getRecordList(...)");
        super(strings, setB1, h.a(listZ));
        this.f47737h = types;
    }
}
