package com.google.android.gms.internal.ads;

import com.google.ads.mediation.C6225a;
import java.util.Date;
import java.util.HashSet;
import p241e.p254e.p255a.EnumC8781a;
import p241e.p254e.p255a.EnumC8782b;

@zzard
/* loaded from: classes2.dex */
public final class zzaog {
    /* renamed from: a */
    public static int m16808a(EnumC8781a enumC8781a) {
        int i2 = C7324x2.f20899b[enumC8781a.ordinal()];
        if (i2 == 2) {
            return 1;
        }
        if (i2 != 3) {
            return i2 != 4 ? 0 : 3;
        }
        return 2;
    }

    /* renamed from: b */
    public static C6225a m16809b(zzxz zzxzVar, boolean z) {
        HashSet hashSet = zzxzVar.f27406j != null ? new HashSet(zzxzVar.f27406j) : null;
        Date date = new Date(zzxzVar.f27403g);
        int i2 = zzxzVar.f27405i;
        return new C6225a(date, i2 != 1 ? i2 != 2 ? EnumC8782b.UNKNOWN : EnumC8782b.FEMALE : EnumC8782b.MALE, hashSet, z, zzxzVar.f27412p);
    }
}
