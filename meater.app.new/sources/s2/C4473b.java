package s2;

import X1.C1804a;
import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* compiled from: SntpClient.java */
/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4473b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f49232a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f49233b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f49234c = false;

    /* renamed from: d, reason: collision with root package name */
    private static long f49235d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static String f49236e = "time.android.com";

    /* renamed from: f, reason: collision with root package name */
    private static int f49237f = 1000;

    /* renamed from: g, reason: collision with root package name */
    private static long f49238g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private static long f49239h = -9223372036854775807L;

    /* compiled from: SntpClient.java */
    /* renamed from: s2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0693b {
        void a(IOException iOException);

        void b();
    }

    private static void h(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    public static long i() {
        long j10;
        synchronized (f49233b) {
            try {
                j10 = f49234c ? f49235d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j10;
    }

    public static String j() {
        String str;
        synchronized (f49233b) {
            str = f49236e;
        }
        return str;
    }

    public static int k() {
        int i10;
        synchronized (f49233b) {
            i10 = f49237f;
        }
        return i10;
    }

    public static void l(Loader loader, InterfaceC0693b interfaceC0693b) {
        if (m()) {
            if (interfaceC0693b != null) {
                interfaceC0693b.b();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.n(new d(), new c(interfaceC0693b), 1);
        }
    }

    public static boolean m() {
        boolean z10;
        synchronized (f49233b) {
            try {
                if (f49239h != -9223372036854775807L && f49238g != -9223372036854775807L) {
                    f49234c = f49234c && SystemClock.elapsedRealtime() - f49239h < f49238g;
                }
                z10 = f49234c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long n() {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(k());
            InetAddress[] allByName = InetAddress.getAllByName(j());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i10], 123);
                bArr[0] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                q(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j10 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b10 = bArr[0];
                    int i12 = bArr[1] & 255;
                    long jP = p(bArr, 24);
                    long jP2 = p(bArr, 32);
                    long jP3 = p(bArr, 40);
                    h((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i12, jP3);
                    long j11 = (j10 + (((jP2 - jP) + (jP3 - j10)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j11;
                } catch (SocketTimeoutException e10) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e10;
                    } else {
                        socketTimeoutException.addSuppressed(e10);
                    }
                    int i13 = i11 + 1;
                    if (i11 >= 10) {
                        break;
                    }
                    i10++;
                    i11 = i13;
                }
            }
            throw ((SocketTimeoutException) C1804a.e(socketTimeoutException));
        } finally {
        }
    }

    private static long o(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    private static long p(byte[] bArr, int i10) {
        long jO = o(bArr, i10);
        long jO2 = o(bArr, i10 + 4);
        if (jO == 0 && jO2 == 0) {
            return 0L;
        }
        return ((jO - 2208988800L) * 1000) + ((jO2 * 1000) / 4294967296L);
    }

    private static void q(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        bArr[i10] = (byte) (r2 >> 24);
        bArr[i10 + 1] = (byte) (r2 >> 16);
        bArr[i10 + 2] = (byte) (r2 >> 8);
        bArr[i10 + 3] = (byte) (j11 + 2208988800L);
        long j13 = (j12 * 4294967296L) / 1000;
        bArr[i10 + 4] = (byte) (j13 >> 24);
        bArr[i10 + 5] = (byte) (j13 >> 16);
        bArr[i10 + 6] = (byte) (j13 >> 8);
        bArr[i10 + 7] = (byte) (Math.random() * 255.0d);
    }

    /* compiled from: SntpClient.java */
    /* renamed from: s2.b$d */
    private static final class d implements Loader.e {
        private d() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void a() {
            synchronized (C4473b.f49232a) {
                synchronized (C4473b.f49233b) {
                    if (C4473b.f49234c) {
                        return;
                    }
                    long jN = C4473b.n();
                    synchronized (C4473b.f49233b) {
                        long unused = C4473b.f49239h = SystemClock.elapsedRealtime();
                        long unused2 = C4473b.f49235d = jN;
                        boolean unused3 = C4473b.f49234c = true;
                    }
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void b() {
        }
    }

    /* compiled from: SntpClient.java */
    /* renamed from: s2.b$c */
    private static final class c implements Loader.b<Loader.e> {

        /* renamed from: B, reason: collision with root package name */
        private final InterfaceC0693b f49240B;

        public c(InterfaceC0693b interfaceC0693b) {
            this.f49240B = interfaceC0693b;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        public Loader.c k(Loader.e eVar, long j10, long j11, IOException iOException, int i10) {
            InterfaceC0693b interfaceC0693b = this.f49240B;
            if (interfaceC0693b != null) {
                interfaceC0693b.a(iOException);
            }
            return Loader.f27841f;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        public void t(Loader.e eVar, long j10, long j11) {
            if (this.f49240B != null) {
                if (C4473b.m()) {
                    this.f49240B.b();
                } else {
                    this.f49240B.a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        public void v(Loader.e eVar, long j10, long j11, boolean z10) {
        }
    }
}
