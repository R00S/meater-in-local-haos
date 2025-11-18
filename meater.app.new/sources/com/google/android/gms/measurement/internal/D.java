package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import g7.C3445p;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    final String f34783a;

    /* renamed from: b, reason: collision with root package name */
    final String f34784b;

    /* renamed from: c, reason: collision with root package name */
    final String f34785c;

    /* renamed from: d, reason: collision with root package name */
    final long f34786d;

    /* renamed from: e, reason: collision with root package name */
    final long f34787e;

    /* renamed from: f, reason: collision with root package name */
    final F f34788f;

    D(P2 p22, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        F f10;
        C3445p.e(str2);
        C3445p.e(str3);
        this.f34783a = str2;
        this.f34784b = str3;
        this.f34785c = TextUtils.isEmpty(str) ? null : str;
        this.f34786d = j10;
        this.f34787e = j11;
        if (j11 != 0 && j11 > j10) {
            p22.k().M().b("Event created with reverse previous/current timestamps. appId", C2759h2.w(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            f10 = new F(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    p22.k().H().a("Param name can't be null");
                    it.remove();
                } else {
                    Object objT0 = p22.P().t0(next, bundle2.get(next));
                    if (objT0 == null) {
                        p22.k().M().b("Param value can't be null", p22.F().f(next));
                        it.remove();
                    } else {
                        p22.P().P(bundle2, next, objT0);
                    }
                }
            }
            f10 = new F(bundle2);
        }
        this.f34788f = f10;
    }

    final D a(P2 p22, long j10) {
        return new D(p22, this.f34785c, this.f34783a, this.f34784b, this.f34786d, j10, this.f34788f);
    }

    public final String toString() {
        return "Event{appId='" + this.f34783a + "', name='" + this.f34784b + "', params=" + String.valueOf(this.f34788f) + "}";
    }

    private D(P2 p22, String str, String str2, String str3, long j10, long j11, F f10) {
        C3445p.e(str2);
        C3445p.e(str3);
        C3445p.k(f10);
        this.f34783a = str2;
        this.f34784b = str3;
        this.f34785c = TextUtils.isEmpty(str) ? null : str;
        this.f34786d = j10;
        this.f34787e = j11;
        if (j11 != 0 && j11 > j10) {
            p22.k().M().c("Event created with reverse previous/current timestamps. appId, name", C2759h2.w(str2), C2759h2.w(str3));
        }
        this.f34788f = f10;
    }
}
