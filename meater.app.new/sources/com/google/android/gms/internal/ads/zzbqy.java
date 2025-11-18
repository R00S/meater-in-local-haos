package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class zzbqy {

    /* renamed from: a */
    private final Context f23511a;

    /* renamed from: b */
    private final zzcxv f23512b;

    /* renamed from: c */
    private final String f23513c;

    /* renamed from: d */
    private Bundle f23514d;

    public static class zza {

        /* renamed from: a */
        private Context f23515a;

        /* renamed from: b */
        private zzcxv f23516b;

        /* renamed from: c */
        private Bundle f23517c;

        /* renamed from: d */
        private String f23518d;

        /* renamed from: b */
        public final zza m18286b(zzcxv zzcxvVar) {
            this.f23516b = zzcxvVar;
            return this;
        }

        /* renamed from: c */
        public final zzbqy m18287c() {
            return new zzbqy(this);
        }

        /* renamed from: e */
        public final zza m18288e(Context context) {
            this.f23515a = context;
            return this;
        }

        /* renamed from: h */
        public final zza m18289h(Bundle bundle) {
            this.f23517c = bundle;
            return this;
        }

        /* renamed from: i */
        public final zza m18290i(String str) {
            this.f23518d = str;
            return this;
        }
    }

    private zzbqy(zza zzaVar) {
        this.f23511a = zzaVar.f23515a;
        this.f23512b = zzaVar.f23516b;
        this.f23514d = zzaVar.f23517c;
        this.f23513c = zzaVar.f23518d;
    }

    /* renamed from: a */
    final zza m18277a() {
        return new zza().m18288e(this.f23511a).m18286b(this.f23512b).m18290i(this.f23513c).m18289h(this.f23514d);
    }

    /* renamed from: b */
    final zzcxv m18278b() {
        return this.f23512b;
    }

    /* renamed from: c */
    final Bundle m18279c() {
        return this.f23514d;
    }

    /* renamed from: d */
    final String m18280d() {
        return this.f23513c;
    }

    /* renamed from: e */
    final Context m18281e(Context context) {
        return this.f23513c != null ? context : this.f23511a;
    }
}
