package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper.java */
/* renamed from: androidx.appcompat.widget.n0 */
/* loaded from: classes.dex */
public class C0179n0 extends ContextWrapper {

    /* renamed from: a */
    private static final Object f1220a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0179n0>> f1221b;

    /* renamed from: c */
    private final Resources f1222c;

    /* renamed from: d */
    private final Resources.Theme f1223d;

    private C0179n0(Context context) {
        super(context);
        if (!C0195v0.m1228b()) {
            this.f1222c = new C0183p0(this, context.getResources());
            this.f1223d = null;
            return;
        }
        C0195v0 c0195v0 = new C0195v0(this, context.getResources());
        this.f1222c = c0195v0;
        Resources.Theme themeNewTheme = c0195v0.newTheme();
        this.f1223d = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    /* renamed from: a */
    private static boolean m1076a(Context context) {
        if ((context instanceof C0179n0) || (context.getResources() instanceof C0183p0) || (context.getResources() instanceof C0195v0)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0195v0.m1228b();
    }

    /* renamed from: b */
    public static Context m1077b(Context context) {
        if (!m1076a(context)) {
            return context;
        }
        synchronized (f1220a) {
            ArrayList<WeakReference<C0179n0>> arrayList = f1221b;
            if (arrayList == null) {
                f1221b = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<C0179n0> weakReference = f1221b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1221b.remove(size);
                    }
                }
                for (int size2 = f1221b.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0179n0> weakReference2 = f1221b.get(size2);
                    C0179n0 c0179n0 = weakReference2 != null ? weakReference2.get() : null;
                    if (c0179n0 != null && c0179n0.getBaseContext() == context) {
                        return c0179n0;
                    }
                }
            }
            C0179n0 c0179n02 = new C0179n0(context);
            f1221b.add(new WeakReference<>(c0179n02));
            return c0179n02;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1222c.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1222c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1223d;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        Resources.Theme theme = this.f1223d;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}
