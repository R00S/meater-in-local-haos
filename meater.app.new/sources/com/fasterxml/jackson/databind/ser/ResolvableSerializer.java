package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;

/* loaded from: classes2.dex */
public interface ResolvableSerializer {
    void resolve(SerializerProvider serializerProvider) throws JsonMappingException;
}
