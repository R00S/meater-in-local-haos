package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class JsonNode extends JsonSerializable.Base implements Iterable<JsonNode> {
    protected JsonNode() {
    }

    public abstract String asText();

    public Iterator<JsonNode> elements() {
        return ClassUtil.emptyIterator();
    }

    public abstract JsonNodeType getNodeType();

    public final boolean isArray() {
        return getNodeType() == JsonNodeType.ARRAY;
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonNode> iterator() {
        return elements();
    }

    public abstract String toString();
}
