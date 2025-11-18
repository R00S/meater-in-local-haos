package p238d.p239a.p240a;

import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p241e.p307h.p308a.p309e0.InterfaceC9001b;
import p241e.p307h.p308a.p315k0.C9033c;

/* compiled from: OkHttp3Connection.java */
/* renamed from: d.a.a.a */
/* loaded from: classes.dex */
public class C8769a implements InterfaceC9001b {

    /* renamed from: a */
    final OkHttpClient f33281a;

    /* renamed from: b */
    private final Request.Builder f33282b;

    /* renamed from: c */
    private Request f33283c;

    /* renamed from: d */
    private Response f33284d;

    /* compiled from: OkHttp3Connection.java */
    /* renamed from: d.a.a.a$a */
    public static class a implements C9033c.b {

        /* renamed from: a */
        private OkHttpClient f33285a;

        /* renamed from: b */
        private OkHttpClient.Builder f33286b;

        public a() {
        }

        @Override // p241e.p307h.p308a.p315k0.C9033c.b
        /* renamed from: a */
        public InterfaceC9001b mo27919a(String str) throws IOException {
            if (this.f33285a == null) {
                synchronized (a.class) {
                    if (this.f33285a == null) {
                        OkHttpClient.Builder builder = this.f33286b;
                        this.f33285a = builder != null ? builder.build() : new OkHttpClient();
                        this.f33286b = null;
                    }
                }
            }
            return new C8769a(str, this.f33285a);
        }

        public a(OkHttpClient.Builder builder) {
            this.f33286b = builder;
        }
    }

    C8769a(Request.Builder builder, OkHttpClient okHttpClient) {
        this.f33282b = builder;
        this.f33281a = okHttpClient;
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: a */
    public InputStream mo27910a() throws IOException {
        Response response = this.f33284d;
        if (response == null) {
            throw new IOException("Please invoke #execute first!");
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null) {
            return responseBodyBody.byteStream();
        }
        throw new IOException("No body found on response!");
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: b */
    public Map<String, List<String>> mo27911b() {
        Response response = this.f33284d;
        if (response == null) {
            return null;
        }
        return response.headers().toMultimap();
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: c */
    public boolean mo27912c(String str, long j2) {
        return false;
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: d */
    public int mo27913d() throws IOException {
        Response response = this.f33284d;
        if (response != null) {
            return response.code();
        }
        throw new IllegalStateException("Please invoke #execute first!");
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: e */
    public String mo27914e(String str) {
        Response response = this.f33284d;
        if (response == null) {
            return null;
        }
        return response.header(str);
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    public void execute() throws IOException {
        if (this.f33283c == null) {
            this.f33283c = this.f33282b.build();
        }
        this.f33284d = this.f33281a.newCall(this.f33283c).execute();
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: f */
    public void mo27915f(String str, String str2) {
        this.f33282b.addHeader(str, str2);
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: g */
    public void mo27916g() {
        this.f33283c = null;
        this.f33284d = null;
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: h */
    public boolean mo27917h(String str) throws ProtocolException {
        this.f33282b.method(str, null);
        return true;
    }

    @Override // p241e.p307h.p308a.p309e0.InterfaceC9001b
    /* renamed from: i */
    public Map<String, List<String>> mo27918i() {
        if (this.f33283c == null) {
            this.f33283c = this.f33282b.build();
        }
        return this.f33283c.headers().toMultimap();
    }

    public C8769a(String str, OkHttpClient okHttpClient) {
        this(new Request.Builder().url(str), okHttpClient);
    }
}
