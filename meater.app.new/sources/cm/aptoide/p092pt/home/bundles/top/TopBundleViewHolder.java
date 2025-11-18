package cm.aptoide.p092pt.home.bundles.top;

import android.graphics.Rect;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
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
public class TopBundleViewHolder extends AppBundleViewHolder {
    private final TextView bundleTitle;
    private final String marketName;
    private final Button moreButton;
    private final TopBundleAdapter topBundleAdapter;
    private final RecyclerView topList;
    private final C11418b<HomeEvent> uiEventsListener;

    public TopBundleViewHolder(View view, C11418b<HomeEvent> c11418b, DecimalFormat decimalFormat, String str) {
        super(view);
        this.marketName = str;
        this.uiEventsListener = c11418b;
        this.bundleTitle = (TextView) view.findViewById(C1146R.id.bundle_title);
        this.moreButton = (Button) view.findViewById(C1146R.id.bundle_more);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1146R.id.top_list);
        this.topList = recyclerView;
        TopBundleAdapter topBundleAdapter = new TopBundleAdapter(new ArrayList(), decimalFormat, c11418b);
        this.topBundleAdapter = topBundleAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 1, false);
        recyclerView.addItemDecoration(new RecyclerView.AbstractC0601n() { // from class: cm.aptoide.pt.home.bundles.top.TopBundleViewHolder.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
            public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView2, RecyclerView.C0613z c0613z) {
                int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(5, view2.getResources());
                int pixelsForDip2 = AptoideUtils.ScreenU.getPixelsForDip(4, view2.getResources());
                rect.set(pixelsForDip, pixelsForDip2, pixelsForDip, pixelsForDip2);
            }
        });
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(topBundleAdapter);
        recyclerView.setNestedScrollingEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setBundle$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8098a(HomeBundle homeBundle, View view) {
        this.uiEventsListener.onNext(new HomeEvent(homeBundle, getAdapterPosition(), HomeEvent.Type.MORE_TOP));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder
    public void setBundle(final HomeBundle homeBundle, int i2) {
        if (!(homeBundle instanceof AppBundle)) {
            throw new IllegalStateException(getClass().getName() + " is getting non AppBundle instance!");
        }
        this.bundleTitle.setText(Translator.translate(homeBundle.getTitle(), this.itemView.getContext(), this.marketName));
        this.topBundleAdapter.updateBundle(homeBundle, i2);
        this.topBundleAdapter.update(homeBundle.getContent());
        this.moreButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.top.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9664f.m8098a(homeBundle, view);
            }
        });
    }
}
