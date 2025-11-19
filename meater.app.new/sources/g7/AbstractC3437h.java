package g7;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import c7.C2336e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import e7.InterfaceC3215e;
import e7.InterfaceC3222l;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: g7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3437h<T extends IInterface> extends AbstractC3433d<T> implements a.f {

    /* renamed from: g0, reason: collision with root package name */
    private final C3434e f42053g0;

    /* renamed from: h0, reason: collision with root package name */
    private final Set f42054h0;

    /* renamed from: i0, reason: collision with root package name */
    private final Account f42055i0;

    @Deprecated
    protected AbstractC3437h(Context context, Looper looper, int i10, C3434e c3434e, c.a aVar, c.b bVar) {
        this(context, looper, i10, c3434e, (InterfaceC3215e) aVar, (InterfaceC3222l) bVar);
    }

    private final Set k0(Set set) {
        Set<Scope> setJ0 = j0(set);
        Iterator<Scope> it = setJ0.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setJ0;
    }

    @Override // g7.AbstractC3433d
    protected final Set<Scope> C() {
        return this.f42054h0;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> b() {
        return n() ? this.f42054h0 : Collections.emptySet();
    }

    @Override // g7.AbstractC3433d
    public final Account u() {
        return this.f42055i0;
    }

    @Override // g7.AbstractC3433d
    protected Executor w() {
        return null;
    }

    protected AbstractC3437h(Context context, Looper looper, int i10, C3434e c3434e, InterfaceC3215e interfaceC3215e, InterfaceC3222l interfaceC3222l) {
        this(context, looper, AbstractC3438i.b(context), C2336e.m(), i10, c3434e, (InterfaceC3215e) C3445p.k(interfaceC3215e), (InterfaceC3222l) C3445p.k(interfaceC3222l));
    }

    protected AbstractC3437h(Context context, Looper looper, AbstractC3438i abstractC3438i, C2336e c2336e, int i10, C3434e c3434e, InterfaceC3215e interfaceC3215e, InterfaceC3222l interfaceC3222l) {
        super(context, looper, abstractC3438i, c2336e, i10, interfaceC3215e == null ? null : new F(interfaceC3215e), interfaceC3222l == null ? null : new G(interfaceC3222l), c3434e.h());
        this.f42053g0 = c3434e;
        this.f42055i0 = c3434e.a();
        this.f42054h0 = k0(c3434e.c());
    }

    protected Set<Scope> j0(Set<Scope> set) {
        return set;
    }
}
