package com.flurry.sdk;

import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.k1 */
/* loaded from: classes2.dex */
public class C6085k1 extends AbstractC6050g2 {

    /* renamed from: B */
    private boolean f16044B;

    /* renamed from: F */
    boolean f16048F;

    /* renamed from: l */
    public String f16052l;

    /* renamed from: m */
    public c f16053m;

    /* renamed from: p */
    private int f16056p;

    /* renamed from: q */
    private int f16057q;

    /* renamed from: s */
    d f16059s;

    /* renamed from: t */
    HttpURLConnection f16060t;

    /* renamed from: u */
    boolean f16061u;

    /* renamed from: v */
    boolean f16062v;

    /* renamed from: w */
    private boolean f16063w;

    /* renamed from: z */
    private Exception f16066z;

    /* renamed from: i */
    private final C6211z0<String, String> f16049i = new C6211z0<>();

    /* renamed from: j */
    private final C6211z0<String, String> f16050j = new C6211z0<>();

    /* renamed from: k */
    final Object f16051k = new Object();

    /* renamed from: n */
    private int f16054n = 10000;

    /* renamed from: o */
    private int f16055o = 15000;

    /* renamed from: r */
    private boolean f16058r = true;

    /* renamed from: x */
    long f16064x = -1;

    /* renamed from: y */
    private long f16065y = -1;

    /* renamed from: A */
    public int f16043A = -1;

    /* renamed from: C */
    private int f16045C = 25000;

    /* renamed from: D */
    public boolean f16046D = false;

    /* renamed from: E */
    private C6076j1 f16047E = new C6076j1(this);

    /* renamed from: com.flurry.sdk.k1$a */
    final class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                HttpURLConnection httpURLConnection = C6085k1.this.f16060t;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.flurry.sdk.k1$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f16068a;

