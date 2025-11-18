package org.eclipse.paho.android.service;

import Fc.o;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;

/* compiled from: AlarmPingSender.java */
/* loaded from: classes3.dex */
class a implements o {

    /* renamed from: a, reason: collision with root package name */
    private Gc.a f47228a;

    /* renamed from: b, reason: collision with root package name */
    private final MqttService f47229b;

    /* renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f47230c;

    /* renamed from: d, reason: collision with root package name */
    private final a f47231d;

    /* renamed from: e, reason: collision with root package name */
    private PendingIntent f47232e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f47233f = false;

    /* compiled from: AlarmPingSender.java */
    /* renamed from: org.eclipse.paho.android.service.a$a, reason: collision with other inner class name */
    class C0654a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private PowerManager.WakeLock f47234a;

        /* renamed from: b, reason: collision with root package name */
        private final String f47235b;

        /* compiled from: AlarmPingSender.java */
        /* renamed from: org.eclipse.paho.android.service.a$a$a, reason: collision with other inner class name */
        class C0655a implements Fc.a {
            C0655a() {
            }

            @Override // Fc.a
            public void a(Fc.e eVar) {
                C0654a.this.f47234a.release();
            }

            @Override // Fc.a
            public void b(Fc.e eVar, Throwable th) {
                C0654a.this.f47234a.release();
            }
        }

        C0654a() {
            this.f47235b = "MqttService.client." + a.this.f47231d.f47228a.r().a();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                intent.getIntExtra("android.intent.extra.ALARM_COUNT", -1);
            } catch (ClassCastException unused) {
                Long.valueOf(intent.getLongExtra("android.intent.extra.ALARM_COUNT", -1L)).intValue();
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a.this.f47229b.getSystemService("power")).newWakeLock(1, this.f47235b);
            this.f47234a = wakeLockNewWakeLock;
            wakeLockNewWakeLock.acquire();
            if (a.this.f47228a.l(new C0655a()) == null && this.f47234a.isHeld()) {
                this.f47234a.release();
            }
        }
    }

    public a(MqttService mqttService) {
        if (mqttService == null) {
            throw new IllegalArgumentException("Neither service nor client can be null.");
        }
        this.f47229b = mqttService;
        this.f47231d = this;
    }

    @Override // Fc.o
    public void a(long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis() + j10;
        AlarmManager alarmManager = (AlarmManager) this.f47229b.getSystemService("alarm");
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                alarmManager.set(0, jCurrentTimeMillis, this.f47232e);
            } else {
                alarmManager.setExact(0, jCurrentTimeMillis, this.f47232e);
            }
        }
    }

    @Override // Fc.o
    public void b(Gc.a aVar) {
        this.f47228a = aVar;
        this.f47230c = new C0654a();
    }

    @Override // Fc.o
    public void start() {
        String str = "MqttService.pingSender." + this.f47228a.r().a();
        if (Build.VERSION.SDK_INT >= 33) {
            this.f47229b.registerReceiver(this.f47230c, new IntentFilter(str), 4);
            this.f47232e = PendingIntent.getBroadcast(this.f47229b, 0, new Intent(str), new D4.d(150994944, true).getFlags());
        } else {
            this.f47232e = PendingIntent.getBroadcast(this.f47229b, 0, new Intent(str), new D4.d(134217728, true).getFlags());
        }
        a(this.f47228a.s());
        this.f47233f = true;
    }

    @Override // Fc.o
    public void stop() {
        if (this.f47233f) {
            ((AlarmManager) this.f47229b.getSystemService("alarm")).cancel(this.f47232e);
            this.f47233f = false;
            try {
                this.f47229b.unregisterReceiver(this.f47230c);
            } catch (IllegalArgumentException unused) {
            }
        }
    }
}
