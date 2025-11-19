package La;

import Ia.i;
import Ia.m;
import La.AbstractC1445p;
import La.a1;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Sa.h;
import ab.C1955o;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC3849f;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import oa.C4153F;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import ob.C4176a;
import pb.d;
import tb.C4596h;

/* compiled from: KPropertyImpl.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000 N*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004OPQRB5\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010#R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\t0\t048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010@\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0018\u0010H\u001a\u0006\u0012\u0002\b\u00030E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u00010E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0014\u0010K\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010<R\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006S"}, d2 = {"LLa/K0;", "V", "LLa/A;", "LIa/m;", "LLa/d0;", "container", "", "name", "signature", "LRa/Z;", "descriptorInitialValue", "", "rawBoundReceiver", "<init>", "(LLa/d0;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "descriptor", "(LLa/d0;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "boundReceiver", "(LLa/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/reflect/Member;", "d0", "()Ljava/lang/reflect/Member;", "fieldOrMethod", "receiver1", "receiver2", "f0", "(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "H", "LLa/d0;", "S", "()LLa/d0;", "I", "Ljava/lang/String;", "getName", "J", "j0", "K", "Ljava/lang/Object;", "Loa/i;", "Ljava/lang/reflect/Field;", "L", "Loa/i;", "_javaField", "LLa/a1$a;", "kotlin.jvm.PlatformType", "M", "LLa/a1$a;", "_descriptor", "e0", "()Ljava/lang/Object;", "X", "()Z", "isBound", "i0", "()Ljava/lang/reflect/Field;", "javaField", "LLa/K0$c;", "h0", "()LLa/K0$c;", "getter", "LMa/h;", "R", "()LMa/h;", "caller", "T", "defaultCaller", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "N", "a", "c", "d", "b", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class K0<V> extends A<V> implements Ia.m<V> {

    /* renamed from: O, reason: collision with root package name */
    private static final Object f11098O = new Object();

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final AbstractC1422d0 container;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final String signature;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Object rawBoundReceiver;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i<Field> _javaField;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final a1.a<Ra.Z> _descriptor;

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LLa/K0$a;", "PropertyType", "ReturnType", "LLa/A;", "LIa/m$a;", "LIa/h;", "<init>", "()V", "LLa/K0;", "a0", "()LLa/K0;", "property", "LLa/d0;", "S", "()LLa/d0;", "container", "LMa/h;", "T", "()LMa/h;", "defaultCaller", "", "X", "()Z", "isBound", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "LRa/Y;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a<PropertyType, ReturnType> extends A<ReturnType> implements Ia.h<ReturnType>, m.a<PropertyType> {
        @Override // La.A
        /* renamed from: S */
        public AbstractC1422d0 getContainer() {
            return c().getContainer();
        }

        @Override // La.A
        public Ma.h<?> T() {
            return null;
        }

        @Override // La.A
        public boolean X() {
            return c().X();
        }

        public abstract Ra.Y Z();

        /* renamed from: a0 */
        public abstract K0<PropertyType> c();

        @Override // Ia.h
        public boolean isExternal() {
            return Z().isExternal();
        }

        @Override // Ia.h
        public boolean isInfix() {
            return Z().isInfix();
        }

        @Override // Ia.h
        public boolean isInline() {
            return Z().isInline();
        }

        @Override // Ia.h
        public boolean isOperator() {
            return Z().isOperator();
        }

        @Override // Ia.c
        public boolean isSuspend() {
            return Z().isSuspend();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"LLa/K0$c;", "V", "LLa/K0$a;", "LIa/m$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "LRa/a0;", "H", "LLa/a1$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "LMa/h;", "I", "Loa/i;", "R", "()LMa/h;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class c<V> extends a<V, V> implements m.b<V> {

        /* renamed from: J, reason: collision with root package name */
        static final /* synthetic */ Ia.m<Object>[] f11105J = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private final a1.a descriptor = a1.b(new L0(this));

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4164i caller = C4165j.b(EnumC4168m.f46627C, new M0(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final Ma.h d0(c cVar) {
            return P0.b(cVar, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Ra.a0 e0(c cVar) {
            Ra.a0 a0VarE = cVar.c().Z().e();
            if (a0VarE != null) {
                return a0VarE;
            }
            Ua.L lD = C4596h.d(cVar.c().Z(), Sa.h.f15630e.b());
            C3862t.f(lD, "createDefaultGetter(...)");
            return lD;
        }

        @Override // La.A
        public Ma.h<?> R() {
            return (Ma.h) this.caller.getValue();
        }

        public boolean equals(Object other) {
            return (other instanceof c) && C3862t.b(c(), ((c) other).c());
        }

        @Override // La.K0.a
        /* renamed from: f0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Ra.a0 Z() {
            T tB = this.descriptor.b(this, f11105J[0]);
            C3862t.f(tB, "getValue(...)");
            return (Ra.a0) tB;
        }

        @Override // Ia.c
        public String getName() {
            return "<get-" + c().getName() + '>';
        }

        public int hashCode() {
            return c().hashCode();
        }

        public String toString() {
            return "getter of " + c();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\t¨\u0006 "}, d2 = {"LLa/K0$d;", "V", "LLa/K0$a;", "Loa/F;", "LIa/i$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "LRa/b0;", "H", "LLa/a1$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "LMa/h;", "I", "Loa/i;", "R", "()LMa/h;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class d<V> extends a<V, C4153F> implements i.a<V> {

        /* renamed from: J, reason: collision with root package name */
        static final /* synthetic */ Ia.m<Object>[] f11108J = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private final a1.a descriptor = a1.b(new N0(this));

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4164i caller = C4165j.b(EnumC4168m.f46627C, new O0(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final Ma.h d0(d dVar) {
            return P0.b(dVar, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Ra.b0 e0(d dVar) {
            Ra.b0 b0VarH = dVar.c().Z().h();
            if (b0VarH != null) {
                return b0VarH;
            }
            Ra.Z Z10 = dVar.c().Z();
            h.a aVar = Sa.h.f15630e;
            Ua.M mE = C4596h.e(Z10, aVar.b(), aVar.b());
            C3862t.f(mE, "createDefaultSetter(...)");
            return mE;
        }

        @Override // La.A
        public Ma.h<?> R() {
            return (Ma.h) this.caller.getValue();
        }

        public boolean equals(Object other) {
            return (other instanceof d) && C3862t.b(c(), ((d) other).c());
        }

        @Override // La.K0.a
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public Ra.b0 Z() {
            T tB = this.descriptor.b(this, f11108J[0]);
            C3862t.f(tB, "getValue(...)");
            return (Ra.b0) tB;
        }

        @Override // Ia.c
        public String getName() {
            return "<set-" + c().getName() + '>';
        }

        public int hashCode() {
            return c().hashCode();
        }

        public String toString() {
            return "setter of " + c();
        }
    }

    private K0(AbstractC1422d0 abstractC1422d0, String str, String str2, Ra.Z z10, Object obj) {
        this.container = abstractC1422d0;
        this.name = str;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this._javaField = C4165j.b(EnumC4168m.f46627C, new I0(this));
        a1.a<Ra.Z> aVarC = a1.c(z10, new J0(this));
        C3862t.f(aVarC, "lazySoft(...)");
        this._descriptor = aVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ra.Z Z(K0 k02) {
        return k02.getContainer().D(k02.getName(), k02.signature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field a0(K0 k02) {
        Class<?> enclosingClass;
        AbstractC1445p abstractC1445pF = f1.f11207a.f(k02.Z());
        if (!(abstractC1445pF instanceof AbstractC1445p.c)) {
            if (abstractC1445pF instanceof AbstractC1445p.a) {
                return ((AbstractC1445p.a) abstractC1445pF).getField();
            }
            if ((abstractC1445pF instanceof AbstractC1445p.b) || (abstractC1445pF instanceof AbstractC1445p.d)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC1445p.c cVar = (AbstractC1445p.c) abstractC1445pF;
        Ra.Z zB = cVar.getDescriptor();
        d.a aVarD = pb.i.d(pb.i.f47746a, cVar.getProto(), cVar.getNameResolver(), cVar.getTypeTable(), false, 8, null);
        if (aVarD == null) {
            return null;
        }
        if (C1955o.e(zB) || pb.i.f(cVar.getProto())) {
            enclosingClass = k02.getContainer().f().getEnclosingClass();
        } else {
            InterfaceC1700m interfaceC1700mC = zB.c();
            enclosingClass = interfaceC1700mC instanceof InterfaceC1692e ? j1.q((InterfaceC1692e) interfaceC1700mC) : k02.getContainer().f();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(aVarD.e());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // La.A
    public Ma.h<?> R() {
        return h0().R();
    }

    @Override // La.A
    /* renamed from: S, reason: from getter */
    public AbstractC1422d0 getContainer() {
        return this.container;
    }

    @Override // La.A
    public Ma.h<?> T() {
        return h0().T();
    }

    @Override // La.A
    public boolean X() {
        return this.rawBoundReceiver != AbstractC3849f.NO_RECEIVER;
    }

    protected final Member d0() {
        if (!Z().N()) {
            return null;
        }
        AbstractC1445p abstractC1445pF = f1.f11207a.f(Z());
        if (abstractC1445pF instanceof AbstractC1445p.c) {
            AbstractC1445p.c cVar = (AbstractC1445p.c) abstractC1445pF;
            if (cVar.getSignature().F()) {
                C4176a.c cVarA = cVar.getSignature().A();
                if (!cVarA.A() || !cVarA.z()) {
                    return null;
                }
                return getContainer().C(cVar.getNameResolver().getString(cVarA.y()), cVar.getNameResolver().getString(cVarA.x()));
            }
        }
        return i0();
    }

    public final Object e0() {
        return Ma.o.h(this.rawBoundReceiver, Z());
    }

    public boolean equals(Object other) {
        K0<?> k0D = j1.d(other);
        return k0D != null && C3862t.b(getContainer(), k0D.getContainer()) && C3862t.b(getName(), k0D.getName()) && C3862t.b(this.signature, k0D.signature) && C3862t.b(this.rawBoundReceiver, k0D.rawBoundReceiver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final Object f0(Member fieldOrMethod, Object receiver1, Object receiver2) throws IllegalPropertyDelegateAccessException, SecurityException {
        try {
            Object obj = f11098O;
            if ((receiver1 == obj || receiver2 == obj) && Z().j0() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objE0 = X() ? e0() : receiver1;
            if (objE0 == obj) {
                objE0 = null;
            }
            if (!X()) {
                receiver1 = receiver2;
            }
            if (receiver1 == obj) {
                receiver1 = null;
            }
            AccessibleObject accessibleObject = fieldOrMethod instanceof AccessibleObject ? (AccessibleObject) fieldOrMethod : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(Ka.a.a(this));
            }
            if (fieldOrMethod == 0) {
                return null;
            }
            if (fieldOrMethod instanceof Field) {
                return ((Field) fieldOrMethod).get(objE0);
            }
            if (!(fieldOrMethod instanceof Method)) {
                throw new AssertionError("delegate field/method " + fieldOrMethod + " neither field nor method");
            }
            int length = ((Method) fieldOrMethod).getParameterTypes().length;
            if (length == 0) {
                return ((Method) fieldOrMethod).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) fieldOrMethod;
                if (objE0 == null) {
                    Class<?> cls = ((Method) fieldOrMethod).getParameterTypes()[0];
                    C3862t.f(cls, "get(...)");
                    objE0 = j1.g(cls);
                }
                return method.invoke(null, objE0);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + fieldOrMethod + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) fieldOrMethod;
            if (receiver1 == null) {
                Class<?> cls2 = ((Method) fieldOrMethod).getParameterTypes()[1];
                C3862t.f(cls2, "get(...)");
                receiver1 = j1.g(cls2);
            }
            return method2.invoke(null, objE0, receiver1);
        } catch (IllegalAccessException e10) {
            throw new IllegalPropertyDelegateAccessException(e10);
        }
    }

    @Override // La.A
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public Ra.Z Z() {
        Ra.Z zInvoke = this._descriptor.invoke();
        C3862t.f(zInvoke, "invoke(...)");
        return zInvoke;
    }

    @Override // Ia.c
    public String getName() {
        return this.name;
    }

    public abstract c<V> h0();

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    public final Field i0() {
        return this._javaField.getValue();
    }

    @Override // Ia.c
    public boolean isSuspend() {
        return false;
    }

    /* renamed from: j0, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public String toString() {
        return e1.f11201a.k(Z());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K0(AbstractC1422d0 container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        C3862t.g(container, "container");
        C3862t.g(name, "name");
        C3862t.g(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public K0(AbstractC1422d0 container, Ra.Z descriptor) {
        C3862t.g(container, "container");
        C3862t.g(descriptor, "descriptor");
        String strJ = descriptor.getName().j();
        C3862t.f(strJ, "asString(...)");
        this(container, strJ, f1.f11207a.f(descriptor).getString(), descriptor, AbstractC3849f.NO_RECEIVER);
    }
}
