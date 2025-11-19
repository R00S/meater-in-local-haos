package Y8;

import Q8.C1622j;
import Q8.F;
import Q8.G;
import Q8.H;
import Q8.L;
import Q8.g0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import z7.AbstractC5208j;
import z7.C5209k;
import z7.C5211m;
import z7.InterfaceC5207i;

/* compiled from: SettingsController.java */
/* loaded from: classes2.dex */
public class g implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19480a;

    /* renamed from: b, reason: collision with root package name */
    private final k f19481b;

    /* renamed from: c, reason: collision with root package name */
    private final h f19482c;

    /* renamed from: d, reason: collision with root package name */
    private final F f19483d;

    /* renamed from: e, reason: collision with root package name */
    private final Y8.a f19484e;

    /* renamed from: f, reason: collision with root package name */
    private final l f19485f;

    /* renamed from: g, reason: collision with root package name */
    private final G f19486g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<d> f19487h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<C5209k<d>> f19488i;

    /* compiled from: SettingsController.java */
    class a implements InterfaceC5207i<Void, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R8.f f19489a;

        a(R8.f fVar) {
            this.f19489a = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ JSONObject c() {
            return g.this.f19485f.a(g.this.f19481b, true);
        }

        @Override // z7.InterfaceC5207i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public AbstractC5208j<Void> a(Void r52) throws Throwable {
            JSONObject jSONObject = (JSONObject) this.f19489a.network.d().submit(new Callable() { // from class: Y8.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f19479a.c();
                }
            }).get();
            if (jSONObject != null) {
                d dVarB = g.this.f19482c.b(jSONObject);
                g.this.f19484e.c(dVarB.f19464c, jSONObject);
                g.this.q(jSONObject, "Loaded settings: ");
                g gVar = g.this;
                gVar.r(gVar.f19481b.f19497f);
                g.this.f19487h.set(dVarB);
                ((C5209k) g.this.f19488i.get()).e(dVarB);
            }
            return C5211m.e(null);
        }
    }

    g(Context context, k kVar, F f10, h hVar, Y8.a aVar, l lVar, G g10) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f19487h = atomicReference;
        this.f19488i = new AtomicReference<>(new C5209k());
        this.f19480a = context;
        this.f19481b = kVar;
        this.f19483d = f10;
        this.f19482c = hVar;
        this.f19484e = aVar;
        this.f19485f = lVar;
        this.f19486g = g10;
        atomicReference.set(b.b(f10));
    }

    public static g l(Context context, String str, L l10, V8.b bVar, String str2, String str3, W8.g gVar, G g10) {
        String strG = l10.g();
        g0 g0Var = new g0();
        return new g(context, new k(str, l10.h(), l10.i(), l10.j(), l10, C1622j.h(C1622j.m(context), str, str3, str2), str3, str2, H.j(strG).n()), g0Var, new h(g0Var), new Y8.a(gVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), g10);
    }

    private d m(e eVar) throws Throwable {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject jSONObjectB = this.f19484e.b();
                if (jSONObjectB != null) {
                    d dVarB = this.f19482c.b(jSONObjectB);
                    if (dVarB != null) {
                        q(jSONObjectB, "Loaded cached settings: ");
                        long jA = this.f19483d.a();
                        if (e.IGNORE_CACHE_EXPIRATION.equals(eVar) || !dVarB.a(jA)) {
                            try {
                                N8.g.f().i("Returning cached settings.");
                                dVar = dVarB;
                            } catch (Exception e10) {
                                e = e10;
                                dVar = dVarB;
                                N8.g.f().e("Failed to get cached settings", e);
                                return dVar;
                            }
                        } else {
                            N8.g.f().i("Cached settings have expired.");
                        }
                    } else {
                        N8.g.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    N8.g.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return dVar;
    }

    private String n() {
        return C1622j.q(this.f19480a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        N8.g.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor editorEdit = C1622j.q(this.f19480a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // Y8.j
    public AbstractC5208j<d> a() {
        return this.f19488i.get().a();
    }

    @Override // Y8.j
    public d b() {
        return this.f19487h.get();
    }

    boolean k() {
        return !n().equals(this.f19481b.f19497f);
    }

    public AbstractC5208j<Void> o(R8.f fVar) {
        return p(e.USE_CACHE, fVar);
    }

    public AbstractC5208j<Void> p(e eVar, R8.f fVar) throws Throwable {
        d dVarM;
        if (!k() && (dVarM = m(eVar)) != null) {
            this.f19487h.set(dVarM);
            this.f19488i.get().e(dVarM);
            return C5211m.e(null);
        }
        d dVarM2 = m(e.IGNORE_CACHE_EXPIRATION);
        if (dVarM2 != null) {
            this.f19487h.set(dVarM2);
            this.f19488i.get().e(dVarM2);
        }
        return this.f19486g.k().p(fVar.common, new a(fVar));
    }
}
