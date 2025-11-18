package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;

/* loaded from: classes2.dex */
public class UnresolvedId {
    private final Object _id;
    private final JsonLocation _location;
    private final Class<?> _type;

    public UnresolvedId(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this._id = obj;
        this._type = cls;
        this._location = jsonLocation;
    }

    public String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = this._id;
        Class<?> cls = this._type;
        objArr[1] = cls == null ? "NULL" : cls.getName();
        objArr[2] = this._location;
        return String.format("Object id [%s] (for %s) at %s", objArr);
    }
}
