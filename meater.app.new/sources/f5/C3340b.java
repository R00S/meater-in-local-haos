package f5;

import L4.C0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import f5.C3340b;
import g5.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ChooseProductAdapter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002$%B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\b2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060 j\b\u0012\u0004\u0012\u00020\u0006`!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lf5/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lf5/b$a;", "<init>", "()V", "", "Lg5/b;", "productList", "Loa/F;", "M", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "K", "(Landroid/view/ViewGroup;I)Lf5/b$a;", "viewHolder", "position", "J", "(Lf5/b$a;I)V", "h", "()I", "Lf5/b$b;", "clickListener", "L", "(Lf5/b$b;)V", "", "i", "(I)J", "E", "Lf5/b$b;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "F", "Ljava/util/ArrayList;", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3340b extends RecyclerView.h<a> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private InterfaceC0518b clickListener;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Product> productList = new ArrayList<>();

    /* compiled from: ChooseProductAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lf5/b$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "itemView", "LL4/C0;", "adapterBinding", "<init>", "(Lf5/b;Landroid/view/View;LL4/C0;)V", "Lg5/b;", "data", "Loa/F;", "b", "(Lg5/b;)V", "B", "LL4/C0;", "getAdapterBinding", "()LL4/C0;", "setAdapterBinding", "(LL4/C0;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: f5.b$a */
    public final class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private C0 adapterBinding;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C3340b f41290C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3340b c3340b, View itemView, C0 adapterBinding) {
            super(itemView);
            C3862t.g(itemView, "itemView");
            C3862t.g(adapterBinding, "adapterBinding");
            this.f41290C = c3340b;
            this.adapterBinding = adapterBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(C3340b c3340b, Product product, View view) {
            InterfaceC0518b interfaceC0518b = c3340b.clickListener;
            if (interfaceC0518b != null) {
                interfaceC0518b.a(product.getProductId());
            }
        }

        public final void b(final Product data) {
            C3862t.g(data, "data");
            this.adapterBinding.f9311f.setText(data.getProductName());
            this.adapterBinding.f9310e.setImageResource(data.getProductThumbnail());
            MaterialCardView materialCardView = this.adapterBinding.f9307b;
            final C3340b c3340b = this.f41290C;
            materialCardView.setOnClickListener(new View.OnClickListener() { // from class: f5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3340b.a.c(c3340b, data, view);
                }
            });
        }
    }

    /* compiled from: ChooseProductAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf5/b$b;", "", "", "productId", "Loa/F;", "a", "(I)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: f5.b$b, reason: collision with other inner class name */
    public interface InterfaceC0518b {
        void a(int productId);
    }

    public C3340b() {
        F(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void w(a viewHolder, int position) {
        C3862t.g(viewHolder, "viewHolder");
        Product product = this.productList.get(position);
        C3862t.f(product, "get(...)");
        viewHolder.b(product);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public a y(ViewGroup parent, int viewType) {
        C3862t.g(parent, "parent");
        C0 c0C = C0.c(LayoutInflater.from(parent.getContext()), parent, false);
        C3862t.f(c0C, "inflate(...)");
        ConstraintLayout constraintLayoutB = c0C.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        return new a(this, constraintLayoutB, c0C);
    }

    public final void L(InterfaceC0518b clickListener) {
        this.clickListener = clickListener;
    }

    public final void M(List<Product> productList) {
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
