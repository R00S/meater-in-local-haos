package com.bumptech.glide.load.p129n;

import android.util.Log;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5368d;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamEncoder.java */
/* renamed from: com.bumptech.glide.load.n.t */
/* loaded from: classes.dex */
public class C5468t implements InterfaceC5368d<InputStream> {

    /* renamed from: a */
    private final InterfaceC5410b f13685a;

    public C5468t(InterfaceC5410b interfaceC5410b) {
        this.f13685a = interfaceC5410b;
    }

    @Override // com.bumptech.glide.load.InterfaceC5368d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo10155a(InputStream inputStream, File file, C5426i c5426i) throws Throwable {
        byte[] bArr = (byte[]) this.f13685a.mo10369e(65536, byte[].class);
        boolean z = false;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    while (true) {
                        try {
                            int i2 = inputStream.read(bArr);
                            if (i2 == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i2);
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            this.f13685a.mo10368d(bArr);
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.f13685a.mo10368d(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream2.close();
                    z = true;
                    fileOutputStream2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (IOException unused2) {
        }
        this.f13685a.mo10368d(bArr);
        return z;
    }
}
