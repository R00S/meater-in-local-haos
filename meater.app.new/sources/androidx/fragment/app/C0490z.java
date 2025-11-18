package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter.java */
/* renamed from: androidx.fragment.app.z */
/* loaded from: classes.dex */
final class C0490z extends Writer {

    /* renamed from: f */
    private final String f3416f;

    /* renamed from: g */
    private StringBuilder f3417g = new StringBuilder(128);

    C0490z(String str) {
        this.f3416f = str;
    }

    /* renamed from: a */
    private void m3809a() {
        if (this.f3417g.length() > 0) {
            Log.d(this.f3416f, this.f3417g.toString());
            StringBuilder sb = this.f3417g;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m3809a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m3809a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                m3809a();
            } else {
                this.f3417g.append(c2);
            }
        }
    }
}
