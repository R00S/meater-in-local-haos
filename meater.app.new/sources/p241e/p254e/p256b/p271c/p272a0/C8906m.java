package p241e.p254e.p256b.p271c.p272a0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p241e.p254e.p256b.p271c.p287z.C8953a;

/* compiled from: ShapePath.java */
/* renamed from: e.e.b.c.a0.m */
/* loaded from: classes2.dex */
public class C8906m {

    /* renamed from: a */
    @Deprecated
    public float f33773a;

    /* renamed from: b */
    @Deprecated
    public float f33774b;

    /* renamed from: c */
    @Deprecated
    public float f33775c;

    /* renamed from: d */
    @Deprecated
    public float f33776d;

    /* renamed from: e */
    @Deprecated
    public float f33777e;

    /* renamed from: f */
    @Deprecated
    public float f33778f;

    /* renamed from: g */
    private final List<f> f33779g = new ArrayList();

    /* renamed from: h */
    private final List<g> f33780h = new ArrayList();

    /* renamed from: i */
    private boolean f33781i;

    /* compiled from: ShapePath.java */
    /* renamed from: e.e.b.c.a0.m$a */
    class a extends g {

        /* renamed from: b */
        final /* synthetic */ List f33782b;

        /* renamed from: c */
        final /* synthetic */ Matrix f33783c;

        a(List list, Matrix matrix) {
            this.f33782b = list;
            this.f33783c = matrix;
        }

        @Override // p241e.p254e.p256b.p271c.p272a0.C8906m.g
        /* renamed from: a */
        public void mo28402a(Matrix matrix, C8953a c8953a, int i2, Canvas canvas) {
            Iterator it = this.f33782b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).mo28402a(this.f33783c, c8953a, i2, canvas);
            }
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: e.e.b.c.a0.m$b */
    static class b extends g {

        /* renamed from: b */
        private final d f33785b;

        public b(d dVar) {
            this.f33785b = dVar;
        }

