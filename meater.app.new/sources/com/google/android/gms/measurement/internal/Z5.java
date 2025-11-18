package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C2569r2;
import com.google.android.gms.internal.measurement.C2585t2;
import g7.C3445p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class Z5 {

    /* renamed from: a, reason: collision with root package name */
    private C2569r2 f35245a;

    /* renamed from: b, reason: collision with root package name */
    private Long f35246b;

    /* renamed from: c, reason: collision with root package name */
    private long f35247c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Y5 f35248d;

    final C2569r2 a(String str, C2569r2 c2569r2) {
        Object obj;
        String strY = c2569r2.Y();
        List<C2585t2> listZ = c2569r2.Z();
        this.f35248d.p();
        Long l10 = (Long) N5.g0(c2569r2, "_eid");
        boolean z10 = l10 != null;
        if (z10 && strY.equals("_ep")) {
            C3445p.k(l10);
            this.f35248d.p();
            strY = (String) N5.g0(c2569r2, "_en");
            if (TextUtils.isEmpty(strY)) {
                this.f35248d.k().J().b("Extra parameter without an event name. eventId", l10);
                return null;
            }
            if (this.f35245a == null || this.f35246b == null || l10.longValue() != this.f35246b.longValue()) {
                Pair<C2569r2, Long> pairK = this.f35248d.r().K(str, l10);
                if (pairK == null || (obj = pairK.first) == null) {
                    this.f35248d.k().J().c("Extra parameter without existing main event. eventName, eventId", strY, l10);
                    return null;
                }
                this.f35245a = (C2569r2) obj;
                this.f35247c = ((Long) pairK.second).longValue();
                this.f35248d.p();
                this.f35246b = (Long) N5.g0(this.f35245a, "_eid");
            }
            long j10 = this.f35247c - 1;
            this.f35247c = j10;
            if (j10 <= 0) {
                C2812p c2812pR = this.f35248d.r();
                c2812pR.n();
                c2812pR.k().L().b("Clearing complex main event info. appId", str);
                try {
                    c2812pR.C().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e10) {
                    c2812pR.k().H().b("Error clearing complex main event", e10);
                }
            } else {
                this.f35248d.r().t0(str, l10, this.f35247c, this.f35245a);
            }
            ArrayList arrayList = new ArrayList();
            for (C2585t2 c2585t2 : this.f35245a.Z()) {
                this.f35248d.p();
                if (N5.G(c2569r2, c2585t2.b0()) == null) {
                    arrayList.add(c2585t2);
                }
            }
            if (arrayList.isEmpty()) {
                this.f35248d.k().J().b("No unique parameters in main event. eventName", strY);
            } else {
                arrayList.addAll(listZ);
                listZ = arrayList;
            }
        } else if (z10) {
            this.f35246b = l10;
            this.f35245a = c2569r2;
            this.f35248d.p();
            long jLongValue = ((Long) N5.K(c2569r2, "_epc", 0L)).longValue();
            this.f35247c = jLongValue;
            if (jLongValue <= 0) {
                this.f35248d.k().J().b("Complex event with zero extra param count. eventName", strY);
            } else {
                this.f35248d.r().t0(str, (Long) C3445p.k(l10), this.f35247c, c2569r2);
            }
        }
        return (C2569r2) ((com.google.android.gms.internal.measurement.F4) c2569r2.C().G(strY).M().F(listZ).x());
    }

    private Z5(Y5 y52) {
        this.f35248d = y52;
    }
}
