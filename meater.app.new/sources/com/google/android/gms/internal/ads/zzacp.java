package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzacp {

    /* renamed from: a */
    private final Collection<zzacj<?>> f21581a = new ArrayList();

    /* renamed from: b */
    private final Collection<zzacj<String>> f21582b = new ArrayList();

    /* renamed from: c */
    private final Collection<zzacj<String>> f21583c = new ArrayList();

    /* renamed from: a */
    public final void m16412a(SharedPreferences.Editor editor, int i2, JSONObject jSONObject) {
        for (zzacj<?> zzacjVar : this.f21581a) {
            if (zzacjVar.m16410b() == 1) {
                zzacjVar.mo15501k(editor, zzacjVar.mo15500j(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzbad.m17351g("Flag Json is null.");
        }
    }

    /* renamed from: b */
    public final void m16413b(zzacj zzacjVar) {
        this.f21581a.add(zzacjVar);
    }

    /* renamed from: c */
    public final void m16414c(zzacj<String> zzacjVar) {
        this.f21582b.add(zzacjVar);
    }

    /* renamed from: d */
    public final void m16415d(zzacj<String> zzacjVar) {
        this.f21583c.add(zzacjVar);
    }

    /* renamed from: e */
    public final List<String> m16416e() {
        ArrayList arrayList = new ArrayList();
        Iterator<zzacj<String>> it = this.f21582b.iterator();
        while (it.hasNext()) {
            String str = (String) zzyt.m20848e().m16421c(it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List<String> m16417f() {
        List<String> listM16416e = m16416e();
        Iterator<zzacj<String>> it = this.f21583c.iterator();
        while (it.hasNext()) {
            String str = (String) zzyt.m20848e().m16421c(it.next());
            if (str != null) {
                listM16416e.add(str);
            }
        }
        return listM16416e;
    }
}
