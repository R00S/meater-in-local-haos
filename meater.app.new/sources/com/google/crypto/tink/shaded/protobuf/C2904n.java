package com.google.crypto.tink.shaded.protobuf;

/* compiled from: ExtensionRegistryFactory.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2904n {

    /* renamed from: a, reason: collision with root package name */
    static final Class<?> f37882a = c();

    public static C2905o a() {
        C2905o c2905oB = b("getEmptyRegistry");
        return c2905oB != null ? c2905oB : C2905o.f37885d;
    }

    private static final C2905o b(String str) {
        Class<?> cls = f37882a;
        if (cls == null) {
            return null;
        }
        try {
            return (C2905o) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
