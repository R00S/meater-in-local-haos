package tb;

import Ab.n;
import Ra.E;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.N;
import Ra.l0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C3862t;
import ra.C4370a;
import xb.C5087e;

/* compiled from: SealedClassInheritorsProvider.kt */
/* renamed from: tb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4589a extends u {

    /* renamed from: a, reason: collision with root package name */
    public static final C4589a f50004a = new C4589a();

    /* compiled from: Comparisons.kt */
    /* renamed from: tb.a$a, reason: collision with other inner class name */
    public static final class C0712a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C4370a.d(C5087e.o((InterfaceC1692e) t10).b(), C5087e.o((InterfaceC1692e) t11).b());
        }
    }

    private C4589a() {
    }

    private static final void b(InterfaceC1692e interfaceC1692e, LinkedHashSet<InterfaceC1692e> linkedHashSet, Ab.k kVar, boolean z10) {
        for (InterfaceC1700m interfaceC1700m : n.a.a(kVar, Ab.d.f1126t, null, 2, null)) {
            if (interfaceC1700m instanceof InterfaceC1692e) {
                InterfaceC1692e interfaceC1692eT = (InterfaceC1692e) interfaceC1700m;
                if (interfaceC1692eT.K()) {
                    qb.f name = interfaceC1692eT.getName();
                    C3862t.f(name, "getName(...)");
                    InterfaceC1695h interfaceC1695hG = kVar.g(name, Za.d.f19637N);
                    interfaceC1692eT = interfaceC1695hG instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hG : interfaceC1695hG instanceof l0 ? ((l0) interfaceC1695hG).t() : null;
                }
                if (interfaceC1692eT != null) {
                    if (C4597i.z(interfaceC1692eT, interfaceC1692e)) {
                        linkedHashSet.add(interfaceC1692eT);
                    }
                    if (z10) {
                        Ab.k kVarX0 = interfaceC1692eT.x0();
                        C3862t.f(kVarX0, "getUnsubstitutedInnerClassesScope(...)");
                        b(interfaceC1692e, linkedHashSet, kVarX0, z10);
                    }
                }
            }
        }
    }

    public Collection<InterfaceC1692e> a(InterfaceC1692e sealedClass, boolean z10) {
        InterfaceC1700m next;
        InterfaceC1700m interfaceC1700mC;
        C3862t.g(sealedClass, "sealedClass");
        if (sealedClass.m() != E.f15107D) {
            return kotlin.collections.r.m();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z10) {
            Iterator<InterfaceC1700m> it = C5087e.u(sealedClass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof N) {
                    break;
                }
            }
            interfaceC1700mC = next;
        } else {
            interfaceC1700mC = sealedClass.c();
        }
        if (interfaceC1700mC instanceof N) {
            b(sealedClass, linkedHashSet, ((N) interfaceC1700mC).s(), z10);
        }
        Ab.k kVarX0 = sealedClass.x0();
        C3862t.f(kVarX0, "getUnsubstitutedInnerClassesScope(...)");
        b(sealedClass, linkedHashSet, kVarX0, true);
        return kotlin.collections.r.O0(linkedHashSet, new C0712a());
    }
}
