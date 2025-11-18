package cm.aptoide.p092pt.editorial;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.aptoideviews.video.WebChromeClientWithoutPlayerPlaceholder;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.mmpcampaigns.Campaign;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import cm.aptoide.p092pt.editorial.EditorialEvent;
import cm.aptoide.p092pt.home.SnapToStartHelper;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
class EditorialItemsViewHolder extends RecyclerView.AbstractC0590c0 {
    private DownloadModel.Action action;
    private final Button actionButton;
    private final Button appCardButton;
    private final ImageView appCardImage;
    private final View appCardLayout;
    private final TextView appCardNameWithRating;
    private final TextView appCardRating;
    private final View appCardRatingLayout;
    private ImageView cancelDownload;
    private RelativeLayout cardInfoLayout;
    private int currentMediaPosition;
    private TextSwitcher descriptionSwitcher;
    private View downloadControlsLayout;
    private final C11418b<EditorialDownloadEvent> downloadEventListener;
    private LinearLayout downloadInfoLayout;
    private ProgressBar downloadProgressBar;
    private TextView downloadProgressValue;
    private WebView embeddedVideo;
    private TextView firstTitle;
    private ImageView image;
    private View itemText;
    private final LinearLayoutManager layoutManager;
    private View media;
    private MediaBundleAdapter mediaBundleAdapter;
    private boolean mediaDescriptionVisible;
    private RecyclerView mediaList;
    private TextView message;
    private final DecimalFormat oneDecimalFormat;
    private ImageView pauseDownload;
    private ImageView resumeDownload;
    private TextView secondaryTitle;
    private View title;
    private C11418b<EditorialEvent> uiEventListener;
    private ImageView videoThumbnail;
    private FrameLayout videoThumbnailContainer;

    /* renamed from: cm.aptoide.pt.editorial.EditorialItemsViewHolder$3 */
    static /* synthetic */ class C24793 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState;

