package cm.aptoide.p092pt.home.bundles.base;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import java.util.List;

/* loaded from: classes.dex */
public interface HomeBundle {

    public enum BundleType {
        EDITORS,
        APPS,
        ADS,
        UNKNOWN,
        LOADING,
        INFO_BUNDLE,
        APPCOINS_ADS,
        EDITORIAL,
        WALLET_ADS_OFFER,
        TOP,
        LOAD_MORE_ERROR,
        FEATURED_BONUS_APPC,
        NEW_APP,
        NEWS_ITEM,
        NEW_APP_VERSION,
        IN_GAME_EVENT,
        APP_COMING_SOON;

        public boolean isApp() {
            return equals(APPS) || equals(EDITORS) || equals(ADS) || equals(APPCOINS_ADS) || equals(FEATURED_BONUS_APPC);
        }

        public boolean isPromotional() {
            return equals(NEW_APP) || equals(NEWS_ITEM) || equals(NEW_APP_VERSION) || equals(IN_GAME_EVENT) || equals(APP_COMING_SOON);
        }
    }

    List<?> getContent();

    Event getEvent();

    String getTag();

    String getTitle();

    BundleType getType();
}
