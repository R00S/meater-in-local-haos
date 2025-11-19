package androidx.media3.exoplayer.drm;

/* loaded from: classes.dex */
public final class UnsupportedDrmException extends Exception {

    /* renamed from: B, reason: collision with root package name */
    public final int f27111B;

    public UnsupportedDrmException(int i10) {
        this.f27111B = i10;
    }

    public UnsupportedDrmException(int i10, Exception exc) {
        super(exc);
        this.f27111B = i10;
    }
}
