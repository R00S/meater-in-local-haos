package com.google.protobuf;

/* compiled from: ExtensionRegistryFactory.java */
/* renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2953m {

    /* renamed from: a, reason: collision with root package name */
    static final Class<?> f39306a = c();

    public static C2954n a() {
        C2954n c2954nB = b("getEmptyRegistry");
        return c2954nB != null ? c2954nB : C2954n.f39315d;
    }

    private static final C2954n b(String str) {
        Class<?> cls = f39306a;
        if (cls == null) {
            return null;
        }
        try {
            return (C2954n) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
