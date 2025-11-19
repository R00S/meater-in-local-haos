package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: PickerFragment.java */
/* loaded from: classes2.dex */
abstract class r<S> extends Fragment {

    /* renamed from: G0, reason: collision with root package name */
    protected final LinkedHashSet<q<S>> f36514G0 = new LinkedHashSet<>();

    r() {
    }

    boolean x2(q<S> qVar) {
        return this.f36514G0.add(qVar);
    }

    void y2() {
        this.f36514G0.clear();
    }
}
