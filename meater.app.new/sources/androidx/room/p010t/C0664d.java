package androidx.room.p010t;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* compiled from: FileUtil.java */
/* renamed from: androidx.room.t.d */
/* loaded from: classes.dex */
public class C0664d {
    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public static void m4677a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream inputStreamNewInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream outputStreamNewOutputStream = Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT];
                while (true) {
                    int i2 = inputStreamNewInputStream.read(bArr);
                    if (i2 <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i2);
                    }
                }
            } else {
                fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            }
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
