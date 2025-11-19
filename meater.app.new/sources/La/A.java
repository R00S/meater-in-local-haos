package La;

import Ia.l;
import La.a1;
import Ra.AbstractC1707u;
import Ra.InterfaceC1689b;
import cb.InterfaceC2355a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.full.IllegalCallableAccessException;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import ra.C4370a;
import ta.InterfaceC4588d;

/* compiled from: KCallableImpl.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00028\u00002\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J3\u0010\u001f\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f2\f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 R.\u0010'\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020# $*\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R.\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n $*\n\u0012\u0004\u0012\u00020\n\u0018\u00010(0(0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\"\u0010-\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010+0+0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010&R.\u00100\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020. $*\n\u0012\u0004\u0012\u00020.\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010&R2\u00102\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 $*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00060!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010&R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0006\u0012\u0002\b\u0003088&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u00109R\u001a\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u0001088&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010@\u001a\u00020=8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020#0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\n0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0014\u0010K\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020L0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010ER\u0016\u0010R\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010S\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010BR\u0014\u0010T\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010BR\u0014\u0010U\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010BR\u0014\u0010W\u001a\u0002048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bV\u0010BR\u0014\u0010[\u001a\u00020X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"LLa/A;", "R", "LIa/c;", "LLa/X0;", "<init>", "()V", "", "", "Q", "()[Ljava/lang/Object;", "LIa/l;", "parameter", "", "V", "(LIa/l;)I", "", "args", "M", "(Ljava/util/Map;)Ljava/lang/Object;", "LIa/q;", "type", "O", "(LIa/q;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "P", "()Ljava/lang/reflect/Type;", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "Lta/d;", "continuationArgument", "N", "(Ljava/util/Map;Lta/d;)Ljava/lang/Object;", "LLa/a1$a;", "", "", "kotlin.jvm.PlatformType", "B", "LLa/a1$a;", "_annotations", "Ljava/util/ArrayList;", "C", "_parameters", "LLa/U0;", "D", "_returnType", "LLa/W0;", "E", "_typeParameters", "F", "_absentArguments", "Loa/i;", "", "G", "Loa/i;", "parametersNeedMFVCFlattening", "LMa/h;", "()LMa/h;", "caller", "T", "defaultCaller", "LLa/d0;", "S", "()LLa/d0;", "container", "X", "()Z", "isBound", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()LIa/q;", "returnType", "LIa/r;", "getTypeParameters", "typeParameters", "LIa/u;", "getVisibility", "()LIa/u;", "visibility", "isFinal", "isOpen", "isAbstract", "W", "isAnnotationConstructor", "LRa/b;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class A<R> implements Ia.c<R>, X0 {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final a1.a<List<Annotation>> _annotations;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final a1.a<ArrayList<Ia.l>> _parameters;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final a1.a<U0> _returnType;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final a1.a<List<W0>> _typeParameters;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final a1.a<Object[]> _absentArguments;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i<Boolean> parametersNeedMFVCFlattening;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C4370a.d(((Ia.l) t10).getName(), ((Ia.l) t11).getName());
        }
    }

    public A() {
        a1.a<List<Annotation>> aVarB = a1.b(new C1447q(this));
        C3862t.f(aVarB, "lazySoft(...)");
        this._annotations = aVarB;
        a1.a<ArrayList<Ia.l>> aVarB2 = a1.b(new r(this));
        C3862t.f(aVarB2, "lazySoft(...)");
        this._parameters = aVarB2;
        a1.a<U0> aVarB3 = a1.b(new C1450s(this));
        C3862t.f(aVarB3, "lazySoft(...)");
        this._returnType = aVarB3;
        a1.a<List<W0>> aVarB4 = a1.b(new C1452t(this));
        C3862t.f(aVarB4, "lazySoft(...)");
        this._typeParameters = aVarB4;
        a1.a<Object[]> aVarB5 = a1.b(new C1454u(this));
        C3862t.f(aVarB5, "lazySoft(...)");
        this._absentArguments = aVarB5;
        this.parametersNeedMFVCFlattening = C4165j.b(EnumC4168m.f46627C, new C1456v(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type A(A a10) {
        Type typeP = a10.P();
        return typeP == null ? a10.R().getReturnType() : typeP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List B(A a10) {
        List<Ra.m0> typeParameters = a10.Z().getTypeParameters();
        C3862t.f(typeParameters, "getTypeParameters(...)");
        List<Ra.m0> list = typeParameters;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        for (Ra.m0 m0Var : list) {
            C3862t.d(m0Var);
            arrayList.add(new W0(a10, m0Var));
        }
        return arrayList;
    }

    private final R M(Map<Ia.l, ? extends Object> args) throws IllegalCallableAccessException, NegativeArraySizeException {
        Object objO;
        List<Ia.l> parameters = getParameters();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(parameters, 10));
        for (Ia.l lVar : parameters) {
            if (args.containsKey(lVar)) {
                objO = args.get(lVar);
                if (objO == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + lVar + ')');
                }
            } else if (lVar.n()) {
                objO = null;
            } else {
                if (!lVar.j()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + lVar);
                }
                objO = O(lVar.a());
            }
            arrayList.add(objO);
        }
        Ma.h<?> hVarT = T();
        if (hVarT != null) {
            try {
                return (R) hVarT.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e10) {
                throw new IllegalCallableAccessException(e10);
            }
        }
        throw new Y0("This callable does not support a default call: " + Z());
    }

    private final Object O(Ia.q type) throws NegativeArraySizeException {
        Class clsB = Aa.a.b(Ka.b.b(type));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            C3862t.f(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new Y0("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    private final Type P() {
        Type[] lowerBounds;
        if (!isSuspend()) {
            return null;
        }
        Object objW0 = kotlin.collections.r.w0(R().a());
        ParameterizedType parameterizedType = objW0 instanceof ParameterizedType ? (ParameterizedType) objW0 : null;
        if (!C3862t.b(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC4588d.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C3862t.f(actualTypeArguments, "getActualTypeArguments(...)");
        Object objV0 = C3831l.v0(actualTypeArguments);
        WildcardType wildcardType = objV0 instanceof WildcardType ? (WildcardType) objV0 : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) C3831l.X(lowerBounds);
    }

    private final Object[] Q() {
        return (Object[]) this._absentArguments.invoke().clone();
    }

    private final int V(Ia.l parameter) {
        if (!this.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!j1.k(parameter.a())) {
            return 1;
        }
        Ia.q qVarA = parameter.a();
        C3862t.e(qVarA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List<Method> listN = Ma.o.n(Hb.I0.a(((U0) qVarA).getType()));
        C3862t.d(listN);
        return listN.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y(A a10) {
        List<Ia.l> parameters = a10.getParameters();
        if ((parameters instanceof Collection) && parameters.isEmpty()) {
            return false;
        }
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            if (j1.k(((Ia.l) it.next()).a())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] p(A a10) {
        int iV;
        List<Ia.l> parameters = a10.getParameters();
        int size = parameters.size() + (a10.isSuspend() ? 1 : 0);
        if (a10.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            iV = 0;
            for (Ia.l lVar : parameters) {
                iV += lVar.getKind() == l.a.f6938D ? a10.V(lVar) : 0;
            }
        } else {
            List<Ia.l> list = parameters;
            if ((list instanceof Collection) && list.isEmpty()) {
                iV = 0;
            } else {
                Iterator<T> it = list.iterator();
                iV = 0;
                while (it.hasNext()) {
                    if (((Ia.l) it.next()).getKind() == l.a.f6938D && (iV = iV + 1) < 0) {
                        kotlin.collections.r.v();
                    }
                }
            }
        }
        int i10 = (iV + 31) / 32;
        Object[] objArr = new Object[size + i10 + 1];
        for (Ia.l lVar2 : parameters) {
            if (lVar2.n() && !j1.l(lVar2.a())) {
                objArr[lVar2.getIndex()] = j1.g(Ka.c.f(lVar2.a()));
            } else if (lVar2.j()) {
                objArr[lVar2.getIndex()] = a10.O(lVar2.a());
            }
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[size + i11] = 0;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List u(A a10) {
        return j1.e(a10.Z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList v(A a10) {
        int i10;
        InterfaceC1689b interfaceC1689bU = a10.Z();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        if (a10.X()) {
            i10 = 0;
        } else {
            Ra.c0 c0VarI = j1.i(interfaceC1689bU);
            if (c0VarI != null) {
                arrayList.add(new C1463y0(a10, 0, l.a.f6936B, new C1458w(c0VarI)));
                i10 = 1;
            } else {
                i10 = 0;
            }
            Ra.c0 c0VarJ0 = interfaceC1689bU.j0();
            if (c0VarJ0 != null) {
                arrayList.add(new C1463y0(a10, i10, l.a.f6937C, new C1460x(c0VarJ0)));
                i10++;
            }
        }
        int size = interfaceC1689bU.k().size();
        while (i11 < size) {
            arrayList.add(new C1463y0(a10, i10, l.a.f6938D, new C1462y(interfaceC1689bU, i11)));
            i11++;
            i10++;
        }
        if (a10.W() && (interfaceC1689bU instanceof InterfaceC2355a) && arrayList.size() > 1) {
            kotlin.collections.r.C(arrayList, new a());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ra.W y(InterfaceC1689b interfaceC1689b, int i10) {
        Ra.t0 t0Var = interfaceC1689b.k().get(i10);
        C3862t.f(t0Var, "get(...)");
        return t0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U0 z(A a10) {
        Hb.U returnType = a10.Z().getReturnType();
        C3862t.d(returnType);
        return new U0(returnType, new C1464z(a10));
    }

    public final R N(Map<Ia.l, ? extends Object> args, InterfaceC4588d<?> continuationArgument) throws IllegalCallableAccessException {
        C3862t.g(args, "args");
        List<Ia.l> parameters = getParameters();
        boolean z10 = false;
        if (parameters.isEmpty()) {
            try {
                return (R) R().call(isSuspend() ? new InterfaceC4588d[]{continuationArgument} : new InterfaceC4588d[0]);
            } catch (IllegalAccessException e10) {
                throw new IllegalCallableAccessException(e10);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] objArrQ = Q();
        if (isSuspend()) {
            objArrQ[parameters.size()] = continuationArgument;
        }
        boolean zBooleanValue = this.parametersNeedMFVCFlattening.getValue().booleanValue();
        int i10 = 0;
        for (Ia.l lVar : parameters) {
            int iV = zBooleanValue ? V(lVar) : 1;
            if (args.containsKey(lVar)) {
                objArrQ[lVar.getIndex()] = args.get(lVar);
            } else if (lVar.n()) {
                if (zBooleanValue) {
                    int i11 = i10 + iV;
                    for (int i12 = i10; i12 < i11; i12++) {
                        int i13 = (i12 / 32) + size;
                        Object obj = objArrQ[i13];
                        C3862t.e(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArrQ[i13] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i12 % 32)));
                    }
                } else {
                    int i14 = (i10 / 32) + size;
                    Object obj2 = objArrQ[i14];
                    C3862t.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArrQ[i14] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i10 % 32)));
                }
                z10 = true;
            } else if (!lVar.j()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + lVar);
            }
            if (lVar.getKind() == l.a.f6938D) {
                i10 += iV;
            }
        }
        if (!z10) {
            try {
                Ma.h<?> hVarR = R();
                Object[] objArrCopyOf = Arrays.copyOf(objArrQ, size);
                C3862t.f(objArrCopyOf, "copyOf(...)");
                return (R) hVarR.call(objArrCopyOf);
            } catch (IllegalAccessException e11) {
                throw new IllegalCallableAccessException(e11);
            }
        }
        Ma.h<?> hVarT = T();
        if (hVarT != null) {
            try {
                return (R) hVarT.call(objArrQ);
            } catch (IllegalAccessException e12) {
                throw new IllegalCallableAccessException(e12);
            }
        }
        throw new Y0("This callable does not support a default call: " + Z());
    }

    public abstract Ma.h<?> R();

    /* renamed from: S */
    public abstract AbstractC1422d0 getContainer();

    public abstract Ma.h<?> T();

    /* renamed from: U */
    public abstract InterfaceC1689b Z();

    protected final boolean W() {
        return C3862t.b(getName(), "<init>") && getContainer().f().isAnnotation();
    }

    public abstract boolean X();

    @Override // Ia.c
    public R call(Object... args) throws IllegalCallableAccessException {
        C3862t.g(args, "args");
        try {
            return (R) R().call(args);
        } catch (IllegalAccessException e10) {
            throw new IllegalCallableAccessException(e10);
        }
    }

    @Override // Ia.c
    public R callBy(Map<Ia.l, ? extends Object> args) {
        C3862t.g(args, "args");
        return W() ? M(args) : N(args, null);
    }

    @Override // Ia.b
    public List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this._annotations.invoke();
        C3862t.f(listInvoke, "invoke(...)");
        return listInvoke;
    }

    @Override // Ia.c
    public List<Ia.l> getParameters() {
        ArrayList<Ia.l> arrayListInvoke = this._parameters.invoke();
        C3862t.f(arrayListInvoke, "invoke(...)");
        return arrayListInvoke;
    }

    @Override // Ia.c
    public Ia.q getReturnType() {
        U0 u0Invoke = this._returnType.invoke();
        C3862t.f(u0Invoke, "invoke(...)");
        return u0Invoke;
    }

    @Override // Ia.c
    public List<Ia.r> getTypeParameters() {
        List<W0> listInvoke = this._typeParameters.invoke();
        C3862t.f(listInvoke, "invoke(...)");
        return listInvoke;
    }

    @Override // Ia.c
    public Ia.u getVisibility() {
        AbstractC1707u visibility = Z().getVisibility();
        C3862t.f(visibility, "getVisibility(...)");
        return j1.r(visibility);
    }

    @Override // Ia.c
    public boolean isAbstract() {
        return Z().m() == Ra.E.f15109F;
    }

    @Override // Ia.c
    public boolean isFinal() {
        return Z().m() == Ra.E.f15106C;
    }

    @Override // Ia.c
    public boolean isOpen() {
        return Z().m() == Ra.E.f15108E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ra.W w(Ra.c0 c0Var) {
        return c0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ra.W x(Ra.c0 c0Var) {
        return c0Var;
    }
}
