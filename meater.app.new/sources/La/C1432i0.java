package La;

import La.AbstractC1441n;
import La.InterfaceC1437l;
import La.a1;
import Ma.a;
import Ma.i;
import Ma.n;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1699l;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.AbstractC3849f;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.InterfaceC3858o;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import tb.C4599k;
import xb.C5087e;
import yb.C5146b;

/* compiled from: KFunctionImpl.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B7\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0011B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ5\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030 0\"2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001f\u0010>\u001a\u0006\u0012\u0002\b\u0003098VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R!\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u0001098VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010\t\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010,R\u0014\u0010I\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010*R\u0014\u0010J\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010ER\u0014\u0010K\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010ER\u0014\u0010L\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010ER\u0014\u0010M\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010ER\u0014\u0010N\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010E¨\u0006O"}, d2 = {"LLa/i0;", "LLa/A;", "", "LIa/h;", "Lkotlin/jvm/internal/o;", "LLa/l;", "LLa/d0;", "container", "", "name", "signature", "LRa/z;", "descriptorInitialValue", "rawBoundReceiver", "<init>", "(LLa/d0;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "descriptor", "(LLa/d0;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "boundReceiver", "(LLa/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "l0", "(LRa/z;)LRa/z;", "Ljava/lang/reflect/Method;", "member", "", "m0", "(Ljava/lang/reflect/Method;)Z", "LMa/i$h;", "g0", "(Ljava/lang/reflect/Method;)LMa/i$h;", "f0", "e0", "Ljava/lang/reflect/Constructor;", "isDefault", "LMa/i;", "d0", "(Ljava/lang/reflect/Constructor;LRa/z;Z)LMa/i;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "H", "LLa/d0;", "S", "()LLa/d0;", "I", "Ljava/lang/String;", "J", "Ljava/lang/Object;", "K", "LLa/a1$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "LMa/h;", "L", "Loa/i;", "R", "()LMa/h;", "caller", "M", "T", "defaultCaller", "j0", "()Ljava/lang/Object;", "X", "()Z", "isBound", "getName", "getArity", "arity", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: La.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1432i0 extends A<Object> implements InterfaceC3858o<Object>, Ia.h<Object>, InterfaceC1437l {

    /* renamed from: N, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f11220N = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(C1432i0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final AbstractC1422d0 container;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final String signature;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final Object rawBoundReceiver;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final a1.a descriptor;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i caller;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i defaultCaller;

    /* synthetic */ C1432i0(AbstractC1422d0 abstractC1422d0, String str, String str2, InterfaceC1712z interfaceC1712z, Object obj, int i10, C3854k c3854k) {
        this(abstractC1422d0, str, str2, interfaceC1712z, (i10 & 16) != 0 ? AbstractC3849f.NO_RECEIVER : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ma.h c0(C1432i0 c1432i0) {
        Object objD;
        Ma.i<Constructor<?>> iVarE0;
        AbstractC1441n abstractC1441nG = f1.f11207a.g(c1432i0.Z());
        if (abstractC1441nG instanceof AbstractC1441n.d) {
            if (c1432i0.W()) {
                Class<?> clsF = c1432i0.getContainer().f();
                List<Ia.l> parameters = c1432i0.getParameters();
                ArrayList arrayList = new ArrayList(kotlin.collections.r.x(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((Ia.l) it.next()).getName();
                    C3862t.d(name);
                    arrayList.add(name);
                }
                return new Ma.a(clsF, arrayList, a.EnumC0189a.f12140C, a.b.f12144C, null, 16, null);
            }
            objD = c1432i0.getContainer().x(((AbstractC1441n.d) abstractC1441nG).b());
        } else if (abstractC1441nG instanceof AbstractC1441n.e) {
            InterfaceC1712z interfaceC1712zZ = c1432i0.Z();
            InterfaceC1700m interfaceC1700mC = interfaceC1712zZ.c();
            C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
            if (C4599k.d(interfaceC1700mC) && (interfaceC1712zZ instanceof InterfaceC1699l) && ((InterfaceC1699l) interfaceC1712zZ).A()) {
                InterfaceC1712z interfaceC1712zZ2 = c1432i0.Z();
                AbstractC1422d0 container = c1432i0.getContainer();
                String strB = ((AbstractC1441n.e) abstractC1441nG).b();
                List<Ra.t0> listK = c1432i0.Z().k();
                C3862t.f(listK, "getValueParameters(...)");
                return new n.b(interfaceC1712zZ2, container, strB, listK);
            }
            AbstractC1441n.e eVar = (AbstractC1441n.e) abstractC1441nG;
            objD = c1432i0.getContainer().C(eVar.c(), eVar.b());
        } else if (abstractC1441nG instanceof AbstractC1441n.c) {
            objD = ((AbstractC1441n.c) abstractC1441nG).getMethod();
            C3862t.e(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else {
            if (!(abstractC1441nG instanceof AbstractC1441n.b)) {
                if (!(abstractC1441nG instanceof AbstractC1441n.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<Method> listD = ((AbstractC1441n.a) abstractC1441nG).d();
                Class<?> clsF2 = c1432i0.getContainer().f();
                List<Method> list = listD;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new Ma.a(clsF2, arrayList2, a.EnumC0189a.f12140C, a.b.f12143B, listD);
            }
            objD = ((AbstractC1441n.b) abstractC1441nG).d();
            C3862t.e(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        }
        if (objD instanceof Constructor) {
            iVarE0 = c1432i0.d0((Constructor) objD, c1432i0.Z(), false);
        } else {
            if (!(objD instanceof Method)) {
                throw new Y0("Could not compute caller for function: " + c1432i0.Z() + " (member = " + objD + ')');
            }
            Method method = (Method) objD;
            iVarE0 = !Modifier.isStatic(method.getModifiers()) ? c1432i0.e0(method) : c1432i0.Z().getAnnotations().o(j1.j()) != null ? c1432i0.f0(method) : c1432i0.g0(method);
        }
        return Ma.o.j(iVarE0, c1432i0.Z(), false, 2, null);
    }

    private final Ma.i<Constructor<?>> d0(Constructor<?> member, InterfaceC1712z descriptor, boolean isDefault) {
        return (isDefault || !C5146b.f(descriptor)) ? X() ? new i.c(member, j0()) : new i.e(member) : X() ? new i.a(member, j0()) : new i.b(member);
    }

    private final i.h e0(Method member) {
        return X() ? new i.h.a(member, j0()) : new i.h.e(member);
    }

    private final i.h f0(Method member) {
        return X() ? new i.h.b(member) : new i.h.f(member);
    }

    private final i.h g0(Method member) {
        if (X()) {
            return new i.h.c(member, m0(member) ? this.rawBoundReceiver : j0());
        }
        return new i.h.g(member);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Ma.h h0(La.C1432i0 r11) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: La.C1432i0.h0(La.i0):Ma.h");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1712z i0(C1432i0 c1432i0, String str) {
        return c1432i0.getContainer().A(str, c1432i0.signature);
    }

    private final Object j0() {
        return Ma.o.h(this.rawBoundReceiver, Z());
    }

    private final InterfaceC1712z l0(InterfaceC1712z descriptor) {
        InterfaceC1689b next;
        List<Ra.t0> listK = descriptor.k();
        C3862t.f(listK, "getValueParameters(...)");
        List<Ra.t0> list = listK;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Ra.t0) it.next()).r0()) {
                    return null;
                }
            }
        }
        InterfaceC1700m interfaceC1700mC = descriptor.c();
        C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
        if (!C4599k.g(interfaceC1700mC)) {
            return null;
        }
        Member memberB = R().b();
        C3862t.d(memberB);
        if (!Modifier.isStatic(memberB.getModifiers())) {
            return null;
        }
        Iterator<InterfaceC1689b> it2 = C5087e.z(descriptor, false).iterator();
        loop0: while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            List<Ra.t0> listK2 = next.k();
            C3862t.f(listK2, "getValueParameters(...)");
            List<Ra.t0> list2 = listK2;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (((Ra.t0) it3.next()).r0()) {
                        break loop0;
                    }
                }
            }
        }
        if (next instanceof InterfaceC1712z) {
            return (InterfaceC1712z) next;
        }
        return null;
    }

    private final boolean m0(Method member) {
        Hb.U uA;
        Ra.c0 c0VarD0 = Z().d0();
        if (c0VarD0 != null && (uA = c0VarD0.a()) != null && C4599k.c(uA)) {
            Class<?>[] parameterTypes = member.getParameterTypes();
            C3862t.f(parameterTypes, "getParameterTypes(...)");
            Class cls = (Class) C3831l.Y(parameterTypes);
            if (cls != null && cls.isInterface()) {
                return true;
            }
        }
        return false;
    }

    @Override // La.A
    public Ma.h<?> R() {
        return (Ma.h) this.caller.getValue();
    }

    @Override // La.A
    /* renamed from: S, reason: from getter */
    public AbstractC1422d0 getContainer() {
        return this.container;
    }

    @Override // La.A
    public Ma.h<?> T() {
        return (Ma.h) this.defaultCaller.getValue();
    }

    @Override // La.A
    public boolean X() {
        return this.rawBoundReceiver != AbstractC3849f.NO_RECEIVER;
    }

    public boolean equals(Object other) {
        C1432i0 c1432i0C = j1.c(other);
        return c1432i0C != null && C3862t.b(getContainer(), c1432i0C.getContainer()) && C3862t.b(getName(), c1432i0C.getName()) && C3862t.b(this.signature, c1432i0C.signature) && C3862t.b(this.rawBoundReceiver, c1432i0C.rawBoundReceiver);
    }

    @Override // Ba.q
    public Object g(Object obj, Object obj2, Object obj3) {
        return InterfaceC1437l.a.d(this, obj, obj2, obj3);
    }

    @Override // kotlin.jvm.internal.InterfaceC3858o
    public int getArity() {
        return Ma.j.a(R());
    }

    @Override // Ia.c
    public String getName() {
        String strJ = Z().getName().j();
        C3862t.f(strJ, "asString(...)");
        return strJ;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    @Override // Ba.a
    public Object invoke() {
        return InterfaceC1437l.a.a(this);
    }

    @Override // Ia.h
    public boolean isExternal() {
        return Z().isExternal();
    }

    @Override // Ia.h
    public boolean isInfix() {
        return Z().isInfix();
    }

    @Override // Ia.h
    public boolean isInline() {
        return Z().isInline();
    }

    @Override // Ia.h
    public boolean isOperator() {
        return Z().isOperator();
    }

    @Override // Ia.c
    public boolean isSuspend() {
        return Z().isSuspend();
    }

    @Override // Ba.r
    public Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        return InterfaceC1437l.a.e(this, obj, obj2, obj3, obj4);
    }

    @Override // La.A
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1712z Z() {
        T tB = this.descriptor.b(this, f11220N[0]);
        C3862t.f(tB, "getValue(...)");
        return (InterfaceC1712z) tB;
    }

    public String toString() {
        return e1.f11201a.f(Z());
    }

    @Override // Ba.l
    public Object invoke(Object obj) {
        return InterfaceC1437l.a.b(this, obj);
    }

    private C1432i0(AbstractC1422d0 abstractC1422d0, String str, String str2, InterfaceC1712z interfaceC1712z, Object obj) {
        this.container = abstractC1422d0;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor = a1.c(interfaceC1712z, new C1426f0(this, str));
        EnumC4168m enumC4168m = EnumC4168m.f46627C;
        this.caller = C4165j.b(enumC4168m, new C1428g0(this));
        this.defaultCaller = C4165j.b(enumC4168m, new C1430h0(this));
    }

    @Override // Ba.p
    public Object invoke(Object obj, Object obj2) {
        return InterfaceC1437l.a.c(this, obj, obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1432i0(AbstractC1422d0 container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        C3862t.g(container, "container");
        C3862t.g(name, "name");
        C3862t.g(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1432i0(AbstractC1422d0 container, InterfaceC1712z descriptor) {
        C3862t.g(container, "container");
        C3862t.g(descriptor, "descriptor");
        String strJ = descriptor.getName().j();
        C3862t.f(strJ, "asString(...)");
        this(container, strJ, f1.f11207a.g(descriptor).get_signature(), descriptor, null, 16, null);
    }
}
