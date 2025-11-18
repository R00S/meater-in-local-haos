package com.google.protobuf;

/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes2.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    private static final V f39214a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final V f39215b = new W();

    static V a() {
        return f39214a;
    }

    static V b() {
        return f39215b;
    }

    private static V c() {
        try {
            return (V) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
