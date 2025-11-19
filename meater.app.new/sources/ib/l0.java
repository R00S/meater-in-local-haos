package ib;

import Hb.K0;
import ab.C1928I;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C3862t;

/* compiled from: typeEnhancementUtils.kt */
/* loaded from: classes3.dex */
public final class l0 {
    public static final C3674h a(C3674h c3674h, Collection<C3674h> superQualifiers, boolean z10, boolean z11, boolean z12) {
        EnumC3677k enumC3677kD;
        boolean z13;
        C3862t.g(c3674h, "<this>");
        C3862t.g(superQualifiers, "superQualifiers");
        Collection<C3674h> collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            EnumC3677k enumC3677kB = b((C3674h) it.next());
            if (enumC3677kB != null) {
                arrayList.add(enumC3677kB);
            }
        }
        EnumC3677k enumC3677kD2 = d(kotlin.collections.r.b1(arrayList), b(c3674h), z10);
        if (enumC3677kD2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                EnumC3677k enumC3677kF = ((C3674h) it2.next()).f();
                if (enumC3677kF != null) {
                    arrayList2.add(enumC3677kF);
                }
            }
            enumC3677kD = d(kotlin.collections.r.b1(arrayList2), c3674h.f(), z10);
        } else {
            enumC3677kD = enumC3677kD2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection.iterator();
        while (it3.hasNext()) {
            EnumC3675i enumC3675iE = ((C3674h) it3.next()).e();
            if (enumC3675iE != null) {
                arrayList3.add(enumC3675iE);
            }
        }
        EnumC3675i enumC3675i = (EnumC3675i) e(kotlin.collections.r.b1(arrayList3), EnumC3675i.f43272C, EnumC3675i.f43271B, c3674h.e(), z10);
        EnumC3677k enumC3677k = null;
        if (enumC3677kD != null && !z12 && (!z11 || enumC3677kD != EnumC3677k.f43278C)) {
            enumC3677k = enumC3677kD;
        }
        boolean z14 = false;
        if (enumC3677k == EnumC3677k.f43279D) {
            if (!c3674h.d()) {
                if (!collection.isEmpty()) {
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        if (((C3674h) it4.next()).d()) {
                        }
                    }
                }
                z13 = false;
            }
            z13 = true;
            break;
        }
        z13 = false;
        if (enumC3677k != null && enumC3677kD2 != enumC3677kD) {
            z14 = true;
        }
        return new C3674h(enumC3677k, enumC3675i, z13, z14);
    }

    private static final EnumC3677k b(C3674h c3674h) {
        if (c3674h.g()) {
            return null;
        }
        return c3674h.f();
    }

    public static final boolean c(K0 k02, Lb.i type) {
        C3862t.g(k02, "<this>");
        C3862t.g(type, "type");
        qb.c ENHANCED_NULLABILITY_ANNOTATION = C1928I.f20160v;
        C3862t.f(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return k02.T(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    private static final EnumC3677k d(Set<? extends EnumC3677k> set, EnumC3677k enumC3677k, boolean z10) {
        EnumC3677k enumC3677k2 = EnumC3677k.f43277B;
        return enumC3677k == enumC3677k2 ? enumC3677k2 : (EnumC3677k) e(set, EnumC3677k.f43279D, EnumC3677k.f43278C, enumC3677k, z10);
    }

    private static final <T> T e(Set<? extends T> set, T t10, T t11, T t12, boolean z10) {
        Set<? extends T> setB1;
        if (!z10) {
            if (t12 != null && (setB1 = kotlin.collections.r.b1(kotlin.collections.V.k(set, t12))) != null) {
                set = setB1;
            }
            return (T) kotlin.collections.r.K0(set);
        }
        T t13 = set.contains(t10) ? t10 : set.contains(t11) ? t11 : null;
        if (C3862t.b(t13, t10) && C3862t.b(t12, t11)) {
            return null;
        }
        return t12 == null ? t13 : t12;
    }
}
