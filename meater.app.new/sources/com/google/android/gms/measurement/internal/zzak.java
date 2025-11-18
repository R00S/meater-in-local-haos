package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzak {

    /* renamed from: a */
    final String f29070a;

    /* renamed from: b */
    final String f29071b;

    /* renamed from: c */
    private final String f29072c;

    /* renamed from: d */
    final long f29073d;

    /* renamed from: e */
    final long f29074e;

    /* renamed from: f */
    final zzam f29075f;

    private zzak(zzfx zzfxVar, String str, String str2, String str3, long j2, long j3, zzam zzamVar) throws IllegalStateException {
        Preconditions.m14368g(str2);
        Preconditions.m14368g(str3);
        Preconditions.m14372k(zzamVar);
        this.f29070a = str2;
        this.f29071b = str3;
        this.f29072c = TextUtils.isEmpty(str) ? null : str;
        this.f29073d = j2;
        this.f29074e = j3;
        if (j3 != 0 && j3 > j2) {
            zzfxVar.mo22836h().m23140K().m23149c("Event created with reverse previous/current timestamps. appId, name", zzet.m23131x(str2), zzet.m23131x(str3));
        }
        this.f29075f = zzamVar;
    }

    /* renamed from: a */
    final zzak m22957a(zzfx zzfxVar, long j2) {
        return new zzak(zzfxVar, this.f29072c, this.f29070a, this.f29071b, this.f29073d, j2, this.f29075f);
    }

    public final String toString() {
        String str = this.f29070a;
        String str2 = this.f29071b;
        String strValueOf = String.valueOf(this.f29075f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + strValueOf.length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(strValueOf);
        sb.append('}');
        return sb.toString();
    }

    zzak(zzfx zzfxVar, String str, String str2, String str3, long j2, long j3, Bundle bundle) throws IllegalStateException {
        zzam zzamVar;
        Preconditions.m14368g(str2);
        Preconditions.m14368g(str3);
        this.f29070a = str2;
        this.f29071b = str3;
        this.f29072c = TextUtils.isEmpty(str) ? null : str;
        this.f29073d = j2;
        this.f29074e = j3;
        if (j3 != 0 && j3 > j2) {
            zzfxVar.mo22836h().m23140K().m23148b("Event created with reverse previous/current timestamps. appId", zzet.m23131x(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzfxVar.mo22836h().m23137H().m23147a("Param name can't be null");
                    it.remove();
                } else {
                    Object objM23525E = zzfxVar.m23217I().m23525E(next, bundle2.get(next));
                    if (objM23525E == null) {
                        zzfxVar.mo22836h().m23140K().m23148b("Param value can't be null", zzfxVar.m23218J().m23119A(next));
                        it.remove();
                    } else {
                        zzfxVar.m23217I().m23529L(bundle2, next, objM23525E);
                    }
                }
            }
            zzamVar = new zzam(bundle2);
        } else {
            zzamVar = new zzam(new Bundle());
        }
        this.f29075f = zzamVar;
    }
}
