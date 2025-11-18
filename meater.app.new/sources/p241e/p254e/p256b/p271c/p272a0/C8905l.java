package p241e.p254e.p256b.p271c.p272a0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: ShapeAppearancePathProvider.java */
/* renamed from: e.e.b.c.a0.l */
/* loaded from: classes2.dex */
public class C8905l {

    /* renamed from: a */
    private final C8906m[] f33758a = new C8906m[4];

    /* renamed from: b */
    private final Matrix[] f33759b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f33760c = new Matrix[4];

    /* renamed from: d */
    private final PointF f33761d = new PointF();

    /* renamed from: e */
    private final Path f33762e = new Path();

    /* renamed from: f */
    private final Path f33763f = new Path();

    /* renamed from: g */
    private final C8906m f33764g = new C8906m();

    /* renamed from: h */
    private final float[] f33765h = new float[2];

    /* renamed from: i */
    private final float[] f33766i = new float[2];

    /* renamed from: j */
    private boolean f33767j = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: e.e.b.c.a0.l$a */
    public interface a {
        /* renamed from: a */
        void mo28304a(C8906m c8906m, Matrix matrix, int i2);

        /* renamed from: b */
        void mo28305b(C8906m c8906m, Matrix matrix, int i2);
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: e.e.b.c.a0.l$b */
    static final class b {

        /* renamed from: a */
        public final C8904k f33768a;

        /* renamed from: b */
        public final Path f33769b;

        /* renamed from: c */
        public final RectF f33770c;

        /* renamed from: d */
        public final a f33771d;

        /* renamed from: e */
        public final float f33772e;

        b(C8904k c8904k, float f2, RectF rectF, a aVar, Path path) {
            this.f33771d = aVar;
            this.f33768a = c8904k;
            this.f33772e = f2;
            this.f33770c = rectF;
            this.f33769b = path;
        }
    }

    public C8905l() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f33758a[i2] = new C8906m();
            this.f33759b[i2] = new Matrix();
            this.f33760c[i2] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m28368a(int i2) {
        return (i2 + 1) * 90;
    }

