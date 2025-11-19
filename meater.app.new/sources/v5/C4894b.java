package v5;

import L4.B0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: IngredientsTipAdapter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R&\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001aj\b\u0012\u0004\u0012\u00020\u0006`\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lv5/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$G;", "<init>", "()V", "", "", "list", "Loa/F;", "I", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "y", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$G;", "viewHolder", "position", "w", "(Landroidx/recyclerview/widget/RecyclerView$G;I)V", "h", "()I", "", "i", "(I)J", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "E", "Ljava/util/ArrayList;", "ingredientList", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: v5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4894b extends RecyclerView.h<RecyclerView.G> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private ArrayList<String> ingredientList = new ArrayList<>();

    /* compiled from: IngredientsTipAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lv5/b$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "itemView", "LL4/B0;", "binding", "<init>", "(Lv5/b;Landroid/view/View;LL4/B0;)V", "", "data", "Loa/F;", "a", "(Ljava/lang/String;)V", "B", "LL4/B0;", "getBinding", "()LL4/B0;", "setBinding", "(LL4/B0;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: v5.b$a */
    public final class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private B0 binding;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4894b f51417C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4894b c4894b, View itemView, B0 binding) {
            super(itemView);
            C3862t.g(itemView, "itemView");
            C3862t.g(binding, "binding");
            this.f51417C = c4894b;
            this.binding = binding;
        }

        public final void a(String data) {
            C3862t.g(data, "data");
            AppCompatTextView titleText = this.binding.f9298d;
            C3862t.f(titleText, "titleText");
            Q4.l.c(titleText, data);
        }
    }

    public C4894b() {
        F(true);
    }

    public final void I(List<String> list) {
        C3862t.g(list, "list");
        this.ingredientList.clear();
        this.ingredientList = (ArrayList) list;
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.ingredientList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void w(RecyclerView.G viewHolder, int position) {
        C3862t.g(viewHolder, "viewHolder");
        String str = this.ingredientList.get(position);
        C3862t.f(str, "get(...)");
        ((a) viewHolder).a(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.G y(ViewGroup parent, int viewType) {
        C3862t.g(parent, "parent");
        B0 b0B = B0.b(LayoutInflater.from(parent.getContext()), parent, false);
        C3862t.f(b0B, "inflate(...)");
        ConstraintLayout rootView = b0B.f9297c;
        C3862t.f(rootView, "rootView");
        return new a(this, rootView, b0B);
    }
}
