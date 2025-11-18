package p024c.p078r;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Stream;

/* compiled from: ZipUtil.java */
/* renamed from: c.r.c */
/* loaded from: classes.dex */
final class C1000c {

    /* compiled from: ZipUtil.java */
    /* renamed from: c.r.c$a */
    static class a {

        /* renamed from: a */
        long f6611a;

        /* renamed from: b */
        long f6612b;

        a() {
        }
    }

    /* renamed from: a */
    static long m6378a(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j2 = aVar.f6612b;
        randomAccessFile.seek(aVar.f6611a);
        int iMin = (int) Math.min(Http2Stream.EMIT_BUFFER_SIZE, j2);
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        int i2 = randomAccessFile.read(bArr, 0, iMin);
        while (i2 != -1) {
            crc32.update(bArr, 0, i2);
            j2 -= i2;
            if (j2 == 0) {
                break;
            }
            i2 = randomAccessFile.read(bArr, 0, (int) Math.min(Http2Stream.EMIT_BUFFER_SIZE, j2));
        }
        return crc32.getValue();
    }

    /* renamed from: b */
    static a m6379b(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j2 = length - 65536;
        long j3 = j2 >= 0 ? j2 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f6612b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                aVar.f6611a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return aVar;
            }
            length--;
        } while (length >= j3);
        throw new ZipException("End Of Central Directory signature not found");
    }

    /* renamed from: c */
    static long m6380c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m6378a(randomAccessFile, m6379b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
