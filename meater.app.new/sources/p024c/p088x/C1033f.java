package p024c.p088x;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* compiled from: ObjectAnimatorUtils.java */
/* renamed from: c.x.f */
/* loaded from: classes.dex */
class C1033f {
    /* renamed from: a */
    static <T> ObjectAnimator m6587a(T t, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t, property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(t, new C1037h(property, path), 0.0f, 1.0f);
    }
}
