package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0511g;
import androidx.viewpager.widget.AbstractC0694a;

/* compiled from: FragmentPagerAdapter.java */
@Deprecated
/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
public abstract class AbstractC0480p extends AbstractC0694a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private AbstractC0485u mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final FragmentManager mFragmentManager;

    @Deprecated
    public AbstractC0480p(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    private static String makeFragmentName(int i2, long j2) {
        return "android:switcher:" + i2 + ":" + j2;
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m3493m();
        }
        this.mCurTransaction.mo3552m(fragment);
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

    public long getItemId(int i2) {
        return i2;
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m3493m();
        }
        long itemId = getItemId(i2);
        Fragment fragmentM3488j0 = this.mFragmentManager.m3488j0(makeFragmentName(viewGroup.getId(), itemId));
        if (fragmentM3488j0 != null) {
            this.mCurTransaction.m3740h(fragmentM3488j0);
        } else {
            fragmentM3488j0 = getItem(i2);
            this.mCurTransaction.m3735c(viewGroup.getId(), fragmentM3488j0, makeFragmentName(viewGroup.getId(), itemId));
        }
        if (fragmentM3488j0 != this.mCurrentPrimaryItem) {
            fragmentM3488j0.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.mo3555t(fragmentM3488j0, AbstractC0511g.c.STARTED);
            } else {
                fragmentM3488j0.setUserVisibleHint(false);
            }
        }
        return fragmentM3488j0;
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public Parcelable saveState() {
        return null;
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

    public AbstractC0480p(FragmentManager fragmentManager, int i2) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i2;
    }
}
