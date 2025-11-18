package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzauq implements zzavb {

    /* renamed from: a */
    private static List<Future<Void>> f22528a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static ScheduledExecutorService f22529b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    private final zzdsj f22530c;

    /* renamed from: d */
    private final LinkedHashMap<String, zzdsp> f22531d;

    /* renamed from: g */
    private final Context f22534g;

    /* renamed from: h */
    private final zzavd f22535h;

    /* renamed from: i */
    private boolean f22536i;

    /* renamed from: j */
    private final zzauy f22537j;

    /* renamed from: k */
    private final C6549c4 f22538k;

    /* renamed from: e */
    private final List<String> f22532e = new ArrayList();

    /* renamed from: f */
    private final List<String> f22533f = new ArrayList();

    /* renamed from: l */
    private final Object f22539l = new Object();

    /* renamed from: m */
    private HashSet<String> f22540m = new HashSet<>();

    /* renamed from: n */
    private boolean f22541n = false;

    /* renamed from: o */
    private boolean f22542o = false;

    /* renamed from: p */
    private boolean f22543p = false;

    public zzauq(Context context, zzbai zzbaiVar, zzauy zzauyVar, String str, zzavd zzavdVar) {
        Preconditions.m14373l(zzauyVar, "SafeBrowsing config is not present.");
        this.f22534g = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f22531d = new LinkedHashMap<>();
        this.f22535h = zzavdVar;
        this.f22537j = zzauyVar;
        Iterator<String> it = zzauyVar.f22549j.iterator();
        while (it.hasNext()) {
            this.f22540m.add(it.next().toLowerCase(Locale.ENGLISH));
        }
        this.f22540m.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzdsj zzdsjVar = new zzdsj();
        zzdsjVar.f25896c = 8;
        zzdsjVar.f25898e = str;
        zzdsjVar.f25899f = str;
        zzdsk zzdskVar = new zzdsk();
        zzdsjVar.f25901h = zzdskVar;
        zzdskVar.f25914c = this.f22537j.f22545f;
        zzdsq zzdsqVar = new zzdsq();
        zzdsqVar.f25936c = zzbaiVar.f22750f;
        zzdsqVar.f25938e = Boolean.valueOf(Wrappers.m14674a(this.f22534g).m14672f());
        long jM13825b = GoogleApiAvailabilityLight.m13823h().m13825b(this.f22534g);
        if (jM13825b > 0) {
            zzdsqVar.f25937d = Long.valueOf(jM13825b);
        }
        zzdsjVar.f25911r = zzdsqVar;
        this.f22530c = zzdsjVar;
        this.f22538k = new C6549c4(this.f22534g, this.f22537j.f22552m, this);
    }

    /* renamed from: m */
    private final zzdsp m16965m(String str) {
        zzdsp zzdspVar;
        synchronized (this.f22539l) {
            zzdspVar = this.f22531d.get(str);
        }
        return zzdspVar;
    }

    /* renamed from: n */
    static final /* synthetic */ Void m16966n(String str) {
        return null;
    }

    /* renamed from: p */
    private final zzbbh<Void> m16967p() {
        zzbbh<Void> zzbbhVarM17367d;
        boolean z = this.f22536i;
        if (!((z && this.f22537j.f22551l) || (this.f22543p && this.f22537j.f22550k) || (!z && this.f22537j.f22548i))) {
            return zzbar.m17378o(null);
        }
        synchronized (this.f22539l) {
            this.f22530c.f25902i = new zzdsp[this.f22531d.size()];
            this.f22531d.values().toArray(this.f22530c.f25902i);
            this.f22530c.f25912s = (String[]) this.f22532e.toArray(new String[0]);
            this.f22530c.f25913t = (String[]) this.f22533f.toArray(new String[0]);
            if (zzava.m16983a()) {
                zzdsj zzdsjVar = this.f22530c;
                String str = zzdsjVar.f25898e;
                String str2 = zzdsjVar.f25903j;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzdsp zzdspVar : this.f22530c.f25902i) {
                    sb2.append("    [");
                    sb2.append(zzdspVar.f25935l.length);
                    sb2.append("] ");
                    sb2.append(zzdspVar.f25928e);
                }
                zzava.m16984b(sb2.toString());
            }
            zzbbh<String> zzbbhVarM17257a = new zzayu(this.f22534g).m17257a(1, this.f22537j.f22546g, null, zzdrw.m19824b(this.f22530c));
            if (zzava.m16983a()) {
                zzbbhVarM17257a.mo14748k(new RunnableC6512b4(this), zzaxg.f22651a);
            }
            zzbbhVarM17367d = zzbar.m17367d(zzbbhVarM17257a, C7362y3.f21095a, zzbbm.f22758b);
        }
        return zzbbhVarM17367d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[Catch: all -> 0x00c6, TryCatch #0 {, blocks: (B:7:0x0007, B:8:0x0009, B:11:0x0013, B:12:0x0021, B:14:0x0023, B:17:0x004d, B:18:0x005a, B:20:0x0060, B:21:0x0066, B:23:0x006c, B:25:0x0075, B:27:0x007b, B:29:0x0084, B:32:0x0093, B:34:0x00ac, B:35:0x00b2, B:36:0x00bf, B:37:0x00c4), top: B:44:0x0007, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo16969a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f22539l
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L9
            r2 = 1
            r6.f22543p = r2     // Catch: java.lang.Throwable -> Lc6
        L9:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzdsp> r2 = r6.f22531d     // Catch: java.lang.Throwable -> Lc6
            boolean r2 = r2.containsKey(r7)     // Catch: java.lang.Throwable -> Lc6
            if (r2 == 0) goto L23
            if (r9 != r1) goto L21
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzdsp> r8 = r6.f22531d     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r7 = r8.get(r7)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzdsp r7 = (com.google.android.gms.internal.ads.zzdsp) r7     // Catch: java.lang.Throwable -> Lc6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lc6
            r7.f25934k = r8     // Catch: java.lang.Throwable -> Lc6
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc6
            return
        L23:
            com.google.android.gms.internal.ads.zzdsp r1 = new com.google.android.gms.internal.ads.zzdsp     // Catch: java.lang.Throwable -> Lc6
            r1.<init>()     // Catch: java.lang.Throwable -> Lc6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lc6
            r1.f25934k = r9     // Catch: java.lang.Throwable -> Lc6
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzdsp> r9 = r6.f22531d     // Catch: java.lang.Throwable -> Lc6
            int r9 = r9.size()     // Catch: java.lang.Throwable -> Lc6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lc6
            r1.f25927d = r9     // Catch: java.lang.Throwable -> Lc6
            r1.f25928e = r7     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzdsm r9 = new com.google.android.gms.internal.ads.zzdsm     // Catch: java.lang.Throwable -> Lc6
            r9.<init>()     // Catch: java.lang.Throwable -> Lc6
            r1.f25929f = r9     // Catch: java.lang.Throwable -> Lc6
            java.util.HashSet<java.lang.String> r9 = r6.f22540m     // Catch: java.lang.Throwable -> Lc6
            int r9 = r9.size()     // Catch: java.lang.Throwable -> Lc6
            if (r9 <= 0) goto Lbf
            if (r8 == 0) goto Lbf
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc6
            r9.<init>()     // Catch: java.lang.Throwable -> Lc6
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Lc6
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lc6
        L5a:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r2 == 0) goto Lb2
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> Lc6
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r3 = r2.getKey()     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            if (r3 == 0) goto L73
            java.lang.Object r3 = r2.getKey()     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            goto L75
        L73:
            java.lang.String r3 = ""
        L75:
            java.lang.Object r4 = r2.getValue()     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            if (r4 == 0) goto L82
            java.lang.Object r2 = r2.getValue()     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            goto L84
        L82:
            java.lang.String r2 = ""
        L84:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            java.util.HashSet<java.lang.String> r5 = r6.f22540m     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            boolean r4 = r5.contains(r4)     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            if (r4 != 0) goto L93
            goto L5a
        L93:
            com.google.android.gms.internal.ads.zzdsl r4 = new com.google.android.gms.internal.ads.zzdsl     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            r4.<init>()     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            r4.f25916d = r3     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            java.lang.String r3 = "UTF-8"
            byte[] r2 = r2.getBytes(r3)     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            r4.f25917e = r2     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            r9.add(r4)     // Catch: java.io.UnsupportedEncodingException -> Lac java.lang.Throwable -> Lc6
            goto L5a
        Lac:
            java.lang.String r2 = "Cannot convert string to bytes, skip header."
            com.google.android.gms.internal.ads.zzava.m16984b(r2)     // Catch: java.lang.Throwable -> Lc6
            goto L5a
        Lb2:
            int r8 = r9.size()     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzdsl[] r8 = new com.google.android.gms.internal.ads.zzdsl[r8]     // Catch: java.lang.Throwable -> Lc6
            r9.toArray(r8)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzdsm r9 = r1.f25929f     // Catch: java.lang.Throwable -> Lc6
            r9.f25919d = r8     // Catch: java.lang.Throwable -> Lc6
        Lbf:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzdsp> r8 = r6.f22531d     // Catch: java.lang.Throwable -> Lc6
            r8.put(r7, r1)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc6
            return
        Lc6:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc6
            goto Lca
        Lc9:
            throw r7
        Lca:
            goto Lc9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauq.mo16969a(java.lang.String, java.util.Map, int):void");
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: b */
    public final void mo16970b(String str) {
        synchronized (this.f22539l) {
            this.f22530c.f25903j = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: c */
    public final void mo16971c() {
        synchronized (this.f22539l) {
            zzbbh<Map<String, String>> zzbbhVarMo16980a = this.f22535h.mo16980a(this.f22534g, this.f22531d.keySet());
            zzbal zzbalVar = new zzbal(this) { // from class: com.google.android.gms.internal.ads.x3

                /* renamed from: a */
                private final zzauq f20934a;

                {
                    this.f20934a = this;
                }

                @Override // com.google.android.gms.internal.ads.zzbal
                public final zzbbh zzf(Object obj) {
                    return this.f20934a.m16979o((Map) obj);
                }
            };
            Executor executor = zzbbm.f22758b;
            zzbbh zzbbhVarM17366c = zzbar.m17366c(zzbbhVarMo16980a, zzbalVar, executor);
            zzbbh zzbbhVarM17365b = zzbar.m17365b(zzbbhVarM17366c, 10L, TimeUnit.SECONDS, f22529b);
            zzbar.m17369f(zzbbhVarM17366c, new C6475a4(this, zzbbhVarM17365b), executor);
            f22528a.add(zzbbhVarM17365b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: d */
    public final String[] mo16972d(String[] strArr) {
        return (String[]) this.f22538k.m14963a(strArr).toArray(new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: e */
    public final void mo16973e() {
        this.f22541n = true;
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: f */
    public final void mo16974f(View view) {
        if (this.f22537j.f22547h && !this.f22542o) {
            zzk.zzlg();
            Bitmap bitmapM17142a0 = zzaxi.m17142a0(view);
            if (bitmapM17142a0 == null) {
                zzava.m16984b("Failed to capture the webview bitmap.");
            } else {
                this.f22542o = true;
                zzaxi.m17134O(new RunnableC7399z3(this, bitmapM17142a0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: g */
    public final boolean mo16975g() {
        return PlatformVersion.m14642f() && this.f22537j.f22547h && !this.f22542o;
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    /* renamed from: h */
    public final zzauy mo16976h() {
        return this.f22537j;
    }

    /* renamed from: k */
    final void m16977k(String str) {
        synchronized (this.f22539l) {
            this.f22532e.add(str);
        }
    }

    /* renamed from: l */
    final void m16978l(String str) {
        synchronized (this.f22539l) {
            this.f22533f.add(str);
        }
    }

    /* renamed from: o */
    final /* synthetic */ zzbbh m16979o(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.f22539l) {
                            int length = jSONArrayOptJSONArray.length();
                            zzdsp zzdspVarM16965m = m16965m(str);
                            if (zzdspVarM16965m == null) {
                                String strValueOf = String.valueOf(str);
                                zzava.m16984b(strValueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(strValueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                zzdspVarM16965m.f25935l = new String[length];
                                for (int i2 = 0; i2 < length; i2++) {
                                    zzdspVarM16965m.f25935l[i2] = jSONArrayOptJSONArray.getJSONObject(i2).getString("threat_type");
                                }
                                this.f22536i = (length > 0) | this.f22536i;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21854q3)).booleanValue()) {
                    zzbad.m17346b("Failed to get SafeBrowsing metadata", e2);
                }
                return zzbar.m17375l(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f22536i) {
            synchronized (this.f22539l) {
                this.f22530c.f25896c = 9;
            }
        }
        return m16967p();
    }
}
