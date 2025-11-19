package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2877y2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35719a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35720b;

    /* renamed from: c, reason: collision with root package name */
    private String f35721c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C2835s2 f35722d;

    public C2877y2(C2835s2 c2835s2, String str, String str2) {
        this.f35722d = c2835s2;
        C3445p.e(str);
        this.f35719a = str;
    }

    public final String a() {
        if (!this.f35720b) {
            this.f35720b = true;
            this.f35721c = this.f35722d.K().getString(this.f35719a, null);
        }
        return this.f35721c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f35722d.K().edit();
        editorEdit.putString(this.f35719a, str);
        editorEdit.apply();
        this.f35721c = str;
    }
}
