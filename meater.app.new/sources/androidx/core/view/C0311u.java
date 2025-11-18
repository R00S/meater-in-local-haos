package androidx.core.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0280a;
import androidx.core.view.C0285c0;
import androidx.core.view.p004d0.C0289c;
import androidx.core.view.p004d0.InterfaceC0292f;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p024c.p052i.C0921c;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.u */
/* loaded from: classes.dex */
public class C0311u {

    /* renamed from: b */
    private static Field f2404b;

    /* renamed from: c */
    private static boolean f2405c;

    /* renamed from: d */
    private static Field f2406d;

    /* renamed from: e */
    private static boolean f2407e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f2408f;

    /* renamed from: h */
    private static Field f2410h;

    /* renamed from: j */
    private static ThreadLocal<Rect> f2412j;

    /* renamed from: a */
    private static final AtomicInteger f2403a = new AtomicInteger(1);

    /* renamed from: g */
    private static WeakHashMap<View, C0315y> f2409g = null;

    /* renamed from: i */
    private static boolean f2411i = false;

    /* renamed from: k */
    private static final int[] f2413k = {C0921c.f6216b, C0921c.f6217c, C0921c.f6228n, C0921c.f6239y, C0921c.f6198B, C0921c.f6199C, C0921c.f6200D, C0921c.f6201E, C0921c.f6202F, C0921c.f6203G, C0921c.f6218d, C0921c.f6219e, C0921c.f6220f, C0921c.f6221g, C0921c.f6222h, C0921c.f6223i, C0921c.f6224j, C0921c.f6225k, C0921c.f6226l, C0921c.f6227m, C0921c.f6229o, C0921c.f6230p, C0921c.f6231q, C0921c.f6232r, C0921c.f6233s, C0921c.f6234t, C0921c.f6235u, C0921c.f6236v, C0921c.f6237w, C0921c.f6238x, C0921c.f6240z, C0921c.f6197A};

    /* renamed from: l */
    private static final InterfaceC0307q f2414l = new a();

