package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: classes2.dex */
public abstract class ContainerSerializer<T> extends StdSerializer<T> {
    protected ContainerSerializer(Class<T> cls) {
        super(cls);
    }

    protected abstract ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer);

    /* JADX WARN: Multi-variable type inference failed */
    public ContainerSerializer<?> withValueTypeSerializer(TypeSerializer typeSerializer) {
        return typeSerializer == null ? this : _withValueTypeSerializer(typeSerializer);
    }

    protected ContainerSerializer(JavaType javaType) {
        super(javaType);
    }

    protected ContainerSerializer(Class<?> cls, boolean z) {
        super(cls, z);
    }

    protected ContainerSerializer(ContainerSerializer<?> containerSerializer) {
        super(containerSerializer._handledType, false);
    }
}
