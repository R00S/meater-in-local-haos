package androidx.datastore.preferences.protobuf;

/* compiled from: GeneratedMessageInfoFactory.java */
/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2076w implements O {

    /* renamed from: a, reason: collision with root package name */
    private static final C2076w f25162a = new C2076w();

    private C2076w() {
    }

    public static C2076w c() {
        return f25162a;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public N a(Class<?> cls) {
        if (!AbstractC2077x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (N) AbstractC2077x.y(cls.asSubclass(AbstractC2077x.class)).r();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public boolean b(Class<?> cls) {
        return AbstractC2077x.class.isAssignableFrom(cls);
    }
}
