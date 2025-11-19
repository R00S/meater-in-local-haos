package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import g1.C3380d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2555p3 implements InterfaceC2515k3 {

    /* renamed from: c, reason: collision with root package name */
    private static C2555p3 f34261c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f34262a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentObserver f34263b;

    private C2555p3() {
        this.f34262a = null;
        this.f34263b = null;
    }

    static C2555p3 a(Context context) {
        C2555p3 c2555p3;
        synchronized (C2555p3.class) {
            try {
                if (f34261c == null) {
                    f34261c = C3380d.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C2555p3(context) : new C2555p3();
                }
                c2555p3 = f34261c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2555p3;
    }

    static synchronized void d() {
        Context context;
        try {
            C2555p3 c2555p3 = f34261c;
            if (c2555p3 != null && (context = c2555p3.f34262a) != null && c2555p3.f34263b != null) {
                context.getContentResolver().unregisterContentObserver(f34261c.f34263b);
            }
            f34261c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2515k3
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String c(final String str) {
        Context context = this.f34262a;
        if (context != null && !C2475f3.b(context)) {
            try {
                return (String) C2539n3.a(new InterfaceC2531m3() { // from class: com.google.android.gms.internal.measurement.o3
                    @Override // com.google.android.gms.internal.measurement.InterfaceC2531m3
                    public final Object a() {
                        return S2.a(this.f34227a.f34262a.getContentResolver(), str, null);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e10);
            }
        }
        return null;
    }

    private C2555p3(Context context) {
        this.f34262a = context;
        C2570r3 c2570r3 = new C2570r3(this, null);
        this.f34263b = c2570r3;
        context.getContentResolver().registerContentObserver(V2.f33905a, true, c2570r3);
    }
}
