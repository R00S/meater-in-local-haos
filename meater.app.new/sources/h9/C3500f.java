package h9;

import K8.A;
import K8.q;
import android.content.Context;
import android.util.Base64OutputStream;
import h9.j;
import j9.InterfaceC3755b;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import n1.p;
import org.json.JSONArray;
import org.json.JSONObject;
import z7.AbstractC5208j;
import z7.C5211m;

/* compiled from: DefaultHeartBeatController.java */
/* renamed from: h9.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3500f implements i, j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3755b<k> f42357a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f42358b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3755b<D9.i> f42359c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<g> f42360d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f42361e;

    private C3500f(final Context context, final String str, Set<g> set, InterfaceC3755b<D9.i> interfaceC3755b, Executor executor) {
        this((InterfaceC3755b<k>) new InterfaceC3755b() { // from class: h9.e
            @Override // j9.InterfaceC3755b
            public final Object get() {
                return C3500f.j(context, str);
            }
        }, set, executor, interfaceC3755b, context);
    }

    public static K8.c<C3500f> g() {
        final A a10 = A.a(J8.a.class, Executor.class);
        return K8.c.f(C3500f.class, i.class, j.class).b(q.l(Context.class)).b(q.l(com.google.firebase.f.class)).b(q.o(g.class)).b(q.n(D9.i.class)).b(q.k(a10)).f(new K8.g() { // from class: h9.d
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return C3500f.h(a10, dVar);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C3500f h(A a10, K8.d dVar) {
        return new C3500f((Context) dVar.a(Context.class), ((com.google.firebase.f) dVar.a(com.google.firebase.f.class)).o(), (Set<g>) dVar.e(g.class), (InterfaceC3755b<D9.i>) dVar.d(D9.i.class), (Executor) dVar.g(a10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() {
        String string;
        synchronized (this) {
            try {
                k kVar = this.f42357a.get();
                List<l> listC = kVar.c();
                kVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < listC.size(); i10++) {
                    l lVar = listC.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", lVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) lVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k j(Context context, String str) {
        return new k(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            this.f42357a.get().k(System.currentTimeMillis(), this.f42359c.get().a());
        }
        return null;
    }

    @Override // h9.i
    public AbstractC5208j<String> a() {
        return !p.a(this.f42358b) ? C5211m.e("") : C5211m.c(this.f42361e, new Callable() { // from class: h9.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f42353a.i();
            }
        });
    }

    @Override // h9.j
    public synchronized j.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        k kVar = this.f42357a.get();
        if (!kVar.i(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        kVar.g();
        return j.a.GLOBAL;
    }

    public AbstractC5208j<Void> l() {
        return this.f42360d.size() <= 0 ? C5211m.e(null) : !p.a(this.f42358b) ? C5211m.e(null) : C5211m.c(this.f42361e, new Callable() { // from class: h9.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f42352a.k();
            }
        });
    }

    C3500f(InterfaceC3755b<k> interfaceC3755b, Set<g> set, Executor executor, InterfaceC3755b<D9.i> interfaceC3755b2, Context context) {
        this.f42357a = interfaceC3755b;
        this.f42360d = set;
        this.f42361e = executor;
        this.f42359c = interfaceC3755b2;
        this.f42358b = context;
    }
}
