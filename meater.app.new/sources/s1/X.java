package s1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
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
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import e1.C3123e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import s1.C4421a;
import s1.C4444l0;
import t1.t;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class X {

    /* renamed from: a, reason: collision with root package name */
    private static WeakHashMap<View, C4434g0> f49081a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Field f49082b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f49083c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f49084d = {C3123e.f39994b, C3123e.f39995c, C3123e.f40006n, C3123e.f40017y, C3123e.f39975B, C3123e.f39976C, C3123e.f39977D, C3123e.f39978E, C3123e.f39979F, C3123e.f39980G, C3123e.f39996d, C3123e.f39997e, C3123e.f39998f, C3123e.f39999g, C3123e.f40000h, C3123e.f40001i, C3123e.f40002j, C3123e.f40003k, C3123e.f40004l, C3123e.f40005m, C3123e.f40007o, C3123e.f40008p, C3123e.f40009q, C3123e.f40010r, C3123e.f40011s, C3123e.f40012t, C3123e.f40013u, C3123e.f40014v, C3123e.f40015w, C3123e.f40016x, C3123e.f40018z, C3123e.f39974A};

    /* renamed from: e, reason: collision with root package name */
    private static final K f49085e = new K() { // from class: s1.W
        @Override // s1.K
        public final C4427d a(C4427d c4427d) {
            return X.V(c4427d);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final e f49086f = new e();

    /* compiled from: ViewCompat.java */
    class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.X.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.X.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.X.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.X.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.X.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.X.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat.java */
    class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.X.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.X.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.c(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.X.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat.java */
    class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.X.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.X.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.X.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    static abstract class f<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f49088a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f49089b;

        /* renamed from: c, reason: collision with root package name */
        private final int f49090c;

        /* renamed from: d, reason: collision with root package name */
        private final int f49091d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f49090c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T c(View view);

        abstract void d(View view, T t10);

        T e(View view) {
            if (b()) {
                return c(view);
            }
            T t10 = (T) view.getTag(this.f49088a);
            if (this.f49089b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        void f(View view, T t10) {
            if (b()) {
                d(view, t10);
            } else if (g(e(view), t10)) {
                X.j(view);
                view.setTag(this.f49088a, t10);
                X.W(view, this.f49091d);
            }
        }

        abstract boolean g(T t10, T t11);

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f49088a = i10;
            this.f49089b = cls;
            this.f49091d = i11;
            this.f49090c = i12;
        }
    }

    /* compiled from: ViewCompat.java */
    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    private static class h {

        /* compiled from: ViewCompat.java */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            C4469y0 f49092a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f49093b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ I f49094c;

            a(View view, I i10) {
                this.f49093b = view;
                this.f49094c = i10;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C4469y0 c4469y0X = C4469y0.x(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f49093b);
                    if (c4469y0X.equals(this.f49092a)) {
                        return this.f49094c.a(view, c4469y0X).v();
                    }
                }
                this.f49092a = c4469y0X;
                C4469y0 c4469y0A = this.f49094c.a(view, c4469y0X);
                if (i10 >= 30) {
                    return c4469y0A.v();
                }
                X.k0(view);
                return c4469y0A.v();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C3123e.f39992S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static C4469y0 b(View view, C4469y0 c4469y0, Rect rect) {
            WindowInsets windowInsetsV = c4469y0.v();
            if (windowInsetsV != null) {
                return C4469y0.x(view.computeSystemWindowInsets(windowInsetsV, rect), view);
            }
            rect.setEmpty();
            return c4469y0;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static float e(View view) {
            return view.getElevation();
        }

        static String f(View view) {
            return view.getTransitionName();
        }

        static float g(View view) {
            return view.getTranslationZ();
        }

        static float h(View view) {
            return view.getZ();
        }

        static boolean i(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void l(View view, float f10) {
            view.setElevation(f10);
        }

        static void m(View view, I i10) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C3123e.f39985L, i10);
            }
            if (i10 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C3123e.f39992S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, i10));
            }
        }

        static void n(View view, String str) {
            view.setTransitionName(str);
        }

        static void o(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void p(View view, float f10) {
            view.setZ(f10);
        }

        static void q(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    private static class i {
        public static C4469y0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C4469y0 c4469y0W = C4469y0.w(rootWindowInsets);
            c4469y0W.t(c4469y0W);
            c4469y0W.d(view.getRootView());
            return c4469y0W;
        }

        static void b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* compiled from: ViewCompat.java */
    static class j {
        static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* compiled from: ViewCompat.java */
    static class k {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    /* compiled from: ViewCompat.java */
    static class l {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* compiled from: ViewCompat.java */
    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* compiled from: ViewCompat.java */
    private static class n {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static X0 b(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return X0.e(windowInsetsController);
            }
            return null;
        }

        static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C4427d b(View view, C4427d c4427d) {
            ContentInfo contentInfoF = c4427d.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? c4427d : C4427d.g(contentInfoPerformReceiveContent);
        }
    }

    /* compiled from: ViewCompat.java */
    public interface p {
        boolean a(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat.java */
    static class q {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f49095d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f49096a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f49097b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f49098c = null;

        q() {
        }

        static q a(View view) {
            int i10 = C3123e.f39990Q;
            q qVar = (q) view.getTag(i10);
            if (qVar != null) {
                return qVar;
            }
            q qVar2 = new q();
            view.setTag(i10, qVar2);
            return qVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f49096a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f49097b == null) {
                this.f49097b = new SparseArray<>();
            }
            return this.f49097b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C3123e.f39991R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((p) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f49096a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f49095d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f49096a == null) {
                        this.f49096a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f49095d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f49096a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f49096a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f49098c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f49098c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    @Deprecated
    public static int A(View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static void A0(View view, int i10) {
        view.setLabelFor(i10);
    }

    @Deprecated
    public static int B(View view) {
        return view.getMinimumWidth();
    }

    public static void B0(View view, I i10) {
        h.m(view, i10);
    }

    public static String[] C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(C3123e.f39987N);
    }

    @Deprecated
    public static void C0(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    @Deprecated
    public static int D(View view) {
        return view.getPaddingEnd();
    }

    public static void D0(View view, M m10) {
        j.a(view, (PointerIcon) (m10 != null ? m10.a() : null));
    }

    @Deprecated
    public static int E(View view) {
        return view.getPaddingStart();
    }

    public static void E0(View view, boolean z10) {
        m0().f(view, Boolean.valueOf(z10));
    }

    public static C4469y0 F(View view) {
        return i.a(view);
    }

    public static void F0(View view, int i10, int i11) {
        i.b(view, i10, i11);
    }

    public static CharSequence G(View view) {
        return L0().e(view);
    }

    public static void G0(View view, CharSequence charSequence) {
        L0().f(view, charSequence);
    }

    public static String H(View view) {
        return h.f(view);
    }

    public static void H0(View view, String str) {
        h.n(view, str);
    }

    public static float I(View view) {
        return h.g(view);
    }

    public static void I0(View view, float f10) {
        h.o(view, f10);
    }

    @Deprecated
    public static X0 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return C4442k0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void J0(View view, C4444l0.b bVar) {
        C4444l0.d(view, bVar);
    }

    @Deprecated
    public static int K(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void K0(View view, float f10) {
        h.p(view, f10);
    }

    public static float L(View view) {
        return h.h(view);
    }

    private static f<CharSequence> L0() {
        return new c(C3123e.f39989P, CharSequence.class, 64, 30);
    }

    public static boolean M(View view) {
        return m(view) != null;
    }

    public static void M0(View view) {
        h.q(view);
    }

    @Deprecated
    public static boolean N(View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static boolean O(View view) {
        return view.hasTransientState();
    }

    public static boolean P(View view) {
        Boolean boolE = b().e(view);
        return boolE != null && boolE.booleanValue();
    }

    @Deprecated
    public static boolean Q(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean R(View view) {
        return view.isLaidOut();
    }

    public static boolean S(View view) {
        return h.i(view);
    }

    @Deprecated
    public static boolean T(View view) {
        return view.isPaddingRelative();
    }

    public static boolean U(View view) {
        Boolean boolE = m0().e(view);
        return boolE != null && boolE.booleanValue();
    }

    static void W(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(o(view));
                    y0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(o(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void X(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void Y(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static C4469y0 Z(View view, C4469y0 c4469y0) {
        WindowInsets windowInsetsV = c4469y0.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsV);
            if (!windowInsetsB.equals(windowInsetsV)) {
                return C4469y0.x(windowInsetsB, view);
            }
        }
        return c4469y0;
    }

    @Deprecated
    public static void a0(View view, t1.t tVar) {
        view.onInitializeAccessibilityNodeInfo(tVar.X0());
    }

    private static f<Boolean> b() {
        return new d(C3123e.f39983J, Boolean.class, 28);
    }

    private static f<CharSequence> b0() {
        return new b(C3123e.f39984K, CharSequence.class, 8, 28);
    }

    public static int c(View view, CharSequence charSequence, t1.w wVar) {
        int iQ = q(view, charSequence);
        if (iQ != -1) {
            d(view, new t.a(iQ, charSequence, wVar));
        }
        return iQ;
    }

    @Deprecated
    public static boolean c0(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    private static void d(View view, t.a aVar) {
        j(view);
        i0(aVar.b(), view);
        p(view).add(aVar);
        W(view, 0);
    }

    public static C4427d d0(View view, C4427d c4427d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c4427d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, c4427d);
        }
        J j10 = (J) view.getTag(C3123e.f39986M);
        if (j10 == null) {
            return v(view).a(c4427d);
        }
        C4427d c4427dA = j10.a(view, c4427d);
        if (c4427dA == null) {
            return null;
        }
        return v(view).a(c4427dA);
    }

    @Deprecated
    public static C4434g0 e(View view) {
        if (f49081a == null) {
            f49081a = new WeakHashMap<>();
        }
        C4434g0 c4434g0 = f49081a.get(view);
        if (c4434g0 != null) {
            return c4434g0;
        }
        C4434g0 c4434g02 = new C4434g0(view);
        f49081a.put(view, c4434g02);
        return c4434g02;
    }

    @Deprecated
    public static void e0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static C4469y0 f(View view, C4469y0 c4469y0, Rect rect) {
        return h.b(view, c4469y0, rect);
    }

    @Deprecated
    public static void f0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static C4469y0 g(View view, C4469y0 c4469y0) {
        WindowInsets windowInsetsV = c4469y0.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsV);
            if (!windowInsetsA.equals(windowInsetsV)) {
                return C4469y0.x(windowInsetsA, view);
            }
        }
        return c4469y0;
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    public static void g0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).b(view, keyEvent);
    }

    public static void h0(View view, int i10) {
        i0(i10, view);
        W(view, 0);
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).f(keyEvent);
    }

    private static void i0(int i10, View view) {
        List<t.a> listP = p(view);
        for (int i11 = 0; i11 < listP.size(); i11++) {
            if (listP.get(i11).b() == i10) {
                listP.remove(i11);
                return;
            }
        }
    }

    static void j(View view) {
        C4421a c4421aL = l(view);
        if (c4421aL == null) {
            c4421aL = new C4421a();
        }
        n0(view, c4421aL);
    }

    public static void j0(View view, t.a aVar, CharSequence charSequence, t1.w wVar) {
        if (wVar == null && charSequence == null) {
            h0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, wVar));
        }
    }

    @Deprecated
    public static int k() {
        return View.generateViewId();
    }

    public static void k0(View view) {
        g.c(view);
    }

    public static C4421a l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof C4421a.C0687a ? ((C4421a.C0687a) accessibilityDelegateM).f49112a : new C4421a(accessibilityDelegateM);
    }

    public static void l0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : n(view);
    }

    private static f<Boolean> m0() {
        return new a(C3123e.f39988O, Boolean.class, 28);
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f49083c) {
            return null;
        }
        if (f49082b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f49082b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f49083c = true;
                return null;
            }
        }
        try {
            Object obj = f49082b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f49083c = true;
            return null;
        }
    }

    public static void n0(View view, C4421a c4421a) {
        if (c4421a == null && (m(view) instanceof C4421a.C0687a)) {
            c4421a = new C4421a();
        }
        y0(view);
        view.setAccessibilityDelegate(c4421a == null ? null : c4421a.d());
    }

    public static CharSequence o(View view) {
        return b0().e(view);
    }

    public static void o0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    private static List<t.a> p(View view) {
        int i10 = C3123e.f39981H;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    @Deprecated
    public static void p0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    private static int q(View view, CharSequence charSequence) {
        List<t.a> listP = p(view);
        for (int i10 = 0; i10 < listP.size(); i10++) {
            if (TextUtils.equals(charSequence, listP.get(i10).c())) {
                return listP.get(i10).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f49084d;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listP.size(); i14++) {
                z10 &= listP.get(i14).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void q0(View view, CharSequence charSequence) {
        b0().f(view, charSequence);
        if (charSequence != null) {
            f49086f.a(view);
        } else {
            f49086f.d(view);
        }
    }

    public static ColorStateList r(View view) {
        return h.c(view);
    }

    @Deprecated
    public static void r0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static PorterDuff.Mode s(View view) {
        return h.d(view);
    }

    public static void s0(View view, ColorStateList colorStateList) {
        h.j(view, colorStateList);
    }

    @Deprecated
    public static Display t(View view) {
        return view.getDisplay();
    }

    public static void t0(View view, PorterDuff.Mode mode) {
        h.k(view, mode);
    }

    public static float u(View view) {
        return h.e(view);
    }

    @Deprecated
    public static void u0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static K v(View view) {
        return view instanceof K ? (K) view : f49085e;
    }

    public static void v0(View view, float f10) {
        h.l(view, f10);
    }

    @Deprecated
    public static boolean w(View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static void w0(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    @Deprecated
    public static int x(View view) {
        return view.getImportantForAccessibility();
    }

    @Deprecated
    public static void x0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    @SuppressLint({"InlinedApi"})
    public static int y(View view) {
        return k.a(view);
    }

    private static void y0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Deprecated
    public static int z(View view) {
        return view.getLayoutDirection();
    }

    public static void z0(View view, int i10) {
        k.b(view, i10);
    }

    /* compiled from: ViewCompat.java */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: B, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f49087B = new WeakHashMap<>();

        e() {
        }

        private void b(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                X.W(key, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f49087B.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f49087B.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f49087B.entrySet().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C4427d V(C4427d c4427d) {
        return c4427d;
    }
}
