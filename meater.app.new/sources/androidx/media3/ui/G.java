package androidx.media3.ui;

/* compiled from: TimeBar.java */
/* loaded from: classes.dex */
public interface G {

    /* compiled from: TimeBar.java */
    public interface a {
        void D(G g10, long j10);

        void I(G g10, long j10);

        void L(G g10, long j10, boolean z10);
    }

    void a(a aVar);

    void b(long[] jArr, boolean[] zArr, int i10);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
