package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: VectorEnabledTintResources.java */
/* renamed from: androidx.appcompat.widget.v0 */
/* loaded from: classes.dex */
public class C0195v0 extends Resources {

    /* renamed from: a */
    private static boolean f1322a = false;

    /* renamed from: b */
    private final WeakReference<Context> f1323b;

    public C0195v0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1323b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m1227a() {
        return f1322a;
    }

    /* renamed from: b */
    public static boolean m1228b() {
        return m1227a() && Build.VERSION.SDK_INT <= 20;
    }

    /* renamed from: c */
    final Drawable m1229c(int i2) {
        return super.getDrawable(i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) throws Resources.NotFoundException {
        Context context = this.f1323b.get();
        return context != null ? C0165g0.m981h().m995t(context, this, i2) : super.getDrawable(i2);
    }
}
