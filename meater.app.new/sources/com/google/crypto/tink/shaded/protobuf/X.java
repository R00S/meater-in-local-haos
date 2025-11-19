package com.google.crypto.tink.shaded.protobuf;

/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes2.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    private static final V f37773a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final V f37774b = new W();

    static V a() {
        return f37773a;
    }

    static V b() {
        return f37774b;
    }

    private static V c() {
        try {
            return (V) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
