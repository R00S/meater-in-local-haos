package com.airbnb.epoxy;

import com.airbnb.epoxy.AbstractC5164q;
import java.util.List;

/* compiled from: EpoxyModelWithHolder.java */
/* renamed from: com.airbnb.epoxy.t */
/* loaded from: classes.dex */
public abstract class AbstractC5167t<T extends AbstractC5164q> extends AbstractC5166s<T> {
    public AbstractC5167t() {
    }

    protected abstract T createNewHolder();

    public AbstractC5167t(long j2) {
        super(j2);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public /* bridge */ /* synthetic */ void bind(Object obj, AbstractC5166s abstractC5166s) {
        bind((AbstractC5167t<T>) obj, (AbstractC5166s<?>) abstractC5166s);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public boolean onFailedToRecycleView(T t) {
        return super.onFailedToRecycleView((AbstractC5167t<T>) t);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public void onViewAttachedToWindow(T t) {
        super.onViewAttachedToWindow((AbstractC5167t<T>) t);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public void onViewDetachedFromWindow(T t) {
        super.onViewDetachedFromWindow((AbstractC5167t<T>) t);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, T t) {
        super.onVisibilityChanged(f2, f3, i2, i3, (int) t);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityStateChanged(int i2, T t) {
        super.onVisibilityStateChanged(i2, (int) t);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public void unbind(T t) {
        super.unbind((AbstractC5167t<T>) t);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public /* bridge */ /* synthetic */ void bind(Object obj, List list) {
        bind((AbstractC5167t<T>) obj, (List<Object>) list);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public void bind(T t) {
        super.bind((AbstractC5167t<T>) t);
    }

    public void bind(T t, List<Object> list) {
        super.bind((AbstractC5167t<T>) t, list);
    }

    public void bind(T t, AbstractC5166s<?> abstractC5166s) {
        super.bind((AbstractC5167t<T>) t, abstractC5166s);
    }
}
