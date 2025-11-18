package kotlin.reflect.p371y.internal;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9781c;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.C9879a0;
import kotlin.reflect.p371y.internal.FunctionWithAllInvokes;
import kotlin.reflect.p371y.internal.JvmFunctionSignature;
import kotlin.reflect.p371y.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.p371y.internal.calls.C9900f;
import kotlin.reflect.p371y.internal.calls.C9902h;
import kotlin.reflect.p371y.internal.calls.Caller;
import kotlin.reflect.p371y.internal.calls.CallerImpl;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10237b;
import okhttp3.HttpUrl;

/* compiled from: KFunctionImpl.kt */
@Metadata(m32266d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B)\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB5\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0012J.\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000304032\n\u00105\u001a\u0006\u0012\u0002\b\u0003042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00106\u001a\u00020)H\u0002J\u0010\u00107\u001a\u0002082\u0006\u00105\u001a\u000209H\u0002J\u0010\u0010:\u001a\u0002082\u0006\u00105\u001a\u000209H\u0002J\u0010\u0010;\u001a\u0002082\u0006\u00105\u001a\u000209H\u0002J\u0013\u0010<\u001a\u00020)2\b\u0010=\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010>\u001a\u00020\u0014H\u0016J\b\u0010?\u001a\u00020\tH\u0016R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R!\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\"\u0010\u001cR\u001b\u0010\r\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010*R\u0014\u0010+\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u0010/\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010*R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", HttpUrl.FRAGMENT_ENCODE_SET, RoomInstalled.SIGNATURE, "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "arity", HttpUrl.FRAGMENT_ENCODE_SET, "getArity", "()I", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "defaultCaller$delegate", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "isBound", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "getName", "()Ljava/lang/String;", "createConstructorCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "member", "isDefault", "createInstanceMethodCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "createJvmStaticInObjectCaller", "createStaticMethodCaller", "equals", "other", "hashCode", "toString", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.j, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KFunctionImpl extends KCallableImpl<Object> implements FunctionBase<Object>, KFunction<Object>, FunctionWithAllInvokes {

    /* renamed from: j */
    static final /* synthetic */ KProperty<Object>[] f37431j = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(KFunctionImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(KFunctionImpl.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(KFunctionImpl.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

    /* renamed from: k */
    private final KDeclarationContainerImpl f37432k;

    /* renamed from: l */
    private final String f37433l;

    /* renamed from: m */
    private final Object f37434m;

    /* renamed from: n */
    private final C9879a0.a f37435n;

    /* renamed from: o */
    private final C9879a0.b f37436o;

    /* renamed from: p */
    private final C9879a0.b f37437p;

    /* compiled from: KFunctionImpl.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.j$a */
    static final class a extends Lambda implements Function0<Caller<? extends Member>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Caller<Member> invoke() throws NoSuchMethodException, SecurityException {
            Object objM32509b;
            Caller callerM32684L;
            JvmFunctionSignature jvmFunctionSignatureM32521g = RuntimeTypeMapper.f37288a.m32521g(KFunctionImpl.this.mo37304F());
            if (jvmFunctionSignatureM32521g instanceof JvmFunctionSignature.d) {
                if (KFunctionImpl.this.m32544D()) {
                    Class<?> clsMo32283a = KFunctionImpl.this.getF40570l().mo32283a();
                    List<KParameter> parameters = KFunctionImpl.this.getParameters();
                    ArrayList arrayList = new ArrayList(C10819v.m38911u(parameters, 10));
                    Iterator<T> it = parameters.iterator();
                    while (it.hasNext()) {
                        String name = ((KParameter) it.next()).getName();
                        C9801m.m32343c(name);
                        arrayList.add(name);
                    }
                    return new AnnotationConstructorCaller(clsMo32283a, arrayList, AnnotationConstructorCaller.a.POSITIONAL_CALL, AnnotationConstructorCaller.b.KOTLIN, null, 16, null);
                }
                objM32509b = KFunctionImpl.this.getF40570l().m32621u(((JvmFunctionSignature.d) jvmFunctionSignatureM32521g).m32512b());
            } else if (jvmFunctionSignatureM32521g instanceof JvmFunctionSignature.e) {
                JvmFunctionSignature.e eVar = (JvmFunctionSignature.e) jvmFunctionSignatureM32521g;
                objM32509b = KFunctionImpl.this.getF40570l().m32625y(eVar.m32514c(), eVar.m32513b());
            } else if (jvmFunctionSignatureM32521g instanceof JvmFunctionSignature.c) {
                objM32509b = ((JvmFunctionSignature.c) jvmFunctionSignatureM32521g).getF37283a();
            } else {
                if (!(jvmFunctionSignatureM32521g instanceof JvmFunctionSignature.b)) {
                    if (!(jvmFunctionSignatureM32521g instanceof JvmFunctionSignature.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<Method> listM32507b = ((JvmFunctionSignature.a) jvmFunctionSignatureM32521g).m32507b();
                    Class<?> clsMo32283a2 = KFunctionImpl.this.getF40570l().mo32283a();
                    ArrayList arrayList2 = new ArrayList(C10819v.m38911u(listM32507b, 10));
                    Iterator<T> it2 = listM32507b.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new AnnotationConstructorCaller(clsMo32283a2, arrayList2, AnnotationConstructorCaller.a.POSITIONAL_CALL, AnnotationConstructorCaller.b.JAVA, listM32507b);
                }
                objM32509b = ((JvmFunctionSignature.b) jvmFunctionSignatureM32521g).m32509b();
            }
            if (objM32509b instanceof Constructor) {
                KFunctionImpl kFunctionImpl = KFunctionImpl.this;
                callerM32684L = kFunctionImpl.m32683K((Constructor) objM32509b, kFunctionImpl.mo37304F(), false);
            } else {
                if (!(objM32509b instanceof Method)) {
                    throw new KotlinReflectionInternalError("Could not compute caller for function: " + KFunctionImpl.this.mo37304F() + " (member = " + objM32509b + ')');
                }
                Method method = (Method) objM32509b;
                callerM32684L = !Modifier.isStatic(method.getModifiers()) ? KFunctionImpl.this.m32684L(method) : KFunctionImpl.this.mo37304F().getAnnotations().mo33271l(C9891g0.m32565j()) != null ? KFunctionImpl.this.m32685M(method) : KFunctionImpl.this.m32686N(method);
            }
            return C9902h.m32667c(callerM32684L, KFunctionImpl.this.mo37304F(), false, 2, null);
        }
    }

    /* compiled from: KFunctionImpl.kt */
    @Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.j$b */
    static final class b extends Lambda implements Function0<Caller<? extends Member>> {
        b() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x012a  */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.reflect.p371y.internal.calls.Caller<java.lang.reflect.Member> invoke() {
            /*
                Method dump skipped, instructions count: 321
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.KFunctionImpl.b.invoke():kotlin.f0.y.e.i0.d");
        }
    }

    /* compiled from: KFunctionImpl.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.j$c */
    static final class c extends Lambda implements Function0<InterfaceC10738y> {

        /* renamed from: g */
        final /* synthetic */ String f37441g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f37441g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10738y invoke() {
            return KFunctionImpl.this.getF40570l().m32624x(this.f37441g, KFunctionImpl.this.f37433l);
        }
    }

    /* synthetic */ KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, InterfaceC10738y interfaceC10738y, Object obj, int i2, C9789g c9789g) {
        this(kDeclarationContainerImpl, str, str2, interfaceC10738y, (i2 & 16) != 0 ? AbstractC9781c.NO_RECEIVER : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final CallerImpl<Constructor<?>> m32683K(Constructor<?> constructor, InterfaceC10738y interfaceC10738y, boolean z) {
        return (z || !C10237b.m36103f(interfaceC10738y)) ? mo32545E() ? new CallerImpl.c(constructor, m32687O()) : new CallerImpl.e(constructor) : mo32545E() ? new CallerImpl.a(constructor, m32687O()) : new CallerImpl.b(constructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final CallerImpl.h m32684L(Method method) {
        return mo32545E() ? new CallerImpl.h.a(method, m32687O()) : new CallerImpl.h.d(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public final CallerImpl.h m32685M(Method method) {
        return mo32545E() ? new CallerImpl.h.b(method) : new CallerImpl.h.e(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final CallerImpl.h m32686N(Method method) {
        return mo32545E() ? new CallerImpl.h.c(method, m32687O()) : new CallerImpl.h.f(method);
    }

    /* renamed from: O */
    private final Object m32687O() {
        return C9902h.m32665a(this.f37434m, mo37304F());
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: A, reason: from getter */
    public KDeclarationContainerImpl getF40570l() {
        return this.f37432k;
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: B */
    public Caller<?> mo32542B() {
        return (Caller) this.f37437p.m32484c(this, f37431j[2]);
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: E */
    public boolean mo32545E() {
        return !C9801m.m32341a(this.f37434m, AbstractC9781c.NO_RECEIVER);
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public InterfaceC10738y mo37304F() {
        T tM32484c = this.f37435n.m32484c(this, f37431j[0]);
        C9801m.m32345e(tM32484c, "<get-descriptor>(...)");
        return (InterfaceC10738y) tM32484c;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: d */
    public Object mo26879d(Object obj, Object obj2, Object obj3) {
        return FunctionWithAllInvokes.a.m32495d(this, obj, obj2, obj3);
    }

    public boolean equals(Object other) {
        KFunctionImpl kFunctionImplM32558c = C9891g0.m32558c(other);
        return kFunctionImplM32558c != null && C9801m.m32341a(getF40570l(), kFunctionImplM32558c.getF40570l()) && C9801m.m32341a(getF40571m(), kFunctionImplM32558c.getF40571m()) && C9801m.m32341a(this.f37433l, kFunctionImplM32558c.f37433l) && C9801m.m32341a(this.f37434m, kFunctionImplM32558c.f37434m);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return C9900f.m32661a(mo32547z());
    }

    @Override // kotlin.reflect.KCallable
    /* renamed from: getName */
    public String getF40571m() {
        String strM35455k = mo37304F().getName().m35455k();
        C9801m.m32345e(strM35455k, "descriptor.name.asString()");
        return strM35455k;
    }

    public int hashCode() {
        return (((getF40570l().hashCode() * 31) + getF40571m().hashCode()) * 31) + this.f37433l.hashCode();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return FunctionWithAllInvokes.a.m32492a(this);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return mo37304F().isSuspend();
    }

    public String toString() {
        return ReflectionObjectRenderer.f37273a.m32499d(mo37304F());
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: z */
    public Caller<?> mo32547z() {
        T tM32484c = this.f37436o.m32484c(this, f37431j[1]);
        C9801m.m32345e(tM32484c, "<get-caller>(...)");
        return (Caller) tM32484c;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return FunctionWithAllInvokes.a.m32493b(this, obj);
    }

    private KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, InterfaceC10738y interfaceC10738y, Object obj) {
        this.f37432k = kDeclarationContainerImpl;
        this.f37433l = str2;
        this.f37434m = obj;
        this.f37435n = C9879a0.m32479c(interfaceC10738y, new c(str));
        this.f37436o = C9879a0.m32478b(new a());
        this.f37437p = C9879a0.m32478b(new b());
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return FunctionWithAllInvokes.a.m32494c(this, obj, obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
        C9801m.m32346f(kDeclarationContainerImpl, "container");
        C9801m.m32346f(str, "name");
        C9801m.m32346f(str2, RoomInstalled.SIGNATURE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, InterfaceC10738y interfaceC10738y) {
        C9801m.m32346f(kDeclarationContainerImpl, "container");
        C9801m.m32346f(interfaceC10738y, "descriptor");
        String strM35455k = interfaceC10738y.getName().m35455k();
        C9801m.m32345e(strM35455k, "descriptor.name.asString()");
        this(kDeclarationContainerImpl, strM35455k, RuntimeTypeMapper.f37288a.m32521g(interfaceC10738y).getF37287b(), interfaceC10738y, null, 16, null);
    }
}
