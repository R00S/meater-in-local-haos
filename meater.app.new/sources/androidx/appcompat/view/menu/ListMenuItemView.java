package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.a0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: B, reason: collision with root package name */
    private g f20931B;

    /* renamed from: C, reason: collision with root package name */
    private ImageView f20932C;

    /* renamed from: D, reason: collision with root package name */
    private RadioButton f20933D;

    /* renamed from: E, reason: collision with root package name */
    private TextView f20934E;

    /* renamed from: F, reason: collision with root package name */
    private CheckBox f20935F;

    /* renamed from: G, reason: collision with root package name */
    private TextView f20936G;

    /* renamed from: H, reason: collision with root package name */
    private ImageView f20937H;

    /* renamed from: I, reason: collision with root package name */
    private ImageView f20938I;

    /* renamed from: J, reason: collision with root package name */
    private LinearLayout f20939J;

    /* renamed from: K, reason: collision with root package name */
    private Drawable f20940K;

    /* renamed from: L, reason: collision with root package name */
    private int f20941L;

    /* renamed from: M, reason: collision with root package name */
    private Context f20942M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f20943N;

    /* renamed from: O, reason: collision with root package name */
    private Drawable f20944O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f20945P;

    /* renamed from: Q, reason: collision with root package name */
    private LayoutInflater f20946Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f20947R;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42382E);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f20939J;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(i.g.f42533h, (ViewGroup) this, false);
        this.f20935F = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(i.g.f42534i, (ViewGroup) this, false);
        this.f20932C = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(i.g.f42536k, (ViewGroup) this, false);
        this.f20933D = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f20946Q == null) {
            this.f20946Q = LayoutInflater.from(getContext());
        }
        return this.f20946Q;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f20937H;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f20938I;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f20938I.getLayoutParams();
        rect.top += this.f20938I.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(g gVar, int i10) {
        this.f20931B = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f20931B;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f20931B.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f20936G.setText(this.f20931B.h());
        }
        if (this.f20936G.getVisibility() != i10) {
            this.f20936G.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f20940K);
        TextView textView = (TextView) findViewById(i.f.f42496L);
        this.f20934E = textView;
        int i10 = this.f20941L;
        if (i10 != -1) {
            textView.setTextAppearance(this.f20942M, i10);
        }
        this.f20936G = (TextView) findViewById(i.f.f42489E);
        ImageView imageView = (ImageView) findViewById(i.f.f42492H);
        this.f20937H = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f20944O);
        }
        this.f20938I = (ImageView) findViewById(i.f.f42517r);
        this.f20939J = (LinearLayout) findViewById(i.f.f42511l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f20932C != null && this.f20943N) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f20932C.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f20933D == null && this.f20935F == null) {
            return;
        }
        if (this.f20931B.m()) {
            if (this.f20933D == null) {
                g();
            }
            compoundButton = this.f20933D;
            view = this.f20935F;
        } else {
            if (this.f20935F == null) {
                c();
            }
            compoundButton = this.f20935F;
            view = this.f20933D;
        }
        if (z10) {
            compoundButton.setChecked(this.f20931B.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f20935F;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f20933D;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f20931B.m()) {
            if (this.f20933D == null) {
                g();
            }
            compoundButton = this.f20933D;
        } else {
            if (this.f20935F == null) {
                c();
            }
            compoundButton = this.f20935F;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f20947R = z10;
        this.f20943N = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f20938I;
        if (imageView != null) {
            imageView.setVisibility((this.f20945P || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f20931B.z() || this.f20947R;
        if (z10 || this.f20943N) {
            ImageView imageView = this.f20932C;
            if (imageView == null && drawable == null && !this.f20943N) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f20943N) {
                this.f20932C.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f20932C;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f20932C.getVisibility() != 0) {
                this.f20932C.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f20934E.getVisibility() != 8) {
                this.f20934E.setVisibility(8);
            }
        } else {
            this.f20934E.setText(charSequence);
            if (this.f20934E.getVisibility() != 0) {
                this.f20934E.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        a0 a0VarV = a0.v(getContext(), attributeSet, i.j.f42658T1, i10, 0);
        this.f20940K = a0VarV.g(i.j.f42666V1);
        this.f20941L = a0VarV.n(i.j.f42662U1, -1);
        this.f20943N = a0VarV.a(i.j.f42670W1, false);
        this.f20942M = context;
        this.f20944O = a0VarV.g(i.j.f42674X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, i.a.f42379B, 0);
        this.f20945P = typedArrayObtainStyledAttributes.hasValue(0);
        a0VarV.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
