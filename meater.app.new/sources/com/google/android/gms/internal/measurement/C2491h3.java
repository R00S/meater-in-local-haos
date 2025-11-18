package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s.C4391a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2491h3 implements InterfaceC2515k3 {

    /* renamed from: h, reason: collision with root package name */
    private static final Map<Uri, C2491h3> f34138h = new C4391a();

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f34139i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f34140a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f34141b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f34142c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentObserver f34143d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f34144e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Map<String, String> f34145f;

    /* renamed from: g, reason: collision with root package name */
    private final List<InterfaceC2499i3> f34146g;

    private C2491h3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C2507j3 c2507j3 = new C2507j3(this, null);
        this.f34143d = c2507j3;
        this.f34144e = new Object();
        this.f34146g = new ArrayList();
        l8.m.l(contentResolver);
        l8.m.l(uri);
        this.f34140a = contentResolver;
        this.f34141b = uri;
        this.f34142c = runnable;
        contentResolver.registerContentObserver(uri, false, c2507j3);
    }

    public static C2491h3 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C2491h3 c2491h3;
        synchronized (C2491h3.class) {
            Map<Uri, C2491h3> map = f34138h;
            c2491h3 = map.get(uri);
            if (c2491h3 == null) {
                try {
                    C2491h3 c2491h32 = new C2491h3(contentResolver, uri, runnable);
                    try {
                        map.put(uri, c2491h32);
                    } catch (SecurityException unused) {
                    }
                    c2491h3 = c2491h32;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c2491h3;
    }

    static synchronized void e() {
        try {
            for (C2491h3 c2491h3 : f34138h.values()) {
                c2491h3.f34140a.unregisterContentObserver(c2491h3.f34143d);
            }
            f34138h.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Map g() {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.f34140a.acquireUnstableContentProviderClient(this.f34141b);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.emptyMap();
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(this.f34141b, f34139i, null, null, null);
            try {
                if (cursorQuery == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    Map mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return mapEmptyMap;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map mapEmptyMap2 = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap2;
                }
                Map c4391a = count <= 256 ? new C4391a(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    c4391a.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return c4391a;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map mapEmptyMap3 = Collections.emptyMap();
                cursorQuery.close();
                return mapEmptyMap3;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RemoteException e10) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
            return Collections.emptyMap();
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    private final Map<String, String> h() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) C2539n3.a(new InterfaceC2531m3() { // from class: com.google.android.gms.internal.measurement.g3
                    @Override // com.google.android.gms.internal.measurement.InterfaceC2531m3
                    public final Object a() {
                        return this.f34120a.g();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException e10) {
                Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e10);
                return Collections.emptyMap();
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public final Map<String, String> b() {
        Map<String, String> mapH = this.f34145f;
        if (mapH == null) {
            synchronized (this.f34144e) {
                try {
                    mapH = this.f34145f;
                    if (mapH == null) {
                        mapH = h();
                        this.f34145f = mapH;
                    }
                } finally {
                }
            }
        }
        return mapH != null ? mapH : Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2515k3
    public final /* synthetic */ Object c(String str) {
        return b().get(str);
    }

    public final void f() {
        synchronized (this.f34144e) {
            this.f34145f = null;
            this.f34142c.run();
        }
        synchronized (this) {
            try {
                Iterator<InterfaceC2499i3> it = this.f34146g.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
