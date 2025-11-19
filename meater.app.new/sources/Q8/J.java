package Q8;

import T8.F;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: FileBackedNativeSessionFile.java */
/* loaded from: classes2.dex */
class J implements O {

    /* renamed from: a, reason: collision with root package name */
    private final File f14405a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14406b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14407c;

    J(String str, String str2, File file) {
        this.f14406b = str;
        this.f14407c = str2;
        this.f14405a = file;
    }

    private byte[] a() throws IOException {
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamK = k();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamK == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (inputStreamK != null) {
                            inputStreamK.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i10 = inputStreamK.read(bArr);
                            if (i10 <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                inputStreamK.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i10);
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // Q8.O
    public InputStream k() {
        if (this.f14405a.exists() && this.f14405a.isFile()) {
            try {
                return new FileInputStream(this.f14405a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // Q8.O
    public String l() {
        return this.f14407c;
    }

    @Override // Q8.O
    public F.d.b m() throws IOException {
        byte[] bArrA = a();
        if (bArrA != null) {
            return F.d.b.a().b(bArrA).c(this.f14406b).a();
        }
        return null;
    }
}
