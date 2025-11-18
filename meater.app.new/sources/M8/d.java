package M8;

import I8.a;
import android.os.Bundle;
import com.apptionlabs.meater_app.data.Temperature;
import j9.InterfaceC3754a;
import j9.InterfaceC3755b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: AnalyticsDeferredProxy.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3754a<I8.a> f12125a;

    /* renamed from: b, reason: collision with root package name */
    private volatile O8.a f12126b;

    /* renamed from: c, reason: collision with root package name */
    private volatile P8.b f12127c;

    /* renamed from: d, reason: collision with root package name */
    private final List<P8.a> f12128d;

    public d(InterfaceC3754a<I8.a> interfaceC3754a) {
        this(interfaceC3754a, new P8.c(), new O8.f());
    }

    private void f() {
        this.f12125a.a(new InterfaceC3754a.InterfaceC0558a() { // from class: M8.c
            @Override // j9.InterfaceC3754a.InterfaceC0558a
            public final void a(InterfaceC3755b interfaceC3755b) {
                this.f12124a.i(interfaceC3755b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f12126b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(P8.a aVar) {
        synchronized (this) {
            try {
                if (this.f12127c instanceof P8.c) {
                    this.f12128d.add(aVar);
                }
                this.f12127c.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(InterfaceC3755b interfaceC3755b) {
        N8.g.f().b("AnalyticsConnector now available.");
        I8.a aVar = (I8.a) interfaceC3755b.get();
        O8.e eVar = new O8.e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) == null) {
            N8.g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        N8.g.f().b("Registered Firebase Analytics listener.");
        O8.d dVar = new O8.d();
        O8.c cVar = new O8.c(eVar, Temperature.MAX_AMBIENT_SECOND_GEN_PROBE, TimeUnit.MILLISECONDS);
        synchronized (this) {
            try {
                Iterator<P8.a> it = this.f12128d.iterator();
                while (it.hasNext()) {
                    dVar.a(it.next());
                }
                eVar2.d(dVar);
                eVar2.e(cVar);
                this.f12127c = dVar;
                this.f12126b = cVar;
            } finally {
            }
        }
    }

    private static a.InterfaceC0136a j(I8.a aVar, e eVar) {
        a.InterfaceC0136a interfaceC0136aG = aVar.g("clx", eVar);
        if (interfaceC0136aG == null) {
            N8.g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            interfaceC0136aG = aVar.g("crash", eVar);
            if (interfaceC0136aG != null) {
                N8.g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return interfaceC0136aG;
    }

    public O8.a d() {
        return new O8.a() { // from class: M8.b
            @Override // O8.a
            public final void a(String str, Bundle bundle) {
                this.f12123a.g(str, bundle);
            }
        };
    }

    public P8.b e() {
        return new P8.b() { // from class: M8.a
            @Override // P8.b
            public final void a(P8.a aVar) {
                this.f12122a.h(aVar);
            }
        };
    }

    public d(InterfaceC3754a<I8.a> interfaceC3754a, P8.b bVar, O8.a aVar) {
        this.f12125a = interfaceC3754a;
        this.f12127c = bVar;
        this.f12128d = new ArrayList();
        this.f12126b = aVar;
        f();
    }
}
