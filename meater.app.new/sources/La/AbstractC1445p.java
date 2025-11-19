package La;

import Fb.C1032m;
import Fb.InterfaceC1037s;
import La.AbstractC1441n;
import Ra.C1706t;
import Ra.InterfaceC1700m;
import Xa.C1822f;
import ab.C1927H;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import lb.C3923c;
import lb.C3934n;
import nb.InterfaceC4077c;
import ob.C4176a;
import pb.d;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0007\b\u0005\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LLa/p;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "c", "b", "d", "LLa/p$a;", "LLa/p$b;", "LLa/p$c;", "LLa/p$d;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: La.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1445p {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LLa/p$a;", "LLa/p;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.p$a */
    public static final class a extends AbstractC1445p {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Field field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            C3862t.g(field, "field");
            this.field = field;
        }

        @Override // La.AbstractC1445p
        /* renamed from: a */
        public String getString() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.field.getName();
            C3862t.f(name, "getName(...)");
            sb2.append(C1927H.b(name));
            sb2.append("()");
            Class<?> type = this.field.getType();
            C3862t.f(type, "getType(...)");
            sb2.append(C1822f.f(type));
            return sb2.toString();
        }

        /* renamed from: b, reason: from getter */
        public final Field getField() {
            return this.field;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"LLa/p$b;", "LLa/p;", "Ljava/lang/reflect/Method;", "getterMethod", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "c", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.p$b */
    public static final class b extends AbstractC1445p {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Method getterMethod;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Method setterMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method getterMethod, Method method) {
            super(null);
            C3862t.g(getterMethod, "getterMethod");
            this.getterMethod = getterMethod;
            this.setterMethod = method;
        }

        @Override // La.AbstractC1445p
        /* renamed from: a */
        public String getString() {
            return h1.d(this.getterMethod);
        }

        /* renamed from: b, reason: from getter */
        public final Method getGetterMethod() {
            return this.getterMethod;
        }

        /* renamed from: c, reason: from getter */
        public final Method getSetterMethod() {
            return this.setterMethod;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"LLa/p$c;", "LLa/p;", "LRa/Z;", "descriptor", "Llb/n;", "proto", "Lob/a$d;", "signature", "Lnb/c;", "nameResolver", "Lnb/g;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "", "c", "()Ljava/lang/String;", "a", "LRa/Z;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "b", "Llb/n;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "Lob/a$d;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "d", "Lnb/c;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "e", "Lnb/g;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "f", "Ljava/lang/String;", "string", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.p$c */
    public static final class c extends AbstractC1445p {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Ra.Z descriptor;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final C3934n proto;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final C4176a.d signature;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4077c nameResolver;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final nb.g typeTable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ra.Z descriptor, C3934n proto, C4176a.d signature, InterfaceC4077c nameResolver, nb.g typeTable) {
            String str;
            super(null);
            C3862t.g(descriptor, "descriptor");
            C3862t.g(proto, "proto");
            C3862t.g(signature, "signature");
            C3862t.g(nameResolver, "nameResolver");
            C3862t.g(typeTable, "typeTable");
            this.descriptor = descriptor;
            this.proto = proto;
            this.signature = signature;
            this.nameResolver = nameResolver;
            this.typeTable = typeTable;
            if (signature.H()) {
                str = nameResolver.getString(signature.C().y()) + nameResolver.getString(signature.C().x());
            } else {
                d.a aVarD = pb.i.d(pb.i.f47746a, proto, nameResolver, typeTable, false, 8, null);
                if (aVarD == null) {
                    throw new Y0("No field signature for property: " + descriptor);
                }
                String strB = aVarD.b();
                str = C1927H.b(strB) + c() + "()" + aVarD.c();
            }
            this.string = str;
        }

        private final String c() {
            String string;
            InterfaceC1700m interfaceC1700mC = this.descriptor.c();
            C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
            if (C3862t.b(this.descriptor.getVisibility(), C1706t.f15169d) && (interfaceC1700mC instanceof C1032m)) {
                C3923c c3923cF1 = ((C1032m) interfaceC1700mC).f1();
                h.f<C3923c, Integer> classModuleName = C4176a.f46664i;
                C3862t.f(classModuleName, "classModuleName");
                Integer num = (Integer) nb.e.a(c3923cF1, classModuleName);
                if (num == null || (string = this.nameResolver.getString(num.intValue())) == null) {
                    string = "main";
                }
                return '$' + qb.g.b(string);
            }
            if (!C3862t.b(this.descriptor.getVisibility(), C1706t.f15166a) || !(interfaceC1700mC instanceof Ra.N)) {
                return "";
            }
            Ra.Z z10 = this.descriptor;
            C3862t.e(z10, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            InterfaceC1037s interfaceC1037sB0 = ((Fb.N) z10).b0();
            if (!(interfaceC1037sB0 instanceof jb.r)) {
                return "";
            }
            jb.r rVar = (jb.r) interfaceC1037sB0;
            if (rVar.f() == null) {
                return "";
            }
            return '$' + rVar.h().j();
        }

        @Override // La.AbstractC1445p
        /* renamed from: a, reason: from getter */
        public String getString() {
            return this.string;
        }

        /* renamed from: b, reason: from getter */
        public final Ra.Z getDescriptor() {
            return this.descriptor;
        }

        /* renamed from: d, reason: from getter */
        public final InterfaceC4077c getNameResolver() {
            return this.nameResolver;
        }

        /* renamed from: e, reason: from getter */
        public final C3934n getProto() {
            return this.proto;
        }

        /* renamed from: f, reason: from getter */
        public final C4176a.d getSignature() {
            return this.signature;
        }

        /* renamed from: g, reason: from getter */
        public final nb.g getTypeTable() {
            return this.typeTable;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"LLa/p$d;", "LLa/p;", "LLa/n$e;", "getterSignature", "setterSignature", "<init>", "(LLa/n$e;LLa/n$e;)V", "", "a", "()Ljava/lang/String;", "LLa/n$e;", "b", "()LLa/n$e;", "c", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.p$d */
    public static final class d extends AbstractC1445p {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AbstractC1441n.e getterSignature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final AbstractC1441n.e setterSignature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC1441n.e getterSignature, AbstractC1441n.e eVar) {
            super(null);
            C3862t.g(getterSignature, "getterSignature");
            this.getterSignature = getterSignature;
            this.setterSignature = eVar;
        }

        @Override // La.AbstractC1445p
        /* renamed from: a */
        public String getString() {
            return this.getterSignature.get_signature();
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC1441n.e getGetterSignature() {
            return this.getterSignature;
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC1441n.e getSetterSignature() {
            return this.setterSignature;
        }
    }

    public /* synthetic */ AbstractC1445p(C3854k c3854k) {
        this();
    }

    /* renamed from: a */
    public abstract String getString();

    private AbstractC1445p() {
    }
}
