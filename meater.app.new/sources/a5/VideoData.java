package a5;

import com.apptionlabs.meater_app.data.JuicyVideo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: NewsVideoData.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR'\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"La5/b;", "", "", "title", "Ljava/util/ArrayList;", "Lcom/apptionlabs/meater_app/data/JuicyVideo;", "Lkotlin/collections/ArrayList;", "videos", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: a5.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class VideoData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ArrayList<JuicyVideo> videos;

    public VideoData(String title, ArrayList<JuicyVideo> videos) {
        C3862t.g(title, "title");
        C3862t.g(videos, "videos");
        this.title = title;
        this.videos = videos;
    }

    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ArrayList<JuicyVideo> b() {
        return this.videos;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoData)) {
            return false;
        }
        VideoData videoData = (VideoData) other;
        return C3862t.b(this.title, videoData.title) && C3862t.b(this.videos, videoData.videos);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.videos.hashCode();
    }

    public String toString() {
        return "VideoData(title=" + this.title + ", videos=" + this.videos + ")";
    }
}
