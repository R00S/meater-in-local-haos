package cm.aptoide.p092pt.app.view.screenshots;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import cm.aptoide.p092pt.view.custom.AptoideViewPager;
import cm.aptoide.p092pt.view.fragment.UIComponentFragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ScreenshotsViewerFragment extends UIComponentFragment implements NotBottomNavigationView {
    private View btnCloseViewer;
    private int currentItem;
    private AptoideViewPager screenshots;
    private ArrayList<String> uris;

    private enum BundleArgs {
        POSITION,
        URIs
    }

    private void hideSystemUI() {
        this.screenshots.setSystemUiVisibility(3846);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupViews$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7314e(View view) {
        getActivity().onBackPressed();
    }

    public static ScreenshotsViewerFragment newInstance(ArrayList<String> arrayList, int i2) {
        ScreenshotsViewerFragment screenshotsViewerFragment = new ScreenshotsViewerFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(BundleArgs.URIs.name(), arrayList);
        bundle.putInt(BundleArgs.POSITION.name(), i2);
        screenshotsViewerFragment.setArguments(bundle);
        return screenshotsViewerFragment;
    }

    private void showSystemUI() {
        this.screenshots.setSystemUiVisibility(1792);
    }

    @Override // cm.aptoide.p092pt.view.fragment.UiComponent
    public void bindViews(View view) {
        this.screenshots = (AptoideViewPager) view.findViewById(C1146R.id.screen_shots_pager);
        this.btnCloseViewer = view.findViewById(C1146R.id.btn_close_screenshots_window);
    }

    @Override // cm.aptoide.p092pt.view.fragment.UiComponent
    public int getContentViewId() {
        return C1146R.layout.fragment_screenshots_viewer;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void loadExtras(Bundle bundle) {
        if (bundle == null) {
            this.currentItem = getActivity().getIntent().getIntExtra(BundleArgs.POSITION.name(), 0);
        } else {
            this.currentItem = bundle.getInt(BundleArgs.POSITION.name(), 0);
        }
        if (bundle == null) {
            this.uris = getActivity().getIntent().getStringArrayListExtra(BundleArgs.URIs.name());
        } else {
            this.uris = bundle.getStringArrayList(BundleArgs.URIs.name());
        }
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        showSystemUI();
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        hideSystemUI();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(BundleArgs.POSITION.name(), this.currentItem);
        bundle.putStringArrayList(BundleArgs.URIs.name(), this.uris);
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void setupViews() throws Resources.NotFoundException {
        this.screenshots.setTrackingEnabled(false);
        ArrayList<String> arrayList = this.uris;
        if (arrayList != null && arrayList.size() > 0) {
            this.screenshots.setAdapter(new ViewPagerAdapterScreenshots(this.uris));
            this.screenshots.setCurrentItem(this.currentItem);
        }
        this.btnCloseViewer.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.screenshots.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8055f.m7314e(view);
            }
        });
    }
}
