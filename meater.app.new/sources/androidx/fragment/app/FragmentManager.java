package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.AbstractC0038b;
import androidx.activity.InterfaceC0039c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0051b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0050a;
import androidx.activity.result.InterfaceC0052c;
import androidx.activity.result.p002d.AbstractC0053a;
import androidx.activity.result.p002d.C0054b;
import androidx.activity.result.p002d.C0055c;
import androidx.core.os.C0273b;
import androidx.fragment.app.AbstractC0485u;
import androidx.fragment.app.C0469e;
import androidx.fragment.app.C0486v;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.C0530z;
import androidx.lifecycle.InterfaceC0501a0;
import androidx.lifecycle.InterfaceC0513i;
import androidx.lifecycle.InterfaceC0515k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import p024c.p041e.C0868b;
import p024c.p067m.C0985b;

/* loaded from: classes.dex */
public abstract class FragmentManager {

    /* renamed from: a */
    private static boolean f3092a = false;

    /* renamed from: b */
    static boolean f3093b = true;

    /* renamed from: B */
    private AbstractC0051b<Intent> f3095B;

    /* renamed from: C */
    private AbstractC0051b<IntentSenderRequest> f3096C;

    /* renamed from: D */
    private AbstractC0051b<String[]> f3097D;

    /* renamed from: F */
    private boolean f3099F;

    /* renamed from: G */
    private boolean f3100G;

    /* renamed from: H */
    private boolean f3101H;

    /* renamed from: I */
    private boolean f3102I;

    /* renamed from: J */
    private boolean f3103J;

    /* renamed from: K */
    private ArrayList<C0462a> f3104K;

    /* renamed from: L */
    private ArrayList<Boolean> f3105L;

    /* renamed from: M */
    private ArrayList<Fragment> f3106M;

    /* renamed from: N */
    private ArrayList<C0459q> f3107N;

    /* renamed from: O */
    private C0478n f3108O;

    /* renamed from: d */
    private boolean f3111d;

    /* renamed from: f */
    ArrayList<C0462a> f3113f;

    /* renamed from: g */
    private ArrayList<Fragment> f3114g;

    /* renamed from: i */
    private OnBackPressedDispatcher f3116i;

    /* renamed from: n */
    private ArrayList<InterfaceC0456n> f3121n;

    /* renamed from: t */
    private AbstractC0474j<?> f3127t;

    /* renamed from: u */
    private AbstractC0470f f3128u;

    /* renamed from: v */
    private Fragment f3129v;

    /* renamed from: w */
    Fragment f3130w;

    /* renamed from: c */
    private final ArrayList<InterfaceC0457o> f3110c = new ArrayList<>();

    /* renamed from: e */
    private final C0484t f3112e = new C0484t();

    /* renamed from: h */
    private final LayoutInflaterFactory2C0475k f3115h = new LayoutInflaterFactory2C0475k(this);

    /* renamed from: j */
    private final AbstractC0038b f3117j = new C0445c(false);

    /* renamed from: k */
    private final AtomicInteger f3118k = new AtomicInteger();

    /* renamed from: l */
    private final Map<String, Bundle> f3119l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private final Map<String, ?> f3120m = Collections.synchronizedMap(new HashMap());

    /* renamed from: o */
    private Map<Fragment, HashSet<C0273b>> f3122o = Collections.synchronizedMap(new HashMap());

    /* renamed from: p */
    private final C0486v.g f3123p = new C0446d();

    /* renamed from: q */
    private final C0476l f3124q = new C0476l(this);

    /* renamed from: r */
    private final CopyOnWriteArrayList<InterfaceC0479o> f3125r = new CopyOnWriteArrayList<>();

    /* renamed from: s */
    int f3126s = -1;

    /* renamed from: x */
    private C0473i f3131x = null;

    /* renamed from: y */
    private C0473i f3132y = new C0447e();

    /* renamed from: z */
    private InterfaceC0465b0 f3133z = null;

    /* renamed from: A */
    private InterfaceC0465b0 f3094A = new C0448f();

    /* renamed from: E */
    ArrayDeque<LaunchedFragmentInfo> f3098E = new ArrayDeque<>();

