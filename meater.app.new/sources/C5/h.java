package C5;

import R4.W;
import android.os.Bundle;
import android.view.View;
import android.view.b0;
import android.view.c0;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.RoundedImageWithLabel;
import d.ActivityC3006j;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import o4.StepContent;
import o4.StepContentMeta;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: MonitorDevicesStepView.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"LC5/h;", "LR4/W;", "<init>", "()V", "Loa/F;", "U2", "", "V2", "()Z", "W2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "z1", "(Landroid/view/View;Landroid/os/Bundle;)V", "v1", "LA5/m;", "R0", "Loa/i;", "T2", "()LA5/m;", "viewModel", "S0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h extends W {

    /* renamed from: S0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: T0, reason: collision with root package name */
    public static final int f2187T0 = 8;

    /* renamed from: U0, reason: collision with root package name */
    private static StepContent f2188U0;

    /* renamed from: V0, reason: collision with root package name */
    private static int f2189V0;

    /* renamed from: R0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel = C4165j.b(EnumC4168m.f46628D, new c(this, null, new b(this), null, null));

    /* compiled from: MonitorDevicesStepView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"LC5/h$a;", "", "<init>", "()V", "", "stepNumber", "", "probeSerialNumber", "Lo4/y;", "content", "LC5/h;", "a", "(IJLo4/y;)LC5/h;", "stepContent", "Lo4/y;", "I", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: C5.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final h a(int stepNumber, long probeSerialNumber, StepContent content) {
            C3862t.g(content, "content");
            h hVar = new h();
            h.f2189V0 = stepNumber;
            h.f2188U0 = content;
            Bundle bundle = new Bundle();
            bundle.putLong("SN", probeSerialNumber);
            hVar.k2(bundle);
            return hVar;
        }

        private Companion() {
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Ba.a<androidx.fragment.app.o> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f2191B;

        public b(Fragment fragment) {
            this.f2191B = fragment;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.o invoke() {
            return this.f2191B.c2();
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Ba.a<A5.m> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f2192B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f2193C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f2194D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a f2195E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f2196F;

        public c(Fragment fragment, dd.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
            this.f2192B = fragment;
            this.f2193C = aVar;
            this.f2194D = aVar2;
            this.f2195E = aVar3;
            this.f2196F = aVar4;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [A5.m, androidx.lifecycle.Y] */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A5.m invoke() {
            Q1.a aVarM;
            Q1.a aVar;
            Q1.a aVar2;
            Fragment fragment = this.f2192B;
            dd.a aVar3 = this.f2193C;
            Ba.a aVar4 = this.f2194D;
            Ba.a aVar5 = this.f2195E;
            Ba.a aVar6 = this.f2196F;
            c0 c0Var = (c0) aVar4.invoke();
            b0 b0VarV = c0Var.v();
            if (aVar5 == null || (aVar2 = (Q1.a) aVar5.invoke()) == null) {
                ActivityC3006j activityC3006j = c0Var instanceof ActivityC3006j ? (ActivityC3006j) c0Var : null;
                if (activityC3006j != null) {
                    aVarM = activityC3006j.m();
                } else {
                    aVarM = fragment.m();
                    C3862t.f(aVarM, "<get-defaultViewModelCreationExtras>(...)");
                }
                aVar = aVarM;
            } else {
                aVar = aVar2;
            }
            return ld.b.b(P.b(A5.m.class), b0VarV, (4 & 4) != 0 ? null : null, aVar, (4 & 16) != 0 ? null : aVar3, Nc.a.a(fragment), (4 & 64) != 0 ? null : aVar6);
        }
    }

    private final A5.m T2() {
        return (A5.m) this.viewModel.getValue();
    }

    private final void U2() {
        StepContentMeta meta;
        Boolean autoProgress;
        RoundedImageWithLabel roundedImageWithLabel;
        if (W2() && (roundedImageWithLabel = E2().f10036d) != null) {
            Q4.l.g(roundedImageWithLabel);
        }
        StepContent stepContent = f2188U0;
        if (stepContent == null || (meta = stepContent.getMeta()) == null || (autoProgress = meta.getAutoProgress()) == null || !autoProgress.booleanValue()) {
            return;
        }
        Integer toTime = meta.getToTime();
        if (toTime != null) {
            T2().w0(f2189V0, toTime.intValue());
        }
        Integer toInternalTemp = meta.getToInternalTemp();
        if (toInternalTemp != null) {
            T2().x0(f2189V0, toInternalTemp.intValue());
        }
    }

    private final boolean V2() {
        return u0().getBoolean(R.bool.is_tablet);
    }

    private final boolean W2() {
        return V2() && u0().getConfiguration().orientation == 2;
    }

    @Override // R4.W, androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        RelativeLayout relativeLayout = E2().f10056x;
        if (relativeLayout != null) {
            Q4.l.j(relativeLayout);
        }
        E2().f10055w.e();
        E2().f10055w.setOnClickListener(null);
        if (W2()) {
            RoundedImageWithLabel roundedImageWithLabel = E2().f10043k;
            if (roundedImageWithLabel != null) {
                roundedImageWithLabel.setOnClickListener(this);
            }
            RoundedImageWithLabel roundedImageWithLabel2 = E2().f10036d;
            if (roundedImageWithLabel2 != null) {
                Q4.l.g(roundedImageWithLabel2);
            }
        } else {
            RoundedImageWithLabel roundedImageWithLabel3 = E2().f10043k;
            if (roundedImageWithLabel3 != null) {
                roundedImageWithLabel3.setOnClickListener(null);
            }
        }
        E2().f10052t.setOnClickListener(this);
        E2().f10054v.setOnClickListener(this);
        RelativeLayout relativeLayout2 = E2().f10045m;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(this);
        }
        E2().f10055w.getDialView().getListener();
        if (T2().getCookFinished()) {
            E2().f10055w.getDialView().setClickAbleDialView(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle savedInstanceState) {
        C3862t.g(view, "view");
        super.z1(view, savedInstanceState);
        U2();
    }
}
