package com.bumptech.glide.load.p129n;

import android.util.Log;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5368d;
import com.bumptech.glide.p145r.C5587a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferEncoder.java */
/* renamed from: com.bumptech.glide.load.n.c */
/* loaded from: classes.dex */
public class C5451c implements InterfaceC5368d<ByteBuffer> {
    @Override // com.bumptech.glide.load.InterfaceC5368d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo10155a(ByteBuffer byteBuffer, File file, C5426i c5426i) throws Throwable {
        try {
            C5587a.m11017d(byteBuffer, file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e2);
            }
            return false;
        }
    }
}
