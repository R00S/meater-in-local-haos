package cm.aptoide.p092pt.comments.view;

import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.fragment.BaseDialogFragment_MembersInjector;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class CommentDialogFragment_MembersInjector implements InterfaceC9053a<CommentDialogFragment> {
    private final Provider<ThemeManager> themeManagerProvider;
    private final Provider<UserFeedbackAnalytics> userFeedbackAnalyticsProvider;

    public CommentDialogFragment_MembersInjector(Provider<ThemeManager> provider, Provider<UserFeedbackAnalytics> provider2) {
        this.themeManagerProvider = provider;
        this.userFeedbackAnalyticsProvider = provider2;
    }

    public static InterfaceC9053a<CommentDialogFragment> create(Provider<ThemeManager> provider, Provider<UserFeedbackAnalytics> provider2) {
        return new CommentDialogFragment_MembersInjector(provider, provider2);
    }

    public static void injectUserFeedbackAnalytics(CommentDialogFragment commentDialogFragment, UserFeedbackAnalytics userFeedbackAnalytics) {
        commentDialogFragment.userFeedbackAnalytics = userFeedbackAnalytics;
    }

    public void injectMembers(CommentDialogFragment commentDialogFragment) {
        BaseDialogFragment_MembersInjector.injectThemeManager(commentDialogFragment, this.themeManagerProvider.get());
        injectUserFeedbackAnalytics(commentDialogFragment, this.userFeedbackAnalyticsProvider.get());
    }
}
