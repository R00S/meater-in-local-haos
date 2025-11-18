package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class BaseJsonNode extends JsonNode implements JsonSerializable {
    protected BaseJsonNode() {
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public abstract void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException;
}
