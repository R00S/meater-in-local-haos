package z7;

import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class s<T> implements r<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f53825a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f53826b;

    /* renamed from: c, reason: collision with root package name */
    private final N f53827c;

    /* renamed from: d, reason: collision with root package name */
    private int f53828d;

    /* renamed from: e, reason: collision with root package name */
    private int f53829e;

    /* renamed from: f, reason: collision with root package name */
    private int f53830f;

    /* renamed from: g, reason: collision with root package name */
    private Exception f53831g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f53832h;

    public s(int i10, N n10) {
        this.f53826b = i10;
        this.f53827c = n10;
    }

    private final void c() {
        if (this.f53828d + this.f53829e + this.f53830f == this.f53826b) {
            if (this.f53831g == null) {
                if (this.f53832h) {
                    this.f53827c.t();
                    return;
                } else {
                    this.f53827c.s(null);
                    return;
                }
            }
            this.f53827c.r(new ExecutionException(this.f53829e + " out of " + this.f53826b + " underlying tasks failed", this.f53831g));
        }
    }

    @Override // z7.InterfaceC5205g
    public final void a(T t10) {
        synchronized (this.f53825a) {
            this.f53828d++;
            c();
        }
    }

    @Override // z7.InterfaceC5202d
    public final void b() {
        synchronized (this.f53825a) {
            this.f53830f++;
            this.f53832h = true;
            c();
        }
    }

    @Override // z7.InterfaceC5204f
    public final void d(Exception exc) {
        synchronized (this.f53825a) {
            this.f53829e++;
            this.f53831g = exc;
            c();
        }
    }
}
