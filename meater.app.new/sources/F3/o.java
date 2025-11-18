package F3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import s1.C4469y0;

/* compiled from: WindowMetricsCalculatorCompat.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R*\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\r0'j\b\u0012\u0004\u0012\u00020\r`(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"LF3/o;", "LF3/l;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "bounds", "Loa/F;", "j", "(Landroid/app/Activity;Landroid/graphics/Rect;)V", "Landroid/content/Context;", "context", "", "h", "(Landroid/content/Context;)I", "Landroid/view/Display;", "display", "Landroid/view/DisplayCutout;", "g", "(Landroid/view/Display;)Landroid/view/DisplayCutout;", "LF3/k;", "b", "(Landroid/content/Context;)LF3/k;", "a", "(Landroid/app/Activity;)LF3/k;", "e", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "d", "c", "Landroid/graphics/Point;", "i", "(Landroid/view/Display;)Landroid/graphics/Point;", "Ls1/y0;", "f", "(Landroid/content/Context;)Ls1/y0;", "", "Ljava/lang/String;", "TAG", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "getInsetsTypeMasks$window_release", "()Ljava/util/ArrayList;", "insetsTypeMasks", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final o f4526b = new o();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String TAG;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final ArrayList<Integer> insetsTypeMasks;

    static {
        String simpleName = o.class.getSimpleName();
        C3862t.f(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        TAG = simpleName;
        insetsTypeMasks = r.g(Integer.valueOf(C4469y0.l.g()), Integer.valueOf(C4469y0.l.f()), Integer.valueOf(C4469y0.l.a()), Integer.valueOf(C4469y0.l.c()), Integer.valueOf(C4469y0.l.i()), Integer.valueOf(C4469y0.l.e()), Integer.valueOf(C4469y0.l.j()), Integer.valueOf(C4469y0.l.b()));
    }

    private o() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final DisplayCutout g(Display display) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (m.a(obj)) {
                return n.a(obj);
            }
            return null;
        } catch (ClassNotFoundException e10) {
            Log.w(TAG, e10);
            return null;
        } catch (IllegalAccessException e11) {
            Log.w(TAG, e11);
            return null;
        } catch (InstantiationException e12) {
            Log.w(TAG, e12);
            return null;
        } catch (NoSuchFieldException e13) {
            Log.w(TAG, e13);
            return null;
        } catch (NoSuchMethodException e14) {
            Log.w(TAG, e14);
            return null;
        } catch (InvocationTargetException e15) {
            Log.w(TAG, e15);
            return null;
        }
    }

    private final int h(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void j(Activity activity, Rect bounds) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(bounds);
    }

    @Override // F3.l
    public WindowMetrics a(Activity activity) throws Exception {
        C4469y0 c4469y0A;
        C3862t.g(activity, "activity");
        int i10 = Build.VERSION.SDK_INT;
        Rect rectA = i10 >= 30 ? J3.f.f7274a.a(activity) : i10 >= 29 ? e(activity) : i10 >= 28 ? d(activity) : c(activity);
        if (i10 >= 30) {
            c4469y0A = f(activity);
        } else {
            c4469y0A = new C4469y0.a().a();
            C3862t.f(c4469y0A, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new WindowMetrics(new E3.b(rectA), c4469y0A);
    }

    public WindowMetrics b(Context context) {
        C3862t.g(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return J3.f.f7274a.c(context);
        }
        Context contextA = J3.b.f7273a.a(context);
        if (contextA instanceof Activity) {
            return a((Activity) contextA);
        }
        if (!(contextA instanceof InputMethodService)) {
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        Object systemService = context.getSystemService("window");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        C3862t.f(defaultDisplay, "wm.defaultDisplay");
        Point pointI = i(defaultDisplay);
        return new WindowMetrics(new Rect(0, 0, pointI.x, pointI.y), null, 2, 0 == true ? 1 : 0);
    }

    public final Rect c(Activity activity) {
        C3862t.g(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!J3.a.f7272a.a(activity)) {
            C3862t.f(defaultDisplay, "defaultDisplay");
            Point pointI = i(defaultDisplay);
            int iH = h(activity);
            int i10 = rect.bottom;
            if (i10 + iH == pointI.y) {
                rect.bottom = i10 + iH;
            } else {
                int i11 = rect.right;
                if (i11 + iH == pointI.x) {
                    rect.right = i11 + iH;
                }
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect d(Activity activity) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C3862t.g(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (J3.a.f7272a.a(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                C3862t.e(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                C3862t.e(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e10) {
            Log.w(TAG, e10);
            j(activity, rect);
        } catch (NoSuchFieldException e11) {
            Log.w(TAG, e11);
            j(activity, rect);
        } catch (NoSuchMethodException e12) {
            Log.w(TAG, e12);
            j(activity, rect);
        } catch (InvocationTargetException e13) {
            Log.w(TAG, e13);
            j(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        currentDisplay.getRealSize(point);
        J3.a aVar = J3.a.f7272a;
        if (!aVar.a(activity)) {
            int iH = h(activity);
            int i10 = rect.bottom;
            if (i10 + iH == point.y) {
                rect.bottom = i10 + iH;
            } else {
                int i11 = rect.right;
                if (i11 + iH == point.x) {
                    rect.right = i11 + iH;
                } else if (rect.left == iH) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.a(activity)) {
            C3862t.f(currentDisplay, "currentDisplay");
            DisplayCutout displayCutoutG = g(currentDisplay);
            if (displayCutoutG != null) {
                int i12 = rect.left;
                J3.k kVar = J3.k.f7275a;
                if (i12 == kVar.b(displayCutoutG)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == kVar.c(displayCutoutG)) {
                    rect.right += kVar.c(displayCutoutG);
                }
                if (rect.top == kVar.d(displayCutoutG)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == kVar.a(displayCutoutG)) {
                    rect.bottom += kVar.a(displayCutoutG);
                }
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect e(Activity activity) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C3862t.g(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            C3862t.e(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (IllegalAccessException e10) {
            Log.w(TAG, e10);
            return d(activity);
        } catch (NoSuchFieldException e11) {
            Log.w(TAG, e11);
            return d(activity);
        } catch (NoSuchMethodException e12) {
            Log.w(TAG, e12);
            return d(activity);
        } catch (InvocationTargetException e13) {
            Log.w(TAG, e13);
            return d(activity);
        }
    }

    public final C4469y0 f(Context context) throws Exception {
        C3862t.g(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return J3.f.f7274a.b(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    public final Point i(Display display) {
        C3862t.g(display, "display");
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }
}
