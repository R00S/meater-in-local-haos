package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.m;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import z7.AbstractC5208j;
import z7.C5211m;
import z7.InterfaceC5201c;

/* compiled from: ConfigAutoFetch.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Set<E9.c> f38650a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f38651b;

    /* renamed from: c, reason: collision with root package name */
    private final m f38652c;

    /* renamed from: d, reason: collision with root package name */
    private final f f38653d;

    /* renamed from: e, reason: collision with root package name */
    private final E9.c f38654e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f38655f;

    /* renamed from: g, reason: collision with root package name */
    private final Random f38656g = new Random();

    /* compiled from: ConfigAutoFetch.java */
    class a implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f38657B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ long f38658C;

        a(int i10, long j10) {
            this.f38657B = i10;
            this.f38658C = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.d(this.f38657B, this.f38658C);
        }
    }

    public b(HttpURLConnection httpURLConnection, m mVar, f fVar, Set<E9.c> set, E9.c cVar, ScheduledExecutorService scheduledExecutorService) {
        this.f38651b = httpURLConnection;
        this.f38652c = mVar;
        this.f38653d = fVar;
        this.f38650a = set;
        this.f38654e = cVar;
        this.f38655f = scheduledExecutorService;
    }

    private void b(int i10, long j10) {
        if (i10 == 0) {
            k(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f38655f.schedule(new a(i10, j10), this.f38656g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private synchronized void c(E9.b bVar) {
        Iterator<E9.c> it = this.f38650a.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
    }

    private static Boolean e(m.a aVar, long j10) {
        if (aVar.d() != null) {
            return Boolean.valueOf(aVar.d().k() >= j10);
        }
        return Boolean.valueOf(aVar.f() == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r5.has("featureDisabled") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r5.getBoolean("featureDisabled") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r9.f38654e.a(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (g() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r5.has("latestTemplateVersionNumber") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        r6 = r9.f38652c.r();
        r4 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r4 <= r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        b(3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(java.io.InputStream r10) throws org.json.JSONException, java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L12:
            r4 = r3
        L13:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L96
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L13
            java.lang.String r4 = r9.j(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3b
            goto L13
        L3b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5b
            r5.<init>(r4)     // Catch: org.json.JSONException -> L5b
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            boolean r4 = r5.getBoolean(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            E9.c r4 = r9.f38654e     // Catch: org.json.JSONException -> L5b
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch: org.json.JSONException -> L5b
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L5b
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L5b
            r4.a(r5)     // Catch: org.json.JSONException -> L5b
            goto L96
        L5b:
            r4 = move-exception
            goto L7d
        L5d:
            boolean r4 = r9.g()     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L64
            goto L96
        L64:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L12
            com.google.firebase.remoteconfig.internal.m r4 = r9.f38652c     // Catch: org.json.JSONException -> L5b
            long r6 = r4.r()     // Catch: org.json.JSONException -> L5b
            long r4 = r5.getLong(r0)     // Catch: org.json.JSONException -> L5b
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L12
            r6 = 3
            r9.b(r6, r4)     // Catch: org.json.JSONException -> L5b
            goto L12
        L7d:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Throwable r6 = r4.getCause()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r9.k(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L12
        L96:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.b.f(java.io.InputStream):void");
    }

    private synchronized boolean g() {
        return this.f38650a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC5208j h(AbstractC5208j abstractC5208j, AbstractC5208j abstractC5208j2, long j10, int i10, AbstractC5208j abstractC5208j3) throws JSONException {
        if (!abstractC5208j.o()) {
            return C5211m.d(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", abstractC5208j.j()));
        }
        if (!abstractC5208j2.o()) {
            return C5211m.d(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", abstractC5208j2.j()));
        }
        m.a aVar = (m.a) abstractC5208j.k();
        g gVarA = (g) abstractC5208j2.k();
        if (!e(aVar, j10).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            b(i10, j10);
            return C5211m.e(null);
        }
        if (aVar.d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return C5211m.e(null);
        }
        if (gVarA == null) {
            gVarA = g.l().a();
        }
        Set<String> setF = gVarA.f(aVar.d());
        if (setF.isEmpty()) {
            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return C5211m.e(null);
        }
        c(E9.b.a(setF));
        return C5211m.e(null);
    }

    private String j(String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    private synchronized void k(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<E9.c> it = this.f38650a.iterator();
        while (it.hasNext()) {
            it.next().a(firebaseRemoteConfigException);
        }
    }

    public synchronized AbstractC5208j<Void> d(int i10, final long j10) {
        final int i11;
        final AbstractC5208j<m.a> abstractC5208jN;
        final AbstractC5208j<g> abstractC5208jE;
        i11 = i10 - 1;
        abstractC5208jN = this.f38652c.n(m.b.REALTIME, 3 - i11);
        abstractC5208jE = this.f38653d.e();
        return C5211m.j(abstractC5208jN, abstractC5208jE).i(this.f38655f, new InterfaceC5201c() { // from class: com.google.firebase.remoteconfig.internal.a
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j) {
                return this.f38645a.h(abstractC5208jN, abstractC5208jE, j10, i11, abstractC5208j);
            }
        });
    }

    public void i() {
        HttpURLConnection httpURLConnection = this.f38651b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                f(inputStream);
                inputStream.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e10);
            }
        } finally {
            this.f38651b.disconnect();
        }
    }
}
