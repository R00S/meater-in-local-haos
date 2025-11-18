package W7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import j1.C3718c;

/* compiled from: ShadowRenderer.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f18443i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f18444j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f18445k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f18446l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f18447a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f18448b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f18449c;

    /* renamed from: d, reason: collision with root package name */
    private int f18450d;

    /* renamed from: e, reason: collision with root package name */
    private int f18451e;

    /* renamed from: f, reason: collision with root package name */
    private int f18452f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f18453g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f18454h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10 = f11 < 0.0f;
        Path path = this.f18453g;
        if (z10) {
            int[] iArr = f18445k;
            iArr[0] = 0;
            iArr[1] = this.f18452f;
            iArr[2] = this.f18451e;
            iArr[3] = this.f18450d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            int[] iArr2 = f18445k;
            iArr2[0] = 0;
            iArr2[1] = this.f18450d;
            iArr2[2] = this.f18451e;
            iArr2[3] = this.f18452f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / fWidth);
        float[] fArr = f18446l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        this.f18448b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f18445k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f18454h);
        }
        canvas.drawArc(rectF, f10, f11, true, this.f18448b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f18443i;
        iArr[0] = this.f18452f;
        iArr[1] = this.f18451e;
        iArr[2] = this.f18450d;
        Paint paint = this.f18449c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f18444j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f18449c);
        canvas.restore();
    }

    public Paint c() {
        return this.f18447a;
    }

    public void d(int i10) {
        this.f18450d = C3718c.k(i10, 68);
        this.f18451e = C3718c.k(i10, 20);
        this.f18452f = C3718c.k(i10, 0);
        this.f18447a.setColor(this.f18450d);
    }

    public a(int i10) {
        this.f18453g = new Path();
        Paint paint = new Paint();
        this.f18454h = paint;
        this.f18447a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f18448b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f18449c = new Paint(paint2);
    }
}