        static {
            int[] iArr = new int[c.values().length];
            f16068a = iArr;
            try {
                iArr[c.kPost.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16068a[c.kPut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16068a[c.kDelete.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16068a[c.kHead.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16068a[c.kGet.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.flurry.sdk.k1$c */
    public enum c {
        kUnknown,
        kGet,
        kPost,
        kPut,
        kDelete,
        kHead;

        @Override // java.lang.Enum
        public final String toString() {
            int i2 = b.f16068a[ordinal()];
            if (i2 == 1) {
                return "POST";
            }
            if (i2 == 2) {
                return "PUT";
            }
            if (i2 == 3) {
                return "DELETE";
            }
            if (i2 == 4) {
                return "HEAD";
            }
            if (i2 != 5) {
                return null;
            }
            return "GET";
        }
    }

    /* renamed from: com.flurry.sdk.k1$d */
    public interface d {
        /* renamed from: a */
        void mo13107a();

        /* renamed from: b */
        void mo13108b(InputStream inputStream) throws Exception;

        /* renamed from: c */
        void mo13109c(OutputStream outputStream) throws Exception;
    }

    /* renamed from: e */
    private void m13145e() throws Exception {
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        OutputStream outputStream;
        InputStream inputStream;
        if (this.f16062v) {
            return;
        }
        String strConcat = this.f16052l;
        if (!TextUtils.isEmpty(strConcat) && Uri.parse(strConcat).getScheme() == null) {
            strConcat = "http://".concat(String.valueOf(strConcat));
        }
        this.f16052l = strConcat;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f16052l).openConnection();
            this.f16060t = httpURLConnection;
            httpURLConnection.setConnectTimeout(this.f16054n);
            this.f16060t.setReadTimeout(this.f16055o);
            this.f16060t.setRequestMethod(this.f16053m.toString());
            this.f16060t.setInstanceFollowRedirects(this.f16058r);
            this.f16060t.setDoOutput(c.kPost.equals(this.f16053m));
            this.f16060t.setDoInput(true);
            TrafficStats.setThreadStatsTag(1234);
            for (Map.Entry<String, String> entry : this.f16049i.m13380a()) {
                this.f16060t.addRequestProperty(entry.getKey(), entry.getValue());
            }
            if (!c.kGet.equals(this.f16053m) && !c.kPost.equals(this.f16053m)) {
                this.f16060t.setRequestProperty("Accept-Encoding", HttpUrl.FRAGMENT_ENCODE_SET);
            }
            if (this.f16062v) {
                return;
            }
            if (this.f16046D) {
                HttpURLConnection httpURLConnection2 = this.f16060t;
                if (httpURLConnection2 instanceof HttpsURLConnection) {
                    httpURLConnection2.connect();
                    C6094l1.m13176b((HttpsURLConnection) this.f16060t);
                }
            }
            BufferedInputStream bufferedInputStream = null;
            if (c.kPost.equals(this.f16053m)) {
                try {
                    outputStream = this.f16060t.getOutputStream();
                    try {
                        bufferedOutputStream = new BufferedOutputStream(outputStream);
                    } catch (Throwable th2) {
                        bufferedOutputStream = null;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    bufferedOutputStream = null;
                    th = th3;
                    outputStream = null;
                }
                try {
                    if (this.f16059s != null && !m13149d()) {
                        this.f16059s.mo13109c(bufferedOutputStream);
                    }
                    C6013c2.m12990f(bufferedOutputStream);
                    C6013c2.m12990f(outputStream);
                } catch (Throwable th4) {
                    th = th4;
                    C6013c2.m12990f(bufferedOutputStream);
                    C6013c2.m12990f(outputStream);
                    throw th;
                }
            }
            if (this.f16063w) {
                this.f16064x = System.currentTimeMillis();
            }
            if (this.f16044B) {
                this.f16047E.m13125b(this.f16045C);
            }
            this.f16043A = this.f16060t.getResponseCode();
            if (this.f16063w && this.f16064x != -1) {
                this.f16065y = System.currentTimeMillis() - this.f16064x;
            }
            this.f16047E.m13124a();
            for (Map.Entry<String, List<String>> entry2 : this.f16060t.getHeaderFields().entrySet()) {
                Iterator<String> it = entry2.getValue().iterator();
                while (it.hasNext()) {
                    this.f16050j.m13382c(entry2.getKey(), it.next());
                }
            }
            if (!c.kGet.equals(this.f16053m) && !c.kPost.equals(this.f16053m)) {
                return;
            }
            if (this.f16062v) {
                return;
            }
            try {
                InputStream inputStream2 = this.f16043A == 200 ? this.f16060t.getInputStream() : this.f16060t.getErrorStream();
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream2);
                    try {
                        if (this.f16059s != null && !m13149d()) {
                            this.f16059s.mo13108b(bufferedInputStream2);
                        }
                        C6013c2.m12990f(bufferedInputStream2);
                        C6013c2.m12990f(inputStream2);
                    } catch (Throwable th5) {
                        inputStream = inputStream2;
                        th = th5;
                        bufferedInputStream = bufferedInputStream2;
                        C6013c2.m12990f(bufferedInputStream);
                        C6013c2.m12990f(inputStream);
                        throw th;
                    }
                } catch (Throwable th6) {
                    inputStream = inputStream2;
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                inputStream = null;
            }
        } catch (Exception e2) {
            C6021d1.m13030c(6, "HttpStreamRequest", "Exception is:" + e2.getLocalizedMessage());
        } finally {
            m13146f();
        }
    }

    /* renamed from: f */
    private void m13146f() {
        if (this.f16061u) {
            return;
        }
        this.f16061u = true;
        HttpURLConnection httpURLConnection = this.f16060t;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.flurry.sdk.AbstractRunnableC6041f2
    /* renamed from: a */
    public void mo12950a() {
        try {
            try {
                if (this.f16052l != null) {
                    if (C6195x0.m13370a()) {
                        c cVar = this.f16053m;
                        if (cVar == null || c.kUnknown.equals(cVar)) {
                            this.f16053m = c.kGet;
                        }
                        m13145e();
                        C6021d1.m13030c(4, "HttpStreamRequest", "HTTP status: " + this.f16043A + " for url: " + this.f16052l);
                    } else {
                        C6021d1.m13030c(3, "HttpStreamRequest", "Network not available, aborting http request: " + this.f16052l);
                    }
                }
            } catch (Exception e2) {
                C6021d1.m13030c(4, "HttpStreamRequest", "HTTP status: " + this.f16043A + " for url: " + this.f16052l);
                StringBuilder sb = new StringBuilder("Exception during http request: ");
                sb.append(this.f16052l);
                C6021d1.m13031d(3, "HttpStreamRequest", sb.toString(), e2);
                HttpURLConnection httpURLConnection = this.f16060t;
                if (httpURLConnection != null) {
                    this.f16057q = httpURLConnection.getReadTimeout();
                    this.f16056p = this.f16060t.getConnectTimeout();
                }
                this.f16066z = e2;
            }
        } finally {
            this.f16047E.m13124a();
            m13148c();
        }
    }

    /* renamed from: b */
    public final void m13147b(String str, String str2) {
        this.f16049i.m13382c(str, str2);
    }

    /* renamed from: c */
    final void m13148c() {
        if (this.f16059s == null || m13149d()) {
            return;
        }
        this.f16059s.mo13107a();
    }

    /* renamed from: d */
    public final boolean m13149d() {
        boolean z;
        synchronized (this.f16051k) {
            z = this.f16062v;
        }
        return z;
    }
}
