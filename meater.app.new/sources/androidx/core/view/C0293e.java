package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: KeyEventDispatcher.java */
/* renamed from: androidx.core.view.e */
/* loaded from: classes.dex */
public class C0293e {

    /* renamed from: a */
    private static boolean f2383a = false;

    /* renamed from: b */
    private static Method f2384b = null;

    /* renamed from: c */
    private static boolean f2385c = false;

    /* renamed from: d */
    private static Field f2386d;

    /* compiled from: KeyEventDispatcher.java */
    /* renamed from: androidx.core.view.e$a */
    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m2034a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2383a) {
            try {
                f2384b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f2383a = true;
        }
        Method method = f2384b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m2035b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m2034a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0311u.m2128h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m2036c(Dialog dialog, KeyEvent keyEvent) throws NoSuchFieldException {
        DialogInterface.OnKeyListener onKeyListenerM2039f = m2039f(dialog);
        if (onKeyListenerM2039f != null && onKeyListenerM2039f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0311u.m2128h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m2037d(View view, KeyEvent keyEvent) {
        return C0311u.m2130i(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m2038e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.superDispatchKeyEvent(keyEvent) : callback instanceof Activity ? m2035b((Activity) callback, keyEvent) : callback instanceof Dialog ? m2036c((Dialog) callback, keyEvent) : (view != null && C0311u.m2128h(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m2039f(Dialog dialog) throws NoSuchFieldException {
        if (!f2385c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2386d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2385c = true;
        }
        Field field = f2386d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
