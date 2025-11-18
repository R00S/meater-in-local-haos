package com.fasterxml.jackson.databind.node;

/* loaded from: classes2.dex */
public abstract class NumericNode extends ValueNode {
    protected NumericNode() {
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNodeType getNodeType() {
        return JsonNodeType.NUMBER;
    }
}
