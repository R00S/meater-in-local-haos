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
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.f0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: I, reason: collision with root package name */
    g f20916I;

    /* renamed from: J, reason: collision with root package name */
    private CharSequence f20917J;

    /* renamed from: K, reason: collision with root package name */
    private Drawable f20918K;

    /* renamed from: L, reason: collision with root package name */
    e.b f20919L;

    /* renamed from: M, reason: collision with root package name */
    private L f20920M;

    /* renamed from: N, reason: collision with root package name */
    b f20921N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f20922O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f20923P;

    /* renamed from: Q, reason: collision with root package name */
    private int f20924Q;

    /* renamed from: R, reason: collision with root package name */
    private int f20925R;

    /* renamed from: S, reason: collision with root package name */
    private int f20926S;

    private class a extends L {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.L
        public n.e b() {
            b bVar = ActionMenuItemView.this.f20921N;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.L
        protected boolean c() {
            n.e eVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f20919L;
            return bVar != null && bVar.a(actionMenuItemView.f20916I) && (eVarB = b()) != null && eVarB.a();
        }
    }

    public static abstract class b {
        public abstract n.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void u() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f20917J);
        if (this.f20918K != null && (!this.f20916I.B() || (!this.f20922O && !this.f20923P))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f20917J : null);
        CharSequence contentDescription = this.f20916I.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f20916I.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f20916I.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            f0.a(this, z12 ? null : this.f20916I.getTitle());
        } else {
            f0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return s() && this.f20916I.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(g gVar, int i10) {
        this.f20916I = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f20920M == null) {
            this.f20920M = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f20916I;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f20919L;
        if (bVar != null) {
            bVar.a(this.f20916I);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f20922O = t();
        u();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean zS = s();
        if (zS && (i12 = this.f20925R) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f20924Q) : this.f20924Q;
        if (mode != 1073741824 && this.f20924Q > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zS || this.f20918K == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f20918K.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        L l10;
        if (this.f20916I.hasSubMenu() && (l10 = this.f20920M) != null && l10.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f20923P != z10) {
            this.f20923P = z10;
            g gVar = this.f20916I;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f20918K = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f20926S;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        u();
    }

    public void setItemInvoker(e.b bVar) {
        this.f20919L = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f20925R = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f20921N = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f20917J = charSequence;
        u();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f20922O = t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f42789v, i10, 0);
        this.f20924Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f42794w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f20926S = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f20925R = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
