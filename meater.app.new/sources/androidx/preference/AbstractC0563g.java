package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.C0566j;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceFragmentCompat.java */
/* renamed from: androidx.preference.g */
/* loaded from: classes.dex */
public abstract class AbstractC0563g extends Fragment implements C0566j.c, C0566j.a, C0566j.b, DialogPreference.InterfaceC0532a {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private static final String TAG = "PreferenceFragment";
    private boolean mHavePrefs;
    private boolean mInitDone;
    RecyclerView mList;
    private C0566j mPreferenceManager;
    private Runnable mSelectPreferenceRunnable;
    private final d mDividerDecoration = new d();
    private int mLayoutResId = C0573q.f3746c;
    private Handler mHandler = new a();
    private final Runnable mRequestFocus = new b();

    /* compiled from: PreferenceFragmentCompat.java */
    /* renamed from: androidx.preference.g$a */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            AbstractC0563g.this.bindPreferences();
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* renamed from: androidx.preference.g$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = AbstractC0563g.this.mList;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* renamed from: androidx.preference.g$c */
    class c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Preference f3668f;

        /* renamed from: g */
        final /* synthetic */ String f3669g;

        c(Preference preference, String str) {
            this.f3668f = preference;
            this.f3669g = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.AbstractC0594g adapter = AbstractC0563g.this.mList.getAdapter();
            if (!(adapter instanceof PreferenceGroup.InterfaceC0550c)) {
                if (adapter != 0) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            Preference preference = this.f3668f;
            int iMo4071c = preference != null ? ((PreferenceGroup.InterfaceC0550c) adapter).mo4071c(preference) : ((PreferenceGroup.InterfaceC0550c) adapter).mo4072f(this.f3669g);
            if (iMo4071c != -1) {
                AbstractC0563g.this.mList.scrollToPosition(iMo4071c);
            } else {
                adapter.registerAdapterDataObserver(new h(adapter, AbstractC0563g.this.mList, this.f3668f, this.f3669g));
            }
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* renamed from: androidx.preference.g$d */
    private class d extends RecyclerView.AbstractC0601n {

        /* renamed from: a */
        private Drawable f3671a;

        /* renamed from: b */
        private int f3672b;

        /* renamed from: c */
        private boolean f3673c = true;

        d() {
        }

        /* renamed from: g */
        private boolean m4114g(View view, RecyclerView recyclerView) {
            RecyclerView.AbstractC0590c0 childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z = false;
            if (!((childViewHolder instanceof C0568l) && ((C0568l) childViewHolder).m4163c())) {
                return false;
            }
            boolean z2 = this.f3673c;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.AbstractC0590c0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
            if ((childViewHolder2 instanceof C0568l) && ((C0568l) childViewHolder2).m4162b()) {
                z = true;
            }
            return z;
        }

        /* renamed from: d */
        public void m4115d(boolean z) {
            this.f3673c = z;
        }

        /* renamed from: e */
        public void m4116e(Drawable drawable) {
            if (drawable != null) {
                this.f3672b = drawable.getIntrinsicHeight();
            } else {
                this.f3672b = 0;
            }
            this.f3671a = drawable;
            AbstractC0563g.this.mList.invalidateItemDecorations();
        }

        /* renamed from: f */
        public void m4117f(int i2) {
            this.f3672b = i2;
            AbstractC0563g.this.mList.invalidateItemDecorations();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0613z c0613z) {
            if (m4114g(view, recyclerView)) {
                rect.bottom = this.f3672b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0613z c0613z) {
            if (this.f3671a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (m4114g(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.f3671a.setBounds(0, y, width, this.f3672b + y);
                    this.f3671a.draw(canvas);
                }
            }
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* renamed from: androidx.preference.g$e */
    public interface e {
        /* renamed from: a */
        boolean m4118a(AbstractC0563g abstractC0563g, Preference preference);
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* renamed from: androidx.preference.g$f */
    public interface f {
        /* renamed from: a */
        boolean m4119a(AbstractC0563g abstractC0563g, Preference preference);
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* renamed from: androidx.preference.g$g */
    public interface g {
        /* renamed from: a */
        boolean m4120a(AbstractC0563g abstractC0563g, PreferenceScreen preferenceScreen);
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* renamed from: androidx.preference.g$h */
    private static class h extends RecyclerView.AbstractC0596i {

        /* renamed from: a */
        private final RecyclerView.AbstractC0594g f3675a;

        /* renamed from: b */
        private final RecyclerView f3676b;

        /* renamed from: c */
        private final Preference f3677c;

        /* renamed from: d */
        private final String f3678d;

        public h(RecyclerView.AbstractC0594g abstractC0594g, RecyclerView recyclerView, Preference preference, String str) {
            this.f3675a = abstractC0594g;
            this.f3676b = recyclerView;
            this.f3677c = preference;
            this.f3678d = str;
        }

        /* renamed from: a */
        private void m4121a() {
            this.f3675a.unregisterAdapterDataObserver(this);
            Preference preference = this.f3677c;
            int iMo4071c = preference != null ? ((PreferenceGroup.InterfaceC0550c) this.f3675a).mo4071c(preference) : ((PreferenceGroup.InterfaceC0550c) this.f3675a).mo4072f(this.f3678d);
            if (iMo4071c != -1) {
                this.f3676b.scrollToPosition(iMo4071c);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
        public void onChanged() {
            m4121a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
        public void onItemRangeChanged(int i2, int i3) {
            m4121a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
        public void onItemRangeInserted(int i2, int i3) {
            m4121a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
        public void onItemRangeMoved(int i2, int i3, int i4) {
            m4121a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
        public void onItemRangeRemoved(int i2, int i3) {
            m4121a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
        public void onItemRangeChanged(int i2, int i3, Object obj) {
            m4121a();
        }
    }

    private void postBindPreferences() {
        if (this.mHandler.hasMessages(1)) {
            return;
        }
        this.mHandler.obtainMessage(1).sendToTarget();
    }

    private void requirePreferenceManager() {
        if (this.mPreferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void scrollToPreferenceInternal(Preference preference, String str) {
        c cVar = new c(preference, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = cVar;
        } else {
            cVar.run();
        }
    }

    private void unbindPreferences() {
        getListView().setAdapter(null);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.mo4036n0();
        }
        onUnbindPreferences();
    }

    public void addPreferencesFromResource(int i2) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.m4152k(getContext(), i2, getPreferenceScreen()));
    }

    void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.mo4031h0();
        }
        onBindPreferences();
    }

    @Override // androidx.preference.DialogPreference.InterfaceC0532a
    public <T extends Preference> T findPreference(CharSequence charSequence) {
        C0566j c0566j = this.mPreferenceManager;
        if (c0566j == null) {
            return null;
        }
        return (T) c0566j.m4143a(charSequence);
    }

    public Fragment getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.mList;
    }

    public C0566j getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.m4150i();
    }

    protected void onBindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(C0569m.f3732j, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = C0575s.f3753a;
        }
        getActivity().getTheme().applyStyle(i2, false);
        C0566j c0566j = new C0566j(getContext());
        this.mPreferenceManager = c0566j;
        c0566j.m4154n(this);
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString(ARG_PREFERENCE_ROOT) : null);
    }

    protected RecyclerView.AbstractC0594g onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new C0564h(preferenceScreen);
    }

    public RecyclerView.AbstractC0602o onCreateLayoutManager() {
        return new LinearLayoutManager(getContext());
    }

    public abstract void onCreatePreferences(Bundle bundle, String str);

    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (getContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(C0572p.f3739b)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(C0573q.f3747d, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new C0567k(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C0576t.f3842c1, C0569m.f3729g, 0);
        this.mLayoutResId = typedArrayObtainStyledAttributes.getResourceId(C0576t.f3846d1, this.mLayoutResId);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C0576t.f3849e1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0576t.f3852f1, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C0576t.f3855g1, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(getContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewOnCreateRecyclerView = onCreateRecyclerView(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewOnCreateRecyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.mList = recyclerViewOnCreateRecyclerView;
        recyclerViewOnCreateRecyclerView.addItemDecoration(this.mDividerDecoration);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        this.mDividerDecoration.m4115d(z);
        if (this.mList.getParent() == null) {
            viewGroup2.addView(this.mList);
        }
        this.mHandler.post(this.mRequestFocus);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.C0566j.a
    public void onDisplayPreferenceDialog(Preference preference) {
        DialogInterfaceOnCancelListenerC0466c dialogInterfaceOnCancelListenerC0466cM4110l;
        boolean zM4118a = getCallbackFragment() instanceof e ? ((e) getCallbackFragment()).m4118a(this, preference) : false;
        if (!zM4118a && (getActivity() instanceof e)) {
            zM4118a = ((e) getActivity()).m4118a(this, preference);
        }
        if (!zM4118a && getFragmentManager().m3488j0(DIALOG_FRAGMENT_TAG) == null) {
            if (preference instanceof EditTextPreference) {
                dialogInterfaceOnCancelListenerC0466cM4110l = C0557a.m4100l(preference.m3997J());
            } else if (preference instanceof ListPreference) {
                dialogInterfaceOnCancelListenerC0466cM4110l = C0559c.m4107l(preference.m3997J());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                dialogInterfaceOnCancelListenerC0466cM4110l = C0560d.m4110l(preference.m3997J());
            }
            dialogInterfaceOnCancelListenerC0466cM4110l.setTargetFragment(this, 0);
            dialogInterfaceOnCancelListenerC0466cM4110l.show(getFragmentManager(), DIALOG_FRAGMENT_TAG);
        }
    }

    @Override // androidx.preference.C0566j.b
    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        if ((getCallbackFragment() instanceof g ? ((g) getCallbackFragment()).m4120a(this, preferenceScreen) : false) || !(getActivity() instanceof g)) {
            return;
        }
        ((g) getActivity()).m4120a(this, preferenceScreen);
    }

    @Override // androidx.preference.C0566j.c
    public boolean onPreferenceTreeClick(Preference preference) {
        if (preference.m3992G() == null) {
            return false;
        }
        boolean zM4119a = getCallbackFragment() instanceof f ? ((f) getCallbackFragment()).m4119a(this, preference) : false;
        if (!zM4119a && (getActivity() instanceof f)) {
            zM4119a = ((f) getActivity()).m4119a(this, preference);
        }
        if (zM4119a) {
            return true;
        }
        Log.w(TAG, "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Bundle bundleM3988E = preference.m3988E();
        Fragment fragmentMo3524a = supportFragmentManager.m3506t0().mo3524a(requireActivity().getClassLoader(), preference.m3992G());
        fragmentMo3524a.setArguments(bundleM3988E);
        fragmentMo3524a.setTargetFragment(this, 0);
        supportFragmentManager.m3493m().m3742q(((View) getView().getParent()).getId(), fragmentMo3524a).m3739g(null).mo3548i();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.m3991F0(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.mPreferenceManager.m4155o(this);
        this.mPreferenceManager.m4153m(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.mPreferenceManager.m4155o(null);
        this.mPreferenceManager.m4153m(null);
    }

    protected void onUnbindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(PREFERENCES_TAG)) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.m3989E0(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    public void scrollToPreference(String str) {
        scrollToPreferenceInternal(null, str);
    }

    public void setDivider(Drawable drawable) {
        this.mDividerDecoration.m4116e(drawable);
    }

    public void setDividerHeight(int i2) {
        this.mDividerDecoration.m4117f(i2);
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        if (!this.mPreferenceManager.m4156p(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        onUnbindPreferences();
        this.mHavePrefs = true;
        if (this.mInitDone) {
            postBindPreferences();
        }
    }

    public void setPreferencesFromResource(int i2, String str) {
        requirePreferenceManager();
        PreferenceScreen preferenceScreenM4152k = this.mPreferenceManager.m4152k(getContext(), i2, null);
        Object obj = preferenceScreenM4152k;
        if (str != null) {
            Object objM4057b1 = preferenceScreenM4152k.m4057b1(str);
            boolean z = objM4057b1 instanceof PreferenceScreen;
            obj = objM4057b1;
            if (!z) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        setPreferenceScreen((PreferenceScreen) obj);
    }

    public void scrollToPreference(Preference preference) {
        scrollToPreferenceInternal(preference, null);
    }
}
