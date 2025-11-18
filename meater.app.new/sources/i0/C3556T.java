package i0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import h0.C3470a;
import h0.C3476g;
import h0.C3478i;
import h0.C3480k;
import i0.R0;
import i0.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: AndroidPath.android.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ/\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J/\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0019J/\u0010 \u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0019J?\u0010#\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010$J?\u0010'\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010$J\u001f\u0010*\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b.\u0010/J\"\u00103\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00012\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u00106J\u001a\u00109\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010<J*\u0010B\u001a\u00020A2\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010@\u001a\u00020?H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010D\u001a\u0004\b\f\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010NR*\u0010V\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010Z\u001a\u00020A8VX\u0096\u0004¢\u0006\f\u0012\u0004\bY\u00106\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Li0/T;", "Li0/R0;", "Landroid/graphics/Path;", "internalPath", "<init>", "(Landroid/graphics/Path;)V", "Lh0/i;", "rect", "Loa/F;", "y", "(Lh0/i;)V", "", "x", "p", "(FF)V", "dx", "dy", "g", "w", "u", "x1", "y1", "x2", "y2", "i", "(FFFF)V", "m", "dx1", "dy1", "dx2", "dy2", "j", "a", "x3", "y3", "q", "(FFFFFF)V", "dx3", "dy3", "h", "Li0/R0$b;", "direction", "s", "(Lh0/i;Li0/R0$b;)V", "Lh0/k;", "roundRect", "e", "(Lh0/k;Li0/R0$b;)V", "path", "Lh0/g;", "offset", "d", "(Li0/R0;J)V", "close", "()V", "b", "r", "t", "(J)V", "getBounds", "()Lh0/i;", "path1", "path2", "Li0/V0;", "operation", "", "o", "(Li0/R0;Li0/R0;I)Z", "Landroid/graphics/Path;", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", "c", "Landroid/graphics/RectF;", "rectF", "", "[F", "radii", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mMatrix", "Li0/T0;", "value", "n", "()I", "l", "(I)V", "fillType", "f", "()Z", "isConvex$annotations", "isConvex", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3556T implements R0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Path internalPath;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private RectF rectF;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float[] radii;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Matrix mMatrix;

    public C3556T() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void y(C3478i rect) {
        if (Float.isNaN(rect.getLeft()) || Float.isNaN(rect.getTop()) || Float.isNaN(rect.getRight()) || Float.isNaN(rect.getBottom())) {
            C3561Y.d("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // i0.R0
    public void a(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // i0.R0
    public void b() {
        this.internalPath.reset();
    }

    @Override // i0.R0
    public void close() {
        this.internalPath.close();
    }

    @Override // i0.R0
    public void d(R0 path, long offset) {
        Path path2 = this.internalPath;
        if (!(path instanceof C3556T)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.addPath(((C3556T) path).getInternalPath(), C3476g.m(offset), C3476g.n(offset));
    }

    @Override // i0.R0
    public void e(C3480k roundRect, R0.b direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        C3862t.d(rectF);
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        C3862t.d(fArr);
        fArr[0] = C3470a.d(roundRect.getTopLeftCornerRadius());
        fArr[1] = C3470a.e(roundRect.getTopLeftCornerRadius());
        fArr[2] = C3470a.d(roundRect.getTopRightCornerRadius());
        fArr[3] = C3470a.e(roundRect.getTopRightCornerRadius());
        fArr[4] = C3470a.d(roundRect.getBottomRightCornerRadius());
        fArr[5] = C3470a.e(roundRect.getBottomRightCornerRadius());
        fArr[6] = C3470a.d(roundRect.getBottomLeftCornerRadius());
        fArr[7] = C3470a.e(roundRect.getBottomLeftCornerRadius());
        Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        C3862t.d(rectF2);
        float[] fArr2 = this.radii;
        C3862t.d(fArr2);
        path.addRoundRect(rectF2, fArr2, C3561Y.e(direction));
    }

    @Override // i0.R0
    public boolean f() {
        return this.internalPath.isConvex();
    }

    @Override // i0.R0
    public void g(float dx, float dy) {
        this.internalPath.rMoveTo(dx, dy);
    }

    @Override // i0.R0
    public C3478i getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        C3862t.d(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new C3478i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // i0.R0
    public void h(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this.internalPath.rCubicTo(dx1, dy1, dx2, dy2, dx3, dy3);
    }

    @Override // i0.R0
    public void i(float x12, float y12, float x22, float y22) {
        this.internalPath.quadTo(x12, y12, x22, y22);
    }

    @Override // i0.R0
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // i0.R0
    public void j(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // i0.R0
    public void l(int i10) {
        this.internalPath.setFillType(T0.d(i10, T0.INSTANCE.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // i0.R0
    public void m(float x12, float y12, float x22, float y22) {
        this.internalPath.quadTo(x12, y12, x22, y22);
    }

    @Override // i0.R0
    public int n() {
        return this.internalPath.getFillType() == Path.FillType.EVEN_ODD ? T0.INSTANCE.a() : T0.INSTANCE.b();
    }

    @Override // i0.R0
    public boolean o(R0 path1, R0 path2, int operation) {
        V0.Companion companion = V0.INSTANCE;
        Path.Op op = V0.f(operation, companion.a()) ? Path.Op.DIFFERENCE : V0.f(operation, companion.b()) ? Path.Op.INTERSECT : V0.f(operation, companion.c()) ? Path.Op.REVERSE_DIFFERENCE : V0.f(operation, companion.d()) ? Path.Op.UNION : Path.Op.XOR;
        Path path = this.internalPath;
        if (!(path1 instanceof C3556T)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path internalPath = ((C3556T) path1).getInternalPath();
        if (path2 instanceof C3556T) {
            return path.op(internalPath, ((C3556T) path2).getInternalPath(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // i0.R0
    public void p(float x10, float y10) {
        this.internalPath.moveTo(x10, y10);
    }

    @Override // i0.R0
    public void q(float x12, float y12, float x22, float y22, float x32, float y32) {
        this.internalPath.cubicTo(x12, y12, x22, y22, x32, y32);
    }

    @Override // i0.R0
    public void r() {
        this.internalPath.rewind();
    }

    @Override // i0.R0
    public void s(C3478i rect, R0.b direction) {
        y(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        C3862t.d(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        C3862t.d(rectF2);
        path.addRect(rectF2, C3561Y.e(direction));
    }

    @Override // i0.R0
    public void t(long offset) {
        Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new Matrix();
        } else {
            C3862t.d(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.mMatrix;
        C3862t.d(matrix2);
        matrix2.setTranslate(C3476g.m(offset), C3476g.n(offset));
        Path path = this.internalPath;
        Matrix matrix3 = this.mMatrix;
        C3862t.d(matrix3);
        path.transform(matrix3);
    }

    @Override // i0.R0
    public void u(float dx, float dy) {
        this.internalPath.rLineTo(dx, dy);
    }

    @Override // i0.R0
    public void w(float x10, float y10) {
        this.internalPath.lineTo(x10, y10);
    }

    /* renamed from: x, reason: from getter */
    public final Path getInternalPath() {
        return this.internalPath;
    }

    public C3556T(Path path) {
        this.internalPath = path;
    }

    public /* synthetic */ C3556T(Path path, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? new Path() : path);
    }
}
