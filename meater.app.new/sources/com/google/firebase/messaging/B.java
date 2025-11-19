package com.google.firebase.messaging;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import b7.C2251a;
import b7.C2253c;
import j9.InterfaceC3755b;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import k9.InterfaceC3810e;
import o3.ExecutorC4121m;
import z7.AbstractC5208j;
import z7.C5211m;
import z7.InterfaceC5201c;

/* compiled from: GmsRpc.java */
/* loaded from: classes2.dex */
class B {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f38221a;

    /* renamed from: b, reason: collision with root package name */
    private final G f38222b;

    /* renamed from: c, reason: collision with root package name */
    private final C2253c f38223c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3755b<D9.i> f38224d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3755b<h9.j> f38225e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3810e f38226f;

    B(com.google.firebase.f fVar, G g10, InterfaceC3755b<D9.i> interfaceC3755b, InterfaceC3755b<h9.j> interfaceC3755b2, InterfaceC3810e interfaceC3810e) {
        this(fVar, g10, new C2253c(fVar.k()), interfaceC3755b, interfaceC3755b2, interfaceC3810e);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private AbstractC5208j<String> c(AbstractC5208j<Bundle> abstractC5208j) {
        return abstractC5208j.h(new ExecutorC4121m(), new InterfaceC5201c() { // from class: com.google.firebase.messaging.A
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j2) {
                return this.f38220a.i(abstractC5208j2);
            }
        });
    }

    private String d() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f38221a.m().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String g(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i(AbstractC5208j abstractC5208j) {
        return g((Bundle) abstractC5208j.l(IOException.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "scope"
            r5.putString(r1, r4)
            java.lang.String r4 = "sender"
            r5.putString(r4, r3)
            java.lang.String r4 = "subtype"
            r5.putString(r4, r3)
            com.google.firebase.f r3 = r2.f38221a
            com.google.firebase.m r3 = r3.n()
            java.lang.String r3 = r3.c()
            java.lang.String r4 = "gmp_app_id"
            r5.putString(r4, r3)
            com.google.firebase.messaging.G r3 = r2.f38222b
            int r3 = r3.d()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r5.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r5.putString(r4, r3)
            com.google.firebase.messaging.G r3 = r2.f38222b
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "app_ver"
            r5.putString(r4, r3)
            com.google.firebase.messaging.G r3 = r2.f38222b
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "app_ver_name"
            r5.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.d()
            r5.putString(r3, r4)
            k9.e r3 = r2.f38226f     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            r4 = 0
            z7.j r3 = r3.a(r4)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.Object r3 = z7.C5211m.a(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            com.google.firebase.installations.f r3 = (com.google.firebase.installations.f) r3     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.String r3 = r3.b()     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            if (r4 != 0) goto L7a
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r5.putString(r4, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L76:
            r3 = move-exception
            goto L80
        L78:
            r3 = move-exception
            goto L80
        L7a:
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r0, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L80:
            java.lang.String r4 = "Failed to get FIS auth token"
            android.util.Log.e(r0, r4, r3)
        L85:
            k9.e r3 = r2.f38226f
            z7.j r3 = r3.c()
            java.lang.Object r3 = z7.C5211m.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "appid"
            r5.putString(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fcm-"
            r3.append(r4)
            java.lang.String r4 = "24.1.0"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "cliv"
            r5.putString(r4, r3)
            j9.b<h9.j> r3 = r2.f38225e
            java.lang.Object r3 = r3.get()
            h9.j r3 = (h9.j) r3
            j9.b<D9.i> r4 = r2.f38224d
            java.lang.Object r4 = r4.get()
            D9.i r4 = (D9.i) r4
            if (r3 == 0) goto Le2
            if (r4 == 0) goto Le2
            java.lang.String r0 = "fire-iid"
            h9.j$a r3 = r3.b(r0)
            h9.j$a r0 = h9.j.a.NONE
            if (r3 == r0) goto Le2
            int r3 = r3.j()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "Firebase-Client-Log-Type"
            r5.putString(r0, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.a()
            r5.putString(r3, r4)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.B.j(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    private AbstractC5208j<Bundle> l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f38223c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return C5211m.d(e10);
        }
    }

    AbstractC5208j<C2251a> e() {
        return this.f38223c.a();
    }

    AbstractC5208j<String> f() {
        return c(l(G.c(this.f38221a), "*", new Bundle()));
    }

    AbstractC5208j<Void> k(boolean z10) {
        return this.f38223c.d(z10);
    }

    AbstractC5208j<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(l(str, "/topics/" + str2, bundle));
    }

    AbstractC5208j<?> n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(l(str, "/topics/" + str2, bundle));
    }

    B(com.google.firebase.f fVar, G g10, C2253c c2253c, InterfaceC3755b<D9.i> interfaceC3755b, InterfaceC3755b<h9.j> interfaceC3755b2, InterfaceC3810e interfaceC3810e) {
        this.f38221a = fVar;
        this.f38222b = g10;
        this.f38223c = c2253c;
        this.f38224d = interfaceC3755b;
        this.f38225e = interfaceC3755b2;
        this.f38226f = interfaceC3810e;
    }
}
