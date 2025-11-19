package O3;

import L3.C1360e;
import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes.dex */
public abstract class a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    private final d<K> f13167c;

    /* renamed from: e, reason: collision with root package name */
    protected Y3.c<A> f13169e;

    /* renamed from: a, reason: collision with root package name */
    final List<b> f13165a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private boolean f13166b = false;

    /* renamed from: d, reason: collision with root package name */
    protected float f13168d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private A f13170f = null;

    /* renamed from: g, reason: collision with root package name */
    private float f13171g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f13172h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    public interface b {
        void a();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private static final class c<T> implements d<T> {
        private c() {
        }

        @Override // O3.a.d
        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // O3.a.d
        public Y3.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // O3.a.d
        public boolean c(float f10) {
            return false;
        }

        @Override // O3.a.d
        public float d() {
            return 1.0f;
        }

        @Override // O3.a.d
        public float e() {
            return 0.0f;
        }

        @Override // O3.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private interface d<T> {
        boolean a(float f10);

        Y3.a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private static final class e<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        private final List<? extends Y3.a<T>> f13173a;

        /* renamed from: c, reason: collision with root package name */
        private Y3.a<T> f13175c = null;

        /* renamed from: d, reason: collision with root package name */
        private float f13176d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        private Y3.a<T> f13174b = f(0.0f);

        e(List<? extends Y3.a<T>> list) {
            this.f13173a = list;
        }

        private Y3.a<T> f(float f10) {
            List<? extends Y3.a<T>> list = this.f13173a;
            Y3.a<T> aVar = list.get(list.size() - 1);
            if (f10 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f13173a.size() - 2; size >= 1; size--) {
                Y3.a<T> aVar2 = this.f13173a.get(size);
                if (this.f13174b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return this.f13173a.get(0);
        }

        @Override // O3.a.d
        public boolean a(float f10) {
            Y3.a<T> aVar = this.f13175c;
            Y3.a<T> aVar2 = this.f13174b;
            if (aVar == aVar2 && this.f13176d == f10) {
                return true;
            }
            this.f13175c = aVar2;
            this.f13176d = f10;
            return false;
        }

        @Override // O3.a.d
        public Y3.a<T> b() {
            return this.f13174b;
        }

        @Override // O3.a.d
        public boolean c(float f10) {
            if (this.f13174b.a(f10)) {
                return !this.f13174b.i();
            }
            this.f13174b = f(f10);
            return true;
        }

        @Override // O3.a.d
        public float d() {
            return this.f13173a.get(r0.size() - 1).c();
        }

        @Override // O3.a.d
        public float e() {
            return this.f13173a.get(0).f();
        }

        @Override // O3.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private static final class f<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Y3.a<T> f13177a;

        /* renamed from: b, reason: collision with root package name */
        private float f13178b = -1.0f;

        f(List<? extends Y3.a<T>> list) {
            this.f13177a = list.get(0);
        }

        @Override // O3.a.d
        public boolean a(float f10) {
            if (this.f13178b == f10) {
                return true;
            }
            this.f13178b = f10;
            return false;
        }

        @Override // O3.a.d
        public Y3.a<T> b() {
            return this.f13177a;
        }

        @Override // O3.a.d
        public boolean c(float f10) {
            return !this.f13177a.i();
        }

        @Override // O3.a.d
        public float d() {
            return this.f13177a.c();
        }

        @Override // O3.a.d
        public float e() {
            return this.f13177a.f();
        }

        @Override // O3.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    a(List<? extends Y3.a<K>> list) {
        this.f13167c = p(list);
    }

    @SuppressLint({"Range"})
    private float g() {
        if (this.f13171g == -1.0f) {
            this.f13171g = this.f13167c.e();
        }
        return this.f13171g;
    }

    private static <T> d<T> p(List<? extends Y3.a<T>> list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f13165a.add(bVar);
    }

    protected Y3.a<K> b() {
        if (C1360e.g()) {
            C1360e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        Y3.a<K> aVarB = this.f13167c.b();
        if (C1360e.g()) {
            C1360e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return aVarB;
    }

    @SuppressLint({"Range"})
    float c() {
        if (this.f13172h == -1.0f) {
            this.f13172h = this.f13167c.d();
        }
        return this.f13172h;
    }

    protected float d() {
        Interpolator interpolator;
        Y3.a<K> aVarB = b();
        if (aVarB == null || aVarB.i() || (interpolator = aVarB.f19389d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    float e() {
        if (this.f13166b) {
            return 0.0f;
        }
        Y3.a<K> aVarB = b();
        if (aVarB.i()) {
            return 0.0f;
        }
        return (this.f13168d - aVarB.f()) / (aVarB.c() - aVarB.f());
    }

    public float f() {
        return this.f13168d;
    }

    public A h() {
        float fE = e();
        if (this.f13169e == null && this.f13167c.a(fE)) {
            return this.f13170f;
        }
        Y3.a<K> aVarB = b();
        Interpolator interpolator = aVarB.f19390e;
        A aI = (interpolator == null || aVarB.f19391f == null) ? i(aVarB, d()) : j(aVarB, fE, interpolator.getInterpolation(fE), aVarB.f19391f.getInterpolation(fE));
        this.f13170f = aI;
        return aI;
    }

    abstract A i(Y3.a<K> aVar, float f10);

    protected A j(Y3.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f13169e != null;
    }

    public void l() {
        if (C1360e.g()) {
            C1360e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i10 = 0; i10 < this.f13165a.size(); i10++) {
            this.f13165a.get(i10).a();
        }
        if (C1360e.g()) {
            C1360e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.f13166b = true;
    }

    public void n(float f10) {
        if (C1360e.g()) {
            C1360e.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f13167c.isEmpty()) {
            if (C1360e.g()) {
                C1360e.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f13168d) {
            if (C1360e.g()) {
                C1360e.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f13168d = f10;
            if (this.f13167c.c(f10)) {
                l();
            }
            if (C1360e.g()) {
                C1360e.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void o(Y3.c<A> cVar) {
        Y3.c<A> cVar2 = this.f13169e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f13169e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
