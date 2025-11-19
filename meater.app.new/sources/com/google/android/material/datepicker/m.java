package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
/* loaded from: classes2.dex */
public final class m<S> extends r<S> {

    /* renamed from: H0, reason: collision with root package name */
    private int f36486H0;

    /* renamed from: I0, reason: collision with root package name */
    private d<S> f36487I0;

    /* renamed from: J0, reason: collision with root package name */
    private com.google.android.material.datepicker.a f36488J0;

    /* compiled from: MaterialTextInputPicker.java */
    class a extends q<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.q
        public void a(S s10) {
            Iterator<q<S>> it = m.this.f36514G0.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    static <T> m<T> z2(d<T> dVar, int i10, com.google.android.material.datepicker.a aVar) {
        m<T> mVar = new m<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        mVar.k2(bundle);
        return mVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void a1(Bundle bundle) {
        super.a1(bundle);
        if (bundle == null) {
            bundle = X();
        }
        this.f36486H0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f36487I0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f36488J0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f36487I0.C0(layoutInflater.cloneInContext(new ContextThemeWrapper(Z(), this.f36486H0)), viewGroup, bundle, this.f36488J0, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void w1(Bundle bundle) {
        super.w1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f36486H0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f36487I0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f36488J0);
    }
}
