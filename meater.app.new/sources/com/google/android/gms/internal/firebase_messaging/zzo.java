package com.google.android.gms.internal.firebase_messaging;

import java.io.PrintStream;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzo {

    /* renamed from: a */
    static final AbstractC7460e f27624a;

    static {
        AbstractC7460e c7464i;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e2) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e2.printStackTrace(System.err);
            }
            c7464i = (num == null || num.intValue() < 19) ? !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new C7463h() : new C7464i() : new C7465j();
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = C7464i.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            c7464i = new C7464i();
        }
        f27624a = c7464i;
        if (num == null) {
            return;
        }
        num.intValue();
    }

    /* renamed from: a */
    public static void m20942a(Throwable th, Throwable th2) {
        f27624a.mo20935a(th, th2);
    }
}
