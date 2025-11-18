package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p176io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

/* loaded from: classes2.dex */
public class DoubleNode extends NumericNode {
    protected final double _value;

    public DoubleNode(double d2) {
        this._value = d2;
    }

    public static DoubleNode valueOf(double d2) {
        return new DoubleNode(d2);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return NumberOutput.toString(this._value);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof DoubleNode)) {
            return Double.compare(this._value, ((DoubleNode) obj)._value) == 0;
        }
        return false;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this._value);
        return ((int) jDoubleToLongBits) ^ ((int) (jDoubleToLongBits >> 32));
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(this._value);
    }
}
