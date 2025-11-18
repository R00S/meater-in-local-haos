package com.airbnb.epoxy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.epoxy.AbstractC5153n;
import java.util.List;

/* compiled from: EpoxyModel.java */
/* renamed from: com.airbnb.epoxy.s */
/* loaded from: classes.dex */
public abstract class AbstractC5166s<T> {
    private static long idCounter = -1;
    boolean addedToAdapter;
    AbstractC5153n controllerToStageTo;
    private boolean currentlyInInterceptors;
    private AbstractC5153n firstControllerAddedTo;
    private boolean hasDefaultId;
    private int hashCodeWhenAdded;

    /* renamed from: id */
    private long f12297id;
    private int layout;
    private boolean shown;
    private c spanSizeOverride;

    /* compiled from: EpoxyModel.java */
    /* renamed from: com.airbnb.epoxy.s$a */
    class a implements AbstractC5153n.f {
        a() {
        }

        @Override // com.airbnb.epoxy.AbstractC5153n.f
        /* renamed from: a */
        public void mo9316a(AbstractC5153n abstractC5153n) {
            AbstractC5166s.this.currentlyInInterceptors = true;
        }

        @Override // com.airbnb.epoxy.AbstractC5153n.f
        /* renamed from: b */
        public void mo9317b(AbstractC5153n abstractC5153n) {
            AbstractC5166s abstractC5166s = AbstractC5166s.this;
            abstractC5166s.hashCodeWhenAdded = abstractC5166s.hashCode();
            AbstractC5166s.this.currentlyInInterceptors = false;
        }
    }

    /* compiled from: EpoxyModel.java */
    /* renamed from: com.airbnb.epoxy.s$b */
    public interface b {
        /* renamed from: a */
        boolean m9360a();
    }

    /* compiled from: EpoxyModel.java */
    /* renamed from: com.airbnb.epoxy.s$c */
    public interface c {
        /* renamed from: a */
        int m9361a(int i2, int i3, int i4);
    }

    protected AbstractC5166s(long j2) {
        this.shown = true;
        mo6787id(j2);
    }

    private static int getPosition(AbstractC5153n abstractC5153n, AbstractC5166s<?> abstractC5166s) {
        return abstractC5153n.isBuildingModels() ? abstractC5153n.getFirstIndexOfModelInBuildingList(abstractC5166s) : abstractC5153n.getAdapter().m9320E(abstractC5166s);
    }

    public void addIf(boolean z, AbstractC5153n abstractC5153n) {
        if (z) {
            addTo(abstractC5153n);
            return;
        }
        AbstractC5153n abstractC5153n2 = this.controllerToStageTo;
        if (abstractC5153n2 != null) {
            abstractC5153n2.clearModelFromStaging(this);
            this.controllerToStageTo = null;
        }
    }

    public void addTo(AbstractC5153n abstractC5153n) {
        abstractC5153n.addInternal(this);
    }

    protected final void addWithDebugValidation(AbstractC5153n abstractC5153n) {
        if (abstractC5153n == null) {
            throw new IllegalArgumentException("Controller cannot be null");
        }
        if (abstractC5153n.isModelAddedMultipleTimes(this)) {
            throw new IllegalEpoxyUsage("This model was already added to the controller at position " + abstractC5153n.getFirstIndexOfModelInBuildingList(this));
        }
        if (this.firstControllerAddedTo == null) {
            this.firstControllerAddedTo = abstractC5153n;
            this.hashCodeWhenAdded = hashCode();
            abstractC5153n.addAfterInterceptorCallback(new a());
        }
    }

    public void bind(T t) {
    }

    public void bind(T t, List<Object> list) {
        bind(t);
    }

