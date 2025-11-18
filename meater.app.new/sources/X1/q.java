package X1;

import U1.C1733i;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: MediaFormatUtil.java */
/* loaded from: classes.dex */
public final class q {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, C1733i c1733i) {
        if (c1733i != null) {
            d(mediaFormat, "color-transfer", c1733i.f17062c);
            d(mediaFormat, "color-standard", c1733i.f17060a);
            d(mediaFormat, "color-range", c1733i.f17061b);
            a(mediaFormat, "hdr-static-info", c1733i.f17063d);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap(list.get(i10)));
        }
    }
}
