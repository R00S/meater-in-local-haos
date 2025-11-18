package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: LifecycleService.java */
/* renamed from: androidx.lifecycle.n */
/* loaded from: classes.dex */
public class ServiceC0518n extends Service implements InterfaceC0515k {

    /* renamed from: f */
    private final C0527w f3490f = new C0527w(this);

    @Override // androidx.lifecycle.InterfaceC0515k
    public AbstractC0511g getLifecycle() {
        return this.f3490f.m3906a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f3490f.m3907b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f3490f.m3908c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f3490f.m3909d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        this.f3490f.m3910e();
        super.onStart(intent, i2);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        return super.onStartCommand(intent, i2, i3);
    }
}
