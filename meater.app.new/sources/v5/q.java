package v5;

import A5.d;
import android.view.AbstractC2106m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: StepsFragmentPagerAdapter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\u00122\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000bj\b\u0012\u0004\u0012\u00020\u0006`\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR&\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000bj\b\u0012\u0004\u0012\u00020\u0006`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lv5/q;", "LC3/a;", "Landroidx/fragment/app/v;", "fragmentManager", "Landroidx/lifecycle/m;", "viewLifecycleOwner", "", "deviceSelectionStepNumber", "setupCookStepNumber", "<init>", "(Landroidx/fragment/app/v;Landroidx/lifecycle/m;II)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "stepList", "", "probeID", "", "cookConfirmed", "Loa/F;", "c0", "(Ljava/util/ArrayList;JZ)V", "h", "()I", "position", "Landroidx/fragment/app/Fragment;", "K", "(I)Landroidx/fragment/app/Fragment;", "N", "I", "O", "P", "Ljava/util/ArrayList;", "Q", "J", "R", "Z", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class q extends C3.a {

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final int deviceSelectionStepNumber;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int setupCookStepNumber;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Integer> stepList;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private long probeID;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private boolean cookConfirmed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v fragmentManager, AbstractC2106m viewLifecycleOwner, int i10, int i11) {
        super(fragmentManager, viewLifecycleOwner);
        C3862t.g(fragmentManager, "fragmentManager");
        C3862t.g(viewLifecycleOwner, "viewLifecycleOwner");
        this.deviceSelectionStepNumber = i10;
        this.setupCookStepNumber = i11;
        this.stepList = new ArrayList<>();
        this.probeID = -1L;
    }

    @Override // C3.a
    public Fragment K(int position) {
        U4.b.t("(StepsFragmentPagerAdapter) Original Position = " + position + ", changed to = " + this.stepList.get(position), new Object[0]);
        d.Companion companion = A5.d.INSTANCE;
        Integer num = this.stepList.get(position);
        C3862t.f(num, "get(...)");
        return d.Companion.b(companion, num.intValue(), false, 2, null);
    }

    public final void c0(ArrayList<Integer> stepList, long probeID, boolean cookConfirmed) {
        C3862t.g(stepList, "stepList");
        this.stepList.clear();
        this.stepList.addAll(stepList);
        this.probeID = probeID;
        this.cookConfirmed = cookConfirmed;
        n();
        U4.b.t("(StepsFragmentPagerAdapter) Updated Step List " + this.stepList, new Object[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.stepList.size();
    }
}
