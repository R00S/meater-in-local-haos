package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import p241e.p244b.p245a.p246a.C8773a;
import p241e.p254e.p256b.p269b.p270a.InterfaceC8892a;

/* compiled from: InstallReferrerClientImpl.java */
/* renamed from: com.android.installreferrer.api.a */
/* loaded from: classes.dex */
class C5327a extends InstallReferrerClient {

    /* renamed from: a */
    private int f12955a = 0;

    /* renamed from: b */
    private final Context f12956b;

    /* renamed from: c */
    private InterfaceC8892a f12957c;

    /* renamed from: d */
    private ServiceConnection f12958d;

    /* compiled from: InstallReferrerClientImpl.java */
    /* renamed from: com.android.installreferrer.api.a$b */
    private final class b implements ServiceConnection {

        /* renamed from: f */
        private final InstallReferrerStateListener f12959f;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C8773a.m27920a("InstallReferrerClient", "Install Referrer service connected.");
            C5327a.this.f12957c = InterfaceC8892a.a.m28237H(iBinder);
            C5327a.this.f12955a = 2;
            this.f12959f.mo9906a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C8773a.m27921b("InstallReferrerClient", "Install Referrer service disconnected.");
            C5327a.this.f12957c = null;
            C5327a.this.f12955a = 0;
            this.f12959f.mo9907b();
        }

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f12959f = installReferrerStateListener;
        }
    }

    public C5327a(Context context) {
        this.f12956b = context.getApplicationContext();
    }

    /* renamed from: g */
    private boolean m9911g() {
        try {
            return this.f12956b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: a */
    public void mo9902a() {
        this.f12955a = 3;
        if (this.f12958d != null) {
            C8773a.m27920a("InstallReferrerClient", "Unbinding from service.");
            this.f12956b.unbindService(this.f12958d);
            this.f12958d = null;
        }
        this.f12957c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: b */
    public ReferrerDetails mo9903b() throws RemoteException {
        if (!m9912h()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f12956b.getPackageName());
        try {
            return new ReferrerDetails(this.f12957c.mo28236e3(bundle));
        } catch (RemoteException e2) {
            C8773a.m27921b("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f12955a = 0;
            throw e2;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: d */
    public void mo9904d(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (m9912h()) {
            C8773a.m27920a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.mo9906a(0);
            return;
        }
        int i2 = this.f12955a;
        if (i2 == 1) {
            C8773a.m27921b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.mo9906a(3);
            return;
        }
        if (i2 == 3) {
            C8773a.m27921b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.mo9906a(3);
            return;
        }
        C8773a.m27920a("InstallReferrerClient", "Starting install referrer service setup.");
        this.f12958d = new b(installReferrerStateListener);
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.f12956b.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f12955a = 0;
            C8773a.m27920a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.mo9906a(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !m9911g()) {
            C8773a.m27921b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f12955a = 0;
            installReferrerStateListener.mo9906a(2);
        } else {
            if (this.f12956b.bindService(new Intent(intent), this.f12958d, 1)) {
                C8773a.m27920a("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            C8773a.m27921b("InstallReferrerClient", "Connection to service is blocked.");
            this.f12955a = 0;
            installReferrerStateListener.mo9906a(1);
        }
    }

    /* renamed from: h */
    public boolean m9912h() {
        return (this.f12955a != 2 || this.f12957c == null || this.f12958d == null) ? false : true;
    }
}
