package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8405j;
import com.google.firebase.installations.AbstractC8388l;
import com.google.firebase.installations.InterfaceC8385i;
import com.google.firebase.p204r.InterfaceC8492j;
import com.google.firebase.p205s.InterfaceC8496b;
import com.google.firebase.p209u.InterfaceC8556i;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@KeepForSdk
/* renamed from: com.google.firebase.iid.k */
/* loaded from: classes2.dex */
public class C8363k {

    /* renamed from: a */
    private final C8405j f31738a;

    /* renamed from: b */
    private final C8366n f31739b;

    /* renamed from: c */
    private final Rpc f31740c;

    /* renamed from: d */
    private final InterfaceC8496b<InterfaceC8556i> f31741d;

    /* renamed from: e */
    private final InterfaceC8496b<InterfaceC8492j> f31742e;

    /* renamed from: f */
    private final InterfaceC8385i f31743f;

    C8363k(C8405j c8405j, C8366n c8366n, Rpc rpc, InterfaceC8496b<InterfaceC8556i> interfaceC8496b, InterfaceC8496b<InterfaceC8492j> interfaceC8496b2, InterfaceC8385i interfaceC8385i) {
        this.f31738a = c8405j;
        this.f31739b = c8366n;
        this.f31740c = rpc;
        this.f31741d = interfaceC8496b;
        this.f31742e = interfaceC8496b2;
        this.f31743f = interfaceC8385i;
    }

    public C8363k(C8405j c8405j, C8366n c8366n, InterfaceC8496b<InterfaceC8556i> interfaceC8496b, InterfaceC8496b<InterfaceC8492j> interfaceC8496b2, InterfaceC8385i interfaceC8385i) {
        this(c8405j, c8366n, new Rpc(c8405j.m26404i()), interfaceC8496b, interfaceC8496b2, interfaceC8385i);
    }

    /* renamed from: a */
    private static String m26202a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    private Task<String> m26203b(Task<Bundle> task) {
        return task.mo23644g(C8354b.m26200a(), new Continuation(this) { // from class: com.google.firebase.iid.j

            /* renamed from: a */
            private final C8363k f31737a;

            {
                this.f31737a = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: a */
            public Object mo13777a(Task task2) {
                return this.f31737a.m26210g(task2);
            }
        });
    }

    /* renamed from: c */
    private String m26204c() {
        try {
            return m26202a(MessageDigest.getInstance("SHA-1").digest(this.f31738a.m26405k().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: e */
    private String m26205e(Bundle bundle) throws IOException {
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
        String strValueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 21);
        sb.append("Unexpected response: ");
        sb.append(strValueOf);
        Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: f */
    static boolean m26206f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* renamed from: h */
    private Bundle m26207h(String str, String str2, String str3, Bundle bundle) {
        InterfaceC8492j.a aVarMo26688b;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f31738a.m26406l().m26424c());
        bundle.putString("gmsv", Integer.toString(this.f31739b.m26217d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f31739b.m26215a());
        bundle.putString("app_ver_name", this.f31739b.m26216b());
        bundle.putString("firebase-app-name-hash", m26204c());
        try {
            String strMo26245b = ((AbstractC8388l) Tasks.m23659a(this.f31743f.mo26277a(false))).mo26245b();
            if (TextUtils.isEmpty(strMo26245b)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strMo26245b);
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e2);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        InterfaceC8492j interfaceC8492j = this.f31742e.get();
        InterfaceC8556i interfaceC8556i = this.f31741d.get();
        if (interfaceC8492j != null && interfaceC8556i != null && (aVarMo26688b = interfaceC8492j.mo26688b("fire-iid")) != InterfaceC8492j.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarMo26688b.m26693g()));
            bundle.putString("Firebase-Client", interfaceC8556i.mo26898a());
        }
        return bundle;
    }

    /* renamed from: i */
    private Task<Bundle> m26208i(String str, String str2, String str3, Bundle bundle) {
        m26207h(str, str2, str3, bundle);
        return this.f31740c.m13762a(bundle);
    }

    /* renamed from: d */
    public Task<String> m26209d(String str, String str2, String str3) {
        return m26203b(m26208i(str, str2, str3, new Bundle()));
    }

    /* renamed from: g */
    final /* synthetic */ String m26210g(Task task) throws Exception {
        return m26205e((Bundle) task.mo23648k(IOException.class));
    }
}
