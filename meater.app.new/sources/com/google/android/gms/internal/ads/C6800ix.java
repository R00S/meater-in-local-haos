package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.ix */
/* loaded from: classes2.dex */
final class C6800ix implements PrivilegedExceptionAction<Unsafe> {
    C6800ix() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Unsafe run() throws Exception {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}
