package cm.aptoide.p092pt.view.wizard;

import androidx.fragment.app.AbstractC0480p;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import cm.aptoide.p092pt.NavigationTrackerPagerAdapterHelper;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;

/* loaded from: classes.dex */
public class WizardPagerAdapter extends AbstractC0480p implements NavigationTrackerPagerAdapterHelper {
    private final boolean isLoggedIn;
    private final WizardFragmentProvider wizardFragmentProvider;

    public WizardPagerAdapter(FragmentManager fragmentManager, Boolean bool, WizardFragmentProvider wizardFragmentProvider) {
        super(fragmentManager);
        this.isLoggedIn = bool.booleanValue();
        this.wizardFragmentProvider = wizardFragmentProvider;
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public int getCount() {
        return this.wizardFragmentProvider.getCount(Boolean.valueOf(this.isLoggedIn));
    }

    @Override // androidx.fragment.app.AbstractC0480p
    public Fragment getItem(int i2) {
        return this.wizardFragmentProvider.getItem(i2);
    }

    @Override // cm.aptoide.p092pt.NavigationTrackerPagerAdapterHelper
    public String getItemName(int i2) {
        return getItem(i2).getClass().getSimpleName();
    }

    @Override // cm.aptoide.p092pt.NavigationTrackerPagerAdapterHelper
    public StoreContext getItemStore() {
        return StoreContext.home;
    }

    @Override // cm.aptoide.p092pt.NavigationTrackerPagerAdapterHelper
    public String getItemTag(int i2) {
        return String.valueOf(i2);
    }

    public boolean isLoggedIn() {
        return this.isLoggedIn;
    }
}
