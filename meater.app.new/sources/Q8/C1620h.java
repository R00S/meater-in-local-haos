package Q8;

import T8.F;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: BytesBackedNativeSessionFile.java */
/* renamed from: Q8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C1620h implements O {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14452a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14453b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14454c;

    C1620h(String str, String str2, byte[] bArr) {
        this.f14453b = str;
        this.f14454c = str2;
        this.f14452a = bArr;
    }

    private byte[] a() throws IOException {
        if (b()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f14452a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean b() {
        byte[] bArr = this.f14452a;
        return bArr == null || bArr.length == 0;
    }

    @Override // Q8.O
    public InputStream k() {
        if (b()) {
            return null;
        }
        return new ByteArrayInputStream(this.f14452a);
    }

    @Override // Q8.O
    public String l() {
        return this.f14454c;
    }

    @Override // Q8.O
    public F.d.b m() throws IOException {
        byte[] bArrA = a();
        if (bArrA == null) {
            return null;
        }
        return F.d.b.a().b(bArrA).c(this.f14453b).a();
    }
}
