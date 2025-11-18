package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzbde {

    /* renamed from: a */
    public final boolean f22840a;

    /* renamed from: b */
    public final int f22841b;

    /* renamed from: c */
    public final int f22842c;

    /* renamed from: d */
    public final int f22843d;

    /* renamed from: e */
    public final String f22844e;

    /* renamed from: f */
    public final int f22845f;

    /* renamed from: g */
    public final int f22846g;

    /* renamed from: h */
    public final int f22847h;

    /* renamed from: i */
    public final int f22848i;

    /* renamed from: j */
    public final boolean f22849j;

    public zzbde(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f22840a = m17479a(jSONObject, "aggressive_media_codec_release", zzacu.f21682P);
        this.f22841b = m17481c(jSONObject, "byte_buffer_precache_limit", zzacu.f21898y);
        this.f22842c = m17481c(jSONObject, "exo_cache_buffer_size", zzacu.f21610D);
        this.f22843d = m17481c(jSONObject, "exo_connect_timeout_millis", zzacu.f21874u);
        this.f22844e = m17482d(jSONObject, "exo_player_version", zzacu.f21868t);
        this.f22845f = m17481c(jSONObject, "exo_read_timeout_millis", zzacu.f21880v);
        this.f22846g = m17481c(jSONObject, "load_check_interval_bytes", zzacu.f21886w);
        this.f22847h = m17481c(jSONObject, "player_precache_limit", zzacu.f21892x);
        this.f22848i = m17481c(jSONObject, "socket_receive_buffer_size", zzacu.f21904z);
        this.f22849j = m17479a(jSONObject, "use_cache_data_source", zzacu.f21902y3);
    }

    /* renamed from: a */
    private static boolean m17479a(JSONObject jSONObject, String str, zzacj<Boolean> zzacjVar) {
        return m17480b(jSONObject, str, ((Boolean) zzyt.m20848e().m16421c(zzacjVar)).booleanValue());
    }

    /* renamed from: b */
    private static boolean m17480b(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    /* renamed from: c */
    private static int m17481c(JSONObject jSONObject, String str, zzacj<Integer> zzacjVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzyt.m20848e().m16421c(zzacjVar)).intValue();
    }

    /* renamed from: d */
    private static String m17482d(JSONObject jSONObject, String str, zzacj<String> zzacjVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) zzyt.m20848e().m16421c(zzacjVar);
    }
}
