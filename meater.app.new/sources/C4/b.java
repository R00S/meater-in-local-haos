package C4;

import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Random;
import x4.g;

/* compiled from: FirmwareUpdateWebserver.java */
/* loaded from: classes.dex */
public class b extends NanoHTTPD {

    /* renamed from: s, reason: collision with root package name */
    public static int f2150s;

    /* renamed from: n, reason: collision with root package name */
    int f2151n;

    /* renamed from: o, reason: collision with root package name */
    private final C4.a f2152o;

    /* renamed from: p, reason: collision with root package name */
    private ByteBuffer f2153p;

    /* renamed from: q, reason: collision with root package name */
    private final NanoHTTPD.m f2154q;

    /* renamed from: r, reason: collision with root package name */
    private InterfaceC0044b f2155r;

    /* compiled from: FirmwareUpdateWebserver.java */
    private class a extends NanoHTTPD.m {
        protected a(NanoHTTPD.m.b bVar, String str, InputStream inputStream, long j10, C4.a aVar) {
            super(bVar, str, inputStream, j10);
            U4.b.b("Bytes: " + j10, new Object[0]);
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.m, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            if (b.this.f2155r == null) {
                U4.b.c("OTA DownloadResponse close method call back null ", new Object[0]);
            } else {
                b.this.f2155r.c();
                U4.b.b("OTA DownloadResponse close method  ", new Object[0]);
            }
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.m
        public void p(long j10, long j11) {
            super.p(j10, j11);
            if (b.this.f2155r == null) {
                U4.b.c("FirmwareUpdateWebserver>> OTA uploadProgress call back null  ", new Object[0]);
            } else {
                U4.b.c("FirmwareUpdateWebserver>> OTA uploadProgress  ", new Object[0]);
                b.this.f2155r.b(j10, j11);
            }
        }
    }

    /* compiled from: FirmwareUpdateWebserver.java */
    /* renamed from: C4.b$b, reason: collision with other inner class name */
    public interface InterfaceC0044b {
        void a();

        void b(long j10, long j11);

        void c();

        void d();

        void e(String str);
    }

    public b(InterfaceC0044b interfaceC0044b, ByteBuffer byteBuffer, int i10) {
        super(i10);
        this.f2154q = null;
        this.f2151n = i10;
        this.f2155r = interfaceC0044b;
        this.f2152o = new C4.a();
        this.f2153p = byteBuffer;
    }

    public static int G() {
        return new Random().nextInt(1000) + 8000;
    }

    public void E() {
        this.f2155r = null;
    }

    public int F() {
        return this.f2151n;
    }

    @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD
    public NanoHTTPD.m t(NanoHTTPD.k kVar) {
        InterfaceC0044b interfaceC0044b = this.f2155r;
        if (interfaceC0044b != null) {
            interfaceC0044b.d();
        } else {
            U4.b.c("OTA Response serve call back null ", new Object[0]);
        }
        try {
            return new a(NanoHTTPD.m.c.OK, "application/octet-stream", new ByteArrayInputStream(this.f2153p.array()), r6.available(), this.f2152o);
        } catch (Exception e10) {
            U4.b.b("Failed to read firmware image.", new Object[0]);
            U4.b.b(e10.getStackTrace().toString(), new Object[0]);
            InterfaceC0044b interfaceC0044b2 = this.f2155r;
            if (interfaceC0044b2 != null) {
                interfaceC0044b2.e(e10.getMessage());
            }
            return NanoHTTPD.r(NanoHTTPD.m.c.INTERNAL_ERROR, "text/plain", "Something went wrong");
        }
    }

    @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD
    public void x() {
        try {
            int i10 = f2150s;
            if (i10 > 2) {
                U4.b.c("ALREADY ATTEMPTED 3 Times, Server starting OTA start() startServerAttempts %s ", Integer.valueOf(i10));
                this.f2155r.e(g.h().getString(R.string.error_text_something_went_wrong));
            } else {
                U4.b.c("Server starting OTA start()  startServerAttempts %s ", Integer.valueOf(i10));
                f2150s++;
                super.x();
            }
        } catch (Exception e10) {
            InterfaceC0044b interfaceC0044b = this.f2155r;
            if (interfaceC0044b == null) {
                U4.b.c("Server starting Exception e  %s and call back is null", e10.getLocalizedMessage());
            } else {
                interfaceC0044b.a();
                U4.b.b(e10.getStackTrace().toString(), new Object[0]);
            }
        }
    }
}
