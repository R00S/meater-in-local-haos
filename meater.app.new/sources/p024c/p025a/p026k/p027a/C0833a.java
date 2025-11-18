package p024c.p025a.p026k.p027a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0165g0;
import androidx.core.content.C0255a;
import androidx.core.content.p003d.C0258a;
import java.util.WeakHashMap;

/* compiled from: AppCompatResources.java */
@SuppressLint({"RestrictedAPI"})
/* renamed from: c.a.k.a.a */
/* loaded from: classes.dex */
public final class C0833a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f5458a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<a>> f5459b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f5460c = new Object();

    /* compiled from: AppCompatResources.java */
    /* renamed from: c.a.k.a.a$a */
    private static class a {

        /* renamed from: a */
        final ColorStateList f5461a;

        /* renamed from: b */
        final Configuration f5462b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.f5461a = colorStateList;
            this.f5462b = configuration;
        }
    }

    /* renamed from: a */
    private static void m5259a(Context context, int i2, ColorStateList colorStateList) {
        synchronized (f5460c) {
            WeakHashMap<Context, SparseArray<a>> weakHashMap = f5459b;
            SparseArray<a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i2, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    private static ColorStateList m5260b(Context context, int i2) {
        a aVar;
        synchronized (f5460c) {
            SparseArray<a> sparseArray = f5459b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i2)) != null) {
                if (aVar.f5462b.equals(context.getResources().getConfiguration())) {
                    return aVar.f5461a;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m5261c(Context context, int i2) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        ColorStateList colorStateListM5260b = m5260b(context, i2);
        if (colorStateListM5260b != null) {
            return colorStateListM5260b;
        }
        ColorStateList colorStateListM5264f = m5264f(context, i2);
        if (colorStateListM5264f == null) {
            return C0255a.m1676e(context, i2);
        }
        m5259a(context, i2, colorStateListM5264f);
        return colorStateListM5264f;
    }

    /* renamed from: d */
    public static Drawable m5262d(Context context, int i2) {
        return C0165g0.m981h().m990j(context, i2);
    }

    /* renamed from: e */
    private static TypedValue m5263e() {
        ThreadLocal<TypedValue> threadLocal = f5458a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: f */
    private static ColorStateList m5264f(Context context, int i2) throws Resources.NotFoundException {
        if (m5265g(context, i2)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0258a.m1702a(resources, resources.getXml(i2), context.getTheme());
        } catch (Exception e2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m5265g(Context context, int i2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        TypedValue typedValueM5263e = m5263e();
        resources.getValue(i2, typedValueM5263e, true);
        int i3 = typedValueM5263e.type;
        return i3 >= 28 && i3 <= 31;
    }
}
