package w4;

import R4.C1684x0;
import android.view.AbstractC2106m;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.model.Probe;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: DetailFragmentPagerAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lw4/h;", "LC3/a;", "Landroidx/fragment/app/v;", "fragmentManager", "Landroidx/lifecycle/m;", "viewLifecycleOwner", "<init>", "(Landroidx/fragment/app/v;Landroidx/lifecycle/m;)V", "Ljava/util/ArrayList;", "Lcom/apptionlabs/meater_app/model/Probe;", "Lkotlin/collections/ArrayList;", "newProbeList", "Loa/F;", "c0", "(Ljava/util/ArrayList;)V", "", "h", "()I", "position", "Landroidx/fragment/app/Fragment;", "K", "(I)Landroidx/fragment/app/Fragment;", "N", "Ljava/util/ArrayList;", "probeList", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: w4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4988h extends C3.a {

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Probe> probeList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4988h(androidx.fragment.app.v fragmentManager, AbstractC2106m viewLifecycleOwner) {
        super(fragmentManager, viewLifecycleOwner);
        C3862t.g(fragmentManager, "fragmentManager");
        C3862t.g(viewLifecycleOwner, "viewLifecycleOwner");
        this.probeList = new ArrayList<>();
    }

    @Override // C3.a
    public Fragment K(int position) {
        return C1684x0.INSTANCE.a(this.probeList.get(position).getDeviceID());
    }

    public final void c0(ArrayList<Probe> newProbeList) {
        C3862t.g(newProbeList, "newProbeList");
        this.probeList.addAll(newProbeList);
        U4.b.t("setData for DetailFragmentAdaspter", new Object[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.probeList.size();
    }
}
