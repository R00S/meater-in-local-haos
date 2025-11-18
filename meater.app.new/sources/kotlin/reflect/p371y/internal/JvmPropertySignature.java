package kotlin.reflect.p371y.internal;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10703d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h;
import kotlin.reflect.p371y.internal.JvmFunctionSignature;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10080z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10095k;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10116d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10121i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10153e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10164g;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10287d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10293j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10289f;
import okhttp3.HttpUrl;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.e, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class JvmPropertySignature {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "getField", "()Ljava/lang/reflect/Field;", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.e$a */
    public static final class a extends JvmPropertySignature {

        /* renamed from: a */
        private final Field f37290a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            C9801m.m32346f(field, "field");
            this.f37290a = field;
        }

        @Override // kotlin.reflect.p371y.internal.JvmPropertySignature
        /* renamed from: a */
        public String getF37298f() {
            StringBuilder sb = new StringBuilder();
            String name = this.f37290a.getName();
            C9801m.m32345e(name, "field.name");
            sb.append(C10080z.m33829b(name));
            sb.append("()");
            Class<?> type = this.f37290a.getType();
            C9801m.m32345e(type, "field.type");
            sb.append(C10703d.m38070b(type));
            return sb.toString();
        }

        /* renamed from: b, reason: from getter */
        public final Field getF37290a() {
            return this.f37290a;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterMethod", "Ljava/lang/reflect/Method;", "setterMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetterMethod", "()Ljava/lang/reflect/Method;", "getSetterMethod", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.e$b */
    public static final class b extends JvmPropertySignature {

        /* renamed from: a */
        private final Method f37291a;

        /* renamed from: b */
        private final Method f37292b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method method, Method method2) {
            super(null);
            C9801m.m32346f(method, "getterMethod");
            this.f37291a = method;
            this.f37292b = method2;
        }

        @Override // kotlin.reflect.p371y.internal.JvmPropertySignature
        /* renamed from: a */
        public String getF37298f() {
            return C9887e0.m32535b(this.f37291a);
        }

        /* renamed from: b, reason: from getter */
        public final Method getF37291a() {
            return this.f37291a;
        }

        /* renamed from: c, reason: from getter */
        public final Method getF37292b() {
            return this.f37292b;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", RoomInstalled.SIGNATURE, "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "string", HttpUrl.FRAGMENT_ENCODE_SET, "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "asString", "getManglingSuffix", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.e$c */
    public static final class c extends JvmPropertySignature {

        /* renamed from: a */
        private final InterfaceC10729t0 f37293a;

        /* renamed from: b */
        private final C10135n f37294b;

        /* renamed from: c */
        private final C10112a.d f37295c;

        /* renamed from: d */
        private final InterfaceC10151c f37296d;

        /* renamed from: e */
        private final C10155g f37297e;

        /* renamed from: f */
        private final String f37298f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC10729t0 interfaceC10729t0, C10135n c10135n, C10112a.d dVar, InterfaceC10151c interfaceC10151c, C10155g c10155g) {
            String str;
            super(null);
            C9801m.m32346f(interfaceC10729t0, "descriptor");
            C9801m.m32346f(c10135n, "proto");
            C9801m.m32346f(dVar, RoomInstalled.SIGNATURE);
            C9801m.m32346f(interfaceC10151c, "nameResolver");
            C9801m.m32346f(c10155g, "typeTable");
            this.f37293a = interfaceC10729t0;
            this.f37294b = c10135n;
            this.f37295c = dVar;
            this.f37296d = interfaceC10151c;
            this.f37297e = c10155g;
            if (dVar.m34145G()) {
                str = interfaceC10151c.getString(dVar.m34140B().m34114x()) + interfaceC10151c.getString(dVar.m34140B().m34113w());
            } else {
                AbstractC10116d.a aVarM34256d = C10121i.m34256d(C10121i.f38607a, c10135n, interfaceC10151c, c10155g, false, 8, null);
                if (aVarM34256d == null) {
                    throw new KotlinReflectionInternalError("No field signature for property: " + interfaceC10729t0);
                }
                String strM34250d = aVarM34256d.m34250d();
                str = C10080z.m33829b(strM34250d) + m32526c() + "()" + aVarM34256d.m34251e();
            }
            this.f37298f = str;
        }

        /* renamed from: c */
        private final String m32526c() {
            String string;
            InterfaceC10609m interfaceC10609mMo32876b = this.f37293a.mo32876b();
            C9801m.m32345e(interfaceC10609mMo32876b, "descriptor.containingDeclaration");
            if (C9801m.m32341a(this.f37293a.getVisibility(), C10728t.f41219d) && (interfaceC10609mMo32876b instanceof C10287d)) {
                C10124c c10124cM36283c1 = ((C10287d) interfaceC10609mMo32876b).m36283c1();
                AbstractC10749h.f<C10124c, Integer> fVar = C10112a.f38499i;
                C9801m.m32345e(fVar, "classModuleName");
                Integer num = (Integer) C10153e.m35380a(c10124cM36283c1, fVar);
                if (num == null || (string = this.f37296d.getString(num.intValue())) == null) {
                    string = "main";
                }
                return '$' + C10164g.m35459a(string);
            }
            if (!C9801m.m32341a(this.f37293a.getVisibility(), C10728t.f41216a) || !(interfaceC10609mMo32876b instanceof InterfaceC10604k0)) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            InterfaceC10729t0 interfaceC10729t0 = this.f37293a;
            C9801m.m32344d(interfaceC10729t0, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            InterfaceC10289f interfaceC10289fMo36260c0 = ((C10293j) interfaceC10729t0).mo36260c0();
            if (!(interfaceC10289fMo36260c0 instanceof C10095k)) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            C10095k c10095k = (C10095k) interfaceC10289fMo36260c0;
            if (c10095k.m33984f() == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            return '$' + c10095k.m33986h().m35455k();
        }

        @Override // kotlin.reflect.p371y.internal.JvmPropertySignature
        /* renamed from: a, reason: from getter */
        public String getF37298f() {
            return this.f37298f;
        }

        /* renamed from: b, reason: from getter */
        public final InterfaceC10729t0 getF37293a() {
            return this.f37293a;
        }

        /* renamed from: d, reason: from getter */
        public final InterfaceC10151c getF37296d() {
            return this.f37296d;
        }

        /* renamed from: e, reason: from getter */
        public final C10135n getF37294b() {
            return this.f37294b;
        }

        /* renamed from: f, reason: from getter */
        public final C10112a.d getF37295c() {
            return this.f37295c;
        }

        /* renamed from: g, reason: from getter */
        public final C10155g getF37297e() {
            return this.f37297e;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "setterSignature", "(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;)V", "getGetterSignature", "()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "getSetterSignature", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.e$d */
    public static final class d extends JvmPropertySignature {

        /* renamed from: a */
        private final JvmFunctionSignature.e f37299a;

        /* renamed from: b */
        private final JvmFunctionSignature.e f37300b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JvmFunctionSignature.e eVar, JvmFunctionSignature.e eVar2) {
            super(null);
            C9801m.m32346f(eVar, "getterSignature");
            this.f37299a = eVar;
            this.f37300b = eVar2;
        }

        @Override // kotlin.reflect.p371y.internal.JvmPropertySignature
        /* renamed from: a */
        public String getF37298f() {
            return this.f37299a.getF37287b();
        }

        /* renamed from: b, reason: from getter */
        public final JvmFunctionSignature.e getF37299a() {
            return this.f37299a;
        }

        /* renamed from: c, reason: from getter */
        public final JvmFunctionSignature.e getF37300b() {
            return this.f37300b;
        }
    }

    private JvmPropertySignature() {
    }

    public /* synthetic */ JvmPropertySignature(C9789g c9789g) {
        this();
    }

    /* renamed from: a */
    public abstract String getF37298f();
}
