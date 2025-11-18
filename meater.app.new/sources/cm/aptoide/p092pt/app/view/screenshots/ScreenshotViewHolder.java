package cm.aptoide.p092pt.app.view.screenshots;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.view.app.AppScreenshot;
import cm.aptoide.p092pt.view.app.AppVideo;
import java.util.ArrayList;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class ScreenshotViewHolder extends RecyclerView.AbstractC0590c0 {
    static final int LAYOUT_ID = 2131493164;
    private static final String PORTRAIT = "PORTRAIT";
    private FrameLayout media_layout;
    private ImageView play_button;
    private final C11418b<ScreenShotClickEvent> screenShotClick;
    private ImageView screenshot;

    ScreenshotViewHolder(View view, C11418b<ScreenShotClickEvent> c11418b, int i2) {
        super(view);
        assignViews(view, i2);
        this.screenShotClick = c11418b;
    }

    private int getPlaceholder(String str) {
        return viewIsInPortrait(str) ? C1146R.attr.placeholder_9_16 : C1146R.attr.placeholder_16_9;
    }

    private boolean isLollipopOrHigher() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7312a(AppVideo appVideo, View view) {
        this.screenShotClick.onNext(new ScreenShotClickEvent(Uri.parse(appVideo.getUrl())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7313b(ArrayList arrayList, int i2, View view) {
        this.screenShotClick.onNext(new ScreenShotClickEvent(arrayList, i2));
    }

    private boolean viewIsInPortrait(String str) {
        return !TextUtils.isEmpty(str) && str.toUpperCase().equals(PORTRAIT);
    }

    protected void assignViews(View view, int i2) {
        this.screenshot = (ImageView) view.findViewById(C1146R.id.screenshot_image_item);
        this.play_button = (ImageView) view.findViewById(C1146R.id.play_button);
        this.media_layout = (FrameLayout) view.findViewById(C1146R.id.media_layout);
        if (i2 > 0) {
            this.screenshot.getLayoutParams().height = (int) TypedValue.applyDimension(1, 128.0f, view.getResources().getDisplayMetrics());
        }
    }

    public void bindView(final AppVideo appVideo) {
        Context context = this.screenshot.getContext();
        if (context == null) {
            return;
        }
        ImageLoader.with(context).load(appVideo.getThumbnail(), C1146R.attr.placeholder_square, this.screenshot);
        if (isLollipopOrHigher()) {
            this.media_layout.setForeground(context.getResources().getDrawable(C1146R.color.overlay_black, context.getTheme()));
        } else {
            this.media_layout.setForeground(context.getResources().getDrawable(C1146R.color.overlay_black));
        }
        this.play_button.setVisibility(0);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.screenshots.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8050f.m7312a(appVideo, view);
            }
        });
    }

    public void bindView(AppScreenshot appScreenshot, final int i2, final ArrayList<String> arrayList) {
        Context context = this.screenshot.getContext();
        if (context == null) {
            return;
        }
        this.media_layout.setForeground(null);
        this.play_button.setVisibility(8);
        ImageLoader.with(context).loadScreenshotToThumb(appScreenshot.getUrl(), appScreenshot.getOrientation(), getPlaceholder(appScreenshot.getOrientation()), this.screenshot);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.screenshots.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8052f.m7313b(arrayList, i2, view);
            }
        });
    }
}
