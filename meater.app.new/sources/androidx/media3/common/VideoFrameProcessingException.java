package androidx.media3.common;

/* loaded from: classes.dex */
public final class VideoFrameProcessingException extends Exception {

    /* renamed from: B, reason: collision with root package name */
    public final long f26037B;

    public VideoFrameProcessingException(Throwable th, long j10) {
        super(th);
        this.f26037B = j10;
    }

    public static VideoFrameProcessingException a(Exception exc) {
        return b(exc, -9223372036854775807L);
    }

    public static VideoFrameProcessingException b(Exception exc, long j10) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc, j10);
    }
}
