package p241e.p254e.p256b.p271c.p273m;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* compiled from: DrawableAlphaProperty.java */
/* renamed from: e.e.b.c.m.e */
/* loaded from: classes2.dex */
public class C8923e extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final Property<Drawable, Integer> f34377a = new C8923e();

    /* renamed from: b */
    private final WeakHashMap<Drawable, Integer> f34378b;

    private C8923e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f34378b = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f34378b.containsKey(drawable)) {
            return this.f34378b.get(drawable);
        }
        return 255;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f34378b.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
