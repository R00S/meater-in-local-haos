package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class s40 implements Comparator<zzvi> {
    s40(zzvb zzvbVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzvi zzviVar, zzvi zzviVar2) {
        zzvi zzviVar3 = zzviVar;
        zzvi zzviVar4 = zzviVar2;
        int i2 = zzviVar3.f27211c - zzviVar4.f27211c;
        return i2 != 0 ? i2 : (int) (zzviVar3.f27209a - zzviVar4.f27209a);
    }
}
