package J;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RippleContainer.android.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\f\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\f\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\r*\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001c¨\u0006*"}, d2 = {"LJ/j;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", "b", "Loa/F;", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "LJ/k;", "LJ/n;", "(LJ/k;)LJ/n;", "a", "(LJ/k;)V", "B", "I", "MaxRippleHosts", "", "C", "Ljava/util/List;", "rippleHosts", "D", "unusedRippleHosts", "LJ/l;", "E", "LJ/l;", "rippleHostMap", "F", "nextHostIndex", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j extends ViewGroup {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int MaxRippleHosts;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final List<n> rippleHosts;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final List<n> unusedRippleHosts;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final l rippleHostMap;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private int nextHostIndex;

    public j(Context context) {
        super(context);
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new l();
        setClipChildren(false);
        n nVar = new n(context);
        addView(nVar);
        arrayList.add(nVar);
        arrayList2.add(nVar);
        this.nextHostIndex = 1;
        setTag(b0.l.f29944J, Boolean.TRUE);
    }

    public final void a(k kVar) {
        kVar.z0();
        n nVarB = this.rippleHostMap.b(kVar);
        if (nVarB != null) {
            nVarB.d();
            this.rippleHostMap.c(kVar);
            this.unusedRippleHosts.add(nVarB);
        }
    }

    public final n b(k kVar) {
        n nVarB = this.rippleHostMap.b(kVar);
        if (nVarB != null) {
            return nVarB;
        }
        n nVar = (n) kotlin.collections.r.L(this.unusedRippleHosts);
        if (nVar == null) {
            if (this.nextHostIndex > kotlin.collections.r.o(this.rippleHosts)) {
                nVar = new n(getContext());
                addView(nVar);
                this.rippleHosts.add(nVar);
            } else {
                nVar = this.rippleHosts.get(this.nextHostIndex);
                k kVarA = this.rippleHostMap.a(nVar);
                if (kVarA != null) {
                    kVarA.z0();
                    this.rippleHostMap.c(kVarA);
                    nVar.d();
                }
            }
            int i10 = this.nextHostIndex;
            if (i10 < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i10 + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.d(kVar, nVar);
        return nVar;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
    }
}
