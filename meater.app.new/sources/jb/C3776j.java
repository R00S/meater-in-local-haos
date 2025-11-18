package jb;

import Hb.E0;
import Hb.M0;
import Hb.Q0;
import Hb.T;
import Hb.U;
import Hb.y0;
import Ra.EnumC1693f;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1699l;
import Ra.InterfaceC1700m;
import Ra.N;
import Ra.a0;
import Ra.l0;
import Ra.m0;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import tb.C4599k;

/* compiled from: descriptorBasedTypeSignatureMapping.kt */
/* renamed from: jb.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3776j {
    public static final String a(InterfaceC1692e klass, InterfaceC3763G<?> typeMappingConfiguration) {
        C3862t.g(klass, "klass");
        C3862t.g(typeMappingConfiguration, "typeMappingConfiguration");
        String strF = typeMappingConfiguration.f(klass);
        if (strF != null) {
            return strF;
        }
        InterfaceC1700m interfaceC1700mC = klass.c();
        C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
        String strP = qb.h.b(klass.getName()).p();
        C3862t.f(strP, "getIdentifier(...)");
        if (interfaceC1700mC instanceof N) {
            qb.c cVarF = ((N) interfaceC1700mC).f();
            if (cVarF.d()) {
                return strP;
            }
            StringBuilder sb2 = new StringBuilder();
            String strB = cVarF.b();
            C3862t.f(strB, "asString(...)");
            sb2.append(Ub.n.B(strB, '.', '/', false, 4, null));
            sb2.append('/');
            sb2.append(strP);
            return sb2.toString();
        }
        InterfaceC1692e interfaceC1692e = interfaceC1700mC instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1700mC : null;
        if (interfaceC1692e == null) {
            throw new IllegalArgumentException("Unexpected container: " + interfaceC1700mC + " for " + klass);
        }
        String strB2 = typeMappingConfiguration.b(interfaceC1692e);
        if (strB2 == null) {
            strB2 = a(interfaceC1692e, typeMappingConfiguration);
        }
        return strB2 + '$' + strP;
    }

    public static /* synthetic */ String b(InterfaceC1692e interfaceC1692e, InterfaceC3763G interfaceC3763G, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC3763G = C3764H.f43574a;
        }
        return a(interfaceC1692e, interfaceC3763G);
    }

    public static final boolean c(InterfaceC1688a descriptor) {
        C3862t.g(descriptor, "descriptor");
        if (descriptor instanceof InterfaceC1699l) {
            return true;
        }
        U returnType = descriptor.getReturnType();
        C3862t.d(returnType);
        if (Oa.j.C0(returnType)) {
            U returnType2 = descriptor.getReturnType();
            C3862t.d(returnType2);
            if (!M0.l(returnType2) && !(descriptor instanceof a0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v9, types: [T, java.lang.Object] */
    public static final <T> T d(U kotlinType, t<T> factory, C3765I mode, InterfaceC3763G<? extends T> typeMappingConfiguration, q<T> qVar, Ba.q<? super U, ? super T, ? super C3765I, C4153F> writeGenericType) {
        T t10;
        U u10;
        Object objD;
        C3862t.g(kotlinType, "kotlinType");
        C3862t.g(factory, "factory");
        C3862t.g(mode, "mode");
        C3862t.g(typeMappingConfiguration, "typeMappingConfiguration");
        C3862t.g(writeGenericType, "writeGenericType");
        U uE = typeMappingConfiguration.e(kotlinType);
        if (uE != null) {
            return (T) d(uE, factory, mode, typeMappingConfiguration, qVar, writeGenericType);
        }
        if (Oa.i.r(kotlinType)) {
            return (T) d(Oa.q.a(kotlinType), factory, mode, typeMappingConfiguration, qVar, writeGenericType);
        }
        Ib.u uVar = Ib.u.f7008a;
        Object objB = C3766J.b(uVar, kotlinType, factory, mode);
        if (objB != null) {
            ?? r92 = (Object) C3766J.a(factory, objB, mode.d());
            writeGenericType.g(kotlinType, r92, mode);
            return r92;
        }
        y0 y0VarO0 = kotlinType.O0();
        if (y0VarO0 instanceof T) {
            T t11 = (T) y0VarO0;
            U uI = t11.i();
            if (uI == null) {
                uI = typeMappingConfiguration.d(t11.s());
            }
            return (T) d(Mb.d.D(uI), factory, mode, typeMappingConfiguration, qVar, writeGenericType);
        }
        InterfaceC1695h interfaceC1695hT = y0VarO0.t();
        if (interfaceC1695hT == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (Jb.l.m(interfaceC1695hT)) {
            T t12 = (T) factory.c("error/NonExistentClass");
            typeMappingConfiguration.a(kotlinType, (InterfaceC1692e) interfaceC1695hT);
            return t12;
        }
        boolean z10 = interfaceC1695hT instanceof InterfaceC1692e;
        if (z10 && Oa.j.c0(kotlinType)) {
            if (kotlinType.M0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            E0 e02 = kotlinType.M0().get(0);
            U uA = e02.a();
            C3862t.f(uA, "getType(...)");
            if (e02.b() == Q0.f5694G) {
                objD = factory.c("java/lang/Object");
            } else {
                Q0 q0B = e02.b();
                C3862t.f(q0B, "getProjectionKind(...)");
                objD = d(uA, factory, mode.f(q0B, true), typeMappingConfiguration, qVar, writeGenericType);
            }
            return (T) factory.b('[' + factory.a(objD));
        }
        if (!z10) {
            if (interfaceC1695hT instanceof m0) {
                U uO = Mb.d.o((m0) interfaceC1695hT);
                if (kotlinType.P0()) {
                    uO = Mb.d.B(uO);
                }
                return (T) d(uO, factory, mode, typeMappingConfiguration, null, Rb.j.l());
            }
            if ((interfaceC1695hT instanceof l0) && mode.b()) {
                return (T) d(((l0) interfaceC1695hT).U(), factory, mode, typeMappingConfiguration, qVar, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + kotlinType);
        }
        if (C4599k.b(interfaceC1695hT) && !mode.c() && (u10 = (U) Hb.J.a(uVar, kotlinType)) != null) {
            return (T) d(u10, factory, mode.g(), typeMappingConfiguration, qVar, writeGenericType);
        }
        if (mode.e() && Oa.j.l0((InterfaceC1692e) interfaceC1695hT)) {
            t10 = (Object) factory.f();
        } else {
            InterfaceC1692e interfaceC1692e = (InterfaceC1692e) interfaceC1695hT;
            InterfaceC1692e interfaceC1692eB = interfaceC1692e.L0();
            C3862t.f(interfaceC1692eB, "getOriginal(...)");
            T tC = typeMappingConfiguration.c(interfaceC1692eB);
            if (tC == null) {
                if (interfaceC1692e.i() == EnumC1693f.f15146F) {
                    InterfaceC1700m interfaceC1700mC = interfaceC1692e.c();
                    C3862t.e(interfaceC1700mC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC1692e = (InterfaceC1692e) interfaceC1700mC;
                }
                InterfaceC1692e interfaceC1692eB2 = interfaceC1692e.L0();
                C3862t.f(interfaceC1692eB2, "getOriginal(...)");
                t10 = (Object) factory.c(a(interfaceC1692eB2, typeMappingConfiguration));
            } else {
                t10 = (Object) tC;
            }
        }
        writeGenericType.g(kotlinType, t10, mode);
        return t10;
    }

    public static /* synthetic */ Object e(U u10, t tVar, C3765I c3765i, InterfaceC3763G interfaceC3763G, q qVar, Ba.q qVar2, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            qVar2 = Rb.j.l();
        }
        return d(u10, tVar, c3765i, interfaceC3763G, qVar, qVar2);
    }
}
