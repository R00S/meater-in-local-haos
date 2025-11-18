package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0380i;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.n1 */
/* loaded from: classes2.dex */
final class C7553n1 implements Comparator<zzdu> {
    C7553n1() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzdu zzduVar, zzdu zzduVar2) {
        zzdu zzduVar3 = zzduVar;
        zzdu zzduVar4 = zzduVar2;
        zzed zzedVar = (zzed) zzduVar3.iterator();
        zzed zzedVar2 = (zzed) zzduVar4.iterator();
        while (zzedVar.hasNext() && zzedVar2.hasNext()) {
            int iM2811a = C0380i.m2811a(zzdu.m22153u(zzedVar.mo21264a()), zzdu.m22153u(zzedVar2.mo21264a()));
            if (iM2811a != 0) {
                return iM2811a;
            }
        }
        return C0380i.m2811a(zzduVar3.mo21396f(), zzduVar4.mo21396f());
    }
}
