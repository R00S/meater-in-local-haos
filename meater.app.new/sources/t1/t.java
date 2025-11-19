package t1;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import t1.w;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f49753a;

    /* renamed from: b, reason: collision with root package name */
    public int f49754b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f49755c = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final a f49756A;

        /* renamed from: B, reason: collision with root package name */
        public static final a f49757B;

        /* renamed from: C, reason: collision with root package name */
        public static final a f49758C;

        /* renamed from: D, reason: collision with root package name */
        public static final a f49759D;

        /* renamed from: E, reason: collision with root package name */
        public static final a f49760E;

        /* renamed from: F, reason: collision with root package name */
        public static final a f49761F;

        /* renamed from: G, reason: collision with root package name */
        public static final a f49762G;

        /* renamed from: H, reason: collision with root package name */
        public static final a f49763H;

        /* renamed from: I, reason: collision with root package name */
        public static final a f49764I;

        /* renamed from: J, reason: collision with root package name */
        public static final a f49765J;

        /* renamed from: K, reason: collision with root package name */
        public static final a f49766K;

        /* renamed from: L, reason: collision with root package name */
        public static final a f49767L;

        /* renamed from: M, reason: collision with root package name */
        public static final a f49768M;

        /* renamed from: N, reason: collision with root package name */
        public static final a f49769N;

        /* renamed from: O, reason: collision with root package name */
        public static final a f49770O;

        /* renamed from: P, reason: collision with root package name */
        public static final a f49771P;

        /* renamed from: Q, reason: collision with root package name */
        public static final a f49772Q;

        /* renamed from: R, reason: collision with root package name */
        public static final a f49773R;

        /* renamed from: S, reason: collision with root package name */
        public static final a f49774S;

        /* renamed from: T, reason: collision with root package name */
        public static final a f49775T;

        /* renamed from: U, reason: collision with root package name */
        public static final a f49776U;

        /* renamed from: V, reason: collision with root package name */
        public static final a f49777V;

        /* renamed from: e, reason: collision with root package name */
        public static final a f49778e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f49779f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f49780g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f49781h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f49782i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f49783j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f49784k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f49785l = new a(128, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f49786m = new a(256, (CharSequence) null, (Class<? extends w.a>) w.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f49787n = new a(512, (CharSequence) null, (Class<? extends w.a>) w.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f49788o = new a(1024, (CharSequence) null, (Class<? extends w.a>) w.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f49789p = new a(2048, (CharSequence) null, (Class<? extends w.a>) w.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f49790q = new a(4096, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f49791r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f49792s = new a(16384, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f49793t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f49794u = new a(65536, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f49795v = new a(131072, (CharSequence) null, (Class<? extends w.a>) w.g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f49796w = new a(262144, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f49797x = new a(524288, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f49798y = new a(1048576, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f49799z = new a(2097152, (CharSequence) null, (Class<? extends w.a>) w.h.class);

        /* renamed from: a, reason: collision with root package name */
        final Object f49800a;

        /* renamed from: b, reason: collision with root package name */
        private final int f49801b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<? extends w.a> f49802c;

        /* renamed from: d, reason: collision with root package name */
        protected final w f49803d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f49756A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f49757B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, w.e.class);
            f49758C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f49759D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f49760E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f49761F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f49762G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f49763H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f49764I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f49765J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f49766K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f49767L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, w.f.class);
            f49768M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, w.d.class);
            f49769N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f49770O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f49771P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f49772Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f49773R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f49774S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f49775T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f49776U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f49777V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, w wVar) {
            return new a(null, this.f49801b, charSequence, wVar, this.f49802c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f49800a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f49800a).getLabel();
        }

        public boolean d(View view, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            if (this.f49803d == null) {
                return false;
            }
            Class<? extends w.a> cls = this.f49802c;
            w.a aVar = null;
            if (cls != null) {
                try {
                    w.a aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e10) {
                        e = e10;
                        aVar = aVarNewInstance;
                        Class<? extends w.a> cls2 = this.f49802c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                        return this.f49803d.a(view, aVar);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            return this.f49803d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f49800a;
            return obj2 == null ? aVar.f49800a == null : obj2.equals(aVar.f49800a);
        }

        public int hashCode() {
            Object obj = this.f49800a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strH = t.h(this.f49801b);
            if (strH.equals("ACTION_UNKNOWN") && c() != null) {
                strH = c().toString();
            }
            sb2.append(strH);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, w wVar) {
            this(null, i10, charSequence, wVar, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends w.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, w wVar, Class<? extends w.a> cls) {
            this.f49801b = i10;
            this.f49803d = wVar;
            if (obj == null) {
                this.f49800a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f49800a = obj;
            }
            this.f49802c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        final Object f49804a;

        e(Object obj) {
            this.f49804a = obj;
        }

        public static e a(int i10, int i11, boolean z10, int i12) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        final Object f49805a;

        f(Object obj) {
            this.f49805a = obj;
        }

        public static f a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        final Object f49806a;

        g(Object obj) {
            this.f49806a = obj;
        }

        public static g a(int i10, float f10, float f11, float f12) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }
    }

    private t(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f49753a = accessibilityNodeInfo;
    }

    private boolean C() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static t U() {
        return Y0(AccessibilityNodeInfo.obtain());
    }

    public static t V(View view) {
        return Y0(AccessibilityNodeInfo.obtain(view));
    }

    public static t W(t tVar) {
        return Y0(AccessibilityNodeInfo.obtain(tVar.f49753a));
    }

    public static t Y0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new t(accessibilityNodeInfo);
    }

    private void c0(int i10, boolean z10) {
        Bundle bundleT = t();
        if (bundleT != null) {
            int i11 = bundleT.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleT.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private List<Integer> f(String str) {
        ArrayList<Integer> integerArrayList = this.f49753a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f49753a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String h(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
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
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
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
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
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
                        switch (i10) {
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
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean j(int i10) {
        Bundle bundleT = t();
        return bundleT != null && (bundleT.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public String A() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f49753a) : this.f49753a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void A0(int i10) {
        this.f49753a.setMaxTextLength(i10);
    }

    public String B() {
        return this.f49753a.getViewIdResourceName();
    }

    public void B0(int i10) {
        this.f49753a.setMovementGranularities(i10);
    }

    public void C0(CharSequence charSequence) {
        this.f49753a.setPackageName(charSequence);
    }

    public boolean D() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f49753a) : j(64);
    }

    public void D0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f49753a.setPaneTitle(charSequence);
        } else {
            this.f49753a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public boolean E() {
        return this.f49753a.isCheckable();
    }

    public void E0(View view) {
        this.f49754b = -1;
        this.f49753a.setParent(view);
    }

    public boolean F() {
        return this.f49753a.isChecked();
    }

    public void F0(View view, int i10) {
        this.f49754b = i10;
        this.f49753a.setParent(view, i10);
    }

    public boolean G() {
        return this.f49753a.isClickable();
    }

    public void G0(boolean z10) {
        this.f49753a.setPassword(z10);
    }

    public boolean H() {
        return this.f49753a.isContextClickable();
    }

    public void H0(g gVar) {
        this.f49753a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f49806a);
    }

    public boolean I() {
        return this.f49753a.isEnabled();
    }

    public void I0(CharSequence charSequence) {
        this.f49753a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean J() {
        return this.f49753a.isFocusable();
    }

    public void J0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f49753a.setScreenReaderFocusable(z10);
        } else {
            c0(1, z10);
        }
    }

    public boolean K() {
        return this.f49753a.isFocused();
    }

    public void K0(boolean z10) {
        this.f49753a.setScrollable(z10);
    }

    public boolean L() {
        return j(67108864);
    }

    public void L0(boolean z10) {
        this.f49753a.setSelected(z10);
    }

    public boolean M() {
        return this.f49753a.isImportantForAccessibility();
    }

    public void M0(boolean z10) {
        this.f49753a.setShowingHintText(z10);
    }

    public boolean N() {
        return this.f49753a.isLongClickable();
    }

    public void N0(View view, int i10) {
        this.f49755c = i10;
        this.f49753a.setSource(view, i10);
    }

    public boolean O() {
        return this.f49753a.isPassword();
    }

    public void O0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f49753a, charSequence);
        } else {
            this.f49753a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean P() {
        return this.f49753a.isScrollable();
    }

    public void P0(CharSequence charSequence) {
        this.f49753a.setText(charSequence);
    }

    public boolean Q() {
        return this.f49753a.isSelected();
    }

    public void Q0(int i10, int i11) {
        this.f49753a.setTextSelection(i10, i11);
    }

    public boolean R() {
        return this.f49753a.isShowingHintText();
    }

    public void R0(View view) {
        this.f49753a.setTraversalAfter(view);
    }

    public boolean S() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f49753a) : j(8388608);
    }

    public void S0(View view, int i10) {
        this.f49753a.setTraversalAfter(view, i10);
    }

    public boolean T() {
        return this.f49753a.isVisibleToUser();
    }

    public void T0(View view) {
        this.f49753a.setTraversalBefore(view);
    }

    public void U0(View view, int i10) {
        this.f49753a.setTraversalBefore(view, i10);
    }

    public void V0(String str) {
        this.f49753a.setViewIdResourceName(str);
    }

    public void W0(boolean z10) {
        this.f49753a.setVisibleToUser(z10);
    }

    public boolean X(int i10, Bundle bundle) {
        return this.f49753a.performAction(i10, bundle);
    }

    public AccessibilityNodeInfo X0() {
        return this.f49753a;
    }

    public boolean Z(a aVar) {
        return this.f49753a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f49800a);
    }

    public void a(int i10) {
        this.f49753a.addAction(i10);
    }

    public void a0(boolean z10) {
        this.f49753a.setAccessibilityFocused(z10);
    }

    public void b(a aVar) {
        this.f49753a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f49800a);
    }

    public void b0(List<String> list) {
        this.f49753a.setAvailableExtraData(list);
    }

    public void c(View view) {
        this.f49753a.addChild(view);
    }

    public void d(View view, int i10) {
        this.f49753a.addChild(view, i10);
    }

    @Deprecated
    public void d0(Rect rect) {
        this.f49753a.setBoundsInParent(rect);
    }

    public void e0(Rect rect) {
        this.f49753a.setBoundsInScreen(rect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f49753a;
        if (accessibilityNodeInfo == null) {
            if (tVar.f49753a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(tVar.f49753a)) {
            return false;
        }
        return this.f49755c == tVar.f49755c && this.f49754b == tVar.f49754b;
    }

    public void f0(boolean z10) {
        this.f49753a.setCheckable(z10);
    }

    public List<a> g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f49753a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public void g0(boolean z10) {
        this.f49753a.setChecked(z10);
    }

    public void h0(CharSequence charSequence) {
        this.f49753a.setClassName(charSequence);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f49753a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f49753a.getActions();
    }

    public void i0(boolean z10) {
        this.f49753a.setClickable(z10);
    }

    public void j0(Object obj) {
        this.f49753a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f49804a);
    }

    @Deprecated
    public void k(Rect rect) {
        this.f49753a.getBoundsInParent(rect);
    }

    public void k0(Object obj) {
        this.f49753a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f49805a);
    }

    public void l(Rect rect) {
        this.f49753a.getBoundsInScreen(rect);
    }

    public void l0(CharSequence charSequence) {
        this.f49753a.setContentDescription(charSequence);
    }

    public void m(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f49753a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f49753a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void m0(boolean z10) {
        this.f49753a.setContentInvalid(z10);
    }

    public int n() {
        return this.f49753a.getChildCount();
    }

    public void n0(boolean z10) {
        this.f49753a.setDismissable(z10);
    }

    public CharSequence o() {
        return this.f49753a.getClassName();
    }

    public void o0(boolean z10) {
        this.f49753a.setEditable(z10);
    }

    public void p0(boolean z10) {
        this.f49753a.setEnabled(z10);
    }

    public CharSequence q() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f49753a) : this.f49753a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void q0(CharSequence charSequence) {
        this.f49753a.setError(charSequence);
    }

    public CharSequence r() {
        return this.f49753a.getContentDescription();
    }

    public void r0(boolean z10) {
        this.f49753a.setFocusable(z10);
    }

    public CharSequence s() {
        return this.f49753a.getError();
    }

    public void s0(boolean z10) {
        this.f49753a.setFocused(z10);
    }

    public Bundle t() {
        return this.f49753a.getExtras();
    }

    public void t0(boolean z10) {
        c0(67108864, z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb2.append("; boundsInParent: " + rect);
        l(rect);
        sb2.append("; boundsInScreen: " + rect);
        m(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(w());
        sb2.append("; className: ");
        sb2.append(o());
        sb2.append("; text: ");
        sb2.append(y());
        sb2.append("; error: ");
        sb2.append(s());
        sb2.append("; maxTextLength: ");
        sb2.append(u());
        sb2.append("; stateDescription: ");
        sb2.append(x());
        sb2.append("; contentDescription: ");
        sb2.append(r());
        sb2.append("; tooltipText: ");
        sb2.append(z());
        sb2.append("; viewIdResName: ");
        sb2.append(B());
        sb2.append("; uniqueId: ");
        sb2.append(A());
        sb2.append("; checkable: ");
        sb2.append(E());
        sb2.append("; checked: ");
        sb2.append(F());
        sb2.append("; focusable: ");
        sb2.append(J());
        sb2.append("; focused: ");
        sb2.append(K());
        sb2.append("; selected: ");
        sb2.append(Q());
        sb2.append("; clickable: ");
        sb2.append(G());
        sb2.append("; longClickable: ");
        sb2.append(N());
        sb2.append("; contextClickable: ");
        sb2.append(H());
        sb2.append("; enabled: ");
        sb2.append(I());
        sb2.append("; password: ");
        sb2.append(O());
        sb2.append("; scrollable: " + P());
        sb2.append("; containerTitle: ");
        sb2.append(q());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(L());
        sb2.append("; importantForAccessibility: ");
        sb2.append(M());
        sb2.append("; visible: ");
        sb2.append(T());
        sb2.append("; isTextSelectable: ");
        sb2.append(S());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(D());
        sb2.append("; [");
        List<a> listG = g();
        for (int i10 = 0; i10 < listG.size(); i10++) {
            a aVar = listG.get(i10);
            String strH = h(aVar.b());
            if (strH.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strH = aVar.c().toString();
            }
            sb2.append(strH);
            if (i10 != listG.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public int u() {
        return this.f49753a.getMaxTextLength();
    }

    public void u0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f49753a.setHeading(z10);
        } else {
            c0(2, z10);
        }
    }

    public int v() {
        return this.f49753a.getMovementGranularities();
    }

    public void v0(CharSequence charSequence) {
        this.f49753a.setHintText(charSequence);
    }

    public CharSequence w() {
        return this.f49753a.getPackageName();
    }

    public void w0(boolean z10) {
        this.f49753a.setImportantForAccessibility(z10);
    }

    public CharSequence x() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f49753a) : this.f49753a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void x0(View view) {
        this.f49753a.setLabelFor(view);
    }

    public CharSequence y() {
        if (!C()) {
            return this.f49753a.getText();
        }
        List<Integer> listF = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listF2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listF3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listF4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f49753a.getText(), 0, this.f49753a.getText().length()));
        for (int i10 = 0; i10 < listF.size(); i10++) {
            spannableString.setSpan(new C4537a(listF4.get(i10).intValue(), this, t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listF.get(i10).intValue(), listF2.get(i10).intValue(), listF3.get(i10).intValue());
        }
        return spannableString;
    }

    public void y0(int i10) {
        this.f49753a.setLiveRegion(i10);
    }

    public CharSequence z() {
        return Build.VERSION.SDK_INT >= 28 ? this.f49753a.getTooltipText() : this.f49753a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void z0(boolean z10) {
        this.f49753a.setLongClickable(z10);
    }

    @Deprecated
    public void Y() {
    }

    public void e(CharSequence charSequence, View view) {
    }
}