    /* renamed from: P */
    private Runnable f3109P = new RunnableC0449g();

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    class C04416 implements InterfaceC0513i {

        /* renamed from: a */
        final /* synthetic */ String f3134a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC0481q f3135b;

        /* renamed from: c */
        final /* synthetic */ AbstractC0511g f3136c;

        /* renamed from: d */
        final /* synthetic */ FragmentManager f3137d;

        @Override // androidx.lifecycle.InterfaceC0513i
        /* renamed from: a */
        public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) {
            Bundle bundle;
            if (bVar == AbstractC0511g.b.ON_START && (bundle = (Bundle) this.f3137d.f3119l.get(this.f3134a)) != null) {
                this.f3135b.m3686a(this.f3134a, bundle);
                this.f3137d.m3503r(this.f3134a);
            }
            if (bVar == AbstractC0511g.b.ON_DESTROY) {
                this.f3136c.mo3863c(this);
                this.f3137d.f3120m.remove(this.f3134a);
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    class C0443a implements InterfaceC0050a<ActivityResult> {
        C0443a() {
        }

        @Override // androidx.activity.result.InterfaceC0050a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo171a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f3098E.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f3138f;
            int i2 = launchedFragmentInfoPollFirst.f3139g;
            Fragment fragmentM3718i = FragmentManager.this.f3112e.m3718i(str);
            if (fragmentM3718i != null) {
                fragmentM3718i.onActivityResult(i2, activityResult.m144b(), activityResult.m143a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    class C0444b implements InterfaceC0050a<Map<String, Boolean>> {
        C0444b() {
        }

        @Override // androidx.activity.result.InterfaceC0050a
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo171a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f3098E.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f3138f;
            int i3 = launchedFragmentInfoPollFirst.f3139g;
            Fragment fragmentM3718i = FragmentManager.this.f3112e.m3718i(str);
            if (fragmentM3718i != null) {
                fragmentM3718i.onRequestPermissionsResult(i3, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    class C0445c extends AbstractC0038b {
        C0445c(boolean z) {
            super(z);
        }

        @Override // androidx.activity.AbstractC0038b
        /* renamed from: b */
        public void mo131b() {
            FragmentManager.this.m3435E0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    class C0446d implements C0486v.g {
        C0446d() {
        }

        @Override // androidx.fragment.app.C0486v.g
        /* renamed from: a */
        public void mo3522a(Fragment fragment, C0273b c0273b) {
            if (c0273b.m1836b()) {
                return;
            }
            FragmentManager.this.m3479f1(fragment, c0273b);
        }

        @Override // androidx.fragment.app.C0486v.g
        /* renamed from: b */
        public void mo3523b(Fragment fragment, C0273b c0273b) {
            FragmentManager.this.m3477f(fragment, c0273b);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    class C0447e extends C0473i {
        C0447e() {
        }

        @Override // androidx.fragment.app.C0473i
        /* renamed from: a */
        public Fragment mo3524a(ClassLoader classLoader, String str) {
            return FragmentManager.this.m3512w0().m3624b(FragmentManager.this.m3512w0().m3654f(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    class C0448f implements InterfaceC0465b0 {
        C0448f() {
        }

        @Override // androidx.fragment.app.InterfaceC0465b0
        /* renamed from: a */
        public AbstractC0463a0 mo3525a(ViewGroup viewGroup) {
            return new C0464b(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    class RunnableC0449g implements Runnable {
        RunnableC0449g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m3472b0(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    class C0450h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3147a;

        /* renamed from: b */
        final /* synthetic */ View f3148b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3149c;

        C0450h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3147a = viewGroup;
            this.f3148b = view;
            this.f3149c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3147a.endViewTransition(this.f3148b);
            animator.removeListener(this);
            Fragment fragment = this.f3149c;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    class C0451i implements InterfaceC0479o {

        /* renamed from: f */
        final /* synthetic */ Fragment f3151f;

        C0451i(Fragment fragment) {
            this.f3151f = fragment;
        }

        @Override // androidx.fragment.app.InterfaceC0479o
        /* renamed from: a */
        public void mo3526a(FragmentManager fragmentManager, Fragment fragment) {
            this.f3151f.onAttachFragment(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    class C0452j implements InterfaceC0050a<ActivityResult> {
        C0452j() {
        }

        @Override // androidx.activity.result.InterfaceC0050a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo171a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f3098E.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f3138f;
            int i2 = launchedFragmentInfoPollFirst.f3139g;
            Fragment fragmentM3718i = FragmentManager.this.f3112e.m3718i(str);
            if (fragmentM3718i != null) {
                fragmentM3718i.onActivityResult(i2, activityResult.m144b(), activityResult.m143a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    public interface InterfaceC0453k {
        String getName();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    static class C0454l extends AbstractC0053a<IntentSenderRequest, ActivityResult> {
        C0454l() {
        }

        @Override // androidx.activity.result.p002d.AbstractC0053a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo173a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentM162a = intentSenderRequest.m162a();
            if (intentM162a != null && (bundleExtra = intentM162a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentM162a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentM162a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.C0049b(intentSenderRequest.m165d()).m169b(null).m170c(intentSenderRequest.m164c(), intentSenderRequest.m163b()).m168a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m3392H0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.activity.result.p002d.AbstractC0053a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult mo175c(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    public static abstract class AbstractC0455m {
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    public interface InterfaceC0456n {
        /* renamed from: a */
        void m3530a();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    interface InterfaceC0457o {
        /* renamed from: a */
        boolean mo3531a(ArrayList<C0462a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$p */
    private class C0458p implements InterfaceC0457o {

        /* renamed from: a */
        final String f3154a;

        /* renamed from: b */
        final int f3155b;

        /* renamed from: c */
        final int f3156c;

        C0458p(String str, int i2, int i3) {
            this.f3154a = str;
            this.f3155b = i2;
            this.f3156c = i3;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC0457o
        /* renamed from: a */
        public boolean mo3531a(ArrayList<C0462a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f3130w;
            if (fragment == null || this.f3155b >= 0 || this.f3154a != null || !fragment.getChildFragmentManager().m3471a1()) {
                return FragmentManager.this.m3474c1(arrayList, arrayList2, this.f3154a, this.f3155b, this.f3156c);
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$q */
    static class C0459q implements Fragment.InterfaceC0440k {

        /* renamed from: a */
        final boolean f3158a;

        /* renamed from: b */
        final C0462a f3159b;

        /* renamed from: c */
        private int f3160c;

        C0459q(C0462a c0462a, boolean z) {
            this.f3158a = z;
            this.f3159b = c0462a;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0440k
        /* renamed from: a */
        public void mo3389a() {
            this.f3160c++;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0440k
        /* renamed from: b */
        public void mo3390b() {
            int i2 = this.f3160c - 1;
            this.f3160c = i2;
            if (i2 != 0) {
                return;
            }
            this.f3159b.f3182t.m3499o1();
        }

        /* renamed from: c */
        void m3532c() {
            C0462a c0462a = this.f3159b;
            c0462a.f3182t.m3508u(c0462a, this.f3158a, false, false);
        }

        /* renamed from: d */
        void m3533d() {
            boolean z = this.f3160c > 0;
            for (Fragment fragment : this.f3159b.f3182t.m3510v0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C0462a c0462a = this.f3159b;
            c0462a.f3182t.m3508u(c0462a, this.f3158a, !z, true);
        }

        /* renamed from: e */
        public boolean m3534e() {
            return this.f3160c == 0;
        }
    }

    /* renamed from: C0 */
    static Fragment m3391C0(View view) {
        Object tag = view.getTag(C0985b.f6506a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: H0 */
    static boolean m3392H0(int i2) {
        return f3092a || Log.isLoggable("FragmentManager", i2);
    }

    /* renamed from: I0 */
    private boolean m3393I0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m3497o();
    }

    /* renamed from: M */
    private void m3394M(Fragment fragment) {
        if (fragment == null || !fragment.equals(m3483h0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    /* renamed from: Q0 */
    private void m3395Q0(C0868b<Fragment> c0868b) {
        int size = c0868b.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragmentM5427q = c0868b.m5427q(i2);
            if (!fragmentM5427q.mAdded) {
                View viewRequireView = fragmentM5427q.requireView();
                fragmentM5427q.mPostponedAlpha = viewRequireView.getAlpha();
                viewRequireView.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: T */
    private void m3396T(int i2) {
        try {
            this.f3111d = true;
            this.f3112e.m3713d(i2);
            m3459S0(i2, false);
            if (f3093b) {
                Iterator<AbstractC0463a0> it = m3418s().iterator();
                while (it.hasNext()) {
                    it.next().m3573j();
                }
            }
            this.f3111d = false;
            m3472b0(true);
        } catch (Throwable th) {
            this.f3111d = false;
            throw th;
        }
    }

    /* renamed from: W */
    private void m3397W() {
        if (this.f3103J) {
            this.f3103J = false;
            m3422u1();
        }
    }

    /* renamed from: Y */
    private void m3398Y() {
        if (f3093b) {
            Iterator<AbstractC0463a0> it = m3418s().iterator();
            while (it.hasNext()) {
                it.next().m3573j();
            }
        } else {
            if (this.f3122o.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f3122o.keySet()) {
                m3414n(fragment);
                m3460T0(fragment);
            }
        }
    }

    /* renamed from: a0 */
    private void m3400a0(boolean z) {
        if (this.f3111d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f3127t == null) {
            if (!this.f3102I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f3127t.m3655g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            m3415p();
        }
        if (this.f3104K == null) {
            this.f3104K = new ArrayList<>();
            this.f3105L = new ArrayList<>();
        }
        this.f3111d = true;
        try {
            m3408g0(null, null);
        } finally {
            this.f3111d = false;
        }
    }

    /* renamed from: b1 */
    private boolean m3402b1(String str, int i2, int i3) {
        m3472b0(false);
        m3400a0(true);
        Fragment fragment = this.f3130w;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().m3471a1()) {
            return true;
        }
        boolean zM3474c1 = m3474c1(this.f3104K, this.f3105L, str, i2, i3);
        if (zM3474c1) {
            this.f3111d = true;
            try {
                m3409h1(this.f3104K, this.f3105L);
            } finally {
                m3417q();
            }
        }
        m3425w1();
        m3397W();
        this.f3112e.m3711b();
        return zM3474c1;
    }

    /* renamed from: d */
    private void m3404d(C0868b<Fragment> c0868b) {
        int i2 = this.f3126s;
        if (i2 < 1) {
            return;
        }
        int iMin = Math.min(i2, 5);
        for (Fragment fragment : this.f3112e.m3723n()) {
            if (fragment.mState < iMin) {
                m3462U0(fragment, iMin);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    c0868b.add(fragment);
                }
            }
        }
    }

    /* renamed from: d0 */
    private static void m3405d0(ArrayList<C0462a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            C0462a c0462a = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                c0462a.m3556v(-1);
                c0462a.m3540A(i2 == i3 + (-1));
            } else {
                c0462a.m3556v(1);
                c0462a.m3560z();
            }
            i2++;
        }
    }

    /* renamed from: d1 */
    private int m3406d1(ArrayList<C0462a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, C0868b<Fragment> c0868b) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            C0462a c0462a = arrayList.get(i5);
            boolean zBooleanValue = arrayList2.get(i5).booleanValue();
            if (c0462a.m3544F() && !c0462a.m3543D(arrayList, i5 + 1, i3)) {
                if (this.f3107N == null) {
                    this.f3107N = new ArrayList<>();
                }
                C0459q c0459q = new C0459q(c0462a, zBooleanValue);
                this.f3107N.add(c0459q);
                c0462a.m3546H(c0459q);
                if (zBooleanValue) {
                    c0462a.m3560z();
                } else {
                    c0462a.m3540A(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, c0462a);
                }
                m3404d(c0868b);
            }
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* renamed from: e0 */
    private void m3407e0(ArrayList<C0462a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ?? r1;
        boolean z;
        int i4;
        int i5;
        ArrayList<Boolean> arrayList3;
        int i6;
        int iM3406d1;
        ArrayList<Boolean> arrayList4;
        int i7;
        boolean z2;
        boolean z3 = arrayList.get(i2).f3333r;
        ArrayList<Fragment> arrayList5 = this.f3106M;
        if (arrayList5 == null) {
            this.f3106M = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f3106M.addAll(this.f3112e.m3723n());
        Fragment fragmentM3428A0 = m3428A0();
        boolean z4 = false;
        for (int i8 = i2; i8 < i3; i8++) {
            C0462a c0462a = arrayList.get(i8);
            fragmentM3428A0 = !arrayList2.get(i8).booleanValue() ? c0462a.m3541B(this.f3106M, fragmentM3428A0) : c0462a.m3547I(this.f3106M, fragmentM3428A0);
            z4 = z4 || c0462a.f3324i;
        }
        this.f3106M.clear();
        if (z3 || this.f3126s < 1) {
            r1 = 1;
        } else if (f3093b) {
            for (int i9 = i2; i9 < i3; i9++) {
                Iterator<AbstractC0485u.a> it = arrayList.get(i9).f3318c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f3336b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f3112e.m3725p(m3511w(fragment));
                    }
                }
            }
            r1 = 1;
        } else {
            r1 = 1;
            C0486v.m3747B(this.f3127t.m3654f(), this.f3128u, arrayList, arrayList2, i2, i3, false, this.f3123p);
        }
        m3405d0(arrayList, arrayList2, i2, i3);
        if (f3093b) {
            boolean zBooleanValue = arrayList2.get(i3 - 1).booleanValue();
            for (int i10 = i2; i10 < i3; i10++) {
                C0462a c0462a2 = arrayList.get(i10);
                if (zBooleanValue) {
                    for (int size = c0462a2.f3318c.size() - r1; size >= 0; size--) {
                        Fragment fragment2 = c0462a2.f3318c.get(size).f3336b;
                        if (fragment2 != null) {
                            m3511w(fragment2).m3700m();
                        }
                    }
                } else {
                    Iterator<AbstractC0485u.a> it2 = c0462a2.f3318c.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = it2.next().f3336b;
                        if (fragment3 != null) {
                            m3511w(fragment3).m3700m();
                        }
                    }
                }
            }
            m3459S0(this.f3126s, r1);
            for (AbstractC0463a0 abstractC0463a0 : m3421t(arrayList, i2, i3)) {
                abstractC0463a0.m3578r(zBooleanValue);
                abstractC0463a0.m3577p();
                abstractC0463a0.m3572g();
            }
            i7 = i3;
            arrayList4 = arrayList2;
        } else {
            if (z3) {
                C0868b c0868b = new C0868b();
                m3404d(c0868b);
                i6 = 1;
                z = z3;
                i4 = i3;
                i5 = i2;
                arrayList3 = arrayList2;
                iM3406d1 = m3406d1(arrayList, arrayList2, i2, i3, c0868b);
                m3395Q0(c0868b);
            } else {
                z = z3;
                i4 = i3;
                i5 = i2;
                arrayList3 = arrayList2;
                i6 = 1;
                iM3406d1 = i4;
            }
            if (iM3406d1 == i5 || !z) {
                arrayList4 = arrayList3;
                i7 = i4;
            } else {
                if (this.f3126s >= i6) {
                    arrayList4 = arrayList3;
                    int i11 = iM3406d1;
                    i7 = i4;
                    z2 = true;
                    C0486v.m3747B(this.f3127t.m3654f(), this.f3128u, arrayList, arrayList2, i2, i11, true, this.f3123p);
                } else {
                    arrayList4 = arrayList3;
                    i7 = i4;
                    z2 = true;
                }
                m3459S0(this.f3126s, z2);
            }
        }
        for (int i12 = i2; i12 < i7; i12++) {
            C0462a c0462a3 = arrayList.get(i12);
            if (arrayList4.get(i12).booleanValue() && c0462a3.f3184v >= 0) {
                c0462a3.f3184v = -1;
            }
            c0462a3.m3545G();
        }
        if (z4) {
            m3410j1();
        }
    }

    /* renamed from: g0 */
    private void m3408g0(ArrayList<C0462a> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<C0459q> arrayList3 = this.f3107N;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            C0459q c0459q = this.f3107N.get(i2);
            if (arrayList != null && !c0459q.f3158a && (iIndexOf2 = arrayList.indexOf(c0459q.f3159b)) != -1 && arrayList2 != null && arrayList2.get(iIndexOf2).booleanValue()) {
                this.f3107N.remove(i2);
                i2--;
                size--;
                c0459q.m3532c();
            } else if (c0459q.m3534e() || (arrayList != null && c0459q.f3159b.m3543D(arrayList, 0, arrayList.size()))) {
                this.f3107N.remove(i2);
                i2--;
                size--;
                if (arrayList == null || c0459q.f3158a || (iIndexOf = arrayList.indexOf(c0459q.f3159b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                    c0459q.m3533d();
                } else {
                    c0459q.m3532c();
                }
            }
            i2++;
        }
    }

    /* renamed from: h1 */
    private void m3409h1(ArrayList<C0462a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m3408g0(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f3333r) {
                if (i3 != i2) {
                    m3407e0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f3333r) {
                        i3++;
                    }
                }
                m3407e0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            m3407e0(arrayList, arrayList2, i3, size);
        }
    }

    /* renamed from: j1 */
    private void m3410j1() {
        if (this.f3121n != null) {
            for (int i2 = 0; i2 < this.f3121n.size(); i2++) {
                this.f3121n.get(i2).m3530a();
            }
        }
    }

    /* renamed from: l0 */
    private void m3411l0() {
        if (f3093b) {
            Iterator<AbstractC0463a0> it = m3418s().iterator();
            while (it.hasNext()) {
                it.next().m3574k();
            }
        } else if (this.f3107N != null) {
            while (!this.f3107N.isEmpty()) {
                this.f3107N.remove(0).m3533d();
            }
        }
    }

    /* renamed from: l1 */
    static int m3412l1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: m0 */
    private boolean m3413m0(ArrayList<C0462a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3110c) {
            if (this.f3110c.isEmpty()) {
                return false;
            }
            int size = this.f3110c.size();
            boolean zMo3531a = false;
            for (int i2 = 0; i2 < size; i2++) {
                zMo3531a |= this.f3110c.get(i2).mo3531a(arrayList, arrayList2);
            }
            this.f3110c.clear();
            this.f3127t.m3655g().removeCallbacks(this.f3109P);
            return zMo3531a;
        }
    }

    /* renamed from: n */
    private void m3414n(Fragment fragment) {
        HashSet<C0273b> hashSet = this.f3122o.get(fragment);
        if (hashSet != null) {
            Iterator<C0273b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m1835a();
            }
            hashSet.clear();
            m3426x(fragment);
            this.f3122o.remove(fragment);
        }
    }

    /* renamed from: p */
    private void m3415p() {
        if (m3448M0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: p0 */
    private C0478n m3416p0(Fragment fragment) {
        return this.f3108O.m3678i(fragment);
    }

    /* renamed from: q */
    private void m3417q() {
        this.f3111d = false;
        this.f3105L.clear();
        this.f3104K.clear();
    }

    /* renamed from: s */
    private Set<AbstractC0463a0> m3418s() {
        HashSet hashSet = new HashSet();
        Iterator<C0482r> it = this.f3112e.m3720k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().m3699k().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC0463a0.m3565o(viewGroup, m3430B0()));
            }
        }
        return hashSet;
    }

    /* renamed from: s0 */
    private ViewGroup m3419s0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f3128u.mo3384d()) {
            View viewMo3383c = this.f3128u.mo3383c(fragment.mContainerId);
            if (viewMo3383c instanceof ViewGroup) {
                return (ViewGroup) viewMo3383c;
            }
        }
        return null;
    }

    /* renamed from: s1 */
    private void m3420s1(Fragment fragment) {
        ViewGroup viewGroupM3419s0 = m3419s0(fragment);
        if (viewGroupM3419s0 == null || fragment.getNextAnim() <= 0) {
            return;
        }
        int i2 = C0985b.f6508c;
        if (viewGroupM3419s0.getTag(i2) == null) {
            viewGroupM3419s0.setTag(i2, fragment);
        }
        ((Fragment) viewGroupM3419s0.getTag(i2)).setNextAnim(fragment.getNextAnim());
    }

    /* renamed from: t */
    private Set<AbstractC0463a0> m3421t(ArrayList<C0462a> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<AbstractC0485u.a> it = arrayList.get(i2).f3318c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3336b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(AbstractC0463a0.m3564n(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    /* renamed from: u1 */
    private void m3422u1() {
        Iterator<C0482r> it = this.f3112e.m3720k().iterator();
        while (it.hasNext()) {
            m3465W0(it.next());
        }
    }

    /* renamed from: v */
    private void m3423v(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            C0469e.d dVarM3622b = C0469e.m3622b(this.f3127t.m3654f(), fragment, !fragment.mHidden);
            if (dVarM3622b == null || (animator = dVarM3622b.f3276b) == null) {
                if (dVarM3622b != null) {
                    fragment.mView.startAnimation(dVarM3622b.f3275a);
                    dVarM3622b.f3275a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    dVarM3622b.f3276b.addListener(new C0450h(viewGroup, view, fragment));
                }
                dVarM3622b.f3276b.start();
            }
        }
        if (fragment.mAdded && m3393I0(fragment)) {
            this.f3099F = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* renamed from: v1 */
    private void m3424v1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0490z("FragmentManager"));
        AbstractC0474j<?> abstractC0474j = this.f3127t;
        if (abstractC0474j != null) {
            try {
                abstractC0474j.mo3614h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            m3466X("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    /* renamed from: w1 */
    private void m3425w1() {
        synchronized (this.f3110c) {
            if (this.f3110c.isEmpty()) {
                this.f3117j.m135f(m3498o0() > 0 && m3445K0(this.f3129v));
            } else {
                this.f3117j.m135f(true);
            }
        }
    }

    /* renamed from: x */
    private void m3426x(Fragment fragment) {
        fragment.performDestroyView();
        this.f3124q.m3672n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.mo3822n(null);
        fragment.mInLayout = false;
    }

    /* renamed from: A */
    void m3427A() {
        this.f3100G = false;
        this.f3101H = false;
        this.f3108O.m3683o(false);
        m3396T(0);
    }

    /* renamed from: A0 */
    public Fragment m3428A0() {
        return this.f3130w;
    }

    /* renamed from: B */
    void m3429B(Configuration configuration) {
        for (Fragment fragment : this.f3112e.m3723n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: B0 */
    InterfaceC0465b0 m3430B0() {
        InterfaceC0465b0 interfaceC0465b0 = this.f3133z;
        if (interfaceC0465b0 != null) {
            return interfaceC0465b0;
        }
        Fragment fragment = this.f3129v;
        return fragment != null ? fragment.mFragmentManager.m3430B0() : this.f3094A;
    }

    /* renamed from: C */
    boolean m3431C(MenuItem menuItem) {
        if (this.f3126s < 1) {
            return false;
        }
        for (Fragment fragment : this.f3112e.m3723n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    void m3432D() {
        this.f3100G = false;
        this.f3101H = false;
        this.f3108O.m3683o(false);
        m3396T(1);
    }

    /* renamed from: D0 */
    C0530z m3433D0(Fragment fragment) {
        return this.f3108O.m3680l(fragment);
    }

    /* renamed from: E */
    boolean m3434E(Menu menu, MenuInflater menuInflater) {
        if (this.f3126s < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f3112e.m3723n()) {
            if (fragment != null && m3443J0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f3114g != null) {
            for (int i2 = 0; i2 < this.f3114g.size(); i2++) {
                Fragment fragment2 = this.f3114g.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f3114g = arrayList;
        return z;
    }

    /* renamed from: E0 */
    void m3435E0() {
        m3472b0(true);
        if (this.f3117j.m132c()) {
            m3471a1();
        } else {
            this.f3116i.m129c();
        }
    }

    /* renamed from: F */
    void m3436F() {
        this.f3102I = true;
        m3472b0(true);
        m3398Y();
        m3396T(-1);
        this.f3127t = null;
        this.f3128u = null;
        this.f3129v = null;
        if (this.f3116i != null) {
            this.f3117j.m133d();
            this.f3116i = null;
        }
        AbstractC0051b<Intent> abstractC0051b = this.f3095B;
        if (abstractC0051b != null) {
            abstractC0051b.mo159c();
            this.f3096C.mo159c();
            this.f3097D.mo159c();
        }
    }

    /* renamed from: F0 */
    void m3437F0(Fragment fragment) {
        if (m3392H0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        m3420s1(fragment);
    }

    /* renamed from: G */
    void m3438G() {
        m3396T(1);
    }

    /* renamed from: G0 */
    public boolean m3439G0() {
        return this.f3102I;
    }

    /* renamed from: H */
    void m3440H() {
        for (Fragment fragment : this.f3112e.m3723n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* renamed from: I */
    void m3441I(boolean z) {
        for (Fragment fragment : this.f3112e.m3723n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* renamed from: J */
    void m3442J(Fragment fragment) {
        Iterator<InterfaceC0479o> it = this.f3125r.iterator();
        while (it.hasNext()) {
            it.next().mo3526a(this, fragment);
        }
    }

    /* renamed from: J0 */
    boolean m3443J0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* renamed from: K */
    boolean m3444K(MenuItem menuItem) {
        if (this.f3126s < 1) {
            return false;
        }
        for (Fragment fragment : this.f3112e.m3723n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K0 */
    boolean m3445K0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.m3428A0()) && m3445K0(fragmentManager.f3129v);
    }

    /* renamed from: L */
    void m3446L(Menu menu) {
        if (this.f3126s < 1) {
            return;
        }
        for (Fragment fragment : this.f3112e.m3723n()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* renamed from: L0 */
    boolean m3447L0(int i2) {
        return this.f3126s >= i2;
    }

    /* renamed from: M0 */
    public boolean m3448M0() {
        return this.f3100G || this.f3101H;
    }

    /* renamed from: N */
    void m3449N() {
        m3396T(5);
    }

    /* renamed from: N0 */
    void m3450N0(Fragment fragment, String[] strArr, int i2) {
        if (this.f3097D == null) {
            this.f3127t.m3656k(fragment, strArr, i2);
            return;
        }
        this.f3098E.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        this.f3097D.m172a(strArr);
    }

    /* renamed from: O */
    void m3451O(boolean z) {
        for (Fragment fragment : this.f3112e.m3723n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* renamed from: O0 */
    void m3452O0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.f3095B == null) {
            this.f3127t.m3657n(fragment, intent, i2, bundle);
            return;
        }
        this.f3098E.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f3095B.m172a(intent);
    }

    /* renamed from: P */
    boolean m3453P(Menu menu) {
        boolean z = false;
        if (this.f3126s < 1) {
            return false;
        }
        for (Fragment fragment : this.f3112e.m3723n()) {
            if (fragment != null && m3443J0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: P0 */
    void m3454P0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.f3096C == null) {
            this.f3127t.m3658o(fragment, intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (m3392H0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        IntentSenderRequest intentSenderRequestM168a = new IntentSenderRequest.C0049b(intentSender).m169b(intent2).m170c(i4, i3).m168a();
        this.f3098E.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        if (m3392H0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f3096C.m172a(intentSenderRequestM168a);
    }

    /* renamed from: Q */
    void m3455Q() {
        m3425w1();
        m3394M(this.f3130w);
    }

    /* renamed from: R */
    void m3456R() {
        this.f3100G = false;
        this.f3101H = false;
        this.f3108O.m3683o(false);
        m3396T(7);
    }

    /* renamed from: R0 */
    void m3457R0(Fragment fragment) {
        if (!this.f3112e.m3712c(fragment.mWho)) {
            if (m3392H0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f3126s + "since it is not added to " + this);
                return;
            }
            return;
        }
        m3460T0(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f2 = fragment.mPostponedAlpha;
            if (f2 > 0.0f) {
                view.setAlpha(f2);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            C0469e.d dVarM3622b = C0469e.m3622b(this.f3127t.m3654f(), fragment, true);
            if (dVarM3622b != null) {
                Animation animation = dVarM3622b.f3275a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    dVarM3622b.f3276b.setTarget(fragment.mView);
                    dVarM3622b.f3276b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            m3423v(fragment);
        }
    }

    /* renamed from: S */
    void m3458S() {
        this.f3100G = false;
        this.f3101H = false;
        this.f3108O.m3683o(false);
        m3396T(5);
    }

    /* renamed from: S0 */
    void m3459S0(int i2, boolean z) {
        AbstractC0474j<?> abstractC0474j;
        if (this.f3127t == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.f3126s) {
            this.f3126s = i2;
            if (f3093b) {
                this.f3112e.m3727r();
            } else {
                Iterator<Fragment> it = this.f3112e.m3723n().iterator();
                while (it.hasNext()) {
                    m3457R0(it.next());
                }
                for (C0482r c0482r : this.f3112e.m3720k()) {
                    Fragment fragmentM3699k = c0482r.m3699k();
                    if (!fragmentM3699k.mIsNewlyAdded) {
                        m3457R0(fragmentM3699k);
                    }
                    if (fragmentM3699k.mRemoving && !fragmentM3699k.isInBackStack()) {
                        this.f3112e.m3726q(c0482r);
                    }
                }
            }
            m3422u1();
            if (this.f3099F && (abstractC0474j = this.f3127t) != null && this.f3126s == 7) {
                abstractC0474j.mo3619p();
                this.f3099F = false;
            }
        }
    }

    /* renamed from: T0 */
    void m3460T0(Fragment fragment) {
        m3462U0(fragment, this.f3126s);
    }

    /* renamed from: U */
    void m3461U() {
        this.f3101H = true;
        this.f3108O.m3683o(true);
        m3396T(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015c  */
    /* renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m3462U0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m3462U0(androidx.fragment.app.Fragment, int):void");
    }

    /* renamed from: V */
    void m3463V() {
        m3396T(2);
    }

    /* renamed from: V0 */
    void m3464V0() {
        if (this.f3127t == null) {
            return;
        }
        this.f3100G = false;
        this.f3101H = false;
        this.f3108O.m3683o(false);
        for (Fragment fragment : this.f3112e.m3723n()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* renamed from: W0 */
    void m3465W0(C0482r c0482r) {
        Fragment fragmentM3699k = c0482r.m3699k();
        if (fragmentM3699k.mDeferStart) {
            if (this.f3111d) {
                this.f3103J = true;
                return;
            }
            fragmentM3699k.mDeferStart = false;
            if (f3093b) {
                c0482r.m3700m();
            } else {
                m3460T0(fragmentM3699k);
            }
        }
    }

    /* renamed from: X */
    public void m3466X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3112e.m3714e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3114g;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment = this.f3114g.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<C0462a> arrayList2 = this.f3113f;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0462a c0462a = this.f3113f.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0462a.toString());
                c0462a.m3558x(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3118k.get());
        synchronized (this.f3110c) {
            int size3 = this.f3110c.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    InterfaceC0457o interfaceC0457o = this.f3110c.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(interfaceC0457o);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3127t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3128u);
        if (this.f3129v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3129v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3126s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3100G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3101H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3102I);
        if (this.f3099F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3099F);
        }
    }

    /* renamed from: X0 */
    public void m3467X0() {
        m3469Z(new C0458p(null, -1, 0), false);
    }

    /* renamed from: Y0 */
    public void m3468Y0(int i2, int i3) {
        if (i2 >= 0) {
            m3469Z(new C0458p(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* renamed from: Z */
    void m3469Z(InterfaceC0457o interfaceC0457o, boolean z) {
        if (!z) {
            if (this.f3127t == null) {
                if (!this.f3102I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m3415p();
        }
        synchronized (this.f3110c) {
            if (this.f3127t == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f3110c.add(interfaceC0457o);
                m3499o1();
            }
        }
    }

    /* renamed from: Z0 */
    public void m3470Z0(String str, int i2) {
        m3469Z(new C0458p(str, -1, i2), false);
    }

    /* renamed from: a1 */
    public boolean m3471a1() {
        return m3402b1(null, -1, 0);
    }

    /* renamed from: b0 */
    boolean m3472b0(boolean z) {
        m3400a0(z);
        boolean z2 = false;
        while (m3413m0(this.f3104K, this.f3105L)) {
            this.f3111d = true;
            try {
                m3409h1(this.f3104K, this.f3105L);
                m3417q();
                z2 = true;
            } catch (Throwable th) {
                m3417q();
                throw th;
            }
        }
        m3425w1();
        m3397W();
        this.f3112e.m3711b();
        return z2;
    }

    /* renamed from: c0 */
    void m3473c0(InterfaceC0457o interfaceC0457o, boolean z) {
        if (z && (this.f3127t == null || this.f3102I)) {
            return;
        }
        m3400a0(z);
        if (interfaceC0457o.mo3531a(this.f3104K, this.f3105L)) {
            this.f3111d = true;
            try {
                m3409h1(this.f3104K, this.f3105L);
            } finally {
                m3417q();
            }
        }
        m3425w1();
        m3397W();
        this.f3112e.m3711b();
    }

    /* renamed from: c1 */
    boolean m3474c1(ArrayList<C0462a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<C0462a> arrayList3 = this.f3113f;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3113f.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0462a c0462a = this.f3113f.get(size2);
                    if ((str != null && str.equals(c0462a.getName())) || (i2 >= 0 && i2 == c0462a.f3184v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0462a c0462a2 = this.f3113f.get(size2);
                        if (str == null || !str.equals(c0462a2.getName())) {
                            if (i2 < 0 || i2 != c0462a2.f3184v) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f3113f.size() - 1) {
                return false;
            }
            for (int size3 = this.f3113f.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f3113f.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: e */
    void m3475e(C0462a c0462a) {
        if (this.f3113f == null) {
            this.f3113f = new ArrayList<>();
        }
        this.f3113f.add(c0462a);
    }

    /* renamed from: e1 */
    public void m3476e1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            m3424v1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* renamed from: f */
    void m3477f(Fragment fragment, C0273b c0273b) {
        if (this.f3122o.get(fragment) == null) {
            this.f3122o.put(fragment, new HashSet<>());
        }
        this.f3122o.get(fragment).add(c0273b);
    }

    /* renamed from: f0 */
    public boolean m3478f0() {
        boolean zM3472b0 = m3472b0(true);
        m3411l0();
        return zM3472b0;
    }

    /* renamed from: f1 */
    void m3479f1(Fragment fragment, C0273b c0273b) {
        HashSet<C0273b> hashSet = this.f3122o.get(fragment);
        if (hashSet != null && hashSet.remove(c0273b) && hashSet.isEmpty()) {
            this.f3122o.remove(fragment);
            if (fragment.mState < 5) {
                m3426x(fragment);
                m3460T0(fragment);
            }
        }
    }

    /* renamed from: g */
    void m3480g(Fragment fragment) {
        if (m3392H0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C0482r c0482rM3511w = m3511w(fragment);
        fragment.mFragmentManager = this;
        this.f3112e.m3725p(c0482rM3511w);
        if (fragment.mDetached) {
            return;
        }
        this.f3112e.m3710a(fragment);
        fragment.mRemoving = false;
        if (fragment.mView == null) {
            fragment.mHiddenChanged = false;
        }
        if (m3393I0(fragment)) {
            this.f3099F = true;
        }
    }

    /* renamed from: g1 */
    void m3481g1(Fragment fragment) {
        if (m3392H0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f3112e.m3728s(fragment);
            if (m3393I0(fragment)) {
                this.f3099F = true;
            }
            fragment.mRemoving = true;
            m3420s1(fragment);
        }
    }

    /* renamed from: h */
    public void m3482h(InterfaceC0479o interfaceC0479o) {
        this.f3125r.add(interfaceC0479o);
    }

    /* renamed from: h0 */
    Fragment m3483h0(String str) {
        return this.f3112e.m3715f(str);
    }

    /* renamed from: i */
    void m3484i(Fragment fragment) {
        this.f3108O.m3675f(fragment);
    }

    /* renamed from: i0 */
    public Fragment m3485i0(int i2) {
        return this.f3112e.m3716g(i2);
    }

    /* renamed from: i1 */
    void m3486i1(Fragment fragment) {
        this.f3108O.m3682n(fragment);
    }

    /* renamed from: j */
    int m3487j() {
        return this.f3118k.getAndIncrement();
    }

    /* renamed from: j0 */
    public Fragment m3488j0(String str) {
        return this.f3112e.m3717h(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: k */
    void m3489k(AbstractC0474j<?> abstractC0474j, AbstractC0470f abstractC0470f, Fragment fragment) {
        String str;
        if (this.f3127t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f3127t = abstractC0474j;
        this.f3128u = abstractC0470f;
        this.f3129v = fragment;
        if (fragment != null) {
            m3482h(new C0451i(fragment));
        } else if (abstractC0474j instanceof InterfaceC0479o) {
            m3482h((InterfaceC0479o) abstractC0474j);
        }
        if (this.f3129v != null) {
            m3425w1();
        }
        if (abstractC0474j instanceof InterfaceC0039c) {
            InterfaceC0039c interfaceC0039c = (InterfaceC0039c) abstractC0474j;
            OnBackPressedDispatcher onBackPressedDispatcher = interfaceC0039c.getOnBackPressedDispatcher();
            this.f3116i = onBackPressedDispatcher;
            InterfaceC0515k interfaceC0515k = interfaceC0039c;
            if (fragment != null) {
                interfaceC0515k = fragment;
            }
            onBackPressedDispatcher.m127a(interfaceC0515k, this.f3117j);
        }
        if (fragment != null) {
            this.f3108O = fragment.mFragmentManager.m3416p0(fragment);
        } else if (abstractC0474j instanceof InterfaceC0501a0) {
            this.f3108O = C0478n.m3673j(((InterfaceC0501a0) abstractC0474j).getViewModelStore());
        } else {
            this.f3108O = new C0478n(false);
        }
        this.f3108O.m3683o(m3448M0());
        this.f3112e.m3733x(this.f3108O);
        Object obj = this.f3127t;
        if (obj instanceof InterfaceC0052c) {
            ActivityResultRegistry activityResultRegistry = ((InterfaceC0052c) obj).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String str2 = "FragmentManager:" + str;
            this.f3095B = activityResultRegistry.m155i(str2 + "StartActivityForResult", new C0055c(), new C0452j());
            this.f3096C = activityResultRegistry.m155i(str2 + "StartIntentSenderForResult", new C0454l(), new C0443a());
            this.f3097D = activityResultRegistry.m155i(str2 + "RequestPermissions", new C0054b(), new C0444b());
        }
    }

    /* renamed from: k0 */
    Fragment m3490k0(String str) {
        return this.f3112e.m3718i(str);
    }

    /* renamed from: k1 */
    void m3491k1(Parcelable parcelable) {
        C0482r c0482r;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f3161f == null) {
            return;
        }
        this.f3112e.m3729t();
        Iterator<FragmentState> it = fragmentManagerState.f3161f.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            if (next != null) {
                Fragment fragmentM3677h = this.f3108O.m3677h(next.f3170g);
                if (fragmentM3677h != null) {
                    if (m3392H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentM3677h);
                    }
                    c0482r = new C0482r(this.f3124q, this.f3112e, fragmentM3677h, next);
                } else {
                    c0482r = new C0482r(this.f3124q, this.f3112e, this.f3127t.m3654f().getClassLoader(), m3506t0(), next);
                }
                Fragment fragmentM3699k = c0482r.m3699k();
                fragmentM3699k.mFragmentManager = this;
                if (m3392H0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentM3699k.mWho + "): " + fragmentM3699k);
                }
                c0482r.m3702o(this.f3127t.m3654f().getClassLoader());
                this.f3112e.m3725p(c0482r);
                c0482r.m3707u(this.f3126s);
            }
        }
        for (Fragment fragment : this.f3108O.m3679k()) {
            if (!this.f3112e.m3712c(fragment.mWho)) {
                if (m3392H0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f3161f);
                }
                this.f3108O.m3682n(fragment);
                fragment.mFragmentManager = this;
                C0482r c0482r2 = new C0482r(this.f3124q, this.f3112e, fragment);
                c0482r2.m3707u(1);
                c0482r2.m3700m();
                fragment.mRemoving = true;
                c0482r2.m3700m();
            }
        }
        this.f3112e.m3730u(fragmentManagerState.f3162g);
        if (fragmentManagerState.f3163h != null) {
            this.f3113f = new ArrayList<>(fragmentManagerState.f3163h.length);
            int i2 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f3163h;
                if (i2 >= backStackStateArr.length) {
                    break;
                }
                C0462a c0462aM3377a = backStackStateArr[i2].m3377a(this);
                if (m3392H0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + c0462aM3377a.f3184v + "): " + c0462aM3377a);
                    PrintWriter printWriter = new PrintWriter(new C0490z("FragmentManager"));
                    c0462aM3377a.m3559y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3113f.add(c0462aM3377a);
                i2++;
            }
        } else {
            this.f3113f = null;
        }
        this.f3118k.set(fragmentManagerState.f3164i);
        String str = fragmentManagerState.f3165j;
        if (str != null) {
            Fragment fragmentM3483h0 = m3483h0(str);
            this.f3130w = fragmentM3483h0;
            m3394M(fragmentM3483h0);
        }
        ArrayList<String> arrayList = fragmentManagerState.f3166k;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.f3119l.put(arrayList.get(i3), fragmentManagerState.f3167l.get(i3));
            }
        }
        this.f3098E = new ArrayDeque<>(fragmentManagerState.f3168m);
    }

    /* renamed from: l */
    void m3492l(Fragment fragment) {
        if (m3392H0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f3112e.m3710a(fragment);
            if (m3392H0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m3393I0(fragment)) {
                this.f3099F = true;
            }
        }
    }

    /* renamed from: m */
    public AbstractC0485u m3493m() {
        return new C0462a(this);
    }

    /* renamed from: m1 */
    Parcelable m3494m1() {
        int size;
        m3411l0();
        m3398Y();
        m3472b0(true);
        this.f3100G = true;
        this.f3108O.m3683o(true);
        ArrayList<FragmentState> arrayListM3731v = this.f3112e.m3731v();
        BackStackState[] backStackStateArr = null;
        if (arrayListM3731v.isEmpty()) {
            if (m3392H0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> arrayListM3732w = this.f3112e.m3732w();
        ArrayList<C0462a> arrayList = this.f3113f;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStackStateArr[i2] = new BackStackState(this.f3113f.get(i2));
                if (m3392H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f3113f.get(i2));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f3161f = arrayListM3731v;
        fragmentManagerState.f3162g = arrayListM3732w;
        fragmentManagerState.f3163h = backStackStateArr;
        fragmentManagerState.f3164i = this.f3118k.get();
        Fragment fragment = this.f3130w;
        if (fragment != null) {
            fragmentManagerState.f3165j = fragment.mWho;
        }
        fragmentManagerState.f3166k.addAll(this.f3119l.keySet());
        fragmentManagerState.f3167l.addAll(this.f3119l.values());
        fragmentManagerState.f3168m = new ArrayList<>(this.f3098E);
        return fragmentManagerState;
    }

    /* renamed from: n0 */
    public InterfaceC0453k m3495n0(int i2) {
        return this.f3113f.get(i2);
    }

    /* renamed from: n1 */
    public Fragment.SavedState m3496n1(Fragment fragment) {
        C0482r c0482rM3722m = this.f3112e.m3722m(fragment.mWho);
        if (c0482rM3722m == null || !c0482rM3722m.m3699k().equals(fragment)) {
            m3424v1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return c0482rM3722m.m3704r();
    }

    /* renamed from: o */
    boolean m3497o() {
        boolean zM3393I0 = false;
        for (Fragment fragment : this.f3112e.m3721l()) {
            if (fragment != null) {
                zM3393I0 = m3393I0(fragment);
            }
            if (zM3393I0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o0 */
    public int m3498o0() {
        ArrayList<C0462a> arrayList = this.f3113f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: o1 */
    void m3499o1() {
        synchronized (this.f3110c) {
            ArrayList<C0459q> arrayList = this.f3107N;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.f3110c.size() == 1;
            if (z || z2) {
                this.f3127t.m3655g().removeCallbacks(this.f3109P);
                this.f3127t.m3655g().post(this.f3109P);
                m3425w1();
            }
        }
    }

    /* renamed from: p1 */
    void m3500p1(Fragment fragment, boolean z) {
        ViewGroup viewGroupM3419s0 = m3419s0(fragment);
        if (viewGroupM3419s0 == null || !(viewGroupM3419s0 instanceof C0471g)) {
            return;
        }
        ((C0471g) viewGroupM3419s0).setDrawDisappearingViewsLast(!z);
    }

    /* renamed from: q0 */
    AbstractC0470f m3501q0() {
        return this.f3128u;
    }

    /* renamed from: q1 */
    void m3502q1(Fragment fragment, AbstractC0511g.c cVar) {
        if (fragment.equals(m3483h0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: r */
    public final void m3503r(String str) {
        this.f3119l.remove(str);
    }

    /* renamed from: r0 */
    public Fragment m3504r0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentM3483h0 = m3483h0(string);
        if (fragmentM3483h0 == null) {
            m3424v1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentM3483h0;
    }

    /* renamed from: r1 */
    void m3505r1(Fragment fragment) {
        if (fragment == null || (fragment.equals(m3483h0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f3130w;
            this.f3130w = fragment;
            m3394M(fragment2);
            m3394M(this.f3130w);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: t0 */
    public C0473i m3506t0() {
        C0473i c0473i = this.f3131x;
        if (c0473i != null) {
            return c0473i;
        }
        Fragment fragment = this.f3129v;
        return fragment != null ? fragment.mFragmentManager.m3506t0() : this.f3132y;
    }

    /* renamed from: t1 */
    void m3507t1(Fragment fragment) {
        if (m3392H0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3129v;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3129v)));
            sb.append("}");
        } else {
            AbstractC0474j<?> abstractC0474j = this.f3127t;
            if (abstractC0474j != null) {
                sb.append(abstractC0474j.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f3127t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    void m3508u(C0462a c0462a, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0462a.m3540A(z3);
        } else {
            c0462a.m3560z();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0462a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f3126s >= 1) {
            C0486v.m3747B(this.f3127t.m3654f(), this.f3128u, arrayList, arrayList2, 0, 1, true, this.f3123p);
        }
        if (z3) {
            m3459S0(this.f3126s, true);
        }
        for (Fragment fragment : this.f3112e.m3721l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && c0462a.m3542C(fragment.mContainerId)) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    fragment.mView.setAlpha(f2);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* renamed from: u0 */
    C0484t m3509u0() {
        return this.f3112e;
    }

    /* renamed from: v0 */
    public List<Fragment> m3510v0() {
        return this.f3112e.m3723n();
    }

    /* renamed from: w */
    C0482r m3511w(Fragment fragment) {
        C0482r c0482rM3722m = this.f3112e.m3722m(fragment.mWho);
        if (c0482rM3722m != null) {
            return c0482rM3722m;
        }
        C0482r c0482r = new C0482r(this.f3124q, this.f3112e, fragment);
        c0482r.m3702o(this.f3127t.m3654f().getClassLoader());
        c0482r.m3707u(this.f3126s);
        return c0482r;
    }

    /* renamed from: w0 */
    AbstractC0474j<?> m3512w0() {
        return this.f3127t;
    }

    /* renamed from: x0 */
    LayoutInflater.Factory2 m3513x0() {
        return this.f3115h;
    }

    /* renamed from: y */
    void m3514y(Fragment fragment) {
        if (m3392H0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (m3392H0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f3112e.m3728s(fragment);
            if (m3393I0(fragment)) {
                this.f3099F = true;
            }
            m3420s1(fragment);
        }
    }

    /* renamed from: y0 */
    C0476l m3515y0() {
        return this.f3124q;
    }

    /* renamed from: z */
    void m3516z() {
        this.f3100G = false;
        this.f3101H = false;
        this.f3108O.m3683o(false);
        m3396T(4);
    }

    /* renamed from: z0 */
    Fragment m3517z0() {
        return this.f3129v;
    }

    @SuppressLint({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C0442a();

        /* renamed from: f */
        String f3138f;

        /* renamed from: g */
        int f3139g;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        class C0442a implements Parcelable.Creator<LaunchedFragmentInfo> {
            C0442a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i2) {
                return new LaunchedFragmentInfo[i2];
            }
        }

        LaunchedFragmentInfo(String str, int i2) {
            this.f3138f = str;
            this.f3139g = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f3138f);
            parcel.writeInt(this.f3139g);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f3138f = parcel.readString();
            this.f3139g = parcel.readInt();
        }
    }
}
