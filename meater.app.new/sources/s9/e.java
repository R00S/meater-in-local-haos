package s9;

import A9.k;
import K6.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import j9.InterfaceC3755b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k9.InterfaceC3810e;
import v9.C4925a;
import v9.C4926b;

/* compiled from: FirebasePerformance.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: i, reason: collision with root package name */
    private static final C4925a f49529i = C4925a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f49530a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f49531b;

    /* renamed from: c, reason: collision with root package name */
    private final B9.f f49532c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f49533d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.f f49534e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3755b<com.google.firebase.remoteconfig.c> f49535f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3810e f49536g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3755b<j> f49537h;

    e(com.google.firebase.f fVar, InterfaceC3755b<com.google.firebase.remoteconfig.c> interfaceC3755b, InterfaceC3810e interfaceC3810e, InterfaceC3755b<j> interfaceC3755b2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        this.f49533d = null;
        this.f49534e = fVar;
        this.f49535f = interfaceC3755b;
        this.f49536g = interfaceC3810e;
        this.f49537h = interfaceC3755b2;
        if (fVar == null) {
            this.f49533d = Boolean.FALSE;
            this.f49531b = aVar;
            this.f49532c = new B9.f(new Bundle());
            return;
        }
        k.k().r(fVar, interfaceC3810e, interfaceC3755b2);
        Context contextK = fVar.k();
        B9.f fVarA = a(contextK);
        this.f49532c = fVarA;
        remoteConfigManager.setFirebaseRemoteConfigProvider(interfaceC3755b);
        this.f49531b = aVar;
        aVar.P(fVarA);
        aVar.O(contextK);
        sessionManager.setApplicationContext(contextK);
        this.f49533d = aVar.j();
        C4925a c4925a = f49529i;
        if (c4925a.h() && d()) {
            c4925a.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", C4926b.b(fVar.n().e(), contextK.getPackageName())));
        }
    }

    private static B9.f a(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Log.d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        return bundle != null ? new B9.f(bundle) : new B9.f();
    }

    public static e c() {
        return (e) com.google.firebase.f.l().j(e.class);
    }

    public Map<String, String> b() {
        return new HashMap(this.f49530a);
    }

    public boolean d() {
        Boolean bool = this.f49533d;
        return bool != null ? bool.booleanValue() : com.google.firebase.f.l().t();
    }
}
