package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2691s implements InterfaceC2686q {

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC2686q f34662d = new InterfaceC2686q() { // from class: com.google.android.gms.internal.wearable.r
        @Override // com.google.android.gms.internal.wearable.InterfaceC2686q
        public final Object a() {
            throw new IllegalStateException();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C2695u f34663a = new C2695u();

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC2686q f34664b;

    /* renamed from: c, reason: collision with root package name */
    private Object f34665c;

    C2691s(InterfaceC2686q interfaceC2686q) {
        this.f34664b = interfaceC2686q;
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC2686q
    public final Object a() {
        InterfaceC2686q interfaceC2686q = this.f34664b;
        InterfaceC2686q interfaceC2686q2 = f34662d;
        if (interfaceC2686q != interfaceC2686q2) {
            synchronized (this.f34663a) {
                try {
                    if (this.f34664b != interfaceC2686q2) {
                        Object objA = this.f34664b.a();
                        this.f34665c = objA;
                        this.f34664b = interfaceC2686q2;
                        return objA;
                    }
                } finally {
                }
            }
        }
        return this.f34665c;
    }

    public final String toString() {
        Object obj = this.f34664b;
        if (obj == f34662d) {
            obj = "<supplier that returned " + String.valueOf(this.f34665c) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }
}
