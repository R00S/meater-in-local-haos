package cm.aptoide.p092pt.editorial;

import android.net.Uri;
import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogFragment;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import cm.aptoide.p092pt.navigator.ActivityNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.Result;
import cm.aptoide.p092pt.socialmedia.SocialMediaNavigator;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class EditorialNavigator {
    private final AccountNavigator accountNavigator;
    private final ActivityNavigator activityNavigator;
    private final AppNavigator appNavigator;
    private final FragmentNavigator fragmentNavigator;
    private final SocialMediaNavigator socialMediaNavigator;

    public EditorialNavigator(ActivityNavigator activityNavigator, FragmentNavigator fragmentNavigator, AppNavigator appNavigator, AccountNavigator accountNavigator, SocialMediaNavigator socialMediaNavigator) {
        this.activityNavigator = activityNavigator;
        this.fragmentNavigator = fragmentNavigator;
        this.appNavigator = appNavigator;
        this.accountNavigator = accountNavigator;
        this.socialMediaNavigator = socialMediaNavigator;
    }

    static /* synthetic */ OutOfSpaceNavigatorWrapper lambda$outOfSpaceDialogResult$0(Result result) {
        return new OutOfSpaceNavigatorWrapper(result.getResultCode() == -1, result.getData() != null ? result.getData().getPackage() : HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public void navigateToAppView(long j2, String str) {
        this.appNavigator.navigateWithAppId(j2, str, AppViewFragment.OpenType.OPEN_ONLY, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public void navigateToLogIn() {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.EDITORIAL);
    }

    public void navigateToOutOfSpaceDialog(long j2, String str) {
        this.fragmentNavigator.navigateToDialogForResult(OutOfSpaceDialogFragment.INSTANCE.newInstance(j2, str), 1994);
    }

    public void navigateToSocialMedia(SocialMediaView.SocialMediaType socialMediaType) {
        this.socialMediaNavigator.navigateToSocialMediaWebsite(socialMediaType);
    }

    public void navigateToUri(String str) {
        this.activityNavigator.navigateTo(Uri.parse(str));
    }

    public C11234e<OutOfSpaceNavigatorWrapper> outOfSpaceDialogResult() {
        return this.fragmentNavigator.results(1994).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.l0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EditorialNavigator.lambda$outOfSpaceDialogResult$0((Result) obj);
            }
        });
    }
}
