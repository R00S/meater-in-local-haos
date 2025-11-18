package a2;

import java.io.IOException;

/* compiled from: DataSourceUtil.java */
/* loaded from: classes.dex */
public final class f {
    public static void a(androidx.media3.datasource.a aVar) {
        if (aVar != null) {
            try {
                aVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
