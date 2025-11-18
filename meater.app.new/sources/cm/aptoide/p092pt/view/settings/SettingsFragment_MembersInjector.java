package cm.aptoide.p092pt.view.settings;

import cm.aptoide.p092pt.file.FileManager;
import cm.aptoide.p092pt.themes.ThemeAnalytics;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.updates.UpdateRepository;
import cm.aptoide.p092pt.util.MarketResourceFormatter;
import javax.inject.Named;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class SettingsFragment_MembersInjector implements InterfaceC9053a<SettingsFragment> {
    private final Provider<FileManager> fileManagerProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<MarketResourceFormatter> marketResourceFormatterProvider;
    private final Provider<SupportEmailProvider> supportEmailProvider;
    private final Provider<ThemeAnalytics> themeAnalyticsProvider;
    private final Provider<ThemeManager> themeManagerProvider;
    private final Provider<UpdateRepository> updatesRepositoryProvider;

    public SettingsFragment_MembersInjector(Provider<String> provider, Provider<MarketResourceFormatter> provider2, Provider<SupportEmailProvider> provider3, Provider<ThemeManager> provider4, Provider<ThemeAnalytics> provider5, Provider<UpdateRepository> provider6, Provider<FileManager> provider7) {
        this.marketNameProvider = provider;
        this.marketResourceFormatterProvider = provider2;
        this.supportEmailProvider = provider3;
        this.themeManagerProvider = provider4;
        this.themeAnalyticsProvider = provider5;
        this.updatesRepositoryProvider = provider6;
        this.fileManagerProvider = provider7;
    }

    public static InterfaceC9053a<SettingsFragment> create(Provider<String> provider, Provider<MarketResourceFormatter> provider2, Provider<SupportEmailProvider> provider3, Provider<ThemeManager> provider4, Provider<ThemeAnalytics> provider5, Provider<UpdateRepository> provider6, Provider<FileManager> provider7) {
        return new SettingsFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectFileManager(SettingsFragment settingsFragment, FileManager fileManager) {
        settingsFragment.fileManager = fileManager;
    }

    @Named
    public static void injectMarketName(SettingsFragment settingsFragment, String str) {
        settingsFragment.marketName = str;
    }

    public static void injectMarketResourceFormatter(SettingsFragment settingsFragment, MarketResourceFormatter marketResourceFormatter) {
        settingsFragment.marketResourceFormatter = marketResourceFormatter;
    }

    public static void injectSupportEmailProvider(SettingsFragment settingsFragment, SupportEmailProvider supportEmailProvider) {
        settingsFragment.supportEmailProvider = supportEmailProvider;
    }

    public static void injectThemeAnalytics(SettingsFragment settingsFragment, ThemeAnalytics themeAnalytics) {
        settingsFragment.themeAnalytics = themeAnalytics;
    }

    public static void injectThemeManager(SettingsFragment settingsFragment, ThemeManager themeManager) {
        settingsFragment.themeManager = themeManager;
    }

    public static void injectUpdatesRepository(SettingsFragment settingsFragment, UpdateRepository updateRepository) {
        settingsFragment.updatesRepository = updateRepository;
    }

    public void injectMembers(SettingsFragment settingsFragment) {
        injectMarketName(settingsFragment, this.marketNameProvider.get());
        injectMarketResourceFormatter(settingsFragment, this.marketResourceFormatterProvider.get());
        injectSupportEmailProvider(settingsFragment, this.supportEmailProvider.get());
        injectThemeManager(settingsFragment, this.themeManagerProvider.get());
        injectThemeAnalytics(settingsFragment, this.themeAnalyticsProvider.get());
        injectUpdatesRepository(settingsFragment, this.updatesRepositoryProvider.get());
        injectFileManager(settingsFragment, this.fileManagerProvider.get());
    }
}
