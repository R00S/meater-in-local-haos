package com.bumptech.glide.load.p131o.p132c;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import com.bumptech.glide.p145r.C5596j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import okhttp3.internal.http2.Settings;

/* compiled from: DefaultImageHeaderParser.java */
/* renamed from: com.bumptech.glide.load.o.c.j */
/* loaded from: classes.dex */
public final class C5489j implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f13722a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f13723b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* compiled from: DefaultImageHeaderParser.java */
    /* renamed from: com.bumptech.glide.load.o.c.j$a */
    private static final class a implements c {

        /* renamed from: a */
        private final ByteBuffer f13724a;

        a(ByteBuffer byteBuffer) {
            this.f13724a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5489j.c
        /* renamed from: a */
        public int mo10619a() {
            return ((mo10622d() << 8) & 65280) | (mo10622d() & 255);
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5489j.c
        /* renamed from: b */
        public int mo10620b(byte[] bArr, int i2) {
            int iMin = Math.min(i2, this.f13724a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f13724a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5489j.c
        /* renamed from: c */
        public short mo10621c() {
            return (short) (mo10622d() & 255);
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5489j.c
        /* renamed from: d */
        public int mo10622d() {
            if (this.f13724a.remaining() < 1) {
                return -1;
            }
            return this.f13724a.get();
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5489j.c
        public long skip(long j2) {
            int iMin = (int) Math.min(this.f13724a.remaining(), j2);
            ByteBuffer byteBuffer = this.f13724a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* renamed from: com.bumptech.glide.load.o.c.j$b */
    private static final class b {

        /* renamed from: a */
        private final ByteBuffer f13725a;

        b(byte[] bArr, int i2) {
            this.f13725a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i2);
        }

        /* renamed from: c */
        private boolean m10623c(int i2, int i3) {
            return this.f13725a.remaining() - i2 >= i3;
        }

        /* renamed from: a */
        short m10624a(int i2) {
            if (m10623c(i2, 2)) {
                return this.f13725a.getShort(i2);
            }
            return (short) -1;
        }

        /* renamed from: b */
        int m10625b(int i2) {
            if (m10623c(i2, 4)) {
                return this.f13725a.getInt(i2);
            }
            return -1;
        }

        /* renamed from: d */
        int m10626d() {
            return this.f13725a.remaining();
        }

        /* renamed from: e */
        void m10627e(ByteOrder byteOrder) {
            this.f13725a.order(byteOrder);
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* renamed from: com.bumptech.glide.load.o.c.j$c */
    private interface c {
        /* renamed from: a */
        int mo10619a() throws IOException;

        /* renamed from: b */
        int mo10620b(byte[] bArr, int i2) throws IOException;

        /* renamed from: c */
        short mo10621c() throws IOException;

        /* renamed from: d */
        int mo10622d() throws IOException;

        long skip(long j2) throws IOException;
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* renamed from: com.bumptech.glide.load.o.c.j$d */
    private static final class d implements c {

        /* renamed from: a */
        private final InputStream f13726a;

        d(InputStream inputStream) {
            this.f13726a = inputStream;
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5489j.c
        /* renamed from: a */
        public int mo10619a() throws IOException {
            return ((this.f13726a.read() << 8) & 65280) | (this.f13726a.read() & 255);
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5489j.c
        /* renamed from: b */
        public int mo10620b(byte[] bArr, int i2) throws IOException {
            int i3 = i2;
            while (i3 > 0) {
                int i4 = this.f13726a.read(bArr, i2 - i3, i3);
                if (i4 == -1) {
                    break;
                }
                i3 -= i4;
            }
            return i2 - i3;
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5489j.c
        /* renamed from: c */
        public short mo10621c() throws IOException {
            return (short) (this.f13726a.read() & 255);
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5489j.c
        /* renamed from: d */
        public int mo10622d() throws IOException {
            return this.f13726a.read();
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5489j.c
        public long skip(long j2) throws IOException {
            if (j2 < 0) {
                return 0L;
            }
            long j3 = j2;
            while (j3 > 0) {
                long jSkip = this.f13726a.skip(j3);
                if (jSkip <= 0) {
                    if (this.f13726a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j3 -= jSkip;
            }
            return j2 - j3;
        }
    }

    /* renamed from: d */
    private static int m10611d(int i2, int i3) {
        return i2 + 2 + (i3 * 12);
    }

    /* renamed from: e */
    private int m10612e(c cVar, InterfaceC5410b interfaceC5410b) throws IOException {
        int iMo10619a = cVar.mo10619a();
        if (!m10614g(iMo10619a)) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo10619a);
            }
            return -1;
        }
        int iM10616i = m10616i(cVar);
        if (iM10616i == -1) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        byte[] bArr = (byte[]) interfaceC5410b.mo10369e(iM10616i, byte[].class);
        try {
            return m10618k(cVar, bArr, iM10616i);
        } finally {
            interfaceC5410b.mo10368d(bArr);
        }
    }

    /* renamed from: f */
    private ImageHeaderParser.ImageType m10613f(c cVar) throws IOException {
        int iMo10619a = cVar.mo10619a();
        if (iMo10619a == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int iMo10619a2 = ((iMo10619a << 16) & (-65536)) | (cVar.mo10619a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        if (iMo10619a2 == -1991225785) {
            cVar.skip(21L);
            return cVar.mo10622d() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        }
        if ((iMo10619a2 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        }
        if (iMo10619a2 != 1380533830) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        cVar.skip(4L);
        if ((((cVar.mo10619a() << 16) & (-65536)) | (cVar.mo10619a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != 1464156752) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iMo10619a3 = ((cVar.mo10619a() << 16) & (-65536)) | (cVar.mo10619a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        if ((iMo10619a3 & (-256)) != 1448097792) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int i2 = iMo10619a3 & 255;
        if (i2 == 88) {
            cVar.skip(4L);
            return (cVar.mo10622d() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        }
        if (i2 != 76) {
            return ImageHeaderParser.ImageType.WEBP;
        }
        cVar.skip(4L);
        return (cVar.mo10622d() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
    }

    /* renamed from: g */
    private static boolean m10614g(int i2) {
        return (i2 & 65496) == 65496 || i2 == 19789 || i2 == 18761;
    }

    /* renamed from: h */
    private boolean m10615h(byte[] bArr, int i2) {
        boolean z = bArr != null && i2 > f13722a.length;
        if (z) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = f13722a;
                if (i3 >= bArr2.length) {
                    break;
                }
                if (bArr[i3] != bArr2[i3]) {
                    return false;
                }
                i3++;
            }
        }
        return z;
    }

    /* renamed from: i */
    private int m10616i(c cVar) throws IOException {
        short sMo10621c;
        int iMo10619a;
        long j2;
        long jSkip;
        do {
            short sMo10621c2 = cVar.mo10621c();
            if (sMo10621c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo10621c2));
                }
                return -1;
            }
            sMo10621c = cVar.mo10621c();
            if (sMo10621c == 218) {
                return -1;
            }
            if (sMo10621c == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iMo10619a = cVar.mo10619a() - 2;
            if (sMo10621c == 225) {
                return iMo10619a;
            }
            j2 = iMo10619a;
            jSkip = cVar.skip(j2);
        } while (jSkip == j2);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sMo10621c) + ", wanted to skip: " + iMo10619a + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    /* renamed from: j */
    private static int m10617j(b bVar) {
        ByteOrder byteOrder;
        short sM10624a = bVar.m10624a(6);
        if (sM10624a != 18761) {
            if (sM10624a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sM10624a));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.m10627e(byteOrder);
        int iM10625b = bVar.m10625b(10) + 6;
        short sM10624a2 = bVar.m10624a(iM10625b);
        for (int i2 = 0; i2 < sM10624a2; i2++) {
            int iM10611d = m10611d(iM10625b, i2);
            short sM10624a3 = bVar.m10624a(iM10611d);
            if (sM10624a3 == 274) {
                short sM10624a4 = bVar.m10624a(iM10611d + 2);
                if (sM10624a4 >= 1 && sM10624a4 <= 12) {
                    int iM10625b2 = bVar.m10625b(iM10611d + 4);
                    if (iM10625b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i2 + " tagType=" + ((int) sM10624a3) + " formatCode=" + ((int) sM10624a4) + " componentCount=" + iM10625b2);
                        }
                        int i3 = iM10625b2 + f13723b[sM10624a4];
                        if (i3 <= 4) {
                            int i4 = iM10611d + 8;
                            if (i4 >= 0 && i4 <= bVar.m10626d()) {
                                if (i3 >= 0 && i3 + i4 <= bVar.m10626d()) {
                                    return bVar.m10624a(i4);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sM10624a3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i4 + " tagType=" + ((int) sM10624a3));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sM10624a4));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sM10624a4));
                }
            }
        }
        return -1;
    }

    /* renamed from: k */
    private int m10618k(c cVar, byte[] bArr, int i2) throws IOException {
        int iMo10620b = cVar.mo10620b(bArr, i2);
        if (iMo10620b == i2) {
            if (m10615h(bArr, i2)) {
                return m10617j(new b(bArr, i2));
            }
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i2 + ", actually read: " + iMo10620b);
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo10152a(ByteBuffer byteBuffer) throws IOException {
        return m10613f(new a((ByteBuffer) C5596j.m11042d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo10153b(InputStream inputStream) throws IOException {
        return m10613f(new d((InputStream) C5596j.m11042d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo10154c(InputStream inputStream, InterfaceC5410b interfaceC5410b) throws IOException {
        return m10612e(new d((InputStream) C5596j.m11042d(inputStream)), (InterfaceC5410b) C5596j.m11042d(interfaceC5410b));
    }
}
