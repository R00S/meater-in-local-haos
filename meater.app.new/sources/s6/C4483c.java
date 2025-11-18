package s6;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import m6.C3972g;
import m6.InterfaceC3969d;

/* compiled from: ByteBufferEncoder.java */
/* renamed from: s6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4483c implements InterfaceC3969d<ByteBuffer> {
    @Override // m6.InterfaceC3969d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, File file, C3972g c3972g) throws Throwable {
        try {
            H6.a.f(byteBuffer, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }
}
