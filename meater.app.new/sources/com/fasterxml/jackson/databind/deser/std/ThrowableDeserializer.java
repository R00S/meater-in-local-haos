package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

/* loaded from: classes2.dex */
public class ThrowableDeserializer extends BeanDeserializer {
    public ThrowableDeserializer(BeanDeserializer beanDeserializer) {
        super(beanDeserializer);
        this._vanillaProcessing = false;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._beanType.isAbstract()) {
            return deserializationContext.handleMissingInstantiator(handledType(), jsonParser, "abstract type (need to add/enable type information?)", new Object[0]);
        }
        boolean zCanCreateFromString = this._valueInstantiator.canCreateFromString();
        boolean zCanCreateUsingDefault = this._valueInstantiator.canCreateUsingDefault();
        if (!zCanCreateFromString && !zCanCreateUsingDefault) {
            return deserializationContext.handleMissingInstantiator(handledType(), jsonParser, "Throwable needs a default contructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
        }
        Object objCreateFromString = null;
        Object[] objArr = null;
        int i2 = 0;
        while (jsonParser.getCurrentToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(currentName);
            jsonParser.nextToken();
            if (settableBeanPropertyFind != null) {
                if (objCreateFromString != null) {
                    settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateFromString);
                } else {
                    if (objArr == null) {
                        int size = this._beanProperties.size();
                        objArr = new Object[size + size];
                    }
                    int i3 = i2 + 1;
                    objArr[i2] = settableBeanPropertyFind;
                    i2 = i3 + 1;
                    objArr[i3] = settableBeanPropertyFind.deserialize(jsonParser, deserializationContext);
                }
            } else if ("message".equals(currentName) && zCanCreateFromString) {
                objCreateFromString = this._valueInstantiator.createFromString(deserializationContext, jsonParser.getText());
                if (objArr != null) {
                    for (int i4 = 0; i4 < i2; i4 += 2) {
                        ((SettableBeanProperty) objArr[i4]).set(objCreateFromString, objArr[i4 + 1]);
                    }
                    objArr = null;
                }
            } else {
                Set<String> set = this._ignorableProps;
                if (set == null || !set.contains(currentName)) {
                    SettableAnyProperty settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, objCreateFromString, currentName);
                    } else {
                        handleUnknownProperty(jsonParser, deserializationContext, objCreateFromString, currentName);
                    }
                } else {
                    jsonParser.skipChildren();
                }
            }
            jsonParser.nextToken();
        }
        if (objCreateFromString == null) {
            objCreateFromString = zCanCreateFromString ? this._valueInstantiator.createFromString(deserializationContext, null) : this._valueInstantiator.createUsingDefault(deserializationContext);
            if (objArr != null) {
                for (int i5 = 0; i5 < i2; i5 += 2) {
                    ((SettableBeanProperty) objArr[i5]).set(objCreateFromString, objArr[i5 + 1]);
                }
            }
        }
        return objCreateFromString;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return ThrowableDeserializer.class != ThrowableDeserializer.class ? this : new ThrowableDeserializer(this, nameTransformer);
    }

    protected ThrowableDeserializer(BeanDeserializer beanDeserializer, NameTransformer nameTransformer) {
        super(beanDeserializer, nameTransformer);
    }
}
