package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.util.Collection;

/* loaded from: classes2.dex */
public abstract class StaticListSerializerBase<T extends Collection<?>> extends StdSerializer<T> implements ContextualSerializer {
    protected final JsonSerializer<String> _serializer;
    protected final Boolean _unwrapSingle;

    protected StaticListSerializerBase(Class<?> cls) {
        super(cls, false);
        this._serializer = null;
        this._unwrapSingle = null;
    }

    public abstract JsonSerializer<?> _withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, Boolean bool);

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer<?> createContextual(com.fasterxml.jackson.databind.SerializerProvider r5, com.fasterxml.jackson.databind.BeanProperty r6) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L18
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r5.getAnnotationIntrospector()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r6.getMember()
            if (r2 == 0) goto L18
            java.lang.Object r1 = r1.findContentSerializer(r2)
            if (r1 == 0) goto L18
            com.fasterxml.jackson.databind.JsonSerializer r1 = r5.serializerInstance(r2, r1)
            goto L19
        L18:
            r1 = r0
        L19:
            java.lang.Class r2 = r4.handledType()
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r4.findFormatOverrides(r5, r6, r2)
            if (r2 == 0) goto L2a
            com.fasterxml.jackson.annotation.JsonFormat$Feature r3 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r2 = r2.getFeature(r3)
            goto L2b
        L2a:
            r2 = r0
        L2b:
            if (r1 != 0) goto L2f
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.String> r1 = r4._serializer
        L2f:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r4.findConvertingContentSerializer(r5, r6, r1)
            if (r1 != 0) goto L3c
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.fasterxml.jackson.databind.JsonSerializer r5 = r5.findValueSerializer(r1, r6)
            goto L40
        L3c:
            com.fasterxml.jackson.databind.JsonSerializer r5 = r5.handleSecondaryContextualization(r1, r6)
        L40:
            boolean r1 = r4.isDefaultSerializer(r5)
            if (r1 == 0) goto L47
            goto L48
        L47:
            r0 = r5
        L48:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.String> r5 = r4._serializer
            if (r0 != r5) goto L51
            java.lang.Boolean r5 = r4._unwrapSingle
            if (r2 != r5) goto L51
            return r4
        L51:
            com.fasterxml.jackson.databind.JsonSerializer r5 = r4._withResolved(r6, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase.createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, T t) {
        return t == null || t.size() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected StaticListSerializerBase(StaticListSerializerBase<?> staticListSerializerBase, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(staticListSerializerBase);
        this._serializer = jsonSerializer;
        this._unwrapSingle = bool;
    }
}
