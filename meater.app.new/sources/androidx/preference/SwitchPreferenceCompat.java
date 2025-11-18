package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.p003d.C0264g;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: a0 */
    private final C0555a f3636a0;

    /* renamed from: b0 */
    private CharSequence f3637b0;

    /* renamed from: c0 */
    private CharSequence f3638c0;

    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    private class C0555a implements CompoundButton.OnCheckedChangeListener {
        C0555a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreferenceCompat.this.m4034k(Boolean.valueOf(z))) {
                SwitchPreferenceCompat.this.m4091a1(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f3636a0 = new C0555a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0576t.f3795N1, i2, i3);
        m4094d1(C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3819V1, C0576t.f3798O1));
        m4093c1(C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3816U1, C0576t.f3801P1));
        m4089h1(C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3825X1, C0576t.f3807R1));
        m4088g1(C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3822W1, C0576t.f3810S1));
        m4092b1(C0264g.m1767b(typedArrayObtainStyledAttributes, C0576t.f3813T1, C0576t.f3804Q1, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i1 */
    private void m4086i1(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3640V);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f3637b0);
            switchCompat.setTextOff(this.f3638c0);
            switchCompat.setOnCheckedChangeListener(this.f3636a0);
        }
    }

    /* renamed from: j1 */
    private void m4087j1(View view) {
        if (((AccessibilityManager) m3987D().getSystemService("accessibility")).isEnabled()) {
            m4086i1(view.findViewById(C0572p.f3743f));
            m4095e1(view.findViewById(R.id.summary));
        }
    }

    /* renamed from: g1 */
    public void m4088g1(CharSequence charSequence) {
        this.f3638c0 = charSequence;
        mo3942e0();
    }

    /* renamed from: h1 */
    public void m4089h1(CharSequence charSequence) {
        this.f3637b0 = charSequence;
        mo3942e0();
    }

    @Override // androidx.preference.Preference
    /* renamed from: k0 */
    public void mo3931k0(C0568l c0568l) {
        super.mo3931k0(c0568l);
        m4086i1(c0568l.m4161a(C0572p.f3743f));
        m4096f1(c0568l);
    }

    @Override // androidx.preference.Preference
    /* renamed from: x0 */
    protected void mo3932x0(View view) {
        super.mo3932x0(view);
        m4087j1(view);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0569m.f3734l);
    }
}
