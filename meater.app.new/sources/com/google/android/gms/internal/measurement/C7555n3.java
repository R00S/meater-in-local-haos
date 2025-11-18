package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.n3 */
/* loaded from: classes2.dex */
final class C7555n3 implements InterfaceC7501e3 {

    /* renamed from: a */
    private final zzgo f27850a;

    /* renamed from: b */
    private final String f27851b;

    /* renamed from: c */
    private final Object[] f27852c;

    /* renamed from: d */
    private final int f27853d;

    C7555n3(zzgo zzgoVar, String str, Object[] objArr) {
        this.f27850a = zzgoVar;
        this.f27851b = str;
        this.f27852c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f27853d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 55296) {
                this.f27853d = i2 | (cCharAt2 << i3);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i4 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7501e3
    /* renamed from: a */
    public final int mo21047a() {
        return (this.f27853d & 1) == 1 ? zzfd.zze.f28131i : zzfd.zze.f28132j;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7501e3
    /* renamed from: b */
    public final boolean mo21048b() {
        return (this.f27853d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7501e3
    /* renamed from: c */
    public final zzgo mo21049c() {
        return this.f27850a;
    }

    /* renamed from: d */
    final String m21245d() {
        return this.f27851b;
    }

    /* renamed from: e */
    final Object[] m21246e() {
        return this.f27852c;
    }
}
