package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class ObjectArraySerializer extends ArraySerializerBase<Object[]> implements ContextualSerializer {
    protected PropertySerializerMap _dynamicSerializers;
    protected JsonSerializer<Object> _elementSerializer;
    protected final JavaType _elementType;
    protected final boolean _staticTyping;
    protected final TypeSerializer _valueTypeSerializer;

    public ObjectArraySerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super(Object[].class);
        this._elementType = javaType;
        this._staticTyping = z;
        this._valueTypeSerializer = typeSerializer;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
        this._elementSerializer = jsonSerializer;
    }

    protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult serializerAndMapResultFindAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = serializerAndMapResultFindAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicSerializers = propertySerializerMap2;
        }
        return serializerAndMapResultFindAndAddSecondarySerializer.serializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new ObjectArraySerializer(this, beanProperty, this._valueTypeSerializer, this._elementSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new ObjectArraySerializer(this._elementType, this._staticTyping, typeSerializer, this._elementSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer<?> createContextual(com.fasterxml.jackson.databind.SerializerProvider r6, com.fasterxml.jackson.databind.BeanProperty r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r0 = r5._valueTypeSerializer
            if (r0 == 0) goto L8
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r0 = r0.forProperty(r7)
        L8:
            r1 = 0
            if (r7 == 0) goto L20
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r7.getMember()
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r6.getAnnotationIntrospector()
            if (r2 == 0) goto L20
            java.lang.Object r3 = r3.findContentSerializer(r2)
            if (r3 == 0) goto L20
            com.fasterxml.jackson.databind.JsonSerializer r2 = r6.serializerInstance(r2, r3)
            goto L21
        L20:
            r2 = r1
        L21:
            java.lang.Class r3 = r5.handledType()
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r5.findFormatOverrides(r6, r7, r3)
            if (r3 == 0) goto L31
            com.fasterxml.jackson.annotation.JsonFormat$Feature r1 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r1 = r3.getFeature(r1)
        L31:
            if (r2 != 0) goto L35
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r2 = r5._elementSerializer
        L35:
            com.fasterxml.jackson.databind.JsonSerializer r2 = r5.findConvertingContentSerializer(r6, r7, r2)
            if (r2 != 0) goto L50
            com.fasterxml.jackson.databind.JavaType r3 = r5._elementType
            if (r3 == 0) goto L54
            boolean r4 = r5._staticTyping
            if (r4 == 0) goto L54
            boolean r3 = r3.isJavaLangObject()
            if (r3 != 0) goto L54
            com.fasterxml.jackson.databind.JavaType r2 = r5._elementType
            com.fasterxml.jackson.databind.JsonSerializer r2 = r6.findValueSerializer(r2, r7)
            goto L54
        L50:
            com.fasterxml.jackson.databind.JsonSerializer r2 = r6.handleSecondaryContextualization(r2, r7)
        L54:
            com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer r6 = r5.withResolved(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer.createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public void serializeContentsUsing(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) throws IOException {
        int length = objArr.length;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        Object obj = null;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                obj = objArr[i2];
                if (obj == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else if (typeSerializer == null) {
                    jsonSerializer.serialize(obj, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
                }
            } catch (IOException e2) {
                throw e2;
            } catch (Exception e3) {
                e = e3;
                while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                    e = e.getCause();
                }
                if (!(e instanceof Error)) {
                    throw JsonMappingException.wrapWithPath(e, obj, i2);
                }
                throw ((Error) e);
            }
        }
    }

    public void serializeTypedContents(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int length = objArr.length;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        int i2 = 0;
        Object obj = null;
        try {
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            while (i2 < length) {
                obj = objArr[i2];
                if (obj == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    JsonSerializer<Object> jsonSerializerSerializerFor = propertySerializerMap.serializerFor(cls);
                    if (jsonSerializerSerializerFor == null) {
                        jsonSerializerSerializerFor = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                    }
                    jsonSerializerSerializerFor.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
                }
                i2++;
            }
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            e = e3;
            while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                e = e.getCause();
            }
            if (!(e instanceof Error)) {
                throw JsonMappingException.wrapWithPath(e, obj, i2);
            }
            throw ((Error) e);
        }
    }

    public ObjectArraySerializer withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        return (this._property == beanProperty && jsonSerializer == this._elementSerializer && this._valueTypeSerializer == typeSerializer && this._unwrapSingle == bool) ? this : new ObjectArraySerializer(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void serialize(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int length = objArr.length;
        if (length == 1 && ((this._unwrapSingle == null && serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(objArr, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.writeStartArray(length);
        serializeContents(objArr, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public void serializeContents(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        JsonSerializer<Object> jsonSerializer = this._elementSerializer;
        if (jsonSerializer != null) {
            serializeContentsUsing(objArr, jsonGenerator, serializerProvider, jsonSerializer);
            return;
        }
        if (this._valueTypeSerializer != null) {
            serializeTypedContents(objArr, jsonGenerator, serializerProvider);
            return;
        }
        int i2 = 0;
        Object obj = null;
        try {
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            while (i2 < length) {
                obj = objArr[i2];
                if (obj == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    JsonSerializer<Object> jsonSerializerSerializerFor = propertySerializerMap.serializerFor(cls);
                    if (jsonSerializerSerializerFor == null) {
                        jsonSerializerSerializerFor = this._elementType.hasGenericTypes() ? _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._elementType, cls), serializerProvider) : _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                    }
                    jsonSerializerSerializerFor.serialize(obj, jsonGenerator, serializerProvider);
                }
                i2++;
            }
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            e = e3;
            while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                e = e.getCause();
            }
            if (!(e instanceof Error)) {
                throw JsonMappingException.wrapWithPath(e, obj, i2);
            }
            throw ((Error) e);
        }
    }

    protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult serializerAndMapResultFindAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = serializerAndMapResultFindAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicSerializers = propertySerializerMap2;
        }
        return serializerAndMapResultFindAndAddSecondarySerializer.serializer;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(objectArraySerializer, beanProperty, bool);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = typeSerializer;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._dynamicSerializers = objectArraySerializer._dynamicSerializers;
        this._elementSerializer = jsonSerializer;
    }
}
