package com.google.crypto.tink.shaded.protobuf;

/* compiled from: MapFieldSchemas.java */
/* loaded from: classes2.dex */
final class M {

    /* renamed from: a, reason: collision with root package name */
    private static final K f37746a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final K f37747b = new L();

    static K a() {
        return f37746a;
    }

    static K b() {
        return f37747b;
    }

    private static K c() {
        try {
            return (K) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
