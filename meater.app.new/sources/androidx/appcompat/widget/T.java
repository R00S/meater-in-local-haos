package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.LinearLayoutCompat;

/* compiled from: ScrollingTabContainerView.java */
/* loaded from: classes.dex */
public class T extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: K, reason: collision with root package name */
    private static final Interpolator f21484K = new DecelerateInterpolator();

    /* renamed from: B, reason: collision with root package name */
    Runnable f21485B;

    /* renamed from: C, reason: collision with root package name */
    private c f21486C;

    /* renamed from: D, reason: collision with root package name */
    LinearLayoutCompat f21487D;

    /* renamed from: E, reason: collision with root package name */
    private Spinner f21488E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f21489F;

    /* renamed from: G, reason: collision with root package name */
    int f21490G;

    /* renamed from: H, reason: collision with root package name */
    int f21491H;

    /* renamed from: I, reason: collision with root package name */
    private int f21492I;

    /* renamed from: J, reason: collision with root package name */
    private int f21493J;

    /* compiled from: ScrollingTabContainerView.java */
    class a implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ View f21494B;

        a(View view) {
            this.f21494B = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            T.this.smoothScrollTo(this.f21494B.getLeft() - ((T.this.getWidth() - this.f21494B.getWidth()) / 2), 0);
            T.this.f21485B = null;
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return T.this.f21487D.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) T.this.f21487D.getChildAt(i10)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return T.this.c((a.c) getItem(i10), true);
            }
            ((d) view).a((a.c) getItem(i10));
            return view;
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = T.this.f21487D.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = T.this.f21487D.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class d extends LinearLayout {

        /* renamed from: B, reason: collision with root package name */
        private final int[] f21498B;

        /* renamed from: C, reason: collision with root package name */
        private a.c f21499C;

        /* renamed from: D, reason: collision with root package name */
        private TextView f21500D;

        /* renamed from: E, reason: collision with root package name */
        private ImageView f21501E;

        /* renamed from: F, reason: collision with root package name */
        private View f21502F;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, a.c cVar, boolean z10) {
            int i10 = i.a.f42397d;
            super(context, null, i10);
            int[] iArr = {R.attr.background};
            this.f21498B = iArr;
            this.f21499C = cVar;
            a0 a0VarV = a0.v(context, null, iArr, i10, 0);
            if (a0VarV.s(0)) {
                setBackgroundDrawable(a0VarV.g(0));
            }
            a0VarV.x();
            if (z10) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f21499C = cVar;
            c();
        }

        public a.c b() {
            return this.f21499C;
        }

        public void c() {
            a.c cVar = this.f21499C;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f21502F = viewB;
                TextView textView = this.f21500D;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f21501E;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f21501E.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f21502F;
            if (view != null) {
                removeView(view);
                this.f21502F = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f21501E == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f21501E = appCompatImageView;
                }
                this.f21501E.setImageDrawable(drawableC);
                this.f21501E.setVisibility(0);
            } else {
                ImageView imageView2 = this.f21501E;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f21501E.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceD);
            if (zIsEmpty) {
                TextView textView2 = this.f21500D;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f21500D.setText((CharSequence) null);
                }
            } else {
                if (this.f21500D == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, i.a.f42398e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f21500D = appCompatTextView;
                }
                this.f21500D.setText(charSequenceD);
                this.f21500D.setVisibility(0);
            }
            ImageView imageView3 = this.f21501E;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            f0.a(this, zIsEmpty ? cVar.a() : null);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (T.this.f21490G > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = T.this.f21490G;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        C1999v c1999v = new C1999v(getContext(), null, i.a.f42401h);
        c1999v.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        c1999v.setOnItemSelectedListener(this);
        return c1999v;
    }

    private boolean d() {
        Spinner spinner = this.f21488E;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f21488E == null) {
            this.f21488E = b();
        }
        removeView(this.f21487D);
        addView(this.f21488E, new ViewGroup.LayoutParams(-2, -1));
        if (this.f21488E.getAdapter() == null) {
            this.f21488E.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f21485B;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f21485B = null;
        }
        this.f21488E.setSelection(this.f21493J);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f21488E);
        addView(this.f21487D, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f21488E.getSelectedItemPosition());
        return false;
    }

    public void a(int i10) {
        View childAt = this.f21487D.getChildAt(i10);
        Runnable runnable = this.f21485B;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f21485B = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z10) {
        d dVar = new d(getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f21492I));
        } else {
            dVar.setFocusable(true);
            if (this.f21486C == null) {
                this.f21486C = new c();
            }
            dVar.setOnClickListener(this.f21486C);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f21485B;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f21491H = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f21485B;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f21487D.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f21490G = -1;
        } else {
            if (childCount > 2) {
                this.f21490G = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f21490G = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f21490G = Math.min(this.f21490G, this.f21491H);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f21492I, 1073741824);
        if (z10 || !this.f21489F) {
            f();
        } else {
            this.f21487D.measure(0, iMakeMeasureSpec);
            if (this.f21487D.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
            } else {
                f();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z10 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f21493J);
    }

    public void setAllowCollapse(boolean z10) {
        this.f21489F = z10;
    }

    public void setContentHeight(int i10) {
        this.f21492I = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f21493J = i10;
        int childCount = this.f21487D.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f21487D.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f21488E;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
