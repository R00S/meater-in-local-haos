package com.facebook.p157o0.p163o0;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.C5641a0;
import com.facebook.p157o0.p163o0.C5883f;
import com.facebook.p157o0.p165q0.C5904i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9801m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
/* renamed from: com.facebook.o0.o0.f */
/* loaded from: classes2.dex */
public final class C5883f {

    /* renamed from: a */
    public static final C5883f f15275a = new C5883f();

    /* renamed from: b */
    private static final String f15276b = C5883f.class.getCanonicalName();

    /* renamed from: c */
    private static final AtomicBoolean f15277c = new AtomicBoolean(false);

    /* renamed from: d */
    private static Boolean f15278d;

    /* renamed from: e */
    private static Boolean f15279e;

    /* renamed from: f */
    private static ServiceConnection f15280f;

    /* renamed from: g */
    private static Application.ActivityLifecycleCallbacks f15281g;

    /* renamed from: h */
    private static Intent f15282h;

    /* renamed from: i */
    private static Object f15283i;

    /* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
    /* renamed from: com.facebook.o0.o0.f$a */
    public static final class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C9801m.m32346f(componentName, "name");
            C9801m.m32346f(iBinder, "service");
            C5883f c5883f = C5883f.f15275a;
            C5886i c5886i = C5886i.f15313a;
            C5641a0 c5641a0 = C5641a0.f14199a;
            C5883f.f15283i = C5886i.m12540a(C5641a0.m11284c(), iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C9801m.m32346f(componentName, "name");
        }
    }

    /* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
    /* renamed from: com.facebook.o0.o0.f$b */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m12504c() throws JSONException {
            C5641a0 c5641a0 = C5641a0.f14199a;
            Context contextM11284c = C5641a0.m11284c();
            C5886i c5886i = C5886i.f15313a;
            ArrayList<String> arrayListM12548i = C5886i.m12548i(contextM11284c, C5883f.f15283i);
            C5883f c5883f = C5883f.f15275a;
            c5883f.m12499f(contextM11284c, arrayListM12548i, false);
            c5883f.m12499f(contextM11284c, C5886i.m12549j(contextM11284c, C5883f.f15283i), true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m12505d() throws JSONException {
            C5641a0 c5641a0 = C5641a0.f14199a;
            Context contextM11284c = C5641a0.m11284c();
            C5886i c5886i = C5886i.f15313a;
            ArrayList<String> arrayListM12548i = C5886i.m12548i(contextM11284c, C5883f.f15283i);
            if (arrayListM12548i.isEmpty()) {
                arrayListM12548i = C5886i.m12546g(contextM11284c, C5883f.f15283i);
            }
            C5883f.f15275a.m12499f(contextM11284c, arrayListM12548i, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C9801m.m32346f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C9801m.m32346f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C9801m.m32346f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C9801m.m32346f(activity, "activity");
            try {
                C5641a0 c5641a0 = C5641a0.f14199a;
                C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.o0.a
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        C5883f.b.m12504c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C9801m.m32346f(activity, "activity");
            C9801m.m32346f(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C9801m.m32346f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C9801m.m32346f(activity, "activity");
            try {
                if (C9801m.m32341a(C5883f.f15279e, Boolean.TRUE) && C9801m.m32341a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    C5641a0 c5641a0 = C5641a0.f14199a;
                    C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.o0.b
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            C5883f.b.m12505d();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    private C5883f() {
    }

    /* renamed from: e */
    private final void m12498e() {
        if (f15278d != null) {
            return;
        }
        C5890m c5890m = C5890m.f15334a;
        Boolean boolValueOf = Boolean.valueOf(C5890m.m12574a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        f15278d = boolValueOf;
        if (C9801m.m32341a(boolValueOf, Boolean.FALSE)) {
            return;
        }
        f15279e = Boolean.valueOf(C5890m.m12574a("com.android.billingclient.api.ProxyBillingActivity") != null);
        C5886i c5886i = C5886i.f15313a;
        C5886i.m12541b();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        C9801m.m32345e(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
        f15282h = intent;
        f15280f = new a();
        f15281g = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m12499f(Context context, ArrayList<String> arrayList, boolean z) throws JSONException {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                String string = new JSONObject(next).getString("productId");
                C9801m.m32345e(string, "sku");
                C9801m.m32345e(next, "purchase");
                map.put(string, next);
                arrayList2.add(string);
            } catch (JSONException e2) {
                Log.e(f15276b, "Error parsing in-app purchase data.", e2);
            }
        }
        C5886i c5886i = C5886i.f15313a;
        for (Map.Entry<String, String> entry : C5886i.m12550k(context, arrayList2, f15283i, z).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str = (String) map.get(key);
            if (str != null) {
                C5904i c5904i = C5904i.f15376a;
                C5904i.m12638f(str, value, z);
            }
        }
    }

    /* renamed from: g */
    public static final void m12500g() {
        C5883f c5883f = f15275a;
        c5883f.m12498e();
        if (C9801m.m32341a(f15278d, Boolean.FALSE)) {
            return;
        }
        C5904i c5904i = C5904i.f15376a;
        if (C5904i.m12635c()) {
            c5883f.m12501h();
        }
    }

    /* renamed from: h */
    private final void m12501h() {
        if (f15277c.compareAndSet(false, true)) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            Context contextM11284c = C5641a0.m11284c();
            if (contextM11284c instanceof Application) {
                Application application = (Application) contextM11284c;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f15281g;
                if (activityLifecycleCallbacks == null) {
                    C9801m.m32363w("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = f15282h;
                if (intent == null) {
                    C9801m.m32363w("intent");
                    throw null;
                }
                ServiceConnection serviceConnection = f15280f;
                if (serviceConnection != null) {
                    contextM11284c.bindService(intent, serviceConnection, 1);
                } else {
                    C9801m.m32363w("serviceConnection");
                    throw null;
                }
            }
        }
    }
}
