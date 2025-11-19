package com.google.protobuf;

/* compiled from: MapFieldSchemas.java */
/* loaded from: classes2.dex */
final class M {

    /* renamed from: a, reason: collision with root package name */
    private static final K f39187a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final K f39188b = new L();

    static K a() {
        return f39187a;
    }

    static K b() {
        return f39188b;
    }

    private static K c() {
        try {
            return (K) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
