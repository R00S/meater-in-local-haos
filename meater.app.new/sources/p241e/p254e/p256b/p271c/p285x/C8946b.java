package p241e.p254e.p256b.p271c.p285x;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* compiled from: MaterialAttributes.java */
/* renamed from: e.e.b.c.x.b */
/* loaded from: classes2.dex */
public class C8946b {
    /* renamed from: a */
    public static TypedValue m28495a(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m28496b(Context context, int i2, boolean z) {
        TypedValue typedValueM28495a = m28495a(context, i2);
        return (typedValueM28495a == null || typedValueM28495a.type != 18) ? z : typedValueM28495a.data != 0;
    }

    /* renamed from: c */
    public static int m28497c(Context context, int i2, String str) {
        TypedValue typedValueM28495a = m28495a(context, i2);
        if (typedValueM28495a != null) {
            return typedValueM28495a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    /* renamed from: d */
    public static int m28498d(View view, int i2) {
        return m28497c(view.getContext(), i2, view.getClass().getCanonicalName());
    }
}
