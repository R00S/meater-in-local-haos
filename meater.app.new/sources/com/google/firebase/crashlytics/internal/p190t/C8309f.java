package com.google.firebase.crashlytics.internal.p190t;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p183n.C8201e0;
import com.google.firebase.crashlytics.internal.p183n.C8209i0;
import com.google.firebase.crashlytics.internal.p183n.C8223p0;
import com.google.firebase.crashlytics.internal.p183n.C8228t;
import com.google.firebase.crashlytics.internal.p183n.EnumC8203f0;
import com.google.firebase.crashlytics.internal.p183n.InterfaceC8199d0;
import com.google.firebase.crashlytics.internal.p187q.C8291b;
import com.google.firebase.crashlytics.internal.p188r.C8298f;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsController.java */
/* renamed from: com.google.firebase.crashlytics.h.t.f */
/* loaded from: classes2.dex */
public class C8309f implements InterfaceC8312i {

    /* renamed from: a */
    private final Context f31611a;

    /* renamed from: b */
    private final C8313j f31612b;

    /* renamed from: c */
    private final C8310g f31613c;

    /* renamed from: d */
    private final InterfaceC8199d0 f31614d;

    /* renamed from: e */
    private final C8304a f31615e;

    /* renamed from: f */
    private final InterfaceC8314k f31616f;

    /* renamed from: g */
    private final C8201e0 f31617g;

    /* renamed from: h */
    private final AtomicReference<C8307d> f31618h;

    /* renamed from: i */
    private final AtomicReference<TaskCompletionSource<C8307d>> f31619i;

    /* compiled from: SettingsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.t.f$a */
    class a implements SuccessContinuation<Void, Void> {
        a() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task<Void> mo13778a(Void r5) throws Exception {
            JSONObject jSONObjectMo26041a = C8309f.this.f31616f.mo26041a(C8309f.this.f31612b, true);
            if (jSONObjectMo26041a != null) {
                C8307d c8307dM26066b = C8309f.this.f31613c.m26066b(jSONObjectMo26041a);
                C8309f.this.f31615e.m26034c(c8307dM26066b.f31596c, jSONObjectMo26041a);
                C8309f.this.m26057q(jSONObjectMo26041a, "Loaded settings: ");
                C8309f c8309f = C8309f.this;
                c8309f.m26058r(c8309f.f31612b.f31627f);
                C8309f.this.f31618h.set(c8307dM26066b);
                ((TaskCompletionSource) C8309f.this.f31619i.get()).m23658e(c8307dM26066b);
            }
            return Tasks.m23663e(null);
        }
    }

    C8309f(Context context, C8313j c8313j, InterfaceC8199d0 interfaceC8199d0, C8310g c8310g, C8304a c8304a, InterfaceC8314k interfaceC8314k, C8201e0 c8201e0) {
        AtomicReference<C8307d> atomicReference = new AtomicReference<>();
        this.f31618h = atomicReference;
        this.f31619i = new AtomicReference<>(new TaskCompletionSource());
        this.f31611a = context;
        this.f31612b = c8313j;
        this.f31614d = interfaceC8199d0;
        this.f31613c = c8310g;
        this.f31615e = c8304a;
        this.f31616f = interfaceC8314k;
        this.f31617g = c8201e0;
        atomicReference.set(C8305b.m26035b(interfaceC8199d0));
    }

    /* renamed from: l */
    public static C8309f m26054l(Context context, String str, C8209i0 c8209i0, C8291b c8291b, String str2, String str3, C8298f c8298f, C8201e0 c8201e0) {
        String strM25264g = c8209i0.m25264g();
        C8223p0 c8223p0 = new C8223p0();
        return new C8309f(context, new C8313j(str, c8209i0.m25265h(), c8209i0.m25266i(), c8209i0.m25267j(), c8209i0, C8228t.m25337h(C8228t.m25342m(context), str, str3, str2), str3, str2, EnumC8203f0.m25242g(strM25264g).m25243k()), c8223p0, new C8310g(c8223p0), new C8304a(c8298f), new C8306c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), c8291b), c8201e0);
    }

    /* renamed from: m */
    private C8307d m26055m(EnumC8308e enumC8308e) throws Throwable {
        C8307d c8307d = null;
        try {
            if (!EnumC8308e.SKIP_CACHE_LOOKUP.equals(enumC8308e)) {
                JSONObject jSONObjectM26033b = this.f31615e.m26033b();
                if (jSONObjectM26033b != null) {
                    C8307d c8307dM26066b = this.f31613c.m26066b(jSONObjectM26033b);
                    if (c8307dM26066b != null) {
                        m26057q(jSONObjectM26033b, "Loaded cached settings: ");
                        long jMo25232a = this.f31614d.mo25232a();
                        if (EnumC8308e.IGNORE_CACHE_EXPIRATION.equals(enumC8308e) || !c8307dM26066b.m26045a(jMo25232a)) {
                            try {
                                C8179h.m25176f().m25183i("Returning cached settings.");
                                c8307d = c8307dM26066b;
                            } catch (Exception e2) {
                                e = e2;
                                c8307d = c8307dM26066b;
                                C8179h.m25176f().m25180e("Failed to get cached settings", e);
                                return c8307d;
                            }
                        } else {
                            C8179h.m25176f().m25183i("Cached settings have expired.");
                        }
                    } else {
                        C8179h.m25176f().m25180e("Failed to parse cached settings data.", null);
                    }
                } else {
                    C8179h.m25176f().m25177b("No cached settings data found.");
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
        return c8307d;
    }

    /* renamed from: n */
    private String m26056n() {
        return C8228t.m25346q(this.f31611a).getString("existing_instance_identifier", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m26057q(JSONObject jSONObject, String str) throws JSONException {
        C8179h.m25176f().m25177b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: r */
    public boolean m26058r(String str) {
        SharedPreferences.Editor editorEdit = C8228t.m25346q(this.f31611a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.p190t.InterfaceC8312i
    /* renamed from: a */
    public Task<C8307d> mo26059a() {
        return this.f31619i.get().m23654a();
    }

    @Override // com.google.firebase.crashlytics.internal.p190t.InterfaceC8312i
    /* renamed from: b */
    public C8307d mo26060b() {
        return this.f31618h.get();
    }

    /* renamed from: k */
    boolean m26061k() {
        return !m26056n().equals(this.f31612b.f31627f);
    }

    /* renamed from: o */
    public Task<Void> m26062o(EnumC8308e enumC8308e, Executor executor) throws Throwable {
        C8307d c8307dM26055m;
        if (!m26061k() && (c8307dM26055m = m26055m(enumC8308e)) != null) {
            this.f31618h.set(c8307dM26055m);
            this.f31619i.get().m23658e(c8307dM26055m);
            return Tasks.m23663e(null);
        }
        C8307d c8307dM26055m2 = m26055m(EnumC8308e.IGNORE_CACHE_EXPIRATION);
        if (c8307dM26055m2 != null) {
            this.f31618h.set(c8307dM26055m2);
            this.f31619i.get().m23658e(c8307dM26055m2);
        }
        return this.f31617g.m25241i(executor).mo23653p(executor, new a());
    }

    /* renamed from: p */
    public Task<Void> m26063p(Executor executor) {
        return m26062o(EnumC8308e.USE_CACHE, executor);
    }
}
