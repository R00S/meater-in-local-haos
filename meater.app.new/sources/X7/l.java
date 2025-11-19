package X7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final m[] f18851a = new m[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f18852b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f18853c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f18854d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f18855e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f18856f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final m f18857g = new m();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f18858h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f18859i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f18860j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f18861k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f18862l = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final l f18863a = new l();
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final k f18864a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f18865b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f18866c;

        /* renamed from: d, reason: collision with root package name */
        public final b f18867d;

        /* renamed from: e, reason: collision with root package name */
        public final float f18868e;

        c(k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f18867d = bVar;
            this.f18864a = kVar;
            this.f18868e = f10;
            this.f18866c = rectF;
            this.f18865b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f18851a[i10] = new m();
            this.f18852b[i10] = new Matrix();
            this.f18853c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(c cVar, int i10) {
        this.f18858h[0] = this.f18851a[i10].k();
        this.f18858h[1] = this.f18851a[i10].l();
        this.f18852b[i10].mapPoints(this.f18858h);
        if (i10 == 0) {
            Path path = cVar.f18865b;
            float[] fArr = this.f18858h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f18865b;
            float[] fArr2 = this.f18858h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f18851a[i10].d(this.f18852b[i10], cVar.f18865b);
        b bVar = cVar.f18867d;
        if (bVar != null) {
            bVar.b(this.f18851a[i10], this.f18852b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f18858h[0] = this.f18851a[i10].i();
        this.f18858h[1] = this.f18851a[i10].j();
        this.f18852b[i10].mapPoints(this.f18858h);
        this.f18859i[0] = this.f18851a[i11].k();
        this.f18859i[1] = this.f18851a[i11].l();
        this.f18852b[i11].mapPoints(this.f18859i);
        float f10 = this.f18858h[0];
        float[] fArr = this.f18859i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f18866c, i10);
        this.f18857g.n(0.0f, 0.0f);
        f fVarJ = j(i10, cVar.f18864a);
        fVarJ.c(fMax, fI, cVar.f18868e, this.f18857g);
        this.f18860j.reset();
        this.f18857g.d(this.f18853c[i10], this.f18860j);
        if (this.f18862l && (fVarJ.b() || l(this.f18860j, i10) || l(this.f18860j, i11))) {
            Path path = this.f18860j;
            path.op(path, this.f18856f, Path.Op.DIFFERENCE);
            this.f18858h[0] = this.f18857g.k();
            this.f18858h[1] = this.f18857g.l();
            this.f18853c[i10].mapPoints(this.f18858h);
            Path path2 = this.f18855e;
            float[] fArr2 = this.f18858h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f18857g.d(this.f18853c[i10], this.f18855e);
        } else {
            this.f18857g.d(this.f18853c[i10], cVar.f18865b);
        }
        b bVar = cVar.f18867d;
        if (bVar != null) {
            bVar.a(this.f18857g, this.f18853c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private X7.c g(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    private d h(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f18858h;
        m mVar = this.f18851a[i10];
        fArr[0] = mVar.f18871c;
        fArr[1] = mVar.f18872d;
        this.f18852b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f18858h[0]) : Math.abs(rectF.centerY() - this.f18858h[1]);
    }

    private f j(int i10, k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public static l k() {
        return a.f18863a;
    }

    private boolean l(Path path, int i10) {
        this.f18861k.reset();
        this.f18851a[i10].d(this.f18852b[i10], this.f18861k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f18861k.computeBounds(rectF, true);
        path.op(this.f18861k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f18864a).b(this.f18851a[i10], 90.0f, cVar.f18868e, cVar.f18866c, g(i10, cVar.f18864a));
        float fA = a(i10);
        this.f18852b[i10].reset();
        f(i10, cVar.f18866c, this.f18854d);
        Matrix matrix = this.f18852b[i10];
        PointF pointF = this.f18854d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f18852b[i10].preRotate(fA);
    }

    private void n(int i10) {
        this.f18858h[0] = this.f18851a[i10].i();
        this.f18858h[1] = this.f18851a[i10].j();
        this.f18852b[i10].mapPoints(this.f18858h);
        float fA = a(i10);
        this.f18853c[i10].reset();
        Matrix matrix = this.f18853c[i10];
        float[] fArr = this.f18858h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f18853c[i10].preRotate(fA);
    }

    public void d(k kVar, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f18855e.rewind();
        this.f18856f.rewind();
        this.f18856f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f18855e.close();
        if (this.f18855e.isEmpty()) {
            return;
        }
        path.op(this.f18855e, Path.Op.UNION);
    }

    public void e(k kVar, float f10, RectF rectF, Path path) {
        d(kVar, f10, rectF, null, path);
    }
}
