package cm.aptoide.p092pt.autoupdate;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.fragment.BaseDialogView;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;

/* compiled from: AutoUpdateDialogFragment.kt */
@Metadata(m32266d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001d"}, m32267d2 = {"Lcm/aptoide/pt/autoupdate/AutoUpdateDialogFragment;", "Lcm/aptoide/pt/view/fragment/BaseDialogView;", "Lcm/aptoide/pt/autoupdate/AutoUpdateDialogView;", "()V", "presenter", "Lcm/aptoide/pt/autoupdate/AutoUpdateDialogPresenter;", "getPresenter", "()Lcm/aptoide/pt/autoupdate/AutoUpdateDialogPresenter;", "setPresenter", "(Lcm/aptoide/pt/autoupdate/AutoUpdateDialogPresenter;)V", "dismissDialog", HttpUrl.FRAGMENT_ENCODE_SET, "notNowClicked", "Lrx/Observable;", "Ljava/lang/Void;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "shouldUseDefaultDialogStyle", HttpUrl.FRAGMENT_ENCODE_SET, "updateClicked", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AutoUpdateDialogFragment extends BaseDialogView implements AutoUpdateDialogView {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    @Inject
    public AutoUpdateDialogPresenter presenter;

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

    @Override // cm.aptoide.p092pt.autoupdate.AutoUpdateDialogView
    public void dismissDialog() {
        dismiss();
    }

    public final AutoUpdateDialogPresenter getPresenter() {
        AutoUpdateDialogPresenter autoUpdateDialogPresenter = this.presenter;
        if (autoUpdateDialogPresenter != null) {
            return autoUpdateDialogPresenter;
        }
        C9801m.m32363w("presenter");
        return null;
    }

    @Override // cm.aptoide.p092pt.autoupdate.AutoUpdateDialogView
    public C11234e<Void> notNowClicked() {
        C11234e<Void> c11234eM28573a = C8975a.m28573a((Button) _$_findCachedViewById(C1146R.id.not_now_button));
        C9801m.m32345e(c11234eM28573a, "clicks(not_now_button)");
        return c11234eM28573a;
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
        return inflater.inflate(C1146R.layout.auto_update_dialog_fragment, container, false);
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        C9801m.m32346f(view, "view");
        super.onViewCreated(view, savedInstanceState);
        attachPresenter(getPresenter());
    }

    public final void setPresenter(AutoUpdateDialogPresenter autoUpdateDialogPresenter) {
        C9801m.m32346f(autoUpdateDialogPresenter, "<set-?>");
        this.presenter = autoUpdateDialogPresenter;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment
    public boolean shouldUseDefaultDialogStyle() {
        return false;
    }

    @Override // cm.aptoide.p092pt.autoupdate.AutoUpdateDialogView
    public C11234e<Void> updateClicked() {
        C11234e<Void> c11234eM28573a = C8975a.m28573a((Button) _$_findCachedViewById(C1146R.id.update_button));
        C9801m.m32345e(c11234eM28573a, "clicks(update_button)");
        return c11234eM28573a;
    }
}
