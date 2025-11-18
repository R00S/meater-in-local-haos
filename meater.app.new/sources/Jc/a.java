package Jc;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: CountingInputStream.java */
/* loaded from: classes3.dex */
public class a extends InputStream {

    /* renamed from: B, reason: collision with root package name */
    private final InputStream f7798B;

    /* renamed from: C, reason: collision with root package name */
    private int f7799C = 0;

    public a(InputStream inputStream) {
        this.f7798B = inputStream;
    }

    public int a() {
        return this.f7799C;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10 = this.f7798B.read();
        if (i10 != -1) {
            this.f7799C++;
        }
        return i10;
    }
}
