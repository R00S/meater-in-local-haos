package zb;

import Gb.n;
import Hb.AbstractC1082f0;
import Ra.InterfaceC1692e;
import kotlin.jvm.internal.C3862t;

/* compiled from: SamConversionResolverImpl.kt */
/* renamed from: zb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5225b implements InterfaceC5224a {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable<Object> f53928a;

    /* renamed from: b, reason: collision with root package name */
    private final Gb.b<InterfaceC1692e, AbstractC1082f0> f53929b;

    public C5225b(n storageManager, Iterable<? extends Object> samWithReceiverResolvers) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f53928a = samWithReceiverResolvers;
        this.f53929b = storageManager.a();
    }
}
