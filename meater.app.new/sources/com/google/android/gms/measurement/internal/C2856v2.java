package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2856v2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35682a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35683b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35684c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35685d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2835s2 f35686e;

    public C2856v2(C2835s2 c2835s2, String str, boolean z10) {
        this.f35686e = c2835s2;
        C3445p.e(str);
        this.f35682a = str;
        this.f35683b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f35686e.K().edit();
        editorEdit.putBoolean(this.f35682a, z10);
        editorEdit.apply();
        this.f35685d = z10;
    }

    public final boolean b() {
        if (!this.f35684c) {
            this.f35684c = true;
            this.f35685d = this.f35686e.K().getBoolean(this.f35682a, this.f35683b);
        }
        return this.f35685d;
    }
}