    /* renamed from: m */
    private static f f2415m = new f();

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.u$a */
    class a implements InterfaceC0307q {
        a() {
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.u$b */
    class b extends g<Boolean> {
        b(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0311u.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean mo2166d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0311u.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2167e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0311u.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo2168h(Boolean bool, Boolean bool2) {
            return !m2185a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.u$c */
    class c extends g<CharSequence> {
        c(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0311u.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence mo2166d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0311u.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2167e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0311u.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo2168h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.u$d */
    class d extends g<CharSequence> {
        d(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0311u.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence mo2166d(View view) {
            return view.getStateDescription();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0311u.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2167e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0311u.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo2168h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.u$e */
    class e extends g<Boolean> {
        e(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0311u.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean mo2166d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0311u.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2167e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0311u.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo2168h(Boolean bool, Boolean bool2) {
            return !m2185a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.u$f */
    static class f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: f */
        private WeakHashMap<View, Boolean> f2416f = new WeakHashMap<>();

        f() {
        }

        /* renamed from: a */
        private void m2181a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                C0311u.m2106S(view, z2 ? 16 : 32);
                this.f2416f.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: b */
        private void m2182b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f2416f.entrySet()) {
                    m2181a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m2182b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.u$g */
    static abstract class g<T> {

        /* renamed from: a */
        private final int f2417a;

        /* renamed from: b */
        private final Class<T> f2418b;

        /* renamed from: c */
        private final int f2419c;

        /* renamed from: d */
        private final int f2420d;

        g(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        /* renamed from: b */
        private boolean m2183b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: c */
        private boolean m2184c() {
            return Build.VERSION.SDK_INT >= this.f2419c;
        }

        /* renamed from: a */
        boolean m2185a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* renamed from: d */
        abstract T mo2166d(View view);

        /* renamed from: e */
        abstract void mo2167e(View view, T t);

        /* renamed from: f */
        T m2186f(View view) {
            if (m2184c()) {
                return mo2166d(view);
            }
            if (!m2183b()) {
                return null;
            }
            T t = (T) view.getTag(this.f2417a);
            if (this.f2418b.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* renamed from: g */
        void m2187g(View view, T t) {
            if (m2184c()) {
                mo2167e(view, t);
            } else if (m2183b() && mo2168h(m2186f(view), t)) {
                C0311u.m2086B(view);
                view.setTag(this.f2417a, t);
                C0311u.m2106S(view, this.f2420d);
            }
        }

        /* renamed from: h */
        abstract boolean mo2168h(T t, T t2);

        g(int i2, Class<T> cls, int i3, int i4) {
            this.f2417a = i2;
            this.f2418b = cls;
            this.f2420d = i3;
            this.f2419c = i4;
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.u$h */
    private static class h {

        /* compiled from: ViewCompat.java */
        /* renamed from: androidx.core.view.u$h$a */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C0285c0 f2421a = null;

            /* renamed from: b */
            final /* synthetic */ View f2422b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC0306p f2423c;

            a(View view, InterfaceC0306p interfaceC0306p) {
                this.f2422b = view;
                this.f2423c = interfaceC0306p;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0285c0 c0285c0M1873v = C0285c0.m1873v(windowInsets, view);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    h.m2188a(windowInsets, this.f2422b);
                    if (c0285c0M1873v.equals(this.f2421a)) {
                        return this.f2423c.mo363a(view, c0285c0M1873v).m1892t();
                    }
                }
                this.f2421a = c0285c0M1873v;
                C0285c0 c0285c0Mo363a = this.f2423c.mo363a(view, c0285c0M1873v);
                if (i2 >= 30) {
                    return c0285c0Mo363a.m1892t();
                }
                C0311u.m2125f0(view);
                return c0285c0Mo363a.m1892t();
            }
        }

        /* renamed from: a */
        static void m2188a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C0921c.f6214R);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C0285c0 m2189b(View view, C0285c0 c0285c0, Rect rect) {
            WindowInsets windowInsetsM1892t = c0285c0.m1892t();
            if (windowInsetsM1892t != null) {
                return C0285c0.m1873v(view.computeSystemWindowInsets(windowInsetsM1892t, rect), view);
            }
            rect.setEmpty();
            return c0285c0;
        }

        /* renamed from: c */
        public static C0285c0 m2190c(View view) {
            return C0285c0.a.m1893a(view);
        }

        /* renamed from: d */
        static void m2191d(View view, InterfaceC0306p interfaceC0306p) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C0921c.f6208L, interfaceC0306p);
            }
            if (interfaceC0306p == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C0921c.f6214R));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC0306p));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.u$i */
    private static class i {
        /* renamed from: a */
        public static C0285c0 m2192a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0285c0 c0285c0M1872u = C0285c0.m1872u(rootWindowInsets);
            c0285c0M1872u.m1890r(c0285c0M1872u);
            c0285c0M1872u.m1877d(view.getRootView());
            return c0285c0M1872u;
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.u$j */
    private static class j {
        /* renamed from: a */
        static void m2193a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.u$k */
    public interface k {
        /* renamed from: a */
        boolean m2194a(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.u$l */
    static class l {

        /* renamed from: a */
        private static final ArrayList<WeakReference<View>> f2424a = new ArrayList<>();

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f2425b = null;

        /* renamed from: c */
        private SparseArray<WeakReference<View>> f2426c = null;

        /* renamed from: d */
        private WeakReference<KeyEvent> f2427d = null;

        l() {
        }

        /* renamed from: a */
        static l m2195a(View view) {
            int i2 = C0921c.f6212P;
            l lVar = (l) view.getTag(i2);
            if (lVar != null) {
                return lVar;
            }
            l lVar2 = new l();
            view.setTag(i2, lVar2);
            return lVar2;
        }

        /* renamed from: c */
        private View m2196c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2425b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewM2196c = m2196c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewM2196c != null) {
                            return viewM2196c;
                        }
                    }
                }
                if (m2198e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m2197d() {
            if (this.f2426c == null) {
                this.f2426c = new SparseArray<>();
            }
            return this.f2426c;
        }

        /* renamed from: e */
        private boolean m2198e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0921c.f6213Q);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((k) arrayList.get(size)).m2194a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m2199g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2425b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2424a;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f2425b == null) {
                    this.f2425b = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f2424a;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f2425b.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f2425b.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        boolean m2200b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m2199g();
            }
            View viewM2196c = m2196c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewM2196c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m2197d().put(keyCode, new WeakReference<>(viewM2196c));
                }
            }
            return viewM2196c != null;
        }

        /* renamed from: f */
        boolean m2201f(KeyEvent keyEvent) {
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f2427d;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2427d = new WeakReference<>(keyEvent);
            WeakReference<View> weakReferenceValueAt = null;
            SparseArray<WeakReference<View>> sparseArrayM2197d = m2197d();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayM2197d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = sparseArrayM2197d.valueAt(iIndexOfKey);
                sparseArrayM2197d.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayM2197d.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && C0311u.m2101N(view)) {
                m2198e(view, keyEvent);
            }
            return true;
        }
    }

    /* renamed from: A */
    public static int m2084A(View view) throws NoSuchFieldException {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f2405c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f2404b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2405c = true;
        }
        Field field = f2404b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: A0 */
    private static void m2085A0(View view) {
        if (m2158w(view) == 0) {
            m2153t0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m2158w((View) parent) == 4) {
                m2153t0(view, 2);
                return;
            }
        }
    }

    /* renamed from: B */
    static C0280a m2086B(View view) {
        C0280a c0280aM2132j = m2132j(view);
        if (c0280aM2132j == null) {
            c0280aM2132j = new C0280a();
        }
        m2131i0(view, c0280aM2132j);
        return c0280aM2132j;
    }

    /* renamed from: B0 */
    private static g<CharSequence> m2087B0() {
        return new d(C0921c.f6210N, CharSequence.class, 64, 30);
    }

    /* renamed from: C */
    public static int m2088C(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C0 */
    public static void m2089C0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof InterfaceC0300j) {
            ((InterfaceC0300j) view).stopNestedScroll();
        }
    }

    /* renamed from: D */
    public static int m2090D(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: D0 */
    private static void m2091D0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: E */
    public static C0285c0 m2092E(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return i.m2192a(view);
        }
        if (i2 >= 21) {
            return h.m2190c(view);
        }
        return null;
    }

    /* renamed from: F */
    public static final CharSequence m2093F(View view) {
        return m2087B0().m2186f(view);
    }

    /* renamed from: G */
    public static String m2094G(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f2408f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: H */
    public static int m2095H(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: I */
    public static float m2096I(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: J */
    public static boolean m2097J(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m2098K(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: L */
    public static boolean m2099L(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: M */
    public static boolean m2100M(View view) {
        Boolean boolM2186f = m2114a().m2186f(view);
        if (boolM2186f == null) {
            return false;
        }
        return boolM2186f.booleanValue();
    }

    /* renamed from: N */
    public static boolean m2101N(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: O */
    public static boolean m2102O(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    public static boolean m2103P(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof InterfaceC0300j) {
            return ((InterfaceC0300j) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: Q */
    public static boolean m2104Q(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: R */
    public static boolean m2105R(View view) {
        Boolean boolM2186f = m2129h0().m2186f(view);
        if (boolM2186f == null) {
            return false;
        }
        return boolM2186f.booleanValue();
    }

    /* renamed from: S */
    static void m2106S(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m2140n(view) != null && view.getVisibility() == 0;
            if (m2138m(view) != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : RecyclerView.AbstractC0599l.FLAG_MOVED);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z) {
                    accessibilityEventObtain.getText().add(m2140n(view));
                    m2085A0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i2);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(m2140n(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    /* renamed from: T */
    public static void m2107T(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        if (i3 < 21) {
            m2120d(view, i2);
            return;
        }
        Rect rectM2154u = m2154u();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM2154u.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM2154u.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m2120d(view, i2);
        if (z && rectM2154u.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM2154u);
        }
    }

    /* renamed from: U */
    public static void m2108U(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        if (i3 < 21) {
            m2122e(view, i2);
            return;
        }
        Rect rectM2154u = m2154u();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM2154u.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM2154u.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m2122e(view, i2);
        if (z && rectM2154u.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM2154u);
        }
    }

    /* renamed from: V */
    public static C0285c0 m2109V(View view, C0285c0 c0285c0) {
        WindowInsets windowInsetsM1892t;
        if (Build.VERSION.SDK_INT >= 21 && (windowInsetsM1892t = c0285c0.m1892t()) != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsM1892t);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsM1892t)) {
                return C0285c0.m1873v(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return c0285c0;
    }

    /* renamed from: W */
    public static void m2110W(View view, C0289c c0289c) {
        view.onInitializeAccessibilityNodeInfo(c0289c.m2011x0());
    }

    /* renamed from: X */
    private static g<CharSequence> m2111X() {
        return new c(C0921c.f6207K, CharSequence.class, 8, 28);
    }

    /* renamed from: Y */
    public static boolean m2112Y(View view, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i2, bundle);
        }
        return false;
    }

    /* renamed from: Z */
    public static void m2113Z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: a */
    private static g<Boolean> m2114a() {
        return new e(C0921c.f6206J, Boolean.class, 28);
    }

    /* renamed from: a0 */
    public static void m2115a0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: b */
    private static void m2116b(View view, C0289c.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m2086B(view);
            m2121d0(aVar.m2013b(), view);
            m2142o(view).add(aVar);
            m2106S(view, 0);
        }
    }

    /* renamed from: b0 */
    public static void m2117b0(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    /* renamed from: c */
    public static C0315y m2118c(View view) {
        if (f2409g == null) {
            f2409g = new WeakHashMap<>();
        }
        C0315y c0315y = f2409g.get(view);
        if (c0315y != null) {
            return c0315y;
        }
        C0315y c0315y2 = new C0315y(view);
        f2409g.put(view, c0315y2);
        return c0315y2;
    }

    /* renamed from: c0 */
    public static void m2119c0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            m2121d0(i2, view);
            m2106S(view, 0);
        }
    }

    /* renamed from: d */
    private static void m2120d(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            m2091D0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m2091D0((View) parent);
            }
        }
    }

    /* renamed from: d0 */
    private static void m2121d0(int i2, View view) {
        List<C0289c.a> listM2142o = m2142o(view);
        for (int i3 = 0; i3 < listM2142o.size(); i3++) {
            if (listM2142o.get(i3).m2013b() == i2) {
                listM2142o.remove(i3);
                return;
            }
        }
    }

    /* renamed from: e */
    private static void m2122e(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            m2091D0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m2091D0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    public static void m2123e0(View view, C0289c.a aVar, CharSequence charSequence, InterfaceC0292f interfaceC0292f) {
        if (interfaceC0292f == null && charSequence == null) {
            m2119c0(view, aVar.m2013b());
        } else {
            m2116b(view, aVar.m2012a(charSequence, interfaceC0292f));
        }
    }

    /* renamed from: f */
    public static C0285c0 m2124f(View view, C0285c0 c0285c0, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? h.m2189b(view, c0285c0, rect) : c0285c0;
    }

    /* renamed from: f0 */
    public static void m2125f0(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: g */
    public static C0285c0 m2126g(View view, C0285c0 c0285c0) {
        WindowInsets windowInsetsM1892t;
        if (Build.VERSION.SDK_INT >= 21 && (windowInsetsM1892t = c0285c0.m1892t()) != null) {
            WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsetsM1892t);
            if (!windowInsetsDispatchApplyWindowInsets.equals(windowInsetsM1892t)) {
                return C0285c0.m1873v(windowInsetsDispatchApplyWindowInsets, view);
            }
        }
        return c0285c0;
    }

    /* renamed from: g0 */
    public static void m2127g0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            j.m2193a(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    /* renamed from: h */
    static boolean m2128h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.m2195a(view).m2200b(view, keyEvent);
    }

    /* renamed from: h0 */
    private static g<Boolean> m2129h0() {
        return new b(C0921c.f6209M, Boolean.class, 28);
    }

    /* renamed from: i */
    static boolean m2130i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.m2195a(view).m2201f(keyEvent);
    }

    /* renamed from: i0 */
    public static void m2131i0(View view, C0280a c0280a) {
        if (c0280a == null && (m2134k(view) instanceof C0280a.a)) {
            c0280a = new C0280a();
        }
        view.setAccessibilityDelegate(c0280a == null ? null : c0280a.m1856d());
    }

    /* renamed from: j */
    public static C0280a m2132j(View view) {
        View.AccessibilityDelegate accessibilityDelegateM2134k = m2134k(view);
        if (accessibilityDelegateM2134k == null) {
            return null;
        }
        return accessibilityDelegateM2134k instanceof C0280a.a ? ((C0280a.a) accessibilityDelegateM2134k).f2289a : new C0280a(accessibilityDelegateM2134k);
    }

    /* renamed from: j0 */
    public static void m2133j0(View view, boolean z) {
        m2114a().m2187g(view, Boolean.valueOf(z));
    }

    /* renamed from: k */
    private static View.AccessibilityDelegate m2134k(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : m2136l(view);
    }

    /* renamed from: k0 */
    public static void m2135k0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i2);
        }
    }

    /* renamed from: l */
    private static View.AccessibilityDelegate m2136l(View view) {
        if (f2411i) {
            return null;
        }
        if (f2410h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2410h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2411i = true;
                return null;
            }
        }
        try {
            Object obj = f2410h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2411i = true;
            return null;
        }
    }

    @Deprecated
    /* renamed from: l0 */
    public static void m2137l0(View view, float f2) {
        view.setAlpha(f2);
    }

    /* renamed from: m */
    public static int m2138m(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: m0 */
    public static void m2139m0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: n */
    public static CharSequence m2140n(View view) {
        return m2111X().m2186f(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n0 */
    public static void m2141n0(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (view instanceof InterfaceC0310t) {
                ((InterfaceC0310t) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        view.setBackgroundTintList(colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* renamed from: o */
    private static List<C0289c.a> m2142o(View view) {
        int i2 = C0921c.f6204H;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i2, arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o0 */
    public static void m2143o0(View view, PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (view instanceof InterfaceC0310t) {
                ((InterfaceC0310t) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        view.setBackgroundTintMode(mode);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static ColorStateList m2144p(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof InterfaceC0310t) {
            return ((InterfaceC0310t) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: p0 */
    public static void m2145p0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static PorterDuff.Mode m2146q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof InterfaceC0310t) {
            return ((InterfaceC0310t) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: q0 */
    public static void m2147q0(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    /* renamed from: r */
    public static Rect m2148r(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    @Deprecated
    /* renamed from: r0 */
    public static void m2149r0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: s */
    public static Display m2150s(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m2101N(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: s0 */
    public static void m2151s0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: t */
    public static float m2152t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: t0 */
    public static void m2153t0(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 19) {
            view.setImportantForAccessibility(i2);
        } else if (i3 >= 16) {
            if (i2 == 4) {
                i2 = 2;
            }
            view.setImportantForAccessibility(i2);
        }
    }

    /* renamed from: u */
    private static Rect m2154u() {
        if (f2412j == null) {
            f2412j = new ThreadLocal<>();
        }
        Rect rect = f2412j.get();
        if (rect == null) {
            rect = new Rect();
            f2412j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: u0 */
    public static void m2155u0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }

    /* renamed from: v */
    public static boolean m2156v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: v0 */
    public static void m2157v0(View view, InterfaceC0306p interfaceC0306p) {
        if (Build.VERSION.SDK_INT >= 21) {
            h.m2191d(view, interfaceC0306p);
        }
    }

    /* renamed from: w */
    public static int m2158w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: w0 */
    public static void m2159w0(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: x */
    public static int m2160x(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: x0 */
    public static void m2161x0(View view, C0309s c0309s) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (c0309s != null ? c0309s.m2083a() : null));
        }
    }

    /* renamed from: y */
    public static int m2162y(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: y0 */
    public static void m2163y0(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    /* renamed from: z */
    public static int m2164z(View view) throws NoSuchFieldException {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f2407e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f2406d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2407e = true;
        }
        Field field = f2406d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: z0 */
    public static void m2165z0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f2408f == null) {
            f2408f = new WeakHashMap<>();
        }
        f2408f.put(view, str);
    }
}
