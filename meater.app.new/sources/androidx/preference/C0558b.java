package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.room.AbstractC0651j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExpandButton.java */
/* renamed from: androidx.preference.b */
/* loaded from: classes.dex */
final class C0558b extends Preference {

    /* renamed from: V */
    private long f3648V;

    C0558b(Context context, List<Preference> list, long j2) {
        super(context);
        m4104Z0();
        m4105a1(list);
        this.f3648V = j2 + 1000000;
    }

    /* renamed from: Z0 */
    private void m4104Z0() {
        m4002L0(C0573q.f3744a);
        m3996I0(C0571o.f3737a);
        m4013R0(C0574r.f3749b);
        m4008O0(AbstractC0651j.MAX_BIND_PARAMETER_CNT);
    }

    /* renamed from: a1 */
    private void m4105a1(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence string = null;
        for (Preference preference : list) {
            CharSequence charSequenceM4020W = preference.m4020W();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequenceM4020W)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.m4003M())) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequenceM4020W)) {
                string = string == null ? charSequenceM4020W : m3987D().getString(C0574r.f3752e, string, charSequenceM4020W);
            }
        }
        mo3959P0(string);
    }

    @Override // androidx.preference.Preference
    /* renamed from: H */
    long mo3994H() {
        return this.f3648V;
    }

    @Override // androidx.preference.Preference
    /* renamed from: k0 */
    public void mo3931k0(C0568l c0568l) {
        super.mo3931k0(c0568l);
        c0568l.m4164d(false);
    }
}
