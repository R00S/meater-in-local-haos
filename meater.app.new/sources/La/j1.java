package La;

import Db.C1008n;
import Db.C1010p;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Wa.l;
import Xa.C1822f;
import Xa.C1823g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3859p;
import kotlin.jvm.internal.C3862t;
import lb.C3929i;
import lb.C3934n;
import lb.C3939s;
import nb.AbstractC4075a;
import nb.InterfaceC4077c;
import oa.C4170o;
import tb.C4599k;
import vb.AbstractC4943g;
import vb.C4937a;
import vb.C4938b;
import vb.t;
import xb.C5087e;

/* compiled from: util.kt */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0019*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010#\u001a\u0004\u0018\u00010\"*\u0006\u0012\u0002\b\u00030!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010&\u001a\u0004\u0018\u00010\"*\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010)\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010.*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b/\u00100\u001a\u0019\u00103\u001a\u0004\u0018\u00010\"2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a'\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0080\bø\u0001\u0000¢\u0006\u0004\b8\u00109\u001ai\u0010I\u001a\u00028\u0001\"\b\b\u0000\u0010;*\u00020:\"\b\b\u0001\u0010=*\u00020<2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010?\u001a\u00028\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0018\u0010H\u001a\u0014\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010FH\u0000¢\u0006\u0004\bI\u0010J\"\u001a\u0010O\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010L\u001a\u0004\bM\u0010N\"\u0018\u0010T\u001a\u00020Q*\u00020P8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S\"\u0018\u0010V\u001a\u00020Q*\u00020P8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010S\"\u001a\u0010Z\u001a\u0004\u0018\u00010W*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006["}, d2 = {"LRa/e;", "Ljava/lang/Class;", "q", "(LRa/e;)Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "classLoader", "Lqb/b;", "kotlinClassId", "", "arrayDimensions", "n", "(Ljava/lang/ClassLoader;Lqb/b;I)Ljava/lang/Class;", "", "packageName", "className", "m", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Class;", "f", "(Ljava/lang/Class;)Ljava/lang/Class;", "LRa/u;", "LIa/u;", "r", "(LRa/u;)LIa/u;", "LSa/a;", "", "", "e", "(LSa/a;)Ljava/util/List;", "t", "(Ljava/util/List;)Ljava/util/List;", "LSa/c;", "p", "(LSa/c;)Ljava/lang/annotation/Annotation;", "Lvb/g;", "", "s", "(Lvb/g;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lvb/b;", "a", "(Lvb/b;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "LLa/i0;", "c", "(Ljava/lang/Object;)LLa/i0;", "LLa/K0;", "d", "(Ljava/lang/Object;)LLa/K0;", "LLa/A;", "b", "(Ljava/lang/Object;)LLa/A;", "Ljava/lang/reflect/Type;", "type", "g", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(LBa/a;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/protobuf/o;", "M", "LRa/a;", "D", "moduleAnchor", "proto", "Lnb/c;", "nameResolver", "Lnb/g;", "typeTable", "Lnb/a;", "metadataVersion", "Lkotlin/Function2;", "LDb/K;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;LBa/p;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "Lqb/c;", "Lqb/c;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "LIa/q;", "", "l", "(LIa/q;)Z", "isInlineClassType", "k", "needsMultiFieldValueClassFlattening", "LRa/c0;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    private static final qb.c f11229a = new qb.c("kotlin.jvm.JvmStatic");

    /* compiled from: util.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11230a;

        static {
            int[] iArr = new int[Oa.m.values().length];
            try {
                iArr[Oa.m.f13338H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Oa.m.f13339I.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Oa.m.f13340J.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Oa.m.f13341K.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Oa.m.f13342L.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Oa.m.f13343M.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Oa.m.f13344N.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Oa.m.f13345O.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f11230a = iArr;
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v12, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v14, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.Object a(vb.C4938b r6, java.lang.ClassLoader r7) throws java.lang.NegativeArraySizeException {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: La.j1.a(vb.b, java.lang.ClassLoader):java.lang.Object");
    }

    public static final A<?> b(Object obj) {
        A<?> a10 = obj instanceof A ? (A) obj : null;
        if (a10 != null) {
            return a10;
        }
        C1432i0 c1432i0C = c(obj);
        return c1432i0C != null ? c1432i0C : d(obj);
    }

    public static final C1432i0 c(Object obj) {
        C1432i0 c1432i0 = obj instanceof C1432i0 ? (C1432i0) obj : null;
        if (c1432i0 != null) {
            return c1432i0;
        }
        C3859p c3859p = obj instanceof C3859p ? (C3859p) obj : null;
        Ia.c cVarCompute = c3859p != null ? c3859p.compute() : null;
        if (cVarCompute instanceof C1432i0) {
            return (C1432i0) cVarCompute;
        }
        return null;
    }

    public static final K0<?> d(Object obj) {
        K0<?> k02 = obj instanceof K0 ? (K0) obj : null;
        if (k02 != null) {
            return k02;
        }
        kotlin.jvm.internal.J j10 = obj instanceof kotlin.jvm.internal.J ? (kotlin.jvm.internal.J) obj : null;
        Ia.c cVarCompute = j10 != null ? j10.compute() : null;
        if (cVarCompute instanceof K0) {
            return (K0) cVarCompute;
        }
        return null;
    }

    public static final List<Annotation> e(Sa.a aVar) {
        Annotation annotationP;
        C3862t.g(aVar, "<this>");
        Sa.h annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (Sa.c cVar : annotations) {
            Ra.h0 h0VarJ = cVar.j();
            if (h0VarJ instanceof Wa.b) {
                annotationP = ((Wa.b) h0VarJ).d();
            } else if (h0VarJ instanceof l.a) {
                Xa.u uVarB = ((l.a) h0VarJ).b();
                C1823g c1823g = uVarB instanceof C1823g ? (C1823g) uVarB : null;
                annotationP = c1823g != null ? c1823g.Q() : null;
            } else {
                annotationP = p(cVar);
            }
            if (annotationP != null) {
                arrayList.add(annotationP);
            }
        }
        return t(arrayList);
    }

    public static final Class<?> f(Class<?> cls) {
        C3862t.g(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    public static final Object g(Type type) {
        C3862t.g(type, "type");
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (C3862t.b(cls, Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (C3862t.b(cls, Character.TYPE)) {
                    return (char) 0;
                }
                if (C3862t.b(cls, Byte.TYPE)) {
                    return (byte) 0;
                }
                if (C3862t.b(cls, Short.TYPE)) {
                    return (short) 0;
                }
                if (C3862t.b(cls, Integer.TYPE)) {
                    return 0;
                }
                if (C3862t.b(cls, Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (C3862t.b(cls, Long.TYPE)) {
                    return 0L;
                }
                if (C3862t.b(cls, Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (C3862t.b(cls, Void.TYPE)) {
                    throw new IllegalStateException("Parameter with void type is illegal");
                }
                throw new UnsupportedOperationException("Unknown primitive: " + type);
            }
        }
        return null;
    }

    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.o, D extends InterfaceC1688a> D h(Class<?> moduleAnchor, M proto, InterfaceC4077c nameResolver, nb.g typeTable, AbstractC4075a metadataVersion, Ba.p<? super Db.K, ? super M, ? extends D> createDescriptor) {
        List<C3939s> listO0;
        C3862t.g(moduleAnchor, "moduleAnchor");
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(typeTable, "typeTable");
        C3862t.g(metadataVersion, "metadataVersion");
        C3862t.g(createDescriptor, "createDescriptor");
        Wa.k kVarA = Z0.a(moduleAnchor);
        if (proto instanceof C3929i) {
            listO0 = ((C3929i) proto).n0();
        } else {
            if (!(proto instanceof C3934n)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            listO0 = ((C3934n) proto).o0();
        }
        List<C3939s> list = listO0;
        C1008n c1008nA = kVarA.a();
        Ra.H hB = kVarA.b();
        nb.h hVarB = nb.h.f45846b.b();
        C3862t.d(list);
        return createDescriptor.invoke(new Db.K(new C1010p(c1008nA, nameResolver, hB, typeTable, hVarB, metadataVersion, null, null, list)), proto);
    }

    public static final Ra.c0 i(InterfaceC1688a interfaceC1688a) {
        C3862t.g(interfaceC1688a, "<this>");
        if (interfaceC1688a.d0() == null) {
            return null;
        }
        InterfaceC1700m interfaceC1700mC = interfaceC1688a.c();
        C3862t.e(interfaceC1700mC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC1692e) interfaceC1700mC).K0();
    }

    public static final qb.c j() {
        return f11229a;
    }

    public static final boolean k(Ia.q qVar) {
        Hb.U uY;
        C3862t.g(qVar, "<this>");
        U0 u02 = qVar instanceof U0 ? (U0) qVar : null;
        return (u02 == null || (uY = u02.getType()) == null || !C4599k.i(uY)) ? false : true;
    }

    public static final boolean l(Ia.q qVar) {
        Hb.U uY;
        C3862t.g(qVar, "<this>");
        U0 u02 = qVar instanceof U0 ? (U0) qVar : null;
        return (u02 == null || (uY = u02.getType()) == null || !C4599k.c(uY)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static final Class<?> m(ClassLoader classLoader, String str, String str2, int i10) {
        if (C3862t.b(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (str.length() > 0) {
            sb2.append(str + '.');
        }
        sb2.append(Ub.n.B(str2, '.', '$', false, 4, null));
        if (i10 > 0) {
            sb2.append(";");
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return Wa.e.a(classLoader, string);
    }

    private static final Class<?> n(ClassLoader classLoader, qb.b bVar, int i10) {
        Qa.c cVar = Qa.c.f14576a;
        qb.d dVarJ = bVar.a().j();
        C3862t.f(dVarJ, "toUnsafe(...)");
        qb.b bVarN = cVar.n(dVarJ);
        if (bVarN != null) {
            bVar = bVarN;
        }
        String strB = bVar.f().b();
        C3862t.f(strB, "asString(...)");
        String strB2 = bVar.g().b();
        C3862t.f(strB2, "asString(...)");
        return m(classLoader, strB, strB2, i10);
    }

    static /* synthetic */ Class o(ClassLoader classLoader, qb.b bVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return n(classLoader, bVar, i10);
    }

    private static final Annotation p(Sa.c cVar) {
        InterfaceC1692e interfaceC1692eL = C5087e.l(cVar);
        Class<?> clsQ = interfaceC1692eL != null ? q(interfaceC1692eL) : null;
        if (clsQ == null) {
            clsQ = null;
        }
        if (clsQ == null) {
            return null;
        }
        Set<Map.Entry<qb.f, AbstractC4943g<?>>> setEntrySet = cVar.b().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            qb.f fVar = (qb.f) entry.getKey();
            AbstractC4943g abstractC4943g = (AbstractC4943g) entry.getValue();
            ClassLoader classLoader = clsQ.getClassLoader();
            C3862t.f(classLoader, "getClassLoader(...)");
            Object objS = s(abstractC4943g, classLoader);
            C4170o c4170oA = objS != null ? oa.v.a(fVar.j(), objS) : null;
            if (c4170oA != null) {
                arrayList.add(c4170oA);
            }
        }
        return (Annotation) Ma.f.h(clsQ, kotlin.collections.M.p(arrayList), null, 4, null);
    }

    public static final Class<?> q(InterfaceC1692e interfaceC1692e) {
        C3862t.g(interfaceC1692e, "<this>");
        Ra.h0 h0VarJ = interfaceC1692e.j();
        C3862t.f(h0VarJ, "getSource(...)");
        if (h0VarJ instanceof jb.z) {
            jb.x xVarD = ((jb.z) h0VarJ).d();
            C3862t.e(xVarD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((Wa.f) xVarD).e();
        }
        if (h0VarJ instanceof l.a) {
            Xa.u uVarB = ((l.a) h0VarJ).b();
            C3862t.e(uVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((Xa.q) uVarB).x();
        }
        qb.b bVarN = C5087e.n(interfaceC1692e);
        if (bVarN == null) {
            return null;
        }
        return n(C1822f.j(interfaceC1692e.getClass()), bVarN, 0);
    }

    public static final Ia.u r(AbstractC1707u abstractC1707u) {
        C3862t.g(abstractC1707u, "<this>");
        if (C3862t.b(abstractC1707u, C1706t.f15170e)) {
            return Ia.u.f6951B;
        }
        if (C3862t.b(abstractC1707u, C1706t.f15168c)) {
            return Ia.u.f6952C;
        }
        if (C3862t.b(abstractC1707u, C1706t.f15169d)) {
            return Ia.u.f6953D;
        }
        if (C3862t.b(abstractC1707u, C1706t.f15166a) || C3862t.b(abstractC1707u, C1706t.f15167b)) {
            return Ia.u.f6954E;
        }
        return null;
    }

    private static final Object s(AbstractC4943g<?> abstractC4943g, ClassLoader classLoader) {
        if (abstractC4943g instanceof C4937a) {
            return p(((C4937a) abstractC4943g).b());
        }
        if (abstractC4943g instanceof C4938b) {
            return a((C4938b) abstractC4943g, classLoader);
        }
        if (abstractC4943g instanceof vb.k) {
            C4170o<? extends qb.b, ? extends qb.f> c4170oB = ((vb.k) abstractC4943g).b();
            qb.b bVarA = c4170oB.a();
            qb.f fVarB = c4170oB.b();
            Class clsO = o(classLoader, bVarA, 0, 4, null);
            if (clsO != null) {
                return i1.a(clsO, fVarB.j());
            }
        } else if (abstractC4943g instanceof vb.t) {
            t.b bVarB = ((vb.t) abstractC4943g).b();
            if (bVarB instanceof t.b.C0741b) {
                t.b.C0741b c0741b = (t.b.C0741b) bVarB;
                return n(classLoader, c0741b.b(), c0741b.a());
            }
            if (!(bVarB instanceof t.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC1695h interfaceC1695hT = ((t.b.a) bVarB).a().O0().t();
            InterfaceC1692e interfaceC1692e = interfaceC1695hT instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hT : null;
            if (interfaceC1692e != null) {
                return q(interfaceC1692e);
            }
        } else if (!(abstractC4943g instanceof vb.l) && !(abstractC4943g instanceof vb.v)) {
            return abstractC4943g.b();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<? extends java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List<java.lang.annotation.Annotation>] */
    private static final List<Annotation> t(List<? extends Annotation> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List listE;
        Iterable<Annotation> iterable = (Iterable) list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (C3862t.b(Aa.a.b(Aa.a.a((Annotation) it.next())).getSimpleName(), "Container")) {
                    list = new ArrayList<>();
                    for (Annotation annotation : iterable) {
                        Class clsB = Aa.a.b(Aa.a.a(annotation));
                        if (!C3862t.b(clsB.getSimpleName(), "Container") || clsB.getAnnotation(kotlin.jvm.internal.S.class) == null) {
                            listE = kotlin.collections.r.e(annotation);
                        } else {
                            Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                            C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listE = C3831l.e((Annotation[]) objInvoke);
                        }
                        kotlin.collections.r.D(list, listE);
                    }
                }
            }
        }
        return list;
    }
}
