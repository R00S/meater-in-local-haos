package androidx.compose.ui.platform;

import Y.g;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00120\u0011H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/platform/h0;", "LY/g;", "saveableStateRegistry", "Lkotlin/Function0;", "Loa/F;", "onDispose", "<init>", "(LY/g;LBa/a;)V", "", "value", "", "a", "(Ljava/lang/Object;)Z", "", "key", "c", "(Ljava/lang/String;)Ljava/lang/Object;", "", "", "b", "()Ljava/util/Map;", "valueProvider", "LY/g$a;", "d", "(Ljava/lang/String;LBa/a;)LY/g$a;", "e", "()V", "LBa/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2019h0 implements Y.g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> onDispose;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Y.g f23141b;

    public C2019h0(Y.g gVar, Ba.a<C4153F> aVar) {
        this.onDispose = aVar;
        this.f23141b = gVar;
    }

    @Override // Y.g
    public boolean a(Object value) {
        return this.f23141b.a(value);
    }

    @Override // Y.g
    public Map<String, List<Object>> b() {
        return this.f23141b.b();
    }

    @Override // Y.g
    public Object c(String key) {
        return this.f23141b.c(key);
    }

    @Override // Y.g
    public g.a d(String key, Ba.a<? extends Object> valueProvider) {
        return this.f23141b.d(key, valueProvider);
    }

    public final void e() {
        this.onDispose.invoke();
    }
}
