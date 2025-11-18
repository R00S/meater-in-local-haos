package androidx.datastore.preferences.protobuf;

/* compiled from: GeneratedMessageInfoFactory.java */
/* renamed from: androidx.datastore.preferences.protobuf.x */
/* loaded from: classes.dex */
class C0421x implements InterfaceC0402p0 {

    /* renamed from: a */
    private static final C0421x f3014a = new C0421x();

    private C0421x() {
    }

    /* renamed from: c */
    public static C0421x m3325c() {
        return f3014a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0402p0
    /* renamed from: a */
    public InterfaceC0399o0 mo2816a(Class<?> cls) {
        if (!AbstractC0423y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC0399o0) AbstractC0423y.m3337w(cls.asSubclass(AbstractC0423y.class)).m3342p();
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0402p0
    /* renamed from: b */
    public boolean mo2817b(Class<?> cls) {
        return AbstractC0423y.class.isAssignableFrom(cls);
    }
}
