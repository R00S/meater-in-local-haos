package cm.aptoide.aptoideviews.video;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import kotlin.Metadata;

/* compiled from: WebChromeClientWithoutPlayerPlaceholder.kt */
@Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0005"}, m32267d2 = {"Lcm/aptoide/aptoideviews/video/WebChromeClientWithoutPlayerPlaceholder;", "Landroid/webkit/WebChromeClient;", "()V", "getDefaultVideoPoster", "Landroid/graphics/Bitmap;", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class WebChromeClientWithoutPlayerPlaceholder extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }
}
