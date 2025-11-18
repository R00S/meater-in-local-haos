package X1;

/* compiled from: ConditionVariable.java */
/* renamed from: X1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1810g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1807d f18655a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18656b;

    public C1810g() {
        this(InterfaceC1807d.f18647a);
    }

    public synchronized void a() {
        while (!this.f18656b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f18656b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f18656b;
        this.f18656b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f18656b;
    }

    public synchronized boolean e() {
        if (this.f18656b) {
            return false;
        }
        this.f18656b = true;
        notifyAll();
        return true;
    }

    public C1810g(InterfaceC1807d interfaceC1807d) {
        this.f18655a = interfaceC1807d;
    }
}
