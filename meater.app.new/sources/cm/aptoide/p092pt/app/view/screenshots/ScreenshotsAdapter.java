package cm.aptoide.p092pt.app.view.screenshots;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.app.AppScreenshot;
import cm.aptoide.p092pt.view.app.AppVideo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class ScreenshotsAdapter extends RecyclerView.AbstractC0594g<ScreenshotViewHolder> {
    private ArrayList<String> imageUris;
    private int itemHeightDp;
    private C11418b<ScreenShotClickEvent> screenShotClick;
    private List<AppScreenshot> screenshots;
    private List<AppVideo> videos;

    public ScreenshotsAdapter(List<AppScreenshot> list, List<AppVideo> list2, C11418b<ScreenShotClickEvent> c11418b) {
        this(list, list2, c11418b, -1);
    }

    private boolean isScreenShot(int i2) {
        List<AppScreenshot> list = this.screenshots;
        return list != null && i2 < list.size();
    }

    private boolean isVideo(int i2) {
        List<AppVideo> list = this.videos;
        return list != null && i2 < list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        List<AppVideo> list = this.videos;
        int size = list != null ? list.size() : 0;
        List<AppScreenshot> list2 = this.screenshots;
        return size + (list2 != null ? list2.size() : 0);
    }

    public void updateScreenshots(List<AppScreenshot> list) {
        this.screenshots = list;
        this.imageUris = new ArrayList<>(list.size());
        Iterator<AppScreenshot> it = list.iterator();
        while (it.hasNext()) {
            this.imageUris.add(it.next().getUrl());
        }
        notifyDataSetChanged();
    }

    public void updateVideos(List<AppVideo> list) {
        this.videos = list;
        notifyDataSetChanged();
    }

    public ScreenshotsAdapter(List<AppScreenshot> list, List<AppVideo> list2, C11418b<ScreenShotClickEvent> c11418b, int i2) {
        this.itemHeightDp = -1;
        this.screenshots = list;
        this.videos = list2;
        this.screenShotClick = c11418b;
        this.itemHeightDp = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(ScreenshotViewHolder screenshotViewHolder, int i2) {
        if (isVideo(i2)) {
            screenshotViewHolder.bindView(this.videos.get(i2));
            return;
        }
        List<AppVideo> list = this.videos;
        int size = i2 - (list != null ? list.size() : 0);
        if (isScreenShot(size)) {
            screenshotViewHolder.bindView(this.screenshots.get(size), size, this.imageUris);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public ScreenshotViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new ScreenshotViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.row_item_screenshots_gallery, viewGroup, false), this.screenShotClick, this.itemHeightDp);
    }
}
