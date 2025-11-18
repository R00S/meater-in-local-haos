package androidx.preference;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.content.C0255a;
import androidx.core.content.p003d.C0264g;
import androidx.core.view.p004d0.C0289c;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.preference.Preference
    /* renamed from: U0 */
    public boolean mo3944U0() {
        return !super.mo4024a0();
    }

    @Override // androidx.preference.Preference
    /* renamed from: a0 */
    public boolean mo4024a0() {
        return false;
    }

    @Override // androidx.preference.Preference
    /* renamed from: k0 */
    public void mo3931k0(C0568l c0568l) {
        TextView textView;
        super.mo3931k0(c0568l);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            c0568l.itemView.setAccessibilityHeading(true);
            return;
        }
        if (i2 < 21) {
            TypedValue typedValue = new TypedValue();
            if (m3987D().getTheme().resolveAttribute(C0569m.f3724b, typedValue, true) && (textView = (TextView) c0568l.m4161a(R.id.title)) != null) {
                if (textView.getCurrentTextColor() != C0255a.m1675d(m3987D(), C0570n.f3736a)) {
                    return;
                }
                textView.setTextColor(typedValue.data);
            }
        }
    }

    @Override // androidx.preference.Preference
    @Deprecated
    /* renamed from: p0 */
    public void mo4037p0(C0289c c0289c) {
        C0289c.c cVarM1998q;
        super.mo4037p0(c0289c);
        if (Build.VERSION.SDK_INT >= 28 || (cVarM1998q = c0289c.m1998q()) == null) {
            return;
        }
        c0289c.m1975b0(C0289c.c.m2017f(cVarM1998q.m2020c(), cVarM1998q.m2021d(), cVarM1998q.m2018a(), cVarM1998q.m2019b(), true, cVarM1998q.m2022e()));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0264g.m1766a(context, C0569m.f3728f, R.attr.preferenceCategoryStyle));
    }
}
