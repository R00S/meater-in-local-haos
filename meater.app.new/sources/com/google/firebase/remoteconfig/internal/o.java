package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* compiled from: ConfigGetParameterHandler.java */
/* loaded from: classes2.dex */
public class o {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f38721e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    static final Pattern f38722f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g, reason: collision with root package name */
    static final Pattern f38723g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a, reason: collision with root package name */
    private final Set<com.google.android.gms.common.util.d<String, g>> f38724a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Executor f38725b;

    /* renamed from: c, reason: collision with root package name */
    private final f f38726c;

    /* renamed from: d, reason: collision with root package name */
    private final f f38727d;

    public o(Executor executor, f fVar, f fVar2) {
        this.f38725b = executor;
        this.f38726c = fVar;
        this.f38727d = fVar2;
    }

    private void c(final String str, final g gVar) {
        if (gVar == null) {
            return;
        }
        synchronized (this.f38724a) {
            try {
                for (final com.google.android.gms.common.util.d<String, g> dVar : this.f38724a) {
                    this.f38725b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            dVar.a(str, gVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static g e(f fVar) {
        return fVar.f();
    }

    private static Set<String> f(f fVar) {
        HashSet hashSet = new HashSet();
        g gVarE = e(fVar);
        if (gVarE == null) {
            return hashSet;
        }
        Iterator<String> itKeys = gVarE.g().keys();
        while (itKeys.hasNext()) {
            hashSet.add(itKeys.next());
        }
        return hashSet;
    }

    private static String g(f fVar, String str) {
        g gVarE = e(fVar);
        if (gVarE == null) {
            return null;
        }
        try {
            return gVarE.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void j(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(com.google.android.gms.common.util.d<String, g> dVar) {
        synchronized (this.f38724a) {
            this.f38724a.add(dVar);
        }
    }

    public Map<String, E9.j> d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(f(this.f38726c));
        hashSet.addAll(f(this.f38727d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            map.put(str, h(str));
        }
        return map;
    }

    public E9.j h(String str) {
        String strG = g(this.f38726c, str);
        if (strG != null) {
            c(str, e(this.f38726c));
            return new w(strG, 2);
        }
        String strG2 = g(this.f38727d, str);
        if (strG2 != null) {
            return new w(strG2, 1);
        }
        j(str, "FirebaseRemoteConfigValue");
        return new w("", 0);
    }
}
