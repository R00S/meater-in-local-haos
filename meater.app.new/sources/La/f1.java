package La;

import Fb.InterfaceC1021b;
import Fb.InterfaceC1038t;
import La.AbstractC1441n;
import La.AbstractC1445p;
import Oa.p;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1699l;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Xa.C1822f;
import ab.C1927H;
import ab.C1938T;
import gb.InterfaceC3458a;
import hb.InterfaceC3519l;
import java.lang.reflect.Method;
import jb.C3759C;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import lb.C3924d;
import lb.C3929i;
import lb.C3934n;
import ob.C4176a;
import pb.d;
import qb.b;
import tb.C4596h;
import tb.C4597i;
import tb.C4599k;
import xb.C5087e;
import yb.EnumC5149e;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001e\u0010#\u001a\u0004\u0018\u00010 *\u0006\u0012\u0002\b\u00030\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LLa/f1;", "", "<init>", "()V", "LRa/z;", "descriptor", "", "b", "(LRa/z;)Z", "LLa/n$e;", "d", "(LRa/z;)LLa/n$e;", "LRa/b;", "", "e", "(LRa/b;)Ljava/lang/String;", "possiblySubstitutedFunction", "LLa/n;", "g", "(LRa/z;)LLa/n;", "LRa/Z;", "possiblyOverriddenProperty", "LLa/p;", "f", "(LRa/Z;)LLa/p;", "Ljava/lang/Class;", "klass", "Lqb/b;", "c", "(Ljava/lang/Class;)Lqb/b;", "Lqb/b;", "JAVA_LANG_VOID", "LOa/m;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f11207a = new f1();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final qb.b JAVA_LANG_VOID = qb.b.f48178d.c(new qb.c("java.lang.Void"));

    private f1() {
    }

    private final Oa.m a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return EnumC5149e.n(cls.getSimpleName()).t();
        }
        return null;
    }

    private final boolean b(InterfaceC1712z descriptor) {
        if (C4596h.p(descriptor) || C4596h.q(descriptor)) {
            return true;
        }
        return C3862t.b(descriptor.getName(), Qa.a.f14572e.a()) && descriptor.k().isEmpty();
    }

    private final AbstractC1441n.e d(InterfaceC1712z descriptor) {
        return new AbstractC1441n.e(new d.b(e(descriptor), C3759C.c(descriptor, false, false, 1, null)));
    }

    private final String e(InterfaceC1689b descriptor) {
        String strE = C1938T.e(descriptor);
        if (strE != null) {
            return strE;
        }
        if (descriptor instanceof Ra.a0) {
            String strJ = C5087e.w(descriptor).getName().j();
            C3862t.f(strJ, "asString(...)");
            return C1927H.b(strJ);
        }
        if (descriptor instanceof Ra.b0) {
            String strJ2 = C5087e.w(descriptor).getName().j();
            C3862t.f(strJ2, "asString(...)");
            return C1927H.e(strJ2);
        }
        String strJ3 = descriptor.getName().j();
        C3862t.f(strJ3, "asString(...)");
        return strJ3;
    }

    public final qb.b c(Class<?> klass) {
        qb.b bVarM;
        C3862t.g(klass, "klass");
        if (!klass.isArray()) {
            if (C3862t.b(klass, Void.TYPE)) {
                return JAVA_LANG_VOID;
            }
            Oa.m mVarA = a(klass);
            if (mVarA != null) {
                return new qb.b(Oa.p.f13366A, mVarA.v());
            }
            qb.b bVarE = C1822f.e(klass);
            return (bVarE.i() || (bVarM = Qa.c.f14576a.m(bVarE.a())) == null) ? bVarE : bVarM;
        }
        Class<?> componentType = klass.getComponentType();
        C3862t.f(componentType, "getComponentType(...)");
        Oa.m mVarA2 = a(componentType);
        if (mVarA2 != null) {
            return new qb.b(Oa.p.f13366A, mVarA2.t());
        }
        b.a aVar = qb.b.f48178d;
        qb.c cVarL = p.a.f13457i.l();
        C3862t.f(cVarL, "toSafe(...)");
        return aVar.c(cVarL);
    }

    public final AbstractC1445p f(Ra.Z possiblyOverriddenProperty) {
        C3862t.g(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        Ra.Z zB = ((Ra.Z) C4597i.L(possiblyOverriddenProperty)).L0();
        C3862t.f(zB, "getOriginal(...)");
        if (zB instanceof Fb.N) {
            Fb.N n10 = (Fb.N) zB;
            C3934n c3934nG1 = n10.D();
            h.f<C3934n, C4176a.d> propertySignature = C4176a.f46659d;
            C3862t.f(propertySignature, "propertySignature");
            C4176a.d dVar = (C4176a.d) nb.e.a(c3934nG1, propertySignature);
            if (dVar != null) {
                return new AbstractC1445p.c(zB, c3934nG1, dVar, n10.Y(), n10.R());
            }
        } else if (zB instanceof cb.f) {
            cb.f fVar = (cb.f) zB;
            Ra.h0 h0VarJ = fVar.j();
            InterfaceC3458a interfaceC3458a = h0VarJ instanceof InterfaceC3458a ? (InterfaceC3458a) h0VarJ : null;
            InterfaceC3519l interfaceC3519lB = interfaceC3458a != null ? interfaceC3458a.b() : null;
            if (interfaceC3519lB instanceof Xa.w) {
                return new AbstractC1445p.a(((Xa.w) interfaceC3519lB).R());
            }
            if (interfaceC3519lB instanceof Xa.z) {
                Method methodR = ((Xa.z) interfaceC3519lB).R();
                Ra.b0 b0VarH = fVar.h();
                Ra.h0 h0VarJ2 = b0VarH != null ? b0VarH.j() : null;
                InterfaceC3458a interfaceC3458a2 = h0VarJ2 instanceof InterfaceC3458a ? (InterfaceC3458a) h0VarJ2 : null;
                InterfaceC3519l interfaceC3519lB2 = interfaceC3458a2 != null ? interfaceC3458a2.b() : null;
                Xa.z zVar = interfaceC3519lB2 instanceof Xa.z ? (Xa.z) interfaceC3519lB2 : null;
                return new AbstractC1445p.b(methodR, zVar != null ? zVar.R() : null);
            }
            throw new Y0("Incorrect resolution sequence for Java field " + zB + " (source = " + interfaceC3519lB + ')');
        }
        Ra.a0 a0VarE = zB.e();
        C3862t.d(a0VarE);
        AbstractC1441n.e eVarD = d(a0VarE);
        Ra.b0 b0VarH2 = zB.h();
        return new AbstractC1445p.d(eVarD, b0VarH2 != null ? d(b0VarH2) : null);
    }

    public final AbstractC1441n g(InterfaceC1712z possiblySubstitutedFunction) {
        Method methodR;
        d.b bVarB;
        d.b bVarE;
        C3862t.g(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        InterfaceC1712z interfaceC1712zB = ((InterfaceC1712z) C4597i.L(possiblySubstitutedFunction)).L0();
        C3862t.f(interfaceC1712zB, "getOriginal(...)");
        if (!(interfaceC1712zB instanceof InterfaceC1021b)) {
            if (interfaceC1712zB instanceof cb.e) {
                Ra.h0 h0VarJ = ((cb.e) interfaceC1712zB).j();
                InterfaceC3458a interfaceC3458a = h0VarJ instanceof InterfaceC3458a ? (InterfaceC3458a) h0VarJ : null;
                InterfaceC3519l interfaceC3519lB = interfaceC3458a != null ? interfaceC3458a.b() : null;
                Xa.z zVar = interfaceC3519lB instanceof Xa.z ? (Xa.z) interfaceC3519lB : null;
                if (zVar != null && (methodR = zVar.R()) != null) {
                    return new AbstractC1441n.c(methodR);
                }
                throw new Y0("Incorrect resolution sequence for Java method " + interfaceC1712zB);
            }
            if (!(interfaceC1712zB instanceof cb.b)) {
                if (b(interfaceC1712zB)) {
                    return d(interfaceC1712zB);
                }
                throw new Y0("Unknown origin of " + interfaceC1712zB + " (" + interfaceC1712zB.getClass() + ')');
            }
            Ra.h0 h0VarJ2 = ((cb.b) interfaceC1712zB).j();
            InterfaceC3458a interfaceC3458a2 = h0VarJ2 instanceof InterfaceC3458a ? (InterfaceC3458a) h0VarJ2 : null;
            InterfaceC3519l interfaceC3519lB2 = interfaceC3458a2 != null ? interfaceC3458a2.b() : null;
            if (interfaceC3519lB2 instanceof Xa.t) {
                return new AbstractC1441n.b(((Xa.t) interfaceC3519lB2).R());
            }
            if (interfaceC3519lB2 instanceof Xa.q) {
                Xa.q qVar = (Xa.q) interfaceC3519lB2;
                if (qVar.q()) {
                    return new AbstractC1441n.a(qVar.x());
                }
            }
            throw new Y0("Incorrect resolution sequence for Java constructor " + interfaceC1712zB + " (" + interfaceC3519lB2 + ')');
        }
        InterfaceC1038t interfaceC1038t = (InterfaceC1038t) interfaceC1712zB;
        kotlin.reflect.jvm.internal.impl.protobuf.o oVarD = interfaceC1038t.D();
        if ((oVarD instanceof C3929i) && (bVarE = pb.i.f47746a.e((C3929i) oVarD, interfaceC1038t.Y(), interfaceC1038t.R())) != null) {
            return new AbstractC1441n.e(bVarE);
        }
        if (!(oVarD instanceof C3924d) || (bVarB = pb.i.f47746a.b((C3924d) oVarD, interfaceC1038t.Y(), interfaceC1038t.R())) == null) {
            return d(interfaceC1712zB);
        }
        InterfaceC1700m interfaceC1700mC = possiblySubstitutedFunction.c();
        C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
        if (C4599k.b(interfaceC1700mC)) {
            return new AbstractC1441n.e(bVarB);
        }
        InterfaceC1700m interfaceC1700mC2 = possiblySubstitutedFunction.c();
        C3862t.f(interfaceC1700mC2, "getContainingDeclaration(...)");
        if (!C4599k.d(interfaceC1700mC2)) {
            return new AbstractC1441n.d(bVarB);
        }
        InterfaceC1699l interfaceC1699l = (InterfaceC1699l) possiblySubstitutedFunction;
        if (interfaceC1699l.A()) {
            if (!C3862t.b(bVarB.e(), "constructor-impl") || !Ub.n.s(bVarB.d(), ")V", false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        } else {
            if (!C3862t.b(bVarB.e(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
            InterfaceC1692e interfaceC1692eB = interfaceC1699l.B();
            C3862t.f(interfaceC1692eB, "getConstructedClass(...)");
            String strU = Ma.o.u(interfaceC1692eB);
            if (Ub.n.s(bVarB.d(), ")V", false, 2, null)) {
                bVarB = d.b.c(bVarB, null, Ub.n.r0(bVarB.d(), "V") + strU, 1, null);
            } else if (!Ub.n.s(bVarB.d(), strU, false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        }
        return new AbstractC1441n.e(bVarB);
    }
}
