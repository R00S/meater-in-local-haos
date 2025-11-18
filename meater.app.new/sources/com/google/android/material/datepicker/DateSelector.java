package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import p024c.p052i.p059j.C0955e;

/* loaded from: classes2.dex */
public interface DateSelector<S> extends Parcelable {
    /* renamed from: A */
    String m24321A(Context context);

    /* renamed from: D */
    Collection<C0955e<Long, Long>> m24322D();

    /* renamed from: E0 */
    int m24323E0(Context context);

    /* renamed from: K0 */
    boolean m24324K0();

    /* renamed from: Q0 */
    Collection<Long> m24325Q0();

    /* renamed from: V0 */
    S m24326V0();

    /* renamed from: f1 */
    void m24327f1(long j2);

    /* renamed from: t0 */
    View m24328t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, AbstractC8001k<S> abstractC8001k);
}
