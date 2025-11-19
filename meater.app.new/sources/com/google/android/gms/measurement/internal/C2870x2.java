package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2870x2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35704a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35705b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35706c;

    /* renamed from: d, reason: collision with root package name */
    private long f35707d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2835s2 f35708e;

    public C2870x2(C2835s2 c2835s2, String str, long j10) {
        this.f35708e = c2835s2;
        C3445p.e(str);
        this.f35704a = str;
        this.f35705b = j10;
    }

    public final long a() {
        if (!this.f35706c) {
            this.f35706c = true;
            this.f35707d = this.f35708e.K().getLong(this.f35704a, this.f35705b);
        }
        return this.f35707d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor editorEdit = this.f35708e.K().edit();
        editorEdit.putLong(this.f35704a, j10);
        editorEdit.apply();
        this.f35707d = j10;
    }
}
