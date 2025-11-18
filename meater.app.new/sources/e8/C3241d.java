package e8;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: e8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3241d implements InterfaceC3243f {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f40761c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC3243f f40762a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f40763b = f40761c;

    private C3241d(InterfaceC3243f interfaceC3243f) {
        this.f40762a = interfaceC3243f;
    }

    public static InterfaceC3243f b(InterfaceC3243f interfaceC3243f) {
        interfaceC3243f.getClass();
        return interfaceC3243f instanceof C3241d ? interfaceC3243f : new C3241d(interfaceC3243f);
    }

    @Override // e8.InterfaceC3243f
    public final Object a() {
        Object objA = this.f40763b;
        Object obj = f40761c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f40763b;
                    if (objA == obj) {
                        objA = this.f40762a.a();
                        Object obj2 = this.f40763b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f40763b = objA;
                        this.f40762a = null;
                    }
                } finally {
                }
            }
        }
        return objA;
    }
}
