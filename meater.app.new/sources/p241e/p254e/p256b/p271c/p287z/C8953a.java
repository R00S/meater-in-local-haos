package p241e.p254e.p256b.p271c.p287z;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p024c.p052i.p053e.C0923a;

/* compiled from: ShadowRenderer.java */
/* renamed from: e.e.b.c.z.a */
/* loaded from: classes2.dex */
public class C8953a {

    /* renamed from: a */
    private static final int[] f34462a = new int[3];

    /* renamed from: b */
    private static final float[] f34463b = {0.0f, 0.5f, 1.0f};

    /* renamed from: c */
    private static final int[] f34464c = new int[4];

    /* renamed from: d */
    private static final float[] f34465d = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: e */
    private final Paint f34466e;

    /* renamed from: f */
    private final Paint f34467f;

    /* renamed from: g */
    private final Paint f34468g;

    /* renamed from: h */
    private int f34469h;

    /* renamed from: i */
    private int f34470i;

    /* renamed from: j */
    private int f34471j;

    /* renamed from: k */
    private final Path f34472k;

    /* renamed from: l */
    private Paint f34473l;

    public C8953a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void m28524a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f2, float f3) {
        boolean z = f3 < 0.0f;
        Path path = this.f34472k;
        if (z) {
            int[] iArr = f34464c;
            iArr[0] = 0;
            iArr[1] = this.f34471j;
            iArr[2] = this.f34470i;
            iArr[3] = this.f34469h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i2;
            rectF.inset(f4, f4);
            int[] iArr2 = f34464c;
            iArr2[0] = 0;
            iArr2[1] = this.f34469h;
            iArr2[2] = this.f34470i;
            iArr2[3] = this.f34471j;
        }
        float fWidth = 1.0f - (i2 / (rectF.width() / 2.0f));
        float[] fArr = f34465d;
        fArr[1] = fWidth;
        fArr[2] = ((1.0f - fWidth) / 2.0f) + fWidth;
        this.f34467f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f34464c, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f34473l);
        }
        canvas.drawArc(rectF, f2, f3, true, this.f34467f);
        canvas.restore();
    }

    /* renamed from: b */
    public void m28525b(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = f34462a;
        iArr[0] = this.f34471j;
        iArr[1] = this.f34470i;
        iArr[2] = this.f34469h;
        Paint paint = this.f34468g;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, f34463b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f34468g);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint m28526c() {
        return this.f34466e;
    }

    /* renamed from: d */
    public void m28527d(int i2) {
        this.f34469h = C0923a.m5887o(i2, 68);
        this.f34470i = C0923a.m5887o(i2, 20);
        this.f34471j = C0923a.m5887o(i2, 0);
        this.f34466e.setColor(this.f34469h);
    }

    public C8953a(int i2) {
        this.f34472k = new Path();
        this.f34473l = new Paint();
        this.f34466e = new Paint();
        m28527d(i2);
        this.f34473l.setColor(0);
        Paint paint = new Paint(4);
        this.f34467f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f34468g = new Paint(paint);
    }
}
