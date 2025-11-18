package com.airbnb.epoxy;

import android.os.Bundle;
import android.os.Handler;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: EpoxyController.java */
/* renamed from: com.airbnb.epoxy.n */
/* loaded from: classes.dex */
public abstract class AbstractC5153n {
    private static final int DELAY_TO_CHECK_ADAPTER_COUNT_MS = 3000;
    private static final InterfaceC5148k0 NO_OP_TIMER = new C5134d0();
    public static Handler defaultDiffingHandler;
    public static Handler defaultModelBuildingHandler;
    private static boolean filterDuplicatesDefault;
    private static boolean globalDebugLoggingEnabled;
    private static d globalExceptionHandler;
    private final C5154o adapter;
    private final Runnable buildModelsRunnable;
    private C5155p debugObserver;
    private volatile boolean filterDuplicates;
    private volatile boolean hasBuiltModelsEver;
    private final AbstractC5137f helper;
    private final List<e> interceptors;
    private final Handler modelBuildHandler;
    private List<f> modelInterceptorCallbacks;
    private C5141h modelsBeingBuilt;
    private int recyclerViewAttachCount;
    private volatile int requestedModelBuildType;
    private AbstractC5166s<?> stagedModel;
    private volatile Thread threadBuildingModels;
    private InterfaceC5148k0 timer;

    /* compiled from: EpoxyController.java */
    /* renamed from: com.airbnb.epoxy.n$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5153n.this.threadBuildingModels = Thread.currentThread();
            AbstractC5153n.this.cancelPendingModelBuild();
            AbstractC5153n.this.helper.resetAutoModels();
            AbstractC5153n.this.modelsBeingBuilt = new C5141h(AbstractC5153n.this.getExpectedModelCount());
            AbstractC5153n.this.timer.mo9284a("Models built");
            try {
                AbstractC5153n.this.buildModels();
                AbstractC5153n.this.addCurrentlyStagedModelIfExists();
                AbstractC5153n.this.timer.stop();
                AbstractC5153n.this.runInterceptors();
                AbstractC5153n abstractC5153n = AbstractC5153n.this;
                abstractC5153n.filterDuplicatesIfNeeded(abstractC5153n.modelsBeingBuilt);
                AbstractC5153n.this.modelsBeingBuilt.m9295c0();
                AbstractC5153n.this.timer.mo9284a("Models diffed");
                AbstractC5153n.this.adapter.m9324I(AbstractC5153n.this.modelsBeingBuilt);
                AbstractC5153n.this.timer.stop();
                AbstractC5153n.this.modelsBeingBuilt = null;
                AbstractC5153n.this.hasBuiltModelsEver = true;
                AbstractC5153n.this.threadBuildingModels = null;
            } catch (Throwable th) {
                AbstractC5153n.this.timer.stop();
                AbstractC5153n.this.modelsBeingBuilt = null;
                AbstractC5153n.this.hasBuiltModelsEver = true;
                AbstractC5153n.this.threadBuildingModels = null;
                AbstractC5153n.this.stagedModel = null;
                throw th;
            }
        }
    }

    /* compiled from: EpoxyController.java */
    /* renamed from: com.airbnb.epoxy.n$b */
    static class b implements d {
        b() {
        }

        @Override // com.airbnb.epoxy.AbstractC5153n.d
        /* renamed from: a */
        public void mo9314a(AbstractC5153n abstractC5153n, RuntimeException runtimeException) {
        }
    }

    /* compiled from: EpoxyController.java */
    /* renamed from: com.airbnb.epoxy.n$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC5153n.this.recyclerViewAttachCount > 1) {
                AbstractC5153n.this.onExceptionSwallowed(new IllegalStateException("This EpoxyController had its adapter added to more than one ReyclerView. Epoxy does not support attaching an adapter to multiple RecyclerViews because saved state will not work properly. If you did not intend to attach your adapter to multiple RecyclerViews you may be leaking a reference to a previous RecyclerView. Make sure to remove the adapter from any previous RecyclerViews (eg if the adapter is reused in a Fragment across multiple onCreateView/onDestroyView cycles). See https://github.com/airbnb/epoxy/wiki/Avoiding-Memory-Leaks for more information."));
            }
        }
    }

    /* compiled from: EpoxyController.java */
    /* renamed from: com.airbnb.epoxy.n$d */
    public interface d {
        /* renamed from: a */
        void mo9314a(AbstractC5153n abstractC5153n, RuntimeException runtimeException);
    }

