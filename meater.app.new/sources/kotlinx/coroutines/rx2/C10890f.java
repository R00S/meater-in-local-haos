package kotlinx.coroutines.rx2;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C10962h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import okhttp3.HttpUrl;
import p323h.p324a.AbstractC9064b;
import p323h.p324a.InterfaceC9066c;
import p323h.p324a.InterfaceC9068e;

/* compiled from: RxCompletable.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\nø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aI\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\nH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001aG\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m32267d2 = {"rxCompletable", "Lio/reactivex/Completable;", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Completable;", "rxCompletableInternal", "scope", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Completable;", "kotlinx-coroutines-rx2"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.b3.f */
/* loaded from: classes3.dex */
public final class C10890f {
    /* renamed from: b */
    public static final AbstractC9064b m39129b(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super C10775u>, ? extends Object> function2) {
        if (coroutineContext.get(Job.f41899e) == null) {
            return m39131d(GlobalScope.f41877f, coroutineContext, function2);
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it. Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ AbstractC9064b m39130c(CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f41531f;
        }
        return m39129b(coroutineContext, function2);
    }

    /* renamed from: d */
    private static final AbstractC9064b m39131d(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final Function2<? super CoroutineScope, ? super Continuation<? super C10775u>, ? extends Object> function2) {
        return AbstractC9064b.m29157c(new InterfaceC9068e() { // from class: kotlinx.coroutines.b3.a
            @Override // p323h.p324a.InterfaceC9068e
            /* renamed from: a */
            public final void mo7421a(InterfaceC9066c interfaceC9066c) {
                C10890f.m39132e(coroutineScope, coroutineContext, function2, interfaceC9066c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m39132e(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2, InterfaceC9066c interfaceC9066c) {
        RxCompletableCoroutine rxCompletableCoroutine = new RxCompletableCoroutine(C10962h0.m39417e(coroutineScope, coroutineContext), interfaceC9066c);
        interfaceC9066c.mo29170b(new RxCancellable(rxCompletableCoroutine));
        rxCompletableCoroutine.m39080F0(CoroutineStart.DEFAULT, rxCompletableCoroutine, function2);
    }
}
