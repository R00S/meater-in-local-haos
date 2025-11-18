package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes.dex */
public final class zzdc {
    /* renamed from: a */
    public static <T> zzcz<T> m22130a(zzcz<T> zzczVar) {
        return ((zzczVar instanceof C7487c1) || (zzczVar instanceof C7475a1)) ? zzczVar : zzczVar instanceof Serializable ? new C7475a1(zzczVar) : new C7487c1(zzczVar);
    }

    /* renamed from: b */
    public static <T> zzcz<T> m22131b(@NullableDecl T t) {
        return new C7481b1(t);
    }
}
