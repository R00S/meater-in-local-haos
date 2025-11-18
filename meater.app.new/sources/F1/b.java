package F1;

import F1.a;
import F1.b;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import s1.X;

/* compiled from: DynamicAnimation.java */
/* loaded from: classes.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: m, reason: collision with root package name */
    public static final s f4432m = new g("translationX");

    /* renamed from: n, reason: collision with root package name */
    public static final s f4433n = new h("translationY");

    /* renamed from: o, reason: collision with root package name */
    public static final s f4434o = new i("translationZ");

    /* renamed from: p, reason: collision with root package name */
    public static final s f4435p = new j("scaleX");

    /* renamed from: q, reason: collision with root package name */
    public static final s f4436q = new k("scaleY");

    /* renamed from: r, reason: collision with root package name */
    public static final s f4437r = new l("rotation");

    /* renamed from: s, reason: collision with root package name */
    public static final s f4438s = new m("rotationX");

    /* renamed from: t, reason: collision with root package name */
    public static final s f4439t = new n("rotationY");

    /* renamed from: u, reason: collision with root package name */
    public static final s f4440u = new o("x");

    /* renamed from: v, reason: collision with root package name */
    public static final s f4441v = new a("y");

    /* renamed from: w, reason: collision with root package name */
    public static final s f4442w = new C0082b("z");

    /* renamed from: x, reason: collision with root package name */
    public static final s f4443x = new c("alpha");

    /* renamed from: y, reason: collision with root package name */
    public static final s f4444y = new d("scrollX");

    /* renamed from: z, reason: collision with root package name */
    public static final s f4445z = new e("scrollY");

    /* renamed from: a, reason: collision with root package name */
    float f4446a;

    /* renamed from: b, reason: collision with root package name */
    float f4447b;

    /* renamed from: c, reason: collision with root package name */
    boolean f4448c;

    /* renamed from: d, reason: collision with root package name */
    final Object f4449d;

    /* renamed from: e, reason: collision with root package name */
    final F1.c f4450e;

    /* renamed from: f, reason: collision with root package name */
    boolean f4451f;

    /* renamed from: g, reason: collision with root package name */
    float f4452g;

    /* renamed from: h, reason: collision with root package name */
    float f4453h;

    /* renamed from: i, reason: collision with root package name */
    private long f4454i;

    /* renamed from: j, reason: collision with root package name */
    private float f4455j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList<q> f4456k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList<r> f4457l;

    /* compiled from: DynamicAnimation.java */
    static class a extends s {
        a(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: F1.b$b, reason: collision with other inner class name */
    static class C0082b extends s {
        C0082b(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return X.L(view);
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            X.K0(view, f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class c extends s {
        c(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class d extends s {
        d(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class e extends s {
        e(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    class f extends F1.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F1.d f4458b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, F1.d dVar) {
            super(str);
            this.f4458b = dVar;
        }

        @Override // F1.c
        public float a(Object obj) {
            return this.f4458b.a();
        }

        @Override // F1.c
        public void b(Object obj, float f10) {
            this.f4458b.b(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class g extends s {
        g(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class h extends s {
        h(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class i extends s {
        i(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return X.I(view);
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            X.I0(view, f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class j extends s {
        j(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class k extends s {
        k(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class l extends s {
        l(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class m extends s {
        m(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class n extends s {
        n(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class o extends s {
        o(String str) {
            super(str, null);
        }

        @Override // F1.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // F1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class p {

        /* renamed from: a, reason: collision with root package name */
        float f4460a;

        /* renamed from: b, reason: collision with root package name */
        float f4461b;

        p() {
        }
    }

    /* compiled from: DynamicAnimation.java */
    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    /* compiled from: DynamicAnimation.java */
    public interface r {
        void b(b bVar, float f10, float f11);
    }

    /* compiled from: DynamicAnimation.java */
    public static abstract class s extends F1.c<View> {
        /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    b(F1.d dVar) {
        this.f4446a = 0.0f;
        this.f4447b = Float.MAX_VALUE;
        this.f4448c = false;
        this.f4451f = false;
        this.f4452g = Float.MAX_VALUE;
        this.f4453h = -Float.MAX_VALUE;
        this.f4454i = 0L;
        this.f4456k = new ArrayList<>();
        this.f4457l = new ArrayList<>();
        this.f4449d = null;
        this.f4450e = new f("FloatValueHolder", dVar);
        this.f4455j = 1.0f;
    }

    private void d(boolean z10) {
        this.f4451f = false;
        F1.a.d().g(this);
        this.f4454i = 0L;
        this.f4448c = false;
        for (int i10 = 0; i10 < this.f4456k.size(); i10++) {
            if (this.f4456k.get(i10) != null) {
                this.f4456k.get(i10).a(this, z10, this.f4447b, this.f4446a);
            }
        }
        h(this.f4456k);
    }

    private float e() {
        return this.f4450e.a(this.f4449d);
    }

    private static <T> void h(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void q() {
        if (this.f4451f) {
            return;
        }
        this.f4451f = true;
        if (!this.f4448c) {
            this.f4447b = e();
        }
        float f10 = this.f4447b;
        if (f10 > this.f4452g || f10 < this.f4453h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        F1.a.d().a(this, 0L);
    }

    @Override // F1.a.b
    public boolean a(long j10) {
        long j11 = this.f4454i;
        if (j11 == 0) {
            this.f4454i = j10;
            l(this.f4447b);
            return false;
        }
        this.f4454i = j10;
        boolean zR = r(j10 - j11);
        float fMin = Math.min(this.f4447b, this.f4452g);
        this.f4447b = fMin;
        float fMax = Math.max(fMin, this.f4453h);
        this.f4447b = fMax;
        l(fMax);
        if (zR) {
            d(false);
        }
        return zR;
    }

    public T b(q qVar) {
        if (!this.f4456k.contains(qVar)) {
            this.f4456k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (g()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f4457l.contains(rVar)) {
            this.f4457l.add(rVar);
        }
        return this;
    }

    float f() {
        return this.f4455j * 0.75f;
    }

    public boolean g() {
        return this.f4451f;
    }

    public T i(float f10) {
        this.f4452g = f10;
        return this;
    }

    public T j(float f10) {
        this.f4453h = f10;
        return this;
    }

    public T k(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f4455j = f10;
        o(f10 * 0.75f);
        return this;
    }

    void l(float f10) {
        this.f4450e.b(this.f4449d, f10);
        for (int i10 = 0; i10 < this.f4457l.size(); i10++) {
            if (this.f4457l.get(i10) != null) {
                this.f4457l.get(i10).b(this, this.f4447b, this.f4446a);
            }
        }
        h(this.f4457l);
    }

    public T m(float f10) {
        this.f4447b = f10;
        this.f4448c = true;
        return this;
    }

    public T n(float f10) {
        this.f4446a = f10;
        return this;
    }

    abstract void o(float f10);

    public void p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f4451f) {
            return;
        }
        q();
    }

    abstract boolean r(long j10);

    <K> b(K k10, F1.c<K> cVar) {
        this.f4446a = 0.0f;
        this.f4447b = Float.MAX_VALUE;
        this.f4448c = false;
        this.f4451f = false;
        this.f4452g = Float.MAX_VALUE;
        this.f4453h = -Float.MAX_VALUE;
        this.f4454i = 0L;
        this.f4456k = new ArrayList<>();
        this.f4457l = new ArrayList<>();
        this.f4449d = k10;
        this.f4450e = cVar;
        if (cVar != f4437r && cVar != f4438s && cVar != f4439t) {
            if (cVar == f4443x) {
                this.f4455j = 0.00390625f;
                return;
            } else if (cVar != f4435p && cVar != f4436q) {
                this.f4455j = 1.0f;
                return;
            } else {
                this.f4455j = 0.00390625f;
                return;
            }
        }
        this.f4455j = 0.1f;
    }
}
