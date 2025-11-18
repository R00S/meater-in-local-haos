package cm.aptoide.p092pt.account.view.magiclink;

import cm.aptoide.p092pt.presenter.View;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import p456rx.C11234e;

/* compiled from: MagicLinkView.kt */
@Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\tH&¨\u0006\u000f"}, m32267d2 = {"Lcm/aptoide/pt/account/view/magiclink/MagicLinkView;", "Lcm/aptoide/pt/presenter/View;", "getEmailTextChangeEvent", "Lrx/Observable;", HttpUrl.FRAGMENT_ENCODE_SET, "getMagicLinkClick", "getSecureLoginTextClick", "Ljava/lang/Void;", "removeLoadingScreen", HttpUrl.FRAGMENT_ENCODE_SET, "removeTextFieldError", "setEmailInvalidError", "setInitialState", "setLoadingScreen", "showUnknownError", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface MagicLinkView extends View {
    C11234e<String> getEmailTextChangeEvent();

    C11234e<String> getMagicLinkClick();

    C11234e<Void> getSecureLoginTextClick();

    void removeLoadingScreen();

    void removeTextFieldError();

    void setEmailInvalidError();

    void setInitialState();

    void setLoadingScreen();

    void showUnknownError();
}
