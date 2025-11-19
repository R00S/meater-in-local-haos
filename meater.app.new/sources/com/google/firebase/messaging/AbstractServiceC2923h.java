package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.h0;
import java.util.concurrent.ExecutorService;
import o3.ExecutorC4121m;
import z7.AbstractC5208j;
import z7.C5209k;
import z7.C5211m;
import z7.InterfaceC5203e;

/* compiled from: EnhancedIntentService.java */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC2923h extends Service {

    /* renamed from: C, reason: collision with root package name */
    private Binder f38397C;

    /* renamed from: E, reason: collision with root package name */
    private int f38399E;

    /* renamed from: B, reason: collision with root package name */
    final ExecutorService f38396B = C2929n.d();

    /* renamed from: D, reason: collision with root package name */
    private final Object f38398D = new Object();

    /* renamed from: F, reason: collision with root package name */
    private int f38400F = 0;

    /* compiled from: EnhancedIntentService.java */
    /* renamed from: com.google.firebase.messaging.h$a */
    class a implements h0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.h0.a
        public AbstractC5208j<Void> a(Intent intent) {
            return AbstractServiceC2923h.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            f0.c(intent);
        }
        synchronized (this.f38398D) {
            try {
                int i10 = this.f38400F - 1;
                this.f38400F = i10;
                if (i10 == 0) {
                    k(this.f38399E);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Intent intent, AbstractC5208j abstractC5208j) {
        d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, C5209k c5209k) {
        try {
            f(intent);
        } finally {
            c5209k.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC5208j<Void> j(final Intent intent) {
        if (g(intent)) {
            return C5211m.e(null);
        }
        final C5209k c5209k = new C5209k();
        this.f38396B.execute(new Runnable() { // from class: com.google.firebase.messaging.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f38392B.i(intent, c5209k);
            }
        });
        return c5209k.a();
    }

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean k(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f38397C == null) {
                this.f38397C = new h0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f38397C;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f38396B.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.f38398D) {
            this.f38399E = i11;
            this.f38400F++;
        }
        Intent intentE = e(intent);
        if (intentE == null) {
            d(intent);
            return 2;
        }
        AbstractC5208j<Void> abstractC5208jJ = j(intentE);
        if (abstractC5208jJ.n()) {
            d(intent);
            return 2;
        }
        abstractC5208jJ.b(new ExecutorC4121m(), new InterfaceC5203e() { // from class: com.google.firebase.messaging.f
            @Override // z7.InterfaceC5203e
            public final void a(AbstractC5208j abstractC5208j) {
                this.f38387a.h(intent, abstractC5208j);
            }
        });
        return 3;
    }

    protected Intent e(Intent intent) {
        return intent;
    }
}
