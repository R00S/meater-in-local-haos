package cm.aptoide.p092pt.view.wizard;

import cm.aptoide.p092pt.util.MarketResourceFormatter;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class WizardPageTwoFragment_MembersInjector implements InterfaceC9053a<WizardPageTwoFragment> {
    private final Provider<MarketResourceFormatter> marketResourceFormatterProvider;

    public WizardPageTwoFragment_MembersInjector(Provider<MarketResourceFormatter> provider) {
        this.marketResourceFormatterProvider = provider;
    }

    public static InterfaceC9053a<WizardPageTwoFragment> create(Provider<MarketResourceFormatter> provider) {
        return new WizardPageTwoFragment_MembersInjector(provider);
    }

    public static void injectMarketResourceFormatter(WizardPageTwoFragment wizardPageTwoFragment, MarketResourceFormatter marketResourceFormatter) {
        wizardPageTwoFragment.marketResourceFormatter = marketResourceFormatter;
    }

    public void injectMembers(WizardPageTwoFragment wizardPageTwoFragment) {
        injectMarketResourceFormatter(wizardPageTwoFragment, this.marketResourceFormatterProvider.get());
    }
}
