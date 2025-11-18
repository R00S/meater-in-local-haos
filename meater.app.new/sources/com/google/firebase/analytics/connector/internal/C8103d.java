package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.p179a.InterfaceC8095a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.d */
/* loaded from: classes2.dex */
public final class C8103d {

    /* renamed from: a */
    private InterfaceC8095a.b f30663a;

    /* renamed from: b */
    private AppMeasurement f30664b;

    /* renamed from: c */
    private C8105f f30665c;

    public C8103d(AppMeasurement appMeasurement, InterfaceC8095a.b bVar) {
        this.f30663a = bVar;
        this.f30664b = appMeasurement;
        C8105f c8105f = new C8105f(this);
        this.f30665c = c8105f;
        this.f30664b.m22662a(c8105f);
    }
}