    protected View buildView(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(getLayout(), viewGroup, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5166s)) {
            return false;
        }
        AbstractC5166s abstractC5166s = (AbstractC5166s) obj;
        return this.f12297id == abstractC5166s.f12297id && getViewType() == abstractC5166s.getViewType() && this.shown == abstractC5166s.shown;
    }

    protected abstract int getDefaultLayout();

    public final int getLayout() {
        int i2 = this.layout;
        return i2 == 0 ? getDefaultLayout() : i2;
    }

    public int getSpanSize(int i2, int i3, int i4) {
        return 1;
    }

    protected int getViewType() {
        return getLayout();
    }

    boolean hasDefaultId() {
        return this.hasDefaultId;
    }

    public int hashCode() {
        long j2 = this.f12297id;
        return (((((int) (j2 ^ (j2 >>> 32))) * 31) + getViewType()) * 31) + (this.shown ? 1 : 0);
    }

    public AbstractC5166s<T> hide() {
        return show(false);
    }

    /* renamed from: id */
    public long m9359id() {
        return this.f12297id;
    }

    boolean isDebugValidationEnabled() {
        return this.firstControllerAddedTo != null;
    }

    public boolean isShown() {
        return this.shown;
    }

    public AbstractC5166s<T> layout(int i2) {
        onMutation();
        this.layout = i2;
        return this;
    }

    public boolean onFailedToRecycleView(T t) {
        return false;
    }

    protected final void onMutation() {
        if (isDebugValidationEnabled() && !this.currentlyInInterceptors) {
            throw new C5173z(this, getPosition(this.firstControllerAddedTo, this));
        }
        AbstractC5153n abstractC5153n = this.controllerToStageTo;
        if (abstractC5153n != null) {
            abstractC5153n.setStagedModel(this);
        }
    }

    public void onViewAttachedToWindow(T t) {
    }

    public void onViewDetachedFromWindow(T t) {
    }

    public void onVisibilityChanged(float f2, float f3, int i2, int i3, T t) {
    }

    public void onVisibilityStateChanged(int i2, T t) {
    }

    public AbstractC5166s<T> reset() {
        onMutation();
        this.layout = 0;
        this.shown = true;
        return this;
    }

    public boolean shouldSaveViewState() {
        return false;
    }

    public AbstractC5166s<T> show() {
        return show(true);
    }

    public final int spanSize(int i2, int i3, int i4) {
        c cVar = this.spanSizeOverride;
        return cVar != null ? cVar.m9361a(i2, i3, i4) : getSpanSize(i2, i3, i4);
    }

    public AbstractC5166s<T> spanSizeOverride(c cVar) {
        this.spanSizeOverride = cVar;
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + "{id=" + this.f12297id + ", viewType=" + getViewType() + ", shown=" + this.shown + ", addedToAdapter=" + this.addedToAdapter + '}';
    }

    public void unbind(T t) {
    }

    protected final void validateStateHasNotChangedSinceAdded(String str, int i2) {
        if (isDebugValidationEnabled() && !this.currentlyInInterceptors && this.hashCodeWhenAdded != hashCode()) {
            throw new C5173z(this, str, i2);
        }
    }

    public void bind(T t, AbstractC5166s<?> abstractC5166s) {
        bind(t);
    }

    /* renamed from: id */
    public AbstractC5166s<T> mo6787id(long j2) {
        if ((this.addedToAdapter || this.firstControllerAddedTo != null) && j2 != this.f12297id) {
            throw new IllegalEpoxyUsage("Cannot change a model's id after it has been added to the adapter.");
        }
        this.hasDefaultId = false;
        this.f12297id = j2;
        return this;
    }

    public AbstractC5166s<T> show(boolean z) {
        onMutation();
        this.shown = z;
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC5166s() {
        long j2 = idCounter;
        idCounter = j2 - 1;
        this(j2);
        this.hasDefaultId = true;
    }

    public void addIf(b bVar, AbstractC5153n abstractC5153n) {
        addIf(bVar.m9360a(), abstractC5153n);
    }

    /* renamed from: id */
    public AbstractC5166s<T> mo6792id(Number... numberArr) {
        long j2 = 0;
        if (numberArr != null) {
            long jM9368a = 0;
            for (Number number : numberArr) {
                jM9368a = (jM9368a * 31) + C5172y.m9368a(number == null ? 0L : r6.hashCode());
            }
            j2 = jM9368a;
        }
        return mo6787id(j2);
    }

    /* renamed from: id */
    public AbstractC5166s<T> mo6788id(long j2, long j3) {
        return mo6787id((C5172y.m9368a(j2) * 31) + C5172y.m9368a(j3));
    }

    /* renamed from: id */
    public AbstractC5166s<T> mo6789id(CharSequence charSequence) {
        mo6787id(C5172y.m9369b(charSequence));
        return this;
    }

    /* renamed from: id */
    public AbstractC5166s<T> mo6791id(CharSequence charSequence, CharSequence... charSequenceArr) {
        long jM9369b = C5172y.m9369b(charSequence);
        if (charSequenceArr != null) {
            for (CharSequence charSequence2 : charSequenceArr) {
                jM9369b = (jM9369b * 31) + C5172y.m9369b(charSequence2);
            }
        }
        return mo6787id(jM9369b);
    }

    /* renamed from: id */
    public AbstractC5166s<T> mo6790id(CharSequence charSequence, long j2) {
        mo6787id((C5172y.m9369b(charSequence) * 31) + C5172y.m9368a(j2));
        return this;
    }
}
