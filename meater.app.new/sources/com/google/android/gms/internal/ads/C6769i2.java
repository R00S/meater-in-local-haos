package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.i2 */
/* loaded from: classes2.dex */
final class C6769i2 implements zzahw {

    /* renamed from: a */
    private final zzakw f19281a;

    /* renamed from: b */
    private final zzbbr f19282b;

    /* renamed from: c */
    private final /* synthetic */ zzalu f19283c;

    public C6769i2(zzalu zzaluVar, zzakw zzakwVar, zzbbr zzbbrVar) {
        this.f19283c = zzaluVar;
        this.f19281a = zzakwVar;
        this.f19282b = zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    /* renamed from: a */
    public final void mo15332a(JSONObject jSONObject) {
        try {
            try {
                this.f19282b.m17385a(this.f19283c.f22112a.mo14955a(jSONObject));
                this.f19281a.m16643f();
            } catch (IllegalStateException unused) {
                this.f19281a.m16643f();
            } catch (JSONException e2) {
                this.f19282b.m17385a(e2);
                this.f19281a.m16643f();
            }
        } catch (Throwable th) {
            this.f19281a.m16643f();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final void onFailure(String str) {
        try {
            if (str == null) {
                this.f19282b.m17386c(new zzali());
            } else {
                this.f19282b.m17386c(new zzali(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.f19281a.m16643f();
        }
    }
}
