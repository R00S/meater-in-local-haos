package com.squareup.wire;

import Cc.h;
import Ha.f;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C3830k;
import kotlin.collections.J;
import kotlin.collections.M;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.W;
import oa.C4170o;
import oa.v;
import ra.C4370a;

/* compiled from: KotlinConstructorBuilder.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001#B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR.\u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR0\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030 0\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR4\u0010\"\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b0\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001f¨\u0006$"}, d2 = {"Lcom/squareup/wire/KotlinConstructorBuilder;", "Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "Ljava/lang/Class;", "messageType", "<init>", "(Ljava/lang/Class;)V", "Lcom/squareup/wire/WireField;", "field", "Loa/F;", "clobberOtherIsOneOfs", "(Lcom/squareup/wire/WireField;)V", "", "Lcom/squareup/wire/KotlinConstructorBuilder$ProtoField;", "declaredProtoFields", "(Ljava/lang/Class;)Ljava/util/List;", "", "value", "set", "(Lcom/squareup/wire/WireField;Ljava/lang/Object;)V", "get", "(Lcom/squareup/wire/WireField;)Ljava/lang/Object;", "build", "()Lcom/squareup/wire/Message;", "Ljava/lang/Class;", "", "", "Loa/o;", "fieldValueMap", "Ljava/util/Map;", "", "repeatedFieldValueMap", "mapFieldKeyValueMap", "ProtoField", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KotlinConstructorBuilder<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message.Builder<M, B> {
    private final Map<Integer, C4170o<WireField, Object>> fieldValueMap;
    private final Map<Integer, C4170o<WireField, Map<?, ?>>> mapFieldKeyValueMap;
    private final Class<M> messageType;
    private final Map<Integer, C4170o<WireField, List<?>>> repeatedFieldValueMap;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KotlinConstructorBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/squareup/wire/KotlinConstructorBuilder$ProtoField;", "", "type", "Ljava/lang/Class;", "wireField", "Lcom/squareup/wire/WireField;", "(Ljava/lang/Class;Lcom/squareup/wire/WireField;)V", "getType", "()Ljava/lang/Class;", "getWireField", "()Lcom/squareup/wire/WireField;", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class ProtoField {
        private final Class<?> type;
        private final WireField wireField;

        public ProtoField(Class<?> type, WireField wireField) {
            C3862t.g(type, "type");
            C3862t.g(wireField, "wireField");
            this.type = type;
            this.wireField = wireField;
        }

        public final Class<?> getType() {
            return this.type;
        }

        public final WireField getWireField() {
            return this.wireField;
        }
    }

    public KotlinConstructorBuilder(Class<M> messageType) {
        C3862t.g(messageType, "messageType");
        this.messageType = messageType;
        int length = messageType.getDeclaredFields().length;
        this.fieldValueMap = new LinkedHashMap(length);
        this.repeatedFieldValueMap = new LinkedHashMap(length);
        this.mapFieldKeyValueMap = new LinkedHashMap(length);
    }

    private final void clobberOtherIsOneOfs(WireField field) {
        Collection<C4170o<WireField, Object>> collectionValues = this.fieldValueMap.values();
        ArrayList arrayList = new ArrayList(r.x(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add((WireField) ((C4170o) it.next()).c());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            WireField wireField = (WireField) obj;
            if (C3862t.b(wireField.oneofName(), field.oneofName()) && wireField.tag() != field.tag()) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.fieldValueMap.remove(Integer.valueOf(((WireField) it2.next()).tag()));
        }
    }

    private final List<ProtoField> declaredProtoFields(Class<M> cls) {
        ProtoField protoField;
        Field[] declaredFields = cls.getDeclaredFields();
        C3862t.f(declaredFields, "getDeclaredFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            C3862t.f(declaredAnnotations, "getDeclaredAnnotations(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation : declaredAnnotations) {
                if (annotation instanceof WireField) {
                    arrayList2.add(annotation);
                }
            }
            WireField wireField = (WireField) r.l0(arrayList2);
            if (wireField != null) {
                Class<?> type = field.getType();
                C3862t.f(type, "getType(...)");
                protoField = new ProtoField(type, wireField);
            } else {
                protoField = null;
            }
            if (protoField != null) {
                arrayList.add(protoField);
            }
        }
        return r.O0(arrayList, new Comparator() { // from class: com.squareup.wire.KotlinConstructorBuilder$declaredProtoFields$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return C4370a.d(Integer.valueOf(((KotlinConstructorBuilder.ProtoField) t10).getWireField().schemaIndex()), Integer.valueOf(((KotlinConstructorBuilder.ProtoField) t11).getWireField().schemaIndex()));
            }
        });
    }

    @Override // com.squareup.wire.Message.Builder
    public M build() throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        List<ProtoField> listDeclaredProtoFields = declaredProtoFields(this.messageType);
        C3830k c3830k = new C3830k();
        Iterator<ProtoField> it = listDeclaredProtoFields.iterator();
        while (it.hasNext()) {
            c3830k.add(it.next());
        }
        List<ProtoField> list = listDeclaredProtoFields;
        ArrayList arrayList = new ArrayList(r.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ProtoField) it2.next()).getType());
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<M> cls = this.messageType;
        U u10 = new U(2);
        u10.b(clsArr);
        u10.a(h.class);
        Constructor<M> declaredConstructor = cls.getDeclaredConstructor((Class[]) u10.d(new Class[u10.c()]));
        f fVar = new f(0, clsArr.length);
        ArrayList arrayList2 = new ArrayList(r.x(fVar, 10));
        Iterator<Integer> it3 = fVar.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((J) it3).b() == listDeclaredProtoFields.size() ? buildUnknownFields() : get(((ProtoField) c3830k.removeFirst()).getWireField()));
        }
        Object[] array = arrayList2.toArray(new Object[0]);
        M mNewInstance = declaredConstructor.newInstance(Arrays.copyOf(array, array.length));
        C3862t.e(mNewInstance, "null cannot be cast to non-null type M of com.squareup.wire.KotlinConstructorBuilder");
        return mNewInstance;
    }

    public final Object get(WireField field) {
        List<?> listD;
        Map<?, ?> mapD;
        C3862t.g(field, "field");
        if (KotlinConstructorBuilderKt.isMap(field)) {
            C4170o<WireField, Map<?, ?>> c4170o = this.mapFieldKeyValueMap.get(Integer.valueOf(field.tag()));
            return (c4170o == null || (mapD = c4170o.d()) == null) ? M.h() : mapD;
        }
        if (field.label().isRepeated()) {
            C4170o<WireField, List<?>> c4170o2 = this.repeatedFieldValueMap.get(Integer.valueOf(field.tag()));
            return (c4170o2 == null || (listD = c4170o2.d()) == null) ? r.m() : listD;
        }
        C4170o<WireField, Object> c4170o3 = this.fieldValueMap.get(Integer.valueOf(field.tag()));
        Object objD = c4170o3 != null ? c4170o3.d() : null;
        return (objD == null && field.label() == WireField.Label.OMIT_IDENTITY) ? ProtoAdapter.INSTANCE.get(field.adapter()).getIdentity() : objD;
    }

    public final void set(WireField field, Object value) {
        C3862t.g(field, "field");
        if (KotlinConstructorBuilderKt.isMap(field)) {
            Map<Integer, C4170o<WireField, Map<?, ?>>> map = this.mapFieldKeyValueMap;
            Integer numValueOf = Integer.valueOf(field.tag());
            C3862t.e(value, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            map.put(numValueOf, v.a(field, W.d(value)));
            return;
        }
        if (field.label().isRepeated()) {
            Map<Integer, C4170o<WireField, List<?>>> map2 = this.repeatedFieldValueMap;
            Integer numValueOf2 = Integer.valueOf(field.tag());
            C3862t.e(value, "null cannot be cast to non-null type kotlin.collections.MutableList<*>");
            map2.put(numValueOf2, v.a(field, W.c(value)));
            return;
        }
        this.fieldValueMap.put(Integer.valueOf(field.tag()), v.a(field, value));
        if (value == null || !field.label().isOneOf()) {
            return;
        }
        clobberOtherIsOneOfs(field);
    }
}
