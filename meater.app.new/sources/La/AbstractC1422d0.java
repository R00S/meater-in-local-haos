package La;

import La.a1;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1699l;
import Ra.InterfaceC1712z;
import Xa.C1822f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3846c;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.InterfaceC3851h;
import oa.C4153F;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: KDeclarationContainerImpl.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 K2\u00020\u0001:\u0004LMNOB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012*\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00152\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00112\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0006\u001a\u00020&H&¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'2\u0006\u0010\u0006\u001a\u00020&H&¢\u0006\u0004\b,\u0010*J\u0019\u0010.\u001a\u0004\u0018\u00010(2\u0006\u0010-\u001a\u00020!H&¢\u0006\u0004\b.\u0010/J)\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040'2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0004¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b<\u0010=J'\u0010?\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\b?\u0010@J\u001b\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\bA\u0010BJ\u001b\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\bC\u0010BR\u0018\u0010F\u001a\u0006\u0012\u0002\b\u00030\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020G0'8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006P"}, d2 = {"LLa/d0;", "Lkotlin/jvm/internal/h;", "<init>", "()V", "Ljava/lang/Class;", "", "name", "", "parameterTypes", "returnType", "", "isStaticDefault", "Ljava/lang/reflect/Method;", "N", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "R", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "Q", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "", "result", "valueParameters", "isConstructor", "Loa/F;", "w", "(Ljava/util/List;Ljava/util/List;Z)V", "desc", "parseReturnType", "LLa/d0$c;", "O", "(Ljava/lang/String;Z)LLa/d0$c;", "", "begin", "end", "P", "(Ljava/lang/String;II)Ljava/lang/Class;", "Lqb/f;", "", "LRa/Z;", "M", "(Lqb/f;)Ljava/util/Collection;", "LRa/z;", "I", "index", "J", "(I)LRa/Z;", "LAb/k;", "scope", "LLa/d0$d;", "belonginess", "LLa/A;", "K", "(LAb/k;LLa/d0$d;)Ljava/util/Collection;", "signature", "D", "(Ljava/lang/String;Ljava/lang/String;)LRa/Z;", "A", "(Ljava/lang/String;Ljava/lang/String;)LRa/z;", "C", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "isMember", "z", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "x", "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "y", "L", "()Ljava/lang/Class;", "methodOwner", "LRa/l;", "H", "()Ljava/util/Collection;", "constructorDescriptors", "B", "b", "d", "c", "a", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: La.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1422d0 implements InterfaceC3851h {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: C, reason: collision with root package name */
    private static final Class<?> f11187C = C3854k.class;

    /* renamed from: D, reason: collision with root package name */
    private static final Ub.k f11188D = new Ub.k("<v#(\\d+)>");

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LLa/d0$a;", "", "<init>", "()V", "LUb/k;", "LOCAL_PROPERTY_SIGNATURE", "LUb/k;", "a", "()LUb/k;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.d0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final Ub.k a() {
            return AbstractC1422d0.f11188D;
        }

        private Companion() {
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LLa/d0$b;", "", "<init>", "(LLa/d0;)V", "LWa/k;", "a", "LLa/a1$a;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.d0$b */
    public abstract class b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ Ia.m<Object>[] f11189c = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a1.a moduleData;

        public b() {
            this.moduleData = a1.b(new C1424e0(AbstractC1422d0.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Wa.k c(AbstractC1422d0 abstractC1422d0) {
            return Z0.a(abstractC1422d0.f());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Wa.k b() {
            T tB = this.moduleData.b(this, f11189c[0]);
            C3862t.f(tB, "getValue(...)");
            return (Wa.k) tB;
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"LLa/d0$c;", "", "", "Ljava/lang/Class;", "parameters", "returnType", "<init>", "(Ljava/util/List;Ljava/lang/Class;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Class;", "()Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.d0$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<Class<?>> parameters;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<?> returnType;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends Class<?>> parameters, Class<?> cls) {
            C3862t.g(parameters, "parameters");
            this.parameters = parameters;
            this.returnType = cls;
        }

        public final List<Class<?>> a() {
            return this.parameters;
        }

        public final Class<?> b() {
            return this.returnType;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LLa/d0$d;", "", "<init>", "(Ljava/lang/String;I)V", "LRa/b;", "member", "", "j", "(LRa/b;)Z", "B", "C", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.d0$d */
    protected static final class d {

        /* renamed from: B, reason: collision with root package name */
        public static final d f11194B = new d("DECLARED", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final d f11195C = new d("INHERITED", 1);

        /* renamed from: D, reason: collision with root package name */
        private static final /* synthetic */ d[] f11196D;

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f11197E;

        static {
            d[] dVarArrC = c();
            f11196D = dVarArrC;
            f11197E = C4929b.a(dVarArrC);
        }

        private d(String str, int i10) {
        }

        private static final /* synthetic */ d[] c() {
            return new d[]{f11194B, f11195C};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f11196D.clone();
        }

        public final boolean j(InterfaceC1689b member) {
            C3862t.g(member, "member");
            return member.i().c() == (this == f11194B);
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La/d0$e", "LLa/j;", "LRa/l;", "descriptor", "Loa/F;", "data", "LLa/A;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Loa/F;)LLa/A;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.d0$e */
    public static final class e extends C1433j {
        e(AbstractC1422d0 abstractC1422d0) {
            super(abstractC1422d0);
        }

        @Override // Ua.C1776o, Ra.InterfaceC1702o
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public A<?> i(InterfaceC1699l descriptor, C4153F data) {
            C3862t.g(descriptor, "descriptor");
            C3862t.g(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence B(InterfaceC1712z descriptor) {
        C3862t.g(descriptor, "descriptor");
        return sb.n.f49599k.O(descriptor) + " | " + f1.f11207a.g(descriptor).get_signature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int E(AbstractC1707u abstractC1707u, AbstractC1707u abstractC1707u2) {
        Integer numD = C1706t.d(abstractC1707u, abstractC1707u2);
        if (numD != null) {
            return numD.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int F(Ba.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence G(Ra.Z descriptor) {
        C3862t.g(descriptor, "descriptor");
        return sb.n.f49599k.O(descriptor) + " | " + f1.f11207a.f(descriptor).getString();
    }

    private final Method N(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z10) throws NoSuchMethodException, SecurityException {
        Method methodN;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodR = R(cls, str, clsArr, cls2);
        if (methodR != null) {
            return methodR;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (methodN = N(superclass, str, clsArr, cls2, z10)) != null) {
            return methodN;
        }
        Iterator itA = C3846c.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class<?> cls3 = (Class) itA.next();
            C3862t.d(cls3);
            Method methodN2 = N(cls3, str, clsArr, cls2, z10);
            if (methodN2 != null) {
                return methodN2;
            }
            if (z10) {
                Class<?> clsA = Wa.e.a(C1822f.j(cls3), cls3.getName() + "$DefaultImpls");
                if (clsA != null) {
                    clsArr[0] = cls3;
                    Method methodR2 = R(clsA, str, clsArr, cls2);
                    if (methodR2 != null) {
                        return methodR2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final c O(String desc, boolean parseReturnType) {
        int iX;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (true) {
            if (desc.charAt(i10) == ')') {
                return new c(arrayList, parseReturnType ? P(desc, i10 + 1, desc.length()) : null);
            }
            int i11 = i10;
            while (desc.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = desc.charAt(i11);
            if (Ub.n.K("VZCBSIFJD", cCharAt, false, 2, null)) {
                iX = i11 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new Y0("Unknown type prefix in the method signature: " + desc);
                }
                iX = Ub.n.X(desc, ';', i10, false, 4, null) + 1;
            }
            arrayList.add(P(desc, i10, iX));
            i10 = iX;
        }
    }

    private final Class<?> P(String desc, int begin, int end) throws ClassNotFoundException {
        char cCharAt = desc.charAt(begin);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderJ = C1822f.j(f());
            String strSubstring = desc.substring(begin + 1, end - 1);
            C3862t.f(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderJ.loadClass(Ub.n.B(strSubstring, '/', '.', false, 4, null));
            C3862t.f(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class<?> TYPE = Void.TYPE;
            C3862t.f(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return j1.f(P(desc, begin + 1, end));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new Y0("Unknown type prefix in the method signature: " + desc);
        }
    }

    private final Constructor<?> Q(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method R(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (C3862t.b(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            C3862t.f(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (C3862t.b(method.getName(), str) && C3862t.b(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final void w(List<Class<?>> result, List<? extends Class<?>> valueParameters, boolean isConstructor) {
        if (C3862t.b(kotlin.collections.r.w0(valueParameters), f11187C)) {
            valueParameters = valueParameters.subList(0, valueParameters.size() - 1);
        }
        result.addAll(valueParameters);
        int size = (valueParameters.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class<?> TYPE = Integer.TYPE;
            C3862t.f(TYPE, "TYPE");
            result.add(TYPE);
        }
        Class cls = isConstructor ? f11187C : Object.class;
        C3862t.d(cls);
        result.add(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Ra.InterfaceC1712z A(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: La.AbstractC1422d0.A(java.lang.String, java.lang.String):Ra.z");
    }

    public final Method C(String name, String desc) {
        Method methodN;
        C3862t.g(name, "name");
        C3862t.g(desc, "desc");
        if (C3862t.b(name, "<init>")) {
            return null;
        }
        c cVarO = O(desc, true);
        Class<?>[] clsArr = (Class[]) cVarO.a().toArray(new Class[0]);
        Class<?> clsB = cVarO.b();
        C3862t.d(clsB);
        Method methodN2 = N(L(), name, clsArr, clsB, false);
        if (methodN2 != null) {
            return methodN2;
        }
        if (!L().isInterface() || (methodN = N(Object.class, name, clsArr, clsB, false)) == null) {
            return null;
        }
        return methodN;
    }

    public final Ra.Z D(String name, String signature) {
        C3862t.g(name, "name");
        C3862t.g(signature, "signature");
        Ub.i iVarA = f11188D.a(signature);
        if (iVarA != null) {
            String str = iVarA.a().getMatch().b().get(1);
            Ra.Z zJ = J(Integer.parseInt(str));
            if (zJ != null) {
                return zJ;
            }
            throw new Y0("Local property #" + str + " not found in " + f());
        }
        qb.f fVarT = qb.f.t(name);
        C3862t.f(fVarT, "identifier(...)");
        Collection<Ra.Z> collectionM = M(fVarT);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionM) {
            if (C3862t.b(f1.f11207a.f((Ra.Z) obj).getString(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Y0("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (Ra.Z) kotlin.collections.r.J0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            AbstractC1707u visibility = ((Ra.Z) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = kotlin.collections.M.g(linkedHashMap, new C1416a0(Z.f11175B)).values();
        C3862t.f(collectionValues, "<get-values>(...)");
        List list = (List) kotlin.collections.r.t0(collectionValues);
        if (list.size() == 1) {
            C3862t.d(list);
            return (Ra.Z) kotlin.collections.r.j0(list);
        }
        qb.f fVarT2 = qb.f.t(name);
        C3862t.f(fVarT2, "identifier(...)");
        String strS0 = kotlin.collections.r.s0(M(fVarT2), "\n", null, null, 0, null, C1418b0.f11181B, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Property '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strS0.length() == 0 ? " no members found" : '\n' + strS0);
        throw new Y0(sb2.toString());
    }

    public abstract Collection<InterfaceC1699l> H();

    public abstract Collection<InterfaceC1712z> I(qb.f name);

    public abstract Ra.Z J(int index);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.util.Collection<La.A<?>> K(Ab.k r8, La.AbstractC1422d0.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.C3862t.g(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.C3862t.g(r9, r0)
            La.d0$e r0 = new La.d0$e
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = Ab.n.a.a(r8, r2, r2, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L20:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r8.next()
            Ra.m r3 = (Ra.InterfaceC1700m) r3
            boolean r4 = r3 instanceof Ra.InterfaceC1689b
            if (r4 == 0) goto L4e
            r4 = r3
            Ra.b r4 = (Ra.InterfaceC1689b) r4
            Ra.u r5 = r4.getVisibility()
            Ra.u r6 = Ra.C1706t.f15173h
            boolean r5 = kotlin.jvm.internal.C3862t.b(r5, r6)
            if (r5 != 0) goto L4e
            boolean r4 = r9.j(r4)
            if (r4 == 0) goto L4e
            oa.F r4 = oa.C4153F.f46609a
            java.lang.Object r3 = r3.v0(r0, r4)
            La.A r3 = (La.A) r3
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r3 == 0) goto L20
            r1.add(r3)
            goto L20
        L55:
            java.util.List r8 = kotlin.collections.r.W0(r1)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: La.AbstractC1422d0.K(Ab.k, La.d0$d):java.util.Collection");
    }

    protected Class<?> L() {
        Class<?> clsK = C1822f.k(f());
        return clsK == null ? f() : clsK;
    }

    public abstract Collection<Ra.Z> M(qb.f name);

    public final Constructor<?> x(String desc) {
        C3862t.g(desc, "desc");
        return Q(f(), O(desc, false).a());
    }

    public final Constructor<?> y(String desc) {
        C3862t.g(desc, "desc");
        Class<?> clsF = f();
        ArrayList arrayList = new ArrayList();
        w(arrayList, O(desc, false).a(), true);
        C4153F c4153f = C4153F.f46609a;
        return Q(clsF, arrayList);
    }

    public final Method z(String name, String desc, boolean isMember) {
        C3862t.g(name, "name");
        C3862t.g(desc, "desc");
        if (C3862t.b(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(f());
        }
        c cVarO = O(desc, true);
        w(arrayList, cVarO.a(), false);
        Class<?> clsL = L();
        String str = name + "$default";
        Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<?> clsB = cVarO.b();
        C3862t.d(clsB);
        return N(clsL, str, clsArr, clsB, isMember);
    }
}
