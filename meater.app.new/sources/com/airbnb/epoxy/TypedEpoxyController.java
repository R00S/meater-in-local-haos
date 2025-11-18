package com.airbnb.epoxy;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class TypedEpoxyController<T> extends AbstractC5153n {
    private boolean allowModelBuildRequests;
    private T currentData;

    public TypedEpoxyController() {
    }

    @Override // com.airbnb.epoxy.AbstractC5153n
    protected final void buildModels() {
        if (!isBuildingModels()) {
            throw new IllegalStateException("You cannot call `buildModels` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        buildModels(this.currentData);
    }

    protected abstract void buildModels(T t);

    public final T getCurrentData() {
        return this.currentData;
    }

    @Override // com.airbnb.epoxy.AbstractC5153n
    public void moveModel(int i2, int i3) {
        this.allowModelBuildRequests = true;
        super.moveModel(i2, i3);
        this.allowModelBuildRequests = false;
    }

    @Override // com.airbnb.epoxy.AbstractC5153n
    public void requestDelayedModelBuild(int i2) {
        if (!this.allowModelBuildRequests) {
            throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        super.requestDelayedModelBuild(i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5153n
    public final void requestModelBuild() {
        if (!this.allowModelBuildRequests) {
            throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        super.requestModelBuild();
    }

    public final void setData(T t) {
        this.currentData = t;
        this.allowModelBuildRequests = true;
        requestModelBuild();
        this.allowModelBuildRequests = false;
    }

    public TypedEpoxyController(Handler handler, Handler handler2) {
        super(handler, handler2);
    }
}
