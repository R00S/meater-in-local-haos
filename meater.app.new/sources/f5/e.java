package f5;

import L4.F0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import f5.e;
import g5.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ProductSelectionAdapter.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002)*B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\n2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010$R&\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\b0%j\b\u0012\u0004\u0012\u00020\b`&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lf5/e;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lf5/e$a;", "", "screenRatio", "<init>", "(F)V", "", "Lg5/b;", "productList", "Loa/F;", "N", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "L", "(Landroid/view/ViewGroup;I)Lf5/e$a;", "viewHolder", "position", "K", "(Lf5/e$a;I)V", "h", "()I", "Lf5/e$b;", "clickListener", "M", "(Lf5/e$b;)V", "", "i", "(I)J", "E", "F", "J", "()F", "Lf5/e$b;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "G", "Ljava/util/ArrayList;", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e extends RecyclerView.h<a> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final float screenRatio;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private b clickListener;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Product> productList = new ArrayList<>();

    /* compiled from: ProductSelectionAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lf5/e$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "itemView", "LL4/F0;", "adapterBinding", "<init>", "(Lf5/e;Landroid/view/View;LL4/F0;)V", "Lg5/b;", "data", "Loa/F;", "b", "(Lg5/b;)V", "B", "LL4/F0;", "getAdapterBinding", "()LL4/F0;", "setAdapterBinding", "(LL4/F0;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private F0 adapterBinding;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ e f41300C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, View itemView, F0 adapterBinding) {
            super(itemView);
            C3862t.g(itemView, "itemView");
            C3862t.g(adapterBinding, "adapterBinding");
            this.f41300C = eVar;
            this.adapterBinding = adapterBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(e eVar, Product product, View view) {
            b bVar = eVar.clickListener;
            if (bVar != null) {
                bVar.a(product.getProductId());
            }
        }

        public final void b(final Product data) {
            C3862t.g(data, "data");
            if (data.getProductThumbnail() == -1) {
                return;
            }
            if (this.f41300C.getScreenRatio() >= 0.6d) {
                ViewGroup.LayoutParams layoutParams = this.adapterBinding.f9373e.getLayoutParams();
                C3862t.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ConstraintLayout.b) layoutParams).f23954I = "1:1.3";
            }
            this.adapterBinding.f9374f.setText(data.getProductName());
            this.adapterBinding.f9373e.setImageResource(data.getProductThumbnail());
            MaterialCardView materialCardView = this.adapterBinding.f9370b;
            final e eVar = this.f41300C;
            materialCardView.setOnClickListener(new View.OnClickListener() { // from class: f5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.a.c(eVar, data, view);
                }
            });
        }
    }

    /* compiled from: ProductSelectionAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf5/e$b;", "", "", "productId", "Loa/F;", "a", "(I)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a(int productId);
    }

    public e(float f10) {
        this.screenRatio = f10;
        F(true);
    }

    /* renamed from: J, reason: from getter */
    public final float getScreenRatio() {
        return this.screenRatio;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void w(a viewHolder, int position) {
        C3862t.g(viewHolder, "viewHolder");
        Product product = this.productList.get(position);
        C3862t.f(product, "get(...)");
        viewHolder.b(product);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public a y(ViewGroup parent, int viewType) {
        C3862t.g(parent, "parent");
        F0 f0C = F0.c(LayoutInflater.from(parent.getContext()), parent, false);
        C3862t.f(f0C, "inflate(...)");
        ConstraintLayout constraintLayoutB = f0C.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        return new a(this, constraintLayoutB, f0C);
    }

    public final void M(b clickListener) {
        this.clickListener = clickListener;
    }

    public final void N(List<Product> productList) {
        C3862t.g(productList, "productList");
        this.productList.clear();
        this.productList.addAll(productList);
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.productList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int position) {
        return this.productList.get(position).getProductId();
    }
}
