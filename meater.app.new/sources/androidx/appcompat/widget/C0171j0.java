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
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.widget.C0157c0;
import p024c.p025a.C0823a;
import p024c.p025a.p032o.C0841a;

/* compiled from: ScrollingTabContainerView.java */
/* renamed from: androidx.appcompat.widget.j0 */
/* loaded from: classes.dex */
public class C0171j0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: f */
    private static final Interpolator f1160f = new DecelerateInterpolator();

    /* renamed from: g */
    Runnable f1161g;

    /* renamed from: h */
    private c f1162h;

    /* renamed from: i */
    C0157c0 f1163i;

    /* renamed from: j */
    private Spinner f1164j;

    /* renamed from: k */
    private boolean f1165k;

    /* renamed from: l */
    int f1166l;

    /* renamed from: m */
    int f1167m;

    /* renamed from: n */
    private int f1168n;

    /* renamed from: o */
    private int f1169o;

    /* compiled from: ScrollingTabContainerView.java */
    /* renamed from: androidx.appcompat.widget.j0$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f1170f;

        a(View view) {
            this.f1170f = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0171j0.this.smoothScrollTo(this.f1170f.getLeft() - ((C0171j0.this.getWidth() - this.f1170f.getWidth()) / 2), 0);
            C0171j0.this.f1161g = null;
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    /* renamed from: androidx.appcompat.widget.j0$b */
    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0171j0.this.f1163i.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return ((d) C0171j0.this.f1163i.getChildAt(i2)).m1038b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0171j0.this.m1036c((AbstractC0064a.c) getItem(i2), true);
            }
            ((d) view).m1037a((AbstractC0064a.c) getItem(i2));
            return view;
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    /* renamed from: androidx.appcompat.widget.j0$c */
    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).m1038b().m239e();
            int childCount = C0171j0.this.f1163i.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = C0171j0.this.f1163i.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    /* renamed from: androidx.appcompat.widget.j0$d */
    private class d extends LinearLayout {

        /* renamed from: f */
        private final int[] f1174f;

        /* renamed from: g */
        private AbstractC0064a.c f1175g;

        /* renamed from: h */
        private TextView f1176h;

        /* renamed from: i */
        private ImageView f1177i;

        /* renamed from: j */
        private View f1178j;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, AbstractC0064a.c cVar, boolean z) {
            int i2 = C0823a.f5030d;
            super(context, null, i2);
            int[] iArr = {R.attr.background};
            this.f1174f = iArr;
            this.f1175g = cVar;
            C0185q0 c0185q0M1091v = C0185q0.m1091v(context, null, iArr, i2, 0);
            if (c0185q0M1091v.m1110s(0)) {
                setBackgroundDrawable(c0185q0M1091v.m1098g(0));
            }
            c0185q0M1091v.m1111w();
            if (z) {
                setGravity(8388627);
            }
            m1039c();
        }

        /* renamed from: a */
        public void m1037a(AbstractC0064a.c cVar) {
            this.f1175g = cVar;
            m1039c();
        }

        /* renamed from: b */
        public AbstractC0064a.c m1038b() {
            return this.f1175g;
        }

        /* renamed from: c */
        public void m1039c() {
            AbstractC0064a.c cVar = this.f1175g;
            View viewM236b = cVar.m236b();
            if (viewM236b != null) {
                ViewParent parent = viewM236b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewM236b);
                    }
                    addView(viewM236b);
                }
                this.f1178j = viewM236b;
                TextView textView = this.f1176h;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1177i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1177i.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1178j;
            if (view != null) {
                removeView(view);
                this.f1178j = null;
            }
            Drawable drawableM237c = cVar.m237c();
            CharSequence charSequenceM238d = cVar.m238d();
            if (drawableM237c != null) {
                if (this.f1177i == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1177i = appCompatImageView;
                }
                this.f1177i.setImageDrawable(drawableM237c);
                this.f1177i.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1177i;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1177i.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceM238d);
            if (z) {
                if (this.f1176h == null) {
                    C0190t c0190t = new C0190t(getContext(), null, C0823a.f5031e);
                    c0190t.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c0190t.setLayoutParams(layoutParams2);
                    addView(c0190t);
                    this.f1176h = c0190t;
                }
                this.f1176h.setText(charSequenceM238d);
                this.f1176h.setVisibility(0);
            } else {
                TextView textView2 = this.f1176h;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1176h.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1177i;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.m235a());
            }
            C0189s0.m1179a(this, z ? null : cVar.m235a());
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
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (C0171j0.this.f1166l > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = C0171j0.this.f1166l;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: b */
    private Spinner m1031b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C0823a.f5034h);
        appCompatSpinner.setLayoutParams(new C0157c0.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: d */
    private boolean m1032d() {
        Spinner spinner = this.f1164j;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m1033e() {
        if (m1032d()) {
            return;
        }
        if (this.f1164j == null) {
            this.f1164j = m1031b();
        }
        removeView(this.f1163i);
        addView(this.f1164j, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1164j.getAdapter() == null) {
            this.f1164j.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1161g;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1161g = null;
        }
        this.f1164j.setSelection(this.f1169o);
    }

    /* renamed from: f */
    private boolean m1034f() {
        if (!m1032d()) {
            return false;
        }
        removeView(this.f1164j);
        addView(this.f1163i, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1164j.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void m1035a(int i2) {
        View childAt = this.f1163i.getChildAt(i2);
        Runnable runnable = this.f1161g;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1161g = aVar;
        post(aVar);
    }

    /* renamed from: c */
    d m1036c(AbstractC0064a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1168n));
        } else {
            dVar.setFocusable(true);
            if (this.f1162h == null) {
                this.f1162h = new c();
            }
            dVar.setOnClickListener(this.f1162h);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1161g;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0841a c0841aM5331b = C0841a.m5331b(getContext());
        setContentHeight(c0841aM5331b.m5336f());
        this.f1167m = c0841aM5331b.m5335e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1161g;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).m1038b().m239e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f1163i.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1166l = -1;
        } else {
            if (childCount > 2) {
                this.f1166l = (int) (View.MeasureSpec.getSize(i2) * 0.4f);
            } else {
                this.f1166l = View.MeasureSpec.getSize(i2) / 2;
            }
            this.f1166l = Math.min(this.f1166l, this.f1167m);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1168n, 1073741824);
        if (!z && this.f1165k) {
            this.f1163i.measure(0, iMakeMeasureSpec);
            if (this.f1163i.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                m1033e();
            } else {
                m1034f();
            }
        } else {
            m1034f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1169o);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1165k = z;
    }

    public void setContentHeight(int i2) {
        this.f1168n = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.f1169o = i2;
        int childCount = this.f1163i.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f1163i.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                m1035a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f1164j;
        if (spinner == null || i2 < 0) {
            return;
        }
        spinner.setSelection(i2);
    }
}
