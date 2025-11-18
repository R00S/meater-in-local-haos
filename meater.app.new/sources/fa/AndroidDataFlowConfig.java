package fa;

import Xb.E;
import android.view.O;
import ga.d;
import ga.f;
import ha.C3502b;
import ia.InterfaceC3640e;
import ja.C3756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: AndroidDataFlow.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lfa/b;", "", "", "defaultCapacity", "LXb/E;", "defaultDispatcher", "Lia/e;", "defaultDataPublisher", "<init>", "(ILXb/E;Lia/e;)V", "Lja/a;", "defaultState", "Landroidx/lifecycle/O;", "savedStateHandle", "", "tag", "c", "(Lja/a;Landroidx/lifecycle/O;Ljava/lang/String;)Lia/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "LXb/E;", "()LXb/E;", "Lia/e;", "getDefaultDataPublisher", "()Lia/e;", "uniflow-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: fa.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class AndroidDataFlowConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int defaultCapacity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final E defaultDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC3640e defaultDataPublisher;

    public AndroidDataFlowConfig() {
        this(0, null, null, 7, null);
    }

    /* renamed from: a, reason: from getter */
    public final int getDefaultCapacity() {
        return this.defaultCapacity;
    }

    /* renamed from: b, reason: from getter */
    public final E getDefaultDispatcher() {
        return this.defaultDispatcher;
    }

    public final InterfaceC3640e c(C3756a defaultState, O savedStateHandle, String tag) {
        C3862t.g(defaultState, "defaultState");
        C3862t.g(tag, "tag");
        InterfaceC3640e interfaceC3640e = this.defaultDataPublisher;
        return interfaceC3640e != null ? interfaceC3640e : savedStateHandle != null ? f.a(savedStateHandle, defaultState, C3862t.n(tag, "-PersistentPublisher")) : d.a(defaultState, C3862t.n(tag, "-Publisher"));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidDataFlowConfig)) {
            return false;
        }
        AndroidDataFlowConfig androidDataFlowConfig = (AndroidDataFlowConfig) other;
        return this.defaultCapacity == androidDataFlowConfig.defaultCapacity && C3862t.b(this.defaultDispatcher, androidDataFlowConfig.defaultDispatcher) && C3862t.b(this.defaultDataPublisher, androidDataFlowConfig.defaultDataPublisher);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.defaultCapacity) * 31) + this.defaultDispatcher.hashCode()) * 31;
        InterfaceC3640e interfaceC3640e = this.defaultDataPublisher;
        return iHashCode + (interfaceC3640e == null ? 0 : interfaceC3640e.hashCode());
    }

    public String toString() {
        return "AndroidDataFlowConfig(defaultCapacity=" + this.defaultCapacity + ", defaultDispatcher=" + this.defaultDispatcher + ", defaultDataPublisher=" + this.defaultDataPublisher + ')';
    }

    public AndroidDataFlowConfig(int i10, E defaultDispatcher, InterfaceC3640e interfaceC3640e) {
        C3862t.g(defaultDispatcher, "defaultDispatcher");
        this.defaultCapacity = i10;
        this.defaultDispatcher = defaultDispatcher;
        this.defaultDataPublisher = interfaceC3640e;
    }

    public /* synthetic */ AndroidDataFlowConfig(int i10, E e10, InterfaceC3640e interfaceC3640e, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? -2 : i10, (i11 & 2) != 0 ? C3502b.f42369a.a().b() : e10, (i11 & 4) != 0 ? null : interfaceC3640e);
    }
}
