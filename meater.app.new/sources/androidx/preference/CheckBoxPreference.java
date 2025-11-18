package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.content.p003d.C0264g;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: a0 */
    private final C0531a f3531a0;

    /* renamed from: androidx.preference.CheckBoxPreference$a */
    private class C0531a implements CompoundButton.OnCheckedChangeListener {
        C0531a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (CheckBoxPreference.this.m4034k(Boolean.valueOf(z))) {
                CheckBoxPreference.this.m4091a1(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g1 */
    private void m3929g1(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3640V);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f3531a0);
        }
    }

    /* renamed from: h1 */
    private void m3930h1(View view) {
        if (((AccessibilityManager) m3987D().getSystemService("accessibility")).isEnabled()) {
            m3929g1(view.findViewById(R.id.checkbox));
            m4095e1(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: k0 */
    public void mo3931k0(C0568l c0568l) {
        super.mo3931k0(c0568l);
        m3929g1(c0568l.m4161a(R.id.checkbox));
        m4096f1(c0568l);
    }

    @Override // androidx.preference.Preference
    /* renamed from: x0 */
    protected void mo3932x0(View view) {
        super.mo3932x0(view);
        m3930h1(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f3531a0 = new C0531a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0576t.f3889s, i2, i3);
        m4094d1(C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3907y, C0576t.f3892t));
        m4093c1(C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3904x, C0576t.f3895u));
        m4092b1(C0264g.m1767b(typedArrayObtainStyledAttributes, C0576t.f3901w, C0576t.f3898v, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0264g.m1766a(context, C0569m.f3723a, R.attr.checkBoxPreferenceStyle));
    }
}
