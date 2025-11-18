package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public class BigIntegerNode extends NumericNode {
    protected final BigInteger _value;
    private static final BigInteger MIN_INTEGER = BigInteger.valueOf(-2147483648L);
    private static final BigInteger MAX_INTEGER = BigInteger.valueOf(2147483647L);
    private static final BigInteger MIN_LONG = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);

    public BigIntegerNode(BigInteger bigInteger) {
        this._value = bigInteger;
    }

    public static BigIntegerNode valueOf(BigInteger bigInteger) {
        return new BigIntegerNode(bigInteger);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return this._value.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BigIntegerNode)) {
            return ((BigIntegerNode) obj)._value.equals(this._value);
        }
        return false;
    }

    public int hashCode() {
        return this._value.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(this._value);
    }
}
