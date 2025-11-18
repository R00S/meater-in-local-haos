package com.google.protobuf;

/* compiled from: GeneratedMessageInfoFactory.java */
/* renamed from: com.google.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2961v implements O {

    /* renamed from: a, reason: collision with root package name */
    private static final C2961v f39468a = new C2961v();

    private C2961v() {
    }

    public static C2961v c() {
        return f39468a;
    }

    @Override // com.google.protobuf.O
    public N a(Class<?> cls) {
        if (!AbstractC2962w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (N) AbstractC2962w.I(cls.asSubclass(AbstractC2962w.class)).x();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.protobuf.O
    public boolean b(Class<?> cls) {
        return AbstractC2962w.class.isAssignableFrom(cls);
    }
}
