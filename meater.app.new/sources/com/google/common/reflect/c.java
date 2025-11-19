package com.google.common.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import l8.m;

/* compiled from: TypeCapture.java */
/* loaded from: classes2.dex */
abstract class c<T> {
    c() {
    }

    final Type capture() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        m.h(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
