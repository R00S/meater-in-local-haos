package com.fasterxml.jackson.core;

/* loaded from: classes2.dex */
public class JsonGenerationException extends JsonProcessingException {
    protected transient JsonGenerator _processor;

    public JsonGenerationException(String str, JsonGenerator jsonGenerator) {
        super(str, (JsonLocation) null);
        this._processor = jsonGenerator;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    public JsonGenerator getProcessor() {
        return this._processor;
    }
}
