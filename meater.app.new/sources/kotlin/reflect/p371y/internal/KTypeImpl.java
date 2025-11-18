package kotlin.reflect.p371y.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.C10795j;
import kotlin.collections.C10813s;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.C9752a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10703d;
import kotlin.reflect.p371y.C9875b;
import kotlin.reflect.p371y.internal.C9879a0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import okhttp3.HttpUrl;

/* compiled from: KTypeImpl.kt */
@Metadata(m32266d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0013\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u001bH\u0000¢\u0006\u0002\b*J\b\u0010+\u001a\u00020,H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006-²\u0006\u0010\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u008a\u0084\u0002"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/jvm/internal/KTypeBase;", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "computeJavaType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "annotations", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getAnnotations", "()Ljava/util/List;", "arguments", "Lkotlin/reflect/KTypeProjection;", "getArguments", "arguments$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "classifier", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getComputeJavaType$annotations", "()V", "isMarkedNullable", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "javaType", "getJavaType", "()Ljava/lang/reflect/Type;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "convert", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "makeNullableAsSpecified", "nullable", "makeNullableAsSpecified$kotlin_reflection", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection", "parameterizedTypeArguments"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.v, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KTypeImpl implements KTypeBase {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f40588f = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(KTypeImpl.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: g */
    private final AbstractC10344e0 f40589g;

    /* renamed from: h */
    private final C9879a0.a<Type> f40590h;

    /* renamed from: i */
    private final C9879a0.a f40591i;

    /* renamed from: j */
    private final C9879a0.a f40592j;

    /* compiled from: KTypeImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KTypeProjection;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.v$a */
    static final class a extends Lambda implements Function0<List<? extends KTypeProjection>> {

        /* renamed from: g */
        final /* synthetic */ Function0<Type> f40594g;

        /* compiled from: KTypeImpl.kt */
        @Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<no name provided>", "Ljava/lang/reflect/Type;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.v$a$a, reason: collision with other inner class name */
        static final class C11577a extends Lambda implements Function0<Type> {

            /* renamed from: f */
            final /* synthetic */ KTypeImpl f40595f;

            /* renamed from: g */
            final /* synthetic */ int f40596g;

            /* renamed from: h */
            final /* synthetic */ Lazy<List<Type>> f40597h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C11577a(KTypeImpl kTypeImpl, int i2, Lazy<? extends List<? extends Type>> lazy) {
                super(0);
                this.f40595f = kTypeImpl;
                this.f40596g = i2;
                this.f40597h = lazy;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type typeMo32365j = this.f40595f.mo32365j();
                if (typeMo32365j instanceof Class) {
                    Class cls = (Class) typeMo32365j;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    C9801m.m32345e(componentType, "{\n                      …                        }");
                    return componentType;
                }
                if (typeMo32365j instanceof GenericArrayType) {
                    if (this.f40596g == 0) {
                        Type genericComponentType = ((GenericArrayType) typeMo32365j).getGenericComponentType();
                        C9801m.m32345e(genericComponentType, "{\n                      …                        }");
                        return genericComponentType;
                    }
                    throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + this.f40595f);
                }
                if (!(typeMo32365j instanceof ParameterizedType)) {
                    throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + this.f40595f);
                }
                Type type = (Type) a.m37324c(this.f40597h).get(this.f40596g);
                if (type instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    C9801m.m32345e(lowerBounds, "argument.lowerBounds");
                    Type type2 = (Type) C10795j.m38696x(lowerBounds);
                    if (type2 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        C9801m.m32345e(upperBounds, "argument.upperBounds");
                        type = (Type) C10795j.m38695w(upperBounds);
                    } else {
                        type = type2;
                    }
                }
                C9801m.m32345e(type, "{\n                      …                        }");
                return type;
            }
        }

        /* compiled from: KTypeImpl.kt */
        @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.v$a$b */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f40598a;

            static {
                int[] iArr = new int[EnumC10384r1.values().length];
                iArr[EnumC10384r1.INVARIANT.ordinal()] = 1;
                iArr[EnumC10384r1.IN_VARIANCE.ordinal()] = 2;
                iArr[EnumC10384r1.OUT_VARIANCE.ordinal()] = 3;
                f40598a = iArr;
            }
        }

        /* compiled from: KTypeImpl.kt */
        @Metadata(m32266d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/reflect/Type;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.v$a$c */
        static final class c extends Lambda implements Function0<List<? extends Type>> {

            /* renamed from: f */
            final /* synthetic */ KTypeImpl f40599f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(KTypeImpl kTypeImpl) {
                super(0);
                this.f40599f = kTypeImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Type> invoke() {
                Type typeMo32365j = this.f40599f.mo32365j();
                C9801m.m32343c(typeMo32365j);
                return C10703d.m38071c(typeMo32365j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends Type> function0) {
            super(0);
            this.f40594g = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final List<Type> m37324c(Lazy<? extends List<? extends Type>> lazy) {
            return (List) lazy.getValue();
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends KTypeProjection> invoke() {
            KTypeProjection kTypeProjectionM32447d;
            List<InterfaceC10351g1> listMo35991M0 = KTypeImpl.this.getF40589g().mo35991M0();
            if (listMo35991M0.isEmpty()) {
                return C10817u.m38888j();
            }
            Lazy lazyM37593a = C10550i.m37593a(LazyThreadSafetyMode.PUBLICATION, new c(KTypeImpl.this));
            Function0<Type> function0 = this.f40594g;
            KTypeImpl kTypeImpl = KTypeImpl.this;
            ArrayList arrayList = new ArrayList(C10819v.m38911u(listMo35991M0, 10));
            int i2 = 0;
            for (Object obj : listMo35991M0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C10817u.m38898t();
                }
                InterfaceC10351g1 interfaceC10351g1 = (InterfaceC10351g1) obj;
                if (interfaceC10351g1.mo36710c()) {
                    kTypeProjectionM32447d = KTypeProjection.f37240a.m32446c();
                } else {
                    AbstractC10344e0 type = interfaceC10351g1.getType();
                    C9801m.m32345e(type, "typeProjection.type");
                    KTypeImpl kTypeImpl2 = new KTypeImpl(type, function0 == null ? null : new C11577a(kTypeImpl, i2, lazyM37593a));
                    int i4 = b.f40598a[interfaceC10351g1.mo36708a().ordinal()];
                    if (i4 == 1) {
                        kTypeProjectionM32447d = KTypeProjection.f37240a.m32447d(kTypeImpl2);
                    } else if (i4 == 2) {
                        kTypeProjectionM32447d = KTypeProjection.f37240a.m32444a(kTypeImpl2);
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kTypeProjectionM32447d = KTypeProjection.f37240a.m32445b(kTypeImpl2);
                    }
                }
                arrayList.add(kTypeProjectionM32447d);
                i2 = i3;
            }
            return arrayList;
        }
    }

    /* compiled from: KTypeImpl.kt */
    @Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/KClassifier;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.v$b */
    static final class b extends Lambda implements Function0<KClassifier> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KClassifier invoke() {
            KTypeImpl kTypeImpl = KTypeImpl.this;
            return kTypeImpl.m37321d(kTypeImpl.getF40589g());
        }
    }

    public KTypeImpl(AbstractC10344e0 abstractC10344e0, Function0<? extends Type> function0) {
        C9801m.m32346f(abstractC10344e0, "type");
        this.f40589g = abstractC10344e0;
        C9879a0.a<Type> aVarM32480d = null;
        C9879a0.a<Type> aVar = function0 instanceof C9879a0.a ? (C9879a0.a) function0 : null;
        if (aVar != null) {
            aVarM32480d = aVar;
        } else if (function0 != null) {
            aVarM32480d = C9879a0.m32480d(function0);
        }
        this.f40590h = aVarM32480d;
        this.f40591i = C9879a0.m32480d(new b());
        this.f40592j = C9879a0.m32480d(new a(function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final KClassifier m37321d(AbstractC10344e0 abstractC10344e0) {
        AbstractC10344e0 type;
        InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
        if (!(interfaceC10594hMo32891w instanceof InterfaceC10585e)) {
            if (interfaceC10594hMo32891w instanceof InterfaceC10587e1) {
                return new KTypeParameterImpl(null, (InterfaceC10587e1) interfaceC10594hMo32891w);
            }
            if (!(interfaceC10594hMo32891w instanceof InterfaceC10584d1)) {
                return null;
            }
            throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class<?> clsM32571p = C9891g0.m32571p((InterfaceC10585e) interfaceC10594hMo32891w);
        if (clsM32571p == null) {
            return null;
        }
        if (!clsM32571p.isArray()) {
            if (C10372n1.m36779l(abstractC10344e0)) {
                return new KClassImpl(clsM32571p);
            }
            Class<?> clsM38072d = C10703d.m38072d(clsM32571p);
            if (clsM38072d != null) {
                clsM32571p = clsM38072d;
            }
            return new KClassImpl(clsM32571p);
        }
        InterfaceC10351g1 interfaceC10351g1 = (InterfaceC10351g1) C10813s.m38870u0(abstractC10344e0.mo35991M0());
        if (interfaceC10351g1 == null || (type = interfaceC10351g1.getType()) == null) {
            return new KClassImpl(clsM32571p);
        }
        KClassifier kClassifierM37321d = m37321d(type);
        if (kClassifierM37321d != null) {
            return new KClassImpl(C9891g0.m32561f(C9752a.m32276b(C9875b.m32463a(kClassifierM37321d))));
        }
        throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
    }

    @Override // kotlin.reflect.KType
    /* renamed from: b */
    public List<KTypeProjection> mo32436b() {
        T tM32484c = this.f40592j.m32484c(this, f40588f[1]);
        C9801m.m32345e(tM32484c, "<get-arguments>(...)");
        return (List) tM32484c;
    }

    @Override // kotlin.reflect.KType
    /* renamed from: c */
    public KClassifier mo32437c() {
        return (KClassifier) this.f40591i.m32484c(this, f40588f[0]);
    }

    @Override // kotlin.reflect.KType
    /* renamed from: e */
    public boolean mo32438e() {
        return this.f40589g.mo33691P0();
    }

    public boolean equals(Object other) {
        return (other instanceof KTypeImpl) && C9801m.m32341a(this.f40589g, ((KTypeImpl) other).f40589g);
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC10344e0 getF40589g() {
        return this.f40589g;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return C9891g0.m32560e(this.f40589g);
    }

    public int hashCode() {
        return this.f40589g.hashCode();
    }

    @Override // kotlin.jvm.internal.KTypeBase
    /* renamed from: j */
    public Type mo32365j() {
        C9879a0.a<Type> aVar = this.f40590h;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public String toString() {
        return ReflectionObjectRenderer.f37273a.m32503h(this.f40589g);
    }

    public /* synthetic */ KTypeImpl(AbstractC10344e0 abstractC10344e0, Function0 function0, int i2, C9789g c9789g) {
        this(abstractC10344e0, (i2 & 2) != 0 ? null : function0);
    }
}
