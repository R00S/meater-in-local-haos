package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
class t implements LayoutInflater.Factory2 {

    /* renamed from: B, reason: collision with root package name */
    final v f25728B;

    t(v vVar) {
        this.f25728B = vVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        A A10;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f25728B);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I1.c.f6648a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(I1.c.f6649b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(I1.c.f6650c, -1);
        String string = typedArrayObtainStyledAttributes.getString(I1.c.f6651d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !r.d(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentM0 = resourceId != -1 ? this.f25728B.m0(resourceId) : null;
        if (fragmentM0 == null && string != null) {
            fragmentM0 = this.f25728B.n0(string);
        }
        if (fragmentM0 == null && id2 != -1) {
            fragmentM0 = this.f25728B.m0(id2);
        }
        if (fragmentM0 == null) {
            fragmentM0 = this.f25728B.A0().c(context.getClassLoader(), attributeValue);
            fragmentM0.f25468Q = true;
            fragmentM0.f25478a0 = resourceId != 0 ? resourceId : id2;
            fragmentM0.f25479b0 = id2;
            fragmentM0.f25480c0 = string;
            fragmentM0.f25469R = true;
            v vVar = this.f25728B;
            fragmentM0.f25474W = vVar;
            fragmentM0.f25475X = vVar.D0();
            fragmentM0.m1(this.f25728B.D0().getContext(), attributeSet, fragmentM0.f25451C);
            A10 = this.f25728B.l(fragmentM0);
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentM0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentM0.f25469R) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            fragmentM0.f25469R = true;
            v vVar2 = this.f25728B;
            fragmentM0.f25474W = vVar2;
            fragmentM0.f25475X = vVar2.D0();
            fragmentM0.m1(this.f25728B.D0().getContext(), attributeSet, fragmentM0.f25451C);
            A10 = this.f25728B.A(fragmentM0);
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentM0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        K1.b.g(fragmentM0, viewGroup);
        fragmentM0.f25488k0 = viewGroup;
        A10.m();
        A10.j();
        View view2 = fragmentM0.f25489l0;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentM0.f25489l0.getTag() == null) {
            fragmentM0.f25489l0.setTag(string);
        }
        fragmentM0.f25489l0.addOnAttachStateChangeListener(new a(A10));
        return fragmentM0.f25489l0;
    }

    /* compiled from: FragmentLayoutInflaterFactory.java */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ A f25729B;

        a(A a10) {
            this.f25729B = a10;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f25729B.k();
            this.f25729B.m();
            K.u((ViewGroup) fragmentK.f25489l0.getParent(), t.this.f25728B).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
