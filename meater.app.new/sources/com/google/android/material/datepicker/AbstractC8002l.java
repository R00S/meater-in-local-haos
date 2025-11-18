package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: PickerFragment.java */
/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes2.dex */
abstract class AbstractC8002l<S> extends Fragment {

    /* renamed from: f */
    protected final LinkedHashSet<AbstractC8001k<S>> f30179f = new LinkedHashSet<>();

    AbstractC8002l() {
    }

    /* renamed from: d */
    boolean m24418d(AbstractC8001k<S> abstractC8001k) {
        return this.f30179f.add(abstractC8001k);
    }

    /* renamed from: e */
    void m24419e() {
        this.f30179f.clear();
    }
}
