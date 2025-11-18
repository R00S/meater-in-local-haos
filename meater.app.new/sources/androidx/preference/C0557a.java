package androidx.preference;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import cm.aptoide.p092pt.database.room.RoomNotification;

/* compiled from: EditTextPreferenceDialogFragmentCompat.java */
/* renamed from: androidx.preference.a */
/* loaded from: classes.dex */
public class C0557a extends AbstractDialogInterfaceOnClickListenerC0562f {

    /* renamed from: n */
    private EditText f3646n;

    /* renamed from: o */
    private CharSequence f3647o;

    /* renamed from: k */
    private EditTextPreference m4099k() {
        return (EditTextPreference) m4112d();
    }

    /* renamed from: l */
    public static C0557a m4100l(String str) {
        C0557a c0557a = new C0557a();
        Bundle bundle = new Bundle(1);
        bundle.putString(RoomNotification.KEY, str);
        c0557a.setArguments(bundle);
        return c0557a;
    }

    @Override // androidx.preference.AbstractDialogInterfaceOnClickListenerC0562f
    /* renamed from: e */
    protected boolean mo4101e() {
        return true;
    }

    @Override // androidx.preference.AbstractDialogInterfaceOnClickListenerC0562f
    /* renamed from: f */
    protected void mo4102f(View view) {
        super.mo4102f(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f3646n = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f3646n.setText(this.f3647o);
        EditText editText2 = this.f3646n;
        editText2.setSelection(editText2.getText().length());
        if (m4099k().m3945f1() != null) {
            m4099k().m3945f1().m3954a(this.f3646n);
        }
    }

    @Override // androidx.preference.AbstractDialogInterfaceOnClickListenerC0562f
    /* renamed from: h */
    public void mo4103h(boolean z) {
        if (z) {
            String string = this.f3646n.getText().toString();
            EditTextPreference editTextPreferenceM4099k = m4099k();
            if (editTextPreferenceM4099k.m4034k(string)) {
                editTextPreferenceM4099k.m3947h1(string);
            }
        }
    }

    @Override // androidx.preference.AbstractDialogInterfaceOnClickListenerC0562f, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f3647o = m4099k().m3946g1();
        } else {
            this.f3647o = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.AbstractDialogInterfaceOnClickListenerC0562f, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f3647o);
    }
}
