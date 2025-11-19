package Ma;

import Hb.I0;
import Hb.U;
import La.AbstractC1422d0;
import La.j1;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1712z;
import Ra.W;
import Xa.C1822f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import tb.C4599k;
import ua.C4696b;

/* compiled from: ValueClassAwareCaller.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0015\u0017B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020&0*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010+¨\u0006-"}, d2 = {"LMa/n;", "Ljava/lang/reflect/Member;", "M", "LMa/h;", "LRa/b;", "descriptor", "oldCaller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;LMa/h;Z)V", "", "index", "LHa/f;", "f", "(I)LHa/f;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Z", "b", "LMa/h;", "caller", "c", "Ljava/lang/reflect/Member;", "()Ljava/lang/reflect/Member;", "member", "LMa/n$a;", "d", "LMa/n$a;", "data", "e", "[LHa/f;", "slices", "hasMfvcParameters", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "()Ljava/util/List;", "parameterTypes", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n<M extends Member> implements h<M> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefault;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h<M> caller;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final M member;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a data;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ha.f[] slices;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean hasMfvcParameters;

    /* compiled from: ValueClassAwareCaller.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"LMa/n$a;", "", "LHa/f;", "argumentRange", "", "", "Ljava/lang/reflect/Method;", "unboxParameters", "box", "<init>", "(LHa/f;[Ljava/util/List;Ljava/lang/reflect/Method;)V", "a", "LHa/f;", "()LHa/f;", "b", "[Ljava/util/List;", "c", "()[Ljava/util/List;", "Ljava/lang/reflect/Method;", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Ha.f argumentRange;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<Method>[] unboxParameters;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Method box;

        public a(Ha.f argumentRange, List<Method>[] unboxParameters, Method method) {
            C3862t.g(argumentRange, "argumentRange");
            C3862t.g(unboxParameters, "unboxParameters");
            this.argumentRange = argumentRange;
            this.unboxParameters = unboxParameters;
            this.box = method;
        }

        /* renamed from: a, reason: from getter */
        public final Ha.f getArgumentRange() {
            return this.argumentRange;
        }

        /* renamed from: b, reason: from getter */
        public final Method getBox() {
            return this.box;
        }

        public final List<Method>[] c() {
            return this.unboxParameters;
        }
    }

    /* compiled from: ValueClassAwareCaller.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR'\u0010\u001f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\t0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR \u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u0014\u0010\u001eR\u0016\u0010$\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010#R\u0014\u0010'\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"LMa/n$b;", "LMa/h;", "", "LRa/z;", "descriptor", "LLa/d0;", "container", "", "constructorDesc", "", "LRa/W;", "originalParameters", "<init>", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;LLa/d0;Ljava/lang/String;Ljava/util/List;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "constructorImpl", "b", "boxMethod", "c", "Ljava/util/List;", "parameterUnboxMethods", "Ljava/lang/Class;", "d", "()Ljava/util/List;", "originalParametersGroups", "Ljava/lang/reflect/Type;", "e", "parameterTypes", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Method constructorImpl;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Method boxMethod;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<List<Method>> parameterUnboxMethods;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<List<Class<?>>> originalParametersGroups;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<Type> parameterTypes;

        public b(InterfaceC1712z descriptor, AbstractC1422d0 container, String constructorDesc, List<? extends W> originalParameters) {
            Collection collectionE;
            C3862t.g(descriptor, "descriptor");
            C3862t.g(container, "container");
            C3862t.g(constructorDesc, "constructorDesc");
            C3862t.g(originalParameters, "originalParameters");
            Method methodC = container.C("constructor-impl", constructorDesc);
            C3862t.d(methodC);
            this.constructorImpl = methodC;
            Method methodC2 = container.C("box-impl", Ub.n.r0(constructorDesc, "V") + C1822f.f(container.f()));
            C3862t.d(methodC2);
            this.boxMethod = methodC2;
            List<? extends W> list = originalParameters;
            ArrayList arrayList = new ArrayList(r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                U uA = ((W) it.next()).a();
                C3862t.f(uA, "getType(...)");
                arrayList.add(o.p(I0.a(uA), descriptor));
            }
            this.parameterUnboxMethods = arrayList;
            ArrayList arrayList2 = new ArrayList(r.x(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    r.w();
                }
                InterfaceC1695h interfaceC1695hT = ((W) obj).a().O0().t();
                C3862t.e(interfaceC1695hT, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                InterfaceC1692e interfaceC1692e = (InterfaceC1692e) interfaceC1695hT;
                List<Method> list2 = this.parameterUnboxMethods.get(i10);
                if (list2 != null) {
                    List<Method> list3 = list2;
                    collectionE = new ArrayList(r.x(list3, 10));
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        collectionE.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> clsQ = j1.q(interfaceC1692e);
                    C3862t.d(clsQ);
                    collectionE = r.e(clsQ);
                }
                arrayList2.add(collectionE);
                i10 = i11;
            }
            this.originalParametersGroups = arrayList2;
            this.parameterTypes = r.z(arrayList2);
        }

        @Override // Ma.h
        public List<Type> a() {
            return this.parameterTypes;
        }

        @Override // Ma.h
        public /* bridge */ /* synthetic */ Member b() {
            return (Member) c();
        }

        public Void c() {
            return null;
        }

        @Override // Ma.h
        public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Collection collectionE;
            C3862t.g(args, "args");
            List<C4170o> listW0 = C3831l.W0(args, this.parameterUnboxMethods);
            ArrayList arrayList = new ArrayList();
            for (C4170o c4170o : listW0) {
                Object objA = c4170o.a();
                List list = (List) c4170o.b();
                if (list != null) {
                    List list2 = list;
                    collectionE = new ArrayList(r.x(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        collectionE.add(((Method) it.next()).invoke(objA, null));
                    }
                } else {
                    collectionE = r.e(objA);
                }
                r.D(arrayList, collectionE);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.constructorImpl.invoke(null, Arrays.copyOf(array, array.length));
            return this.boxMethod.invoke(null, Arrays.copyOf(array, array.length));
        }

        public final List<List<Class<?>>> d() {
            return this.originalParametersGroups;
        }

        @Override // Ma.h
        public Type getReturnType() {
            Class<?> returnType = this.boxMethod.getReturnType();
            C3862t.f(returnType, "getReturnType(...)");
            return returnType;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[LOOP:1: B:25:0x007c->B:27:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(Ra.InterfaceC1689b r11, Ma.h<? extends M> r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ma.n.<init>(Ra.b, Ma.h, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(InterfaceC1692e makeKotlinParameterTypes) {
        C3862t.g(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
        return C4599k.g(makeKotlinParameterTypes);
    }

    private static final int e(U u10) {
        List<Method> listN = o.n(I0.a(u10));
        if (listN != null) {
            return listN.size();
        }
        return 1;
    }

    @Override // Ma.h
    public List<Type> a() {
        return this.caller.a();
    }

    @Override // Ma.h
    public M b() {
        return this.member;
    }

    @Override // Ma.h
    public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        Object objG;
        Object objG2;
        C3862t.g(args, "args");
        Ha.f argumentRange = this.data.getArgumentRange();
        List<Method>[] listArrC = this.data.c();
        Method box = this.data.getBox();
        if (!argumentRange.isEmpty()) {
            if (this.hasMfvcParameters) {
                List listD = r.d(args.length);
                int first = argumentRange.getFirst();
                for (int i10 = 0; i10 < first; i10++) {
                    listD.add(args[i10]);
                }
                int first2 = argumentRange.getFirst();
                int last = argumentRange.getLast();
                if (first2 <= last) {
                    while (true) {
                        List<Method> list = listArrC[first2];
                        Object obj = args[first2];
                        if (list != null) {
                            for (Method method : list) {
                                List list2 = listD;
                                if (obj != null) {
                                    objG2 = method.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    C3862t.f(returnType, "getReturnType(...)");
                                    objG2 = j1.g(returnType);
                                }
                                list2.add(objG2);
                            }
                        } else {
                            listD.add(obj);
                        }
                        if (first2 == last) {
                            break;
                        }
                        first2++;
                    }
                }
                int last2 = argumentRange.getLast() + 1;
                int iC0 = C3831l.c0(args);
                if (last2 <= iC0) {
                    while (true) {
                        listD.add(args[last2]);
                        if (last2 == iC0) {
                            break;
                        }
                        last2++;
                    }
                }
                args = r.a(listD).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int first3 = argumentRange.getFirst();
                    if (i11 > argumentRange.getLast() || first3 > i11) {
                        objG = args[i11];
                    } else {
                        List<Method> list3 = listArrC[i11];
                        Method method2 = list3 != null ? (Method) r.J0(list3) : null;
                        objG = args[i11];
                        if (method2 != null) {
                            if (objG != null) {
                                objG = method2.invoke(objG, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                C3862t.f(returnType2, "getReturnType(...)");
                                objG = j1.g(returnType2);
                            }
                        }
                    }
                    objArr[i11] = objG;
                }
                args = objArr;
            }
        }
        Object objCall = this.caller.call(args);
        return (objCall == C4696b.e() || box == null || (objInvoke = box.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    public final Ha.f f(int index) {
        Ha.f fVar;
        if (index >= 0) {
            Ha.f[] fVarArr = this.slices;
            if (index < fVarArr.length) {
                return fVarArr[index];
            }
        }
        Ha.f[] fVarArr2 = this.slices;
        if (fVarArr2.length == 0) {
            fVar = new Ha.f(index, index);
        } else {
            int length = (index - fVarArr2.length) + ((Ha.f) C3831l.o0(fVarArr2)).getLast() + 1;
            fVar = new Ha.f(length, length);
        }
        return fVar;
    }

    @Override // Ma.h
    public Type getReturnType() {
        return this.caller.getReturnType();
    }
}
