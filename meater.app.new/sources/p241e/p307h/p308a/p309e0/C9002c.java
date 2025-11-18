package p241e.p307h.p308a.p309e0;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import p241e.p307h.p308a.p315k0.C9033c;

/* compiled from: FileDownloadUrlConnection.java */
/* renamed from: e.h.a.e0.c */
/* loaded from: classes2.dex */
public class C9002c implements InterfaceC9001b {

    /* renamed from: a */
    protected URLConnection f34637a;

    /* compiled from: FileDownloadUrlConnection.java */
    /* renamed from: e.h.a.e0.c$a */
    public static class a {
        /* renamed from: a */
        static /* synthetic */ Proxy m28718a(a aVar) {
            throw null;
        }

        /* renamed from: b */
        static /* synthetic */ Integer m28719b(a aVar) {
            throw null;
        }

        /* renamed from: c */
        static /* synthetic */ Integer m28720c(a aVar) {
            throw null;
        }
    }

    /* compiled from: FileDownloadUrlConnection.java */
    /* renamed from: e.h.a.e0.c$b */
    public static class b implements C9033c.b {

        /* renamed from: a */
        private final a f34638a;

        public b() {
            this(null);
        }

        @Override // p241e.p307h.p308a.p315k0.C9033c.b
        /* renamed from: a */
        public InterfaceC9001b mo27919a(String str) throws IOException {
            return new C9002c(str, this.f34638a);
        }

        public b(a aVar) {
        }
    }

    public C9002c(String str, a aVar) throws IOException {
        this(new URL(str), aVar);
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: a */
    public InputStream mo27910a() throws IOException {
        return this.f34637a.getInputStream();
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: b */
    public Map<String, List<String>> mo27911b() {
        return this.f34637a.getHeaderFields();
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: c */
    public boolean mo27912c(String str, long j2) {
        return false;
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: d */
    public int mo27913d() throws IOException {
        URLConnection uRLConnection = this.f34637a;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: e */
    public String mo27914e(String str) {
        return this.f34637a.getHeaderField(str);
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    public void execute() throws IOException {
        this.f34637a.connect();
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: f */
    public void mo27915f(String str, String str2) {
        this.f34637a.addRequestProperty(str, str2);
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: g */
    public void mo27916g() throws IOException {
        try {
            this.f34637a.getInputStream().close();
        } catch (IOException unused) {
        }
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: h */
    public boolean mo27917h(String str) throws ProtocolException {
        URLConnection uRLConnection = this.f34637a;
        if (!(uRLConnection instanceof HttpURLConnection)) {
            return false;
        }
        ((HttpURLConnection) uRLConnection).setRequestMethod(str);
        return true;
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: i */
    public Map<String, List<String>> mo27918i() {
        return this.f34637a.getRequestProperties();
    }

    public C9002c(URL url, a aVar) throws IOException {
        if (aVar == null || a.m28718a(aVar) == null) {
            this.f34637a = url.openConnection();
        } else {
            this.f34637a = url.openConnection(a.m28718a(aVar));
        }
        if (aVar != null) {
            if (a.m28719b(aVar) != null) {
                this.f34637a.setReadTimeout(a.m28719b(aVar).intValue());
            }
            if (a.m28720c(aVar) != null) {
                this.f34637a.setConnectTimeout(a.m28720c(aVar).intValue());
            }
        }
    }
}
