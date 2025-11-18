package cm.aptoide.p092pt.promotions;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.promotions.PromotionAppClick;
import java.text.DecimalFormat;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
class PromotionAppDownloadingViewHolder extends RecyclerView.AbstractC0590c0 {
    private TextView appDescription;
    private ImageView appIcon;
    private TextView appName;
    private TextView appRewardMessage;
    private ImageView cancelDownload;
    private LinearLayout downloadControlsLayout;
    private ProgressBar downloadProgressBar;
    private TextView downloadProgressValue;
    private ImageView pauseDownload;
    private final C11418b<PromotionAppClick> promotionAppClick;
    private ImageView resumeDownload;

    /* renamed from: cm.aptoide.pt.promotions.PromotionAppDownloadingViewHolder$1 */
    static /* synthetic */ class C39041 {
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
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public PromotionAppDownloadingViewHolder(View view, C11418b<PromotionAppClick> c11418b) {
        super(view);
        this.appIcon = (ImageView) view.findViewById(C1146R.id.app_icon);
        this.appName = (TextView) view.findViewById(C1146R.id.app_name);
        this.appDescription = (TextView) view.findViewById(C1146R.id.app_description);
        this.downloadProgressBar = (ProgressBar) view.findViewById(C1146R.id.promotions_download_progress_bar);
        this.downloadProgressValue = (TextView) view.findViewById(C1146R.id.promotions_download_progress_number);
        this.pauseDownload = (ImageView) view.findViewById(C1146R.id.promotions_download_pause_download);
        this.cancelDownload = (ImageView) view.findViewById(C1146R.id.promotions_download_cancel_button);
        this.resumeDownload = (ImageView) view.findViewById(C1146R.id.promotions_download_resume_download);
        this.downloadControlsLayout = (LinearLayout) view.findViewById(C1146R.id.install_controls_layout);
        this.appRewardMessage = (TextView) view.findViewById(C1146R.id.app_reward);
        this.promotionAppClick = c11418b;
    }

    private SpannableString handleRewardMessage(float f2, String str, double d2, boolean z) {
        String string;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String string2 = Double.toString(Math.floor(f2));
        if (z) {
            string = this.itemView.getContext().getString(C1146R.string.FIATpromotion_update_to_get_short, string2, str + decimalFormat.format(d2));
        } else {
            string = this.itemView.getContext().getString(C1146R.string.FIATpromotion_install_to_get_short, string2, str + decimalFormat.format(d2));
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(this.itemView.getContext().getResources().getColor(C1146R.color.promotions_reward)), string.indexOf(string2), string.length(), 33);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setDownloadState$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8499a(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setDownloadState$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8500b(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setDownloadState$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8501c(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.CANCEL_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setDownloadState$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8502d(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.RESUME_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setDownloadState$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8503e(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    private void setAppCardHeader(PromotionViewApp promotionViewApp) {
        ImageLoader.with(this.itemView.getContext()).load(promotionViewApp.getAppIcon(), this.appIcon);
        this.appName.setText(promotionViewApp.getName());
        this.appDescription.setText(promotionViewApp.getDescription());
        this.appRewardMessage.setText(handleRewardMessage(promotionViewApp.getAppcValue(), promotionViewApp.getFiatSymbol(), promotionViewApp.getFiatValue(), promotionViewApp.getDownloadModel().getAction().equals(DownloadModel.Action.UPDATE)));
    }

    private void setDownloadState(int i2, final PromotionViewApp promotionViewApp) {
        DownloadModel.DownloadState downloadState = promotionViewApp.getDownloadModel().getDownloadState();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        switch (C39041.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()]) {
            case 1:
                this.downloadProgressBar.setIndeterminate(false);
                this.downloadProgressBar.setProgress(i2);
                this.downloadProgressValue.setText(String.valueOf(i2) + "%");
                this.pauseDownload.setVisibility(0);
                this.pauseDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.a1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f10692f.m8499a(promotionViewApp, view);
                    }
                });
                this.cancelDownload.setVisibility(8);
                this.resumeDownload.setVisibility(8);
                this.downloadControlsLayout.setLayoutParams(layoutParams);
                break;
            case 2:
                this.downloadProgressBar.setIndeterminate(true);
                this.pauseDownload.setVisibility(0);
                this.pauseDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.d1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f10722f.m8500b(promotionViewApp, view);
                    }
                });
                this.cancelDownload.setVisibility(8);
                this.resumeDownload.setVisibility(8);
                this.downloadControlsLayout.setLayoutParams(layoutParams);
                break;
            case 3:
                this.downloadProgressBar.setIndeterminate(false);
                this.downloadProgressBar.setProgress(i2);
                this.downloadProgressValue.setText(String.valueOf(i2) + "%");
                this.pauseDownload.setVisibility(8);
                this.cancelDownload.setVisibility(0);
                this.cancelDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.e1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f10731f.m8501c(promotionViewApp, view);
                    }
                });
                this.resumeDownload.setVisibility(0);
                this.resumeDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.c1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f10712f.m8502d(promotionViewApp, view);
                    }
                });
                this.downloadControlsLayout.setLayoutParams(layoutParams2);
                break;
            case 4:
            case 5:
            case 6:
                this.downloadProgressBar.setIndeterminate(true);
                this.pauseDownload.setVisibility(0);
                this.pauseDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.b1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f10702f.m8503e(promotionViewApp, view);
                    }
                });
                this.cancelDownload.setVisibility(8);
                this.resumeDownload.setVisibility(8);
                this.downloadControlsLayout.setLayoutParams(layoutParams);
                break;
        }
    }

    public void setApp(PromotionViewApp promotionViewApp) {
        setAppCardHeader(promotionViewApp);
        setDownloadState(promotionViewApp.getDownloadModel().getProgress(), promotionViewApp);
    }
}
