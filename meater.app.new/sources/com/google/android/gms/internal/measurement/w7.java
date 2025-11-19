package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public enum w7 {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    w7(int i10) {
    }

    public static w7 c(int i10) {
        return i10 != 2 ? i10 != 3 ? i10 != 5 ? i10 != 6 ? INFO : ERROR : WARN : DEBUG : VERBOSE;
    }
}
