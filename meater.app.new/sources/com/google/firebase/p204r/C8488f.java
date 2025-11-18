package com.google.firebase.p204r;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.C0276e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8405j;
import com.google.firebase.components.C8111b0;
import com.google.firebase.components.C8124n;
import com.google.firebase.components.C8132v;
import com.google.firebase.components.InterfaceC8126p;
import com.google.firebase.components.InterfaceC8128r;
import com.google.firebase.p200o.p201a.InterfaceC8474a;
import com.google.firebase.p204r.InterfaceC8492j;
import com.google.firebase.p205s.InterfaceC8496b;
import com.google.firebase.p209u.InterfaceC8556i;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DefaultHeartBeatController.java */
/* renamed from: com.google.firebase.r.f */
/* loaded from: classes2.dex */
public class C8488f implements InterfaceC8491i, InterfaceC8492j {

    /* renamed from: a */
    private final InterfaceC8496b<C8493k> f32104a;

    /* renamed from: b */
    private final Context f32105b;

    /* renamed from: c */
    private final InterfaceC8496b<InterfaceC8556i> f32106c;

    /* renamed from: d */
    private final Set<InterfaceC8489g> f32107d;

    /* renamed from: e */
    private final Executor f32108e;

    private C8488f(final Context context, final String str, Set<InterfaceC8489g> set, InterfaceC8496b<InterfaceC8556i> interfaceC8496b, Executor executor) {
        this((InterfaceC8496b<C8493k>) new InterfaceC8496b() { // from class: com.google.firebase.r.c
            @Override // com.google.firebase.p205s.InterfaceC8496b
            public final Object get() {
                return C8488f.m26685g(context, str);
            }
        }, set, executor, interfaceC8496b, context);
    }

    /* renamed from: c */
    public static C8124n<C8488f> m26682c() {
        final C8111b0 c8111b0M24971a = C8111b0.m24971a(InterfaceC8474a.class, Executor.class);
        return C8124n.m24987d(C8488f.class, InterfaceC8491i.class, InterfaceC8492j.class).m25006b(C8132v.m25060k(Context.class)).m25006b(C8132v.m25060k(C8405j.class)).m25006b(C8132v.m25063n(InterfaceC8489g.class)).m25006b(C8132v.m25062m(InterfaceC8556i.class)).m25006b(C8132v.m25059j(c8111b0M24971a)).m25010f(new InterfaceC8128r() { // from class: com.google.firebase.r.d
            @Override // com.google.firebase.components.InterfaceC8128r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8126p interfaceC8126p) {
                return C8488f.m26683d(c8111b0M24971a, interfaceC8126p);
            }
        }).m25008d();
    }

    /* renamed from: d */
    static /* synthetic */ C8488f m26683d(C8111b0 c8111b0, InterfaceC8126p interfaceC8126p) {
        return new C8488f((Context) interfaceC8126p.mo24973a(Context.class), ((C8405j) interfaceC8126p.mo24973a(C8405j.class)).m26407m(), (Set<InterfaceC8489g>) interfaceC8126p.mo24979g(InterfaceC8489g.class), (InterfaceC8496b<InterfaceC8556i>) interfaceC8126p.mo24975c(InterfaceC8556i.class), (Executor) interfaceC8126p.mo24978f(c8111b0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ String m26689f() throws Exception {
        String string;
        synchronized (this) {
            C8493k c8493k = this.f32104a.get();
            List<AbstractC8494l> listM26700c = c8493k.m26700c();
            c8493k.m26699b();
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < listM26700c.size(); i2++) {
                AbstractC8494l abstractC8494l = listM26700c.get(i2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", abstractC8494l.mo26681c());
                jSONObject.put("dates", new JSONArray((Collection) abstractC8494l.mo26680b()));
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
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    base64OutputStream.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        }
        return string;
    }

    /* renamed from: g */
    static /* synthetic */ C8493k m26685g(Context context, String str) {
        return new C8493k(context, str);
    }

    /* renamed from: h */
    private /* synthetic */ Void m26686h() throws Exception {
        synchronized (this) {
            this.f32104a.get().m26705k(System.currentTimeMillis(), this.f32106c.get().mo26898a());
        }
        return null;
    }

    @Override // com.google.firebase.p204r.InterfaceC8491i
    /* renamed from: a */
    public Task<String> mo26687a() {
        return C0276e.m1842a(this.f32105b) ^ true ? Tasks.m23663e(HttpUrl.FRAGMENT_ENCODE_SET) : Tasks.m23661c(this.f32108e, new Callable() { // from class: com.google.firebase.r.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f32098f.m26689f();
            }
        });
    }

    @Override // com.google.firebase.p204r.InterfaceC8492j
    /* renamed from: b */
    public synchronized InterfaceC8492j.a mo26688b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C8493k c8493k = this.f32104a.get();
        if (!c8493k.m26703i(jCurrentTimeMillis)) {
            return InterfaceC8492j.a.NONE;
        }
        c8493k.m26702g();
        return InterfaceC8492j.a.GLOBAL;
    }

    /* renamed from: i */
    public /* synthetic */ Void m26690i() throws Exception {
        m26686h();
        return null;
    }

    /* renamed from: j */
    public Task<Void> m26691j() {
        return this.f32107d.size() <= 0 ? Tasks.m23663e(null) : C0276e.m1842a(this.f32105b) ^ true ? Tasks.m23663e(null) : Tasks.m23661c(this.f32108e, new Callable() { // from class: com.google.firebase.r.a
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f32097f.m26690i();
                return null;
            }
        });
    }

    C8488f(InterfaceC8496b<C8493k> interfaceC8496b, Set<InterfaceC8489g> set, Executor executor, InterfaceC8496b<InterfaceC8556i> interfaceC8496b2, Context context) {
        this.f32104a = interfaceC8496b;
        this.f32107d = set;
        this.f32108e = executor;
        this.f32106c = interfaceC8496b2;
        this.f32105b = context;
    }
}
