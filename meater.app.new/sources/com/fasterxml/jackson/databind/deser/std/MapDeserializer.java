package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements ContextualDeserializer, ResolvableDeserializer {
    protected JsonDeserializer<Object> _delegateDeserializer;
    protected final boolean _hasDefaultCreator;
    protected Set<String> _ignorableProperties;
    protected final KeyDeserializer _keyDeserializer;
    protected final JavaType _mapType;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected boolean _standardStringKey;
    protected final JsonDeserializer<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    static class MapReferring extends ReadableObjectId.Referring {
        private final MapReferringAccumulator _parent;
        public final Object key;
        public final Map<Object, Object> next;

        MapReferring(MapReferringAccumulator mapReferringAccumulator, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.next = new LinkedHashMap();
            this._parent = mapReferringAccumulator;
            this.key = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            this._parent.resolveForwardReference(obj, obj2);
        }
    }

    private static final class MapReferringAccumulator {
        private List<MapReferring> _accumulator = new ArrayList();
        private Map<Object, Object> _result;
        private final Class<?> _valueType;

        public MapReferringAccumulator(Class<?> cls, Map<Object, Object> map) {
            this._valueType = cls;
            this._result = map;
        }

        public ReadableObjectId.Referring handleUnresolvedReference(UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            MapReferring mapReferring = new MapReferring(this, unresolvedForwardReference, this._valueType, obj);
            this._accumulator.add(mapReferring);
            return mapReferring;
        }

        public void put(Object obj, Object obj2) {
            if (this._accumulator.isEmpty()) {
                this._result.put(obj, obj2);
            } else {
                this._accumulator.get(r0.size() - 1).next.put(obj, obj2);
            }
        }

        public void resolveForwardReference(Object obj, Object obj2) throws IOException {
            Iterator<MapReferring> it = this._accumulator.iterator();
            Map<Object, Object> map = this._result;
            while (it.hasNext()) {
                MapReferring next = it.next();
                if (next.hasId(obj)) {
                    it.remove();
                    map.put(next.key, obj2);
                    map.putAll(next.next);
                    return;
                }
                map = next.next;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public MapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType);
        this._mapType = javaType;
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = valueInstantiator;
        this._hasDefaultCreator = valueInstantiator.canCreateUsingDefault();
        this._delegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._standardStringKey = _isStdKeyDeser(javaType, keyDeserializer);
    }

    private void handleUnresolvedReference(JsonParser jsonParser, MapReferringAccumulator mapReferringAccumulator, Object obj, UnresolvedForwardReference unresolvedForwardReference) throws JsonMappingException {
        if (mapReferringAccumulator == null) {
            throw JsonMappingException.from(jsonParser, "Unresolved forward reference but no identity info.", unresolvedForwardReference);
        }
        unresolvedForwardReference.getRoid().appendReferring(mapReferringAccumulator.handleUnresolvedReference(unresolvedForwardReference, obj));
    }

    public Map<Object, Object> _deserializeUsingCreator(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer propertyValueBufferStartBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, null);
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        String strNextFieldName = jsonParser.isExpectedStartObjectToken() ? jsonParser.nextFieldName() : jsonParser.hasToken(JsonToken.FIELD_NAME) ? jsonParser.getCurrentName() : null;
        while (strNextFieldName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(strNextFieldName)) {
                SettableBeanProperty settableBeanPropertyFindCreatorProperty = propertyBasedCreator.findCreatorProperty(strNextFieldName);
                if (settableBeanPropertyFindCreatorProperty == null) {
                    try {
                        propertyValueBufferStartBuilding.bufferMapProperty(this._keyDeserializer.deserializeKey(strNextFieldName, deserializationContext), jsonTokenNextToken == JsonToken.VALUE_NULL ? jsonDeserializer.getNullValue(deserializationContext) : typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer));
                    } catch (Exception e2) {
                        wrapAndThrow(e2, this._mapType.getRawClass(), strNextFieldName);
                        return null;
                    }
                } else if (propertyValueBufferStartBuilding.assignParameter(settableBeanPropertyFindCreatorProperty, settableBeanPropertyFindCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.nextToken();
                    try {
                        Map<Object, Object> map = (Map) propertyBasedCreator.build(deserializationContext, propertyValueBufferStartBuilding);
                        _readAndBind(jsonParser, deserializationContext, map);
                        return map;
                    } catch (Exception e3) {
                        wrapAndThrow(e3, this._mapType.getRawClass(), strNextFieldName);
                        return null;
                    }
                }
            } else {
                jsonParser.skipChildren();
            }
            strNextFieldName = jsonParser.nextFieldName();
        }
        try {
            return (Map) propertyBasedCreator.build(deserializationContext, propertyValueBufferStartBuilding);
        } catch (Exception e4) {
            wrapAndThrow(e4, this._mapType.getRawClass(), strNextFieldName);
            return null;
        }
    }

    protected final boolean _isStdKeyDeser(JavaType javaType, KeyDeserializer keyDeserializer) {
        JavaType keyType;
        if (keyDeserializer == null || (keyType = javaType.getKeyType()) == null) {
            return true;
        }
        Class<?> rawClass = keyType.getRawClass();
        return (rawClass == String.class || rawClass == Object.class) && isDefaultKeyDeserializer(keyDeserializer);
    }

    protected final void _readAndBind(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String currentName;
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        boolean z = jsonDeserializer.getObjectIdReader() != null;
        MapReferringAccumulator mapReferringAccumulator = z ? new MapReferringAccumulator(this._mapType.getContentType().getRawClass(), map) : null;
        if (jsonParser.isExpectedStartObjectToken()) {
            currentName = jsonParser.nextFieldName();
        } else {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (currentToken != jsonToken) {
                deserializationContext.reportWrongTokenException(jsonParser, jsonToken, null, new Object[0]);
            }
            currentName = jsonParser.getCurrentName();
        }
        while (currentName != null) {
            Object objDeserializeKey = keyDeserializer.deserializeKey(currentName, deserializationContext);
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(currentName)) {
                try {
                    Object nullValue = jsonTokenNextToken == JsonToken.VALUE_NULL ? jsonDeserializer.getNullValue(deserializationContext) : typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    if (z) {
                        mapReferringAccumulator.put(objDeserializeKey, nullValue);
                    } else {
                        map.put(objDeserializeKey, nullValue);
                    }
                } catch (UnresolvedForwardReference e2) {
                    handleUnresolvedReference(jsonParser, mapReferringAccumulator, objDeserializeKey, e2);
                } catch (Exception e3) {
                    wrapAndThrow(e3, map, currentName);
                }
            } else {
                jsonParser.skipChildren();
            }
            currentName = jsonParser.nextFieldName();
        }
    }

    protected final void _readAndBindStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String currentName;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        boolean z = jsonDeserializer.getObjectIdReader() != null;
        MapReferringAccumulator mapReferringAccumulator = z ? new MapReferringAccumulator(this._mapType.getContentType().getRawClass(), map) : null;
        if (jsonParser.isExpectedStartObjectToken()) {
            currentName = jsonParser.nextFieldName();
        } else {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (currentToken != jsonToken) {
                deserializationContext.reportWrongTokenException(jsonParser, jsonToken, null, new Object[0]);
            }
            currentName = jsonParser.getCurrentName();
        }
        while (currentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(currentName)) {
                try {
                    Object nullValue = jsonTokenNextToken == JsonToken.VALUE_NULL ? jsonDeserializer.getNullValue(deserializationContext) : typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    if (z) {
                        mapReferringAccumulator.put(currentName, nullValue);
                    } else {
                        map.put(currentName, nullValue);
                    }
                } catch (UnresolvedForwardReference e2) {
                    handleUnresolvedReference(jsonParser, mapReferringAccumulator, currentName, e2);
                } catch (Exception e3) {
                    wrapAndThrow(e3, map, currentName);
                }
            } else {
                jsonParser.skipChildren();
            }
            currentName = jsonParser.nextFieldName();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        KeyDeserializer keyDeserializerCreateContextual;
        AnnotatedMember member;
        JsonIgnoreProperties.Value valueFindPropertyIgnorals;
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        if (keyDeserializer == 0) {
            keyDeserializerCreateContextual = deserializationContext.findKeyDeserializer(this._mapType.getKeyType(), beanProperty);
        } else {
            boolean z = keyDeserializer instanceof ContextualKeyDeserializer;
            keyDeserializerCreateContextual = keyDeserializer;
            if (z) {
                keyDeserializerCreateContextual = ((ContextualKeyDeserializer) keyDeserializer).createContextual(deserializationContext, beanProperty);
            }
        }
        JsonDeserializer<?> jsonDeserializerFindConvertingContentDeserializer = this._valueDeserializer;
        if (beanProperty != null) {
            jsonDeserializerFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializerFindConvertingContentDeserializer);
        }
        JavaType contentType = this._mapType.getContentType();
        JsonDeserializer<?> jsonDeserializerFindContextualValueDeserializer = jsonDeserializerFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(jsonDeserializerFindConvertingContentDeserializer, beanProperty, contentType);
        TypeDeserializer typeDeserializerForProperty = this._valueTypeDeserializer;
        if (typeDeserializerForProperty != null) {
            typeDeserializerForProperty = typeDeserializerForProperty.forProperty(beanProperty);
        }
        Set<String> hashSet = this._ignorableProperties;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null && beanProperty != null && (member = beanProperty.getMember()) != null && (valueFindPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member)) != null) {
            Set<String> setFindIgnoredForDeserialization = valueFindPropertyIgnorals.findIgnoredForDeserialization();
            if (!setFindIgnoredForDeserialization.isEmpty()) {
                hashSet = hashSet == null ? new HashSet() : new HashSet(hashSet);
                Iterator<String> it = setFindIgnoredForDeserialization.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
        }
        return withResolved(keyDeserializerCreateContextual, typeDeserializerForProperty, jsonDeserializerFindContextualValueDeserializer, hashSet);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public final Class<?> getMapClass() {
        return this._mapType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null && this._ignorableProperties == null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator != null) {
            if (valueInstantiator.canCreateUsingDelegate()) {
                JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
                if (delegateType == null) {
                    throw new IllegalArgumentException("Invalid delegate-creator definition for " + this._mapType + ": value instantiator (" + this._valueInstantiator.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
                }
                this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, null);
            } else if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
                JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
                if (arrayDelegateType == null) {
                    throw new IllegalArgumentException("Invalid delegate-creator definition for " + this._mapType + ": value instantiator (" + this._valueInstantiator.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getArrayDelegateType()'");
                }
                this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
            }
        }
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            this._propertyBasedCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()));
        }
        this._standardStringKey = _isStdKeyDeser(this._mapType, this._keyDeserializer);
    }

    public void setIgnorableProperties(Set<String> set) {
        if (set == null || set.size() == 0) {
            set = null;
        }
        this._ignorableProperties = set;
    }

    protected MapDeserializer withResolved(KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, Set<String> set) {
        return (this._keyDeserializer == keyDeserializer && this._valueDeserializer == jsonDeserializer && this._valueTypeDeserializer == typeDeserializer && this._ignorableProperties == set) ? this : new MapDeserializer(this, keyDeserializer, jsonDeserializer, typeDeserializer, set);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingCreator(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (Map) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (!this._hasDefaultCreator) {
            return (Map) deserializationContext.handleMissingInstantiator(getMapClass(), jsonParser, "no default constructor found", new Object[0]);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != JsonToken.START_OBJECT && currentToken != JsonToken.FIELD_NAME && currentToken != JsonToken.END_OBJECT) {
            if (currentToken == JsonToken.VALUE_STRING) {
                return (Map) this._valueInstantiator.createFromString(deserializationContext, jsonParser.getText());
            }
            return _deserializeFromEmpty(jsonParser, deserializationContext);
        }
        Map<Object, Object> map = (Map) this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._standardStringKey) {
            _readAndBindStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndBind(jsonParser, deserializationContext, map);
        return map;
    }

    protected MapDeserializer(MapDeserializer mapDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, Set<String> set) {
        super(mapDeserializer._mapType);
        JavaType javaType = mapDeserializer._mapType;
        this._mapType = javaType;
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = set;
        this._standardStringKey = _isStdKeyDeser(javaType, keyDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        jsonParser.setCurrentValue(map);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != JsonToken.START_OBJECT && currentToken != JsonToken.FIELD_NAME) {
            return (Map) deserializationContext.handleUnexpectedToken(getMapClass(), jsonParser);
        }
        if (this._standardStringKey) {
            _readAndBindStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndBind(jsonParser, deserializationContext, map);
        return map;
    }
}
