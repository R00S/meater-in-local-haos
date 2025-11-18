package cm.aptoide.p092pt.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.NavigationTrackerPagerAdapterHelper;

@Deprecated
/* loaded from: classes.dex */
public class AptoideViewPager extends ViewPager {
    private boolean enabled;
    private boolean trackingEnabled;

    public AptoideViewPager(Context context) {
        super(context);
        this.enabled = true;
        this.trackingEnabled = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnPageChangeListener(new ViewPager.C0692m() { // from class: cm.aptoide.pt.view.custom.AptoideViewPager.1
            @Override // androidx.viewpager.widget.ViewPager.C0692m, androidx.viewpager.widget.ViewPager.InterfaceC0689j
            public void onPageSelected(int i2) {
                super.onPageSelected(i2);
                if (AptoideViewPager.this.trackingEnabled) {
                    if (!(AptoideViewPager.this.getAdapter() instanceof NavigationTrackerPagerAdapterHelper)) {
                        throw new RuntimeException(AptoideViewPager.this.getAdapter().getClass().getSimpleName() + " has to implement " + NavigationTrackerPagerAdapterHelper.class.getSimpleName());
                    }
                    if (i2 != 0) {
                        NavigationTrackerPagerAdapterHelper navigationTrackerPagerAdapterHelper = (NavigationTrackerPagerAdapterHelper) AptoideViewPager.this.getAdapter();
                        ((AptoideApplication) AptoideViewPager.this.getContext().getApplicationContext()).getNavigationTracker().registerScreen(ScreenTagHistory.Builder.build(navigationTrackerPagerAdapterHelper.getItemName(i2), navigationTrackerPagerAdapterHelper.getItemTag(i2), navigationTrackerPagerAdapterHelper.getItemStore().name()));
                    }
                }
            }
        });
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.enabled) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.enabled) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setPagingEnabled(boolean z) {
        this.enabled = z;
    }

    public void setTrackingEnabled(boolean z) {
        this.trackingEnabled = z;
    }

    public AptoideViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.enabled = true;
        this.trackingEnabled = true;
    }
}
