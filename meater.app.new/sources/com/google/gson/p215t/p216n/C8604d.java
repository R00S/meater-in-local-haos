package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8578q;
import com.google.gson.C8566e;
import com.google.gson.InterfaceC8570i;
import com.google.gson.InterfaceC8576o;
import com.google.gson.InterfaceC8579r;
import com.google.gson.p214s.InterfaceC8581b;
import com.google.gson.p215t.C8590c;
import com.google.gson.p219u.C8619a;

/* compiled from: JsonAdapterAnnotationTypeAdapterFactory.java */
/* renamed from: com.google.gson.t.n.d */
/* loaded from: classes2.dex */
public final class C8604d implements InterfaceC8579r {

    /* renamed from: f */
    private final C8590c f32585f;

    public C8604d(C8590c c8590c) {
        this.f32585f = c8590c;
    }

    /* renamed from: a */
    AbstractC8578q<?> m27121a(C8590c c8590c, C8566e c8566e, C8619a<?> c8619a, InterfaceC8581b interfaceC8581b) {
        AbstractC8578q<?> c8612l;
        Object objMo27071a = c8590c.m27070a(C8619a.get((Class) interfaceC8581b.value())).mo27071a();
        if (objMo27071a instanceof AbstractC8578q) {
            c8612l = (AbstractC8578q) objMo27071a;
        } else if (objMo27071a instanceof InterfaceC8579r) {
            c8612l = ((InterfaceC8579r) objMo27071a).mo26979b(c8566e, c8619a);
        } else {
            boolean z = objMo27071a instanceof InterfaceC8576o;
            if (!z && !(objMo27071a instanceof InterfaceC8570i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo27071a.getClass().getName() + " as a @JsonAdapter for " + c8619a.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            c8612l = new C8612l<>(z ? (InterfaceC8576o) objMo27071a : null, objMo27071a instanceof InterfaceC8570i ? (InterfaceC8570i) objMo27071a : null, c8566e, c8619a, null);
        }
        return (c8612l == null || !interfaceC8581b.nullSafe()) ? c8612l : c8612l.m26977a();
    }

    @Override // com.google.gson.InterfaceC8579r
    /* renamed from: b */
    public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
        InterfaceC8581b interfaceC8581b = (InterfaceC8581b) c8619a.getRawType().getAnnotation(InterfaceC8581b.class);
        if (interfaceC8581b == null) {
            return null;
        }
        return (AbstractC8578q<T>) m27121a(this.f32585f, c8566e, c8619a, interfaceC8581b);
    }
}
