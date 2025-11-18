package s1;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: ViewGroup.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroid/view/ViewGroup;", "", "Landroid/view/View;", "c", "(Landroid/view/ViewGroup;)Ljava/util/Iterator;", "LTb/h;", "a", "(Landroid/view/ViewGroup;)LTb/h;", "children", "b", "descendants", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: s1.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4426c0 {

    /* compiled from: ViewGroup.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"s1/c0$a", "LTb/h;", "Landroid/view/View;", "", "iterator", "()Ljava/util/Iterator;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s1.c0$a */
    public static final class a implements Tb.h<View> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f49116a;

        a(ViewGroup viewGroup) {
            this.f49116a = viewGroup;
        }

        @Override // Tb.h
        public Iterator<View> iterator() {
            return C4426c0.c(this.f49116a);
        }
    }

    /* compiled from: ViewGroup.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "child", "", "a", "(Landroid/view/View;)Ljava/util/Iterator;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: s1.c0$b */
    static final class b extends AbstractC3864v implements Ba.l<View, Iterator<? extends View>> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f49117B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<View> invoke(View view) {
            Tb.h<View> hVarA;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (hVarA = C4426c0.a(viewGroup)) == null) {
                return null;
            }
            return hVarA.iterator();
        }
    }

    /* compiled from: ViewGroup.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"s1/c0$c", "", "Landroid/view/View;", "", "hasNext", "()Z", "b", "()Landroid/view/View;", "Loa/F;", "remove", "()V", "", "B", "I", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s1.c0$c */
    public static final class c implements Iterator<View>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ ViewGroup f49119C;

        c(ViewGroup viewGroup) {
            this.f49119C = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f49119C;
            int i10 = this.index;
            this.index = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f49119C.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f49119C;
            int i10 = this.index - 1;
            this.index = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"s1/c0$d", "LTb/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s1.c0$d */
    public static final class d implements Tb.h<View> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f49120a;

        public d(ViewGroup viewGroup) {
            this.f49120a = viewGroup;
        }

        @Override // Tb.h
        public Iterator<View> iterator() {
            return new T(C4426c0.a(this.f49120a).iterator(), b.f49117B);
        }
    }

    public static final Tb.h<View> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final Tb.h<View> b(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator<View> c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
