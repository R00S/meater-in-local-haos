package com.google.android.gms.common.util;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class k {
    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
