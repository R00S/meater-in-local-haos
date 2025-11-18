package cm.aptoide.p092pt.search.view.item;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.p092pt.app.view.screenshots.ScreenshotsAdapter;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Malware;
import cm.aptoide.p092pt.download.view.Download;
import cm.aptoide.p092pt.download.view.DownloadClick;
import cm.aptoide.p092pt.download.view.DownloadStatusModel;
import cm.aptoide.p092pt.download.view.DownloadViewStatusHelper;
import cm.aptoide.p092pt.home.AppSecondaryInfoViewHolder;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.search.model.SearchAppResult;
import cm.aptoide.p092pt.search.model.SearchAppResultWrapper;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.app.AppScreenshot;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.p473s.C11418b;

/* compiled from: SearchResultViewHolder.kt */
@Metadata(m32266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u001fBA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0002J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m32267d2 = {"Lcm/aptoide/pt/search/view/item/SearchResultViewHolder;", "Lcm/aptoide/pt/search/view/item/SearchResultItemView;", "Lcm/aptoide/pt/search/model/SearchAppResult;", "itemView", "Landroid/view/View;", "itemClickSubject", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/search/model/SearchAppResultWrapper;", "downloadClickSubject", "Lcm/aptoide/pt/download/view/DownloadClick;", "screenShotClick", "Lcm/aptoide/pt/app/view/screenshots/ScreenShotClickEvent;", "query", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/view/View;Lrx/subjects/PublishSubject;Lrx/subjects/PublishSubject;Lrx/subjects/PublishSubject;Ljava/lang/String;)V", "adapter", "Lcm/aptoide/pt/app/view/screenshots/ScreenshotsAdapter;", "appInfoViewHolder", "Lcm/aptoide/pt/home/AppSecondaryInfoViewHolder;", "downloadViewStatusHelper", "Lcm/aptoide/pt/download/view/DownloadViewStatusHelper;", "setAppInfo", HttpUrl.FRAGMENT_ENCODE_SET, "result", "setDownloadStatus", "app", "setup", "setupMediaAdapter", "screenshots", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/view/app/AppScreenshot;", "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SearchResultViewHolder extends SearchResultItemView<SearchAppResult> {
    public static final int LAYOUT = 2131493170;
    private final ScreenshotsAdapter adapter;
    private final AppSecondaryInfoViewHolder appInfoViewHolder;
    private final C11418b<DownloadClick> downloadClickSubject;
    private final DownloadViewStatusHelper downloadViewStatusHelper;
    private final C11418b<SearchAppResultWrapper> itemClickSubject;
    private final String query;
    private final C11418b<ScreenShotClickEvent> screenShotClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultViewHolder(View view, C11418b<SearchAppResultWrapper> c11418b, C11418b<DownloadClick> c11418b2, C11418b<ScreenShotClickEvent> c11418b3, String str) {
        super(view);
        C9801m.m32346f(view, "itemView");
        C9801m.m32346f(c11418b, "itemClickSubject");
        C9801m.m32346f(c11418b2, "downloadClickSubject");
        C9801m.m32346f(c11418b3, "screenShotClick");
        this.itemClickSubject = c11418b;
        this.downloadClickSubject = c11418b2;
        this.screenShotClick = c11418b3;
        this.query = str;
        Context context = view.getContext();
        C9801m.m32345e(context, "itemView.context");
        this.downloadViewStatusHelper = new DownloadViewStatusHelper(context);
        this.appInfoViewHolder = new AppSecondaryInfoViewHolder(view, new DecimalFormat("0.0"));
        ScreenshotsAdapter screenshotsAdapter = new ScreenshotsAdapter(Collections.emptyList(), Collections.emptyList(), c11418b3, 128);
        this.adapter = screenshotsAdapter;
        int i2 = C1146R.id.media_rv;
        ((RecyclerView) view.findViewById(i2)).setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        ((RecyclerView) view.findViewById(i2)).setNestedScrollingEnabled(false);
        ((RecyclerView) view.findViewById(i2)).setAdapter(screenshotsAdapter);
    }

    private final void setAppInfo(final SearchAppResult result) {
        ((TextView) this.itemView.findViewById(C1146R.id.app_name)).setText(result.getAppName());
        ((TextView) this.itemView.findViewById(C1146R.id.downloads)).setText(AptoideUtils.StringU.withSuffix(result.getTotalDownloads()));
        View view = this.itemView;
        int i2 = C1146R.id.app_icon;
        ImageLoader.with(((ImageView) view.findViewById(i2)).getContext()).load(result.getIcon(), (ImageView) this.itemView.findViewById(i2));
        float averageRating = result.getAverageRating();
        if (averageRating <= 0.0f) {
            ((TextView) this.itemView.findViewById(C1146R.id.rating)).setText(C1146R.string.appcardview_title_no_stars);
        } else {
            View view2 = this.itemView;
            int i3 = C1146R.id.rating;
            ((TextView) view2.findViewById(i3)).setVisibility(0);
            ((TextView) this.itemView.findViewById(i3)).setText(new DecimalFormat("0.0").format(averageRating));
        }
        String developerName = result.getDeveloperName();
        boolean z = true;
        if (developerName == null || developerName.length() == 0) {
            ((TextView) this.itemView.findViewById(C1146R.id.developer_name)).setVisibility(4);
        } else {
            ((TextView) this.itemView.findViewById(C1146R.id.developer_name)).setText(result.getDeveloperName());
        }
        AppSecondaryInfoViewHolder appSecondaryInfoViewHolder = this.appInfoViewHolder;
        if (!result.hasBilling() && !result.hasAdvertising()) {
            z = false;
        }
        appSecondaryInfoViewHolder.setInfo(z, result.getAverageRating(), false, false);
        int rank = result.getRank();
        if (rank == Malware.Rank.TRUSTED.ordinal()) {
            View view3 = this.itemView;
            int i4 = C1146R.id.app_badge;
            ImageLoader.with(((ImageView) view3.findViewById(i4)).getContext()).load(C1146R.drawable.ic_badges_trusted, (ImageView) this.itemView.findViewById(i4));
        } else if (rank == Malware.Rank.CRITICAL.ordinal()) {
            View view4 = this.itemView;
            int i5 = C1146R.id.app_badge;
            ImageLoader.with(((ImageView) view4.findViewById(i5)).getContext()).load(C1146R.drawable.ic_badges_critical, (ImageView) this.itemView.findViewById(i5));
        } else if (rank == Malware.Rank.WARNING.ordinal()) {
            View view5 = this.itemView;
            int i6 = C1146R.id.app_badge;
            ImageLoader.with(((ImageView) view5.findViewById(i6)).getContext()).load(C1146R.drawable.ic_badges_warning, (ImageView) this.itemView.findViewById(i6));
        } else if (rank == Malware.Rank.UNKNOWN.ordinal()) {
            View view6 = this.itemView;
            int i7 = C1146R.id.app_badge;
            ImageLoader.with(((ImageView) view6.findViewById(i7)).getContext()).load(C1146R.drawable.ic_badges_unknown, (ImageView) this.itemView.findViewById(i7));
        }
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.search.view.item.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                SearchResultViewHolder.m40988setAppInfo$lambda2(this.f11121f, result, view7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setAppInfo$lambda-2, reason: not valid java name */
    public static final void m40988setAppInfo$lambda2(SearchResultViewHolder searchResultViewHolder, SearchAppResult searchAppResult, View view) {
        C9801m.m32346f(searchResultViewHolder, "this$0");
        C9801m.m32346f(searchAppResult, "$result");
        searchResultViewHolder.itemClickSubject.onNext(new SearchAppResultWrapper(searchResultViewHolder.query, searchAppResult, searchResultViewHolder.getAdapterPosition()));
    }

    private final void setupMediaAdapter(List<? extends AppScreenshot> screenshots) {
        this.adapter.updateScreenshots(screenshots);
        this.adapter.updateVideos(Collections.emptyList());
    }

    public final void setDownloadStatus(SearchAppResult app) {
        C9801m.m32346f(app, "app");
        DownloadStatusModel downloadModel = app.getDownloadModel();
        if (!app.isHighlightedResult() || downloadModel == null) {
            ((Button) this.itemView.findViewById(C1146R.id.install_button)).setVisibility(8);
            ((DownloadProgressView) this.itemView.findViewById(C1146R.id.download_progress_view)).setVisibility(8);
            ((RecyclerView) this.itemView.findViewById(C1146R.id.media_rv)).setVisibility(8);
            return;
        }
        DownloadViewStatusHelper downloadViewStatusHelper = this.downloadViewStatusHelper;
        Download download = app.getDownload();
        C9801m.m32345e(download, "app.download");
        View view = this.itemView;
        int i2 = C1146R.id.install_button;
        Button button = (Button) view.findViewById(i2);
        C9801m.m32345e(button, "itemView.install_button");
        View view2 = this.itemView;
        int i3 = C1146R.id.download_progress_view;
        DownloadProgressView downloadProgressView = (DownloadProgressView) view2.findViewById(i3);
        C9801m.m32345e(downloadProgressView, "itemView.download_progress_view");
        downloadViewStatusHelper.setDownloadStatus(download, button, downloadProgressView, this.downloadClickSubject);
        List<AppScreenshot> screenshots = app.getScreenshots();
        C9801m.m32345e(screenshots, "app.screenshots");
        setupMediaAdapter(screenshots);
        if (!((Button) this.itemView.findViewById(i2)).hasOnClickListeners()) {
            DownloadViewStatusHelper downloadViewStatusHelper2 = this.downloadViewStatusHelper;
            Download download2 = app.getDownload();
            C9801m.m32345e(download2, "app.download");
            C11418b<DownloadClick> c11418b = this.downloadClickSubject;
            Button button2 = (Button) this.itemView.findViewById(i2);
            C9801m.m32345e(button2, "itemView.install_button");
            DownloadProgressView downloadProgressView2 = (DownloadProgressView) this.itemView.findViewById(i3);
            C9801m.m32345e(downloadProgressView2, "itemView.download_progress_view");
            downloadViewStatusHelper2.setupListeners(download2, c11418b, button2, downloadProgressView2);
        } else if (downloadModel.getAction().equals(DownloadStatusModel.Action.OPEN)) {
            DownloadViewStatusHelper downloadViewStatusHelper3 = this.downloadViewStatusHelper;
            Download download3 = app.getDownload();
            C9801m.m32345e(download3, "app.download");
            C11418b<DownloadClick> c11418b2 = this.downloadClickSubject;
            Button button3 = (Button) this.itemView.findViewById(i2);
            C9801m.m32345e(button3, "itemView.install_button");
            DownloadProgressView downloadProgressView3 = (DownloadProgressView) this.itemView.findViewById(i3);
            C9801m.m32345e(downloadProgressView3, "itemView.download_progress_view");
            downloadViewStatusHelper3.setupListeners(download3, c11418b2, button3, downloadProgressView3);
        }
        ((RecyclerView) this.itemView.findViewById(C1146R.id.media_rv)).setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.search.view.item.SearchResultItemView
    public void setup(SearchAppResult result) {
        if (result != null) {
            setAppInfo(result);
            setDownloadStatus(result);
        }
    }
}
