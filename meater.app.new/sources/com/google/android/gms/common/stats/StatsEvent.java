package com.google.android.gms.common.stats;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    public interface Types {
    }

    /* renamed from: W */
    public abstract long mo14583W();

    /* renamed from: Y */
    public abstract String mo14584Y();

    public final String toString() {
        return mo14583W() + "\t" + mo14585y() + "\t" + mo14586z() + mo14584Y();
    }

    /* renamed from: y */
    public abstract int mo14585y();

    /* renamed from: z */
    public abstract long mo14586z();
}
