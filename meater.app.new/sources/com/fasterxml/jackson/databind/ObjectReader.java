package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class ObjectReader extends ObjectCodec implements Serializable {
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(JsonNode.class);
    protected final DeserializationConfig _config;
    protected final DefaultDeserializationContext _context;
    protected final DataFormatReaders _dataFormatReaders;
    private final TokenFilter _filter;
    protected final InjectableValues _injectableValues;
    protected final JsonFactory _parserFactory;
    protected final JsonDeserializer<Object> _rootDeserializer;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    protected final FormatSchema _schema;
    protected final boolean _unwrapRoot;
    protected final Object _valueToUpdate;
    protected final JavaType _valueType;

    protected ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._parserFactory = objectMapper._jsonFactory;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        if (obj != null && javaType.isArrayType()) {
            throw new IllegalArgumentException("Can not update an array value");
        }
        this._schema = formatSchema;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(javaType);
        this._filter = null;
    }

    protected Object _bindAndClose(JsonParser jsonParser) throws IOException {
        Object objDeserialize;
        try {
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
            JsonToken jsonToken_initForReading = _initForReading(defaultDeserializationContextCreateDeserializationContext, jsonParser);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                objDeserialize = this._valueToUpdate;
                if (objDeserialize == null) {
                    objDeserialize = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext).getNullValue(defaultDeserializationContextCreateDeserializationContext);
                }
            } else if (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) {
                objDeserialize = this._valueToUpdate;
            } else {
                JsonDeserializer<Object> jsonDeserializer_findRootDeserializer = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext);
                if (this._unwrapRoot) {
                    objDeserialize = _unwrapAndDeserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType, jsonDeserializer_findRootDeserializer);
                } else {
                    Object obj = this._valueToUpdate;
                    if (obj == null) {
                        objDeserialize = jsonDeserializer_findRootDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext);
                    } else {
                        jsonDeserializer_findRootDeserializer.deserialize(jsonParser, defaultDeserializationContextCreateDeserializationContext, obj);
                        objDeserialize = this._valueToUpdate;
                    }
                }
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return objDeserialize;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    protected JsonParser _considerFilter(JsonParser jsonParser, boolean z) {
        return (this._filter == null || FilteringParserDelegate.class.isInstance(jsonParser)) ? jsonParser : new FilteringParserDelegate(jsonParser, this._filter, false, z);
    }

    protected JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext) throws JsonMappingException {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializer;
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            deserializationContext.reportMappingException("No value type configured for ObjectReader", new Object[0]);
        }
        JsonDeserializer<Object> jsonDeserializer2 = this._rootDeserializers.get(javaType);
        if (jsonDeserializer2 != null) {
            return jsonDeserializer2;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            deserializationContext.reportMappingException("Can not find a deserializer for type %s", javaType);
        }
        this._rootDeserializers.put(javaType, jsonDeserializerFindRootValueDeserializer);
        return jsonDeserializerFindRootValueDeserializer;
    }

    protected JsonToken _initForReading(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        this._config.initialize(jsonParser);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null && (currentToken = jsonParser.nextToken()) == null) {
            deserializationContext.reportMissingContent(null, new Object[0]);
        }
        return currentToken;
    }

    protected JsonDeserializer<Object> _prefetchRootDeserializer(JavaType javaType) {
        if (javaType == null || !this._config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = this._rootDeserializers.get(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            try {
                jsonDeserializerFindRootValueDeserializer = createDeserializationContext(null).findRootValueDeserializer(javaType);
                if (jsonDeserializerFindRootValueDeserializer != null) {
                    this._rootDeserializers.put(javaType, jsonDeserializerFindRootValueDeserializer);
                }
            } catch (JsonProcessingException unused) {
            }
        }
        return jsonDeserializerFindRootValueDeserializer;
    }

    protected void _reportUndetectableSource(Object obj) throws JsonProcessingException {
        throw new JsonParseException(null, "Can not use source of type " + obj.getClass().getName() + " with format auto-detection: must be byte- not char-based");
    }

    protected Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType, JsonDeserializer<Object> jsonDeserializer) throws IOException {
        Object objDeserialize;
        String simpleName = this._config.findRootName(javaType).getSimpleName();
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (currentToken != jsonToken) {
            deserializationContext.reportWrongTokenException(jsonParser, jsonToken, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonTokenNextToken != jsonToken2) {
            deserializationContext.reportWrongTokenException(jsonParser, jsonToken2, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        Object currentName = jsonParser.getCurrentName();
        if (!simpleName.equals(currentName)) {
            deserializationContext.reportMappingException("Root name '%s' does not match expected ('%s') for type %s", currentName, simpleName, javaType);
        }
        jsonParser.nextToken();
        Object obj = this._valueToUpdate;
        if (obj == null) {
            objDeserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        } else {
            jsonDeserializer.deserialize(jsonParser, deserializationContext, obj);
            objDeserialize = this._valueToUpdate;
        }
        JsonToken jsonTokenNextToken2 = jsonParser.nextToken();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (jsonTokenNextToken2 != jsonToken3) {
            deserializationContext.reportWrongTokenException(jsonParser, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        return objDeserialize;
    }

    protected DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser) {
        return this._context.createInstance(this._config, jsonParser, this._injectableValues);
    }

    public <T> T readValue(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return (T) _bindAndClose(_considerFilter(this._parserFactory.createParser(reader), false));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }
}
