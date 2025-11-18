package p241e.p254e.p256b.p271c.p274n;

import android.graphics.Canvas;
import android.os.Build;

/* compiled from: CanvasCompat.java */
/* renamed from: e.e.b.c.n.a */
/* loaded from: classes2.dex */
public class C8930a {
    /* renamed from: a */
    public static int m28459a(Canvas canvas, float f2, float f3, float f4, float f5, int i2) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f2, f3, f4, f5, i2) : canvas.saveLayerAlpha(f2, f3, f4, f5, i2, 31);
    }
}
