package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;

/* loaded from: classes2.dex */
public class StdDelegatingDeserializer<T> extends StdDeserializer<T> implements ContextualDeserializer, ResolvableDeserializer {
    protected final Converter<Object, T> _converter;
    protected final JsonDeserializer<Object> _delegateDeserializer;
    protected final JavaType _delegateType;

    public StdDelegatingDeserializer(Converter<Object, T> converter, JavaType javaType, JsonDeserializer<?> jsonDeserializer) {
        super(javaType);
        this._converter = converter;
        this._delegateType = javaType;
        this._delegateDeserializer = jsonDeserializer;
    }

    protected Object _handleIncompatibleUpdateValue(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        throw new UnsupportedOperationException(String.format("Can not update object of type %s (using deserializer for type %s)" + obj.getClass().getName(), this._delegateType));
    }

    protected T convertValue(Object obj) {
        return this._converter.convert(obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer<?> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            JsonDeserializer<?> jsonDeserializerHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(jsonDeserializer, beanProperty, this._delegateType);
            return jsonDeserializerHandleSecondaryContextualization != this._delegateDeserializer ? withDelegate(this._converter, this._delegateType, jsonDeserializerHandleSecondaryContextualization) : this;
        }
        JavaType inputType = this._converter.getInputType(deserializationContext.getTypeFactory());
        return withDelegate(this._converter, inputType, deserializationContext.findContextualValueDeserializer(inputType, beanProperty));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserialize = this._delegateDeserializer.deserialize(jsonParser, deserializationContext);
        if (objDeserialize == null) {
            return null;
        }
        return convertValue(objDeserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        Object objDeserialize = this._delegateDeserializer.deserialize(jsonParser, deserializationContext);
        if (objDeserialize == null) {
            return null;
        }
        return convertValue(objDeserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Class<?> handledType() {
        return this._delegateDeserializer.handledType();
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        Object obj = this._delegateDeserializer;
        if (obj == null || !(obj instanceof ResolvableDeserializer)) {
            return;
        }
        ((ResolvableDeserializer) obj).resolve(deserializationContext);
    }

    protected StdDelegatingDeserializer<T> withDelegate(Converter<Object, T> converter, JavaType javaType, JsonDeserializer<?> jsonDeserializer) {
        if (StdDelegatingDeserializer.class == StdDelegatingDeserializer.class) {
            return new StdDelegatingDeserializer<>(converter, javaType, jsonDeserializer);
        }
        throw new IllegalStateException("Sub-class " + StdDelegatingDeserializer.class.getName() + " must override 'withDelegate'");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this._delegateType.getRawClass().isAssignableFrom(obj.getClass())) {
            return (T) this._delegateDeserializer.deserialize(jsonParser, deserializationContext, obj);
        }
        return (T) _handleIncompatibleUpdateValue(jsonParser, deserializationContext, obj);
    }
}
