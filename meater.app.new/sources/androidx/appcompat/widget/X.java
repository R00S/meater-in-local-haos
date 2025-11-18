package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper.java */
/* loaded from: classes.dex */
public class X extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f21593c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<X>> f21594d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f21595a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f21596b;

    private X(Context context) {
        super(context);
        if (!g0.c()) {
            this.f21595a = new Z(this, context.getResources());
            this.f21596b = null;
            return;
        }
        g0 g0Var = new g0(this, context.getResources());
        this.f21595a = g0Var;
        Resources.Theme themeNewTheme = g0Var.newTheme();
        this.f21596b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        if ((context instanceof X) || (context.getResources() instanceof Z) || (context.getResources() instanceof g0)) {
            return false;
        }
        return g0.c();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f21593c) {
            try {
                ArrayList<WeakReference<X>> arrayList = f21594d;
                if (arrayList == null) {
                    f21594d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<X> weakReference = f21594d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f21594d.remove(size);
                        }
                    }
                    for (int size2 = f21594d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<X> weakReference2 = f21594d.get(size2);
                        X x10 = weakReference2 != null ? weakReference2.get() : null;
                        if (x10 != null && x10.getBaseContext() == context) {
                            return x10;
                        }
                    }
                }
                X x11 = new X(context);
                f21594d.add(new WeakReference<>(x11));
                return x11;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f21595a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f21595a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f21596b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f21596b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
