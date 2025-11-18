package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.s2 */
/* loaded from: classes2.dex */
abstract class AbstractC7584s2 {

    /* renamed from: a */
    private static final AbstractC7584s2 f27891a;

    /* renamed from: b */
    private static final AbstractC7584s2 f27892b;

    static {
        C7578r2 c7578r2 = null;
        f27891a = new C7596u2();
        f27892b = new C7590t2();
    }

    private AbstractC7584s2() {
    }

    /* renamed from: a */
    static AbstractC7584s2 m21398a() {
        return f27891a;
    }

    /* renamed from: d */
    static AbstractC7584s2 m21399d() {
        return f27892b;
    }

    /* renamed from: b */
    abstract <L> List<L> mo21400b(Object obj, long j2);

    /* renamed from: c */
    abstract <L> void mo21401c(Object obj, Object obj2, long j2);

    /* renamed from: e */
    abstract void mo21402e(Object obj, long j2);
}
