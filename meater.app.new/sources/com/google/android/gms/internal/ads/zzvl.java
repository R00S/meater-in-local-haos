package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class zzvl implements Comparator<zzuz> {
    public zzvl(zzvk zzvkVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzuz zzuzVar, zzuz zzuzVar2) {
        zzuz zzuzVar3 = zzuzVar;
        zzuz zzuzVar4 = zzuzVar2;
        if (zzuzVar3.m20641b() < zzuzVar4.m20641b()) {
            return -1;
        }
        if (zzuzVar3.m20641b() > zzuzVar4.m20641b()) {
            return 1;
        }
        if (zzuzVar3.m20640a() < zzuzVar4.m20640a()) {
            return -1;
        }
        if (zzuzVar3.m20640a() > zzuzVar4.m20640a()) {
            return 1;
        }
        float fM20643d = (zzuzVar3.m20643d() - zzuzVar3.m20641b()) * (zzuzVar3.m20642c() - zzuzVar3.m20640a());
        float fM20643d2 = (zzuzVar4.m20643d() - zzuzVar4.m20641b()) * (zzuzVar4.m20642c() - zzuzVar4.m20640a());
        if (fM20643d > fM20643d2) {
            return -1;
        }
        return fM20643d < fM20643d2 ? 1 : 0;
    }
}
