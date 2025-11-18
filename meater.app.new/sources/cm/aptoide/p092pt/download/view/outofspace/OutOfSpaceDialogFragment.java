package cm.aptoide.p092pt.download.view.outofspace;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.fragment.BaseDialogView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10547v;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;

/* compiled from: OutOfSpaceDialogFragment.kt */
@Metadata(m32266d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010!\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\rH\u0016J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H\u0002J\u0017\u0010'\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u0014H\u0016J\u0016\u0010*\u001a\u00020\u00142\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020&0\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m32267d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogFragment;", "Lcm/aptoide/pt/view/fragment/BaseDialogView;", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogView;", "()V", "controller", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceController;", "presenter", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogPresenter;", "getPresenter", "()Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogPresenter;", "setPresenter", "(Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogPresenter;)V", "requiredSpace", HttpUrl.FRAGMENT_ENCODE_SET, "dismissDialogClick", "Lrx/Observable;", "Ljava/lang/Void;", "getDialogStyle", HttpUrl.FRAGMENT_ENCODE_SET, "onCreate", HttpUrl.FRAGMENT_ENCODE_SET, "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewCreated", "view", "onViewStateRestored", "requiredSpaceToInstall", "requiredAppSpace", "setOutOfSpaceMessage", "requiredSpaceString", HttpUrl.FRAGMENT_ENCODE_SET, "setupViews", "(Ljava/lang/Long;)V", "showGeneralOutOfSpaceError", "showInstalledApps", "installedApps", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "uninstallClick", "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class OutOfSpaceDialogFragment extends BaseDialogView implements OutOfSpaceDialogView {
    public static final String APP_PACKAGE_NAME = "package_name";
    public static final String APP_SIZE = "app_size";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int OUT_OF_SPACE_REQUEST_CODE = 1994;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private OutOfSpaceController controller;

    @Inject
    public OutOfSpaceDialogPresenter presenter;
    private long requiredSpace;

    /* compiled from: OutOfSpaceDialogFragment.kt */
    @Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m32267d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogFragment$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "APP_PACKAGE_NAME", HttpUrl.FRAGMENT_ENCODE_SET, "APP_SIZE", "OUT_OF_SPACE_REQUEST_CODE", HttpUrl.FRAGMENT_ENCODE_SET, "newInstance", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogFragment;", "requiredSpace", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }

        public final OutOfSpaceDialogFragment newInstance(long requiredSpace, String packageName) {
            C9801m.m32346f(packageName, "packageName");
            OutOfSpaceDialogFragment outOfSpaceDialogFragment = new OutOfSpaceDialogFragment();
            Bundle bundle = new Bundle(2);
            bundle.putLong(OutOfSpaceDialogFragment.APP_SIZE, requiredSpace);
            bundle.putString("package_name", packageName);
            outOfSpaceDialogFragment.setArguments(bundle);
            return outOfSpaceDialogFragment;
        }
    }

    private final void setOutOfSpaceMessage(String requiredSpaceString) {
        String string = getString(C1146R.string.out_of_space_body, requiredSpaceString);
        C9801m.m32345e(string, "getString(R.string.out_o…     requiredSpaceString)");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1146R.color.default_orange_gradient_end)), C10547v.m37557W(string, requiredSpaceString, 0, false, 6, null), C10547v.m37557W(string, requiredSpaceString, 0, false, 6, null) + requiredSpaceString.length(), 33);
        ((TextView) _$_findCachedViewById(C1146R.id.out_of_space_description)).setText(spannableString);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i2) {
        View viewFindViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (viewFindViewById = view2.findViewById(i2)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogView
    public C11234e<Void> dismissDialogClick() {
        C11234e<Void> c11234eM40033a0 = C11234e.m40033a0(C8975a.m28573a((Button) _$_findCachedViewById(C1146R.id.cancel_button)), C8975a.m28573a((Button) _$_findCachedViewById(C1146R.id.ok_button)));
        C9801m.m32345e(c11234eM40033a0, "merge(RxView.clicks(canc…RxView.clicks(ok_button))");
        return c11234eM40033a0;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment
    public int getDialogStyle() {
        return C1146R.attr.roundedDialogsTheme;
    }

    public final OutOfSpaceDialogPresenter getPresenter() {
        OutOfSpaceDialogPresenter outOfSpaceDialogPresenter = this.presenter;
        if (outOfSpaceDialogPresenter != null) {
            return outOfSpaceDialogPresenter;
        }
        C9801m.m32363w("presenter");
        return null;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentComponent(savedInstanceState).inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Window window;
        Window window2;
        C9801m.m32346f(inflater, "inflater");
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.requestFeature(1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawableResource(C1146R.drawable.transparent);
        }
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(C1146R.layout.out_of_space_dialog_fragment, container, false);
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        C9801m.m32346f(outState, "outState");
        super.onSaveInstanceState(outState);
        OutOfSpaceController outOfSpaceController = this.controller;
        if (outOfSpaceController == null) {
            C9801m.m32363w("controller");
            outOfSpaceController = null;
        }
        outOfSpaceController.onSaveInstanceState(outState);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        C9801m.m32346f(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            C9801m.m32343c(arguments);
            this.requiredSpace = arguments.getLong(APP_SIZE);
        }
        setupViews(Long.valueOf(this.requiredSpace));
        attachPresenter(getPresenter());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        OutOfSpaceController outOfSpaceController = this.controller;
        if (outOfSpaceController == null) {
            C9801m.m32363w("controller");
            outOfSpaceController = null;
        }
        outOfSpaceController.onRestoreInstanceState(savedInstanceState);
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogView
    public void requiredSpaceToInstall(long requiredAppSpace) {
        String bytes = AptoideUtils.StringU.formatBytes(requiredAppSpace, false);
        C9801m.m32345e(bytes, "formatBytes(requiredAppSpace, false)");
        setOutOfSpaceMessage(bytes);
    }

    public final void setPresenter(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "<set-?>");
        this.presenter = outOfSpaceDialogPresenter;
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogView
    public void setupViews(Long requiredSpace) {
        this.controller = new OutOfSpaceController();
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) _$_findCachedViewById(C1146R.id.unninstall_apps_list);
        OutOfSpaceController outOfSpaceController = this.controller;
        if (outOfSpaceController == null) {
            C9801m.m32363w("controller");
            outOfSpaceController = null;
        }
        epoxyRecyclerView.setController(outOfSpaceController);
        if (requiredSpace != null) {
            requiredSpace.longValue();
            String bytes = AptoideUtils.StringU.formatBytes(requiredSpace.longValue(), false);
            C9801m.m32345e(bytes, "formatBytes(requiredSpace, false)");
            setOutOfSpaceMessage(bytes);
        }
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogView
    public void showGeneralOutOfSpaceError() {
        ((Group) _$_findCachedViewById(C1146R.id.general_message_out_of_space_group)).setVisibility(0);
        ((ProgressBar) _$_findCachedViewById(C1146R.id.out_of_space_progress_bar)).setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogView
    public void showInstalledApps(List<InstalledApp> installedApps) {
        C9801m.m32346f(installedApps, "installedApps");
        ((Group) _$_findCachedViewById(C1146R.id.apps_list_group)).setVisibility(0);
        ((ProgressBar) _$_findCachedViewById(C1146R.id.out_of_space_progress_bar)).setVisibility(8);
        OutOfSpaceController outOfSpaceController = this.controller;
        if (outOfSpaceController == null) {
            C9801m.m32363w("controller");
            outOfSpaceController = null;
        }
        outOfSpaceController.setData(installedApps);
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogView
    public C11234e<String> uninstallClick() {
        OutOfSpaceController outOfSpaceController = this.controller;
        if (outOfSpaceController == null) {
            C9801m.m32363w("controller");
            outOfSpaceController = null;
        }
        return outOfSpaceController.getUninstallEvent();
    }
}
