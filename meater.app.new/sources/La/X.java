package La;

import Ab.n;
import Fb.C1032m;
import Hb.AbstractC1082f0;
import La.AbstractC1422d0;
import La.a1;
import Ra.C1711y;
import Ra.EnumC1693f;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1699l;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ua.C1772k;
import Ua.C1777p;
import Xa.C1822f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kb.C3816a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3859p;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import lb.C3923c;
import lb.C3934n;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import ob.C4176a;
import tb.C4597i;
import xb.C5087e;

/* compiled from: KClassImpl.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001KB\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R'\u00104\u001a\u0012\u0012\u000e\u0012\f0/R\b\u0012\u0004\u0012\u00028\u00000\u00000.8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002050\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u0010:\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010)R\u0016\u0010<\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010)R\u0014\u0010?\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010G¨\u0006L"}, d2 = {"LLa/X;", "", "T", "LLa/d0;", "LIa/d;", "LLa/Y;", "LLa/X0;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lqb/b;", "classId", "LWa/k;", "moduleData", "LRa/e;", "W", "(Lqb/b;LWa/k;)LRa/e;", "V", "Lqb/f;", "name", "", "LRa/Z;", "M", "(Lqb/f;)Ljava/util/Collection;", "LRa/z;", "I", "", "index", "J", "(I)LRa/Z;", "value", "", "s", "(Ljava/lang/Object;)Z", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "E", "Ljava/lang/Class;", "f", "()Ljava/lang/Class;", "Loa/i;", "LLa/X$a;", "F", "Loa/i;", "Z", "()Loa/i;", "data", "LRa/l;", "H", "()Ljava/util/Collection;", "constructorDescriptors", "r", "simpleName", "q", "qualifiedName", "o", "()Z", "isValue", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "LAb/k;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "a", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class X<T> extends AbstractC1422d0 implements Ia.d<T>, Y, X0 {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Class<T> jClass;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i<X<T>.a> data;

    /* compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u0018R-\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001d8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R%\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010!R#\u0010.\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010#\u001a\u0004\b+\u0010,R!\u00102\u001a\b\u0012\u0004\u0012\u00020/0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\f\u001a\u0004\b1\u0010\u0014R!\u00106\u001a\b\u0012\u0004\u0012\u0002030\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b5\u0010\u0014R)\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000%0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\f\u001a\u0004\b8\u0010\u0014R%\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\f\u001a\u0004\b<\u0010!R%\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\f\u001a\u0004\b?\u0010!R%\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\f\u001a\u0004\bB\u0010!R%\u0010F\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\f\u001a\u0004\bE\u0010!R%\u0010I\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\f\u001a\u0004\bH\u0010!R%\u0010L\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\f\u001a\u0004\bK\u0010!R%\u0010O\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\f\u001a\u0004\bN\u0010!R%\u0010R\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u0010\f\u001a\u0004\bQ\u0010!¨\u0006S"}, d2 = {"LLa/X$a;", "LLa/d0$b;", "LLa/d0;", "<init>", "(LLa/X;)V", "Ljava/lang/Class;", "jClass", "", "B", "(Ljava/lang/Class;)Ljava/lang/String;", "LRa/e;", "d", "LLa/a1$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "e", "getAnnotations", "()Ljava/util/List;", "annotations", "f", "P", "()Ljava/lang/String;", "simpleName", "g", "O", "qualifiedName", "", "LIa/h;", "h", "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "LIa/d;", "i", "getNestedClasses", "nestedClasses", "j", "Loa/i;", "getObjectInstance", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "LIa/r;", "k", "getTypeParameters", "typeParameters", "LIa/q;", "l", "getSupertypes", "supertypes", "m", "getSealedSubclasses", "sealedSubclasses", "LLa/A;", "n", "J", "declaredNonStaticMembers", "o", "K", "declaredStaticMembers", "p", "M", "inheritedNonStaticMembers", "q", "N", "inheritedStaticMembers", "r", "H", "allNonStaticMembers", "s", "I", "allStaticMembers", "t", "getDeclaredMembers", "declaredMembers", "u", "getAllMembers", "allMembers", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends AbstractC1422d0.b {

        /* renamed from: w, reason: collision with root package name */
        static final /* synthetic */ Ia.m<Object>[] f11153w = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "annotations", "getAnnotations()Ljava/util/List;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final a1.a descriptor;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final a1.a annotations;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final a1.a simpleName;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final a1.a qualifiedName;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final a1.a constructors;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final a1.a nestedClasses;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4164i objectInstance;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final a1.a typeParameters;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final a1.a supertypes;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final a1.a sealedSubclasses;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final a1.a declaredNonStaticMembers;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final a1.a declaredStaticMembers;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final a1.a inheritedNonStaticMembers;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final a1.a inheritedStaticMembers;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final a1.a allNonStaticMembers;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final a1.a allStaticMembers;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final a1.a declaredMembers;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final a1.a allMembers;

        public a() {
            super();
            this.descriptor = a1.b(new C(X.this));
            this.annotations = a1.b(new N(this));
            this.simpleName = a1.b(new O(X.this, this));
            this.qualifiedName = a1.b(new P(X.this));
            this.constructors = a1.b(new Q(X.this));
            this.nestedClasses = a1.b(new S(this));
            this.objectInstance = C4165j.b(EnumC4168m.f46627C, new T(this, X.this));
            this.typeParameters = a1.b(new U(this, X.this));
            this.supertypes = a1.b(new V(this, X.this));
            this.sealedSubclasses = a1.b(new W(this));
            this.declaredNonStaticMembers = a1.b(new D(X.this));
            this.declaredStaticMembers = a1.b(new E(X.this));
            this.inheritedNonStaticMembers = a1.b(new F(X.this));
            this.inheritedStaticMembers = a1.b(new G(X.this));
            this.allNonStaticMembers = a1.b(new H(this));
            this.allStaticMembers = a1.b(new I(this));
            this.declaredMembers = a1.b(new J(this));
            this.allMembers = a1.b(new K(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List A(a aVar) {
            return j1.e(aVar.L());
        }

        private final String B(Class<?> jClass) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                C3862t.d(simpleName);
                return Ub.n.I0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                C3862t.d(simpleName);
                return Ub.n.H0(simpleName, '$', null, 2, null);
            }
            C3862t.d(simpleName);
            return Ub.n.I0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List C(X x10) {
            Collection<InterfaceC1699l> collectionH = x10.H();
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collectionH, 10));
            Iterator<T> it = collectionH.iterator();
            while (it.hasNext()) {
                arrayList.add(new C1432i0(x10, (InterfaceC1699l) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List D(a aVar) {
            return kotlin.collections.r.F0(aVar.J(), aVar.K());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection E(X x10) {
            return x10.K(x10.b0(), AbstractC1422d0.d.f11194B);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection F(X x10) {
            return x10.K(x10.c0(), AbstractC1422d0.d.f11194B);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC1692e G(X x10) {
            qb.b bVarY = x10.Y();
            Wa.k kVarB = x10.Z().getValue().b();
            InterfaceC1692e interfaceC1692eB = (bVarY.i() && x10.f().isAnnotationPresent(Metadata.class)) ? kVarB.a().b(bVarY) : C1711y.b(kVarB.b(), bVarY);
            return interfaceC1692eB == null ? x10.W(bVarY, kVarB) : interfaceC1692eB;
        }

        private final Collection<A<?>> K() {
            T tB = this.declaredStaticMembers.b(this, f11153w[10]);
            C3862t.f(tB, "getValue(...)");
            return (Collection) tB;
        }

        private final Collection<A<?>> M() {
            T tB = this.inheritedNonStaticMembers.b(this, f11153w[11]);
            C3862t.f(tB, "getValue(...)");
            return (Collection) tB;
        }

        private final Collection<A<?>> N() {
            T tB = this.inheritedStaticMembers.b(this, f11153w[12]);
            C3862t.f(tB, "getValue(...)");
            return (Collection) tB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection Q(X x10) {
            return x10.K(x10.b0(), AbstractC1422d0.d.f11195C);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection R(X x10) {
            return x10.K(x10.c0(), AbstractC1422d0.d.f11195C);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List S(a aVar) {
            Collection collectionA = n.a.a(aVar.L().x0(), null, null, 3, null);
            ArrayList<InterfaceC1700m> arrayList = new ArrayList();
            for (T t10 : collectionA) {
                if (!C4597i.B((InterfaceC1700m) t10)) {
                    arrayList.add(t10);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC1700m interfaceC1700m : arrayList) {
                InterfaceC1692e interfaceC1692e = interfaceC1700m instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1700m : null;
                Class<?> clsQ = interfaceC1692e != null ? j1.q(interfaceC1692e) : null;
                X x10 = clsQ != null ? new X(clsQ) : null;
                if (x10 != null) {
                    arrayList2.add(x10);
                }
            }
            return arrayList2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object T(a aVar, X x10) throws IllegalAccessException, IllegalArgumentException {
            InterfaceC1692e interfaceC1692eL = aVar.L();
            if (interfaceC1692eL.i() != EnumC1693f.f15148H) {
                return null;
            }
            Object obj = ((!interfaceC1692eL.y() || Oa.e.a(Oa.d.f13314a, interfaceC1692eL)) ? x10.f().getDeclaredField("INSTANCE") : x10.f().getEnclosingClass().getDeclaredField(interfaceC1692eL.getName().j())).get(null);
            C3862t.e(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance_delegate$lambda$11");
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String U(X x10) {
            if (x10.f().isAnonymousClass()) {
                return null;
            }
            qb.b bVarY = x10.Y();
            if (bVarY.i()) {
                return null;
            }
            return bVarY.a().b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List V(a aVar) {
            Collection<InterfaceC1692e> collectionJ = aVar.L().J();
            C3862t.f(collectionJ, "getSealedSubclasses(...)");
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1692e interfaceC1692e : collectionJ) {
                C3862t.e(interfaceC1692e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class<?> clsQ = j1.q(interfaceC1692e);
                X x10 = clsQ != null ? new X(clsQ) : null;
                if (x10 != null) {
                    arrayList.add(x10);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String W(X x10, a aVar) {
            if (x10.f().isAnonymousClass()) {
                return null;
            }
            qb.b bVarY = x10.Y();
            if (bVarY.i()) {
                return aVar.B(x10.f());
            }
            String strJ = bVarY.h().j();
            C3862t.f(strJ, "asString(...)");
            return strJ;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List X(a aVar, X x10) {
            Collection<Hb.U> collectionS = aVar.L().l().s();
            C3862t.f(collectionS, "getSupertypes(...)");
            ArrayList arrayList = new ArrayList(collectionS.size());
            for (Hb.U u10 : collectionS) {
                C3862t.d(u10);
                arrayList.add(new U0(u10, new L(u10, aVar, x10)));
            }
            if (!Oa.j.u0(aVar.L())) {
                if (arrayList.isEmpty()) {
                    AbstractC1082f0 abstractC1082f0I = C5087e.m(aVar.L()).i();
                    C3862t.f(abstractC1082f0I, "getAnyType(...)");
                    arrayList.add(new U0(abstractC1082f0I, M.f11115B));
                } else {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        EnumC1693f enumC1693fI = C4597i.e(((U0) it.next()).getType()).i();
                        C3862t.f(enumC1693fI, "getKind(...)");
                        if (enumC1693fI != EnumC1693f.f15144D && enumC1693fI != EnumC1693f.f15147G) {
                            break;
                        }
                    }
                    AbstractC1082f0 abstractC1082f0I2 = C5087e.m(aVar.L()).i();
                    C3862t.f(abstractC1082f0I2, "getAnyType(...)");
                    arrayList.add(new U0(abstractC1082f0I2, M.f11115B));
                }
            }
            return Rb.a.c(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Type Y(Hb.U u10, a aVar, X x10) {
            InterfaceC1695h interfaceC1695hT = u10.O0().t();
            if (!(interfaceC1695hT instanceof InterfaceC1692e)) {
                throw new Y0("Supertype not a class: " + interfaceC1695hT);
            }
            Class<?> clsQ = j1.q((InterfaceC1692e) interfaceC1695hT);
            if (clsQ == null) {
                throw new Y0("Unsupported superclass of " + aVar + ": " + interfaceC1695hT);
            }
            if (C3862t.b(x10.f().getSuperclass(), clsQ)) {
                Type genericSuperclass = x10.f().getGenericSuperclass();
                C3862t.d(genericSuperclass);
                return genericSuperclass;
            }
            Class<?>[] interfaces = x10.f().getInterfaces();
            C3862t.f(interfaces, "getInterfaces(...)");
            int iI0 = C3831l.i0(interfaces, clsQ);
            if (iI0 >= 0) {
                Type type = x10.f().getGenericInterfaces()[iI0];
                C3862t.d(type);
                return type;
            }
            throw new Y0("No superclass of " + aVar + " in Java reflection for " + interfaceC1695hT);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Type Z() {
            return Object.class;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List a0(a aVar, X x10) {
            List<Ra.m0> listW = aVar.L().w();
            C3862t.f(listW, "getDeclaredTypeParameters(...)");
            List<Ra.m0> list = listW;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            for (Ra.m0 m0Var : list) {
                C3862t.d(m0Var);
                arrayList.add(new W0(x10, m0Var));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List x(a aVar) {
            return kotlin.collections.r.F0(aVar.H(), aVar.I());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List y(a aVar) {
            return kotlin.collections.r.F0(aVar.J(), aVar.M());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List z(a aVar) {
            return kotlin.collections.r.F0(aVar.K(), aVar.N());
        }

        public final Collection<A<?>> H() {
            T tB = this.allNonStaticMembers.b(this, f11153w[13]);
            C3862t.f(tB, "getValue(...)");
            return (Collection) tB;
        }

        public final Collection<A<?>> I() {
            T tB = this.allStaticMembers.b(this, f11153w[14]);
            C3862t.f(tB, "getValue(...)");
            return (Collection) tB;
        }

        public final Collection<A<?>> J() {
            T tB = this.declaredNonStaticMembers.b(this, f11153w[9]);
            C3862t.f(tB, "getValue(...)");
            return (Collection) tB;
        }

        public final InterfaceC1692e L() {
            T tB = this.descriptor.b(this, f11153w[0]);
            C3862t.f(tB, "getValue(...)");
            return (InterfaceC1692e) tB;
        }

        public final String O() {
            return (String) this.qualifiedName.b(this, f11153w[3]);
        }

        public final String P() {
            return (String) this.simpleName.b(this, f11153w[2]);
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11173a;

        static {
            int[] iArr = new int[C3816a.EnumC0573a.values().length];
            try {
                iArr[C3816a.EnumC0573a.f43849G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3816a.EnumC0573a.f43851I.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3816a.EnumC0573a.f43852J.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C3816a.EnumC0573a.f43850H.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C3816a.EnumC0573a.f43847E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C3816a.EnumC0573a.f43848F.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f11173a = iArr;
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La/X$c", "LAb/f;", "", "LRa/z;", "j", "()Ljava/util/List;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends Ab.f {
        c(C1772k c1772k, Gb.n nVar) {
            super(nVar, c1772k);
        }

        @Override // Ab.f
        protected List<InterfaceC1712z> j() {
            return kotlin.collections.r.m();
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class d extends C3859p implements Ba.p<Db.K, C3934n, Ra.Z> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f11174B = new d();

        d() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Ra.Z invoke(Db.K p02, C3934n p12) {
            C3862t.g(p02, "p0");
            C3862t.g(p12, "p1");
            return p02.u(p12);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return kotlin.jvm.internal.P.b(Db.K.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }
    }

    public X(Class<T> jClass) {
        C3862t.g(jClass, "jClass");
        this.jClass = jClass;
        this.data = C4165j.b(EnumC4168m.f46627C, new B(this));
    }

    private final InterfaceC1692e V(qb.b classId, Wa.k moduleData) {
        C1772k c1772k = new C1772k(new C1777p(moduleData.b(), classId.f()), classId.h(), Ra.E.f15106C, EnumC1693f.f15143C, kotlin.collections.r.e(moduleData.b().q().h().u()), Ra.h0.f15158a, false, moduleData.a().u());
        c1772k.L0(new c(c1772k, moduleData.a().u()), kotlin.collections.V.d(), null);
        return c1772k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1692e W(qb.b classId, Wa.k moduleData) {
        C3816a c3816aA;
        if (f().isSynthetic()) {
            return V(classId, moduleData);
        }
        Wa.f fVarA = Wa.f.f18482c.a(f());
        C3816a.EnumC0573a enumC0573aC = (fVarA == null || (c3816aA = fVarA.a()) == null) ? null : c3816aA.c();
        switch (enumC0573aC == null ? -1 : b.f11173a[enumC0573aC.ordinal()]) {
            case -1:
            case 6:
                throw new Y0("Unresolved class: " + f() + " (kind = " + enumC0573aC + ')');
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
                return V(classId, moduleData);
            case 5:
                throw new Y0("Unknown class: " + f() + " (kind = " + enumC0573aC + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a X(X x10) {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qb.b Y() {
        return f1.f11207a.c(f());
    }

    @Override // La.AbstractC1422d0
    public Collection<InterfaceC1699l> H() {
        InterfaceC1692e interfaceC1692eC = c();
        if (interfaceC1692eC.i() == EnumC1693f.f15144D || interfaceC1692eC.i() == EnumC1693f.f15148H) {
            return kotlin.collections.r.m();
        }
        Collection<InterfaceC1691d> collectionN = interfaceC1692eC.n();
        C3862t.f(collectionN, "getConstructors(...)");
        return collectionN;
    }

    @Override // La.AbstractC1422d0
    public Collection<InterfaceC1712z> I(qb.f name) {
        C3862t.g(name, "name");
        Ab.k kVarB0 = b0();
        Za.d dVar = Za.d.f19632I;
        return kotlin.collections.r.F0(kVarB0.b(name, dVar), c0().b(name, dVar));
    }

    @Override // La.AbstractC1422d0
    public Ra.Z J(int index) {
        Class<?> declaringClass;
        if (C3862t.b(f().getSimpleName(), "DefaultImpls") && (declaringClass = f().getDeclaringClass()) != null && declaringClass.isInterface()) {
            Ia.d dVarE = Aa.a.e(declaringClass);
            C3862t.e(dVarE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((X) dVarE).J(index);
        }
        InterfaceC1692e interfaceC1692eC = c();
        C1032m c1032m = interfaceC1692eC instanceof C1032m ? (C1032m) interfaceC1692eC : null;
        if (c1032m == null) {
            return null;
        }
        C3923c c3923cF1 = c1032m.f1();
        h.f<C3923c, List<C3934n>> classLocalVariable = C4176a.f46665j;
        C3862t.f(classLocalVariable, "classLocalVariable");
        C3934n c3934n = (C3934n) nb.e.b(c3923cF1, classLocalVariable, index);
        if (c3934n != null) {
            return (Ra.Z) j1.h(f(), c3934n, c1032m.e1().g(), c1032m.e1().j(), c1032m.h1(), d.f11174B);
        }
        return null;
    }

    @Override // La.AbstractC1422d0
    public Collection<Ra.Z> M(qb.f name) {
        C3862t.g(name, "name");
        Ab.k kVarB0 = b0();
        Za.d dVar = Za.d.f19632I;
        return kotlin.collections.r.F0(kVarB0.d(name, dVar), c0().d(name, dVar));
    }

    public final InterfaceC4164i<X<T>.a> Z() {
        return this.data;
    }

    @Override // La.Y
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1692e getDescriptor() {
        return this.data.getValue().L();
    }

    public final Ab.k b0() {
        return c().u().s();
    }

    public final Ab.k c0() {
        Ab.k kVarQ = c().Q();
        C3862t.f(kVarQ, "getStaticScope(...)");
        return kVarQ;
    }

    public boolean equals(Object other) {
        return (other instanceof X) && C3862t.b(Aa.a.c(this), Aa.a.c((Ia.d) other));
    }

    @Override // kotlin.jvm.internal.InterfaceC3851h
    public Class<T> f() {
        return this.jClass;
    }

    @Override // Ia.d
    public int hashCode() {
        return Aa.a.c(this).hashCode();
    }

    @Override // Ia.d
    public boolean o() {
        return c().o();
    }

    @Override // Ia.d
    public String q() {
        return this.data.getValue().O();
    }

    @Override // Ia.d
    public String r() {
        return this.data.getValue().P();
    }

    @Override // Ia.d
    public boolean s(Object value) {
        Integer numG = C1822f.g(f());
        if (numG != null) {
            return kotlin.jvm.internal.W.m(value, numG.intValue());
        }
        Class clsK = C1822f.k(f());
        if (clsK == null) {
            clsK = f();
        }
        return clsK.isInstance(value);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        qb.b bVarY = Y();
        qb.c cVarF = bVarY.f();
        if (cVarF.d()) {
            str = "";
        } else {
            str = cVarF.b() + '.';
        }
        String strB = bVarY.g().b();
        C3862t.f(strB, "asString(...)");
        sb2.append(str + Ub.n.B(strB, '.', '$', false, 4, null));
        return sb2.toString();
    }
}
