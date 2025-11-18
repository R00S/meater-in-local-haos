package cm.aptoide.p092pt.promotions;

import cm.aptoide.p092pt.appview.PreferencesPersister;
import cm.aptoide.p092pt.preferences.managed.ManagedKeys;

/* loaded from: classes.dex */
public class PromotionsPreferencesManager {
    private PreferencesPersister preferencesPersister;

    public PromotionsPreferencesManager(PreferencesPersister preferencesPersister) {
        this.preferencesPersister = preferencesPersister;
    }

    public void setPromotionsDialogShown() {
        this.preferencesPersister.save(ManagedKeys.SHOW_PROMOTIONS_DIALOG, false);
    }

    public boolean shouldShowPromotionsDialog() {
        return this.preferencesPersister.get(ManagedKeys.SHOW_PROMOTIONS_DIALOG, true);
    }
}
