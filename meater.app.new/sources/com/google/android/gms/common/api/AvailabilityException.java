package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import p024c.p041e.C0867a;

/* loaded from: classes2.dex */
public class AvailabilityException extends Exception {

    /* renamed from: f */
    private final C0867a<zai<?>, ConnectionResult> f17242f;

    public AvailabilityException(C0867a<zai<?>, ConnectionResult> c0867a) {
        this.f17242f = c0867a;
    }

    /* renamed from: a */
    public ConnectionResult m13844a(GoogleApi<? extends Api.ApiOptions> googleApi) {
        Object objM13861l = googleApi.m13861l();
        Preconditions.m14363b(this.f17242f.get(objM13861l) != null, "The given API was not part of the availability request.");
        return this.f17242f.get(objM13861l);
    }

    /* renamed from: b */
    public final C0867a<zai<?>, ConnectionResult> m13845b() {
        return this.f17242f;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (zai<?> zaiVar : this.f17242f.keySet()) {
            ConnectionResult connectionResult = this.f17242f.get(zaiVar);
            if (connectionResult.m13795e0()) {
                z = false;
            }
            String strM14208c = zaiVar.m14208c();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(strM14208c).length() + 2 + strValueOf.length());
            sb.append(strM14208c);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
