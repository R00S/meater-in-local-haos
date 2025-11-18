package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

/* loaded from: classes2.dex */
public class FloatNode extends NumericNode {
    protected final float _value;

    public FloatNode(float f2) {
        this._value = f2;
    }

    public static FloatNode valueOf(float f2) {
        return new FloatNode(f2);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return Float.toString(this._value);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof FloatNode)) {
            return Float.compare(this._value, ((FloatNode) obj)._value) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(this._value);
    }
}
