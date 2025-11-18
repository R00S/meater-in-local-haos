package androidx.core.view.p004d0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.os.C0272a;
import androidx.core.view.p004d0.InterfaceC0292f;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.file.CacheHelper;
import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
import p024c.p052i.C0921c;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* renamed from: androidx.core.view.d0.c */
/* loaded from: classes.dex */
public class C0289c {

    /* renamed from: a */
    private static int f2331a;

    /* renamed from: b */
    private final AccessibilityNodeInfo f2332b;

    /* renamed from: c */
    public int f2333c = -1;

    /* renamed from: d */
    private int f2334d = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: androidx.core.view.d0.c$a */
    public static class a {

        /* renamed from: A */
        public static final a f2335A;

        /* renamed from: B */
        public static final a f2336B;

        /* renamed from: C */
        public static final a f2337C;

        /* renamed from: D */
        public static final a f2338D;

        /* renamed from: E */
        public static final a f2339E;

        /* renamed from: F */
        public static final a f2340F;

        /* renamed from: G */
        public static final a f2341G;

        /* renamed from: H */
        public static final a f2342H;

        /* renamed from: I */
        public static final a f2343I;

        /* renamed from: J */
        public static final a f2344J;

        /* renamed from: K */
        public static final a f2345K;

        /* renamed from: L */
        public static final a f2346L;

        /* renamed from: M */
        public static final a f2347M;

        /* renamed from: a */
        public static final a f2348a = new a(1, null);

        /* renamed from: b */
        public static final a f2349b = new a(2, null);

        /* renamed from: c */
        public static final a f2350c = new a(4, null);

        /* renamed from: d */
        public static final a f2351d = new a(8, null);

        /* renamed from: e */
        public static final a f2352e = new a(16, null);

        /* renamed from: f */
        public static final a f2353f = new a(32, null);

        /* renamed from: g */
        public static final a f2354g = new a(64, null);

        /* renamed from: h */
        public static final a f2355h = new a(128, null);

        /* renamed from: i */
        public static final a f2356i = new a(256, null, InterfaceC0292f.b.class);

        /* renamed from: j */
        public static final a f2357j = new a(AdRequest.MAX_CONTENT_URL_LENGTH, null, InterfaceC0292f.b.class);

        /* renamed from: k */
        public static final a f2358k = new a(1024, null, InterfaceC0292f.c.class);

        /* renamed from: l */
        public static final a f2359l = new a(RecyclerView.AbstractC0599l.FLAG_MOVED, null, InterfaceC0292f.c.class);

        /* renamed from: m */
        public static final a f2360m = new a(RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT, null);

        /* renamed from: n */
        public static final a f2361n = new a(8192, null);

        /* renamed from: o */
        public static final a f2362o = new a(Http2.INITIAL_MAX_FRAME_SIZE, null);

        /* renamed from: p */
        public static final a f2363p = new a(32768, null);

        /* renamed from: q */
        public static final a f2364q = new a(65536, null);

        /* renamed from: r */
        public static final a f2365r = new a(131072, null, InterfaceC0292f.g.class);

        /* renamed from: s */
        public static final a f2366s = new a(262144, null);

        /* renamed from: t */
        public static final a f2367t = new a(524288, null);

        /* renamed from: u */
        public static final a f2368u = new a(CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES, null);

        /* renamed from: v */
        public static final a f2369v = new a(2097152, null, InterfaceC0292f.h.class);

        /* renamed from: w */
        public static final a f2370w;

        /* renamed from: x */
        public static final a f2371x;

        /* renamed from: y */
        public static final a f2372y;

        /* renamed from: z */
        public static final a f2373z;

        /* renamed from: N */
        final Object f2374N;

        /* renamed from: O */
        private final int f2375O;

        /* renamed from: P */
        private final Class<? extends InterfaceC0292f.a> f2376P;

        /* renamed from: Q */
        protected final InterfaceC0292f f2377Q;

