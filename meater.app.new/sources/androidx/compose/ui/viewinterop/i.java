package androidx.compose.ui.viewinterop;

import A0.m0;
import Ba.l;
import Y.g;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.platform.AbstractC2004a;
import androidx.compose.ui.platform.n1;
import kotlin.AbstractC1564q;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: AndroidView.android.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BI\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013BK\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\t\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010/\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b+\u0010,\"\u0004\b-\u0010.RB\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105RB\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105RB\u0010>\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b<\u00103\"\u0004\b=\u00105R\u0014\u0010A\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Landroidx/compose/ui/viewinterop/i;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/c;", "Landroidx/compose/ui/platform/n1;", "Landroid/content/Context;", "context", "LO/q;", "parentContext", "typedView", "Lt0/b;", "dispatcher", "LY/g;", "saveStateRegistry", "", "compositeKeyHash", "LA0/m0;", "owner", "<init>", "(Landroid/content/Context;LO/q;Landroid/view/View;Lt0/b;LY/g;ILA0/m0;)V", "Lkotlin/Function1;", "factory", "(Landroid/content/Context;LBa/l;LO/q;LY/g;ILA0/m0;)V", "Loa/F;", "y", "()V", "z", "e0", "Landroid/view/View;", "f0", "Lt0/b;", "getDispatcher", "()Lt0/b;", "g0", "LY/g;", "h0", "I", "", "i0", "Ljava/lang/String;", "saveStateKey", "LY/g$a;", "value", "j0", "LY/g$a;", "setSavableRegistryEntry", "(LY/g$a;)V", "savableRegistryEntry", "k0", "LBa/l;", "getUpdateBlock", "()LBa/l;", "setUpdateBlock", "(LBa/l;)V", "updateBlock", "l0", "getResetBlock", "setResetBlock", "resetBlock", "m0", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i<T extends View> extends androidx.compose.ui.viewinterop.c implements n1 {

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private final T typedView;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private final t0.b dispatcher;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private final Y.g saveStateRegistry;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private final int compositeKeyHash;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private final String saveStateKey;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private g.a savableRegistryEntry;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private l<? super T, C4153F> updateBlock;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private l<? super T, C4153F> resetBlock;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private l<? super T, C4153F> releaseBlock;

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends AbstractC3864v implements Ba.a<Object> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i<T> f23614B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i<T> iVar) {
            super(0);
            this.f23614B = iVar;
        }

        @Override // Ba.a
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ((i) this.f23614B).typedView.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i<T> f23615B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i<T> iVar) {
            super(0);
            this.f23615B = iVar;
        }

        public final void a() {
            this.f23615B.getReleaseBlock().invoke(((i) this.f23615B).typedView);
            this.f23615B.z();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i<T> f23616B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i<T> iVar) {
            super(0);
            this.f23616B = iVar;
        }

        public final void a() {
            this.f23616B.getResetBlock().invoke(((i) this.f23616B).typedView);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i<T> f23617B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i<T> iVar) {
            super(0);
            this.f23617B = iVar;
        }

        public final void a() {
            this.f23617B.getUpdateBlock().invoke(((i) this.f23617B).typedView);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* synthetic */ i(Context context, AbstractC1564q abstractC1564q, View view, t0.b bVar, Y.g gVar, int i10, m0 m0Var, int i11, C3854k c3854k) {
        this(context, (i11 & 2) != 0 ? null : abstractC1564q, view, (i11 & 8) != 0 ? new t0.b() : bVar, gVar, i10, m0Var);
    }

    private final void setSavableRegistryEntry(g.a aVar) {
        g.a aVar2 = this.savableRegistryEntry;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.savableRegistryEntry = aVar;
    }

    private final void y() {
        Y.g gVar = this.saveStateRegistry;
        if (gVar != null) {
            setSavableRegistryEntry(gVar.d(this.saveStateKey, new a(this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        setSavableRegistryEntry(null);
    }

    public final t0.b getDispatcher() {
        return this.dispatcher;
    }

    public final l<T, C4153F> getReleaseBlock() {
        return this.releaseBlock;
    }

    public final l<T, C4153F> getResetBlock() {
        return this.resetBlock;
    }

    @Override // androidx.compose.ui.platform.n1
    public /* bridge */ /* synthetic */ AbstractC2004a getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final l<T, C4153F> getUpdateBlock() {
        return this.updateBlock;
    }

    public final void setReleaseBlock(l<? super T, C4153F> lVar) {
        this.releaseBlock = lVar;
        setRelease(new b(this));
    }

    public final void setResetBlock(l<? super T, C4153F> lVar) {
        this.resetBlock = lVar;
        setReset(new c(this));
    }

    public final void setUpdateBlock(l<? super T, C4153F> lVar) {
        this.updateBlock = lVar;
        setUpdate(new d(this));
    }

    private i(Context context, AbstractC1564q abstractC1564q, T t10, t0.b bVar, Y.g gVar, int i10, m0 m0Var) {
        super(context, abstractC1564q, i10, bVar, t10, m0Var);
        this.typedView = t10;
        this.dispatcher = bVar;
        this.saveStateRegistry = gVar;
        this.compositeKeyHash = i10;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        this.saveStateKey = strValueOf;
        Object objC = gVar != null ? gVar.c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objC instanceof SparseArray ? (SparseArray) objC : null;
        if (sparseArray != null) {
            t10.restoreHierarchyState(sparseArray);
        }
        y();
        this.updateBlock = e.e();
        this.resetBlock = e.e();
        this.releaseBlock = e.e();
    }

    public i(Context context, l<? super Context, ? extends T> lVar, AbstractC1564q abstractC1564q, Y.g gVar, int i10, m0 m0Var) {
        this(context, abstractC1564q, lVar.invoke(context), null, gVar, i10, m0Var, 8, null);
    }

    @Override // androidx.compose.ui.platform.n1
    public View getViewRoot() {
        return this;
    }
}
