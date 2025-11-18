package cm.aptoide.p092pt.home.bundles.apps;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.aptoideviews.skeleton.Skeleton;
import cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.home.bundles.base.AppBundle;
import cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.Translator;
import java.text.DecimalFormat;
import java.util.ArrayList;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class AppsBundleViewHolder extends AppBundleViewHolder {
    private final AppsInBundleAdapter appsInBundleAdapter;
    private final RecyclerView appsList;
    private final TextView bundleTitle;
    private final String marketName;
    private final Button moreButton;
    private final Skeleton skeleton;
    private final C11418b<HomeEvent> uiEventsListener;

    public AppsBundleViewHolder(View view, C11418b<HomeEvent> c11418b, DecimalFormat decimalFormat, String str) {
        super(view);
        this.marketName = str;
        this.uiEventsListener = c11418b;
        this.bundleTitle = (TextView) view.findViewById(C1146R.id.bundle_title);
        this.moreButton = (Button) view.findViewById(C1146R.id.bundle_more);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1146R.id.apps_list);
        this.appsList = recyclerView;
        AppsInBundleAdapter appsInBundleAdapter = new AppsInBundleAdapter(new ArrayList(), decimalFormat, c11418b, null);
        this.appsInBundleAdapter = appsInBundleAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        recyclerView.addItemDecoration(new RecyclerView.AbstractC0601n() { // from class: cm.aptoide.pt.home.bundles.apps.AppsBundleViewHolder.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
            public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView2, RecyclerView.C0613z c0613z) {
                int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(5, view2.getResources());
                rect.set(pixelsForDip, pixelsForDip, 0, pixelsForDip);
            }
        });
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(appsInBundleAdapter);
        recyclerView.setNestedScrollingEnabled(false);
        this.skeleton = SkeletonUtils.applySkeleton(recyclerView, C1146R.layout.app_home_item_skeleton, Type.APPS_GROUP.getPerLineCount(view.getContext().getResources(), (WindowManager) view.getContext().getSystemService("window")) * 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setBundle$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8077a(HomeBundle homeBundle, View view) {
        this.uiEventsListener.onNext(new HomeEvent(homeBundle, getAdapterPosition(), HomeEvent.Type.MORE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder
    public void setBundle(final HomeBundle homeBundle, int i2) {
        if (!(homeBundle instanceof AppBundle)) {
            throw new IllegalStateException(getClass().getName() + " is getting non AppBundle instance!");
        }
        this.bundleTitle.setText(Translator.translate(homeBundle.getTitle(), this.itemView.getContext(), this.marketName));
        if (homeBundle.getContent() == null) {
            this.skeleton.showSkeleton();
            return;
        }
        this.appsInBundleAdapter.updateBundle(homeBundle, i2);
        this.appsInBundleAdapter.update(homeBundle.getContent());
        this.skeleton.showOriginal();
        this.appsList.addOnScrollListener(new RecyclerView.AbstractC0607t() { // from class: cm.aptoide.pt.home.bundles.apps.AppsBundleViewHolder.2
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                super.onScrolled(recyclerView, i3, i4);
                if (i3 > 0) {
                    AppsBundleViewHolder.this.uiEventsListener.onNext(new HomeEvent(homeBundle, AppsBundleViewHolder.this.getAdapterPosition(), HomeEvent.Type.SCROLL_RIGHT));
                }
            }
        });
        this.moreButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.apps.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9540f.m8077a(homeBundle, view);
            }
        });
    }
}
