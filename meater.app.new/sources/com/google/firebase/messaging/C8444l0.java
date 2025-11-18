package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
@KeepForSdk
/* renamed from: com.google.firebase.messaging.l0 */
/* loaded from: classes2.dex */
public class C8444l0 {

    /* renamed from: a */
    private static C8444l0 f32009a;

    /* renamed from: b */
    private String f32010b = null;

    /* renamed from: c */
    private Boolean f32011c = null;

    /* renamed from: d */
    private Boolean f32012d = null;

    /* renamed from: e */
    private final Queue<Intent> f32013e = new ArrayDeque();

    private C8444l0() {
    }

    /* renamed from: a */
    private int m26579a(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strM26581f = m26581f(context, intent);
        if (strM26581f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", strM26581f.length() != 0 ? "Restricting intent to a specific service: ".concat(strM26581f) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), strM26581f);
        }
        try {
            if (m26584e(context)) {
                componentNameStartService = C8464v0.m26665e(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(strValueOf);
            Log.e("FirebaseMessaging", sb.toString());
            return 402;
        } catch (SecurityException e3) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e3);
            return 401;
        }
    }

    /* renamed from: b */
    static synchronized C8444l0 m26580b() {
        if (f32009a == null) {
            f32009a = new C8444l0();
        }
        return f32009a;
    }

    /* renamed from: f */
    private synchronized String m26581f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f32010b;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    String strValueOf2 = String.valueOf(serviceInfo.name);
                    this.f32010b = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                } else {
                    this.f32010b = serviceInfo.name;
                }
                return this.f32010b;
            }
            String str3 = serviceInfo.packageName;
            String str4 = serviceInfo.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
            sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb.append(str3);
            sb.append("/");
            sb.append(str4);
            Log.e("FirebaseMessaging", sb.toString());
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* renamed from: c */
    Intent m26582c() {
        return this.f32013e.poll();
    }

    /* renamed from: d */
    boolean m26583d(Context context) {
        if (this.f32012d == null) {
            this.f32012d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f32011c.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f32012d.booleanValue();
    }

    /* renamed from: e */
    boolean m26584e(Context context) {
        if (this.f32011c == null) {
            this.f32011c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f32011c.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f32011c.booleanValue();
    }

    /* renamed from: g */
    public int m26585g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f32013e.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m26579a(context, intent2);
    }
}
