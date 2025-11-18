package com.astuetz;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.astuetz.p120a.C5343a;
import com.astuetz.p120a.C5344b;
import com.astuetz.p120a.C5345c;
import com.astuetz.p120a.C5346d;
import p024c.p052i.p059j.C0955e;

/* loaded from: classes.dex */
public class PagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: f */
    private static final int[] f12967f = {R.attr.textColorPrimary, R.attr.padding, R.attr.paddingLeft, R.attr.paddingRight};

    /* renamed from: A */
    private int f12968A;

    /* renamed from: B */
    private ColorStateList f12969B;

    /* renamed from: C */
    private int f12970C;

    /* renamed from: D */
    private int f12971D;

    /* renamed from: E */
    private boolean f12972E;

    /* renamed from: F */
    private boolean f12973F;

    /* renamed from: G */
    private boolean f12974G;

    /* renamed from: H */
    private boolean f12975H;

    /* renamed from: I */
    private Typeface f12976I;

    /* renamed from: J */
    private int f12977J;

    /* renamed from: K */
    private int f12978K;

    /* renamed from: L */
    private int f12979L;

    /* renamed from: M */
    private int f12980M;

    /* renamed from: N */
    private ViewTreeObserver.OnGlobalLayoutListener f12981N;

    /* renamed from: g */
    private LinearLayout f12982g;

    /* renamed from: h */
    private LinearLayout.LayoutParams f12983h;

    /* renamed from: i */
    private final C5342f f12984i;

    /* renamed from: j */
    private final C5341e f12985j;

    /* renamed from: k */
    private InterfaceC5340d f12986k;

    /* renamed from: l */
    public ViewPager.InterfaceC0689j f12987l;

    /* renamed from: m */
    private ViewPager f12988m;

    /* renamed from: n */
    private int f12989n;

    /* renamed from: o */
    private int f12990o;

    /* renamed from: p */
    private float f12991p;

    /* renamed from: q */
    private Paint f12992q;

    /* renamed from: r */
    private Paint f12993r;

    /* renamed from: s */
    private int f12994s;

    /* renamed from: t */
    private int f12995t;

    /* renamed from: u */
    private int f12996u;

    /* renamed from: v */
    private int f12997v;

    /* renamed from: w */
    private int f12998w;

    /* renamed from: x */
    private int f12999x;

    /* renamed from: y */
    private int f13000y;

    /* renamed from: z */
    private int f13001z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5336a();

        /* renamed from: f */
        int f13002f;

        /* renamed from: com.astuetz.PagerSlidingTabStrip$SavedState$a */
        static class C5336a implements Parcelable.Creator<SavedState> {
            C5336a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, ViewOnClickListenerC5337a viewOnClickListenerC5337a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f13002f);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f13002f = parcel.readInt();
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$a */
    class ViewOnClickListenerC5337a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ int f13003f;

        ViewOnClickListenerC5337a(int i2) {
            this.f13003f = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            if (PagerSlidingTabStrip.this.f12988m.getCurrentItem() != this.f13003f) {
                PagerSlidingTabStrip.this.m9939z(PagerSlidingTabStrip.this.f12982g.getChildAt(PagerSlidingTabStrip.this.f12988m.getCurrentItem()));
                PagerSlidingTabStrip.this.f12988m.setCurrentItem(this.f13003f);
            } else if (PagerSlidingTabStrip.this.f12986k != null) {
                PagerSlidingTabStrip.this.f12986k.m9948a(this.f13003f);
            }
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$b */
    class ViewTreeObserverOnGlobalLayoutListenerC5338b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC5338b() {
        }

        @TargetApi(16)
        /* renamed from: a */
        private void m9943a() {
            PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* renamed from: b */
        private void m9944b() {
            PagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View childAt = PagerSlidingTabStrip.this.f12982g.getChildAt(0);
            if (Build.VERSION.SDK_INT < 16) {
                m9944b();
            } else {
                m9943a();
            }
            if (PagerSlidingTabStrip.this.f12974G) {
                int width = childAt.getWidth() / 2;
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.f12970C = pagerSlidingTabStrip.f12971D = (pagerSlidingTabStrip.getWidth() / 2) - width;
            }
            PagerSlidingTabStrip pagerSlidingTabStrip2 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip2.setPadding(pagerSlidingTabStrip2.f12970C, PagerSlidingTabStrip.this.getPaddingTop(), PagerSlidingTabStrip.this.f12971D, PagerSlidingTabStrip.this.getPaddingBottom());
            if (PagerSlidingTabStrip.this.f12978K == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip3 = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip3.f12978K = (pagerSlidingTabStrip3.getWidth() / 2) - PagerSlidingTabStrip.this.f12970C;
            }
            PagerSlidingTabStrip pagerSlidingTabStrip4 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip4.f12990o = pagerSlidingTabStrip4.f12988m.getCurrentItem();
            PagerSlidingTabStrip.this.f12991p = 0.0f;
            PagerSlidingTabStrip pagerSlidingTabStrip5 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip5.m9936w(pagerSlidingTabStrip5.f12990o, 0);
            PagerSlidingTabStrip pagerSlidingTabStrip6 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip6.m9913A(pagerSlidingTabStrip6.f12990o);
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$c */
    public interface InterfaceC5339c {
        /* renamed from: a */
        void m9945a(View view);

        /* renamed from: b */
        void m9946b(View view);

        /* renamed from: c */
        View m9947c(ViewGroup viewGroup, int i2);
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$d */
    public interface InterfaceC5340d {
        /* renamed from: a */
        void m9948a(int i2);
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$e */
    private class C5341e implements ViewPager.InterfaceC0689j {
        private C5341e() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0689j
        public void onPageScrollStateChanged(int i2) {
            if (i2 == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.m9936w(pagerSlidingTabStrip.f12988m.getCurrentItem(), 0);
            }
            PagerSlidingTabStrip.this.m9937x(PagerSlidingTabStrip.this.f12982g.getChildAt(PagerSlidingTabStrip.this.f12988m.getCurrentItem()));
            if (PagerSlidingTabStrip.this.f12988m.getCurrentItem() - 1 >= 0) {
                PagerSlidingTabStrip.this.m9939z(PagerSlidingTabStrip.this.f12982g.getChildAt(PagerSlidingTabStrip.this.f12988m.getCurrentItem() - 1));
            }
            if (PagerSlidingTabStrip.this.f12988m.getCurrentItem() + 1 <= PagerSlidingTabStrip.this.f12988m.getAdapter().getCount() - 1) {
                PagerSlidingTabStrip.this.m9939z(PagerSlidingTabStrip.this.f12982g.getChildAt(PagerSlidingTabStrip.this.f12988m.getCurrentItem() + 1));
            }
            ViewPager.InterfaceC0689j interfaceC0689j = PagerSlidingTabStrip.this.f12987l;
            if (interfaceC0689j != null) {
                interfaceC0689j.onPageScrollStateChanged(i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0689j
        public void onPageScrolled(int i2, float f2, int i3) {
            PagerSlidingTabStrip.this.f12990o = i2;
            PagerSlidingTabStrip.this.f12991p = f2;
            PagerSlidingTabStrip.this.m9936w(i2, PagerSlidingTabStrip.this.f12989n > 0 ? (int) (PagerSlidingTabStrip.this.f12982g.getChildAt(i2).getWidth() * f2) : 0);
            PagerSlidingTabStrip.this.invalidate();
            ViewPager.InterfaceC0689j interfaceC0689j = PagerSlidingTabStrip.this.f12987l;
            if (interfaceC0689j != null) {
                interfaceC0689j.onPageScrolled(i2, f2, i3);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0689j
        public void onPageSelected(int i2) {
            PagerSlidingTabStrip.this.m9913A(i2);
            ViewPager.InterfaceC0689j interfaceC0689j = PagerSlidingTabStrip.this.f12987l;
            if (interfaceC0689j != null) {
                interfaceC0689j.onPageSelected(i2);
            }
        }

        /* synthetic */ C5341e(PagerSlidingTabStrip pagerSlidingTabStrip, ViewOnClickListenerC5337a viewOnClickListenerC5337a) {
            this();
        }
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m9913A(int i2) {
        int i3 = 0;
        while (i3 < this.f12989n) {
            View childAt = this.f12982g.getChildAt(i3);
            if (i3 == i2) {
                m9937x(childAt);
            } else {
                m9939z(childAt);
            }
            i3++;
        }
    }

    /* renamed from: B */
    private void m9914B() {
        for (int i2 = 0; i2 < this.f12989n; i2++) {
            View childAt = this.f12982g.getChildAt(i2);
            childAt.setBackgroundResource(this.f12980M);
            childAt.setPadding(this.f13001z, childAt.getPaddingTop(), this.f13001z, childAt.getPaddingBottom());
            TextView textView = (TextView) childAt.findViewById(C5344b.f13010a);
            if (textView != null) {
                textView.setTextColor(this.f12969B);
                textView.setTypeface(this.f12976I, this.f12977J);
                textView.setTextSize(0, this.f12968A);
                if (this.f12975H) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(getResources().getConfiguration().locale));
                    }
                }
            }
        }
    }

    private C0955e<Float, Float> getIndicatorCoordinates() {
        int i2;
        View childAt = this.f12982g.getChildAt(this.f12990o);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.f12991p > 0.0f && (i2 = this.f12990o) < this.f12989n - 1) {
            View childAt2 = this.f12982g.getChildAt(i2 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f2 = this.f12991p;
            left = (left2 * f2) + ((1.0f - f2) * left);
            right = (right2 * f2) + ((1.0f - f2) * right);
        }
        return new C0955e<>(Float.valueOf(left), Float.valueOf(right));
    }

    /* renamed from: s */
    private void m9933s(int i2, CharSequence charSequence, View view) {
        TextView textView = (TextView) view.findViewById(C5344b.f13010a);
        if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
        view.setFocusable(true);
        view.setOnClickListener(new ViewOnClickListenerC5337a(i2));
        this.f12982g.addView(view, i2, this.f12983h);
    }

    /* renamed from: t */
    private ColorStateList m9934t(int i2) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{i2});
    }

    /* renamed from: u */
    private ColorStateList m9935u(int i2, int i3, int i4) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{R.attr.state_selected}, new int[0]}, new int[]{i2, i3, i4});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m9936w(int i2, int i3) {
        if (this.f12989n == 0) {
            return;
        }
        int left = this.f12982g.getChildAt(i2).getLeft() + i3;
        if (i2 > 0 || i3 > 0) {
            int i4 = left - this.f12978K;
            C0955e<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
            left = (int) (i4 + ((indicatorCoordinates.f6406b.floatValue() - indicatorCoordinates.f6405a.floatValue()) / 2.0f));
        }
        if (left != this.f12979L) {
            this.f12979L = left;
            scrollTo(left, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m9937x(View view) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(C5344b.f13010a);
            if (textView != null) {
                textView.setSelected(true);
            }
            if (this.f12973F) {
                ((InterfaceC5339c) this.f12988m.getAdapter()).m9946b(view);
            }
        }
    }

    /* renamed from: y */
    private void m9938y() {
        int i2 = this.f12995t;
        int i3 = this.f12996u;
        if (i2 < i3) {
            i2 = i3;
        }
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m9939z(View view) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(C5344b.f13010a);
            if (textView != null) {
                textView.setSelected(false);
            }
            if (this.f12973F) {
                ((InterfaceC5339c) this.f12988m.getAdapter()).m9945a(view);
            }
        }
    }

    public int getDividerColor() {
        return this.f13000y;
    }

    public int getDividerPadding() {
        return this.f12999x;
    }

    public int getDividerWidth() {
        return this.f12998w;
    }

    public int getIndicatorColor() {
        return this.f12994s;
    }

    public int getIndicatorHeight() {
        return this.f12995t;
    }

    public int getScrollOffset() {
        return this.f12978K;
    }

    public boolean getShouldExpand() {
        return this.f12972E;
    }

    public int getTabBackground() {
        return this.f12980M;
    }

    public int getTabPaddingLeftRight() {
        return this.f13001z;
    }

    public ColorStateList getTextColor() {
        return this.f12969B;
    }

    public int getTextSize() {
        return this.f12968A;
    }

    public int getUnderlineColor() {
        return this.f12997v;
    }

    public int getUnderlineHeight() {
        return this.f12996u;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12988m == null || this.f12984i.m9949a()) {
            return;
        }
        this.f12988m.getAdapter().registerDataSetObserver(this.f12984i);
        this.f12984i.m9950b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f12988m == null || !this.f12984i.m9949a()) {
            return;
        }
        this.f12988m.getAdapter().unregisterDataSetObserver(this.f12984i);
        this.f12984i.m9950b(false);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f12989n == 0) {
            return;
        }
        int height = getHeight();
        int i2 = this.f12998w;
        if (i2 > 0) {
            this.f12993r.setStrokeWidth(i2);
            this.f12993r.setColor(this.f13000y);
            for (int i3 = 0; i3 < this.f12989n - 1; i3++) {
                View childAt = this.f12982g.getChildAt(i3);
                canvas.drawLine(childAt.getRight(), this.f12999x, childAt.getRight(), height - this.f12999x, this.f12993r);
            }
        }
        if (this.f12996u > 0) {
            this.f12992q.setColor(this.f12997v);
            canvas.drawRect(this.f12970C, height - this.f12996u, this.f12982g.getWidth() + this.f12971D, height, this.f12992q);
        }
        if (this.f12995t > 0) {
            this.f12992q.setColor(this.f12994s);
            C0955e<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
            canvas.drawRect(indicatorCoordinates.f6405a.floatValue() + this.f12970C, height - this.f12995t, indicatorCoordinates.f6406b.floatValue() + this.f12970C, height, this.f12992q);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2 = this.f12974G;
        if (z2 || this.f12970C > 0 || this.f12971D > 0) {
            this.f12982g.setMinimumWidth(z2 ? getWidth() : (getWidth() - this.f12970C) - this.f12971D);
            setClipToPadding(false);
        }
        if (this.f12982g.getChildCount() > 0) {
            this.f12982g.getChildAt(0).getViewTreeObserver().addOnGlobalLayoutListener(this.f12981N);
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i2 = savedState.f13002f;
        this.f12990o = i2;
        if (i2 != 0 && this.f12982g.getChildCount() > 0) {
            m9939z(this.f12982g.getChildAt(0));
            m9937x(this.f12982g.getChildAt(this.f12990o));
        }
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13002f = this.f12990o;
        return savedState;
    }

    public void setAllCaps(boolean z) {
        this.f12975H = z;
    }

    public void setDividerColor(int i2) {
        this.f13000y = i2;
        invalidate();
    }

    public void setDividerColorResource(int i2) {
        this.f13000y = getResources().getColor(i2);
        invalidate();
    }

    public void setDividerPadding(int i2) {
        this.f12999x = i2;
        invalidate();
    }

    public void setDividerWidth(int i2) {
        this.f12998w = i2;
        invalidate();
    }

    public void setIndicatorColor(int i2) {
        this.f12994s = i2;
        invalidate();
    }

    public void setIndicatorColorResource(int i2) {
        this.f12994s = getResources().getColor(i2);
        invalidate();
    }

    public void setIndicatorHeight(int i2) {
        this.f12995t = i2;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC0689j interfaceC0689j) {
        this.f12987l = interfaceC0689j;
    }

    public void setOnTabReselectedListener(InterfaceC5340d interfaceC5340d) {
        this.f12986k = interfaceC5340d;
    }

    public void setScrollOffset(int i2) {
        this.f12978K = i2;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.f12972E = z;
        if (this.f12988m != null) {
            requestLayout();
        }
    }

    public void setTabBackground(int i2) {
        this.f12980M = i2;
    }

    public void setTabPaddingLeftRight(int i2) {
        this.f13001z = i2;
        m9914B();
    }

    public void setTextColor(int i2) {
        setTextColor(m9934t(i2));
    }

    public void setTextColorResource(int i2) {
        setTextColor(getResources().getColor(i2));
    }

    public void setTextColorStateListResource(int i2) {
        setTextColor(getResources().getColorStateList(i2));
    }

    public void setTextSize(int i2) {
        this.f12968A = i2;
        m9914B();
    }

    public void setUnderlineColor(int i2) {
        this.f12997v = i2;
        invalidate();
    }

    public void setUnderlineColorResource(int i2) {
        this.f12997v = getResources().getColor(i2);
        invalidate();
    }

    public void setUnderlineHeight(int i2) {
        this.f12996u = i2;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f12988m = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f12973F = viewPager.getAdapter() instanceof InterfaceC5339c;
        viewPager.setOnPageChangeListener(this.f12985j);
        viewPager.getAdapter().registerDataSetObserver(this.f12984i);
        this.f12984i.m9950b(true);
        m9940v();
    }

    /* renamed from: v */
    public void m9940v() {
        this.f12982g.removeAllViews();
        this.f12989n = this.f12988m.getAdapter().getCount();
        for (int i2 = 0; i2 < this.f12989n; i2++) {
            m9933s(i2, this.f12988m.getAdapter().getPageTitle(i2), this.f12973F ? ((InterfaceC5339c) this.f12988m.getAdapter()).m9947c(this, i2) : LayoutInflater.from(getContext()).inflate(C5345c.f13011a, (ViewGroup) this, false));
        }
        m9914B();
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$f */
    private class C5342f extends DataSetObserver {

        /* renamed from: a */
        private boolean f13007a;

        private C5342f() {
            this.f13007a = false;
        }

        /* renamed from: a */
        public boolean m9949a() {
            return this.f13007a;
        }

        /* renamed from: b */
        public void m9950b(boolean z) {
            this.f13007a = z;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerSlidingTabStrip.this.m9940v();
        }

        /* synthetic */ C5342f(PagerSlidingTabStrip pagerSlidingTabStrip, ViewOnClickListenerC5337a viewOnClickListenerC5337a) {
            this();
        }
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i2) {
        String str;
        super(context, attributeSet, i2);
        this.f12984i = new C5342f(this, 0 == true ? 1 : 0);
        this.f12985j = new C5341e(this, 0 == true ? 1 : 0);
        this.f12986k = null;
        this.f12990o = 0;
        this.f12991p = 0.0f;
        this.f12995t = 2;
        this.f12996u = 0;
        this.f12998w = 0;
        this.f12999x = 0;
        this.f13001z = 12;
        this.f12968A = 14;
        this.f12969B = null;
        this.f12970C = 0;
        this.f12971D = 0;
        this.f12972E = false;
        this.f12974G = false;
        this.f12975H = true;
        this.f12976I = null;
        this.f12977J = 1;
        this.f12979L = 0;
        this.f12980M = C5343a.f13009a;
        this.f12981N = new ViewTreeObserverOnGlobalLayoutListenerC5338b();
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12982g = linearLayout;
        linearLayout.setOrientation(0);
        addView(this.f12982g);
        Paint paint = new Paint();
        this.f12992q = paint;
        paint.setAntiAlias(true);
        this.f12992q.setStyle(Paint.Style.FILL);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f12978K = (int) TypedValue.applyDimension(1, this.f12978K, displayMetrics);
        this.f12995t = (int) TypedValue.applyDimension(1, this.f12995t, displayMetrics);
        this.f12996u = (int) TypedValue.applyDimension(1, this.f12996u, displayMetrics);
        this.f12999x = (int) TypedValue.applyDimension(1, this.f12999x, displayMetrics);
        this.f13001z = (int) TypedValue.applyDimension(1, this.f13001z, displayMetrics);
        this.f12998w = (int) TypedValue.applyDimension(1, this.f12998w, displayMetrics);
        this.f12968A = (int) TypedValue.applyDimension(2, this.f12968A, displayMetrics);
        Paint paint2 = new Paint();
        this.f12993r = paint2;
        paint2.setAntiAlias(true);
        this.f12993r.setStrokeWidth(this.f12998w);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12967f);
        int color = typedArrayObtainStyledAttributes.getColor(0, getResources().getColor(R.color.black));
        this.f12997v = color;
        this.f13000y = color;
        this.f12994s = color;
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f12970C = dimensionPixelSize > 0 ? dimensionPixelSize : typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f12971D = dimensionPixelSize <= 0 ? typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0) : dimensionPixelSize;
        typedArrayObtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f12977J = 0;
            str = "sans-serif-medium";
        } else {
            str = "sans-serif";
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C5346d.f13012a);
        this.f12994s = typedArrayObtainStyledAttributes2.getColor(C5346d.f13016e, this.f12994s);
        this.f12995t = typedArrayObtainStyledAttributes2.getDimensionPixelSize(C5346d.f13017f, this.f12995t);
        this.f12997v = typedArrayObtainStyledAttributes2.getColor(C5346d.f13029r, this.f12997v);
        this.f12996u = typedArrayObtainStyledAttributes2.getDimensionPixelSize(C5346d.f13030s, this.f12996u);
        this.f13000y = typedArrayObtainStyledAttributes2.getColor(C5346d.f13013b, this.f13000y);
        this.f12998w = typedArrayObtainStyledAttributes2.getDimensionPixelSize(C5346d.f13015d, this.f12998w);
        this.f12999x = typedArrayObtainStyledAttributes2.getDimensionPixelSize(C5346d.f13014c, this.f12999x);
        this.f12972E = typedArrayObtainStyledAttributes2.getBoolean(C5346d.f13020i, this.f12972E);
        this.f12978K = typedArrayObtainStyledAttributes2.getDimensionPixelSize(C5346d.f13019h, this.f12978K);
        this.f12974G = typedArrayObtainStyledAttributes2.getBoolean(C5346d.f13018g, this.f12974G);
        this.f13001z = typedArrayObtainStyledAttributes2.getDimensionPixelSize(C5346d.f13022k, this.f13001z);
        this.f12980M = typedArrayObtainStyledAttributes2.getResourceId(C5346d.f13021j, this.f12980M);
        this.f12968A = typedArrayObtainStyledAttributes2.getDimensionPixelSize(C5346d.f13027p, this.f12968A);
        int i3 = C5346d.f13025n;
        this.f12969B = typedArrayObtainStyledAttributes2.hasValue(i3) ? typedArrayObtainStyledAttributes2.getColorStateList(i3) : null;
        this.f12977J = typedArrayObtainStyledAttributes2.getInt(C5346d.f13028q, this.f12977J);
        this.f12975H = typedArrayObtainStyledAttributes2.getBoolean(C5346d.f13023l, this.f12975H);
        int i4 = typedArrayObtainStyledAttributes2.getInt(C5346d.f13024m, 150);
        String string = typedArrayObtainStyledAttributes2.getString(C5346d.f13026o);
        typedArrayObtainStyledAttributes2.recycle();
        if (this.f12969B == null) {
            this.f12969B = m9935u(color, color, Color.argb(i4, Color.red(color), Color.green(color), Color.blue(color)));
        }
        this.f12976I = Typeface.create(string != null ? string : str, this.f12977J);
        m9938y();
        this.f12983h = this.f12972E ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f12969B = colorStateList;
        m9914B();
    }
}
