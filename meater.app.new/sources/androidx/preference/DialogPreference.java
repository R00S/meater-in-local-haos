package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.p003d.C0264g;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: V */
    private CharSequence f3533V;

    /* renamed from: W */
    private CharSequence f3534W;

    /* renamed from: X */
    private Drawable f3535X;

    /* renamed from: Y */
    private CharSequence f3536Y;

    /* renamed from: Z */
    private CharSequence f3537Z;

    /* renamed from: a0 */
    private int f3538a0;

    /* renamed from: androidx.preference.DialogPreference$a */
    public interface InterfaceC0532a {
        <T extends Preference> T findPreference(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0576t.f3763D, i2, i3);
        String strM1780o = C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3793N, C0576t.f3766E);
        this.f3533V = strM1780o;
        if (strM1780o == null) {
            this.f3533V = m4020W();
        }
        this.f3534W = C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3790M, C0576t.f3769F);
        this.f3535X = C0264g.m1768c(typedArrayObtainStyledAttributes, C0576t.f3784K, C0576t.f3772G);
        this.f3536Y = C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3799P, C0576t.f3775H);
        this.f3537Z = C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3796O, C0576t.f3778I);
        this.f3538a0 = C0264g.m1779n(typedArrayObtainStyledAttributes, C0576t.f3787L, C0576t.f3781J, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: Z0 */
    public Drawable m3933Z0() {
        return this.f3535X;
    }

    /* renamed from: a1 */
    public int m3934a1() {
        return this.f3538a0;
    }

    /* renamed from: b1 */
    public CharSequence m3935b1() {
        return this.f3534W;
    }

    /* renamed from: c1 */
    public CharSequence m3936c1() {
        return this.f3533V;
    }

    /* renamed from: d1 */
    public CharSequence m3937d1() {
        return this.f3537Z;
    }

    /* renamed from: e1 */
    public CharSequence m3938e1() {
        return this.f3536Y;
    }

    @Override // androidx.preference.Preference
    /* renamed from: l0 */
    protected void mo3939l0() {
        m4014S().m4159s(this);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0264g.m1766a(context, C0569m.f3725c, R.attr.dialogPreferenceStyle));
    }
}
