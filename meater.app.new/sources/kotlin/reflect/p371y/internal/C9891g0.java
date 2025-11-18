package kotlin.reflect.p371y.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10773s;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10801m;
import kotlin.collections.C10810q0;
import kotlin.collections.C10815t;
import kotlin.collections.C10827z;
import kotlin.jvm.C9752a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9780b0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.InterfaceC9794i0;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10685b;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10688e;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10689f;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10694k;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10695l;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10715p;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10703d;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10704e;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10711l;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o;
import kotlin.reflect.p371y.internal.calls.C9896b;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9915i;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9929c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10103s;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10140s;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10149a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10156h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10189f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10215k;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10204a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10206b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10214j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10221q;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10223s;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10301k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10303m;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10313w;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.text.C10546u;
import okhttp3.HttpUrl;

/* compiled from: util.kt */
@Metadata(m32266d1 = {"\u0000Ê\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001al\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0013*\u00020\u0014\"\b\b\u0001\u0010\u0012*\u00020\u00062\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u0002H\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u001d\u0010\u001e\u001a\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00120\u001f¢\u0006\u0002\b!H\u0000¢\u0006\u0002\u0010\"\u001a.\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*H\u0002\u001a(\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\b\b\u0002\u0010)\u001a\u00020*H\u0002\u001a%\u0010-\u001a\u0002H.\"\u0004\b\u0000\u0010.2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H.00H\u0080\bø\u0001\u0000¢\u0006\u0002\u00101\u001a\u0016\u00102\u001a\u0004\u0018\u00010\u000e*\u0002032\u0006\u0010$\u001a\u00020%H\u0002\u001a\u0014\u00104\u001a\b\u0012\u0002\b\u0003\u0018\u000105*\u0004\u0018\u00010\u000eH\u0000\u001a\u0010\u00106\u001a\u0004\u0018\u000107*\u0004\u0018\u00010\u000eH\u0000\u001a\u0014\u00108\u001a\b\u0012\u0002\b\u0003\u0018\u000109*\u0004\u0018\u00010\u000eH\u0000\u001a\u0012\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;*\u00020=H\u0000\u001a\u0014\u0010>\u001a\u0006\u0012\u0002\b\u00030\u0016*\u0006\u0012\u0002\b\u00030\u0016H\u0000\u001a\u000e\u0010?\u001a\u0004\u0018\u00010<*\u00020@H\u0002\u001a\u0012\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016*\u00020BH\u0000\u001a\u000e\u0010C\u001a\u0004\u0018\u00010D*\u00020EH\u0000\u001a\u001a\u0010F\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030G2\u0006\u0010$\u001a\u00020%H\u0002\u001a\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020<0;*\b\u0012\u0004\u0012\u00020<0;H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006I"}, m32267d2 = {"JVM_STATIC", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "instanceReceiverParameter", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "isInlineClassType", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KType;)Z", "defaultPrimitiveValue", HttpUrl.FRAGMENT_ENCODE_SET, "type", "Ljava/lang/reflect/Type;", "deserializeToDescriptor", "D", "M", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "moduleAnchor", "Ljava/lang/Class;", "proto", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "metadataVersion", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "createDescriptor", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "loadClass", "classLoader", "Ljava/lang/ClassLoader;", "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "className", "arrayDimensions", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinClassId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "reflectionCall", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "arrayToRuntimeValue", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;", "asKCallableImpl", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "asKFunctionImpl", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "asKPropertyImpl", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "computeAnnotations", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "createArrayType", "toAnnotationInstance", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;", "toJavaClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "toKVisibility", "Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "toRuntimeValue", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;", "unwrapRepeatableAnnotations", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.g0 */
/* loaded from: classes2.dex */
public final class C9891g0 {

    /* renamed from: a */
    private static final C10160c f37316a = new C10160c("kotlin.jvm.JvmStatic");

    /* compiled from: util.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.g0$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37317a;

        static {
            int[] iArr = new int[EnumC9915i.values().length];
            iArr[EnumC9915i.BOOLEAN.ordinal()] = 1;
            iArr[EnumC9915i.CHAR.ordinal()] = 2;
            iArr[EnumC9915i.BYTE.ordinal()] = 3;
            iArr[EnumC9915i.SHORT.ordinal()] = 4;
            iArr[EnumC9915i.INT.ordinal()] = 5;
            iArr[EnumC9915i.FLOAT.ordinal()] = 6;
            iArr[EnumC9915i.LONG.ordinal()] = 7;
            iArr[EnumC9915i.DOUBLE.ordinal()] = 8;
            f37317a = iArr;
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v12, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v14, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.Object m32556a(kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10206b r6, java.lang.ClassLoader r7) throws java.lang.NegativeArraySizeException {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.C9891g0.m32556a(kotlin.f0.y.e.j0.i.r.b, java.lang.ClassLoader):java.lang.Object");
    }

    /* renamed from: b */
    public static final KCallableImpl<?> m32557b(Object obj) {
        KCallableImpl<?> kCallableImpl = obj instanceof KCallableImpl ? (KCallableImpl) obj : null;
        if (kCallableImpl != null) {
            return kCallableImpl;
        }
        KFunctionImpl kFunctionImplM32558c = m32558c(obj);
        return kFunctionImplM32558c != null ? kFunctionImplM32558c : m32559d(obj);
    }

    /* renamed from: c */
    public static final KFunctionImpl m32558c(Object obj) {
        KFunctionImpl kFunctionImpl = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        C9793i c9793i = obj instanceof C9793i ? (C9793i) obj : null;
        KCallable kCallableCompute = c9793i != null ? c9793i.compute() : null;
        if (kCallableCompute instanceof KFunctionImpl) {
            return (KFunctionImpl) kCallableCompute;
        }
        return null;
    }

    /* renamed from: d */
    public static final KPropertyImpl<?> m32559d(Object obj) {
        KPropertyImpl<?> kPropertyImpl = obj instanceof KPropertyImpl ? (KPropertyImpl) obj : null;
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        AbstractC9780b0 abstractC9780b0 = obj instanceof AbstractC9780b0 ? (AbstractC9780b0) obj : null;
        KCallable kCallableCompute = abstractC9780b0 != null ? abstractC9780b0.compute() : null;
        if (kCallableCompute instanceof KPropertyImpl) {
            return (KPropertyImpl) kCallableCompute;
        }
        return null;
    }

    /* renamed from: e */
    public static final List<Annotation> m32560e(InterfaceC10614a interfaceC10614a) {
        C9801m.m32346f(interfaceC10614a, "<this>");
        InterfaceC10620g annotations = interfaceC10614a.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10616c interfaceC10616c : annotations) {
            InterfaceC10741z0 interfaceC10741z0Mo33164t = interfaceC10616c.mo33164t();
            Annotation annotationM32570o = null;
            if (interfaceC10741z0Mo33164t instanceof C10685b) {
                annotationM32570o = ((C10685b) interfaceC10741z0Mo33164t).m38014d();
            } else if (interfaceC10741z0Mo33164t instanceof C10695l.a) {
                AbstractC10715p abstractC10715pMo33568b = ((C10695l.a) interfaceC10741z0Mo33164t).mo33568b();
                C10704e c10704e = abstractC10715pMo33568b instanceof C10704e ? (C10704e) abstractC10715pMo33568b : null;
                if (c10704e != null) {
                    annotationM32570o = c10704e.m38078R();
                }
            } else {
                annotationM32570o = m32570o(interfaceC10616c);
            }
            if (annotationM32570o != null) {
                arrayList.add(annotationM32570o);
            }
        }
        return m32574s(arrayList);
    }

    /* renamed from: f */
    public static final Class<?> m32561f(Class<?> cls) {
        C9801m.m32346f(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: g */
    public static final Object m32562g(Type type) {
        C9801m.m32346f(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (C9801m.m32341a(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (C9801m.m32341a(type, Character.TYPE)) {
            return (char) 0;
        }
        if (C9801m.m32341a(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (C9801m.m32341a(type, Short.TYPE)) {
            return (short) 0;
        }
        if (C9801m.m32341a(type, Integer.TYPE)) {
            return 0;
        }
        if (C9801m.m32341a(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (C9801m.m32341a(type, Long.TYPE)) {
            return 0L;
        }
        if (C9801m.m32341a(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (C9801m.m32341a(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    /* renamed from: h */
    public static final <M extends InterfaceC10756o, D extends InterfaceC10573a> D m32563h(Class<?> cls, M m, InterfaceC10151c interfaceC10151c, C10155g c10155g, AbstractC10149a abstractC10149a, Function2<? super C10313w, ? super M, ? extends D> function2) {
        List<C10140s> listM34897n0;
        C9801m.m32346f(cls, "moduleAnchor");
        C9801m.m32346f(m, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(c10155g, "typeTable");
        C9801m.m32346f(abstractC10149a, "metadataVersion");
        C9801m.m32346f(function2, "createDescriptor");
        C10694k c10694kM37330a = C10507z.m37330a(cls);
        if (m instanceof C10130i) {
            listM34897n0 = ((C10130i) m).m34731m0();
        } else {
            if (!(m instanceof C10135n)) {
                throw new IllegalStateException(("Unsupported message: " + m).toString());
            }
            listM34897n0 = ((C10135n) m).m34897n0();
        }
        List<C10140s> list = listM34897n0;
        C10301k c10301kM38031a = c10694kM37330a.m38031a();
        InterfaceC10592g0 interfaceC10592g0M38032b = c10694kM37330a.m38032b();
        C10156h c10156hM35402b = C10156h.f39237a.m35402b();
        C9801m.m32345e(list, "typeParameters");
        return function2.invoke(new C10313w(new C10303m(c10301kM38031a, interfaceC10151c, interfaceC10592g0M38032b, c10155g, c10156hM35402b, abstractC10149a, null, null, list)), m);
    }

    /* renamed from: i */
    public static final InterfaceC10735w0 m32564i(InterfaceC10573a interfaceC10573a) {
        C9801m.m32346f(interfaceC10573a, "<this>");
        if (interfaceC10573a.mo37029f0() == null) {
            return null;
        }
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10573a.mo32876b();
        C9801m.m32344d(interfaceC10609mMo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC10585e) interfaceC10609mMo32876b).mo37677K0();
    }

    /* renamed from: j */
    public static final C10160c m32565j() {
        return f37316a;
    }

    /* renamed from: k */
    public static final boolean m32566k(KType kType) {
        AbstractC10344e0 abstractC10344e0M37322f;
        C9801m.m32346f(kType, "<this>");
        KTypeImpl kTypeImpl = kType instanceof KTypeImpl ? (KTypeImpl) kType : null;
        return (kTypeImpl == null || (abstractC10344e0M37322f = kTypeImpl.getF40589g()) == null || !C10189f.m35841c(abstractC10344e0M37322f)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: l */
    private static final Class<?> m32567l(ClassLoader classLoader, String str, String str2, int i2) {
        if (C9801m.m32341a(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        String str3 = str + '.' + C10546u.m37524z(str2, '.', '$', false, 4, null);
        if (i2 > 0) {
            str3 = C10546u.m37521w("[", i2) + 'L' + str3 + ';';
        }
        return C10688e.m38024a(classLoader, str3);
    }

    /* renamed from: m */
    private static final Class<?> m32568m(ClassLoader classLoader, C10159b c10159b, int i2) {
        C9929c c9929c = C9929c.f37667a;
        C10161d c10161dM35428j = c10159b.m35409b().m35428j();
        C9801m.m32345e(c10161dM35428j, "kotlinClassId.asSingleFqName().toUnsafe()");
        C10159b c10159bM32929n = c9929c.m32929n(c10161dM35428j);
        if (c10159bM32929n != null) {
            c10159b = c10159bM32929n;
        }
        String strM35420b = c10159b.m35413h().m35420b();
        C9801m.m32345e(strM35420b, "javaClassId.packageFqName.asString()");
        String strM35420b2 = c10159b.m35414i().m35420b();
        C9801m.m32345e(strM35420b2, "javaClassId.relativeClassName.asString()");
        return m32567l(classLoader, strM35420b, strM35420b2, i2);
    }

    /* renamed from: n */
    static /* synthetic */ Class m32569n(ClassLoader classLoader, C10159b c10159b, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return m32568m(classLoader, c10159b, i2);
    }

    /* renamed from: o */
    private static final Annotation m32570o(InterfaceC10616c interfaceC10616c) {
        InterfaceC10585e interfaceC10585eM36071e = C10235a.m36071e(interfaceC10616c);
        Class<?> clsM32571p = interfaceC10585eM36071e != null ? m32571p(interfaceC10585eM36071e) : null;
        if (!(clsM32571p instanceof Class)) {
            clsM32571p = null;
        }
        if (clsM32571p == null) {
            return null;
        }
        Set<Map.Entry<C10163f, AbstractC10211g<?>>> setEntrySet = interfaceC10616c.mo33159a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C10163f c10163f = (C10163f) entry.getKey();
            AbstractC10211g abstractC10211g = (AbstractC10211g) entry.getValue();
            ClassLoader classLoader = clsM32571p.getClassLoader();
            C9801m.m32345e(classLoader, "annotationClass.classLoader");
            Object objM32573r = m32573r(abstractC10211g, classLoader);
            Pair pairM38547a = objM32573r != null ? C10773s.m38547a(c10163f.m35455k(), objM32573r) : null;
            if (pairM38547a != null) {
                arrayList.add(pairM38547a);
            }
        }
        return (Annotation) C9896b.m32648g(clsM32571p, C10810q0.m38805q(arrayList), null, 4, null);
    }

    /* renamed from: p */
    public static final Class<?> m32571p(InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10585e, "<this>");
        InterfaceC10741z0 interfaceC10741z0Mo32883t = interfaceC10585e.mo32883t();
        C9801m.m32345e(interfaceC10741z0Mo32883t, "source");
        if (interfaceC10741z0Mo32883t instanceof C10103s) {
            InterfaceC10101q interfaceC10101qM34029d = ((C10103s) interfaceC10741z0Mo32883t).m34029d();
            C9801m.m32344d(interfaceC10101qM34029d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((C10689f) interfaceC10101qM34029d).m38025d();
        }
        if (interfaceC10741z0Mo32883t instanceof C10695l.a) {
            AbstractC10715p abstractC10715pMo33568b = ((C10695l.a) interfaceC10741z0Mo32883t).mo33568b();
            C9801m.m32344d(abstractC10715pMo33568b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((C10711l) abstractC10715pMo33568b).mo38048w();
        }
        C10159b c10159bM36073g = C10235a.m36073g(interfaceC10585e);
        if (c10159bM36073g == null) {
            return null;
        }
        return m32568m(C10703d.m38073e(interfaceC10585e.getClass()), c10159bM36073g, 0);
    }

    /* renamed from: q */
    public static final KVisibility m32572q(AbstractC10730u abstractC10730u) {
        C9801m.m32346f(abstractC10730u, "<this>");
        if (C9801m.m32341a(abstractC10730u, C10728t.f41220e)) {
            return KVisibility.PUBLIC;
        }
        if (C9801m.m32341a(abstractC10730u, C10728t.f41218c)) {
            return KVisibility.PROTECTED;
        }
        if (C9801m.m32341a(abstractC10730u, C10728t.f41219d)) {
            return KVisibility.INTERNAL;
        }
        if (C9801m.m32341a(abstractC10730u, C10728t.f41216a) ? true : C9801m.m32341a(abstractC10730u, C10728t.f41217b)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    /* renamed from: r */
    private static final Object m32573r(AbstractC10211g<?> abstractC10211g, ClassLoader classLoader) {
        if (abstractC10211g instanceof C10204a) {
            return m32570o(((C10204a) abstractC10211g).mo36023b());
        }
        if (abstractC10211g instanceof C10206b) {
            return m32556a((C10206b) abstractC10211g, classLoader);
        }
        if (abstractC10211g instanceof C10214j) {
            Pair<? extends C10159b, ? extends C10163f> pairMo36023b = ((C10214j) abstractC10211g).mo36023b();
            C10159b c10159bM37646a = pairMo36023b.m37646a();
            C10163f c10163fM37647b = pairMo36023b.m37647b();
            Class clsM32569n = m32569n(classLoader, c10159bM37646a, 0, 4, null);
            if (clsM32569n != null) {
                return C9889f0.m32554a(clsM32569n, c10163fM37647b.m35455k());
            }
            return null;
        }
        if (!(abstractC10211g instanceof C10221q)) {
            if (abstractC10211g instanceof AbstractC10215k ? true : abstractC10211g instanceof C10223s) {
                return null;
            }
            return abstractC10211g.mo36023b();
        }
        C10221q.b bVarMo36023b = ((C10221q) abstractC10211g).mo36023b();
        if (bVarMo36023b instanceof C10221q.b.C11561b) {
            C10221q.b.C11561b c11561b = (C10221q.b.C11561b) bVarMo36023b;
            return m32568m(classLoader, c11561b.m36056b(), c11561b.m36055a());
        }
        if (!(bVarMo36023b instanceof C10221q.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC10594h interfaceC10594hMo32887c = ((C10221q.b.a) bVarMo36023b).m36054a().mo35993O0().mo32891w();
        InterfaceC10585e interfaceC10585e = interfaceC10594hMo32887c instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10594hMo32887c : null;
        if (interfaceC10585e != null) {
            return m32571p(interfaceC10585e);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    private static final List<Annotation> m32574s(List<? extends Annotation> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        List listM38883e;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C9801m.m32341a(C9752a.m32276b(C9752a.m32275a((Annotation) it.next())).getSimpleName(), "Container")) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : list) {
            Class clsM32276b = C9752a.m32276b(C9752a.m32275a(annotation));
            if (!C9801m.m32341a(clsM32276b.getSimpleName(), "Container") || clsM32276b.getAnnotation(InterfaceC9794i0.class) == null) {
                listM38883e = C10815t.m38883e(annotation);
            } else {
                Object objInvoke = clsM32276b.getDeclaredMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                C9801m.m32344d(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                listM38883e = C10801m.m38702c((Annotation[]) objInvoke);
            }
            C10827z.m38933z(arrayList, listM38883e);
        }
        return arrayList;
    }
}
