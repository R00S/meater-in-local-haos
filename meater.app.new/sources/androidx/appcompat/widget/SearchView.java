package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import w1.AbstractC4971a;
import y1.AbstractC5121a;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* renamed from: Q0, reason: collision with root package name */
    static final o f21362Q0;

    /* renamed from: A0, reason: collision with root package name */
    private boolean f21363A0;

    /* renamed from: B0, reason: collision with root package name */
    private CharSequence f21364B0;

    /* renamed from: C0, reason: collision with root package name */
    private CharSequence f21365C0;

    /* renamed from: D0, reason: collision with root package name */
    private boolean f21366D0;

    /* renamed from: E0, reason: collision with root package name */
    private int f21367E0;

    /* renamed from: F0, reason: collision with root package name */
    SearchableInfo f21368F0;

    /* renamed from: G0, reason: collision with root package name */
    private Bundle f21369G0;

    /* renamed from: H0, reason: collision with root package name */
    private final Runnable f21370H0;

    /* renamed from: I0, reason: collision with root package name */
    private Runnable f21371I0;

    /* renamed from: J0, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f21372J0;

    /* renamed from: K0, reason: collision with root package name */
    private final View.OnClickListener f21373K0;

    /* renamed from: L0, reason: collision with root package name */
    View.OnKeyListener f21374L0;

    /* renamed from: M0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f21375M0;

    /* renamed from: N0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f21376N0;

    /* renamed from: O0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f21377O0;

    /* renamed from: P0, reason: collision with root package name */
    private TextWatcher f21378P0;

    /* renamed from: Q, reason: collision with root package name */
    final SearchAutoComplete f21379Q;

    /* renamed from: R, reason: collision with root package name */
    private final View f21380R;

    /* renamed from: S, reason: collision with root package name */
    private final View f21381S;

    /* renamed from: T, reason: collision with root package name */
    private final View f21382T;

    /* renamed from: U, reason: collision with root package name */
    final ImageView f21383U;

    /* renamed from: V, reason: collision with root package name */
    final ImageView f21384V;

    /* renamed from: W, reason: collision with root package name */
    final ImageView f21385W;

    /* renamed from: a0, reason: collision with root package name */
    final ImageView f21386a0;

    /* renamed from: b0, reason: collision with root package name */
    private final View f21387b0;

    /* renamed from: c0, reason: collision with root package name */
    private q f21388c0;

    /* renamed from: d0, reason: collision with root package name */
    private Rect f21389d0;

    /* renamed from: e0, reason: collision with root package name */
    private Rect f21390e0;

    /* renamed from: f0, reason: collision with root package name */
    private int[] f21391f0;

    /* renamed from: g0, reason: collision with root package name */
    private int[] f21392g0;

    /* renamed from: h0, reason: collision with root package name */
    private final ImageView f21393h0;

    /* renamed from: i0, reason: collision with root package name */
    private final Drawable f21394i0;

    /* renamed from: j0, reason: collision with root package name */
    private final int f21395j0;

    /* renamed from: k0, reason: collision with root package name */
    private final int f21396k0;

    /* renamed from: l0, reason: collision with root package name */
    private final Intent f21397l0;

    /* renamed from: m0, reason: collision with root package name */
    private final Intent f21398m0;

    /* renamed from: n0, reason: collision with root package name */
    private final CharSequence f21399n0;

    /* renamed from: o0, reason: collision with root package name */
    private m f21400o0;

    /* renamed from: p0, reason: collision with root package name */
    private l f21401p0;

    /* renamed from: q0, reason: collision with root package name */
    View.OnFocusChangeListener f21402q0;

    /* renamed from: r0, reason: collision with root package name */
    private View.OnClickListener f21403r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f21404s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f21405t0;

    /* renamed from: u0, reason: collision with root package name */
    AbstractC4971a f21406u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f21407v0;

    /* renamed from: w0, reason: collision with root package name */
    private CharSequence f21408w0;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f21409x0;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f21410y0;

    /* renamed from: z0, reason: collision with root package name */
    private int f21411z0;

    public static class SearchAutoComplete extends C1982d {

        /* renamed from: F, reason: collision with root package name */
        private int f21412F;

        /* renamed from: G, reason: collision with root package name */
        private SearchView f21413G;

        /* renamed from: H, reason: collision with root package name */
        private boolean f21414H;

        /* renamed from: I, reason: collision with root package name */
        final Runnable f21415I;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, i.a.f42409p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f21362Q0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f21414H) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f21414H = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f21412F <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C1982d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f21414H) {
                removeCallbacks(this.f21415I);
                post(this.f21415I);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z10, i10, rect);
            this.f21413G.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f21413G.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f21413G.hasFocus() && getVisibility() == 0) {
                this.f21414H = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f21414H = false;
                removeCallbacks(this.f21415I);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f21414H = true;
                    return;
                }
                this.f21414H = false;
                removeCallbacks(this.f21415I);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f21413G = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f21412F = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f21415I = new a();
            this.f21412F = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4971a abstractC4971a = SearchView.this.f21406u0;
            if (abstractC4971a instanceof U) {
                abstractC4971a.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f21402q0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SearchView searchView = SearchView.this;
            if (view == searchView.f21383U) {
                searchView.V();
                return;
            }
            if (view == searchView.f21385W) {
                searchView.R();
                return;
            }
            if (view == searchView.f21384V) {
                searchView.W();
            } else if (view == searchView.f21386a0) {
                searchView.a0();
            } else if (view == searchView.f21379Q) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f21368F0 == null) {
                return false;
            }
            if (searchView.f21379Q.isPopupShowing() && SearchView.this.f21379Q.getListSelection() != -1) {
                return SearchView.this.X(view, i10, keyEvent);
            }
            if (SearchView.this.f21379Q.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.f21379Q.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.S(i10, 0, null);
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean onClose();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
    }

    private static class o {

        /* renamed from: a, reason: collision with root package name */
        private Method f21427a;

        /* renamed from: b, reason: collision with root package name */
        private Method f21428b;

        /* renamed from: c, reason: collision with root package name */
        private Method f21429c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        o() throws NoSuchMethodException, SecurityException {
            this.f21427a = null;
            this.f21428b = null;
            this.f21429c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f21427a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f21428b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f21429c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f21428b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f21427a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f21429c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends AbstractC5121a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: D, reason: collision with root package name */
        boolean f21430D;

        class a implements Parcelable.ClassLoaderCreator<p> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f21430D + "}";
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f21430D));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f21430D = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class q extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f21431a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f21432b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f21433c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f21434d;

        /* renamed from: e, reason: collision with root package name */
        private final int f21435e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f21436f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f21435e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f21432b = new Rect();
            this.f21434d = new Rect();
            this.f21433c = new Rect();
            a(rect, rect2);
            this.f21431a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f21432b.set(rect);
            this.f21434d.set(rect);
            Rect rect3 = this.f21434d;
            int i10 = this.f21435e;
            rect3.inset(-i10, -i10);
            this.f21433c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f21436f;
                    if (z11 && !this.f21434d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f21436f;
                        this.f21436f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f21432b.contains(x10, y10)) {
                this.f21436f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f21433c.contains(x10, y10)) {
                Rect rect = this.f21433c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f21431a.getWidth() / 2, this.f21431a.getHeight() / 2);
            }
            return this.f21431a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f21362Q0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f21365C0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f21369G0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f21368F0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i10, String str) {
        int position;
        String strO;
        try {
            String strO2 = U.o(cursor, "suggest_intent_action");
            if (strO2 == null) {
                strO2 = this.f21368F0.getSuggestIntentAction();
            }
            if (strO2 == null) {
                strO2 = "android.intent.action.SEARCH";
            }
            String str2 = strO2;
            String strO3 = U.o(cursor, "suggest_intent_data");
            if (strO3 == null) {
                strO3 = this.f21368F0.getSuggestIntentData();
            }
            if (strO3 != null && (strO = U.o(cursor, "suggest_intent_data_id")) != null) {
                strO3 = strO3 + "/" + Uri.encode(strO);
            }
            return C(str2, strO3 == null ? null : Uri.parse(strO3), U.o(cursor, "suggest_intent_extra_data"), U.o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f21369G0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.f21379Q.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.f21391f0);
        getLocationInWindow(this.f21392g0);
        int[] iArr = this.f21391f0;
        int i10 = iArr[1];
        int[] iArr2 = this.f21392g0;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.f21404s0 || this.f21394i0 == null) {
            return charSequence;
        }
        int textSize = (int) (this.f21379Q.getTextSize() * 1.25d);
        this.f21394i0.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f21394i0), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f21368F0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f21368F0.getVoiceSearchLaunchWebSearch() ? this.f21397l0 : this.f21368F0.getVoiceSearchLaunchRecognizer() ? this.f21398m0 : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.f21407v0 || this.f21363A0) && !L();
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean Q(int i10, int i11, String str) {
        Cursor cursorB = this.f21406u0.b();
        if (cursorB == null || !cursorB.moveToPosition(i10)) {
            return false;
        }
        O(D(cursorB, i11, str));
        return true;
    }

    private void b0() {
        post(this.f21370H0);
    }

    private void c0(int i10) {
        Editable text = this.f21379Q.getText();
        Cursor cursorB = this.f21406u0.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceC = this.f21406u0.c(cursorB);
        if (charSequenceC != null) {
            setQuery(charSequenceC);
        } else {
            setQuery(text);
        }
    }

    private void e0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f21379Q.getText());
        this.f21385W.setVisibility(!zIsEmpty || (this.f21404s0 && !this.f21366D0) ? 0 : 8);
        Drawable drawable = this.f21385W.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f21379Q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(i.d.f42435g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(i.d.f42436h);
    }

    private void h0() {
        this.f21379Q.setThreshold(this.f21368F0.getSuggestThreshold());
        this.f21379Q.setImeOptions(this.f21368F0.getImeOptions());
        int inputType = this.f21368F0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f21368F0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f21379Q.setInputType(inputType);
        AbstractC4971a abstractC4971a = this.f21406u0;
        if (abstractC4971a != null) {
            abstractC4971a.a(null);
        }
        if (this.f21368F0.getSuggestAuthority() != null) {
            U u10 = new U(getContext(), this, this.f21368F0, this.f21372J0);
            this.f21406u0 = u10;
            this.f21379Q.setAdapter(u10);
            ((U) this.f21406u0).x(this.f21409x0 ? 2 : 1);
        }
    }

    private void i0() {
        this.f21382T.setVisibility((N() && (this.f21384V.getVisibility() == 0 || this.f21386a0.getVisibility() == 0)) ? 0 : 8);
    }

    private void j0(boolean z10) {
        this.f21384V.setVisibility((this.f21407v0 && N() && hasFocus() && (z10 || !this.f21363A0)) ? 0 : 8);
    }

    private void k0(boolean z10) {
        this.f21405t0 = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f21379Q.getText());
        this.f21383U.setVisibility(i11);
        j0(!zIsEmpty);
        this.f21380R.setVisibility(z10 ? 8 : 0);
        if (this.f21393h0.getDrawable() != null && !this.f21404s0) {
            i10 = 0;
        }
        this.f21393h0.setVisibility(i10);
        e0();
        l0(zIsEmpty);
        i0();
    }

    private void l0(boolean z10) {
        int i10 = 8;
        if (this.f21363A0 && !L() && z10) {
            this.f21384V.setVisibility(8);
            i10 = 0;
        }
        this.f21386a0.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f21379Q.setText(charSequence);
        this.f21379Q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        if (this.f21387b0.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f21381S.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = h0.b(this);
            int dimensionPixelSize = this.f21404s0 ? resources.getDimensionPixelSize(i.d.f42433e) + resources.getDimensionPixelSize(i.d.f42434f) : 0;
            this.f21379Q.getDropDownBackground().getPadding(rect);
            this.f21379Q.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f21379Q.setDropDownWidth((((this.f21387b0.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f21379Q);
            return;
        }
        o oVar = f21362Q0;
        oVar.b(this.f21379Q);
        oVar.a(this.f21379Q);
    }

    public boolean L() {
        return this.f21405t0;
    }

    void P(int i10, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void R() {
        if (!TextUtils.isEmpty(this.f21379Q.getText())) {
            this.f21379Q.setText("");
            this.f21379Q.requestFocus();
            this.f21379Q.setImeVisibility(true);
        } else if (this.f21404s0) {
            l lVar = this.f21401p0;
            if (lVar == null || !lVar.onClose()) {
                clearFocus();
                k0(true);
            }
        }
    }

    boolean S(int i10, int i11, String str) {
        Q(i10, 0, null);
        this.f21379Q.setImeVisibility(false);
        G();
        return true;
    }

    boolean T(int i10) {
        c0(i10);
        return true;
    }

    protected void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.f21379Q.requestFocus();
        this.f21379Q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f21403r0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.f21379Q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f21400o0;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.f21368F0 != null) {
                P(0, null, text.toString());
            }
            this.f21379Q.setImeVisibility(false);
            G();
        }
    }

    boolean X(View view, int i10, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f21368F0 != null && this.f21406u0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return S(this.f21379Q.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f21379Q.setSelection(i10 == 21 ? 0 : this.f21379Q.length());
                this.f21379Q.setListSelection(0);
                this.f21379Q.clearListSelection();
                this.f21379Q.b();
                return true;
            }
            if (i10 == 19) {
                this.f21379Q.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.f21379Q.getText();
        this.f21365C0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        j0(!zIsEmpty);
        l0(zIsEmpty);
        e0();
        i0();
        if (this.f21400o0 != null && !TextUtils.equals(charSequence, this.f21364B0)) {
            this.f21400o0.a(charSequence.toString());
        }
        this.f21364B0 = charSequence.toString();
    }

    void Z() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        k0(L());
        b0();
        if (this.f21379Q.hasFocus()) {
            H();
        }
    }

    void a0() {
        SearchableInfo searchableInfo = this.f21368F0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(F(this.f21397l0, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(E(this.f21398m0, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // androidx.appcompat.view.c
    public void c() {
        if (this.f21366D0) {
            return;
        }
        this.f21366D0 = true;
        int imeOptions = this.f21379Q.getImeOptions();
        this.f21367E0 = imeOptions;
        this.f21379Q.setImeOptions(imeOptions | 33554432);
        this.f21379Q.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f21410y0 = true;
        super.clearFocus();
        this.f21379Q.clearFocus();
        this.f21379Q.setImeVisibility(false);
        this.f21410y0 = false;
    }

    public void d0(CharSequence charSequence, boolean z10) {
        this.f21379Q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f21379Q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f21365C0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // androidx.appcompat.view.c
    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f21379Q.setImeOptions(this.f21367E0);
        this.f21366D0 = false;
    }

    void f0() {
        int[] iArr = this.f21379Q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f21381S.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f21382T.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f21379Q.getImeOptions();
    }

    public int getInputType() {
        return this.f21379Q.getInputType();
    }

    public int getMaxWidth() {
        return this.f21411z0;
    }

    public CharSequence getQuery() {
        return this.f21379Q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f21408w0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f21368F0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f21399n0 : getContext().getText(this.f21368F0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f21396k0;
    }

    int getSuggestionRowLayout() {
        return this.f21395j0;
    }

    public AbstractC4971a getSuggestionsAdapter() {
        return this.f21406u0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f21370H0);
        post(this.f21371I0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            I(this.f21379Q, this.f21389d0);
            Rect rect = this.f21390e0;
            Rect rect2 = this.f21389d0;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.f21388c0;
            if (qVar != null) {
                qVar.a(this.f21390e0, this.f21389d0);
                return;
            }
            q qVar2 = new q(this.f21390e0, this.f21389d0, this.f21379Q);
            this.f21388c0 = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        if (L()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f21411z0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f21411z0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f21411z0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        k0(pVar.f21430D);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f21430D = L();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f21410y0 || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f21379Q.requestFocus(i10, rect);
        if (zRequestFocus) {
            k0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f21369G0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f21404s0 == z10) {
            return;
        }
        this.f21404s0 = z10;
        k0(z10);
        g0();
    }

    public void setImeOptions(int i10) {
        this.f21379Q.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f21379Q.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f21411z0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f21401p0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f21402q0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f21400o0 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f21403r0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f21408w0 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f21409x0 = z10;
        AbstractC4971a abstractC4971a = this.f21406u0;
        if (abstractC4971a instanceof U) {
            ((U) abstractC4971a).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f21368F0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean zK = K();
        this.f21363A0 = zK;
        if (zK) {
            this.f21379Q.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f21407v0 = z10;
        k0(L());
    }

    public void setSuggestionsAdapter(AbstractC4971a abstractC4971a) {
        this.f21406u0 = abstractC4971a;
        this.f21379Q.setAdapter(abstractC4971a);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42387J);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21389d0 = new Rect();
        this.f21390e0 = new Rect();
        this.f21391f0 = new int[2];
        this.f21392g0 = new int[2];
        this.f21370H0 = new b();
        this.f21371I0 = new c();
        this.f21372J0 = new WeakHashMap<>();
        f fVar = new f();
        this.f21373K0 = fVar;
        this.f21374L0 = new g();
        h hVar = new h();
        this.f21375M0 = hVar;
        i iVar = new i();
        this.f21376N0 = iVar;
        j jVar = new j();
        this.f21377O0 = jVar;
        this.f21378P0 = new a();
        int[] iArr = i.j.f42712f2;
        a0 a0VarV = a0.v(context, attributeSet, iArr, i10, 0);
        s1.X.l0(this, context, iArr, attributeSet, a0VarV.r(), i10, 0);
        LayoutInflater.from(context).inflate(a0VarV.n(i.j.f42762p2, i.g.f42543r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(i.f.f42487C);
        this.f21379Q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f21380R = findViewById(i.f.f42524y);
        View viewFindViewById = findViewById(i.f.f42486B);
        this.f21381S = viewFindViewById;
        View viewFindViewById2 = findViewById(i.f.f42493I);
        this.f21382T = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(i.f.f42522w);
        this.f21383U = imageView;
        ImageView imageView2 = (ImageView) findViewById(i.f.f42525z);
        this.f21384V = imageView2;
        ImageView imageView3 = (ImageView) findViewById(i.f.f42523x);
        this.f21385W = imageView3;
        ImageView imageView4 = (ImageView) findViewById(i.f.f42488D);
        this.f21386a0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(i.f.f42485A);
        this.f21393h0 = imageView5;
        s1.X.r0(viewFindViewById, a0VarV.g(i.j.f42767q2));
        s1.X.r0(viewFindViewById2, a0VarV.g(i.j.f42787u2));
        int i11 = i.j.f42782t2;
        imageView.setImageDrawable(a0VarV.g(i11));
        imageView2.setImageDrawable(a0VarV.g(i.j.f42752n2));
        imageView3.setImageDrawable(a0VarV.g(i.j.f42737k2));
        imageView4.setImageDrawable(a0VarV.g(i.j.f42797w2));
        imageView5.setImageDrawable(a0VarV.g(i11));
        this.f21394i0 = a0VarV.g(i.j.f42777s2);
        f0.a(imageView, getResources().getString(i.h.f42558n));
        this.f21395j0 = a0VarV.n(i.j.f42792v2, i.g.f42542q);
        this.f21396k0 = a0VarV.n(i.j.f42742l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f21378P0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f21374L0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(a0VarV.a(i.j.f42757o2, true));
        int iF = a0VarV.f(i.j.f42722h2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.f21399n0 = a0VarV.p(i.j.f42747m2);
        this.f21408w0 = a0VarV.p(i.j.f42772r2);
        int iK = a0VarV.k(i.j.f42732j2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = a0VarV.k(i.j.f42727i2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(a0VarV.a(i.j.f42717g2, true));
        a0VarV.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f21397l0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f21398m0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f21387b0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.f21404s0);
        g0();
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.Y(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.T(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public void setOnSuggestionListener(n nVar) {
    }
}
