package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC0066c;
import androidx.appcompat.view.menu.InterfaceC0096p;
import androidx.core.view.C0311u;
import androidx.core.view.InterfaceC0310t;
import p024c.p025a.C0823a;
import p024c.p025a.p026k.p027a.C0833a;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements InterfaceC0310t {

    /* renamed from: f */
    private static final int[] f807f = {R.attr.spinnerMode};

    /* renamed from: g */
    private final C0158d f808g;

    /* renamed from: h */
    private final Context f809h;

    /* renamed from: i */
    private AbstractViewOnTouchListenerC0155b0 f810i;

    /* renamed from: j */
    private SpinnerAdapter f811j;

    /* renamed from: k */
    private final boolean f812k;

    /* renamed from: l */
    private InterfaceC0124f f813l;

    /* renamed from: m */
    int f814m;

    /* renamed from: n */
    final Rect f815n;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0118a();

        /* renamed from: f */
        boolean f816f;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        class C0118a implements Parcelable.Creator<SavedState> {
            C0118a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f816f ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f816f = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    class C0119a extends AbstractViewOnTouchListenerC0155b0 {

        /* renamed from: o */
        final /* synthetic */ C0123e f817o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0119a(View view, C0123e c0123e) {
            super(view);
            this.f817o = c0123e;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0155b0
        /* renamed from: b */
        public InterfaceC0096p mo474b() {
            return this.f817o;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0155b0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo475c() {
            if (AppCompatSpinner.this.getInternalPopup().mo753a()) {
                return true;
            }
            AppCompatSpinner.this.m750b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    class ViewTreeObserverOnGlobalLayoutListenerC0120b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC0120b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo753a()) {
                AppCompatSpinner.this.m750b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    class DialogInterfaceOnClickListenerC0121c implements InterfaceC0124f, DialogInterface.OnClickListener {

        /* renamed from: f */
        DialogInterfaceC0066c f820f;

        /* renamed from: g */
        private ListAdapter f821g;

        /* renamed from: h */
        private CharSequence f822h;

        DialogInterfaceOnClickListenerC0121c() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: a */
        public boolean mo753a() {
            DialogInterfaceC0066c dialogInterfaceC0066c = this.f820f;
            if (dialogInterfaceC0066c != null) {
                return dialogInterfaceC0066c.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: b */
        public void mo754b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: c */
        public int mo755c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        public void dismiss() {
            DialogInterfaceC0066c dialogInterfaceC0066c = this.f820f;
            if (dialogInterfaceC0066c != null) {
                dialogInterfaceC0066c.dismiss();
                this.f820f = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: e */
        public void mo756e(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: f */
        public CharSequence mo757f() {
            return this.f822h;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: h */
        public Drawable mo758h() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: i */
        public void mo759i(CharSequence charSequence) {
            this.f822h = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: k */
        public void mo760k(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: l */
        public void mo761l(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: m */
        public void mo762m(int i2, int i3) {
            if (this.f821g == null) {
                return;
            }
            DialogInterfaceC0066c.a aVar = new DialogInterfaceC0066c.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f822h;
            if (charSequence != null) {
                aVar.m265v(charSequence);
            }
            DialogInterfaceC0066c dialogInterfaceC0066cM244a = aVar.m262s(this.f821g, AppCompatSpinner.this.getSelectedItemPosition(), this).m244a();
            this.f820f = dialogInterfaceC0066cM244a;
            ListView listViewM242f = dialogInterfaceC0066cM244a.m242f();
            if (Build.VERSION.SDK_INT >= 17) {
                listViewM242f.setTextDirection(i2);
                listViewM242f.setTextAlignment(i3);
            }
            this.f820f.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: n */
        public int mo763n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: o */
        public void mo764o(ListAdapter listAdapter) {
            this.f821g = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            AppCompatSpinner.this.setSelection(i2);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i2, this.f821g.getItemId(i2));
            }
            dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    private static class C0122d implements ListAdapter, SpinnerAdapter {

        /* renamed from: f */
        private SpinnerAdapter f824f;

        /* renamed from: g */
        private ListAdapter f825g;

        public C0122d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f824f = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f825g = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof InterfaceC0177m0) {
                    InterfaceC0177m0 interfaceC0177m0 = (InterfaceC0177m0) spinnerAdapter;
                    if (interfaceC0177m0.getDropDownViewTheme() == null) {
                        interfaceC0177m0.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f825g;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f824f;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f824f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f824f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f824f;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f824f;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f825g;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f824f;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f824f;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    class C0123e extends C0159d0 implements InterfaceC0124f {

        /* renamed from: O */
        private CharSequence f826O;

        /* renamed from: P */
        ListAdapter f827P;

        /* renamed from: Q */
        private final Rect f828Q;

        /* renamed from: R */
        private int f829R;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$a */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ AppCompatSpinner f831f;

            a(AppCompatSpinner appCompatSpinner) {
                this.f831f = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                AppCompatSpinner.this.setSelection(i2);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0123e c0123e = C0123e.this;
                    AppCompatSpinner.this.performItemClick(view, i2, c0123e.f827P.getItemId(i2));
                }
                C0123e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0123e c0123e = C0123e.this;
                if (!c0123e.m768T(AppCompatSpinner.this)) {
                    C0123e.this.dismiss();
                } else {
                    C0123e.this.m766R();
                    C0123e.super.show();
                }
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$c */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: f */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f834f;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f834f = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f834f);
                }
            }
        }

        public C0123e(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f828Q = new Rect();
            m932C(AppCompatSpinner.this);
            m938I(true);
            m942N(0);
            m940K(new a(AppCompatSpinner.this));
        }

        /* renamed from: R */
        void m766R() {
            Drawable drawableM948h = m948h();
            int i2 = 0;
            if (drawableM948h != null) {
                drawableM948h.getPadding(AppCompatSpinner.this.f815n);
                i2 = C0197w0.m1231b(AppCompatSpinner.this) ? AppCompatSpinner.this.f815n.right : -AppCompatSpinner.this.f815n.left;
            } else {
                Rect rect = AppCompatSpinner.this.f815n;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i3 = appCompatSpinner.f814m;
            if (i3 == -2) {
                int iM749a = appCompatSpinner.m749a((SpinnerAdapter) this.f827P, m948h());
                int i4 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f815n;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (iM749a > i5) {
                    iM749a = i5;
                }
                m934E(Math.max(iM749a, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                m934E((width - paddingLeft) - paddingRight);
            } else {
                m934E(i3);
            }
            m947e(C0197w0.m1231b(AppCompatSpinner.this) ? i2 + (((width - paddingRight) - m958y()) - m767S()) : i2 + paddingLeft + m767S());
        }

        /* renamed from: S */
        public int m767S() {
            return this.f829R;
        }

        /* renamed from: T */
        boolean m768T(View view) {
            return C0311u.m2101N(view) && view.getGlobalVisibleRect(this.f828Q);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: f */
        public CharSequence mo757f() {
            return this.f826O;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: i */
        public void mo759i(CharSequence charSequence) {
            this.f826O = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: l */
        public void mo761l(int i2) {
            this.f829R = i2;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: m */
        public void mo762m(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean zMo519a = mo519a();
            m766R();
            m937H(2);
            super.show();
            ListView listViewMo522j = mo522j();
            listViewMo522j.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                listViewMo522j.setTextDirection(i2);
                listViewMo522j.setTextAlignment(i3);
            }
            m943O(AppCompatSpinner.this.getSelectedItemPosition());
            if (zMo519a || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            m939J(new c(bVar));
        }

        @Override // androidx.appcompat.widget.C0159d0, androidx.appcompat.widget.AppCompatSpinner.InterfaceC0124f
        /* renamed from: o */
        public void mo764o(ListAdapter listAdapter) {
            super.mo764o(listAdapter);
            this.f827P = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    interface InterfaceC0124f {
        /* renamed from: a */
        boolean mo753a();

        /* renamed from: b */
        void mo754b(Drawable drawable);

        /* renamed from: c */
        int mo755c();

        void dismiss();

        /* renamed from: e */
        void mo756e(int i2);

        /* renamed from: f */
        CharSequence mo757f();

        /* renamed from: h */
        Drawable mo758h();

        /* renamed from: i */
        void mo759i(CharSequence charSequence);

        /* renamed from: k */
        void mo760k(int i2);

        /* renamed from: l */
        void mo761l(int i2);

        /* renamed from: m */
        void mo762m(int i2, int i3);

        /* renamed from: n */
        int mo763n();

        /* renamed from: o */
        void mo764o(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5022K);
    }

    /* renamed from: a */
    int m749a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f815n);
        Rect rect = this.f815n;
        return iMax2 + rect.left + rect.right;
    }

    /* renamed from: b */
    void m750b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f813l.mo762m(getTextDirection(), getTextAlignment());
        } else {
            this.f813l.mo762m(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0158d c0158d = this.f808g;
        if (c0158d != null) {
            c0158d.m918b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0124f interfaceC0124f = this.f813l;
        if (interfaceC0124f != null) {
            return interfaceC0124f.mo755c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0124f interfaceC0124f = this.f813l;
        if (interfaceC0124f != null) {
            return interfaceC0124f.mo763n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f813l != null) {
            return this.f814m;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    final InterfaceC0124f getInternalPopup() {
        return this.f813l;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0124f interfaceC0124f = this.f813l;
        if (interfaceC0124f != null) {
            return interfaceC0124f.mo758h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f809h;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0124f interfaceC0124f = this.f813l;
        return interfaceC0124f != null ? interfaceC0124f.mo757f() : super.getPrompt();
    }

    @Override // androidx.core.view.InterfaceC0310t
    public ColorStateList getSupportBackgroundTintList() {
        C0158d c0158d = this.f808g;
        if (c0158d != null) {
            return c0158d.m919c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0310t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0158d c0158d = this.f808g;
        if (c0158d != null) {
            return c0158d.m920d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0124f interfaceC0124f = this.f813l;
        if (interfaceC0124f == null || !interfaceC0124f.mo753a()) {
            return;
        }
        this.f813l.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f813l == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m749a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f816f || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0120b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC0124f interfaceC0124f = this.f813l;
        savedState.f816f = interfaceC0124f != null && interfaceC0124f.mo753a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0155b0 abstractViewOnTouchListenerC0155b0 = this.f810i;
        if (abstractViewOnTouchListenerC0155b0 == null || !abstractViewOnTouchListenerC0155b0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0124f interfaceC0124f = this.f813l;
        if (interfaceC0124f == null) {
            return super.performClick();
        }
        if (interfaceC0124f.mo753a()) {
            return true;
        }
        m750b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0158d c0158d = this.f808g;
        if (c0158d != null) {
            c0158d.m922f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0158d c0158d = this.f808g;
        if (c0158d != null) {
            c0158d.m923g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0124f interfaceC0124f = this.f813l;
        if (interfaceC0124f != null) {
            interfaceC0124f.mo761l(i2);
            this.f813l.mo756e(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0124f interfaceC0124f = this.f813l;
        if (interfaceC0124f != null) {
            interfaceC0124f.mo760k(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f813l != null) {
            this.f814m = i2;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0124f interfaceC0124f = this.f813l;
        if (interfaceC0124f != null) {
            interfaceC0124f.mo754b(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(C0833a.m5262d(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0124f interfaceC0124f = this.f813l;
        if (interfaceC0124f != null) {
            interfaceC0124f.mo759i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0158d c0158d = this.f808g;
        if (c0158d != null) {
            c0158d.m925i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0158d c0158d = this.f808g;
        if (c0158d != null) {
            c0158d.m926j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f812k) {
            this.f811j = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f813l != null) {
            Context context = this.f809h;
            if (context == null) {
                context = getContext();
            }
            this.f813l.mo764o(new C0122d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.widget.Spinner, androidx.appcompat.widget.AppCompatSpinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
