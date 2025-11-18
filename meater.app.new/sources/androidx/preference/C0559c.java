package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.DialogInterfaceC0066c;
import cm.aptoide.p092pt.database.room.RoomNotification;

/* compiled from: ListPreferenceDialogFragmentCompat.java */
/* renamed from: androidx.preference.c */
/* loaded from: classes.dex */
public class C0559c extends AbstractDialogInterfaceOnClickListenerC0562f {

    /* renamed from: n */
    int f3649n;

    /* renamed from: o */
    private CharSequence[] f3650o;

    /* renamed from: p */
    private CharSequence[] f3651p;

    /* compiled from: ListPreferenceDialogFragmentCompat.java */
    /* renamed from: androidx.preference.c$a */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            C0559c c0559c = C0559c.this;
            c0559c.f3649n = i2;
            c0559c.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: k */
    private ListPreference m4106k() {
        return (ListPreference) m4112d();
    }

    /* renamed from: l */
    public static C0559c m4107l(String str) {
        C0559c c0559c = new C0559c();
        Bundle bundle = new Bundle(1);
        bundle.putString(RoomNotification.KEY, str);
        c0559c.setArguments(bundle);
        return c0559c;
    }

    @Override // androidx.preference.AbstractDialogInterfaceOnClickListenerC0562f
    /* renamed from: h */
    public void mo4103h(boolean z) {
        int i2;
        if (!z || (i2 = this.f3649n) < 0) {
            return;
        }
        String string = this.f3651p[i2].toString();
        ListPreference listPreferenceM4106k = m4106k();
        if (listPreferenceM4106k.m4034k(string)) {
            listPreferenceM4106k.m3966l1(string);
        }
    }

    @Override // androidx.preference.AbstractDialogInterfaceOnClickListenerC0562f
    /* renamed from: i */
    protected void mo4108i(DialogInterfaceC0066c.a aVar) {
        super.mo4108i(aVar);
        aVar.m263t(this.f3650o, this.f3649n, new a());
        aVar.m261r(null, null);
    }

    @Override // androidx.preference.AbstractDialogInterfaceOnClickListenerC0562f, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3649n = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f3650o = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f3651p = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceM4106k = m4106k();
        if (listPreferenceM4106k.m3962g1() == null || listPreferenceM4106k.m3964i1() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f3649n = listPreferenceM4106k.m3961f1(listPreferenceM4106k.m3965j1());
        this.f3650o = listPreferenceM4106k.m3962g1();
        this.f3651p = listPreferenceM4106k.m3964i1();
    }

    @Override // androidx.preference.AbstractDialogInterfaceOnClickListenerC0562f, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f3649n);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f3650o);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f3651p);
    }
}
