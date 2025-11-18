package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.content.p003d.C0264g;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: a0 */
    private final C0554a f3632a0;

    /* renamed from: b0 */
    private CharSequence f3633b0;

    /* renamed from: c0 */
    private CharSequence f3634c0;

    /* renamed from: androidx.preference.SwitchPreference$a */
    private class C0554a implements CompoundButton.OnCheckedChangeListener {
        C0554a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreference.this.m4034k(Boolean.valueOf(z))) {
                SwitchPreference.this.m4091a1(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f3632a0 = new C0554a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0576t.f3762C1, i2, i3);
        m4094d1(C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3786K1, C0576t.f3765D1));
        m4093c1(C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3783J1, C0576t.f3768E1));
        m4085h1(C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3792M1, C0576t.f3774G1));
        m4084g1(C0264g.m1780o(typedArrayObtainStyledAttributes, C0576t.f3789L1, C0576t.f3777H1));
        m4092b1(C0264g.m1767b(typedArrayObtainStyledAttributes, C0576t.f3780I1, C0576t.f3771F1, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i1 */
    private void m4082i1(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3640V);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f3633b0);
            r4.setTextOff(this.f3634c0);
            r4.setOnCheckedChangeListener(this.f3632a0);
        }
    }

    /* renamed from: j1 */
    private void m4083j1(View view) {
        if (((AccessibilityManager) m3987D().getSystemService("accessibility")).isEnabled()) {
            m4082i1(view.findViewById(R.id.switch_widget));
            m4095e1(view.findViewById(R.id.summary));
        }
    }

    /* renamed from: g1 */
    public void m4084g1(CharSequence charSequence) {
        this.f3634c0 = charSequence;
        mo3942e0();
    }

    /* renamed from: h1 */
    public void m4085h1(CharSequence charSequence) {
        this.f3633b0 = charSequence;
        mo3942e0();
    }

    @Override // androidx.preference.Preference
    /* renamed from: k0 */
    public void mo3931k0(C0568l c0568l) {
        super.mo3931k0(c0568l);
        m4082i1(c0568l.m4161a(R.id.switch_widget));
        m4096f1(c0568l);
    }

    @Override // androidx.preference.Preference
    /* renamed from: x0 */
    protected void mo3932x0(View view) {
        super.mo3932x0(view);
        m4083j1(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0264g.m1766a(context, C0569m.f3735m, R.attr.switchPreferenceStyle));
    }
}
