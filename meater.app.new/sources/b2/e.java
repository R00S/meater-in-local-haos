package b2;

import android.net.Uri;

/* compiled from: ContentMetadata.java */
/* loaded from: classes.dex */
public interface e {
    static Uri a(e eVar) {
        String strB = eVar.b("exo_redir", null);
        if (strB == null) {
            return null;
        }
        return Uri.parse(strB);
    }

    static long d(e eVar) {
        return eVar.c("exo_len", -1L);
    }

    String b(String str, String str2);

    long c(String str, long j10);
}
