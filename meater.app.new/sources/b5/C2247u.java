package b5;

import L4.C1381i0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.b0;
import android.view.c0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.apptionlabs.meater_app.data.JuicyVideo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: NewsVideosFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lb5/u;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Loa/F;", "x2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "z1", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "title", "Ljava/util/ArrayList;", "Lcom/apptionlabs/meater_app/data/JuicyVideo;", "videos", "y2", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "LL4/i0;", "G0", "LL4/i0;", "binding", "Lb5/v;", "H0", "Loa/i;", "getViewModel", "()Lb5/v;", "viewModel", "I0", "Ljava/lang/String;", "J0", "Ljava/util/ArrayList;", "videoData", "K0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: b5.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2247u extends Fragment {

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: L0, reason: collision with root package name */
    public static final int f30576L0 = 8;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private C1381i0 binding;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel = C4165j.b(EnumC4168m.f46628D, new c(this, null, new b(this), null, null));

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private String title = "";

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    private ArrayList<JuicyVideo> videoData;

    /* compiled from: NewsVideosFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb5/u$a;", "", "<init>", "()V", "Lb5/u;", "a", "()Lb5/u;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.u$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C2247u a() {
            C2247u c2247u = new C2247u();
            c2247u.k2(new Bundle());
            return c2247u;
        }

        private Companion() {
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.u$b */
    public static final class b implements Ba.a<Fragment> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f30581B;

        public b(Fragment fragment) {
            this.f30581B = fragment;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f30581B;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.u$c */
    public static final class c implements Ba.a<C2248v> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f30582B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f30583C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f30584D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a f30585E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f30586F;

        public c(Fragment fragment, dd.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
            this.f30582B = fragment;
            this.f30583C = aVar;
            this.f30584D = aVar2;
            this.f30585E = aVar3;
            this.f30586F = aVar4;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, b5.v] */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2248v invoke() {
            Q1.a aVarM;
            Fragment fragment = this.f30582B;
            dd.a aVar = this.f30583C;
            Ba.a aVar2 = this.f30584D;
            Ba.a aVar3 = this.f30585E;
            Ba.a aVar4 = this.f30586F;
            b0 b0VarV = ((c0) aVar2.invoke()).v();
            if (aVar3 == null || (aVarM = (Q1.a) aVar3.invoke()) == null) {
                aVarM = fragment.m();
                C3862t.f(aVarM, "<get-defaultViewModelCreationExtras>(...)");
            }
            return ld.b.b(P.b(C2248v.class), b0VarV, (4 & 4) != 0 ? null : null, aVarM, (4 & 16) != 0 ? null : aVar, Nc.a.a(fragment), (4 & 64) != 0 ? null : aVar4);
        }
    }

    private final void x2() {
        C1381i0 c1381i0 = this.binding;
        C1381i0 c1381i02 = null;
        if (c1381i0 == null) {
            C3862t.u("binding");
            c1381i0 = null;
        }
        c1381i0.f10141c.setText(this.title);
        ArrayList<JuicyVideo> arrayList = this.videoData;
        Y4.d dVar = arrayList != null ? new Y4.d(arrayList) : null;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(e2(), 0, false);
        C1381i0 c1381i03 = this.binding;
        if (c1381i03 == null) {
            C3862t.u("binding");
            c1381i03 = null;
        }
        c1381i03.f10140b.setLayoutManager(linearLayoutManager);
        C1381i0 c1381i04 = this.binding;
        if (c1381i04 == null) {
            C3862t.u("binding");
        } else {
            c1381i02 = c1381i04;
        }
        c1381i02.f10140b.setAdapter(dVar);
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        C1381i0 c1381i0C = C1381i0.c(inflater, container, false);
        this.binding = c1381i0C;
        if (c1381i0C == null) {
            C3862t.u("binding");
            c1381i0C = null;
        }
        ConstraintLayout constraintLayoutB = c1381i0C.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    public final void y2(String title, ArrayList<JuicyVideo> videos) {
        C3862t.g(title, "title");
        C3862t.g(videos, "videos");
        this.title = title;
        this.videoData = videos;
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle savedInstanceState) {
        C3862t.g(view, "view");
        super.z1(view, savedInstanceState);
        x2();
    }
}
