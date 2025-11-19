package X7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ShapePath.java */
/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f18869a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f18870b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f18871c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f18872d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f18873e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f18874f;

    /* renamed from: g, reason: collision with root package name */
    private final List<f> f18875g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List<g> f18876h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f18877i;

    /* compiled from: ShapePath.java */
    class a extends g {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f18878c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f18879d;

        a(List list, Matrix matrix) {
            this.f18878c = list;
            this.f18879d = matrix;
        }

        @Override // X7.m.g
        public void b(Matrix matrix, W7.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f18878c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).b(this.f18879d, aVar, i10, canvas);
            }
        }
    }

    /* compiled from: ShapePath.java */
    static class b extends g {

        /* renamed from: c, reason: collision with root package name */
        private final d f18881c;

        public b(d dVar) {
            this.f18881c = dVar;
        }

        @Override // X7.m.g
        public void b(Matrix matrix, W7.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f18881c.k(), this.f18881c.o(), this.f18881c.l(), this.f18881c.j()), i10, this.f18881c.m(), this.f18881c.n());
        }
    }

    /* compiled from: ShapePath.java */
    static class c extends g {

        /* renamed from: c, reason: collision with root package name */
        private final e f18882c;

        /* renamed from: d, reason: collision with root package name */
        private final float f18883d;

        /* renamed from: e, reason: collision with root package name */
        private final float f18884e;

        public c(e eVar, float f10, float f11) {
            this.f18882c = eVar;
            this.f18883d = f10;
            this.f18884e = f11;
        }

        @Override // X7.m.g
        public void b(Matrix matrix, W7.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f18882c.f18893c - this.f18884e, this.f18882c.f18892b - this.f18883d), 0.0f);
            this.f18896a.set(matrix);
            this.f18896a.preTranslate(this.f18883d, this.f18884e);
            this.f18896a.preRotate(c());
            aVar.b(canvas, this.f18896a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f18882c.f18893c - this.f18884e) / (this.f18882c.f18892b - this.f18883d)));
        }
    }

    /* compiled from: ShapePath.java */
    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
        private static final RectF f18885h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f18886b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f18887c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f18888d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f18889e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f18890f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f18891g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f18889e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f18886b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f18888d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f18890f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f18891g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f18887c;
        }

        private void p(float f10) {
            this.f18889e = f10;
        }

        private void q(float f10) {
            this.f18886b = f10;
        }

        private void r(float f10) {
            this.f18888d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f18890f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f18891g = f10;
        }

        private void u(float f10) {
            this.f18887c = f10;
        }

        @Override // X7.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f18894a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f18885h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        private float f18892b;

        /* renamed from: c, reason: collision with root package name */
        private float f18893c;

        @Override // X7.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f18894a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f18892b, this.f18893c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f18894a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    static abstract class g {

        /* renamed from: b, reason: collision with root package name */
        static final Matrix f18895b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        final Matrix f18896a = new Matrix();

        g() {
        }

        public final void a(W7.a aVar, int i10, Canvas canvas) {
            b(f18895b, aVar, i10, canvas);
        }

        public abstract void b(Matrix matrix, W7.a aVar, int i10, Canvas canvas);
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() == f10) {
            return;
        }
        float fG = ((f10 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f18876h.add(new b(dVar));
        p(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f18876h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f18873e;
    }

    private float h() {
        return this.f18874f;
    }

    private void p(float f10) {
        this.f18873e = f10;
    }

    private void q(float f10) {
        this.f18874f = f10;
    }

    private void r(float f10) {
        this.f18871c = f10;
    }

    private void s(float f10) {
        this.f18872d = f10;
    }

    private void t(float f10) {
        this.f18869a = f10;
    }

    private void u(float f10) {
        this.f18870b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f18875g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f18875g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18875g.get(i10).a(matrix, path);
        }
    }

    boolean e() {
        return this.f18877i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f18876h), new Matrix(matrix));
    }

    float i() {
        return this.f18871c;
    }

    float j() {
        return this.f18872d;
    }

    float k() {
        return this.f18869a;
    }

    float l() {
        return this.f18870b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f18892b = f10;
        eVar.f18893c = f11;
        this.f18875g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f18875g.clear();
        this.f18876h.clear();
        this.f18877i = false;
    }
}
