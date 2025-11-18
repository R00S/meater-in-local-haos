package kotlin.reflect.p371y.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10678q0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.p371y.internal.C9879a0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import okhttp3.HttpUrl;

/* compiled from: KParameterImpl.kt */
@Metadata(m32266d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0013\u0010)\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\"H\u0016R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006."}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "callable", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "index", HttpUrl.FRAGMENT_ENCODE_SET, "kind", "Lkotlin/reflect/KParameter$Kind;", "computeDescriptor", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "annotations", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getCallable", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "descriptor", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor$delegate", "getIndex", "()I", "isOptional", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isVararg", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "name", HttpUrl.FRAGMENT_ENCODE_SET, "getName", "()Ljava/lang/String;", "type", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.p, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KParameterImpl implements KParameter {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f40545f = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(KParameterImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(KParameterImpl.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: g */
    private final KCallableImpl<?> f40546g;

    /* renamed from: h */
    private final int f40547h;

    /* renamed from: i */
    private final KParameter.a f40548i;

    /* renamed from: j */
    private final C9879a0.a f40549j;

    /* renamed from: k */
    private final C9879a0.a f40550k;

    /* compiled from: KParameterImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.p$a */
    static final class a extends Lambda implements Function0<List<? extends Annotation>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Annotation> invoke() {
            return C9891g0.m32560e(KParameterImpl.this.m37283f());
        }
    }

    /* compiled from: KParameterImpl.kt */
    @Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.p$b */
    static final class b extends Lambda implements Function0<Type> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Type invoke() {
            InterfaceC10678q0 interfaceC10678q0M37283f = KParameterImpl.this.m37283f();
            if (!(interfaceC10678q0M37283f instanceof InterfaceC10735w0) || !C9801m.m32341a(C9891g0.m32564i(KParameterImpl.this.m37284d().mo37304F()), interfaceC10678q0M37283f) || KParameterImpl.this.m37284d().mo37304F().mo37030i() != InterfaceC10576b.a.FAKE_OVERRIDE) {
                return KParameterImpl.this.m37284d().mo32547z().mo32637a().get(KParameterImpl.this.getF40547h());
            }
            InterfaceC10609m interfaceC10609mMo32876b = KParameterImpl.this.m37284d().mo37304F().mo32876b();
            C9801m.m32344d(interfaceC10609mMo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> clsM32571p = C9891g0.m32571p((InterfaceC10585e) interfaceC10609mMo32876b);
            if (clsM32571p != null) {
                return clsM32571p;
            }
            throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + interfaceC10678q0M37283f);
        }
    }

    public KParameterImpl(KCallableImpl<?> kCallableImpl, int i2, KParameter.a aVar, Function0<? extends InterfaceC10678q0> function0) {
        C9801m.m32346f(kCallableImpl, "callable");
        C9801m.m32346f(aVar, "kind");
        C9801m.m32346f(function0, "computeDescriptor");
        this.f40546g = kCallableImpl;
        this.f40547h = i2;
        this.f40548i = aVar;
        this.f40549j = C9879a0.m32480d(function0);
        this.f40550k = C9879a0.m32480d(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final InterfaceC10678q0 m37283f() {
        T tM32484c = this.f40549j.m32484c(this, f40545f[0]);
        C9801m.m32345e(tM32484c, "<get-descriptor>(...)");
        return (InterfaceC10678q0) tM32484c;
    }

    /* renamed from: d */
    public final KCallableImpl<?> m37284d() {
        return this.f40546g;
    }

    public boolean equals(Object other) {
        if (other instanceof KParameterImpl) {
            KParameterImpl kParameterImpl = (KParameterImpl) other;
            if (C9801m.m32341a(this.f40546g, kParameterImpl.f40546g) && getF40547h() == kParameterImpl.getF40547h()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KParameter
    /* renamed from: g, reason: from getter */
    public int getF40547h() {
        return this.f40547h;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        T tM32484c = this.f40550k.m32484c(this, f40545f[1]);
        C9801m.m32345e(tM32484c, "<get-annotations>(...)");
        return (List) tM32484c;
    }

    @Override // kotlin.reflect.KParameter
    public String getName() {
        InterfaceC10678q0 interfaceC10678q0M37283f = m37283f();
        InterfaceC10599i1 interfaceC10599i1 = interfaceC10678q0M37283f instanceof InterfaceC10599i1 ? (InterfaceC10599i1) interfaceC10678q0M37283f : null;
        if (interfaceC10599i1 == null || interfaceC10599i1.mo32876b().mo33204G()) {
            return null;
        }
        C10163f name = interfaceC10599i1.getName();
        C9801m.m32345e(name, "valueParameter.name");
        if (name.m35458y()) {
            return null;
        }
        return name.m35455k();
    }

    @Override // kotlin.reflect.KParameter
    public KType getType() {
        AbstractC10344e0 type = m37283f().getType();
        C9801m.m32345e(type, "descriptor.type");
        return new KTypeImpl(type, new b());
    }

    @Override // kotlin.reflect.KParameter
    /* renamed from: h */
    public boolean mo32431h() {
        InterfaceC10678q0 interfaceC10678q0M37283f = m37283f();
        return (interfaceC10678q0M37283f instanceof InterfaceC10599i1) && ((InterfaceC10599i1) interfaceC10678q0M37283f).mo37697l0() != null;
    }

    public int hashCode() {
        return (this.f40546g.hashCode() * 31) + Integer.valueOf(getF40547h()).hashCode();
    }

    @Override // kotlin.reflect.KParameter
    /* renamed from: i, reason: from getter */
    public KParameter.a getF40548i() {
        return this.f40548i;
    }

    @Override // kotlin.reflect.KParameter
    /* renamed from: k */
    public boolean mo32433k() {
        InterfaceC10678q0 interfaceC10678q0M37283f = m37283f();
        InterfaceC10599i1 interfaceC10599i1 = interfaceC10678q0M37283f instanceof InterfaceC10599i1 ? (InterfaceC10599i1) interfaceC10678q0M37283f : null;
        if (interfaceC10599i1 != null) {
            return C10235a.m36067a(interfaceC10599i1);
        }
        return false;
    }

    public String toString() {
        return ReflectionObjectRenderer.f37273a.m32501f(this);
    }
}
