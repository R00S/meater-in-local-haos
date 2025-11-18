package O3;

import java.util.Collections;

/* compiled from: ValueCallbackKeyframeAnimation.java */
/* loaded from: classes.dex */
public class q<K, A> extends a<K, A> {

    /* renamed from: i, reason: collision with root package name */
    private final A f13231i;

    public q(Y3.c<A> cVar) {
        this(cVar, null);
    }

    @Override // O3.a
    float c() {
        return 1.0f;
    }

    @Override // O3.a
    public A h() {
        Y3.c<A> cVar = this.f13169e;
        A a10 = this.f13231i;
        return cVar.b(0.0f, 0.0f, a10, a10, f(), f(), f());
    }

    @Override // O3.a
    A i(Y3.a<K> aVar, float f10) {
        return h();
    }

    @Override // O3.a
    public void l() {
        if (this.f13169e != null) {
            super.l();
        }
    }

    @Override // O3.a
    public void n(float f10) {
        this.f13168d = f10;
    }

    public q(Y3.c<A> cVar, A a10) {
        super(Collections.emptyList());
        o(cVar);
        this.f13231i = a10;
    }
}
