package cm.aptoide.p092pt.store.view;

import android.R;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.app.DialogInterfaceC0066c;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.Fragment;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV7Exception;
import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreMeta;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreMetaRequest;
import cm.aptoide.p092pt.store.StoreError;
import cm.aptoide.p092pt.store.StoreUtils;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.view.fragment.BaseDialogFragment;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class PrivateStoreDialog extends BaseDialogFragment {
    public static final String TAG = "PrivateStoreDialog";
    private AptoideAccountManager accountManager;
    private BodyInterceptor<BaseBody> bodyInterceptor;
    private Converter.Factory converterFactory;
    private OkHttpClient httpClient;
    private boolean isInsideStore;
    private ProgressDialog loadingDialog;
    private String storeName;
    private String storePassSha1;
    private String storeUser;

    @Inject
    StoreUtilsProxy storeUtilsProxy;
    private TokenInvalidator tokenInvalidator;

    /* renamed from: cm.aptoide.pt.store.view.PrivateStoreDialog$1 */
    static /* synthetic */ class C44481 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$store$StoreError;

        static {
            int[] iArr = new int[StoreError.values().length];
            $SwitchMap$cm$aptoide$pt$store$StoreError = iArr;
            try {
                iArr[StoreError.PRIVATE_STORE_WRONG_CREDENTIALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private enum BundleArgs {
        STORE_NAME
    }

    private GetStoreMetaRequest buildRequest() {
        return GetStoreMetaRequest.m7490of(new BaseRequestWithStore.StoreCredentials(this.storeName, this.storeUser, this.storePassSha1), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
    }

    private void dismissLoadingDialog() {
        this.loadingDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateDialog$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8810d(GetStoreMeta getStoreMeta) {
        getTargetFragment().onActivityResult(getTargetRequestCode(), -1, null);
        dismissLoadingDialog();
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateDialog$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8811e(Throwable th) {
        dismissLoadingDialog();
        if (!(th instanceof AptoideWsV7Exception)) {
            th.printStackTrace();
            getTargetFragment().onActivityResult(getTargetRequestCode(), 22, null);
            dismiss();
            return;
        }
        if (C44481.$SwitchMap$cm$aptoide$pt$store$StoreError[StoreUtils.getErrorType(((AptoideWsV7Exception) th).getBaseResponse().getError().getCode()).ordinal()] != 1) {
            getTargetFragment().onActivityResult(getTargetRequestCode(), 22, null);
            dismiss();
        } else {
            this.storeUser = null;
            this.storePassSha1 = null;
            getTargetFragment().onActivityResult(getTargetRequestCode(), 21, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateDialog$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8812f(View view, DialogInterface dialogInterface, int i2) {
        this.storeUser = ((EditText) view.findViewById(C1146R.id.edit_store_username)).getText().toString();
        this.storePassSha1 = AptoideUtils.AlgorithmU.computeSha1(((EditText) view.findViewById(C1146R.id.edit_store_password)).getText().toString());
        this.storeUtilsProxy.subscribeStore(buildRequest(), new SuccessRequestListener() { // from class: cm.aptoide.pt.store.view.c1
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener, p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11316f.m8810d((GetStoreMeta) obj);
            }
        }, new ErrorRequestListener() { // from class: cm.aptoide.pt.store.view.b1
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                this.f11313a.m8811e(th);
            }
        }, this.storeName, this.accountManager, this.storeUser, this.storePassSha1);
        showLoadingDialog();
    }

    public static PrivateStoreDialog newInstance(Fragment fragment, int i2, String str, boolean z) {
        PrivateStoreDialog privateStoreDialog = new PrivateStoreDialog();
        Bundle bundle = new Bundle();
        bundle.putString(BundleArgs.STORE_NAME.name(), str);
        privateStoreDialog.setArguments(bundle);
        privateStoreDialog.setIsInsideStore(z);
        privateStoreDialog.setRetainInstance(true);
        privateStoreDialog.setTargetFragment(fragment, i2);
        return privateStoreDialog;
    }

    private void showLoadingDialog() {
        if (this.loadingDialog == null) {
            this.loadingDialog = GenericDialogs.createGenericPleaseWaitDialog(getActivity(), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId);
        }
        this.loadingDialog.show();
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.tokenInvalidator = ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator();
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.bodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.storeName = arguments.getString(BundleArgs.STORE_NAME.name());
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public Dialog onCreateDialog(Bundle bundle) {
        ActivityC0468d activity = getActivity();
        final View viewInflate = LayoutInflater.from(activity).inflate(C1146R.layout.dialog_add_pvt_store, (ViewGroup) null, false);
        return new DialogInterfaceC0066c.a(new ContextThemeWrapper(activity, this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId)).m264u(C1146R.string.subscribe_pvt_store).m266w(viewInflate).m260q(R.string.ok, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.store.view.d1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f11319f.m8812f(viewInflate, dialogInterface, i2);
            }
        }).m244a();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.isInsideStore) {
            getActivity().onBackPressed();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(BundleArgs.STORE_NAME.name(), this.storeName);
    }

    public void setIsInsideStore(boolean z) {
        this.isInsideStore = z;
    }
}
