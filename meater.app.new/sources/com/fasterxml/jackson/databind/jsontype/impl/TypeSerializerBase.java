package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/* loaded from: classes2.dex */
public abstract class TypeSerializerBase extends TypeSerializer {
    protected final TypeIdResolver _idResolver;
    protected final BeanProperty _property;

    protected TypeSerializerBase(TypeIdResolver typeIdResolver, BeanProperty beanProperty) {
        this._idResolver = typeIdResolver;
        this._property = beanProperty;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public String getPropertyName() {
        return null;
    }

    protected void handleMissingId(Object obj) {
    }

    protected String idFromValue(Object obj) {
        String strIdFromValue = this._idResolver.idFromValue(obj);
        if (strIdFromValue == null) {
            handleMissingId(obj);
        }
        return strIdFromValue;
    }

    protected String idFromValueAndType(Object obj, Class<?> cls) {
        String strIdFromValueAndType = this._idResolver.idFromValueAndType(obj, cls);
        if (strIdFromValueAndType == null) {
            handleMissingId(obj);
        }
        return strIdFromValueAndType;
    }
}
