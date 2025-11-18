package f5;

import L4.Q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ExistingDeviceAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\b2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0017j\b\u0012\u0004\u0012\u00020\u0006`\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lf5/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lf5/c$a;", "<init>", "()V", "", "Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "productList", "Loa/F;", "K", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "J", "(Landroid/view/ViewGroup;I)Lf5/c$a;", "viewHolder", "position", "I", "(Lf5/c$a;I)V", "h", "()I", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "E", "Ljava/util/ArrayList;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c extends RecyclerView.h<a> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private ArrayList<MEATERDeviceType> productList = new ArrayList<>();

    /* compiled from: ExistingDeviceAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lf5/c$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "itemView", "LL4/Q;", "adapterBinding", "<init>", "(Lf5/c;Landroid/view/View;LL4/Q;)V", "Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "data", "Loa/F;", "a", "(Lcom/apptionlabs/meater_app/model/MEATERDeviceType;)V", "B", "LL4/Q;", "getAdapterBinding", "()LL4/Q;", "setAdapterBinding", "(LL4/Q;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private Q adapterBinding;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ c f41293C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, View itemView, Q adapterBinding) {
            super(itemView);
            C3862t.g(itemView, "itemView");
            C3862t.g(adapterBinding, "adapterBinding");
            this.f41293C = cVar;
            this.adapterBinding = adapterBinding;
        }

        public final void a(MEATERDeviceType data) {
            C3862t.g(data, "data");
            this.adapterBinding.f9573b.setImageResource(data.getStraightProductThumbnail());
        }
    }

    public c() {
        F(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void w(a viewHolder, int position) {
        C3862t.g(viewHolder, "viewHolder");
        MEATERDeviceType mEATERDeviceType = this.productList.get(position);
        C3862t.f(mEATERDeviceType, "get(...)");
        viewHolder.a(mEATERDeviceType);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public a y(ViewGroup parent, int viewType) {
        C3862t.g(parent, "parent");
        Q qC = Q.c(LayoutInflater.from(parent.getContext()), parent, false);
        C3862t.f(qC, "inflate(...)");
        AppCompatImageView appCompatImageViewB = qC.b();
        C3862t.f(appCompatImageViewB, "getRoot(...)");
        return new a(this, appCompatImageViewB, qC);
    }

    public final void K(List<? extends MEATERDeviceType> productList) {
        C3862t.g(productList, "productList");
        this.productList.clear();
        this.productList.addAll(productList);
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.productList.size();
    }
}
