package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.p003d.C0264g;
import androidx.preference.C0566j;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: e0 */
    private boolean f3614e0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0264g.m1766a(context, C0569m.f3730h, R.attr.preferenceScreenStyle));
        this.f3614e0 = true;
    }

    @Override // androidx.preference.PreferenceGroup
    /* renamed from: g1 */
    protected boolean mo4062g1() {
        return false;
    }

    @Override // androidx.preference.Preference
    /* renamed from: l0 */
    protected void mo3939l0() {
        C0566j.b bVarM4146e;
        if (m3995I() != null || m3992G() != null || m4061f1() == 0 || (bVarM4146e = m4014S().m4146e()) == null) {
            return;
        }
        bVarM4146e.onNavigateToScreen(this);
    }

    /* renamed from: n1 */
    public boolean m4073n1() {
        return this.f3614e0;
    }
}
