package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.C0380i;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.eu */
/* loaded from: classes2.dex */
final class C6649eu implements Comparator<zzdmr> {
    C6649eu() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzdmr zzdmrVar, zzdmr zzdmrVar2) {
        zzdmr zzdmrVar3 = zzdmrVar;
        zzdmr zzdmrVar4 = zzdmrVar2;
        zzdmy zzdmyVar = (zzdmy) zzdmrVar3.iterator();
        zzdmy zzdmyVar2 = (zzdmy) zzdmrVar4.iterator();
        while (zzdmyVar.hasNext() && zzdmyVar2.hasNext()) {
            int iM2811a = C0380i.m2811a(zzdmr.m19598s(zzdmyVar.mo15079f()), zzdmr.m19598s(zzdmyVar2.mo15079f()));
            if (iM2811a != 0) {
                return iM2811a;
            }
        }
        return C0380i.m2811a(zzdmrVar3.size(), zzdmrVar4.size());
    }
}
