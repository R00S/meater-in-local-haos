package kotlin.reflect.p371y.internal;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.collections.C10782c0;
import kotlin.collections.C10808p0;
import kotlin.collections.C10813s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10688e;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10694k;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10703d;
import kotlin.reflect.p371y.internal.C9879a0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import okhttp3.HttpUrl;

/* compiled from: KDeclarationContainerImpl.kt */
@Metadata(m32266d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\n\b \u0018\u0000 <2\u00020\u0001:\u0003<=>B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0013J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\u0006\u0010\u0019\u001a\u00020\"H&J\u0012\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020%H&J\"\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0\u00042\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0004J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020 0\u00042\u0006\u0010\u0019\u001a\u00020\"H&J\u001a\u0010-\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0.2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010/\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u00100\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020%H\u0002JE\u00103\u001a\u0004\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0019\u001a\u00020\u00112\u0010\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t052\n\u00106\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u00107\u001a\u00020\u0013H\u0002¢\u0006\u0002\u00108J(\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0015*\u0006\u0012\u0002\b\u00030\t2\u0010\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0.H\u0002J=\u0010:\u001a\u0004\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0019\u001a\u00020\u00112\u0010\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t052\n\u00106\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010;R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006?"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "()V", "constructorDescriptors", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "addParametersAndMasks", HttpUrl.FRAGMENT_ENCODE_SET, "result", HttpUrl.FRAGMENT_ENCODE_SET, "desc", HttpUrl.FRAGMENT_ENCODE_SET, "isConstructor", HttpUrl.FRAGMENT_ENCODE_SET, "findConstructorBySignature", "Ljava/lang/reflect/Constructor;", "findDefaultConstructor", "findDefaultMethod", "Ljava/lang/reflect/Method;", "name", "isMember", "findFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", RoomInstalled.SIGNATURE, "findMethodBySignature", "findPropertyDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "index", HttpUrl.FRAGMENT_ENCODE_SET, "getMembers", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "belonginess", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "getProperties", "loadParameterTypes", HttpUrl.FRAGMENT_ENCODE_SET, "loadReturnType", "parseType", "begin", "end", "lookupMethod", "parameterTypes", HttpUrl.FRAGMENT_ENCODE_SET, "returnType", "isStaticDefault", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "tryGetConstructor", "tryGetMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "Companion", "Data", "MemberBelonginess", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.i, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {

    /* renamed from: f */
    public static final a f37372f = new a(null);

    /* renamed from: g */
    private static final Class<?> f37373g = Class.forName("kotlin.a0.d.g");

    /* renamed from: h */
    private static final Regex f37374h = new Regex("<v#(\\d+)>");

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection", "()Lkotlin/text/Regex;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final Regex m32627a() {
            return KDeclarationContainerImpl.f37374h;
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b¦\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i$b */
    public abstract class b {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f37375a = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: b */
        private final C9879a0.a f37376b;

        /* compiled from: KDeclarationContainerImpl.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.i$b$a */
        static final class a extends Lambda implements Function0<C10694k> {

            /* renamed from: f */
            final /* synthetic */ KDeclarationContainerImpl f37378f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(KDeclarationContainerImpl kDeclarationContainerImpl) {
                super(0);
                this.f37378f = kDeclarationContainerImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C10694k invoke() {
                return C10507z.m37330a(this.f37378f.mo32283a());
            }
        }

        public b() {
            this.f37376b = C9879a0.m32480d(new a(KDeclarationContainerImpl.this));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final C10694k m32628a() {
            T tM32484c = this.f37376b.m32484c(this, f37375a[0]);
            C9801m.m32345e(tM32484c, "<get-moduleData>(...)");
            return (C10694k) tM32484c;
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "accept", HttpUrl.FRAGMENT_ENCODE_SET, "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i$c */
    protected enum c {
        DECLARED,
        INHERITED;

        /* renamed from: k */
        public final boolean m32631k(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "member");
            return interfaceC10576b.mo37030i().m37667g() == (this == DECLARED);
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i$d */
    static final class d extends Lambda implements Function1<InterfaceC10738y, CharSequence> {

        /* renamed from: f */
        public static final d f37382f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC10738y interfaceC10738y) {
            C9801m.m32346f(interfaceC10738y, "descriptor");
            return AbstractC10172c.f39380j.mo35500q(interfaceC10738y) + " | " + RuntimeTypeMapper.f37288a.m32521g(interfaceC10738y).getF37287b();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i$e */
    static final class e extends Lambda implements Function1<InterfaceC10729t0, CharSequence> {

        /* renamed from: f */
        public static final e f37383f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC10729t0 interfaceC10729t0) {
            C9801m.m32346f(interfaceC10729t0, "descriptor");
            return AbstractC10172c.f39380j.mo35500q(interfaceC10729t0) + " | " + RuntimeTypeMapper.f37288a.m32520f(interfaceC10729t0).getF37298f();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "first", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "kotlin.jvm.PlatformType", "second", "compare"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i$f */
    static final class f<T> implements Comparator {

        /* renamed from: f */
        public static final f<T> f37384f = new f<>();

        f() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(AbstractC10730u abstractC10730u, AbstractC10730u abstractC10730u2) {
            Integer numM38129d = C10728t.m38129d(abstractC10730u, abstractC10730u2);
            if (numM38129d == null) {
                return 0;
            }
            return numM38129d.intValue();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, m32267d2 = {"kotlin/reflect/jvm/internal/KDeclarationContainerImpl$getMembers$visitor$1", "Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;", "visitConstructorDescriptor", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "data", HttpUrl.FRAGMENT_ENCODE_SET, "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i$g */
    public static final class g extends CreateKCallableVisitor {
        g(KDeclarationContainerImpl kDeclarationContainerImpl) {
            super(kDeclarationContainerImpl);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10659l, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public KCallableImpl<?> mo32635h(InterfaceC10606l interfaceC10606l, C10775u c10775u) {
            C9801m.m32346f(interfaceC10606l, "descriptor");
            C9801m.m32346f(c10775u, "data");
            throw new IllegalStateException("No constructors should appear here: " + interfaceC10606l);
        }
    }

    /* renamed from: G */
    private final List<Class<?>> m32611G(String str) {
        int iM37556V;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char cCharAt = str.charAt(i3);
            if (C10547v.m37536I("VZCBSIFJD", cCharAt, false, 2, null)) {
                iM37556V = i3 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + str);
                }
                iM37556V = C10547v.m37556V(str, ';', i2, false, 4, null) + 1;
            }
            arrayList.add(m32614J(str, i2, iM37556V));
            i2 = iM37556V;
        }
        return arrayList;
    }

    /* renamed from: H */
    private final Class<?> m32612H(String str) {
        return m32614J(str, C10547v.m37556V(str, ')', 0, false, 6, null) + 1, str.length());
    }

    /* renamed from: I */
    private final Method m32613I(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) throws NoSuchMethodException, SecurityException {
        Method methodM32613I;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodM32616L = m32616L(cls, str, clsArr, cls2);
        if (methodM32616L != null) {
            return methodM32616L;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (methodM32613I = m32613I(superclass, str, clsArr, cls2, z)) != null) {
            return methodM32613I;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        C9801m.m32345e(interfaces, "interfaces");
        for (Class<?> cls3 : interfaces) {
            C9801m.m32345e(cls3, "superInterface");
            Method methodM32613I2 = m32613I(cls3, str, clsArr, cls2, z);
            if (methodM32613I2 != null) {
                return methodM32613I2;
            }
            if (z) {
                Class<?> clsM38024a = C10688e.m38024a(C10703d.m38073e(cls3), cls3.getName() + "$DefaultImpls");
                if (clsM38024a != null) {
                    clsArr[0] = cls3;
                    Method methodM32616L2 = m32616L(clsM38024a, str, clsArr, cls2);
                    if (methodM32616L2 != null) {
                        return methodM32616L2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: J */
    private final Class<?> m32614J(String str, int i2, int i3) throws ClassNotFoundException {
        char cCharAt = str.charAt(i2);
        if (cCharAt == 'L') {
            ClassLoader classLoaderM38073e = C10703d.m38073e(mo32283a());
            String strSubstring = str.substring(i2 + 1, i3 - 1);
            C9801m.m32345e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> clsLoadClass = classLoaderM38073e.loadClass(C10546u.m37524z(strSubstring, '/', '.', false, 4, null));
            C9801m.m32345e(clsLoadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            return C9891g0.m32561f(m32614J(str, i2 + 1, i3));
        }
        if (cCharAt == 'V') {
            Class<?> cls = Void.TYPE;
            C9801m.m32345e(cls, "TYPE");
            return cls;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + str);
    }

    /* renamed from: K */
    private final Constructor<?> m32615K(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Object[] array = list.toArray(new Class[0]);
            C9801m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Class[] clsArr = (Class[]) array;
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: L */
    private final Method m32616L(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (C9801m.m32341a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            C9801m.m32345e(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (C9801m.m32341a(method.getName(), str) && C9801m.m32341a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: f */
    private final void m32618f(List<Class<?>> list, String str, boolean z) {
        list.addAll(m32611G(str));
        int size = ((r5.size() + 32) - 1) / 32;
        for (int i2 = 0; i2 < size; i2++) {
            Class<?> cls = Integer.TYPE;
            C9801m.m32345e(cls, "TYPE");
            list.add(cls);
        }
        if (!z) {
            list.add(Object.class);
            return;
        }
        Class<?> cls2 = f37373g;
        list.remove(cls2);
        C9801m.m32345e(cls2, "DEFAULT_CONSTRUCTOR_MARKER");
        list.add(cls2);
    }

    /* renamed from: A */
    public abstract Collection<InterfaceC10606l> mo32487A();

    /* renamed from: B */
    public abstract Collection<InterfaceC10738y> mo32488B(C10163f c10163f);

    /* renamed from: C */
    public abstract InterfaceC10729t0 mo32489C(int i2);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.util.Collection<kotlin.reflect.p371y.internal.KCallableImpl<?>> m32619D(kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h r8, kotlin.reflect.p371y.internal.KDeclarationContainerImpl.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.C9801m.m32346f(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.C9801m.m32346f(r9, r0)
            kotlin.f0.y.e.i$g r0 = new kotlin.f0.y.e.i$g
            r0.<init>(r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k.a.m36162a(r8, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
            if (r4 == 0) goto L4c
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.b r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b) r4
            kotlin.reflect.jvm.internal.impl.descriptors.u r5 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.u r6 = kotlin.reflect.jvm.internal.impl.descriptors.C10728t.f41223h
            boolean r5 = kotlin.jvm.internal.C9801m.m32341a(r5, r6)
            if (r5 != 0) goto L4c
            boolean r4 = r9.m32631k(r4)
            if (r4 == 0) goto L4c
            kotlin.u r4 = kotlin.C10775u.f41439a
            java.lang.Object r3 = r3.mo37017L(r0, r4)
            kotlin.f0.y.e.f r3 = (kotlin.reflect.p371y.internal.KCallableImpl) r3
            goto L4d
        L4c:
            r3 = r1
        L4d:
            if (r3 == 0) goto L1e
            r2.add(r3)
            goto L1e
        L53:
            java.util.List r8 = kotlin.collections.C10813s.m38813E0(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.KDeclarationContainerImpl.m32619D(kotlin.f0.y.e.j0.i.w.h, kotlin.f0.y.e.i$c):java.util.Collection");
    }

    /* renamed from: E */
    protected Class<?> mo32620E() {
        Class<?> clsM38074f = C10703d.m38074f(mo32283a());
        return clsM38074f == null ? mo32283a() : clsM38074f;
    }

    /* renamed from: F */
    public abstract Collection<InterfaceC10729t0> mo32490F(C10163f c10163f);

    /* renamed from: u */
    public final Constructor<?> m32621u(String str) {
        C9801m.m32346f(str, "desc");
        return m32615K(mo32283a(), m32611G(str));
    }

    /* renamed from: v */
    public final Constructor<?> m32622v(String str) {
        C9801m.m32346f(str, "desc");
        Class<?> clsMo32283a = mo32283a();
        ArrayList arrayList = new ArrayList();
        m32618f(arrayList, str, true);
        C10775u c10775u = C10775u.f41439a;
        return m32615K(clsMo32283a, arrayList);
    }

    /* renamed from: w */
    public final Method m32623w(String str, String str2, boolean z) {
        C9801m.m32346f(str, "name");
        C9801m.m32346f(str2, "desc");
        if (C9801m.m32341a(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(mo32283a());
        }
        m32618f(arrayList, str2, false);
        Class<?> clsMo32620E = mo32620E();
        String str3 = str + "$default";
        Object[] array = arrayList.toArray(new Class[0]);
        C9801m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return m32613I(clsMo32620E, str3, (Class[]) array, m32612H(str2), z);
    }

    /* renamed from: x */
    public final InterfaceC10738y m32624x(String str, String str2) {
        Collection<InterfaceC10738y> collectionMo32488B;
        C9801m.m32346f(str, "name");
        C9801m.m32346f(str2, RoomInstalled.SIGNATURE);
        if (C9801m.m32341a(str, "<init>")) {
            collectionMo32488B = C10782c0.m38569E0(mo32487A());
        } else {
            C10163f c10163fM35454x = C10163f.m35454x(str);
            C9801m.m32345e(c10163fM35454x, "identifier(name)");
            collectionMo32488B = mo32488B(c10163fM35454x);
        }
        Collection<InterfaceC10738y> collection = collectionMo32488B;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (C9801m.m32341a(RuntimeTypeMapper.f37288a.m32521g((InterfaceC10738y) obj).getF37287b(), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            return (InterfaceC10738y) C10813s.m38866s0(arrayList);
        }
        String strM38599e0 = C10782c0.m38599e0(collection, "\n", null, null, 0, null, d.f37382f, 30, null);
        StringBuilder sb = new StringBuilder();
        sb.append("Function '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(str2);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        sb.append(strM38599e0.length() == 0 ? " no members found" : '\n' + strM38599e0);
        throw new KotlinReflectionInternalError(sb.toString());
    }

    /* renamed from: y */
    public final Method m32625y(String str, String str2) throws NoSuchMethodException, SecurityException {
        Method methodM32613I;
        C9801m.m32346f(str, "name");
        C9801m.m32346f(str2, "desc");
        if (C9801m.m32341a(str, "<init>")) {
            return null;
        }
        Object[] array = m32611G(str2).toArray(new Class[0]);
        C9801m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Class<?>[] clsArr = (Class[]) array;
        Class<?> clsM32612H = m32612H(str2);
        Method methodM32613I2 = m32613I(mo32620E(), str, clsArr, clsM32612H, false);
        if (methodM32613I2 != null) {
            return methodM32613I2;
        }
        if (!mo32620E().isInterface() || (methodM32613I = m32613I(Object.class, str, clsArr, clsM32612H, false)) == null) {
            return null;
        }
        return methodM32613I;
    }

    /* renamed from: z */
    public final InterfaceC10729t0 m32626z(String str, String str2) {
        C9801m.m32346f(str, "name");
        C9801m.m32346f(str2, RoomInstalled.SIGNATURE);
        MatchResult matchResultM37437a = f37374h.m37437a(str2);
        if (matchResultM37437a != null) {
            String str3 = matchResultM37437a.mo37424a().getF40671a().mo37425b().get(1);
            InterfaceC10729t0 interfaceC10729t0Mo32489C = mo32489C(Integer.parseInt(str3));
            if (interfaceC10729t0Mo32489C != null) {
                return interfaceC10729t0Mo32489C;
            }
            throw new KotlinReflectionInternalError("Local property #" + str3 + " not found in " + mo32283a());
        }
        C10163f c10163fM35454x = C10163f.m35454x(str);
        C9801m.m32345e(c10163fM35454x, "identifier(name)");
        Collection<InterfaceC10729t0> collectionMo32490F = mo32490F(c10163fM35454x);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo32490F) {
            if (C9801m.m32341a(RuntimeTypeMapper.f37288a.m32520f((InterfaceC10729t0) obj).getF37298f(), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new KotlinReflectionInternalError("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (InterfaceC10729t0) C10813s.m38866s0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            AbstractC10730u visibility = ((InterfaceC10729t0) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = C10808p0.m38796h(linkedHashMap, f.f37384f).values();
        C9801m.m32345e(collectionValues, "properties\n             …\n                }.values");
        List list = (List) C10813s.m38843f0(collectionValues);
        if (list.size() == 1) {
            C9801m.m32345e(list, "mostVisibleProperties");
            return (InterfaceC10729t0) C10813s.m38830U(list);
        }
        C10163f c10163fM35454x2 = C10163f.m35454x(str);
        C9801m.m32345e(c10163fM35454x2, "identifier(name)");
        String strM38599e0 = C10782c0.m38599e0(mo32490F(c10163fM35454x2), "\n", null, null, 0, null, e.f37383f, 30, null);
        StringBuilder sb = new StringBuilder();
        sb.append("Property '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(str2);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        sb.append(strM38599e0.length() == 0 ? " no members found" : '\n' + strM38599e0);
        throw new KotlinReflectionInternalError(sb.toString());
    }
}
