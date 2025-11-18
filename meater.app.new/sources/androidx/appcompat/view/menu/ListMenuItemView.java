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
import androidx.appcompat.view.menu.InterfaceC0094n;
import androidx.appcompat.widget.C0185q0;
import androidx.core.view.C0311u;
import p024c.p025a.C0823a;
import p024c.p025a.C0828f;
import p024c.p025a.C0829g;
import p024c.p025a.C0832j;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0094n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f */
    private C0089i f471f;

    /* renamed from: g */
    private ImageView f472g;

    /* renamed from: h */
    private RadioButton f473h;

    /* renamed from: i */
    private TextView f474i;

    /* renamed from: j */
    private CheckBox f475j;

    /* renamed from: k */
    private TextView f476k;

    /* renamed from: l */
    private ImageView f477l;

    /* renamed from: m */
    private ImageView f478m;

    /* renamed from: n */
    private LinearLayout f479n;

    /* renamed from: o */
    private Drawable f480o;

    /* renamed from: p */
    private int f481p;

    /* renamed from: q */
    private Context f482q;

    /* renamed from: r */
    private boolean f483r;

    /* renamed from: s */
    private Drawable f484s;

    /* renamed from: t */
    private boolean f485t;

    /* renamed from: u */
    private LayoutInflater f486u;

    /* renamed from: v */
    private boolean f487v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5015D);
    }

    /* renamed from: a */
    private void m479a(View view) {
        m480b(view, -1);
    }

    /* renamed from: b */
    private void m480b(View view, int i2) {
        LinearLayout linearLayout = this.f479n;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    /* renamed from: c */
    private void m481c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C0829g.f5169h, (ViewGroup) this, false);
        this.f475j = checkBox;
        m479a(checkBox);
    }

    /* renamed from: f */
    private void m482f() {
        ImageView imageView = (ImageView) getInflater().inflate(C0829g.f5170i, (ViewGroup) this, false);
        this.f472g = imageView;
        m480b(imageView, 0);
    }

    /* renamed from: g */
    private void m483g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C0829g.f5172k, (ViewGroup) this, false);
        this.f473h = radioButton;
        m479a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f486u == null) {
            this.f486u = LayoutInflater.from(getContext());
        }
        return this.f486u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f477l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f478m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f478m.getLayoutParams();
        rect.top += this.f478m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n.a
    /* renamed from: d */
    public boolean mo471d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n.a
    /* renamed from: e */
    public void mo472e(C0089i c0089i, int i2) {
        this.f471f = c0089i;
        setVisibility(c0089i.isVisible() ? 0 : 8);
        setTitle(c0089i.m616i(this));
        setCheckable(c0089i.isCheckable());
        m484h(c0089i.m610A(), c0089i.m614g());
        setIcon(c0089i.getIcon());
        setEnabled(c0089i.isEnabled());
        setSubMenuArrowVisible(c0089i.hasSubMenu());
        setContentDescription(c0089i.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n.a
    public C0089i getItemData() {
        return this.f471f;
    }

    /* renamed from: h */
    public void m484h(boolean z, char c2) {
        int i2 = (z && this.f471f.m610A()) ? 0 : 8;
        if (i2 == 0) {
            this.f476k.setText(this.f471f.m615h());
        }
        if (this.f476k.getVisibility() != i2) {
            this.f476k.setVisibility(i2);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C0311u.m2139m0(this, this.f480o);
        TextView textView = (TextView) findViewById(C0828f.f5132M);
        this.f474i = textView;
        int i2 = this.f481p;
        if (i2 != -1) {
            textView.setTextAppearance(this.f482q, i2);
        }
        this.f476k = (TextView) findViewById(C0828f.f5125F);
        ImageView imageView = (ImageView) findViewById(C0828f.f5128I);
        this.f477l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f484s);
        }
        this.f478m = (ImageView) findViewById(C0828f.f5153r);
        this.f479n = (LinearLayout) findViewById(C0828f.f5147l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f472g != null && this.f483r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f472g.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f473h == null && this.f475j == null) {
            return;
        }
        if (this.f471f.m620m()) {
            if (this.f473h == null) {
                m483g();
            }
            compoundButton = this.f473h;
            compoundButton2 = this.f475j;
        } else {
            if (this.f475j == null) {
                m481c();
            }
            compoundButton = this.f475j;
            compoundButton2 = this.f473h;
        }
        if (z) {
            compoundButton.setChecked(this.f471f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f475j;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f473h;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f471f.m620m()) {
            if (this.f473h == null) {
                m483g();
            }
            compoundButton = this.f473h;
        } else {
            if (this.f475j == null) {
                m481c();
            }
            compoundButton = this.f475j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f487v = z;
        this.f483r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f478m;
        if (imageView != null) {
            imageView.setVisibility((this.f485t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f471f.m633z() || this.f487v;
        if (z || this.f483r) {
            ImageView imageView = this.f472g;
            if (imageView == null && drawable == null && !this.f483r) {
                return;
            }
            if (imageView == null) {
                m482f();
            }
            if (drawable == null && !this.f483r) {
                this.f472g.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f472g;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f472g.getVisibility() != 0) {
                this.f472g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f474i.getVisibility() != 8) {
                this.f474i.setVisibility(8);
            }
        } else {
            this.f474i.setText(charSequence);
            if (this.f474i.getVisibility() != 0) {
                this.f474i.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        C0185q0 c0185q0M1091v = C0185q0.m1091v(getContext(), attributeSet, C0832j.f5311W1, i2, 0);
        this.f480o = c0185q0M1091v.m1098g(C0832j.f5321Y1);
        this.f481p = c0185q0M1091v.m1105n(C0832j.f5316X1, -1);
        this.f483r = c0185q0M1091v.m1092a(C0832j.f5326Z1, false);
        this.f482q = context;
        this.f484s = c0185q0M1091v.m1098g(C0832j.f5331a2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C0823a.f5012A, 0);
        this.f485t = typedArrayObtainStyledAttributes.hasValue(0);
        c0185q0M1091v.m1111w();
        typedArrayObtainStyledAttributes.recycle();
    }
}
