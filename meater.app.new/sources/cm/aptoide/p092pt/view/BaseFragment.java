package cm.aptoide.p092pt.view;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.FlavourFragmentModule;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity;
import cm.aptoide.p092pt.logger.Logger;
import com.trello.rxlifecycle.p235h.p236a.AbstractC8767d;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class BaseFragment extends AbstractC8767d {
    private BottomNavigationActivity bottomNavigationActivity;
    private FragmentComponent fragmentComponent;

    private Fragment getRemovingParent(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null && parentFragment.isRemoving()) {
            return getRemovingParent(parentFragment);
        }
        if (fragment.isRemoving()) {
            return fragment;
        }
        return null;
    }

    private static long getRemovingParentAnimationDuration(Fragment fragment, long j2) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, IllegalArgumentException {
        try {
            Field declaredField = Fragment.class.getDeclaredField("mAnimationInfo");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(fragment);
            Field declaredField2 = obj.getClass().getDeclaredField("mNextAnim");
            declaredField2.setAccessible(true);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(fragment.getActivity(), declaredField2.getInt(obj));
            return animationLoadAnimation == null ? j2 : animationLoadAnimation.getDuration();
        } catch (Resources.NotFoundException | IllegalAccessException | NoSuchFieldException e2) {
            Logger.getInstance().m8278e("BASE FRAGMENT", "Unable to load next animation from parent.", e2);
            return j2;
        }
    }

    public FragmentComponent getFragmentComponent(Bundle bundle) {
        if (this.fragmentComponent == null) {
            AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
            this.fragmentComponent = ((BaseActivity) getActivity()).getActivityComponent().plus(aptoideApplication.getFragmentModule(this, bundle, getArguments(), aptoideApplication.isCreateStoreUserPrivacyEnabled(), getActivity().getApplicationContext().getPackageName()), new FlavourFragmentModule());
        }
        return this.fragmentComponent;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof BottomNavigationActivity) {
            this.bottomNavigationActivity = (BottomNavigationActivity) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        Fragment removingParent = getRemovingParent(getParentFragment());
        if (z || removingParent == null) {
            return super.onCreateAnimation(i2, z, i3);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
        alphaAnimation.setDuration(getRemovingParentAnimationDuration(removingParent, 300L));
        return alphaAnimation;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.fragmentComponent = null;
        super.onDestroy();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity = this.bottomNavigationActivity;
        if (bottomNavigationActivity != null) {
            bottomNavigationActivity.toggleBottomNavigation();
        }
    }
}
