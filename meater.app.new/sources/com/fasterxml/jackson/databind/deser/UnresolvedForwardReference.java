package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class UnresolvedForwardReference extends JsonMappingException {
    private ReadableObjectId _roid;
    private List<UnresolvedId> _unresolvedIds;

    public UnresolvedForwardReference(JsonParser jsonParser, String str, JsonLocation jsonLocation, ReadableObjectId readableObjectId) {
        super(jsonParser, str, jsonLocation);
        this._roid = readableObjectId;
    }

    public void addUnresolvedId(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this._unresolvedIds.add(new UnresolvedId(obj, cls, jsonLocation));
    }

    @Override // com.fasterxml.jackson.databind.JsonMappingException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this._unresolvedIds == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(message);
        Iterator<UnresolvedId> it = this._unresolvedIds.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('.');
        return sb.toString();
    }

    public ReadableObjectId getRoid() {
        return this._roid;
    }

    public Object getUnresolvedId() {
        return this._roid.getKey().key;
    }

    public UnresolvedForwardReference(JsonParser jsonParser, String str) {
        super(jsonParser, str);
        this._unresolvedIds = new ArrayList();
    }
}
