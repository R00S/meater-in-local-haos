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
import androidx.core.view.C0311u;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import p024c.p025a.C0823a;
import p024c.p025a.C0826d;
import p024c.p025a.C0828f;
import p024c.p025a.C0829g;
import p024c.p025a.C0830h;
import p024c.p025a.C0832j;
import p024c.p025a.p032o.InterfaceC0843c;
import p024c.p060j.p061a.AbstractC0961a;

/* loaded from: classes.dex */
public class SearchView extends C0157c0 implements InterfaceC0843c {

    /* renamed from: u */
    static final C0141n f849u;

    /* renamed from: A */
    final ImageView f850A;

    /* renamed from: B */
    final ImageView f851B;

    /* renamed from: C */
    final ImageView f852C;

    /* renamed from: D */
    private final View f853D;

    /* renamed from: E */
    private C0142o f854E;

    /* renamed from: F */
    private Rect f855F;

    /* renamed from: G */
    private Rect f856G;

    /* renamed from: H */
    private int[] f857H;

    /* renamed from: I */
    private int[] f858I;

    /* renamed from: J */
    private final ImageView f859J;

    /* renamed from: K */
    private final Drawable f860K;

    /* renamed from: L */
    private final int f861L;

    /* renamed from: M */
    private final int f862M;

    /* renamed from: N */
    private final Intent f863N;

    /* renamed from: O */
    private final Intent f864O;

    /* renamed from: P */
    private final CharSequence f865P;

    /* renamed from: Q */
    private InterfaceC0139l f866Q;

    /* renamed from: R */
    private InterfaceC0138k f867R;

    /* renamed from: S */
    View.OnFocusChangeListener f868S;

    /* renamed from: T */
    private InterfaceC0140m f869T;

    /* renamed from: U */
    private View.OnClickListener f870U;

    /* renamed from: V */
    private boolean f871V;

    /* renamed from: W */
    private boolean f872W;

    /* renamed from: a0 */
    AbstractC0961a f873a0;

    /* renamed from: b0 */
    private boolean f874b0;

    /* renamed from: c0 */
    private CharSequence f875c0;

    /* renamed from: d0 */
    private boolean f876d0;

    /* renamed from: e0 */
    private boolean f877e0;

    /* renamed from: f0 */
    private int f878f0;

    /* renamed from: g0 */
    private boolean f879g0;

    /* renamed from: h0 */
    private CharSequence f880h0;

    /* renamed from: i0 */
    private CharSequence f881i0;

    /* renamed from: j0 */
    private boolean f882j0;

    /* renamed from: k0 */
    private int f883k0;

    /* renamed from: l0 */
    SearchableInfo f884l0;

    /* renamed from: m0 */
    private Bundle f885m0;

    /* renamed from: n0 */
    private final Runnable f886n0;

    /* renamed from: o0 */
    private Runnable f887o0;

    /* renamed from: p0 */
    private final WeakHashMap<String, Drawable.ConstantState> f888p0;

    /* renamed from: q0 */
    private final View.OnClickListener f889q0;

    /* renamed from: r0 */
    View.OnKeyListener f890r0;

    /* renamed from: s0 */
    private final TextView.OnEditorActionListener f891s0;

    /* renamed from: t0 */
    private final AdapterView.OnItemClickListener f892t0;

    /* renamed from: u0 */
    private final AdapterView.OnItemSelectedListener f893u0;

    /* renamed from: v */
    final SearchAutoComplete f894v;

    /* renamed from: v0 */
    private TextWatcher f895v0;

    /* renamed from: w */
    private final View f896w;

    /* renamed from: x */
    private final View f897x;

    /* renamed from: y */
    private final View f898y;

    /* renamed from: z */
    final ImageView f899z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0126a();

