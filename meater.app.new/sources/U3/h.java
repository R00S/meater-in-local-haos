package U3;

import L3.i;
import L3.q;
import L3.z;
import android.content.Context;
import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* compiled from: NetworkFetcher.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final g f17543a;

    /* renamed from: b, reason: collision with root package name */
    private final f f17544b;

    /* compiled from: NetworkFetcher.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17545a;

        static {
            int[] iArr = new int[c.values().length];
            f17545a = iArr;
            try {
                iArr[c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17545a[c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(g gVar, f fVar) {
        this.f17543a = gVar;
        this.f17544b = fVar;
    }

    private i a(Context context, String str, String str2) {
        g gVar;
        Pair<c, InputStream> pairA;
        z<i> zVarY;
        if (str2 == null || (gVar = this.f17543a) == null || (pairA = gVar.a(str)) == null) {
            return null;
        }
        c cVar = (c) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        int i10 = a.f17545a[cVar.ordinal()];
        if (i10 == 1) {
            zVarY = q.y(context, new ZipInputStream(inputStream), str2);
        } else if (i10 != 2) {
            zVarY = q.o(inputStream, str2);
        } else {
            try {
                zVarY = q.o(new GZIPInputStream(inputStream), str2);
            } catch (IOException e10) {
                zVarY = new z<>(e10);
            }
        }
        if (zVarY.b() != null) {
            return zVarY.b();
        }
        return null;
    }

    private z<i> b(Context context, String str, String str2) throws IOException {
        X3.d.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d dVarA = this.f17544b.a(str);
                if (!dVarA.f1()) {
                    z<i> zVar = new z<>(new IllegalArgumentException(dVarA.B0()));
                    try {
                        dVarA.close();
                    } catch (IOException e10) {
                        X3.d.d("LottieFetchResult close failed ", e10);
                    }
                    return zVar;
                }
                z<i> zVarE = e(context, str, dVarA.H0(), dVarA.z0(), str2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Completed fetch from network. Success: ");
                sb2.append(zVarE.b() != null);
                X3.d.a(sb2.toString());
                try {
                    dVarA.close();
                } catch (IOException e11) {
                    X3.d.d("LottieFetchResult close failed ", e11);
                }
                return zVarE;
            } catch (Exception e12) {
                z<i> zVar2 = new z<>(e12);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e13) {
                        X3.d.d("LottieFetchResult close failed ", e13);
                    }
                }
                return zVar2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e14) {
                    X3.d.d("LottieFetchResult close failed ", e14);
                }
            }
            throw th;
        }
    }

    private z<i> d(String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f17543a) == null) ? q.o(new GZIPInputStream(inputStream), null) : q.o(new GZIPInputStream(new FileInputStream(gVar.g(str, inputStream, c.GZIP))), str);
    }

    private z<i> e(Context context, String str, InputStream inputStream, String str2, String str3) throws NoSuchAlgorithmException {
        z<i> zVarG;
        c cVar;
        g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            X3.d.a("Handling zip response.");
            c cVar2 = c.ZIP;
            zVarG = g(context, str, inputStream, str3);
            cVar = cVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            X3.d.a("Handling gzip response.");
            cVar = c.GZIP;
            zVarG = d(str, inputStream, str3);
        } else {
            X3.d.a("Received json response.");
            cVar = c.JSON;
            zVarG = f(str, inputStream, str3);
        }
        if (str3 != null && zVarG.b() != null && (gVar = this.f17543a) != null) {
            gVar.f(str, cVar);
        }
        return zVarG;
    }

    private z<i> f(String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f17543a) == null) ? q.o(inputStream, null) : q.o(new FileInputStream(gVar.g(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    private z<i> g(Context context, String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f17543a) == null) ? q.y(context, new ZipInputStream(inputStream), null) : q.y(context, new ZipInputStream(new FileInputStream(gVar.g(str, inputStream, c.ZIP))), str);
    }

    public z<i> c(Context context, String str, String str2) {
        i iVarA = a(context, str, str2);
        if (iVarA != null) {
            return new z<>(iVarA);
        }
        X3.d.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }
}
