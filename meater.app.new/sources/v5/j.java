package v5;

import L4.i1;
import L4.j1;
import android.annotation.SuppressLint;
import android.view.B;
import android.view.D;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import v5.j;
import w5.InterfaceC4997a;
import x5.EnumC5059d;
import x5.PreparationItem;

/* compiled from: PreparationItemAdapter.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002:;B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0004J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0004J\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0004R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R&\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\f0)j\b\u0012\u0004\u0012\u00020\f`*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00103\u001a\u0010\u0012\f\u0012\n 0*\u0004\u0018\u00010/0/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020/048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lv5/j;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$G;", "<init>", "()V", "", "firstPosition", "lastPosition", "Loa/F;", "S", "(II)V", "", "Lx5/c;", "list", "P", "(Ljava/util/List;)V", "position", "j", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "y", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$G;", "viewHolder", "w", "(Landroidx/recyclerview/widget/RecyclerView$G;I)V", "h", "()I", "Lw5/a;", "selectionListener", "Q", "(Lw5/a;)V", "", "i", "(I)J", "N", "O", "R", "E", "Lw5/a;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "F", "Ljava/util/ArrayList;", "itemList", "Landroidx/lifecycle/D;", "", "kotlin.jvm.PlatformType", "G", "Landroidx/lifecycle/D;", "_textFlag", "Landroidx/lifecycle/B;", "H", "Landroidx/lifecycle/B;", "M", "()Landroidx/lifecycle/B;", "textFlag", "b", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes2.dex */
public final class j extends RecyclerView.h<RecyclerView.G> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4997a selectionListener;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private ArrayList<PreparationItem> itemList = new ArrayList<>();

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final D<Boolean> _textFlag;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final B<Boolean> textFlag;

    /* compiled from: PreparationItemAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lv5/j$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "itemView", "LL4/i1;", "binding", "<init>", "(Lv5/j;Landroid/view/View;LL4/i1;)V", "Lx5/c;", "data", "Loa/F;", "d", "(Lx5/c;)V", "B", "LL4/i1;", "getBinding", "()LL4/i1;", "setBinding", "(LL4/i1;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private i1 binding;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ j f51436C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, View itemView, i1 binding) {
            super(itemView);
            C3862t.g(itemView, "itemView");
            C3862t.g(binding, "binding");
            this.f51436C = jVar;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(a aVar, View view) {
            aVar.binding.f10144c.performClick();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(PreparationItem preparationItem, j jVar, a aVar, View view) {
            String information = preparationItem.getInformation();
            if (information == null || information.length() == 0) {
                return;
            }
            preparationItem.j(!preparationItem.getIsExpanded());
            jVar.o(aVar.getBindingAdapterPosition());
            jVar.R();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(PreparationItem preparationItem, j jVar, CompoundButton compoundButton, boolean z10) {
            InterfaceC4997a interfaceC4997a;
            InterfaceC4997a interfaceC4997a2;
            preparationItem.i(z10);
            if (z10) {
                String title = preparationItem.getTitle();
                if (title != null && (interfaceC4997a2 = jVar.selectionListener) != null) {
                    interfaceC4997a2.c(preparationItem.getGroupIndex(), title);
                }
            } else {
                String title2 = preparationItem.getTitle();
                if (title2 != null && (interfaceC4997a = jVar.selectionListener) != null) {
                    interfaceC4997a.b(preparationItem.getGroupIndex(), title2);
                }
            }
            jVar.S(preparationItem.getGroupIndex(), preparationItem.getGroupItemsCount() + 1);
            jVar.n();
        }

        public final void d(final PreparationItem data) {
            C3862t.g(data, "data");
            String title = data.getTitle();
            if (title != null) {
                AppCompatTextView titleText = this.binding.f10147f;
                C3862t.f(titleText, "titleText");
                Q4.l.c(titleText, title);
            }
            String information = data.getInformation();
            if (information == null || information.length() == 0) {
                AppCompatImageView expandImage = this.binding.f10144c;
                C3862t.f(expandImage, "expandImage");
                Q4.l.g(expandImage);
                AppCompatTextView informationText = this.binding.f10145d;
                C3862t.f(informationText, "informationText");
                Q4.l.g(informationText);
            } else {
                if (data.getIsExpanded()) {
                    this.binding.f10144c.setImageResource(R.drawable.ic_arrow_down);
                    AppCompatTextView informationText2 = this.binding.f10145d;
                    C3862t.f(informationText2, "informationText");
                    Q4.l.j(informationText2);
                } else {
                    this.binding.f10144c.setImageResource(R.drawable.ic_arrow_right);
                    AppCompatTextView informationText3 = this.binding.f10145d;
                    C3862t.f(informationText3, "informationText");
                    Q4.l.g(informationText3);
                }
                AppCompatImageView expandImage2 = this.binding.f10144c;
                C3862t.f(expandImage2, "expandImage");
                Q4.l.j(expandImage2);
                AppCompatTextView informationText4 = this.binding.f10145d;
                C3862t.f(informationText4, "informationText");
                Q4.l.c(informationText4, data.getInformation());
            }
            this.binding.f10146e.setOnClickListener(new View.OnClickListener() { // from class: v5.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j.a.e(this.f51425B, view);
                }
            });
            AppCompatImageView appCompatImageView = this.binding.f10144c;
            final j jVar = this.f51436C;
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: v5.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j.a.f(data, jVar, this, view);
                }
            });
            this.binding.f10143b.setOnCheckedChangeListener(null);
            this.binding.f10143b.setChecked(data.getIsChecked());
            AppCompatCheckBox appCompatCheckBox = this.binding.f10143b;
            final j jVar2 = this.f51436C;
            appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: v5.i
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    j.a.g(data, jVar2, compoundButton, z10);
                }
            });
        }
    }

    /* compiled from: PreparationItemAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lv5/j$b;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "itemView", "LL4/j1;", "binding", "<init>", "(Lv5/j;Landroid/view/View;LL4/j1;)V", "Lx5/c;", "data", "Loa/F;", "a", "(Lx5/c;)V", "B", "LL4/j1;", "getBinding", "()LL4/j1;", "setBinding", "(LL4/j1;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class b extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private j1 binding;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ j f51438C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar, View itemView, j1 binding) {
            super(itemView);
            C3862t.g(itemView, "itemView");
            C3862t.g(binding, "binding");
            this.f51438C = jVar;
            this.binding = binding;
        }

        public final void a(PreparationItem data) {
            C3862t.g(data, "data");
            this.binding.f10175c.setText(data.getTitle());
        }
    }

    public j() {
        D<Boolean> d10 = new D<>(Boolean.FALSE);
        this._textFlag = d10;
        this.textFlag = d10;
        F(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(int firstPosition, int lastPosition) {
        Comparator comparator = new Comparator() { // from class: v5.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return j.U((PreparationItem) obj, (PreparationItem) obj2);
            }
        };
        List listO0 = r.O0(r.O0(this.itemList, comparator), new Comparator() { // from class: v5.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return j.V((PreparationItem) obj, (PreparationItem) obj2);
            }
        });
        this.itemList.clear();
        this.itemList.addAll(listO0);
    }

    static /* synthetic */ void T(j jVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        jVar.S(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U(PreparationItem o12, PreparationItem o22) {
        C3862t.g(o12, "o1");
        C3862t.g(o22, "o2");
        if (o12.getGroupIndex() != o22.getGroupIndex() || o12.getType() != o22.getType()) {
            return 0;
        }
        if (!o12.getIsChecked() || o22.getIsChecked()) {
            return (o12.getIsChecked() || !o22.getIsChecked()) ? 0 : -1;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int V(PreparationItem o12, PreparationItem o22) {
        C3862t.g(o12, "o1");
        C3862t.g(o22, "o2");
        if (o12.getGroupIndex() != o22.getGroupIndex() || o12.getType() != o22.getType() || o12.getIsChecked() != o22.getIsChecked()) {
            return 0;
        }
        if (o12.getIndex() < o22.getIndex()) {
            return -1;
        }
        return o12.getIndex() > o22.getIndex() ? 1 : 0;
    }

    public final B<Boolean> M() {
        return this.textFlag;
    }

    public final void N() {
        int size = this.itemList.size() - 1;
        if (size >= 0) {
            int i10 = 0;
            while (true) {
                this.itemList.get(i10).i(false);
                if (i10 == size) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        InterfaceC4997a interfaceC4997a = this.selectionListener;
        if (interfaceC4997a != null) {
            interfaceC4997a.a();
        }
        T(this, 0, 0, 3, null);
        n();
    }

    public final void O() {
        Boolean boolE = this._textFlag.e();
        if (boolE != null) {
            boolean zBooleanValue = boolE.booleanValue();
            int size = this.itemList.size() - 1;
            if (size >= 0) {
                int i10 = 0;
                while (true) {
                    this.itemList.get(i10).j(zBooleanValue);
                    if (i10 == size) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        n();
        R();
    }

    public final void P(List<PreparationItem> list) {
        C3862t.g(list, "list");
        this.itemList.clear();
        this.itemList = (ArrayList) list;
        T(this, 0, 0, 3, null);
        n();
    }

    public final void Q(InterfaceC4997a selectionListener) {
        C3862t.g(selectionListener, "selectionListener");
        this.selectionListener = selectionListener;
    }

    public final void R() {
        String information;
        ArrayList<PreparationItem> arrayList = this.itemList;
        int i10 = 0;
        if (arrayList == null || !arrayList.isEmpty()) {
            for (PreparationItem preparationItem : arrayList) {
                if (preparationItem.getIsExpanded() && (information = preparationItem.getInformation()) != null && information.length() != 0 && (i10 = i10 + 1) < 0) {
                    r.v();
                }
            }
        }
        if (i10 == 0) {
            this._textFlag.l(Boolean.TRUE);
        } else {
            this._textFlag.l(Boolean.FALSE);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.itemList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int j(int position) {
        return this.itemList.get(position).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void w(RecyclerView.G viewHolder, int position) {
        C3862t.g(viewHolder, "viewHolder");
        if (viewHolder.getItemViewType() == EnumC5059d.f52830D.ordinal()) {
            PreparationItem preparationItem = this.itemList.get(position);
            C3862t.f(preparationItem, "get(...)");
            ((b) viewHolder).a(preparationItem);
        } else {
            PreparationItem preparationItem2 = this.itemList.get(position);
            C3862t.f(preparationItem2, "get(...)");
            ((a) viewHolder).d(preparationItem2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.G y(ViewGroup parent, int viewType) {
        C3862t.g(parent, "parent");
        if (viewType == EnumC5059d.f52830D.ordinal()) {
            j1 j1VarB = j1.b(LayoutInflater.from(parent.getContext()), parent, false);
            C3862t.f(j1VarB, "inflate(...)");
            ConstraintLayout rootView = j1VarB.f10174b;
            C3862t.f(rootView, "rootView");
            return new b(this, rootView, j1VarB);
        }
        i1 i1VarC = i1.c(LayoutInflater.from(parent.getContext()), parent, false);
        C3862t.f(i1VarC, "inflate(...)");
        MaterialCardView materialCardViewB = i1VarC.b();
        C3862t.f(materialCardViewB, "getRoot(...)");
        return new a(this, materialCardViewB, i1VarC);
    }
}
