package Ma;

import Hb.AbstractC1082f0;
import Hb.I0;
import Hb.M0;
import Hb.U;
import La.Y0;
import La.j1;
import Ra.I;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1699l;
import Ra.InterfaceC1700m;
import Ra.Z;
import Ra.c0;
import Ra.t0;
import Ra.u0;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import tb.C4599k;
import xb.C5087e;

/* compiled from: ValueClassAwareCaller.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0014\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0011*\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a=\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\n\b\u0000\u0010 *\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0011*\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010&\u001a\u00020\t*\u0006\u0012\u0002\b\u00030%2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010(\u001a\u00020\t*\u0006\u0012\u0002\b\u00030%2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010'\u001a\u0019\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010%*\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010%*\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001f\u0010/\u001a\u0004\u0018\u00010.*\u0004\u0018\u00010.2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b/\u00100\"\u001a\u00103\u001a\u0004\u0018\u00010\u001b*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"LRa/h;", "", "u", "(LRa/h;)Ljava/lang/String;", "LHb/f0;", "type", "LRa/b;", "descriptor", "", "Ljava/lang/reflect/Method;", "p", "(LHb/f0;LRa/b;)Ljava/util/List;", "n", "(LHb/f0;)Ljava/util/List;", "LMa/h;", "", "expectedArgsSize", "", "isDefault", "Loa/F;", "g", "(LMa/h;ILRa/b;Z)V", "Ljava/lang/reflect/Member;", "member", "Lkotlin/Function1;", "LRa/e;", "isSpecificClass", "LHb/U;", "r", "(LRa/b;Ljava/lang/reflect/Member;LBa/l;)Ljava/util/List;", "a", "(Ljava/lang/reflect/Member;)Z", "M", "i", "(LMa/h;LRa/b;Z)LMa/h;", "q", "(LRa/b;)Z", "Ljava/lang/Class;", "m", "(Ljava/lang/Class;LRa/b;)Ljava/lang/reflect/Method;", "k", "s", "(LHb/U;)Ljava/lang/Class;", "LRa/m;", "t", "(LRa/m;)Ljava/lang/Class;", "", "h", "(Ljava/lang/Object;LRa/b;)Ljava/lang/Object;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o {
    private static final boolean a(Member member) {
        if (member.getDeclaringClass() == null) {
            return false;
        }
        return !Aa.a.e(r0).o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(h<?> hVar, int i10, InterfaceC1689b interfaceC1689b, boolean z10) {
        if (j.a(hVar) == i10) {
            return;
        }
        throw new Y0("Inconsistent number of parameters in the descriptor and Java reflection object: " + j.a(hVar) + " != " + i10 + "\nCalling: " + interfaceC1689b + "\nParameter types: " + hVar.a() + ")\nDefault: " + z10);
    }

    public static final Object h(Object obj, InterfaceC1689b descriptor) {
        U uL;
        Class<?> clsS;
        Method methodM;
        C3862t.g(descriptor, "descriptor");
        return (((descriptor instanceof Z) && C4599k.e((u0) descriptor)) || (uL = l(descriptor)) == null || (clsS = s(uL)) == null || (methodM = m(clsS, descriptor)) == null) ? obj : methodM.invoke(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <M extends java.lang.reflect.Member> Ma.h<M> i(Ma.h<? extends M> r3, Ra.InterfaceC1689b r4, boolean r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C3862t.g(r3, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C3862t.g(r4, r0)
            boolean r0 = tb.C4599k.a(r4)
            if (r0 != 0) goto L94
            java.util.List r0 = r4.o0()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            kotlin.jvm.internal.C3862t.f(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            java.lang.String r2 = "getType(...)"
            if (r1 == 0) goto L2b
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2b
            goto L49
        L2b:
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            Ra.c0 r1 = (Ra.c0) r1
            Hb.U r1 = r1.a()
            kotlin.jvm.internal.C3862t.f(r1, r2)
            boolean r1 = tb.C4599k.h(r1)
            if (r1 == 0) goto L2f
            goto L94
        L49:
            java.util.List r0 = r4.k()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.C3862t.f(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L62
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L62
            goto L80
        L62:
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.next()
            Ra.t0 r1 = (Ra.t0) r1
            Hb.U r1 = r1.a()
            kotlin.jvm.internal.C3862t.f(r1, r2)
            boolean r1 = tb.C4599k.h(r1)
            if (r1 == 0) goto L66
            goto L94
        L80:
            Hb.U r0 = r4.getReturnType()
            if (r0 == 0) goto L8e
            boolean r0 = tb.C4599k.c(r0)
            r1 = 1
            if (r0 != r1) goto L8e
            goto L94
        L8e:
            boolean r0 = q(r4)
            if (r0 == 0) goto L9a
        L94:
            Ma.n r0 = new Ma.n
            r0.<init>(r4, r3, r5)
            r3 = r0
        L9a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Ma.o.i(Ma.h, Ra.b, boolean):Ma.h");
    }

    public static /* synthetic */ h j(h hVar, InterfaceC1689b interfaceC1689b, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return i(hVar, interfaceC1689b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method k(Class<?> cls, InterfaceC1689b interfaceC1689b) {
        try {
            return cls.getDeclaredMethod("box-impl", m(cls, interfaceC1689b).getReturnType());
        } catch (NoSuchMethodException unused) {
            throw new Y0("No box method found in inline class: " + cls + " (calling " + interfaceC1689b + ')');
        }
    }

    private static final U l(InterfaceC1689b interfaceC1689b) {
        c0 c0VarJ0 = interfaceC1689b.j0();
        c0 c0VarD0 = interfaceC1689b.d0();
        if (c0VarJ0 != null) {
            return c0VarJ0.a();
        }
        if (c0VarD0 != null) {
            if (interfaceC1689b instanceof InterfaceC1699l) {
                return c0VarD0.a();
            }
            InterfaceC1700m interfaceC1700mC = interfaceC1689b.c();
            InterfaceC1692e interfaceC1692e = interfaceC1700mC instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1700mC : null;
            if (interfaceC1692e != null) {
                return interfaceC1692e.u();
            }
        }
        return null;
    }

    public static final Method m(Class<?> cls, InterfaceC1689b descriptor) {
        C3862t.g(cls, "<this>");
        C3862t.g(descriptor, "descriptor");
        try {
            return cls.getDeclaredMethod("unbox-impl", null);
        } catch (NoSuchMethodException unused) {
            throw new Y0("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final List<Method> n(AbstractC1082f0 type) {
        C3862t.g(type, "type");
        List<String> listO = o(I0.a(type));
        if (listO == null) {
            return null;
        }
        List<String> list = listO;
        ArrayList arrayList = new ArrayList(r.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        InterfaceC1695h interfaceC1695hT = type.O0().t();
        C3862t.e(interfaceC1695hT, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> clsQ = j1.q((InterfaceC1692e) interfaceC1695hT);
        C3862t.d(clsQ);
        ArrayList arrayList2 = new ArrayList(r.x(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsQ.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    private static final List<String> o(AbstractC1082f0 abstractC1082f0) {
        Collection collectionE;
        if (!C4599k.i(abstractC1082f0)) {
            return null;
        }
        InterfaceC1695h interfaceC1695hT = abstractC1082f0.O0().t();
        C3862t.e(interfaceC1695hT, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        I<AbstractC1082f0> iT = C5087e.t((InterfaceC1692e) interfaceC1695hT);
        C3862t.d(iT);
        Iterable<C4170o> iterableC = iT.c();
        ArrayList arrayList = new ArrayList();
        for (C4170o c4170o : iterableC) {
            qb.f fVar = (qb.f) c4170o.a();
            List<String> listO = o((AbstractC1082f0) c4170o.b());
            if (listO != null) {
                List<String> list = listO;
                collectionE = new ArrayList(r.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    collectionE.add(fVar.p() + '-' + ((String) it.next()));
                }
            } else {
                collectionE = r.e(fVar.p());
            }
            r.D(arrayList, collectionE);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Method> p(AbstractC1082f0 abstractC1082f0, InterfaceC1689b interfaceC1689b) {
        Method methodM;
        List<Method> listN = n(abstractC1082f0);
        if (listN != null) {
            return listN;
        }
        Class<?> clsS = s(abstractC1082f0);
        if (clsS == null || (methodM = m(clsS, interfaceC1689b)) == null) {
            return null;
        }
        return r.e(methodM);
    }

    private static final boolean q(InterfaceC1689b interfaceC1689b) {
        U uL = l(interfaceC1689b);
        return uL != null && C4599k.h(uL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<U> r(InterfaceC1689b interfaceC1689b, Member member, Ba.l<? super InterfaceC1692e, Boolean> lVar) {
        ArrayList arrayList = new ArrayList();
        c0 c0VarJ0 = interfaceC1689b.j0();
        U uA = c0VarJ0 != null ? c0VarJ0.a() : null;
        if (uA != null) {
            arrayList.add(uA);
        } else if (interfaceC1689b instanceof InterfaceC1699l) {
            InterfaceC1692e interfaceC1692eB = ((InterfaceC1699l) interfaceC1689b).B();
            C3862t.f(interfaceC1692eB, "getConstructedClass(...)");
            if (interfaceC1692eB.L()) {
                InterfaceC1700m interfaceC1700mC = interfaceC1692eB.c();
                C3862t.e(interfaceC1700mC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((InterfaceC1692e) interfaceC1700mC).u());
            }
        } else {
            InterfaceC1700m interfaceC1700mC2 = interfaceC1689b.c();
            C3862t.f(interfaceC1700mC2, "getContainingDeclaration(...)");
            if ((interfaceC1700mC2 instanceof InterfaceC1692e) && lVar.invoke(interfaceC1700mC2).booleanValue()) {
                if (member == null || !a(member)) {
                    arrayList.add(((InterfaceC1692e) interfaceC1700mC2).u());
                } else {
                    AbstractC1082f0 abstractC1082f0U = ((InterfaceC1692e) interfaceC1700mC2).u();
                    C3862t.f(abstractC1082f0U, "getDefaultType(...)");
                    arrayList.add(Mb.d.B(abstractC1082f0U));
                }
            }
        }
        List<t0> listK = interfaceC1689b.k();
        C3862t.f(listK, "getValueParameters(...)");
        Iterator<T> it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class<?> s(U u10) {
        Class<?> clsT = t(u10.O0().t());
        if (clsT == null) {
            return null;
        }
        if (!M0.l(u10)) {
            return clsT;
        }
        U uK = C4599k.k(u10);
        if (uK == null || M0.l(uK) || Oa.j.s0(uK)) {
            return null;
        }
        return clsT;
    }

    public static final Class<?> t(InterfaceC1700m interfaceC1700m) {
        if (!(interfaceC1700m instanceof InterfaceC1692e) || !C4599k.b(interfaceC1700m)) {
            return null;
        }
        InterfaceC1692e interfaceC1692e = (InterfaceC1692e) interfaceC1700m;
        Class<?> clsQ = j1.q(interfaceC1692e);
        if (clsQ != null) {
            return clsQ;
        }
        throw new Y0("Class object for the class " + interfaceC1692e.getName() + " cannot be found (classId=" + C5087e.n((InterfaceC1695h) interfaceC1700m) + ')');
    }

    public static final String u(InterfaceC1695h interfaceC1695h) {
        C3862t.g(interfaceC1695h, "<this>");
        qb.b bVarN = C5087e.n(interfaceC1695h);
        C3862t.d(bVarN);
        return pb.b.b(bVarN.b());
    }
}
