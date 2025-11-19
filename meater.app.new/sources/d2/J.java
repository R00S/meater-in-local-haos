package d2;

import X1.InterfaceC1807d;
import X1.L;

/* compiled from: StandaloneMediaClock.java */
/* loaded from: classes.dex */
public final class J implements InterfaceC3027E {

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC1807d f39683B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f39684C;

    /* renamed from: D, reason: collision with root package name */
    private long f39685D;

    /* renamed from: E, reason: collision with root package name */
    private long f39686E;

    /* renamed from: F, reason: collision with root package name */
    private U1.A f39687F = U1.A.f16772d;

    public J(InterfaceC1807d interfaceC1807d) {
        this.f39683B = interfaceC1807d;
    }

    @Override // d2.InterfaceC3027E
    public long C() {
        long j10 = this.f39685D;
        if (!this.f39684C) {
            return j10;
        }
        long jC = this.f39683B.c() - this.f39686E;
        U1.A a10 = this.f39687F;
        return j10 + (a10.f16775a == 1.0f ? L.Q0(jC) : a10.a(jC));
    }

    public void a(long j10) {
        this.f39685D = j10;
        if (this.f39684C) {
            this.f39686E = this.f39683B.c();
        }
    }

    public void b() {
        if (this.f39684C) {
            return;
        }
        this.f39686E = this.f39683B.c();
        this.f39684C = true;
    }

    public void c() {
        if (this.f39684C) {
            a(C());
            this.f39684C = false;
        }
    }

    @Override // d2.InterfaceC3027E
    public void e(U1.A a10) {
        if (this.f39684C) {
            a(C());
        }
        this.f39687F = a10;
    }

    @Override // d2.InterfaceC3027E
    public U1.A h() {
        return this.f39687F;
    }
}
