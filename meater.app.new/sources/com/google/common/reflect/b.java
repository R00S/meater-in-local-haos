package com.google.common.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import l8.m;

/* compiled from: Reflection.java */
/* loaded from: classes2.dex */
public final class b {
    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        m.l(invocationHandler);
        m.h(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
