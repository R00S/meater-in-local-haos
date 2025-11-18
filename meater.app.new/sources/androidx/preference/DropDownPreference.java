package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: g0 */
    private final Context f3539g0;

    /* renamed from: h0 */
    private final ArrayAdapter f3540h0;

    /* renamed from: i0 */
    private Spinner f3541i0;

    /* renamed from: j0 */
    private final AdapterView.OnItemSelectedListener f3542j0;

    /* renamed from: androidx.preference.DropDownPreference$a */
    class C0533a implements AdapterView.OnItemSelectedListener {
        C0533a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (i2 >= 0) {
                String string = DropDownPreference.this.m3964i1()[i2].toString();
                if (string.equals(DropDownPreference.this.m3965j1()) || !DropDownPreference.this.m4034k(string)) {
                    return;
                }
                DropDownPreference.this.m3966l1(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0569m.f3726d);
    }

    /* renamed from: n1 */
    private int m3940n1(String str) {
        CharSequence[] charSequenceArrM3964i1 = m3964i1();
        if (str == null || charSequenceArrM3964i1 == null) {
            return -1;
        }
        for (int length = charSequenceArrM3964i1.length - 1; length >= 0; length--) {
            if (charSequenceArrM3964i1[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: o1 */
    private void m3941o1() {
        this.f3540h0.clear();
        if (m3962g1() != null) {
            for (CharSequence charSequence : m3962g1()) {
                this.f3540h0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: e0 */
    protected void mo3942e0() {
        super.mo3942e0();
        ArrayAdapter arrayAdapter = this.f3540h0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: k0 */
    public void mo3931k0(C0568l c0568l) {
        Spinner spinner = (Spinner) c0568l.itemView.findViewById(C0572p.f3742e);
        this.f3541i0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f3540h0);
        this.f3541i0.setOnItemSelectedListener(this.f3542j0);
        this.f3541i0.setSelection(m3940n1(m3965j1()));
        super.mo3931k0(c0568l);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* renamed from: l0 */
    protected void mo3939l0() {
        this.f3541i0.performClick();
    }

    /* renamed from: m1 */
    protected ArrayAdapter m3943m1() {
        return new ArrayAdapter(this.f3539g0, R.layout.simple_spinner_dropdown_item);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f3542j0 = new C0533a();
        this.f3539g0 = context;
        this.f3540h0 = m3943m1();
        m3941o1();
    }
}
