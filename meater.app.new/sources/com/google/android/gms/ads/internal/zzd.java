package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzawl;
import com.google.android.gms.internal.ads.zzbai;
import org.json.JSONException;

@zzard
/* loaded from: classes2.dex */
public final class zzd {
    private long zzbqy = 0;
    private Context zzlj;

    public final void zza(Context context, zzbai zzbaiVar, String str, Runnable runnable) throws JSONException {
        zza(context, zzbaiVar, true, null, str, null, runnable);
    }

    public final void zza(Context context, zzbai zzbaiVar, String str, zzawl zzawlVar) throws JSONException {
        zza(context, zzbaiVar, false, zzawlVar, zzawlVar != null ? zzawlVar.m17041d() : null, str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zza(android.content.Context r8, com.google.android.gms.internal.ads.zzbai r9, boolean r10, com.google.android.gms.internal.ads.zzawl r11, java.lang.String r12, java.lang.String r13, java.lang.Runnable r14) throws org.json.JSONException {
        /*
            r7 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzk.zzln()
            long r0 = r0.mo14609b()
            long r2 = r7.zzbqy
            long r0 = r0 - r2
            r2 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L17
            java.lang.String r8 = "Not retrying to fetch app settings"
            com.google.android.gms.internal.ads.zzbad.m17353i(r8)
            return
        L17:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzk.zzln()
            long r0 = r0.mo14609b()
            r7.zzbqy = r0
            r0 = 0
            r1 = 1
            if (r11 != 0) goto L27
        L25:
            r0 = 1
            goto L54
        L27:
            long r2 = r11.m17038a()
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzk.zzln()
            long r4 = r4.mo14608a()
            long r4 = r4 - r2
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r2 = com.google.android.gms.internal.ads.zzacu.f21787f3
            com.google.android.gms.internal.ads.zzacr r3 = com.google.android.gms.internal.ads.zzyt.m20848e()
            java.lang.Object r2 = r3.m16421c(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L4a
            r2 = 1
            goto L4b
        L4a:
            r2 = 0
        L4b:
            if (r2 != 0) goto L25
            boolean r11 = r11.m17039b()
            if (r11 != 0) goto L54
            goto L25
        L54:
            if (r0 != 0) goto L57
            return
        L57:
            if (r8 != 0) goto L5f
            java.lang.String r8 = "Context not provided to fetch application settings"
            com.google.android.gms.internal.ads.zzbad.m17353i(r8)
            return
        L5f:
            boolean r11 = android.text.TextUtils.isEmpty(r12)
            if (r11 == 0) goto L71
            boolean r11 = android.text.TextUtils.isEmpty(r13)
            if (r11 == 0) goto L71
            java.lang.String r8 = "App settings could not be fetched. Required parameters missing"
            com.google.android.gms.internal.ads.zzbad.m17353i(r8)
            return
        L71:
            android.content.Context r11 = r8.getApplicationContext()
            if (r11 == 0) goto L78
            goto L79
        L78:
            r11 = r8
        L79:
            r7.zzlj = r11
            com.google.android.gms.internal.ads.zzalk r11 = com.google.android.gms.ads.internal.zzk.zzlt()
            android.content.Context r0 = r7.zzlj
            com.google.android.gms.internal.ads.zzalr r9 = r11.m16656b(r0, r9)
            com.google.android.gms.internal.ads.zzaln<org.json.JSONObject> r11 = com.google.android.gms.internal.ads.zzalo.f22107b
            java.lang.String r0 = "google.afma.config.fetchAppSettings"
            com.google.android.gms.internal.ads.zzalj r9 = r9.m16658a(r0, r11, r11)
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lce
            r11.<init>()     // Catch: java.lang.Exception -> Lce
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> Lce
            if (r0 != 0) goto L9e
            java.lang.String r13 = "app_id"
            r11.put(r13, r12)     // Catch: java.lang.Exception -> Lce
            goto La9
        L9e:
            boolean r12 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> Lce
            if (r12 != 0) goto La9
            java.lang.String r12 = "ad_unit_id"
            r11.put(r12, r13)     // Catch: java.lang.Exception -> Lce
        La9:
            java.lang.String r12 = "is_init"
            r11.put(r12, r10)     // Catch: java.lang.Exception -> Lce
            java.lang.String r10 = "pn"
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Exception -> Lce
            r11.put(r10, r8)     // Catch: java.lang.Exception -> Lce
            com.google.android.gms.internal.ads.zzbbh r8 = r9.mo16653a(r11)     // Catch: java.lang.Exception -> Lce
            com.google.android.gms.internal.ads.zzbal r9 = com.google.android.gms.ads.internal.zze.zzbqz     // Catch: java.lang.Exception -> Lce
            java.util.concurrent.Executor r10 = com.google.android.gms.internal.ads.zzbbm.f22758b     // Catch: java.lang.Exception -> Lce
            com.google.android.gms.internal.ads.zzbbh r9 = com.google.android.gms.internal.ads.zzbar.m17366c(r8, r9, r10)     // Catch: java.lang.Exception -> Lce
            if (r14 == 0) goto Lc8
            r8.mo14748k(r14, r10)     // Catch: java.lang.Exception -> Lce
        Lc8:
            java.lang.String r8 = "ConfigLoader.maybeFetchNewAppSettings"
            com.google.android.gms.internal.ads.zzbao.m17362a(r9, r8)     // Catch: java.lang.Exception -> Lce
            return
        Lce:
            r8 = move-exception
            java.lang.String r9 = "Error requesting application settings"
            com.google.android.gms.internal.ads.zzbad.m17347c(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzd.zza(android.content.Context, com.google.android.gms.internal.ads.zzbai, boolean, com.google.android.gms.internal.ads.zzawl, java.lang.String, java.lang.String, java.lang.Runnable):void");
    }
}
