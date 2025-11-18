package f6;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00020\fj\b\u0012\u0004\u0012\u00020\u0002`\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u001a"}, d2 = {"Lf6/p;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "d", "()Ljava/util/ArrayList;", "videos", "b", "I", "c", "statusCode", "Ljava/lang/String;", "error", "message", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f6.p, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class WatchedVideosResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("watched_tutorials")
    private final ArrayList<String> videos;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("statusCode")
    private final int statusCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("error")
    private final String error;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("message")
    private final String message;

    /* renamed from: a, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public final ArrayList<String> d() {
        return this.videos;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchedVideosResponse)) {
            return false;
        }
        WatchedVideosResponse watchedVideosResponse = (WatchedVideosResponse) other;
        return C3862t.b(this.videos, watchedVideosResponse.videos) && this.statusCode == watchedVideosResponse.statusCode && C3862t.b(this.error, watchedVideosResponse.error) && C3862t.b(this.message, watchedVideosResponse.message);
    }

    public int hashCode() {
        return (((((this.videos.hashCode() * 31) + Integer.hashCode(this.statusCode)) * 31) + this.error.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "WatchedVideosResponse(videos=" + this.videos + ", statusCode=" + this.statusCode + ", error=" + this.error + ", message=" + this.message + ")";
    }
}
