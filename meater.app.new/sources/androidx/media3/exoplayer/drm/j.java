package androidx.media3.exoplayer.drm;

import X1.L;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import java.util.List;
import java.util.Map;

/* compiled from: DrmUtil.java */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: DrmUtil.java */
    private static final class a {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:11|22|12|(2:14|15)(2:27|17)) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r1 = c(r11, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r8 = r8 + 1;
        r9 = r9.a().j(r1).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        X1.L.m(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r8 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(androidx.media3.datasource.a r8, java.lang.String r9, byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11) throws androidx.media3.exoplayer.drm.MediaDrmCallbackException {
        /*
            a2.l r0 = new a2.l
            r0.<init>(r8)
            a2.g$b r8 = new a2.g$b
            r8.<init>()
            a2.g$b r8 = r8.j(r9)
            a2.g$b r8 = r8.e(r11)
            r9 = 2
            a2.g$b r8 = r8.d(r9)
            a2.g$b r8 = r8.c(r10)
            r9 = 1
            a2.g$b r8 = r8.b(r9)
            a2.g r2 = r8.a()
            r8 = 0
            r9 = r2
        L26:
            a2.e r10 = new a2.e     // Catch: java.lang.Exception -> L33
            r10.<init>(r0, r9)     // Catch: java.lang.Exception -> L33
            byte[] r8 = n8.C4072a.b(r10)     // Catch: java.lang.Throwable -> L36 androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException -> L38
            X1.L.m(r10)     // Catch: java.lang.Exception -> L33
            return r8
        L33:
            r8 = move-exception
            r7 = r8
            goto L56
        L36:
            r8 = move-exception
            goto L52
        L38:
            r11 = move-exception
            java.lang.String r1 = c(r11, r8)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L51
            int r8 = r8 + 1
            a2.g$b r9 = r9.a()     // Catch: java.lang.Throwable -> L36
            a2.g$b r9 = r9.j(r1)     // Catch: java.lang.Throwable -> L36
            a2.g r9 = r9.a()     // Catch: java.lang.Throwable -> L36
            X1.L.m(r10)     // Catch: java.lang.Exception -> L33
            goto L26
        L51:
            throw r11     // Catch: java.lang.Throwable -> L36
        L52:
            X1.L.m(r10)     // Catch: java.lang.Exception -> L33
            throw r8     // Catch: java.lang.Exception -> L33
        L56:
            androidx.media3.exoplayer.drm.MediaDrmCallbackException r8 = new androidx.media3.exoplayer.drm.MediaDrmCallbackException
            android.net.Uri r9 = r0.r()
            java.lang.Object r9 = X1.C1804a.e(r9)
            r3 = r9
            android.net.Uri r3 = (android.net.Uri) r3
            java.util.Map r4 = r0.l()
            long r5 = r0.q()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.j.a(androidx.media3.datasource.a, java.lang.String, byte[], java.util.Map):byte[]");
    }

    public static int b(Throwable th, int i10) {
        if (th instanceof MediaDrm.MediaDrmStateException) {
            return L.Z(L.a0(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
        if (L.f18626a >= 23 && a.a(th)) {
            return 6006;
        }
        if ((th instanceof NotProvisionedException) || d(th)) {
            return 6002;
        }
        if (th instanceof DeniedByServerException) {
            return 6007;
        }
        if (th instanceof UnsupportedDrmException) {
            return 6001;
        }
        if (th instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return 6003;
        }
        if (th instanceof KeysExpiredException) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    private static String c(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = httpDataSource$InvalidResponseCodeException.f26140E;
        if ((i11 != 307 && i11 != 308) || i10 >= 5 || (map = httpDataSource$InvalidResponseCodeException.f26142G) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static boolean d(Throwable th) {
        return L.f18626a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean e(Throwable th) {
        return L.f18626a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
