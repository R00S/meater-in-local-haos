package y6;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;
import p6.InterfaceC4237b;

/* compiled from: StreamGifDecoder.java */
/* loaded from: classes2.dex */
public class j implements InterfaceC3974i<InputStream, C5131c> {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f53191a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3974i<ByteBuffer, C5131c> f53192b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4237b f53193c;

    public j(List<ImageHeaderParser> list, InterfaceC3974i<ByteBuffer, C5131c> interfaceC3974i, InterfaceC4237b interfaceC4237b) {
        this.f53191a = list;
        this.f53192b = interfaceC3974i;
        this.f53193c = interfaceC4237b;
    }

    private static byte[] e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            return null;
        }
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4139c<C5131c> a(InputStream inputStream, int i10, int i11, C3972g c3972g) throws IOException {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f53192b.a(ByteBuffer.wrap(bArrE), i10, i11, c3972g);
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, C3972g c3972g) {
        return !((Boolean) c3972g.c(i.f53190b)).booleanValue() && com.bumptech.glide.load.a.f(this.f53191a, inputStream, this.f53193c) == ImageHeaderParser.ImageType.GIF;
    }
}
