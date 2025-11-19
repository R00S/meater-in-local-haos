package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2539n3 {
    public static <V> V a(InterfaceC2531m3<V> interfaceC2531m3) {
        try {
            return interfaceC2531m3.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC2531m3.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
