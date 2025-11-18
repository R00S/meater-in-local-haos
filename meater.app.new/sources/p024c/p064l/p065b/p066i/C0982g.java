package p024c.p064l.p065b.p066i;

import androidx.datastore.core.InterfaceC0340e;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: Preferences.kt */
/* renamed from: c.l.b.i.g */
/* loaded from: classes.dex */
public final class C0982g {

    /* compiled from: Preferences.kt */
    @DebugMetadata(m39049c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m39050f = "Preferences.kt", m39051l = {329}, m39052m = "invokeSuspend")
    /* renamed from: c.l.b.i.g$a */
    static final class a extends SuspendLambda implements Function2<AbstractC0979d, Continuation<? super AbstractC0979d>, Object> {

        /* renamed from: f */
        int f6494f;

        /* renamed from: g */
        /* synthetic */ Object f6495g;

        /* renamed from: h */
        final /* synthetic */ Function2<C0976a, Continuation<? super C10775u>, Object> f6496h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super C0976a, ? super Continuation<? super C10775u>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f6496h = function2;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f6496h, continuation);
            aVar.f6495g = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC0979d abstractC0979d, Continuation<? super AbstractC0979d> continuation) {
            return ((a) create(abstractC0979d, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.f6494f;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0976a c0976a = (C0976a) this.f6495g;
                C10568o.m37655b(obj);
                return c0976a;
            }
            C10568o.m37655b(obj);
            C0976a c0976aM6249c = ((AbstractC0979d) this.f6495g).m6249c();
            Function2<C0976a, Continuation<? super C10775u>, Object> function2 = this.f6496h;
            this.f6495g = c0976aM6249c;
            this.f6494f = 1;
            return function2.invoke(c0976aM6249c, this) == objM39045c ? objM39045c : c0976aM6249c;
        }
    }

    /* renamed from: a */
    public static final Object m6263a(InterfaceC0340e<AbstractC0979d> interfaceC0340e, Function2<? super C0976a, ? super Continuation<? super C10775u>, ? extends Object> function2, Continuation<? super AbstractC0979d> continuation) {
        return interfaceC0340e.mo2358a(new a(function2, null), continuation);
    }
}