    /* compiled from: EpoxyController.java */
    /* renamed from: com.airbnb.epoxy.n$e */
    public interface e {
        /* renamed from: a */
        void m9315a(List<AbstractC5166s<?>> list);
    }

    /* compiled from: EpoxyController.java */
    /* renamed from: com.airbnb.epoxy.n$f */
    interface f {
        /* renamed from: a */
        void mo9316a(AbstractC5153n abstractC5153n);

        /* renamed from: b */
        void mo9317b(AbstractC5153n abstractC5153n);
    }

    static {
        Handler handler = C5130b0.f12188g.f12303f;
        defaultModelBuildingHandler = handler;
        defaultDiffingHandler = handler;
        filterDuplicatesDefault = false;
        globalDebugLoggingEnabled = false;
        globalExceptionHandler = new b();
    }

    public AbstractC5153n() {
        this(defaultModelBuildingHandler, defaultDiffingHandler);
    }

    private void assertIsBuildingModels() {
        if (!isBuildingModels()) {
            throw new IllegalEpoxyUsage("Can only call this when inside the `buildModels` method");
        }
    }

    private void assertNotBuildingModels() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call this from inside `buildModels`");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filterDuplicatesIfNeeded(List<AbstractC5166s<?>> list) {
        if (this.filterDuplicates) {
            this.timer.mo9284a("Duplicates filtered");
            HashSet hashSet = new HashSet(list.size());
            ListIterator<AbstractC5166s<?>> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                AbstractC5166s<?> next = listIterator.next();
                if (!hashSet.add(Long.valueOf(next.m9359id()))) {
                    int iPreviousIndex = listIterator.previousIndex();
                    listIterator.remove();
                    int iFindPositionOfDuplicate = findPositionOfDuplicate(list, next);
                    AbstractC5166s<?> abstractC5166s = list.get(iFindPositionOfDuplicate);
                    if (iPreviousIndex <= iFindPositionOfDuplicate) {
                        iFindPositionOfDuplicate++;
                    }
                    onExceptionSwallowed(new IllegalEpoxyUsage("Two models have the same ID. ID's must be unique!\nOriginal has position " + iFindPositionOfDuplicate + ":\n" + abstractC5166s + "\nDuplicate has position " + iPreviousIndex + ":\n" + next));
                }
            }
            this.timer.stop();
        }
    }

    private int findPositionOfDuplicate(List<AbstractC5166s<?>> list, AbstractC5166s<?> abstractC5166s) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).m9359id() == abstractC5166s.m9359id()) {
                return i2;
            }
        }
        throw new IllegalArgumentException("No duplicates in list");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getExpectedModelCount() {
        int itemCount = this.adapter.getItemCount();
        if (itemCount != 0) {
            return itemCount;
        }
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runInterceptors() {
        if (!this.interceptors.isEmpty()) {
            List<f> list = this.modelInterceptorCallbacks;
            if (list != null) {
                Iterator<f> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo9316a(this);
                }
            }
            this.timer.mo9284a("Interceptors executed");
            Iterator<e> it2 = this.interceptors.iterator();
            while (it2.hasNext()) {
                it2.next().m9315a(this.modelsBeingBuilt);
            }
            this.timer.stop();
            List<f> list2 = this.modelInterceptorCallbacks;
            if (list2 != null) {
                Iterator<f> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().mo9317b(this);
                }
            }
        }
        this.modelInterceptorCallbacks = null;
    }

    public static void setGlobalDebugLoggingEnabled(boolean z) {
        globalDebugLoggingEnabled = z;
    }

    public static void setGlobalDuplicateFilteringDefault(boolean z) {
        filterDuplicatesDefault = z;
    }

    public static void setGlobalExceptionHandler(d dVar) {
        globalExceptionHandler = dVar;
    }

    protected void add(AbstractC5166s<?> abstractC5166s) {
        abstractC5166s.addTo(this);
    }

    void addAfterInterceptorCallback(f fVar) {
        assertIsBuildingModels();
        if (this.modelInterceptorCallbacks == null) {
            this.modelInterceptorCallbacks = new ArrayList();
        }
        this.modelInterceptorCallbacks.add(fVar);
    }

    void addCurrentlyStagedModelIfExists() {
        AbstractC5166s<?> abstractC5166s = this.stagedModel;
        if (abstractC5166s != null) {
            abstractC5166s.addTo(this);
        }
        this.stagedModel = null;
    }

    public void addInterceptor(e eVar) {
        this.interceptors.add(eVar);
    }

    void addInternal(AbstractC5166s<?> abstractC5166s) {
        assertIsBuildingModels();
        if (abstractC5166s.hasDefaultId()) {
            throw new IllegalEpoxyUsage("You must set an id on a model before adding it. Use the @AutoModel annotation if you want an id to be automatically generated for you.");
        }
        if (!abstractC5166s.isShown()) {
            throw new IllegalEpoxyUsage("You cannot hide a model in an EpoxyController. Use `addIf` to conditionally add a model instead.");
        }
        clearModelFromStaging(abstractC5166s);
        abstractC5166s.controllerToStageTo = null;
        this.modelsBeingBuilt.add(abstractC5166s);
    }

    public void addModelBuildListener(InterfaceC5140g0 interfaceC5140g0) {
        this.adapter.m9318C(interfaceC5140g0);
    }

    protected abstract void buildModels();

    public synchronized void cancelPendingModelBuild() {
        if (this.requestedModelBuildType != 0) {
            this.requestedModelBuildType = 0;
            this.modelBuildHandler.removeCallbacks(this.buildModelsRunnable);
        }
    }

    void clearModelFromStaging(AbstractC5166s<?> abstractC5166s) {
        if (this.stagedModel != abstractC5166s) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = null;
    }

    public C5154o getAdapter() {
        return this.adapter;
    }

    int getFirstIndexOfModelInBuildingList(AbstractC5166s<?> abstractC5166s) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.modelsBeingBuilt.get(i2) == abstractC5166s) {
                return i2;
            }
        }
        return -1;
    }

    protected int getModelCountBuiltSoFar() {
        assertIsBuildingModels();
        return this.modelsBeingBuilt.size();
    }

    public int getSpanCount() {
        return this.adapter.m9269l();
    }

    public GridLayoutManager.AbstractC0579c getSpanSizeLookup() {
        return this.adapter.m9270m();
    }

    public boolean hasPendingModelBuild() {
        return (this.requestedModelBuildType == 0 && this.threadBuildingModels == null && !this.adapter.m9321F()) ? false : true;
    }

    protected boolean isBuildingModels() {
        return this.threadBuildingModels == Thread.currentThread();
    }

    public boolean isDebugLoggingEnabled() {
        return this.timer != NO_OP_TIMER;
    }

    public boolean isDuplicateFilteringEnabled() {
        return this.filterDuplicates;
    }

    boolean isModelAddedMultipleTimes(AbstractC5166s<?> abstractC5166s) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (this.modelsBeingBuilt.get(i3) == abstractC5166s) {
                i2++;
            }
        }
        return i2 > 1;
    }

    public boolean isMultiSpan() {
        return this.adapter.m9271n();
    }

    public void moveModel(int i2, int i3) {
        assertNotBuildingModels();
        this.adapter.m9322G(i2, i3);
        requestDelayedModelBuild(500);
    }

    protected void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    void onAttachedToRecyclerViewInternal(RecyclerView recyclerView) {
        int i2 = this.recyclerViewAttachCount + 1;
        this.recyclerViewAttachCount = i2;
        if (i2 > 1) {
            C5130b0.f12188g.f12303f.postDelayed(new c(), 3000L);
        }
        onAttachedToRecyclerView(recyclerView);
    }

    protected void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    void onDetachedFromRecyclerViewInternal(RecyclerView recyclerView) {
        this.recyclerViewAttachCount--;
        onDetachedFromRecyclerView(recyclerView);
    }

    protected void onExceptionSwallowed(RuntimeException runtimeException) {
        globalExceptionHandler.mo9314a(this, runtimeException);
    }

    protected void onModelBound(C5168u c5168u, AbstractC5166s<?> abstractC5166s, int i2, AbstractC5166s<?> abstractC5166s2) {
    }

    protected void onModelUnbound(C5168u c5168u, AbstractC5166s<?> abstractC5166s) {
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.adapter.m9281x(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.adapter.onSaveInstanceState(bundle);
    }

    protected void onViewAttachedToWindow(C5168u c5168u, AbstractC5166s<?> abstractC5166s) {
    }

    protected void onViewDetachedFromWindow(C5168u c5168u, AbstractC5166s<?> abstractC5166s) {
    }

    public void removeInterceptor(e eVar) {
        this.interceptors.remove(eVar);
    }

    public void removeModelBuildListener(InterfaceC5140g0 interfaceC5140g0) {
        this.adapter.m9323H(interfaceC5140g0);
    }

    public synchronized void requestDelayedModelBuild(int i2) {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call `requestDelayedModelBuild` from inside `buildModels`");
        }
        if (this.requestedModelBuildType == 2) {
            cancelPendingModelBuild();
        } else if (this.requestedModelBuildType == 1) {
            return;
        }
        this.requestedModelBuildType = i2 != 0 ? 2 : 1;
        this.modelBuildHandler.postDelayed(this.buildModelsRunnable, i2);
    }

    public void requestModelBuild() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call `requestModelBuild` from inside `buildModels`");
        }
        if (this.hasBuiltModelsEver) {
            requestDelayedModelBuild(0);
        } else {
            this.buildModelsRunnable.run();
        }
    }

    public void setDebugLoggingEnabled(boolean z) {
        assertNotBuildingModels();
        if (z) {
            this.timer = new C5143i(getClass().getSimpleName());
            if (this.debugObserver == null) {
                this.debugObserver = new C5155p(getClass().getSimpleName());
            }
            this.adapter.registerAdapterDataObserver(this.debugObserver);
            return;
        }
        this.timer = NO_OP_TIMER;
        C5155p c5155p = this.debugObserver;
        if (c5155p != null) {
            this.adapter.unregisterAdapterDataObserver(c5155p);
        }
    }

    public void setFilterDuplicates(boolean z) {
        this.filterDuplicates = z;
    }

    public void setSpanCount(int i2) {
        this.adapter.m9264B(i2);
    }

    void setStagedModel(AbstractC5166s<?> abstractC5166s) {
        if (abstractC5166s != this.stagedModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = abstractC5166s;
    }

    public AbstractC5153n(Handler handler, Handler handler2) {
        this.recyclerViewAttachCount = 0;
        this.interceptors = new CopyOnWriteArrayList();
        this.filterDuplicates = filterDuplicatesDefault;
        this.threadBuildingModels = null;
        this.timer = NO_OP_TIMER;
        this.helper = C5139g.m9293b(this);
        this.requestedModelBuildType = 0;
        this.buildModelsRunnable = new a();
        this.adapter = new C5154o(this, handler2);
        this.modelBuildHandler = handler;
        setDebugLoggingEnabled(globalDebugLoggingEnabled);
    }

    protected void add(AbstractC5166s<?>... abstractC5166sArr) {
        C5141h c5141h = this.modelsBeingBuilt;
        c5141h.ensureCapacity(c5141h.size() + abstractC5166sArr.length);
        for (AbstractC5166s<?> abstractC5166s : abstractC5166sArr) {
            abstractC5166s.addTo(this);
        }
    }

    protected void add(List<? extends AbstractC5166s<?>> list) {
        C5141h c5141h = this.modelsBeingBuilt;
        c5141h.ensureCapacity(c5141h.size() + list.size());
        Iterator<? extends AbstractC5166s<?>> it = list.iterator();
        while (it.hasNext()) {
            it.next().addTo(this);
        }
    }
}