        /* renamed from: h */
        boolean f900h;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        class C0126a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0126a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f900h + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f900h));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f900h = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends C0156c {

        /* renamed from: i */
        private int f901i;

        /* renamed from: j */
        private SearchView f902j;

        /* renamed from: k */
        private boolean f903k;

        /* renamed from: l */
        final Runnable f904l;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class RunnableC0127a implements Runnable {
            RunnableC0127a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m815c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0823a.f5042p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        void m813a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f849u.m822c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        /* renamed from: b */
        boolean m814b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: c */
        void m815c() {
            if (this.f903k) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f903k = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f901i <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0156c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f903k) {
                removeCallbacks(this.f904l);
                post(this.f904l);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i2, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z, i2, rect);
            this.f902j.m806Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
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
                        this.f902j.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z);
            if (z && this.f902j.hasFocus() && getVisibility() == 0) {
                this.f903k = true;
                if (SearchView.m781M(getContext())) {
                    m813a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f903k = false;
                removeCallbacks(this.f904l);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f903k = true;
                    return;
                }
                this.f903k = false;
                removeCallbacks(this.f904l);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f902j = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f901i = i2;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f904l = new RunnableC0127a();
            this.f901i = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0128a implements TextWatcher {
        C0128a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView.this.m805Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class RunnableC0129b implements Runnable {
        RunnableC0129b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m809f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class RunnableC0130c implements Runnable {
        RunnableC0130c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0961a abstractC0961a = SearchView.this.f873a0;
            if (abstractC0961a instanceof ViewOnClickListenerC0173k0) {
                abstractC0961a.changeCursor(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class ViewOnFocusChangeListenerC0131d implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC0131d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f868S;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class ViewOnLayoutChangeListenerC0132e implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0132e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView.this.m794B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class ViewOnClickListenerC0133f implements View.OnClickListener {
        ViewOnClickListenerC0133f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SearchView searchView = SearchView.this;
            if (view == searchView.f899z) {
                searchView.m802V();
                return;
            }
            if (view == searchView.f851B) {
                searchView.m798R();
                return;
            }
            if (view == searchView.f850A) {
                searchView.m803W();
            } else if (view == searchView.f852C) {
                searchView.m807a0();
            } else if (view == searchView.f894v) {
                searchView.m795H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class ViewOnKeyListenerC0134g implements View.OnKeyListener {
        ViewOnKeyListenerC0134g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f884l0 == null) {
                return false;
            }
            if (searchView.f894v.isPopupShowing() && SearchView.this.f894v.getListSelection() != -1) {
                return SearchView.this.m804X(view, i2, keyEvent);
            }
            if (SearchView.this.f894v.m814b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m797P(0, null, searchView2.f894v.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0135h implements TextView.OnEditorActionListener {
        C0135h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.m803W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0136i implements AdapterView.OnItemClickListener {
        C0136i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.m799S(i2, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0137j implements AdapterView.OnItemSelectedListener {
        C0137j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.m800T(i2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface InterfaceC0138k {
        /* renamed from: a */
        boolean m816a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface InterfaceC0139l {
        /* renamed from: a */
        boolean mo817a(String str);

        /* renamed from: b */
        boolean mo818b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface InterfaceC0140m {
        boolean onSuggestionClick(int i2);

        boolean onSuggestionSelect(int i2);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    private static class C0141n {

        /* renamed from: a */
        private Method f916a;

        /* renamed from: b */
        private Method f917b;

        /* renamed from: c */
        private Method f918c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C0141n() throws NoSuchMethodException, SecurityException {
            this.f916a = null;
            this.f917b = null;
            this.f918c = null;
            m819d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f916a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f917b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f918c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m819d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: a */
        void m820a(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            m819d();
            Method method = this.f917b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        void m821b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            m819d();
            Method method = this.f916a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        void m822c(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            m819d();
            Method method = this.f918c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    private static class C0142o extends TouchDelegate {

        /* renamed from: a */
        private final View f919a;

        /* renamed from: b */
        private final Rect f920b;

        /* renamed from: c */
        private final Rect f921c;

        /* renamed from: d */
        private final Rect f922d;

        /* renamed from: e */
        private final int f923e;

        /* renamed from: f */
        private boolean f924f;

        public C0142o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f923e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f920b = new Rect();
            this.f922d = new Rect();
            this.f921c = new Rect();
            m823a(rect, rect2);
            this.f919a = view;
        }

        /* renamed from: a */
        public void m823a(Rect rect, Rect rect2) {
            this.f920b.set(rect);
            this.f922d.set(rect);
            Rect rect3 = this.f922d;
            int i2 = this.f923e;
            rect3.inset(-i2, -i2);
            this.f921c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f924f;
                    if (z2 && !this.f922d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f924f;
                        this.f924f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f920b.contains(x, y)) {
                    this.f924f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f921c.contains(x, y)) {
                Rect rect = this.f921c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.f919a.getWidth() / 2, this.f919a.getHeight() / 2);
            }
            return this.f919a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f849u = Build.VERSION.SDK_INT < 29 ? new C0141n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: C */
    private Intent m773C(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f881i0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f885m0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f884l0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    private Intent m774D(Cursor cursor, int i2, String str) {
        int position;
        String strM1044e;
        try {
            String strM1044e2 = ViewOnClickListenerC0173k0.m1044e(cursor, "suggest_intent_action");
            if (strM1044e2 == null) {
                strM1044e2 = this.f884l0.getSuggestIntentAction();
            }
            if (strM1044e2 == null) {
                strM1044e2 = "android.intent.action.SEARCH";
            }
            String str2 = strM1044e2;
            String strM1044e3 = ViewOnClickListenerC0173k0.m1044e(cursor, "suggest_intent_data");
            if (strM1044e3 == null) {
                strM1044e3 = this.f884l0.getSuggestIntentData();
            }
            if (strM1044e3 != null && (strM1044e = ViewOnClickListenerC0173k0.m1044e(cursor, "suggest_intent_data_id")) != null) {
                strM1044e3 = strM1044e3 + "/" + Uri.encode(strM1044e);
            }
            return m773C(str2, strM1044e3 == null ? null : Uri.parse(strM1044e3), ViewOnClickListenerC0173k0.m1044e(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC0173k0.m1044e(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            return null;
        }
    }

    /* renamed from: E */
    private Intent m775E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f885m0;
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

    /* renamed from: F */
    private Intent m776F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: G */
    private void m777G() {
        this.f894v.dismissDropDown();
    }

    /* renamed from: I */
    private void m778I(View view, Rect rect) {
        view.getLocationInWindow(this.f857H);
        getLocationInWindow(this.f858I);
        int[] iArr = this.f857H;
        int i2 = iArr[1];
        int[] iArr2 = this.f858I;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    /* renamed from: J */
    private CharSequence m779J(CharSequence charSequence) {
        if (!this.f871V || this.f860K == null) {
            return charSequence;
        }
        double textSize = this.f894v.getTextSize();
        Double.isNaN(textSize);
        int i2 = (int) (textSize * 1.25d);
        this.f860K.setBounds(0, 0, i2, i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f860K), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    private boolean m780K() {
        SearchableInfo searchableInfo = this.f884l0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f884l0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f863N;
        } else if (this.f884l0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f864O;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: M */
    static boolean m781M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: N */
    private boolean m782N() {
        return (this.f874b0 || this.f879g0) && !m796L();
    }

    /* renamed from: O */
    private void m783O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    /* renamed from: Q */
    private boolean m784Q(int i2, int i3, String str) {
        Cursor cursor = this.f873a0.getCursor();
        if (cursor == null || !cursor.moveToPosition(i2)) {
            return false;
        }
        m783O(m774D(cursor, i3, str));
        return true;
    }

    /* renamed from: b0 */
    private void m785b0() {
        post(this.f886n0);
    }

    /* renamed from: c0 */
    private void m786c0(int i2) {
        Editable text = this.f894v.getText();
        Cursor cursor = this.f873a0.getCursor();
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.f873a0.convertToString(cursor);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    /* renamed from: e0 */
    private void m787e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f894v.getText());
        if (!z2 && (!this.f871V || this.f882j0)) {
            z = false;
        }
        this.f851B.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f851B.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: g0 */
    private void m788g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f894v;
        if (queryHint == null) {
            queryHint = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        searchAutoComplete.setHint(m779J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0826d.f5068g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0826d.f5069h);
    }

    /* renamed from: h0 */
    private void m789h0() {
        this.f894v.setThreshold(this.f884l0.getSuggestThreshold());
        this.f894v.setImeOptions(this.f884l0.getImeOptions());
        int inputType = this.f884l0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f884l0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f894v.setInputType(inputType);
        AbstractC0961a abstractC0961a = this.f873a0;
        if (abstractC0961a != null) {
            abstractC0961a.changeCursor(null);
        }
        if (this.f884l0.getSuggestAuthority() != null) {
            ViewOnClickListenerC0173k0 viewOnClickListenerC0173k0 = new ViewOnClickListenerC0173k0(getContext(), this, this.f884l0, this.f888p0);
            this.f873a0 = viewOnClickListenerC0173k0;
            this.f894v.setAdapter(viewOnClickListenerC0173k0);
            ((ViewOnClickListenerC0173k0) this.f873a0).m1057n(this.f876d0 ? 2 : 1);
        }
    }

    /* renamed from: i0 */
    private void m790i0() {
        this.f898y.setVisibility((m782N() && (this.f850A.getVisibility() == 0 || this.f852C.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: j0 */
    private void m791j0(boolean z) {
        this.f850A.setVisibility((this.f874b0 && m782N() && hasFocus() && (z || !this.f879g0)) ? 0 : 8);
    }

    /* renamed from: k0 */
    private void m792k0(boolean z) {
        this.f872W = z;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f894v.getText());
        this.f899z.setVisibility(i2);
        m791j0(z2);
        this.f896w.setVisibility(z ? 8 : 0);
        this.f859J.setVisibility((this.f859J.getDrawable() == null || this.f871V) ? 8 : 0);
        m787e0();
        m793l0(!z2);
        m790i0();
    }

    /* renamed from: l0 */
    private void m793l0(boolean z) {
        int i2 = 8;
        if (this.f879g0 && !m796L() && z) {
            this.f850A.setVisibility(8);
            i2 = 0;
        }
        this.f852C.setVisibility(i2);
    }

    private void setQuery(CharSequence charSequence) {
        this.f894v.setText(charSequence);
        this.f894v.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: B */
    void m794B() {
        if (this.f853D.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f897x.getPaddingLeft();
            Rect rect = new Rect();
            boolean zM1231b = C0197w0.m1231b(this);
            int dimensionPixelSize = this.f871V ? resources.getDimensionPixelSize(C0826d.f5066e) + resources.getDimensionPixelSize(C0826d.f5067f) : 0;
            this.f894v.getDropDownBackground().getPadding(rect);
            this.f894v.setDropDownHorizontalOffset(zM1231b ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f894v.setDropDownWidth((((this.f853D.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: H */
    void m795H() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f894v.refreshAutoCompleteResults();
            return;
        }
        C0141n c0141n = f849u;
        c0141n.m821b(this.f894v);
        c0141n.m820a(this.f894v);
    }

    /* renamed from: L */
    public boolean m796L() {
        return this.f872W;
    }

    /* renamed from: P */
    void m797P(int i2, String str, String str2) {
        getContext().startActivity(m773C("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    /* renamed from: R */
    void m798R() {
        if (!TextUtils.isEmpty(this.f894v.getText())) {
            this.f894v.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            this.f894v.requestFocus();
            this.f894v.setImeVisibility(true);
        } else if (this.f871V) {
            InterfaceC0138k interfaceC0138k = this.f867R;
            if (interfaceC0138k == null || !interfaceC0138k.m816a()) {
                clearFocus();
                m792k0(true);
            }
        }
    }

    /* renamed from: S */
    boolean m799S(int i2, int i3, String str) {
        InterfaceC0140m interfaceC0140m = this.f869T;
        if (interfaceC0140m != null && interfaceC0140m.onSuggestionClick(i2)) {
            return false;
        }
        m784Q(i2, 0, null);
        this.f894v.setImeVisibility(false);
        m777G();
        return true;
    }

    /* renamed from: T */
    boolean m800T(int i2) {
        InterfaceC0140m interfaceC0140m = this.f869T;
        if (interfaceC0140m != null && interfaceC0140m.onSuggestionSelect(i2)) {
            return false;
        }
        m786c0(i2);
        return true;
    }

    /* renamed from: U */
    void m801U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: V */
    void m802V() {
        m792k0(false);
        this.f894v.requestFocus();
        this.f894v.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f870U;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: W */
    void m803W() {
        Editable text = this.f894v.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0139l interfaceC0139l = this.f866Q;
        if (interfaceC0139l == null || !interfaceC0139l.mo818b(text.toString())) {
            if (this.f884l0 != null) {
                m797P(0, null, text.toString());
            }
            this.f894v.setImeVisibility(false);
            m777G();
        }
    }

    /* renamed from: X */
    boolean m804X(View view, int i2, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f884l0 != null && this.f873a0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return m799S(this.f894v.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.f894v.setSelection(i2 == 21 ? 0 : this.f894v.length());
                this.f894v.setListSelection(0);
                this.f894v.clearListSelection();
                this.f894v.m813a();
                return true;
            }
            if (i2 != 19 || this.f894v.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: Y */
    void m805Y(CharSequence charSequence) {
        Editable text = this.f894v.getText();
        this.f881i0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m791j0(z);
        m793l0(!z);
        m787e0();
        m790i0();
        if (this.f866Q != null && !TextUtils.equals(charSequence, this.f880h0)) {
            this.f866Q.mo817a(charSequence.toString());
        }
        this.f880h0 = charSequence.toString();
    }

    /* renamed from: Z */
    void m806Z() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m792k0(m796L());
        m785b0();
        if (this.f894v.hasFocus()) {
            m795H();
        }
    }

    /* renamed from: a0 */
    void m807a0() {
        SearchableInfo searchableInfo = this.f884l0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m776F(this.f863N, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m775E(this.f864O, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // p024c.p025a.p032o.InterfaceC0843c
    /* renamed from: c */
    public void mo644c() {
        if (this.f882j0) {
            return;
        }
        this.f882j0 = true;
        int imeOptions = this.f894v.getImeOptions();
        this.f883k0 = imeOptions;
        this.f894v.setImeOptions(imeOptions | 33554432);
        this.f894v.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f877e0 = true;
        super.clearFocus();
        this.f894v.clearFocus();
        this.f894v.setImeVisibility(false);
        this.f877e0 = false;
    }

    /* renamed from: d0 */
    public void m808d0(CharSequence charSequence, boolean z) {
        this.f894v.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f894v;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f881i0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m803W();
    }

    @Override // p024c.p025a.p032o.InterfaceC0843c
    /* renamed from: f */
    public void mo645f() {
        m808d0(HttpUrl.FRAGMENT_ENCODE_SET, false);
        clearFocus();
        m792k0(true);
        this.f894v.setImeOptions(this.f883k0);
        this.f882j0 = false;
    }

    /* renamed from: f0 */
    void m809f0() {
        int[] iArr = this.f894v.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f897x.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f898y.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f894v.getImeOptions();
    }

    public int getInputType() {
        return this.f894v.getInputType();
    }

    public int getMaxWidth() {
        return this.f878f0;
    }

    public CharSequence getQuery() {
        return this.f894v.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f875c0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f884l0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f865P : getContext().getText(this.f884l0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f862M;
    }

    int getSuggestionRowLayout() {
        return this.f861L;
    }

    public AbstractC0961a getSuggestionsAdapter() {
        return this.f873a0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f886n0);
        post(this.f887o0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.C0157c0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            m778I(this.f894v, this.f855F);
            Rect rect = this.f856G;
            Rect rect2 = this.f855F;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            C0142o c0142o = this.f854E;
            if (c0142o != null) {
                c0142o.m823a(this.f856G, this.f855F);
                return;
            }
            C0142o c0142o2 = new C0142o(this.f856G, this.f855F, this.f894v);
            this.f854E = c0142o2;
            setTouchDelegate(c0142o2);
        }
    }

    @Override // androidx.appcompat.widget.C0157c0, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        if (m796L()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f878f0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f878f0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f878f0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2342a());
        m792k0(savedState.f900h);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f900h = m796L();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m785b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.f877e0 || !isFocusable()) {
            return false;
        }
        if (m796L()) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.f894v.requestFocus(i2, rect);
        if (zRequestFocus) {
            m792k0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f885m0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m798R();
        } else {
            m802V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f871V == z) {
            return;
        }
        this.f871V = z;
        m792k0(z);
        m788g0();
    }

    public void setImeOptions(int i2) {
        this.f894v.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f894v.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f878f0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0138k interfaceC0138k) {
        this.f867R = interfaceC0138k;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f868S = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0139l interfaceC0139l) {
        this.f866Q = interfaceC0139l;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f870U = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0140m interfaceC0140m) {
        this.f869T = interfaceC0140m;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f875c0 = charSequence;
        m788g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f876d0 = z;
        AbstractC0961a abstractC0961a = this.f873a0;
        if (abstractC0961a instanceof ViewOnClickListenerC0173k0) {
            ((ViewOnClickListenerC0173k0) abstractC0961a).m1057n(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f884l0 = searchableInfo;
        if (searchableInfo != null) {
            m789h0();
            m788g0();
        }
        boolean zM780K = m780K();
        this.f879g0 = zM780K;
        if (zM780K) {
            this.f894v.setPrivateImeOptions("nm");
        }
        m792k0(m796L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f874b0 = z;
        m792k0(m796L());
    }

    public void setSuggestionsAdapter(AbstractC0961a abstractC0961a) {
        this.f873a0 = abstractC0961a;
        this.f894v.setAdapter(abstractC0961a);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5020I);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f855F = new Rect();
        this.f856G = new Rect();
        this.f857H = new int[2];
        this.f858I = new int[2];
        this.f886n0 = new RunnableC0129b();
        this.f887o0 = new RunnableC0130c();
        this.f888p0 = new WeakHashMap<>();
        ViewOnClickListenerC0133f viewOnClickListenerC0133f = new ViewOnClickListenerC0133f();
        this.f889q0 = viewOnClickListenerC0133f;
        this.f890r0 = new ViewOnKeyListenerC0134g();
        C0135h c0135h = new C0135h();
        this.f891s0 = c0135h;
        C0136i c0136i = new C0136i();
        this.f892t0 = c0136i;
        C0137j c0137j = new C0137j();
        this.f893u0 = c0137j;
        this.f895v0 = new C0128a();
        C0185q0 c0185q0M1091v = C0185q0.m1091v(context, attributeSet, C0832j.f5371i2, i2, 0);
        LayoutInflater.from(context).inflate(c0185q0M1091v.m1105n(C0832j.f5421s2, C0829g.f5179r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C0828f.f5123D);
        this.f894v = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f896w = findViewById(C0828f.f5161z);
        View viewFindViewById = findViewById(C0828f.f5122C);
        this.f897x = viewFindViewById;
        View viewFindViewById2 = findViewById(C0828f.f5129J);
        this.f898y = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(C0828f.f5159x);
        this.f899z = imageView;
        ImageView imageView2 = (ImageView) findViewById(C0828f.f5120A);
        this.f850A = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C0828f.f5160y);
        this.f851B = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C0828f.f5124E);
        this.f852C = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C0828f.f5121B);
        this.f859J = imageView5;
        C0311u.m2139m0(viewFindViewById, c0185q0M1091v.m1098g(C0832j.f5426t2));
        C0311u.m2139m0(viewFindViewById2, c0185q0M1091v.m1098g(C0832j.f5446x2));
        int i3 = C0832j.f5441w2;
        imageView.setImageDrawable(c0185q0M1091v.m1098g(i3));
        imageView2.setImageDrawable(c0185q0M1091v.m1098g(C0832j.f5411q2));
        imageView3.setImageDrawable(c0185q0M1091v.m1098g(C0832j.f5396n2));
        imageView4.setImageDrawable(c0185q0M1091v.m1098g(C0832j.f5456z2));
        imageView5.setImageDrawable(c0185q0M1091v.m1098g(i3));
        this.f860K = c0185q0M1091v.m1098g(C0832j.f5436v2);
        C0189s0.m1179a(imageView, getResources().getString(C0830h.f5193l));
        this.f861L = c0185q0M1091v.m1105n(C0832j.f5451y2, C0829g.f5178q);
        this.f862M = c0185q0M1091v.m1105n(C0832j.f5401o2, 0);
        imageView.setOnClickListener(viewOnClickListenerC0133f);
        imageView3.setOnClickListener(viewOnClickListenerC0133f);
        imageView2.setOnClickListener(viewOnClickListenerC0133f);
        imageView4.setOnClickListener(viewOnClickListenerC0133f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0133f);
        searchAutoComplete.addTextChangedListener(this.f895v0);
        searchAutoComplete.setOnEditorActionListener(c0135h);
        searchAutoComplete.setOnItemClickListener(c0136i);
        searchAutoComplete.setOnItemSelectedListener(c0137j);
        searchAutoComplete.setOnKeyListener(this.f890r0);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0131d());
        setIconifiedByDefault(c0185q0M1091v.m1092a(C0832j.f5416r2, true));
        int iM1097f = c0185q0M1091v.m1097f(C0832j.f5381k2, -1);
        if (iM1097f != -1) {
            setMaxWidth(iM1097f);
        }
        this.f865P = c0185q0M1091v.m1107p(C0832j.f5406p2);
        this.f875c0 = c0185q0M1091v.m1107p(C0832j.f5431u2);
        int iM1102k = c0185q0M1091v.m1102k(C0832j.f5391m2, -1);
        if (iM1102k != -1) {
            setImeOptions(iM1102k);
        }
        int iM1102k2 = c0185q0M1091v.m1102k(C0832j.f5386l2, -1);
        if (iM1102k2 != -1) {
            setInputType(iM1102k2);
        }
        setFocusable(c0185q0M1091v.m1092a(C0832j.f5376j2, true));
        c0185q0M1091v.m1111w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f863N = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f864O = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f853D = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0132e());
        }
        m792k0(this.f871V);
        m788g0();
    }
}
