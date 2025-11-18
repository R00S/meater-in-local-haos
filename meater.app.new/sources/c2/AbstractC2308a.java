package c2;

/* compiled from: Buffer.java */
/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2308a {

    /* renamed from: B, reason: collision with root package name */
    private int f30916B;

    public final boolean A() {
        return u(67108864);
    }

    public final void B(int i10) {
        this.f30916B = i10;
    }

    public final void s(int i10) {
        this.f30916B = i10 | this.f30916B;
    }

    public void t() {
        this.f30916B = 0;
    }

    protected final boolean u(int i10) {
        return (this.f30916B & i10) == i10;
    }

    public final boolean v() {
        return u(268435456);
    }

    public final boolean w() {
        return u(4);
    }

    public final boolean x() {
        return u(134217728);
    }

    public final boolean y() {
        return u(1);
    }

    public final boolean z() {
        return u(536870912);
    }
}
