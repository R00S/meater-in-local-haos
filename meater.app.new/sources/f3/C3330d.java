package f3;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* compiled from: ZipUtil.java */
/* renamed from: f3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3330d {

    /* compiled from: ZipUtil.java */
    /* renamed from: f3.d$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f41277a;

        /* renamed from: b, reason: collision with root package name */
        long f41278b;

        a() {
        }
    }

    static long a(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j10 = aVar.f41278b;
        randomAccessFile.seek(aVar.f41277a);
        byte[] bArr = new byte[16384];
        int i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
        while (i10 != -1) {
            crc32.update(bArr, 0, i10);
            j10 -= i10;
            if (j10 == 0) {
                break;
            }
            i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
        }
        return crc32.getValue();
    }

    static a b(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j10 = length - 22;
        if (j10 < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j11 = length - 65558;
        long j12 = j11 >= 0 ? j11 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j10);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f41278b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                aVar.f41277a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return aVar;
            }
            j10--;
        } while (j10 >= j12);
        throw new ZipException("End Of Central Directory signature not found");
    }

    static long c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return a(randomAccessFile, b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
