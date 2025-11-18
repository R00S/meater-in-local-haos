package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* loaded from: classes.dex */
public final class zzh {

    /* renamed from: a */
    static final Logger f27623a = Logger.getLogger(zzh.class.getName());

    private zzh() {
    }

    /* renamed from: a */
    public static void m20941a(@NullableDecl InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException e2) {
            try {
                f27623a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e2);
            } catch (IOException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
