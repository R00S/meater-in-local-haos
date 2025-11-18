package Ra;

import kotlin.jvm.internal.C3862t;

/* compiled from: Visibility.kt */
/* loaded from: classes3.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15197a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15198b;

    protected x0(String name, boolean z10) {
        C3862t.g(name, "name");
        this.f15197a = name;
        this.f15198b = z10;
    }

    public Integer a(x0 visibility) {
        C3862t.g(visibility, "visibility");
        return w0.f15184a.a(this, visibility);
    }

    public String b() {
        return this.f15197a;
    }

    public final boolean c() {
        return this.f15198b;
    }

    public final String toString() {
        return b();
    }

    public x0 d() {
        return this;
    }
}
