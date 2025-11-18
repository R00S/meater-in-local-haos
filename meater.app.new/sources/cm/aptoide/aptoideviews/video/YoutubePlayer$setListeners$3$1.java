package cm.aptoide.aptoideviews.video;

import cm.aptoide.aptoideviews.C1103R;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;

/* compiled from: YoutubePlayer.kt */
@Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "videoId", HttpUrl.FRAGMENT_ENCODE_SET, "enableSubtitles", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
final class YoutubePlayer$setListeners$3$1 extends Lambda implements Function2<String, Boolean, C10775u> {
    final /* synthetic */ YoutubePlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YoutubePlayer$setListeners$3$1(YoutubePlayer youtubePlayer) {
        super(2);
        this.this$0 = youtubePlayer;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ C10775u invoke(String str, Boolean bool) {
        invoke(str, bool.booleanValue());
        return C10775u.f41439a;
    }

    public final void invoke(String str, boolean z) {
        C9801m.m32346f(str, "videoId");
        ((YoutubeWebViewPlayer) this.this$0._$_findCachedViewById(C1103R.id.webview)).loadVideo(str, z);
    }
}
