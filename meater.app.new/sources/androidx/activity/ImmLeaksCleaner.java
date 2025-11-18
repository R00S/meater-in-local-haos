package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.InterfaceC0513i;
import androidx.lifecycle.InterfaceC0515k;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0513i {

    /* renamed from: a */
    private static int f98a;

    /* renamed from: b */
    private static Field f99b;

    /* renamed from: c */
    private static Field f100c;

    /* renamed from: d */
    private static Field f101d;

    /* renamed from: e */
    private Activity f102e;

    ImmLeaksCleaner(Activity activity) {
        this.f102e = activity;
    }

    /* renamed from: b */
    private static void m126b() throws NoSuchFieldException {
        try {
            f98a = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f100c = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f101d = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f99b = declaredField3;
            declaredField3.setAccessible(true);
            f98a = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC0513i
    /* renamed from: a */
    public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (bVar != AbstractC0511g.b.ON_DESTROY) {
            return;
        }
        if (f98a == 0) {
            m126b();
        }
        if (f98a == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f102e.getSystemService("input_method");
            try {
                Object obj = f99b.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f100c.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f101d.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
