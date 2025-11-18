package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.t2 */
/* loaded from: classes2.dex */
final class C7590t2 extends AbstractC7584s2 {
    private C7590t2() {
        super();
    }

    /* renamed from: f */
    private static <E> zzfl<E> m21406f(Object obj, long j2) {
        return (zzfl) C7538k4.m21179F(obj, j2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7584s2
    /* renamed from: b */
    final <L> List<L> mo21400b(Object obj, long j2) {
        zzfl zzflVarM21406f = m21406f(obj, j2);
        if (zzflVarM21406f.mo21145a()) {
            return zzflVarM21406f;
        }
        int size = zzflVarM21406f.size();
        zzfl zzflVarMo20982d = zzflVarM21406f.mo20982d(size == 0 ? 10 : size << 1);
        C7538k4.m21198j(obj, j2, zzflVarMo20982d);
        return zzflVarMo20982d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7584s2
    /* renamed from: c */
    final <E> void mo21401c(Object obj, Object obj2, long j2) {
        zzfl zzflVarM21406f = m21406f(obj, j2);
        zzfl zzflVarM21406f2 = m21406f(obj2, j2);
        int size = zzflVarM21406f.size();
        int size2 = zzflVarM21406f2.size();
        if (size > 0 && size2 > 0) {
            if (!zzflVarM21406f.mo21145a()) {
                zzflVarM21406f = zzflVarM21406f.mo20982d(size2 + size);
            }
            zzflVarM21406f.addAll(zzflVarM21406f2);
        }
        if (size > 0) {
            zzflVarM21406f2 = zzflVarM21406f;
        }
        C7538k4.m21198j(obj, j2, zzflVarM21406f2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7584s2
    /* renamed from: e */
    final void mo21402e(Object obj, long j2) {
        m21406f(obj, j2).mo21144I();
    }
}
