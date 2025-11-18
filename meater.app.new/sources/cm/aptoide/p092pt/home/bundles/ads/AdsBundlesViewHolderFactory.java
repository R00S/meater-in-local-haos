package cm.aptoide.p092pt.home.bundles.ads;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import java.text.DecimalFormat;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class AdsBundlesViewHolderFactory {
    private static final int ADS = 2131492898;
    private final C11418b<AdHomeEvent> adClickedEvents;
    private final String marketName;
    private final DecimalFormat oneDecimalFormatter;
    private final C11418b<HomeEvent> uiEventsListener;

    public AdsBundlesViewHolderFactory(C11418b<HomeEvent> c11418b, C11418b<AdHomeEvent> c11418b2, DecimalFormat decimalFormat, String str) {
        this.uiEventsListener = c11418b;
        this.adClickedEvents = c11418b2;
        this.oneDecimalFormatter = decimalFormat;
        this.marketName = str;
    }

    public AppBundleViewHolder createViewHolder(ViewGroup viewGroup) {
        return new AdsBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.ads_bundle_item, viewGroup, false), this.uiEventsListener, this.oneDecimalFormatter, this.adClickedEvents, this.marketName);
    }
}
