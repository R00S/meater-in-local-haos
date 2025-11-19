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
import androidx.appcompat.app.b;
import j.C3699a;
import java.lang.reflect.InvocationTargetException;
import r1.C4337d;

/* compiled from: AppCompatSpinner.java */
/* renamed from: androidx.appcompat.widget.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1999v extends Spinner {

    /* renamed from: J, reason: collision with root package name */
    @SuppressLint({"ResourceType"})
    private static final int[] f21744J = {R.attr.spinnerMode};

    /* renamed from: B, reason: collision with root package name */
    private final C1983e f21745B;

    /* renamed from: C, reason: collision with root package name */
    private final Context f21746C;

    /* renamed from: D, reason: collision with root package name */
    private L f21747D;

    /* renamed from: E, reason: collision with root package name */
    private SpinnerAdapter f21748E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f21749F;

    /* renamed from: G, reason: collision with root package name */
    private h f21750G;

    /* renamed from: H, reason: collision with root package name */
    int f21751H;

    /* renamed from: I, reason: collision with root package name */
    final Rect f21752I;

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.v$a */
    class a extends L {

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ f f21753K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f21753K = fVar;
        }

        @Override // androidx.appcompat.widget.L
        public n.e b() {
            return this.f21753K;
        }

        @Override // androidx.appcompat.widget.L
        public boolean c() {
            if (C1999v.this.getInternalPopup().a()) {
                return true;
            }
            C1999v.this.b();
            return true;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.v$b */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C1999v.this.getInternalPopup().a()) {
                C1999v.this.b();
            }
            ViewTreeObserver viewTreeObserver = C1999v.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.v$c */
    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (C4337d.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.v$d */
    class d implements h, DialogInterface.OnClickListener {

        /* renamed from: B, reason: collision with root package name */
        androidx.appcompat.app.b f21756B;

        /* renamed from: C, reason: collision with root package name */
        private ListAdapter f21757C;

        /* renamed from: D, reason: collision with root package name */
        private CharSequence f21758D;

        d() {
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public boolean a() {
            androidx.appcompat.app.b bVar = this.f21756B;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public void c(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f21756B;
            if (bVar != null) {
                bVar.dismiss();
                this.f21756B = null;
            }
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public void f(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public CharSequence g() {
            return this.f21758D;
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public void j(CharSequence charSequence) {
            this.f21758D = charSequence;
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public void m(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public void n(int i10, int i11) {
            if (this.f21757C == null) {
                return;
            }
            b.a aVar = new b.a(C1999v.this.getPopupContext());
            CharSequence charSequence = this.f21758D;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.b bVarCreate = aVar.e(this.f21757C, C1999v.this.getSelectedItemPosition(), this).create();
            this.f21756B = bVarCreate;
            ListView listViewM = bVarCreate.m();
            listViewM.setTextDirection(i10);
            listViewM.setTextAlignment(i11);
            this.f21756B.show();
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C1999v.this.setSelection(i10);
            if (C1999v.this.getOnItemClickListener() != null) {
                C1999v.this.performItemClick(null, i10, this.f21757C.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public void p(ListAdapter listAdapter) {
            this.f21757C = listAdapter;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.v$e */
    private static class e implements ListAdapter, SpinnerAdapter {

        /* renamed from: B, reason: collision with root package name */
        private SpinnerAdapter f21760B;

        /* renamed from: C, reason: collision with root package name */
        private ListAdapter f21761C;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f21760B = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f21761C = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof W) {
                    W w10 = (W) spinnerAdapter;
                    if (w10.getDropDownViewTheme() == null) {
                        w10.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f21761C;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f21760B;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f21760B;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f21760B;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f21760B;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f21760B;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f21761C;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f21760B;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f21760B;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.v$f */
    class f extends M implements h {

        /* renamed from: j0, reason: collision with root package name */
        private CharSequence f21762j0;

        /* renamed from: k0, reason: collision with root package name */
        ListAdapter f21763k0;

        /* renamed from: l0, reason: collision with root package name */
        private final Rect f21764l0;

        /* renamed from: m0, reason: collision with root package name */
        private int f21765m0;

        /* compiled from: AppCompatSpinner.java */
        /* renamed from: androidx.appcompat.widget.v$f$a */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C1999v f21767B;

            a(C1999v c1999v) {
                this.f21767B = c1999v;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                C1999v.this.setSelection(i10);
                if (C1999v.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    C1999v.this.performItemClick(view, i10, fVar.f21763k0.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        /* compiled from: AppCompatSpinner.java */
        /* renamed from: androidx.appcompat.widget.v$f$b */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                f fVar = f.this;
                if (!fVar.V(C1999v.this)) {
                    f.this.dismiss();
                } else {
                    f.this.T();
                    f.super.b();
                }
            }
        }

        /* compiled from: AppCompatSpinner.java */
        /* renamed from: androidx.appcompat.widget.v$f$c */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f21770B;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f21770B = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C1999v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f21770B);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f21764l0 = new Rect();
            D(C1999v.this);
            J(true);
            P(0);
            L(new a(C1999v.this));
        }

        void T() {
            int i10;
            Drawable drawableI = i();
            if (drawableI != null) {
                drawableI.getPadding(C1999v.this.f21752I);
                i10 = h0.b(C1999v.this) ? C1999v.this.f21752I.right : -C1999v.this.f21752I.left;
            } else {
                Rect rect = C1999v.this.f21752I;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = C1999v.this.getPaddingLeft();
            int paddingRight = C1999v.this.getPaddingRight();
            int width = C1999v.this.getWidth();
            C1999v c1999v = C1999v.this;
            int i11 = c1999v.f21751H;
            if (i11 == -2) {
                int iA = c1999v.a((SpinnerAdapter) this.f21763k0, i());
                int i12 = C1999v.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C1999v.this.f21752I;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                F(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i11);
            }
            f(h0.b(C1999v.this) ? i10 + (((width - paddingRight) - z()) - U()) : i10 + paddingLeft + U());
        }

        public int U() {
            return this.f21765m0;
        }

        boolean V(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f21764l0);
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public CharSequence g() {
            return this.f21762j0;
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public void j(CharSequence charSequence) {
            this.f21762j0 = charSequence;
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public void m(int i10) {
            this.f21765m0 = i10;
        }

        @Override // androidx.appcompat.widget.C1999v.h
        public void n(int i10, int i11) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            T();
            I(2);
            super.b();
            ListView listViewL = l();
            listViewL.setChoiceMode(1);
            listViewL.setTextDirection(i10);
            listViewL.setTextAlignment(i11);
            Q(C1999v.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = C1999v.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.M, androidx.appcompat.widget.C1999v.h
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f21763k0 = listAdapter;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.v$g */
    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: B, reason: collision with root package name */
        boolean f21772B;

        /* compiled from: AppCompatSpinner.java */
        /* renamed from: androidx.appcompat.widget.v$g$a */
        class a implements Parcelable.Creator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f21772B ? (byte) 1 : (byte) 0);
        }

        g(Parcel parcel) {
            super(parcel);
            this.f21772B = parcel.readByte() != 0;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.v$h */
    interface h {
        boolean a();

        void c(Drawable drawable);

        int d();

        void dismiss();

        void f(int i10);

        CharSequence g();

        Drawable i();

        void j(CharSequence charSequence);

        void k(int i10);

        void m(int i10);

        void n(int i10, int i11);

        int o();

        void p(ListAdapter listAdapter);
    }

    public C1999v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42389L);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
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
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
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
        drawable.getPadding(this.f21752I);
        Rect rect = this.f21752I;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f21750G.n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1983e c1983e = this.f21745B;
        if (c1983e != null) {
            c1983e.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f21750G;
        return hVar != null ? hVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f21750G;
        return hVar != null ? hVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f21750G != null ? this.f21751H : super.getDropDownWidth();
    }

    final h getInternalPopup() {
        return this.f21750G;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f21750G;
        return hVar != null ? hVar.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f21746C;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f21750G;
        return hVar != null ? hVar.g() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1983e c1983e = this.f21745B;
        if (c1983e != null) {
            return c1983e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1983e c1983e = this.f21745B;
        if (c1983e != null) {
            return c1983e.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f21750G;
        if (hVar == null || !hVar.a()) {
            return;
        }
        this.f21750G.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f21750G == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f21772B || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f21750G;
        gVar.f21772B = hVar != null && hVar.a();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        L l10 = this.f21747D;
        if (l10 == null || !l10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f21750G;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1983e c1983e = this.f21745B;
        if (c1983e != null) {
            c1983e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1983e c1983e = this.f21745B;
        if (c1983e != null) {
            c1983e.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        h hVar = this.f21750G;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            hVar.m(i10);
            this.f21750G.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        h hVar = this.f21750G;
        if (hVar != null) {
            hVar.k(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f21750G != null) {
            this.f21751H = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f21750G;
        if (hVar != null) {
            hVar.c(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(C3699a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f21750G;
        if (hVar != null) {
            hVar.j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1983e c1983e = this.f21745B;
        if (c1983e != null) {
            c1983e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1983e c1983e = this.f21745B;
        if (c1983e != null) {
            c1983e.j(mode);
        }
    }

    public C1999v(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f21749F) {
            this.f21748E = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f21750G != null) {
            Context context = this.f21746C;
            if (context == null) {
                context = getContext();
            }
            this.f21750G.p(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public C1999v(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1999v(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1999v.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
