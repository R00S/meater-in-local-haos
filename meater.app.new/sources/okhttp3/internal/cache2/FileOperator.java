package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p353j.C9703f;

/* compiled from: FileOperator.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\tR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m32267d2 = {"Lokhttp3/internal/cache2/FileOperator;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "pos", "Lj/f;", "source", "byteCount", "Lkotlin/u;", "write", "(JLj/f;J)V", "sink", "read", "Ljava/nio/channels/FileChannel;", "fileChannel", "Ljava/nio/channels/FileChannel;", "<init>", "(Ljava/nio/channels/FileChannel;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        C9801m.m32346f(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long pos, C9703f sink, long byteCount) throws IOException {
        C9801m.m32346f(sink, "sink");
        if (byteCount < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (byteCount > 0) {
            long jTransferTo = this.fileChannel.transferTo(pos, byteCount, sink);
            pos += jTransferTo;
            byteCount -= jTransferTo;
        }
    }

    public final void write(long pos, C9703f source, long byteCount) throws IOException {
        C9801m.m32346f(source, "source");
        if (byteCount < 0 || byteCount > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j2 = pos;
        long j3 = byteCount;
        while (j3 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, j2, j3);
            j2 += jTransferFrom;
            j3 -= jTransferFrom;
        }
    }
}
