package cm.aptoide.p092pt.app.view.screenshots;

import android.net.Uri;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ScreenShotClickEvent {
    private final ArrayList<String> imagesUris;
    private final int index;
    private final Uri uri;

    public ScreenShotClickEvent(ArrayList<String> arrayList, int i2) {
        this.imagesUris = arrayList;
        this.index = i2;
        this.uri = Uri.EMPTY;
    }

    public int getImagesIndex() {
        return this.index;
    }

    public ArrayList<String> getImagesUris() {
        return this.imagesUris;
    }

    public Uri getUri() {
        return this.uri;
    }

    public boolean isVideo() {
        return this.uri != Uri.EMPTY;
    }

    public ScreenShotClickEvent(Uri uri) {
        this.imagesUris = new ArrayList<>();
        this.index = -1;
        this.uri = uri;
    }
}
