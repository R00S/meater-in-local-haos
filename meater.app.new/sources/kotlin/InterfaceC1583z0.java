package kotlin;

import Ca.e;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CompositionLocalMap.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\u0011J/\u0010\b\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"LO/z0;", "", "LO/u;", "LO/D1;", "LO/x;", "LO/v;", "key", "value", "v", "(LO/u;LO/D1;)LO/z0;", "LO/z0$a;", "t", "()LO/z0$a;", "T", "f", "(LO/u;)Ljava/lang/Object;", "currentValue", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1583z0 extends Map, Ca.a, InterfaceC1578x, InterfaceC1574v {

    /* compiled from: CompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u0001J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"LO/z0$a;", "", "LO/u;", "LO/D1;", "LO/z0;", "e", "()LO/z0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.z0$a */
    public interface a extends Map, e {
        InterfaceC1583z0 e();
    }

    @Override // kotlin.InterfaceC1574v
    default <T> T f(AbstractC1572u<T> abstractC1572u) {
        return (T) C1580y.b(this, abstractC1572u);
    }

    a t();

    InterfaceC1583z0 v(AbstractC1572u<Object> key, D1<Object> value);
}
