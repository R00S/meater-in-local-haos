package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes2.dex */
public final class C7998h<S> extends AbstractC8002l<S> {

    /* renamed from: g */
    private DateSelector<S> f30163g;

    /* renamed from: h */
    private CalendarConstraints f30164h;

    /* compiled from: MaterialTextInputPicker.java */
    /* renamed from: com.google.android.material.datepicker.h$a */
    class a extends AbstractC8001k<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.AbstractC8001k
        /* renamed from: a */
        public void mo24399a(S s) {
            Iterator<AbstractC8001k<S>> it = C7998h.this.f30179f.iterator();
            while (it.hasNext()) {
                it.next().mo24399a(s);
            }
        }
    }

    /* renamed from: f */
    static <T> C7998h<T> m24401f(DateSelector<T> dateSelector, CalendarConstraints calendarConstraints) {
        C7998h<T> c7998h = new C7998h<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        c7998h.setArguments(bundle);
        return c7998h;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f30163g = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f30164h = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f30163g.m24328t0(layoutInflater, viewGroup, bundle, this.f30164h, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f30163g);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f30164h);
    }
}
