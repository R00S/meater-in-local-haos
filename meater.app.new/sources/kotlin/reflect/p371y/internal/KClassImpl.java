package kotlin.reflect.p371y.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10782c0;
import kotlin.collections.C10803n;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.C9752a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.C10736x;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10689f;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10694k;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h;
import kotlin.reflect.p371y.internal.C9879a0;
import kotlin.reflect.p371y.internal.KDeclarationContainerImpl;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9909c;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9910d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9941d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10086a;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10153e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10313w;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10287d;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import okhttp3.HttpUrl;

/* compiled from: KClassImpl.kt */
@Metadata(m32266d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\u00020\u0006:\u0001eB\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0013\u0010T\u001a\u00020&2\b\u0010U\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u00142\u0006\u0010X\u001a\u00020YH\u0016J\u0012\u0010Z\u001a\u0004\u0018\u00010[2\u0006\u0010\\\u001a\u00020]H\u0016J\u0016\u0010^\u001a\b\u0012\u0004\u0012\u00020[0\u00142\u0006\u0010X\u001a\u00020YH\u0016J\b\u0010_\u001a\u00020]H\u0016J\u0012\u0010`\u001a\u00020&2\b\u0010a\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010b\u001a\u00020cH\u0002J\b\u0010d\u001a\u00020AH\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R3\u0010\u001b\u001a$\u0012 \u0012\u001e \u001e*\u000e\u0018\u00010\u001dR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001dR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010'R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010'R\u0014\u0010+\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010'R\u0014\u0010,\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010'R\u0014\u0010-\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0014\u0010.\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010'R\u001a\u0010/\u001a\u00020&8VX\u0096\u0004¢\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010'R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001e\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0017R\u001e\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0017R\u0016\u0010=\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010@\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\"\u0010D\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u000eR\u0016\u0010F\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010CR\u0014\u0010H\u001a\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u00107R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u000eR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u000eR\u0016\u0010P\u001a\u0004\u0018\u00010Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getAnnotations", "()Ljava/util/List;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "constructorDescriptors", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "getData", "()Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "isAbstract", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isCompanion", "isData", "isFinal", "isFun", "isInner", "isOpen", "isSealed", "isValue", "isValue$annotations", "()V", "getJClass", "()Ljava/lang/Class;", "memberScope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", HttpUrl.FRAGMENT_ENCODE_SET, "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses", "simpleName", "getSimpleName", "staticScope", "getStaticScope$kotlin_reflection", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", HttpUrl.FRAGMENT_ENCODE_SET, "getProperties", "hashCode", "isInstance", "value", "reportUnresolvedClass", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Data", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.h, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KClassImpl<T> extends KDeclarationContainerImpl implements KClass<T>, KTypeParameterOwnerImpl {

    /* renamed from: i */
    private final Class<T> f37318i;

    /* renamed from: j */
    private final C9879a0.b<KClassImpl<T>.a> f37319j;

    /* compiled from: KClassImpl.kt */
    @Metadata(m32266d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010N\u001a\u00020<2\n\u0010O\u001a\u0006\u0012\u0002\b\u00030PH\u0002R%\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR%\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R-\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\bR%\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\bR%\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b!\u0010\bR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\bR\u001b\u0010&\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)R%\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b,\u0010\bR%\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b/\u0010\bR%\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b3\u0010\bR#\u00105\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u00108R\u001d\u0010;\u001a\u0004\u0018\u00010<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b=\u0010>R)\u0010@\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u0000020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\n\u001a\u0004\bA\u0010\u0015R\u001d\u0010C\u001a\u0004\u0018\u00010<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bD\u0010>R!\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bH\u0010\u0015R!\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bL\u0010\u0015¨\u0006Q"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "allMembers", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getAllMembers", "()Ljava/util/Collection;", "allMembers$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "allNonStaticMembers", "getAllNonStaticMembers", "allNonStaticMembers$delegate", "allStaticMembers", "getAllStaticMembers", "allStaticMembers$delegate", "annotations", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors$annotations", "()V", "getConstructors", "constructors$delegate", "declaredMembers", "getDeclaredMembers", "declaredMembers$delegate", "declaredNonStaticMembers", "getDeclaredNonStaticMembers", "declaredNonStaticMembers$delegate", "declaredStaticMembers", "getDeclaredStaticMembers", "declaredStaticMembers$delegate", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor$delegate", "inheritedNonStaticMembers", "getInheritedNonStaticMembers", "inheritedNonStaticMembers$delegate", "inheritedStaticMembers", "getInheritedStaticMembers", "inheritedStaticMembers$delegate", "nestedClasses", "Lkotlin/reflect/KClass;", "getNestedClasses", "nestedClasses$delegate", "objectInstance", "getObjectInstance$annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "qualifiedName", HttpUrl.FRAGMENT_ENCODE_SET, "getQualifiedName", "()Ljava/lang/String;", "qualifiedName$delegate", "sealedSubclasses", "getSealedSubclasses", "sealedSubclasses$delegate", "simpleName", "getSimpleName", "simpleName$delegate", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes$delegate", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters$delegate", "calculateLocalClassName", "jClass", "Ljava/lang/Class;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.h$a */
    public final class a extends KDeclarationContainerImpl.b {

        /* renamed from: d */
        static final /* synthetic */ KProperty<Object>[] f37320d = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "annotations", "getAnnotations()Ljava/util/List;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: e */
        private final C9879a0.a f37321e;

        /* renamed from: f */
        private final C9879a0.a f37322f;

        /* renamed from: g */
        private final C9879a0.a f37323g;

        /* renamed from: h */
        private final C9879a0.a f37324h;

        /* renamed from: i */
        private final C9879a0.a f37325i;

        /* renamed from: j */
        private final C9879a0.a f37326j;

        /* renamed from: k */
        private final C9879a0.b f37327k;

        /* renamed from: l */
        private final C9879a0.a f37328l;

        /* renamed from: m */
        private final C9879a0.a f37329m;

        /* renamed from: n */
        private final C9879a0.a f37330n;

        /* renamed from: o */
        private final C9879a0.a f37331o;

        /* renamed from: p */
        private final C9879a0.a f37332p;

        /* renamed from: q */
        private final C9879a0.a f37333q;

        /* renamed from: r */
        private final C9879a0.a f37334r;

        /* renamed from: s */
        private final C9879a0.a f37335s;

        /* renamed from: t */
        private final C9879a0.a f37336t;

        /* renamed from: u */
        private final C9879a0.a f37337u;

        /* renamed from: v */
        private final C9879a0.a f37338v;

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$a, reason: collision with other inner class name */
        static final class C11539a extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37340f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11539a(KClassImpl<T>.a aVar) {
                super(0);
                this.f37340f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                return C10782c0.m38609o0(this.f37340f.m32592g(), this.f37340f.m32593h());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$b */
        static final class b extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37341f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(KClassImpl<T>.a aVar) {
                super(0);
                this.f37341f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                return C10782c0.m38609o0(this.f37341f.m32596k(), this.f37341f.m32590n());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$c */
        static final class c extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37342f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(KClassImpl<T>.a aVar) {
                super(0);
                this.f37342f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                return C10782c0.m38609o0(this.f37342f.m32589l(), this.f37342f.m32591o());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$d */
        static final class d extends Lambda implements Function0<List<? extends Annotation>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37343f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(KClassImpl<T>.a aVar) {
                super(0);
                this.f37343f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Annotation> invoke() {
                return C9891g0.m32560e(this.f37343f.m32597m());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KFunction;", "T", "kotlin.jvm.PlatformType", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$e */
        static final class e extends Lambda implements Function0<List<? extends KFunction<? extends T>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37344f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37344f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<KFunction<T>> invoke() {
                Collection<InterfaceC10606l> collectionMo32487A = this.f37344f.mo32487A();
                KClassImpl<T> kClassImpl = this.f37344f;
                ArrayList arrayList = new ArrayList(C10819v.m38911u(collectionMo32487A, 10));
                Iterator<T> it = collectionMo32487A.iterator();
                while (it.hasNext()) {
                    arrayList.add(new KFunctionImpl(kClassImpl, (InterfaceC10606l) it.next()));
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$f */
        static final class f extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37345f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(KClassImpl<T>.a aVar) {
                super(0);
                this.f37345f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                return C10782c0.m38609o0(this.f37345f.m32596k(), this.f37345f.m32589l());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$g */
        static final class g extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37346f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37346f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f37346f;
                return kClassImpl.m32619D(kClassImpl.m32582S(), KDeclarationContainerImpl.c.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$h */
        static final class h extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37347f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37347f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f37347f;
                return kClassImpl.m32619D(kClassImpl.m32583T(), KDeclarationContainerImpl.c.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$i */
        static final class i extends Lambda implements Function0<InterfaceC10585e> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37348f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37348f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10585e invoke() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
                C10159b c10159bM32577O = this.f37348f.m32577O();
                C10694k c10694kM32628a = this.f37348f.m32580Q().invoke().m32628a();
                InterfaceC10585e interfaceC10585eM36417b = c10159bM32577O.m35416k() ? c10694kM32628a.m38031a().m36417b(c10159bM32577O) : C10736x.m38149a(c10694kM32628a.m38032b(), c10159bM32577O);
                if (interfaceC10585eM36417b != null) {
                    return interfaceC10585eM36417b;
                }
                this.f37348f.m32578U();
                throw null;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$j */
        static final class j extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37349f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37349f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f37349f;
                return kClassImpl.m32619D(kClassImpl.m32582S(), KDeclarationContainerImpl.c.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$k */
        static final class k extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37350f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37350f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f37350f;
                return kClassImpl.m32619D(kClassImpl.m32583T(), KDeclarationContainerImpl.c.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a6\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002 \u0004*\u001a\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KClassImpl;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "T", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$l */
        static final class l extends Lambda implements Function0<List<? extends KClassImpl<? extends Object>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37351f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(KClassImpl<T>.a aVar) {
                super(0);
                this.f37351f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KClassImpl<? extends Object>> invoke() {
                InterfaceC10251h interfaceC10251hMo33348y0 = this.f37351f.m32597m().mo33348y0();
                C9801m.m32345e(interfaceC10251hMo33348y0, "descriptor.unsubstitutedInnerClassesScope");
                Collection collectionM36162a = InterfaceC10254k.a.m36162a(interfaceC10251hMo33348y0, null, null, 3, null);
                ArrayList<InterfaceC10609m> arrayList = new ArrayList();
                for (T t : collectionM36162a) {
                    if (!C10187d.m35801B((InterfaceC10609m) t)) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC10609m interfaceC10609m : arrayList) {
                    InterfaceC10585e interfaceC10585e = interfaceC10609m instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10609m : null;
                    Class<?> clsM32571p = interfaceC10585e != null ? C9891g0.m32571p(interfaceC10585e) : null;
                    KClassImpl kClassImpl = clsM32571p != null ? new KClassImpl(clsM32571p) : null;
                    if (kClassImpl != null) {
                        arrayList2.add(kClassImpl);
                    }
                }
                return arrayList2;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m32267d2 = {"<anonymous>", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke", "()Ljava/lang/Object;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$m */
        static final class m extends Lambda implements Function0<T> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37352f;

            /* renamed from: g */
            final /* synthetic */ KClassImpl<T> f37353g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            m(KClassImpl<T>.a aVar, KClassImpl<T> kClassImpl) {
                super(0);
                this.f37352f = aVar;
                this.f37353g = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                InterfaceC10585e interfaceC10585eM32597m = this.f37352f.m32597m();
                if (interfaceC10585eM32597m.mo32878i() != EnumC10588f.OBJECT) {
                    return null;
                }
                T t = (T) ((!interfaceC10585eM32597m.mo32857A() || C9910d.m32702a(C9909c.f37450a, interfaceC10585eM32597m)) ? this.f37353g.mo32283a().getDeclaredField("INSTANCE") : this.f37353g.mo32283a().getEnclosingClass().getDeclaredField(interfaceC10585eM32597m.getName().m35455k())).get(null);
                C9801m.m32344d(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return t;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$n */
        static final class n extends Lambda implements Function0<String> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37354f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(KClassImpl<T> kClassImpl) {
                super(0);
                this.f37354f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                if (this.f37354f.mo32283a().isAnonymousClass()) {
                    return null;
                }
                C10159b c10159bM32577O = this.f37354f.m32577O();
                if (c10159bM32577O.m35416k()) {
                    return null;
                }
                return c10159bM32577O.m35409b().m35420b();
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "kotlin.jvm.PlatformType", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$o */
        static final class o extends Lambda implements Function0<List<? extends KClassImpl<? extends T>>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37355f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            o(KClassImpl<T>.a aVar) {
                super(0);
                this.f37355f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<KClassImpl<? extends T>> invoke() {
                Collection<InterfaceC10585e> collectionMo32861J = this.f37355f.m32597m().mo32861J();
                C9801m.m32345e(collectionMo32861J, "descriptor.sealedSubclasses");
                ArrayList arrayList = new ArrayList();
                for (InterfaceC10585e interfaceC10585e : collectionMo32861J) {
                    C9801m.m32344d(interfaceC10585e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> clsM32571p = C9891g0.m32571p(interfaceC10585e);
                    KClassImpl kClassImpl = clsM32571p != null ? new KClassImpl(clsM32571p) : null;
                    if (kClassImpl != null) {
                        arrayList.add(kClassImpl);
                    }
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$p */
        static final class p extends Lambda implements Function0<String> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T> f37356f;

            /* renamed from: g */
            final /* synthetic */ KClassImpl<T>.a f37357g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            p(KClassImpl<T> kClassImpl, KClassImpl<T>.a aVar) {
                super(0);
                this.f37356f = kClassImpl;
                this.f37357g = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                if (this.f37356f.mo32283a().isAnonymousClass()) {
                    return null;
                }
                C10159b c10159bM32577O = this.f37356f.m32577O();
                if (c10159bM32577O.m35416k()) {
                    return this.f37357g.m32588f(this.f37356f.mo32283a());
                }
                String strM35455k = c10159bM32577O.m35415j().m35455k();
                C9801m.m32345e(strM35455k, "classId.shortClassName.asString()");
                return strM35455k;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$q */
        static final class q extends Lambda implements Function0<List<? extends KTypeImpl>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37358f;

            /* renamed from: g */
            final /* synthetic */ KClassImpl<T> f37359g;

            /* compiled from: KClassImpl.kt */
            @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
            /* renamed from: kotlin.f0.y.e.h$a$q$a, reason: collision with other inner class name */
            static final class C11540a extends Lambda implements Function0<Type> {

                /* renamed from: f */
                final /* synthetic */ AbstractC10344e0 f37360f;

                /* renamed from: g */
                final /* synthetic */ KClassImpl<T>.a f37361g;

                /* renamed from: h */
                final /* synthetic */ KClassImpl<T> f37362h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11540a(AbstractC10344e0 abstractC10344e0, KClassImpl<T>.a aVar, KClassImpl<T> kClassImpl) {
                    super(0);
                    this.f37360f = abstractC10344e0;
                    this.f37361g = aVar;
                    this.f37362h = kClassImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Type invoke() {
                    InterfaceC10594h interfaceC10594hMo32891w = this.f37360f.mo35993O0().mo32891w();
                    if (!(interfaceC10594hMo32891w instanceof InterfaceC10585e)) {
                        throw new KotlinReflectionInternalError("Supertype not a class: " + interfaceC10594hMo32891w);
                    }
                    Class<?> clsM32571p = C9891g0.m32571p((InterfaceC10585e) interfaceC10594hMo32891w);
                    if (clsM32571p == null) {
                        throw new KotlinReflectionInternalError("Unsupported superclass of " + this.f37361g + ": " + interfaceC10594hMo32891w);
                    }
                    if (C9801m.m32341a(this.f37362h.mo32283a().getSuperclass(), clsM32571p)) {
                        Type genericSuperclass = this.f37362h.mo32283a().getGenericSuperclass();
                        C9801m.m32345e(genericSuperclass, "{\n                      …ass\n                    }");
                        return genericSuperclass;
                    }
                    Class<?>[] interfaces = this.f37362h.mo32283a().getInterfaces();
                    C9801m.m32345e(interfaces, "jClass.interfaces");
                    int iM38725E = C10803n.m38725E(interfaces, clsM32571p);
                    if (iM38725E >= 0) {
                        Type type = this.f37362h.mo32283a().getGenericInterfaces()[iM38725E];
                        C9801m.m32345e(type, "{\n                      …ex]\n                    }");
                        return type;
                    }
                    throw new KotlinReflectionInternalError("No superclass of " + this.f37361g + " in Java reflection for " + interfaceC10594hMo32891w);
                }
            }

            /* compiled from: KClassImpl.kt */
            @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
            /* renamed from: kotlin.f0.y.e.h$a$q$b */
            static final class b extends Lambda implements Function0<Type> {

                /* renamed from: f */
                public static final b f37363f = new b();

                b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Type invoke() {
                    return Object.class;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            q(KClassImpl<T>.a aVar, KClassImpl<T> kClassImpl) {
                super(0);
                this.f37358f = aVar;
                this.f37359g = kClassImpl;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List<? extends kotlin.reflect.p371y.internal.KTypeImpl> invoke() {
                /*
                    r7 = this;
                    kotlin.f0.y.e.h<T>$a r0 = r7.f37358f
                    kotlin.reflect.jvm.internal.impl.descriptors.e r0 = r0.m32597m()
                    kotlin.f0.y.e.j0.l.e1 r0 = r0.mo32877h()
                    java.util.Collection r0 = r0.mo35998a()
                    java.lang.String r1 = "descriptor.typeConstructor.supertypes"
                    kotlin.jvm.internal.C9801m.m32345e(r0, r1)
                    java.util.ArrayList r1 = new java.util.ArrayList
                    int r2 = r0.size()
                    r1.<init>(r2)
                    kotlin.f0.y.e.h<T>$a r2 = r7.f37358f
                    kotlin.f0.y.e.h<T> r3 = r7.f37359g
                    java.util.Iterator r0 = r0.iterator()
                L24:
                    boolean r4 = r0.hasNext()
                    if (r4 == 0) goto L43
                    java.lang.Object r4 = r0.next()
                    kotlin.f0.y.e.j0.l.e0 r4 = (kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0) r4
                    kotlin.f0.y.e.v r5 = new kotlin.f0.y.e.v
                    java.lang.String r6 = "kotlinType"
                    kotlin.jvm.internal.C9801m.m32345e(r4, r6)
                    kotlin.f0.y.e.h$a$q$a r6 = new kotlin.f0.y.e.h$a$q$a
                    r6.<init>(r4, r2, r3)
                    r5.<init>(r4, r6)
                    r1.add(r5)
                    goto L24
                L43:
                    kotlin.f0.y.e.h<T>$a r0 = r7.f37358f
                    kotlin.reflect.jvm.internal.impl.descriptors.e r0 = r0.m32597m()
                    boolean r0 = kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h.m32759t0(r0)
                    if (r0 != 0) goto La7
                    boolean r0 = r1.isEmpty()
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L59
                L57:
                    r2 = 1
                    goto L88
                L59:
                    java.util.Iterator r0 = r1.iterator()
                L5d:
                    boolean r4 = r0.hasNext()
                    if (r4 == 0) goto L57
                    java.lang.Object r4 = r0.next()
                    kotlin.f0.y.e.v r4 = (kotlin.reflect.p371y.internal.KTypeImpl) r4
                    kotlin.f0.y.e.j0.l.e0 r4 = r4.getF40589g()
                    kotlin.reflect.jvm.internal.impl.descriptors.e r4 = kotlin.reflect.p371y.internal.p374j0.p400i.C10187d.m35817e(r4)
                    kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r4.mo32878i()
                    java.lang.String r5 = "getClassDescriptorForType(it.type).kind"
                    kotlin.jvm.internal.C9801m.m32345e(r4, r5)
                    kotlin.reflect.jvm.internal.impl.descriptors.f r5 = kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f.INTERFACE
                    if (r4 == r5) goto L85
                    kotlin.reflect.jvm.internal.impl.descriptors.f r5 = kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f.ANNOTATION_CLASS
                    if (r4 != r5) goto L83
                    goto L85
                L83:
                    r4 = 0
                    goto L86
                L85:
                    r4 = 1
                L86:
                    if (r4 != 0) goto L5d
                L88:
                    if (r2 == 0) goto La7
                    kotlin.f0.y.e.v r0 = new kotlin.f0.y.e.v
                    kotlin.f0.y.e.h<T>$a r2 = r7.f37358f
                    kotlin.reflect.jvm.internal.impl.descriptors.e r2 = r2.m32597m()
                    kotlin.f0.y.e.j0.b.h r2 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a.m36072f(r2)
                    kotlin.f0.y.e.j0.l.m0 r2 = r2.m32791i()
                    java.lang.String r3 = "descriptor.builtIns.anyType"
                    kotlin.jvm.internal.C9801m.m32345e(r2, r3)
                    kotlin.f0.y.e.h$a$q$b r3 = kotlin.reflect.p371y.internal.KClassImpl.a.q.b.f37363f
                    r0.<init>(r2, r3)
                    r1.add(r0)
                La7:
                    java.util.List r0 = kotlin.reflect.jvm.internal.impl.utils.C10767a.m38510c(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.KClassImpl.a.q.invoke():java.util.List");
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.f0.y.e.h$a$r */
        static final class r extends Lambda implements Function0<List<? extends KTypeParameterImpl>> {

            /* renamed from: f */
            final /* synthetic */ KClassImpl<T>.a f37364f;

            /* renamed from: g */
            final /* synthetic */ KClassImpl<T> f37365g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            r(KClassImpl<T>.a aVar, KClassImpl<T> kClassImpl) {
                super(0);
                this.f37364f = aVar;
                this.f37365g = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KTypeParameterImpl> invoke() {
                List<InterfaceC10587e1> listMo32884w = this.f37364f.m32597m().mo32884w();
                C9801m.m32345e(listMo32884w, "descriptor.declaredTypeParameters");
                KClassImpl<T> kClassImpl = this.f37365g;
                ArrayList arrayList = new ArrayList(C10819v.m38911u(listMo32884w, 10));
                for (InterfaceC10587e1 interfaceC10587e1 : listMo32884w) {
                    C9801m.m32345e(interfaceC10587e1, "descriptor");
                    arrayList.add(new KTypeParameterImpl(kClassImpl, interfaceC10587e1));
                }
                return arrayList;
            }
        }

        public a() {
            super();
            this.f37321e = C9879a0.m32480d(new i(KClassImpl.this));
            this.f37322f = C9879a0.m32480d(new d(this));
            this.f37323g = C9879a0.m32480d(new p(KClassImpl.this, this));
            this.f37324h = C9879a0.m32480d(new n(KClassImpl.this));
            this.f37325i = C9879a0.m32480d(new e(KClassImpl.this));
            this.f37326j = C9879a0.m32480d(new l(this));
            this.f37327k = C9879a0.m32478b(new m(this, KClassImpl.this));
            this.f37328l = C9879a0.m32480d(new r(this, KClassImpl.this));
            this.f37329m = C9879a0.m32480d(new q(this, KClassImpl.this));
            this.f37330n = C9879a0.m32480d(new o(this));
            this.f37331o = C9879a0.m32480d(new g(KClassImpl.this));
            this.f37332p = C9879a0.m32480d(new h(KClassImpl.this));
            this.f37333q = C9879a0.m32480d(new j(KClassImpl.this));
            this.f37334r = C9879a0.m32480d(new k(KClassImpl.this));
            this.f37335s = C9879a0.m32480d(new b(this));
            this.f37336t = C9879a0.m32480d(new c(this));
            this.f37337u = C9879a0.m32480d(new f(this));
            this.f37338v = C9879a0.m32480d(new C11539a(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final String m32588f(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                C9801m.m32345e(simpleName, "name");
                return C10547v.m37533G0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                C9801m.m32345e(simpleName, "name");
                return C10547v.m37531F0(simpleName, '$', null, 2, null);
            }
            C9801m.m32345e(simpleName, "name");
            return C10547v.m37533G0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public final Collection<KCallableImpl<?>> m32589l() {
            T tM32484c = this.f37332p.m32484c(this, f37320d[11]);
            C9801m.m32345e(tM32484c, "<get-declaredStaticMembers>(...)");
            return (Collection) tM32484c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public final Collection<KCallableImpl<?>> m32590n() {
            T tM32484c = this.f37333q.m32484c(this, f37320d[12]);
            C9801m.m32345e(tM32484c, "<get-inheritedNonStaticMembers>(...)");
            return (Collection) tM32484c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final Collection<KCallableImpl<?>> m32591o() {
            T tM32484c = this.f37334r.m32484c(this, f37320d[13]);
            C9801m.m32345e(tM32484c, "<get-inheritedStaticMembers>(...)");
            return (Collection) tM32484c;
        }

        /* renamed from: g */
        public final Collection<KCallableImpl<?>> m32592g() {
            T tM32484c = this.f37335s.m32484c(this, f37320d[14]);
            C9801m.m32345e(tM32484c, "<get-allNonStaticMembers>(...)");
            return (Collection) tM32484c;
        }

        /* renamed from: h */
        public final Collection<KCallableImpl<?>> m32593h() {
            T tM32484c = this.f37336t.m32484c(this, f37320d[15]);
            C9801m.m32345e(tM32484c, "<get-allStaticMembers>(...)");
            return (Collection) tM32484c;
        }

        /* renamed from: i */
        public final List<Annotation> m32594i() {
            T tM32484c = this.f37322f.m32484c(this, f37320d[1]);
            C9801m.m32345e(tM32484c, "<get-annotations>(...)");
            return (List) tM32484c;
        }

        /* renamed from: j */
        public final Collection<KFunction<T>> m32595j() {
            T tM32484c = this.f37325i.m32484c(this, f37320d[4]);
            C9801m.m32345e(tM32484c, "<get-constructors>(...)");
            return (Collection) tM32484c;
        }

        /* renamed from: k */
        public final Collection<KCallableImpl<?>> m32596k() {
            T tM32484c = this.f37331o.m32484c(this, f37320d[10]);
            C9801m.m32345e(tM32484c, "<get-declaredNonStaticMembers>(...)");
            return (Collection) tM32484c;
        }

        /* renamed from: m */
        public final InterfaceC10585e m32597m() {
            T tM32484c = this.f37321e.m32484c(this, f37320d[0]);
            C9801m.m32345e(tM32484c, "<get-descriptor>(...)");
            return (InterfaceC10585e) tM32484c;
        }

        /* renamed from: p */
        public final T m32598p() {
            return this.f37327k.m32484c(this, f37320d[6]);
        }

        /* renamed from: q */
        public final String m32599q() {
            return (String) this.f37324h.m32484c(this, f37320d[3]);
        }

        /* renamed from: r */
        public final String m32600r() {
            return (String) this.f37323g.m32484c(this, f37320d[2]);
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.h$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37366a;

        static {
            int[] iArr = new int[C10086a.a.values().length];
            iArr[C10086a.a.FILE_FACADE.ordinal()] = 1;
            iArr[C10086a.a.MULTIFILE_CLASS.ordinal()] = 2;
            iArr[C10086a.a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            iArr[C10086a.a.SYNTHETIC_CLASS.ordinal()] = 4;
            iArr[C10086a.a.UNKNOWN.ordinal()] = 5;
            iArr[C10086a.a.CLASS.ordinal()] = 6;
            f37366a = iArr;
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e \u0004*\u000e\u0018\u00010\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "kotlin.jvm.PlatformType", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.h$c */
    static final class c extends Lambda implements Function0<KClassImpl<T>.a> {

        /* renamed from: f */
        final /* synthetic */ KClassImpl<T> f37367f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(KClassImpl<T> kClassImpl) {
            super(0);
            this.f37367f = kClassImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KClassImpl<T>.a invoke() {
            return this.f37367f.new a();
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.h$d */
    /* synthetic */ class d extends C9793i implements Function2<C10313w, C10135n, InterfaceC10729t0> {

        /* renamed from: h */
        public static final d f37368h = new d();

        d() {
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

    public KClassImpl(Class<T> cls) {
        C9801m.m32346f(cls, "jClass");
        this.f37318i = cls;
        C9879a0.b<KClassImpl<T>.a> bVarM32478b = C9879a0.m32478b(new c(this));
        C9801m.m32345e(bVarM32478b, "lazy { Data() }");
        this.f37319j = bVarM32478b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public final C10159b m32577O() {
        return RuntimeTypeMapper.f37288a.m32519c(mo32283a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public final Void m32578U() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C10086a c10086aMo34025a;
        C10689f c10689fM38026a = C10689f.f41143a.m38026a(mo32283a());
        C10086a.a aVarM33913c = (c10689fM38026a == null || (c10086aMo34025a = c10689fM38026a.mo34025a()) == null) ? null : c10086aMo34025a.m33913c();
        switch (aVarM33913c == null ? -1 : b.f37366a[aVarM33913c.ordinal()]) {
            case -1:
            case 6:
                throw new KotlinReflectionInternalError("Unresolved class: " + mo32283a());
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                throw new UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + mo32283a());
            case 4:
                throw new UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: " + mo32283a());
            case 5:
                throw new KotlinReflectionInternalError("Unknown class: " + mo32283a() + " (kind = " + aVarM33913c + ')');
        }
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: A */
    public Collection<InterfaceC10606l> mo32487A() {
        InterfaceC10585e interfaceC10585eM32581R = m32581R();
        if (interfaceC10585eM32581R.mo32878i() == EnumC10588f.INTERFACE || interfaceC10585eM32581R.mo32878i() == EnumC10588f.OBJECT) {
            return C10817u.m38888j();
        }
        Collection<InterfaceC10582d> collectionMo32880k = interfaceC10585eM32581R.mo32880k();
        C9801m.m32345e(collectionMo32880k, "descriptor.constructors");
        return collectionMo32880k;
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: B */
    public Collection<InterfaceC10738y> mo32488B(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        InterfaceC10251h interfaceC10251hM32582S = m32582S();
        EnumC9941d enumC9941d = EnumC9941d.FROM_REFLECTION;
        return C10782c0.m38609o0(interfaceC10251hM32582S.mo33311a(c10163f, enumC9941d), m32583T().mo33311a(c10163f, enumC9941d));
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: C */
    public InterfaceC10729t0 mo32489C(int i2) {
        Class<?> declaringClass;
        if (C9801m.m32341a(mo32283a().getSimpleName(), "DefaultImpls") && (declaringClass = mo32283a().getDeclaringClass()) != null && declaringClass.isInterface()) {
            KClass kClassM32279e = C9752a.m32279e(declaringClass);
            C9801m.m32344d(kClassM32279e, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((KClassImpl) kClassM32279e).mo32489C(i2);
        }
        InterfaceC10585e interfaceC10585eM32581R = m32581R();
        C10287d c10287d = interfaceC10585eM32581R instanceof C10287d ? (C10287d) interfaceC10585eM32581R : null;
        if (c10287d == null) {
            return null;
        }
        C10124c c10124cM36283c1 = c10287d.m36283c1();
        AbstractC10749h.f<C10124c, List<C10135n>> fVar = C10112a.f38500j;
        C9801m.m32345e(fVar, "classLocalVariable");
        C10135n c10135n = (C10135n) C10153e.m35381b(c10124cM36283c1, fVar, i2);
        if (c10135n != null) {
            return (InterfaceC10729t0) C9891g0.m32563h(mo32283a(), c10135n, c10287d.m36282b1().m36456g(), c10287d.m36282b1().m36459j(), c10287d.m36284e1(), d.f37368h);
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.KDeclarationContainerImpl
    /* renamed from: F */
    public Collection<InterfaceC10729t0> mo32490F(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        InterfaceC10251h interfaceC10251hM32582S = m32582S();
        EnumC9941d enumC9941d = EnumC9941d.FROM_REFLECTION;
        return C10782c0.m38609o0(interfaceC10251hM32582S.mo33313c(c10163f, enumC9941d), m32583T().mo33313c(c10163f, enumC9941d));
    }

    /* renamed from: P */
    public Collection<KFunction<T>> m32579P() {
        return this.f37319j.invoke().m32595j();
    }

    /* renamed from: Q */
    public final C9879a0.b<KClassImpl<T>.a> m32580Q() {
        return this.f37319j;
    }

    /* renamed from: R */
    public InterfaceC10585e m32581R() {
        return this.f37319j.invoke().m32597m();
    }

    /* renamed from: S */
    public final InterfaceC10251h m32582S() {
        return m32581R().mo36400s().mo33553q();
    }

    /* renamed from: T */
    public final InterfaceC10251h m32583T() {
        InterfaceC10251h interfaceC10251hMo32866S = m32581R().mo32866S();
        C9801m.m32345e(interfaceC10251hMo32866S, "descriptor.staticScope");
        return interfaceC10251hMo32866S;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    /* renamed from: a */
    public Class<T> mo32283a() {
        return this.f37318i;
    }

    public boolean equals(Object other) {
        return (other instanceof KClassImpl) && C9801m.m32341a(C9752a.m32277c(this), C9752a.m32277c((KClass) other));
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return this.f37319j.invoke().m32594i();
    }

    public int hashCode() {
        return C9752a.m32277c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean isAbstract() {
        return m32581R().mo32879j() == EnumC10583d0.ABSTRACT;
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: l */
    public boolean mo32287l() {
        return m32581R().mo32881l();
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: m */
    public boolean mo32288m() {
        return m32581R().mo32882m();
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: o */
    public boolean mo32289o() {
        return m32581R().mo32879j() == EnumC10583d0.SEALED;
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: p */
    public String mo32290p() {
        return this.f37319j.invoke().m32599q();
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: q */
    public String mo32291q() {
        return this.f37319j.invoke().m32600r();
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: r */
    public T mo32292r() {
        return this.f37319j.invoke().m32598p();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        C10159b c10159bM32577O = m32577O();
        C10160c c10160cM35413h = c10159bM32577O.m35413h();
        C9801m.m32345e(c10160cM35413h, "classId.packageFqName");
        if (c10160cM35413h.m35422d()) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = c10160cM35413h.m35420b() + '.';
        }
        String strM35420b = c10159bM32577O.m35414i().m35420b();
        C9801m.m32345e(strM35420b, "classId.relativeClassName.asString()");
        sb.append(str + C10546u.m37524z(strM35420b, '.', '$', false, 4, null));
        return sb.toString();
    }
}
