package com.bumptech.glide.p138m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C5355i;
import com.bumptech.glide.ComponentCallbacks2C5349c;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SupportRequestManagerFragment.java */
/* renamed from: com.bumptech.glide.m.o */
/* loaded from: classes.dex */
public class C5546o extends Fragment {

    /* renamed from: f */
    private final C5532a f13883f;

    /* renamed from: g */
    private final InterfaceC5544m f13884g;

    /* renamed from: h */
    private final Set<C5546o> f13885h;

    /* renamed from: i */
    private C5546o f13886i;

    /* renamed from: j */
    private C5355i f13887j;

    /* renamed from: k */
    private Fragment f13888k;

    /* compiled from: SupportRequestManagerFragment.java */
    /* renamed from: com.bumptech.glide.m.o$a */
    private class a implements InterfaceC5544m {
        a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + C5546o.this + "}";
        }
    }

    public C5546o() {
        this(new C5532a());
    }

    /* renamed from: d */
    private void m10823d(C5546o c5546o) {
        this.f13885h.add(c5546o);
    }

    /* renamed from: f */
    private Fragment m10824f() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f13888k;
    }

    /* renamed from: i */
    private void m10825i(ActivityC0468d activityC0468d) {
        m10827m();
        C5546o c5546oM10814j = ComponentCallbacks2C5349c.m9972c(activityC0468d).m9987k().m10814j(activityC0468d);
        this.f13886i = c5546oM10814j;
        if (equals(c5546oM10814j)) {
            return;
        }
        this.f13886i.m10823d(this);
    }

    /* renamed from: j */
    private void m10826j(C5546o c5546o) {
        this.f13885h.remove(c5546o);
    }

    /* renamed from: m */
    private void m10827m() {
        C5546o c5546o = this.f13886i;
        if (c5546o != null) {
            c5546o.m10826j(this);
            this.f13886i = null;
        }
    }

    /* renamed from: e */
    C5532a m10828e() {
        return this.f13883f;
    }

    /* renamed from: g */
    public C5355i m10829g() {
        return this.f13887j;
    }

    /* renamed from: h */
    public InterfaceC5544m m10830h() {
        return this.f13884g;
    }

    /* renamed from: k */
    void m10831k(Fragment fragment) {
        this.f13888k = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m10825i(fragment.getActivity());
    }

    /* renamed from: l */
    public void m10832l(C5355i c5355i) {
        this.f13887j = c5355i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            m10825i(getActivity());
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f13883f.m10785c();
        m10827m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f13888k = null;
        m10827m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f13883f.m10786d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f13883f.m10787e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m10824f() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public C5546o(C5532a c5532a) {
        this.f13884g = new a();
        this.f13885h = new HashSet();
        this.f13883f = c5532a;
    }
}
