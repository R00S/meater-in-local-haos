package kotlin.reflect.p371y.internal;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10689f;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10703d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h;
import kotlin.reflect.p371y.internal.C9879a0;
import kotlin.reflect.p371y.internal.KDeclarationContainerImpl;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9941d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10086a;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10133l;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10141t;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10117e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10118f;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10121i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10153e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10313w;
import kotlin.text.C10546u;
import okhttp3.HttpUrl;

/* compiled from: KPackageImpl.kt */
@Metadata(m32266d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001,B\u001d\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\b2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012 \u000f*\b\u0018\u00010\u000eR\u00020\u00000\u000eR\u00020\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "jClass", "Ljava/lang/Class;", "usageModuleName", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Class;Ljava/lang/String;)V", "constructorDescriptors", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "kotlin.jvm.PlatformType", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "methodOwner", "getMethodOwner", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "getUsageModuleName", "()Ljava/lang/String;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", HttpUrl.FRAGMENT_ENCODE_SET, "getProperties", "hashCode", "toString", "Data", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.o, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* renamed from: i */
    private final Class<?> f40526i;

    /* renamed from: j */
    private final String f40527j;

    /* renamed from: k */
    private final C9879a0.b<a> f40528k;

    /* compiled from: KPackageImpl.kt */
    @Metadata(m32266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R%\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000eR/\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b \u0010!¨\u0006#"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "members", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getMembers", "()Ljava/util/Collection;", "members$delegate", "metadata", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "getMetadata", "()Lkotlin/Triple;", "metadata$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "multifileFacade", "Ljava/lang/Class;", "getMultifileFacade", "()Ljava/lang/Class;", "multifileFacade$delegate", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope$delegate", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.o$a */
    private final class a extends KDeclarationContainerImpl.b {

        /* renamed from: d */
        static final /* synthetic */ KProperty<Object>[] f40529d = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "metadata", "getMetadata()Lkotlin/Triple;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* renamed from: e */
        private final C9879a0.a f40530e;

        /* renamed from: f */
        private final C9879a0.a f40531f;

        /* renamed from: g */
        private final C9879a0.b f40532g;

        /* renamed from: h */
        private final C9879a0.b f40533h;

        /* renamed from: i */
        private final C9879a0.a f40534i;

        /* compiled from: KPackageImpl.kt */
        @Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.o$a$a, reason: collision with other inner class name */
        static final class C11576a extends Lambda implements Function0<C10689f> {

            /* renamed from: f */
            final /* synthetic */ KPackageImpl f40536f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11576a(KPackageImpl kPackageImpl) {
                super(0);
                this.f40536f = kPackageImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C10689f invoke() {
                return C10689f.f41143a.m38026a(this.f40536f.mo32283a());
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.o$a$b */
        static final class b extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KPackageImpl f40537f;

            /* renamed from: g */
            final /* synthetic */ a f40538g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(KPackageImpl kPackageImpl, a aVar) {
                super(0);
                this.f40537f = kPackageImpl;
                this.f40538g = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                return this.f40537f.m32619D(this.f40538g.m37274f(), KDeclarationContainerImpl.c.DECLARED);
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.o$a$c */
        static final class c extends Lambda implements Function0<Triple<? extends C10118f, ? extends C10133l, ? extends C10117e>> {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Triple<C10118f, C10133l, C10117e> invoke() {
                C10086a c10086aMo34025a;
                C10689f c10689fM37271c = a.this.m37271c();
                if (c10689fM37271c == null || (c10086aMo34025a = c10689fM37271c.mo34025a()) == null) {
                    return null;
                }
                String[] strArrM33911a = c10086aMo34025a.m33911a();
                String[] strArrM33917g = c10086aMo34025a.m33917g();
                if (strArrM33911a == null || strArrM33917g == null) {
                    return null;
                }
                Pair<C10118f, C10133l> pairM34264m = C10121i.m34264m(strArrM33911a, strArrM33917g);
                return new Triple<>(pairM34264m.m37646a(), pairM34264m.m37647b(), c10086aMo34025a.m33914d());
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.o$a$d */
        static final class d extends Lambda implements Function0<Class<?>> {

            /* renamed from: g */
            final /* synthetic */ KPackageImpl f40541g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(KPackageImpl kPackageImpl) {
                super(0);
                this.f40541g = kPackageImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Class<?> invoke() {
                C10086a c10086aMo34025a;
                C10689f c10689fM37271c = a.this.m37271c();
                String strM33915e = (c10689fM37271c == null || (c10086aMo34025a = c10689fM37271c.mo34025a()) == null) ? null : c10086aMo34025a.m33915e();
                if (strM33915e == null) {
                    return null;
                }
                if (strM33915e.length() > 0) {
                    return this.f40541g.mo32283a().getClassLoader().loadClass(C10546u.m37524z(strM33915e, '/', '.', false, 4, null));
                }
                return null;
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.o$a$e */
        static final class e extends Lambda implements Function0<InterfaceC10251h> {
            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10251h invoke() {
                C10689f c10689fM37271c = a.this.m37271c();
                return c10689fM37271c != null ? a.this.m32628a().m38033c().m38013a(c10689fM37271c) : InterfaceC10251h.b.f39671b;
            }
        }

        public a() {
            super();
            this.f40530e = C9879a0.m32480d(new C11576a(KPackageImpl.this));
            this.f40531f = C9879a0.m32480d(new e());
            this.f40532g = C9879a0.m32478b(new d(KPackageImpl.this));
            this.f40533h = C9879a0.m32478b(new c());
            this.f40534i = C9879a0.m32480d(new b(KPackageImpl.this, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public final C10689f m37271c() {
            return (C10689f) this.f40530e.m32484c(this, f40529d[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public final Triple<C10118f, C10133l, C10117e> m37272d() {
            return (Triple) this.f40533h.m32484c(this, f40529d[3]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public final Class<?> m37273e() {
            return (Class) this.f40532g.m32484c(this, f40529d[2]);
        }

        /* renamed from: f */
        public final InterfaceC10251h m37274f() {
            T tM32484c = this.f40531f.m32484c(this, f40529d[1]);
            C9801m.m32345e(tM32484c, "<get-scope>(...)");
            return (InterfaceC10251h) tM32484c;
        }
    }

    /* compiled from: KPackageImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012 \u0003*\b\u0018\u00010\u0001R\u00020\u00020\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KPackageImpl;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.o$b */
    static final class b extends Lambda implements Function0<a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return KPackageImpl.this.new a();
        }
    }

    /* compiled from: KPackageImpl.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.o$c */
    /* synthetic */ class c extends C9793i implements Function2<C10313w, C10135n, InterfaceC10729t0> {

        /* renamed from: h */
        public static final c f40544h = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(C10313w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10729t0 invoke(C10313w c10313w, C10135n c10135n) {
            C9801m.m32346f(c10313w, "p0");
            C9801m.m32346f(c10135n, "p1");
            return c10313w.m36488l(c10135n);
        }
    }

    public KPackageImpl(Class<?> cls, String str) {
        C9801m.m32346f(cls, "jClass");
        this.f40526i = cls;
        this.f40527j = str;
        C9879a0.b<a> bVarM32478b = C9879a0.m32478b(new b());
        C9801m.m32345e(bVarM32478b, "lazy { Data() }");
        this.f40528k = bVarM32478b;
    }

    /* renamed from: M */
    private final InterfaceC10251h m37269M() {
        return this.f40528k.invoke().m37274f();
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: A */
    public Collection<InterfaceC10606l> mo32487A() {
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: B */
    public Collection<InterfaceC10738y> mo32488B(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        return m37269M().mo33311a(c10163f, EnumC9941d.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: C */
    public InterfaceC10729t0 mo32489C(int i2) {
        Triple<C10118f, C10133l, C10117e> tripleM37272d = this.f40528k.invoke().m37272d();
        if (tripleM37272d == null) {
            return null;
        }
        C10118f c10118fM37658a = tripleM37272d.m37658a();
        C10133l c10133lM37659b = tripleM37272d.m37659b();
        C10117e c10117eM37660c = tripleM37272d.m37660c();
        AbstractC10749h.f<C10133l, List<C10135n>> fVar = C10112a.f38504n;
        C9801m.m32345e(fVar, "packageLocalVariable");
        C10135n c10135n = (C10135n) C10153e.m35381b(c10133lM37659b, fVar, i2);
        if (c10135n == null) {
            return null;
        }
        Class<?> clsMo32283a = mo32283a();
        C10141t c10141tM34797V = c10133lM37659b.m34797V();
        C9801m.m32345e(c10141tM34797V, "packageProto.typeTable");
        return (InterfaceC10729t0) C9891g0.m32563h(clsMo32283a, c10135n, c10118fM37658a, new C10155g(c10141tM34797V), c10117eM37660c, c.f40544h);
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: E */
    protected Class<?> mo32620E() {
        Class<?> clsM37273e = this.f40528k.invoke().m37273e();
        return clsM37273e == null ? mo32283a() : clsM37273e;
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: F */
    public Collection<InterfaceC10729t0> mo32490F(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        return m37269M().mo33313c(c10163f, EnumC9941d.FROM_REFLECTION);
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    /* renamed from: a */
    public Class<?> mo32283a() {
        return this.f40526i;
    }

    public boolean equals(Object other) {
        return (other instanceof KPackageImpl) && C9801m.m32341a(mo32283a(), ((KPackageImpl) other).mo32283a());
    }

    public int hashCode() {
        return mo32283a().hashCode();
    }

    public String toString() {
        return "file class " + C10703d.m38069a(mo32283a()).m35409b();
    }
}
