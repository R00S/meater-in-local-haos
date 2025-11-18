package com.fasterxml.jackson.core;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class ObjectCodec extends TreeCodec {
    protected ObjectCodec() {
    }

    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException;
}
