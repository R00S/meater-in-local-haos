package com.google.android.gms.common.api;

import android.text.TextUtils;
import c7.C2333b;
import e7.C3212b;
import g7.C3445p;
import java.util.ArrayList;
import s.C4391a;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public class AvailabilityException extends Exception {

    /* renamed from: B, reason: collision with root package name */
    private final C4391a f33451B;

    public AvailabilityException(C4391a c4391a) {
        this.f33451B = c4391a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (C3212b c3212b : this.f33451B.keySet()) {
            C2333b c2333b = (C2333b) C3445p.k((C2333b) this.f33451B.get(c3212b));
            z10 &= !c2333b.G0();
            arrayList.add(c3212b.b() + ": " + String.valueOf(c2333b));
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
