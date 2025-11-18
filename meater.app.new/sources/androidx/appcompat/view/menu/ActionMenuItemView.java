package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.view.menu.InterfaceC0094n;
import androidx.appcompat.widget.AbstractViewOnTouchListenerC0155b0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0189s0;
import androidx.appcompat.widget.C0190t;
import p024c.p025a.C0832j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0190t implements InterfaceC0094n.a, View.OnClickListener, ActionMenuView.InterfaceC0113a {

    /* renamed from: j */
    C0089i f456j;

    /* renamed from: k */
    private CharSequence f457k;

    /* renamed from: l */
    private Drawable f458l;

    /* renamed from: m */
    C0087g.b f459m;

    /* renamed from: n */
    private AbstractViewOnTouchListenerC0155b0 f460n;

    /* renamed from: o */
    AbstractC0080b f461o;

    /* renamed from: p */
    private boolean f462p;

    /* renamed from: q */
    private boolean f463q;

    /* renamed from: r */
    private int f464r;

    /* renamed from: s */
    private int f465s;

    /* renamed from: t */
    private int f466t;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0079a extends AbstractViewOnTouchListenerC0155b0 {
        public C0079a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0155b0
        /* renamed from: b */
        public InterfaceC0096p mo474b() {
            AbstractC0080b abstractC0080b = ActionMenuItemView.this.f461o;
            if (abstractC0080b != null) {
                return abstractC0080b.mo476a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0155b0
        /* renamed from: c */
        protected boolean mo475c() {
            InterfaceC0096p interfaceC0096pMo474b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0087g.b bVar = actionMenuItemView.f459m;
            return bVar != null && bVar.mo477a(actionMenuItemView.f456j) && (interfaceC0096pMo474b = mo474b()) != null && interfaceC0096pMo474b.mo519a();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0080b {
        /* renamed from: a */
        public abstract InterfaceC0096p mo476a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: g */
    private boolean m467g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: h */
    private void m468h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f457k);
        if (this.f458l != null && (!this.f456j.m611B() || (!this.f462p && !this.f463q))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f457k : null);
        CharSequence contentDescription = this.f456j.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f456j.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f456j.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C0189s0.m1179a(this, z3 ? null : this.f456j.getTitle());
        } else {
            C0189s0.m1179a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0113a
    /* renamed from: a */
    public boolean mo469a() {
        return m473f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0113a
    /* renamed from: b */
    public boolean mo470b() {
        return m473f() && this.f456j.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n.a
    /* renamed from: d */
    public boolean mo471d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n.a
    /* renamed from: e */
    public void mo472e(C0089i c0089i, int i2) {
        this.f456j = c0089i;
        setIcon(c0089i.getIcon());
        setTitle(c0089i.m616i(this));
        setId(c0089i.getItemId());
        setVisibility(c0089i.isVisible() ? 0 : 8);
        setEnabled(c0089i.isEnabled());
        if (c0089i.hasSubMenu() && this.f460n == null) {
            this.f460n = new C0079a();
        }
    }

    /* renamed from: f */
    public boolean m473f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n.a
    public C0089i getItemData() {
        return this.f456j;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0087g.b bVar = this.f459m;
        if (bVar != null) {
            bVar.mo477a(this.f456j);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f462p = m467g();
        m468h();
    }

    @Override // androidx.appcompat.widget.C0190t, android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        boolean zM473f = m473f();
        if (zM473f && (i4 = this.f465s) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f464r) : this.f464r;
        if (mode != 1073741824 && this.f464r > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (zM473f || this.f458l == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f458l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0155b0 abstractViewOnTouchListenerC0155b0;
        if (this.f456j.hasSubMenu() && (abstractViewOnTouchListenerC0155b0 = this.f460n) != null && abstractViewOnTouchListenerC0155b0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f463q != z) {
            this.f463q = z;
            C0089i c0089i = this.f456j;
            if (c0089i != null) {
                c0089i.m612c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f458l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f466t;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        m468h();
    }

    public void setItemInvoker(C0087g.b bVar) {
        this.f459m = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.f465s = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(AbstractC0080b abstractC0080b) {
        this.f461o = abstractC0080b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f457k = charSequence;
        m468h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.f462p = m467g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0832j.f5433v, i2, 0);
        this.f464r = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0832j.f5438w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f466t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f465s = -1;
        setSaveEnabled(false);
    }
}
