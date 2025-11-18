package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p024c.p067m.C0986c;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
class LayoutInflaterFactory2C0475k implements LayoutInflater.Factory2 {

    /* renamed from: f */
    private final FragmentManager f3292f;

    LayoutInflaterFactory2C0475k(FragmentManager fragmentManager) {
        this.f3292f = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0482r c0482rM3511w;
        if (C0471g.class.getName().equals(str)) {
            return new C0471g(context, attributeSet, this.f3292f);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0986c.f6512d);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(C0986c.f6513e);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C0986c.f6514f, -1);
        String string = typedArrayObtainStyledAttributes.getString(C0986c.f6515g);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !C0473i.m3650b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentM3485i0 = resourceId != -1 ? this.f3292f.m3485i0(resourceId) : null;
        if (fragmentM3485i0 == null && string != null) {
            fragmentM3485i0 = this.f3292f.m3488j0(string);
        }
        if (fragmentM3485i0 == null && id != -1) {
            fragmentM3485i0 = this.f3292f.m3485i0(id);
        }
        if (fragmentM3485i0 == null) {
            fragmentM3485i0 = this.f3292f.m3506t0().mo3524a(context.getClassLoader(), attributeValue);
            fragmentM3485i0.mFromLayout = true;
            fragmentM3485i0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentM3485i0.mContainerId = id;
            fragmentM3485i0.mTag = string;
            fragmentM3485i0.mInLayout = true;
            FragmentManager fragmentManager = this.f3292f;
            fragmentM3485i0.mFragmentManager = fragmentManager;
            fragmentM3485i0.mHost = fragmentManager.m3512w0();
            fragmentM3485i0.onInflate(this.f3292f.m3512w0().m3654f(), attributeSet, fragmentM3485i0.mSavedFragmentState);
            c0482rM3511w = this.f3292f.m3511w(fragmentM3485i0);
            this.f3292f.m3480g(fragmentM3485i0);
            if (FragmentManager.m3392H0(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentM3485i0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentM3485i0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentM3485i0.mInLayout = true;
            FragmentManager fragmentManager2 = this.f3292f;
            fragmentM3485i0.mFragmentManager = fragmentManager2;
            fragmentM3485i0.mHost = fragmentManager2.m3512w0();
            fragmentM3485i0.onInflate(this.f3292f.m3512w0().m3654f(), attributeSet, fragmentM3485i0.mSavedFragmentState);
            c0482rM3511w = this.f3292f.m3511w(fragmentM3485i0);
            if (FragmentManager.m3392H0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentM3485i0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        fragmentM3485i0.mContainer = (ViewGroup) view;
        c0482rM3511w.m3700m();
        c0482rM3511w.m3698j();
        View view2 = fragmentM3485i0.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragmentM3485i0.mView.getTag() == null) {
                fragmentM3485i0.mView.setTag(string);
            }
            return fragmentM3485i0.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
