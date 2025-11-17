package com.apptionlabs.meater_app.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import b6.a8;
import b6.c8;
import b8.c;
import com.apptionlabs.meater_app.activities.RingToneActivity;
import com.apptionlabs.meater_app.views.CustomLinearLayoutManager;
import com.apptionlabs.meater_app.views.l1;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: RingToneActivity.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 -2\u00020\u0001:\u0004./01B\u0007¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004R.\u0010\u001c\u001a\u000e\u0012\b\u0012\u00060\u0014R\u00020\u0015\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010&\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u00062"}, d2 = {"Lcom/apptionlabs/meater_app/activities/RingToneActivity;", "Lcom/apptionlabs/meater_app/activities/j;", "Lcom/apptionlabs/meater_app/activities/RingToneActivity$c;", "toneType", "Lw7/c;", "f2", "e2", "", "h2", "Landroid/os/Bundle;", "savedInstanceState", "Lih/u;", "onCreate", "Landroid/view/View;", "view", "onHelpButtonClick", "toneName", "defaultTone", "i2", "Ljava/util/ArrayList;", "Lb8/c$b;", "Lb8/c;", "a0", "Ljava/util/ArrayList;", "getSounds", "()Ljava/util/ArrayList;", "setSounds", "(Ljava/util/ArrayList;)V", "sounds", "b0", "Lcom/apptionlabs/meater_app/activities/RingToneActivity$c;", "g2", "()Lcom/apptionlabs/meater_app/activities/RingToneActivity$c;", "setToneType", "(Lcom/apptionlabs/meater_app/activities/RingToneActivity$c;)V", "Lcom/apptionlabs/meater_app/activities/RingToneActivity$b;", "c0", "Lcom/apptionlabs/meater_app/activities/RingToneActivity$b;", "ringToneAdapter", "Lb6/a8;", "d0", "Lb6/a8;", "binding", "<init>", "()V", "e0", "a", "b", "c", "d", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class RingToneActivity extends j {

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private ArrayList<c.b> sounds;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private c toneType = c.f9510t;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private b ringToneAdapter;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private a8 binding;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RingToneActivity.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u001a\u001a\u000e\u0012\b\u0012\u00060\u0012R\u00020\u0013\u0018\u00010\u0011¢\u0006\u0004\b \u0010!J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R.\u0010\u001a\u001a\u000e\u0012\b\u0012\u00060\u0012R\u00020\u0013\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c¨\u0006\""}, d2 = {"Lcom/apptionlabs/meater_app/activities/RingToneActivity$b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/apptionlabs/meater_app/activities/RingToneActivity$d;", "Lcom/apptionlabs/meater_app/activities/RingToneActivity;", "", "index", "Lih/u;", "N", "M", "Landroid/view/ViewGroup;", "parent", "viewType", "L", "viewHolder", "position", "J", "h", "Ljava/util/ArrayList;", "Lb8/c$b;", "Lb8/c;", "t", "Ljava/util/ArrayList;", "getSounds", "()Ljava/util/ArrayList;", "setSounds", "(Ljava/util/ArrayList;)V", "sounds", "u", "I", "selectedIndex", "v", "defaultIndex", "<init>", "(Lcom/apptionlabs/meater_app/activities/RingToneActivity;Ljava/util/ArrayList;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public final class b extends RecyclerView.h<d> {

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private ArrayList<c.b> sounds;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private int selectedIndex = -1;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private int defaultIndex = -1;

        public b(ArrayList<c.b> arrayList) {
            this.sounds = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void K(RingToneActivity ringToneActivity, c.b bVar, d dVar, b bVar2, View view) {
            wh.m.f(ringToneActivity, "this$0");
            wh.m.f(bVar, "$sound");
            wh.m.f(dVar, "$viewHolder");
            wh.m.f(bVar2, "this$1");
            c.b h10 = b8.c.p(ringToneActivity.getApplicationContext()).h(bVar.f8570a);
            wh.m.c(h10);
            h10.g(false);
            b bVar3 = ringToneActivity.ringToneAdapter;
            wh.m.c(bVar3);
            bVar3.N(dVar.getLayoutPosition());
            bVar2.n();
            if (ringToneActivity.getToneType() == c.f9508r) {
                com.apptionlabs.meater_app.app.a.u().t1(bVar.d());
                return;
            }
            if (ringToneActivity.getToneType() == c.f9509s) {
                com.apptionlabs.meater_app.app.a.u().u1(bVar.d());
            } else if (ringToneActivity.getToneType() == c.f9510t) {
                com.apptionlabs.meater_app.app.a.u().D0(bVar.d());
            } else if (ringToneActivity.getToneType() == c.f9511u) {
                com.apptionlabs.meater_app.app.a.u().k1(bVar.d());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public void w(final d dVar, int i10) {
            int i11;
            wh.m.f(dVar, "viewHolder");
            ArrayList<c.b> arrayList = this.sounds;
            wh.m.c(arrayList);
            c.b bVar = arrayList.get(i10);
            wh.m.e(bVar, "get(...)");
            final c.b bVar2 = bVar;
            dVar.getRingToneRowBinding().U.setText(bVar2.b(RingToneActivity.this.getApplicationContext()));
            ImageView imageView = dVar.getRingToneRowBinding().Q;
            int i12 = 8;
            if (this.selectedIndex == i10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            ImageView imageView2 = dVar.getRingToneRowBinding().R;
            int i13 = this.defaultIndex;
            if (i13 == i10 && this.selectedIndex != i13) {
                i12 = 0;
            }
            imageView2.setVisibility(i12);
            RelativeLayout relativeLayout = dVar.getRingToneRowBinding().S;
            final RingToneActivity ringToneActivity = RingToneActivity.this;
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.activities.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RingToneActivity.b.K(RingToneActivity.this, bVar2, dVar, this, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public d y(ViewGroup parent, int viewType) {
            wh.m.f(parent, "parent");
            ViewDataBinding h10 = androidx.databinding.g.h(LayoutInflater.from(parent.getContext()), 2131558694, parent, false);
            wh.m.e(h10, "inflate(...)");
            c8 c8Var = (c8) h10;
            return new d(RingToneActivity.this, c8Var.v(), c8Var);
        }

        public final void M(int i10) {
            this.defaultIndex = i10;
        }

        public final void N(int i10) {
            this.selectedIndex = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            ArrayList<c.b> arrayList = this.sounds;
            wh.m.c(arrayList);
            return arrayList.size();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RingToneActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/apptionlabs/meater_app/activities/RingToneActivity$c;", "", "<init>", "(Ljava/lang/String;I)V", "q", "r", "s", "t", "u", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c {

        /* renamed from: q, reason: collision with root package name */
        public static final c f9507q = new c("NONE", 0);

        /* renamed from: r, reason: collision with root package name */
        public static final c f9508r = new c("READY_FOR_RESTING", 1);

        /* renamed from: s, reason: collision with root package name */
        public static final c f9509s = new c("READY", 2);

        /* renamed from: t, reason: collision with root package name */
        public static final c f9510t = new c("ALERT", 3);

        /* renamed from: u, reason: collision with root package name */
        public static final c f9511u = new c("OVER_COOK", 4);

        /* renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ c[] f9512v;

        /* renamed from: w, reason: collision with root package name */
        private static final /* synthetic */ ph.a f9513w;

        static {
            c[] g10 = g();
            f9512v = g10;
            f9513w = ph.b.a(g10);
        }

        private c(String str, int i10) {
        }

        private static final /* synthetic */ c[] g() {
            return new c[]{f9507q, f9508r, f9509s, f9510t, f9511u};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f9512v.clone();
        }
    }

    /* compiled from: RingToneActivity.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/apptionlabs/meater_app/activities/RingToneActivity$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lb6/c8;", "q", "Lb6/c8;", "a", "()Lb6/c8;", "setRingToneRowBinding", "(Lb6/c8;)V", "ringToneRowBinding", "Landroid/view/View;", "itemView", "<init>", "(Lcom/apptionlabs/meater_app/activities/RingToneActivity;Landroid/view/View;Lb6/c8;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public final class d extends RecyclerView.f0 {

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private c8 ringToneRowBinding;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ RingToneActivity f9515r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(RingToneActivity ringToneActivity, View view, c8 c8Var) {
            super(view);
            wh.m.f(c8Var, "ringToneRowBinding");
            this.f9515r = ringToneActivity;
            wh.m.c(view);
            this.ringToneRowBinding = c8Var;
        }

        /* renamed from: a, reason: from getter */
        public final c8 getRingToneRowBinding() {
            return this.ringToneRowBinding;
        }
    }

    /* compiled from: RingToneActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9516a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f9508r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f9509s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f9510t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.f9511u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9516a = iArr;
        }
    }

    private final w7.c e2(c toneType) {
        int i10;
        if (toneType == null) {
            i10 = -1;
        } else {
            i10 = e.f9516a[toneType.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return null;
                    }
                    return w7.c.F;
                }
                return w7.c.E;
            }
            return w7.c.G;
        }
        return w7.c.H;
    }

    private final w7.c f2(c toneType) {
        int i10;
        if (toneType == null) {
            i10 = -1;
        } else {
            i10 = e.f9516a[toneType.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        w7.c f10 = com.apptionlabs.meater_app.app.a.u().f();
                        wh.m.e(f10, "getAlertToneType(...)");
                        return f10;
                    }
                    w7.c F = com.apptionlabs.meater_app.app.a.u().F();
                    wh.m.e(F, "getOverCookedToneType(...)");
                    return F;
                }
                w7.c f11 = com.apptionlabs.meater_app.app.a.u().f();
                wh.m.e(f11, "getAlertToneType(...)");
                return f11;
            }
            w7.c M = com.apptionlabs.meater_app.app.a.u().M();
            wh.m.e(M, "getReadyToneType(...)");
            return M;
        }
        w7.c L = com.apptionlabs.meater_app.app.a.u().L();
        wh.m.e(L, "getReadyToRestToneType(...)");
        return L;
    }

    private final String h2(c toneType) {
        int i10;
        if (toneType == null) {
            i10 = -1;
        } else {
            i10 = e.f9516a[toneType.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        String string = getString(2132018660);
                        wh.m.e(string, "getString(...)");
                        return string;
                    }
                    String string2 = getString(2132018661);
                    wh.m.e(string2, "getString(...)");
                    return string2;
                }
                String string3 = getString(2132018660);
                wh.m.e(string3, "getString(...)");
                return string3;
            }
            String string4 = getString(2132018659);
            wh.m.e(string4, "getString(...)");
            return string4;
        }
        String string5 = getString(2132018533);
        wh.m.e(string5, "getString(...)");
        return string5;
    }

    /* renamed from: g2, reason: from getter */
    public final c getToneType() {
        return this.toneType;
    }

    public final void i2(w7.c cVar, w7.c cVar2) {
        int i10;
        wh.m.f(cVar, "toneName");
        b bVar = this.ringToneAdapter;
        wh.m.c(bVar);
        bVar.N(cVar.ordinal());
        b bVar2 = this.ringToneAdapter;
        wh.m.c(bVar2);
        if (cVar2 != null) {
            i10 = cVar2.ordinal();
        } else {
            i10 = -1;
        }
        bVar2.M(i10);
        b bVar3 = this.ringToneAdapter;
        wh.m.c(bVar3);
        bVar3.n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding j10 = androidx.databinding.g.j(this, 2131558693);
        wh.m.e(j10, "setContentView(...)");
        this.binding = (a8) j10;
        if (getIntent() != null && getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            wh.m.c(extras);
            c cVar = (c) extras.getSerializable("RT");
            this.toneType = cVar;
            if (cVar == null) {
                this.toneType = c.f9510t;
            }
        }
        setTitle(h2(this.toneType));
        this.sounds = b8.c.p(getApplicationContext()).k();
        a8 a8Var = this.binding;
        a8 a8Var2 = null;
        if (a8Var == null) {
            wh.m.t("binding");
            a8Var = null;
        }
        a8Var.T.setLayoutManager(new CustomLinearLayoutManager(this, 1, false, true));
        this.ringToneAdapter = new b(this.sounds);
        a8 a8Var3 = this.binding;
        if (a8Var3 == null) {
            wh.m.t("binding");
            a8Var3 = null;
        }
        a8Var3.T.setAdapter(this.ringToneAdapter);
        a8 a8Var4 = this.binding;
        if (a8Var4 == null) {
            wh.m.t("binding");
        } else {
            a8Var2 = a8Var4;
        }
        a8Var2.T.j(new l1());
        i2(f2(this.toneType), e2(this.toneType));
    }

    public final void onHelpButtonClick(View view) {
        wh.m.f(view, "view");
        startActivity(new Intent(this, (Class<?>) MEATERHelpActivity.class));
    }
}
