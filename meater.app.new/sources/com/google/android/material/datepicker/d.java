package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import r1.C4338e;

/* compiled from: DateSelector.java */
/* loaded from: classes2.dex */
public interface d<S> extends Parcelable {
    View C0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, q<S> qVar);

    String L(Context context);

    String M0(Context context);

    int P0(Context context);

    Collection<C4338e<Long, Long>> Q();

    boolean X0();

    Collection<Long> h1();

    S k1();

    void s1(long j10);
}
