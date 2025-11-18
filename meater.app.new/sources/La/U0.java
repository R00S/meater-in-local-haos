package La;

import La.a1;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Xa.C1822f;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.InterfaceC3863u;
import oa.C4165j;
import oa.C4169n;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: KTypeImpl.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010 R!\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,²\u0006\u0012\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\nX\u008a\u0084\u0002"}, d2 = {"LLa/U0;", "Lkotlin/jvm/internal/u;", "LHb/U;", "type", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;LBa/a;)V", "LIa/f;", "x", "(LHb/U;)LIa/f;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "B", "LHb/U;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "LLa/a1$a;", "C", "LLa/a1$a;", "D", "d", "()LIa/f;", "classifier", "", "LIa/s;", "E", "b", "()Ljava/util/List;", "arguments", "m", "()Ljava/lang/reflect/Type;", "javaType", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class U0 implements InterfaceC3863u {

    /* renamed from: F, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f11136F = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(U0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(U0.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Hb.U type;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final a1.a<Type> computeJavaType;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final a1.a classifier;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final a1.a arguments;

    /* compiled from: KTypeImpl.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11141a;

        static {
            int[] iArr = new int[Hb.Q0.values().length];
            try {
                iArr[Hb.Q0.f5693F.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Hb.Q0.f5694G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Hb.Q0.f5695H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11141a = iArr;
        }
    }

    public U0(Hb.U type, Ba.a<? extends Type> aVar) {
        C3862t.g(type, "type");
        this.type = type;
        a1.a<Type> aVarB = null;
        a1.a<Type> aVar2 = aVar instanceof a1.a ? (a1.a) aVar : null;
        if (aVar2 != null) {
            aVarB = aVar2;
        } else if (aVar != null) {
            aVarB = a1.b(aVar);
        }
        this.computeJavaType = aVarB;
        this.classifier = a1.b(new Q0(this));
        this.arguments = a1.b(new R0(this, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List l(U0 u02, Ba.a aVar) {
        Ia.s sVarD;
        List<Hb.E0> listM0 = u02.type.M0();
        if (listM0.isEmpty()) {
            return kotlin.collections.r.m();
        }
        InterfaceC4164i interfaceC4164iB = C4165j.b(EnumC4168m.f46627C, new S0(u02));
        List<Hb.E0> list = listM0;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            Hb.E0 e02 = (Hb.E0) obj;
            if (e02.c()) {
                sVarD = Ia.s.INSTANCE.c();
            } else {
                Hb.U uA = e02.a();
                C3862t.f(uA, "getType(...)");
                U0 u03 = new U0(uA, aVar == null ? null : new T0(u02, i10, interfaceC4164iB));
                int i12 = a.f11141a[e02.b().ordinal()];
                if (i12 == 1) {
                    sVarD = Ia.s.INSTANCE.d(u03);
                } else if (i12 == 2) {
                    sVarD = Ia.s.INSTANCE.a(u03);
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sVarD = Ia.s.INSTANCE.b(u03);
                }
            }
            arrayList.add(sVarD);
            i10 = i11;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(U0 u02) {
        Type typeM = u02.m();
        C3862t.d(typeM);
        return C1822f.h(typeM);
    }

    private static final List<Type> u(InterfaceC4164i<? extends List<? extends Type>> interfaceC4164i) {
        return (List) interfaceC4164i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type v(U0 u02, int i10, InterfaceC4164i<? extends List<? extends Type>> interfaceC4164i) {
        Type type;
        Type typeM = u02.m();
        if (typeM instanceof Class) {
            Class cls = (Class) typeM;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            C3862t.d(componentType);
            return componentType;
        }
        if (typeM instanceof GenericArrayType) {
            if (i10 == 0) {
                Type genericComponentType = ((GenericArrayType) typeM).getGenericComponentType();
                C3862t.d(genericComponentType);
                return genericComponentType;
            }
            throw new Y0("Array type has been queried for a non-0th argument: " + u02);
        }
        if (!(typeM instanceof ParameterizedType)) {
            throw new Y0("Non-generic type has been queried for arguments: " + u02);
        }
        Type type2 = u(interfaceC4164i).get(i10);
        if (!(type2 instanceof WildcardType)) {
            return type2;
        }
        WildcardType wildcardType = (WildcardType) type2;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        C3862t.f(lowerBounds, "getLowerBounds(...)");
        Type type3 = (Type) C3831l.Y(lowerBounds);
        if (type3 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            C3862t.f(upperBounds, "getUpperBounds(...)");
            type = (Type) C3831l.X(upperBounds);
        } else {
            type = type3;
        }
        C3862t.d(type);
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ia.f w(U0 u02) {
        return u02.x(u02.type);
    }

    private final Ia.f x(Hb.U type) {
        Hb.U uA;
        InterfaceC1695h interfaceC1695hT = type.O0().t();
        if (!(interfaceC1695hT instanceof InterfaceC1692e)) {
            if (interfaceC1695hT instanceof Ra.m0) {
                return new W0(null, (Ra.m0) interfaceC1695hT);
            }
            if (!(interfaceC1695hT instanceof Ra.l0)) {
                return null;
            }
            throw new C4169n("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class<?> clsQ = j1.q((InterfaceC1692e) interfaceC1695hT);
        if (clsQ == null) {
            return null;
        }
        if (!clsQ.isArray()) {
            if (Hb.M0.l(type)) {
                return new X(clsQ);
            }
            Class<?> clsI = C1822f.i(clsQ);
            if (clsI != null) {
                clsQ = clsI;
            }
            return new X(clsQ);
        }
        Hb.E0 e02 = (Hb.E0) kotlin.collections.r.L0(type.M0());
        if (e02 == null || (uA = e02.a()) == null) {
            return new X(clsQ);
        }
        Ia.f fVarX = x(uA);
        if (fVarX != null) {
            return new X(j1.f(Aa.a.b(Ka.b.a(fVarX))));
        }
        throw new Y0("Cannot determine classifier for array element type: " + this);
    }

    @Override // Ia.q
    public List<Ia.s> b() {
        T tB = this.arguments.b(this, f11136F[1]);
        C3862t.f(tB, "getValue(...)");
        return (List) tB;
    }

    @Override // Ia.q
    public Ia.f d() {
        return (Ia.f) this.classifier.b(this, f11136F[0]);
    }

    public boolean equals(Object other) {
        if (other instanceof U0) {
            U0 u02 = (U0) other;
            if (C3862t.b(this.type, u02.type) && C3862t.b(d(), u02.d()) && C3862t.b(b(), u02.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Ia.f fVarD = d();
        return ((iHashCode + (fVarD != null ? fVarD.hashCode() : 0)) * 31) + b().hashCode();
    }

    @Override // kotlin.jvm.internal.InterfaceC3863u
    public Type m() {
        a1.a<Type> aVar = this.computeJavaType;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public String toString() {
        return e1.f11201a.l(this.type);
    }

    /* renamed from: y, reason: from getter */
    public final Hb.U getType() {
        return this.type;
    }

    public /* synthetic */ U0(Hb.U u10, Ba.a aVar, int i10, C3854k c3854k) {
        this(u10, (i10 & 2) != 0 ? null : aVar);
    }
}
