package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class zzbjn {

    /* renamed from: a */
    private final zzbai f23108a;

    /* renamed from: b */
    private final Context f23109b;

    /* renamed from: c */
    private final WeakReference<Context> f23110c;

    public static class zza {

        /* renamed from: a */
        private zzbai f23111a;

        /* renamed from: b */
        private Context f23112b;

        /* renamed from: c */
        private WeakReference<Context> f23113c;

        /* renamed from: b */
        public final zza m17797b(zzbai zzbaiVar) {
            this.f23111a = zzbaiVar;
            return this;
        }

        /* renamed from: d */
        public final zza m17798d(Context context) {
            this.f23113c = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f23112b = context;
            return this;
        }
    }

    private zzbjn(zza zzaVar) {
        this.f23108a = zzaVar.f23111a;
        this.f23109b = zzaVar.f23112b;
        this.f23110c = zzaVar.f23113c;
    }

    /* renamed from: a */
    final Context m17790a() {
        return this.f23109b;
    }

    /* renamed from: b */
    final Context m17791b() {
        return this.f23110c.get() != null ? this.f23110c.get() : this.f23109b;
    }

    /* renamed from: c */
    final zzbai m17792c() {
        return this.f23108a;
    }

    /* renamed from: d */
    final String m17793d() {
        return zzk.zzlg().m17177g0(this.f23109b, this.f23108a.f22750f);
    }
}
