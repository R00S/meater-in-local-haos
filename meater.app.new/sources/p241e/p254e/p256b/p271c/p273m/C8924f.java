package p241e.p254e.p256b.p271c.p273m;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: ImageMatrixProperty.java */
/* renamed from: e.e.b.c.m.f */
/* loaded from: classes2.dex */
public class C8924f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f34379a;

    public C8924f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f34379a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f34379a.set(imageView.getImageMatrix());
        return this.f34379a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
