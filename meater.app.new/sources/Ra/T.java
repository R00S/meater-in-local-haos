package Ra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: PackageFragmentProvider.kt */
/* loaded from: classes3.dex */
public final class T {
    public static final void a(O o10, qb.c fqName, Collection<N> packageFragments) {
        C3862t.g(o10, "<this>");
        C3862t.g(fqName, "fqName");
        C3862t.g(packageFragments, "packageFragments");
        if (o10 instanceof U) {
            ((U) o10).c(fqName, packageFragments);
        } else {
            packageFragments.addAll(o10.a(fqName));
        }
    }

    public static final boolean b(O o10, qb.c fqName) {
        C3862t.g(o10, "<this>");
        C3862t.g(fqName, "fqName");
        return o10 instanceof U ? ((U) o10).b(fqName) : c(o10, fqName).isEmpty();
    }

    public static final List<N> c(O o10, qb.c fqName) {
        C3862t.g(o10, "<this>");
        C3862t.g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(o10, fqName, arrayList);
        return arrayList;
    }
}
