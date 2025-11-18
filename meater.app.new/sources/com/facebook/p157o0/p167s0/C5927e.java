package com.facebook.p157o0.p167s0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.C5641a0;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5739y;
import com.facebook.p157o0.C5941v;
import com.facebook.p157o0.p165q0.C5902g;
import com.facebook.p172q0.p173a.InterfaceC5949a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;

/* compiled from: RemoteServiceWrapper.kt */
/* renamed from: com.facebook.o0.s0.e */
/* loaded from: classes2.dex */
public final class C5927e {

    /* renamed from: a */
    public static final C5927e f15462a = new C5927e();

    /* renamed from: b */
    private static final String f15463b = C5927e.class.getSimpleName();

    /* renamed from: c */
    private static Boolean f15464c;

    /* compiled from: RemoteServiceWrapper.kt */
    /* renamed from: com.facebook.o0.s0.e$a */
    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


        /* renamed from: i */
        private final String f15468i;

        a(String str) {
            this.f15468i = str;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f15468i;
        }
    }

    /* compiled from: RemoteServiceWrapper.kt */
    /* renamed from: com.facebook.o0.s0.e$b */
    private static final class b implements ServiceConnection {

        /* renamed from: f */
        private final CountDownLatch f15469f = new CountDownLatch(1);

        /* renamed from: g */
        private IBinder f15470g;

        /* renamed from: a */
        public final IBinder m12757a() throws InterruptedException {
            this.f15469f.await(5L, TimeUnit.SECONDS);
            return this.f15470g;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            C9801m.m32346f(componentName, "name");
            this.f15469f.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C9801m.m32346f(componentName, "name");
            C9801m.m32346f(iBinder, "serviceBinder");
            this.f15470g = iBinder;
            this.f15469f.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C9801m.m32346f(componentName, "name");
        }
    }

    /* compiled from: RemoteServiceWrapper.kt */
    /* renamed from: com.facebook.o0.s0.e$c */
    public enum c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] cVarArrValuesCustom = values();
            return (c[]) Arrays.copyOf(cVarArrValuesCustom, cVarArrValuesCustom.length);
        }
    }

    private C5927e() {
    }

    /* renamed from: a */
    private final Intent m12751a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        Intent intent = new Intent("ReceiverService");
        intent.setPackage("com.facebook.katana");
        if (packageManager.resolveService(intent, 0) != null) {
            C5739y c5739y = C5739y.f14647a;
            if (C5739y.m11828a(context, "com.facebook.katana")) {
                return intent;
            }
        }
        Intent intent2 = new Intent("ReceiverService");
        intent2.setPackage("com.facebook.wakizashi");
        if (packageManager.resolveService(intent2, 0) == null) {
            return null;
        }
        C5739y c5739y2 = C5739y.f14647a;
        if (C5739y.m11828a(context, "com.facebook.wakizashi")) {
            return intent2;
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m12752b() {
        if (f15464c == null) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            f15464c = Boolean.valueOf(f15462a.m12751a(C5641a0.m11284c()) != null);
        }
        Boolean bool = f15464c;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: c */
    public static final c m12753c(String str, List<C5941v> list) {
        C9801m.m32346f(str, "applicationId");
        C9801m.m32346f(list, "appEvents");
        return f15462a.m12754d(a.CUSTOM_APP_EVENTS, str, list);
    }

    /* renamed from: d */
    private final c m12754d(a aVar, String str, List<C5941v> list) {
        c cVar;
        String str2;
        c cVar2 = c.SERVICE_NOT_AVAILABLE;
        C5902g c5902g = C5902g.f15370a;
        C5902g.m12625b();
        C5641a0 c5641a0 = C5641a0.f14199a;
        Context contextM11284c = C5641a0.m11284c();
        Intent intentM12751a = m12751a(contextM11284c);
        if (intentM12751a == null) {
            return cVar2;
        }
        b bVar = new b();
        try {
            if (!contextM11284c.bindService(intentM12751a, bVar, 1)) {
                return c.SERVICE_ERROR;
            }
            try {
                try {
                    IBinder iBinderM12757a = bVar.m12757a();
                    if (iBinderM12757a != null) {
                        InterfaceC5949a interfaceC5949aM12884H = InterfaceC5949a.a.m12884H(iBinderM12757a);
                        C5926d c5926d = C5926d.f15460a;
                        Bundle bundleM12748a = C5926d.m12748a(aVar, str, list);
                        if (bundleM12748a != null) {
                            interfaceC5949aM12884H.mo12883u1(bundleM12748a);
                            C5696p0 c5696p0 = C5696p0.f14478a;
                            C5696p0.m11575j0(f15463b, C9801m.m32354n("Successfully sent events to the remote service: ", bundleM12748a));
                        }
                        cVar2 = c.OPERATION_SUCCESS;
                    }
                    return cVar2;
                } catch (InterruptedException e2) {
                    cVar = c.SERVICE_ERROR;
                    C5696p0 c5696p02 = C5696p0.f14478a;
                    str2 = f15463b;
                    C5696p0.m11573i0(str2, e2);
                    contextM11284c.unbindService(bVar);
                    C5696p0.m11575j0(str2, "Unbound from the remote service");
                    return cVar;
                }
            } catch (RemoteException e3) {
                cVar = c.SERVICE_ERROR;
                C5696p0 c5696p03 = C5696p0.f14478a;
                str2 = f15463b;
                C5696p0.m11573i0(str2, e3);
                contextM11284c.unbindService(bVar);
                C5696p0.m11575j0(str2, "Unbound from the remote service");
                return cVar;
            }
        } finally {
            contextM11284c.unbindService(bVar);
            C5696p0 c5696p04 = C5696p0.f14478a;
            C5696p0.m11575j0(f15463b, "Unbound from the remote service");
        }
    }

    /* renamed from: e */
    public static final c m12755e(String str) {
        C9801m.m32346f(str, "applicationId");
        return f15462a.m12754d(a.MOBILE_APP_INSTALL, str, C10817u.m38888j());
    }
}