        static {
            int[] iArr = new int[DownloadModel.DownloadState.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState = iArr;
            try {
                iArr[DownloadModel.DownloadState.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.INDETERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[DownloadModel.Action.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = iArr2;
            try {
                iArr2[DownloadModel.Action.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.DOWNGRADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public EditorialItemsViewHolder(View view, DecimalFormat decimalFormat, C11418b<EditorialEvent> c11418b, C11418b<EditorialDownloadEvent> c11418b2) throws IllegalStateException {
        super(view);
        this.itemText = view.findViewById(C1146R.id.editorial_item_text);
        this.title = view.findViewById(C1146R.id.editorial_item_title);
        this.firstTitle = (TextView) view.findViewById(C1146R.id.editorial_item_first_title);
        this.secondaryTitle = (TextView) view.findViewById(C1146R.id.editorial_item_secondary_title);
        this.message = (TextView) view.findViewById(C1146R.id.editorial_item_message);
        this.media = view.findViewById(C1146R.id.editorial_item_media);
        this.image = (ImageView) view.findViewById(C1146R.id.editorial_image);
        this.embeddedVideo = (WebView) view.findViewById(C1146R.id.embedded_video);
        this.videoThumbnail = (ImageView) view.findViewById(C1146R.id.editorial_video_thumbnail);
        this.videoThumbnailContainer = (FrameLayout) view.findViewById(C1146R.id.editorial_video_thumbnail_container);
        this.descriptionSwitcher = (TextSwitcher) view.findViewById(C1146R.id.editorial_image_description_switcher);
        this.mediaList = (RecyclerView) view.findViewById(C1146R.id.editoral_image_list);
        View viewFindViewById = view.findViewById(C1146R.id.app_cardview);
        this.appCardLayout = viewFindViewById;
        this.actionButton = (Button) view.findViewById(C1146R.id.action_button);
        this.oneDecimalFormat = decimalFormat;
        this.uiEventListener = c11418b;
        this.downloadEventListener = c11418b2;
        this.appCardButton = (Button) viewFindViewById.findViewById(C1146R.id.appview_install_button);
        this.appCardNameWithRating = (TextView) viewFindViewById.findViewById(C1146R.id.app_title_textview_with_rating);
        this.appCardImage = (ImageView) viewFindViewById.findViewById(C1146R.id.app_icon_imageview);
        this.appCardRating = (TextView) viewFindViewById.findViewById(C1146R.id.rating_label);
        this.appCardRatingLayout = viewFindViewById.findViewById(C1146R.id.rating_layout);
        this.mediaBundleAdapter = new MediaBundleAdapter(new ArrayList(), c11418b);
        this.cardInfoLayout = (RelativeLayout) view.findViewById(C1146R.id.card_info_install_layout);
        this.downloadControlsLayout = view.findViewById(C1146R.id.install_controls_layout);
        this.downloadInfoLayout = (LinearLayout) view.findViewById(C1146R.id.appview_transfer_info);
        this.downloadProgressBar = (ProgressBar) view.findViewById(C1146R.id.appview_download_progress_bar);
        this.downloadProgressValue = (TextView) view.findViewById(C1146R.id.appview_download_progress_number);
        this.cancelDownload = (ImageView) view.findViewById(C1146R.id.appview_download_cancel_button);
        this.resumeDownload = (ImageView) view.findViewById(C1146R.id.appview_download_resume_download);
        this.pauseDownload = (ImageView) view.findViewById(C1146R.id.appview_download_pause_download);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        this.layoutManager = linearLayoutManager;
        new SnapToStartHelper().attachToRecyclerView(this.mediaList);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(500L);
        this.currentMediaPosition = -1;
        this.descriptionSwitcher.setInAnimation(alphaAnimation);
        this.descriptionSwitcher.setOutAnimation(alphaAnimation2);
        this.mediaList.addItemDecoration(new RecyclerView.AbstractC0601n() { // from class: cm.aptoide.pt.editorial.EditorialItemsViewHolder.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
            public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.C0613z c0613z) {
                rect.set(0, 0, AptoideUtils.ScreenU.getPixelsForDip(6, view2.getResources()), 0);
            }
        });
        this.mediaList.setLayoutManager(linearLayoutManager);
        this.mediaList.setAdapter(this.mediaBundleAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$manageActionVisibility$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7626a(EditorialContent editorialContent, View view) {
        this.uiEventListener.onNext(new EditorialEvent(EditorialEvent.Type.ACTION, editorialContent.getActionUrl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$manageMediaVisibility$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7627b(EditorialMedia editorialMedia, View view) {
        this.uiEventListener.onNext(new EditorialEvent(EditorialEvent.Type.MEDIA, editorialMedia.getUrl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setPlaceHolderListeners$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7628c(String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, Obb obb, long j2, List list, List list2, List list3, Campaign campaign, View view) {
        this.downloadEventListener.onNext(new EditorialDownloadEvent(EditorialEvent.Type.CANCEL, str, str2, str3, str4, str5, i2, str6, str7, obb, j2, list, list2, list3, campaign));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setPlaceHolderListeners$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7629d(String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, Obb obb, long j2, List list, List list2, String str8, String str9, List list3, Campaign campaign, View view) {
        this.downloadEventListener.onNext(new EditorialDownloadEvent(EditorialEvent.Type.RESUME, str, str2, str3, str4, str5, i2, str6, str7, obb, this.action, j2, list, list2, str8, str9, list3, campaign));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setPlaceHolderListeners$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7630e(String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, Obb obb, long j2, List list, List list2, List list3, Campaign campaign, View view) {
        this.downloadEventListener.onNext(new EditorialDownloadEvent(EditorialEvent.Type.PAUSE, str, str2, str3, str4, str5, i2, str6, str7, obb, j2, list, list2, list3, campaign));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setPlaceHolderListeners$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7631f(String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, Obb obb, long j2, List list, List list2, String str8, String str9, List list3, Campaign campaign, View view) {
        this.downloadEventListener.onNext(new EditorialDownloadEvent(EditorialEvent.Type.BUTTON, str, str2, str3, str4, str5, i2, str6, str7, obb, this.action, j2, list, list2, str8, str9, list3, campaign));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setPlaceHolderListeners$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7632g(long j2, String str, View view) {
        this.uiEventListener.onNext(new EditorialEvent(EditorialEvent.Type.APPCARD, j2, str));
    }

    private void manageActionVisibility(final EditorialContent editorialContent) {
        this.actionButton.setText(editorialContent.getActionTitle());
        this.actionButton.setVisibility(0);
        this.actionButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.editorial.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8951f.m7626a(editorialContent, view);
            }
        });
    }

    private void manageMediaVisibility(final EditorialContent editorialContent, final int i2) {
        if (editorialContent.hasMedia()) {
            List<EditorialMedia> media = editorialContent.getMedia();
            this.media.setVisibility(0);
            if (editorialContent.hasListOfMedia()) {
                this.mediaBundleAdapter.add(media);
                this.mediaList.setVisibility(0);
                if (editorialContent.hasAnyMediaDescription()) {
                    this.mediaList.addOnScrollListener(new RecyclerView.AbstractC0607t() { // from class: cm.aptoide.pt.editorial.EditorialItemsViewHolder.2
                        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
                        public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                            super.onScrolled(recyclerView, i3, i4);
                            EditorialItemsViewHolder.this.uiEventListener.onNext(new EditorialEvent(EditorialEvent.Type.MEDIA_LIST, EditorialItemsViewHolder.this.layoutManager.findFirstCompletelyVisibleItemPosition(), EditorialItemsViewHolder.this.layoutManager.findLastCompletelyVisibleItemPosition(), i2, editorialContent.getMedia()));
                        }
                    });
                    return;
                }
                return;
            }
            final EditorialMedia editorialMedia = media.get(0);
            if (editorialMedia.hasDescription()) {
                this.descriptionSwitcher.setCurrentText(editorialMedia.getDescription());
                this.descriptionSwitcher.setVisibility(0);
            }
            if (editorialMedia.isImage()) {
                ImageLoader.with(this.itemView.getContext()).load(editorialMedia.getUrl(), this.image);
                this.image.setVisibility(0);
            }
            if (editorialMedia.isVideo()) {
                if (editorialMedia.getThumbnail() != null) {
                    ImageLoader.with(this.itemView.getContext()).load(editorialMedia.getThumbnail(), this.videoThumbnail);
                }
                if (editorialMedia.hasUrl()) {
                    this.videoThumbnailContainer.setVisibility(0);
                    this.videoThumbnailContainer.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.editorial.b0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f8905f.m7627b(editorialMedia, view);
                        }
                    });
                }
            }
            if (editorialMedia.isEmbedded()) {
                this.embeddedVideo.setWebViewClient(new WebViewClient());
                this.embeddedVideo.getSettings().setJavaScriptEnabled(true);
                this.embeddedVideo.loadUrl(editorialMedia.getUrl());
                this.embeddedVideo.setWebChromeClient(new WebChromeClientWithoutPlayerPlaceholder());
                this.embeddedVideo.setVisibility(0);
            }
        }
    }

    private void manageMessageVisibility(EditorialContent editorialContent) {
        if (editorialContent.hasMessage()) {
            this.message.setText(editorialContent.getMessage());
            this.message.setVisibility(0);
        }
    }

    private void manageTitleVisibility(EditorialContent editorialContent, int i2) {
        if (editorialContent.hasTitle()) {
            this.title.setVisibility(0);
            if (i2 == 0) {
                this.firstTitle.setText(editorialContent.getTitle());
                this.firstTitle.setVisibility(0);
            } else {
                this.secondaryTitle.setText(editorialContent.getTitle());
                this.secondaryTitle.setVisibility(0);
            }
        }
    }

    private void setButtonText(DownloadModel downloadModel, String str, String str2, String str3, String str4) {
        DownloadModel.Action action = downloadModel.getAction();
        this.action = action;
        int i2 = C24793.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
        if (i2 == 1) {
            this.appCardButton.setText(str);
            return;
        }
        if (i2 == 2) {
            this.appCardButton.setText(str2);
        } else if (i2 == 3) {
            this.appCardButton.setText(str3);
        } else {
            if (i2 != 4) {
                return;
            }
            this.appCardButton.setText(str4);
        }
    }

    private void setDownloadState(int i2, DownloadModel.DownloadState downloadState) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        int i3 = C24793.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()];
        if (i3 == 1) {
            this.downloadProgressBar.setIndeterminate(false);
            this.downloadProgressBar.setProgress(i2);
            this.downloadProgressValue.setText(String.valueOf(i2) + "%");
            this.pauseDownload.setVisibility(0);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
            return;
        }
        if (i3 == 2) {
            this.downloadProgressBar.setIndeterminate(true);
            this.pauseDownload.setVisibility(0);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
            return;
        }
        if (i3 != 3) {
            if (i3 != 4) {
                return;
            }
            this.downloadProgressBar.setIndeterminate(true);
            this.pauseDownload.setVisibility(0);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
            return;
        }
        this.downloadProgressBar.setIndeterminate(false);
        this.downloadProgressBar.setProgress(i2);
        this.downloadProgressValue.setText(i2 + "%");
        this.pauseDownload.setVisibility(8);
        this.cancelDownload.setVisibility(0);
        this.resumeDownload.setVisibility(0);
        this.downloadControlsLayout.setLayoutParams(layoutParams2);
    }

    private void setPlaceHolderInfo(String str, String str2, float f2) {
        ImageLoader.with(this.itemView.getContext()).load(str2, this.appCardImage);
        this.appCardImage.setVisibility(0);
        if (f2 == 0.0f) {
            this.appCardRating.setText(C1146R.string.appcardview_title_no_stars);
        } else {
            this.appCardRating.setText(this.oneDecimalFormat.format(f2));
        }
        this.appCardRatingLayout.setVisibility(0);
        this.appCardNameWithRating.setText(str);
        this.appCardNameWithRating.setVisibility(0);
        this.appCardLayout.setVisibility(0);
    }

    private void setPlaceHolderListeners(final String str, final String str2, final String str3, final String str4, final String str5, final int i2, final String str6, final String str7, final Obb obb, final long j2, final long j3, final List<Split> list, final List<String> list2, final String str8, final String str9, final List<String> list3, final Campaign campaign) {
        this.cancelDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.editorial.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9176f.m7628c(str, str2, str3, str4, str5, i2, str6, str7, obb, j3, list, list2, list3, campaign, view);
            }
        });
        this.resumeDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.editorial.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9152f.m7629d(str, str2, str3, str4, str5, i2, str6, str7, obb, j3, list, list2, str8, str9, list3, campaign, view);
            }
        });
        this.pauseDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.editorial.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8914f.m7630e(str, str2, str3, str4, str5, i2, str6, str7, obb, j3, list, list2, list3, campaign, view);
            }
        });
        this.appCardButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.editorial.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8880f.m7631f(str, str2, str3, str4, str5, i2, str6, str7, obb, j3, list, list2, str8, str9, list3, campaign, view);
            }
        });
        this.appCardLayout.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.editorial.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8939f.m7632g(j2, str2, view);
            }
        });
    }

    public View getPlaceHolder() {
        return this.appCardLayout;
    }

    public boolean isVisible(float f2, float f3) {
        Rect rect = new Rect();
        this.appCardLayout.getLocalVisibleRect(rect);
        return rect.intersect(new Rect(0, 0, (int) f3, ((int) f2) - (this.appCardLayout.getHeight() * 2)));
    }

    public void manageDescriptionAnimationVisibility(int i2, List<EditorialMedia> list) {
        if (this.mediaDescriptionVisible) {
            return;
        }
        String description = list.get(i2).getDescription();
        if (this.currentMediaPosition != i2) {
            this.descriptionSwitcher.setVisibility(0);
            this.descriptionSwitcher.setText(description);
            this.currentMediaPosition = i2;
        }
    }

    public void setAllDescriptionsVisible() {
        if (this.mediaDescriptionVisible) {
            return;
        }
        for (int i2 = 0; i2 < this.mediaBundleAdapter.getItemCount(); i2++) {
            MediaViewHolder mediaViewHolder = (MediaViewHolder) this.mediaList.findViewHolderForAdapterPosition(i2);
            if (mediaViewHolder != null) {
                mediaViewHolder.setDescriptionVisible();
                this.mediaDescriptionVisible = true;
            }
        }
    }

    public void setPlaceHolderDefaultStateInfo(DownloadModel downloadModel, String str, String str2, String str3, String str4) {
        this.downloadInfoLayout.setVisibility(8);
        this.cardInfoLayout.setVisibility(0);
        setButtonText(downloadModel, str, str2, str3, str4);
    }

    public void setPlaceHolderDownloadingInfo(DownloadModel downloadModel) {
        this.downloadInfoLayout.setVisibility(0);
        this.cardInfoLayout.setVisibility(8);
        setDownloadState(downloadModel.getProgress(), downloadModel.getDownloadState());
    }

    public void setVisibility(EditorialContent editorialContent, int i2, Boolean bool) {
        if (editorialContent.hasTitle() || editorialContent.hasMessage()) {
            this.itemText.setVisibility(0);
            manageTitleVisibility(editorialContent, i2);
            manageMessageVisibility(editorialContent);
        }
        manageMediaVisibility(editorialContent, i2);
        if (editorialContent.isPlaceHolderType()) {
            setPlaceHolderListeners(editorialContent.getAppName(), editorialContent.getPackageName(), editorialContent.getMd5sum(), editorialContent.getIcon(), editorialContent.getVerName(), editorialContent.getVerCode(), editorialContent.getPath(), editorialContent.getPathAlt(), editorialContent.getObb(), editorialContent.getId(), editorialContent.getSize(), editorialContent.getSplits(), editorialContent.getRequiredSplits(), editorialContent.getRank(), editorialContent.getStoreName(), editorialContent.getBdsFlags(), editorialContent.getCampaign());
            setPlaceHolderInfo(editorialContent.getAppName(), editorialContent.getIcon(), editorialContent.getRating());
            if (bool.booleanValue()) {
                this.appCardLayout.setVisibility(4);
                this.appCardLayout.setScaleX(0.1f);
                this.appCardLayout.setScaleY(0.1f);
            }
        }
        if (editorialContent.hasAction()) {
            manageActionVisibility(editorialContent);
        }
    }
}
