package A7;

import A7.AbstractC0851e;
import A7.InterfaceC0850d;
import B7.C0904g;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.util.List;
import z7.AbstractC5208j;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: A7.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC0867v extends Service implements InterfaceC0850d.a {

    /* renamed from: B, reason: collision with root package name */
    private ComponentName f1031B;

    /* renamed from: C, reason: collision with root package name */
    private U f1032C;

    /* renamed from: D, reason: collision with root package name */
    private IBinder f1033D;

    /* renamed from: E, reason: collision with root package name */
    private Intent f1034E;

    /* renamed from: F, reason: collision with root package name */
    private Looper f1035F;

    /* renamed from: H, reason: collision with root package name */
    private boolean f1037H;

    /* renamed from: G, reason: collision with root package name */
    private final Object f1036G = new Object();

    /* renamed from: I, reason: collision with root package name */
    private final C0904g f1038I = new C0904g(new S(this, null));

    public Looper f() {
        if (this.f1035F == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.f1035F = handlerThread.getLooper();
        }
        return this.f1035F;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.IBinder onBind(android.content.Intent r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L4
            goto L86
        L4:
            java.lang.String r0 = r4.getAction()
            if (r0 == 0) goto L86
            int r1 = r0.hashCode()
            r2 = 3
            switch(r1) {
                case -1487371046: goto L4f;
                case -1140095138: goto L45;
                case -786751258: goto L3b;
                case 705066793: goto L31;
                case 915816236: goto L27;
                case 1003809169: goto L1d;
                case 1460975593: goto L13;
                default: goto L12;
            }
        L12:
            goto L59
        L13:
            java.lang.String r1 = "com.google.android.gms.wearable.BIND_LISTENER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 0
            goto L5a
        L1d:
            java.lang.String r1 = "com.google.android.gms.wearable.CHANNEL_EVENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = r2
            goto L5a
        L27:
            java.lang.String r1 = "com.google.android.gms.wearable.DATA_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 1
            goto L5a
        L31:
            java.lang.String r1 = "com.google.android.gms.wearable.NODE_MIGRATED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 2
            goto L5a
        L3b:
            java.lang.String r1 = "com.google.android.gms.wearable.MESSAGE_RECEIVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 5
            goto L5a
        L45:
            java.lang.String r1 = "com.google.android.gms.wearable.REQUEST_RECEIVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 4
            goto L5a
        L4f:
            java.lang.String r1 = "com.google.android.gms.wearable.CAPABILITY_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 6
            goto L5a
        L59:
            r0 = -1
        L5a:
            switch(r0) {
                case 0: goto L83;
                case 1: goto L83;
                case 2: goto L83;
                case 3: goto L83;
                case 4: goto L83;
                case 5: goto L83;
                case 6: goto L83;
                default: goto L5d;
            }
        L5d:
            java.lang.String r0 = "WearableLS"
            boolean r1 = android.util.Log.isLoggable(r0, r2)
            if (r1 == 0) goto L86
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onBind: Provided bind intent ("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ") is not allowed"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.util.Log.d(r0, r4)
            goto L86
        L83:
            android.os.IBinder r4 = r3.f1033D
            return r4
        L86:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.AbstractServiceC0867v.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f1031B = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(this.f1031B)));
        }
        this.f1032C = new U(this, f());
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.f1034E = intent;
        intent.setComponent(this.f1031B);
        this.f1033D = new D(this, null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.f1031B)));
        }
        synchronized (this.f1036G) {
            this.f1037H = true;
            U u10 = this.f1032C;
            if (u10 == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=" + String.valueOf(this.f1031B));
            }
            u10.b();
        }
        super.onDestroy();
    }

    public AbstractC5208j<byte[]> v(String str, String str2, byte[] bArr) {
        return null;
    }

    @Override // A7.InterfaceC0850d.a
    public void b(InterfaceC0849c interfaceC0849c) {
    }

    public void h(InterfaceC0848b interfaceC0848b) {
    }

    public void j(AbstractC0851e.a aVar) {
    }

    public void l(List<InterfaceC0862p> list) {
    }

    public void m(C0854h c0854h) {
    }

    public void n(InterfaceC0869x interfaceC0869x) {
    }

    public void p(InterfaceC0861o interfaceC0861o) {
    }

    public void r(F f10) {
    }

    public void t(InterfaceC0862p interfaceC0862p) {
    }

    public void u(InterfaceC0862p interfaceC0862p) {
    }

    public void q(String str, C0857k c0857k) {
    }

    @Override // A7.InterfaceC0850d.a
    public void a(InterfaceC0849c interfaceC0849c, int i10, int i11) {
    }

    @Override // A7.InterfaceC0850d.a
    public void d(InterfaceC0849c interfaceC0849c, int i10, int i11) {
    }

    @Override // A7.InterfaceC0850d.a
    public void e(InterfaceC0849c interfaceC0849c, int i10, int i11) {
    }

    public void i(AbstractC0851e.a aVar, int i10, int i11) {
    }

    public void o(AbstractC0851e.a aVar, int i10, int i11) {
    }

    public void s(AbstractC0851e.a aVar, int i10, int i11) {
    }
}
