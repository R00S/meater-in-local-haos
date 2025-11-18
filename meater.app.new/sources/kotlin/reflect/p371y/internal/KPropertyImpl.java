package kotlin.reflect.p371y.internal;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9781c;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10727s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10731u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10733v0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.C9879a0;
import kotlin.reflect.p371y.internal.JvmPropertySignature;
import kotlin.reflect.p371y.internal.calls.C9902h;
import kotlin.reflect.p371y.internal.calls.Caller;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9974k;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10116d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10121i;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10186c;
import okhttp3.HttpUrl;

/* compiled from: KPropertyImpl.kt */
@Metadata(m32266d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b \u0018\u0000 @*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004?@ABB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0011J\n\u00104\u001a\u0004\u0018\u000105H\u0004J\u0013\u00106\u001a\u00020)2\b\u00107\u001a\u0004\u0018\u00010\nH\u0096\u0002J(\u00108\u001a\u0004\u0018\u00010\n2\b\u00109\u001a\u0004\u0018\u0001052\b\u0010:\u001a\u0004\u0018\u00010\n2\b\u0010;\u001a\u0004\u0018\u00010\nH\u0004J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020\u0007H\u0016R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\r0\r0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010*R\u0014\u0010+\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0013\u0010.\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00102¨\u0006C"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "V", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", HttpUrl.FRAGMENT_ENCODE_SET, RoomInstalled.SIGNATURE, "boundReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "_descriptor", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin.jvm.PlatformType", "_javaField", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Ljava/lang/reflect/Field;", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getter", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "isBound", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isConst", "isLateinit", "isSuspend", "javaField", "getJavaField", "()Ljava/lang/reflect/Field;", "getName", "()Ljava/lang/String;", "getSignature", "computeDelegateSource", "Ljava/lang/reflect/Member;", "equals", "other", "getDelegateImpl", "fieldOrMethod", "receiver1", "receiver2", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Accessor", "Companion", "Getter", "Setter", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.t, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements KProperty<V> {

    /* renamed from: j */
    public static final b f40568j = new b(null);

    /* renamed from: k */
    private static final Object f40569k = new Object();

    /* renamed from: l */
    private final KDeclarationContainerImpl f40570l;

    /* renamed from: m */
    private final String f40571m;

    /* renamed from: n */
    private final String f40572n;

    /* renamed from: o */
    private final Object f40573o;

    /* renamed from: p */
    private final C9879a0.b<Field> f40574p;

    /* renamed from: q */
    private final C9879a0.a<InterfaceC10729t0> f40575q;

    /* compiled from: KPropertyImpl.kt */
    @Metadata(m32266d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "()V", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getDefaultCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "isBound", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "property", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KPropertyImpl;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.t$a */
    public static abstract class a<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements KFunction<ReturnType>, KProperty.a<PropertyType> {
        @Override // kotlin.reflect.p371y.internal.KCallableImpl
        /* renamed from: A */
        public KDeclarationContainerImpl getF37432k() {
            return mo32435n().getF37432k();
        }

        @Override // kotlin.reflect.p371y.internal.KCallableImpl
        /* renamed from: B */
        public Caller<?> mo32542B() {
            return null;
        }

        @Override // kotlin.reflect.p371y.internal.KCallableImpl
        /* renamed from: E */
        public boolean mo32545E() {
            return mo32435n().mo32545E();
        }

        /* renamed from: F */
        public abstract InterfaceC10727s0 mo37304F();

        /* renamed from: G */
        public abstract KPropertyImpl<PropertyType> mo32435n();

        @Override // kotlin.reflect.KCallable
        public boolean isSuspend() {
            return mo37304F().isSuspend();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "EXTENSION_PROPERTY_DELEGATE", "getEXTENSION_PROPERTY_DELEGATE", "()Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.t$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(m32266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016R\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "name", HttpUrl.FRAGMENT_ENCODE_SET, "getName", "()Ljava/lang/String;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.t$c */
    public static abstract class c<V> extends a<V, V> implements KProperty.b<V> {

        /* renamed from: j */
        static final /* synthetic */ KProperty<Object>[] f40576j = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(c.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: k */
        private final C9879a0.a f40577k = C9879a0.m32480d(new b(this));

        /* renamed from: l */
        private final C9879a0.b f40578l = C9879a0.m32478b(new a(this));

        /* compiled from: KPropertyImpl.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0003 \u0001\"\u0006\b\u0001\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "kotlin.jvm.PlatformType", "V", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.t$c$a */
        static final class a extends Lambda implements Function0<Caller<?>> {

            /* renamed from: f */
            final /* synthetic */ c<V> f40579f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? extends V> cVar) {
                super(0);
                this.f40579f = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Caller<?> invoke() {
                return C10502u.m37314b(this.f40579f, true);
            }
        }

        /* compiled from: KPropertyImpl.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0003 \u0001\"\u0006\b\u0001\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "kotlin.jvm.PlatformType", "V", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.t$c$b */
        static final class b extends Lambda implements Function0<InterfaceC10731u0> {

            /* renamed from: f */
            final /* synthetic */ c<V> f40580f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(c<? extends V> cVar) {
                super(0);
                this.f40580f = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10731u0 invoke() {
                InterfaceC10731u0 getter = this.f40580f.mo32435n().mo37304F().getGetter();
                return getter == null ? C10186c.m35786d(this.f40580f.mo32435n().mo37304F(), InterfaceC10620g.f40808c.m37735b()) : getter;
            }
        }

        @Override // kotlin.reflect.p371y.internal.KPropertyImpl.a
        /* renamed from: H, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public InterfaceC10731u0 mo37304F() {
            T tM32484c = this.f40577k.m32484c(this, f40576j[0]);
            C9801m.m32345e(tM32484c, "<get-descriptor>(...)");
            return (InterfaceC10731u0) tM32484c;
        }

        public boolean equals(Object other) {
            return (other instanceof c) && C9801m.m32341a(mo32435n(), ((c) other).mo32435n());
        }

        @Override // kotlin.reflect.KCallable
        /* renamed from: getName */
        public String getF40571m() {
            return "<get-" + mo32435n().getF40571m() + '>';
        }

        public int hashCode() {
            return mo32435n().hashCode();
        }

        public String toString() {
            return "getter of " + mo32435n();
        }

        @Override // kotlin.reflect.p371y.internal.KCallableImpl
        /* renamed from: z */
        public Caller<?> mo32547z() {
            T tM32484c = this.f40578l.m32484c(this, f40576j[1]);
            C9801m.m32345e(tM32484c, "<get-caller>(...)");
            return (Caller) tM32484c;
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016R\u001f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KMutableProperty$Setter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "name", HttpUrl.FRAGMENT_ENCODE_SET, "getName", "()Ljava/lang/String;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.t$d */
    public static abstract class d<V> extends a<V, C10775u> implements KMutableProperty.a<V> {

        /* renamed from: j */
        static final /* synthetic */ KProperty<Object>[] f40581j = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(d.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: k */
        private final C9879a0.a f40582k = C9879a0.m32480d(new b(this));

        /* renamed from: l */
        private final C9879a0.b f40583l = C9879a0.m32478b(new a(this));

        /* compiled from: KPropertyImpl.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0003\"\u0006\b\u0001\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "kotlin.jvm.PlatformType", "V", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.t$d$a */
        static final class a extends Lambda implements Function0<Caller<?>> {

            /* renamed from: f */
            final /* synthetic */ d<V> f40584f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d<V> dVar) {
                super(0);
                this.f40584f = dVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Caller<?> invoke() {
                return C10502u.m37314b(this.f40584f, false);
            }
        }

        /* compiled from: KPropertyImpl.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0003\"\u0006\b\u0001\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "kotlin.jvm.PlatformType", "V", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.t$d$b */
        static final class b extends Lambda implements Function0<InterfaceC10733v0> {

            /* renamed from: f */
            final /* synthetic */ d<V> f40585f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d<V> dVar) {
                super(0);
                this.f40585f = dVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10733v0 invoke() {
                InterfaceC10733v0 setter = this.f40585f.mo32435n().mo37304F().getSetter();
                if (setter != null) {
                    return setter;
                }
                InterfaceC10729t0 interfaceC10729t0Mo37304F = this.f40585f.mo32435n().mo37304F();
                InterfaceC10620g.a aVar = InterfaceC10620g.f40808c;
                return C10186c.m35787e(interfaceC10729t0Mo37304F, aVar.m37735b(), aVar.m37735b());
            }
        }

        @Override // kotlin.reflect.p371y.internal.KPropertyImpl.a
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public InterfaceC10733v0 mo37304F() {
            T tM32484c = this.f40582k.m32484c(this, f40581j[0]);
            C9801m.m32345e(tM32484c, "<get-descriptor>(...)");
            return (InterfaceC10733v0) tM32484c;
        }

        public boolean equals(Object other) {
            return (other instanceof d) && C9801m.m32341a(mo32435n(), ((d) other).mo32435n());
        }

        @Override // kotlin.reflect.KCallable
        /* renamed from: getName */
        public String getF40571m() {
            return "<set-" + mo32435n().getF40571m() + '>';
        }

        public int hashCode() {
            return mo32435n().hashCode();
        }

        public String toString() {
            return "setter of " + mo32435n();
        }

        @Override // kotlin.reflect.p371y.internal.KCallableImpl
        /* renamed from: z */
        public Caller<?> mo32547z() {
            T tM32484c = this.f40583l.m32484c(this, f40581j[1]);
            C9801m.m32345e(tM32484c, "<get-caller>(...)");
            return (Caller) tM32484c;
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "kotlin.jvm.PlatformType", "V", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.t$e */
    static final class e extends Lambda implements Function0<InterfaceC10729t0> {

        /* renamed from: f */
        final /* synthetic */ KPropertyImpl<V> f40586f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(KPropertyImpl<? extends V> kPropertyImpl) {
            super(0);
            this.f40586f = kPropertyImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10729t0 invoke() {
            return this.f40586f.getF37432k().m32626z(this.f40586f.getF40571m(), this.f40586f.getF40572n());
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "V", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.t$f */
    static final class f extends Lambda implements Function0<Field> {

        /* renamed from: f */
        final /* synthetic */ KPropertyImpl<V> f40587f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(KPropertyImpl<? extends V> kPropertyImpl) {
            super(0);
            this.f40587f = kPropertyImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Field invoke() {
            Class<?> enclosingClass;
            JvmPropertySignature jvmPropertySignatureM32520f = RuntimeTypeMapper.f37288a.m32520f(this.f40587f.mo37304F());
            if (!(jvmPropertySignatureM32520f instanceof JvmPropertySignature.c)) {
                if (jvmPropertySignatureM32520f instanceof JvmPropertySignature.a) {
                    return ((JvmPropertySignature.a) jvmPropertySignatureM32520f).getF37290a();
                }
                if ((jvmPropertySignatureM32520f instanceof JvmPropertySignature.b) || (jvmPropertySignatureM32520f instanceof JvmPropertySignature.d)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            JvmPropertySignature.c cVar = (JvmPropertySignature.c) jvmPropertySignatureM32520f;
            InterfaceC10729t0 interfaceC10729t0M32527b = cVar.getF37293a();
            AbstractC10116d.a aVarM34256d = C10121i.m34256d(C10121i.f38607a, cVar.getF37294b(), cVar.getF37296d(), cVar.getF37297e(), false, 8, null);
            if (aVarM34256d == null) {
                return null;
            }
            KPropertyImpl<V> kPropertyImpl = this.f40587f;
            if (C9974k.m33200e(interfaceC10729t0M32527b) || C10121i.m34257f(cVar.getF37294b())) {
                enclosingClass = kPropertyImpl.getF37432k().mo32283a().getEnclosingClass();
            } else {
                InterfaceC10609m interfaceC10609mMo32876b = interfaceC10729t0M32527b.mo32876b();
                enclosingClass = interfaceC10609mMo32876b instanceof InterfaceC10585e ? C9891g0.m32571p((InterfaceC10585e) interfaceC10609mMo32876b) : kPropertyImpl.getF37432k().mo32283a();
            }
            if (enclosingClass == null) {
                return null;
            }
            try {
                return enclosingClass.getDeclaredField(aVarM34256d.mo34249c());
            } catch (NoSuchFieldException unused) {
                return null;
            }
        }
    }

    private KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, InterfaceC10729t0 interfaceC10729t0, Object obj) {
        this.f40570l = kDeclarationContainerImpl;
        this.f40571m = str;
        this.f40572n = str2;
        this.f40573o = obj;
        C9879a0.b<Field> bVarM32478b = C9879a0.m32478b(new f(this));
        C9801m.m32345e(bVarM32478b, "lazy {\n        when (val…y -> null\n        }\n    }");
        this.f40574p = bVarM32478b;
        C9879a0.a<InterfaceC10729t0> aVarM32479c = C9879a0.m32479c(interfaceC10729t0, new e(this));
        C9801m.m32345e(aVarM32479c, "lazySoft(descriptorIniti…or(name, signature)\n    }");
        this.f40575q = aVarM32479c;
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: A, reason: from getter */
    public KDeclarationContainerImpl getF37432k() {
        return this.f40570l;
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: B */
    public Caller<?> mo32542B() {
        return getGetter().mo32542B();
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: E */
    public boolean mo32545E() {
        return !C9801m.m32341a(this.f40573o, AbstractC9781c.NO_RECEIVER);
    }

    /* renamed from: F */
    protected final Member m37298F() {
        if (!mo37304F().mo37025O()) {
            return null;
        }
        JvmPropertySignature jvmPropertySignatureM32520f = RuntimeTypeMapper.f37288a.m32520f(mo37304F());
        if (jvmPropertySignatureM32520f instanceof JvmPropertySignature.c) {
            JvmPropertySignature.c cVar = (JvmPropertySignature.c) jvmPropertySignatureM32520f;
            if (cVar.getF37295c().m34143E()) {
                C10112a.c cVarM34150z = cVar.getF37295c().m34150z();
                if (!cVarM34150z.m34116z() || !cVarM34150z.m34115y()) {
                    return null;
                }
                return getF37432k().m32625y(cVar.getF37296d().getString(cVarM34150z.m34114x()), cVar.getF37296d().getString(cVarM34150z.m34113w()));
            }
        }
        return m37302K();
    }

    /* renamed from: G */
    public final Object m37299G() {
        return C9902h.m32665a(this.f40573o, mo37304F());
    }

    /* renamed from: H */
    protected final Object m37300H(Member member, Object obj, Object obj2) throws IllegalPropertyDelegateAccessException {
        try {
            Object obj3 = f40569k;
            if ((obj == obj3 || obj2 == obj3) && mo37304F().mo37032m0() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objM37299G = mo32545E() ? m37299G() : obj;
            if (!(objM37299G != obj3)) {
                objM37299G = null;
            }
            if (!mo32545E()) {
                obj = obj2;
            }
            if (!(obj != obj3)) {
                obj = null;
            }
            if (member == null) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objM37299G);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, new Object[0]);
            }
            if (length == 1) {
                Method method = (Method) member;
                Object[] objArr = new Object[1];
                if (objM37299G == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    C9801m.m32345e(cls, "fieldOrMethod.parameterTypes[0]");
                    objM37299G = C9891g0.m32562g(cls);
                }
                objArr[0] = objM37299G;
                return method.invoke(null, objArr);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            Object[] objArr2 = new Object[2];
            objArr2[0] = objM37299G;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                C9801m.m32345e(cls2, "fieldOrMethod.parameterTypes[1]");
                obj = C9891g0.m32562g(cls2);
            }
            objArr2[1] = obj;
            return method2.invoke(null, objArr2);
        } catch (IllegalAccessException e2) {
            throw new IllegalPropertyDelegateAccessException(e2);
        }
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public InterfaceC10729t0 mo37304F() {
        InterfaceC10729t0 interfaceC10729t0Invoke = this.f40575q.invoke();
        C9801m.m32345e(interfaceC10729t0Invoke, "_descriptor()");
        return interfaceC10729t0Invoke;
    }

    /* renamed from: J */
    public abstract c<V> getGetter();

    /* renamed from: K */
    public final Field m37302K() {
        return this.f40574p.invoke();
    }

    /* renamed from: L, reason: from getter */
    public final String getF40572n() {
        return this.f40572n;
    }

    public boolean equals(Object other) {
        KPropertyImpl<?> kPropertyImplM32559d = C9891g0.m32559d(other);
        return kPropertyImplM32559d != null && C9801m.m32341a(getF37432k(), kPropertyImplM32559d.getF37432k()) && C9801m.m32341a(getF40571m(), kPropertyImplM32559d.getF40571m()) && C9801m.m32341a(this.f40572n, kPropertyImplM32559d.f40572n) && C9801m.m32341a(this.f40573o, kPropertyImplM32559d.f40573o);
    }

    @Override // kotlin.reflect.KCallable
    /* renamed from: getName, reason: from getter */
    public String getF40571m() {
        return this.f40571m;
    }

    public int hashCode() {
        return (((getF37432k().hashCode() * 31) + getF40571m().hashCode()) * 31) + this.f40572n.hashCode();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
        return mo37304F().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
        return mo37304F().mo37036s0();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return false;
    }

    public String toString() {
        return ReflectionObjectRenderer.f37273a.m32502g(mo37304F());
    }

    @Override // kotlin.reflect.p371y.internal.KCallableImpl
    /* renamed from: z */
    public Caller<?> mo32547z() {
        return getGetter().mo32547z();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
        C9801m.m32346f(kDeclarationContainerImpl, "container");
        C9801m.m32346f(str, "name");
        C9801m.m32346f(str2, RoomInstalled.SIGNATURE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, InterfaceC10729t0 interfaceC10729t0) {
        C9801m.m32346f(kDeclarationContainerImpl, "container");
        C9801m.m32346f(interfaceC10729t0, "descriptor");
        String strM35455k = interfaceC10729t0.getName().m35455k();
        C9801m.m32345e(strM35455k, "descriptor.name.asString()");
        this(kDeclarationContainerImpl, strM35455k, RuntimeTypeMapper.f37288a.m32520f(interfaceC10729t0).getF37298f(), interfaceC10729t0, AbstractC9781c.NO_RECEIVER);
    }
}
