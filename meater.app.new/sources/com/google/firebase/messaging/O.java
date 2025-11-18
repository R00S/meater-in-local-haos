package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import o3.ExecutorC4121m;
import z7.InterfaceC5205g;

/* compiled from: ProxyNotificationPreferences.java */
/* loaded from: classes2.dex */
final class O {
    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    static boolean d(SharedPreferences sharedPreferences, boolean z10) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z10;
    }

    static void f(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z10);
        editorEdit.apply();
    }

    static void g(final Context context, B b10, final boolean z10) {
        if (com.google.android.gms.common.util.l.g() && !d(b(context), z10)) {
            b10.k(z10).f(new ExecutorC4121m(), new InterfaceC5205g() { // from class: com.google.firebase.messaging.N
                @Override // z7.InterfaceC5205g
                public final void a(Object obj) {
                    O.h(context, z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_retention", z10);
        editorEdit.apply();
    }
}
