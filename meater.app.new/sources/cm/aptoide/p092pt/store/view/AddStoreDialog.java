package cm.aptoide.p092pt.store.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV7Exception;
import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreMeta;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreMetaRequest;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.orientation.ScreenOrientationManager;
import cm.aptoide.p092pt.search.SuggestionCursorAdapter;
import cm.aptoide.p092pt.search.suggestions.SearchSuggestionManager;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreError;
import cm.aptoide.p092pt.store.StoreUtils;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.fragment.BaseDialogFragment;
import com.google.android.material.snackbar.Snackbar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import p241e.p294g.p295a.p297b.p302c.p303a.C8970d;
import p241e.p294g.p295a.p297b.p302c.p303a.C8973g;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.Single;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p474t.C11426b;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class AddStoreDialog extends BaseDialogFragment {
    private static final int COMPLETION_THRESHOLD = 1;
    public static final int PRIVATE_STORE_ERROR_CODE = 22;
    public static final int PRIVATE_STORE_INVALID_CREDENTIALS_CODE = 21;
    private static final String TAG = AddStoreDialog.class.getName();
    private final int PRIVATE_STORE_REQUEST_CODE = 20;
    private AptoideAccountManager accountManager;
    private Button addStoreButton;
    private AnalyticsManager analyticsManager;
    private BodyInterceptor<BaseBody> baseBodyBodyInterceptor;
    private Converter.Factory converterFactory;
    private TextView errorMessage;
    private OkHttpClient httpClient;
    private Dialog loadingDialog;
    private NavigationTracker navigationTracker;
    private FragmentNavigator navigator;
    private ScreenOrientationManager orientationManager;
    private SearchSuggestionManager searchSuggestionManager;
    private SearchView searchView;
    private RelativeLayout searchViewLayout;
    private StoreAnalytics storeAnalytics;

    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    private String storeName;

    @Inject
    StoreUtilsProxy storeUtilsProxy;
    private C11426b subscriptions;
    private TokenInvalidator tokenInvalidator;
    private Button topStoresButton;

    /* renamed from: cm.aptoide.pt.store.view.AddStoreDialog$2 */
    static /* synthetic */ class C44442 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$store$StoreError;

        static {
            int[] iArr = new int[StoreError.values().length];
            $SwitchMap$cm$aptoide$pt$store$StoreError = iArr;
            try {
                iArr[StoreError.PRIVATE_STORE_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$store$StoreError[StoreError.STORE_DOESNT_EXIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum BundleArgs {
        STORE_NAME
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addStoreAction, reason: merged with bridge method [inline-methods] */
    public void m8777h(String str) {
        this.storeName = str;
        getStore(str);
        showLoadingDialog();
    }

    private void bindViews(View view) {
        this.addStoreButton = (Button) view.findViewById(C1146R.id.button_dialog_add_store);
        this.topStoresButton = (Button) view.findViewById(C1146R.id.button_top_stores);
        this.searchView = (SearchView) view.findViewById(C1146R.id.store_search_view);
        this.searchViewLayout = (RelativeLayout) view.findViewById(C1146R.id.search_box_layout);
        this.errorMessage = (TextView) view.findViewById(C1146R.id.error_message);
        EditText editText = (EditText) this.searchView.findViewById(C1146R.id.search_src_text);
        editText.setTextSize(2, 12.0f);
        editText.setHintTextColor(getResources().getColor(C1146R.color.grey));
    }

    private GetStoreMetaRequest buildRequest(String str) {
        return GetStoreMetaRequest.m7490of(StoreUtils.getStoreCredentials(str, this.storeCredentialsProvider), this.baseBodyBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
    }

    private void dismissIfFocusIsLost() {
        this.subscriptions.m40667a(C8975a.m28574b(this.searchView).m40124z0(300L, TimeUnit.MILLISECONDS).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(!bool.booleanValue());
            }
        }).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11311f.m8773d((Boolean) obj);
            }
        }));
    }

    private void executeRequest(GetStoreMetaRequest getStoreMetaRequest) {
        this.storeUtilsProxy.subscribeStore(getStoreMetaRequest, new SuccessRequestListener() { // from class: cm.aptoide.pt.store.view.i
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener, p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11341f.m8774e((GetStoreMeta) obj);
            }
        }, new ErrorRequestListener() { // from class: cm.aptoide.pt.store.view.g
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                this.f11335a.m8775f(th);
            }
        }, this.storeName, this.accountManager);
    }

    private void getStore(String str) {
        executeRequest(buildRequest(str));
    }

    private void handleEmptyQuery(final SuggestionCursorAdapter suggestionCursorAdapter) {
        this.subscriptions.m40667a(C8970d.m28566a(this.searchView).m40095j0(C11250a.m40156b()).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((C8973g) obj).m28571d().length() == 0);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.l
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                suggestionCursorAdapter.setData(Collections.emptyList());
            }
        }).m40056D0());
    }

    private void handleStoreRemoteQuery(final SuggestionCursorAdapter suggestionCursorAdapter) {
        this.subscriptions.m40667a(C8970d.m28566a(this.searchView).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                C8973g c8973g = (C8973g) obj;
                return Boolean.valueOf(!c8973g.m28570c());
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((C8973g) obj).m28571d().toString();
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                String str = (String) obj;
                return Boolean.valueOf(str != null && str.length() >= 1);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11400f.m8776g(suggestionCursorAdapter, (String) obj);
            }
        }).m40110s0().m40056D0());
    }

    private void handleSubmittedQuery() {
        this.subscriptions.m40667a(C8970d.m28566a(this.searchView).m40095j0(C11250a.m40156b()).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((C8973g) obj).m28570c());
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((C8973g) obj).m28571d().toString();
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11314f.m8777h((String) obj);
            }
        }).m40056D0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dismissIfFocusIsLost$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8773d(Boolean bool) {
        Dialog dialog = getDialog();
        if (dialog != null && dialog.isShowing() && isResumed()) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$executeRequest$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8774e(GetStoreMeta getStoreMeta) {
        ShowMessage.asSnack(getView(), AptoideUtils.StringU.getFormattedString(C1146R.string.store_followed, getContext().getResources(), this.storeName));
        dismissLoadingDialog();
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$executeRequest$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8775f(Throwable th) {
        dismissLoadingDialog();
        if (!(th instanceof AptoideWsV7Exception)) {
            this.searchViewLayout.setBackground(getResources().getDrawable(C1146R.drawable.add_stores_dialog_seach_box_error));
            this.errorMessage.setVisibility(0);
            this.errorMessage.setText(C1146R.string.error_occured);
            return;
        }
        BaseV7Response.Error error = ((AptoideWsV7Exception) th).getBaseResponse().getError();
        int i2 = C44442.$SwitchMap$cm$aptoide$pt$store$StoreError[StoreUtils.getErrorType(error.getCode()).ordinal()];
        if (i2 == 1) {
            PrivateStoreDialog.newInstance(this, 20, this.storeName, false).show(getFragmentManager(), PrivateStoreDialog.class.getName());
            return;
        }
        if (i2 != 2) {
            this.searchViewLayout.setBackground(getResources().getDrawable(C1146R.drawable.add_stores_dialog_seach_box_error));
            this.errorMessage.setVisibility(0);
            this.errorMessage.setText(error.getDescription());
        } else {
            this.searchViewLayout.setBackground(getResources().getDrawable(C1146R.drawable.add_stores_dialog_seach_box_error));
            this.errorMessage.setVisibility(0);
            this.errorMessage.setText(error.getDescription());
        }
    }

    static /* synthetic */ Single lambda$handleStoreRemoteQuery$7(SuggestionCursorAdapter suggestionCursorAdapter, Throwable th) {
        if (th instanceof TimeoutException) {
            Logger.getInstance().m8282i(TAG, "Timeout reached while waiting for store suggestions");
            return Single.m39913m(suggestionCursorAdapter.getSuggestions());
        }
        Logger.getInstance().m8286w(TAG, "handleStoreRemoteQuery: ", th);
        return Single.m39911h(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStoreRemoteQuery$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8776g(final SuggestionCursorAdapter suggestionCursorAdapter, String str) {
        return this.searchSuggestionManager.getSuggestionsForStore(str).m39925q(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AddStoreDialog.lambda$handleStoreRemoteQuery$7(suggestionCursorAdapter, (Throwable) obj);
            }
        }).m39924p(C11250a.m40156b()).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                suggestionCursorAdapter.setData((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupButtonHandlers$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8778i(Void r3) {
        setDefaultState();
        addStoreAction();
        this.storeAnalytics.sendStoreTabInteractEvent("Add Store", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupButtonHandlers$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8779j(Void r1) {
        topStoresAction();
    }

    private void setDefaultState() {
        this.errorMessage.setVisibility(4);
        this.searchViewLayout.setBackground(getResources().getDrawable(C1146R.drawable.add_stores_dialog_search_box_border));
    }

    private void setupButtonHandlers() {
        this.subscriptions.m40667a(C8975a.m28573a(this.addStoreButton).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.p
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11406f.m8778i((Void) obj);
            }
        }));
        this.subscriptions.m40667a(C8975a.m28573a(this.topStoresButton).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.m
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11355f.m8779j((Void) obj);
            }
        }));
    }

    private void setupSearch() {
        final SuggestionCursorAdapter suggestionCursorAdapter = new SuggestionCursorAdapter(getContext());
        this.searchView.setOnSuggestionListener(new SearchView.InterfaceC0140m() { // from class: cm.aptoide.pt.store.view.AddStoreDialog.1
            @Override // androidx.appcompat.widget.SearchView.InterfaceC0140m
            public boolean onSuggestionClick(int i2) {
                AddStoreDialog.this.searchView.m808d0(suggestionCursorAdapter.getSuggestionAt(i2), false);
                return true;
            }

            @Override // androidx.appcompat.widget.SearchView.InterfaceC0140m
            public boolean onSuggestionSelect(int i2) {
                return false;
            }
        });
        this.searchView.setSuggestionsAdapter(suggestionCursorAdapter);
        ((AutoCompleteTextView) this.searchView.findViewById(C1146R.id.search_src_text)).setThreshold(1);
        handleEmptyQuery(suggestionCursorAdapter);
        handleSubmittedQuery();
        handleStoreRemoteQuery(suggestionCursorAdapter);
    }

    private void showLoadingDialog() {
        if (this.loadingDialog == null) {
            this.loadingDialog = GenericDialogs.createGenericPleaseWaitDialog(getActivity(), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId);
        }
        this.orientationManager.lock();
        this.loadingDialog.show();
    }

    private void topStoresAction() {
        this.navigator.navigateTo(TopStoresFragment.newInstance(), true);
        if (isAdded()) {
            dismiss();
        }
    }

    void dismissLoadingDialog() {
        this.orientationManager.unlock();
        this.loadingDialog.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 20) {
            if (i3 == -1) {
                dismiss();
            } else if (i3 != 21) {
                Snackbar.m24763Z(this.searchView, C1146R.string.error_occured, -1).mo24744P();
            } else {
                Snackbar.m24763Z(this.searchView, C1146R.string.ws_error_invalid_grant, -1).mo24744P();
            }
        }
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (ActivityResultNavigator.class.isAssignableFrom(activity.getClass())) {
            this.navigator = ((ActivityResultNavigator) activity).getFragmentNavigator();
            this.orientationManager = new ScreenOrientationManager(activity, activity.getWindowManager());
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(AddStoreDialog.class.getSimpleName() + " must extend class " + ActivityResultNavigator.class.getSimpleName());
        Logger.getInstance().m8279e(TAG, (Throwable) illegalStateException);
        throw illegalStateException;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.subscriptions = new C11426b();
        this.tokenInvalidator = ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator();
        this.converterFactory = WebService.getDefaultConverter();
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.baseBodyBodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        if (bundle != null) {
            this.storeName = bundle.getString(BundleArgs.STORE_NAME.name());
        }
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.analyticsManager = aptoideApplication.getAnalyticsManager();
        NavigationTracker navigationTracker = aptoideApplication.getNavigationTracker();
        this.navigationTracker = navigationTracker;
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, navigationTracker);
        this.searchSuggestionManager = aptoideApplication.getSearchSuggestionManager();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -1);
            dialog.getWindow().requestFeature(1);
            dialog.setCancelable(true);
        }
        return layoutInflater.inflate(C1146R.layout.dialog_add_store, viewGroup, false);
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C11426b c11426b = this.subscriptions;
        if (c11426b != null && !c11426b.isUnsubscribed()) {
            this.subscriptions.unsubscribe();
        }
        super.onDestroyView();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = getDialog();
        Rect rect = new Rect();
        getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        double dWidth = rect.width();
        Double.isNaN(dWidth);
        double d2 = dWidth * 0.8d;
        if (dialog != null) {
            if (getResources().getConfiguration().orientation == 2) {
                dialog.getWindow().setLayout(Math.round((float) d2), -2);
            } else {
                dialog.getWindow().setLayout(-1, -2);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(BundleArgs.STORE_NAME.name(), this.storeName);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bindViews(view);
        setupSearch();
        setupButtonHandlers();
        dismissIfFocusIsLost();
    }

    @Deprecated
    private void addStoreAction() {
        String string = this.searchView.getQuery().toString();
        if (string.length() > 0) {
            this.storeName = string;
            getStore(string);
            showLoadingDialog();
        } else {
            this.searchViewLayout.setBackground(getResources().getDrawable(C1146R.drawable.add_stores_dialog_seach_box_error));
            this.errorMessage.setVisibility(0);
            this.errorMessage.setText(C1146R.string.add_store_dialog_no_query);
        }
    }
}
