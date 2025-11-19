package com.google.firebase.remoteconfig;

import E9.h;
import E9.j;
import F9.e;
import L8.i;
import android.content.Context;
import android.util.Log;
import com.google.firebase.abt.AbtException;
import com.google.firebase.f;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import k9.InterfaceC3810e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z7.AbstractC5208j;
import z7.C5211m;
import z7.InterfaceC5201c;
import z7.InterfaceC5207i;

/* compiled from: FirebaseRemoteConfig.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f38609n = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final Context f38610a;

    /* renamed from: b, reason: collision with root package name */
    private final f f38611b;

    /* renamed from: c, reason: collision with root package name */
    private final G8.b f38612c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f38613d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f38614e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f38615f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f38616g;

    /* renamed from: h, reason: collision with root package name */
    private final m f38617h;

    /* renamed from: i, reason: collision with root package name */
    private final o f38618i;

    /* renamed from: j, reason: collision with root package name */
    private final t f38619j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3810e f38620k;

    /* renamed from: l, reason: collision with root package name */
    private final p f38621l;

    /* renamed from: m, reason: collision with root package name */
    private final e f38622m;

    a(Context context, f fVar, InterfaceC3810e interfaceC3810e, G8.b bVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, m mVar, o oVar, t tVar, p pVar, e eVar) {
        this.f38610a = context;
        this.f38611b = fVar;
        this.f38620k = interfaceC3810e;
        this.f38612c = bVar;
        this.f38613d = executor;
        this.f38614e = fVar2;
        this.f38615f = fVar3;
        this.f38616g = fVar4;
        this.f38617h = mVar;
        this.f38618i = oVar;
        this.f38619j = tVar;
        this.f38621l = pVar;
        this.f38622m = eVar;
    }

    private static boolean k(g gVar, g gVar2) {
        return gVar2 == null || !gVar.h().equals(gVar2.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC5208j l(AbstractC5208j abstractC5208j, AbstractC5208j abstractC5208j2, AbstractC5208j abstractC5208j3) {
        if (!abstractC5208j.o() || abstractC5208j.k() == null) {
            return C5211m.e(Boolean.FALSE);
        }
        g gVar = (g) abstractC5208j.k();
        return (!abstractC5208j2.o() || k(gVar, (g) abstractC5208j2.k())) ? this.f38615f.k(gVar).h(this.f38613d, new InterfaceC5201c() { // from class: E9.g
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j4) {
                return Boolean.valueOf(this.f4144a.o(abstractC5208j4));
            }
        }) : C5211m.e(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC5208j m(m.a aVar) {
        return C5211m.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC5208j n(Void r12) {
        return e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(AbstractC5208j<g> abstractC5208j) {
        if (!abstractC5208j.o()) {
            return false;
        }
        this.f38614e.d();
        g gVarK = abstractC5208j.k();
        if (gVarK == null) {
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        s(gVarK.e());
        this.f38622m.g(gVarK);
        return true;
    }

    static List<Map<String, String>> r(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public AbstractC5208j<Boolean> e() {
        final AbstractC5208j<g> abstractC5208jE = this.f38614e.e();
        final AbstractC5208j<g> abstractC5208jE2 = this.f38615f.e();
        return C5211m.j(abstractC5208jE, abstractC5208jE2).i(this.f38613d, new InterfaceC5201c() { // from class: E9.e
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j) {
                return this.f4141a.l(abstractC5208jE, abstractC5208jE2, abstractC5208j);
            }
        });
    }

    public AbstractC5208j<Void> f() {
        return this.f38617h.i().p(i.a(), new InterfaceC5207i() { // from class: E9.f
            @Override // z7.InterfaceC5207i
            public final AbstractC5208j a(Object obj) {
                return com.google.firebase.remoteconfig.a.m((m.a) obj);
            }
        });
    }

    public AbstractC5208j<Boolean> g() {
        return f().p(this.f38613d, new InterfaceC5207i() { // from class: E9.d
            @Override // z7.InterfaceC5207i
            public final AbstractC5208j a(Object obj) {
                return this.f4140a.n((Void) obj);
            }
        });
    }

    public Map<String, j> h() {
        return this.f38618i.d();
    }

    public h i() {
        return this.f38619j.d();
    }

    e j() {
        return this.f38622m;
    }

    void p(boolean z10) {
        this.f38621l.b(z10);
    }

    void q() {
        this.f38615f.e();
        this.f38616g.e();
        this.f38614e.e();
    }

    void s(JSONArray jSONArray) {
        if (this.f38612c == null) {
            return;
        }
        try {
            this.f38612c.m(r(jSONArray));
        } catch (AbtException e10) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
        } catch (JSONException e11) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
        }
    }
}
