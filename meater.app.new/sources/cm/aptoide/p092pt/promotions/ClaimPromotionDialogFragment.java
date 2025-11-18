package cm.aptoide.p092pt.promotions;

import android.content.ClipboardManager;
import android.graphics.Point;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.navigator.Result;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.fragment.BaseDialogView;
import javax.inject.Inject;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p304c.C8975a;
import p241e.p294g.p295a.p305d.C8981a;
import p241e.p294g.p295a.p305d.C8982b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class ClaimPromotionDialogFragment extends BaseDialogView implements ClaimPromotionDialogView {
    private static final String CLAIMED = "claimed";
    private static final String GENERIC_ERROR = "error";
    private static final String PACKAGE_NAME = "package_name";
    private static final String SUCCESS = "success";
    private static final String VIEW = "view";
    private static final String WALLET = "wallet";
    private static final String WALLET_PERMISSIONS_INTENT_EXTRA_KEY = "PERMISSION_NAME_KEY";
    private static final String WALLET_PERMISSIONS_INTENT_EXTRA_VALUE = "WALLET_ADDRESS";
    protected static final int WALLET_PERMISSIONS_INTENT_REQUEST_CODE = 123;
    private static final String WALLET_PERMISSIONS_INTENT_URI_ACTION = "appcoins://wallet/permissions/1";
    protected static final int WALLET_VERIFICATION_INTENT_REQUEST_CODE = 124;
    private static final String WALLET_VERIFICATION_INTENT_URI_ACTION = "appcoins://wallet/validation/1";
    private Button cancelUpdateWalletButton;

    @Inject
    ClaimPromotionsManager claimPromotionsManager;
    private ClipboardManager clipboard;
    private Button genericErrorOkButton;
    private View genericErrorView;
    private TextView genericErrorViewMessage;
    private TextView genericMessageBody;
    private TextView genericMessageButton;
    private TextView genericMessageTitle;
    private View genericMessageView;
    private Button getWalletAddressButton;

    @Inject
    IdsRepository idsRepository;
    private View insertWalletView;
    private ProgressBar loading;

    @Inject
    ClaimPromotionsNavigator navigator;

    @Inject
    ClaimPromotionDialogPresenter presenter;

    @Inject
    PromotionsAnalytics promotionsAnalytics;
    private Button updateWalletButton;
    private View updateWalletView;
    private EditText walletAddressEdit;
    private Button walletCancelButton;
    private View walletErrorView;
    private ImageView walletMessageIcon;
    private Button walletNextButton;

    private void disableNextButton() {
        this.walletNextButton.setClickable(false);
        this.walletNextButton.setFocusable(false);
        this.walletNextButton.setTextColor(getResources().getColor(C1146R.color.grey_fog_light));
    }

    private void disableWalletButton() {
        this.getWalletAddressButton.setClickable(false);
        this.getWalletAddressButton.setFocusable(false);
        this.getWalletAddressButton.setBackgroundColor(this.themeManager.getAttributeForTheme(C1146R.attr.lockedWalletButtonColor).data);
    }

    private void enableNextButton() {
        this.walletNextButton.setClickable(true);
        this.walletNextButton.setFocusable(true);
        this.walletNextButton.setTextColor(this.themeManager.getAttributeForTheme(C1146R.attr.colorPrimaryDark).data);
    }

    private void enableWalletButton() {
        this.getWalletAddressButton.setClickable(true);
        this.getWalletAddressButton.setFocusable(true);
        this.getWalletAddressButton.setBackgroundResource(C1146R.drawable.aptoide_gradient);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void handleRestoreViewState(Bundle bundle) {
        if (bundle == null || bundle.getString(VIEW) == null) {
            return;
        }
        String string = bundle.getString(VIEW);
        char c2 = 65535;
        switch (string.hashCode()) {
            case -1867169789:
                if (string.equals("success")) {
                    c2 = 3;
                    break;
                }
                break;
            case -795192327:
                if (string.equals(WALLET)) {
                    c2 = 1;
                    break;
                }
                break;
            case 96784904:
                if (string.equals(GENERIC_ERROR)) {
                    c2 = 4;
                    break;
                }
                break;
            case 853317083:
                if (string.equals(CLAIMED)) {
                    c2 = 2;
                    break;
                }
                break;
        }
        if (c2 == 2) {
            showPromotionAlreadyClaimed();
            return;
        }
        if (c2 == 3) {
            showClaimSuccess();
        } else if (c2 != 4) {
            showWalletView();
        } else {
            showGenericError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$continueWalletClick$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ClaimPromotionsClickWrapper m8469e(Void r4) {
        return new ClaimPromotionsClickWrapper(this.walletAddressEdit.getText().toString(), getArguments().getString("package_name"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dismissGenericMessage$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ClaimDialogResultWrapper m8470f(Void r3) {
        return this.genericMessageTitle.getText().equals(getResources().getString(C1146R.string.holidayspromotion_title_completed)) ? new ClaimDialogResultWrapper(getArguments().getString("package_name"), true) : new ClaimDialogResultWrapper(getArguments().getString("package_name"), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getWalletClick$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ String m8471g(Void r2) {
        return getArguments().getString("package_name");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$walletCancelClick$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ String m8472h(Void r2) {
        return getArguments().getString("package_name");
    }

    private void setInvalidWalletMessage() {
        this.walletMessageIcon.setImageDrawable(getResources().getDrawable(C1146R.drawable.ic_info));
    }

    private void setValidWalletMessage() {
        this.walletMessageIcon.setImageDrawable(getResources().getDrawable(C1146R.drawable.ic_check_green));
    }

    private void showErrorView(String str) {
        this.loading.setVisibility(8);
        this.genericErrorView.setVisibility(0);
        this.insertWalletView.setVisibility(8);
        this.updateWalletView.setVisibility(8);
        this.genericMessageView.setVisibility(8);
        this.genericErrorViewMessage.setText(str);
    }

    private void showGenericMessageView(String str, String str2) {
        this.walletErrorView.setVisibility(8);
        this.loading.setVisibility(8);
        this.insertWalletView.setVisibility(8);
        this.updateWalletView.setVisibility(8);
        this.genericMessageTitle.setText(str);
        this.genericMessageBody.setText(str2);
        this.genericMessageView.setVisibility(0);
    }

    private void showWalletView() {
        this.walletErrorView.setVisibility(8);
        this.loading.setVisibility(8);
        this.genericMessageView.setVisibility(8);
        this.insertWalletView.setVisibility(0);
        this.updateWalletView.setVisibility(8);
    }

    private boolean validateAddress(String str) {
        if (str != null) {
            return str.matches("(^(0x))([0-9a-f]{40})$");
        }
        return false;
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public C11234e<ClaimPromotionsClickWrapper> continueWalletClick() {
        return C8975a.m28573a(this.walletNextButton).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10710f.m8469e((Void) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void dismissDialog() {
        dismiss();
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public C11234e<Void> dismissGenericErrorClick() {
        return C8975a.m28573a(this.genericErrorOkButton);
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public C11234e<ClaimDialogResultWrapper> dismissGenericMessage() {
        return C8975a.m28573a(this.genericMessageButton).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10690f.m8470f((Void) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public C11234e<C8982b> editTextChanges() {
        return C8981a.m28581a(this.walletAddressEdit);
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void fetchWalletAddressByClipboard() {
        if (this.clipboard.hasPrimaryClip() && this.clipboard.getPrimaryClipDescription().hasMimeType("text/plain")) {
            updateWalletText(this.clipboard.getPrimaryClip().getItemAt(0).getText().toString());
        }
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void fetchWalletAddressByIntent() {
        if (this.walletErrorView.getVisibility() != 0) {
            this.navigator.fetchWalletAddressByIntent(WALLET_PERMISSIONS_INTENT_URI_ACTION, 123, WALLET_PERMISSIONS_INTENT_EXTRA_KEY, WALLET_PERMISSIONS_INTENT_EXTRA_VALUE);
        }
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public C11234e<Result> getActivityResults() {
        return ((ActivityResultNavigator) getContext()).results();
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public C11234e<String> getWalletClick() {
        return C8975a.m28573a(this.getWalletAddressButton).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10720f.m8471g((Void) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void handleEmptyEditText(Editable editable) {
        if (editable.toString().equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            this.walletMessageIcon.setVisibility(8);
        } else {
            this.walletMessageIcon.setVisibility(0);
        }
        if (validateAddress(editable.toString())) {
            enableNextButton();
            disableWalletButton();
            setValidWalletMessage();
        } else {
            disableNextButton();
            enableWalletButton();
            setInvalidWalletMessage();
        }
        this.walletErrorView.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public C11234e<Void> onCancelWalletUpdate() {
        return C8975a.m28573a(this.cancelUpdateWalletButton);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.clipboard = (ClipboardManager) getContext().getSystemService("clipboard");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        getDialog().getWindow().requestFeature(1);
        return layoutInflater.inflate(C1146R.layout.promotions_claim_dialog, viewGroup, false);
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.walletAddressEdit = null;
        this.getWalletAddressButton = null;
        this.walletNextButton = null;
        this.walletCancelButton = null;
        this.walletMessageIcon = null;
        this.walletErrorView = null;
        this.genericMessageTitle = null;
        this.genericMessageBody = null;
        this.genericMessageButton = null;
        this.genericErrorOkButton = null;
        this.insertWalletView = null;
        this.genericMessageView = null;
        this.genericErrorView = null;
        this.updateWalletView = null;
        this.cancelUpdateWalletButton = null;
        this.updateWalletButton = null;
        this.presenter.dispose();
        this.presenter = null;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Window window = getDialog().getWindow();
        Point point = new Point();
        window.getWindowManager().getDefaultDisplay().getSize(point);
        double d2 = point.x;
        Double.isNaN(d2);
        window.setLayout((int) (d2 * 0.9d), -2);
        window.setGravity(17);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.insertWalletView.getVisibility() == 0) {
            bundle.putString(VIEW, WALLET);
            return;
        }
        if (this.genericMessageView.getVisibility() == 0 && this.genericMessageTitle.getText().equals(getResources().getString(C1146R.string.holidayspromotion_title_completed))) {
            bundle.putString(VIEW, "success");
            return;
        }
        if (this.genericMessageView.getVisibility() == 0 && this.genericMessageTitle.getText().equals(getResources().getString(C1146R.string.holidayspromotion_title_error_claimed))) {
            bundle.putString(VIEW, CLAIMED);
        } else if (this.genericErrorView.getVisibility() == 0) {
            bundle.putString(VIEW, GENERIC_ERROR);
        }
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public C11234e<Void> onUpdateWalletClick() {
        return C8975a.m28573a(this.updateWalletButton);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.loading = (ProgressBar) view.findViewById(C1146R.id.loading);
        this.walletAddressEdit = (EditText) view.findViewById(C1146R.id.wallet_edit);
        this.getWalletAddressButton = (Button) view.findViewById(C1146R.id.get_wallet_button);
        this.walletNextButton = (Button) view.findViewById(C1146R.id.wallet_continue_button);
        this.walletCancelButton = (Button) view.findViewById(C1146R.id.wallet_cancel_button);
        this.walletMessageIcon = (ImageView) view.findViewById(C1146R.id.wallet_message_icon);
        this.walletErrorView = view.findViewById(C1146R.id.wallet_error_view);
        this.genericMessageTitle = (TextView) view.findViewById(C1146R.id.generic_message_title);
        this.genericMessageBody = (TextView) view.findViewById(C1146R.id.generic_message_body);
        this.genericMessageButton = (TextView) view.findViewById(C1146R.id.generic_message_button);
        this.genericErrorOkButton = (Button) view.findViewById(C1146R.id.error_ok_button);
        this.insertWalletView = view.findViewById(C1146R.id.insert_address_view);
        this.genericMessageView = view.findViewById(C1146R.id.generic_message_view);
        this.genericErrorView = view.findViewById(C1146R.id.generic_error);
        this.genericErrorViewMessage = (TextView) view.findViewById(C1146R.id.generic_error_message);
        this.updateWalletView = view.findViewById(C1146R.id.update_wallet_view);
        this.cancelUpdateWalletButton = (Button) view.findViewById(C1146R.id.cancel_wallet_update_button);
        this.updateWalletButton = (Button) view.findViewById(C1146R.id.update_wallet_button);
        attachPresenter(this.presenter);
        handleRestoreViewState(bundle);
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void sendWalletIntent() {
        AptoideUtils.SystemU.openApp(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME, getContext().getPackageManager(), getContext());
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void showCanceledVerificationError() {
        showErrorView(getString(C1146R.string.appc_verification_cancelled_by_user_message));
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void showClaimSuccess() {
        this.loading.setVisibility(8);
        showGenericMessageView(getResources().getString(C1146R.string.holidayspromotion_title_completed), getResources().getString(C1146R.string.holidayspromotion_message_completed));
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void showGenericError() {
        showErrorView(getString(C1146R.string.error_occured));
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void showInvalidWalletAddress() {
        this.loading.setVisibility(8);
        showWalletView();
        this.walletAddressEdit.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        this.walletMessageIcon.setVisibility(8);
        this.walletErrorView.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void showLoading() {
        this.loading.setVisibility(0);
        this.insertWalletView.setVisibility(8);
        this.genericMessageView.setVisibility(8);
        this.updateWalletView.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void showPromotionAlreadyClaimed() {
        this.loading.setVisibility(8);
        showGenericMessageView(getResources().getString(C1146R.string.holidayspromotion_title_error_claimed), getResources().getString(C1146R.string.holidayspromotion_short_error_claimed));
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void showUpdateWalletDialog() {
        this.loading.setVisibility(8);
        this.genericErrorView.setVisibility(8);
        this.insertWalletView.setVisibility(8);
        this.genericMessageView.setVisibility(8);
        this.updateWalletView.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void updateWalletText(String str) {
        if (validateAddress(str)) {
            this.walletAddressEdit.setText(str);
        }
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public void verifyWallet() {
        if (this.walletErrorView.getVisibility() != 0) {
            this.navigator.validateWallet(WALLET_VERIFICATION_INTENT_URI_ACTION, 124);
        }
    }

    @Override // cm.aptoide.p092pt.promotions.ClaimPromotionDialogView
    public C11234e<String> walletCancelClick() {
        return C8975a.m28573a(this.walletCancelButton).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10700f.m8472h((Void) obj);
            }
        });
    }
}
