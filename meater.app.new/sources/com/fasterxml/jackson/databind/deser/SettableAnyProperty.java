package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public class SettableAnyProperty implements Serializable {
    protected final BeanProperty _property;
    protected final AnnotatedMember _setter;
    final boolean _setterIsField;
    protected final JavaType _type;
    protected JsonDeserializer<Object> _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;

    private static class AnySetterReferring extends ReadableObjectId.Referring {
        private final SettableAnyProperty _parent;
        private final Object _pojo;
        private final String _propName;

        public AnySetterReferring(SettableAnyProperty settableAnyProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj, String str) {
            super(unresolvedForwardReference, cls);
            this._parent = settableAnyProperty;
            this._pojo = obj;
            this._propName = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            if (hasId(obj)) {
                this._parent.set(this._pojo, this._propName, obj2);
                return;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj.toString() + "] that wasn't previously registered.");
        }
    }

    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        this._property = beanProperty;
        this._setter = annotatedMember;
        this._type = javaType;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._setterIsField = annotatedMember instanceof AnnotatedField;
    }

    private String getClassName() {
        return this._setter.getDeclaringClass().getName();
    }

    protected void _throwAsIOE(Exception exc, String str, Object obj) throws IOException {
        if (!(exc instanceof IllegalArgumentException)) {
            if (exc instanceof IOException) {
                throw ((IOException) exc);
            }
            boolean z = exc instanceof RuntimeException;
            Exception cause = exc;
            if (z) {
                throw ((RuntimeException) exc);
            }
            while (cause.getCause() != null) {
                cause = cause.getCause();
            }
            throw new JsonMappingException((Closeable) null, cause.getMessage(), cause);
        }
        String name = obj == null ? "[NULL]" : obj.getClass().getName();
        StringBuilder sb = new StringBuilder("Problem deserializing \"any\" property '");
        sb.append(str);
        sb.append("' of class " + getClassName() + " (expected type: ");
        sb.append(this._type);
        sb.append("; actual type: ");
        sb.append(name);
        sb.append(")");
        String message = exc.getMessage();
        if (message != null) {
            sb.append(", problem: ");
            sb.append(message);
        } else {
            sb.append(" (no error message provided)");
        }
        throw new JsonMappingException((Closeable) null, sb.toString(), exc);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return this._valueDeserializer.getNullValue(deserializationContext);
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        return typeDeserializer != null ? this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer) : this._valueDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        try {
            set(obj, str, deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e2) {
            if (this._valueDeserializer.getObjectIdReader() == null) {
                throw JsonMappingException.from(jsonParser, "Unresolved forward reference but no identity info.", e2);
            }
            e2.getRoid().appendReferring(new AnySetterReferring(this, e2, this._type.getRawClass(), obj, str));
        }
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        this._setter.fixAccess(deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public BeanProperty getProperty() {
        return this._property;
    }

    public JavaType getType() {
        return this._type;
    }

    public boolean hasValueDeserializer() {
        return this._valueDeserializer != null;
    }

    Object readResolve() {
        AnnotatedMember annotatedMember = this._setter;
        if (annotatedMember == null || annotatedMember.getAnnotated() == null) {
            throw new IllegalArgumentException("Missing method (broken JDK (de)serialization?)");
        }
        return this;
    }

    public void set(Object obj, String str, Object obj2) throws IOException {
        try {
            if (this._setterIsField) {
                Map map = (Map) ((AnnotatedField) this._setter).getValue(obj);
                if (map != null) {
                    map.put(str, obj2);
                }
            } else {
                ((AnnotatedMethod) this._setter).callOnWith(obj, str, obj2);
            }
        } catch (Exception e2) {
            _throwAsIOE(e2, str, obj2);
        }
    }

    public String toString() {
        return "[any property on class " + getClassName() + "]";
    }

    public SettableAnyProperty withValueDeserializer(JsonDeserializer<Object> jsonDeserializer) {
        return new SettableAnyProperty(this._property, this._setter, this._type, jsonDeserializer, this._valueTypeDeserializer);
    }
}
