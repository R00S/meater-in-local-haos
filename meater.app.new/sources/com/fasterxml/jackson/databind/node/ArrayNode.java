package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ArrayNode extends ContainerNode<ArrayNode> {
    private final List<JsonNode> _children;

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new ArrayList();
    }

    protected ArrayNode _add(JsonNode jsonNode) {
        this._children.add(jsonNode);
        return this;
    }

    public ArrayNode add(JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _add(jsonNode);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> elements() {
        return this._children.iterator();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ArrayNode)) {
            return this._children.equals(((ArrayNode) obj)._children);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.ARRAY;
    }

    public int hashCode() {
        return this._children.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base
    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        List<JsonNode> list = this._children;
        int size = list.size();
        jsonGenerator.writeStartArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            JsonNode jsonNode = list.get(i2);
            if (jsonNode instanceof BaseJsonNode) {
                ((BaseJsonNode) jsonNode).serialize(jsonGenerator, serializerProvider);
            } else {
                jsonNode.serialize(jsonGenerator, serializerProvider);
            }
        }
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        typeSerializer.writeTypePrefixForArray(this, jsonGenerator);
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) it.next()).serialize(jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffixForArray(this, jsonGenerator);
    }

    public int size() {
        return this._children.size();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String toString() {
        StringBuilder sb = new StringBuilder((size() << 4) + 16);
        sb.append('[');
        int size = this._children.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            sb.append(this._children.get(i2).toString());
        }
        sb.append(']');
        return sb.toString();
    }
}
