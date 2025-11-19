package com.google.gson;

/* compiled from: ReflectionAccessFilter.java */
/* loaded from: classes2.dex */
public interface r {

    /* compiled from: ReflectionAccessFilter.java */
    public enum a {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    a a(Class<?> cls);
}
