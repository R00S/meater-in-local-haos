package cm.aptoide.p092pt.themes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.feature.NewFeatureDialogPresenter;
import cm.aptoide.p092pt.view.fragment.BaseBottomSheetDialogView;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;

/* compiled from: NewFeatureDialogFragment.kt */
@Metadata(m32266d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001b"}, m32267d2 = {"Lcm/aptoide/pt/themes/NewFeatureDialogFragment;", "Lcm/aptoide/pt/view/fragment/BaseBottomSheetDialogView;", "Lcm/aptoide/pt/themes/NewFeatureDialogView;", "()V", "presenter", "Lcm/aptoide/pt/feature/NewFeatureDialogPresenter;", "getPresenter", "()Lcm/aptoide/pt/feature/NewFeatureDialogPresenter;", "setPresenter", "(Lcm/aptoide/pt/feature/NewFeatureDialogPresenter;)V", "clickDismiss", "Lrx/Observable;", "Ljava/lang/Void;", "clickTurnItOn", "dismissView", HttpUrl.FRAGMENT_ENCODE_SET, "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class NewFeatureDialogFragment extends BaseBottomSheetDialogView implements NewFeatureDialogView {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    @Inject
    public NewFeatureDialogPresenter presenter;

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

    @Override // cm.aptoide.p092pt.themes.NewFeatureDialogView
    public C11234e<Void> clickDismiss() {
        C11234e<Void> c11234eM28573a = C8975a.m28573a((Button) _$_findCachedViewById(C1146R.id.dismissButton));
        C9801m.m32345e(c11234eM28573a, "clicks(dismissButton)");
        return c11234eM28573a;
    }

    @Override // cm.aptoide.p092pt.themes.NewFeatureDialogView
    public C11234e<Void> clickTurnItOn() {
        C11234e<Void> c11234eM28573a = C8975a.m28573a((Button) _$_findCachedViewById(C1146R.id.turnItOnButton));
        C9801m.m32345e(c11234eM28573a, "clicks(turnItOnButton)");
        return c11234eM28573a;
    }

    @Override // cm.aptoide.p092pt.themes.NewFeatureDialogView
    public void dismissView() {
        dismiss();
    }

    public final NewFeatureDialogPresenter getPresenter() {
        NewFeatureDialogPresenter newFeatureDialogPresenter = this.presenter;
        if (newFeatureDialogPresenter != null) {
            return newFeatureDialogPresenter;
        }
        C9801m.m32363w("presenter");
        return null;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseBottomSheetDialogFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8765b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentComponent(savedInstanceState).inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C9801m.m32346f(inflater, "inflater");
        return inflater.inflate(C1146R.layout.dialog_new_feature, container, false);
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8765b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8765b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        C9801m.m32346f(view, "view");
        super.onViewCreated(view, savedInstanceState);
        attachPresenter(getPresenter());
    }

    public final void setPresenter(NewFeatureDialogPresenter newFeatureDialogPresenter) {
        C9801m.m32346f(newFeatureDialogPresenter, "<set-?>");
        this.presenter = newFeatureDialogPresenter;
    }
}
