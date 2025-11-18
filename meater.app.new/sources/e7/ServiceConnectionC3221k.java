package e7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import c7.C2333b;
import c7.C2335d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import g7.AbstractC3433d;
import g7.AbstractC3438i;
import g7.C3445p;
import g7.InterfaceC3439j;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: e7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC3221k implements a.f, ServiceConnection {

    /* renamed from: B, reason: collision with root package name */
    private final String f40703B;

    /* renamed from: C, reason: collision with root package name */
    private final String f40704C;

    /* renamed from: D, reason: collision with root package name */
    private final ComponentName f40705D;

    /* renamed from: E, reason: collision with root package name */
    private final Context f40706E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC3215e f40707F;

    /* renamed from: G, reason: collision with root package name */
    private final Handler f40708G;

    /* renamed from: H, reason: collision with root package name */
    private final InterfaceC3222l f40709H;

    /* renamed from: I, reason: collision with root package name */
    private IBinder f40710I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f40711J;

    /* renamed from: K, reason: collision with root package name */
    private String f40712K;

    /* renamed from: L, reason: collision with root package name */
    private String f40713L;

    private final void s() {
        if (Thread.currentThread() != this.f40708G.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void a(AbstractC3433d.c cVar) {
        s();
        String.valueOf(this.f40710I);
        if (h()) {
            try {
                c("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f40705D;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f40703B).setAction(this.f40704C);
            }
            boolean zBindService = this.f40706E.bindService(intent, this, AbstractC3438i.a());
            this.f40711J = zBindService;
            if (!zBindService) {
                this.f40710I = null;
                this.f40709H.c(new C2333b(16));
            }
            String.valueOf(this.f40710I);
        } catch (SecurityException e10) {
            this.f40711J = false;
            this.f40710I = null;
            throw e10;
        }
    }

    @Override // com.google.android.gms.common.api.a.f
    public final Set<Scope> b() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void c(String str) {
        s();
        this.f40712K = str;
        g();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean d() {
        s();
        return this.f40711J;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String e() {
        String str = this.f40703B;
        if (str != null) {
            return str;
        }
        C3445p.k(this.f40705D);
        return this.f40705D.getPackageName();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void g() {
        s();
        String.valueOf(this.f40710I);
        try {
            this.f40706E.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f40711J = false;
        this.f40710I = null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean h() {
        s();
        return this.f40710I != null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final C2335d[] k() {
        return new C2335d[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String m() {
        return this.f40712K;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean n() {
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f40708G.post(new Runnable() { // from class: e7.N
            @Override // java.lang.Runnable
            public final void run() {
                this.f40626B.q(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f40708G.post(new Runnable() { // from class: e7.M
            @Override // java.lang.Runnable
            public final void run() {
                this.f40625B.p();
            }
        });
    }

    final /* synthetic */ void p() {
        this.f40711J = false;
        this.f40710I = null;
        this.f40707F.g(1);
    }

    final /* synthetic */ void q(IBinder iBinder) {
        this.f40711J = false;
        this.f40710I = iBinder;
        String.valueOf(iBinder);
        this.f40707F.k(new Bundle());
    }

    public final void r(String str) {
        this.f40713L = str;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void l(AbstractC3433d.e eVar) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void f(InterfaceC3439j interfaceC3439j, Set<Scope> set) {
    }
}