        static {
            int i2 = Build.VERSION.SDK_INT;
            f2370w = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            f2371x = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC0292f.e.class);
            f2372y = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            f2373z = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            f2335A = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            f2336B = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            f2337C = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f2338D = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f2339E = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f2340F = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f2341G = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            f2342H = new a(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, InterfaceC0292f.f.class);
            f2343I = new a(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, InterfaceC0292f.d.class);
            f2344J = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f2345K = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f2346L = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f2347M = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        /* renamed from: a */
        public a m2012a(CharSequence charSequence, InterfaceC0292f interfaceC0292f) {
            return new a(null, this.f2375O, charSequence, interfaceC0292f, this.f2376P);
        }

        /* renamed from: b */
        public int m2013b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2374N).getId();
            }
            return 0;
        }

        /* renamed from: c */
        public CharSequence m2014c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2374N).getLabel();
            }
            return null;
        }

        /* renamed from: d */
        public boolean m2015d(View view, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            if (this.f2377Q == null) {
                return false;
            }
            InterfaceC0292f.a aVar = null;
            Class<? extends InterfaceC0292f.a> cls = this.f2376P;
            if (cls != null) {
                try {
                    InterfaceC0292f.a aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        aVarNewInstance.m2033a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e2) {
                        e = e2;
                        aVar = aVarNewInstance;
                        Class<? extends InterfaceC0292f.a> cls2 = this.f2376P;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                        return this.f2377Q.mo2032a(view, aVar);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            return this.f2377Q.mo2032a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f2374N;
            return obj2 == null ? aVar.f2374N == null : obj2.equals(aVar.f2374N);
        }

        public int hashCode() {
            Object obj = this.f2374N;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends InterfaceC0292f.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        a(Object obj, int i2, CharSequence charSequence, InterfaceC0292f interfaceC0292f, Class<? extends InterfaceC0292f.a> cls) {
            this.f2375O = i2;
            this.f2377Q = interfaceC0292f;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                this.f2374N = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.f2374N = obj;
            }
            this.f2376P = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: androidx.core.view.d0.c$b */
    public static class b {

        /* renamed from: a */
        final Object f2378a;

        b(Object obj) {
            this.f2378a = obj;
        }

        /* renamed from: a */
        public static b m2016a(int i2, int i3, boolean z, int i4) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z, i4)) : i5 >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z)) : new b(null);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: androidx.core.view.d0.c$c */
    public static class c {

        /* renamed from: a */
        final Object f2379a;

        c(Object obj) {
            this.f2379a = obj;
        }

        /* renamed from: f */
        public static c m2017f(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
            int i6 = Build.VERSION.SDK_INT;
            return i6 >= 21 ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z, z2)) : i6 >= 19 ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z)) : new c(null);
        }

        /* renamed from: a */
        public int m2018a() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f2379a).getColumnIndex();
            }
            return 0;
        }

        /* renamed from: b */
        public int m2019b() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f2379a).getColumnSpan();
            }
            return 0;
        }

        /* renamed from: c */
        public int m2020c() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f2379a).getRowIndex();
            }
            return 0;
        }

        /* renamed from: d */
        public int m2021d() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f2379a).getRowSpan();
            }
            return 0;
        }

        /* renamed from: e */
        public boolean m2022e() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f2379a).isSelected();
            }
            return false;
        }
    }

    private C0289c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2332b = accessibilityNodeInfo;
    }

    /* renamed from: L */
    public static C0289c m1935L() {
        return m1949y0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: M */
    public static C0289c m1936M(View view) {
        return m1949y0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: N */
    public static C0289c m1937N(C0289c c0289c) {
        return m1949y0(AccessibilityNodeInfo.obtain(c0289c.f2332b));
    }

    /* renamed from: R */
    private void m1938R(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayM1947v = m1947v(view);
        if (sparseArrayM1947v != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < sparseArrayM1947v.size(); i2++) {
                if (sparseArrayM1947v.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                sparseArrayM1947v.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    /* renamed from: T */
    private void m1939T(int i2, boolean z) {
        Bundle bundleM2002s = m2002s();
        if (bundleM2002s != null) {
            int i3 = bundleM2002s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i2 ^ (-1));
            if (!z) {
                i2 = 0;
            }
            bundleM2002s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    /* renamed from: d */
    private void m1940d(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        m1942g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m1942g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m1942g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m1942g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
    }

    /* renamed from: f */
    private void m1941f() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2332b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f2332b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f2332b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f2332b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: g */
    private List<Integer> m1942g(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f2332b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f2332b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: i */
    private static String m1943i(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case RecyclerView.AbstractC0599l.FLAG_MOVED /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i2) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: k */
    private boolean m1944k(int i2) {
        Bundle bundleM2002s = m2002s();
        return bundleM2002s != null && (bundleM2002s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i2) == i2;
    }

    /* renamed from: p */
    public static ClickableSpan[] m1945p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: t */
    private SparseArray<WeakReference<ClickableSpan>> m1946t(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayM1947v = m1947v(view);
        if (sparseArrayM1947v != null) {
            return sparseArrayM1947v;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C0921c.f6205I, sparseArray);
        return sparseArray;
    }

    /* renamed from: v */
    private SparseArray<WeakReference<ClickableSpan>> m1947v(View view) {
        return (SparseArray) view.getTag(C0921c.f6205I);
    }

    /* renamed from: y */
    private boolean m1948y() {
        return !m1942g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: y0 */
    public static C0289c m1949y0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0289c(accessibilityNodeInfo);
    }

    /* renamed from: z */
    private int m1950z(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals(sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = f2331a;
        f2331a = i3 + 1;
        return i3;
    }

    /* renamed from: A */
    public boolean m1951A() {
        return this.f2332b.isCheckable();
    }

    /* renamed from: B */
    public boolean m1952B() {
        return this.f2332b.isChecked();
    }

    /* renamed from: C */
    public boolean m1953C() {
        return this.f2332b.isClickable();
    }

    /* renamed from: D */
    public boolean m1954D() {
        return this.f2332b.isEnabled();
    }

    /* renamed from: E */
    public boolean m1955E() {
        return this.f2332b.isFocusable();
    }

    /* renamed from: F */
    public boolean m1956F() {
        return this.f2332b.isFocused();
    }

    /* renamed from: G */
    public boolean m1957G() {
        return this.f2332b.isLongClickable();
    }

    /* renamed from: H */
    public boolean m1958H() {
        return this.f2332b.isPassword();
    }

    /* renamed from: I */
    public boolean m1959I() {
        return this.f2332b.isScrollable();
    }

    /* renamed from: J */
    public boolean m1960J() {
        return this.f2332b.isSelected();
    }

    /* renamed from: K */
    public boolean m1961K() {
        return Build.VERSION.SDK_INT >= 26 ? this.f2332b.isShowingHintText() : m1944k(4);
    }

    /* renamed from: O */
    public boolean m1962O(int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2332b.performAction(i2, bundle);
        }
        return false;
    }

    /* renamed from: P */
    public void m1963P() {
        this.f2332b.recycle();
    }

    /* renamed from: Q */
    public boolean m1964Q(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f2332b.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2374N);
        }
        return false;
    }

    /* renamed from: S */
    public void m1965S(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2332b.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    /* renamed from: U */
    public void m1966U(Rect rect) {
        this.f2332b.setBoundsInParent(rect);
    }

    /* renamed from: V */
    public void m1967V(Rect rect) {
        this.f2332b.setBoundsInScreen(rect);
    }

    /* renamed from: W */
    public void m1968W(boolean z) {
        this.f2332b.setCheckable(z);
    }

    /* renamed from: X */
    public void m1969X(boolean z) {
        this.f2332b.setChecked(z);
    }

    /* renamed from: Y */
    public void m1970Y(CharSequence charSequence) {
        this.f2332b.setClassName(charSequence);
    }

    /* renamed from: Z */
    public void m1971Z(boolean z) {
        this.f2332b.setClickable(z);
    }

    /* renamed from: a */
    public void m1972a(int i2) {
        this.f2332b.addAction(i2);
    }

    /* renamed from: a0 */
    public void m1973a0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2332b.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f2378a);
        }
    }

    /* renamed from: b */
    public void m1974b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2332b.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2374N);
        }
    }

    /* renamed from: b0 */
    public void m1975b0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2332b.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f2379a);
        }
    }

    /* renamed from: c */
    public void m1976c(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2332b.addChild(view, i2);
        }
    }

    /* renamed from: c0 */
    public void m1977c0(CharSequence charSequence) {
        this.f2332b.setContentDescription(charSequence);
    }

    /* renamed from: d0 */
    public void m1978d0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2332b.setDismissable(z);
        }
    }

    /* renamed from: e */
    public void m1979e(CharSequence charSequence, View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19 || i2 >= 26) {
            return;
        }
        m1941f();
        m1938R(view);
        ClickableSpan[] clickableSpanArrM1945p = m1945p(charSequence);
        if (clickableSpanArrM1945p == null || clickableSpanArrM1945p.length <= 0) {
            return;
        }
        m2002s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C0921c.f6215a);
        SparseArray<WeakReference<ClickableSpan>> sparseArrayM1946t = m1946t(view);
        for (int i3 = 0; i3 < clickableSpanArrM1945p.length; i3++) {
            int iM1950z = m1950z(clickableSpanArrM1945p[i3], sparseArrayM1946t);
            sparseArrayM1946t.put(iM1950z, new WeakReference<>(clickableSpanArrM1945p[i3]));
            m1940d(clickableSpanArrM1945p[i3], (Spanned) charSequence, iM1950z);
        }
    }

    /* renamed from: e0 */
    public void m1980e0(boolean z) {
        this.f2332b.setEnabled(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0289c)) {
            return false;
        }
        C0289c c0289c = (C0289c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2332b;
        if (accessibilityNodeInfo == null) {
            if (c0289c.f2332b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c0289c.f2332b)) {
            return false;
        }
        return this.f2334d == c0289c.f2334d && this.f2333c == c0289c.f2333c;
    }

    /* renamed from: f0 */
    public void m1981f0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2332b.setError(charSequence);
        }
    }

    /* renamed from: g0 */
    public void m1982g0(boolean z) {
        this.f2332b.setFocusable(z);
    }

    /* renamed from: h */
    public List<a> m1983h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f2332b.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a(actionList.get(i2)));
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public void m1984h0(boolean z) {
        this.f2332b.setFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2332b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i0 */
    public void m1985i0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2332b.setHeading(z);
        } else {
            m1939T(2, z);
        }
    }

    /* renamed from: j */
    public int m1986j() {
        return this.f2332b.getActions();
    }

    /* renamed from: j0 */
    public void m1987j0(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f2332b.setHintText(charSequence);
        } else if (i2 >= 19) {
            this.f2332b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: k0 */
    public void m1988k0(int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2332b.setMaxTextLength(i2);
        }
    }

    @Deprecated
    /* renamed from: l */
    public void m1989l(Rect rect) {
        this.f2332b.getBoundsInParent(rect);
    }

    /* renamed from: l0 */
    public void m1990l0(CharSequence charSequence) {
        this.f2332b.setPackageName(charSequence);
    }

    /* renamed from: m */
    public void m1991m(Rect rect) {
        this.f2332b.getBoundsInScreen(rect);
    }

    /* renamed from: m0 */
    public void m1992m0(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.f2332b.setPaneTitle(charSequence);
        } else if (i2 >= 19) {
            this.f2332b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: n */
    public int m1993n() {
        return this.f2332b.getChildCount();
    }

    /* renamed from: n0 */
    public void m1994n0(View view) {
        this.f2333c = -1;
        this.f2332b.setParent(view);
    }

    /* renamed from: o */
    public CharSequence m1995o() {
        return this.f2332b.getClassName();
    }

    /* renamed from: o0 */
    public void m1996o0(View view, int i2) {
        this.f2333c = i2;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2332b.setParent(view, i2);
        }
    }

    /* renamed from: p0 */
    public void m1997p0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2332b.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    /* renamed from: q */
    public c m1998q() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT < 19 || (collectionItemInfo = this.f2332b.getCollectionItemInfo()) == null) {
            return null;
        }
        return new c(collectionItemInfo);
    }

    /* renamed from: q0 */
    public void m1999q0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2332b.setScreenReaderFocusable(z);
        } else {
            m1939T(1, z);
        }
    }

    /* renamed from: r */
    public CharSequence m2000r() {
        return this.f2332b.getContentDescription();
    }

    /* renamed from: r0 */
    public void m2001r0(boolean z) {
        this.f2332b.setScrollable(z);
    }

    /* renamed from: s */
    public Bundle m2002s() {
        return Build.VERSION.SDK_INT >= 19 ? this.f2332b.getExtras() : new Bundle();
    }

    /* renamed from: s0 */
    public void m2003s0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2332b.setShowingHintText(z);
        } else {
            m1939T(4, z);
        }
    }

    /* renamed from: t0 */
    public void m2004t0(View view, int i2) {
        this.f2334d = i2;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2332b.setSource(view, i2);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m1989l(rect);
        sb.append("; boundsInParent: " + rect);
        m1991m(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m2005u());
        sb.append("; className: ");
        sb.append(m1995o());
        sb.append("; text: ");
        sb.append(m2008w());
        sb.append("; contentDescription: ");
        sb.append(m2000r());
        sb.append("; viewId: ");
        sb.append(m2010x());
        sb.append("; checkable: ");
        sb.append(m1951A());
        sb.append("; checked: ");
        sb.append(m1952B());
        sb.append("; focusable: ");
        sb.append(m1955E());
        sb.append("; focused: ");
        sb.append(m1956F());
        sb.append("; selected: ");
        sb.append(m1960J());
        sb.append("; clickable: ");
        sb.append(m1953C());
        sb.append("; longClickable: ");
        sb.append(m1957G());
        sb.append("; enabled: ");
        sb.append(m1954D());
        sb.append("; password: ");
        sb.append(m1958H());
        sb.append("; scrollable: " + m1959I());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> listM1983h = m1983h();
            for (int i2 = 0; i2 < listM1983h.size(); i2++) {
                a aVar = listM1983h.get(i2);
                String strM1943i = m1943i(aVar.m2013b());
                if (strM1943i.equals("ACTION_UNKNOWN") && aVar.m2014c() != null) {
                    strM1943i = aVar.m2014c().toString();
                }
                sb.append(strM1943i);
                if (i2 != listM1983h.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int iM1986j = m1986j();
            while (iM1986j != 0) {
                int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(iM1986j);
                iM1986j &= iNumberOfTrailingZeros ^ (-1);
                sb.append(m1943i(iNumberOfTrailingZeros));
                if (iM1986j != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public CharSequence m2005u() {
        return this.f2332b.getPackageName();
    }

    /* renamed from: u0 */
    public void m2006u0(CharSequence charSequence) {
        if (C0272a.m1832b()) {
            this.f2332b.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f2332b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: v0 */
    public void m2007v0(CharSequence charSequence) {
        this.f2332b.setText(charSequence);
    }

    /* renamed from: w */
    public CharSequence m2008w() {
        if (!m1948y()) {
            return this.f2332b.getText();
        }
        List<Integer> listM1942g = m1942g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listM1942g2 = m1942g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listM1942g3 = m1942g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listM1942g4 = m1942g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2332b.getText(), 0, this.f2332b.getText().length()));
        for (int i2 = 0; i2 < listM1942g.size(); i2++) {
            spannableString.setSpan(new C0287a(listM1942g4.get(i2).intValue(), this, m2002s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listM1942g.get(i2).intValue(), listM1942g2.get(i2).intValue(), listM1942g3.get(i2).intValue());
        }
        return spannableString;
    }

    /* renamed from: w0 */
    public void m2009w0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2332b.setVisibleToUser(z);
        }
    }

    /* renamed from: x */
    public String m2010x() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f2332b.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: x0 */
    public AccessibilityNodeInfo m2011x0() {
        return this.f2332b;
    }
}
