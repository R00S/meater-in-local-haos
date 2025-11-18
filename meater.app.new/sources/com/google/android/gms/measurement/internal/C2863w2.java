package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2863w2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35694a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35695b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35696c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35697d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2835s2 f35698e;

    private final long c() {
        return this.f35698e.K().getLong(this.f35694a, 0L);
    }

    private final void d() {
        this.f35698e.n();
        long jA = this.f35698e.b().a();
        SharedPreferences.Editor editorEdit = this.f35698e.K().edit();
        editorEdit.remove(this.f35695b);
        editorEdit.remove(this.f35696c);
        editorEdit.putLong(this.f35694a, jA);
        editorEdit.apply();
    }

    public final Pair<String, Long> a() {
        long jAbs;
        this.f35698e.n();
        this.f35698e.n();
        long jC = c();
        if (jC == 0) {
            d();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jC - this.f35698e.b().a());
        }
        long j10 = this.f35697d;
        if (jAbs < j10) {
            return null;
        }
        if (jAbs > (j10 << 1)) {
            d();
            return null;
        }
        String string = this.f35698e.K().getString(this.f35696c, null);
        long j11 = this.f35698e.K().getLong(this.f35695b, 0L);
        d();
        return (string == null || j11 <= 0) ? C2835s2.f35595B : new Pair<>(string, Long.valueOf(j11));
    }

    public final void b(String str, long j10) {
        this.f35698e.n();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f35698e.K().getLong(this.f35695b, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor editorEdit = this.f35698e.K().edit();
            editorEdit.putString(this.f35696c, str);
            editorEdit.putLong(this.f35695b, 1L);
            editorEdit.apply();
            return;
        }
        long j12 = j11 + 1;
        boolean z10 = (this.f35698e.j().U0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12;
        SharedPreferences.Editor editorEdit2 = this.f35698e.K().edit();
        if (z10) {
            editorEdit2.putString(this.f35696c, str);
        }
        editorEdit2.putLong(this.f35695b, j12);
        editorEdit2.apply();
    }

    private C2863w2(C2835s2 c2835s2, String str, long j10) {
        this.f35698e = c2835s2;
        C3445p.e(str);
        C3445p.a(j10 > 0);
        this.f35694a = str + ":start";
        this.f35695b = str + ":count";
        this.f35696c = str + ":value";
        this.f35697d = j10;
    }
}
