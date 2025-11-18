package cm.aptoide.p092pt.networking.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.load.p131o.p132c.AbstractC5484e;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class ShadowCircleTransformation extends AbstractC5484e {

    /* renamed from: ID */
    private static final String f10320ID = "cm.aptoide.pt.networking.image.ShadowCircleTransformation";
    private static final byte[] ID_BYTES = f10320ID.getBytes(InterfaceC5423f.f13555a);
    private final int shadowColor;
    private final float spaceBetween;
    private final float strokeSize;

    public ShadowCircleTransformation(Context context, View view) {
        view.setLayerType(1, null);
        this.shadowColor = -1;
        this.strokeSize = 0.08f;
        this.spaceBetween = 0.0f;
    }

    private Bitmap circleCrop(InterfaceC5413e interfaceC5413e, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iMin) / 2, (bitmap.getHeight() - iMin) / 2, iMin, iMin);
        Bitmap bitmapMo10388d = interfaceC5413e.mo10388d(iMin, iMin, Bitmap.Config.ARGB_8888);
        if (bitmapMo10388d == null) {
            bitmapMo10388d = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmapMo10388d);
        float f2 = iMin;
        float f3 = f2 / 2.0f;
        Paint paint = new Paint();
        paint.setColor(this.shadowColor);
        paint.setStyle(Paint.Style.FILL);
        float f4 = 0.02f * f2;
        paint.setShadowLayer(f4, 0.0f, 0.0f, -7829368);
        paint.setAntiAlias(true);
        float f5 = f3 - f4;
        canvas.drawCircle(f3, f3, f5, paint);
        paint.setColor(-1);
        canvas.drawCircle(f3, f3, f5 * this.spaceBetween, paint);
        Paint paint2 = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        paint2.setAntiAlias(true);
        canvas.drawCircle(f3, f3, f3 - (f2 * this.strokeSize), paint2);
        return bitmapMo10388d;
    }

    public String getId() {
        return getClass().getName();
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public int hashCode() {
        return 1388573390;
    }

    @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5484e
    protected Bitmap transform(InterfaceC5413e interfaceC5413e, Bitmap bitmap, int i2, int i3) {
        return circleCrop(interfaceC5413e, bitmap);
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }

    public ShadowCircleTransformation(Context context) {
        this.shadowColor = -1;
        this.strokeSize = 0.08f;
        this.spaceBetween = 0.0f;
    }

    public ShadowCircleTransformation(Context context, View view, int i2, float f2, float f3) {
        this.strokeSize = f3;
        view.setLayerType(1, null);
        this.shadowColor = i2;
        this.spaceBetween = f2;
    }

    public ShadowCircleTransformation(Context context, View view, int i2) {
        view.setLayerType(1, null);
        this.shadowColor = i2;
        this.strokeSize = 0.08f;
        this.spaceBetween = 0.95f;
    }

    public ShadowCircleTransformation(Context context, View view, float f2) {
        view.setLayerType(1, null);
        this.strokeSize = f2;
        this.shadowColor = -1;
        this.spaceBetween = 0.95f;
    }
}
