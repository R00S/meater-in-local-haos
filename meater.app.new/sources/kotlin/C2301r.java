package kotlin;

import Zb.w;
import ac.InterfaceC1971f;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: SendingCollector.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbc/r;", "T", "Lac/f;", "LZb/w;", "channel", "<init>", "(LZb/w;)V", "value", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "B", "LZb/w;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2301r<T> implements InterfaceC1971f<T> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final w<T> channel;

    /* JADX WARN: Multi-variable type inference failed */
    public C2301r(w<? super T> wVar) {
        this.channel = wVar;
    }

    @Override // ac.InterfaceC1971f
    public Object a(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objV = this.channel.v(t10, interfaceC4588d);
        return objV == C4696b.e() ? objV : C4153F.f46609a;
    }
}
