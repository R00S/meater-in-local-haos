package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p176io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

/* loaded from: classes2.dex */
public class IntNode extends NumericNode {
    private static final IntNode[] CANONICALS = new IntNode[12];
    protected final int _value;

    static {
        for (int i2 = 0; i2 < 12; i2++) {
            CANONICALS[i2] = new IntNode(i2 - 1);
        }
    }

    public IntNode(int i2) {
        this._value = i2;
    }

    public static IntNode valueOf(int i2) {
        return (i2 > 10 || i2 < -1) ? new IntNode(i2) : CANONICALS[i2 - (-1)];
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return NumberOutput.toString(this._value);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof IntNode) && ((IntNode) obj)._value == this._value;
    }

    public int hashCode() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(this._value);
    }
}
