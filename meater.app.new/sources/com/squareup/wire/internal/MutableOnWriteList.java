package com.squareup.wire.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractC3825f;
import kotlin.jvm.internal.C3862t;

/* compiled from: MutableOnWriteList.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\nR\u0014\u0010 \u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/squareup/wire/internal/MutableOnWriteList;", "T", "Lkotlin/collections/f;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Ljava/io/Serializable;", "Lcom/squareup/wire/internal/Serializable;", "", "immutableList", "<init>", "(Ljava/util/List;)V", "", "writeReplace", "()Ljava/lang/Object;", "", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "Loa/F;", "add", "(ILjava/lang/Object;)V", "removeAt", "Ljava/util/List;", "mutableList", "getMutableList$wire_runtime", "()Ljava/util/List;", "setMutableList$wire_runtime", "getSize", "()I", "size", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MutableOnWriteList<T> extends AbstractC3825f<T> implements RandomAccess, Serializable {
    private final List<T> immutableList;
    private List<? extends T> mutableList;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableOnWriteList(List<? extends T> immutableList) {
        C3862t.g(immutableList, "immutableList");
        this.immutableList = immutableList;
        this.mutableList = immutableList;
    }

    private final Object writeReplace() {
        return new ArrayList(this.mutableList);
    }

    @Override // kotlin.collections.AbstractC3825f, java.util.AbstractList, java.util.List
    public void add(int index, T element) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        C3862t.e(list, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        ((ArrayList) list).add(index, element);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int index) {
        return this.mutableList.get(index);
    }

    public final List<T> getMutableList$wire_runtime() {
        return this.mutableList;
    }

    @Override // kotlin.collections.AbstractC3825f
    /* renamed from: getSize */
    public int getLength() {
        return this.mutableList.size();
    }

    @Override // kotlin.collections.AbstractC3825f
    public T removeAt(int index) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        C3862t.e(list, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return (T) ((ArrayList) list).remove(index);
    }

    @Override // kotlin.collections.AbstractC3825f, java.util.AbstractList, java.util.List
    public T set(int index, T element) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        C3862t.e(list, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return (T) ((ArrayList) list).set(index, element);
    }

    public final void setMutableList$wire_runtime(List<? extends T> list) {
        C3862t.g(list, "<set-?>");
        this.mutableList = list;
    }
}
