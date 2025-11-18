package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public class DecimalNode extends NumericNode {
    protected final BigDecimal _value;
    public static final DecimalNode ZERO = new DecimalNode(BigDecimal.ZERO);
    private static final BigDecimal MIN_INTEGER = BigDecimal.valueOf(-2147483648L);
    private static final BigDecimal MAX_INTEGER = BigDecimal.valueOf(2147483647L);
    private static final BigDecimal MIN_LONG = BigDecimal.valueOf(Long.MIN_VALUE);
    private static final BigDecimal MAX_LONG = BigDecimal.valueOf(Long.MAX_VALUE);

    public DecimalNode(BigDecimal bigDecimal) {
        this._value = bigDecimal;
    }

    public static DecimalNode valueOf(BigDecimal bigDecimal) {
        return new DecimalNode(bigDecimal);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return this._value.toString();
    }

    public double doubleValue() {
        return this._value.doubleValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof DecimalNode) && ((DecimalNode) obj)._value.compareTo(this._value) == 0;
    }

    public int hashCode() {
        return Double.valueOf(doubleValue()).hashCode();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(this._value);
    }
}
