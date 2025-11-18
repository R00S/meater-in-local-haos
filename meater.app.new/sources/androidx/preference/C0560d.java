package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.DialogInterfaceC0066c;
import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
/* renamed from: androidx.preference.d */
/* loaded from: classes.dex */
public class C0560d extends AbstractDialogInterfaceOnClickListenerC0562f {

    /* renamed from: n */
    Set<String> f3653n = new HashSet();

    /* renamed from: o */
    boolean f3654o;

    /* renamed from: p */
    CharSequence[] f3655p;

    /* renamed from: q */
    CharSequence[] f3656q;

    /* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
    /* renamed from: androidx.preference.d$a */
    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i2, boolean z) {
            if (z) {
                C0560d c0560d = C0560d.this;
                c0560d.f3654o = c0560d.f3653n.add(c0560d.f3656q[i2].toString()) | c0560d.f3654o;
            } else {
                C0560d c0560d2 = C0560d.this;
                c0560d2.f3654o = c0560d2.f3653n.remove(c0560d2.f3656q[i2].toString()) | c0560d2.f3654o;
            }
        }
    }

    /* renamed from: k */
    private MultiSelectListPreference m4109k() {
        return (MultiSelectListPreference) m4112d();
    }

    /* renamed from: l */
    public static C0560d m4110l(String str) {
        C0560d c0560d = new C0560d();
        Bundle bundle = new Bundle(1);
        bundle.putString(RoomNotification.KEY, str);
        c0560d.setArguments(bundle);
        return c0560d;
    }

    @Override // androidx.preference.AbstractDialogInterfaceOnClickListenerC0562f
    /* renamed from: h */
    public void mo4103h(boolean z) {
        if (z && this.f3654o) {
            MultiSelectListPreference multiSelectListPreferenceM4109k = m4109k();
            if (multiSelectListPreferenceM4109k.m4034k(this.f3653n)) {
                multiSelectListPreferenceM4109k.m3974i1(this.f3653n);
            }
        }
        this.f3654o = false;
    }

    @Override // androidx.preference.AbstractDialogInterfaceOnClickListenerC0562f
    /* renamed from: i */
    protected void mo4108i(DialogInterfaceC0066c.a aVar) {
        super.mo4108i(aVar);
        int length = this.f3656q.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = this.f3653n.contains(this.f3656q[i2].toString());
        }
        aVar.m254k(this.f3655p, zArr, new a());
    }

    @Override // androidx.preference.AbstractDialogInterfaceOnClickListenerC0562f, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3653n.clear();
            this.f3653n.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f3654o = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f3655p = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f3656q = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceM4109k = m4109k();
        if (multiSelectListPreferenceM4109k.m3971f1() == null || multiSelectListPreferenceM4109k.m3972g1() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f3653n.clear();
        this.f3653n.addAll(multiSelectListPreferenceM4109k.m3973h1());
        this.f3654o = false;
        this.f3655p = multiSelectListPreferenceM4109k.m3971f1();
        this.f3656q = multiSelectListPreferenceM4109k.m3972g1();
    }

    @Override // androidx.preference.AbstractDialogInterfaceOnClickListenerC0562f, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f3653n));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f3654o);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f3655p);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f3656q);
    }
}
