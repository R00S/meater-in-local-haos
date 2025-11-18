package com.google.crypto.tink.shaded.protobuf;

/* compiled from: GeneratedMessageInfoFactory.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2912w implements O {

    /* renamed from: a, reason: collision with root package name */
    private static final C2912w f38038a = new C2912w();

    private C2912w() {
    }

    public static C2912w c() {
        return f38038a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public N a(Class<?> cls) {
        if (!AbstractC2913x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (N) AbstractC2913x.B(cls.asSubclass(AbstractC2913x.class)).q();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public boolean b(Class<?> cls) {
        return AbstractC2913x.class.isAssignableFrom(cls);
    }
}
