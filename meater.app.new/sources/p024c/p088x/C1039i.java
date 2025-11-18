package p024c.p088x;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* compiled from: PropertyValuesHolderUtils.java */
/* renamed from: c.x.i */
/* loaded from: classes.dex */
class C1039i {
    /* renamed from: a */
    static PropertyValuesHolder m6593a(Property<?, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? PropertyValuesHolder.ofObject(property, (TypeConverter) null, path) : PropertyValuesHolder.ofFloat(new C1037h(property, path), 0.0f, 1.0f);
    }
}