    /* renamed from: b */
    private void m28369b(b bVar, int i2) {
        this.f33765h[0] = this.f33758a[i2].m28397k();
        this.f33765h[1] = this.f33758a[i2].m28398l();
        this.f33759b[i2].mapPoints(this.f33765h);
        if (i2 == 0) {
            Path path = bVar.f33769b;
            float[] fArr = this.f33765h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = bVar.f33769b;
            float[] fArr2 = this.f33765h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f33758a[i2].m28392d(this.f33759b[i2], bVar.f33769b);
        a aVar = bVar.f33771d;
        if (aVar != null) {
            aVar.mo28304a(this.f33758a[i2], this.f33759b[i2], i2);
        }
    }

    /* renamed from: c */
    private void m28370c(b bVar, int i2) {
        int i3 = (i2 + 1) % 4;
        this.f33765h[0] = this.f33758a[i2].m28395i();
        this.f33765h[1] = this.f33758a[i2].m28396j();
        this.f33759b[i2].mapPoints(this.f33765h);
        this.f33766i[0] = this.f33758a[i3].m28397k();
        this.f33766i[1] = this.f33758a[i3].m28398l();
        this.f33759b[i3].mapPoints(this.f33766i);
        float f2 = this.f33765h[0];
        float[] fArr = this.f33766i;
        float fMax = Math.max(((float) Math.hypot(f2 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fM28374i = m28374i(bVar.f33770c, i2);
        this.f33764g.m28400n(0.0f, 0.0f);
        C8899f c8899fM28375j = m28375j(i2, bVar.f33768a);
        c8899fM28375j.mo23920d(fMax, fM28374i, bVar.f33772e, this.f33764g);
        Path path = new Path();
        this.f33764g.m28392d(this.f33760c[i2], path);
        if (this.f33767j && Build.VERSION.SDK_INT >= 19 && (c8899fM28375j.m28241b() || m28376k(path, i2) || m28376k(path, i3))) {
            path.op(path, this.f33763f, Path.Op.DIFFERENCE);
            this.f33765h[0] = this.f33764g.m28397k();
            this.f33765h[1] = this.f33764g.m28398l();
            this.f33760c[i2].mapPoints(this.f33765h);
            Path path2 = this.f33762e;
            float[] fArr2 = this.f33765h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f33764g.m28392d(this.f33760c[i2], this.f33762e);
        } else {
            this.f33764g.m28392d(this.f33760c[i2], bVar.f33769b);
        }
        a aVar = bVar.f33771d;
        if (aVar != null) {
            aVar.mo28305b(this.f33764g, this.f33760c[i2], i2);
        }
    }

    /* renamed from: f */
    private void m28371f(int i2, RectF rectF, PointF pointF) {
        if (i2 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i2 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i2 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: g */
    private InterfaceC8896c m28372g(int i2, C8904k c8904k) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? c8904k.m28332t() : c8904k.m28330r() : c8904k.m28323j() : c8904k.m28325l();
    }

    /* renamed from: h */
    private C8897d m28373h(int i2, C8904k c8904k) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? c8904k.m28331s() : c8904k.m28329q() : c8904k.m28322i() : c8904k.m28324k();
    }

    /* renamed from: i */
    private float m28374i(RectF rectF, int i2) {
        float[] fArr = this.f33765h;
        C8906m[] c8906mArr = this.f33758a;
        fArr[0] = c8906mArr[i2].f33775c;
        fArr[1] = c8906mArr[i2].f33776d;
        this.f33759b[i2].mapPoints(fArr);
        return (i2 == 1 || i2 == 3) ? Math.abs(rectF.centerX() - this.f33765h[0]) : Math.abs(rectF.centerY() - this.f33765h[1]);
    }

    /* renamed from: j */
    private C8899f m28375j(int i2, C8904k c8904k) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? c8904k.m28327o() : c8904k.m28328p() : c8904k.m28326n() : c8904k.m28321h();
    }

    /* renamed from: k */
    private boolean m28376k(Path path, int i2) {
        Path path2 = new Path();
        this.f33758a[i2].m28392d(this.f33759b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* renamed from: l */
    private void m28377l(b bVar, int i2) {
        m28373h(i2, bVar.f33768a).m28240b(this.f33758a[i2], 90.0f, bVar.f33772e, bVar.f33770c, m28372g(i2, bVar.f33768a));
        float fM28368a = m28368a(i2);
        this.f33759b[i2].reset();
        m28371f(i2, bVar.f33770c, this.f33761d);
        Matrix matrix = this.f33759b[i2];
        PointF pointF = this.f33761d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f33759b[i2].preRotate(fM28368a);
    }

    /* renamed from: m */
    private void m28378m(int i2) {
        this.f33765h[0] = this.f33758a[i2].m28395i();
        this.f33765h[1] = this.f33758a[i2].m28396j();
        this.f33759b[i2].mapPoints(this.f33765h);
        float fM28368a = m28368a(i2);
        this.f33760c[i2].reset();
        Matrix matrix = this.f33760c[i2];
        float[] fArr = this.f33765h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f33760c[i2].preRotate(fM28368a);
    }

    /* renamed from: d */
    public void m28379d(C8904k c8904k, float f2, RectF rectF, Path path) {
        m28380e(c8904k, f2, rectF, null, path);
    }

    /* renamed from: e */
    public void m28380e(C8904k c8904k, float f2, RectF rectF, a aVar, Path path) {
        path.rewind();
        this.f33762e.rewind();
        this.f33763f.rewind();
        this.f33763f.addRect(rectF, Path.Direction.CW);
        b bVar = new b(c8904k, f2, rectF, aVar, path);
        for (int i2 = 0; i2 < 4; i2++) {
            m28377l(bVar, i2);
            m28378m(i2);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            m28369b(bVar, i3);
            m28370c(bVar, i3);
        }
        path.close();
        this.f33762e.close();
        if (Build.VERSION.SDK_INT < 19 || this.f33762e.isEmpty()) {
            return;
        }
        path.op(this.f33762e, Path.Op.UNION);
    }
}
