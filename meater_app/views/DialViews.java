package com.apptionlabs.meater_app.views;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.AbstractC0397k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import b6.c6;
import b6.e6;
import b6.g2;
import b6.g6;
import b6.i6;
import b6.k6;
import b6.p2;
import b6.s7;
import b6.u7;
import b6.w6;
import b6.y7;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.videoTutorial.ui.VideoTutorialSummaryActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import rk.C0454f;
import rk.C0456h;
import rk.C0458j;

/* compiled from: DialViews.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002^\u000eB\u0019\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J0\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0014J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u001b\u001a\u00020\u0006H\u0014J\b\u0010\u001c\u001a\u00020\u0006H\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0002J\b\u0010\r\u001a\u00020\bH\u0002J \u0010(\u001a\u00020\u00062\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%0$j\b\u0012\u0004\u0012\u00020%`&H\u0002J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0004H\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0004H\u0002J\u0018\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0002J\u0010\u0010/\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002J\u0010\u00100\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u00103\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0002R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010H\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u0014\u0010Y\u001a\u00020V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006_"}, d2 = {"Lcom/apptionlabs/meater_app/views/DialViews;", "Lcom/apptionlabs/meater_app/views/i0;", "Landroid/view/View$OnClickListener;", "Landroidx/lifecycle/t;", "Landroid/view/View;", "v", "Lih/u;", "onClick", "", "changed", "", "l", "t", "r", "b", "onLayout", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "setProbe", "y", "x", "isSmallViews", "setIsSmallViews", "clickAbleDialView", "setClickAbleDialView", "m", "setupCookingStateTimeMode", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/content/Context;", "context", "Landroid/app/Activity;", "u", "f", "Landroid/os/Bundle;", "bundle", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "strings", "s", "Lcom/apptionlabs/meater_app/views/DialViews$b;", "viewType", "view", "w", "layoutID", "p", "o", "n", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "q", "Lb6/p2;", "Lb6/p2;", "binding", "Lj8/h;", "Lj8/h;", "dialViewModel", "Lj8/f;", "z", "Lj8/f;", "dialListViewModel", "A", "Lcom/apptionlabs/meater_app/views/DialViews$b;", "currentVisibleLayout", "Lcom/apptionlabs/meater_app/views/DialViews$a;", "B", "Lcom/apptionlabs/meater_app/views/DialViews$a;", "getListener", "()Lcom/apptionlabs/meater_app/views/DialViews$a;", "setListener", "(Lcom/apptionlabs/meater_app/views/DialViews$a;)V", "listener", "Lj8/j;", "C", "Lih/g;", "getViewModel", "()Lj8/j;", "viewModel", "Landroidx/lifecycle/v;", "D", "Landroidx/lifecycle/v;", "lifecycleRegistry", "E", "Z", "F", "Landroidx/lifecycle/k;", "getLifecycle", "()Landroidx/lifecycle/k;", "lifecycle", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class DialViews extends i0 implements View.OnClickListener, android.view.t {

    /* renamed from: A, reason: from kotlin metadata */
    private b currentVisibleLayout;

    /* renamed from: B, reason: from kotlin metadata */
    private a listener;

    /* renamed from: C, reason: from kotlin metadata */
    private final ih.g viewModel;

    /* renamed from: D, reason: from kotlin metadata */
    private final android.view.v lifecycleRegistry;

    /* renamed from: E, reason: from kotlin metadata */
    private boolean isSmallViews;

    /* renamed from: F, reason: from kotlin metadata */
    private boolean clickAbleDialView;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private p2 binding;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private C0456h dialViewModel;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private C0454f dialListViewModel;

    /* compiled from: DialViews.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/apptionlabs/meater_app/views/DialViews$a;", "", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "Lih/u;", "E", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface a {
        void E(MEATERDevice mEATERDevice);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialViews.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/apptionlabs/meater_app/views/DialViews$b;", "", "<init>", "(Ljava/lang/String;I)V", "q", "r", "s", "t", "u", "v", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b {

        /* renamed from: q, reason: collision with root package name */
        public static final b f10293q = new b("NO_COOK_SET_UP_VIEW", 0);

        /* renamed from: r, reason: collision with root package name */
        public static final b f10294r = new b("COOKING_VIEW", 1);

        /* renamed from: s, reason: collision with root package name */
        public static final b f10295s = new b("READY_TO_REST_VIEW", 2);

        /* renamed from: t, reason: collision with root package name */
        public static final b f10296t = new b("RESTING_VIEW", 3);

        /* renamed from: u, reason: collision with root package name */
        public static final b f10297u = new b("READY_VIEW", 4);

        /* renamed from: v, reason: collision with root package name */
        public static final b f10298v = new b("NONE", 5);

        /* renamed from: w, reason: collision with root package name */
        private static final /* synthetic */ b[] f10299w;

        /* renamed from: x, reason: collision with root package name */
        private static final /* synthetic */ ph.a f10300x;

        static {
            b[] g10 = g();
            f10299w = g10;
            f10300x = ph.b.a(g10);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] g() {
            return new b[]{f10293q, f10294r, f10295s, f10296t, f10297u, f10298v};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f10299w.clone();
        }
    }

    /* compiled from: DialViews.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10301a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f10302b;

        static {
            int[] iArr = new int[DeviceCookState.values().length];
            try {
                iArr[DeviceCookState.COOK_STATE_NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_COOK_CONFIGURED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_READY_FOR_RESTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_RESTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_FINISHED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_SLIGHTLY_OVERDONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_OVERCOOK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f10301a = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.f10293q.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[b.f10294r.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[b.f10295s.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[b.f10296t.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[b.f10297u.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            f10302b = iArr2;
        }
    }

    /* compiled from: DialViews.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "strings", "Lih/u;", "b", "(Ljava/util/ArrayList;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    static final class d extends wh.o implements vh.l<ArrayList<String>, ih.u> {
        d() {
            super(1);
        }

        public final void b(ArrayList<String> arrayList) {
            wh.m.f(arrayList, "strings");
            if (arrayList.size() < DialViews.this.getViewModel().t()) {
                DialViews dialViews = DialViews.this;
                dialViews.s(dialViews.getViewModel().q());
            } else if (DialViews.this.getViewModel().t() < arrayList.size()) {
                DialViews.this.getViewModel().x(arrayList);
            }
            DialViews.this.getViewModel().v().m(DialViews.this);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ArrayList) obj);
            return ih.u.a;
        }
    }

    /* compiled from: DialViews.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lih/u;", "b", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    static final class e extends wh.o implements vh.l<String, ih.u> {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Bundle f10305r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Bundle bundle) {
            super(1);
            this.f10305r = bundle;
        }

        public final void b(String str) {
            DialViews.this.t(this.f10305r);
            DialViews.this.getViewModel().u().m(DialViews.this);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return ih.u.a;
        }
    }

    /* compiled from: DialViews.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    static final class f implements android.view.a0, wh.h {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ vh.l f10306a;

        f(vh.l lVar) {
            wh.m.f(lVar, "function");
            this.f10306a = lVar;
        }

        public final ih.c<?> a() {
            return this.f10306a;
        }

        @Override // android.view.a0
        public final /* synthetic */ void d(Object obj) {
            this.f10306a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof android.view.a0) || !(obj instanceof wh.h)) {
                return false;
            }
            return wh.m.a(a(), ((wh.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialViews(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        wh.m.f(context, "context");
        wh.m.f(attributeSet, "attrs");
        this.currentVisibleLayout = b.f10298v;
        this.viewModel = ih.h.b(new x(this));
        this.lifecycleRegistry = new android.view.v(this);
        this.clickAbleDialView = true;
        f(context);
    }

    private final void f(Context context) {
        ViewDataBinding h10 = androidx.databinding.g.h(LayoutInflater.from(context), 2131558506, this, true);
        wh.m.e(h10, "inflate(...)");
        this.binding = (p2) h10;
        this.dialViewModel = new C0456h(context);
        this.dialListViewModel = new C0454f(context);
        this.f10538r.V.setMask(f8.l0.j(context, 2131231211));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(getMeasuredWidth(), getMeasuredWidth());
        layoutParams.addRule(13, -1);
        p2 p2Var = this.binding;
        p2 p2Var2 = null;
        if (p2Var == null) {
            wh.m.t("binding");
            p2Var = null;
        }
        p2Var.Q.setLayoutParams(layoutParams);
        p2 p2Var3 = this.binding;
        if (p2Var3 == null) {
            wh.m.t("binding");
        } else {
            p2Var2 = p2Var3;
        }
        p2Var2.Q.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0458j getViewModel() {
        return (C0458j) this.viewModel.getValue();
    }

    private final boolean n(Probe probe) {
        MEATERDevice parentDevice = probe.getParentDevice();
        if (parentDevice != null && q(parentDevice)) {
            a aVar = this.listener;
            if (aVar != null) {
                aVar.E(parentDevice);
                return true;
            }
            return true;
        }
        return false;
    }

    private final void o(b bVar) {
        p2 p2Var = this.binding;
        p2 p2Var2 = null;
        if (p2Var == null) {
            wh.m.t("binding");
            p2Var = null;
        }
        View findViewWithTag = p2Var.Q.findViewWithTag(bVar);
        if (findViewWithTag != null) {
            p2 p2Var3 = this.binding;
            if (p2Var3 == null) {
                wh.m.t("binding");
            } else {
                p2Var2 = p2Var3;
            }
            p2Var2.Q.removeView(findViewWithTag);
        }
    }

    private final void p(int i10, b bVar) {
        p2 p2Var = this.binding;
        p2 p2Var2 = null;
        if (p2Var == null) {
            wh.m.t("binding");
            p2Var = null;
        }
        if (p2Var.Q.findViewWithTag(bVar) != null) {
            return;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        p2 p2Var3 = this.binding;
        if (p2Var3 == null) {
            wh.m.t("binding");
            p2Var3 = null;
        }
        View inflate = from.inflate(i10, (ViewGroup) p2Var3.Q, false);
        wh.m.c(inflate);
        w(bVar, inflate);
        v(bVar, inflate);
        inflate.setTag(bVar);
        p2 p2Var4 = this.binding;
        if (p2Var4 == null) {
            wh.m.t("binding");
        } else {
            p2Var2 = p2Var4;
        }
        p2Var2.Q.addView(inflate);
        o(this.currentVisibleLayout);
        this.currentVisibleLayout = bVar;
    }

    private final boolean q(MEATERDevice device) {
        if ((device.mustFirmwareUpdate() || device.needsFirmwareUpdate()) && !s6.d.f17849e) {
            return true;
        }
        return false;
    }

    private final boolean r() {
        return getViewModel().l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(ArrayList<String> arrayList) {
        Intent intent = new Intent(getContext(), (Class<?>) VideoTutorialSummaryActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_WATCH_VIDEOS, arrayList);
        getContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(Bundle bundle) {
        Intent intent = new Intent(getContext(), (Class<?>) MeaterTargetSetupActivity.class);
        intent.putExtra("bundle", bundle);
        getContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity u(Context context) {
        while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    private final void v(b bVar, View view) {
        if (this.isSmallViews) {
            return;
        }
        int i10 = c.f10302b[bVar.ordinal()];
        C0456h c0456h = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            ViewDataBinding a10 = androidx.databinding.g.a(view);
                            wh.m.d(a10, "null cannot be cast to non-null type com.apptionlabs.meater_app.databinding.ReadyStateViewsBinding");
                            s7 s7Var = (s7) a10;
                            C0456h c0456h2 = this.dialViewModel;
                            if (c0456h2 == null) {
                                wh.m.t("dialViewModel");
                                c0456h2 = null;
                            }
                            s7Var.T(c0456h2);
                        }
                    } else {
                        ViewDataBinding a11 = androidx.databinding.g.a(view);
                        wh.m.d(a11, "null cannot be cast to non-null type com.apptionlabs.meater_app.databinding.RestingStateViewsBinding");
                        y7 y7Var = (y7) a11;
                        C0456h c0456h3 = this.dialViewModel;
                        if (c0456h3 == null) {
                            wh.m.t("dialViewModel");
                            c0456h3 = null;
                        }
                        y7Var.T(c0456h3);
                    }
                } else {
                    ViewDataBinding a12 = androidx.databinding.g.a(view);
                    wh.m.d(a12, "null cannot be cast to non-null type com.apptionlabs.meater_app.databinding.ReadyToRestViewsBinding");
                    u7 u7Var = (u7) a12;
                    C0456h c0456h4 = this.dialViewModel;
                    if (c0456h4 == null) {
                        wh.m.t("dialViewModel");
                        c0456h4 = null;
                    }
                    u7Var.T(c0456h4);
                }
            } else {
                ViewDataBinding a13 = androidx.databinding.g.a(view);
                wh.m.d(a13, "null cannot be cast to non-null type com.apptionlabs.meater_app.databinding.CookingStateViewsBinding");
                g2 g2Var = (g2) a13;
                C0456h c0456h5 = this.dialViewModel;
                if (c0456h5 == null) {
                    wh.m.t("dialViewModel");
                    c0456h5 = null;
                }
                g2Var.T(c0456h5);
            }
        } else {
            ViewDataBinding a14 = androidx.databinding.g.a(view);
            wh.m.d(a14, "null cannot be cast to non-null type com.apptionlabs.meater_app.databinding.NoSetupStateViewBinding");
            w6 w6Var = (w6) a14;
            C0456h c0456h6 = this.dialViewModel;
            if (c0456h6 == null) {
                wh.m.t("dialViewModel");
                c0456h6 = null;
            }
            w6Var.T(c0456h6);
        }
        View findViewWithTag = view.findViewWithTag("pNumber");
        wh.m.d(findViewWithTag, "null cannot be cast to non-null type com.apptionlabs.meater_app.views.ProbeNumberTextView");
        ProbeNumberTextView probeNumberTextView = (ProbeNumberTextView) findViewWithTag;
        C0456h c0456h7 = this.dialViewModel;
        if (c0456h7 == null) {
            wh.m.t("dialViewModel");
        } else {
            c0456h = c0456h7;
        }
        probeNumberTextView.setModel(c0456h);
    }

    private final void w(b bVar, View view) {
        if (!this.isSmallViews) {
            return;
        }
        int i10 = c.f10302b[bVar.ordinal()];
        C0454f c0454f = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            ViewDataBinding a10 = androidx.databinding.g.a(view);
                            wh.m.d(a10, "null cannot be cast to non-null type com.apptionlabs.meater_app.databinding.ListReadyStateViewBinding");
                            g6 g6Var = (g6) a10;
                            C0454f c0454f2 = this.dialListViewModel;
                            if (c0454f2 == null) {
                                wh.m.t("dialListViewModel");
                                c0454f2 = null;
                            }
                            g6Var.T(c0454f2);
                        }
                    } else {
                        ViewDataBinding a11 = androidx.databinding.g.a(view);
                        wh.m.d(a11, "null cannot be cast to non-null type com.apptionlabs.meater_app.databinding.ListRestingStateViewBinding");
                        k6 k6Var = (k6) a11;
                        C0454f c0454f3 = this.dialListViewModel;
                        if (c0454f3 == null) {
                            wh.m.t("dialListViewModel");
                            c0454f3 = null;
                        }
                        k6Var.T(c0454f3);
                    }
                } else {
                    ViewDataBinding a12 = androidx.databinding.g.a(view);
                    wh.m.d(a12, "null cannot be cast to non-null type com.apptionlabs.meater_app.databinding.ListReadyToRestViewBinding");
                    i6 i6Var = (i6) a12;
                    C0454f c0454f4 = this.dialListViewModel;
                    if (c0454f4 == null) {
                        wh.m.t("dialListViewModel");
                        c0454f4 = null;
                    }
                    i6Var.T(c0454f4);
                }
            } else {
                ViewDataBinding a13 = androidx.databinding.g.a(view);
                wh.m.d(a13, "null cannot be cast to non-null type com.apptionlabs.meater_app.databinding.ListCookingStateViewBinding");
                c6 c6Var = (c6) a13;
                C0454f c0454f5 = this.dialListViewModel;
                if (c0454f5 == null) {
                    wh.m.t("dialListViewModel");
                    c0454f5 = null;
                }
                c6Var.T(c0454f5);
            }
        } else {
            ViewDataBinding a14 = androidx.databinding.g.a(view);
            wh.m.d(a14, "null cannot be cast to non-null type com.apptionlabs.meater_app.databinding.ListNoSetupViewBinding");
            e6 e6Var = (e6) a14;
            C0454f c0454f6 = this.dialListViewModel;
            if (c0454f6 == null) {
                wh.m.t("dialListViewModel");
                c0454f6 = null;
            }
            e6Var.T(c0454f6);
        }
        View findViewWithTag = view.findViewWithTag("pNumber");
        wh.m.d(findViewWithTag, "null cannot be cast to non-null type com.apptionlabs.meater_app.views.ProbeNumberTextView");
        ProbeNumberTextView probeNumberTextView = (ProbeNumberTextView) findViewWithTag;
        C0454f c0454f7 = this.dialListViewModel;
        if (c0454f7 == null) {
            wh.m.t("dialListViewModel");
        } else {
            c0454f = c0454f7;
        }
        probeNumberTextView.setModel(c0454f);
    }

    @Override // android.view.t
    public AbstractC0397k getLifecycle() {
        return this.lifecycleRegistry;
    }

    public final a getListener() {
        return this.listener;
    }

    public final void m() {
        if (this.f10540t != null) {
            C0456h c0456h = this.dialViewModel;
            if (c0456h == null) {
                wh.m.t("dialViewModel");
                c0456h = null;
            }
            c0456h.e0(this.f10540t);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.lifecycleRegistry.o(AbstractC0397k.b.RESUMED);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        wh.m.f(view, "v");
        Probe probe = getProbe();
        if (probe != null && f8.l0.L() && probe.getInternalTemperature() < probe.maximumInternalTemperature() && probe.getShouldShowAsConnected()) {
            if (probe.getCookState().getValue() >= DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.getValue()) {
                probe.cancelCook(true);
                return;
            }
            if (this.currentVisibleLayout == b.f10295s) {
                probe.setCookState(DeviceCookState.COOK_STATE_RESTING);
                probe.getEventLog().addManuallyMovedToRestingEvent();
                s6.d.j(probe);
                probe.markCookSetupModified();
                return;
            }
            if (probe.appearsToHaveCookInProgress()) {
                if (this.currentVisibleLayout != b.f10294r) {
                    return;
                }
                C0456h c0456h = this.dialViewModel;
                if (c0456h == null) {
                    wh.m.t("dialViewModel");
                    c0456h = null;
                }
                c0456h.X(probe);
                return;
            }
            Probe probe2 = getProbe();
            wh.m.e(probe2, "getProbe(...)");
            if (!n(probe2)) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MEATERIntent.EXTRA_PROBE, probe);
                bundle.putLong(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
                MeatCut meatCut = probe.getmCut();
                if (meatCut != null) {
                    Integer num = meatCut.id;
                    wh.m.e(num, "id");
                    bundle.putInt(MEATERIntent.EXTRA_CUT_ID, num.intValue());
                }
                if (r()) {
                    getViewModel().j();
                    getViewModel().v().g(this, new f(new d()));
                    getViewModel().u().g(this, new f(new e(bundle)));
                    return;
                }
                t(bundle);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lifecycleRegistry.o(AbstractC0397k.b.DESTROYED);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10) {
            return;
        }
        Object parent = getParent();
        wh.m.d(parent, "null cannot be cast to non-null type android.view.View");
        int measuredWidth = ((View) parent).getMeasuredWidth();
        wh.m.d(getParent(), "null cannot be cast to non-null type android.view.View");
        int d10 = (int) (ci.g.d(measuredWidth, ((View) r3).getMeasuredHeight()) / 1.5f);
        p2 p2Var = this.binding;
        if (p2Var == null) {
            wh.m.t("binding");
            p2Var = null;
        }
        FrameLayout frameLayout = p2Var.Q;
        frameLayout.getLayoutParams().width = d10;
        frameLayout.getLayoutParams().height = d10;
        frameLayout.requestLayout();
    }

    public final void setClickAbleDialView(boolean z10) {
        this.clickAbleDialView = z10;
        if (!z10) {
            p2 p2Var = this.binding;
            if (p2Var == null) {
                wh.m.t("binding");
                p2Var = null;
            }
            p2Var.Q.setClickable(false);
            p2 p2Var2 = this.binding;
            if (p2Var2 == null) {
                wh.m.t("binding");
                p2Var2 = null;
            }
            p2Var2.Q.setFocusable(false);
            p2 p2Var3 = this.binding;
            if (p2Var3 == null) {
                wh.m.t("binding");
                p2Var3 = null;
            }
            p2Var3.Q.setOnClickListener(null);
        }
    }

    public final void setIsSmallViews(boolean z10) {
        this.isSmallViews = z10;
        C0456h c0456h = null;
        C0454f c0454f = null;
        if (z10) {
            p2 p2Var = this.binding;
            if (p2Var == null) {
                wh.m.t("binding");
                p2Var = null;
            }
            C0454f c0454f2 = this.dialListViewModel;
            if (c0454f2 == null) {
                wh.m.t("dialListViewModel");
            } else {
                c0454f = c0454f2;
            }
            p2Var.V(c0454f);
            return;
        }
        p2 p2Var2 = this.binding;
        if (p2Var2 == null) {
            wh.m.t("binding");
            p2Var2 = null;
        }
        C0456h c0456h2 = this.dialViewModel;
        if (c0456h2 == null) {
            wh.m.t("dialViewModel");
        } else {
            c0456h = c0456h2;
        }
        p2Var2.W(c0456h);
    }

    public final void setListener(a aVar) {
        this.listener = aVar;
    }

    @Override // com.apptionlabs.meater_app.views.i0
    public void setProbe(Probe probe) {
        wh.m.f(probe, "probe");
        super.setProbe(probe);
        p2 p2Var = null;
        if (this.isSmallViews) {
            p2 p2Var2 = this.binding;
            if (p2Var2 == null) {
                wh.m.t("binding");
            } else {
                p2Var = p2Var2;
            }
            C0454f T = p2Var.T();
            if (T != null) {
                T.H(probe);
            }
            x(probe);
            return;
        }
        p2 p2Var3 = this.binding;
        if (p2Var3 == null) {
            wh.m.t("binding");
        } else {
            p2Var = p2Var3;
        }
        C0456h U = p2Var.U();
        if (U != null) {
            U.g0(probe);
        }
        y(probe);
    }

    public final void setupCookingStateTimeMode(Probe probe) {
        wh.m.f(probe, "probe");
        C0456h c0456h = this.dialViewModel;
        if (c0456h == null) {
            wh.m.t("dialViewModel");
            c0456h = null;
        }
        c0456h.a0(probe);
    }

    public final void x(Probe probe) {
        int i10;
        wh.m.f(probe, "probe");
        DeviceCookState cookState = probe.getCookState();
        if (cookState == null) {
            i10 = -1;
        } else {
            i10 = c.f10301a[cookState.ordinal()];
        }
        switch (i10) {
            case 1:
                p(2131558582, b.f10293q);
                return;
            case 2:
            case 3:
                p(2131558580, b.f10294r);
                return;
            case 4:
                p(2131558584, b.f10295s);
                return;
            case 5:
                p(2131558585, b.f10296t);
                return;
            case 6:
            case 7:
            case 8:
            case 9:
                p(2131558583, b.f10297u);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void y(Probe probe) {
        int i10;
        wh.m.f(probe, "probe");
        DeviceCookState cookState = probe.getCookState();
        if (cookState == null) {
            i10 = -1;
        } else {
            i10 = c.f10301a[cookState.ordinal()];
        }
        switch (i10) {
            case 1:
                p(2131558647, b.f10293q);
                return;
            case 2:
            case 3:
                p(2131558486, b.f10294r);
                return;
            case 4:
                p(2131558680, b.f10295s);
                return;
            case 5:
                p(2131558692, b.f10296t);
                return;
            case 6:
            case 7:
            case 8:
            case 9:
                p(2131558679, b.f10297u);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
