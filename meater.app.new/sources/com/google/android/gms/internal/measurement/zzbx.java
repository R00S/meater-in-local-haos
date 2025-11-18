package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzbx implements InterfaceC7546m0 {

    /* renamed from: a */
    private static final Map<Uri, zzbx> f27994a = new C0867a();

    /* renamed from: b */
    private static final String[] f27995b = {RoomNotification.KEY, "value"};

    /* renamed from: c */
    private final ContentResolver f27996c;

    /* renamed from: d */
    private final Uri f27997d;

    /* renamed from: e */
    private final ContentObserver f27998e;

    /* renamed from: f */
    private final Object f27999f;

    /* renamed from: g */
    private volatile Map<String, String> f28000g;

    /* renamed from: h */
    private final List<zzcc> f28001h;

    private zzbx(ContentResolver contentResolver, Uri uri) {
        C7534k0 c7534k0 = new C7534k0(this, null);
        this.f27998e = c7534k0;
        this.f27999f = new Object();
        this.f28001h = new ArrayList();
        this.f27996c = contentResolver;
        this.f27997d = uri;
        contentResolver.registerContentObserver(uri, false, c7534k0);
    }

    /* renamed from: a */
    public static zzbx m22089a(ContentResolver contentResolver, Uri uri) {
        zzbx zzbxVar;
        synchronized (zzbx.class) {
            Map<Uri, zzbx> map = f27994a;
            zzbxVar = map.get(uri);
            if (zzbxVar == null) {
                try {
                    zzbx zzbxVar2 = new zzbx(contentResolver, uri);
                    try {
                        map.put(uri, zzbxVar2);
                    } catch (SecurityException unused) {
                    }
                    zzbxVar = zzbxVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzbxVar;
    }

    /* renamed from: d */
    static synchronized void m22090d() {
        for (zzbx zzbxVar : f27994a.values()) {
            zzbxVar.f27996c.unregisterContentObserver(zzbxVar.f27998e);
        }
        f27994a.clear();
    }

    /* renamed from: f */
    private final Map<String, String> m22091f() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) zzce.m22101a(new zzcd(this) { // from class: com.google.android.gms.internal.measurement.l0

                    /* renamed from: a */
                    private final zzbx f27819a;

                    {
                        this.f27819a = this;
                    }

                    @Override // com.google.android.gms.internal.measurement.zzcd
                    /* renamed from: a */
                    public final Object mo21227a() {
                        return this.f27819a.m22094e();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    /* renamed from: b */
    public final Map<String, String> m22092b() {
        Map<String, String> mapM22091f = this.f28000g;
        if (mapM22091f == null) {
            synchronized (this.f27999f) {
                mapM22091f = this.f28000g;
                if (mapM22091f == null) {
                    mapM22091f = m22091f();
                    this.f28000g = mapM22091f;
                }
            }
        }
        return mapM22091f != null ? mapM22091f : Collections.emptyMap();
    }

    /* renamed from: c */
    public final void m22093c() {
        synchronized (this.f27999f) {
            this.f28000g = null;
            zzcl.m22109g();
        }
        synchronized (this) {
            Iterator<zzcc> it = this.f28001h.iterator();
            while (it.hasNext()) {
                it.next().m22100a();
            }
        }
    }

    /* renamed from: e */
    final /* synthetic */ Map m22094e() {
        Cursor cursorQuery = this.f27996c.query(this.f27997d, f27995b, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map c0867a = count <= 256 ? new C0867a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                c0867a.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return c0867a;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7546m0
    /* renamed from: u */
    public final /* synthetic */ Object mo21237u(String str) {
        return m22092b().get(str);
    }
}
