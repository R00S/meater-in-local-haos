package na;

import C9.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import java.security.MessageDigest;
import m6.InterfaceC3970e;
import p6.InterfaceC4239d;

/* compiled from: RoundedCornersTransformation.java */
/* loaded from: classes2.dex */
public class b extends AbstractC4074a {

    /* renamed from: b, reason: collision with root package name */
    private final int f45770b;

    /* renamed from: c, reason: collision with root package name */
    private final int f45771c;

    /* renamed from: d, reason: collision with root package name */
    private final int f45772d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC0624b f45773e;

    /* compiled from: RoundedCornersTransformation.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45774a;

        static {
            int[] iArr = new int[EnumC0624b.values().length];
            f45774a = iArr;
            try {
                iArr[EnumC0624b.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45774a[EnumC0624b.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45774a[EnumC0624b.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45774a[EnumC0624b.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45774a[EnumC0624b.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45774a[EnumC0624b.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45774a[EnumC0624b.BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45774a[EnumC0624b.LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45774a[EnumC0624b.RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45774a[EnumC0624b.OTHER_TOP_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45774a[EnumC0624b.OTHER_TOP_RIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45774a[EnumC0624b.OTHER_BOTTOM_LEFT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f45774a[EnumC0624b.OTHER_BOTTOM_RIGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f45774a[EnumC0624b.DIAGONAL_FROM_TOP_LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f45774a[EnumC0624b.DIAGONAL_FROM_TOP_RIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* compiled from: RoundedCornersTransformation.java */
    /* renamed from: na.b$b, reason: collision with other inner class name */
    public enum EnumC0624b {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    public b(int i10, int i11, EnumC0624b enumC0624b) {
        this.f45770b = i10;
        this.f45771c = i10 * 2;
        this.f45772d = i11;
        this.f45773e = enumC0624b;
    }

    private void e(Canvas canvas, Paint paint, float f10, float f11) {
        RectF rectF = new RectF(this.f45772d, f11 - this.f45771c, r1 + r3, f11);
        int i10 = this.f45770b;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        int i11 = this.f45772d;
        canvas.drawRect(new RectF(i11, i11, i11 + this.f45771c, f11 - this.f45770b), paint);
        canvas.drawRect(new RectF(this.f45770b + r1, this.f45772d, f10, f11), paint);
    }

    private void f(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f45771c;
        RectF rectF = new RectF(f10 - i10, f11 - i10, f10, f11);
        int i11 = this.f45770b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        int i12 = this.f45772d;
        canvas.drawRect(new RectF(i12, i12, f10 - this.f45770b, f11), paint);
        int i13 = this.f45770b;
        canvas.drawRect(new RectF(f10 - i13, this.f45772d, f10, f11 - i13), paint);
    }

    private void g(Canvas canvas, Paint paint, float f10, float f11) {
        RectF rectF = new RectF(this.f45772d, f11 - this.f45771c, f10, f11);
        int i10 = this.f45770b;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        int i11 = this.f45772d;
        canvas.drawRect(new RectF(i11, i11, f10, f11 - this.f45770b), paint);
    }

    private void h(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f45772d;
        int i11 = this.f45771c;
        RectF rectF = new RectF(i10, i10, i10 + i11, i10 + i11);
        int i12 = this.f45770b;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        int i13 = this.f45771c;
        RectF rectF2 = new RectF(f10 - i13, f11 - i13, f10, f11);
        int i14 = this.f45770b;
        canvas.drawRoundRect(rectF2, i14, i14, paint);
        canvas.drawRect(new RectF(this.f45772d, r1 + r3, f10 - this.f45770b, f11), paint);
        canvas.drawRect(new RectF(r1 + r2, this.f45772d, f10, f11 - this.f45770b), paint);
    }

    private void i(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f45771c;
        RectF rectF = new RectF(f10 - i10, this.f45772d, f10, r3 + i10);
        int i11 = this.f45770b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        RectF rectF2 = new RectF(this.f45772d, f11 - this.f45771c, r1 + r3, f11);
        int i12 = this.f45770b;
        canvas.drawRoundRect(rectF2, i12, i12, paint);
        int i13 = this.f45772d;
        int i14 = this.f45770b;
        canvas.drawRect(new RectF(i13, i13, f10 - i14, f11 - i14), paint);
        int i15 = this.f45772d;
        int i16 = this.f45770b;
        canvas.drawRect(new RectF(i15 + i16, i15 + i16, f10, f11), paint);
    }

    private void j(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f45772d;
        RectF rectF = new RectF(i10, i10, i10 + this.f45771c, f11);
        int i11 = this.f45770b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        canvas.drawRect(new RectF(this.f45770b + r1, this.f45772d, f10, f11), paint);
    }

    private void k(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f45772d;
        RectF rectF = new RectF(i10, i10, f10, i10 + this.f45771c);
        int i11 = this.f45770b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        RectF rectF2 = new RectF(f10 - this.f45771c, this.f45772d, f10, f11);
        int i12 = this.f45770b;
        canvas.drawRoundRect(rectF2, i12, i12, paint);
        canvas.drawRect(new RectF(this.f45772d, r1 + r3, f10 - this.f45770b, f11), paint);
    }

    private void l(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f45772d;
        RectF rectF = new RectF(i10, i10, f10, i10 + this.f45771c);
        int i11 = this.f45770b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        int i12 = this.f45772d;
        RectF rectF2 = new RectF(i12, i12, i12 + this.f45771c, f11);
        int i13 = this.f45770b;
        canvas.drawRoundRect(rectF2, i13, i13, paint);
        int i14 = this.f45772d;
        int i15 = this.f45770b;
        canvas.drawRect(new RectF(i14 + i15, i14 + i15, f10, f11), paint);
    }

