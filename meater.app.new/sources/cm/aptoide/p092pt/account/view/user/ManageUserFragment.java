package cm.aptoide.p092pt.account.view.user;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.ActivityC0067d;
import androidx.appcompat.widget.Toolbar;
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
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.view.BackButtonFragment;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import cm.aptoide.p092pt.view.dialog.ImagePickerDialog;
import com.google.android.material.snackbar.Snackbar;
import java.util.Arrays;
import java.util.Calendar;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import okhttp3.HttpUrl;
import org.parceler.C11187d;
import p024c.p025a.p032o.C0844d;
import p241e.p294g.p295a.p297b.p298a.p299a.C8961c;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class ManageUserFragment extends BackButtonFragment implements ManageUserView, NotBottomNavigationView {
    private static final int DEFAULT_IMAGE_PLACEHOLDER = 2131231053;
    private static final String EXTRA_IS_EDIT = "is_edit";
    private static final String EXTRA_USER_MODEL = "user_model";
    private Button cancelUserProfile;
    private Button createUserButton;
    private ViewModel currentModel;
    private ImagePickerDialog dialogFragment;
    private ImagePickerErrorHandler imagePickerErrorHandler;

    @Inject
    ImagePickerPresenter imagePickerPresenter;
    private boolean isEditProfile;

    @Inject
    ManageUserPresenter manageUserPresenter;

    @Inject
    NewsletterManager newsletterManager;

    @Inject
    ScreenOrientationManager orientationManager;

    @Inject
    ThemeManager themeManager;
    private Toolbar toolbar;
    private ProgressDialog uploadWaitDialog;
    private EditText userName;
    private ImageView userPicture;
    private RelativeLayout userPictureLayout;

    private void attachPresenters() {
        attachPresenter(new CompositePresenter(Arrays.asList(this.manageUserPresenter, this.imagePickerPresenter)));
    }

    private void bindViews(View view) {
        this.toolbar = (Toolbar) view.findViewById(C1146R.id.toolbar);
        this.userPictureLayout = (RelativeLayout) view.findViewById(C1146R.id.create_user_image_action);
        this.userName = (EditText) view.findViewById(C1146R.id.create_user_username_inserted);
        this.createUserButton = (Button) view.findViewById(C1146R.id.create_user_create_profile);
        this.cancelUserProfile = (Button) view.findViewById(C1146R.id.create_user_cancel_button);
        this.userPicture = (ImageView) view.findViewById(C1146R.id.create_user_image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$saveUserDataButtonClick$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ViewModel m6949e(Void r1) {
        return updateModelAndGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showErrorMessage$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Snackbar m6950f(String str) throws Exception {
        return Snackbar.m24764a0(this.createUserButton, str, 0);
    }

    static /* synthetic */ C11231b lambda$showErrorMessage$2(Snackbar snackbar) {
        snackbar.mo24744P();
        return C8961c.m28557a(snackbar).m40083X0();
    }

    static /* synthetic */ void lambda$showIconPropertiesError$3(GenericDialogs.EResponse eResponse) {
    }

    private static ManageUserFragment newInstance(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(EXTRA_IS_EDIT, z);
        ManageUserFragment manageUserFragment = new ManageUserFragment();
        manageUserFragment.setArguments(bundle);
        return manageUserFragment;
    }

    public static ManageUserFragment newInstanceToCreate() {
        return newInstance(false);
    }

    public static ManageUserFragment newInstanceToEdit() {
        return newInstance(true);
    }

    private void setupCalendar(Calendar calendar, int i2, int i3, int i4) {
        calendar.set(1, i2);
        calendar.set(2, i3);
        calendar.set(5, i4);
    }

    private void setupToolbar() {
        if (this.isEditProfile) {
            this.toolbar.setTitle(getString(C1146R.string.edit_profile_title));
        } else {
            this.toolbar.setTitle(C1146R.string.create_user_title);
        }
        ((ActivityC0067d) getActivity()).setSupportActionBar(this.toolbar);
        AbstractC0064a supportActionBar = ((ActivityC0067d) getActivity()).getSupportActionBar();
        supportActionBar.mo227r(false);
        supportActionBar.mo231v(this.toolbar.getTitle());
    }

    @Override // cm.aptoide.p092pt.account.view.user.ManageUserView
    public C11234e<Void> cancelButtonClick() {
        return C8975a.m28573a(this.cancelUserProfile);
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

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.account.view.user.ManageUserView
    public void hideProgressDialog() {
        this.uploadWaitDialog.dismiss();
        this.orientationManager.unlock();
    }

    @Override // cm.aptoide.p092pt.account.view.ImagePickerView
    public void loadImage(String str) {
        loadImageStateless(str);
        this.currentModel.setNewPicture(true);
    }

    @Override // cm.aptoide.p092pt.account.view.user.ManageUserView
    public void loadImageStateless(String str) {
        this.currentModel.setPictureUri(str);
        ImageLoader.with(getActivity()).loadUsingCircleTransformAndPlaceholder(str, this.userPicture, C1146R.drawable.create_user_avatar);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        Context context = getContext();
        if (bundle == null || !bundle.containsKey(EXTRA_USER_MODEL)) {
            this.currentModel = new ViewModel();
        } else {
            this.currentModel = (ViewModel) C11187d.m39873a(bundle.getParcelable(EXTRA_USER_MODEL));
        }
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null && arguments.getBoolean(EXTRA_IS_EDIT, false)) {
            z = true;
        }
        this.isEditProfile = z;
        this.imagePickerErrorHandler = new ImagePickerErrorHandler(context, this.themeManager);
        this.dialogFragment = new ImagePickerDialog.Builder(new C0844d(getContext(), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId), this.themeManager).setViewRes(C1146R.layout.dialog_choose_avatar_source).setTitle(C1146R.string.upload_dialog_title).setNegativeButton(C1146R.string.cancel).setCameraButton(C1146R.id.button_camera).setGalleryButton(C1146R.id.button_gallery).build();
        this.uploadWaitDialog = GenericDialogs.createGenericPleaseWaitDialog(context, this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId, context.getString(C1146R.string.please_wait_upload));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1146R.layout.fragment_manage_user, viewGroup, false);
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ProgressDialog progressDialog = this.uploadWaitDialog;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.uploadWaitDialog.dismiss();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(EXTRA_USER_MODEL, C11187d.m39875c(this.currentModel));
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bindViews(view);
        setupToolbar();
        if (bundle == null || !bundle.containsKey(EXTRA_USER_MODEL)) {
            this.currentModel = new ViewModel();
        } else {
            ViewModel viewModel = (ViewModel) C11187d.m39873a(bundle.getParcelable(EXTRA_USER_MODEL));
            this.currentModel = viewModel;
            loadImageStateless(viewModel.getPictureUri());
            setUserName(this.currentModel.getName());
        }
        if (this.isEditProfile) {
            this.createUserButton.setText(getString(C1146R.string.edit_profile_save_button));
            this.cancelUserProfile.setVisibility(0);
        }
        attachPresenters();
    }

    @Override // cm.aptoide.p092pt.account.view.user.ManageUserView
    public C11234e<ViewModel> saveUserDataButtonClick() {
        return C8975a.m28573a(this.createUserButton).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7425f.m6949e((Void) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.account.view.ImagePickerView
    public C11234e<Void> selectStoreImageClick() {
        return C8975a.m28573a(this.userPictureLayout);
    }

    @Override // cm.aptoide.p092pt.account.view.user.ManageUserView
    public void setUserName(String str) {
        this.currentModel.setName(str);
        this.userName.setText(str);
    }

    @Override // cm.aptoide.p092pt.account.view.user.ManageUserView
    public C11231b showErrorMessage(final String str) {
        return Single.m39912l(new Callable() { // from class: cm.aptoide.pt.account.view.user.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7421f.m6950f(str);
            }
        }).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ManageUserFragment.lambda$showErrorMessage$2((Snackbar) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.account.view.ImagePickerView
    public void showIconPropertiesError(InvalidImageException invalidImageException) {
        this.imagePickerErrorHandler.showIconPropertiesError(invalidImageException).m40091f(bindUntilEvent(View.LifecycleEvent.PAUSE)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ManageUserFragment.lambda$showIconPropertiesError$3((GenericDialogs.EResponse) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.e
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

    @Override // cm.aptoide.p092pt.account.view.user.ManageUserView
    public void showProgressDialog() {
        this.orientationManager.lock();
        hideKeyboard();
        this.uploadWaitDialog.show();
    }

    public ViewModel updateModelAndGet() {
        return ViewModel.from(this.currentModel, this.userName.getText().toString());
    }

    protected static class ViewModel {
        boolean hasNewPicture;
        String name;
        String pictureUri;

        public ViewModel() {
            this.name = HttpUrl.FRAGMENT_ENCODE_SET;
            this.pictureUri = HttpUrl.FRAGMENT_ENCODE_SET;
            this.hasNewPicture = false;
        }

        public static ViewModel from(ViewModel viewModel, String str) {
            viewModel.setName(str);
            return viewModel;
        }

        public String getName() {
            return this.name;
        }

        public String getPictureUri() {
            return this.pictureUri;
        }

        public boolean hasNewPicture() {
            return this.hasNewPicture;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setNewPicture(boolean z) {
            this.hasNewPicture = z;
        }

        public void setPictureUri(String str) {
            this.pictureUri = str;
        }

        public ViewModel(String str, String str2) {
            this.name = str;
            this.pictureUri = str2;
            this.hasNewPicture = false;
            this.hasNewPicture = false;
        }
    }
}