        @Override // p241e.p254e.p256b.p271c.p272a0.C8906m.g
        /* renamed from: a */
        public void mo28402a(Matrix matrix, C8953a c8953a, int i2, Canvas canvas) {
            c8953a.m28524a(canvas, matrix, new RectF(this.f33785b.m28413k(), this.f33785b.m28417o(), this.f33785b.m28414l(), this.f33785b.m28412j()), i2, this.f33785b.m28415m(), this.f33785b.m28416n());
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: e.e.b.c.a0.m$c */
    static class c extends g {

        /* renamed from: b */
        private final e f33786b;

        /* renamed from: c */
        private final float f33787c;

        /* renamed from: d */
        private final float f33788d;

        public c(e eVar, float f2, float f3) {
            this.f33786b = eVar;
            this.f33787c = f2;
            this.f33788d = f3;
        }

        @Override // p241e.p254e.p256b.p271c.p272a0.C8906m.g
        /* renamed from: a */
        public void mo28402a(Matrix matrix, C8953a c8953a, int i2, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f33786b.f33797c - this.f33788d, this.f33786b.f33796b - this.f33787c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f33787c, this.f33788d);
            matrix2.preRotate(m28403c());
            c8953a.m28525b(canvas, matrix2, rectF, i2);
        }

        /* renamed from: c */
        float m28403c() {
            return (float) Math.toDegrees(Math.atan((this.f33786b.f33797c - this.f33788d) / (this.f33786b.f33796b - this.f33787c)));
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: e.e.b.c.a0.m$d */
    public static class d extends f {

        /* renamed from: b */
        private static final RectF f33789b = new RectF();

        /* renamed from: c */
        @Deprecated
        public float f33790c;

        /* renamed from: d */
        @Deprecated
        public float f33791d;

        /* renamed from: e */
        @Deprecated
        public float f33792e;

        /* renamed from: f */
        @Deprecated
        public float f33793f;

        /* renamed from: g */
        @Deprecated
        public float f33794g;

        /* renamed from: h */
        @Deprecated
        public float f33795h;

        public d(float f2, float f3, float f4, float f5) {
            m28419q(f2);
            m28423u(f3);
            m28420r(f4);
            m28418p(f5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public float m28412j() {
            return this.f33793f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public float m28413k() {
            return this.f33790c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public float m28414l() {
            return this.f33792e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public float m28415m() {
            return this.f33794g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public float m28416n() {
            return this.f33795h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public float m28417o() {
            return this.f33791d;
        }

        /* renamed from: p */
        private void m28418p(float f2) {
            this.f33793f = f2;
        }

        /* renamed from: q */
        private void m28419q(float f2) {
            this.f33790c = f2;
        }

        /* renamed from: r */
        private void m28420r(float f2) {
            this.f33792e = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public void m28421s(float f2) {
            this.f33794g = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public void m28422t(float f2) {
            this.f33795h = f2;
        }

        /* renamed from: u */
        private void m28423u(float f2) {
            this.f33791d = f2;
        }

        @Override // p241e.p254e.p256b.p271c.p272a0.C8906m.f
        /* renamed from: a */
        public void mo28424a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f33798a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f33789b;
            rectF.set(m28413k(), m28417o(), m28414l(), m28412j());
            path.arcTo(rectF, m28415m(), m28416n(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: e.e.b.c.a0.m$e */
    public static class e extends f {

        /* renamed from: b */
        private float f33796b;

        /* renamed from: c */
        private float f33797c;

        @Override // p241e.p254e.p256b.p271c.p272a0.C8906m.f
        /* renamed from: a */
        public void mo28424a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f33798a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f33796b, this.f33797c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: e.e.b.c.a0.m$f */
    public static abstract class f {

        /* renamed from: a */
        protected final Matrix f33798a = new Matrix();

        /* renamed from: a */
        public abstract void mo28424a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    /* renamed from: e.e.b.c.a0.m$g */
    static abstract class g {

        /* renamed from: a */
        static final Matrix f33799a = new Matrix();

        g() {
        }

        /* renamed from: a */
        public abstract void mo28402a(Matrix matrix, C8953a c8953a, int i2, Canvas canvas);

        /* renamed from: b */
        public final void m28429b(C8953a c8953a, int i2, Canvas canvas) {
            mo28402a(f33799a, c8953a, i2, canvas);
        }
    }

    public C8906m() {
        m28400n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m28381b(float f2) {
        if (m28383g() == f2) {
            return;
        }
        float fM28383g = ((f2 - m28383g()) + 360.0f) % 360.0f;
        if (fM28383g > 180.0f) {
            return;
        }
        d dVar = new d(m28395i(), m28396j(), m28395i(), m28396j());
        dVar.m28421s(m28383g());
        dVar.m28422t(fM28383g);
        this.f33780h.add(new b(dVar));
        m28385p(f2);
    }

    /* renamed from: c */
    private void m28382c(g gVar, float f2, float f3) {
        m28381b(f2);
        this.f33780h.add(gVar);
        m28385p(f3);
    }

    /* renamed from: g */
    private float m28383g() {
        return this.f33777e;
    }

    /* renamed from: h */
    private float m28384h() {
        return this.f33778f;
    }

    /* renamed from: p */
    private void m28385p(float f2) {
        this.f33777e = f2;
    }

    /* renamed from: q */
    private void m28386q(float f2) {
        this.f33778f = f2;
    }

    /* renamed from: r */
    private void m28387r(float f2) {
        this.f33775c = f2;
    }

    /* renamed from: s */
    private void m28388s(float f2) {
        this.f33776d = f2;
    }

    /* renamed from: t */
    private void m28389t(float f2) {
        this.f33773a = f2;
    }

    /* renamed from: u */
    private void m28390u(float f2) {
        this.f33774b = f2;
    }

    /* renamed from: a */
    public void m28391a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.m28421s(f6);
        dVar.m28422t(f7);
        this.f33779g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        m28382c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        m28387r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        m28388s(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    /* renamed from: d */
    public void m28392d(Matrix matrix, Path path) {
        int size = this.f33779g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f33779g.get(i2).mo28424a(matrix, path);
        }
    }

    /* renamed from: e */
    boolean m28393e() {
        return this.f33781i;
    }

    /* renamed from: f */
    g m28394f(Matrix matrix) {
        m28381b(m28384h());
        return new a(new ArrayList(this.f33780h), matrix);
    }

    /* renamed from: i */
    float m28395i() {
        return this.f33775c;
    }

    /* renamed from: j */
    float m28396j() {
        return this.f33776d;
    }

    /* renamed from: k */
    float m28397k() {
        return this.f33773a;
    }

    /* renamed from: l */
    float m28398l() {
        return this.f33774b;
    }

    /* renamed from: m */
    public void m28399m(float f2, float f3) {
        e eVar = new e();
        eVar.f33796b = f2;
        eVar.f33797c = f3;
        this.f33779g.add(eVar);
        c cVar = new c(eVar, m28395i(), m28396j());
        m28382c(cVar, cVar.m28403c() + 270.0f, cVar.m28403c() + 270.0f);
        m28387r(f2);
        m28388s(f3);
    }

    /* renamed from: n */
    public void m28400n(float f2, float f3) {
        m28401o(f2, f3, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void m28401o(float f2, float f3, float f4, float f5) {
        m28389t(f2);
        m28390u(f3);
        m28387r(f2);
        m28388s(f3);
        m28385p(f4);
        m28386q((f4 + f5) % 360.0f);
        this.f33779g.clear();
        this.f33780h.clear();
        this.f33781i = false;
    }
}
