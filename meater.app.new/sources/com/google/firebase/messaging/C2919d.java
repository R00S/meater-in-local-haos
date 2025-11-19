package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import s.C4391a;

/* compiled from: Constants.java */
/* renamed from: com.google.firebase.messaging.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2919d {

    /* renamed from: a, reason: collision with root package name */
    public static final long f38372a = TimeUnit.MINUTES.toMillis(3);

    /* compiled from: Constants.java */
    /* renamed from: com.google.firebase.messaging.d$a */
    public static final class a {
        public static C4391a<String, String> a(Bundle bundle) {
            C4391a<String, String> c4391a = new C4391a<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c4391a.put(str, str2);
                    }
                }
            }
            return c4391a;
        }
    }
}
