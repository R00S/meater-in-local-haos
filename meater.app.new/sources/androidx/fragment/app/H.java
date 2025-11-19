package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
final class H extends Writer {

    /* renamed from: B, reason: collision with root package name */
    private final String f25554B;

    /* renamed from: C, reason: collision with root package name */
    private StringBuilder f25555C = new StringBuilder(128);

    H(String str) {
        this.f25554B = str;
    }

    private void a() {
        if (this.f25555C.length() > 0) {
            Log.d(this.f25554B, this.f25555C.toString());
            StringBuilder sb2 = this.f25555C;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f25555C.append(c10);
            }
        }
    }
}
