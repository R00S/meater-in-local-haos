package Hb;

import Ra.InterfaceC1695h;
import Ra.InterfaceC1696i;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: StarProjectionImpl.kt */
/* renamed from: Hb.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1098n0 {

    /* compiled from: StarProjectionImpl.kt */
    /* renamed from: Hb.n0$a */
    public static final class a extends z0 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<y0> f5765d;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends y0> list) {
            this.f5765d = list;
        }

        @Override // Hb.z0
        public E0 k(y0 key) {
            C3862t.g(key, "key");
            if (!this.f5765d.contains(key)) {
                return null;
            }
            InterfaceC1695h interfaceC1695hT = key.t();
            C3862t.e(interfaceC1695hT, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return M0.s((Ra.m0) interfaceC1695hT);
        }
    }

    private static final U a(List<? extends y0> list, List<? extends U> list2, Oa.j jVar) {
        U uP = J0.g(new a(list)).p((U) kotlin.collections.r.j0(list2), Q0.f5695H);
        if (uP != null) {
            return uP;
        }
        AbstractC1082f0 abstractC1082f0Y = jVar.y();
        C3862t.f(abstractC1082f0Y, "getDefaultBound(...)");
        return abstractC1082f0Y;
    }

    public static final U b(Ra.m0 m0Var) {
        C3862t.g(m0Var, "<this>");
        InterfaceC1700m interfaceC1700mC = m0Var.c();
        C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
        if (interfaceC1700mC instanceof InterfaceC1696i) {
            List<Ra.m0> parameters = ((InterfaceC1696i) interfaceC1700mC).l().getParameters();
            C3862t.f(parameters, "getParameters(...)");
            List<Ra.m0> list = parameters;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                y0 y0VarL = ((Ra.m0) it.next()).l();
                C3862t.f(y0VarL, "getTypeConstructor(...)");
                arrayList.add(y0VarL);
            }
            List<U> upperBounds = m0Var.getUpperBounds();
            C3862t.f(upperBounds, "getUpperBounds(...)");
            return a(arrayList, upperBounds, C5087e.m(m0Var));
        }
        if (!(interfaceC1700mC instanceof InterfaceC1712z)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<Ra.m0> typeParameters = ((InterfaceC1712z) interfaceC1700mC).getTypeParameters();
        C3862t.f(typeParameters, "getTypeParameters(...)");
        List<Ra.m0> list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            y0 y0VarL2 = ((Ra.m0) it2.next()).l();
            C3862t.f(y0VarL2, "getTypeConstructor(...)");
            arrayList2.add(y0VarL2);
        }
        List<U> upperBounds2 = m0Var.getUpperBounds();
        C3862t.f(upperBounds2, "getUpperBounds(...)");
        return a(arrayList2, upperBounds2, C5087e.m(m0Var));
    }
}
