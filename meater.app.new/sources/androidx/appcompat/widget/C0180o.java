package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.InterfaceC0267c;

/* compiled from: AppCompatProgressBarHelper.java */
/* renamed from: androidx.appcompat.widget.o */
/* loaded from: classes.dex */
class C0180o {

    /* renamed from: a */
    private static final int[] f1224a = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: b */
    private final ProgressBar f1225b;

    /* renamed from: c */
    private Bitmap f1226c;

    C0180o(ProgressBar progressBar) {
        this.f1225b = progressBar;
    }

    /* renamed from: a */
    private Shape m1078a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private Drawable m1079d(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0267c) {
            InterfaceC0267c interfaceC0267c = (InterfaceC0267c) drawable;
            Drawable drawableMo1823b = interfaceC0267c.mo1823b();
            if (drawableMo1823b != null) {
                interfaceC0267c.mo1822a(m1079d(drawableMo1823b, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    int id = layerDrawable.getId(i2);
                    drawableArr[i2] = m1079d(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    layerDrawable2.setId(i3, layerDrawable.getId(i3));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1226c == null) {
                    this.f1226c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m1078a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* renamed from: e */
    private Drawable m1080e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            Drawable drawableM1079d = m1079d(animationDrawable.getFrame(i2), true);
            drawableM1079d.setLevel(10000);
            animationDrawable2.addFrame(drawableM1079d, animationDrawable.getDuration(i2));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: b */
    Bitmap m1081b() {
        return this.f1226c;
    }

    /* renamed from: c */
    void mo1082c(AttributeSet attributeSet, int i2) {
        C0185q0 c0185q0M1091v = C0185q0.m1091v(this.f1225b.getContext(), attributeSet, f1224a, i2, 0);
        Drawable drawableM1099h = c0185q0M1091v.m1099h(0);
        if (drawableM1099h != null) {
            this.f1225b.setIndeterminateDrawable(m1080e(drawableM1099h));
        }
        Drawable drawableM1099h2 = c0185q0M1091v.m1099h(1);
        if (drawableM1099h2 != null) {
            this.f1225b.setProgressDrawable(m1079d(drawableM1099h2, false));
        }
        c0185q0M1091v.m1111w();
    }
}
