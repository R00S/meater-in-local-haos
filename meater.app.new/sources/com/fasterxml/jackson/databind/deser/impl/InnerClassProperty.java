package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class InnerClassProperty extends SettableBeanProperty {
    protected AnnotatedConstructor _annotated;
    protected final transient Constructor<?> _creator;
    protected final SettableBeanProperty _delegate;

    public InnerClassProperty(SettableBeanProperty settableBeanProperty, Constructor<?> constructor) {
        super(settableBeanProperty);
        this._delegate = settableBeanProperty;
        this._creator = constructor;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Object objDeserializeWithType;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            objDeserializeWithType = this._valueDeserializer.getNullValue(deserializationContext);
        } else {
            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
            if (typeDeserializer != null) {
                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            } else {
                try {
                    objNewInstance = this._creator.newInstance(obj);
                } catch (Exception e2) {
                    ClassUtil.unwrapAndThrowAsIAE(e2, "Failed to instantiate class " + this._creator.getDeclaringClass().getName() + ", problem: " + e2.getMessage());
                    objNewInstance = null;
                }
                this._valueDeserializer.deserialize(jsonParser, deserializationContext, objNewInstance);
                objDeserializeWithType = objNewInstance;
            }
        }
        set(obj, objDeserializeWithType);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        this._delegate.fixAccess(deserializationConfig);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._delegate.getMember();
    }

    Object readResolve() {
        return new InnerClassProperty(this, this._annotated);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void set(Object obj, Object obj2) throws IOException {
        this._delegate.set(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        return this._delegate.setAndReturn(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public /* bridge */ /* synthetic */ SettableBeanProperty withValueDeserializer(JsonDeserializer jsonDeserializer) {
        return withValueDeserializer((JsonDeserializer<?>) jsonDeserializer);
    }

    Object writeReplace() {
        return this._annotated != null ? this : new InnerClassProperty(this, new AnnotatedConstructor(null, this._creator, null, null));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public InnerClassProperty withName(PropertyName propertyName) {
        return new InnerClassProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public InnerClassProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        return new InnerClassProperty(this, jsonDeserializer);
    }

    protected InnerClassProperty(InnerClassProperty innerClassProperty, AnnotatedConstructor annotatedConstructor) {
        super(innerClassProperty);
        this._delegate = innerClassProperty._delegate;
        this._annotated = annotatedConstructor;
        Constructor<?> annotated = annotatedConstructor == null ? null : annotatedConstructor.getAnnotated();
        this._creator = annotated;
        if (annotated == null) {
            throw new IllegalArgumentException("Missing constructor (broken JDK (de)serialization?)");
        }
    }

    protected InnerClassProperty(InnerClassProperty innerClassProperty, JsonDeserializer<?> jsonDeserializer) {
        super(innerClassProperty, jsonDeserializer);
        this._delegate = innerClassProperty._delegate.withValueDeserializer(jsonDeserializer);
        this._creator = innerClassProperty._creator;
    }

    protected InnerClassProperty(InnerClassProperty innerClassProperty, PropertyName propertyName) {
        super(innerClassProperty, propertyName);
        this._delegate = innerClassProperty._delegate.withName(propertyName);
        this._creator = innerClassProperty._creator;
    }
}