    private void m(Canvas canvas, Paint paint, float f10, float f11) {
        RectF rectF = new RectF(this.f45772d, f11 - this.f45771c, f10, f11);
        int i10 = this.f45770b;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        RectF rectF2 = new RectF(f10 - this.f45771c, this.f45772d, f10, f11);
        int i11 = this.f45770b;
        canvas.drawRoundRect(rectF2, i11, i11, paint);
        int i12 = this.f45772d;
        int i13 = this.f45770b;
        canvas.drawRect(new RectF(i12, i12, f10 - i13, f11 - i13), paint);
    }

    private void n(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f45772d;
        RectF rectF = new RectF(i10, i10, i10 + this.f45771c, f11);
        int i11 = this.f45770b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        RectF rectF2 = new RectF(this.f45772d, f11 - this.f45771c, f10, f11);
        int i12 = this.f45770b;
        canvas.drawRoundRect(rectF2, i12, i12, paint);
        canvas.drawRect(new RectF(r1 + r2, this.f45772d, f10, f11 - this.f45770b), paint);
    }

    private void o(Canvas canvas, Paint paint, float f10, float f11) {
        RectF rectF = new RectF(f10 - this.f45771c, this.f45772d, f10, f11);
        int i10 = this.f45770b;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        int i11 = this.f45772d;
        canvas.drawRect(new RectF(i11, i11, f10 - this.f45770b, f11), paint);
    }

    private void p(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f45772d;
        float f12 = f10 - i10;
        float f13 = f11 - i10;
        switch (a.f45774a[this.f45773e.ordinal()]) {
            case 1:
                int i11 = this.f45772d;
                RectF rectF = new RectF(i11, i11, f12, f13);
                int i12 = this.f45770b;
                canvas.drawRoundRect(rectF, i12, i12, paint);
                break;
            case 2:
                q(canvas, paint, f12, f13);
                break;
            case 3:
                r(canvas, paint, f12, f13);
                break;
            case 4:
                e(canvas, paint, f12, f13);
                break;
            case 5:
                f(canvas, paint, f12, f13);
                break;
            case 6:
                s(canvas, paint, f12, f13);
                break;
            case 7:
                g(canvas, paint, f12, f13);
                break;
            case 8:
                j(canvas, paint, f12, f13);
                break;
            case 9:
                o(canvas, paint, f12, f13);
                break;
            case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                m(canvas, paint, f12, f13);
                break;
            case h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                n(canvas, paint, f12, f13);
                break;
            case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                k(canvas, paint, f12, f13);
                break;
            case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l(canvas, paint, f12, f13);
                break;
            case 14:
                h(canvas, paint, f12, f13);
                break;
            case 15:
                i(canvas, paint, f12, f13);
                break;
            default:
                int i13 = this.f45772d;
                RectF rectF2 = new RectF(i13, i13, f12, f13);
                int i14 = this.f45770b;
                canvas.drawRoundRect(rectF2, i14, i14, paint);
                break;
        }
    }

    private void q(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f45772d;
        int i11 = this.f45771c;
        RectF rectF = new RectF(i10, i10, i10 + i11, i10 + i11);
        int i12 = this.f45770b;
        canvas.drawRoundRect(rectF, i12, i12, paint);
        int i13 = this.f45772d;
        int i14 = this.f45770b;
        canvas.drawRect(new RectF(i13, i13 + i14, i13 + i14, f11), paint);
        canvas.drawRect(new RectF(this.f45770b + r1, this.f45772d, f10, f11), paint);
    }

    private void r(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f45771c;
        RectF rectF = new RectF(f10 - i10, this.f45772d, f10, r3 + i10);
        int i11 = this.f45770b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        int i12 = this.f45772d;
        canvas.drawRect(new RectF(i12, i12, f10 - this.f45770b, f11), paint);
        canvas.drawRect(new RectF(f10 - this.f45770b, this.f45772d + r1, f10, f11), paint);
    }

    private void s(Canvas canvas, Paint paint, float f10, float f11) {
        int i10 = this.f45772d;
        RectF rectF = new RectF(i10, i10, f10, i10 + this.f45771c);
        int i11 = this.f45770b;
        canvas.drawRoundRect(rectF, i11, i11, paint);
        canvas.drawRect(new RectF(this.f45772d, r1 + this.f45770b, f10, f11), paint);
    }

    @Override // m6.InterfaceC3970e
    public void b(MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.RoundedCornersTransformation.1" + this.f45770b + this.f45771c + this.f45772d + this.f45773e).getBytes(InterfaceC3970e.f45117a));
    }

    @Override // na.AbstractC4074a
    protected Bitmap d(Context context, InterfaceC4239d interfaceC4239d, Bitmap bitmap, int i10, int i11) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapD = interfaceC4239d.d(width, height, Bitmap.Config.ARGB_8888);
        bitmapD.setHasAlpha(true);
        c(bitmap, bitmapD);
        Canvas canvas = new Canvas(bitmapD);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        p(canvas, paint, width, height);
        return bitmapD;
    }

    @Override // m6.InterfaceC3970e
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.f45770b == this.f45770b && bVar.f45771c == this.f45771c && bVar.f45772d == this.f45772d && bVar.f45773e == this.f45773e) {
                return true;
            }
        }
        return false;
    }

    @Override // m6.InterfaceC3970e
    public int hashCode() {
        return 425235636 + (this.f45770b * 10000) + (this.f45771c * 1000) + (this.f45772d * 100) + (this.f45773e.ordinal() * 10);
    }

    public String toString() {
        return "RoundedTransformation(radius=" + this.f45770b + ", margin=" + this.f45772d + ", diameter=" + this.f45771c + ", cornerType=" + this.f45773e.name() + ")";
    }
}
