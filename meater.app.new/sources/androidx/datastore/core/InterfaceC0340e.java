package androidx.datastore.core;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* compiled from: DataStore.kt */
/* renamed from: androidx.datastore.core.e */
/* loaded from: classes.dex */
public interface InterfaceC0340e<T> {
    /* renamed from: a */
    Object mo2358a(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation);

    /* renamed from: b */
    Flow<T> mo2359b();
}
