package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.RequestPayload;

/* loaded from: classes2.dex */
public class JsonParseException extends JsonProcessingException {
    protected transient JsonParser _processor;
    protected RequestPayload _requestPayload;

    public JsonParseException(JsonParser jsonParser, String str) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation());
        this._processor = jsonParser;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this._requestPayload == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(message);
        sb.append("\nRequest payload : ");
        throw null;
    }

    public JsonParseException withRequestPayload(RequestPayload requestPayload) {
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    public JsonParser getProcessor() {
        return this._processor;
    }

    public JsonParseException(JsonParser jsonParser, String str, Throwable th) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation(), th);
        this._processor = jsonParser;
    }
}
