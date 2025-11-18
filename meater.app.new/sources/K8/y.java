package K8;

import j9.InterfaceC3754a;
import j9.InterfaceC3755b;

/* compiled from: OptionalProvider.java */
/* loaded from: classes2.dex */
class y<T> implements InterfaceC3755b<T>, InterfaceC3754a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC3754a.InterfaceC0558a<Object> f8802c = new InterfaceC3754a.InterfaceC0558a() { // from class: K8.v
        @Override // j9.InterfaceC3754a.InterfaceC0558a
        public final void a(InterfaceC3755b interfaceC3755b) {
            y.f(interfaceC3755b);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC3755b<Object> f8803d = new InterfaceC3755b() { // from class: K8.w
        @Override // j9.InterfaceC3755b
        public final Object get() {
            return y.g();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC3754a.InterfaceC0558a<T> f8804a;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC3755b<T> f8805b;

    private y(InterfaceC3754a.InterfaceC0558a<T> interfaceC0558a, InterfaceC3755b<T> interfaceC3755b) {
        this.f8804a = interfaceC0558a;
        this.f8805b = interfaceC3755b;
    }

    static <T> y<T> e() {
        return new y<>(f8802c, f8803d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(InterfaceC3754a.InterfaceC0558a interfaceC0558a, InterfaceC3754a.InterfaceC0558a interfaceC0558a2, InterfaceC3755b interfaceC3755b) {
        interfaceC0558a.a(interfaceC3755b);
        interfaceC0558a2.a(interfaceC3755b);
    }

    static <T> y<T> i(InterfaceC3755b<T> interfaceC3755b) {
        return new y<>(null, interfaceC3755b);
    }

    @Override // j9.InterfaceC3754a
    public void a(final InterfaceC3754a.InterfaceC0558a<T> interfaceC0558a) {
        InterfaceC3755b<T> interfaceC3755b;
        InterfaceC3755b<T> interfaceC3755b2;
        InterfaceC3755b<T> interfaceC3755b3 = this.f8805b;
        InterfaceC3755b<Object> interfaceC3755b4 = f8803d;
        if (interfaceC3755b3 != interfaceC3755b4) {
            interfaceC0558a.a(interfaceC3755b3);
            return;
        }
        synchronized (this) {
            interfaceC3755b = this.f8805b;
            if (interfaceC3755b != interfaceC3755b4) {
                interfaceC3755b2 = interfaceC3755b;
            } else {
                final InterfaceC3754a.InterfaceC0558a<T> interfaceC0558a2 = this.f8804a;
                this.f8804a = new InterfaceC3754a.InterfaceC0558a() { // from class: K8.x
                    @Override // j9.InterfaceC3754a.InterfaceC0558a
                    public final void a(InterfaceC3755b interfaceC3755b5) {
                        y.h(interfaceC0558a2, interfaceC0558a, interfaceC3755b5);
                    }
                };
                interfaceC3755b2 = null;
            }
        }
        if (interfaceC3755b2 != null) {
            interfaceC0558a.a(interfaceC3755b);
        }
    }

    @Override // j9.InterfaceC3755b
    public T get() {
        return this.f8805b.get();
    }

    void j(InterfaceC3755b<T> interfaceC3755b) {
        InterfaceC3754a.InterfaceC0558a<T> interfaceC0558a;
        if (this.f8805b != f8803d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0558a = this.f8804a;
            this.f8804a = null;
            this.f8805b = interfaceC3755b;
        }
        interfaceC0558a.a(interfaceC3755b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(InterfaceC3755b interfaceC3755b) {
    }
}
