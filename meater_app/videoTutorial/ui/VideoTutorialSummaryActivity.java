package com.apptionlabs.meater_app.videoTutorial.ui;

import android.os.Bundle;
import android.view.ComponentActivity;
import android.view.View;
import android.view.s0;
import android.view.t0;
import android.view.v0;
import android.view.w0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b6.j0;
import com.apptionlabs.meater_app.activities.OrientationActivity;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.videoTutorial.ui.VideoTutorialSummaryActivity;
import com.apptionlabs.meater_app.videoTutorial.ui.a;
import com.google.android.material.button.MaterialButton;
import g8.BasicTutorial;
import ih.g;
import ih.o;
import ih.u;
import j6.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import rk.C0443c;
import rk.C0448g;
import rk.t0;
import vh.p;
import wh.d0;
import wh.i0;
import wh.m;

/* compiled from: VideoTutorialSummaryActivity.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b*\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0014R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/apptionlabs/meater_app/videoTutorial/ui/VideoTutorialSummaryActivity;", "Lcom/apptionlabs/meater_app/activities/OrientationActivity;", "Lj6/v;", "Lih/u;", "W0", "Z0", "U0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "position", "A", "a", "onResume", "Lcom/apptionlabs/meater_app/videoTutorial/ui/a;", "S", "Lcom/apptionlabs/meater_app/videoTutorial/ui/a;", "bottomSheet", "Landroidx/recyclerview/widget/LinearLayoutManager;", "T", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Ljava/util/ArrayList;", "Lg8/a;", "U", "Ljava/util/ArrayList;", "videoTutorialList", "Lh8/g;", "V", "Lh8/g;", "adapter", "Lh8/c;", "W", "Lih/g;", "V0", "()Lh8/c;", "viewModel", "Lb6/j0;", "X", "Lb6/j0;", "binding", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class VideoTutorialSummaryActivity extends OrientationActivity implements v {

    /* renamed from: S, reason: from kotlin metadata */
    private com.apptionlabs.meater_app.videoTutorial.ui.a bottomSheet;

    /* renamed from: T, reason: from kotlin metadata */
    private LinearLayoutManager layoutManager;

    /* renamed from: U, reason: from kotlin metadata */
    private ArrayList<BasicTutorial> videoTutorialList;

    /* renamed from: V, reason: from kotlin metadata */
    private C0448g adapter;

    /* renamed from: W, reason: from kotlin metadata */
    private final g viewModel = new s0(d0.b(C0443c.class), new d(this), new c(this, null, null, bm.a.a(this)));

    /* renamed from: X, reason: from kotlin metadata */
    private j0 binding;

    /* compiled from: VideoTutorialSummaryActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/apptionlabs/meater_app/videoTutorial/ui/VideoTutorialSummaryActivity$a", "Lcom/apptionlabs/meater_app/videoTutorial/ui/a$a;", "Lih/u;", "b", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a implements a.InterfaceC0149a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10168b;

        a(int i10) {
            this.f10168b = i10;
        }

        @Override // com.apptionlabs.meater_app.videoTutorial.ui.a.InterfaceC0149a
        public void a() {
            com.apptionlabs.meater_app.videoTutorial.ui.a aVar = VideoTutorialSummaryActivity.this.bottomSheet;
            com.google.android.material.bottomsheet.b bVar = null;
            if (aVar == null) {
                m.t("bottomSheet");
                aVar = null;
            }
            aVar.A2();
            com.google.android.material.bottomsheet.b bVar2 = VideoTutorialSummaryActivity.this.bottomSheet;
            if (bVar2 == null) {
                m.t("bottomSheet");
            } else {
                bVar = bVar2;
            }
            bVar.N2(VideoTutorialSummaryActivity.this.m0(), "bottomSheetDialog");
        }

        @Override // com.apptionlabs.meater_app.videoTutorial.ui.a.InterfaceC0149a
        public void b() {
            C0448g c0448g = VideoTutorialSummaryActivity.this.adapter;
            ArrayList<BasicTutorial> arrayList = null;
            if (c0448g == null) {
                m.t("adapter");
                c0448g = null;
            }
            c0448g.N(this.f10168b, true);
            C0443c V0 = VideoTutorialSummaryActivity.this.V0();
            ArrayList<BasicTutorial> arrayList2 = VideoTutorialSummaryActivity.this.videoTutorialList;
            if (arrayList2 == null) {
                m.t("videoTutorialList");
            } else {
                arrayList = arrayList2;
            }
            V0.y(arrayList);
            VideoTutorialSummaryActivity.this.V0().z();
            VideoTutorialSummaryActivity.this.U0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoTutorialSummaryActivity.kt */
    @f(c = "com.apptionlabs.meater_app.videoTutorial.ui.VideoTutorialSummaryActivity$scrollToLastVideoPendingToWatchIfNeeded$1", f = "VideoTutorialSummaryActivity.kt", l = {72}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lrk/j0;", "Lih/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b extends l implements p<rk.j0, nh.d<? super u>, Object> {

        /* renamed from: q, reason: collision with root package name */
        int f10169q;

        b(nh.d<? super b> dVar) {
            super(2, dVar);
        }

        public final nh.d<u> create(Object obj, nh.d<?> dVar) {
            return new b(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = oh.b.c();
            int i10 = this.f10169q;
            j0 j0Var = null;
            if (i10 != 0) {
                if (i10 == 1) {
                    o.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                o.b(obj);
                ArrayList arrayList = VideoTutorialSummaryActivity.this.videoTutorialList;
                if (arrayList == null) {
                    m.t("videoTutorialList");
                    arrayList = null;
                }
                if (arrayList.size() > 3) {
                    ArrayList arrayList2 = VideoTutorialSummaryActivity.this.videoTutorialList;
                    if (arrayList2 == null) {
                        m.t("videoTutorialList");
                        arrayList2 = null;
                    }
                    if (((BasicTutorial) arrayList2.get(0)).getIsWatched()) {
                        ArrayList arrayList3 = VideoTutorialSummaryActivity.this.videoTutorialList;
                        if (arrayList3 == null) {
                            m.t("videoTutorialList");
                            arrayList3 = null;
                        }
                        if (((BasicTutorial) arrayList3.get(1)).getIsWatched()) {
                            ArrayList arrayList4 = VideoTutorialSummaryActivity.this.videoTutorialList;
                            if (arrayList4 == null) {
                                m.t("videoTutorialList");
                                arrayList4 = null;
                            }
                            if (((BasicTutorial) arrayList4.get(2)).getIsWatched()) {
                                ArrayList arrayList5 = VideoTutorialSummaryActivity.this.videoTutorialList;
                                if (arrayList5 == null) {
                                    m.t("videoTutorialList");
                                    arrayList5 = null;
                                }
                                if (!((BasicTutorial) arrayList5.get(3)).getIsWatched()) {
                                    LinearLayoutManager linearLayoutManager = VideoTutorialSummaryActivity.this.layoutManager;
                                    if (linearLayoutManager == null) {
                                        m.t("layoutManager");
                                        linearLayoutManager = null;
                                    }
                                    if (linearLayoutManager.h2() < 3) {
                                        this.f10169q = 1;
                                        if (t0.a(700L, this) == c10) {
                                            return c10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return u.a;
            }
            j0 j0Var2 = VideoTutorialSummaryActivity.this.binding;
            if (j0Var2 == null) {
                m.t("binding");
            } else {
                j0Var = j0Var2;
            }
            j0Var.Y.B1(4);
            return u.a;
        }

        public final Object invoke(rk.j0 j0Var, nh.d<? super u> dVar) {
            return create(j0Var, dVar).invokeSuspend(u.a);
        }
    }

    /* compiled from: ActivityVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c extends wh.o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ w0 f10171q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f10172r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f10173s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f10174t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w0 w0Var, tm.a aVar, vh.a aVar2, vm.a aVar3) {
            super(0);
            this.f10171q = w0Var;
            this.f10172r = aVar;
            this.f10173s = aVar2;
            this.f10174t = aVar3;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a(this.f10171q, d0.b(C0443c.class), this.f10172r, this.f10173s, (vh.a) null, this.f10174t);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d extends wh.o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f10175q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f10175q = componentActivity;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = this.f10175q.y();
            m.e(y10, "viewModelStore");
            return y10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0() {
        ArrayList<BasicTutorial> arrayList = this.videoTutorialList;
        j0 j0Var = null;
        if (arrayList == null) {
            m.t("videoTutorialList");
            arrayList = null;
        }
        List j10 = jh.o.j();
        for (Object obj : arrayList) {
            if (((BasicTutorial) obj).getIsWatched()) {
                if (j10.isEmpty()) {
                    j10 = new ArrayList();
                }
                m.d(j10, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                i0.c(j10).add(obj);
            }
        }
        int size = j10.size();
        ArrayList<BasicTutorial> arrayList2 = this.videoTutorialList;
        if (arrayList2 == null) {
            m.t("videoTutorialList");
            arrayList2 = null;
        }
        if (size == arrayList2.size()) {
            j0 j0Var2 = this.binding;
            if (j0Var2 == null) {
                m.t("binding");
            } else {
                j0Var = j0Var2;
            }
            MaterialButton materialButton = j0Var.R;
            m.e(materialButton, "button");
            g6.d.b(materialButton);
        }
        Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0443c V0() {
        return (C0443c) this.viewModel.getValue();
    }

    private final void W0() {
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra(MEATERIntent.EXTRA_WATCH_VIDEOS);
        C0443c V0 = V0();
        m.d(stringArrayListExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        this.videoTutorialList = V0.t(stringArrayListExtra);
        j0 j0Var = this.binding;
        j0 j0Var2 = null;
        if (j0Var == null) {
            m.t("binding");
            j0Var = null;
        }
        AppCompatTextView appCompatTextView = j0Var.X;
        j0 j0Var3 = this.binding;
        if (j0Var3 == null) {
            m.t("binding");
            j0Var3 = null;
        }
        appCompatTextView.setPaintFlags(j0Var3.X.getPaintFlags() | 8);
        this.layoutManager = new LinearLayoutManager(this);
        j0 j0Var4 = this.binding;
        if (j0Var4 == null) {
            m.t("binding");
            j0Var4 = null;
        }
        RecyclerView recyclerView = j0Var4.Y;
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager == null) {
            m.t("layoutManager");
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<BasicTutorial> arrayList = this.videoTutorialList;
        if (arrayList == null) {
            m.t("videoTutorialList");
            arrayList = null;
        }
        this.adapter = new C0448g(arrayList);
        j0 j0Var5 = this.binding;
        if (j0Var5 == null) {
            m.t("binding");
            j0Var5 = null;
        }
        RecyclerView recyclerView2 = j0Var5.Y;
        C0448g c0448g = this.adapter;
        if (c0448g == null) {
            m.t("adapter");
            c0448g = null;
        }
        recyclerView2.setAdapter(c0448g);
        C0448g c0448g2 = this.adapter;
        if (c0448g2 == null) {
            m.t("adapter");
            c0448g2 = null;
        }
        c0448g2.M(this);
        j0 j0Var6 = this.binding;
        if (j0Var6 == null) {
            m.t("binding");
            j0Var6 = null;
        }
        j0Var6.R.setOnClickListener(new View.OnClickListener() { // from class: h8.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoTutorialSummaryActivity.X0(VideoTutorialSummaryActivity.this, view);
            }
        });
        j0 j0Var7 = this.binding;
        if (j0Var7 == null) {
            m.t("binding");
        } else {
            j0Var2 = j0Var7;
        }
        j0Var2.X.setOnClickListener(new View.OnClickListener() { // from class: h8.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoTutorialSummaryActivity.Y0(VideoTutorialSummaryActivity.this, view);
            }
        });
        Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(VideoTutorialSummaryActivity videoTutorialSummaryActivity, View view) {
        m.f(videoTutorialSummaryActivity, "this$0");
        videoTutorialSummaryActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y0(VideoTutorialSummaryActivity videoTutorialSummaryActivity, View view) {
        m.f(videoTutorialSummaryActivity, "this$0");
        videoTutorialSummaryActivity.finish();
    }

    private final void Z0() {
        android.view.u.a(this).f(new b(null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.apptionlabs.meater_app.videoTutorial.ui.a, androidx.fragment.app.m] */
    @Override // j6.v
    public void A(int i10) {
        ArrayList<BasicTutorial> arrayList = this.videoTutorialList;
        if (arrayList == null) {
            m.t("videoTutorialList");
            arrayList = null;
        }
        BasicTutorial basicTutorial = arrayList.get(i10);
        m.e(basicTutorial, "get(...)");
        ?? aVar = new com.apptionlabs.meater_app.videoTutorial.ui.a(basicTutorial, V0().getCacheManager(), new a(i10));
        this.bottomSheet = aVar;
        aVar.N2(m0(), "bottomSheetDialog");
    }

    @Override // j6.v
    public void a(int i10) {
        throw new ih.l("An operation is not implemented: Not yet implemented");
    }

    @Override // com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding j10 = androidx.databinding.g.j(this, 2131558456);
        m.e(j10, "setContentView(...)");
        this.binding = (j0) j10;
        W0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        super.onResume();
        U0();
    }
}
