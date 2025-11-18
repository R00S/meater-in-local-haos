package com.facebook.p157o0.p158k0;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10547v;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MetadataRule.kt */
/* renamed from: com.facebook.o0.k0.e */
/* loaded from: classes.dex */
public final class C5837e {

    /* renamed from: a */
    public static final a f14982a = new a(null);

    /* renamed from: b */
    private static final Set<C5837e> f14983b = new CopyOnWriteArraySet();

    /* renamed from: c */
    private final String f14984c;

    /* renamed from: d */
    private final String f14985d;

    /* renamed from: e */
    private final List<String> f14986e;

    /* compiled from: MetadataRule.kt */
    /* renamed from: com.facebook.o0.k0.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        private final void m12286a(JSONObject jSONObject) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("k");
                    String strOptString2 = jSONObjectOptJSONObject.optString("v");
                    C9801m.m32345e(strOptString, "k");
                    if (!(strOptString.length() == 0)) {
                        Set set = C5837e.f14983b;
                        C9801m.m32345e(next, RoomNotification.KEY);
                        List listM37582v0 = C10547v.m37582v0(strOptString, new String[]{","}, false, 0, 6, null);
                        C9801m.m32345e(strOptString2, "v");
                        set.add(new C5837e(next, listM37582v0, strOptString2, null));
                    }
                }
            }
        }

        /* renamed from: b */
        public final Set<String> m12287b() {
            HashSet hashSet = new HashSet();
            Iterator it = C5837e.f14983b.iterator();
            while (it.hasNext()) {
                hashSet.add(((C5837e) it.next()).m12284c());
            }
            return hashSet;
        }

        /* renamed from: c */
        public final Set<C5837e> m12288c() {
            return new HashSet(C5837e.f14983b);
        }

        /* renamed from: d */
        public final void m12289d(String str) {
            C9801m.m32346f(str, "rulesFromServer");
            try {
                C5837e.f14983b.clear();
                m12286a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
    }

    private C5837e(String str, List<String> list, String str2) {
        this.f14984c = str;
        this.f14985d = str2;
        this.f14986e = list;
    }

    public /* synthetic */ C5837e(String str, List list, String str2, C9789g c9789g) {
        this(str, list, str2);
    }

    /* renamed from: b */
    public final List<String> m12283b() {
        return new ArrayList(this.f14986e);
    }

    /* renamed from: c */
    public final String m12284c() {
        return this.f14984c;
    }

    /* renamed from: d */
    public final String m12285d() {
        return this.f14985d;
    }
}
