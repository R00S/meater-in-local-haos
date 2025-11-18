package com.facebook.p157o0.p160m0.p161n;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import cm.aptoide.p092pt.root.execution.Command;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import com.facebook.internal.C5696p0;
import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewHierarchy.kt */
/* renamed from: com.facebook.o0.m0.n.f */
/* loaded from: classes.dex */
public final class C5874f {

    /* renamed from: a */
    public static final C5874f f15257a = new C5874f();

    /* renamed from: b */
    private static final String f15258b = C5874f.class.getCanonicalName();

    /* renamed from: c */
    private static WeakReference<View> f15259c = new WeakReference<>(null);

    /* renamed from: d */
    private static Method f15260d;

    private C5874f() {
    }

    /* renamed from: a */
    public static final View m12468a(View view) {
        while (view != null) {
            if (f15257a.m12483q(view)) {
                return view;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        return null;
    }

    /* renamed from: b */
    public static final List<View> m12469b(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            if (childCount > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    arrayList.add(viewGroup.getChildAt(i2));
                    if (i3 >= childCount) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final int m12470c(View view) {
        C9801m.m32346f(view, "view");
        int i2 = view instanceof ImageView ? 2 : 0;
        if (view.isClickable()) {
            i2 |= 32;
        }
        C5874f c5874f = f15257a;
        if (m12482o(view)) {
            i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
        }
        if (!(view instanceof TextView)) {
            return ((view instanceof Spinner) || (view instanceof DatePicker)) ? i2 | RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT : view instanceof RatingBar ? i2 | 65536 : view instanceof RadioGroup ? i2 | Http2.INITIAL_MAX_FRAME_SIZE : ((view instanceof ViewGroup) && c5874f.m12486p(view, f15259c.get())) ? i2 | 64 : i2;
        }
        int i3 = i2 | 1024 | 1;
        if (view instanceof Button) {
            i3 |= 4;
            if (view instanceof Switch) {
                i3 |= 8192;
            } else if (view instanceof CheckBox) {
                i3 |= 32768;
            }
        }
        return view instanceof EditText ? i3 | RecyclerView.AbstractC0599l.FLAG_MOVED : i3;
    }

    /* renamed from: d */
    public static final JSONObject m12471d(View view) throws JSONException {
        C9801m.m32346f(view, "view");
        if (C9801m.m32341a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
            f15259c = new WeakReference<>(view);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            m12485s(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<View> listM12469b = m12469b(view);
            int i2 = 0;
            int size = listM12469b.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i3 = i2 + 1;
                    jSONArray.put(m12471d(listM12469b.get(i2)));
                    if (i3 > size) {
                        break;
                    }
                    i2 = i3;
                }
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e2) {
            Log.e(f15258b, "Failed to create JSONObject for view.", e2);
        }
        return jSONObject;
    }

    /* renamed from: e */
    private final JSONObject m12472e(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("top", view.getTop());
            jSONObject.put("left", view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e2) {
            Log.e(f15258b, "Failed to create JSONObject for dimension.", e2);
        }
        return jSONObject;
    }

    /* renamed from: f */
    private final Class<?> m12473f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static final View.OnClickListener m12474g(View view) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field declaredField;
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static final View.OnTouchListener m12475h(View view) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field declaredField;
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnTouchListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
        } catch (ClassNotFoundException e2) {
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5696p0.m11573i0(f15258b, e2);
            return null;
        } catch (IllegalAccessException e3) {
            C5696p0 c5696p02 = C5696p0.f14478a;
            C5696p0.m11573i0(f15258b, e3);
            return null;
        } catch (NoSuchFieldException e4) {
            C5696p0 c5696p03 = C5696p0.f14478a;
            C5696p0.m11573i0(f15258b, e4);
            return null;
        }
    }

    /* renamed from: i */
    public static final String m12476i(View view) {
        String string;
        CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
        return (hint == null || (string = hint.toString()) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : string;
    }

    /* renamed from: j */
    public static final ViewGroup m12477j(View view) {
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed A[EDGE_INSN: B:48:0x00ed->B:39:0x00ed BREAK  A[LOOP:0: B:28:0x00c2->B:35:0x00dc]] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m12478k(android.view.View r8) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p160m0.p161n.C5874f.m12478k(android.view.View):java.lang.String");
    }

    /* renamed from: l */
    private final View m12479l(float[] fArr, View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m12481n();
        Method method = f15260d;
        if (method != null && view != null) {
            try {
                if (method == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Object objInvoke = method.invoke(null, fArr, view);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
                View view2 = (View) objInvoke;
                if (view2.getId() > 0) {
                    Object parent = view2.getParent();
                    if (parent != null) {
                        return (View) parent;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
            } catch (IllegalAccessException e2) {
                C5696p0 c5696p0 = C5696p0.f14478a;
                C5696p0.m11573i0(f15258b, e2);
            } catch (InvocationTargetException e3) {
                C5696p0 c5696p02 = C5696p0.f14478a;
                C5696p0.m11573i0(f15258b, e3);
            }
        }
        return null;
    }

    /* renamed from: m */
    private final float[] m12480m(View view) {
        view.getLocationOnScreen(new int[2]);
        return new float[]{r1[0], r1[1]};
    }

    /* renamed from: n */
    private final void m12481n() throws NoSuchMethodException, SecurityException {
        if (f15260d != null) {
            return;
        }
        try {
            Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
            f15260d = declaredMethod;
            if (declaredMethod == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            declaredMethod.setAccessible(true);
        } catch (ClassNotFoundException e2) {
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5696p0.m11573i0(f15258b, e2);
        } catch (NoSuchMethodException e3) {
            C5696p0 c5696p02 = C5696p0.f14478a;
            C5696p0.m11573i0(f15258b, e3);
        }
    }

    /* renamed from: o */
    private static final boolean m12482o(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof AdapterView) {
            return true;
        }
        C5874f c5874f = f15257a;
        Class<?> clsM12473f = c5874f.m12473f("android.support.v4.view.NestedScrollingChild");
        if (clsM12473f != null && clsM12473f.isInstance(parent)) {
            return true;
        }
        Class<?> clsM12473f2 = c5874f.m12473f("androidx.core.view.NestedScrollingChild");
        return clsM12473f2 != null && clsM12473f2.isInstance(parent);
    }

    /* renamed from: q */
    private final boolean m12483q(View view) {
        return C9801m.m32341a(view.getClass().getName(), "com.facebook.react.ReactRootView");
    }

    /* renamed from: r */
    public static final void m12484r(View view, View.OnClickListener onClickListener) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field declaredField;
        Field declaredField2;
        C9801m.m32346f(view, "view");
        Object obj = null;
        try {
            try {
                declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                try {
                    declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                } catch (ClassNotFoundException | NoSuchFieldException unused) {
                    declaredField2 = null;
                    if (declaredField != null) {
                    }
                    view.setOnClickListener(onClickListener);
                    return;
                }
            } catch (Exception unused2) {
                return;
            }
        } catch (ClassNotFoundException | NoSuchFieldException unused3) {
            declaredField = null;
        }
        if (declaredField != null || declaredField2 == null) {
            view.setOnClickListener(onClickListener);
            return;
        }
        declaredField.setAccessible(true);
        declaredField2.setAccessible(true);
        try {
            declaredField.setAccessible(true);
            obj = declaredField.get(view);
        } catch (IllegalAccessException unused4) {
        }
        if (obj == null) {
            view.setOnClickListener(onClickListener);
        } else {
            declaredField2.set(obj, onClickListener);
        }
    }

    /* renamed from: s */
    public static final void m12485s(View view, JSONObject jSONObject) throws JSONException {
        C9801m.m32346f(view, "view");
        C9801m.m32346f(jSONObject, BodyInterceptorV3.RESPONSE_MODE_JSON);
        try {
            C5874f c5874f = f15257a;
            String strM12478k = m12478k(view);
            String strM12476i = m12476i(view);
            Object tag = view.getTag();
            CharSequence contentDescription = view.getContentDescription();
            jSONObject.put("classname", view.getClass().getCanonicalName());
            jSONObject.put("classtypebitmask", m12470c(view));
            jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, view.getId());
            C5872d c5872d = C5872d.f15253a;
            if (C5872d.m12463g(view)) {
                jSONObject.put(Command.CommandHandler.TEXT, HttpUrl.FRAGMENT_ENCODE_SET);
                jSONObject.put("is_user_input", true);
            } else {
                C5696p0 c5696p0 = C5696p0.f14478a;
                jSONObject.put(Command.CommandHandler.TEXT, C5696p0.m11572i(C5696p0.m11535F0(strM12478k), HttpUrl.FRAGMENT_ENCODE_SET));
            }
            C5696p0 c5696p02 = C5696p0.f14478a;
            jSONObject.put("hint", C5696p0.m11572i(C5696p0.m11535F0(strM12476i), HttpUrl.FRAGMENT_ENCODE_SET));
            if (tag != null) {
                jSONObject.put(StoreTabGridRecyclerFragment.BundleCons.TAG, C5696p0.m11572i(C5696p0.m11535F0(tag.toString()), HttpUrl.FRAGMENT_ENCODE_SET));
            }
            if (contentDescription != null) {
                jSONObject.put("description", C5696p0.m11572i(C5696p0.m11535F0(contentDescription.toString()), HttpUrl.FRAGMENT_ENCODE_SET));
            }
            jSONObject.put("dimension", c5874f.m12472e(view));
        } catch (JSONException e2) {
            C5696p0 c5696p03 = C5696p0.f14478a;
            C5696p0.m11573i0(f15258b, e2);
        }
    }

    /* renamed from: p */
    public final boolean m12486p(View view, View view2) {
        View viewM12479l;
        C9801m.m32346f(view, "view");
        return C9801m.m32341a(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") && (viewM12479l = m12479l(m12480m(view), view2)) != null && viewM12479l.getId() == view.getId();
    }
}
