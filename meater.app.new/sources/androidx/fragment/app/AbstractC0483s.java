package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0511g;
import androidx.viewpager.widget.AbstractC0694a;
import java.util.ArrayList;

/* compiled from: FragmentStatePagerAdapter.java */
@Deprecated
/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public abstract class AbstractC0483s extends AbstractC0694a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentStatePagerAdapt";
    private final int mBehavior;
    private AbstractC0485u mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final FragmentManager mFragmentManager;
    private ArrayList<Fragment> mFragments;
    private ArrayList<Fragment.SavedState> mSavedState;

    @Deprecated
    public AbstractC0483s(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m3493m();
        }
        while (this.mSavedState.size() <= i2) {
            this.mSavedState.add(null);
        }
        this.mSavedState.set(i2, fragment.isAdded() ? this.mFragmentManager.m3496n1(fragment) : null);
        this.mFragments.set(i2, null);
        this.mCurTransaction.mo3554p(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public void finishUpdate(ViewGroup viewGroup) {
        AbstractC0485u abstractC0485u = this.mCurTransaction;
        if (abstractC0485u != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    abstractC0485u.mo3551l();
                } finally {
                    this.mExecutingFinishUpdate = false;
                }
            }
            this.mCurTransaction = null;
        }
    }

    public abstract Fragment getItem(int i2);

    @Override // androidx.viewpager.widget.AbstractC0694a
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.mFragments.size() > i2 && (fragment = this.mFragments.get(i2)) != null) {
            return fragment;
        }
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m3493m();
        }
        Fragment item = getItem(i2);
        if (this.mSavedState.size() > i2 && (savedState = this.mSavedState.get(i2)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.mFragments.size() <= i2) {
            this.mFragments.add(null);
        }
        item.setMenuVisibility(false);
        if (this.mBehavior == 0) {
            item.setUserVisibleHint(false);
        }
        this.mFragments.set(i2, item);
        this.mCurTransaction.m3734b(viewGroup.getId(), item);
        if (this.mBehavior == 1) {
            this.mCurTransaction.mo3555t(item, AbstractC0511g.c.STARTED);
        }
        return item;
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) throws NumberFormatException {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.mSavedState.clear();
            this.mFragments.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.mSavedState.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i2 = Integer.parseInt(str.substring(1));
                    Fragment fragmentM3504r0 = this.mFragmentManager.m3504r0(bundle, str);
                    if (fragmentM3504r0 != null) {
                        while (this.mFragments.size() <= i2) {
                            this.mFragments.add(null);
                        }
                        fragmentM3504r0.setMenuVisibility(false);
                        this.mFragments.set(i2, fragmentM3504r0);
                    } else {
                        Log.w(TAG, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public Parcelable saveState() {
        Bundle bundle;
        if (this.mSavedState.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.mSavedState.size()];
            this.mSavedState.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i2 = 0; i2 < this.mFragments.size(); i2++) {
            Fragment fragment = this.mFragments.get(i2);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.mFragmentManager.m3476e1(bundle, "f" + i2, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.m3493m();
                    }
                    this.mCurTransaction.mo3555t(this.mCurrentPrimaryItem, AbstractC0511g.c.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.m3493m();
                }
                this.mCurTransaction.mo3555t(fragment, AbstractC0511g.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public AbstractC0483s(FragmentManager fragmentManager, int i2) {
        this.mCurTransaction = null;
        this.mSavedState = new ArrayList<>();
        this.mFragments = new ArrayList<>();
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i2;
    }
}
