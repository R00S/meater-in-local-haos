package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class MinimalPrettyPrinter implements PrettyPrinter, Serializable {
    protected String _rootValueSeparator;

    public MinimalPrettyPrinter() {
        this(" ");
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(',');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeEndArray(JsonGenerator jsonGenerator, int i2) throws IOException {
        jsonGenerator.writeRaw(']');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeEndObject(JsonGenerator jsonGenerator, int i2) throws IOException {
        jsonGenerator.writeRaw('}');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(',');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(':');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        String str = this._rootValueSeparator;
        if (str != null) {
            jsonGenerator.writeRaw(str);
        }
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw('[');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw('{');
    }

    public MinimalPrettyPrinter(String str) {
        this._rootValueSeparator = " ";
        this._rootValueSeparator = str;
    }
}
