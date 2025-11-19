package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o3.ExecutorC4121m;
import z7.AbstractC5208j;
import z7.C5211m;
import z7.InterfaceC5201c;

/* compiled from: FcmBroadcastProcessor.java */
/* renamed from: com.google.firebase.messaging.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2928m {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f38418c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static k0 f38419d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f38420a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f38421b = new ExecutorC4121m();

    public C2928m(Context context) {
        this.f38420a = context;
    }

    private static AbstractC5208j<Integer> e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        k0 k0VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return k0VarF.d(intent).h(new ExecutorC4121m(), new InterfaceC5201c() { // from class: com.google.firebase.messaging.l
                @Override // z7.InterfaceC5201c
                public final Object a(AbstractC5208j abstractC5208j) {
                    return C2928m.g(abstractC5208j);
                }
            });
        }
        if (U.b().e(context)) {
            f0.f(context, k0VarF, intent);
        } else {
            k0VarF.d(intent);
        }
        return C5211m.e(-1);
    }

    private static k0 f(Context context, String str) {
        k0 k0Var;
        synchronized (f38418c) {
            try {
                if (f38419d == null) {
                    f38419d = new k0(context, str);
                }
                k0Var = f38419d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(AbstractC5208j abstractC5208j) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Integer.valueOf(U.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer i(AbstractC5208j abstractC5208j) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC5208j j(Context context, Intent intent, boolean z10, AbstractC5208j abstractC5208j) {
        return (com.google.android.gms.common.util.l.e() && ((Integer) abstractC5208j.k()).intValue() == 402) ? e(context, intent, z10).h(new ExecutorC4121m(), new InterfaceC5201c() { // from class: com.google.firebase.messaging.k
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j2) {
                return C2928m.i(abstractC5208j2);
            }
        }) : abstractC5208j;
    }

    public AbstractC5208j<Integer> k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f38420a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public AbstractC5208j<Integer> l(final Context context, final Intent intent) {
        boolean z10 = com.google.android.gms.common.util.l.e() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? C5211m.c(this.f38421b, new Callable() { // from class: com.google.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2928m.h(context, intent);
            }
        }).i(this.f38421b, new InterfaceC5201c() { // from class: com.google.firebase.messaging.j
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j) {
                return C2928m.j(context, intent, z11, abstractC5208j);
            }
        }) : e(context, intent, z11);
    }
}
