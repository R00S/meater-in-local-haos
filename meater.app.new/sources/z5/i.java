package z5;

import Ba.p;
import L4.C1389m0;
import Xb.C1841i;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.T;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.AbstractC2106m;
import android.view.AbstractC2109p;
import android.view.C2112t;
import android.view.C2115w;
import android.view.E;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.b0;
import android.view.c0;
import android.widget.FrameLayout;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.recipe.adapter.RecipeLinearLayoutManager;
import com.apptionlabs.meater_app.recipe.ui.summary.RecipeSummaryActivity;
import com.google.android.material.tabs.TabLayout;
import j1.C3719d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import o4.Recipe;
import o4.RecipeFilter;
import oa.C4153F;
import oa.C4165j;
import oa.C4173r;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import s1.C4469y0;
import s1.X;
import ta.InterfaceC4588d;
import ua.C4696b;
import v5.C4893a;
import v5.l;
import v5.n;

/* compiled from: RecipeBrowseFragment.kt */
@Metadata(d1 = {"\u0000\u008d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\b*\u0001Q\b\u0007\u0018\u0000 U2\u00020\u0001:\u0002VWB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\u00062\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J+\u0010!\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b&\u0010\u0011J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u0003J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00102R\u0018\u0010P\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010KR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006X"}, d2 = {"Lz5/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/View;", "view", "Loa/F;", "U2", "(Landroid/view/View;)V", "", "recipeId", "f3", "(I)V", "Q2", "", "tag", "Z2", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lo4/o;", "Lkotlin/collections/ArrayList;", "data", "b3", "(Ljava/util/ArrayList;)V", "c3", "error", "d3", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "z1", "(Landroid/view/View;Landroid/os/Bundle;)V", "appLinkSlug", "a3", "q1", "v1", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroidx/recyclerview/widget/RecyclerView$q;", "G0", "Landroidx/recyclerview/widget/RecyclerView$q;", "layoutManager", "H0", "I", "lastVisibleIndex", "Lv5/l;", "I0", "Lv5/l;", "recipeBrowseAdapter", "LL4/m0;", "J0", "LL4/m0;", "binding", "Lz5/j;", "K0", "Loa/i;", "P2", "()Lz5/j;", "viewModel", "Lv5/n;", "L0", "Lv5/n;", "scrollListener", "Landroid/widget/FrameLayout;", "M0", "Landroid/widget/FrameLayout;", "frameLayout", "N0", "Ljava/lang/String;", "appLinkRecipeSlug", "O0", "selectedTabPosition", "P0", "searchQuery", "z5/i$h", "Q0", "Lz5/i$h;", "onTabSelectedListener", "R0", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i extends Fragment {

    /* renamed from: R0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: S0, reason: collision with root package name */
    public static final int f53721S0 = 8;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private RecyclerView.q layoutManager;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private l recipeBrowseAdapter;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    private C1389m0 binding;

    /* renamed from: L0, reason: collision with root package name and from kotlin metadata */
    private n scrollListener;

    /* renamed from: M0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout frameLayout;

    /* renamed from: N0, reason: collision with root package name and from kotlin metadata */
    private String appLinkRecipeSlug;

    /* renamed from: O0, reason: collision with root package name and from kotlin metadata */
    private int selectedTabPosition;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private int lastVisibleIndex = -1;

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel = C4165j.b(EnumC4168m.f46628D, new j(this, null, new C0788i(this), null, null));

    /* renamed from: P0, reason: collision with root package name and from kotlin metadata */
    private String searchQuery = "";

    /* renamed from: Q0, reason: collision with root package name and from kotlin metadata */
    private final h onTabSelectedListener = new h();

    /* compiled from: RecipeBrowseFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz5/i$a;", "", "<init>", "()V", "Lz5/i;", "a", "()Lz5/i;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z5.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final i a() {
            i iVar = new i();
            iVar.k2(new Bundle());
            return iVar;
        }

        private Companion() {
        }
    }

    /* compiled from: RecipeBrowseFragment.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\rR\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d¨\u0006\u001f"}, d2 = {"Lz5/i$b;", "Landroidx/appcompat/widget/SearchView$m;", "Landroidx/lifecycle/m;", "lifecycle", "Lkotlin/Function1;", "", "Loa/F;", "onDebouncingQueryTextChange", "<init>", "(Landroidx/lifecycle/m;LBa/l;)V", "query", "", "b", "(Ljava/lang/String;)Z", "newText", "a", "LBa/l;", "", "J", "d", "()J", "setDebouncePeriod", "(J)V", "debouncePeriod", "Landroidx/lifecycle/p;", "c", "Landroidx/lifecycle/p;", "coroutineScope", "LXb/v0;", "LXb/v0;", "searchJob", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class b implements SearchView.m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Ba.l<String, C4153F> onDebouncingQueryTextChange;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long debouncePeriod;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final AbstractC2109p coroutineScope;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private InterfaceC1867v0 searchJob;

        /* compiled from: RecipeBrowseFragment.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.browse.RecipeBrowseFragment$DebouncingQueryTextListener$onQueryTextChange$1", f = "RecipeBrowseFragment.kt", l = {405}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            Object f53737B;

            /* renamed from: C, reason: collision with root package name */
            Object f53738C;

            /* renamed from: D, reason: collision with root package name */
            int f53739D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ String f53740E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ b f53741F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, b bVar, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f53740E = str;
                this.f53741F = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f53740E, this.f53741F, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b bVar;
                String str;
                Object objE = C4696b.e();
                int i10 = this.f53739D;
                if (i10 == 0) {
                    C4173r.b(obj);
                    String str2 = this.f53740E;
                    if (str2 != null) {
                        bVar = this.f53741F;
                        long debouncePeriod = bVar.getDebouncePeriod();
                        this.f53737B = bVar;
                        this.f53738C = str2;
                        this.f53739D = 1;
                        if (T.a(debouncePeriod, this) == objE) {
                            return objE;
                        }
                        str = str2;
                    }
                    return C4153F.f46609a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f53738C;
                bVar = (b) this.f53737B;
                C4173r.b(obj);
                bVar.onDebouncingQueryTextChange.invoke(str);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(AbstractC2106m lifecycle, Ba.l<? super String, C4153F> onDebouncingQueryTextChange) {
            C3862t.g(lifecycle, "lifecycle");
            C3862t.g(onDebouncingQueryTextChange, "onDebouncingQueryTextChange");
            this.onDebouncingQueryTextChange = onDebouncingQueryTextChange;
            this.debouncePeriod = 300L;
            this.coroutineScope = C2112t.a(lifecycle);
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String newText) {
            InterfaceC1867v0 interfaceC1867v0 = this.searchJob;
            if (interfaceC1867v0 != null) {
                InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
            }
            this.searchJob = C1841i.d(this.coroutineScope, null, null, new a(newText, this, null), 3, null);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String query) {
            return false;
        }

        /* renamed from: d, reason: from getter */
        public final long getDebouncePeriod() {
            return this.debouncePeriod;
        }
    }

    /* compiled from: RecipeBrowseFragment.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"z5/i$c", "Landroid/widget/SearchView$OnCloseListener;", "Landroidx/appcompat/widget/SearchView$l;", "", "onClose", "()Z", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements SearchView.OnCloseListener, SearchView.l {
        c() {
        }

        @Override // android.widget.SearchView.OnCloseListener, androidx.appcompat.widget.SearchView.l
        public boolean onClose() {
            C1389m0 c1389m0 = i.this.binding;
            if (c1389m0 == null) {
                C3862t.u("binding");
                c1389m0 = null;
            }
            LinearLayoutCompat toolbarTitleHolder = c1389m0.f10242m;
            C3862t.f(toolbarTitleHolder, "toolbarTitleHolder");
            Q4.l.j(toolbarTitleHolder);
            return false;
        }
    }

    /* compiled from: RecipeBrowseFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"z5/i$d", "Lw5/f;", "", "itemCount", "Loa/F;", "a", "(I)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements w5.f {
        d() {
        }

        @Override // w5.f
        public void a(int itemCount) {
            String str;
            C1389m0 c1389m0 = null;
            if (itemCount != 0 || (str = i.this.searchQuery) == null || str.length() == 0) {
                C1389m0 c1389m02 = i.this.binding;
                if (c1389m02 == null) {
                    C3862t.u("binding");
                } else {
                    c1389m0 = c1389m02;
                }
                AppCompatTextView searchErrorLabel = c1389m0.f10236g;
                C3862t.f(searchErrorLabel, "searchErrorLabel");
                Q4.l.g(searchErrorLabel);
                return;
            }
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) i.this.A0(R.string.no_search_result_found)).append((CharSequence) " ");
            C3862t.f(spannableStringBuilderAppend, "append(...)");
            i iVar = i.this;
            StyleSpan styleSpan = new StyleSpan(1);
            int length = spannableStringBuilderAppend.length();
            spannableStringBuilderAppend.append((CharSequence) iVar.searchQuery);
            spannableStringBuilderAppend.setSpan(styleSpan, length, spannableStringBuilderAppend.length(), 17);
            C1389m0 c1389m03 = i.this.binding;
            if (c1389m03 == null) {
                C3862t.u("binding");
                c1389m03 = null;
            }
            c1389m03.f10236g.setText(spannableStringBuilderAppend);
            C1389m0 c1389m04 = i.this.binding;
            if (c1389m04 == null) {
                C3862t.u("binding");
            } else {
                c1389m0 = c1389m04;
            }
            AppCompatTextView searchErrorLabel2 = c1389m0.f10236g;
            C3862t.f(searchErrorLabel2, "searchErrorLabel");
            Q4.l.j(searchErrorLabel2);
        }
    }

    /* compiled from: RecipeBrowseFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"z5/i$e", "Lv5/l$b;", "", "recipeId", "Loa/F;", "a", "(I)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements l.b {
        e() {
        }

        @Override // v5.l.b
        public void a(int recipeId) {
            i.this.f3(recipeId);
        }
    }

    /* compiled from: RecipeBrowseFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"z5/i$f", "Lv5/n;", "", "index", "Loa/F;", "c", "(I)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends n {
        f() {
        }

        @Override // v5.n
        public void c(int index) {
            if (x4.g.h().getResources().getBoolean(R.bool.is_tablet)) {
                return;
            }
            i.this.lastVisibleIndex = index;
            if (index != -1) {
                l lVar = i.this.recipeBrowseAdapter;
                C1389m0 c1389m0 = null;
                if (lVar == null) {
                    C3862t.u("recipeBrowseAdapter");
                    lVar = null;
                }
                C1389m0 c1389m02 = i.this.binding;
                if (c1389m02 == null) {
                    C3862t.u("binding");
                } else {
                    c1389m0 = c1389m02;
                }
                RecyclerView.G gD0 = c1389m0.f10235f.d0(index);
                C3862t.e(gD0, "null cannot be cast to non-null type com.apptionlabs.meater_app.recipe.adapter.RecipeBrowseAdapter.RecipeListItemViewHolder");
                lVar.W(index, (l.a) gD0, i.this.P2().m());
            }
        }
    }

    /* compiled from: RecipeBrowseFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.browse.RecipeBrowseFragment$onResume$1", f = "RecipeBrowseFragment.kt", l = {364}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f53746B;

        g(InterfaceC4588d<? super g> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return i.this.new g(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((g) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f53746B;
            if (i10 == 0) {
                C4173r.b(obj);
                this.f53746B = 1;
                if (T.a(100L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            if (i.this.lastVisibleIndex != -1) {
                RecyclerView.q qVar = i.this.layoutManager;
                RecyclerView.q qVar2 = null;
                if (qVar == null) {
                    C3862t.u("layoutManager");
                    qVar = null;
                }
                if (qVar instanceof LinearLayoutManager) {
                    RecyclerView.q qVar3 = i.this.layoutManager;
                    if (qVar3 == null) {
                        C3862t.u("layoutManager");
                    } else {
                        qVar2 = qVar3;
                    }
                    ((LinearLayoutManager) qVar2).E2(i.this.lastVisibleIndex, 0);
                }
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z5.i$i, reason: collision with other inner class name */
    public static final class C0788i implements Ba.a<Fragment> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f53749B;

        public C0788i(Fragment fragment) {
            this.f53749B = fragment;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f53749B;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class j implements Ba.a<z5.j> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f53750B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f53751C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f53752D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a f53753E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f53754F;

        public j(Fragment fragment, dd.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
            this.f53750B = fragment;
            this.f53751C = aVar;
            this.f53752D = aVar2;
            this.f53753E = aVar3;
            this.f53754F = aVar4;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, z5.j] */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z5.j invoke() {
            Q1.a aVarM;
            Fragment fragment = this.f53750B;
            dd.a aVar = this.f53751C;
            Ba.a aVar2 = this.f53752D;
            Ba.a aVar3 = this.f53753E;
            Ba.a aVar4 = this.f53754F;
            b0 b0VarV = ((c0) aVar2.invoke()).v();
            if (aVar3 == null || (aVarM = (Q1.a) aVar3.invoke()) == null) {
                aVarM = fragment.m();
                C3862t.f(aVarM, "<get-defaultViewModelCreationExtras>(...)");
            }
            return ld.b.b(P.b(z5.j.class), b0VarV, (4 & 4) != 0 ? null : null, aVarM, (4 & 16) != 0 ? null : aVar, Nc.a.a(fragment), (4 & 64) != 0 ? null : aVar4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z5.j P2() {
        return (z5.j) this.viewModel.getValue();
    }

    private final void Q2() {
        C1389m0 c1389m0 = this.binding;
        l lVar = null;
        if (c1389m0 == null) {
            C3862t.u("binding");
            c1389m0 = null;
        }
        c1389m0.f10239j.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: z5.e
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                i.R2(this.f53716a);
            }
        });
        C1389m0 c1389m02 = this.binding;
        if (c1389m02 == null) {
            C3862t.u("binding");
            c1389m02 = null;
        }
        androidx.appcompat.widget.SearchView searchView = c1389m02.f10237h;
        AbstractC2106m lifecycle = getLifecycle();
        C3862t.f(lifecycle, "<get-lifecycle>(...)");
        searchView.setOnQueryTextListener(new b(lifecycle, new Ba.l() { // from class: z5.f
            @Override // Ba.l
            public final Object invoke(Object obj) {
                return i.S2(this.f53717B, (String) obj);
            }
        }));
        C1389m0 c1389m03 = this.binding;
        if (c1389m03 == null) {
            C3862t.u("binding");
            c1389m03 = null;
        }
        c1389m03.f10237h.setOnSearchClickListener(new View.OnClickListener() { // from class: z5.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.T2(this.f53718B, view);
            }
        });
        C1389m0 c1389m04 = this.binding;
        if (c1389m04 == null) {
            C3862t.u("binding");
            c1389m04 = null;
        }
        c1389m04.f10237h.setOnCloseListener(new c());
        C1389m0 c1389m05 = this.binding;
        if (c1389m05 == null) {
            C3862t.u("binding");
            c1389m05 = null;
        }
        c1389m05.f10240k.h(this.onTabSelectedListener);
        l lVar2 = this.recipeBrowseAdapter;
        if (lVar2 == null) {
            C3862t.u("recipeBrowseAdapter");
        } else {
            lVar = lVar2;
        }
        lVar.a0(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(i iVar) {
        iVar.P2().l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F S2(i iVar, String str) {
        l lVar = null;
        iVar.searchQuery = str != null ? Ub.n.U0(str).toString() : null;
        l lVar2 = iVar.recipeBrowseAdapter;
        if (lVar2 == null) {
            C3862t.u("recipeBrowseAdapter");
        } else {
            lVar = lVar2;
        }
        lVar.getFilter().filter(iVar.searchQuery);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(i iVar, View view) {
        C1389m0 c1389m0 = iVar.binding;
        if (c1389m0 == null) {
            C3862t.u("binding");
            c1389m0 = null;
        }
        View viewFindViewById = c1389m0.f10231b.findViewById(R.id.toolbarTitleHolder);
        C3862t.f(viewFindViewById, "findViewById(...)");
        Q4.l.g(viewFindViewById);
    }

    private final void U2(View view) {
        C4893a c4893a;
        C1389m0 c1389m0 = this.binding;
        FrameLayout frameLayout = null;
        if (c1389m0 == null) {
            C3862t.u("binding");
            c1389m0 = null;
        }
        X.B0(c1389m0.b(), new s1.I() { // from class: z5.d
            @Override // s1.I
            public final C4469y0 a(View view2, C4469y0 c4469y0) {
                return i.V2(view2, c4469y0);
            }
        });
        if (x4.g.h().getResources().getBoolean(R.bool.is_tablet)) {
            if (u0().getConfiguration().orientation == 2) {
                c4893a = new C4893a(3, 60, true);
                this.layoutManager = new GridLayoutManager(e2(), 3, 1, false);
            } else {
                c4893a = new C4893a(2, 40, true);
                this.layoutManager = new GridLayoutManager(e2(), 2, 1, false);
            }
            C1389m0 c1389m02 = this.binding;
            if (c1389m02 == null) {
                C3862t.u("binding");
                c1389m02 = null;
            }
            RecyclerView recyclerView = c1389m02.f10235f;
            RecyclerView.q qVar = this.layoutManager;
            if (qVar == null) {
                C3862t.u("layoutManager");
                qVar = null;
            }
            recyclerView.setLayoutManager(qVar);
            C1389m0 c1389m03 = this.binding;
            if (c1389m03 == null) {
                C3862t.u("binding");
                c1389m03 = null;
            }
            c1389m03.f10235f.j(c4893a);
        } else {
            this.layoutManager = new RecipeLinearLayoutManager(e2());
            C1389m0 c1389m04 = this.binding;
            if (c1389m04 == null) {
                C3862t.u("binding");
                c1389m04 = null;
            }
            RecyclerView recyclerView2 = c1389m04.f10235f;
            RecyclerView.q qVar2 = this.layoutManager;
            if (qVar2 == null) {
                C3862t.u("layoutManager");
                qVar2 = null;
            }
            recyclerView2.setLayoutManager(qVar2);
        }
        C1389m0 c1389m05 = this.binding;
        if (c1389m05 == null) {
            C3862t.u("binding");
            c1389m05 = null;
        }
        c1389m05.f10235f.setItemAnimator(null);
        this.recipeBrowseAdapter = new l();
        C1389m0 c1389m06 = this.binding;
        if (c1389m06 == null) {
            C3862t.u("binding");
            c1389m06 = null;
        }
        RecyclerView recyclerView3 = c1389m06.f10235f;
        l lVar = this.recipeBrowseAdapter;
        if (lVar == null) {
            C3862t.u("recipeBrowseAdapter");
            lVar = null;
        }
        recyclerView3.setAdapter(lVar);
        l lVar2 = this.recipeBrowseAdapter;
        if (lVar2 == null) {
            C3862t.u("recipeBrowseAdapter");
            lVar2 = null;
        }
        lVar2.Z(new e());
        this.scrollListener = new f();
        C1389m0 c1389m07 = this.binding;
        if (c1389m07 == null) {
            C3862t.u("binding");
            c1389m07 = null;
        }
        RecyclerView recyclerView4 = c1389m07.f10235f;
        n nVar = this.scrollListener;
        if (nVar == null) {
            C3862t.u("scrollListener");
            nVar = null;
        }
        recyclerView4.n(nVar);
        x5.g gVar = x5.g.f52863a;
        if (gVar.h().isEmpty()) {
            U4.b.t("(RecipeBrowseFragment) RecipeManager Recipe list is Empty. Hence Fetching recipes again.", new Object[0]);
            P2().l();
        } else {
            U4.b.t("(RecipeBrowseFragment) RecipeManager Recipe list is Populated. Showing from it.", new Object[0]);
            b3(gVar.h());
        }
        C1389m0 c1389m08 = this.binding;
        if (c1389m08 == null) {
            C3862t.u("binding");
            c1389m08 = null;
        }
        TextView textView = (TextView) c1389m08.f10237h.findViewById(R.id.search_src_text);
        if (textView != null) {
            textView.setTypeface(i1.h.g(x4.g.h(), R.font.roboto_regular));
        }
        Q2();
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 == null) {
            C3862t.u("frameLayout");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4469y0 V2(View root, C4469y0 insets) {
        C3862t.g(root, "root");
        C3862t.g(insets, "insets");
        C3719d c3719dF = insets.f(C4469y0.l.h() | C4469y0.l.b());
        C3862t.f(c3719dF, "getInsets(...)");
        root.setPadding(c3719dF.f43450a, c3719dF.f43451b, c3719dF.f43452c, 0);
        return C4469y0.f49201b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(i iVar, ArrayList data) {
        C3862t.g(data, "data");
        iVar.b3(data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(i iVar, boolean z10) {
        C1389m0 c1389m0 = iVar.binding;
        C1389m0 c1389m02 = null;
        if (c1389m0 == null) {
            C3862t.u("binding");
            c1389m0 = null;
        }
        c1389m0.f10239j.setRefreshing(z10);
        if (z10) {
            C1389m0 c1389m03 = iVar.binding;
            if (c1389m03 == null) {
                C3862t.u("binding");
            } else {
                c1389m02 = c1389m03;
            }
            ConstraintLayout errorHolder = c1389m02.f10232c;
            C3862t.f(errorHolder, "errorHolder");
            Q4.l.g(errorHolder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y2(i iVar, String error) {
        C3862t.g(error, "error");
        iVar.d3(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z2(String tag) {
        C1389m0 c1389m0 = this.binding;
        l lVar = null;
        if (c1389m0 == null) {
            C3862t.u("binding");
            c1389m0 = null;
        }
        c1389m0.f10235f.getRecycledViewPool().c();
        l lVar2 = this.recipeBrowseAdapter;
        if (lVar2 == null) {
            C3862t.u("recipeBrowseAdapter");
            lVar2 = null;
        }
        lVar2.X();
        l lVar3 = this.recipeBrowseAdapter;
        if (lVar3 == null) {
            C3862t.u("recipeBrowseAdapter");
        } else {
            lVar = lVar3;
        }
        lVar.Q(tag, this.searchQuery);
    }

    private final void b3(ArrayList<Recipe> data) {
        C1389m0 c1389m0 = this.binding;
        l lVar = null;
        if (c1389m0 == null) {
            C3862t.u("binding");
            c1389m0 = null;
        }
        c1389m0.f10239j.setRefreshing(false);
        C1389m0 c1389m02 = this.binding;
        if (c1389m02 == null) {
            C3862t.u("binding");
            c1389m02 = null;
        }
        ConstraintLayout errorHolder = c1389m02.f10232c;
        C3862t.f(errorHolder, "errorHolder");
        Q4.l.g(errorHolder);
        C1389m0 c1389m03 = this.binding;
        if (c1389m03 == null) {
            C3862t.u("binding");
            c1389m03 = null;
        }
        RecyclerView list = c1389m03.f10235f;
        C3862t.f(list, "list");
        Q4.l.j(list);
        C1389m0 c1389m04 = this.binding;
        if (c1389m04 == null) {
            C3862t.u("binding");
            c1389m04 = null;
        }
        TabLayout tabLayout = c1389m04.f10240k;
        C3862t.f(tabLayout, "tabLayout");
        Q4.l.j(tabLayout);
        C1389m0 c1389m05 = this.binding;
        if (c1389m05 == null) {
            C3862t.u("binding");
            c1389m05 = null;
        }
        c1389m05.f10240k.H();
        Iterator<RecipeFilter> it = x5.g.f52863a.d().iterator();
        C3862t.f(it, "iterator(...)");
        while (it.hasNext()) {
            RecipeFilter next = it.next();
            C3862t.f(next, "next(...)");
            RecipeFilter recipeFilter = next;
            C1389m0 c1389m06 = this.binding;
            if (c1389m06 == null) {
                C3862t.u("binding");
                c1389m06 = null;
            }
            TabLayout.f fVarE = c1389m06.f10240k.E();
            C3862t.f(fVarE, "newTab(...)");
            fVarE.t(recipeFilter.getLocalizedName());
            fVarE.s(recipeFilter.getTag());
            C1389m0 c1389m07 = this.binding;
            if (c1389m07 == null) {
                C3862t.u("binding");
                c1389m07 = null;
            }
            c1389m07.f10240k.i(fVarE);
        }
        l lVar2 = this.recipeBrowseAdapter;
        if (lVar2 == null) {
            C3862t.u("recipeBrowseAdapter");
            lVar2 = null;
        }
        C3862t.e(data, "null cannot be cast to non-null type java.util.ArrayList<com.apptionlabs.domain.models.recipe.Recipe>");
        lVar2.c0(data);
        String str = this.searchQuery;
        if (str != null && str.length() != 0) {
            C1389m0 c1389m08 = this.binding;
            if (c1389m08 == null) {
                C3862t.u("binding");
                c1389m08 = null;
            }
            c1389m08.f10237h.d0(this.searchQuery, true);
            C1389m0 c1389m09 = this.binding;
            if (c1389m09 == null) {
                C3862t.u("binding");
                c1389m09 = null;
            }
            c1389m09.f10237h.setIconified(false);
            C1389m0 c1389m010 = this.binding;
            if (c1389m010 == null) {
                C3862t.u("binding");
                c1389m010 = null;
            }
            LinearLayoutCompat toolbarTitleHolder = c1389m010.f10242m;
            C3862t.f(toolbarTitleHolder, "toolbarTitleHolder");
            Q4.l.g(toolbarTitleHolder);
        }
        C1389m0 c1389m011 = this.binding;
        if (c1389m011 == null) {
            C3862t.u("binding");
            c1389m011 = null;
        }
        CharSequence query = c1389m011.f10237h.getQuery();
        C3862t.f(query, "getQuery(...)");
        if (query.length() > 0) {
            l lVar3 = this.recipeBrowseAdapter;
            if (lVar3 == null) {
                C3862t.u("recipeBrowseAdapter");
                lVar3 = null;
            }
            lVar3.getFilter().filter(this.searchQuery);
        }
        U4.b.t("Selected Tab: " + this.selectedTabPosition, new Object[0]);
        if (this.selectedTabPosition == -1) {
            this.selectedTabPosition = 0;
        }
        C1389m0 c1389m012 = this.binding;
        if (c1389m012 == null) {
            C3862t.u("binding");
            c1389m012 = null;
        }
        TabLayout tabLayout2 = c1389m012.f10240k;
        C1389m0 c1389m013 = this.binding;
        if (c1389m013 == null) {
            C3862t.u("binding");
            c1389m013 = null;
        }
        tabLayout2.M(c1389m013.f10240k.B(this.selectedTabPosition));
        if (this.selectedTabPosition > 0) {
            C1389m0 c1389m014 = this.binding;
            if (c1389m014 == null) {
                C3862t.u("binding");
                c1389m014 = null;
            }
            TabLayout.f fVarB = c1389m014.f10240k.B(this.selectedTabPosition);
            Z2(String.valueOf(fVarB != null ? fVarB.i() : null));
        }
        l lVar4 = this.recipeBrowseAdapter;
        if (lVar4 == null) {
            C3862t.u("recipeBrowseAdapter");
        } else {
            lVar = lVar4;
        }
        if (lVar.h() == 0) {
            d3(A0(R.string.recipe_loading_error));
        } else if (this.appLinkRecipeSlug != null) {
            c3();
        }
    }

    private final void c3() {
        int iQ;
        if (this.appLinkRecipeSlug != null && (iQ = P2().q(this.appLinkRecipeSlug)) != -1) {
            f3(iQ);
        }
        this.appLinkRecipeSlug = null;
    }

    private final void d3(String error) {
        C1389m0 c1389m0 = this.binding;
        C1389m0 c1389m02 = null;
        if (c1389m0 == null) {
            C3862t.u("binding");
            c1389m0 = null;
        }
        c1389m0.f10239j.setRefreshing(false);
        C1389m0 c1389m03 = this.binding;
        if (c1389m03 == null) {
            C3862t.u("binding");
            c1389m03 = null;
        }
        c1389m03.f10233d.setText(error);
        C1389m0 c1389m04 = this.binding;
        if (c1389m04 == null) {
            C3862t.u("binding");
            c1389m04 = null;
        }
        ConstraintLayout errorHolder = c1389m04.f10232c;
        C3862t.f(errorHolder, "errorHolder");
        Q4.l.j(errorHolder);
        C1389m0 c1389m05 = this.binding;
        if (c1389m05 == null) {
            C3862t.u("binding");
            c1389m05 = null;
        }
        RecyclerView list = c1389m05.f10235f;
        C3862t.f(list, "list");
        Q4.l.g(list);
        C1389m0 c1389m06 = this.binding;
        if (c1389m06 == null) {
            C3862t.u("binding");
            c1389m06 = null;
        }
        AppCompatTextView searchErrorLabel = c1389m06.f10236g;
        C3862t.f(searchErrorLabel, "searchErrorLabel");
        Q4.l.g(searchErrorLabel);
        C1389m0 c1389m07 = this.binding;
        if (c1389m07 == null) {
            C3862t.u("binding");
            c1389m07 = null;
        }
        TabLayout tabLayout = c1389m07.f10240k;
        C3862t.f(tabLayout, "tabLayout");
        Q4.l.g(tabLayout);
        C1389m0 c1389m08 = this.binding;
        if (c1389m08 == null) {
            C3862t.u("binding");
        } else {
            c1389m02 = c1389m08;
        }
        c1389m02.f10243n.setOnClickListener(new View.OnClickListener() { // from class: z5.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.e3(this.f53719B, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(i iVar, View view) {
        iVar.P2().l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f3(int recipeId) {
        Intent intent = new Intent(c2(), (Class<?>) RecipeSummaryActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_RECIPE_ID, recipeId);
        o oVarT = T();
        if (oVarT != null) {
            oVarT.startActivity(intent);
        }
    }

    public final void a3(String appLinkSlug) {
        this.appLinkRecipeSlug = appLinkSlug;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(e2());
        this.frameLayout = frameLayout;
        this.binding = C1389m0.c(inflater, frameLayout, false);
        androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) T();
        if (cVar != null) {
            C1389m0 c1389m0 = this.binding;
            if (c1389m0 == null) {
                C3862t.u("binding");
                c1389m0 = null;
            }
            cVar.R0(c1389m0.f10241l);
        }
        C1389m0 c1389m02 = this.binding;
        if (c1389m02 == null) {
            C3862t.u("binding");
            c1389m02 = null;
        }
        ConstraintLayout constraintLayoutB = c1389m02.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        U2(constraintLayoutB);
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 != null) {
            return frameLayout2;
        }
        C3862t.u("frameLayout");
        return null;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C3862t.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        FrameLayout frameLayout = this.frameLayout;
        C1389m0 c1389m0 = null;
        if (frameLayout == null) {
            C3862t.u("frameLayout");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        C1389m0 c1389m02 = this.binding;
        if (c1389m02 == null) {
            C3862t.u("binding");
            c1389m02 = null;
        }
        c1389m02.f10240k.J(this.onTabSelectedListener);
        Object systemService = c2().getSystemService("layout_inflater");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.binding = C1389m0.c((LayoutInflater) systemService, null, false);
        androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) T();
        if (cVar != null) {
            C1389m0 c1389m03 = this.binding;
            if (c1389m03 == null) {
                C3862t.u("binding");
                c1389m03 = null;
            }
            cVar.R0(c1389m03.f10241l);
        }
        C1389m0 c1389m04 = this.binding;
        if (c1389m04 == null) {
            C3862t.u("binding");
        } else {
            c1389m0 = c1389m04;
        }
        ConstraintLayout constraintLayoutB = c1389m0.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        U2(constraintLayoutB);
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        super.q1();
        l lVar = this.recipeBrowseAdapter;
        if (lVar == null) {
            C3862t.u("recipeBrowseAdapter");
            lVar = null;
        }
        lVar.X();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        l lVar = this.recipeBrowseAdapter;
        C1389m0 c1389m0 = null;
        if (lVar == null) {
            C3862t.u("recipeBrowseAdapter");
            lVar = null;
        }
        lVar.n();
        C1841i.d(C2115w.a(this), null, null, new g(null), 3, null);
        C1389m0 c1389m02 = this.binding;
        if (c1389m02 == null) {
            C3862t.u("binding");
            c1389m02 = null;
        }
        if (!c1389m02.f10237h.L()) {
            C1389m0 c1389m03 = this.binding;
            if (c1389m03 == null) {
                C3862t.u("binding");
            } else {
                c1389m0 = c1389m03;
            }
            LinearLayoutCompat toolbarTitleHolder = c1389m0.f10242m;
            C3862t.f(toolbarTitleHolder, "toolbarTitleHolder");
            Q4.l.g(toolbarTitleHolder);
        }
        if (x5.g.f52863a.h().isEmpty()) {
            return;
        }
        c3();
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle savedInstanceState) {
        C3862t.g(view, "view");
        super.z1(view, savedInstanceState);
        E<? super ArrayList<Recipe>> e10 = new E() { // from class: z5.a
            @Override // android.view.E
            public final void b(Object obj) {
                i.W2(this.f53713a, (ArrayList) obj);
            }
        };
        E<? super Boolean> e11 = new E() { // from class: z5.b
            @Override // android.view.E
            public final void b(Object obj) {
                i.X2(this.f53714a, ((Boolean) obj).booleanValue());
            }
        };
        E<? super String> e12 = new E() { // from class: z5.c
            @Override // android.view.E
            public final void b(Object obj) {
                i.Y2(this.f53715a, (String) obj);
            }
        };
        P2().p().h(F0(), e10);
        P2().n().h(F0(), e12);
        P2().o().h(F0(), e11);
    }

    /* compiled from: RecipeBrowseFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"z5/i$h", "Lcom/google/android/material/tabs/TabLayout$d;", "Lcom/google/android/material/tabs/TabLayout$f;", "tab", "Loa/F;", "b", "(Lcom/google/android/material/tabs/TabLayout$f;)V", "c", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h implements TabLayout.d {
        h() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.f tab) {
            C3862t.g(tab, "tab");
            i iVar = i.this;
            C1389m0 c1389m0 = iVar.binding;
            if (c1389m0 == null) {
                C3862t.u("binding");
                c1389m0 = null;
            }
            iVar.selectedTabPosition = c1389m0.f10240k.getSelectedTabPosition();
            String strValueOf = String.valueOf(tab.i());
            U4.b.t("Selected Tag : " + strValueOf, new Object[0]);
            i.this.Z2(strValueOf);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.f tab) {
            C3862t.g(tab, "tab");
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.f tab) {
        }
    }
}
