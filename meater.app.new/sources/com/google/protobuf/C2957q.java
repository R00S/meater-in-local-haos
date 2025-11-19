package com.google.protobuf;

/* compiled from: ExtensionSchemas.java */
/* renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2957q {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2955o<?> f39350a = new C2956p();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2955o<?> f39351b = c();

    static AbstractC2955o<?> a() {
        AbstractC2955o<?> abstractC2955o = f39351b;
        if (abstractC2955o != null) {
            return abstractC2955o;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC2955o<?> b() {
        return f39350a;
    }

    private static AbstractC2955o<?> c() {
        try {
            return (AbstractC2955o) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
