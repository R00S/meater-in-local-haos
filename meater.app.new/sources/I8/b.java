package I8;

import I8.a;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2497i1;
import com.google.firebase.f;
import g7.C3445p;
import g9.C3456a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import u7.C4685a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.2.0 */
/* loaded from: classes2.dex */
public class b implements I8.a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile I8.a f6750c;

    /* renamed from: a, reason: collision with root package name */
    private final C4685a f6751a;

    /* renamed from: b, reason: collision with root package name */
    final Map<String, Object> f6752b;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@22.2.0 */
    class a implements a.InterfaceC0136a {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ String f6753a;

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ b f6754b;

        a(b bVar, String str) {
            this.f6753a = str;
            this.f6754b = bVar;
        }
    }

    private b(C4685a c4685a) {
        C3445p.k(c4685a);
        this.f6751a = c4685a;
        this.f6752b = new ConcurrentHashMap();
    }

    public static I8.a h(f fVar, Context context, g9.d dVar) {
        C3445p.k(fVar);
        C3445p.k(context);
        C3445p.k(dVar);
        C3445p.k(context.getApplicationContext());
        if (f6750c == null) {
            synchronized (b.class) {
                try {
                    if (f6750c == null) {
                        Bundle bundle = new Bundle(1);
                        if (fVar.u()) {
                            dVar.b(com.google.firebase.b.class, new Executor() { // from class: I8.d
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new g9.b() { // from class: I8.c
                                @Override // g9.b
                                public final void a(C3456a c3456a) {
                                    b.i(c3456a);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.t());
                        }
                        f6750c = new b(C2497i1.f(context, null, null, null, bundle).A());
                    }
                } finally {
                }
            }
        }
        return f6750c;
    }

    static /* synthetic */ void i(C3456a c3456a) {
        boolean z10 = ((com.google.firebase.b) c3456a.a()).f38094a;
        synchronized (b.class) {
            ((b) C3445p.k(f6750c)).f6751a.i(z10);
        }
    }

    private final boolean j(String str) {
        return (str.isEmpty() || !this.f6752b.containsKey(str) || this.f6752b.get(str) == null) ? false : true;
    }

    @Override // I8.a
    public Map<String, Object> a(boolean z10) {
        return this.f6751a.d(null, null, z10);
    }

    @Override // I8.a
    public void b(a.c cVar) {
        if (com.google.firebase.analytics.connector.internal.c.g(cVar)) {
            this.f6751a.g(com.google.firebase.analytics.connector.internal.c.b(cVar));
        }
    }

    @Override // I8.a
    public void c(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.c.j(str) && com.google.firebase.analytics.connector.internal.c.e(str2, bundle) && com.google.firebase.analytics.connector.internal.c.h(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.c.d(str, str2, bundle);
            this.f6751a.e(str, str2, bundle);
        }
    }

    @Override // I8.a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.c.e(str2, bundle)) {
            this.f6751a.a(str, str2, bundle);
        }
    }

    @Override // I8.a
    public int d(String str) {
        return this.f6751a.c(str);
    }

    @Override // I8.a
    public List<a.c> e(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Bundle> it = this.f6751a.b(str, str2).iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.analytics.connector.internal.c.a(it.next()));
        }
        return arrayList;
    }

    @Override // I8.a
    public void f(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.c.j(str) && com.google.firebase.analytics.connector.internal.c.f(str, str2)) {
            this.f6751a.h(str, str2, obj);
        }
    }

    @Override // I8.a
    public a.InterfaceC0136a g(String str, a.b bVar) {
        C3445p.k(bVar);
        if (!com.google.firebase.analytics.connector.internal.c.j(str) || j(str)) {
            return null;
        }
        C4685a c4685a = this.f6751a;
        Object bVar2 = "fiam".equals(str) ? new com.google.firebase.analytics.connector.internal.b(c4685a, bVar) : "clx".equals(str) ? new com.google.firebase.analytics.connector.internal.d(c4685a, bVar) : null;
        if (bVar2 == null) {
            return null;
        }
        this.f6752b.put(str, bVar2);
        return new a(this, str);
    }
}
