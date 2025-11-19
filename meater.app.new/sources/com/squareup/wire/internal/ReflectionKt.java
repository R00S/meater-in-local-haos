package com.squareup.wire.internal;

import Aa.a;
import Ia.d;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.OneOf;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4172q;
import oa.C4173r;

/* compiled from: reflection.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a`\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u001at\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\b\u001a\u00020\t\u001aH\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0002\u001aF\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¨\u0006\u0016"}, d2 = {"createRuntimeMessageAdapter", "Lcom/squareup/wire/internal/RuntimeMessageAdapter;", "M", "B", "Lcom/squareup/wire/Message;", "Lcom/squareup/wire/Message$Builder;", "messageType", "Ljava/lang/Class;", "writeIdentityValues", "", "classLoader", "Ljava/lang/ClassLoader;", "typeUrl", "", "syntax", "Lcom/squareup/wire/Syntax;", "getBuilderType", "getKeys", "", "Lcom/squareup/wire/OneOf$Key;", "messageField", "Ljava/lang/reflect/Field;", "wire-runtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReflectionKt {
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(Class<M> messageType, String str, Syntax syntax, ClassLoader classLoader, boolean z10) {
        C3862t.g(messageType, "messageType");
        C3862t.g(syntax, "syntax");
        Class builderType = getBuilderType(messageType);
        ReflectionKt$createRuntimeMessageAdapter$newBuilderInstance$1 reflectionKt$createRuntimeMessageAdapter$newBuilderInstance$1 = new ReflectionKt$createRuntimeMessageAdapter$newBuilderInstance$1(builderType, messageType);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Field[] declaredFields = messageType.getDeclaredFields();
        C3862t.f(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                Integer numValueOf = Integer.valueOf(wireField.tag());
                C3862t.d(field);
                linkedHashMap.put(numValueOf, new FieldBinding(wireField, messageType, field, builderType, z10, classLoader));
            } else if (C3862t.b(field.getType(), OneOf.class)) {
                C3862t.d(field);
                for (OneOf.Key<?> key : getKeys(field)) {
                    linkedHashMap.put(Integer.valueOf(key.getTag()), new OneOfBinding(field, builderType, key, z10));
                }
            }
        }
        d dVarE = a.e(messageType);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C3862t.f(mapUnmodifiableMap, "unmodifiableMap(...)");
        return new RuntimeMessageAdapter<>(new RuntimeMessageBinding(dVarE, builderType, reflectionKt$createRuntimeMessageAdapter$newBuilderInstance$1, mapUnmodifiableMap, str, syntax));
    }

    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, String str, Syntax syntax, ClassLoader classLoader, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            classLoader = cls.getClassLoader();
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return createRuntimeMessageAdapter(cls, str, syntax, classLoader, z10);
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        Object objA;
        try {
            C4172q.Companion aVar = C4172q.INSTANCE;
            Class<?> cls2 = Class.forName(cls.getName() + "$Builder");
            C3862t.e(cls2, "null cannot be cast to non-null type java.lang.Class<B of com.squareup.wire.internal.ReflectionKt.getBuilderType$lambda$0>");
            objA = C4172q.a(cls2);
        } catch (Throwable th) {
            C4172q.Companion aVar2 = C4172q.INSTANCE;
            objA = C4172q.a(C4173r.a(th));
        }
        if (C4172q.c(objA)) {
            objA = null;
        }
        Class<B> cls3 = (Class) objA;
        return cls3 == null ? KotlinConstructorBuilder.class : cls3;
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Set<OneOf.Key<?>> getKeys(Field field) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Class<?> declaringClass = field.getDeclaringClass();
        String name = field.getName();
        C3862t.f(name, "getName(...)");
        Field declaredField = declaringClass.getDeclaredField(Internal.boxedOneOfKeysFieldName(name));
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.Set<com.squareup.wire.OneOf.Key<*>>");
        return (Set) obj;
    }

    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, boolean z10, ClassLoader classLoader, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            classLoader = cls.getClassLoader();
        }
        return createRuntimeMessageAdapter(cls, z10, classLoader);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(Class<M> messageType, boolean z10, ClassLoader classLoader) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        C3862t.g(messageType, "messageType");
        ProtoAdapter protoAdapter = ProtoAdapter.INSTANCE.get(messageType);
        return createRuntimeMessageAdapter(messageType, protoAdapter.getTypeUrl(), protoAdapter.getSyntax(), classLoader, z10);
    }
}
