package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.ads.zzwt;

/* loaded from: classes2.dex */
public final class zzcjr {

    /* renamed from: a */
    private zzwj f24413a;

    /* renamed from: b */
    private Context f24414b;

    /* renamed from: c */
    private zzcjc f24415c;

    /* renamed from: d */
    private zzbai f24416d;

    public zzcjr(Context context, zzbai zzbaiVar, zzwj zzwjVar, zzcjc zzcjcVar) {
        this.f24414b = context;
        this.f24416d = zzbaiVar;
        this.f24413a = zzwjVar;
        this.f24415c = zzcjcVar;
    }

    /* renamed from: a */
    public final void m18844a() {
        try {
            this.f24415c.m18815a(new zzczc(this) { // from class: com.google.android.gms.internal.ads.bk

                /* renamed from: a */
                private final zzcjr f18345a;

                {
                    this.f18345a = this;
                }

                @Override // com.google.android.gms.internal.ads.zzczc
                /* renamed from: a */
                public final Object mo14763a(Object obj) {
                    return this.f18345a.m18845b((SQLiteDatabase) obj);
                }
            });
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            zzbad.m17351g(strValueOf.length() != 0 ? "Error in offline signals database startup: ".concat(strValueOf) : new String("Error in offline signals database startup: "));
        }
    }

    /* renamed from: b */
    final /* synthetic */ Void m18845b(SQLiteDatabase sQLiteDatabase) throws Exception {
        final zzwt.zzi zziVar = (zzwt.zzi) ((zzdob) zzwt.zzi.m20734J().m20781u(this.f24414b.getPackageName()).m20782v(Build.MODEL).m20783w(zzcjq.m18842a(sQLiteDatabase, 1)).m20779B(zzcjq.m18843b(sQLiteDatabase)).m20778A(zzcjq.m18842a(sQLiteDatabase, 2)).m20780C(zzk.zzln().mo14608a()).mo19736p0());
        this.f24413a.m20697a(new zzwk(zziVar) { // from class: com.google.android.gms.internal.ads.ck

            /* renamed from: a */
            private final zzwt.zzi f18456a;

            {
                this.f18456a = zziVar;
            }

            @Override // com.google.android.gms.internal.ads.zzwk
            /* renamed from: a */
            public final void mo14971a(zzxn zzxnVar) {
                zzxnVar.f27375m = this.f18456a;
            }
        });
        final zzxo zzxoVar = new zzxo();
        zzxoVar.f27377c = Integer.valueOf(this.f24416d.f22751g);
        zzxoVar.f27378d = Integer.valueOf(this.f24416d.f22752h);
        zzxoVar.f27379e = Integer.valueOf(this.f24416d.f22753i ? 0 : 2);
        this.f24413a.m20697a(new zzwk(zzxoVar) { // from class: com.google.android.gms.internal.ads.dk

            /* renamed from: a */
            private final zzxo f18692a;

            {
                this.f18692a = zzxoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzwk
            /* renamed from: a */
            public final void mo14971a(zzxn zzxnVar) {
                zzxnVar.f27371i.f27360f = this.f18692a;
            }
        });
        this.f24413a.m20698b(zzwl.zza.zzb.OFFLINE_UPLOAD);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("total", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("total", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
