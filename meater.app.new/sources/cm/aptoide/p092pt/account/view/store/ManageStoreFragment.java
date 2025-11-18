package cm.aptoide.p092pt.account.view.store;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.ActivityC0067d;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.view.ImagePickerErrorHandler;
import cm.aptoide.p092pt.account.view.ImagePickerPresenter;
import cm.aptoide.p092pt.account.view.exception.InvalidImageException;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.orientation.ScreenOrientationManager;
import cm.aptoide.p092pt.presenter.CompositePresenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.themes.StoreTheme;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.view.BackButtonFragment;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import cm.aptoide.p092pt.view.custom.DividerItemDecoration;
import cm.aptoide.p092pt.view.dialog.ImagePickerDialog;
import com.google.android.material.snackbar.Snackbar;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import java.util.Arrays;
import javax.inject.Inject;
import org.parceler.C11187d;
import p024c.p025a.p032o.C0844d;
import p241e.p294g.p295a.p304c.C8975a;
import p241e.p294g.p306b.C8988c;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class ManageStoreFragment extends BackButtonFragment implements ManageStoreView, NotBottomNavigationView {
    private static final String EXTRA_GO_TO_HOME = "go_to_home";
    private static final String EXTRA_STORE_MODEL = "store_model";
    private static final float SPACE_BETWEEN = 0.0f;
    private static final float STROKE_SIZE = 0.04f;
    private Button cancelChangesButton;
    private TextView chooseStoreNameTitle;
    private ManageStoreViewModel currentModel;
    private ImagePickerDialog dialogFragment;
    private boolean goToHome;
    private ImagePickerErrorHandler imagePickerErrorHandler;

    @Inject
    ImagePickerPresenter imagePickerPresenter;

    @Inject
    ManageStorePresenter manageStorePresenter;

    @Inject
    ScreenOrientationManager orientationManager;
    private Button saveDataButton;
    private View selectStoreImageButton;
    private EditText storeDescription;
    private ImageView storeImage;
    private EditText storeName;

    @Inject
    ThemeManager themeManager;
    private ThemeSelectorViewAdapter themeSelectorAdapter;
    private RecyclerView themeSelectorView;
    private Toolbar toolbar;
    private ProgressDialog waitDialog;

    private void attachPresenters() {
        attachPresenter(new CompositePresenter(Arrays.asList(this.imagePickerPresenter, this.manageStorePresenter)));
    }

    private String getViewTitle(ManageStoreViewModel manageStoreViewModel) {
        return !manageStoreViewModel.storeExists() ? getString(C1146R.string.create_store_title) : getString(C1146R.string.edit_store_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelClick$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ManageStoreViewModel m6926e(Void r1) {
        return this.currentModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelClick$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6927f(ManageStoreViewModel manageStoreViewModel) {
        hideKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$saveDataClick$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ManageStoreViewModel m6928g(Void r1) {
        return updateAndGetStoreModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$saveDataClick$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6929h(ManageStoreViewModel manageStoreViewModel) {
        hideKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupThemeSelector$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6930i(StoreTheme storeTheme) {
        this.currentModel.setStoreTheme(storeTheme);
    }

    static /* synthetic */ void lambda$showIconPropertiesError$0(GenericDialogs.EResponse eResponse) {
    }

    public static ManageStoreFragment newInstance(ManageStoreViewModel manageStoreViewModel, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(EXTRA_STORE_MODEL, C11187d.m39875c(manageStoreViewModel));
        bundle.putBoolean(EXTRA_GO_TO_HOME, z);
        ManageStoreFragment manageStoreFragment = new ManageStoreFragment();
        manageStoreFragment.setArguments(bundle);
        return manageStoreFragment;
    }

    private void setupViewsDefaultDataUsingCurrentModel() {
        this.storeName.setText(this.currentModel.getStoreName());
        if (!this.currentModel.storeExists()) {
            this.chooseStoreNameTitle.setText(C1146R.string.create_store_name);
            return;
        }
        this.chooseStoreNameTitle.setText(AptoideUtils.StringU.getFormattedString(C1146R.string.description, getResources(), new Object[0]));
        this.storeName.setVisibility(8);
        this.storeDescription.setVisibility(0);
        this.storeDescription.setText(this.currentModel.getStoreDescription());
        loadImageStateless(this.currentModel.getPictureUri());
        this.saveDataButton.setText(C1146R.string.save_edit_store);
        this.cancelChangesButton.setText(C1146R.string.cancel);
    }

    private ManageStoreViewModel updateAndGetStoreModel() {
        ManageStoreViewModel manageStoreViewModelUpdate = ManageStoreViewModel.update(this.currentModel, this.storeName.getText().toString(), this.storeDescription.getText().toString());
        this.currentModel = manageStoreViewModelUpdate;
        manageStoreViewModelUpdate.setStoreTheme(this.themeSelectorAdapter.getSelectedTheme());
        return this.currentModel;
    }

    public void bindViews(View view) {
        this.chooseStoreNameTitle = (TextView) view.findViewById(C1146R.id.create_store_choose_name_title);
        this.selectStoreImageButton = view.findViewById(C1146R.id.create_store_image_action);
        this.storeImage = (ImageView) view.findViewById(C1146R.id.create_store_image);
        this.storeName = (EditText) view.findViewById(C1146R.id.create_store_name);
        this.storeDescription = (EditText) view.findViewById(C1146R.id.edit_store_description);
        this.cancelChangesButton = (Button) view.findViewById(C1146R.id.create_store_skip);
        this.saveDataButton = (Button) view.findViewById(C1146R.id.create_store_action);
        this.themeSelectorView = (RecyclerView) view.findViewById(C1146R.id.theme_selector);
        this.waitDialog = GenericDialogs.createGenericPleaseWaitDialog(getActivity(), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId, getActivity().getApplicationContext().getString(C1146R.string.please_wait_upload));
        this.toolbar = (Toolbar) view.findViewById(C1146R.id.toolbar);
    }

    @Override // cm.aptoide.p092pt.account.view.store.ManageStoreView
    public C11234e<ManageStoreViewModel> cancelClick() {
        return C8975a.m28573a(this.cancelChangesButton).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.store.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7381f.m6926e((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.store.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7377f.m6927f((ManageStoreViewModel) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.account.view.ImagePickerView
    public C11234e<DialogInterface> dialogCameraSelected() {
        return this.dialogFragment.cameraSelected();
    }

    @Override // cm.aptoide.p092pt.account.view.ImagePickerView
    public C11234e<DialogInterface> dialogGallerySelected() {
        return this.dialogFragment.gallerySelected();
    }

    @Override // cm.aptoide.p092pt.account.view.ImagePickerView
    public void dismissLoadImageDialog() {
        this.dialogFragment.dismiss();
    }

    @Override // cm.aptoide.p092pt.account.view.store.ManageStoreView
    public void dismissWaitProgressBar() {
        this.orientationManager.unlock();
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.waitDialog.dismiss();
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void hideKeyboard() {
        super.hideKeyboard();
    }

    @Override // cm.aptoide.p092pt.account.view.ImagePickerView
    public void loadImage(String str) {
        loadImageStateless(str);
        this.currentModel.setNewAvatar(true);
    }

    @Override // cm.aptoide.p092pt.account.view.store.ManageStoreView
    public void loadImageStateless(String str) {
        ImageLoader.with(getActivity()).loadWithShadowCircleTransform(str, this.storeImage, this.themeManager.getAttributeForTheme(C1146R.attr.colorPrimary).data, SPACE_BETWEEN, STROKE_SIZE);
        this.currentModel.setPictureUri(str);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.currentModel = (ManageStoreViewModel) C11187d.m39873a(getArguments().getParcelable(EXTRA_STORE_MODEL));
        this.goToHome = getArguments().getBoolean(EXTRA_GO_TO_HOME, true);
        this.dialogFragment = new ImagePickerDialog.Builder(new C0844d(getContext(), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId), this.themeManager).setViewRes(C1146R.layout.dialog_choose_avatar_source).setTitle(C1146R.string.upload_dialog_title).setNegativeButton(C1146R.string.cancel).setCameraButton(C1146R.id.button_camera).setGalleryButton(C1146R.id.button_gallery).build();
        this.imagePickerErrorHandler = new ImagePickerErrorHandler(getContext(), this.themeManager);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1146R.layout.fragment_manage_store, viewGroup, false);
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        dismissWaitProgressBar();
        ImagePickerDialog imagePickerDialog = this.dialogFragment;
        if (imagePickerDialog != null) {
            imagePickerDialog.dismiss();
            this.dialogFragment = null;
        }
        hideKeyboard();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(EXTRA_STORE_MODEL, C11187d.m39875c(this.currentModel));
        bundle.putBoolean(EXTRA_GO_TO_HOME, this.goToHome);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bindViews(view);
        setupToolbarTitle();
        setupThemeSelector();
        setupViewsDefaultDataUsingCurrentModel();
        attachPresenters();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            try {
                this.currentModel = (ManageStoreViewModel) C11187d.m39873a(bundle.getParcelable(EXTRA_STORE_MODEL));
            } catch (NullPointerException unused) {
                this.currentModel = new ManageStoreViewModel();
            }
            this.goToHome = bundle.getBoolean(EXTRA_GO_TO_HOME, true);
        }
    }

    @Override // cm.aptoide.p092pt.account.view.store.ManageStoreView
    public C11234e<ManageStoreViewModel> saveDataClick() {
        return C8975a.m28573a(this.saveDataButton).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.store.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7382f.m6928g((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.store.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7373f.m6929h((ManageStoreViewModel) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.account.view.ImagePickerView
    public C11234e<Void> selectStoreImageClick() {
        return C8975a.m28573a(this.selectStoreImageButton);
    }

    public void setupThemeSelector() {
        this.themeSelectorView.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        ThemeSelectorViewAdapter themeSelectorViewAdapter = new ThemeSelectorViewAdapter(C8988c.m28593f1(), StoreTheme.getThemesFromVersion(8), this.themeManager);
        this.themeSelectorAdapter = themeSelectorViewAdapter;
        this.themeSelectorView.setAdapter(themeSelectorViewAdapter);
        this.themeSelectorAdapter.storeThemeSelection().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.store.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7375f.m6930i((StoreTheme) obj);
            }
        }).m40091f(bindUntilEvent(EnumC8762b.DESTROY_VIEW)).m40056D0();
        this.themeSelectorView.addItemDecoration(new DividerItemDecoration(getContext(), 8.0f, 3));
        this.themeSelectorAdapter.m6947g(this.currentModel.getStoreTheme());
    }

    public void setupToolbarTitle() {
        this.toolbar.setTitle(getViewTitle(this.currentModel));
        ((ActivityC0067d) getActivity()).setSupportActionBar(this.toolbar);
        AbstractC0064a supportActionBar = ((ActivityC0067d) getActivity()).getSupportActionBar();
        supportActionBar.mo227r(false);
        supportActionBar.mo231v(this.toolbar.getTitle());
    }

    @Override // cm.aptoide.p092pt.account.view.store.ManageStoreView
    public void showError(String str) {
        Snackbar.m24764a0(this.saveDataButton, str, 0).mo24744P();
    }

    @Override // cm.aptoide.p092pt.account.view.ImagePickerView
    public void showIconPropertiesError(InvalidImageException invalidImageException) {
        this.imagePickerErrorHandler.showIconPropertiesError(invalidImageException).m40091f(bindUntilEvent(View.LifecycleEvent.PAUSE)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.store.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ManageStoreFragment.lambda$showIconPropertiesError$0((GenericDialogs.EResponse) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.store.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.account.view.ImagePickerView
    public void showImagePickerDialog() {
        this.dialogFragment.show();
    }

    @Override // cm.aptoide.p092pt.account.view.store.ManageStoreView
    public void showSuccessMessage() {
        Snackbar.m24764a0(this.saveDataButton, getString(C1146R.string.done), 0).mo24744P();
    }

    @Override // cm.aptoide.p092pt.account.view.store.ManageStoreView
    public void showWaitProgressBar() {
        this.orientationManager.lock();
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog == null || progressDialog.isShowing()) {
            return;
        }
        this.waitDialog.show();
    }
}
